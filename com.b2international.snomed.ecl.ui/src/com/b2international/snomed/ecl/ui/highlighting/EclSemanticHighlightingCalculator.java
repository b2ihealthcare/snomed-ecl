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

import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import com.b2international.snomed.ecl.ui.EclTokens;

/**
 * Class for ECL Semantic highlighting.
 * This class should recognize all the semantical part of the grammar.
 */
public class EclSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource == null)
			return;

		Iterable<INode> allNodes = resource.getParseResult().getRootNode().getAsTreeIterable();

		for (INode abstractNode : allNodes) {
			if (abstractNode.getGrammarElement() instanceof RuleCall) {
				RuleCall rule = (RuleCall) abstractNode.getGrammarElement();
				final String ruleName = rule.getRule().getName();
				if (ruleName.equals(EclTokens.SNOMED_IDENTIFIER)) {
					acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(), EclTokens.SNOMED_IDENTIFIER);
				} else if (ruleName.equals(EclTokens.TERM_STRING)) {
					// pipes
					acceptor.addPosition(abstractNode.getOffset(), 1, EclTokens.PIPE);
					acceptor.addPosition(abstractNode.getOffset() + abstractNode.getLength() - 1, 1, EclTokens.PIPE);
					// middle part (example: "Clinical Finding")
					acceptor.addPosition(abstractNode.getOffset() + 1, abstractNode.getLength() - 2, EclTokens.TERM_STRING);
				}
			}
		}
	}

}
