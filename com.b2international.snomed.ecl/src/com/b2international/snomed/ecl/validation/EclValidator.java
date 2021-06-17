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
package com.b2international.snomed.ecl.validation;

import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.xtext.validation.Check;

import com.b2international.snomed.ecl.Ecl;
import com.b2international.snomed.ecl.ecl.*;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Sets;

/**
 * This class contains custom validation rules. 
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class EclValidator extends AbstractEclValidator {
	
	private static final String AMBIGUOUS_MESSAGE = "Ambiguous binary operator, use parenthesis to disambiguate the meaning of the expression";
	private static final String AMBIGUOUS_CODE = "binaryoperator.ambiguous";
	
	private static final String CARDINALITY_RANGE_ERROR_MESSAGE = "Cardinality minimum value should not be greater than maximum value";
	private static final String CARDINALITY_RANGE_ERROR_CODE = "cardinality.range.error";
	
	private static final String UNSUPPORTED_TYPE_TOKEN_MESSAGE = "Unsupported type token";
	private static final String UNSUPPORTED_TYPE_TOKEN_CODE = "typetokenfilter.tokens.unsupported";

	private static final String DOMAIN_INCONSISTENCY_MESSAGE = "Inconsistent domains on left and right side of a binary operator, specify the domain (Concept, Description) the disambiguate the meaning of the expression";
	private static final String DOMAIN_INCONSISTENCY_CODE = "binaryoperator.inconsistentdomain";
	
	private static final String LANGUAGE_CODE_NONEXISITING_MESSAGE = "Non-existent ISO-639 language code present in filter";
	private static final String LANGUAGE_CODE_NONEXISITING_CODE = "languagecode.nonexisting";

	// TODO: Make supported description type tokens configurable
	private static final Set<String> SUPPORTED_TYPE_TOKENS = Set.of("syn", "fsn", "def");
	private static final Supplier<Set<String>> SUPPORTED_LANGUAGE_CODES = Suppliers.memoize(() -> toCaseInsensitiveSet(List.of(Locale.getISOLanguages())));
	private static final int SUPPORTED_MIN_TERM_LENGTH = 2;
	
	private static final Set<String> toCaseInsensitiveSet(final Iterable<String> iterable) {
		return FluentIterable.from(iterable)
			.transform(l -> l.toLowerCase(Locale.ENGLISH))
			.toSet();				
	}
	
	@Override
	public boolean isLanguageSpecific() {
		return false;
	}

	@Check
	public void checkCardinality(Cardinality it) {
		if (it.getMax() != Ecl.MAX_CARDINALITY && it.getMin() > it.getMax()) {
			error(CARDINALITY_RANGE_ERROR_MESSAGE, it, EclPackage.Literals.CARDINALITY__MIN, CARDINALITY_RANGE_ERROR_CODE);
		}
	}
	
	@Check
	public void checkAmbiguity(AndExpressionConstraint it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_CODE);
		}
	}

	@Check
	public void checkAmbiguity(OrExpressionConstraint it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_CODE);
		}
	}

	@Check
	public void checkAmbiguity(ExclusionExpressionConstraint it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_CODE);
		}
	}

	@Check
	public void checkAmbiguity(OrRefinement it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.OR_REFINEMENT__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.OR_REFINEMENT__RIGHT, AMBIGUOUS_CODE);
		}
	}

	@Check
	public void checkAmbiguity(AndRefinement it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.AND_REFINEMENT__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.AND_REFINEMENT__RIGHT, AMBIGUOUS_CODE);
		}
	}

	private boolean isAmbiguous(ExpressionConstraint parent, ExpressionConstraint child) {
		return parent.getClass() != child.getClass() && (child instanceof AndExpressionConstraint || child instanceof OrExpressionConstraint || child instanceof ExclusionExpressionConstraint);
	}

	private boolean isAmbiguous(EclRefinement parent, EclRefinement child) {
		return parent.getClass() != child.getClass() && (child instanceof AndRefinement || child instanceof OrRefinement);
	}
	
	@Check
	public void checkTypeTokenFilter(TypeTokenFilter it) {
		final Set<String> tokens = toCaseInsensitiveSet(it.getTokens());
		final Set<String> unsupportedTokens = Sets.difference(tokens, SUPPORTED_TYPE_TOKENS);
		if (!unsupportedTokens.isEmpty()) {
			error(UNSUPPORTED_TYPE_TOKEN_MESSAGE, it, EclPackage.Literals.TYPE_TOKEN_FILTER__TOKENS, UNSUPPORTED_TYPE_TOKEN_CODE);
		}
	}
	
	@Check
	public void checkLanguageFilter(LanguageFilter it) {
		final Set<String> codes = toCaseInsensitiveSet(it.getLanguageCodes());
		final Set<String> unsupportedCodes = Sets.difference(codes, SUPPORTED_LANGUAGE_CODES.get());
		if (!unsupportedCodes.isEmpty()) {
			error(LANGUAGE_CODE_NONEXISITING_MESSAGE, it, EclPackage.Literals.LANGUAGE_FILTER__LANGUAGE_CODES, LANGUAGE_CODE_NONEXISITING_CODE);
		}
	}

	@Check
	public void checkDisjunctionFilter(DisjunctionFilter it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.DISJUNCTION_FILTER__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.DISJUNCTION_FILTER__RIGHT, AMBIGUOUS_CODE);
		}
		
		Domain leftDomain = Ecl.getDomain(it.getLeft());
		Domain rightDomain = Ecl.getDomain(it.getRight());
		
		if (leftDomain != rightDomain) {
			error(DOMAIN_INCONSISTENCY_MESSAGE, it, EclPackage.Literals.DISJUNCTION_FILTER__LEFT, DOMAIN_INCONSISTENCY_CODE);
		}
		
	}
	
	@Check
	public void checkConjunction(ConjunctionFilter it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__LEFT, AMBIGUOUS_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__RIGHT, AMBIGUOUS_CODE);
		}
		
		Domain leftDomain = Ecl.getDomain(it.getLeft());
		Domain rightDomain = Ecl.getDomain(it.getRight());
		
		if (leftDomain != rightDomain) {
			error(DOMAIN_INCONSISTENCY_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__LEFT, DOMAIN_INCONSISTENCY_CODE);
		}
	}
	
	@Check
	public void checkTypedTermFilter(TypedTermFilter it) {
		if (it.getTerm().length() < SUPPORTED_MIN_TERM_LENGTH) {
			error(String.format("At least %d characters are required for typed term filter", SUPPORTED_MIN_TERM_LENGTH), it, EclPackage.Literals.TYPED_TERM_FILTER__TERM);
		}
	}
	
	private boolean isAmbiguous(Filter parent, Filter child) {
		return parent.getClass() != child.getClass() && (child instanceof DisjunctionFilter || child instanceof ConjunctionFilter);
	}
}
