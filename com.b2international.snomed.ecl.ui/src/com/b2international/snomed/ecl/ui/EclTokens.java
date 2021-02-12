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
package com.b2international.snomed.ecl.ui;

import java.util.HashSet;
import java.util.Set;

/**
 * @since 1.3.0
 */
public class EclTokens {

	public static final String PREFIX = "RULE_";

	// green
	public static final String PIPE = PREFIX + "PIPE";
	public static final String SL_COMMENT = PREFIX + "SL_COMMENT";
	public static final String ML_COMMENT = PREFIX + "ML_COMMENT";

	// blue
	public static final String TERM = "Term";
	public static final String CONCEPTID = "EclConceptReference";

	// red
	public static final String COLON = PREFIX + "COLON";
	public static final String PLUS = PREFIX + "PLUS";
	public static final String CLOSING_CURLY_BRACKET = PREFIX + "CURLY_CLOSE";
	public static final String OPENING_CURLY_BRACKET = PREFIX + "CURLY_OPEN";
	public static final String EQUALS = PREFIX + "EQUAL";
	public static final String AND = PREFIX + "AND";
	public static final String OR = PREFIX + "OR";
	public static final String CLOSING_ROUND_BRACKET = PREFIX + ")";
	public static final String OPENING_ROUND_BRACKET = PREFIX + "(";
	public static final String COMMA = PREFIX + "COMMA";
	public static final String CARET = PREFIX + "CARET";
	public static final String NOT = PREFIX + "NOT";
	public static final String EQUALS_OPERATOR = PREFIX + "EQUAL";
	public static final String GREATER_THAN_OPERATOR = PREFIX + "GT";
	public static final String LESS_EQUALS_OPERATOR = PREFIX + "LTE";
	public static final String GREATER_EQUALS_OPERATOR = PREFIX + "GTE";
	public static final String NOT_EQUALS_OPERATOR = PREFIX + "NOT_EQUAL";
	public static final String LT = PREFIX + "LT";
	public static final String DBL_LT = PREFIX + "DBL_LT";

	public static final Set<String> RED_TOKENS = buildRedTokens();

	private static Set<String> buildRedTokens() {
		Set<String> redtokens = new HashSet<String>();
		redtokens.add(COLON);
		redtokens.add(PLUS);
		redtokens.add(CLOSING_CURLY_BRACKET);
		redtokens.add(OPENING_CURLY_BRACKET);
		redtokens.add(EQUALS);
		redtokens.add(AND);
		redtokens.add(OR);
		redtokens.add(CLOSING_ROUND_BRACKET);
		redtokens.add(OPENING_ROUND_BRACKET);
		redtokens.add(COMMA);
		redtokens.add(CARET);
		redtokens.add(NOT);
		redtokens.add(EQUALS_OPERATOR);
		redtokens.add(GREATER_THAN_OPERATOR);
		redtokens.add(LESS_EQUALS_OPERATOR);
		redtokens.add(GREATER_EQUALS_OPERATOR);
		redtokens.add(NOT_EQUALS_OPERATOR);
		redtokens.add(LT);
		redtokens.add(DBL_LT);
		return redtokens;
	}

}