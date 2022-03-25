/*
 * Copyright 2021-2022 B2i Healthcare Pte Ltd, http://b2i.sg
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.inject.Inject;

/**
 * Class for ECL semantic highlighting. This class can augment highlighting
 * information (mostly based on lexical analysis) with knowledge that can be
 * more easily gathered from the resulting object model/parse tree.
 */
public class EclSemanticHighlightingCalculator implements ISemanticHighlightingCalculator {

	@Inject
	private EclGrammarAccess ga;
	
	@Override
	public void provideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator cancelIndicator) {
		if (resource == null) {
			return;
		}

		final Iterable<INode> allNodes = resource.getParseResult()
			.getRootNode()
			.getAsTreeIterable();

		for (INode abstractNode : allNodes) {
			final EObject grammarElement = abstractNode.getGrammarElement();
			if (grammarElement instanceof RuleCall) {
				final RuleCall ruleCall = (RuleCall) grammarElement;
				final AbstractRule rule = ruleCall.getRule();
				
				if (rule == ga.getIdentifierRule()) {
					acceptor.addPosition(abstractNode.getOffset(), abstractNode.getLength(), EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_OTHER_ID);
				} else if (rule == ga.getPIPE_DELIMITED_STRINGRule()) {					
					// pipes
					acceptor.addPosition(abstractNode.getOffset(), 1, EclHighlightingRuleIDs.KEYWORD_OTHER_RULE_ID);
					acceptor.addPosition(abstractNode.getOffset() + abstractNode.getLength() - 1, 1, EclHighlightingRuleIDs.KEYWORD_OTHER_RULE_ID);
					// middle part (example: "Clinical Finding")
					acceptor.addPosition(abstractNode.getOffset() + 1, abstractNode.getLength() - 2, EclHighlightingRuleIDs.STRING_QUOTED_OTHER_RULE_ID);
				}
			}
		}
	}
}
