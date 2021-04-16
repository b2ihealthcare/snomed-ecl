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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.b2international.snomed.ecl.ecl.EclFactory
 * @model kind="package"
 * @generated
 */
public interface EclPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ecl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.b2international.com/snomed/Ecl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ecl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EclPackage eINSTANCE = com.b2international.snomed.ecl.ecl.impl.EclPackageImpl.init();

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ScriptImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CONSTRAINT = 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExpressionConstraint()
   * @generated
   */
  int EXPRESSION_CONSTRAINT = 1;

  /**
   * The number of structural features of the '<em>Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_CONSTRAINT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ChildOfImpl <em>Child Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ChildOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getChildOf()
   * @generated
   */
  int CHILD_OF = 2;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Child Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ChildOrSelfOfImpl <em>Child Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ChildOrSelfOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getChildOrSelfOf()
   * @generated
   */
  int CHILD_OR_SELF_OF = 3;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Child Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CHILD_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DescendantOfImpl <em>Descendant Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DescendantOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOf()
   * @generated
   */
  int DESCENDANT_OF = 4;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Descendant Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl <em>Descendant Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOrSelfOf()
   * @generated
   */
  int DESCENDANT_OR_SELF_OF = 5;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Descendant Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCENDANT_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ParentOfImpl <em>Parent Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ParentOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getParentOf()
   * @generated
   */
  int PARENT_OF = 6;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parent Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ParentOrSelfOfImpl <em>Parent Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ParentOrSelfOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getParentOrSelfOf()
   * @generated
   */
  int PARENT_OR_SELF_OF = 7;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parent Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AncestorOfImpl <em>Ancestor Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AncestorOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOf()
   * @generated
   */
  int ANCESTOR_OF = 8;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancestor Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl <em>Ancestor Or Self Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOrSelfOf()
   * @generated
   */
  int ANCESTOR_OR_SELF_OF = 9;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OR_SELF_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ancestor Or Self Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANCESTOR_OR_SELF_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.MemberOfImpl <em>Member Of</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.MemberOfImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getMemberOf()
   * @generated
   */
  int MEMBER_OF = 10;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_OF__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Member Of</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_OF_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceImpl <em>Concept Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclConceptReference()
   * @generated
   */
  int ECL_CONCEPT_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_CONCEPT_REFERENCE__ID = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_CONCEPT_REFERENCE__TERM = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Concept Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_CONCEPT_REFERENCE_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceSetImpl <em>Concept Reference Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceSetImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclConceptReferenceSet()
   * @generated
   */
  int ECL_CONCEPT_REFERENCE_SET = 12;

  /**
   * The feature id for the '<em><b>Concepts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_CONCEPT_REFERENCE_SET__CONCEPTS = 0;

  /**
   * The number of structural features of the '<em>Concept Reference Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_CONCEPT_REFERENCE_SET_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AnyImpl <em>Any</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AnyImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAny()
   * @generated
   */
  int ANY = 13;

  /**
   * The number of structural features of the '<em>Any</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ANY_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.EclRefinementImpl <em>Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.EclRefinementImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclRefinement()
   * @generated
   */
  int ECL_REFINEMENT = 14;

  /**
   * The number of structural features of the '<em>Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_REFINEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedRefinementImpl <em>Nested Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.NestedRefinementImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedRefinement()
   * @generated
   */
  int NESTED_REFINEMENT = 15;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_REFINEMENT__NESTED = ECL_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_REFINEMENT_FEATURE_COUNT = ECL_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.EclAttributeGroupImpl <em>Attribute Group</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.EclAttributeGroupImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclAttributeGroup()
   * @generated
   */
  int ECL_ATTRIBUTE_GROUP = 16;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_ATTRIBUTE_GROUP__CARDINALITY = ECL_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_ATTRIBUTE_GROUP__REFINEMENT = ECL_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Attribute Group</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECL_ATTRIBUTE_GROUP_FEATURE_COUNT = ECL_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AttributeConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeConstraint()
   * @generated
   */
  int ATTRIBUTE_CONSTRAINT = 17;

  /**
   * The feature id for the '<em><b>Cardinality</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CONSTRAINT__CARDINALITY = ECL_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Reversed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CONSTRAINT__REVERSED = ECL_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CONSTRAINT__ATTRIBUTE = ECL_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CONSTRAINT__COMPARISON = ECL_REFINEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Attribute Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_CONSTRAINT_FEATURE_COUNT = ECL_REFINEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.CardinalityImpl <em>Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.CardinalityImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getCardinality()
   * @generated
   */
  int CARDINALITY = 18;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__MIN = 0;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY__MAX = 1;

  /**
   * The number of structural features of the '<em>Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CARDINALITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 19;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = 0;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AttributeComparisonImpl <em>Attribute Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AttributeComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeComparison()
   * @generated
   */
  int ATTRIBUTE_COMPARISON = 20;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPARISON__OP = COMPARISON__OP;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPARISON__VALUE = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Attribute Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_COMPARISON_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DataTypeComparisonImpl <em>Data Type Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DataTypeComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDataTypeComparison()
   * @generated
   */
  int DATA_TYPE_COMPARISON = 21;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPARISON__OP = COMPARISON__OP;

  /**
   * The number of structural features of the '<em>Data Type Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DATA_TYPE_COMPARISON_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.BooleanValueComparisonImpl <em>Boolean Value Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.BooleanValueComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getBooleanValueComparison()
   * @generated
   */
  int BOOLEAN_VALUE_COMPARISON = 22;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_COMPARISON__OP = DATA_TYPE_COMPARISON__OP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_COMPARISON__VALUE = DATA_TYPE_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Boolean Value Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOLEAN_VALUE_COMPARISON_FEATURE_COUNT = DATA_TYPE_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.StringValueComparisonImpl <em>String Value Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.StringValueComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getStringValueComparison()
   * @generated
   */
  int STRING_VALUE_COMPARISON = 23;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON__OP = DATA_TYPE_COMPARISON__OP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON__VALUE = DATA_TYPE_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>String Value Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_VALUE_COMPARISON_FEATURE_COUNT = DATA_TYPE_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.IntegerValueComparisonImpl <em>Integer Value Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.IntegerValueComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getIntegerValueComparison()
   * @generated
   */
  int INTEGER_VALUE_COMPARISON = 24;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_COMPARISON__OP = DATA_TYPE_COMPARISON__OP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_COMPARISON__VALUE = DATA_TYPE_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Integer Value Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INTEGER_VALUE_COMPARISON_FEATURE_COUNT = DATA_TYPE_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DecimalValueComparisonImpl <em>Decimal Value Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DecimalValueComparisonImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDecimalValueComparison()
   * @generated
   */
  int DECIMAL_VALUE_COMPARISON = 25;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE_COMPARISON__OP = DATA_TYPE_COMPARISON__OP;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE_COMPARISON__VALUE = DATA_TYPE_COMPARISON_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Decimal Value Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DECIMAL_VALUE_COMPARISON_FEATURE_COUNT = DATA_TYPE_COMPARISON_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.NestedExpressionImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedExpression()
   * @generated
   */
  int NESTED_EXPRESSION = 26;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION__NESTED = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_EXPRESSION_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.FilterConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getFilterConstraint()
   * @generated
   */
  int FILTER_CONSTRAINT = 27;

  /**
   * The number of structural features of the '<em>Filter Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.FilterImpl <em>Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.FilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getFilter()
   * @generated
   */
  int FILTER = 28;

  /**
   * The number of structural features of the '<em>Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FILTER_FEATURE_COUNT = FILTER_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.PropertyFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getPropertyFilter()
   * @generated
   */
  int PROPERTY_FILTER = 30;

  /**
   * The number of structural features of the '<em>Property Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedFilterImpl <em>Nested Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.NestedFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedFilter()
   * @generated
   */
  int NESTED_FILTER = 29;

  /**
   * The feature id for the '<em><b>Nested</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER__NESTED = PROPERTY_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Nested Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NESTED_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TermFilterImpl <em>Term Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TermFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTermFilter()
   * @generated
   */
  int TERM_FILTER = 31;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER__OP = PROPERTY_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Term Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TERM_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TypedTermFilterImpl <em>Typed Term Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TypedTermFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypedTermFilter()
   * @generated
   */
  int TYPED_TERM_FILTER = 32;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER__OP = TERM_FILTER__OP;

  /**
   * The feature id for the '<em><b>Lexical Search Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER__LEXICAL_SEARCH_TYPE = TERM_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER__TERM = TERM_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Typed Term Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER_FEATURE_COUNT = TERM_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TypedTermFilterSetImpl <em>Typed Term Filter Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TypedTermFilterSetImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypedTermFilterSet()
   * @generated
   */
  int TYPED_TERM_FILTER_SET = 33;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER_SET__OP = TERM_FILTER__OP;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER_SET__TERMS = TERM_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Typed Term Filter Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPED_TERM_FILTER_SET_FEATURE_COUNT = TERM_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.LanguageCodeFilterImpl <em>Language Code Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.LanguageCodeFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getLanguageCodeFilter()
   * @generated
   */
  int LANGUAGE_CODE_FILTER = 34;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_CODE_FILTER__OP = PROPERTY_FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Language Codes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_CODE_FILTER__LANGUAGE_CODES = PROPERTY_FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Language Code Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LANGUAGE_CODE_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeFilterImpl <em>Type Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TypeFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeFilter()
   * @generated
   */
  int TYPE_FILTER = 35;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FILTER__OP = PROPERTY_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeIdFilterImpl <em>Type Id Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TypeIdFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeIdFilter()
   * @generated
   */
  int TYPE_ID_FILTER = 36;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID_FILTER__OP = TYPE_FILTER__OP;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID_FILTER__TYPE = TYPE_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Id Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_ID_FILTER_FEATURE_COUNT = TYPE_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeTokenFilterImpl <em>Type Token Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.TypeTokenFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeTokenFilter()
   * @generated
   */
  int TYPE_TOKEN_FILTER = 37;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN_FILTER__OP = TYPE_FILTER__OP;

  /**
   * The feature id for the '<em><b>Tokens</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN_FILTER__TOKENS = TYPE_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Type Token Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_TOKEN_FILTER_FEATURE_COUNT = TYPE_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectFilterImpl <em>Dialect Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DialectFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectFilter()
   * @generated
   */
  int DIALECT_FILTER = 38;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_FILTER__OP = PROPERTY_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dialect Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_FILTER_FEATURE_COUNT = PROPERTY_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectIdFilterImpl <em>Dialect Id Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DialectIdFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectIdFilter()
   * @generated
   */
  int DIALECT_ID_FILTER = 39;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ID_FILTER__OP = DIALECT_FILTER__OP;

  /**
   * The feature id for the '<em><b>Dialects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ID_FILTER__DIALECTS = DIALECT_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dialect Id Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ID_FILTER_FEATURE_COUNT = DIALECT_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectAliasFilterImpl <em>Dialect Alias Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DialectAliasFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectAliasFilter()
   * @generated
   */
  int DIALECT_ALIAS_FILTER = 40;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS_FILTER__OP = DIALECT_FILTER__OP;

  /**
   * The feature id for the '<em><b>Dialects</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS_FILTER__DIALECTS = DIALECT_FILTER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Dialect Alias Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS_FILTER_FEATURE_COUNT = DIALECT_FILTER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectImpl <em>Dialect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DialectImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialect()
   * @generated
   */
  int DIALECT = 41;

  /**
   * The feature id for the '<em><b>Language Ref Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT__LANGUAGE_REF_SET_ID = 0;

  /**
   * The feature id for the '<em><b>Acceptability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT__ACCEPTABILITY = 1;

  /**
   * The number of structural features of the '<em>Dialect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectAliasImpl <em>Dialect Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DialectAliasImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectAlias()
   * @generated
   */
  int DIALECT_ALIAS = 42;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Acceptability</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS__ACCEPTABILITY = 1;

  /**
   * The number of structural features of the '<em>Dialect Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIALECT_ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityImpl <em>Acceptability</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptability()
   * @generated
   */
  int ACCEPTABILITY = 43;

  /**
   * The number of structural features of the '<em>Acceptability</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPTABILITY_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityIdSetImpl <em>Acceptability Id Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityIdSetImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptabilityIdSet()
   * @generated
   */
  int ACCEPTABILITY_ID_SET = 44;

  /**
   * The feature id for the '<em><b>Acceptabilities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPTABILITY_ID_SET__ACCEPTABILITIES = ACCEPTABILITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Acceptability Id Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPTABILITY_ID_SET_FEATURE_COUNT = ACCEPTABILITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityTokenSetImpl <em>Acceptability Token Set</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityTokenSetImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptabilityTokenSet()
   * @generated
   */
  int ACCEPTABILITY_TOKEN_SET = 45;

  /**
   * The feature id for the '<em><b>Acceptabilities</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPTABILITY_TOKEN_SET__ACCEPTABILITIES = ACCEPTABILITY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Acceptability Token Set</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACCEPTABILITY_TOKEN_SET_FEATURE_COUNT = ACCEPTABILITY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.OrExpressionConstraintImpl <em>Or Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.OrExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getOrExpressionConstraint()
   * @generated
   */
  int OR_EXPRESSION_CONSTRAINT = 46;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AndExpressionConstraintImpl <em>And Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AndExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAndExpressionConstraint()
   * @generated
   */
  int AND_EXPRESSION_CONSTRAINT = 47;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
   * @generated
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT = 48;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT__LEFT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exclusion Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
   * @generated
   */
  int REFINED_EXPRESSION_CONSTRAINT = 49;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Refinement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Refined Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFINED_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DottedExpressionConstraintImpl <em>Dotted Expression Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DottedExpressionConstraintImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDottedExpressionConstraint()
   * @generated
   */
  int DOTTED_EXPRESSION_CONSTRAINT = 50;

  /**
   * The feature id for the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION_CONSTRAINT__CONSTRAINT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION_CONSTRAINT__ATTRIBUTE = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Dotted Expression Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOTTED_EXPRESSION_CONSTRAINT_FEATURE_COUNT = EXPRESSION_CONSTRAINT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.OrRefinementImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getOrRefinement()
   * @generated
   */
  int OR_REFINEMENT = 51;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT__LEFT = ECL_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT__RIGHT = ECL_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_REFINEMENT_FEATURE_COUNT = ECL_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.AndRefinementImpl <em>And Refinement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.AndRefinementImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAndRefinement()
   * @generated
   */
  int AND_REFINEMENT = 52;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT__LEFT = ECL_REFINEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT__RIGHT = ECL_REFINEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And Refinement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_REFINEMENT_FEATURE_COUNT = ECL_REFINEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.DisjunctionFilterImpl <em>Disjunction Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.DisjunctionFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDisjunctionFilter()
   * @generated
   */
  int DISJUNCTION_FILTER = 53;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FILTER__LEFT = FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FILTER__RIGHT = FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Disjunction Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DISJUNCTION_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ConjunctionFilterImpl <em>Conjunction Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ConjunctionFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getConjunctionFilter()
   * @generated
   */
  int CONJUNCTION_FILTER = 54;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FILTER__LEFT = FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FILTER__RIGHT = FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Conjunction Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONJUNCTION_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.impl.ExclusionFilterImpl <em>Exclusion Filter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.impl.ExclusionFilterImpl
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionFilter()
   * @generated
   */
  int EXCLUSION_FILTER = 55;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_FILTER__LEFT = FILTER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_FILTER__RIGHT = FILTER_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Exclusion Filter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXCLUSION_FILTER_FEATURE_COUNT = FILTER_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.b2international.snomed.ecl.ecl.LexicalSearchType <em>Lexical Search Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.b2international.snomed.ecl.ecl.LexicalSearchType
   * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getLexicalSearchType()
   * @generated
   */
  int LEXICAL_SEARCH_TYPE = 56;


  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see com.b2international.snomed.ecl.ecl.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.Script#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.Script#getConstraint()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ExpressionConstraint <em>Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExpressionConstraint
   * @generated
   */
  EClass getExpressionConstraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ChildOf <em>Child Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.ChildOf
   * @generated
   */
  EClass getChildOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ChildOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ChildOf#getConstraint()
   * @see #getChildOf()
   * @generated
   */
  EReference getChildOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ChildOrSelfOf <em>Child Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Child Or Self Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.ChildOrSelfOf
   * @generated
   */
  EClass getChildOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ChildOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ChildOrSelfOf#getConstraint()
   * @see #getChildOrSelfOf()
   * @generated
   */
  EReference getChildOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DescendantOf <em>Descendant Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.DescendantOf
   * @generated
   */
  EClass getDescendantOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DescendantOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.DescendantOf#getConstraint()
   * @see #getDescendantOf()
   * @generated
   */
  EReference getDescendantOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DescendantOrSelfOf <em>Descendant Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Descendant Or Self Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.DescendantOrSelfOf
   * @generated
   */
  EClass getDescendantOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DescendantOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.DescendantOrSelfOf#getConstraint()
   * @see #getDescendantOrSelfOf()
   * @generated
   */
  EReference getDescendantOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ParentOf <em>Parent Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.ParentOf
   * @generated
   */
  EClass getParentOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ParentOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ParentOf#getConstraint()
   * @see #getParentOf()
   * @generated
   */
  EReference getParentOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ParentOrSelfOf <em>Parent Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent Or Self Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.ParentOrSelfOf
   * @generated
   */
  EClass getParentOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ParentOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ParentOrSelfOf#getConstraint()
   * @see #getParentOrSelfOf()
   * @generated
   */
  EReference getParentOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AncestorOf <em>Ancestor Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancestor Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.AncestorOf
   * @generated
   */
  EClass getAncestorOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AncestorOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.AncestorOf#getConstraint()
   * @see #getAncestorOf()
   * @generated
   */
  EReference getAncestorOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AncestorOrSelfOf <em>Ancestor Or Self Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ancestor Or Self Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.AncestorOrSelfOf
   * @generated
   */
  EClass getAncestorOrSelfOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AncestorOrSelfOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.AncestorOrSelfOf#getConstraint()
   * @see #getAncestorOrSelfOf()
   * @generated
   */
  EReference getAncestorOrSelfOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.MemberOf <em>Member Of</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member Of</em>'.
   * @see com.b2international.snomed.ecl.ecl.MemberOf
   * @generated
   */
  EClass getMemberOf();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.MemberOf#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.MemberOf#getConstraint()
   * @see #getMemberOf()
   * @generated
   */
  EReference getMemberOf_Constraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.EclConceptReference <em>Concept Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Reference</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReference
   * @generated
   */
  EClass getEclConceptReference();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.EclConceptReference#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReference#getId()
   * @see #getEclConceptReference()
   * @generated
   */
  EAttribute getEclConceptReference_Id();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.EclConceptReference#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReference#getTerm()
   * @see #getEclConceptReference()
   * @generated
   */
  EAttribute getEclConceptReference_Term();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.EclConceptReferenceSet <em>Concept Reference Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Concept Reference Set</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReferenceSet
   * @generated
   */
  EClass getEclConceptReferenceSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.b2international.snomed.ecl.ecl.EclConceptReferenceSet#getConcepts <em>Concepts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Concepts</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclConceptReferenceSet#getConcepts()
   * @see #getEclConceptReferenceSet()
   * @generated
   */
  EReference getEclConceptReferenceSet_Concepts();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Any <em>Any</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Any</em>'.
   * @see com.b2international.snomed.ecl.ecl.Any
   * @generated
   */
  EClass getAny();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.EclRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclRefinement
   * @generated
   */
  EClass getEclRefinement();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.NestedRefinement <em>Nested Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedRefinement
   * @generated
   */
  EClass getNestedRefinement();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.NestedRefinement#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedRefinement#getNested()
   * @see #getNestedRefinement()
   * @generated
   */
  EReference getNestedRefinement_Nested();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.EclAttributeGroup <em>Attribute Group</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Group</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclAttributeGroup
   * @generated
   */
  EClass getEclAttributeGroup();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.EclAttributeGroup#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclAttributeGroup#getCardinality()
   * @see #getEclAttributeGroup()
   * @generated
   */
  EReference getEclAttributeGroup_Cardinality();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.EclAttributeGroup#getRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.EclAttributeGroup#getRefinement()
   * @see #getEclAttributeGroup()
   * @generated
   */
  EReference getEclAttributeGroup_Refinement();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint <em>Attribute Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint
   * @generated
   */
  EClass getAttributeConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint#getCardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cardinality</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint#getCardinality()
   * @see #getAttributeConstraint()
   * @generated
   */
  EReference getAttributeConstraint_Cardinality();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint#isReversed <em>Reversed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reversed</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint#isReversed()
   * @see #getAttributeConstraint()
   * @generated
   */
  EAttribute getAttributeConstraint_Reversed();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint#getAttribute()
   * @see #getAttributeConstraint()
   * @generated
   */
  EReference getAttributeConstraint_Attribute();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AttributeConstraint#getComparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeConstraint#getComparison()
   * @see #getAttributeConstraint()
   * @generated
   */
  EReference getAttributeConstraint_Comparison();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Cardinality <em>Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cardinality</em>'.
   * @see com.b2international.snomed.ecl.ecl.Cardinality
   * @generated
   */
  EClass getCardinality();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.Cardinality#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see com.b2international.snomed.ecl.ecl.Cardinality#getMin()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_Min();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.Cardinality#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see com.b2international.snomed.ecl.ecl.Cardinality#getMax()
   * @see #getCardinality()
   * @generated
   */
  EAttribute getCardinality_Max();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.b2international.snomed.ecl.ecl.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AttributeComparison <em>Attribute Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeComparison
   * @generated
   */
  EClass getAttributeComparison();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AttributeComparison#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see com.b2international.snomed.ecl.ecl.AttributeComparison#getValue()
   * @see #getAttributeComparison()
   * @generated
   */
  EReference getAttributeComparison_Value();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DataTypeComparison <em>Data Type Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Data Type Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.DataTypeComparison
   * @generated
   */
  EClass getDataTypeComparison();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.BooleanValueComparison <em>Boolean Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Boolean Value Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.BooleanValueComparison
   * @generated
   */
  EClass getBooleanValueComparison();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.BooleanValueComparison#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.b2international.snomed.ecl.ecl.BooleanValueComparison#isValue()
   * @see #getBooleanValueComparison()
   * @generated
   */
  EAttribute getBooleanValueComparison_Value();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.StringValueComparison <em>String Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Value Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.StringValueComparison
   * @generated
   */
  EClass getStringValueComparison();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.StringValueComparison#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.b2international.snomed.ecl.ecl.StringValueComparison#getValue()
   * @see #getStringValueComparison()
   * @generated
   */
  EAttribute getStringValueComparison_Value();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.IntegerValueComparison <em>Integer Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Integer Value Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.IntegerValueComparison
   * @generated
   */
  EClass getIntegerValueComparison();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.IntegerValueComparison#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.b2international.snomed.ecl.ecl.IntegerValueComparison#getValue()
   * @see #getIntegerValueComparison()
   * @generated
   */
  EAttribute getIntegerValueComparison_Value();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DecimalValueComparison <em>Decimal Value Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Decimal Value Comparison</em>'.
   * @see com.b2international.snomed.ecl.ecl.DecimalValueComparison
   * @generated
   */
  EClass getDecimalValueComparison();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.DecimalValueComparison#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.b2international.snomed.ecl.ecl.DecimalValueComparison#getValue()
   * @see #getDecimalValueComparison()
   * @generated
   */
  EAttribute getDecimalValueComparison_Value();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.NestedExpression <em>Nested Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Expression</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedExpression
   * @generated
   */
  EClass getNestedExpression();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.NestedExpression#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedExpression#getNested()
   * @see #getNestedExpression()
   * @generated
   */
  EReference getNestedExpression_Nested();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.FilterConstraint <em>Filter Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.FilterConstraint
   * @generated
   */
  EClass getFilterConstraint();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Filter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.Filter
   * @generated
   */
  EClass getFilter();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.NestedFilter <em>Nested Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Nested Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedFilter
   * @generated
   */
  EClass getNestedFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.NestedFilter#getNested <em>Nested</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Nested</em>'.
   * @see com.b2international.snomed.ecl.ecl.NestedFilter#getNested()
   * @see #getNestedFilter()
   * @generated
   */
  EReference getNestedFilter_Nested();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.PropertyFilter <em>Property Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.PropertyFilter
   * @generated
   */
  EClass getPropertyFilter();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TermFilter <em>Term Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Term Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.TermFilter
   * @generated
   */
  EClass getTermFilter();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.TermFilter#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.b2international.snomed.ecl.ecl.TermFilter#getOp()
   * @see #getTermFilter()
   * @generated
   */
  EAttribute getTermFilter_Op();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TypedTermFilter <em>Typed Term Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Term Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypedTermFilter
   * @generated
   */
  EClass getTypedTermFilter();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.TypedTermFilter#getLexicalSearchType <em>Lexical Search Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Lexical Search Type</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypedTermFilter#getLexicalSearchType()
   * @see #getTypedTermFilter()
   * @generated
   */
  EAttribute getTypedTermFilter_LexicalSearchType();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.TypedTermFilter#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Term</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypedTermFilter#getTerm()
   * @see #getTypedTermFilter()
   * @generated
   */
  EAttribute getTypedTermFilter_Term();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TypedTermFilterSet <em>Typed Term Filter Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Typed Term Filter Set</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypedTermFilterSet
   * @generated
   */
  EClass getTypedTermFilterSet();

  /**
   * Returns the meta object for the containment reference list '{@link com.b2international.snomed.ecl.ecl.TypedTermFilterSet#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypedTermFilterSet#getTerms()
   * @see #getTypedTermFilterSet()
   * @generated
   */
  EReference getTypedTermFilterSet_Terms();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.LanguageCodeFilter <em>Language Code Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Language Code Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.LanguageCodeFilter
   * @generated
   */
  EClass getLanguageCodeFilter();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.LanguageCodeFilter#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.b2international.snomed.ecl.ecl.LanguageCodeFilter#getOp()
   * @see #getLanguageCodeFilter()
   * @generated
   */
  EAttribute getLanguageCodeFilter_Op();

  /**
   * Returns the meta object for the attribute list '{@link com.b2international.snomed.ecl.ecl.LanguageCodeFilter#getLanguageCodes <em>Language Codes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Language Codes</em>'.
   * @see com.b2international.snomed.ecl.ecl.LanguageCodeFilter#getLanguageCodes()
   * @see #getLanguageCodeFilter()
   * @generated
   */
  EAttribute getLanguageCodeFilter_LanguageCodes();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TypeFilter <em>Type Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeFilter
   * @generated
   */
  EClass getTypeFilter();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.TypeFilter#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeFilter#getOp()
   * @see #getTypeFilter()
   * @generated
   */
  EAttribute getTypeFilter_Op();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TypeIdFilter <em>Type Id Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Id Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeIdFilter
   * @generated
   */
  EClass getTypeIdFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.TypeIdFilter#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeIdFilter#getType()
   * @see #getTypeIdFilter()
   * @generated
   */
  EReference getTypeIdFilter_Type();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.TypeTokenFilter <em>Type Token Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Token Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeTokenFilter
   * @generated
   */
  EClass getTypeTokenFilter();

  /**
   * Returns the meta object for the attribute list '{@link com.b2international.snomed.ecl.ecl.TypeTokenFilter#getTokens <em>Tokens</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Tokens</em>'.
   * @see com.b2international.snomed.ecl.ecl.TypeTokenFilter#getTokens()
   * @see #getTypeTokenFilter()
   * @generated
   */
  EAttribute getTypeTokenFilter_Tokens();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DialectFilter <em>Dialect Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialect Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectFilter
   * @generated
   */
  EClass getDialectFilter();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.DialectFilter#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectFilter#getOp()
   * @see #getDialectFilter()
   * @generated
   */
  EAttribute getDialectFilter_Op();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DialectIdFilter <em>Dialect Id Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialect Id Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectIdFilter
   * @generated
   */
  EClass getDialectIdFilter();

  /**
   * Returns the meta object for the containment reference list '{@link com.b2international.snomed.ecl.ecl.DialectIdFilter#getDialects <em>Dialects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dialects</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectIdFilter#getDialects()
   * @see #getDialectIdFilter()
   * @generated
   */
  EReference getDialectIdFilter_Dialects();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DialectAliasFilter <em>Dialect Alias Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialect Alias Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectAliasFilter
   * @generated
   */
  EClass getDialectAliasFilter();

  /**
   * Returns the meta object for the containment reference list '{@link com.b2international.snomed.ecl.ecl.DialectAliasFilter#getDialects <em>Dialects</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Dialects</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectAliasFilter#getDialects()
   * @see #getDialectAliasFilter()
   * @generated
   */
  EReference getDialectAliasFilter_Dialects();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Dialect <em>Dialect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialect</em>'.
   * @see com.b2international.snomed.ecl.ecl.Dialect
   * @generated
   */
  EClass getDialect();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.Dialect#getLanguageRefSetId <em>Language Ref Set Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Language Ref Set Id</em>'.
   * @see com.b2international.snomed.ecl.ecl.Dialect#getLanguageRefSetId()
   * @see #getDialect()
   * @generated
   */
  EReference getDialect_LanguageRefSetId();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.Dialect#getAcceptability <em>Acceptability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acceptability</em>'.
   * @see com.b2international.snomed.ecl.ecl.Dialect#getAcceptability()
   * @see #getDialect()
   * @generated
   */
  EReference getDialect_Acceptability();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DialectAlias <em>Dialect Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dialect Alias</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectAlias
   * @generated
   */
  EClass getDialectAlias();

  /**
   * Returns the meta object for the attribute '{@link com.b2international.snomed.ecl.ecl.DialectAlias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectAlias#getAlias()
   * @see #getDialectAlias()
   * @generated
   */
  EAttribute getDialectAlias_Alias();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DialectAlias#getAcceptability <em>Acceptability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acceptability</em>'.
   * @see com.b2international.snomed.ecl.ecl.DialectAlias#getAcceptability()
   * @see #getDialectAlias()
   * @generated
   */
  EReference getDialectAlias_Acceptability();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.Acceptability <em>Acceptability</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acceptability</em>'.
   * @see com.b2international.snomed.ecl.ecl.Acceptability
   * @generated
   */
  EClass getAcceptability();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AcceptabilityIdSet <em>Acceptability Id Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acceptability Id Set</em>'.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityIdSet
   * @generated
   */
  EClass getAcceptabilityIdSet();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AcceptabilityIdSet#getAcceptabilities <em>Acceptabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Acceptabilities</em>'.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityIdSet#getAcceptabilities()
   * @see #getAcceptabilityIdSet()
   * @generated
   */
  EReference getAcceptabilityIdSet_Acceptabilities();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet <em>Acceptability Token Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Acceptability Token Set</em>'.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet
   * @generated
   */
  EClass getAcceptabilityTokenSet();

  /**
   * Returns the meta object for the attribute list '{@link com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet#getAcceptabilities <em>Acceptabilities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Acceptabilities</em>'.
   * @see com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet#getAcceptabilities()
   * @see #getAcceptabilityTokenSet()
   * @generated
   */
  EAttribute getAcceptabilityTokenSet_Acceptabilities();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.OrExpressionConstraint <em>Or Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrExpressionConstraint
   * @generated
   */
  EClass getOrExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.OrExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrExpressionConstraint#getLeft()
   * @see #getOrExpressionConstraint()
   * @generated
   */
  EReference getOrExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.OrExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrExpressionConstraint#getRight()
   * @see #getOrExpressionConstraint()
   * @generated
   */
  EReference getOrExpressionConstraint_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AndExpressionConstraint <em>And Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndExpressionConstraint
   * @generated
   */
  EClass getAndExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AndExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndExpressionConstraint#getLeft()
   * @see #getAndExpressionConstraint()
   * @generated
   */
  EReference getAndExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AndExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndExpressionConstraint#getRight()
   * @see #getAndExpressionConstraint()
   * @generated
   */
  EReference getAndExpressionConstraint_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint <em>Exclusion Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusion Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint
   * @generated
   */
  EClass getExclusionExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint#getLeft()
   * @see #getExclusionExpressionConstraint()
   * @generated
   */
  EReference getExclusionExpressionConstraint_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint#getRight()
   * @see #getExclusionExpressionConstraint()
   * @generated
   */
  EReference getExclusionExpressionConstraint_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint <em>Refined Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Refined Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint
   * @generated
   */
  EClass getRefinedExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint#getConstraint()
   * @see #getRefinedExpressionConstraint()
   * @generated
   */
  EReference getRefinedExpressionConstraint_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint#getRefinement <em>Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint#getRefinement()
   * @see #getRefinedExpressionConstraint()
   * @generated
   */
  EReference getRefinedExpressionConstraint_Refinement();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint <em>Dotted Expression Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dotted Expression Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.DottedExpressionConstraint
   * @generated
   */
  EClass getDottedExpressionConstraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getConstraint <em>Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Constraint</em>'.
   * @see com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getConstraint()
   * @see #getDottedExpressionConstraint()
   * @generated
   */
  EReference getDottedExpressionConstraint_Constraint();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getAttribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attribute</em>'.
   * @see com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getAttribute()
   * @see #getDottedExpressionConstraint()
   * @generated
   */
  EReference getDottedExpressionConstraint_Attribute();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.OrRefinement <em>Or Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrRefinement
   * @generated
   */
  EClass getOrRefinement();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.OrRefinement#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrRefinement#getLeft()
   * @see #getOrRefinement()
   * @generated
   */
  EReference getOrRefinement_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.OrRefinement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.OrRefinement#getRight()
   * @see #getOrRefinement()
   * @generated
   */
  EReference getOrRefinement_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.AndRefinement <em>And Refinement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And Refinement</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndRefinement
   * @generated
   */
  EClass getAndRefinement();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AndRefinement#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndRefinement#getLeft()
   * @see #getAndRefinement()
   * @generated
   */
  EReference getAndRefinement_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.AndRefinement#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.AndRefinement#getRight()
   * @see #getAndRefinement()
   * @generated
   */
  EReference getAndRefinement_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.DisjunctionFilter <em>Disjunction Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Disjunction Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.DisjunctionFilter
   * @generated
   */
  EClass getDisjunctionFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DisjunctionFilter#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.DisjunctionFilter#getLeft()
   * @see #getDisjunctionFilter()
   * @generated
   */
  EReference getDisjunctionFilter_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.DisjunctionFilter#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.DisjunctionFilter#getRight()
   * @see #getDisjunctionFilter()
   * @generated
   */
  EReference getDisjunctionFilter_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ConjunctionFilter <em>Conjunction Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conjunction Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.ConjunctionFilter
   * @generated
   */
  EClass getConjunctionFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ConjunctionFilter#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.ConjunctionFilter#getLeft()
   * @see #getConjunctionFilter()
   * @generated
   */
  EReference getConjunctionFilter_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ConjunctionFilter#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.ConjunctionFilter#getRight()
   * @see #getConjunctionFilter()
   * @generated
   */
  EReference getConjunctionFilter_Right();

  /**
   * Returns the meta object for class '{@link com.b2international.snomed.ecl.ecl.ExclusionFilter <em>Exclusion Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exclusion Filter</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionFilter
   * @generated
   */
  EClass getExclusionFilter();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ExclusionFilter#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionFilter#getLeft()
   * @see #getExclusionFilter()
   * @generated
   */
  EReference getExclusionFilter_Left();

  /**
   * Returns the meta object for the containment reference '{@link com.b2international.snomed.ecl.ecl.ExclusionFilter#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see com.b2international.snomed.ecl.ecl.ExclusionFilter#getRight()
   * @see #getExclusionFilter()
   * @generated
   */
  EReference getExclusionFilter_Right();

  /**
   * Returns the meta object for enum '{@link com.b2international.snomed.ecl.ecl.LexicalSearchType <em>Lexical Search Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Lexical Search Type</em>'.
   * @see com.b2international.snomed.ecl.ecl.LexicalSearchType
   * @generated
   */
  EEnum getLexicalSearchType();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EclFactory getEclFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ScriptImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__CONSTRAINT = eINSTANCE.getScript_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ExpressionConstraintImpl <em>Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExpressionConstraint()
     * @generated
     */
    EClass EXPRESSION_CONSTRAINT = eINSTANCE.getExpressionConstraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ChildOfImpl <em>Child Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ChildOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getChildOf()
     * @generated
     */
    EClass CHILD_OF = eINSTANCE.getChildOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_OF__CONSTRAINT = eINSTANCE.getChildOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ChildOrSelfOfImpl <em>Child Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ChildOrSelfOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getChildOrSelfOf()
     * @generated
     */
    EClass CHILD_OR_SELF_OF = eINSTANCE.getChildOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CHILD_OR_SELF_OF__CONSTRAINT = eINSTANCE.getChildOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DescendantOfImpl <em>Descendant Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DescendantOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOf()
     * @generated
     */
    EClass DESCENDANT_OF = eINSTANCE.getDescendantOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_OF__CONSTRAINT = eINSTANCE.getDescendantOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl <em>Descendant Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DescendantOrSelfOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDescendantOrSelfOf()
     * @generated
     */
    EClass DESCENDANT_OR_SELF_OF = eINSTANCE.getDescendantOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCENDANT_OR_SELF_OF__CONSTRAINT = eINSTANCE.getDescendantOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ParentOfImpl <em>Parent Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ParentOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getParentOf()
     * @generated
     */
    EClass PARENT_OF = eINSTANCE.getParentOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT_OF__CONSTRAINT = eINSTANCE.getParentOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ParentOrSelfOfImpl <em>Parent Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ParentOrSelfOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getParentOrSelfOf()
     * @generated
     */
    EClass PARENT_OR_SELF_OF = eINSTANCE.getParentOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT_OR_SELF_OF__CONSTRAINT = eINSTANCE.getParentOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AncestorOfImpl <em>Ancestor Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AncestorOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOf()
     * @generated
     */
    EClass ANCESTOR_OF = eINSTANCE.getAncestorOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCESTOR_OF__CONSTRAINT = eINSTANCE.getAncestorOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl <em>Ancestor Or Self Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AncestorOrSelfOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAncestorOrSelfOf()
     * @generated
     */
    EClass ANCESTOR_OR_SELF_OF = eINSTANCE.getAncestorOrSelfOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ANCESTOR_OR_SELF_OF__CONSTRAINT = eINSTANCE.getAncestorOrSelfOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.MemberOfImpl <em>Member Of</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.MemberOfImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getMemberOf()
     * @generated
     */
    EClass MEMBER_OF = eINSTANCE.getMemberOf();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMBER_OF__CONSTRAINT = eINSTANCE.getMemberOf_Constraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceImpl <em>Concept Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclConceptReference()
     * @generated
     */
    EClass ECL_CONCEPT_REFERENCE = eINSTANCE.getEclConceptReference();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECL_CONCEPT_REFERENCE__ID = eINSTANCE.getEclConceptReference_Id();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ECL_CONCEPT_REFERENCE__TERM = eINSTANCE.getEclConceptReference_Term();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceSetImpl <em>Concept Reference Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.EclConceptReferenceSetImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclConceptReferenceSet()
     * @generated
     */
    EClass ECL_CONCEPT_REFERENCE_SET = eINSTANCE.getEclConceptReferenceSet();

    /**
     * The meta object literal for the '<em><b>Concepts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECL_CONCEPT_REFERENCE_SET__CONCEPTS = eINSTANCE.getEclConceptReferenceSet_Concepts();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AnyImpl <em>Any</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AnyImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAny()
     * @generated
     */
    EClass ANY = eINSTANCE.getAny();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.EclRefinementImpl <em>Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.EclRefinementImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclRefinement()
     * @generated
     */
    EClass ECL_REFINEMENT = eINSTANCE.getEclRefinement();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedRefinementImpl <em>Nested Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.NestedRefinementImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedRefinement()
     * @generated
     */
    EClass NESTED_REFINEMENT = eINSTANCE.getNestedRefinement();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_REFINEMENT__NESTED = eINSTANCE.getNestedRefinement_Nested();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.EclAttributeGroupImpl <em>Attribute Group</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.EclAttributeGroupImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getEclAttributeGroup()
     * @generated
     */
    EClass ECL_ATTRIBUTE_GROUP = eINSTANCE.getEclAttributeGroup();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECL_ATTRIBUTE_GROUP__CARDINALITY = eINSTANCE.getEclAttributeGroup_Cardinality();

    /**
     * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECL_ATTRIBUTE_GROUP__REFINEMENT = eINSTANCE.getEclAttributeGroup_Refinement();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AttributeConstraintImpl <em>Attribute Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AttributeConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeConstraint()
     * @generated
     */
    EClass ATTRIBUTE_CONSTRAINT = eINSTANCE.getAttributeConstraint();

    /**
     * The meta object literal for the '<em><b>Cardinality</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_CONSTRAINT__CARDINALITY = eINSTANCE.getAttributeConstraint_Cardinality();

    /**
     * The meta object literal for the '<em><b>Reversed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_CONSTRAINT__REVERSED = eINSTANCE.getAttributeConstraint_Reversed();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_CONSTRAINT__ATTRIBUTE = eINSTANCE.getAttributeConstraint_Attribute();

    /**
     * The meta object literal for the '<em><b>Comparison</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_CONSTRAINT__COMPARISON = eINSTANCE.getAttributeConstraint_Comparison();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.CardinalityImpl <em>Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.CardinalityImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getCardinality()
     * @generated
     */
    EClass CARDINALITY = eINSTANCE.getCardinality();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY__MIN = eINSTANCE.getCardinality_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CARDINALITY__MAX = eINSTANCE.getCardinality_Max();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AttributeComparisonImpl <em>Attribute Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AttributeComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAttributeComparison()
     * @generated
     */
    EClass ATTRIBUTE_COMPARISON = eINSTANCE.getAttributeComparison();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_COMPARISON__VALUE = eINSTANCE.getAttributeComparison_Value();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DataTypeComparisonImpl <em>Data Type Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DataTypeComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDataTypeComparison()
     * @generated
     */
    EClass DATA_TYPE_COMPARISON = eINSTANCE.getDataTypeComparison();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.BooleanValueComparisonImpl <em>Boolean Value Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.BooleanValueComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getBooleanValueComparison()
     * @generated
     */
    EClass BOOLEAN_VALUE_COMPARISON = eINSTANCE.getBooleanValueComparison();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOLEAN_VALUE_COMPARISON__VALUE = eINSTANCE.getBooleanValueComparison_Value();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.StringValueComparisonImpl <em>String Value Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.StringValueComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getStringValueComparison()
     * @generated
     */
    EClass STRING_VALUE_COMPARISON = eINSTANCE.getStringValueComparison();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STRING_VALUE_COMPARISON__VALUE = eINSTANCE.getStringValueComparison_Value();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.IntegerValueComparisonImpl <em>Integer Value Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.IntegerValueComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getIntegerValueComparison()
     * @generated
     */
    EClass INTEGER_VALUE_COMPARISON = eINSTANCE.getIntegerValueComparison();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INTEGER_VALUE_COMPARISON__VALUE = eINSTANCE.getIntegerValueComparison_Value();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DecimalValueComparisonImpl <em>Decimal Value Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DecimalValueComparisonImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDecimalValueComparison()
     * @generated
     */
    EClass DECIMAL_VALUE_COMPARISON = eINSTANCE.getDecimalValueComparison();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DECIMAL_VALUE_COMPARISON__VALUE = eINSTANCE.getDecimalValueComparison_Value();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedExpressionImpl <em>Nested Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.NestedExpressionImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedExpression()
     * @generated
     */
    EClass NESTED_EXPRESSION = eINSTANCE.getNestedExpression();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_EXPRESSION__NESTED = eINSTANCE.getNestedExpression_Nested();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.FilterConstraintImpl <em>Filter Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.FilterConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getFilterConstraint()
     * @generated
     */
    EClass FILTER_CONSTRAINT = eINSTANCE.getFilterConstraint();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.FilterImpl <em>Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.FilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getFilter()
     * @generated
     */
    EClass FILTER = eINSTANCE.getFilter();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.NestedFilterImpl <em>Nested Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.NestedFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getNestedFilter()
     * @generated
     */
    EClass NESTED_FILTER = eINSTANCE.getNestedFilter();

    /**
     * The meta object literal for the '<em><b>Nested</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NESTED_FILTER__NESTED = eINSTANCE.getNestedFilter_Nested();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.PropertyFilterImpl <em>Property Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.PropertyFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getPropertyFilter()
     * @generated
     */
    EClass PROPERTY_FILTER = eINSTANCE.getPropertyFilter();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TermFilterImpl <em>Term Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TermFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTermFilter()
     * @generated
     */
    EClass TERM_FILTER = eINSTANCE.getTermFilter();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TERM_FILTER__OP = eINSTANCE.getTermFilter_Op();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TypedTermFilterImpl <em>Typed Term Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TypedTermFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypedTermFilter()
     * @generated
     */
    EClass TYPED_TERM_FILTER = eINSTANCE.getTypedTermFilter();

    /**
     * The meta object literal for the '<em><b>Lexical Search Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_TERM_FILTER__LEXICAL_SEARCH_TYPE = eINSTANCE.getTypedTermFilter_LexicalSearchType();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPED_TERM_FILTER__TERM = eINSTANCE.getTypedTermFilter_Term();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TypedTermFilterSetImpl <em>Typed Term Filter Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TypedTermFilterSetImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypedTermFilterSet()
     * @generated
     */
    EClass TYPED_TERM_FILTER_SET = eINSTANCE.getTypedTermFilterSet();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPED_TERM_FILTER_SET__TERMS = eINSTANCE.getTypedTermFilterSet_Terms();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.LanguageCodeFilterImpl <em>Language Code Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.LanguageCodeFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getLanguageCodeFilter()
     * @generated
     */
    EClass LANGUAGE_CODE_FILTER = eINSTANCE.getLanguageCodeFilter();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_CODE_FILTER__OP = eINSTANCE.getLanguageCodeFilter_Op();

    /**
     * The meta object literal for the '<em><b>Language Codes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LANGUAGE_CODE_FILTER__LANGUAGE_CODES = eINSTANCE.getLanguageCodeFilter_LanguageCodes();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeFilterImpl <em>Type Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TypeFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeFilter()
     * @generated
     */
    EClass TYPE_FILTER = eINSTANCE.getTypeFilter();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_FILTER__OP = eINSTANCE.getTypeFilter_Op();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeIdFilterImpl <em>Type Id Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TypeIdFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeIdFilter()
     * @generated
     */
    EClass TYPE_ID_FILTER = eINSTANCE.getTypeIdFilter();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_ID_FILTER__TYPE = eINSTANCE.getTypeIdFilter_Type();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.TypeTokenFilterImpl <em>Type Token Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.TypeTokenFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getTypeTokenFilter()
     * @generated
     */
    EClass TYPE_TOKEN_FILTER = eINSTANCE.getTypeTokenFilter();

    /**
     * The meta object literal for the '<em><b>Tokens</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_TOKEN_FILTER__TOKENS = eINSTANCE.getTypeTokenFilter_Tokens();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectFilterImpl <em>Dialect Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DialectFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectFilter()
     * @generated
     */
    EClass DIALECT_FILTER = eINSTANCE.getDialectFilter();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALECT_FILTER__OP = eINSTANCE.getDialectFilter_Op();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectIdFilterImpl <em>Dialect Id Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DialectIdFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectIdFilter()
     * @generated
     */
    EClass DIALECT_ID_FILTER = eINSTANCE.getDialectIdFilter();

    /**
     * The meta object literal for the '<em><b>Dialects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALECT_ID_FILTER__DIALECTS = eINSTANCE.getDialectIdFilter_Dialects();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectAliasFilterImpl <em>Dialect Alias Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DialectAliasFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectAliasFilter()
     * @generated
     */
    EClass DIALECT_ALIAS_FILTER = eINSTANCE.getDialectAliasFilter();

    /**
     * The meta object literal for the '<em><b>Dialects</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALECT_ALIAS_FILTER__DIALECTS = eINSTANCE.getDialectAliasFilter_Dialects();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectImpl <em>Dialect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DialectImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialect()
     * @generated
     */
    EClass DIALECT = eINSTANCE.getDialect();

    /**
     * The meta object literal for the '<em><b>Language Ref Set Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALECT__LANGUAGE_REF_SET_ID = eINSTANCE.getDialect_LanguageRefSetId();

    /**
     * The meta object literal for the '<em><b>Acceptability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALECT__ACCEPTABILITY = eINSTANCE.getDialect_Acceptability();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DialectAliasImpl <em>Dialect Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DialectAliasImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDialectAlias()
     * @generated
     */
    EClass DIALECT_ALIAS = eINSTANCE.getDialectAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIALECT_ALIAS__ALIAS = eINSTANCE.getDialectAlias_Alias();

    /**
     * The meta object literal for the '<em><b>Acceptability</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIALECT_ALIAS__ACCEPTABILITY = eINSTANCE.getDialectAlias_Acceptability();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityImpl <em>Acceptability</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptability()
     * @generated
     */
    EClass ACCEPTABILITY = eINSTANCE.getAcceptability();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityIdSetImpl <em>Acceptability Id Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityIdSetImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptabilityIdSet()
     * @generated
     */
    EClass ACCEPTABILITY_ID_SET = eINSTANCE.getAcceptabilityIdSet();

    /**
     * The meta object literal for the '<em><b>Acceptabilities</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACCEPTABILITY_ID_SET__ACCEPTABILITIES = eINSTANCE.getAcceptabilityIdSet_Acceptabilities();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityTokenSetImpl <em>Acceptability Token Set</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AcceptabilityTokenSetImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAcceptabilityTokenSet()
     * @generated
     */
    EClass ACCEPTABILITY_TOKEN_SET = eINSTANCE.getAcceptabilityTokenSet();

    /**
     * The meta object literal for the '<em><b>Acceptabilities</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACCEPTABILITY_TOKEN_SET__ACCEPTABILITIES = eINSTANCE.getAcceptabilityTokenSet_Acceptabilities();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.OrExpressionConstraintImpl <em>Or Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.OrExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getOrExpressionConstraint()
     * @generated
     */
    EClass OR_EXPRESSION_CONSTRAINT = eINSTANCE.getOrExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getOrExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getOrExpressionConstraint_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AndExpressionConstraintImpl <em>And Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AndExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAndExpressionConstraint()
     * @generated
     */
    EClass AND_EXPRESSION_CONSTRAINT = eINSTANCE.getAndExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getAndExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getAndExpressionConstraint_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl <em>Exclusion Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ExclusionExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionExpressionConstraint()
     * @generated
     */
    EClass EXCLUSION_EXPRESSION_CONSTRAINT = eINSTANCE.getExclusionExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_EXPRESSION_CONSTRAINT__LEFT = eINSTANCE.getExclusionExpressionConstraint_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT = eINSTANCE.getExclusionExpressionConstraint_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl <em>Refined Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.RefinedExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getRefinedExpressionConstraint()
     * @generated
     */
    EClass REFINED_EXPRESSION_CONSTRAINT = eINSTANCE.getRefinedExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT = eINSTANCE.getRefinedExpressionConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Refinement</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFINED_EXPRESSION_CONSTRAINT__REFINEMENT = eINSTANCE.getRefinedExpressionConstraint_Refinement();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DottedExpressionConstraintImpl <em>Dotted Expression Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DottedExpressionConstraintImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDottedExpressionConstraint()
     * @generated
     */
    EClass DOTTED_EXPRESSION_CONSTRAINT = eINSTANCE.getDottedExpressionConstraint();

    /**
     * The meta object literal for the '<em><b>Constraint</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION_CONSTRAINT__CONSTRAINT = eINSTANCE.getDottedExpressionConstraint_Constraint();

    /**
     * The meta object literal for the '<em><b>Attribute</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOTTED_EXPRESSION_CONSTRAINT__ATTRIBUTE = eINSTANCE.getDottedExpressionConstraint_Attribute();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.OrRefinementImpl <em>Or Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.OrRefinementImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getOrRefinement()
     * @generated
     */
    EClass OR_REFINEMENT = eINSTANCE.getOrRefinement();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_REFINEMENT__LEFT = eINSTANCE.getOrRefinement_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR_REFINEMENT__RIGHT = eINSTANCE.getOrRefinement_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.AndRefinementImpl <em>And Refinement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.AndRefinementImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getAndRefinement()
     * @generated
     */
    EClass AND_REFINEMENT = eINSTANCE.getAndRefinement();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_REFINEMENT__LEFT = eINSTANCE.getAndRefinement_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND_REFINEMENT__RIGHT = eINSTANCE.getAndRefinement_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.DisjunctionFilterImpl <em>Disjunction Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.DisjunctionFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getDisjunctionFilter()
     * @generated
     */
    EClass DISJUNCTION_FILTER = eINSTANCE.getDisjunctionFilter();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJUNCTION_FILTER__LEFT = eINSTANCE.getDisjunctionFilter_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DISJUNCTION_FILTER__RIGHT = eINSTANCE.getDisjunctionFilter_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ConjunctionFilterImpl <em>Conjunction Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ConjunctionFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getConjunctionFilter()
     * @generated
     */
    EClass CONJUNCTION_FILTER = eINSTANCE.getConjunctionFilter();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION_FILTER__LEFT = eINSTANCE.getConjunctionFilter_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONJUNCTION_FILTER__RIGHT = eINSTANCE.getConjunctionFilter_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.impl.ExclusionFilterImpl <em>Exclusion Filter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.impl.ExclusionFilterImpl
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getExclusionFilter()
     * @generated
     */
    EClass EXCLUSION_FILTER = eINSTANCE.getExclusionFilter();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_FILTER__LEFT = eINSTANCE.getExclusionFilter_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXCLUSION_FILTER__RIGHT = eINSTANCE.getExclusionFilter_Right();

    /**
     * The meta object literal for the '{@link com.b2international.snomed.ecl.ecl.LexicalSearchType <em>Lexical Search Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.b2international.snomed.ecl.ecl.LexicalSearchType
     * @see com.b2international.snomed.ecl.ecl.impl.EclPackageImpl#getLexicalSearchType()
     * @generated
     */
    EEnum LEXICAL_SEARCH_TYPE = eINSTANCE.getLexicalSearchType();

  }

} //EclPackage
