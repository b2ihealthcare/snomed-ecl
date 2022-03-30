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
package com.b2international.snomed.ecl.tests

import com.b2international.snomed.ecl.validation.EclValidator
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import com.b2international.snomed.ecl.validation.ValidationErrorIgnoringMessageAcceptor
import java.util.Set

/**
 * @since 2.0
 */
@InjectWith(EclInjectorProvider)
@RunWith(XtextRunner)
@FixMethodOrder(NAME_ASCENDING)
class EclValidatorIgnoreSyntaxErrorTest {
	
	@Inject extension EclTestHelper
	@Inject EclValidator validator
	
	@Test
	def void ignoreSctIdSyntaxError() {
		try {
			(validator.messageAcceptor as ValidationErrorIgnoringMessageAcceptor).setIgnoredSyntaxErrorCodes(Set.of(EclValidator.SCTID_ERROR_CODE))
			'ABC123'.assertNoErrors
		} finally {
			(validator.messageAcceptor as ValidationErrorIgnoringMessageAcceptor).setIgnoredSyntaxErrorCodes(Set.of())
		}
	}
	
}