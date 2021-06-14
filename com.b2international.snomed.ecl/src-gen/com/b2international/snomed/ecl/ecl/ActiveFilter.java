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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Active Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.ActiveFilter#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.ActiveFilter#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getActiveFilter()
 * @model
 * @generated
 */
public interface ActiveFilter extends PropertyFilter
{
  /**
   * Returns the value of the '<em><b>Domain</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Domain</em>' attribute.
   * @see #setDomain(String)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getActiveFilter_Domain()
   * @model
   * @generated
   */
  String getDomain();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.ActiveFilter#getDomain <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Domain</em>' attribute.
   * @see #getDomain()
   * @generated
   */
  void setDomain(String value);

  /**
   * Returns the value of the '<em><b>Active</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Active</em>' attribute.
   * @see #setActive(boolean)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getActiveFilter_Active()
   * @model
   * @generated
   */
  boolean isActive();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.ActiveFilter#isActive <em>Active</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Active</em>' attribute.
   * @see #isActive()
   * @generated
   */
  void setActive(boolean value);

} // ActiveFilter
