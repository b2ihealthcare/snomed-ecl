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

import org.eclipse.jface.text.templates.ContextTypeRegistry;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.jface.text.templates.TemplateProposal;
import org.eclipse.jface.text.templates.persistence.TemplateStore;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.templates.ContextTypeIdHelper;
import org.eclipse.xtext.ui.editor.templates.DefaultTemplateProposalProvider;

import com.b2international.snomed.ecl.ide.SnomedConceptProvider;
import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Custom provider class to provide concept creation template for the Xtext editor.
 */
@Singleton
public class SnomedConceptTemplateProposalProvider extends DefaultTemplateProposalProvider {

	private final SnomedConceptProvider conceptProvider;

	@Inject
	public SnomedConceptTemplateProposalProvider(TemplateStore templateStore, ContextTypeRegistry registry, ContextTypeIdHelper helper, SnomedConceptProvider conceptProvider) {
		super(templateStore, registry, helper);
		this.conceptProvider = conceptProvider;
	}

	@Override
	protected TemplateProposal doCreateProposal(Template template, TemplateContext templateContext, ContentAssistContext context, Image image,
			int relevance) {
		return new ConceptXtextTemplateProposal(template, templateContext, context.getReplaceRegion(), image, relevance, conceptProvider);
	}
}
