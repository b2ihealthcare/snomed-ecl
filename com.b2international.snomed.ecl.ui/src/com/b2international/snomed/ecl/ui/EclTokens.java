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
 * Tokens are made from the rules in the Ecl.xtext
 * @since 1.3.0
 */
public class EclTokens {

	public static final String PREFIX = "RULE_";
	
	public static final String SNOMED_IDENTIFIER = "SnomedIdentifier";
	public static final String PIPE = "PIPE";
	public static final String TERM_STRING = "TERM_STRING";
	
	// I made the ones which we don't use outside of the class 
	//private so it is easier to tell which ones are not part of any color group
	public static final String RULE_TERM_STRING = PREFIX + "TERM_STRING";
	private static final String REVERSED = PREFIX + "REVERSED";
	private static final String TO = PREFIX + "TO";
	private static final String COMMA = PREFIX + "COMMA";
	private static final String AND = PREFIX + "CONJUNCTION";
	private static final String OR = PREFIX + "DISJUNCTION";
	private static final String EXCLUSION = PREFIX + "EXCLUSION";
	
	private static final String ZERO = PREFIX + "ZERO";
	private static final String DIGIT_NONZERO = PREFIX + "DIGIT_NONZERO";
	
	private static final String COLON = PREFIX + "COLON";
	private static final String OPENING_CURLY_BRACKET = PREFIX + "CURLY_OPEN";
	private static final String CLOSING_CURLY_BRACKET = PREFIX + "CURLY_CLOSE";
	
	private static final String OPENING_ROUND_BRACKET = PREFIX + "ROUND_OPEN";
	private static final String CLOSING_ROUND_BRACKET = PREFIX + "ROUND_CLOSE";
	
	private static final String OPENING_SQUARE_BRACKET = PREFIX + "SQUARE_OPEN";
	private static final String CLOSING_SQUARE_BRACKET = PREFIX + "SQUARE_CLOSE";

	
	private static final String PLUS = PREFIX + "PLUS";
	private static final String DASH = PREFIX + "DASH";
	private static final String CARET = PREFIX + "CARET";
	private static final String DOT = PREFIX + "DOT";
	
	private static final String WILDCARD = PREFIX + "WILDCARD";
	private static final String EQUALS = PREFIX + "EQUAL";
	private static final String NOT_EQUAL = PREFIX + "NOT_EQUAL";
	
	
	private static final String LESSER_THAN_OPERATOR = PREFIX + "LT";
	private static final String GREATER_THAN_OPERATOR = PREFIX + "GT";
	
	private static final String DESCENDANT_OR_SELF_OF = PREFIX + "DBL_LT";
	private static final String ANCESTOR_OR_SELF_OF = PREFIX + "DBL_GT";
	
	private static final String CHILD_OF = PREFIX + "LT_EM";
	private static final String PARENT_OF = PREFIX + "GT_EM";
	
	private static final String GREATER_EQUALS_OPERATOR = PREFIX + "GTE";
	private static final String LESS_EQUALS_OPERATOR = PREFIX + "LTE";
	
	private static final String HASH = PREFIX + "HASH";
	
	private static final String WHITESPACE = PREFIX + "WS";
	

	private static final String MULTI_LINE_COMMENT = PREFIX + "ML_COMMENT";
	private static final String SINGLE_LINE_COMMENT = PREFIX + "SL_COMMENT";
	private static final String STRING = PREFIX + "STRING";
	
	//New operators from v1.4
	private static final String CHILD_OR_SELF_OF = PREFIX + "DBL_LT_EM";
	private static final String PARENT_OR_SELF_OF = PREFIX + "DBL_GT_EM";

	public static final Set<String> RED_TOKENS = buildRedTokens();
	public static final Set<String> PURPLE_TOKENS = buildPurpleTokens();
	public static final Set<String> GREEN_TOKENS = buildGreenTokens();

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
		redtokens.add(EQUALS);
		redtokens.add(GREATER_THAN_OPERATOR);
		redtokens.add(LESS_EQUALS_OPERATOR);
		redtokens.add(GREATER_EQUALS_OPERATOR);
		redtokens.add(NOT_EQUAL);
		redtokens.add(LESSER_THAN_OPERATOR);
		redtokens.add(TO);
		redtokens.add(HASH);
		redtokens.add(EXCLUSION);
		redtokens.add(REVERSED);
		redtokens.add(DESCENDANT_OR_SELF_OF);
		redtokens.add(ANCESTOR_OR_SELF_OF);
		redtokens.add(CHILD_OF);
		redtokens.add(PARENT_OF);
		redtokens.add(CHILD_OR_SELF_OF);
		redtokens.add(PARENT_OR_SELF_OF);
		redtokens.add(OPENING_SQUARE_BRACKET);
		redtokens.add(CLOSING_SQUARE_BRACKET);
		redtokens.add(ZERO);
		redtokens.add(DIGIT_NONZERO);
		redtokens.add(WILDCARD);
		redtokens.add(DASH);
		redtokens.add(DOT);
		return redtokens;
	}
	
	private static Set<String> buildPurpleTokens() {
		Set<String> purpletokens = new HashSet<String>();
		purpletokens.add(STRING);
		return purpletokens;
	}
	
	private static Set<String> buildGreenTokens() {
		Set<String> greentokens = new HashSet<String>();
		greentokens.add(SINGLE_LINE_COMMENT);
		greentokens.add(MULTI_LINE_COMMENT);
		return greentokens;
	}
}