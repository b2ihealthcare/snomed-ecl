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

import com.b2international.snomed.ecl.ecl.Acceptability;
import com.b2international.snomed.ecl.ecl.Dialect;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.ExpressionConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dialect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.DialectImpl#getLanguageRefSetId <em>Language Ref Set Id</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.DialectImpl#getAcceptability <em>Acceptability</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DialectImpl extends MinimalEObjectImpl.Container implements Dialect
{
  /**
   * The cached value of the '{@link #getLanguageRefSetId() <em>Language Ref Set Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguageRefSetId()
   * @generated
   * @ordered
   */
  protected ExpressionConstraint languageRefSetId;

  /**
   * The cached value of the '{@link #getAcceptability() <em>Acceptability</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptability()
   * @generated
   * @ordered
   */
  protected Acceptability acceptability;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DialectImpl()
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
    return EclPackage.Literals.DIALECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstraint getLanguageRefSetId()
  {
    return languageRefSetId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLanguageRefSetId(ExpressionConstraint newLanguageRefSetId, NotificationChain msgs)
  {
    ExpressionConstraint oldLanguageRefSetId = languageRefSetId;
    languageRefSetId = newLanguageRefSetId;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.DIALECT__LANGUAGE_REF_SET_ID, oldLanguageRefSetId, newLanguageRefSetId);
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
  public void setLanguageRefSetId(ExpressionConstraint newLanguageRefSetId)
  {
    if (newLanguageRefSetId != languageRefSetId)
    {
      NotificationChain msgs = null;
      if (languageRefSetId != null)
        msgs = ((InternalEObject)languageRefSetId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.DIALECT__LANGUAGE_REF_SET_ID, null, msgs);
      if (newLanguageRefSetId != null)
        msgs = ((InternalEObject)newLanguageRefSetId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.DIALECT__LANGUAGE_REF_SET_ID, null, msgs);
      msgs = basicSetLanguageRefSetId(newLanguageRefSetId, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.DIALECT__LANGUAGE_REF_SET_ID, newLanguageRefSetId, newLanguageRefSetId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Acceptability getAcceptability()
  {
    return acceptability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptability(Acceptability newAcceptability, NotificationChain msgs)
  {
    Acceptability oldAcceptability = acceptability;
    acceptability = newAcceptability;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.DIALECT__ACCEPTABILITY, oldAcceptability, newAcceptability);
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
  public void setAcceptability(Acceptability newAcceptability)
  {
    if (newAcceptability != acceptability)
    {
      NotificationChain msgs = null;
      if (acceptability != null)
        msgs = ((InternalEObject)acceptability).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.DIALECT__ACCEPTABILITY, null, msgs);
      if (newAcceptability != null)
        msgs = ((InternalEObject)newAcceptability).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.DIALECT__ACCEPTABILITY, null, msgs);
      msgs = basicSetAcceptability(newAcceptability, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.DIALECT__ACCEPTABILITY, newAcceptability, newAcceptability));
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
      case EclPackage.DIALECT__LANGUAGE_REF_SET_ID:
        return basicSetLanguageRefSetId(null, msgs);
      case EclPackage.DIALECT__ACCEPTABILITY:
        return basicSetAcceptability(null, msgs);
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
      case EclPackage.DIALECT__LANGUAGE_REF_SET_ID:
        return getLanguageRefSetId();
      case EclPackage.DIALECT__ACCEPTABILITY:
        return getAcceptability();
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
      case EclPackage.DIALECT__LANGUAGE_REF_SET_ID:
        setLanguageRefSetId((ExpressionConstraint)newValue);
        return;
      case EclPackage.DIALECT__ACCEPTABILITY:
        setAcceptability((Acceptability)newValue);
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
      case EclPackage.DIALECT__LANGUAGE_REF_SET_ID:
        setLanguageRefSetId((ExpressionConstraint)null);
        return;
      case EclPackage.DIALECT__ACCEPTABILITY:
        setAcceptability((Acceptability)null);
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
      case EclPackage.DIALECT__LANGUAGE_REF_SET_ID:
        return languageRefSetId != null;
      case EclPackage.DIALECT__ACCEPTABILITY:
        return acceptability != null;
    }
    return super.eIsSet(featureID);
  }

} //DialectImpl
