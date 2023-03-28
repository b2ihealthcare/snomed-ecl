/*
 * Copyright 2021-2023 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ecl;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.antlr.ISyntaxErrorMessageProvider;
import org.eclipse.xtext.validation.CompositeEValidator;

import com.b2international.snomed.ecl.converter.EclValueConverterService;
import com.b2international.snomed.ecl.validation.EclSyntaxErrorMessageProvider;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class EclRuntimeModule extends AbstractEclRuntimeModule {
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return EclValueConverterService.class;
	}
	
	public Class<? extends ISyntaxErrorMessageProvider> bindISyntaxErrorMessageProvider() {
		return EclSyntaxErrorMessageProvider.class;
	}
	
	/**
	 * Disable unnecessary EObjectValidator usage inside the {@link CompositeEValidator} to prevent unnecessary recursion and slowness when validating larger ECL expressions.
	 */
	public void configureEObjectValidator(com.google.inject.Binder binder) {
		binder.bind(Boolean.TYPE).annotatedWith(Names.named(CompositeEValidator.USE_EOBJECT_VALIDATOR)).toInstance(Boolean.FALSE);
	}
	
}
