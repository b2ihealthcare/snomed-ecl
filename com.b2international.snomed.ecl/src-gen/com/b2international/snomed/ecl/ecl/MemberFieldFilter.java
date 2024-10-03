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
 * A representation of the model object '<em><b>Member Field Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.MemberFieldFilter#getRefsetFieldName <em>Refset Field Name</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.MemberFieldFilter#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getMemberFieldFilter()
 * @model
 * @generated
 */
public interface MemberFieldFilter extends PropertyFilter
{
  /**
   * Returns the value of the '<em><b>Refset Field Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refset Field Name</em>' attribute.
   * @see #setRefsetFieldName(String)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getMemberFieldFilter_RefsetFieldName()
   * @model
   * @generated
   */
  String getRefsetFieldName();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.MemberFieldFilter#getRefsetFieldName <em>Refset Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Refset Field Name</em>' attribute.
   * @see #getRefsetFieldName()
   * @generated
   */
  void setRefsetFieldName(String value);

  /**
   * Returns the value of the '<em><b>Comparison</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comparison</em>' containment reference.
   * @see #setComparison(Comparison)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getMemberFieldFilter_Comparison()
   * @model containment="true"
   * @generated
   */
  Comparison getComparison();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.MemberFieldFilter#getComparison <em>Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comparison</em>' containment reference.
   * @see #getComparison()
   * @generated
   */
  void setComparison(Comparison value);

} // MemberFieldFilter
