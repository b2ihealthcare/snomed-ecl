/*
 * Copyright 2021-2022 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ecl.ecl;

import java.util.Arrays;

import com.google.common.base.Strings;

/**
 * Enumerates the "subject" of the filter expression it operates on.
 * 
 * @since 1.5
 */
public enum Domain {
	CONCEPT("C"),
	DESCRIPTION("D"), 
	MEMBER("M");

	private final String symbol;

	private Domain(final String symbol) {
		this.symbol = symbol;
	}

	public static Domain fromString(final String value) {
		if (Strings.isNullOrEmpty(value)) {
			return null;
		}

		return Arrays.stream(values())
			.filter(d -> d.symbol.equalsIgnoreCase(value))
			.findFirst()
			.orElse(null);
	}

	@Override
	public String toString() {
		return symbol;
	}
}
