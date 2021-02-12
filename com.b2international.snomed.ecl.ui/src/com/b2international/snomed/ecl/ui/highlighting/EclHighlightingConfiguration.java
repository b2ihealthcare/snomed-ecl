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
package com.b2international.snomed.ecl.ui.highlighting;

import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

import com.b2international.snomed.ecl.ui.EclTokens;


/**
 * Class for setting up the styling rules for the editor.
 *
 */
public class EclHighlightingConfiguration implements IHighlightingConfiguration {

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(EclTokens.PIPE, "Pipe", pipeStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.RED_TOKENS, "Grammar constructs", redStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.TERM, "Term", termStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.CONCEPTID, "Concept ID", conceptIdStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.SL_COMMENT, "Single-line comment", commentStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.ML_COMMENT, "Multi-line comment", commentStyle());
	}

	private TextStyle pipeStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(60, 230, 65));
		return textStyle;
	}

	private TextStyle redStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(232, 114, 149));
		return textStyle;
	}

	private TextStyle termStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(83, 132, 245));
		return textStyle;
	}

	private TextStyle conceptIdStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	private TextStyle commentStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}

}
