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
package com.b2international.snomed.ecl.ide.highlighting;

import java.util.List;
import java.util.Set;

import org.eclipse.xtext.ide.server.semanticHighlight.ISemanticHighlightingStyleToTokenMapper;

/**
 * Translates highlighting style IDs to TextMate scopes.
 * <p>
 * As ECL is using scope IDs internally, this is a direct conversion.
 * 
 * @since ECL 1.5
 */
public class EclHighlightingStyleToTokenMapper implements ISemanticHighlightingStyleToTokenMapper {

	private static final Set<String> ALL_STYLE_IDS = Set.of(
		EclHighlightingRuleIDs.COMMENT_RULE_ID,
		EclHighlightingRuleIDs.CONSTANT_LANGUAGE_RULE_ID,
		EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_ID,
		EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_OTHER_ID,
		EclHighlightingRuleIDs.KEYWORD_OPERATOR_RULE_ID,
		EclHighlightingRuleIDs.KEYWORD_OTHER_RULE_ID,
		EclHighlightingRuleIDs.STRING_QUOTED_OTHER_RULE_ID,
		EclHighlightingRuleIDs.STRING_QUOTED_RULE_ID
	);

	@Override
	public List<String> toScopes(String styleId) {
		return List.of(styleId);
	}

	@Override
	public Set<String> getAllStyleIds() {
		return ALL_STYLE_IDS;
	}
}
