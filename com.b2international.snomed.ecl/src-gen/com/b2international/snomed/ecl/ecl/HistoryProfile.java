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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>History Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.HistoryProfile#getProfile <em>Profile</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getHistoryProfile()
 * @model
 * @generated
 */
public interface HistoryProfile extends EObject
{
  /**
   * Returns the value of the '<em><b>Profile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Profile</em>' attribute.
   * @see #setProfile(String)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getHistoryProfile_Profile()
   * @model
   * @generated
   */
  String getProfile();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.HistoryProfile#getProfile <em>Profile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Profile</em>' attribute.
   * @see #getProfile()
   * @generated
   */
  void setProfile(String value);

} // HistoryProfile
