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

import com.b2international.snomed.ecl.ecl.Script
import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
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
class EclParsingHistorySupplementTest {
	
	@Inject extension ParseHelper<Script>
	@Inject extension EclTestHelper
	
	@Test
	def void test_history_supplement_single_expression_only() {
		'''
			* {{ + HISTORY }} {{  }}
		'''.parse
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
		'''
			* {{ + HISTORY ( ^ 900000000000527005 |SAME AS association reference set| {{ M targetComponentId = << 195967001 |Asthma| }} ) }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_with_pre_filter() {
		'''
			* {{ d moduleId = 900000000000207008 }} {{ c definitionStatusId = 900000000000073002 }} {{ + HISTORY ( ^ 900000000000527005 |SAME AS association reference set| {{ M targetComponentId = << 195967001 |Asthma| }} ) }}
		'''.assertNoErrors
	}
	
	@Test
	def void test_history_supplement_with_post_filter() {
		'''
			(* {{ + HISTORY ( ^ 900000000000527005 |SAME AS association reference set| {{ M targetComponentId = << 195967001 |Asthma| }} ) }}) {{ d moduleId = 900000000000207008 }} {{ c definitionStatusId = 900000000000073002 }}
		'''.assertNoErrors
	}
	
}
