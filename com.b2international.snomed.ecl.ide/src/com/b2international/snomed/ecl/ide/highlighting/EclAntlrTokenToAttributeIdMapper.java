/*
 * Copyright 2021-2022 B2i Healthcare, https://b2ihealthcare.com
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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.b2international.snomed.ecl.parser.antlr.internal.InternalEclLexer;

/**
 * The "high-level" token mapper. Token identifiers can be found in InternalEclParser constants.
 * 
 * Highlighting rule IDs correspond to TextMate scopes: https://macromates.com/manual/en/language_grammars
 */
public class EclAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	private static final Set<Integer> KEYWORD_OPERATOR_TOKENS = buildKeywordOperatorTokens();
	private static final Set<Integer> STRING_QUOTED_TOKENS = buildStringQuotedTokens();
	private static final Set<Integer> COMMENT_TOKENS = buildCommentTokens();
	private static final Set<Integer> CONSTANT_LANGUAGE_TOKENS = buildConstantLanguageTokens();
	private static final Set<Integer> CONSTANT_NUMERIC_INTEGER_TOKENS = buildConstantNumericIntegerTokens();
	
	// "keyword.operator" tokens
	private static Set<Integer> buildKeywordOperatorTokens() {
		final Set<Integer> tokens = new HashSet<Integer>();
		tokens.add(InternalEclLexer.RULE_COLON);
		tokens.add(InternalEclLexer.RULE_PLUS);
		tokens.add(InternalEclLexer.RULE_CURLY_OPEN);
		tokens.add(InternalEclLexer.RULE_CURLY_CLOSE);
		tokens.add(InternalEclLexer.RULE_EQUAL);
		tokens.add(InternalEclLexer.RULE_CONJUNCTION_KEYWORD);
		tokens.add(InternalEclLexer.RULE_DISJUNCTION_KEYWORD);
		tokens.add(InternalEclLexer.RULE_ROUND_OPEN);
		tokens.add(InternalEclLexer.RULE_ROUND_CLOSE);
		
		tokens.add(InternalEclLexer.RULE_COMMA);
		tokens.add(InternalEclLexer.RULE_CARET);
		
		tokens.add(InternalEclLexer.RULE_GT);
		tokens.add(InternalEclLexer.RULE_GTE);
		tokens.add(InternalEclLexer.RULE_LT);
		tokens.add(InternalEclLexer.RULE_LTE);
		
		tokens.add(InternalEclLexer.RULE_NOT_EQUAL);
		tokens.add(InternalEclLexer.RULE_TO);
		tokens.add(InternalEclLexer.RULE_HASH);
		
		tokens.add(InternalEclLexer.RULE_EXCLUSION_KEYWORD);
		tokens.add(InternalEclLexer.RULE_REVERSED);
		tokens.add(InternalEclLexer.RULE_DBL_LT);
		tokens.add(InternalEclLexer.RULE_DBL_GT);
		tokens.add(InternalEclLexer.RULE_LT_EM);
		tokens.add(InternalEclLexer.RULE_GT_EM);
		
		tokens.add(InternalEclLexer.RULE_SQUARE_OPEN);
		tokens.add(InternalEclLexer.RULE_SQUARE_CLOSE);
		
		tokens.add(InternalEclLexer.RULE_WILDCARD);
		tokens.add(InternalEclLexer.RULE_DASH);
		tokens.add(InternalEclLexer.RULE_DOT);
		tokens.add(InternalEclLexer.RULE_DBL_GT_EM);
		tokens.add(InternalEclLexer.RULE_DBL_LT_EM);
		return tokens;
	}
	
	// "string.quoted"
	private static Set<Integer> buildStringQuotedTokens() {
		final Set<Integer> tokens = new HashSet<Integer>();
		tokens.add(InternalEclLexer.RULE_STRING);
		return tokens;
	}
	
	// "comment"
	private static Set<Integer> buildCommentTokens() {
		final Set<Integer> tokens = new HashSet<Integer>();
		tokens.add(InternalEclLexer.RULE_SL_COMMENT);
		tokens.add(InternalEclLexer.RULE_ML_COMMENT);
		return tokens;
	}
	
	// "constant.language"
	private static Set<Integer> buildConstantLanguageTokens() {
		final Set<Integer> tokens = new HashSet<Integer>();
		tokens.add(InternalEclLexer.RULE_TRUE_KEYWORD);
		tokens.add(InternalEclLexer.RULE_FALSE_KEYWORD);
		return tokens;
	}
	
	// "constant.numeric.integer"
	private static Set<Integer> buildConstantNumericIntegerTokens() {
		return Set.of(InternalEclLexer.RULE_DIGIT);
	}
	
	@Override
	protected String calculateId(String tokenName, int tokenType) {

		if (KEYWORD_OPERATOR_TOKENS.contains(tokenType)) {
			return EclHighlightingRuleIDs.KEYWORD_OPERATOR_RULE_ID;
		}
		
		if (STRING_QUOTED_TOKENS.contains(tokenType)) {
			return EclHighlightingRuleIDs.STRING_QUOTED_RULE_ID;
		}
		
		if (COMMENT_TOKENS.contains(tokenType)) {
			return EclHighlightingRuleIDs.COMMENT_RULE_ID;
		}

		if (CONSTANT_LANGUAGE_TOKENS.contains(tokenType)) {
			return EclHighlightingRuleIDs.CONSTANT_LANGUAGE_RULE_ID;
		}
		
		if (CONSTANT_NUMERIC_INTEGER_TOKENS.contains(tokenType)) {
			return EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_ID;
		}
		
		return tokenName;
	}
}
