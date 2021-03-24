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
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.RED_TOKENS, "Grammar constructs", redStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.MANGO_TOKENS, "Digits, Wildcard", mangoStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.PURPLE_TOKENS, "Strings", purpleStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.GREEN_TOKENS, "Comments", greenStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.PRETTY_BLACK_TOKENS, "Square bracket, descendant of, ancestor of, child of, parent of, dash, dot", prettyBlackStyle());
		acceptor.acceptDefaultHighlighting(EclAntlrTokenToAttributeIdMapper.BOOLEAN, "Booleans", booleanStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.TERM_STRING, "Concept names", termStyle());
		acceptor.acceptDefaultHighlighting(EclTokens.CARDINALITY_RULE, "Cardinalities", cardinalityStyle());
	}

	private TextStyle redStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(232, 114, 149));
		return textStyle;
	}
	
	private TextStyle mangoStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(250, 140, 0));
		return textStyle;
	}
	
	private TextStyle purpleStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(148, 40, 255));
		return textStyle;
	}
	
	private TextStyle greenStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}
	
	private TextStyle prettyBlackStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(80, 80, 80));
		return textStyle;
	}

	private TextStyle termStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(83, 132, 245));
		return textStyle;
	}
	
	private TextStyle cardinalityStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 170, 0));
		return textStyle;
	}
	
	private TextStyle booleanStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 170));
		return textStyle;
	}
}
