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
package com.b2international.snomed.ecl;

import java.util.Collection;
import java.util.Locale;

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
	 * Returns the domain of the specified filter.
	 * <p>
	 * Some filters have an implicit domain, while others allow the user to decide
	 * which component to check for eligibility, eg. the status can be checked both
	 * on the concept to be returned, but also on its descriptions.
	 * 
	 * @param filter
	 * @return
	 */
	public static Domain getDomain(final FilterConstraint filter) {
		if (filter instanceof NestedFilter) {
			return getDomain(((NestedFilter) filter).getNested());
		} else if (filter instanceof ConjunctionFilter) {
			final Domain leftDomain = getDomain(((ConjunctionFilter) filter).getLeft());
			final Domain rightDomain = getDomain(((ConjunctionFilter) filter).getRight());
			if (leftDomain != rightDomain) {
				throw new IllegalStateException("Conjunction filter has inconsistent left and right domains.");
			}
			return leftDomain;
		} else if (filter instanceof DisjunctionFilter) {
			final Domain leftDomain = getDomain(((DisjunctionFilter) filter).getLeft());
			final Domain rightDomain = getDomain(((DisjunctionFilter) filter).getRight());
			if (leftDomain != rightDomain) {
				throw new IllegalStateException("Disjunction filter has inconsistent left and right domains.");
			}
			return leftDomain;
		} else if (filter instanceof AcceptableInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof ActiveFilter) {
			// XXX: case-insensitive enum literals are not supported by Xtext, so we convert allowed values here
			return getDomain(((ActiveFilter) filter).getDomain());
		} else if (filter instanceof CaseSignificanceFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof DialectFilter) {
			// Covers both DialectIdFilter and DialectAliasFilter
			return Domain.DESCRIPTION;
		} else if (filter instanceof EffectiveTimeFilter) {
			return getDomain(((EffectiveTimeFilter) filter).getDomain());
		} else if (filter instanceof LanguageFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof LanguageRefSetFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof ModuleFilter) {
			return getDomain(((ModuleFilter) filter).getDomain());
		} else if (filter instanceof PreferredInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof SemanticTagFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof TermFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof TypeFilter) {
			return Domain.DESCRIPTION;
		} else {
			throw new UnsupportedOperationException("Not implemented case: " + filter);
		}
	}

	private static Domain getDomain(final String domainAsString) {
		if (Strings.isNullOrEmpty(domainAsString)) {
			return Domain.CONCEPT;
		}
		
		final Domain domain = Domain.valueOf(domainAsString.toUpperCase(Locale.ENGLISH));
		if (domain == null) {
			return Domain.CONCEPT;
		}
		
		return domain;
	}
}
