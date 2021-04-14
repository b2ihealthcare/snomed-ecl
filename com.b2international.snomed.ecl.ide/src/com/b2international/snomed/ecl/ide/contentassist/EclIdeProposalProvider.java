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
package com.b2international.snomed.ecl.ide.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;

import com.b2international.snomed.ecl.ecl.EclConceptReference;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class EclIdeProposalProvider extends AbstractEclIdeProposalProvider {
	
	@Override
	public void complete_TERM_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		if (model instanceof EclConceptReference) {
			ContentAssistEntry entry = getProposalCreator().createProposal("|term|", context, ContentAssistEntry.KIND_TEXT, null);
			acceptor.accept(entry, getProposalPriorities().getDefaultPriority(entry)); 
		}
	}
	
	@Override
	public void complete_CONJUNCTION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		 createKeywordProposal("AND", "Conjunction", context, acceptor);
	}
	
	@Override
	public void complete_DISJUNCTION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal("OR", "Disjunction", context, acceptor);
	}
	
	@Override
	public void complete_EXCLUSION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal("MINUS", "Exclusion", context, acceptor);
	}
	
	@Override
	public void complete_COLON(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Refined expression constraint", acceptor);
	}

	@Override
	public void complete_CURLY_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Opening attribute group",acceptor);
	}

	@Override
	public void complete_CURLY_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Closing attribute group", acceptor);
	}

	@Override
	public void complete_SQUARE_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Cardinality", acceptor);
	}

	@Override
	public void complete_SQUARE_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Cardinality", acceptor);
	}

	@Override
	public void complete_PLUS(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Numeric value", acceptor);
	}

	@Override
	public void complete_DASH(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Numeric value", acceptor);
	}

	@Override
	public void complete_CARET(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Member of" , acceptor);
	}

	@Override
	public void complete_DOT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Decimal", acceptor);
	}

	@Override
	public void complete_WILDCARD(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Any", acceptor);
	}

	@Override
	public void complete_EQUAL(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Equals", acceptor);
	}

	@Override
	public void complete_NOT_EQUAL(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Not equals", acceptor);
	}

	@Override
	public void complete_LT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Descendant of", acceptor);
	}

	@Override
	public void complete_GT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Ancestor of", acceptor);
	}

	@Override
	public void complete_DBL_LT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Descendant or self of", acceptor);
	}

	@Override
	public void complete_DBL_GT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Ancestor or self of", acceptor);
	}

	@Override
	public void complete_LT_EM(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Child of", acceptor);
	}

	@Override
	public void complete_GT_EM(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Parent of", acceptor);
	}

	@Override
	public void complete_GTE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Greater than or equals", acceptor);
	}

	@Override
	public void complete_LTE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Less than or equals", acceptor);
	}

	@Override
	public void complete_HASH(EObject model, RuleCall ruleCall, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_REVERSED(EObject model, RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Reverse attribute", acceptor);
	}
	
	@Override
	public void complete_TO(EObject model, RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_ROUND_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Closing nested expression", acceptor);
	}
	
	@Override
	public void complete_ROUND_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context, IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Opening nested expression", acceptor);
	}
	
	protected void createKeywordProposal(AbstractElement element, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(element, context, null, acceptor);
	}
	
	protected void createKeywordProposal(AbstractElement element, ContentAssistContext context, String explanation,
			IIdeContentProposalAcceptor acceptor) {
		if (element instanceof Keyword) {
			Keyword keyword = (Keyword) element;
			createKeywordProposal(keyword.getValue(), explanation, context, acceptor);
		} else if (element instanceof RuleCall) {
			final RuleCall ruleCall = (RuleCall) element;
			final AbstractElement alternatives = ruleCall.getRule().getAlternatives();
			createKeywordProposal(alternatives, context, explanation, acceptor);
		} else if (element instanceof Alternatives) {
			for (AbstractElement e : ((Alternatives) element).getElements()) {
				createKeywordProposal(e, context, acceptor);
			}
		} 
	}

	protected void createKeywordProposal(String keyword, String explanation, ContentAssistContext context,
			IIdeContentProposalAcceptor acceptor) {
		ContentAssistEntry entry = getProposalCreator().createProposal(keyword, context,
				ContentAssistEntry.KIND_KEYWORD, e -> e.setDescription(explanation));
		acceptor.accept(entry, getProposalPriorities().getKeywordPriority(keyword, entry));
	}
}
