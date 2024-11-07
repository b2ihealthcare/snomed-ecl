/*
 * Copyright 2022 B2i Healthcare, https://b2ihealthcare.com
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
	def void test_filter_default_domain_inconsistency() {
		'* {{ active=true OR definitionStatusId = 900000000000207008 }}'.assertError(EclPackage.Literals.FILTER_CONSTRAINT, EclValidator.DOMAIN_INCONSISTENCY_CODE)
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
	def void test_filter_default_domain_id() {
		'* {{ id = 943764881231234117 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_concept_domain_id_not_allowed() {
		'* {{ c id = 900000000000550004 }}'.assertNoErrors;
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
	def void test_filter_description_term_tooshort() {
		'* {{ d term = "C" }}'.assertError(EclPackage.Literals.TYPED_SEARCH_TERM_CLAUSE, EclValidator.TOO_SHORT_TERM_CODE);
	}
	
	@Test
	def void test_filter_description_term_match() {
		'* {{ d term = match:"clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_term_wild() {
		'* {{ d term = wild:"clin*" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_term_regex() {
		'* {{ d term = regex:".+paracetamol.*" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_term_exact() {
		'* {{ d term = exact:"Clinical finding" }}'.assertNoErrors;
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
	def void test_filter_dialect_alias_single() {
		'* {{ dialect = en }}'.assertNoErrors
	}
	
	@Test
	def void test_filter_dialect_alias_multi() {
		'* {{ dialect = (en de) }}'.assertNoErrors
	}
	
	@Test
	def void test_filter_dialect_alias_single_acceptability() {
		'* {{ dialect = en (prefer) }}'.assertNoErrors
	}
	
	@Test
	def void test_filter_dialect_alias_dash() {
		'* {{ dialect = en-gb }}'.assertNoErrors
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
	def void test_filter_description_active_false() {
		'* {{ d active = false }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_active_ne() {
		'* {{ d active != false }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_module_eq() {
		'* {{ d moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_module_ne() {
		'* {{ d moduleId != 900000000000207008 }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_eq() {
		'* {{ d effectiveTime = "20020131" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_effectiveTime_ne() {
		'* {{ d effectiveTime != "20020131" }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_effectiveTime_unpublished() {
		'* {{ d effectiveTime = "" }}'.assertNoErrors;
		'* {{ d effectiveTime = "Unpublished" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_gt() {
		'* {{ d effectiveTime > "20210731" }}'.assertNoErrors;
	}

	@Test
	def void test_filter_description_effectiveTime_invalid_format() {
		'* {{ c effectiveTime = "yesterday" }}'
			.assertError(EclPackage.Literals.EFFECTIVE_TIME_FILTER, EclValidator.EFFECTIVE_TIME_ERROR_CODE);
	}
	
	@Test
	def void test_filter_description_id_equals() {
		'* {{ d id = 943764881231234117 }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_id_set_equals() {
		'* {{ d id = (943764881231234117 899335721231234118) }}'.assertNoErrors;
	}
	
	@Test
	def void test_filter_description_id_ne() {
		'* {{ d id != 943764881231234117 }}'.assertNoErrors;
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
	def void test_filter_member_string_field_default() {
		'''
			* {{ M tradeName = "PANADOL" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_string_field_wild() {
		'''
			* {{ M tradeName = wild:"PAN*" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_string_field_regex() {
		'''
			* {{ M tradeName = regex:"PAN.*" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_string_field_exact() {
		'''
			* {{ M tradeName = exact:"PANADOL" }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_filter_member_string_field_match() {
		'''
			* {{ M tradeName = match:"PAN" }}
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
	
	@Test
	def void test_filter_concept_id_regex() {
		'* {{ C id = regex:"[^ \\t\\r\\n\\f]{4}[0-9]" }}'.assertNoErrors;
	}
	
	
	
}
