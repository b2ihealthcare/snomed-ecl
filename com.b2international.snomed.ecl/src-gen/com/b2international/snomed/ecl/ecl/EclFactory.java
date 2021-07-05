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
package com.b2international.snomed.ecl.ecl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.b2international.snomed.ecl.ecl.EclPackage
 * @generated
 */
public interface EclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EclFactory eINSTANCE = com.b2international.snomed.ecl.ecl.impl.EclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Constraint</em>'.
   * @generated
   */
  ExpressionConstraint createExpressionConstraint();

  /**
   * Returns a new object of class '<em>Child Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Child Of</em>'.
   * @generated
   */
  ChildOf createChildOf();

  /**
   * Returns a new object of class '<em>Child Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Child Or Self Of</em>'.
   * @generated
   */
  ChildOrSelfOf createChildOrSelfOf();

  /**
   * Returns a new object of class '<em>Descendant Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descendant Of</em>'.
   * @generated
   */
  DescendantOf createDescendantOf();

  /**
   * Returns a new object of class '<em>Descendant Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Descendant Or Self Of</em>'.
   * @generated
   */
  DescendantOrSelfOf createDescendantOrSelfOf();

  /**
   * Returns a new object of class '<em>Parent Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Of</em>'.
   * @generated
   */
  ParentOf createParentOf();

  /**
   * Returns a new object of class '<em>Parent Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent Or Self Of</em>'.
   * @generated
   */
  ParentOrSelfOf createParentOrSelfOf();

  /**
   * Returns a new object of class '<em>Ancestor Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ancestor Of</em>'.
   * @generated
   */
  AncestorOf createAncestorOf();

  /**
   * Returns a new object of class '<em>Ancestor Or Self Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ancestor Or Self Of</em>'.
   * @generated
   */
  AncestorOrSelfOf createAncestorOrSelfOf();

  /**
   * Returns a new object of class '<em>Member Of</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Member Of</em>'.
   * @generated
   */
  MemberOf createMemberOf();

  /**
   * Returns a new object of class '<em>Concept Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept Reference</em>'.
   * @generated
   */
  EclConceptReference createEclConceptReference();

  /**
   * Returns a new object of class '<em>Concept Reference Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Concept Reference Set</em>'.
   * @generated
   */
  EclConceptReferenceSet createEclConceptReferenceSet();

  /**
   * Returns a new object of class '<em>Any</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any</em>'.
   * @generated
   */
  Any createAny();

  /**
   * Returns a new object of class '<em>Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refinement</em>'.
   * @generated
   */
  EclRefinement createEclRefinement();

  /**
   * Returns a new object of class '<em>Nested Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Refinement</em>'.
   * @generated
   */
  NestedRefinement createNestedRefinement();

  /**
   * Returns a new object of class '<em>Attribute Group</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Group</em>'.
   * @generated
   */
  EclAttributeGroup createEclAttributeGroup();

  /**
   * Returns a new object of class '<em>Attribute Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Constraint</em>'.
   * @generated
   */
  AttributeConstraint createAttributeConstraint();

  /**
   * Returns a new object of class '<em>Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cardinality</em>'.
   * @generated
   */
  Cardinality createCardinality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>Attribute Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Comparison</em>'.
   * @generated
   */
  AttributeComparison createAttributeComparison();

  /**
   * Returns a new object of class '<em>Data Type Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Data Type Comparison</em>'.
   * @generated
   */
  DataTypeComparison createDataTypeComparison();

  /**
   * Returns a new object of class '<em>Boolean Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Boolean Value Comparison</em>'.
   * @generated
   */
  BooleanValueComparison createBooleanValueComparison();

  /**
   * Returns a new object of class '<em>String Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Value Comparison</em>'.
   * @generated
   */
  StringValueComparison createStringValueComparison();

  /**
   * Returns a new object of class '<em>Integer Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Integer Value Comparison</em>'.
   * @generated
   */
  IntegerValueComparison createIntegerValueComparison();

  /**
   * Returns a new object of class '<em>Decimal Value Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Value Comparison</em>'.
   * @generated
   */
  DecimalValueComparison createDecimalValueComparison();

  /**
   * Returns a new object of class '<em>Nested Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Expression</em>'.
   * @generated
   */
  NestedExpression createNestedExpression();

  /**
   * Returns a new object of class '<em>Filter Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Constraint</em>'.
   * @generated
   */
  FilterConstraint createFilterConstraint();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>Nested Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Nested Filter</em>'.
   * @generated
   */
  NestedFilter createNestedFilter();

  /**
   * Returns a new object of class '<em>Property Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Filter</em>'.
   * @generated
   */
  PropertyFilter createPropertyFilter();

  /**
   * Returns a new object of class '<em>Term Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Term Filter</em>'.
   * @generated
   */
  TermFilter createTermFilter();

  /**
   * Returns a new object of class '<em>Typed Term Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Term Filter</em>'.
   * @generated
   */
  TypedTermFilter createTypedTermFilter();

  /**
   * Returns a new object of class '<em>Typed Term Filter Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Typed Term Filter Set</em>'.
   * @generated
   */
  TypedTermFilterSet createTypedTermFilterSet();

  /**
   * Returns a new object of class '<em>Language Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Filter</em>'.
   * @generated
   */
  LanguageFilter createLanguageFilter();

  /**
   * Returns a new object of class '<em>Type Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Filter</em>'.
   * @generated
   */
  TypeFilter createTypeFilter();

  /**
   * Returns a new object of class '<em>Type Id Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Id Filter</em>'.
   * @generated
   */
  TypeIdFilter createTypeIdFilter();

  /**
   * Returns a new object of class '<em>Type Token Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Token Filter</em>'.
   * @generated
   */
  TypeTokenFilter createTypeTokenFilter();

  /**
   * Returns a new object of class '<em>Dialect Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialect Filter</em>'.
   * @generated
   */
  DialectFilter createDialectFilter();

  /**
   * Returns a new object of class '<em>Dialect Id Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialect Id Filter</em>'.
   * @generated
   */
  DialectIdFilter createDialectIdFilter();

  /**
   * Returns a new object of class '<em>Dialect Alias Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialect Alias Filter</em>'.
   * @generated
   */
  DialectAliasFilter createDialectAliasFilter();

  /**
   * Returns a new object of class '<em>Dialect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialect</em>'.
   * @generated
   */
  Dialect createDialect();

  /**
   * Returns a new object of class '<em>Dialect Alias</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dialect Alias</em>'.
   * @generated
   */
  DialectAlias createDialectAlias();

  /**
   * Returns a new object of class '<em>Acceptability</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acceptability</em>'.
   * @generated
   */
  Acceptability createAcceptability();

  /**
   * Returns a new object of class '<em>Acceptability Id Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acceptability Id Set</em>'.
   * @generated
   */
  AcceptabilityIdSet createAcceptabilityIdSet();

  /**
   * Returns a new object of class '<em>Acceptability Token Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acceptability Token Set</em>'.
   * @generated
   */
  AcceptabilityTokenSet createAcceptabilityTokenSet();

  /**
   * Returns a new object of class '<em>Active Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Active Filter</em>'.
   * @generated
   */
  ActiveFilter createActiveFilter();

  /**
   * Returns a new object of class '<em>Module Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Module Filter</em>'.
   * @generated
   */
  ModuleFilter createModuleFilter();

  /**
   * Returns a new object of class '<em>Semantic Tag Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Semantic Tag Filter</em>'.
   * @generated
   */
  SemanticTagFilter createSemanticTagFilter();

  /**
   * Returns a new object of class '<em>Effective Time Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Effective Time Filter</em>'.
   * @generated
   */
  EffectiveTimeFilter createEffectiveTimeFilter();

  /**
   * Returns a new object of class '<em>Preferred In Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Preferred In Filter</em>'.
   * @generated
   */
  PreferredInFilter createPreferredInFilter();

  /**
   * Returns a new object of class '<em>Acceptable In Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Acceptable In Filter</em>'.
   * @generated
   */
  AcceptableInFilter createAcceptableInFilter();

  /**
   * Returns a new object of class '<em>Language Ref Set Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Language Ref Set Filter</em>'.
   * @generated
   */
  LanguageRefSetFilter createLanguageRefSetFilter();

  /**
   * Returns a new object of class '<em>Case Significance Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Significance Filter</em>'.
   * @generated
   */
  CaseSignificanceFilter createCaseSignificanceFilter();

  /**
   * Returns a new object of class '<em>Or Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Expression Constraint</em>'.
   * @generated
   */
  OrExpressionConstraint createOrExpressionConstraint();

  /**
   * Returns a new object of class '<em>And Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Expression Constraint</em>'.
   * @generated
   */
  AndExpressionConstraint createAndExpressionConstraint();

  /**
   * Returns a new object of class '<em>Exclusion Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Exclusion Expression Constraint</em>'.
   * @generated
   */
  ExclusionExpressionConstraint createExclusionExpressionConstraint();

  /**
   * Returns a new object of class '<em>Refined Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Refined Expression Constraint</em>'.
   * @generated
   */
  RefinedExpressionConstraint createRefinedExpressionConstraint();

  /**
   * Returns a new object of class '<em>Dotted Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dotted Expression Constraint</em>'.
   * @generated
   */
  DottedExpressionConstraint createDottedExpressionConstraint();

  /**
   * Returns a new object of class '<em>Filtered Expression Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filtered Expression Constraint</em>'.
   * @generated
   */
  FilteredExpressionConstraint createFilteredExpressionConstraint();

  /**
   * Returns a new object of class '<em>Or Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or Refinement</em>'.
   * @generated
   */
  OrRefinement createOrRefinement();

  /**
   * Returns a new object of class '<em>And Refinement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And Refinement</em>'.
   * @generated
   */
  AndRefinement createAndRefinement();

  /**
   * Returns a new object of class '<em>Disjunction Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Disjunction Filter</em>'.
   * @generated
   */
  DisjunctionFilter createDisjunctionFilter();

  /**
   * Returns a new object of class '<em>Conjunction Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conjunction Filter</em>'.
   * @generated
   */
  ConjunctionFilter createConjunctionFilter();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EclPackage getEclPackage();

} //EclFactory
