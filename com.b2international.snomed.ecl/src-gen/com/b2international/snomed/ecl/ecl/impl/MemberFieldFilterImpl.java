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

import com.b2international.snomed.ecl.ecl.Comparison;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.MemberFieldFilter;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member Field Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.MemberFieldFilterImpl#getRefsetFieldName <em>Refset Field Name</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.MemberFieldFilterImpl#getComparison <em>Comparison</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemberFieldFilterImpl extends PropertyFilterImpl implements MemberFieldFilter
{
  /**
   * The default value of the '{@link #getRefsetFieldName() <em>Refset Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefsetFieldName()
   * @generated
   * @ordered
   */
  protected static final String REFSET_FIELD_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRefsetFieldName() <em>Refset Field Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefsetFieldName()
   * @generated
   * @ordered
   */
  protected String refsetFieldName = REFSET_FIELD_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getComparison() <em>Comparison</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComparison()
   * @generated
   * @ordered
   */
  protected Comparison comparison;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberFieldFilterImpl()
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
    return EclPackage.Literals.MEMBER_FIELD_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getRefsetFieldName()
  {
    return refsetFieldName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRefsetFieldName(String newRefsetFieldName)
  {
    String oldRefsetFieldName = refsetFieldName;
    refsetFieldName = newRefsetFieldName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME, oldRefsetFieldName, refsetFieldName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison getComparison()
  {
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetComparison(Comparison newComparison, NotificationChain msgs)
  {
    Comparison oldComparison = comparison;
    comparison = newComparison;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.MEMBER_FIELD_FILTER__COMPARISON, oldComparison, newComparison);
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
  public void setComparison(Comparison newComparison)
  {
    if (newComparison != comparison)
    {
      NotificationChain msgs = null;
      if (comparison != null)
        msgs = ((InternalEObject)comparison).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.MEMBER_FIELD_FILTER__COMPARISON, null, msgs);
      if (newComparison != null)
        msgs = ((InternalEObject)newComparison).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.MEMBER_FIELD_FILTER__COMPARISON, null, msgs);
      msgs = basicSetComparison(newComparison, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.MEMBER_FIELD_FILTER__COMPARISON, newComparison, newComparison));
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
      case EclPackage.MEMBER_FIELD_FILTER__COMPARISON:
        return basicSetComparison(null, msgs);
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
      case EclPackage.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME:
        return getRefsetFieldName();
      case EclPackage.MEMBER_FIELD_FILTER__COMPARISON:
        return getComparison();
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
      case EclPackage.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME:
        setRefsetFieldName((String)newValue);
        return;
      case EclPackage.MEMBER_FIELD_FILTER__COMPARISON:
        setComparison((Comparison)newValue);
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
      case EclPackage.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME:
        setRefsetFieldName(REFSET_FIELD_NAME_EDEFAULT);
        return;
      case EclPackage.MEMBER_FIELD_FILTER__COMPARISON:
        setComparison((Comparison)null);
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
      case EclPackage.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME:
        return REFSET_FIELD_NAME_EDEFAULT == null ? refsetFieldName != null : !REFSET_FIELD_NAME_EDEFAULT.equals(refsetFieldName);
      case EclPackage.MEMBER_FIELD_FILTER__COMPARISON:
        return comparison != null;
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
    result.append(" (refsetFieldName: ");
    result.append(refsetFieldName);
    result.append(')');
    return result.toString();
  }

} //MemberFieldFilterImpl
