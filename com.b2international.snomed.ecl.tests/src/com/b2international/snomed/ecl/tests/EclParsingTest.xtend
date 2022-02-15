/*
 * Copyright 2011-2022 B2i Healthcare Pte Ltd, http://b2i.sg
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

import com.b2international.snomed.ecl.ecl.Script
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith

import static org.junit.Assert.*
import com.b2international.snomed.ecl.ecl.EclPackage
import com.b2international.snomed.ecl.validation.EclValidator
import org.eclipse.xtext.diagnostics.Diagnostic

/**
 * Parsing test for the SNOMED CT ECL grammar and associated extensions.
 * 
 * @since 1.4
 */
@InjectWith(EclInjectorProvider)
@RunWith(XtextRunner)
@FixMethodOrder(NAME_ASCENDING)
class EclParsingTest {

	@Inject extension ParseHelper<Script>
	@Inject extension ValidationTestHelper

	@Test
	def void test_empty() {
		''.assertNoErrors;
	}
	
	@Test
	def void test_whitespace() {
		' \n \t'.assertNoErrors;
	}
	
	@Test
	def void test_active_only() {
		'* {{ active=true }}'.assertNoErrors;
	}
	
	@Test
	def void test_inactive_only() {
		'* {{ active=false }}'.assertNoErrors;
	}
	
	@Test
	def void test_module() {
		'* {{ moduleId= 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_term_filter() {
		'* {{ term = "Clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_active_and_module() {
		'* {{ active=true, moduleId = 900000000000207008 }}'.assertNoErrors;
		'* {{ active=true AND moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_active_or_module() {
		'* {{ active=true OR moduleId = 900000000000207008 }}'.assertNoErrors;
	}
	
	@Test
	def void test_active_numeric_status() {
		'* {{ active=0 OR active = 1 }}'.assertNoErrors;
	}
	
	@Test
	def void test_active_invalid_value() {
		'* {{ c active = 200 }}'
			.parse
			.assertError(EclPackage.Literals.ACTIVE_FILTER, Diagnostic.SYNTAX_DIAGNOSTIC, "Invalid active boolean value");
	}
	
	@Test
	def void test_type_filter() {
		'* {{ typeId = 900000000000550004 }}'.assertNoErrors;
	}

	@Test
	def void test_multi_domain_query_and() {
		'* {{ active=false }} AND * {{ term="clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_multi_domain_query_or() {
		'* {{ active=false }} OR * {{ term="clin find" }}'.assertNoErrors;
	}
	
	@Test
	def void test_multi_domain_query_minus() {
		'* {{ active=false }} MINUS * {{ term="clin find" }}'.assertNoErrors;
	}

	@Test
	def void test_query_conjuction() {
		'* {{ c active = false }} AND * {{ d active = true }}'.assertNoErrors;
	}
	
	@Test
	def void test_query_disjunction() {
		'* {{ c active = false }} OR * {{ d active = true }}'.assertNoErrors;
	}
	
	@Test
	def void test_query_disjunction_w_parenthesis() {
		'* {{ c active = false }} OR (* {{ d active = true }})'.assertNoErrors;
	}
	
	@Test
	def void test_preferredIn_filter() {
		'* {{ preferredIn = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_acceptableIn_filter() {
		'* {{ acceptableIn = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_languageRefset_filter() {
		'* {{ languageRefSetId = 900000000000550004 }}'.assertNoErrors;
	}
	
	@Test
	def void test_language_filter() {
		'* {{ language = en }}'.assertNoErrors;
	}

	@Test
	def void test_language_filter_keyword_prefix() {
		/*
		 * The language code is a valid ISO 639-2 code, but is also a prefix of a keyword,
		 * which sometimes confuses the lexical analysis step.
		 */
		'* {{ language = de }}'.assertNoErrors;
	}
	
	@Test
	def void test_caseSignificance_filter() {
		'* {{ caseSignificanceId = 900000000000448009 }}'.assertNoErrors;
	}

	@Test
	def void test_semanticTag_filter_eq() {
		'* {{ semanticTag = "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_semanticTag_filter_ne() {
		'* {{ semanticTag != "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_semanticTag_filter_domain() {
		'* {{ d semanticTag = "finding" }}'.assertNoErrors;
	}

	@Test
	def void test_definitionStatus_filter_eq() {
		'* {{ c definitionStatus = defined }}'.assertNoErrors;
	}

	@Test
	def void test_definitionStatus_filter_ne() {
		'* {{ c definitionStatus != primitive }}'.assertNoErrors;
	}

	@Test
	def void test_effectiveTime_filter_eq() {
		'* {{ effectiveTime = "20020131" }}'.assertNoErrors;
	}
	
	@Test
	def void test_effectiveTime_filter_unpublished() {
		'* {{ effectiveTime = "" }}'.assertNoErrors;
		'* {{ effectiveTime = "Unpublished" }}'.assertNoErrors;
	}

	@Test
	def void test_effectiveTime_filter_gt() {
		'* {{ effectiveTime > "20210731" }}'.assertNoErrors;
	}

	@Test
	def void test_effectiveTime_filter_domain() {
		'* {{ d effectiveTime = "20210630" }}'.assertNoErrors;
	}
	
	@Test
	def void test_effectiveTime_filter_invalid_format() {
		'* {{ c effectiveTime = "yesterday" }}'
			.parse
			.assertError(EclPackage.Literals.EFFECTIVE_TIME_FILTER, EclValidator.EFFECTIVE_TIME_ERROR_CODE);
	}
	
	@Test
	def void test_invalid_sctid() {
		'<< 123'
			.parse
			.assertError(EclPackage.Literals.ECL_CONCEPT_REFERENCE, EclValidator.SCTID_ERROR_CODE, "SCTID length must be between 6-18 characters.")
	}
	
	@Test
	def void test_5_4_1_UnaryOperators_1() {
		'''
			< ^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_5_4_2_BinaryOperators_1() {
		'''
			(< 19829001|disorder of lung| OR ^ 700043003 |example problem list concepts reference set|) 
			MINUS ^ 450976002|disorders and diseases reference set for GP/FP reason for encounter|
		'''.assertNoErrors
	}
	
	@Test
	def void test_5_4_2_BinaryOperators_1_lowerCase() {
		'''
			(< 19829001|disorder of lung| or ^ 700043003 |example problem list concepts reference set|) 
			minus ^ 450976002|disorders and diseases reference set for GP/FP reason for encounter|
		'''.assertNoErrors
	}

	@Test
	def void test_5_4_2_BinaryOperators_2() {
		'''
			(< 19829001|disorder of lung| MINUS ^ 700043003 |example problem list concepts reference set|) MINUS
			^ 450976002|disorders and diseases reference set for GP/FP reason for encounter|
		'''.assertNoErrors
	}

	@Test
	def void test_5_4_2_BinaryOperators_3() {
		'''
			< 19829001|disorder of lung| OR ^ 700043003 |example problem list concepts reference set| OR
			^ 450976002|disorders and diseases reference set for GP/FP reason for encounter|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_1_Self_1() {
		'''
			404684003 |clinical finding|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_2_DescendantOf_1() {
		'''
			< 404684003 |clinical finding|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_3_DescendantOrSelfOf_1() {
		'''
			<< 73211009 |diabetes mellitus|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_4_ChildOf_1() {
		'''
			<! 404684003 |clinical finding|
		'''.assertNoErrors
	}
	
	@Test
	def void test_6_1_5_AncestorOf_1() {
		'''
			> 40541001 |acute pulmonary edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_6_AncestorOrSelfOf_1() {
		'''
			>> 40541001|acute pulmonary edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_7_ParentOf_1() {
		'''
			>! 40541001 |acute pulmonary edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_8_MemberOf_1() {
		'''
			^ 700043003 |example problem list concepts reference set |
		'''.assertNoErrors
	}

	@Test
	def void test_6_1_9_Any_1() {
		'''
			*
		'''.assertNoErrors
	}
	
	@Test
	def void test_6_1_10_ChildOrSelfOf_1() {
		'''
			<<! 404684003 |clinical finding|
		'''.assertNoErrors
	}
	
	@Test
	def void test_6_1_11_ParentOrSelfOf_1() {
		'''
			>>! 404684003 |clinical finding|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_1_Attribute_1() {
		'''
			< 19829001 |disorder of lung|: 
			116676008 |associated morphology| = 79654002 |edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_1_Attribute_2() {
		'''
			< 19829001 |disorder of lung|: 
			116676008 |associated morphology| = << 79654002 |edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_1_Attribute_3() {
		'''
			< 404684003 |clinical finding|:
			363698007 |finding site| = << 39057004 |pulmonary valve structure|, 
			116676008 |associated morphology| = << 415582006 |stenosis|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_1_Attribute_4() {
		'''
			* : 246075003 |causative agent| = 387517004 |paracetamol|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_2_AttributeGroup_1() {
		'''
			< 404684003 |clinical finding|:
			{ 363698007 |finding site| = << 39057004 |pulmonary valve structure|,
			  116676008 |associated morphology| = << 415582006 |stenosis|},
			{ 363698007 |finding site| = << 53085002 |right ventricular structure|, 
			  116676008 |associated morphology| = << 56246009 |hypertrophy|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_3_AttributeConstraintOperator_1() {
		'''
			<< 404684003 |clinical finding|:
			<< 47429007 |associated with| = << 267038008 |edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_3_AttributeConstraintOperator_2() {
		'''
			<< 404684003 |clinical finding|:
			>> 246075003 |causative agent| = << 267038008 |edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_4_ConcreteValues_1() {
		'''
			< 27658006 |amoxicillin |:
			411116001 |has dose form| = << 385049006 |capsule|,
			{ 111115 |has basis of strength| = ( 111115 |amoxicillin only|:
			   111115 |strength magnitude| >= #500,
			   111115 |strength unit| = 258684004 |mg|)}
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_4_ConcreteValues_2() {
		'''
			< 27658006 |amoxicillin |:
			411116001 |has dose form| = << 385049006 |capsule|,
			{ 111115 |has basis of strength| = ( 111115 |amoxicillin only|:
			   111115 |strength magnitude| >= #500,   111115 |strength magnitude| <= #800, 
			   111115 |strength unit| = 258684004 |mg|)}
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_4_ConcreteValues_3() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			111115 |trade name| = "PANADOL"
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_5_ReverseAttributes_1() {
		'''
			< 105590001 |substance|: 
			R 127489000 |has active ingredient| = 111115 |TRIPHASIL tablet|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_1() {
		'''
			<  91723000 |Anatomical structure|  AND (<  125605004 |Fracture of bone| . 363698007 |Finding site| )
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_2() {
		'''
			<  125605004 |Fracture of bone| . 363698007 |Finding site|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_3() {
		'''
			<  105590001 |Substance|  AND ( 249999999101 |TRIPHASIL tablet| . 127489000 |Has active ingredient| )
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_4() {
		'''
			249999999101 |TRIPHASIL tablet| . 127489000 |Has active ingredient|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_5() {
		'''
			< 19829001 |Disorder of lung| . < 47429007 |Associated with| . 363698007 |Finding site|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_6_DottedAttributes_6() {
		'''
			((< 19829001 |Disorder of lung|) . < 47429007 |Associated with|) . 363698007 |Finding site|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_7_AnyAttributeNameValue_1() {
		'''
			< 404684003 |clinical finding|: * = 79654002 |edema|
		'''.assertNoErrors
	}

	@Test
	def void test_6_2_7_AnyAttributeNameValue_2() {
		'''
			< 404684003 |clinical finding|: 116676008 |associated morphology| = *
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_1() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..3] 127489000 |has active ingredient| = < 105590001 |substance|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_2() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..1] 127489000 |has active ingredient| = < 105590001 |substance|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_3() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[0..1] 127489000 |has active ingredient| = < 105590001 |substance|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_4() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..*] 127489000 |has active ingredient| = < 105590001 |substance|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_5() {
		'''
			< 404684003 |clinical finding|:
			[1..1] 363698007 |finding site| = < 91723000 |anatomical structure|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_6() {
		'''
			< 404684003 |clinical finding|: 
			[2..*] 363698007 |finding site| = < 91723000 |anatomical structure|
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_1_AttributeCardinality_7() {
		'''
			< 404684003 |clinical finding|: 
			{ [2..*] 363698007 |finding site| = < 91723000 |anatomical structure| }
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_1() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..3] { [1..*] 127489000 |has active ingredient| = < 105590001 |substance|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_2() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[0..1] { 127489000 |has active ingredient| = < 105590001 |substance|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_3() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..*] { 127489000 |has active ingredient| = < 105590001 |substance|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_4() {
		'''
			< 373873005 |pharmaceutical / biologic product|:
			[1..*] { [1..*] 127489000 |has active ingredient| = < 105590001 |substance|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_5() {
		'''
			< 404684003 |clinical finding|:
			[1..1] { 363698007 |finding site| = < 91723000 |anatomical structure|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_2_AttributeGroupCardinality_6() {
		'''
			< 404684003 |clinical finding|: 
			[0..0] { [2..*] 363698007 |finding site| = < 91723000 |anatomical structure|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_3_3_ReverseCardinalities_1() {
		'''
			< 105590001 |Substance| : [3..3] R 127489000 |Has active ingredient| = *
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_1_CompoundExpressionConstraints_1() {
		'''
			< 19829001 |disorder of lung| AND < 301867009 |edema of trunk|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_1_CompoundExpressionConstraints_2() {
		'''
			< 19829001 |disorder of lung| OR < 301867009 |edema of trunk|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_1_CompoundExpressionConstraints_3() {
		'''
			< 19829001|disorder of lung| AND ^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_1_CompoundExpressionConstraints_4() {
		'''
			(< 19829001 |disorder of lung| AND < 301867009 |edema of trunk|) AND 
			^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_1_CompoundExpressionConstraints_5() {
		'''
			(< 19829001 |disorder of lung| AND < 301867009 |edema of trunk|) OR 
			^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}
	
	@Test
	def void test_6_4_1_CompoundExpressionConstraints_5_lowerCase() {
		'''
			(< 19829001 |disorder of lung| and < 301867009 |edema of trunk|) or 
			^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_2_AttributeConjunctionDisjunction_1() {
		'''
			< 404684003 |clinical finding|:
			363698007 |finding site| = << 39057004 |pulmonary valve structure| AND 
			116676008 |associated morphology| = << 415582006 |stenosis|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_2_AttributeConjunctionDisjunction_2() {
		'''
			< 404684003 |clinical finding|: 
			116676008 |associated morphology| = << 55641003 |infarct| OR 
			42752001 |due to| = << 22298006 |myocardial infarction|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_2_AttributeConjunctionDisjunction_3() {
		'''
			< 404684003 |clinical finding|:
			( 363698007 |finding site| = << 39057004 |pulmonary valve structure| AND 
			116676008 |associated morphology| = << 415582006 |stenosis| ) AND
			42752001 |due to| = << 445238008|malignant carcinoid tumor|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_2_AttributeConjunctionDisjunction_4() {
		'''
			< 404684003 |clinical finding| : 
			( 363698007 |finding site| = << 39057004 |pulmonary valve structure| AND 
			116676008 |associated morphology| = << 415582006 |stenosis|) OR
			42752001 |due to| = << 445238008|malignant carcinoid tumor|
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_3_AttributeGroupConjunctionDisjunction_1() {
		'''
			< 404684003 |clinical finding|:
			{ 363698007 |finding site| = << 39057004 |pulmonary valve structure|,
			   116676008 |associated morphology| = << 415582006 |stenosis|} OR
			{ 363698007 |finding site| = << 53085002 |right ventricular structure|,
			   116676008 |associated morphology| = << 56246009 |hypertrophy|}
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_4_AttributeValueConjunctionDisjunction_1() {
		'''
			^ 450990004 |adverse drug reactions reference set for GP/FP health issue|: 246075003 |causative agent| =
			(< 373873005 |pharmaceutical / biologic product| OR < 105590001 |substance|)
		'''.assertNoErrors
	}

	@Test
	def void test_6_4_4_AttributeValueConjunctionDisjunction_2() {
		'''
			< 404684003 |clinical finding|: 116676008 |associated morphology| =
			(<< 56208002|ulcer| AND << 50960005|hemorrhage|)
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_1_ExclusionSimpleExpressions_1() {
		'''
			<< 19829001 |disorder of lung| MINUS << 301867009 |edema of trunk|
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_1_ExclusionSimpleExpressions_2() {
		'''
			<< 19829001 |disorder of lung| MINUS ^ 700043003 |example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_2_ExclusionAttributeValues_1() {
		'''
			< 404684003 |clinical finding|: 116676008 |associated morphology| =
			((<< 56208002 |ulcer| AND << 50960005 |hemorrhage|) MINUS << 26036001 |obstruction|)
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_3_NotEqualToAttributeValue_1() {
		'''
			< 404684003 |clinical finding|: 
			116676008 |associated morphology| !=  << 26036001 |obstruction|
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_3_NotEqualToAttributeValue_2() {
		'''
			< 404684003 |clinical finding|: 
			[0..0] 116676008 |associated morphology| =  << 26036001 |obstruction|
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_3_NotEqualToAttributeValue_3() {
		'''
			< 404684003 |clinical finding|: 
			[0..0] 116676008 |associated morphology| != << 26036001 |obstruction|
		'''.assertNoErrors
	}

	@Test
	def void test_6_5_3_NotEqualToAttributeValue_4() {
		'''
			< 404684003 |clinical finding|: 
			[0..0] 116676008 |associated morphology| !=  << 26036001 |obstruction| and
			[1..*] 116676008 |associated morphology| =   << 26036001 |obstruction|
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_1_NestedConstraintOperators_1() {
		'''
			<< (^ 700043003 |Example problem list concepts reference set| )
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_2_NestedMemberOfFunction_1() {
		'''
			^ (< 450973005 |GP/FP health issue reference set| )  
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_3_NestedCompoundExpressionConstraints_1() {
		'''
			(<   404684003 |Clinical finding|  :
			         363698007 |Finding site|   = <<   39057004 |Pulmonary valve structure|  ) 
			  AND ^  700043003 |Example problem list concepts reference set|
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_3_NestedCompoundExpressionConstraints_2() {
		'''
			(<   404684003 |Clinical finding|  :   363698007 |Finding site|   = <<   39057004 |Pulmonary valve structure|  ) 
			   AND (<   64572001 |Disease|  :   116676008 |Associated morphology|   = <<   415582006 |Stenosis|  )
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_4_NestedDottedAttributes_1() {
		'''
			(<< 17636008 |Specimen collection| : 
			    424226004 |Using device|  = <<  19923001 |Catheter| ) 
			      .  363701004 |Direct substance|
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_5_NestedRefinement_1() {
		'''
			(<<  404684003 |Clinical finding (finding)|  OR <<  272379006 |Event (event)|  ): 
			 255234002 |After|  = <<  71388002 |Procedure (procedure)|
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_6_NestedAttributeName_1() {
		'''
			<<  125605004 |Fracture of bone|  :
			[0..0] ((<<  410662002 |Concept model attribute|  MINUS  363698007 |Finding site| ) MINUS  116676008 |Associated morphology|  ) = *
		'''.assertNoErrors
	}

	@Test
	def void test_6_6_7_NestedAttributeValue_1() {
		'''
			<  404684003 |Clinical finding|  :
			 47429007 |Associated with|  = (<  404684003 |Clinical finding|  : 
			 116676008 |Associated morphology|  = <<  55641003 |Infarct|  )
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_profile_default() {
		'''
			* {{ + HISTORY }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_profile_min() {
		'''
			* {{ + HISTORY-MIN }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_profile_mod() {
		'''
			* {{ + HISTORY-MOD }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_profile_max() {
		'''
			* {{ + HISTORY-MAX }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_custom_expression() {
		// TODO add {{ M targetComponentId = << 195967001 |Asthma| }} as refinement for consistency with the official examples (once we have member filters)
		'''
			* {{ + HISTORY ( ^ 900000000000527005 |SAME AS association reference set| ) }}
		'''.assertNoErrors
	}

	private def void assertNoErrors(CharSequence it) throws Exception {
		val script = parse;
		assertNotNull('''Cannot parse expression: «it».''', script);
		script.assertNoErrors;
	}

}
