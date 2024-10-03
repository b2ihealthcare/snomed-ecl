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
package com.b2international.snomed.ecl.ide.highlighting;

/**
 * Highlighting rule IDs correspond to TextMate scopes: https://macromates.com/manual/en/language_grammars
 * 
 * @since 1.3.0
 */
public class EclHighlightingRuleIDs {
	
	public static final String KEYWORD_OPERATOR_RULE_ID = "keyword.operator";
	public static final String KEYWORD_OTHER_RULE_ID = "keyword.other";
	public static final String STRING_QUOTED_RULE_ID = "string.quoted";
	public static final String STRING_QUOTED_OTHER_RULE_ID = "string.quoted.other";
	public static final String COMMENT_RULE_ID = "comment";
	public static final String CONSTANT_LANGUAGE_RULE_ID = "constant.language";
	public static final String CONSTANT_NUMERIC_INTEGER_ID = "constant.numeric.integer";
	public static final String CONSTANT_NUMERIC_INTEGER_OTHER_ID = "constant.numeric.integer.other";
}
