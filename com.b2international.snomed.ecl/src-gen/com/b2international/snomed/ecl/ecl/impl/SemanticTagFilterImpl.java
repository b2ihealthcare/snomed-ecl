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
import com.b2international.snomed.ecl.ecl.SemanticTagFilter;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semantic Tag Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.SemanticTagFilterImpl#getDomain <em>Domain</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.SemanticTagFilterImpl#getOp <em>Op</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.SemanticTagFilterImpl#getSemanticTag <em>Semantic Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemanticTagFilterImpl extends PropertyFilterImpl implements SemanticTagFilter
{
  /**
   * The default value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected static final String DOMAIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDomain() <em>Domain</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDomain()
   * @generated
   * @ordered
   */
  protected String domain = DOMAIN_EDEFAULT;

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
   * The default value of the '{@link #getSemanticTag() <em>Semantic Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticTag()
   * @generated
   * @ordered
   */
  protected static final String SEMANTIC_TAG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSemanticTag() <em>Semantic Tag</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSemanticTag()
   * @generated
   * @ordered
   */
  protected String semanticTag = SEMANTIC_TAG_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SemanticTagFilterImpl()
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
    return EclPackage.Literals.SEMANTIC_TAG_FILTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDomain()
  {
    return domain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDomain(String newDomain)
  {
    String oldDomain = domain;
    domain = newDomain;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SEMANTIC_TAG_FILTER__DOMAIN, oldDomain, domain));
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
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SEMANTIC_TAG_FILTER__OP, oldOp, op));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getSemanticTag()
  {
    return semanticTag;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSemanticTag(String newSemanticTag)
  {
    String oldSemanticTag = semanticTag;
    semanticTag = newSemanticTag;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.SEMANTIC_TAG_FILTER__SEMANTIC_TAG, oldSemanticTag, semanticTag));
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
      case EclPackage.SEMANTIC_TAG_FILTER__DOMAIN:
        return getDomain();
      case EclPackage.SEMANTIC_TAG_FILTER__OP:
        return getOp();
      case EclPackage.SEMANTIC_TAG_FILTER__SEMANTIC_TAG:
        return getSemanticTag();
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
      case EclPackage.SEMANTIC_TAG_FILTER__DOMAIN:
        setDomain((String)newValue);
        return;
      case EclPackage.SEMANTIC_TAG_FILTER__OP:
        setOp((String)newValue);
        return;
      case EclPackage.SEMANTIC_TAG_FILTER__SEMANTIC_TAG:
        setSemanticTag((String)newValue);
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
      case EclPackage.SEMANTIC_TAG_FILTER__DOMAIN:
        setDomain(DOMAIN_EDEFAULT);
        return;
      case EclPackage.SEMANTIC_TAG_FILTER__OP:
        setOp(OP_EDEFAULT);
        return;
      case EclPackage.SEMANTIC_TAG_FILTER__SEMANTIC_TAG:
        setSemanticTag(SEMANTIC_TAG_EDEFAULT);
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
      case EclPackage.SEMANTIC_TAG_FILTER__DOMAIN:
        return DOMAIN_EDEFAULT == null ? domain != null : !DOMAIN_EDEFAULT.equals(domain);
      case EclPackage.SEMANTIC_TAG_FILTER__OP:
        return OP_EDEFAULT == null ? op != null : !OP_EDEFAULT.equals(op);
      case EclPackage.SEMANTIC_TAG_FILTER__SEMANTIC_TAG:
        return SEMANTIC_TAG_EDEFAULT == null ? semanticTag != null : !SEMANTIC_TAG_EDEFAULT.equals(semanticTag);
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
    result.append(" (domain: ");
    result.append(domain);
    result.append(", op: ");
    result.append(op);
    result.append(", semanticTag: ");
    result.append(semanticTag);
    result.append(')');
    return result.toString();
  }

} //SemanticTagFilterImpl
