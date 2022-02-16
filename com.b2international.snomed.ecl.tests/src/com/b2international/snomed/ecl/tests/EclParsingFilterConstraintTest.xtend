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

import com.b2international.snomed.ecl.ecl.EclPackage
import com.b2international.snomed.ecl.validation.EclValidator
import com.google.inject.Inject
import org.eclipse.xtext.diagnostics.Diagnostic
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Parsing filter constraint tests for the SNOMED CT ECL grammar and associated extensions.
 * 
 * @since 2.0
 */
@InjectWith(EclInjectorProvider)
@RunWith(XtextRunner)
@FixMethodOrder(NAME_ASCENDING)
class EclParsingFilterConstraintTest {

	@Inject extension EclTestHelper
	
	@Test
	def void test_filter_default_domain_active_only() {
		'* {{ active = true }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_inactive_only() {
		'* {{ active = false }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_module() {
		'* {{ moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_term_filter() {
		'* {{ term = "Clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_active_and_module() {
		'* {{ active = true, moduleId = 900000000000207008 }}'.assertNoErrors;
		'* {{ active = true AND moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_active_or_module() {
		'* {{ active = true OR moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_active_numeric_status() {
		'* {{ active = 0 OR active = 1 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_default_domain_typeId() {
		'* {{ typeId = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_concept_domain_active_invalid_value() {
		'* {{ c active = 200 }}'
			.assertError(EclPackage.Literals.ACTIVE_FILTER, Diagnostic.SYNTAX_DIAGNOSTIC, "Invalid active boolean value");
	}
	
	@Test
	def void test_filter_multiple_query_and() {
		'* {{ C active=false }} AND * {{ term="clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_multiple_query_or() {
		'* {{ C active=false }} OR * {{ term="clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_multiple_query_minus() {
		'* {{ active=false }} MINUS * {{ term="clin find" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_multiple_domain_query_conjuction() {
		'* {{ c active = false }} AND * {{ d active = true }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_multiple_domain_query_disjunction() {
		'* {{ c active = false }} OR * {{ d active = true }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_multiple_domain_query_disjunction_w_parenthesis() {
		'* {{ c active = false }} OR (* {{ d active = true }})'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_preferredIn() {
		'* {{ preferredIn = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_acceptableIn() {
		'* {{ acceptableIn = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_languageRefset() {
		'* {{ languageRefSetId = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_language() {
		'* {{ language = en }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_language_keyword_prefix() {
		/*
		 * The language code is a valid ISO 639-2 code, but is also a prefix of a keyword,
		 * which sometimes confuses the lexical analysis step.
		 */
		'* {{ language = de }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_caseSignificance() {
		'* {{ caseSignificanceId = 900000000000448009 }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_semanticTag_eq() {
		'* {{ semanticTag = "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_semanticTag_ne() {
		'* {{ semanticTag != "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_semanticTag_w_domain() {
		'* {{ d semanticTag = "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_concept_definitionStatus_wo_domain() {
		'* {{ definitionStatus = defined }}'.assertError(EclPackage.eINSTANCE.filterConstraint, EclValidator.DOMAIN_INCONSISTENCY_CODE);
	}

	@Test
	def void test_filter_concept_definitionStatus_eq() {
		'* {{ c definitionStatus = defined }}'.assertNoErrors;
	}

	@Test
	def void test_filter_concept_definitionStatus_ne() {
		'* {{ c definitionStatus != primitive }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_eq() {
		'* {{ effectiveTime = "20020131" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_effectiveTime_unpublished() {
		'* {{ effectiveTime = "" }}'.assertNoErrors;
		'* {{ effectiveTime = "Unpublished" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_gt() {
		'* {{ effectiveTime > "20210731" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_w_domain() {
		'* {{ d effectiveTime = "20210630" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_effectiveTime_invalid_format() {
		'* {{ c effectiveTime = "yesterday" }}'
			.assertError(EclPackage.Literals.EFFECTIVE_TIME_FILTER, EclValidator.EFFECTIVE_TIME_ERROR_CODE);
	}
	
	@Test
	def void test_filter_member_boolean_field() {
		'''
			* {{ M isVaccine = true }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_integer_field() {
		'''
			* {{ M numberOfPacks = #2 }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_decimal_field() {
		'''
			* {{ M strengthNumeratorValue = #2.0 }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_string_field() {
		'''
			* {{ M tradeName = "PANADOL" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_time_field() {
		'''
			* {{ M dateTime = "20020101" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_wo_domain() {
		'''
			* {{ tradeName = "PANADOL" }}
		'''.assertError(EclPackage.eINSTANCE.filterConstraint, EclValidator.DOMAIN_INCONSISTENCY_CODE)
	}
	
}
