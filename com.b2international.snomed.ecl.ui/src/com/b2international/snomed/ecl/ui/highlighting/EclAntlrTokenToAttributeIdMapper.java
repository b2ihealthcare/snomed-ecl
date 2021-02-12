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

import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

import com.b2international.snomed.ecl.ui.EclTokens;


/**
 * The "high-level" token mapper. Available tokens are stored in the EclTokens class.
 *
 */
public class EclAntlrTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {

	public final static String RED_TOKENS = "RED_TOKENS";

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.syntaxcoloring.antlr.AbstractAntlrTokenToAttributeIdMapper#calculateId(java.lang.String, int)
	 */
	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if(EclTokens.PIPE.equals(tokenName)) {
			return EclTokens.PIPE;
		}

		if (EclTokens.TERM.equals(tokenName)) {
			return EclTokens.TERM;
		}

		if (EclTokens.CONCEPTID.equals(tokenName)) {
			return EclTokens.CONCEPTID;
		}

		if (EclTokens.RED_TOKENS.contains(tokenName)) {
			return RED_TOKENS;
		}

		if (EclTokens.SL_COMMENT.equals(tokenName)) {
			return EclTokens.SL_COMMENT;
		}

		if (EclTokens.ML_COMMENT.equals(tokenName)) {
			return EclTokens.ML_COMMENT;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
	}

}
