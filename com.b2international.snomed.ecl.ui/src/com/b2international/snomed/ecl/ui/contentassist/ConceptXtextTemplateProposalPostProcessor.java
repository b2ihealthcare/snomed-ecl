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

import java.util.Arrays;

import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.DefaultCompletionProposalPostProcessor;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalComparator;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Template proposal post processor to sort content assist proposal content.
 */
@Singleton
public class ConceptXtextTemplateProposalPostProcessor extends DefaultCompletionProposalPostProcessor {

	@Inject
	public ConceptXtextTemplateProposalPostProcessor() {
	}
	
	/* 
	 * (non-Javadoc)
	 * @see org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalPostProcessor#postProcess(org.eclipse.jface.text.contentassist.ICompletionProposal[])
	 */
	@Override
	public ICompletionProposal[] postProcess(final ICompletionProposal[] proposals) {
		Arrays.sort(proposals, new ConceptXtextTemplateProposalComparator());
		return proposals;
	}
	
	private final class ConceptXtextTemplateProposalComparator implements ICompletionProposalComparator {

		/*
		 * (non-Javadoc)
		 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
		 */
		@Override
		public int compare(final ICompletionProposal o1, final ICompletionProposal o2) {
			return getValue(o2) - getValue(o1);
		}
		
		private int getValue(final ICompletionProposal proposal) {
			final String displayString = proposal.getDisplayString();
			return "!".equals(displayString) || "^".equals(displayString) || "<".equals(displayString) || "<<".equals(displayString) ? 1 : 0;
		}
		
	}

}
