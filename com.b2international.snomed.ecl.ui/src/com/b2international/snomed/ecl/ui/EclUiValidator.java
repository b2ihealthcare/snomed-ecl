/*
 * Copyright 2021 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ecl.ui;

import org.eclipse.xtext.validation.Check;

import com.b2international.snomed.ecl.ecl.EclConceptReference;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ide.SnomedConceptProvider;
import com.b2international.snomed.ecl.ide.SnomedConceptProvider.Concept;
import com.b2international.snomed.ecl.validation.EclValidator;
import com.google.inject.Inject;

/**
 * @since 6.2
 */
public class EclUiValidator extends EclValidator {
	
	private static final String WARNING_MSG = "Concept with identifier %s is inactive";
	
	@Inject
	private SnomedConceptProvider conceptProvider;
	
	@Check
	public void checking(EclConceptReference reference) {
		String conceptId = reference.getId();
		if (reference == null || conceptId == null) {
			return;
		}

		Concept concept = conceptProvider.getConcept(conceptId);
		if (concept != null && !concept.isActive()) {
			warning(String.format(WARNING_MSG, conceptId), EclPackage.Literals.ECL_CONCEPT_REFERENCE__ID);
		}
	}
	
}