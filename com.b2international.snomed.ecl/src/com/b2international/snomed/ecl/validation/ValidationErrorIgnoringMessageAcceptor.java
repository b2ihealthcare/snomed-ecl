/*
 * Copyright 2022 B2i Healthcare Pte Ltd, http://b2i.sg
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

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.ValidationMessageAcceptor;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Strings;

/**
 * @since 2.0
 */
public class ValidationErrorIgnoringMessageAcceptor implements ValidationMessageAcceptor {

	private static final String IGNORED_SYNTAX_ERROR_CODES_PROPERTY = "ignoredSyntaxErrorCodes";
	
	private final ValidationMessageAcceptor delegate;
	
	private Set<String> ignoredSyntaxErrorCodes;
	
	public ValidationErrorIgnoringMessageAcceptor(ValidationMessageAcceptor delegate) {
		this.delegate = delegate;
		final String value = System.getProperty(IGNORED_SYNTAX_ERROR_CODES_PROPERTY, "");
		this.ignoredSyntaxErrorCodes = Strings.isNullOrEmpty(value) ? Set.of() : Set.of(value.split(","));
	}
	
	@VisibleForTesting
	public void setIgnoredSyntaxErrorCodes(Set<String> syntaxErrorCodes) {
		this.ignoredSyntaxErrorCodes = syntaxErrorCodes == null ? Set.of() : Set.copyOf(syntaxErrorCodes); 
	}
	
	@Override
	public void acceptError(String message, EObject object, EStructuralFeature feature, int index, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptError(message, object, feature, index, code, issueData);
		}
	}

	@Override
	public void acceptError(String message, EObject object, int offset, int length, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptError(message, object, offset, length, code, issueData);
		}
	}

	@Override
	public void acceptWarning(String message, EObject object, EStructuralFeature feature, int index, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptWarning(message, object, feature, index, code, issueData);
		}
	}

	@Override
	public void acceptWarning(String message, EObject object, int offset, int length, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptWarning(message, object, offset, length, code, issueData);
		}
	}

	@Override
	public void acceptInfo(String message, EObject object, EStructuralFeature feature, int index, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptInfo(message, object, feature, index, code, issueData);
		}
	}

	@Override
	public void acceptInfo(String message, EObject object, int offset, int length, String code, String... issueData) {
		if (!isIgnoredErrorCode(code)) {
			delegate.acceptInfo(message, object, offset, length, code, issueData);
		}
	}
	
	private boolean isIgnoredErrorCode(String code) {
		return ignoredSyntaxErrorCodes.contains(code);
	}

}
