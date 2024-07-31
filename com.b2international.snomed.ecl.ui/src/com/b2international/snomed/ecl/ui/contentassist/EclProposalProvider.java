/*
 * Copyright 2021-2024 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ecl.ui.contentassist;

import java.util.Map;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.*;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import com.b2international.snomed.ecl.ecl.EclConceptReference;
import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.b2international.snomed.ecl.ui.SnomedConceptProvider;
import com.b2international.snomed.ecl.ui.SnomedConceptProvider.Concept;
import com.b2international.snomed.ecl.ui.internal.EclActivator;
import com.google.common.base.Strings;
import com.google.inject.Inject;

/**
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#content-assist
 * on how to customize the content assistant.
 */
public class EclProposalProvider extends AbstractEclProposalProvider {

	private static final Styler GRAY = new Styler() {
		
		private static final String INACTIVE_GRAY = "192,192,192";
		
		@Override
		public void applyStyles(TextStyle textStyle) {
			textStyle.foreground = EditorUtils.colorFromString(INACTIVE_GRAY);
		}
		
	};
	
	@Inject
	private SnomedConceptProvider termProvider;
	
	@Inject
	private EclGrammarAccess ga;
	
	private Map<AbstractRule, String> ruleDescriptions;
	
	@Inject
	private void initializeDescriptions() {
		 ruleDescriptions = Map.ofEntries(
			Map.entry(ga.getCONJUNCTION_KEYWORDRule(),             "Conjunction"),
			Map.entry(ga.getCOMMARule(),                           "Conjunction"),
			Map.entry(ga.getDISJUNCTION_KEYWORDRule(),             "Disjunction"),
			Map.entry(ga.getEXCLUSION_KEYWORDRule(),               "Exclusion"),
			Map.entry(ga.getCOLONRule(),                           "Refinement"),
			Map.entry(ga.getDOTRule(),                             "Dotted attribute"),
			Map.entry(ga.getCURLY_OPENRule(),                      "Opening attribute group"),
			Map.entry(ga.getCURLY_CLOSERule(),                     "Closing attribute group"),
			Map.entry(ga.getSQUARE_OPENRule(),                     "Opening cardinality"),
			Map.entry(ga.getSQUARE_CLOSERule(),                    "Closing cardinality"),
			Map.entry(ga.getTORule(),                              "Cardinality range"),
			Map.entry(ga.getPLUSRule(),                            "Numeric value or history supplement"),
			Map.entry(ga.getDASHRule(),                            "Numeric value"),
			Map.entry(ga.getCARETRule(),                           "Member of"),
			Map.entry(ga.getWILDCARDRule(),                        "Any"),
			Map.entry(ga.getEQUALRule(),                           "Equals"),
			Map.entry(ga.getNOT_EQUALRule(),                       "Not equals"),
			Map.entry(ga.getLTRule(),                              "Descendant of"),
			Map.entry(ga.getGTRule(),                              "Ancestor of"),
			Map.entry(ga.getDBL_LTRule(),                          "Descendant or self of"),
			Map.entry(ga.getDBL_GTRule(),                          "Ancestor or self of"),
			Map.entry(ga.getLT_EMRule(),                           "Child of"),
			Map.entry(ga.getGT_EMRule(),                           "Parent of"),
			Map.entry(ga.getDBL_LT_EMRule(),                       "Child or self of"),
			Map.entry(ga.getDBL_GT_EMRule(),                       "Parent or self of"),
			Map.entry(ga.getGTERule(),                             "Greater than or equals"),
			Map.entry(ga.getLTERule(),                             "Less than or equals"),
			Map.entry(ga.getREVERSEDRule(),                        "Reverse attribute"),
			Map.entry(ga.getROUND_CLOSERule(),                     "Closing nested expression"),
			Map.entry(ga.getROUND_OPENRule(),                      "Opening nested expression"),
			Map.entry(ga.getDOUBLE_CURLY_OPENRule(),               "Opening filter constraint"),
			Map.entry(ga.getDOUBLE_CURLY_CLOSERule(),              "Closing filter constraint"),
			Map.entry(ga.getTERM_KEYWORDRule(),                    "Description term filter"),
			Map.entry(ga.getLANGUAGE_KEYWORDRule(),                "Description language filter"),
			Map.entry(ga.getID_KEYWORDRule(),                      "Description ID filter"),
			Map.entry(ga.getTYPEID_KEYWORDRule(),                  "Description type ID filter"),
			Map.entry(ga.getTYPE_KEYWORDRule(),                    "Description type tag filter"),
			Map.entry(ga.getDIALECTID_KEYWORDRule(),               "Description dialect ID filter"),
			Map.entry(ga.getDIALECT_KEYWORDRule(),                 "Description dialect tag filter"),
			Map.entry(ga.getDEFINITION_STATUS_ID_KEYWORDRule(),    "Concept definition status ID filter"),
			Map.entry(ga.getDEFINITION_STATUS_TOKEN_KEYWORDRule(), "Concept definition status tag filter"),
			Map.entry(ga.getACTIVE_KEYWORDRule(),                  "Component status filter"),
			Map.entry(ga.getMODULEID_KEYWORDRule(),                "Component module filter"),
			Map.entry(ga.getSEMANTIC_TAG_KEYWORDRule(),            "Component semantic tag filter"),
			Map.entry(ga.getEFFECTIVE_TIME_KEYWORDRule(),          "Component effective time filter"),
			Map.entry(ga.getPREFERRED_IN_KEYWORDRule(),            "Description acceptability filter"),
			Map.entry(ga.getACCEPTABLE_IN_KEYWORDRule(),           "Description acceptability filter"),
			Map.entry(ga.getLANGUAGE_REFSET_ID_KEYWORDRule(),      "Description acceptability filter"),
			Map.entry(ga.getCASE_SIGNIFICANCE_ID_KEYWORDRule(),    "Description case significance filter"),
			Map.entry(ga.getPIPE_DELIMITED_STRINGRule(),           "Concept term")
		);
	}

	@Override
	public void complete_PIPE_DELIMITED_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (model instanceof EclConceptReference) {
			EclConceptReference conceptRef = (EclConceptReference) model;

			if (conceptRef.getId() != null && conceptRef.getId().length() > 0 && (Strings.isNullOrEmpty(conceptRef.getTerm()) || !conceptRef.getTerm().endsWith("|"))) {
				String conceptId = conceptRef.getId();
				
				final Concept concept = termProvider.getConcept(conceptId);
				
				if (concept == null) {
					return;
				}
				
				IXtextDocument document = context.getDocument();

				try {
					final int offset = context.getOffset() - context.getPrefix().length();
					final String textToInsert = "|" + concept.getTerm() + "|";
					int lengthToInsert = textToInsert.length();
					if (offset + lengthToInsert > document.getLength()) {
						lengthToInsert = document.getLength() - offset;
					}

					if (context.getPrefix().length() > 0) {
						ReplaceEdit replaceEdit = new ReplaceEdit(offset, context.getPrefix().length(), textToInsert);
						replaceEdit.apply(document);
					} else {
						InsertEdit insertEdit = new InsertEdit(offset, textToInsert);
						insertEdit.apply(document);
					}

					// set the cursor to the end of the inserted string
					IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
							.getActiveEditor();

					if (editor instanceof XtextEditor) {
						((XtextEditor) editor).selectAndReveal(offset + textToInsert.length(), 0);
					}
				} catch (BadLocationException e) {
					EclActivator.getInstance().getLog().log(new Status(Status.ERROR, EclActivator.PLUGIN_ID, e.getMessage(), e));
				}
			}
		}
	}

	@Override
	public void complete_SHORT_DOMAIN(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String prefix = context.getPrefix().trim();
		
		if (prefix.equalsIgnoreCase("C") || prefix.isEmpty()) {
			completeRuleCall(ruleCall, "c", "Concept filter constraint", context, acceptor);
		}
		
		if (prefix.equalsIgnoreCase("D") || prefix.isEmpty()) {
			completeRuleCall(ruleCall, "d", "Description filter constraint", context, acceptor);
		}
	}
	
	@Override
	public void complete_HISTORY_KEYWORD(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		completeRuleCall(ruleCall, "HISTORY-MIN", "Minimum history supplement profile", context, acceptor);
		completeRuleCall(ruleCall, "HISTORY-MOD", "Moderate history supplement profile", context, acceptor);
		completeRuleCall(ruleCall, "HISTORY-MAX", "Maximum history supplement profile", context, acceptor);
	}

	private void completeRuleCall(RuleCall ruleCall, String suggestion, String description, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		final StyledString displayString = new StyledString(suggestion);
		displayString.append(" - ", GRAY);			
		displayString.append(description, GRAY);			
		
		acceptor.accept(createCompletionProposal(suggestion, displayString, getImage(ruleCall), context));
	}

	@Override
	public void completeRuleCall(RuleCall ruleCall, ContentAssistContext contentAssistContext, ICompletionProposalAcceptor acceptor) {
		final AbstractRule abstractRule = ruleCall.getRule();
		
		AbstractElement alternatives = abstractRule.getAlternatives();
		
		if (alternatives instanceof Alternatives) {
			for (AbstractElement element : ((Alternatives) alternatives).getElements()) {
				DefaultContentAssistProcessorSwitch defaultContentAssistProcessorSwitch = new DefaultContentAssistProcessorSwitch(contentAssistContext, acceptor);
				defaultContentAssistProcessorSwitch.accept(element);
			}
		}
		
		if (ruleDescriptions.containsKey(abstractRule)) {

			// Rules for which we have a description typically consist of a single keyword 
			if (alternatives instanceof Keyword) {
				completeKeyword((Keyword) alternatives, contentAssistContext, acceptor);
			}
			
		}
		
		// Also try the reflective method call-based completion
		super.completeRuleCall(ruleCall, contentAssistContext, acceptor);
	}
	
	@Override
	protected StyledString getKeywordDisplayString(Keyword keyword) {
		StyledString result = new StyledString(keyword.getValue());
		
		String description = getKeywordDescription(keyword.eContainer());
		if (!Strings.isNullOrEmpty(description)) {
			result.append(" - ", GRAY);
			result.append(description, GRAY);
		}
		
		return result;
	}
	
	@Override
	public void completeIntegerValueComparison_Op(EObject model, Assignment assignment, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		RuleCall terminal = (RuleCall) assignment.getTerminal();
		if (terminal.getRule().equals(ga.getNUMERIC_OPERATORRule())) {
			
			RuleCall ruleCall = (RuleCall) assignment.getTerminal();
			Alternatives alternatives = (Alternatives) ruleCall.getRule().getAlternatives();
			
			for (AbstractElement element : alternatives.getElements()) {
				RuleCall nestedRuleCall = (RuleCall) element;
				
				if (nestedRuleCall.getRule().equals(ga.getGTRule())) {
					completeRuleCall(nestedRuleCall, ">", "Greater than", context, acceptor);
				} else if (nestedRuleCall.getRule().equals(ga.getLTRule())) {
					completeRuleCall(nestedRuleCall, "<", "Less than", context, acceptor);
				} else {
					completeRuleCall(nestedRuleCall, context, acceptor);
				}
			}
		} else {
			super.completeIntegerValueComparison_Op(model, assignment, context, acceptor);
		}
	}
	
	protected String getKeywordDescription(EObject container) {
		return ruleDescriptions.getOrDefault(container, "");
	}
}
