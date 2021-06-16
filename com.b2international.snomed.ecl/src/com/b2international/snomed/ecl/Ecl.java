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

/**
 * @since 1.3
 */
public final class Ecl {

	public static final String ANY = "*";
	public static final int MAX_CARDINALITY = -1;
	public static final Joiner OR_JOINER = Joiner.on(" OR ");
	public static final Joiner AND_JOINER = Joiner.on(" AND ");
	
	private Ecl() {}

	public static String or(String...eclExpressions) {
		return OR_JOINER.join(eclExpressions);
	}
	
	public static String or(Collection<String> eclExpressions) {
		return OR_JOINER.join(eclExpressions);
	}
	
	public static String and(String...eclExpressions) {
		return AND_JOINER.join(eclExpressions);
	}
	
	public static String and(Collection<String> eclExpressions) {
		return AND_JOINER.join(eclExpressions);
	}

	public static String exclude(String from, String exclusion) {
		return String.format("(%s) MINUS (%s)", from, exclusion);
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
		} else if (filter instanceof ActiveFilter) {
			// XXX: case-insensitive enum literals are not supported by Xtext, so we convert allowed values here
			return Domain.valueOf(((ActiveFilter) filter).getDomain().toUpperCase(Locale.ENGLISH));
		} else if (filter instanceof ModuleFilter) {
			return Domain.valueOf(((ModuleFilter) filter).getDomain().toUpperCase(Locale.ENGLISH));
		} else if (filter instanceof TypeFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof TermFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof PreferredInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof AcceptableInFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof LanguageRefSetFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof LanguageFilter) {
			return Domain.DESCRIPTION;
		} else if (filter instanceof CaseSignificanceFilter) {
			return Domain.DESCRIPTION;
		} else {
			throw new UnsupportedOperationException("Not implemented case: " + filter);
		}
	}
}
