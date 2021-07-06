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
package com.b2international.snomed.ecl.ide;

import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.IdeContentProposalProvider;
import org.eclipse.xtext.ide.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ide.editor.syntaxcoloring.ISemanticHighlightingCalculator;
import org.eclipse.xtext.parser.antlr.AntlrTokenDefProvider;
import org.eclipse.xtext.parser.antlr.ITokenDefProvider;

import com.b2international.snomed.ecl.ide.contentassist.EclIdeProposalProvider;
import com.b2international.snomed.ecl.ide.highlighting.EclAntlrTokenToAttributeIdMapper;
import com.b2international.snomed.ecl.ide.highlighting.EclSemanticHighlightingCalculator;
import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register IDE components.
 */
public class EclIdeModule extends AbstractEclIdeModule {
	
	public Class<? extends IdeContentProposalProvider> bindIdeContentProposalProvider() {
		return EclIdeProposalProvider.class;
	}
	
	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindAbstractAntlrTokenToAttributeIdMapper() {
		return EclAntlrTokenToAttributeIdMapper.class;
	}
	
	public Class<? extends ISemanticHighlightingCalculator> bindISemanticHighlightingCalculator() {
		return EclSemanticHighlightingCalculator.class;
	}
	
//	public Class<? extends ISemanticHighlightingStyleToTokenMapper> bindISemanticHighlightingStyleToTokenMapper() {
//		return EclHighlightingStyleToTokenMapper.class;
//	}
	
	// These are re-definitions of the bindings in AbstractEclUiModule, needed for IDE-based highlighting
	public void configureHighlightingLexer(Binder binder) {
		binder.bind(org.eclipse.xtext.parser.antlr.Lexer.class)
			.annotatedWith(Names.named(LexerIdeBindings.HIGHLIGHTING))
			.to(com.b2international.snomed.ecl.parser.antlr.internal.InternalEclLexer.class);
	}
	
	public void configureHighlightingTokenDefProvider(Binder binder) {
		binder.bind(ITokenDefProvider.class)
			.annotatedWith(Names.named(LexerIdeBindings.HIGHLIGHTING))
			.to(AntlrTokenDefProvider.class);
	}
}
