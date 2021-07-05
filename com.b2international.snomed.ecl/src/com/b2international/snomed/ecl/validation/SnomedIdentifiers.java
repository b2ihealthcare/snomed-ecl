/*
 * Copyright 2011-2021 B2i Healthcare Pte Ltd, http://b2i.sg
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.b2international.snomed.ecl.validation;

import static com.google.common.base.Preconditions.checkArgument;

import com.google.common.base.Strings;

/**
 * Contains utility methods related to SCTID part checks.
 * 
 * @since ECL 1.5 (originally in Snow Owl as com.b2international.snowowl.snomed.cis.SnomedIdentifiers)
 */
class SnomedIdentifiers {
	
	public static final long MIN_INT_ITEMID = 100L; // inclusive
	public static final long MAX_INT_ITEMID = 9999_9999_9999_999L + 1L; // 15 digits for itemId, exclusive
	
	public static final long MIN_NAMESPACE_ITEMID = 1L; // inclusive
	public static final long MAX_NAMESPACE_ITEMID = 9999_9999L + 1L; // 8 digits for itemId, exclusive

	/**
	 * @param componentId - the ID to check
	 * @return <code>true</code> if the given componentId is a valid SNOMED CT core component identifier, <code>false</code> otherwise.
	 * @see #validate(String)
	 */
	public static boolean isValid(String componentId) {
		try {
			validate(componentId);
			return true;
		} catch (final IllegalArgumentException e) {
			return false;
		}
	}
	
	/**
	 * Validates the given componentId by using the rules defined in the latest SNOMED CT Identifier specification, which are the following constraints:
	 * <ul>
	 * <li>Can't start with leading zeros</li>
	 * <li>Lengths should be between 6 and 18 characters</li>
	 * <li>Should parse to a long value</li>
	 * <li>Should have partition ID 0 or 1</li>
	 * <li>Should have a component ID of 0, 1 or 2</li>
	 * <li>Should pass the Verhoeff check-digit test</li>
	 * </ul>
	 * 
	 * @param componentId
	 * @see VerhoeffCheck
	 * @throws IllegalArgumentException
	 *             - if the given componentId is invalid according to the SNOMED
	 *             CT Identifier specification
	 */
	public static void validate(final String componentId) throws IllegalArgumentException {
		checkArgument(!Strings.isNullOrEmpty(componentId), "SCTID may not be null or empty");
		checkArgument(!componentId.startsWith("0"), "SCTID can't start with leading zero. Got: %s", componentId);
		checkArgument(componentId.length() >= 6 && componentId.length() <= 18, "SCTID length must be between 6-18 characters. Got: %s", componentId);
		
		try {
			Long.parseLong(componentId);
		} catch (final NumberFormatException e) {
			throw new IllegalArgumentException("SCTID should be parseable to a long value");
		}
		
		// may throw IllegalArgumentException if the componentId has incorrect partition ID
		isShortForm(componentId);
		
		// may throw IllegalArgumentException if the componentId has incorrect component identifier
		getComponentIdentifier(componentId);
		
		final CharSequence idHead = componentId.subSequence(0, componentId.length() - 1);
		final char originalChecksum = componentId.charAt(componentId.length() - 1);
		final char checksum = VerhoeffCheck.calculateChecksum(idHead, false);

		checkArgument(VerhoeffCheck.validateLastChecksumDigit(componentId), "%s has incorrect Verhoeff check-digit; expected %s, was %s", componentId, checksum, originalChecksum);
	}

	private static boolean isShortForm(final String componentId) {
		final char firstPartitionIdDigit = componentId.charAt(componentId.length() - 3);
		
		if (firstPartitionIdDigit == '0') {
			return true;
		} else if (firstPartitionIdDigit == '1') {
			return false;
		} else {
			throw new IllegalArgumentException(String.format("First digit of partition identifier must be '0' or '1', got '%s' for input '%s'.", firstPartitionIdDigit, componentId));
		}
	}
	
	private static int getComponentIdentifier(final String componentId) {
		final char secondPartitionIdDigit = componentId.charAt(componentId.length() - 2);
		final int ci = Character.digit(secondPartitionIdDigit, 10);
		
		if (ci >= 0 && ci <= 2) {
			return ci;
		} else {
			throw new IllegalArgumentException(String.format("Second digit of partition identifier must be between '0' and '2', got '%s' for input '%s'.", secondPartitionIdDigit, componentId));
		}
	}

	public static long getItemId(final String componentId) {
		final boolean shortForm = isShortForm(componentId);
		final String itemId;
		
		if (shortForm) {
			itemId = componentId.substring(0, componentId.length() - 3);
		} else {
			itemId = componentId.substring(0, componentId.length() - 10);
		}
		
		try {
			return Long.parseLong(itemId);
		} catch (final NumberFormatException e) {
			throw new IllegalArgumentException(String.format("Item identifier must be parseable to a long, got '%s' for input '%s'.", itemId, componentId));
		}
	}

	public static String getPartitionId(final String componentId) {
		return componentId.substring(componentId.length() - 3, componentId.length() - 1);
	}

	public static int getCheckDigit(final String componentId) {
		final char checkDigit = componentId.charAt(componentId.length() - 1);
		final int cd = Character.digit(checkDigit, 10);
		
		if (cd >= 0 && cd <= 9) {
			return cd;
		} else {
			throw new IllegalArgumentException(String.format("Check digit must be between '0' and '9', got '%s' for input '%s'.", checkDigit, componentId));
		}
	}
}
