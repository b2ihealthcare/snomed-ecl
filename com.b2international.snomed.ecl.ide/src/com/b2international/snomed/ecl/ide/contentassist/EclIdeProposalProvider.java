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
import java.util.Map;

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

import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.inject.Inject;

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
	
	
	@Inject
	private EclGrammarAccess ga;
	
	private Map<AbstractRule, String> ruleDescriptions;
	
	@Inject
	private void initializeDescriptions() {
		 ruleDescriptions = Map.ofEntries(
			Map.entry(ga.getCONJUNCTION_KEYWORDRule(),          "Conjunction"),
			Map.entry(ga.getCOMMARule(),                        "Conjunction"),
			Map.entry(ga.getDISJUNCTION_KEYWORDRule(),          "Disjunction"),
			Map.entry(ga.getEXCLUSION_KEYWORDRule(),            "Exclusion"),
			Map.entry(ga.getCOLONRule(),                        "Refinement"),
			Map.entry(ga.getDOTRule(),                          "Dotted attribute or domain"),
			Map.entry(ga.getCURLY_OPENRule(),                   "Opening attribute group"),
			Map.entry(ga.getCURLY_CLOSERule(),                  "Closing attribute group"),
			Map.entry(ga.getSQUARE_OPENRule(),                  "Opening cardinality"),
			Map.entry(ga.getSQUARE_CLOSERule(),                 "Closing cardinality"),
			Map.entry(ga.getTORule(),                           "Cardinality range"),
			Map.entry(ga.getPLUSRule(),                         "Numeric value"),
			Map.entry(ga.getDASHRule(),                         "Numeric value"),
			Map.entry(ga.getCARETRule(),                        "Member of"),
			Map.entry(ga.getDOMAINRule(),                       "Filter attribute prefix"),
			Map.entry(ga.getWILDCARDRule(),                     "Any"),
			Map.entry(ga.getEQUALRule(),                        "Equals"),
			Map.entry(ga.getNOT_EQUALRule(),                    "Not equals"),
			Map.entry(ga.getLTRule(),                           "Descendant of"),
			Map.entry(ga.getGTRule(),                           "Ancestor of"),
			Map.entry(ga.getDBL_LTRule(),                       "Descendant or self of"),
			Map.entry(ga.getDBL_GTRule(),                       "Ancestor or self of"),
			Map.entry(ga.getLT_EMRule(),                        "Child of"),
			Map.entry(ga.getGT_EMRule(),                        "Parent of"),
			Map.entry(ga.getDBL_LT_EMRule(),                    "Child or self of"),
			Map.entry(ga.getDBL_GT_EMRule(),                    "Parent or self of"),
			Map.entry(ga.getGTERule(),                          "Greater than or equals"),
			Map.entry(ga.getLTERule(),                          "Less than or equals"),
			Map.entry(ga.getREVERSEDRule(),                     "Reverse attribute"),
			Map.entry(ga.getROUND_CLOSERule(),                  "Closing nested expression"),
			Map.entry(ga.getROUND_OPENRule(),                   "Opening nested expression"),
			Map.entry(ga.getDOUBLE_CURLY_OPENRule(),            "Opening filter constraint"),
			Map.entry(ga.getDOUBLE_CURLY_CLOSERule(),           "Closing filter constraint"),
			Map.entry(ga.getTERM_KEYWORDRule(),                 "Description term filter"),
			Map.entry(ga.getLANGUAGE_KEYWORDRule(),             "Description language filter"),
			Map.entry(ga.getTYPEID_KEYWORDRule(),               "Description type ID filter"),
			Map.entry(ga.getTYPE_KEYWORDRule(),                 "Description type tag filter"),
			Map.entry(ga.getDIALECTID_KEYWORDRule(),            "Description dialect ID filter"),
			Map.entry(ga.getDIALECT_KEYWORDRule(),              "Description dialect tag filter"),
			Map.entry(ga.getACTIVE_KEYWORDRule(),               "Component status filter"),
			Map.entry(ga.getMODULEID_KEYWORDRule(),             "Component module filter"),
			Map.entry(ga.getSEMANTIC_TAG_KEYWORDRule(),         "Component semantic tag filter"),
			Map.entry(ga.getEFFECTIVE_TIME_KEYWORDRule(),       "Component effective time filter"),
			Map.entry(ga.getPREFERRED_IN_KEYWORDRule(),         "Description acceptability filter"),
			Map.entry(ga.getACCEPTABLE_IN_KEYWORDRule(),        "Description acceptability filter"),
			Map.entry(ga.getLANGUAGE_REFSET_ID_KEYWORDRule(),   "Description acceptability filter"),
			Map.entry(ga.getCASE_SIGNIFICANCE_ID_KEYWORDRule(), "Description case significance filter"),
			Map.entry(ga.getPIPE_DELIMITED_STRINGRule(),        "Concept term")
		);
	}
	
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
		final String name = rule.getName();
		final Method completeMethod = completeMethods.getUnchecked(name);
		
		if (completeMethod != FALLBACK_METHOD) {
			try {
				completeMethod.invoke(this, ruleCall, context, acceptor);
			} catch (IllegalAccessException | InvocationTargetException e) {
				throw new RuntimeException(e);
			}
		} else if (ruleDescriptions.containsKey(rule)) {
			createKeywordProposal(ruleCall, context, acceptor, ruleDescriptions.get(rule));
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

	public void complete_PIPE_DELIMITED_STRING(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		String prefix = context.getPrefix().trim();
		
		/*
		 * If the prefix is not empty, it must have at least one leading pipe character.
		 * Add one to the end as the suggestion, if required.
		 */
		if (prefix.isEmpty()) {
			prefix = "|term|";
		} else if (!prefix.startsWith("|")) {
			/*
			 * XXX: Suggestions that do not start with the currently entered text are not
			 * accepted by the editor, so we can not "inject" or wrap pipe characters around
			 * a string to make it a concept term.
			 */
			return;
		} else if (!prefix.endsWith("|")) {
			// It is possible to add the pipe as a suffix, however.
			prefix = prefix + "|";
		}
		
		final AbstractRule rule = ruleCall.getRule();
		createKeywordProposal(prefix, context, acceptor, ruleDescriptions.get(rule));
	}

	public void complete_WS(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		// Do not suggest various alternatives for whitespace
	}
	
	public void complete_DialectAliasValue(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		// TODO: add suggestions for known dialect aliases (not part of the grammar)
	}
	
	public void complete_UnquotedString(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		// TODO: separate unquoted string usage based on the context (or rule), add suggestions for known valid values (not part of the grammar)
	}
	
	public void complete_SnomedIdentifier(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		// No suggestions should be offered for SCTIDs ("raw numbers")
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
				createKeywordProposal(e, context, acceptor, description);
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
