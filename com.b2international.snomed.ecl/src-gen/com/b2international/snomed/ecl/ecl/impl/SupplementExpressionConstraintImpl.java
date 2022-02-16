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

import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.ExpressionConstraint;
import com.b2international.snomed.ecl.ecl.Supplement;
import com.b2international.snomed.ecl.ecl.SupplementExpressionConstraint;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplement Expression Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.SupplementExpressionConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.SupplementExpressionConstraintImpl#getSupplement <em>Supplement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplementExpressionConstraintImpl extends ExpressionConstraintImpl implements SupplementExpressionConstraint
{
  /**
   * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConstraint()
   * @generated
   * @ordered
   */
  protected ExpressionConstraint constraint;

  /**
   * The cached value of the '{@link #getSupplement() <em>Supplement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSupplement()
   * @generated
   * @ordered
   */
  protected Supplement supplement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SupplementExpressionConstraintImpl()
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
    return EclPackage.Literals.SUPPLEMENT_EXPRESSION_CONSTRAINT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstraint getConstraint()
  {
    return constraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConstraint(ExpressionConstraint newConstraint, NotificationChain msgs)
  {
    ExpressionConstraint oldConstraint = constraint;
    constraint = newConstraint;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT, oldConstraint, newConstraint);
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
  public void setConstraint(ExpressionConstraint newConstraint)
  {
    if (newConstraint != constraint)
    {
      NotificationChain msgs = null;
      if (constraint != null)
        msgs = ((InternalEObject)constraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT, null, msgs);
      if (newConstraint != null)
        msgs = ((InternalEObject)newConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT, null, msgs);
      msgs = basicSetConstraint(newConstraint, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT, newConstraint, newConstraint));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Supplement getSupplement()
  {
    return supplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSupplement(Supplement newSupplement, NotificationChain msgs)
  {
    Supplement oldSupplement = supplement;
    supplement = newSupplement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT, oldSupplement, newSupplement);
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
  public void setSupplement(Supplement newSupplement)
  {
    if (newSupplement != supplement)
    {
      NotificationChain msgs = null;
      if (supplement != null)
        msgs = ((InternalEObject)supplement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT, null, msgs);
      if (newSupplement != null)
        msgs = ((InternalEObject)newSupplement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT, null, msgs);
      msgs = basicSetSupplement(newSupplement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT, newSupplement, newSupplement));
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
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT:
        return basicSetConstraint(null, msgs);
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT:
        return basicSetSupplement(null, msgs);
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
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT:
        return getConstraint();
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT:
        return getSupplement();
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
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT:
        setConstraint((ExpressionConstraint)newValue);
        return;
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT:
        setSupplement((Supplement)newValue);
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
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT:
        setConstraint((ExpressionConstraint)null);
        return;
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT:
        setSupplement((Supplement)null);
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
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT:
        return constraint != null;
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT:
        return supplement != null;
    }
    return super.eIsSet(featureID);
  }

} //SupplementExpressionConstraintImpl
