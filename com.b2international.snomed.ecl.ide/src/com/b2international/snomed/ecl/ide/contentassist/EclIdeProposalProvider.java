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

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ide.editor.contentassist.ContentAssistEntry;
import org.eclipse.xtext.ide.editor.contentassist.IIdeContentProposalAcceptor;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class EclIdeProposalProvider extends IdeContentProposalProvider {
	
	/*
	 * More of a placeholder than an actual fallback; the method refers to the empty
	 * implementation that handles RuleCall arguments in the superclass. It is used
	 * because we need a reference to a Method - cache loaders can not return null
	 * value for a key.
	 */
	private static final Method FALLBACK_METHOD;
	
	static {
		try {
			FALLBACK_METHOD = IdeContentProposalProvider.class.getDeclaredMethod("_createProposals", 
				RuleCall.class, ContentAssistContext.class, IIdeContentProposalAcceptor.class);
		} catch (final NoSuchMethodException e) {
			throw new RuntimeException(e);
		}
	}
	
	private final LoadingCache<String, Method> completeMethods = CacheBuilder.newBuilder()
		.build(CacheLoader.<String, Method>from(name -> {
			try {
				return EclIdeProposalProvider.class.getDeclaredMethod("complete_" + name, 
					RuleCall.class, ContentAssistContext.class, IIdeContentProposalAcceptor.class);
			} catch (final NoSuchMethodException e) {
				return FALLBACK_METHOD;
			}
		}));
	
	@Override
	protected void _createProposals(final AbstractElement element, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		if (element instanceof Alternatives) {
			final Alternatives alternatives = (Alternatives) element;
			_createProposals(alternatives, context, acceptor);
		} else {
			// The implementation in the superclass is empty
			// super._createProposals(element, context, acceptor);
		}
	}

	@Override
	protected void _createProposals(final Assignment assignment, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		final AbstractElement terminal = assignment.getTerminal();
		
		/*
		 * XXX: we could route these calls back to the non-underscored createProposals
		 * method, but we can save a set of extra instanceof checks if we delegate
		 * directly to the appropriate place.
		 */
		if (terminal instanceof RuleCall) {
			_createProposals((RuleCall) terminal, context, acceptor);
		} else if (terminal instanceof Alternatives) {
			_createProposals((Alternatives) terminal, context, acceptor);
		} else {
			// The implementation in the superclass handles cross-references, which we don't have
			// super._createProposals(assignment, context, acceptor);
		}
		
	}

	@Override
	protected void _createProposals(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		final AbstractRule rule = ruleCall.getRule();
		final Method completeMethod = completeMethods.getUnchecked(rule.getName());
		
		if (completeMethod != FALLBACK_METHOD) {
			try {
				completeMethod.invoke(this, ruleCall, context, acceptor);
			} catch (IllegalAccessException | InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		} else {
			// Default implementation: create keyword without description from alternatives
			createKeywordProposal(ruleCall, context, acceptor);
		}
	}
	
	// Not overridden
	protected void _createProposals(final Alternatives alternatives, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		for (final AbstractElement alternativeElement : alternatives.getElements()) {
			createProposals(alternativeElement, context, acceptor);
		}
	}

	public void complete_TERM_STRING(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
		final ContentAssistEntry entry = getProposalCreator().createProposal("|term|", context, ContentAssistEntry.KIND_KEYWORD, 
			e -> e.setDescription("Concept term"));
		acceptor.accept(entry, getProposalPriorities().getDefaultPriority(entry));
	}

	public void complete_CONJUNCTION(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal("AND", context, acceptor, "Conjunction");
	}

	public void complete_DISJUNCTION(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal("OR", context, acceptor, "Disjunction");
	}

	public void complete_EXCLUSION(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal("MINUS", context, acceptor, "Exclusion");
	}

	public void complete_COLON(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Refined expression constraint");
	}

	public void complete_CURLY_OPEN(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor,"Opening attribute group");
	}

	public void complete_CURLY_CLOSE(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Closing attribute group");
	}

	public void complete_SQUARE_OPEN(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Cardinality");
	}

	public void complete_SQUARE_CLOSE(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Cardinality");
	}

	public void complete_PLUS(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Numeric value");
	}

	public void complete_DASH(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Numeric value");
	}

	public void complete_CARET(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor , "Member of");
	}

	public void complete_DOT(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Decimal");
	}

	public void complete_WILDCARD(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Any");
	}

	public void complete_EQUAL(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Equals");
	}

	public void complete_NOT_EQUAL(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Not equals");
	}

	public void complete_LT(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Descendant of");
	}

	public void complete_GT(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Ancestor of");
	}

	public void complete_DBL_LT(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Descendant or self of");
	}

	public void complete_DBL_GT(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Ancestor or self of");
	}

	public void complete_LT_EM(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Child of");
	}

	public void complete_GT_EM(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Parent of");
	}

	public void complete_GTE(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Greater than or equals");
	}

	public void complete_LTE(final RuleCall ruleCall, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Less than or equals");
	}

	public void complete_REVERSED(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Reverse attribute");
	}

	public void complete_ROUND_CLOSE(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Closing nested expression");
	}

	public void complete_ROUND_OPEN(final RuleCall ruleCall, final ContentAssistContext context, final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor, "Opening nested expression");
	}

	private void createKeywordProposal(final AbstractElement element, final ContentAssistContext context,
			final IIdeContentProposalAcceptor acceptor) {
		createKeywordProposal(element, context, acceptor, null);
	}
	
	private void createKeywordProposal(final AbstractElement element, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor, final String description) {
		if (element instanceof Keyword) {
			final Keyword keyword = (Keyword) element;
			createKeywordProposal(keyword.getValue(), context, acceptor, description);
		} else if (element instanceof RuleCall) {
			final RuleCall ruleCall = (RuleCall) element;
			final AbstractElement alternatives = ruleCall.getRule().getAlternatives();
			createKeywordProposal(alternatives, context, acceptor, description);
		} else if (element instanceof Alternatives) {
			final Alternatives alternatives = (Alternatives) element;
			for (final AbstractElement e : alternatives.getElements()) {
				createKeywordProposal(e, context, acceptor);
			}
		} 
	}

	private void createKeywordProposal(final String proposal, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor, final String description) {
		final ContentAssistEntry entry = getProposalCreator().createProposal(proposal, context, 
				ContentAssistEntry.KIND_KEYWORD, e -> e.setDescription(description));
		acceptor.accept(entry, getProposalPriorities().getKeywordPriority(proposal, entry));
	}
}
