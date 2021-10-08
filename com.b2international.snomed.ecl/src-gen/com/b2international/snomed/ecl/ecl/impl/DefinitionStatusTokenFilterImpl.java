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
package com.b2international.snomed.ecl.ecl.impl;

import com.b2international.snomed.ecl.ecl.DefinitionStatusTokenFilter;
import com.b2international.snomed.ecl.ecl.EclPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Status Token Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.DefinitionStatusTokenFilterImpl#getDefinitionStatusTokens <em>Definition Status Tokens</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionStatusTokenFilterImpl extends DefinitionStatusFilterImpl implements DefinitionStatusTokenFilter
{
  /**
   * The cached value of the '{@link #getDefinitionStatusTokens() <em>Definition Status Tokens</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionStatusTokens()
   * @generated
   * @ordered
   */
  protected EList<String> definitionStatusTokens;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionStatusTokenFilterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EclPackage.Literals.DEFINITION_STATUS_TOKEN_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<String> getDefinitionStatusTokens()
  {
    if (definitionStatusTokens == null)
    {
      definitionStatusTokens = new EDataTypeEList<String>(String.class, this, EclPackage.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS);
    }
    return definitionStatusTokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS:
        return getDefinitionStatusTokens();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS:
        getDefinitionStatusTokens().clear();
        getDefinitionStatusTokens().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS:
        getDefinitionStatusTokens().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER__DEFINITION_STATUS_TOKENS:
        return definitionStatusTokens != null && !definitionStatusTokens.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (definitionStatusTokens: ");
    result.append(definitionStatusTokens);
    result.append(')');
    return result.toString();
  }

} //DefinitionStatusTokenFilterImpl
