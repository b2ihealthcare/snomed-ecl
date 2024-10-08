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
 * A representation of the model object '<em><b>Case Significance Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.CaseSignificanceFilter#getCaseSignificanceId <em>Case Significance Id</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getCaseSignificanceFilter()
 * @model
 * @generated
 */
public interface CaseSignificanceFilter extends PropertyFilter
{
  /**
   * Returns the value of the '<em><b>Case Significance Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Case Significance Id</em>' containment reference.
   * @see #setCaseSignificanceId(FilterValue)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getCaseSignificanceFilter_CaseSignificanceId()
   * @model containment="true"
   * @generated
   */
  FilterValue getCaseSignificanceId();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.CaseSignificanceFilter#getCaseSignificanceId <em>Case Significance Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Case Significance Id</em>' containment reference.
   * @see #getCaseSignificanceId()
   * @generated
   */
  void setCaseSignificanceId(FilterValue value);

} // CaseSignificanceFilter
