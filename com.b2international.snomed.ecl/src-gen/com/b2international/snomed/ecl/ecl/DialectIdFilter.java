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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dialect Id Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.DialectIdFilter#getDialects <em>Dialects</em>}</li>
 * </ul>
 *
 * @see com.b2international.snomed.ecl.ecl.EclPackage#getDialectIdFilter()
 * @model
 * @generated
 */
public interface DialectIdFilter extends DialectFilter
{
  /**
   * Returns the value of the '<em><b>Dialects</b></em>' containment reference list.
   * The list contents are of type {@link com.b2international.snomed.ecl.ecl.Dialect}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dialects</em>' containment reference list.
   * @see com.b2international.snomed.ecl.ecl.EclPackage#getDialectIdFilter_Dialects()
   * @model containment="true"
   * @generated
   */
  EList<Dialect> getDialects();

} // DialectIdFilter
