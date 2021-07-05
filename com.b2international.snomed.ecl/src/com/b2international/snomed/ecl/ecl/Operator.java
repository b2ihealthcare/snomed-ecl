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
 * Enumerates comparison operators, both for numbers and non-numeric data types.
 * 
 * @since ECL 1.5
 */
public enum Operator {
	EQUALS("="),
	NOT_EQUALS("!="),
	GT(">"),
	GTE(">="),
	LT("<"),
	LTE("<=");

	private String op;

	private Operator(final String op) {
		this.op = op;
	}
	
	@Override
	public String toString() {
		return op;
	}
	
	public static Operator fromString(final String op) {
		return Arrays.stream(Operator.values())
			.filter(candidate -> candidate.op.equals(op))
			.findFirst()
			.orElse(null);
	}
}
