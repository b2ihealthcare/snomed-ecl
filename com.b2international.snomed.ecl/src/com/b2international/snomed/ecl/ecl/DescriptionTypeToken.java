/*
 * Copyright 2021 B2i Healthcare Pte Ltd, http://b2i.sg
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

/**
 * Enumerates supported description type tokens.
 * 
 * @since ECL 1.5
 */
public enum DescriptionTypeToken {
	FSN("fsn", "900000000000003001"),
	SYN("syn", "900000000000013009"),
	DEF("def", "900000000000550004");

	private final String token;
	private final String conceptId;

	private DescriptionTypeToken(final String token, final String conceptId) {
		this.token = token;
		this.conceptId = conceptId;
	}

	public String getConceptId() {
		return conceptId;
	}

	@Override
	public String toString() {
		return token;
	}

	public static DescriptionTypeToken fromString(final String token) {
		return Arrays.stream(DescriptionTypeToken.values())
			.filter(candidate -> candidate.token.equalsIgnoreCase(token))
			.findFirst()
			.orElse(null);
	}
}
