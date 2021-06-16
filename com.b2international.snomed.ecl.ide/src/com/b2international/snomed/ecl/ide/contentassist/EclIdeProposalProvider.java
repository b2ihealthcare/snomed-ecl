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
	
	private static final Map<String, String> RULE_DESCRIPTIONS = Map.ofEntries(
		Map.entry("CONJUNCTION",                  "Conjunction"),
		Map.entry("COMMA",                        "Conjunction"),
		Map.entry("DISJUNCTION",                  "Disjunction"),
		Map.entry("EXCLUSION",                    "Exclusion"),
		Map.entry("COLON",                        "Refinement"),
		Map.entry("CURLY_OPEN",                   "Opening attribute group"),
		Map.entry("CURLY_CLOSE",                  "Closing attribute group"),
		Map.entry("SQUARE_OPEN",                  "Opening cardinality"),
		Map.entry("SQUARE_CLOSE",                 "Closing cardinality"),
		Map.entry("TO",                           "Cardinality range"),
		Map.entry("PLUS",                         "Numeric value"),
		Map.entry("DASH",                         "Numeric value"),
		Map.entry("CARET",                        "Member of"),
		Map.entry("DOMAIN",                       "Filter attribute prefix"),
		Map.entry("WILDCARD",                     "Any"),
		Map.entry("EQUAL",                        "Equals"),
		Map.entry("NOT_EQUAL",                    "Not equals"),
		Map.entry("LT",                           "Descendant of"),
		Map.entry("GT",                           "Ancestor of"),
		Map.entry("DBL_LT",                       "Descendant or self of"),
		Map.entry("DBL_GT",                       "Ancestor or self of"),
		Map.entry("LT_EM",                        "Child of"),
		Map.entry("GT_EM",                        "Parent of"),
		Map.entry("DBL_LT_EM",                    "Child or self of"),
		Map.entry("DBL_GT_EM",                    "Parent or self of"),
		Map.entry("GTE",                          "Greater than or equals"),
		Map.entry("LTE",                          "Less than or equals"),
		Map.entry("REVERSED",                     "Reverse attribute"),
		Map.entry("ROUND_CLOSE",                  "Closing nested expression"),
		Map.entry("ROUND_OPEN",                   "Opening nested expression"),
		Map.entry("DOUBLE_CURLY_OPEN",            "Opening filter constraint"),
		Map.entry("DOUBLE_CURLY_CLOSE",           "Closing filter constraint"),
		Map.entry("TERM_KEYWORD",                 "Description term filter"),
		Map.entry("LANGUAGE_KEYWORD",             "Description language filter"),
		Map.entry("TYPEID_KEYWORD",               "Description type ID filter"),
		Map.entry("TYPE_KEYWORD",                 "Description type tag filter"),
		Map.entry("DIALECTID_KEYWORD",            "Description dialect ID filter"),
		Map.entry("DIALECT_KEYWORD",              "Description dialect tag filter"),
		Map.entry("ACTIVE_KEYWORD",               "Component status filter"),
		Map.entry("MODULEID_KEYWORD",             "Component module filter"),
		Map.entry("PREFERRED_IN_KEYWORD",         "Description acceptability filter"),
		Map.entry("ACCEPTABLE_IN_KEYWORD",        "Description acceptability filter"),
		Map.entry("LANGUAGE_REFSET_ID_KEYWORD",   "Description acceptability filter"),
		Map.entry("CASE_SIGNIFICANCE_ID_KEYWORD", "Description case significance filter"),
		Map.entry("TERM_STRING",                  "Concept term")
	);
	
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
		} else if (RULE_DESCRIPTIONS.containsKey(name)) {
			createKeywordProposal(ruleCall, context, acceptor, RULE_DESCRIPTIONS.get(name));
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

	public void complete_TERM_STRING(final RuleCall ruleCall, final ContentAssistContext context, 
			final IIdeContentProposalAcceptor acceptor) {
		
		String prefix = context.getPrefix().trim();
		
		/*
		 * If the prefix is not empty, it must have at least one leading pipe character.
		 * Add one to the end as the suggestion, if required.
		 */
		if (prefix.isEmpty()) {
			prefix = "|term|";
		} else if (!prefix.endsWith("|")) {
			prefix = prefix + "|";
		}
		
		final AbstractRule rule = ruleCall.getRule();
		final String ruleName = rule.getName();
		createKeywordProposal(prefix, context, acceptor, RULE_DESCRIPTIONS.get(ruleName));
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
