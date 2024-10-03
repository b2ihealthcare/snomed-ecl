/*
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
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

import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateBuffer;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateException;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.xtext.ui.editor.templates.XtextTemplateProposal;

import com.b2international.snomed.ecl.ui.EclUiPlugin;
import com.b2international.snomed.ecl.ui.SnomedConceptProvider;
import com.b2international.snomed.ecl.ui.SnomedConceptProvider.Concept;
import com.b2international.snomed.ecl.ui.internal.EclActivator;

/**
 * Template proposal to insert SNOMED CT concepts into the expression.
 * 
 * @since 1.3.0
 */
public class ConceptXtextTemplateProposal extends XtextTemplateProposal {

	public static final String PLATFORM_SEPARATOR = System.getProperty("file.separator"); // $NON-NLS-N$
	public static final String ICONS_PATH = "icons" + PLATFORM_SEPARATOR; // $NON-NLS-N$
	public static final String FIND_PATH = ICONS_PATH + "find_obj.gif"; // $NON-NLS-N$
	public static final String TEMPLATE = ICONS_PATH + "document-template.png"; // $NON-NLS-N$
	public static final String ATTRIBUTE_ICON_PATH = ICONS_PATH + "chain.png"; // $NON-NLS-N$
	
	private final SnomedConceptProvider conceptProvider;
	
	private final IRegion region;
	private IRegion selectedRegion;

	/**
	 * Creates a template proposal with a template and its context.
	 * 
	 * @param template the template
	 * @param context the context in which the template was requested.
	 * @param image the icon of the proposal.
	 * @param region the region this proposal is applied to
	 * @param relevance the relevance of the proposal
	 * @param conceptProvider 
	 */
	public ConceptXtextTemplateProposal(Template template, TemplateContext context, IRegion region, Image image, int relevance, SnomedConceptProvider conceptProvider) {
		super(template, context, region, image, relevance);		
		this.region = region;
		this.conceptProvider = conceptProvider;
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.templates.TemplateProposal#getImage()
	 */
	@Override
	public Image getImage() {
		return getImage(getTemplate());
	}
	
	private Image getImage(Template template) {
		if ("Concept".equals(getTemplate().getName())) {
			return EclUiPlugin.getDefault().getImage(FIND_PATH);
		} else if ("Template".equals(getTemplate().getName())) {
			return EclUiPlugin.getDefault().getImage(TEMPLATE);
		} else {
			return EclUiPlugin.getDefault().getImage(ATTRIBUTE_ICON_PATH);
		}
	}
	
	/*
	 * @see ICompletionProposal#getSelection(IDocument)
	 */
	@Override
	public Point getSelection(IDocument document) {
		
		//needed to do this because superclass's selected region cannot be set explicitly only via apply()
		if ("Concept".equals(getTemplate().getName())) {
			if (selectedRegion == null)
				return null;
			
			return new Point(selectedRegion.getOffset(), selectedRegion.getLength());
		} else {
			return super.getSelection(document);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.eclipse.jface.text.templates.TemplateProposal#apply(org.eclipse.jface.text.ITextViewer, char, int, int)
	 */
	@Override
	public void apply(ITextViewer viewer, char trigger, int stateMask, int offset) {
		
		/*
		 * For the template named "Concept" we register a search dialog.
		 */
		if (getTemplate().getName().equals("Concept")) {
			insertConceptFromSearchDialog(viewer, trigger, stateMask, offset);
		} else {
			super.apply(viewer, trigger, stateMask, offset);
		}
	}
	
	private void insertConceptFromSearchDialog(ITextViewer viewer, char trigger, int stateMask, int offset) {
		
		IDocument document = viewer.getDocument();
		try {
			getContext().setReadOnly(false);
			int start;
			TemplateBuffer templateBuffer;
			{
				int oldReplaceOffset = getReplaceOffset();
				try {
					// this may already modify the document (e.g. add imports)
					templateBuffer = getContext().evaluate(getTemplate());
				} catch (TemplateException e1) {
					selectedRegion = region;
					return;
				}

				start = getReplaceOffset();
				int shift = start - oldReplaceOffset;
				int end = Math.max(getReplaceEndOffset(), offset + shift);

				// insert template string
				String templateString = templateBuffer.getString();
				
				document.replace(start, end - start, templateString);

				Concept searchResult = conceptProvider.search();
				
				String selectedConceptString = null;
				if (searchResult == null) { // if we cancel the dialog, we should get rid of the template string
					document.replace(start, end-start+templateString.length(), "");
					return;
				} else {
					selectedConceptString = String.format("%s |%s|", searchResult.getId(), searchResult.getTerm());
				}

				int lengthToReplace = templateString.length();
				if (start + lengthToReplace> document.getLength()) {
					lengthToReplace = document.getLength() - start;
				}
				
				ReplaceEdit de = new ReplaceEdit(start, lengthToReplace, selectedConceptString);
				de.apply(document);
				
				//set the cursor to the end of the inserted string
				viewer.setSelectedRange(start + selectedConceptString.length(), 0);
				viewer.revealRange(start, selectedConceptString.length()  + 20);
			}

		} catch (BadLocationException e) {
			EclActivator.getInstance().getLog().error(e.getMessage(), e);
			selectedRegion = region;
		}
	}
}
