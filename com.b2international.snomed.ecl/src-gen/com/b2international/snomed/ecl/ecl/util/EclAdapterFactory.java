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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.b2international.snomed.ecl.ecl.EclPackage
 * @generated
 */
public class EclAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EclPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = EclPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EclSwitch<Adapter> modelSwitch =
    new EclSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseExpressionConstraint(ExpressionConstraint object)
      {
        return createExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseChildOf(ChildOf object)
      {
        return createChildOfAdapter();
      }
      @Override
      public Adapter caseChildOrSelfOf(ChildOrSelfOf object)
      {
        return createChildOrSelfOfAdapter();
      }
      @Override
      public Adapter caseDescendantOf(DescendantOf object)
      {
        return createDescendantOfAdapter();
      }
      @Override
      public Adapter caseDescendantOrSelfOf(DescendantOrSelfOf object)
      {
        return createDescendantOrSelfOfAdapter();
      }
      @Override
      public Adapter caseParentOf(ParentOf object)
      {
        return createParentOfAdapter();
      }
      @Override
      public Adapter caseParentOrSelfOf(ParentOrSelfOf object)
      {
        return createParentOrSelfOfAdapter();
      }
      @Override
      public Adapter caseAncestorOf(AncestorOf object)
      {
        return createAncestorOfAdapter();
      }
      @Override
      public Adapter caseAncestorOrSelfOf(AncestorOrSelfOf object)
      {
        return createAncestorOrSelfOfAdapter();
      }
      @Override
      public Adapter caseMemberOf(MemberOf object)
      {
        return createMemberOfAdapter();
      }
      @Override
      public Adapter caseEclConceptReference(EclConceptReference object)
      {
        return createEclConceptReferenceAdapter();
      }
      @Override
      public Adapter caseEclConceptReferenceSet(EclConceptReferenceSet object)
      {
        return createEclConceptReferenceSetAdapter();
      }
      @Override
      public Adapter caseAny(Any object)
      {
        return createAnyAdapter();
      }
      @Override
      public Adapter caseEclRefinement(EclRefinement object)
      {
        return createEclRefinementAdapter();
      }
      @Override
      public Adapter caseNestedRefinement(NestedRefinement object)
      {
        return createNestedRefinementAdapter();
      }
      @Override
      public Adapter caseEclAttributeGroup(EclAttributeGroup object)
      {
        return createEclAttributeGroupAdapter();
      }
      @Override
      public Adapter caseAttributeConstraint(AttributeConstraint object)
      {
        return createAttributeConstraintAdapter();
      }
      @Override
      public Adapter caseCardinality(Cardinality object)
      {
        return createCardinalityAdapter();
      }
      @Override
      public Adapter caseComparison(Comparison object)
      {
        return createComparisonAdapter();
      }
      @Override
      public Adapter caseAttributeComparison(AttributeComparison object)
      {
        return createAttributeComparisonAdapter();
      }
      @Override
      public Adapter caseDataTypeComparison(DataTypeComparison object)
      {
        return createDataTypeComparisonAdapter();
      }
      @Override
      public Adapter caseBooleanValueComparison(BooleanValueComparison object)
      {
        return createBooleanValueComparisonAdapter();
      }
      @Override
      public Adapter caseStringValueComparison(StringValueComparison object)
      {
        return createStringValueComparisonAdapter();
      }
      @Override
      public Adapter caseIntegerValueComparison(IntegerValueComparison object)
      {
        return createIntegerValueComparisonAdapter();
      }
      @Override
      public Adapter caseDecimalValueComparison(DecimalValueComparison object)
      {
        return createDecimalValueComparisonAdapter();
      }
      @Override
      public Adapter caseNestedExpression(NestedExpression object)
      {
        return createNestedExpressionAdapter();
      }
      @Override
      public Adapter caseFilterConstraint(FilterConstraint object)
      {
        return createFilterConstraintAdapter();
      }
      @Override
      public Adapter caseFilter(Filter object)
      {
        return createFilterAdapter();
      }
      @Override
      public Adapter caseNestedFilter(NestedFilter object)
      {
        return createNestedFilterAdapter();
      }
      @Override
      public Adapter casePropertyFilter(PropertyFilter object)
      {
        return createPropertyFilterAdapter();
      }
      @Override
      public Adapter caseMemberFieldFilter(MemberFieldFilter object)
      {
        return createMemberFieldFilterAdapter();
      }
      @Override
      public Adapter caseTermFilter(TermFilter object)
      {
        return createTermFilterAdapter();
      }
      @Override
      public Adapter caseTypedSearchTerm(TypedSearchTerm object)
      {
        return createTypedSearchTermAdapter();
      }
      @Override
      public Adapter caseTypedSearchTermSet(TypedSearchTermSet object)
      {
        return createTypedSearchTermSetAdapter();
      }
      @Override
      public Adapter caseTypedSearchTermClause(TypedSearchTermClause object)
      {
        return createTypedSearchTermClauseAdapter();
      }
      @Override
      public Adapter caseLanguageFilter(LanguageFilter object)
      {
        return createLanguageFilterAdapter();
      }
      @Override
      public Adapter caseTypeFilter(TypeFilter object)
      {
        return createTypeFilterAdapter();
      }
      @Override
      public Adapter caseTypeIdFilter(TypeIdFilter object)
      {
        return createTypeIdFilterAdapter();
      }
      @Override
      public Adapter caseTypeTokenFilter(TypeTokenFilter object)
      {
        return createTypeTokenFilterAdapter();
      }
      @Override
      public Adapter caseDialectFilter(DialectFilter object)
      {
        return createDialectFilterAdapter();
      }
      @Override
      public Adapter caseDialectIdFilter(DialectIdFilter object)
      {
        return createDialectIdFilterAdapter();
      }
      @Override
      public Adapter caseDialectAliasFilter(DialectAliasFilter object)
      {
        return createDialectAliasFilterAdapter();
      }
      @Override
      public Adapter caseDialect(Dialect object)
      {
        return createDialectAdapter();
      }
      @Override
      public Adapter caseDialectAlias(DialectAlias object)
      {
        return createDialectAliasAdapter();
      }
      @Override
      public Adapter caseAcceptability(Acceptability object)
      {
        return createAcceptabilityAdapter();
      }
      @Override
      public Adapter caseAcceptabilityIdSet(AcceptabilityIdSet object)
      {
        return createAcceptabilityIdSetAdapter();
      }
      @Override
      public Adapter caseAcceptabilityTokenSet(AcceptabilityTokenSet object)
      {
        return createAcceptabilityTokenSetAdapter();
      }
      @Override
      public Adapter caseDefinitionStatusFilter(DefinitionStatusFilter object)
      {
        return createDefinitionStatusFilterAdapter();
      }
      @Override
      public Adapter caseDefinitionStatusIdFilter(DefinitionStatusIdFilter object)
      {
        return createDefinitionStatusIdFilterAdapter();
      }
      @Override
      public Adapter caseDefinitionStatusTokenFilter(DefinitionStatusTokenFilter object)
      {
        return createDefinitionStatusTokenFilterAdapter();
      }
      @Override
      public Adapter caseModuleFilter(ModuleFilter object)
      {
        return createModuleFilterAdapter();
      }
      @Override
      public Adapter caseEffectiveTimeFilter(EffectiveTimeFilter object)
      {
        return createEffectiveTimeFilterAdapter();
      }
      @Override
      public Adapter caseActiveFilter(ActiveFilter object)
      {
        return createActiveFilterAdapter();
      }
      @Override
      public Adapter caseSemanticTagFilter(SemanticTagFilter object)
      {
        return createSemanticTagFilterAdapter();
      }
      @Override
      public Adapter casePreferredInFilter(PreferredInFilter object)
      {
        return createPreferredInFilterAdapter();
      }
      @Override
      public Adapter caseAcceptableInFilter(AcceptableInFilter object)
      {
        return createAcceptableInFilterAdapter();
      }
      @Override
      public Adapter caseLanguageRefSetFilter(LanguageRefSetFilter object)
      {
        return createLanguageRefSetFilterAdapter();
      }
      @Override
      public Adapter caseCaseSignificanceFilter(CaseSignificanceFilter object)
      {
        return createCaseSignificanceFilterAdapter();
      }
      @Override
      public Adapter caseFilterValue(FilterValue object)
      {
        return createFilterValueAdapter();
      }
      @Override
      public Adapter caseSupplement(Supplement object)
      {
        return createSupplementAdapter();
      }
      @Override
      public Adapter caseHistorySupplement(HistorySupplement object)
      {
        return createHistorySupplementAdapter();
      }
      @Override
      public Adapter caseOrExpressionConstraint(OrExpressionConstraint object)
      {
        return createOrExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseAndExpressionConstraint(AndExpressionConstraint object)
      {
        return createAndExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseExclusionExpressionConstraint(ExclusionExpressionConstraint object)
      {
        return createExclusionExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseRefinedExpressionConstraint(RefinedExpressionConstraint object)
      {
        return createRefinedExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseDottedExpressionConstraint(DottedExpressionConstraint object)
      {
        return createDottedExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseFilteredExpressionConstraint(FilteredExpressionConstraint object)
      {
        return createFilteredExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseSupplementExpressionConstraint(SupplementExpressionConstraint object)
      {
        return createSupplementExpressionConstraintAdapter();
      }
      @Override
      public Adapter caseOrRefinement(OrRefinement object)
      {
        return createOrRefinementAdapter();
      }
      @Override
      public Adapter caseAndRefinement(AndRefinement object)
      {
        return createAndRefinementAdapter();
      }
      @Override
      public Adapter caseDisjunctionFilter(DisjunctionFilter object)
      {
        return createDisjunctionFilterAdapter();
      }
      @Override
      public Adapter caseConjunctionFilter(ConjunctionFilter object)
      {
        return createConjunctionFilterAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ExpressionConstraint <em>Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ExpressionConstraint
   * @generated
   */
  public Adapter createExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ChildOf <em>Child Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ChildOf
   * @generated
   */
  public Adapter createChildOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ChildOrSelfOf <em>Child Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ChildOrSelfOf
   * @generated
   */
  public Adapter createChildOrSelfOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DescendantOf <em>Descendant Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DescendantOf
   * @generated
   */
  public Adapter createDescendantOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DescendantOrSelfOf <em>Descendant Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DescendantOrSelfOf
   * @generated
   */
  public Adapter createDescendantOrSelfOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ParentOf <em>Parent Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ParentOf
   * @generated
   */
  public Adapter createParentOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ParentOrSelfOf <em>Parent Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ParentOrSelfOf
   * @generated
   */
  public Adapter createParentOrSelfOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AncestorOf <em>Ancestor Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AncestorOf
   * @generated
   */
  public Adapter createAncestorOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AncestorOrSelfOf <em>Ancestor Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AncestorOrSelfOf
   * @generated
   */
  public Adapter createAncestorOrSelfOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.MemberOf <em>Member Of</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.MemberOf
   * @generated
   */
  public Adapter createMemberOfAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.EclConceptReference <em>Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReference
   * @generated
   */
  public Adapter createEclConceptReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.EclConceptReferenceSet <em>Concept Reference Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReferenceSet
   * @generated
   */
  public Adapter createEclConceptReferenceSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Any <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Any
   * @generated
   */
  public Adapter createAnyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.EclRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.EclRefinement
   * @generated
   */
  public Adapter createEclRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.NestedRefinement <em>Nested Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.NestedRefinement
   * @generated
   */
  public Adapter createNestedRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.EclAttributeGroup <em>Attribute Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.EclAttributeGroup
   * @generated
   */
  public Adapter createEclAttributeGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint <em>Attribute Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint
   * @generated
   */
  public Adapter createAttributeConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Cardinality
   * @generated
   */
  public Adapter createCardinalityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Comparison
   * @generated
   */
  public Adapter createComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AttributeComparison <em>Attribute Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AttributeComparison
   * @generated
   */
  public Adapter createAttributeComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DataTypeComparison <em>Data Type Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DataTypeComparison
   * @generated
   */
  public Adapter createDataTypeComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.BooleanValueComparison <em>Boolean Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.BooleanValueComparison
   * @generated
   */
  public Adapter createBooleanValueComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.StringValueComparison <em>String Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.StringValueComparison
   * @generated
   */
  public Adapter createStringValueComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.IntegerValueComparison <em>Integer Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.IntegerValueComparison
   * @generated
   */
  public Adapter createIntegerValueComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DecimalValueComparison <em>Decimal Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DecimalValueComparison
   * @generated
   */
  public Adapter createDecimalValueComparisonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.NestedExpression
   * @generated
   */
  public Adapter createNestedExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.FilterConstraint <em>Filter Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.FilterConstraint
   * @generated
   */
  public Adapter createFilterConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Filter
   * @generated
   */
  public Adapter createFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.NestedFilter
   * @generated
   */
  public Adapter createNestedFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.PropertyFilter <em>Property Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.PropertyFilter
   * @generated
   */
  public Adapter createPropertyFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.MemberFieldFilter <em>Member Field Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.MemberFieldFilter
   * @generated
   */
  public Adapter createMemberFieldFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TermFilter <em>Term Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TermFilter
   * @generated
   */
  public Adapter createTermFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypedSearchTerm <em>Typed Search Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypedSearchTerm
   * @generated
   */
  public Adapter createTypedSearchTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypedSearchTermSet <em>Typed Search Term Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypedSearchTermSet
   * @generated
   */
  public Adapter createTypedSearchTermSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypedSearchTermClause <em>Typed Search Term Clause</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypedSearchTermClause
   * @generated
   */
  public Adapter createTypedSearchTermClauseAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.LanguageFilter <em>Language Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.LanguageFilter
   * @generated
   */
  public Adapter createLanguageFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypeFilter <em>Type Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypeFilter
   * @generated
   */
  public Adapter createTypeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypeIdFilter <em>Type Id Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypeIdFilter
   * @generated
   */
  public Adapter createTypeIdFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.TypeTokenFilter <em>Type Token Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.TypeTokenFilter
   * @generated
   */
  public Adapter createTypeTokenFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DialectFilter <em>Dialect Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DialectFilter
   * @generated
   */
  public Adapter createDialectFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DialectIdFilter <em>Dialect Id Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DialectIdFilter
   * @generated
   */
  public Adapter createDialectIdFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DialectAliasFilter <em>Dialect Alias Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DialectAliasFilter
   * @generated
   */
  public Adapter createDialectAliasFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Dialect <em>Dialect</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Dialect
   * @generated
   */
  public Adapter createDialectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DialectAlias <em>Dialect Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DialectAlias
   * @generated
   */
  public Adapter createDialectAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Acceptability <em>Acceptability</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Acceptability
   * @generated
   */
  public Adapter createAcceptabilityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AcceptabilityIdSet <em>Acceptability Id Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityIdSet
   * @generated
   */
  public Adapter createAcceptabilityIdSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet <em>Acceptability Token Set</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet
   * @generated
   */
  public Adapter createAcceptabilityTokenSetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DefinitionStatusFilter <em>Definition Status Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DefinitionStatusFilter
   * @generated
   */
  public Adapter createDefinitionStatusFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter <em>Definition Status Id Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter
   * @generated
   */
  public Adapter createDefinitionStatusIdFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DefinitionStatusTokenFilter <em>Definition Status Token Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DefinitionStatusTokenFilter
   * @generated
   */
  public Adapter createDefinitionStatusTokenFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ModuleFilter <em>Module Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ModuleFilter
   * @generated
   */
  public Adapter createModuleFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.EffectiveTimeFilter <em>Effective Time Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.EffectiveTimeFilter
   * @generated
   */
  public Adapter createEffectiveTimeFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ActiveFilter <em>Active Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ActiveFilter
   * @generated
   */
  public Adapter createActiveFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.SemanticTagFilter <em>Semantic Tag Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.SemanticTagFilter
   * @generated
   */
  public Adapter createSemanticTagFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.PreferredInFilter <em>Preferred In Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.PreferredInFilter
   * @generated
   */
  public Adapter createPreferredInFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AcceptableInFilter <em>Acceptable In Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AcceptableInFilter
   * @generated
   */
  public Adapter createAcceptableInFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.LanguageRefSetFilter <em>Language Ref Set Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.LanguageRefSetFilter
   * @generated
   */
  public Adapter createLanguageRefSetFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.CaseSignificanceFilter <em>Case Significance Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.CaseSignificanceFilter
   * @generated
   */
  public Adapter createCaseSignificanceFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.FilterValue <em>Filter Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.FilterValue
   * @generated
   */
  public Adapter createFilterValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.Supplement <em>Supplement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.Supplement
   * @generated
   */
  public Adapter createSupplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.HistorySupplement <em>History Supplement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.HistorySupplement
   * @generated
   */
  public Adapter createHistorySupplementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.OrExpressionConstraint <em>Or Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.OrExpressionConstraint
   * @generated
   */
  public Adapter createOrExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AndExpressionConstraint <em>And Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AndExpressionConstraint
   * @generated
   */
  public Adapter createAndExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint <em>Exclusion Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint
   * @generated
   */
  public Adapter createExclusionExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint <em>Refined Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint
   * @generated
   */
  public Adapter createRefinedExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint <em>Dotted Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DottedExpressionConstraint
   * @generated
   */
  public Adapter createDottedExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.FilteredExpressionConstraint <em>Filtered Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.FilteredExpressionConstraint
   * @generated
   */
  public Adapter createFilteredExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.SupplementExpressionConstraint <em>Supplement Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.SupplementExpressionConstraint
   * @generated
   */
  public Adapter createSupplementExpressionConstraintAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.OrRefinement <em>Or Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.OrRefinement
   * @generated
   */
  public Adapter createOrRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.AndRefinement <em>And Refinement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.AndRefinement
   * @generated
   */
  public Adapter createAndRefinementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.DisjunctionFilter <em>Disjunction Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.DisjunctionFilter
   * @generated
   */
  public Adapter createDisjunctionFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.b2international.snomed.ecl.ecl.ConjunctionFilter <em>Conjunction Filter</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.b2international.snomed.ecl.ecl.ConjunctionFilter
   * @generated
   */
  public Adapter createConjunctionFilterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //EclAdapterFactory
