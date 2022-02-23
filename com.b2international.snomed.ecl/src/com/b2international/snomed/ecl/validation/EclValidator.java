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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
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
	
	private static final String AMBIGUOUS_PRECEDENCE_MESSAGE = "Ambiguous binary operator, use parenthesis to disambiguate the meaning of the expression";
	public static final String AMBIGUOUS_PRECEDENCE_CODE = "binaryoperator.ambiguous.precedence";
	
	private static final String CARDINALITY_RANGE_ERROR_MESSAGE = "Cardinality minimum value should not be greater than maximum value";
	public static final String CARDINALITY_RANGE_ERROR_CODE = "cardinality.range.error";
	
	private static final String UNSUPPORTED_TYPE_TOKEN_MESSAGE = "Unsupported type token";
	public static final String UNSUPPORTED_TYPE_TOKEN_CODE = "typetokenfilter.tokens.unsupported";

	private static final String UNSUPPORTED_ACCEPTABILITY_TOKEN_MESSAGE = "Unsupported acceptability token";
	public static final String UNSUPPORTED_ACCEPTABILITY_TOKEN_CODE = "dialectfilter.tokens.unsupported";
	
	private static final String UNSUPPORTED_DEFINITION_STATUS_TOKEN_MESSAGE = "Unsupported definition status token";
	public static final String UNSUPPORTED_DEFINITION_STATUS_TOKEN_CODE = "definitionstatusfilter.tokens.unsupported";
	
	private static final String DOMAIN_INCONSISTENCY_MESSAGE = "Domain of filter(s) should be consistent with each other and the domain of the filter constraint";
	public static final String DOMAIN_INCONSISTENCY_CODE = "filter.inconsistentdomain";

	private static final String LANGUAGE_CODE_NONEXISITING_MESSAGE = "Non-existent ISO-639 language code present in filter";
	public static final String LANGUAGE_CODE_NONEXISITING_CODE = "languagecode.nonexisting";

	private static final String AMBIGUOUS_TYPE_MESSAGE = "Ambiguous binary operator, use parenthesis to separate constraints from refinements";
	public static final String AMBIGUOUS_TYPE_CODE = "binaryoperator.ambiguous.type";
	
	private static final String CONSTRAINT_REQUIRES_COMPARISON = "A comparison is required for the attribute constraint";
	public static final String CONSTRAINT_REQUIRES_COMPARISON_CODE = "constraint.comparison.missing";

	private static final String EFFECTIVE_TIME_ERROR = "Effective time could not be parsed to the expected yyyyMMdd format";
	public static final String EFFECTIVE_TIME_ERROR_CODE = "effective.time.error";
	
	public static final String SCTID_ERROR_CODE = "sctid.error";
	
	// TODO: Make supported description type tokens configurable
	private static final Set<String> SUPPORTED_TYPE_TOKENS = Set.of("syn", "fsn", "def");
	private static final Set<String> SUPPORTED_DEFINITION_STATUS_TOKENS = Set.of("primitive", "defined");
	private static final Set<String> SUPPORTED_ACCEPTABILITY_TOKENS = Set.of("accept", "prefer");
	
	private static final Supplier<Set<String>> SUPPORTED_LANGUAGE_CODES = Suppliers.memoize(() -> toCaseInsensitiveSet(List.of(Locale.getISOLanguages())));
	private static final int SUPPORTED_MIN_TERM_LENGTH = 2;
	
	// Copied from EffectiveTimes
	private static final String UNPUBLISHED_EFFECTIVE_TIME = "Unpublished";
	private static final Object EMPTY_EFFECTIVE_TIME = "";
	
	// Copied from DateFormats
	private static final String SHORT_DATE_FORMAT = "yyyyMMdd";
	
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
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
		}
	}

	@Check
	public void checkAmbiguity(OrExpressionConstraint it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
		}
	}

	@Check
	public void checkAmbiguity(ExclusionExpressionConstraint it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
		}
	}

	@Check
	public void checkAmbiguity(OrRefinement it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.OR_REFINEMENT__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.OR_REFINEMENT__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
		}
	}

	@Check
	public void checkAmbiguity(AndRefinement it) {
		if (isAmbiguous(it, it.getLeft())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.AND_REFINEMENT__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.AND_REFINEMENT__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
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
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.DISJUNCTION_FILTER__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.DISJUNCTION_FILTER__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
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
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__LEFT, AMBIGUOUS_PRECEDENCE_CODE);
		} else if (isAmbiguous(it, it.getRight())) {
			error(AMBIGUOUS_PRECEDENCE_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__RIGHT, AMBIGUOUS_PRECEDENCE_CODE);
		}
		
		Domain leftDomain = Ecl.getDomain(it.getLeft());
		Domain rightDomain = Ecl.getDomain(it.getRight());
		
		if (leftDomain != rightDomain) {
			error(DOMAIN_INCONSISTENCY_MESSAGE, it, EclPackage.Literals.CONJUNCTION_FILTER__LEFT, DOMAIN_INCONSISTENCY_CODE);
		}
	}
	
	@Check
	public void checkTypedTermFilterClause(TypedSearchTermClause it) {
		if (it.getTerm().length() < SUPPORTED_MIN_TERM_LENGTH) {
			error(String.format("At least %d characters are required for term filter", SUPPORTED_MIN_TERM_LENGTH), it, EclPackage.Literals.TYPED_SEARCH_TERM_CLAUSE__TERM);
		}
	}
	
	@Check
	public void checkAttributeConstraint(AttributeConstraint it) {
		if (it.getComparison() != null) {
			return;
		}
		
		EObject child = it;
		EObject parent = it.eContainer();
		while (parent instanceof NestedRefinement) {
			child = parent;
			parent = parent.eContainer();
		}
		
		if (parent instanceof AndRefinement || parent instanceof OrRefinement) {
			error(AMBIGUOUS_TYPE_MESSAGE, parent, child.eContainingFeature(), AMBIGUOUS_TYPE_CODE);
		} else {
			error(CONSTRAINT_REQUIRES_COMPARISON, it, EclPackage.Literals.ATTRIBUTE_CONSTRAINT__COMPARISON, CONSTRAINT_REQUIRES_COMPARISON_CODE);
		}
	}
	
	private boolean isAmbiguous(Filter parent, Filter child) {
		return parent.getClass() != child.getClass() && (child instanceof DisjunctionFilter || child instanceof ConjunctionFilter);
	}
	
	@Check
	public void checkEffectiveTimeFilter(EffectiveTimeFilter it) {
		final String effectiveTime = it.getEffectiveTime();
		
		// Empty strings for unset effective time is allowed since ECL 1.6
		if (EMPTY_EFFECTIVE_TIME.equals(effectiveTime) || UNPUBLISHED_EFFECTIVE_TIME.equals(effectiveTime)) {
			return;
		}
		
		try {
			LocalDate.parse(effectiveTime, DateTimeFormatter.ofPattern(SHORT_DATE_FORMAT));
		} catch (DateTimeParseException e) {
			error(EFFECTIVE_TIME_ERROR, it, EclPackage.Literals.EFFECTIVE_TIME_FILTER__EFFECTIVE_TIME, EFFECTIVE_TIME_ERROR_CODE);
		}
	}
	
	@Check
	public void checkAcceptabilityTokenSet(AcceptabilityTokenSet it) {
		final Set<String> tokens = toCaseInsensitiveSet(it.getAcceptabilities());
		final Set<String> unsupportedTokens = Sets.difference(tokens, SUPPORTED_ACCEPTABILITY_TOKENS);
		if (!unsupportedTokens.isEmpty()) {
			error(UNSUPPORTED_ACCEPTABILITY_TOKEN_MESSAGE, it, EclPackage.Literals.ACCEPTABILITY_TOKEN_SET__ACCEPTABILITIES, UNSUPPORTED_ACCEPTABILITY_TOKEN_CODE);
		}
	}
	
	@Check
	public void checkDefinitionStatusTokenFilter(DefinitionStatusTokenFilter it) {
		final Set<String> tokens = toCaseInsensitiveSet(it.getDefinitionStatusTokens());
		final Set<String> unsupportedTokens = Sets.difference(tokens, SUPPORTED_DEFINITION_STATUS_TOKENS);
		if (!unsupportedTokens.isEmpty()) {
			error(UNSUPPORTED_DEFINITION_STATUS_TOKEN_MESSAGE, it, EclPackage.Literals.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS, UNSUPPORTED_DEFINITION_STATUS_TOKEN_CODE);
		}
	}

	@Check
	public void checkFilterConstraint(FilterConstraint it) {
		final Domain constraintDomain = Ecl.getDomain(it);
		if (it.getFilter() != null) {
			final Domain filterDomain = Ecl.getDomain(it.getFilter());
			
			if (constraintDomain != filterDomain) {
				error(DOMAIN_INCONSISTENCY_MESSAGE, it, EclPackage.Literals.FILTER_CONSTRAINT__FILTER, DOMAIN_INCONSISTENCY_CODE);
			}
		}
	}

	@Check
	public void checkSctid(EclConceptReference it) {
		try {
			SnomedIdentifiers.validate(it.getId());
		} catch (IllegalArgumentException e) {
			error(e.getMessage(), it, EclPackage.Literals.ECL_CONCEPT_REFERENCE__ID, SCTID_ERROR_CODE);
		}
	}
}
