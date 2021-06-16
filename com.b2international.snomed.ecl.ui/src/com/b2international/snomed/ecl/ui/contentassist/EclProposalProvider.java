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
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import com.b2international.snomed.ecl.ecl.EclConceptReference;
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
	
	private static final Map<String, String> KEYWORD_DESCRIPTIONS = Map.ofEntries(
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
	public void complete_TERM_STRING(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
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
	protected StyledString getKeywordDisplayString(Keyword keyword) {
		StyledString result = new StyledString(keyword.getValue());
		
		String description = getKeywordDescription(keyword.getValue());
		if (!Strings.isNullOrEmpty(description)) {
			result.append(" - ", GRAY);
			result.append(description, GRAY);
		}
		
		return result;
	}
	
	protected String getKeywordDescription(String keyword) {
		return KEYWORD_DESCRIPTIONS.getOrDefault(keyword, "");
	}
}
