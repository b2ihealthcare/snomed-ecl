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
 * A representation of the model object '<em><b>Acceptability Id Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.AcceptabilityIdSet#getAcceptabilities <em>Acceptabilities</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getAcceptabilityIdSet()
 * @model
 * @generated
 */
public interface AcceptabilityIdSet extends Acceptability
{
  /**
   * Returns the value of the '<em><b>Acceptabilities</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Acceptabilities</em>' containment reference.
   * @see #setAcceptabilities(EclConceptReferenceSet)
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getAcceptabilityIdSet_Acceptabilities()
   * @model containment="true"
   * @generated
   */
  EclConceptReferenceSet getAcceptabilities();

  /**
   * Sets the value of the '{@link com.b2international.snomed.ecl.ecl.AcceptabilityIdSet#getAcceptabilities <em>Acceptabilities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Acceptabilities</em>' containment reference.
   * @see #getAcceptabilities()
   * @generated
   */
  void setAcceptabilities(EclConceptReferenceSet value);

} // AcceptabilityIdSet
