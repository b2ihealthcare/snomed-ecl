/**
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
package com.b2international.snomed.ecl.ecl.util;

import com.b2international.snomed.ecl.ecl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.b2international.snomed.ecl.ecl.EclPackage
 * @generated
 */
public class EclSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EclPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EclPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EclPackage.SCRIPT:
      {
        Script script = (Script)theEObject;
        T result = caseScript(script);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.EXPRESSION_CONSTRAINT:
      {
        ExpressionConstraint expressionConstraint = (ExpressionConstraint)theEObject;
        T result = caseExpressionConstraint(expressionConstraint);
        if (result == null) result = caseFilterValue(expressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.CHILD_OF:
      {
        ChildOf childOf = (ChildOf)theEObject;
        T result = caseChildOf(childOf);
        if (result == null) result = caseExpressionConstraint(childOf);
        if (result == null) result = caseFilterValue(childOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.CHILD_OR_SELF_OF:
      {
        ChildOrSelfOf childOrSelfOf = (ChildOrSelfOf)theEObject;
        T result = caseChildOrSelfOf(childOrSelfOf);
        if (result == null) result = caseExpressionConstraint(childOrSelfOf);
        if (result == null) result = caseFilterValue(childOrSelfOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DESCENDANT_OF:
      {
        DescendantOf descendantOf = (DescendantOf)theEObject;
        T result = caseDescendantOf(descendantOf);
        if (result == null) result = caseExpressionConstraint(descendantOf);
        if (result == null) result = caseFilterValue(descendantOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DESCENDANT_OR_SELF_OF:
      {
        DescendantOrSelfOf descendantOrSelfOf = (DescendantOrSelfOf)theEObject;
        T result = caseDescendantOrSelfOf(descendantOrSelfOf);
        if (result == null) result = caseExpressionConstraint(descendantOrSelfOf);
        if (result == null) result = caseFilterValue(descendantOrSelfOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.PARENT_OF:
      {
        ParentOf parentOf = (ParentOf)theEObject;
        T result = caseParentOf(parentOf);
        if (result == null) result = caseExpressionConstraint(parentOf);
        if (result == null) result = caseFilterValue(parentOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.PARENT_OR_SELF_OF:
      {
        ParentOrSelfOf parentOrSelfOf = (ParentOrSelfOf)theEObject;
        T result = caseParentOrSelfOf(parentOrSelfOf);
        if (result == null) result = caseExpressionConstraint(parentOrSelfOf);
        if (result == null) result = caseFilterValue(parentOrSelfOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ANCESTOR_OF:
      {
        AncestorOf ancestorOf = (AncestorOf)theEObject;
        T result = caseAncestorOf(ancestorOf);
        if (result == null) result = caseExpressionConstraint(ancestorOf);
        if (result == null) result = caseFilterValue(ancestorOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ANCESTOR_OR_SELF_OF:
      {
        AncestorOrSelfOf ancestorOrSelfOf = (AncestorOrSelfOf)theEObject;
        T result = caseAncestorOrSelfOf(ancestorOrSelfOf);
        if (result == null) result = caseExpressionConstraint(ancestorOrSelfOf);
        if (result == null) result = caseFilterValue(ancestorOrSelfOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.MEMBER_OF:
      {
        MemberOf memberOf = (MemberOf)theEObject;
        T result = caseMemberOf(memberOf);
        if (result == null) result = caseExpressionConstraint(memberOf);
        if (result == null) result = caseFilterValue(memberOf);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ECL_CONCEPT_REFERENCE:
      {
        EclConceptReference eclConceptReference = (EclConceptReference)theEObject;
        T result = caseEclConceptReference(eclConceptReference);
        if (result == null) result = caseExpressionConstraint(eclConceptReference);
        if (result == null) result = caseFilterValue(eclConceptReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ECL_CONCEPT_REFERENCE_SET:
      {
        EclConceptReferenceSet eclConceptReferenceSet = (EclConceptReferenceSet)theEObject;
        T result = caseEclConceptReferenceSet(eclConceptReferenceSet);
        if (result == null) result = caseFilterValue(eclConceptReferenceSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ANY:
      {
        Any any = (Any)theEObject;
        T result = caseAny(any);
        if (result == null) result = caseExpressionConstraint(any);
        if (result == null) result = caseFilterValue(any);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ECL_REFINEMENT:
      {
        EclRefinement eclRefinement = (EclRefinement)theEObject;
        T result = caseEclRefinement(eclRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.NESTED_REFINEMENT:
      {
        NestedRefinement nestedRefinement = (NestedRefinement)theEObject;
        T result = caseNestedRefinement(nestedRefinement);
        if (result == null) result = caseEclRefinement(nestedRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ECL_ATTRIBUTE_GROUP:
      {
        EclAttributeGroup eclAttributeGroup = (EclAttributeGroup)theEObject;
        T result = caseEclAttributeGroup(eclAttributeGroup);
        if (result == null) result = caseEclRefinement(eclAttributeGroup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ATTRIBUTE_CONSTRAINT:
      {
        AttributeConstraint attributeConstraint = (AttributeConstraint)theEObject;
        T result = caseAttributeConstraint(attributeConstraint);
        if (result == null) result = caseEclRefinement(attributeConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.CARDINALITY:
      {
        Cardinality cardinality = (Cardinality)theEObject;
        T result = caseCardinality(cardinality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ATTRIBUTE_COMPARISON:
      {
        AttributeComparison attributeComparison = (AttributeComparison)theEObject;
        T result = caseAttributeComparison(attributeComparison);
        if (result == null) result = caseComparison(attributeComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DATA_TYPE_COMPARISON:
      {
        DataTypeComparison dataTypeComparison = (DataTypeComparison)theEObject;
        T result = caseDataTypeComparison(dataTypeComparison);
        if (result == null) result = caseComparison(dataTypeComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.BOOLEAN_VALUE_COMPARISON:
      {
        BooleanValueComparison booleanValueComparison = (BooleanValueComparison)theEObject;
        T result = caseBooleanValueComparison(booleanValueComparison);
        if (result == null) result = caseDataTypeComparison(booleanValueComparison);
        if (result == null) result = caseComparison(booleanValueComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.STRING_VALUE_COMPARISON:
      {
        StringValueComparison stringValueComparison = (StringValueComparison)theEObject;
        T result = caseStringValueComparison(stringValueComparison);
        if (result == null) result = caseDataTypeComparison(stringValueComparison);
        if (result == null) result = caseComparison(stringValueComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.INTEGER_VALUE_COMPARISON:
      {
        IntegerValueComparison integerValueComparison = (IntegerValueComparison)theEObject;
        T result = caseIntegerValueComparison(integerValueComparison);
        if (result == null) result = caseDataTypeComparison(integerValueComparison);
        if (result == null) result = caseComparison(integerValueComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DECIMAL_VALUE_COMPARISON:
      {
        DecimalValueComparison decimalValueComparison = (DecimalValueComparison)theEObject;
        T result = caseDecimalValueComparison(decimalValueComparison);
        if (result == null) result = caseDataTypeComparison(decimalValueComparison);
        if (result == null) result = caseComparison(decimalValueComparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.NESTED_EXPRESSION:
      {
        NestedExpression nestedExpression = (NestedExpression)theEObject;
        T result = caseNestedExpression(nestedExpression);
        if (result == null) result = caseExpressionConstraint(nestedExpression);
        if (result == null) result = caseFilterValue(nestedExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.FILTER_CONSTRAINT:
      {
        FilterConstraint filterConstraint = (FilterConstraint)theEObject;
        T result = caseFilterConstraint(filterConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.FILTER:
      {
        Filter filter = (Filter)theEObject;
        T result = caseFilter(filter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.NESTED_FILTER:
      {
        NestedFilter nestedFilter = (NestedFilter)theEObject;
        T result = caseNestedFilter(nestedFilter);
        if (result == null) result = casePropertyFilter(nestedFilter);
        if (result == null) result = caseFilter(nestedFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.PROPERTY_FILTER:
      {
        PropertyFilter propertyFilter = (PropertyFilter)theEObject;
        T result = casePropertyFilter(propertyFilter);
        if (result == null) result = caseFilter(propertyFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.MEMBER_FIELD_FILTER:
      {
        MemberFieldFilter memberFieldFilter = (MemberFieldFilter)theEObject;
        T result = caseMemberFieldFilter(memberFieldFilter);
        if (result == null) result = casePropertyFilter(memberFieldFilter);
        if (result == null) result = caseFilter(memberFieldFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TERM_FILTER:
      {
        TermFilter termFilter = (TermFilter)theEObject;
        T result = caseTermFilter(termFilter);
        if (result == null) result = casePropertyFilter(termFilter);
        if (result == null) result = caseFilter(termFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPED_SEARCH_TERM:
      {
        TypedSearchTerm typedSearchTerm = (TypedSearchTerm)theEObject;
        T result = caseTypedSearchTerm(typedSearchTerm);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPED_SEARCH_TERM_SET:
      {
        TypedSearchTermSet typedSearchTermSet = (TypedSearchTermSet)theEObject;
        T result = caseTypedSearchTermSet(typedSearchTermSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE:
      {
        TypedSearchTermClause typedSearchTermClause = (TypedSearchTermClause)theEObject;
        T result = caseTypedSearchTermClause(typedSearchTermClause);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.LANGUAGE_FILTER:
      {
        LanguageFilter languageFilter = (LanguageFilter)theEObject;
        T result = caseLanguageFilter(languageFilter);
        if (result == null) result = casePropertyFilter(languageFilter);
        if (result == null) result = caseFilter(languageFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPE_FILTER:
      {
        TypeFilter typeFilter = (TypeFilter)theEObject;
        T result = caseTypeFilter(typeFilter);
        if (result == null) result = casePropertyFilter(typeFilter);
        if (result == null) result = caseFilter(typeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPE_ID_FILTER:
      {
        TypeIdFilter typeIdFilter = (TypeIdFilter)theEObject;
        T result = caseTypeIdFilter(typeIdFilter);
        if (result == null) result = caseTypeFilter(typeIdFilter);
        if (result == null) result = casePropertyFilter(typeIdFilter);
        if (result == null) result = caseFilter(typeIdFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.TYPE_TOKEN_FILTER:
      {
        TypeTokenFilter typeTokenFilter = (TypeTokenFilter)theEObject;
        T result = caseTypeTokenFilter(typeTokenFilter);
        if (result == null) result = caseTypeFilter(typeTokenFilter);
        if (result == null) result = casePropertyFilter(typeTokenFilter);
        if (result == null) result = caseFilter(typeTokenFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DIALECT_FILTER:
      {
        DialectFilter dialectFilter = (DialectFilter)theEObject;
        T result = caseDialectFilter(dialectFilter);
        if (result == null) result = casePropertyFilter(dialectFilter);
        if (result == null) result = caseFilter(dialectFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DIALECT_ID_FILTER:
      {
        DialectIdFilter dialectIdFilter = (DialectIdFilter)theEObject;
        T result = caseDialectIdFilter(dialectIdFilter);
        if (result == null) result = caseDialectFilter(dialectIdFilter);
        if (result == null) result = casePropertyFilter(dialectIdFilter);
        if (result == null) result = caseFilter(dialectIdFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DIALECT_ALIAS_FILTER:
      {
        DialectAliasFilter dialectAliasFilter = (DialectAliasFilter)theEObject;
        T result = caseDialectAliasFilter(dialectAliasFilter);
        if (result == null) result = caseDialectFilter(dialectAliasFilter);
        if (result == null) result = casePropertyFilter(dialectAliasFilter);
        if (result == null) result = caseFilter(dialectAliasFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DIALECT:
      {
        Dialect dialect = (Dialect)theEObject;
        T result = caseDialect(dialect);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DIALECT_ALIAS:
      {
        DialectAlias dialectAlias = (DialectAlias)theEObject;
        T result = caseDialectAlias(dialectAlias);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ACCEPTABILITY:
      {
        Acceptability acceptability = (Acceptability)theEObject;
        T result = caseAcceptability(acceptability);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ACCEPTABILITY_ID_SET:
      {
        AcceptabilityIdSet acceptabilityIdSet = (AcceptabilityIdSet)theEObject;
        T result = caseAcceptabilityIdSet(acceptabilityIdSet);
        if (result == null) result = caseAcceptability(acceptabilityIdSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ACCEPTABILITY_TOKEN_SET:
      {
        AcceptabilityTokenSet acceptabilityTokenSet = (AcceptabilityTokenSet)theEObject;
        T result = caseAcceptabilityTokenSet(acceptabilityTokenSet);
        if (result == null) result = caseAcceptability(acceptabilityTokenSet);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DEFINITION_STATUS_FILTER:
      {
        DefinitionStatusFilter definitionStatusFilter = (DefinitionStatusFilter)theEObject;
        T result = caseDefinitionStatusFilter(definitionStatusFilter);
        if (result == null) result = casePropertyFilter(definitionStatusFilter);
        if (result == null) result = caseFilter(definitionStatusFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DEFINITION_STATUS_ID_FILTER:
      {
        DefinitionStatusIdFilter definitionStatusIdFilter = (DefinitionStatusIdFilter)theEObject;
        T result = caseDefinitionStatusIdFilter(definitionStatusIdFilter);
        if (result == null) result = caseDefinitionStatusFilter(definitionStatusIdFilter);
        if (result == null) result = casePropertyFilter(definitionStatusIdFilter);
        if (result == null) result = caseFilter(definitionStatusIdFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER:
      {
        DefinitionStatusTokenFilter definitionStatusTokenFilter = (DefinitionStatusTokenFilter)theEObject;
        T result = caseDefinitionStatusTokenFilter(definitionStatusTokenFilter);
        if (result == null) result = caseDefinitionStatusFilter(definitionStatusTokenFilter);
        if (result == null) result = casePropertyFilter(definitionStatusTokenFilter);
        if (result == null) result = caseFilter(definitionStatusTokenFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.MODULE_FILTER:
      {
        ModuleFilter moduleFilter = (ModuleFilter)theEObject;
        T result = caseModuleFilter(moduleFilter);
        if (result == null) result = casePropertyFilter(moduleFilter);
        if (result == null) result = caseFilter(moduleFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.EFFECTIVE_TIME_FILTER:
      {
        EffectiveTimeFilter effectiveTimeFilter = (EffectiveTimeFilter)theEObject;
        T result = caseEffectiveTimeFilter(effectiveTimeFilter);
        if (result == null) result = casePropertyFilter(effectiveTimeFilter);
        if (result == null) result = caseFilter(effectiveTimeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ACTIVE_FILTER:
      {
        ActiveFilter activeFilter = (ActiveFilter)theEObject;
        T result = caseActiveFilter(activeFilter);
        if (result == null) result = casePropertyFilter(activeFilter);
        if (result == null) result = caseFilter(activeFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.SEMANTIC_TAG_FILTER:
      {
        SemanticTagFilter semanticTagFilter = (SemanticTagFilter)theEObject;
        T result = caseSemanticTagFilter(semanticTagFilter);
        if (result == null) result = casePropertyFilter(semanticTagFilter);
        if (result == null) result = caseFilter(semanticTagFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.PREFERRED_IN_FILTER:
      {
        PreferredInFilter preferredInFilter = (PreferredInFilter)theEObject;
        T result = casePreferredInFilter(preferredInFilter);
        if (result == null) result = casePropertyFilter(preferredInFilter);
        if (result == null) result = caseFilter(preferredInFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.ACCEPTABLE_IN_FILTER:
      {
        AcceptableInFilter acceptableInFilter = (AcceptableInFilter)theEObject;
        T result = caseAcceptableInFilter(acceptableInFilter);
        if (result == null) result = casePropertyFilter(acceptableInFilter);
        if (result == null) result = caseFilter(acceptableInFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.LANGUAGE_REF_SET_FILTER:
      {
        LanguageRefSetFilter languageRefSetFilter = (LanguageRefSetFilter)theEObject;
        T result = caseLanguageRefSetFilter(languageRefSetFilter);
        if (result == null) result = casePropertyFilter(languageRefSetFilter);
        if (result == null) result = caseFilter(languageRefSetFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.CASE_SIGNIFICANCE_FILTER:
      {
        CaseSignificanceFilter caseSignificanceFilter = (CaseSignificanceFilter)theEObject;
        T result = caseCaseSignificanceFilter(caseSignificanceFilter);
        if (result == null) result = casePropertyFilter(caseSignificanceFilter);
        if (result == null) result = caseFilter(caseSignificanceFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.FILTER_VALUE:
      {
        FilterValue filterValue = (FilterValue)theEObject;
        T result = caseFilterValue(filterValue);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.SUPPLEMENT:
      {
        Supplement supplement = (Supplement)theEObject;
        T result = caseSupplement(supplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.HISTORY_SUPPLEMENT:
      {
        HistorySupplement historySupplement = (HistorySupplement)theEObject;
        T result = caseHistorySupplement(historySupplement);
        if (result == null) result = caseSupplement(historySupplement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.OR_EXPRESSION_CONSTRAINT:
      {
        OrExpressionConstraint orExpressionConstraint = (OrExpressionConstraint)theEObject;
        T result = caseOrExpressionConstraint(orExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(orExpressionConstraint);
        if (result == null) result = caseFilterValue(orExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.AND_EXPRESSION_CONSTRAINT:
      {
        AndExpressionConstraint andExpressionConstraint = (AndExpressionConstraint)theEObject;
        T result = caseAndExpressionConstraint(andExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(andExpressionConstraint);
        if (result == null) result = caseFilterValue(andExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT:
      {
        ExclusionExpressionConstraint exclusionExpressionConstraint = (ExclusionExpressionConstraint)theEObject;
        T result = caseExclusionExpressionConstraint(exclusionExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(exclusionExpressionConstraint);
        if (result == null) result = caseFilterValue(exclusionExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.REFINED_EXPRESSION_CONSTRAINT:
      {
        RefinedExpressionConstraint refinedExpressionConstraint = (RefinedExpressionConstraint)theEObject;
        T result = caseRefinedExpressionConstraint(refinedExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(refinedExpressionConstraint);
        if (result == null) result = caseFilterValue(refinedExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DOTTED_EXPRESSION_CONSTRAINT:
      {
        DottedExpressionConstraint dottedExpressionConstraint = (DottedExpressionConstraint)theEObject;
        T result = caseDottedExpressionConstraint(dottedExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(dottedExpressionConstraint);
        if (result == null) result = caseFilterValue(dottedExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.FILTERED_EXPRESSION_CONSTRAINT:
      {
        FilteredExpressionConstraint filteredExpressionConstraint = (FilteredExpressionConstraint)theEObject;
        T result = caseFilteredExpressionConstraint(filteredExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(filteredExpressionConstraint);
        if (result == null) result = caseFilterValue(filteredExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT:
      {
        SupplementExpressionConstraint supplementExpressionConstraint = (SupplementExpressionConstraint)theEObject;
        T result = caseSupplementExpressionConstraint(supplementExpressionConstraint);
        if (result == null) result = caseExpressionConstraint(supplementExpressionConstraint);
        if (result == null) result = caseFilterValue(supplementExpressionConstraint);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.OR_REFINEMENT:
      {
        OrRefinement orRefinement = (OrRefinement)theEObject;
        T result = caseOrRefinement(orRefinement);
        if (result == null) result = caseEclRefinement(orRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.AND_REFINEMENT:
      {
        AndRefinement andRefinement = (AndRefinement)theEObject;
        T result = caseAndRefinement(andRefinement);
        if (result == null) result = caseEclRefinement(andRefinement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.DISJUNCTION_FILTER:
      {
        DisjunctionFilter disjunctionFilter = (DisjunctionFilter)theEObject;
        T result = caseDisjunctionFilter(disjunctionFilter);
        if (result == null) result = caseFilter(disjunctionFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EclPackage.CONJUNCTION_FILTER:
      {
        ConjunctionFilter conjunctionFilter = (ConjunctionFilter)theEObject;
        T result = caseConjunctionFilter(conjunctionFilter);
        if (result == null) result = caseFilter(conjunctionFilter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Script</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScript(Script object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpressionConstraint(ExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Child Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildOf(ChildOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Child Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Child Or Self Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChildOrSelfOf(ChildOrSelfOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descendant Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descendant Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescendantOf(DescendantOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Descendant Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Descendant Or Self Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDescendantOrSelfOf(DescendantOrSelfOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentOf(ParentOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parent Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parent Or Self Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParentOrSelfOf(ParentOrSelfOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ancestor Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ancestor Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAncestorOf(AncestorOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ancestor Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ancestor Or Self Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAncestorOrSelfOf(AncestorOrSelfOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Of</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Of</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberOf(MemberOf object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEclConceptReference(EclConceptReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Concept Reference Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Concept Reference Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEclConceptReferenceSet(EclConceptReferenceSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Any</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Any</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAny(Any object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEclRefinement(EclRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedRefinement(NestedRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEclAttributeGroup(EclAttributeGroup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeConstraint(AttributeConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cardinality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCardinality(Cardinality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Attribute Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Attribute Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAttributeComparison(AttributeComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Data Type Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Data Type Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDataTypeComparison(DataTypeComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Boolean Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Boolean Value Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBooleanValueComparison(BooleanValueComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>String Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>String Value Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStringValueComparison(StringValueComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Integer Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Integer Value Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntegerValueComparison(IntegerValueComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Decimal Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Decimal Value Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDecimalValueComparison(DecimalValueComparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedExpression(NestedExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterConstraint(FilterConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilter(Filter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Nested Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNestedFilter(NestedFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Property Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Property Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePropertyFilter(PropertyFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member Field Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member Field Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMemberFieldFilter(MemberFieldFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Term Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Term Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTermFilter(TermFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Search Term</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Search Term</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedSearchTerm(TypedSearchTerm object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Search Term Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Search Term Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedSearchTermSet(TypedSearchTermSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Typed Search Term Clause</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Typed Search Term Clause</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypedSearchTermClause(TypedSearchTermClause object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageFilter(LanguageFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeFilter(TypeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Id Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Id Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeIdFilter(TypeIdFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Token Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Token Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeTokenFilter(TypeTokenFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialectFilter(DialectFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect Id Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect Id Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialectIdFilter(DialectIdFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect Alias Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect Alias Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialectAliasFilter(DialectAliasFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialect(Dialect object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dialect Alias</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dialect Alias</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDialectAlias(DialectAlias object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acceptability</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acceptability</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptability(Acceptability object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acceptability Id Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acceptability Id Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptabilityIdSet(AcceptabilityIdSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acceptability Token Set</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acceptability Token Set</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptabilityTokenSet(AcceptabilityTokenSet object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Status Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Status Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionStatusFilter(DefinitionStatusFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Status Id Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Status Id Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionStatusIdFilter(DefinitionStatusIdFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Definition Status Token Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Definition Status Token Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDefinitionStatusTokenFilter(DefinitionStatusTokenFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Module Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Module Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModuleFilter(ModuleFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Effective Time Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Effective Time Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEffectiveTimeFilter(EffectiveTimeFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Active Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Active Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseActiveFilter(ActiveFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Semantic Tag Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Semantic Tag Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSemanticTagFilter(SemanticTagFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Preferred In Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Preferred In Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreferredInFilter(PreferredInFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Acceptable In Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Acceptable In Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAcceptableInFilter(AcceptableInFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Language Ref Set Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Language Ref Set Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLanguageRefSetFilter(LanguageRefSetFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Case Significance Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Case Significance Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCaseSignificanceFilter(CaseSignificanceFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filter Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filter Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilterValue(FilterValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplement(Supplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>History Supplement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>History Supplement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHistorySupplement(HistorySupplement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrExpressionConstraint(OrExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndExpressionConstraint(AndExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exclusion Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exclusion Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExclusionExpressionConstraint(ExclusionExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Refined Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Refined Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRefinedExpressionConstraint(RefinedExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Dotted Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Dotted Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDottedExpressionConstraint(DottedExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Filtered Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Filtered Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFilteredExpressionConstraint(FilteredExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Supplement Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Supplement Expression Constraint</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSupplementExpressionConstraint(SupplementExpressionConstraint object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrRefinement(OrRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And Refinement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And Refinement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAndRefinement(AndRefinement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Disjunction Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Disjunction Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDisjunctionFilter(DisjunctionFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conjunction Filter</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conjunction Filter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConjunctionFilter(ConjunctionFilter object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EclSwitch
