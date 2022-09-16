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

import static org.junit.Assert.assertEquals

import com.b2international.snomed.ecl.ecl.AttributeComparison
import com.b2international.snomed.ecl.ecl.AttributeConstraint
import com.b2international.snomed.ecl.ecl.EclConceptReference
import com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint
import com.b2international.snomed.ecl.validation.EclValidator
import com.b2international.snomed.ecl.validation.ValidationErrorIgnoringMessageAcceptor
import com.google.inject.Inject
import java.util.Set
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith

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
			// special cases where the short domain c|d|m value is being used in the ID, this should still parse without errors
			'<<5mlYo8Z5XclDemQMwojjD9'.assertNoErrors
			'm123'.assertNoErrors
			'c123'.assertNoErrors
			'd123'.assertNoErrors
			'<<CDT15'.assertNoErrors
			'C-ID-3443'.assertNoErrors
			'E1___u32E9'.assertNoErrors
			'9876 {{ id = d_54321 }}'.assertNoErrors
			'R'.assertNoErrors
		
			val constraint2 = '<<R : R S = D'.assertNoErrors
				.constraint as RefinedExpressionConstraint;
			
			val refinement = constraint2.refinement as AttributeConstraint
			val attribute = refinement.attribute as EclConceptReference
			val comparison = refinement.comparison as AttributeComparison
			val value = comparison.value as EclConceptReference
			
			assertEquals(true, refinement.reversed)
			assertEquals("S", attribute.id)
			assertEquals("D", value.id)
			
		} finally {
			(validator.messageAcceptor as ValidationErrorIgnoringMessageAcceptor).setIgnoredSyntaxErrorCodes(Set.of())
		}
	}
	
}