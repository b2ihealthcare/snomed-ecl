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
package com.b2international.snomed.ecl.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.service.SingletonBinding;
import org.eclipse.xtext.ui.editor.contentassist.ITemplateProposalProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;

import com.b2international.snomed.ecl.ide.highlighting.EclAntlrTokenToAttributeIdMapper;
import com.b2international.snomed.ecl.ide.highlighting.EclSemanticHighlightingCalculator;
import com.b2international.snomed.ecl.ui.contentassist.SnomedConceptTemplateProposalProvider;
import com.b2international.snomed.ecl.ui.highlighting.EclHighlightingConfiguration;
import com.b2international.snomed.ecl.validation.EclValidator;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
public class EclUiModule extends AbstractEclUiModule {

	public EclUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return EclAntlrTokenToAttributeIdMapper.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return EclSemanticHighlightingCalculator.class;
	}

	/**
	 * Manually added to register the template proposal provider.
	 */
	@Override
	public Class<? extends ITemplateProposalProvider> bindITemplateProposalProvider() {
		return SnomedConceptTemplateProposalProvider.class;
	}
	
	/**
	 * Registers the custom highlight configuration.
	 */
	public Class<? extends IHighlightingConfiguration> bindIHighlightingConfiguration() {
		return EclHighlightingConfiguration.class;
	}
	
	@SingletonBinding(eager = true)
	public Class<? extends EclValidator> bindEclValidator() {
		return EclUiValidator.class;
	}
}
