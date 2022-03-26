/*
 * Copyright 2021-2022 B2i Healthcare Pte Ltd, http://b2i.sg
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
package com.b2international.snomed.ecl;

import java.util.Collection;

import org.eclipse.xtext.EcoreUtil2;

import com.b2international.snomed.ecl.ecl.*;
import com.google.common.base.Joiner;
import com.google.common.base.Strings;

/**
 * @since 1.3
 */
public final class Ecl {

	public static final String ANY = "*";
	public static final int MAX_CARDINALITY = -1;

	private static final Joiner OR_JOINER = Joiner.on(") OR (");
	private static final Joiner AND_JOINER = Joiner.on(") AND (");

	private Ecl() {}

	public static boolean isAnyExpression(ExpressionConstraint expression) {
		return expression instanceof Any || expression instanceof NestedExpression && ((NestedExpression) expression).getNested() instanceof Any;
	}
	
	public static boolean isEclConceptReference(ExpressionConstraint expression) {
		return expression instanceof EclConceptReference || expression instanceof NestedExpression && ((NestedExpression) expression).getNested() instanceof EclConceptReference;
	}
	
	public static String or(String... eclExpressions) {
		final StringBuilder builder = new StringBuilder();
		builder.append('(');
		OR_JOINER.appendTo(builder, eclExpressions);
		builder.append(')');
		return builder.toString();
	}

	public static String or(Collection<String> eclExpressions) {
		final StringBuilder builder = new StringBuilder();
		builder.append('(');
		OR_JOINER.appendTo(builder, eclExpressions);
		builder.append(')');
		return builder.toString();
	}

	public static String and(String... eclExpressions) {
		final StringBuilder builder = new StringBuilder();
		builder.append('(');
		AND_JOINER.appendTo(builder, eclExpressions);
		builder.append(')');
		return builder.toString();
	}

	public static String and(Collection<String> eclExpressions) {
		final StringBuilder builder = new StringBuilder();
		builder.append('(');
		AND_JOINER.appendTo(builder, eclExpressions);
		builder.append(')');
		return builder.toString();
	}

	public static String exclude(String from, String exclusion) {
		final StringBuilder builder = new StringBuilder();
		builder.append('(');
		builder.append(from);
		builder.append(") MINUS (");
		builder.append(exclusion);
		builder.append(')');
		return builder.toString();
	}

	/**
	 * Returns the domain of the specified filter constraint (new in ECL 1.6).
	 * <p>
	 * By default, filter constraints operate on descriptions, but a specifying a
	 * single-letter qualifier can change filters to work with concepts instead.
	 * Some filters have an implicit domain which must be consistent with the domain
	 * set on the constraint.
	 * 
	 * @param filter
	 * @return
	 */
	public static Domain getDomain(final FilterConstraint filter) {
		return getDomain(filter.getDomain());
	}

	/**
	 * Returns the domain of the specified filter.
	 * <p>
	 * Some filters have an implicit domain, while others allow the user to decide
	 * which component to check for eligibility, eg. the status can be checked both
	 * on the concept to be returned, but also on its descriptions.
	 * 
	 * @param filter
	 * @return
	 */
	public static Domain getDomain(final Filter filter) {
		if (filter instanceof NestedFilter) {
			final NestedFilter nestedFilter = (NestedFilter) filter;
			return getDomain(nestedFilter.getNested());
		} else if (filter instanceof ConjunctionFilter) {
			final ConjunctionFilter conjunctionFilter = (ConjunctionFilter) filter;
			final Domain leftDomain = getDomain(conjunctionFilter.getLeft());
			final Domain rightDomain = getDomain(conjunctionFilter.getRight());
			if (leftDomain != rightDomain) {
				throw new IllegalStateException("Conjunction filter has inconsistent left and right domains.");
			}
			return leftDomain;
		} else if (filter instanceof DisjunctionFilter) {
			final DisjunctionFilter disjunctionFilter = (DisjunctionFilter) filter;
			final Domain leftDomain = getDomain(disjunctionFilter.getLeft());
			final Domain rightDomain = getDomain(disjunctionFilter.getRight());
			if (leftDomain != rightDomain) {
				throw new IllegalStateException("Disjunction filter has inconsistent left and right domains.");
			}
			return leftDomain;
		} else if (filter instanceof AcceptableInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof ActiveFilter) {
			return getDomain(getParentConstraint(filter));
		} else if (filter instanceof CaseSignificanceFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof DefinitionStatusFilter) {
			return Domain.CONCEPT;
		} else if (filter instanceof DialectFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof EffectiveTimeFilter) {
			return getDomain(getParentConstraint(filter));
		} else if (filter instanceof LanguageFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof LanguageRefSetFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof ModuleFilter) {
			return getDomain(getParentConstraint(filter));
		} else if (filter instanceof PreferredInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof SemanticTagFilter) {
			return getDomain(getParentConstraint(filter));
		} else if (filter instanceof TermFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof TypeFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof MemberFieldFilter) {
			return Domain.MEMBER;
		} else {
			throw new UnsupportedOperationException("Not implemented case: " + filter);
		}
	}

	private static FilterConstraint getParentConstraint(final Filter filter) {
		return EcoreUtil2.getContainerOfType(filter, FilterConstraint.class);
	}

	private static Domain getDomain(final String domainAsString) {
		// The default domain is "description" for ECL 1.6
		if (Strings.isNullOrEmpty(domainAsString)) {
			return Domain.DESCRIPTION;
		}

		final Domain domain = Domain.fromString(domainAsString);
		if (domain == null) {
			throw new IllegalStateException("Unexpected domain value '" + domainAsString + "'.");
		}

		return domain;
	}
	
}
