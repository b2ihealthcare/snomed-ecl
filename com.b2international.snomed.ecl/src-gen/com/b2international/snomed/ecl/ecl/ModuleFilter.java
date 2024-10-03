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
 * A representation of the model object '<em><b>Module Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.ModuleFilter#getOp <em>Op</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.ModuleFilter#getModuleId <em>Module Id</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getModuleFilter()
 * @model
 * @generated
 */
public interface ModuleFilter extends PropertyFilter
{
  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getModuleFilter_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.ModuleFilter#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Module Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Module Id</em>' containment reference.
   * @see #setModuleId(FilterValue)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getModuleFilter_ModuleId()
   * @model containment="true"
   * @generated
   */
  FilterValue getModuleId();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.ModuleFilter#getModuleId <em>Module Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Module Id</em>' containment reference.
   * @see #getModuleId()
   * @generated
   */
  void setModuleId(FilterValue value);

} // ModuleFilter
