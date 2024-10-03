/*
 * Copyright 2023-2024 B2i Healthcare, https://b2ihealthcare.com
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
import java.io.StringReader
import java.util.stream.Collectors
import java.util.stream.IntStream
import jakarta.inject.Inject
import org.eclipse.emf.ecore.resource.impl.ResourceImpl
import org.eclipse.xtext.parser.IParser
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.validation.CheckMode
import org.eclipse.xtext.validation.IResourceValidator
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runner.RunWith
import com.google.common.base.Stopwatch
import com.b2international.snomed.ecl.validation.EclValidator
import com.b2international.snomed.ecl.validation.ValidationErrorIgnoringMessageAcceptor
import java.util.Set
import java.util.concurrent.TimeUnit
import static org.junit.Assert.fail

@InjectWith(EclInjectorProvider)
@RunWith(XtextRunner)
@FixMethodOrder(NAME_ASCENDING)
class EclValidatorPerformanceTest {
	
	@Inject IResourceValidator validator
	@Inject IParser eclParser
	@Inject EclValidator eclValidator
	
	@Test
	def void ecl() {
		try {
			(eclValidator.messageAcceptor as ValidationErrorIgnoringMessageAcceptor).setIgnoredSyntaxErrorCodes(Set.of(EclValidator.SCTID_ERROR_CODE))
			val largeEcl = IntStream.range(0, 10_000).mapToObj(i | String.valueOf(i)).collect(Collectors.joining(" OR "))
			try (val reader = new StringReader(largeEcl)) {
				val parseResult = eclParser.parse(reader)
				val script = parseResult.getRootASTElement() as Script
				val resource = new ResourceImpl()
				resource.getContents().add(script)
				
				// perform a quick warm up of 5 subsequent validation runs
				IntStream.range(0, 5).forEach(i | {
					validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
				})
				
				// then measure performance
				var w = Stopwatch.createStarted
				validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
				val validationTook = w.elapsed(TimeUnit.MILLISECONDS)
				if (validationTook > 700) { // considering slower CI builds etc, in theory this should complete in around 100ms when the validation is warmed up a bit
					fail("Expected ECL validator to complete within 500 milliseconds in case of a large 10k ID expression. It took " + validationTook + "ms")
				} else {
					System.err.println("Validation completed in " + validationTook + "ms")
				}
			}
		} finally {
			(eclValidator.messageAcceptor as ValidationErrorIgnoringMessageAcceptor).setIgnoredSyntaxErrorCodes(Set.of())			
		}
	}
}