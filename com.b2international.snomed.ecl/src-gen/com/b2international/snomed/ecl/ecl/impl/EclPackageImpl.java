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
package com.b2international.snomed.ecl.ecl.impl;

import com.b2international.snomed.ecl.ecl.Acceptability;
import com.b2international.snomed.ecl.ecl.AcceptableInFilter;
import com.b2international.snomed.ecl.ecl.ActiveFilter;
import com.b2international.snomed.ecl.ecl.AncestorOf;
import com.b2international.snomed.ecl.ecl.AncestorOrSelfOf;
import com.b2international.snomed.ecl.ecl.AndExpressionConstraint;
import com.b2international.snomed.ecl.ecl.AndRefinement;
import com.b2international.snomed.ecl.ecl.Any;
import com.b2international.snomed.ecl.ecl.AttributeComparison;
import com.b2international.snomed.ecl.ecl.AttributeConstraint;
import com.b2international.snomed.ecl.ecl.BooleanValueComparison;
import com.b2international.snomed.ecl.ecl.Cardinality;
import com.b2international.snomed.ecl.ecl.CaseSignificanceFilter;
import com.b2international.snomed.ecl.ecl.ChildOf;
import com.b2international.snomed.ecl.ecl.ChildOrSelfOf;
import com.b2international.snomed.ecl.ecl.Comparison;
import com.b2international.snomed.ecl.ecl.ConjunctionFilter;
import com.b2international.snomed.ecl.ecl.DataTypeComparison;
import com.b2international.snomed.ecl.ecl.DecimalValueComparison;
import com.b2international.snomed.ecl.ecl.DefinitionStatusFilter;
import com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter;
import com.b2international.snomed.ecl.ecl.DefinitionStatusTokenFilter;
import com.b2international.snomed.ecl.ecl.DescendantOf;
import com.b2international.snomed.ecl.ecl.DescendantOrSelfOf;
import com.b2international.snomed.ecl.ecl.Dialect;
import com.b2international.snomed.ecl.ecl.DialectAlias;
import com.b2international.snomed.ecl.ecl.DialectAliasFilter;
import com.b2international.snomed.ecl.ecl.DialectFilter;
import com.b2international.snomed.ecl.ecl.DialectIdFilter;
import com.b2international.snomed.ecl.ecl.DisjunctionFilter;
import com.b2international.snomed.ecl.ecl.DottedExpressionConstraint;
import com.b2international.snomed.ecl.ecl.EclAttributeGroup;
import com.b2international.snomed.ecl.ecl.EclConceptReference;
import com.b2international.snomed.ecl.ecl.EclConceptReferenceSet;
import com.b2international.snomed.ecl.ecl.EclFactory;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.EclRefinement;
import com.b2international.snomed.ecl.ecl.EffectiveTimeFilter;
import com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint;
import com.b2international.snomed.ecl.ecl.ExpressionConstraint;
import com.b2international.snomed.ecl.ecl.Filter;
import com.b2international.snomed.ecl.ecl.FilterConstraint;
import com.b2international.snomed.ecl.ecl.FilterValue;
import com.b2international.snomed.ecl.ecl.FilteredExpressionConstraint;
import com.b2international.snomed.ecl.ecl.HistoryProfile;
import com.b2international.snomed.ecl.ecl.HistorySupplement;
import com.b2international.snomed.ecl.ecl.IdFilter;
import com.b2international.snomed.ecl.ecl.IntegerValueComparison;
import com.b2international.snomed.ecl.ecl.LanguageFilter;
import com.b2international.snomed.ecl.ecl.LanguageRefSetFilter;
import com.b2international.snomed.ecl.ecl.MemberFieldFilter;
import com.b2international.snomed.ecl.ecl.MemberOf;
import com.b2international.snomed.ecl.ecl.ModuleFilter;
import com.b2international.snomed.ecl.ecl.NestedExpression;
import com.b2international.snomed.ecl.ecl.NestedFilter;
import com.b2international.snomed.ecl.ecl.NestedRefinement;
import com.b2international.snomed.ecl.ecl.OrExpressionConstraint;
import com.b2international.snomed.ecl.ecl.OrRefinement;
import com.b2international.snomed.ecl.ecl.ParentOf;
import com.b2international.snomed.ecl.ecl.ParentOrSelfOf;
import com.b2international.snomed.ecl.ecl.PreferredInFilter;
import com.b2international.snomed.ecl.ecl.PropertyFilter;
import com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint;
import com.b2international.snomed.ecl.ecl.Script;
import com.b2international.snomed.ecl.ecl.SearchTerm;
import com.b2international.snomed.ecl.ecl.SemanticTagFilter;
import com.b2international.snomed.ecl.ecl.StringValueComparison;
import com.b2international.snomed.ecl.ecl.Supplement;
import com.b2international.snomed.ecl.ecl.SupplementExpressionConstraint;
import com.b2international.snomed.ecl.ecl.TermFilter;
import com.b2international.snomed.ecl.ecl.TypeFilter;
import com.b2international.snomed.ecl.ecl.TypeIdFilter;
import com.b2international.snomed.ecl.ecl.TypeTokenFilter;
import com.b2international.snomed.ecl.ecl.TypedSearchTerm;
import com.b2international.snomed.ecl.ecl.TypedSearchTermClause;
import com.b2international.snomed.ecl.ecl.TypedSearchTermSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclPackageImpl extends EPackageImpl implements EclPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass expressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass childOrSelfOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descendantOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descendantOrSelfOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parentOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parentOrSelfOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ancestorOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ancestorOrSelfOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberOfEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclConceptReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclConceptReferenceSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass anyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eclAttributeGroupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cardinalityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass comparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dataTypeComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass booleanValueComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stringValueComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass integerValueComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass decimalValueComparisonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nestedFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass memberFieldFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass termFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass searchTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedSearchTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedSearchTermSetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typedSearchTermClauseEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeIdFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeTokenFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialectFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialectIdFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialectAliasFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dialectAliasEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acceptabilityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionStatusFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionStatusIdFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass definitionStatusTokenFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass moduleFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass effectiveTimeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass activeFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass semanticTagFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preferredInFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass acceptableInFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass languageRefSetFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass caseSignificanceFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filterValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass historySupplementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass historyProfileEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass exclusionExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass refinedExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dottedExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass supplementExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass filteredExpressionConstraintEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass andRefinementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass disjunctionFilterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conjunctionFilterEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.b2international.snomed.ecl.ecl.EclPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EclPackageImpl()
  {
    super(eNS_URI, EclFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link EclPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EclPackage init()
  {
    if (isInited) return (EclPackage)EPackage.Registry.INSTANCE.getEPackage(EclPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredEclPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    EclPackageImpl theEclPackage = registeredEclPackage instanceof EclPackageImpl ? (EclPackageImpl)registeredEclPackage : new EclPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theEclPackage.createPackageContents();

    // Initialize created meta-data
    theEclPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEclPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EclPackage.eNS_URI, theEclPackage);
    return theEclPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getScript_Constraint()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExpressionConstraint()
  {
    return expressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChildOf()
  {
    return childOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChildOf_Constraint()
  {
    return (EReference)childOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getChildOrSelfOf()
  {
    return childOrSelfOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getChildOrSelfOf_Constraint()
  {
    return (EReference)childOrSelfOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDescendantOf()
  {
    return descendantOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDescendantOf_Constraint()
  {
    return (EReference)descendantOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDescendantOrSelfOf()
  {
    return descendantOrSelfOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDescendantOrSelfOf_Constraint()
  {
    return (EReference)descendantOrSelfOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParentOf()
  {
    return parentOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParentOf_Constraint()
  {
    return (EReference)parentOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getParentOrSelfOf()
  {
    return parentOrSelfOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getParentOrSelfOf_Constraint()
  {
    return (EReference)parentOrSelfOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAncestorOf()
  {
    return ancestorOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAncestorOf_Constraint()
  {
    return (EReference)ancestorOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAncestorOrSelfOf()
  {
    return ancestorOrSelfOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAncestorOrSelfOf_Constraint()
  {
    return (EReference)ancestorOrSelfOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMemberOf()
  {
    return memberOfEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemberOf_RefsetFields()
  {
    return (EAttribute)memberOfEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMemberOf_Constraint()
  {
    return (EReference)memberOfEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEclConceptReference()
  {
    return eclConceptReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEclConceptReference_Id()
  {
    return (EAttribute)eclConceptReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEclConceptReference_Term()
  {
    return (EAttribute)eclConceptReferenceEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEclConceptReferenceSet()
  {
    return eclConceptReferenceSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEclConceptReferenceSet_Concepts()
  {
    return (EReference)eclConceptReferenceSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAny()
  {
    return anyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEclRefinement()
  {
    return eclRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNestedRefinement()
  {
    return nestedRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNestedRefinement_Nested()
  {
    return (EReference)nestedRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEclAttributeGroup()
  {
    return eclAttributeGroupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEclAttributeGroup_Cardinality()
  {
    return (EReference)eclAttributeGroupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getEclAttributeGroup_Refinement()
  {
    return (EReference)eclAttributeGroupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeConstraint()
  {
    return attributeConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeConstraint_Cardinality()
  {
    return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttributeConstraint_Reversed()
  {
    return (EAttribute)attributeConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeConstraint_Attribute()
  {
    return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeConstraint_Comparison()
  {
    return (EReference)attributeConstraintEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCardinality()
  {
    return cardinalityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardinality_Min()
  {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getCardinality_Max()
  {
    return (EAttribute)cardinalityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getComparison()
  {
    return comparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getComparison_Op()
  {
    return (EAttribute)comparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeComparison()
  {
    return attributeComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeComparison_Value()
  {
    return (EReference)attributeComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDataTypeComparison()
  {
    return dataTypeComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBooleanValueComparison()
  {
    return booleanValueComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBooleanValueComparison_Value()
  {
    return (EAttribute)booleanValueComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getStringValueComparison()
  {
    return stringValueComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getStringValueComparison_Value()
  {
    return (EReference)stringValueComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIntegerValueComparison()
  {
    return integerValueComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIntegerValueComparison_Value()
  {
    return (EAttribute)integerValueComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDecimalValueComparison()
  {
    return decimalValueComparisonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDecimalValueComparison_Value()
  {
    return (EAttribute)decimalValueComparisonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNestedExpression()
  {
    return nestedExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNestedExpression_Nested()
  {
    return (EReference)nestedExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterConstraint()
  {
    return filterConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getFilterConstraint_Domain()
  {
    return (EAttribute)filterConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilterConstraint_Filter()
  {
    return (EReference)filterConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilter()
  {
    return filterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNestedFilter()
  {
    return nestedFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNestedFilter_Nested()
  {
    return (EReference)nestedFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPropertyFilter()
  {
    return propertyFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMemberFieldFilter()
  {
    return memberFieldFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMemberFieldFilter_RefsetFieldName()
  {
    return (EAttribute)memberFieldFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getMemberFieldFilter_Comparison()
  {
    return (EReference)memberFieldFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIdFilter()
  {
    return idFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIdFilter_Op()
  {
    return (EAttribute)idFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIdFilter_Ids()
  {
    return (EAttribute)idFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTermFilter()
  {
    return termFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTermFilter_Op()
  {
    return (EAttribute)termFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTermFilter_SearchTerm()
  {
    return (EReference)termFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSearchTerm()
  {
    return searchTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypedSearchTerm()
  {
    return typedSearchTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTypedSearchTerm_Clause()
  {
    return (EReference)typedSearchTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypedSearchTermSet()
  {
    return typedSearchTermSetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTypedSearchTermSet_Clauses()
  {
    return (EReference)typedSearchTermSetEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypedSearchTermClause()
  {
    return typedSearchTermClauseEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTypedSearchTermClause_LexicalSearchType()
  {
    return (EAttribute)typedSearchTermClauseEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTypedSearchTermClause_Term()
  {
    return (EAttribute)typedSearchTermClauseEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLanguageFilter()
  {
    return languageFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageFilter_Op()
  {
    return (EAttribute)languageFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getLanguageFilter_LanguageCodes()
  {
    return (EAttribute)languageFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypeFilter()
  {
    return typeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTypeFilter_Op()
  {
    return (EAttribute)typeFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypeIdFilter()
  {
    return typeIdFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getTypeIdFilter_Type()
  {
    return (EReference)typeIdFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getTypeTokenFilter()
  {
    return typeTokenFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getTypeTokenFilter_Tokens()
  {
    return (EAttribute)typeTokenFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialectFilter()
  {
    return dialectFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDialectFilter_Op()
  {
    return (EAttribute)dialectFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialectIdFilter()
  {
    return dialectIdFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialectIdFilter_Dialects()
  {
    return (EReference)dialectIdFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialectAliasFilter()
  {
    return dialectAliasFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialectAliasFilter_Dialects()
  {
    return (EReference)dialectAliasFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialect()
  {
    return dialectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialect_LanguageRefSetId()
  {
    return (EReference)dialectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialect_Acceptability()
  {
    return (EReference)dialectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDialectAlias()
  {
    return dialectAliasEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDialectAlias_Alias()
  {
    return (EAttribute)dialectAliasEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDialectAlias_Acceptability()
  {
    return (EReference)dialectAliasEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAcceptability()
  {
    return acceptabilityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAcceptability_Acceptabilities()
  {
    return (EReference)acceptabilityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefinitionStatusFilter()
  {
    return definitionStatusFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefinitionStatusFilter_Op()
  {
    return (EAttribute)definitionStatusFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefinitionStatusIdFilter()
  {
    return definitionStatusIdFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDefinitionStatusIdFilter_DefinitionStatus()
  {
    return (EReference)definitionStatusIdFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDefinitionStatusTokenFilter()
  {
    return definitionStatusTokenFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDefinitionStatusTokenFilter_DefinitionStatusTokens()
  {
    return (EAttribute)definitionStatusTokenFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModuleFilter()
  {
    return moduleFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getModuleFilter_Op()
  {
    return (EAttribute)moduleFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModuleFilter_ModuleId()
  {
    return (EReference)moduleFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getEffectiveTimeFilter()
  {
    return effectiveTimeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEffectiveTimeFilter_Op()
  {
    return (EAttribute)effectiveTimeFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getEffectiveTimeFilter_EffectiveTime()
  {
    return (EAttribute)effectiveTimeFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getActiveFilter()
  {
    return activeFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getActiveFilter_Op()
  {
    return (EAttribute)activeFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getActiveFilter_Active()
  {
    return (EAttribute)activeFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSemanticTagFilter()
  {
    return semanticTagFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSemanticTagFilter_Op()
  {
    return (EAttribute)semanticTagFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSemanticTagFilter_SemanticTag()
  {
    return (EAttribute)semanticTagFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPreferredInFilter()
  {
    return preferredInFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getPreferredInFilter_LanguageRefSetId()
  {
    return (EReference)preferredInFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAcceptableInFilter()
  {
    return acceptableInFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAcceptableInFilter_LanguageRefSetId()
  {
    return (EReference)acceptableInFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLanguageRefSetFilter()
  {
    return languageRefSetFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getLanguageRefSetFilter_LanguageRefSetId()
  {
    return (EReference)languageRefSetFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCaseSignificanceFilter()
  {
    return caseSignificanceFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getCaseSignificanceFilter_CaseSignificanceId()
  {
    return (EReference)caseSignificanceFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilterValue()
  {
    return filterValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupplement()
  {
    return supplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHistorySupplement()
  {
    return historySupplementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getHistorySupplement_History()
  {
    return (EReference)historySupplementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHistoryProfile()
  {
    return historyProfileEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHistoryProfile_Profile()
  {
    return (EAttribute)historyProfileEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrExpressionConstraint()
  {
    return orExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpressionConstraint_Left()
  {
    return (EReference)orExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrExpressionConstraint_Right()
  {
    return (EReference)orExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndExpressionConstraint()
  {
    return andExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpressionConstraint_Left()
  {
    return (EReference)andExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndExpressionConstraint_Right()
  {
    return (EReference)andExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getExclusionExpressionConstraint()
  {
    return exclusionExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExclusionExpressionConstraint_Left()
  {
    return (EReference)exclusionExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getExclusionExpressionConstraint_Right()
  {
    return (EReference)exclusionExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRefinedExpressionConstraint()
  {
    return refinedExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRefinedExpressionConstraint_Constraint()
  {
    return (EReference)refinedExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRefinedExpressionConstraint_Refinement()
  {
    return (EReference)refinedExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDottedExpressionConstraint()
  {
    return dottedExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDottedExpressionConstraint_Constraint()
  {
    return (EReference)dottedExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDottedExpressionConstraint_Attribute()
  {
    return (EReference)dottedExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSupplementExpressionConstraint()
  {
    return supplementExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupplementExpressionConstraint_Constraint()
  {
    return (EReference)supplementExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getSupplementExpressionConstraint_Supplement()
  {
    return (EReference)supplementExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getFilteredExpressionConstraint()
  {
    return filteredExpressionConstraintEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilteredExpressionConstraint_Constraint()
  {
    return (EReference)filteredExpressionConstraintEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getFilteredExpressionConstraint_Filter()
  {
    return (EReference)filteredExpressionConstraintEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getOrRefinement()
  {
    return orRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrRefinement_Left()
  {
    return (EReference)orRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getOrRefinement_Right()
  {
    return (EReference)orRefinementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAndRefinement()
  {
    return andRefinementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndRefinement_Left()
  {
    return (EReference)andRefinementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAndRefinement_Right()
  {
    return (EReference)andRefinementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDisjunctionFilter()
  {
    return disjunctionFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDisjunctionFilter_Left()
  {
    return (EReference)disjunctionFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDisjunctionFilter_Right()
  {
    return (EReference)disjunctionFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getConjunctionFilter()
  {
    return conjunctionFilterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConjunctionFilter_Left()
  {
    return (EReference)conjunctionFilterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getConjunctionFilter_Right()
  {
    return (EReference)conjunctionFilterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclFactory getEclFactory()
  {
    return (EclFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__CONSTRAINT);

    expressionConstraintEClass = createEClass(EXPRESSION_CONSTRAINT);

    childOfEClass = createEClass(CHILD_OF);
    createEReference(childOfEClass, CHILD_OF__CONSTRAINT);

    childOrSelfOfEClass = createEClass(CHILD_OR_SELF_OF);
    createEReference(childOrSelfOfEClass, CHILD_OR_SELF_OF__CONSTRAINT);

    descendantOfEClass = createEClass(DESCENDANT_OF);
    createEReference(descendantOfEClass, DESCENDANT_OF__CONSTRAINT);

    descendantOrSelfOfEClass = createEClass(DESCENDANT_OR_SELF_OF);
    createEReference(descendantOrSelfOfEClass, DESCENDANT_OR_SELF_OF__CONSTRAINT);

    parentOfEClass = createEClass(PARENT_OF);
    createEReference(parentOfEClass, PARENT_OF__CONSTRAINT);

    parentOrSelfOfEClass = createEClass(PARENT_OR_SELF_OF);
    createEReference(parentOrSelfOfEClass, PARENT_OR_SELF_OF__CONSTRAINT);

    ancestorOfEClass = createEClass(ANCESTOR_OF);
    createEReference(ancestorOfEClass, ANCESTOR_OF__CONSTRAINT);

    ancestorOrSelfOfEClass = createEClass(ANCESTOR_OR_SELF_OF);
    createEReference(ancestorOrSelfOfEClass, ANCESTOR_OR_SELF_OF__CONSTRAINT);

    memberOfEClass = createEClass(MEMBER_OF);
    createEAttribute(memberOfEClass, MEMBER_OF__REFSET_FIELDS);
    createEReference(memberOfEClass, MEMBER_OF__CONSTRAINT);

    eclConceptReferenceEClass = createEClass(ECL_CONCEPT_REFERENCE);
    createEAttribute(eclConceptReferenceEClass, ECL_CONCEPT_REFERENCE__ID);
    createEAttribute(eclConceptReferenceEClass, ECL_CONCEPT_REFERENCE__TERM);

    eclConceptReferenceSetEClass = createEClass(ECL_CONCEPT_REFERENCE_SET);
    createEReference(eclConceptReferenceSetEClass, ECL_CONCEPT_REFERENCE_SET__CONCEPTS);

    anyEClass = createEClass(ANY);

    eclRefinementEClass = createEClass(ECL_REFINEMENT);

    nestedRefinementEClass = createEClass(NESTED_REFINEMENT);
    createEReference(nestedRefinementEClass, NESTED_REFINEMENT__NESTED);

    eclAttributeGroupEClass = createEClass(ECL_ATTRIBUTE_GROUP);
    createEReference(eclAttributeGroupEClass, ECL_ATTRIBUTE_GROUP__CARDINALITY);
    createEReference(eclAttributeGroupEClass, ECL_ATTRIBUTE_GROUP__REFINEMENT);

    attributeConstraintEClass = createEClass(ATTRIBUTE_CONSTRAINT);
    createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__CARDINALITY);
    createEAttribute(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__REVERSED);
    createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__ATTRIBUTE);
    createEReference(attributeConstraintEClass, ATTRIBUTE_CONSTRAINT__COMPARISON);

    cardinalityEClass = createEClass(CARDINALITY);
    createEAttribute(cardinalityEClass, CARDINALITY__MIN);
    createEAttribute(cardinalityEClass, CARDINALITY__MAX);

    comparisonEClass = createEClass(COMPARISON);
    createEAttribute(comparisonEClass, COMPARISON__OP);

    attributeComparisonEClass = createEClass(ATTRIBUTE_COMPARISON);
    createEReference(attributeComparisonEClass, ATTRIBUTE_COMPARISON__VALUE);

    dataTypeComparisonEClass = createEClass(DATA_TYPE_COMPARISON);

    booleanValueComparisonEClass = createEClass(BOOLEAN_VALUE_COMPARISON);
    createEAttribute(booleanValueComparisonEClass, BOOLEAN_VALUE_COMPARISON__VALUE);

    stringValueComparisonEClass = createEClass(STRING_VALUE_COMPARISON);
    createEReference(stringValueComparisonEClass, STRING_VALUE_COMPARISON__VALUE);

    integerValueComparisonEClass = createEClass(INTEGER_VALUE_COMPARISON);
    createEAttribute(integerValueComparisonEClass, INTEGER_VALUE_COMPARISON__VALUE);

    decimalValueComparisonEClass = createEClass(DECIMAL_VALUE_COMPARISON);
    createEAttribute(decimalValueComparisonEClass, DECIMAL_VALUE_COMPARISON__VALUE);

    nestedExpressionEClass = createEClass(NESTED_EXPRESSION);
    createEReference(nestedExpressionEClass, NESTED_EXPRESSION__NESTED);

    filterConstraintEClass = createEClass(FILTER_CONSTRAINT);
    createEAttribute(filterConstraintEClass, FILTER_CONSTRAINT__DOMAIN);
    createEReference(filterConstraintEClass, FILTER_CONSTRAINT__FILTER);

    filterEClass = createEClass(FILTER);

    nestedFilterEClass = createEClass(NESTED_FILTER);
    createEReference(nestedFilterEClass, NESTED_FILTER__NESTED);

    propertyFilterEClass = createEClass(PROPERTY_FILTER);

    memberFieldFilterEClass = createEClass(MEMBER_FIELD_FILTER);
    createEAttribute(memberFieldFilterEClass, MEMBER_FIELD_FILTER__REFSET_FIELD_NAME);
    createEReference(memberFieldFilterEClass, MEMBER_FIELD_FILTER__COMPARISON);

    idFilterEClass = createEClass(ID_FILTER);
    createEAttribute(idFilterEClass, ID_FILTER__OP);
    createEAttribute(idFilterEClass, ID_FILTER__IDS);

    termFilterEClass = createEClass(TERM_FILTER);
    createEAttribute(termFilterEClass, TERM_FILTER__OP);
    createEReference(termFilterEClass, TERM_FILTER__SEARCH_TERM);

    searchTermEClass = createEClass(SEARCH_TERM);

    typedSearchTermEClass = createEClass(TYPED_SEARCH_TERM);
    createEReference(typedSearchTermEClass, TYPED_SEARCH_TERM__CLAUSE);

    typedSearchTermSetEClass = createEClass(TYPED_SEARCH_TERM_SET);
    createEReference(typedSearchTermSetEClass, TYPED_SEARCH_TERM_SET__CLAUSES);

    typedSearchTermClauseEClass = createEClass(TYPED_SEARCH_TERM_CLAUSE);
    createEAttribute(typedSearchTermClauseEClass, TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE);
    createEAttribute(typedSearchTermClauseEClass, TYPED_SEARCH_TERM_CLAUSE__TERM);

    languageFilterEClass = createEClass(LANGUAGE_FILTER);
    createEAttribute(languageFilterEClass, LANGUAGE_FILTER__OP);
    createEAttribute(languageFilterEClass, LANGUAGE_FILTER__LANGUAGE_CODES);

    typeFilterEClass = createEClass(TYPE_FILTER);
    createEAttribute(typeFilterEClass, TYPE_FILTER__OP);

    typeIdFilterEClass = createEClass(TYPE_ID_FILTER);
    createEReference(typeIdFilterEClass, TYPE_ID_FILTER__TYPE);

    typeTokenFilterEClass = createEClass(TYPE_TOKEN_FILTER);
    createEAttribute(typeTokenFilterEClass, TYPE_TOKEN_FILTER__TOKENS);

    dialectFilterEClass = createEClass(DIALECT_FILTER);
    createEAttribute(dialectFilterEClass, DIALECT_FILTER__OP);

    dialectIdFilterEClass = createEClass(DIALECT_ID_FILTER);
    createEReference(dialectIdFilterEClass, DIALECT_ID_FILTER__DIALECTS);

    dialectAliasFilterEClass = createEClass(DIALECT_ALIAS_FILTER);
    createEReference(dialectAliasFilterEClass, DIALECT_ALIAS_FILTER__DIALECTS);

    dialectEClass = createEClass(DIALECT);
    createEReference(dialectEClass, DIALECT__LANGUAGE_REF_SET_ID);
    createEReference(dialectEClass, DIALECT__ACCEPTABILITY);

    dialectAliasEClass = createEClass(DIALECT_ALIAS);
    createEAttribute(dialectAliasEClass, DIALECT_ALIAS__ALIAS);
    createEReference(dialectAliasEClass, DIALECT_ALIAS__ACCEPTABILITY);

    acceptabilityEClass = createEClass(ACCEPTABILITY);
    createEReference(acceptabilityEClass, ACCEPTABILITY__ACCEPTABILITIES);

    definitionStatusFilterEClass = createEClass(DEFINITION_STATUS_FILTER);
    createEAttribute(definitionStatusFilterEClass, DEFINITION_STATUS_FILTER__OP);

    definitionStatusIdFilterEClass = createEClass(DEFINITION_STATUS_ID_FILTER);
    createEReference(definitionStatusIdFilterEClass, DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS);

    definitionStatusTokenFilterEClass = createEClass(DEFINITION_STATUS_TOKEN_FILTER);
    createEAttribute(definitionStatusTokenFilterEClass, DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS);

    moduleFilterEClass = createEClass(MODULE_FILTER);
    createEAttribute(moduleFilterEClass, MODULE_FILTER__OP);
    createEReference(moduleFilterEClass, MODULE_FILTER__MODULE_ID);

    effectiveTimeFilterEClass = createEClass(EFFECTIVE_TIME_FILTER);
    createEAttribute(effectiveTimeFilterEClass, EFFECTIVE_TIME_FILTER__OP);
    createEAttribute(effectiveTimeFilterEClass, EFFECTIVE_TIME_FILTER__EFFECTIVE_TIME);

    activeFilterEClass = createEClass(ACTIVE_FILTER);
    createEAttribute(activeFilterEClass, ACTIVE_FILTER__OP);
    createEAttribute(activeFilterEClass, ACTIVE_FILTER__ACTIVE);

    semanticTagFilterEClass = createEClass(SEMANTIC_TAG_FILTER);
    createEAttribute(semanticTagFilterEClass, SEMANTIC_TAG_FILTER__OP);
    createEAttribute(semanticTagFilterEClass, SEMANTIC_TAG_FILTER__SEMANTIC_TAG);

    preferredInFilterEClass = createEClass(PREFERRED_IN_FILTER);
    createEReference(preferredInFilterEClass, PREFERRED_IN_FILTER__LANGUAGE_REF_SET_ID);

    acceptableInFilterEClass = createEClass(ACCEPTABLE_IN_FILTER);
    createEReference(acceptableInFilterEClass, ACCEPTABLE_IN_FILTER__LANGUAGE_REF_SET_ID);

    languageRefSetFilterEClass = createEClass(LANGUAGE_REF_SET_FILTER);
    createEReference(languageRefSetFilterEClass, LANGUAGE_REF_SET_FILTER__LANGUAGE_REF_SET_ID);

    caseSignificanceFilterEClass = createEClass(CASE_SIGNIFICANCE_FILTER);
    createEReference(caseSignificanceFilterEClass, CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID);

    filterValueEClass = createEClass(FILTER_VALUE);

    supplementEClass = createEClass(SUPPLEMENT);

    historySupplementEClass = createEClass(HISTORY_SUPPLEMENT);
    createEReference(historySupplementEClass, HISTORY_SUPPLEMENT__HISTORY);

    historyProfileEClass = createEClass(HISTORY_PROFILE);
    createEAttribute(historyProfileEClass, HISTORY_PROFILE__PROFILE);

    orExpressionConstraintEClass = createEClass(OR_EXPRESSION_CONSTRAINT);
    createEReference(orExpressionConstraintEClass, OR_EXPRESSION_CONSTRAINT__LEFT);
    createEReference(orExpressionConstraintEClass, OR_EXPRESSION_CONSTRAINT__RIGHT);

    andExpressionConstraintEClass = createEClass(AND_EXPRESSION_CONSTRAINT);
    createEReference(andExpressionConstraintEClass, AND_EXPRESSION_CONSTRAINT__LEFT);
    createEReference(andExpressionConstraintEClass, AND_EXPRESSION_CONSTRAINT__RIGHT);

    exclusionExpressionConstraintEClass = createEClass(EXCLUSION_EXPRESSION_CONSTRAINT);
    createEReference(exclusionExpressionConstraintEClass, EXCLUSION_EXPRESSION_CONSTRAINT__LEFT);
    createEReference(exclusionExpressionConstraintEClass, EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT);

    refinedExpressionConstraintEClass = createEClass(REFINED_EXPRESSION_CONSTRAINT);
    createEReference(refinedExpressionConstraintEClass, REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT);
    createEReference(refinedExpressionConstraintEClass, REFINED_EXPRESSION_CONSTRAINT__REFINEMENT);

    dottedExpressionConstraintEClass = createEClass(DOTTED_EXPRESSION_CONSTRAINT);
    createEReference(dottedExpressionConstraintEClass, DOTTED_EXPRESSION_CONSTRAINT__CONSTRAINT);
    createEReference(dottedExpressionConstraintEClass, DOTTED_EXPRESSION_CONSTRAINT__ATTRIBUTE);

    supplementExpressionConstraintEClass = createEClass(SUPPLEMENT_EXPRESSION_CONSTRAINT);
    createEReference(supplementExpressionConstraintEClass, SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT);
    createEReference(supplementExpressionConstraintEClass, SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT);

    filteredExpressionConstraintEClass = createEClass(FILTERED_EXPRESSION_CONSTRAINT);
    createEReference(filteredExpressionConstraintEClass, FILTERED_EXPRESSION_CONSTRAINT__CONSTRAINT);
    createEReference(filteredExpressionConstraintEClass, FILTERED_EXPRESSION_CONSTRAINT__FILTER);

    orRefinementEClass = createEClass(OR_REFINEMENT);
    createEReference(orRefinementEClass, OR_REFINEMENT__LEFT);
    createEReference(orRefinementEClass, OR_REFINEMENT__RIGHT);

    andRefinementEClass = createEClass(AND_REFINEMENT);
    createEReference(andRefinementEClass, AND_REFINEMENT__LEFT);
    createEReference(andRefinementEClass, AND_REFINEMENT__RIGHT);

    disjunctionFilterEClass = createEClass(DISJUNCTION_FILTER);
    createEReference(disjunctionFilterEClass, DISJUNCTION_FILTER__LEFT);
    createEReference(disjunctionFilterEClass, DISJUNCTION_FILTER__RIGHT);

    conjunctionFilterEClass = createEClass(CONJUNCTION_FILTER);
    createEReference(conjunctionFilterEClass, CONJUNCTION_FILTER__LEFT);
    createEReference(conjunctionFilterEClass, CONJUNCTION_FILTER__RIGHT);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    expressionConstraintEClass.getESuperTypes().add(this.getFilterValue());
    childOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    childOrSelfOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    descendantOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    descendantOrSelfOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    parentOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    parentOrSelfOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    ancestorOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    ancestorOrSelfOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    memberOfEClass.getESuperTypes().add(this.getExpressionConstraint());
    eclConceptReferenceEClass.getESuperTypes().add(this.getExpressionConstraint());
    eclConceptReferenceSetEClass.getESuperTypes().add(this.getFilterValue());
    anyEClass.getESuperTypes().add(this.getExpressionConstraint());
    nestedRefinementEClass.getESuperTypes().add(this.getEclRefinement());
    eclAttributeGroupEClass.getESuperTypes().add(this.getEclRefinement());
    attributeConstraintEClass.getESuperTypes().add(this.getEclRefinement());
    attributeComparisonEClass.getESuperTypes().add(this.getComparison());
    dataTypeComparisonEClass.getESuperTypes().add(this.getComparison());
    booleanValueComparisonEClass.getESuperTypes().add(this.getDataTypeComparison());
    stringValueComparisonEClass.getESuperTypes().add(this.getDataTypeComparison());
    integerValueComparisonEClass.getESuperTypes().add(this.getDataTypeComparison());
    decimalValueComparisonEClass.getESuperTypes().add(this.getDataTypeComparison());
    nestedExpressionEClass.getESuperTypes().add(this.getExpressionConstraint());
    nestedFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    propertyFilterEClass.getESuperTypes().add(this.getFilter());
    memberFieldFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    idFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    termFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    typedSearchTermEClass.getESuperTypes().add(this.getSearchTerm());
    typedSearchTermSetEClass.getESuperTypes().add(this.getSearchTerm());
    languageFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    typeFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    typeIdFilterEClass.getESuperTypes().add(this.getTypeFilter());
    typeTokenFilterEClass.getESuperTypes().add(this.getTypeFilter());
    dialectFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    dialectIdFilterEClass.getESuperTypes().add(this.getDialectFilter());
    dialectAliasFilterEClass.getESuperTypes().add(this.getDialectFilter());
    definitionStatusFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    definitionStatusIdFilterEClass.getESuperTypes().add(this.getDefinitionStatusFilter());
    definitionStatusTokenFilterEClass.getESuperTypes().add(this.getDefinitionStatusFilter());
    moduleFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    effectiveTimeFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    activeFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    semanticTagFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    preferredInFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    acceptableInFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    languageRefSetFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    caseSignificanceFilterEClass.getESuperTypes().add(this.getPropertyFilter());
    historySupplementEClass.getESuperTypes().add(this.getSupplement());
    orExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    andExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    exclusionExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    refinedExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    dottedExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    supplementExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    filteredExpressionConstraintEClass.getESuperTypes().add(this.getExpressionConstraint());
    orRefinementEClass.getESuperTypes().add(this.getEclRefinement());
    andRefinementEClass.getESuperTypes().add(this.getEclRefinement());
    disjunctionFilterEClass.getESuperTypes().add(this.getFilter());
    conjunctionFilterEClass.getESuperTypes().add(this.getFilter());

    // Initialize classes and features; add operations and parameters
    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(expressionConstraintEClass, ExpressionConstraint.class, "ExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(childOfEClass, ChildOf.class, "ChildOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChildOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, ChildOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(childOrSelfOfEClass, ChildOrSelfOf.class, "ChildOrSelfOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getChildOrSelfOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, ChildOrSelfOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descendantOfEClass, DescendantOf.class, "DescendantOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescendantOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, DescendantOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descendantOrSelfOfEClass, DescendantOrSelfOf.class, "DescendantOrSelfOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDescendantOrSelfOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, DescendantOrSelfOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parentOfEClass, ParentOf.class, "ParentOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParentOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, ParentOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parentOrSelfOfEClass, ParentOrSelfOf.class, "ParentOrSelfOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParentOrSelfOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, ParentOrSelfOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ancestorOfEClass, AncestorOf.class, "AncestorOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAncestorOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, AncestorOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ancestorOrSelfOfEClass, AncestorOrSelfOf.class, "AncestorOrSelfOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAncestorOrSelfOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, AncestorOrSelfOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(memberOfEClass, MemberOf.class, "MemberOf", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemberOf_RefsetFields(), ecorePackage.getEString(), "refsetFields", null, 0, -1, MemberOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberOf_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, MemberOf.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclConceptReferenceEClass, EclConceptReference.class, "EclConceptReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEclConceptReference_Id(), ecorePackage.getEString(), "id", null, 0, 1, EclConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEclConceptReference_Term(), ecorePackage.getEString(), "term", null, 0, 1, EclConceptReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclConceptReferenceSetEClass, EclConceptReferenceSet.class, "EclConceptReferenceSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEclConceptReferenceSet_Concepts(), this.getEclConceptReference(), null, "concepts", null, 0, -1, EclConceptReferenceSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(anyEClass, Any.class, "Any", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(eclRefinementEClass, EclRefinement.class, "EclRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nestedRefinementEClass, NestedRefinement.class, "NestedRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedRefinement_Nested(), this.getEclRefinement(), null, "nested", null, 0, 1, NestedRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eclAttributeGroupEClass, EclAttributeGroup.class, "EclAttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEclAttributeGroup_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, EclAttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEclAttributeGroup_Refinement(), this.getEclRefinement(), null, "refinement", null, 0, 1, EclAttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeConstraintEClass, AttributeConstraint.class, "AttributeConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeConstraint_Cardinality(), this.getCardinality(), null, "cardinality", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttributeConstraint_Reversed(), ecorePackage.getEBoolean(), "reversed", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeConstraint_Attribute(), this.getExpressionConstraint(), null, "attribute", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeConstraint_Comparison(), this.getComparison(), null, "comparison", null, 0, 1, AttributeConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cardinalityEClass, Cardinality.class, "Cardinality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCardinality_Min(), ecorePackage.getEInt(), "min", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCardinality_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Cardinality.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(comparisonEClass, Comparison.class, "Comparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getComparison_Op(), ecorePackage.getEString(), "op", null, 0, 1, Comparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeComparisonEClass, AttributeComparison.class, "AttributeComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeComparison_Value(), this.getExpressionConstraint(), null, "value", null, 0, 1, AttributeComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dataTypeComparisonEClass, DataTypeComparison.class, "DataTypeComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(booleanValueComparisonEClass, BooleanValueComparison.class, "BooleanValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBooleanValueComparison_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stringValueComparisonEClass, StringValueComparison.class, "StringValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getStringValueComparison_Value(), this.getSearchTerm(), null, "value", null, 0, 1, StringValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(integerValueComparisonEClass, IntegerValueComparison.class, "IntegerValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIntegerValueComparison_Value(), ecorePackage.getEInt(), "value", null, 0, 1, IntegerValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(decimalValueComparisonEClass, DecimalValueComparison.class, "DecimalValueComparison", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDecimalValueComparison_Value(), ecorePackage.getEBigDecimal(), "value", null, 0, 1, DecimalValueComparison.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nestedExpressionEClass, NestedExpression.class, "NestedExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedExpression_Nested(), this.getExpressionConstraint(), null, "nested", null, 0, 1, NestedExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterConstraintEClass, FilterConstraint.class, "FilterConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFilterConstraint_Domain(), ecorePackage.getEString(), "domain", null, 0, 1, FilterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilterConstraint_Filter(), this.getFilter(), null, "filter", null, 0, 1, FilterConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterEClass, Filter.class, "Filter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nestedFilterEClass, NestedFilter.class, "NestedFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNestedFilter_Nested(), this.getFilter(), null, "nested", null, 0, 1, NestedFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyFilterEClass, PropertyFilter.class, "PropertyFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(memberFieldFilterEClass, MemberFieldFilter.class, "MemberFieldFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMemberFieldFilter_RefsetFieldName(), ecorePackage.getEString(), "refsetFieldName", null, 0, 1, MemberFieldFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMemberFieldFilter_Comparison(), this.getComparison(), null, "comparison", null, 0, 1, MemberFieldFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idFilterEClass, IdFilter.class, "IdFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIdFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, IdFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIdFilter_Ids(), ecorePackage.getEString(), "ids", null, 0, -1, IdFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(termFilterEClass, TermFilter.class, "TermFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTermFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, TermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTermFilter_SearchTerm(), this.getSearchTerm(), null, "searchTerm", null, 0, 1, TermFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(searchTermEClass, SearchTerm.class, "SearchTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(typedSearchTermEClass, TypedSearchTerm.class, "TypedSearchTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedSearchTerm_Clause(), this.getTypedSearchTermClause(), null, "clause", null, 0, 1, TypedSearchTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedSearchTermSetEClass, TypedSearchTermSet.class, "TypedSearchTermSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypedSearchTermSet_Clauses(), this.getTypedSearchTermClause(), null, "clauses", null, 0, -1, TypedSearchTermSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typedSearchTermClauseEClass, TypedSearchTermClause.class, "TypedSearchTermClause", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypedSearchTermClause_LexicalSearchType(), ecorePackage.getEString(), "lexicalSearchType", null, 0, 1, TypedSearchTermClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getTypedSearchTermClause_Term(), ecorePackage.getEString(), "term", null, 0, 1, TypedSearchTermClause.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageFilterEClass, LanguageFilter.class, "LanguageFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLanguageFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, LanguageFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLanguageFilter_LanguageCodes(), ecorePackage.getEString(), "languageCodes", null, 0, -1, LanguageFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeFilterEClass, TypeFilter.class, "TypeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, TypeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeIdFilterEClass, TypeIdFilter.class, "TypeIdFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypeIdFilter_Type(), this.getFilterValue(), null, "type", null, 0, 1, TypeIdFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeTokenFilterEClass, TypeTokenFilter.class, "TypeTokenFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getTypeTokenFilter_Tokens(), ecorePackage.getEString(), "tokens", null, 0, -1, TypeTokenFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialectFilterEClass, DialectFilter.class, "DialectFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDialectFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, DialectFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialectIdFilterEClass, DialectIdFilter.class, "DialectIdFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialectIdFilter_Dialects(), this.getDialect(), null, "dialects", null, 0, -1, DialectIdFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialectAliasFilterEClass, DialectAliasFilter.class, "DialectAliasFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialectAliasFilter_Dialects(), this.getDialectAlias(), null, "dialects", null, 0, -1, DialectAliasFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialectEClass, Dialect.class, "Dialect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDialect_LanguageRefSetId(), this.getExpressionConstraint(), null, "languageRefSetId", null, 0, 1, Dialect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialect_Acceptability(), this.getAcceptability(), null, "acceptability", null, 0, 1, Dialect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dialectAliasEClass, DialectAlias.class, "DialectAlias", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDialectAlias_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, DialectAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDialectAlias_Acceptability(), this.getAcceptability(), null, "acceptability", null, 0, 1, DialectAlias.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acceptabilityEClass, Acceptability.class, "Acceptability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAcceptability_Acceptabilities(), this.getEclConceptReferenceSet(), null, "acceptabilities", null, 0, 1, Acceptability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionStatusFilterEClass, DefinitionStatusFilter.class, "DefinitionStatusFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinitionStatusFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, DefinitionStatusFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionStatusIdFilterEClass, DefinitionStatusIdFilter.class, "DefinitionStatusIdFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDefinitionStatusIdFilter_DefinitionStatus(), this.getFilterValue(), null, "definitionStatus", null, 0, 1, DefinitionStatusIdFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(definitionStatusTokenFilterEClass, DefinitionStatusTokenFilter.class, "DefinitionStatusTokenFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDefinitionStatusTokenFilter_DefinitionStatusTokens(), ecorePackage.getEString(), "definitionStatusTokens", null, 0, -1, DefinitionStatusTokenFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(moduleFilterEClass, ModuleFilter.class, "ModuleFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModuleFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, ModuleFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModuleFilter_ModuleId(), this.getFilterValue(), null, "moduleId", null, 0, 1, ModuleFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(effectiveTimeFilterEClass, EffectiveTimeFilter.class, "EffectiveTimeFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEffectiveTimeFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, EffectiveTimeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEffectiveTimeFilter_EffectiveTime(), ecorePackage.getEString(), "effectiveTime", null, 0, 1, EffectiveTimeFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(activeFilterEClass, ActiveFilter.class, "ActiveFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getActiveFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, ActiveFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getActiveFilter_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, ActiveFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(semanticTagFilterEClass, SemanticTagFilter.class, "SemanticTagFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSemanticTagFilter_Op(), ecorePackage.getEString(), "op", null, 0, 1, SemanticTagFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSemanticTagFilter_SemanticTag(), ecorePackage.getEString(), "semanticTag", null, 0, 1, SemanticTagFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(preferredInFilterEClass, PreferredInFilter.class, "PreferredInFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPreferredInFilter_LanguageRefSetId(), this.getFilterValue(), null, "languageRefSetId", null, 0, 1, PreferredInFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(acceptableInFilterEClass, AcceptableInFilter.class, "AcceptableInFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAcceptableInFilter_LanguageRefSetId(), this.getFilterValue(), null, "languageRefSetId", null, 0, 1, AcceptableInFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(languageRefSetFilterEClass, LanguageRefSetFilter.class, "LanguageRefSetFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getLanguageRefSetFilter_LanguageRefSetId(), this.getFilterValue(), null, "languageRefSetId", null, 0, 1, LanguageRefSetFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(caseSignificanceFilterEClass, CaseSignificanceFilter.class, "CaseSignificanceFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCaseSignificanceFilter_CaseSignificanceId(), this.getFilterValue(), null, "caseSignificanceId", null, 0, 1, CaseSignificanceFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filterValueEClass, FilterValue.class, "FilterValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(supplementEClass, Supplement.class, "Supplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(historySupplementEClass, HistorySupplement.class, "HistorySupplement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getHistorySupplement_History(), ecorePackage.getEObject(), null, "history", null, 0, 1, HistorySupplement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(historyProfileEClass, HistoryProfile.class, "HistoryProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHistoryProfile_Profile(), ecorePackage.getEString(), "profile", null, 0, 1, HistoryProfile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orExpressionConstraintEClass, OrExpressionConstraint.class, "OrExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrExpressionConstraint_Left(), this.getExpressionConstraint(), null, "left", null, 0, 1, OrExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrExpressionConstraint_Right(), this.getExpressionConstraint(), null, "right", null, 0, 1, OrExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andExpressionConstraintEClass, AndExpressionConstraint.class, "AndExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndExpressionConstraint_Left(), this.getExpressionConstraint(), null, "left", null, 0, 1, AndExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndExpressionConstraint_Right(), this.getExpressionConstraint(), null, "right", null, 0, 1, AndExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(exclusionExpressionConstraintEClass, ExclusionExpressionConstraint.class, "ExclusionExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getExclusionExpressionConstraint_Left(), this.getExpressionConstraint(), null, "left", null, 0, 1, ExclusionExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExclusionExpressionConstraint_Right(), this.getExpressionConstraint(), null, "right", null, 0, 1, ExclusionExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(refinedExpressionConstraintEClass, RefinedExpressionConstraint.class, "RefinedExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRefinedExpressionConstraint_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, RefinedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRefinedExpressionConstraint_Refinement(), this.getEclRefinement(), null, "refinement", null, 0, 1, RefinedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dottedExpressionConstraintEClass, DottedExpressionConstraint.class, "DottedExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDottedExpressionConstraint_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, DottedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDottedExpressionConstraint_Attribute(), this.getExpressionConstraint(), null, "attribute", null, 0, 1, DottedExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(supplementExpressionConstraintEClass, SupplementExpressionConstraint.class, "SupplementExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSupplementExpressionConstraint_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, SupplementExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSupplementExpressionConstraint_Supplement(), this.getSupplement(), null, "supplement", null, 0, 1, SupplementExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(filteredExpressionConstraintEClass, FilteredExpressionConstraint.class, "FilteredExpressionConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFilteredExpressionConstraint_Constraint(), this.getExpressionConstraint(), null, "constraint", null, 0, 1, FilteredExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFilteredExpressionConstraint_Filter(), this.getFilterConstraint(), null, "filter", null, 0, 1, FilteredExpressionConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orRefinementEClass, OrRefinement.class, "OrRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrRefinement_Left(), this.getEclRefinement(), null, "left", null, 0, 1, OrRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrRefinement_Right(), this.getEclRefinement(), null, "right", null, 0, 1, OrRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(andRefinementEClass, AndRefinement.class, "AndRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAndRefinement_Left(), this.getEclRefinement(), null, "left", null, 0, 1, AndRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAndRefinement_Right(), this.getEclRefinement(), null, "right", null, 0, 1, AndRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(disjunctionFilterEClass, DisjunctionFilter.class, "DisjunctionFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDisjunctionFilter_Left(), this.getFilter(), null, "left", null, 0, 1, DisjunctionFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDisjunctionFilter_Right(), this.getFilter(), null, "right", null, 0, 1, DisjunctionFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(conjunctionFilterEClass, ConjunctionFilter.class, "ConjunctionFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConjunctionFilter_Left(), this.getFilter(), null, "left", null, 0, 1, ConjunctionFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConjunctionFilter_Right(), this.getPropertyFilter(), null, "right", null, 0, 1, ConjunctionFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //EclPackageImpl
