/**
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dotted Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getDottedExpressionConstraint()
 * @model
 * @generated
 */
public interface DottedExpressionConstraint extends ExpressionConstraint
{
  /**
   * Returns the value of the '<em><b>Constraint</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constraint</em>' containment reference.
   * @see #setConstraint(ExpressionConstraint)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getDottedExpressionConstraint_Constraint()
   * @model containment="true"
   * @generated
   */
  ExpressionConstraint getConstraint();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getConstraint <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constraint</em>' containment reference.
   * @see #getConstraint()
   * @generated
   */
  void setConstraint(ExpressionConstraint value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference.
   * @see #setAttribute(ExpressionConstraint)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getDottedExpressionConstraint_Attribute()
   * @model containment="true"
   * @generated
   */
  ExpressionConstraint getAttribute();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.DottedExpressionConstraint#getAttribute <em>Attribute</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attribute</em>' containment reference.
   * @see #getAttribute()
   * @generated
   */
  void setAttribute(ExpressionConstraint value);

} // DottedExpressionConstraint
