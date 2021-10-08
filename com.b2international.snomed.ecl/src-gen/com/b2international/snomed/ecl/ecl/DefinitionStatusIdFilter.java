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
 * A representation of the model object '<em><b>Definition Status Id Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter#getDefinitionStatus <em>Definition Status</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getDefinitionStatusIdFilter()
 * @model
 * @generated
 */
public interface DefinitionStatusIdFilter extends DefinitionStatusFilter
{
  /**
   * Returns the value of the '<em><b>Definition Status</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Definition Status</em>' containment reference.
   * @see #setDefinitionStatus(FilterValue)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getDefinitionStatusIdFilter_DefinitionStatus()
   * @model containment="true"
   * @generated
   */
  FilterValue getDefinitionStatus();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter#getDefinitionStatus <em>Definition Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Definition Status</em>' containment reference.
   * @see #getDefinitionStatus()
   * @generated
   */
  void setDefinitionStatus(FilterValue value);

} // DefinitionStatusIdFilter
