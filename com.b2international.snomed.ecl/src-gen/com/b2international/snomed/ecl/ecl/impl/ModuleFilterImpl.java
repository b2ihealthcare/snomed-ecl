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

import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.FilterValue;
import com.b2international.snomed.ecl.ecl.ModuleFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.ModuleFilterImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.ModuleFilterImpl#getModuleId <em>Module Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModuleFilterImpl extends PropertyFilterImpl implements ModuleFilter
{
  /**
   * The default value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected static final String OP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOp() <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOp()
   * @generated
   * @ordered
   */
  protected String op = OP_EDEFAULT;

  /**
   * The cached value of the '{@link #getModuleId() <em>Module Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModuleId()
   * @generated
   * @ordered
   */
  protected FilterValue moduleId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModuleFilterImpl()
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
    return EclPackage.Literals.MODULE_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getOp()
  {
    return op;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setOp(String newOp)
  {
    String oldOp = op;
    op = newOp;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.MODULE_FILTER__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterValue getModuleId()
  {
    return moduleId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModuleId(FilterValue newModuleId, NotificationChain msgs)
  {
    FilterValue oldModuleId = moduleId;
    moduleId = newModuleId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.MODULE_FILTER__MODULE_ID, oldModuleId, newModuleId);
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
  public void setModuleId(FilterValue newModuleId)
  {
    if (newModuleId != moduleId)
    {
      NotificationChain msgs = null;
      if (moduleId != null)
        msgs = ((InternalEObject)moduleId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.MODULE_FILTER__MODULE_ID, null, msgs);
      if (newModuleId != null)
        msgs = ((InternalEObject)newModuleId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.MODULE_FILTER__MODULE_ID, null, msgs);
      msgs = basicSetModuleId(newModuleId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.MODULE_FILTER__MODULE_ID, newModuleId, newModuleId));
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
      case EclPackage.MODULE_FILTER__MODULE_ID:
        return basicSetModuleId(null, msgs);
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
      case EclPackage.MODULE_FILTER__OP:
        return getOp();
      case EclPackage.MODULE_FILTER__MODULE_ID:
        return getModuleId();
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
      case EclPackage.MODULE_FILTER__OP:
        setOp((String)newValue);
        return;
      case EclPackage.MODULE_FILTER__MODULE_ID:
        setModuleId((FilterValue)newValue);
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
      case EclPackage.MODULE_FILTER__OP:
        setOp(OP_EDEFAULT);
        return;
      case EclPackage.MODULE_FILTER__MODULE_ID:
        setModuleId((FilterValue)null);
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
      case EclPackage.MODULE_FILTER__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EclPackage.MODULE_FILTER__MODULE_ID:
        return moduleId != null;
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
    result.append(" (op: ");
    result.append(op);
    result.append(')');
    return result.toString();
  }

} //ModuleFilterImpl
