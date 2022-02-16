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
import org.eclipse.emf.ecore.EClass
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper

import static org.junit.Assert.assertNotNull

class EclTestHelper {
	
	@Inject extension ParseHelper<Script>
	@Inject extension ValidationTestHelper
	
	def void assertNoErrors(CharSequence it) throws Exception {
		val script = parse;
		assertNotNull('''Cannot parse expression: «it».''', script);
		script.assertNoErrors;
	}
	
	def void assertError(CharSequence it, EClass target, String issueCode, String...messageParts) throws Exception {
		val script = parse;
		assertNotNull('''Cannot parse expression: «it».''', script);
		script.assertError(target, issueCode, messageParts);
	}
	
}