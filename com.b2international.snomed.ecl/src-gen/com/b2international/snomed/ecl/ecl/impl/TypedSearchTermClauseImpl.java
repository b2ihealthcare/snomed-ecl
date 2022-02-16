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
import com.b2international.snomed.ecl.ecl.TypedSearchTermClause;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Typed Search Term Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.TypedSearchTermClauseImpl#getLexicalSearchType <em>Lexical Search Type</em>}</li>
 *   <li>{@link com.b2international.snomed.ecl.ecl.impl.TypedSearchTermClauseImpl#getTerm <em>Term</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypedSearchTermClauseImpl extends MinimalEObjectImpl.Container implements TypedSearchTermClause
{
  /**
   * The default value of the '{@link #getLexicalSearchType() <em>Lexical Search Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexicalSearchType()
   * @generated
   * @ordered
   */
  protected static final String LEXICAL_SEARCH_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLexicalSearchType() <em>Lexical Search Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLexicalSearchType()
   * @generated
   * @ordered
   */
  protected String lexicalSearchType = LEXICAL_SEARCH_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected static final String TERM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTerm()
   * @generated
   * @ordered
   */
  protected String term = TERM_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypedSearchTermClauseImpl()
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
    return EclPackage.Literals.TYPED_SEARCH_TERM_CLAUSE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLexicalSearchType()
  {
    return lexicalSearchType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLexicalSearchType(String newLexicalSearchType)
  {
    String oldLexicalSearchType = lexicalSearchType;
    lexicalSearchType = newLexicalSearchType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE, oldLexicalSearchType, lexicalSearchType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTerm()
  {
    return term;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTerm(String newTerm)
  {
    String oldTerm = term;
    term = newTerm;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EclPackage.TYPED_SEARCH_TERM_CLAUSE__TERM, oldTerm, term));
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
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE:
        return getLexicalSearchType();
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__TERM:
        return getTerm();
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
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE:
        setLexicalSearchType((String)newValue);
        return;
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__TERM:
        setTerm((String)newValue);
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
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE:
        setLexicalSearchType(LEXICAL_SEARCH_TYPE_EDEFAULT);
        return;
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__TERM:
        setTerm(TERM_EDEFAULT);
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
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__LEXICAL_SEARCH_TYPE:
        return LEXICAL_SEARCH_TYPE_EDEFAULT == null ? lexicalSearchType != null : !LEXICAL_SEARCH_TYPE_EDEFAULT.equals(lexicalSearchType);
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE__TERM:
        return TERM_EDEFAULT == null ? term != null : !TERM_EDEFAULT.equals(term);
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
    result.append(" (lexicalSearchType: ");
    result.append(lexicalSearchType);
    result.append(", term: ");
    result.append(term);
    result.append(')');
    return result.toString();
  }

} //TypedSearchTermClauseImpl
