/*
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
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
 * Enumerates supported description search types. 
 * 
 * @since ECL 1.5 (including extensions)
 */
public enum LexicalSearchType {
	MATCH("match"), 
	WILD("wild"),
	REGEX("regex"),
	EXACT("exact");

	private String searchType;

	private LexicalSearchType(final String searchType) {
		this.searchType = searchType;
	}
	
	@Override
	public String toString() {
		return searchType;
	}
	
	public static LexicalSearchType fromString(final String searchType) {
		return Arrays.stream(LexicalSearchType.values())
			.filter(candidate -> candidate.searchType.equalsIgnoreCase(searchType))
			.findFirst()
			.orElse(null);
	}
}
