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
grammar DebugInternalEcl;

// Rule Script
ruleScript:
	ruleExpressionConstraint
	?
;

// Rule ExpressionConstraint
ruleExpressionConstraint:
	ruleOrExpressionConstraint
;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint:
	ruleAndExpressionConstraint
	(
		ruleDISJUNCTION
		ruleAndExpressionConstraint
	)*
;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint:
	ruleExclusionExpressionConstraint
	(
		(
			ruleCONJUNCTION
			    |
			RULE_COMMA
		)
		ruleExclusionExpressionConstraint
	)*
;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint:
	ruleRefinedExpressionConstraint
	(
		ruleEXCLUSION
		ruleRefinedExpressionConstraint
	)?
;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint:
	ruleDottedExpressionConstraint
	(
		RULE_COLON
		ruleEclRefinement
	)?
;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint:
	ruleFilteredExpressionConstraint
	(
		RULE_DOT
		ruleFilteredExpressionConstraint
	)*
;

// Rule FilteredExpressionConstraint
ruleFilteredExpressionConstraint:
	ruleSubExpressionConstraint
	(
		ruleFilterConstraint
	)*
;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint:
	(
		ruleChildOf
		    |
		ruleChildOrSelfOf
		    |
		ruleDescendantOf
		    |
		ruleDescendantOrSelfOf
		    |
		ruleParentOf
		    |
		ruleParentOrSelfOf
		    |
		ruleAncestorOf
		    |
		ruleAncestorOrSelfOf
		    |
		ruleEclFocusConcept
	)
;

// Rule EclFocusConcept
ruleEclFocusConcept:
	(
		ruleMemberOf
		    |
		ruleEclConceptReference
		    |
		ruleAny
		    |
		ruleNestedExpression
	)
;

// Rule ChildOf
ruleChildOf:
	RULE_LT_EM
	ruleEclFocusConcept
;

// Rule ChildOrSelfOf
ruleChildOrSelfOf:
	RULE_DBL_LT_EM
	ruleEclFocusConcept
;

// Rule DescendantOf
ruleDescendantOf:
	RULE_LT
	ruleEclFocusConcept
;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf:
	RULE_DBL_LT
	ruleEclFocusConcept
;

// Rule ParentOf
ruleParentOf:
	RULE_GT_EM
	ruleEclFocusConcept
;

// Rule ParentOrSelfOf
ruleParentOrSelfOf:
	RULE_DBL_GT_EM
	ruleEclFocusConcept
;

// Rule AncestorOf
ruleAncestorOf:
	RULE_GT
	ruleEclFocusConcept
;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf:
	RULE_DBL_GT
	ruleEclFocusConcept
;

// Rule MemberOf
ruleMemberOf:
	RULE_CARET
	(
		ruleEclConceptReference
		    |ruleAny
		    |ruleNestedExpression
	)
;

// Rule EclConceptReference
ruleEclConceptReference:
	ruleSnomedIdentifier
	RULE_TERM_STRING
	?
;

// Rule EclConceptReferenceSet
ruleEclConceptReferenceSet:
	RULE_ROUND_OPEN
	ruleEclConceptReference
	ruleEclConceptReference
	*
	RULE_ROUND_CLOSE
;

// Rule Any
ruleAny:
	RULE_WILDCARD
;

// Rule EclRefinement
ruleEclRefinement:
	ruleOrRefinement
;

// Rule OrRefinement
ruleOrRefinement:
	ruleAndRefinement
	(
		('OR')=>
		ruleDISJUNCTION
		ruleAndRefinement
	)*
;

// Rule AndRefinement
ruleAndRefinement:
	ruleSubRefinement
	(
		('AND' | RULE_COMMA)=>
		(
			ruleCONJUNCTION
			    |
			RULE_COMMA
		)
		ruleSubRefinement
	)*
;

// Rule SubRefinement
ruleSubRefinement:
	(
		ruleAttributeConstraint
		    |
		ruleEclAttributeGroup
		    |
		ruleNestedRefinement
	)
;

// Rule NestedRefinement
ruleNestedRefinement:
	RULE_ROUND_OPEN
	ruleEclRefinement
	RULE_ROUND_CLOSE
;

// Rule EclAttributeGroup
ruleEclAttributeGroup:
	ruleCardinality
	?
	RULE_CURLY_OPEN
	ruleEclAttributeSet
	RULE_CURLY_CLOSE
;

// Rule EclAttributeSet
ruleEclAttributeSet:
	ruleOrAttributeSet
;

// Rule OrAttributeSet
ruleOrAttributeSet:
	ruleAndAttributeSet
	(
		ruleDISJUNCTION
		ruleAndAttributeSet
	)*
;

// Rule AndAttributeSet
ruleAndAttributeSet:
	ruleSubAttributeSet
	(
		(
			ruleCONJUNCTION
			    |
			RULE_COMMA
		)
		ruleSubAttributeSet
	)*
;

// Rule SubAttributeSet
ruleSubAttributeSet:
	(
		ruleAttributeConstraint
		    |
		ruleNestedAttributeSet
	)
;

// Rule NestedAttributeSet
ruleNestedAttributeSet:
	RULE_ROUND_OPEN
	ruleEclAttributeSet
	RULE_ROUND_CLOSE
;

// Rule AttributeConstraint
ruleAttributeConstraint:
	ruleCardinality
	?
	RULE_REVERSED
	?
	ruleFilteredExpressionConstraint
	ruleComparison
	?
;

// Rule Cardinality
ruleCardinality:
	RULE_SQUARE_OPEN
	ruleNonNegativeInteger
	RULE_TO
	ruleMaxValue
	RULE_SQUARE_CLOSE
;

// Rule Comparison
ruleComparison:
	(
		ruleAttributeComparison
		    |
		ruleDataTypeComparison
	)
;

// Rule AttributeComparison
ruleAttributeComparison:
	ruleNON_NUMERIC_OPERATOR
	ruleFilteredExpressionConstraint
;

// Rule DataTypeComparison
ruleDataTypeComparison:
	(
		ruleBooleanValueComparison
		    |
		ruleStringValueComparison
		    |
		ruleIntegerValueComparison
		    |
		ruleDecimalValueComparison
	)
;

// Rule BooleanValueComparison
ruleBooleanValueComparison:
	ruleNON_NUMERIC_OPERATOR
	ruleBoolean
;

// Rule StringValueComparison
ruleStringValueComparison:
	ruleNON_NUMERIC_OPERATOR
	RULE_STRING
;

// Rule IntegerValueComparison
ruleIntegerValueComparison:
	ruleNUMERIC_OPERATOR
	RULE_HASH
	ruleInteger
;

// Rule DecimalValueComparison
ruleDecimalValueComparison:
	ruleNUMERIC_OPERATOR
	RULE_HASH
	ruleDecimal
;

// Rule NestedExpression
ruleNestedExpression:
	RULE_ROUND_OPEN
	ruleExpressionConstraint
	RULE_ROUND_CLOSE
;

// Rule FilterConstraint
ruleFilterConstraint:
	RULE_DOUBLE_CURLY_OPEN
	ruleFilter
	RULE_DOUBLE_CURLY_CLOSE
;

// Rule Filter
ruleFilter:
	ruleDisjunctionFilter
;

// Rule DisjunctionFilter
ruleDisjunctionFilter:
	ruleConjunctionFilter
	(
		ruleDISJUNCTION
		ruleConjunctionFilter
	)*
;

// Rule ConjunctionFilter
ruleConjunctionFilter:
	rulePropertyFilter
	(
		(
			ruleCONJUNCTION
			    |
			RULE_COMMA
		)
		rulePropertyFilter
	)*
;

// Rule NestedFilter
ruleNestedFilter:
	RULE_ROUND_OPEN
	ruleFilter
	RULE_ROUND_CLOSE
;

// Rule PropertyFilter
rulePropertyFilter:
	(
		ruleTermFilter
		    |
		ruleLanguageFilter
		    |
		ruleTypeFilter
		    |
		ruleDialectFilter
		    |
		ruleActiveFilter
		    |
		rulePreferredInFilter
		    |
		ruleAcceptableInFilter
		    |
		ruleLanguageRefSetFilter
		    |
		ruleModuleFilter
		    |
		ruleSemanticTagFilter
		    |
		ruleEffectiveTimeFilter
		    |
		ruleCaseSignificanceFilter
		    |
		ruleNestedFilter
	)
;

// Rule TermFilter
ruleTermFilter:
	ruleTERM_KEYWORD
	(
		ruleTypedTermFilter
		    |
		ruleTypedTermFilterSet
	)
;

// Rule TypedTermFilter
ruleTypedTermFilter:
	ruleNON_NUMERIC_OPERATOR
	(
		ruleLEXICAL_SEARCH_TYPE
		RULE_COLON
	)?
	RULE_STRING
;

// Rule TypedTermFilterSet
ruleTypedTermFilterSet:
	ruleNON_NUMERIC_OPERATOR
	RULE_ROUND_OPEN
	ruleTypedTermFilter
	ruleTypedTermFilter
	*
	RULE_ROUND_CLOSE
;

// Rule LanguageFilter
ruleLanguageFilter:
	ruleLANGUAGE_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	(
		ruleAlphabetical
		    |
		RULE_ROUND_OPEN
		ruleAlphabetical
		ruleAlphabetical
		*
		RULE_ROUND_CLOSE
	)
;

// Rule TypeFilter
ruleTypeFilter:
	(
		ruleTypeIdFilter
		    |
		ruleTypeTokenFilter
	)
;

// Rule TypeIdFilter
ruleTypeIdFilter:
	ruleTYPEID_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	(
		ruleEclConceptReference
		    |ruleEclConceptReferenceSet
	)
;

// Rule TypeTokenFilter
ruleTypeTokenFilter:
	ruleTYPE_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	(
		ruleAlphabetical
		    |
		RULE_ROUND_OPEN
		ruleAlphabetical
		ruleAlphabetical
		*
		RULE_ROUND_CLOSE
	)
;

// Rule DialectFilter
ruleDialectFilter:
	(
		ruleDialectIdFilter
		    |
		ruleDialectAliasFilter
	)
;

// Rule DialectIdFilter
ruleDialectIdFilter:
	ruleDIALECTID_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	(
		ruleDialect
		    |
		RULE_ROUND_OPEN
		ruleDialect
		ruleDialect
		*
		RULE_ROUND_CLOSE
	)
;

// Rule DialectAliasFilter
ruleDialectAliasFilter:
	ruleDIALECT_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	(
		ruleDialectAlias
		    |
		RULE_ROUND_OPEN
		ruleDialectAlias
		ruleDialectAlias
		*
		RULE_ROUND_CLOSE
	)
;

// Rule Dialect
ruleDialect:
	ruleEclConceptReference
	ruleAcceptability
	?
;

// Rule DialectAlias
ruleDialectAlias:
	ruleDialectAliasValue
	ruleAcceptability
	?
;

// Rule Acceptability
ruleAcceptability:
	(
		ruleAcceptabilityIdSet
		    |
		ruleAcceptabilityTokenSet
	)
;

// Rule AcceptabilityIdSet
ruleAcceptabilityIdSet:
	ruleEclConceptReferenceSet
;

// Rule AcceptabilityTokenSet
ruleAcceptabilityTokenSet:
	RULE_ROUND_OPEN
	ruleAlphabetical
	ruleAlphabetical
	*
	RULE_ROUND_CLOSE
;

// Rule ActiveFilter
ruleActiveFilter:
	(
		ruleDOMAIN
		RULE_DOT
	)?
	ruleACTIVE_KEYWORD
	RULE_EQUAL
	ruleBoolean
;

// Rule ModuleFilter
ruleModuleFilter:
	(
		ruleDOMAIN
		RULE_DOT
	)?
	ruleMODULEID_KEYWORD
	RULE_EQUAL
	ruleExpressionConstraint
;

// Rule SemanticTagFilter
ruleSemanticTagFilter:
	(
		ruleDOMAIN
		RULE_DOT
	)?
	ruleSEMANTIC_TAG_KEYWORD
	ruleNON_NUMERIC_OPERATOR
	RULE_STRING
;

// Rule EffectiveTimeFilter
ruleEffectiveTimeFilter:
	(
		ruleDOMAIN
		RULE_DOT
	)?
	ruleEFFECTIVE_TIME_KEYWORD
	ruleNUMERIC_OPERATOR
	RULE_STRING
;

// Rule PreferredInFilter
rulePreferredInFilter:
	rulePREFERRED_IN_KEYWORD
	RULE_EQUAL
	ruleExpressionConstraint
;

// Rule AcceptableInFilter
ruleAcceptableInFilter:
	ruleACCEPTABLE_IN_KEYWORD
	RULE_EQUAL
	ruleExpressionConstraint
;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter:
	ruleLANGUAGE_REFSET_ID_KEYWORD
	RULE_EQUAL
	ruleExpressionConstraint
;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter:
	ruleCASE_SIGNIFICANCE_ID_KEYWORD
	RULE_EQUAL
	ruleExpressionConstraint
;

// Rule SnomedIdentifier
ruleSnomedIdentifier:
	(
		RULE_DIGIT_NONZERO
		    |
		RULE_ZERO
	)+
;

// Rule NonNegativeInteger
ruleNonNegativeInteger:
	(
		RULE_ZERO
		    |
		RULE_DIGIT_NONZERO
		(
			RULE_DIGIT_NONZERO
			    |
			RULE_ZERO
		)*
	)
;

// Rule MaxValue
ruleMaxValue:
	(
		ruleNonNegativeInteger
		    |
		RULE_WILDCARD
	)
;

// Rule Integer
ruleInteger:
	(
		RULE_PLUS
		    |
		RULE_DASH
	)?
	ruleNonNegativeInteger
;

// Rule Decimal
ruleDecimal:
	(
		RULE_PLUS
		    |
		RULE_DASH
	)?
	ruleNonNegativeDecimal
;

// Rule NonNegativeDecimal
ruleNonNegativeDecimal:
	ruleNonNegativeInteger
	RULE_DOT
	(
		RULE_DIGIT_NONZERO
		    |
		RULE_ZERO
	)*
;

// Rule Boolean
ruleBoolean:
	(
		'true'
		    |
		'false'
	)
;

// Rule DialectAliasValue
ruleDialectAliasValue:
	RULE_ALPHA
	(
		RULE_DASH
		    |
		RULE_ALPHA
		    |
		RULE_ZERO
		    |
		RULE_DIGIT_NONZERO
	)*
;

// Rule Alphabetical
ruleAlphabetical:
	RULE_ALPHA+
;

// Rule CONJUNCTION
ruleCONJUNCTION:
	'AND'
;

// Rule DISJUNCTION
ruleDISJUNCTION:
	'OR'
;

// Rule EXCLUSION
ruleEXCLUSION:
	'MINUS'
;

// Rule TERM_KEYWORD
ruleTERM_KEYWORD:
	'term'
;

// Rule LANGUAGE_KEYWORD
ruleLANGUAGE_KEYWORD:
	'language'
;

// Rule TYPEID_KEYWORD
ruleTYPEID_KEYWORD:
	'typeId'
;

// Rule TYPE_KEYWORD
ruleTYPE_KEYWORD:
	'type'
;

// Rule DIALECTID_KEYWORD
ruleDIALECTID_KEYWORD:
	'dialectId'
;

// Rule DIALECT_KEYWORD
ruleDIALECT_KEYWORD:
	'dialect'
;

// Rule ACTIVE_KEYWORD
ruleACTIVE_KEYWORD:
	'active'
;

// Rule MODULEID_KEYWORD
ruleMODULEID_KEYWORD:
	'moduleId'
;

// Rule SEMANTIC_TAG_KEYWORD
ruleSEMANTIC_TAG_KEYWORD:
	'semanticTag'
;

// Rule EFFECTIVE_TIME_KEYWORD
ruleEFFECTIVE_TIME_KEYWORD:
	'effectiveTime'
;

// Rule PREFERRED_IN_KEYWORD
rulePREFERRED_IN_KEYWORD:
	'preferredIn'
;

// Rule ACCEPTABLE_IN_KEYWORD
ruleACCEPTABLE_IN_KEYWORD:
	'acceptableIn'
;

// Rule LANGUAGE_REFSET_ID_KEYWORD
ruleLANGUAGE_REFSET_ID_KEYWORD:
	'languageRefSetId'
;

// Rule CASE_SIGNIFICANCE_ID_KEYWORD
ruleCASE_SIGNIFICANCE_ID_KEYWORD:
	'caseSignificanceId'
;

// Rule LEXICAL_SEARCH_TYPE
ruleLEXICAL_SEARCH_TYPE:
	(
		'match'
		    |
		'wild'
		    |
		'regex'
		    |
		'exact'
	)
;

// Rule DOMAIN
ruleDOMAIN:
	(
		'Concept'
		    |
		'Description'
	)
;

// Rule NON_NUMERIC_OPERATOR
ruleNON_NUMERIC_OPERATOR:
	(
		RULE_EQUAL
		    |
		RULE_NOT_EQUAL
	)
;

// Rule NUMERIC_OPERATOR
ruleNUMERIC_OPERATOR:
	(
		RULE_EQUAL
		    |
		RULE_NOT_EQUAL
		    |
		RULE_GT
		    |
		RULE_LT
		    |
		RULE_GTE
		    |
		RULE_LTE
	)
;

RULE_TERM_STRING : '|' ~('|')* '|';

RULE_REVERSED : 'R';

RULE_TO : '..';

RULE_COMMA : ',';

RULE_ZERO : '0';

RULE_DIGIT_NONZERO : '1'..'9';

RULE_COLON : ':';

RULE_CURLY_OPEN : '{';

RULE_CURLY_CLOSE : '}';

RULE_ROUND_OPEN : '(';

RULE_ROUND_CLOSE : ')';

RULE_SQUARE_OPEN : '[';

RULE_SQUARE_CLOSE : ']';

RULE_PLUS : '+';

RULE_DASH : '-';

RULE_CARET : '^';

RULE_DOT : '.';

RULE_WILDCARD : '*';

RULE_EQUAL : '=';

RULE_NOT_EQUAL : '!=';

RULE_LT : '<';

RULE_GT : '>';

RULE_DBL_LT : '<<';

RULE_DBL_GT : '>>';

RULE_LT_EM : '<!';

RULE_DBL_LT_EM : '<<!';

RULE_GT_EM : '>!';

RULE_DBL_GT_EM : '>>!';

RULE_GTE : '>=';

RULE_LTE : '<=';

RULE_HASH : '#';

RULE_DOUBLE_CURLY_OPEN : '{{';

RULE_DOUBLE_CURLY_CLOSE : '}}';

RULE_ALPHA : ('a'..'z'|'A'..'Z');

RULE_WS : (' '|'\t'|'\n'|'\r') {skip();};

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/' {skip();};

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')? {skip();};

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');
