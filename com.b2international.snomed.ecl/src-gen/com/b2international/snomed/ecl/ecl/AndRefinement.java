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
 * A representation of the model object '<em><b>And Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.AndRefinement#getLeft <em>Left</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.AndRefinement#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getAndRefinement()
 * @model
 * @generated
 */
public interface AndRefinement extends EclRefinement
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(EclRefinement)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getAndRefinement_Left()
   * @model containment="true"
   * @generated
   */
  EclRefinement getLeft();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.AndRefinement#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(EclRefinement value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(EclRefinement)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getAndRefinement_Right()
   * @model containment="true"
   * @generated
   */
  EclRefinement getRight();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.AndRefinement#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(EclRefinement value);

} // AndRefinement
