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
package com.b2international.snomed.ecl.ui.highlighting;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;

import com.b2international.snomed.ecl.ide.contentassist.antlr.internal.InternalEclParser;
import com.b2international.snomed.ecl.ui.EclHighlightingRuleIDs;


/**
 * The "high-level" token mapper. Available tokens are stored in the EclTokens class.
 *
 */
public class EclAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	private static final String[] tokenNames = InternalEclParser.tokenNames;
	
	private static final Set<String> RED_TOKENS = buildRedTokens();
	private static final Set<String> PURPLE_TOKENS = buildPurpleTokens();
	private static final Set<String> GREEN_TOKENS = buildGreenTokens();
	private static final Set<String> BLUE_TOKENS = buildBlueTokens();
	
	
	private static Set<String> buildRedTokens() {
		final Set<String> redtokens = new HashSet<String>();
		redtokens.add(tokenNames[InternalEclParser.RULE_COLON]);
		redtokens.add(tokenNames[InternalEclParser.RULE_PLUS]);
		redtokens.add(tokenNames[InternalEclParser.RULE_CURLY_OPEN]);
		redtokens.add(tokenNames[InternalEclParser.RULE_CURLY_CLOSE]);
		redtokens.add(tokenNames[InternalEclParser.RULE_EQUAL]);
		redtokens.add(tokenNames[InternalEclParser.RULE_CONJUNCTION]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DISJUNCTION]);
		redtokens.add(tokenNames[InternalEclParser.RULE_ROUND_OPEN]);
		redtokens.add(tokenNames[InternalEclParser.RULE_ROUND_CLOSE]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_COMMA]);
		redtokens.add(tokenNames[InternalEclParser.RULE_CARET]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_GT]);
		redtokens.add(tokenNames[InternalEclParser.RULE_GTE]);
		redtokens.add(tokenNames[InternalEclParser.RULE_LT]);
		redtokens.add(tokenNames[InternalEclParser.RULE_LTE]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_NOT_EQUAL]);
		redtokens.add(tokenNames[InternalEclParser.RULE_TO]);
		redtokens.add(tokenNames[InternalEclParser.RULE_HASH]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_EXCLUSION]);
		redtokens.add(tokenNames[InternalEclParser.RULE_REVERSED]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DBL_LT]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DBL_GT]);
		redtokens.add(tokenNames[InternalEclParser.RULE_LT_EM]);
		redtokens.add(tokenNames[InternalEclParser.RULE_GT_EM]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_SQUARE_OPEN]);
		redtokens.add(tokenNames[InternalEclParser.RULE_SQUARE_CLOSE]);
		
		redtokens.add(tokenNames[InternalEclParser.RULE_ZERO]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DIGIT_NONZERO]);
		redtokens.add(tokenNames[InternalEclParser.RULE_WILDCARD]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DASH]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DOT]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DBL_GT_EM]);
		redtokens.add(tokenNames[InternalEclParser.RULE_DBL_LT_EM]);
		return redtokens;
	}
	
	private static Set<String> buildPurpleTokens() {
		final Set<String> purpletokens = new HashSet<String>();
		purpletokens.add(tokenNames[InternalEclParser.RULE_STRING]);
		return purpletokens;
	}
	
	private static Set<String> buildGreenTokens() {
		final Set<String> greentokens = new HashSet<String>();
		greentokens.add(tokenNames[InternalEclParser.RULE_SL_COMMENT]);
		greentokens.add(tokenNames[InternalEclParser.RULE_ML_COMMENT]);
		return greentokens;
	}
	
	private static Set<String> buildBlueTokens() {
		final Set<String> bluetokens = new HashSet<String>();
		bluetokens.add(tokenNames[InternalEclParser.True]);
		bluetokens.add(tokenNames[InternalEclParser.False]);
		return bluetokens;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper#calculateId(java.lang.String, int)
	 */
	@Override
	protected String calculateId(String tokenName, int tokenType) {

		if (RED_TOKENS.contains(tokenName)) {
			return EclHighlightingRuleIDs.RED_TOKENS_RULE_ID;
		}
		
		if (PURPLE_TOKENS.contains(tokenName)) {
			return EclHighlightingRuleIDs.PURPLE_TOKENS_RULE_ID;
		}
		
		if (GREEN_TOKENS.contains(tokenName)) {
			return EclHighlightingRuleIDs.GREEN_TOKENS_RULE_ID;
		}

		if(BLUE_TOKENS.contains(tokenName)) {
			return EclHighlightingRuleIDs.BLUE_TOKENS_RULE_ID;
		}
		
		return tokenName;
	}
}