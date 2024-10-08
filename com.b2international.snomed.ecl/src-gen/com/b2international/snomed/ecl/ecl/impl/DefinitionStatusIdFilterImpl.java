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
package com.b2international.snomed.ecl.ecl.impl;

import com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.FilterValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition Status Id Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.DefinitionStatusIdFilterImpl#getDefinitionStatus <em>Definition Status</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefinitionStatusIdFilterImpl extends DefinitionStatusFilterImpl implements DefinitionStatusIdFilter
{
  /**
   * The cached value of the '{@link #getDefinitionStatus() <em>Definition Status</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefinitionStatus()
   * @generated
   * @ordered
   */
  protected FilterValue definitionStatus;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DefinitionStatusIdFilterImpl()
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
    return EclPackage.Literals.DEFINITION_STATUS_ID_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterValue getDefinitionStatus()
  {
    return definitionStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDefinitionStatus(FilterValue newDefinitionStatus, NotificationChain msgs)
  {
    FilterValue oldDefinitionStatus = definitionStatus;
    definitionStatus = newDefinitionStatus;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS, oldDefinitionStatus, newDefinitionStatus);
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
  public void setDefinitionStatus(FilterValue newDefinitionStatus)
  {
    if (newDefinitionStatus != definitionStatus)
    {
      NotificationChain msgs = null;
      if (definitionStatus != null)
        msgs = ((InternalEObject)definitionStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS, null, msgs);
      if (newDefinitionStatus != null)
        msgs = ((InternalEObject)newDefinitionStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS, null, msgs);
      msgs = basicSetDefinitionStatus(newDefinitionStatus, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS, newDefinitionStatus, newDefinitionStatus));
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
      case EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS:
        return basicSetDefinitionStatus(null, msgs);
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
      case EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS:
        return getDefinitionStatus();
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
      case EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS:
        setDefinitionStatus((FilterValue)newValue);
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
      case EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS:
        setDefinitionStatus((FilterValue)null);
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
      case EclPackage.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS:
        return definitionStatus != null;
    }
    return super.eIsSet(featureID);
  }

} //DefinitionStatusIdFilterImpl
