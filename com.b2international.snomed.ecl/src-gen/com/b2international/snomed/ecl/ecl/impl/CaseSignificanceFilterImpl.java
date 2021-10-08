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

import com.b2international.snomed.ecl.ecl.CaseSignificanceFilter;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.FilterValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Significance Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.CaseSignificanceFilterImpl#getCaseSignificanceId <em>Case Significance Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CaseSignificanceFilterImpl extends PropertyFilterImpl implements CaseSignificanceFilter
{
  /**
   * The cached value of the '{@link #getCaseSignificanceId() <em>Case Significance Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCaseSignificanceId()
   * @generated
   * @ordered
   */
  protected FilterValue caseSignificanceId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CaseSignificanceFilterImpl()
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
    return EclPackage.Literals.CASE_SIGNIFICANCE_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterValue getCaseSignificanceId()
  {
    return caseSignificanceId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCaseSignificanceId(FilterValue newCaseSignificanceId, NotificationChain msgs)
  {
    FilterValue oldCaseSignificanceId = caseSignificanceId;
    caseSignificanceId = newCaseSignificanceId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID, oldCaseSignificanceId, newCaseSignificanceId);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCaseSignificanceId(FilterValue newCaseSignificanceId)
  {
    if (newCaseSignificanceId != caseSignificanceId)
    {
      NotificationChain msgs = null;
      if (caseSignificanceId != null)
        msgs = ((InternalEObject)caseSignificanceId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID, null, msgs);
      if (newCaseSignificanceId != null)
        msgs = ((InternalEObject)newCaseSignificanceId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID, null, msgs);
      msgs = basicSetCaseSignificanceId(newCaseSignificanceId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID, newCaseSignificanceId, newCaseSignificanceId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID:
        return basicSetCaseSignificanceId(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID:
        return getCaseSignificanceId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID:
        setCaseSignificanceId((FilterValue)newValue);
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
      case EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID:
        setCaseSignificanceId((FilterValue)null);
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
      case EclPackage.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID:
        return caseSignificanceId != null;
    }
    return super.eIsSet(featureID);
  }

} //CaseSignificanceFilterImpl
