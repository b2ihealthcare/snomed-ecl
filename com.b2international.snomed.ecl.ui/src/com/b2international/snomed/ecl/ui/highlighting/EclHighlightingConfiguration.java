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

import com.b2international.snomed.ecl.ide.highlighting.EclHighlightingRuleIDs;

/**
 * Class for setting up the styling rules for the editor.
 */
public class EclHighlightingConfiguration implements IHighlightingConfiguration {

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.KEYWORD_OPERATOR_RULE_ID, "Grammar constructs", operatorStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.KEYWORD_OTHER_RULE_ID, "Pipes", pipeStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.STRING_QUOTED_RULE_ID, "Strings", stringStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.STRING_QUOTED_OTHER_RULE_ID, "Term strings", termStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.COMMENT_RULE_ID, "Comments", commentStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.CONSTANT_LANGUAGE_RULE_ID, "Boolean constants", constantStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_ID, "Integer constants", constantStyle());
		acceptor.acceptDefaultHighlighting(EclHighlightingRuleIDs.CONSTANT_NUMERIC_INTEGER_OTHER_ID, "SNOMED CT identifiers", snomedIdentifierStyle());
	}

	private TextStyle operatorStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(160, 0, 0));
		return textStyle;
	}
	
	private TextStyle stringStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(148, 40, 255));
		return textStyle;
	}
	
	private TextStyle commentStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}
	
	private TextStyle snomedIdentifierStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(96, 96, 96));
		return textStyle;
	}

	private TextStyle pipeStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(83, 132, 245));
		return textStyle;
	}
	
	private TextStyle termStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(30, 3, 0));
		return textStyle;
	}
	
	private TextStyle constantStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setBackgroundColor(new RGB(255, 255, 255));
		textStyle.setColor(new RGB(0, 0, 170));
		return textStyle;
	}
}
