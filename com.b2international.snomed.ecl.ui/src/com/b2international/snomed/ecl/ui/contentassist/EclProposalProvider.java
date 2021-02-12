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

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.jface.viewers.StyledString.Styler;
import org.eclipse.swt.graphics.TextStyle;
import org.eclipse.text.edits.InsertEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;

import com.b2international.snomed.ecl.ecl.EclConceptReference;
import com.b2international.snomed.ecl.ide.SnomedConceptProvider;
import com.b2international.snomed.ecl.ide.SnomedConceptProvider.Concept;
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
	public void complete_CONJUNCTION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		 acceptor.accept(createKeywordProposal("AND", "Conjunction", context));
	}
	
	@Override
	public void complete_DISJUNCTION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createKeywordProposal("OR", "Disjunction", context));
	}
	
	@Override
	public void complete_EXCLUSION(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createKeywordProposal("MINUS", "Exclusion", context));
	}
	
	@Override
	public void complete_COLON(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Refined expression constraint", acceptor);
	}

	@Override
	public void complete_CURLY_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Opening attribute group",acceptor);
	}

	@Override
	public void complete_CURLY_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Closing attribute group", acceptor);
	}

	@Override
	public void complete_SQUARE_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Cardinality", acceptor);
	}

	@Override
	public void complete_SQUARE_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Cardinality", acceptor);
	}

	@Override
	public void complete_PLUS(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Numeric value", acceptor);
	}

	@Override
	public void complete_DASH(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Numeric value", acceptor);
	}

	@Override
	public void complete_CARET(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Member of" , acceptor);
	}

	@Override
	public void complete_DOT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Decimal", acceptor);
	}

	@Override
	public void complete_WILDCARD(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Any", acceptor);
	}

	@Override
	public void complete_EQUAL(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Equals", acceptor);
	}

	@Override
	public void complete_NOT_EQUAL(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Not equals", acceptor);
	}

	@Override
	public void complete_LT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Descendant of", acceptor);
	}

	@Override
	public void complete_GT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Ancestor of", acceptor);
	}

	@Override
	public void complete_DBL_LT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Descendant or self of", acceptor);
	}

	@Override
	public void complete_DBL_GT(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Ancestor or self of", acceptor);
	}

	@Override
	public void complete_LT_EM(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Child of", acceptor);
	}

	@Override
	public void complete_GT_EM(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Parent of", acceptor);
	}

	@Override
	public void complete_GTE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Greater than or equals", acceptor);
	}

	@Override
	public void complete_LTE(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Less than or equals", acceptor);
	}

	@Override
	public void complete_HASH(EObject model, RuleCall ruleCall, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_REVERSED(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Reverse attribute", acceptor);
	}
	
	@Override
	public void complete_TO(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, acceptor);
	}
	
	@Override
	public void complete_ROUND_CLOSE(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Closing nested expression", acceptor);
	}
	
	@Override
	public void complete_ROUND_OPEN(EObject model, RuleCall ruleCall, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(ruleCall, context, "Opening nested expression", acceptor);
	}
	
	protected void createKeywordProposal(AbstractElement element, ContentAssistContext context,
			ICompletionProposalAcceptor acceptor) {
		createKeywordProposal(element, context, null, acceptor);
	}
	
	
	@Override
	protected StyledString getKeywordDisplayString(Keyword keyword) {
		StyledString result = new StyledString(keyword.getValue());
		
		String explanation = getKeywordExplanation(keyword.getValue());
		if (!Strings.isNullOrEmpty(explanation)) {
			result.append(" - ", GRAY);
			result.append(explanation, GRAY);
		}
		
		return result;
	}
	
	protected String getKeywordExplanation(String keyword) {
		switch (keyword) {
		case ",": return "Conjunction";
		case "AND": return "Conjunction";
		case "OR": return "Union (Disjunction)";
		case "MINUS": return "Exclusion";
		default: return "";
		}
	}
	
	protected void createKeywordProposal(AbstractElement element, ContentAssistContext context, String explanation,
			ICompletionProposalAcceptor acceptor) {
		if (element instanceof Keyword) {
			Keyword keyword = (Keyword) element;
			acceptor.accept(createKeywordProposal(keyword.getValue(), explanation, context));
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

	protected ICompletionProposal createKeywordProposal(String keyword, String explanation, ContentAssistContext context) {
		return createCompletionProposal(keyword, explanation == null ? null : new StyledString(keyword).append(new StyledString(String.format(" - %s", explanation), GRAY)), null, context);
	}
	
}
