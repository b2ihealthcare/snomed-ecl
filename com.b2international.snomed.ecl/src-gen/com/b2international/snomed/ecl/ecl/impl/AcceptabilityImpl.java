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

import com.b2international.snomed.ecl.ecl.Acceptability;
import com.b2international.snomed.ecl.ecl.EclConceptReferenceSet;
import com.b2international.snomed.ecl.ecl.EclPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Acceptability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.AcceptabilityImpl#getAcceptabilities <em>Acceptabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptabilityImpl extends MinimalEObjectImpl.Container implements Acceptability
{
  /**
   * The cached value of the '{@link #getAcceptabilities() <em>Acceptabilities</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAcceptabilities()
   * @generated
   * @ordered
   */
  protected EclConceptReferenceSet acceptabilities;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AcceptabilityImpl()
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
    return EclPackage.Literals.ACCEPTABILITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclConceptReferenceSet getAcceptabilities()
  {
    return acceptabilities;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAcceptabilities(EclConceptReferenceSet newAcceptabilities, NotificationChain msgs)
  {
    EclConceptReferenceSet oldAcceptabilities = acceptabilities;
    acceptabilities = newAcceptabilities;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.ACCEPTABILITY__ACCEPTABILITIES, oldAcceptabilities, newAcceptabilities);
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
  public void setAcceptabilities(EclConceptReferenceSet newAcceptabilities)
  {
    if (newAcceptabilities != acceptabilities)
    {
      NotificationChain msgs = null;
      if (acceptabilities != null)
        msgs = ((InternalEObject)acceptabilities).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.ACCEPTABILITY__ACCEPTABILITIES, null, msgs);
      if (newAcceptabilities != null)
        msgs = ((InternalEObject)newAcceptabilities).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.ACCEPTABILITY__ACCEPTABILITIES, null, msgs);
      msgs = basicSetAcceptabilities(newAcceptabilities, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.ACCEPTABILITY__ACCEPTABILITIES, newAcceptabilities, newAcceptabilities));
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
      case EclPackage.ACCEPTABILITY__ACCEPTABILITIES:
        return basicSetAcceptabilities(null, msgs);
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
      case EclPackage.ACCEPTABILITY__ACCEPTABILITIES:
        return getAcceptabilities();
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
      case EclPackage.ACCEPTABILITY__ACCEPTABILITIES:
        setAcceptabilities((EclConceptReferenceSet)newValue);
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
      case EclPackage.ACCEPTABILITY__ACCEPTABILITIES:
        setAcceptabilities((EclConceptReferenceSet)null);
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
      case EclPackage.ACCEPTABILITY__ACCEPTABILITIES:
        return acceptabilities != null;
    }
    return super.eIsSet(featureID);
  }

} //AcceptabilityImpl
