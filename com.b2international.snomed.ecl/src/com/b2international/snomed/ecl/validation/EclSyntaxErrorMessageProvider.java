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
package com.b2international.snomed.ecl.validation;

import static org.eclipse.xtext.diagnostics.Diagnostic.SYNTAX_DIAGNOSTIC;

import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.UnwantedTokenException;
import org.eclipse.xtext.nodemodel.SyntaxErrorMessage;
import org.eclipse.xtext.parser.antlr.SyntaxErrorMessageProvider;

public class EclSyntaxErrorMessageProvider extends SyntaxErrorMessageProvider {

	@Override
	public SyntaxErrorMessage getSyntaxErrorMessage(IParserErrorContext context) {

		final RecognitionException exception = context.getRecognitionException();
		if (exception == null) {
			final String message = context.getDefaultMessage();
			final String errorMessage = message.substring(0, 1).toUpperCase() + message.substring(1);
			return new SyntaxErrorMessage(errorMessage, SYNTAX_DIAGNOSTIC);
		}

		if (exception instanceof UnwantedTokenException || exception instanceof NoViableAltException) {
			final int columnIndex = exception.charPositionInLine + 1;
			final int lineIndex = exception.line;
			final String errorAtString = String.format("[%d:%d]", lineIndex, columnIndex);
			final String characterString = "'" + exception.token.getText() + "'";
			return new SyntaxErrorMessage("Invalid character " + characterString + " at " + errorAtString,
					SYNTAX_DIAGNOSTIC);
		} else {
			return super.getSyntaxErrorMessage(context);
		}
	}
}