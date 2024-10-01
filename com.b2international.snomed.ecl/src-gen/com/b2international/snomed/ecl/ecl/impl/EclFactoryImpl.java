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

import com.b2international.snomed.ecl.ecl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EclFactoryImpl extends EFactoryImpl implements EclFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EclFactory init()
  {
    try
    {
      EclFactory theEclFactory = (EclFactory)EPackage.Registry.INSTANCE.getEFactory(EclPackage.eNS_URI);
      if (theEclFactory != null)
      {
        return theEclFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EclFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EclFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EclPackage.SCRIPT: return createScript();
      case EclPackage.EXPRESSION_CONSTRAINT: return createExpressionConstraint();
      case EclPackage.CHILD_OF: return createChildOf();
      case EclPackage.CHILD_OR_SELF_OF: return createChildOrSelfOf();
      case EclPackage.DESCENDANT_OF: return createDescendantOf();
      case EclPackage.DESCENDANT_OR_SELF_OF: return createDescendantOrSelfOf();
      case EclPackage.PARENT_OF: return createParentOf();
      case EclPackage.PARENT_OR_SELF_OF: return createParentOrSelfOf();
      case EclPackage.ANCESTOR_OF: return createAncestorOf();
      case EclPackage.ANCESTOR_OR_SELF_OF: return createAncestorOrSelfOf();
      case EclPackage.TOP: return createTop();
      case EclPackage.BOTTOM: return createBottom();
      case EclPackage.MEMBER_OF: return createMemberOf();
      case EclPackage.ECL_CONCEPT_REFERENCE: return createEclConceptReference();
      case EclPackage.ALTERNATE_IDENTIFIER: return createAlternateIdentifier();
      case EclPackage.ECL_CONCEPT_REFERENCE_SET: return createEclConceptReferenceSet();
      case EclPackage.ANY: return createAny();
      case EclPackage.ECL_REFINEMENT: return createEclRefinement();
      case EclPackage.NESTED_REFINEMENT: return createNestedRefinement();
      case EclPackage.ECL_ATTRIBUTE_GROUP: return createEclAttributeGroup();
      case EclPackage.ATTRIBUTE_CONSTRAINT: return createAttributeConstraint();
      case EclPackage.CARDINALITY: return createCardinality();
      case EclPackage.COMPARISON: return createComparison();
      case EclPackage.ATTRIBUTE_COMPARISON: return createAttributeComparison();
      case EclPackage.DATA_TYPE_COMPARISON: return createDataTypeComparison();
      case EclPackage.BOOLEAN_VALUE_COMPARISON: return createBooleanValueComparison();
      case EclPackage.STRING_VALUE_COMPARISON: return createStringValueComparison();
      case EclPackage.INTEGER_VALUE_COMPARISON: return createIntegerValueComparison();
      case EclPackage.DECIMAL_VALUE_COMPARISON: return createDecimalValueComparison();
      case EclPackage.NESTED_EXPRESSION: return createNestedExpression();
      case EclPackage.FILTER_CONSTRAINT: return createFilterConstraint();
      case EclPackage.FILTER: return createFilter();
      case EclPackage.NESTED_FILTER: return createNestedFilter();
      case EclPackage.PROPERTY_FILTER: return createPropertyFilter();
      case EclPackage.MEMBER_FIELD_FILTER: return createMemberFieldFilter();
      case EclPackage.ID_FILTER: return createIdFilter();
      case EclPackage.TERM_FILTER: return createTermFilter();
      case EclPackage.SEARCH_TERM: return createSearchTerm();
      case EclPackage.TYPED_SEARCH_TERM: return createTypedSearchTerm();
      case EclPackage.TYPED_SEARCH_TERM_SET: return createTypedSearchTermSet();
      case EclPackage.TYPED_SEARCH_TERM_CLAUSE: return createTypedSearchTermClause();
      case EclPackage.LANGUAGE_FILTER: return createLanguageFilter();
      case EclPackage.TYPE_FILTER: return createTypeFilter();
      case EclPackage.TYPE_ID_FILTER: return createTypeIdFilter();
      case EclPackage.TYPE_TOKEN_FILTER: return createTypeTokenFilter();
      case EclPackage.DIALECT_FILTER: return createDialectFilter();
      case EclPackage.DIALECT_ID_FILTER: return createDialectIdFilter();
      case EclPackage.DIALECT_ALIAS_FILTER: return createDialectAliasFilter();
      case EclPackage.DIALECT: return createDialect();
      case EclPackage.DIALECT_ALIAS: return createDialectAlias();
      case EclPackage.ACCEPTABILITY: return createAcceptability();
      case EclPackage.DEFINITION_STATUS_FILTER: return createDefinitionStatusFilter();
      case EclPackage.DEFINITION_STATUS_ID_FILTER: return createDefinitionStatusIdFilter();
      case EclPackage.DEFINITION_STATUS_TOKEN_FILTER: return createDefinitionStatusTokenFilter();
      case EclPackage.MODULE_FILTER: return createModuleFilter();
      case EclPackage.EFFECTIVE_TIME_FILTER: return createEffectiveTimeFilter();
      case EclPackage.ACTIVE_FILTER: return createActiveFilter();
      case EclPackage.SEMANTIC_TAG_FILTER: return createSemanticTagFilter();
      case EclPackage.PREFERRED_IN_FILTER: return createPreferredInFilter();
      case EclPackage.ACCEPTABLE_IN_FILTER: return createAcceptableInFilter();
      case EclPackage.LANGUAGE_REF_SET_FILTER: return createLanguageRefSetFilter();
      case EclPackage.CASE_SIGNIFICANCE_FILTER: return createCaseSignificanceFilter();
      case EclPackage.FILTER_VALUE: return createFilterValue();
      case EclPackage.SUPPLEMENT: return createSupplement();
      case EclPackage.HISTORY_SUPPLEMENT: return createHistorySupplement();
      case EclPackage.HISTORY_PROFILE: return createHistoryProfile();
      case EclPackage.OR_EXPRESSION_CONSTRAINT: return createOrExpressionConstraint();
      case EclPackage.AND_EXPRESSION_CONSTRAINT: return createAndExpressionConstraint();
      case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT: return createExclusionExpressionConstraint();
      case EclPackage.REFINED_EXPRESSION_CONSTRAINT: return createRefinedExpressionConstraint();
      case EclPackage.DOTTED_EXPRESSION_CONSTRAINT: return createDottedExpressionConstraint();
      case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT: return createSupplementExpressionConstraint();
      case EclPackage.FILTERED_EXPRESSION_CONSTRAINT: return createFilteredExpressionConstraint();
      case EclPackage.OR_REFINEMENT: return createOrRefinement();
      case EclPackage.AND_REFINEMENT: return createAndRefinement();
      case EclPackage.DISJUNCTION_FILTER: return createDisjunctionFilter();
      case EclPackage.CONJUNCTION_FILTER: return createConjunctionFilter();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExpressionConstraint createExpressionConstraint()
  {
    ExpressionConstraintImpl expressionConstraint = new ExpressionConstraintImpl();
    return expressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChildOf createChildOf()
  {
    ChildOfImpl childOf = new ChildOfImpl();
    return childOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ChildOrSelfOf createChildOrSelfOf()
  {
    ChildOrSelfOfImpl childOrSelfOf = new ChildOrSelfOfImpl();
    return childOrSelfOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DescendantOf createDescendantOf()
  {
    DescendantOfImpl descendantOf = new DescendantOfImpl();
    return descendantOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DescendantOrSelfOf createDescendantOrSelfOf()
  {
    DescendantOrSelfOfImpl descendantOrSelfOf = new DescendantOrSelfOfImpl();
    return descendantOrSelfOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParentOf createParentOf()
  {
    ParentOfImpl parentOf = new ParentOfImpl();
    return parentOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ParentOrSelfOf createParentOrSelfOf()
  {
    ParentOrSelfOfImpl parentOrSelfOf = new ParentOrSelfOfImpl();
    return parentOrSelfOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AncestorOf createAncestorOf()
  {
    AncestorOfImpl ancestorOf = new AncestorOfImpl();
    return ancestorOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AncestorOrSelfOf createAncestorOrSelfOf()
  {
    AncestorOrSelfOfImpl ancestorOrSelfOf = new AncestorOrSelfOfImpl();
    return ancestorOrSelfOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Top createTop()
  {
    TopImpl top = new TopImpl();
    return top;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Bottom createBottom()
  {
    BottomImpl bottom = new BottomImpl();
    return bottom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemberOf createMemberOf()
  {
    MemberOfImpl memberOf = new MemberOfImpl();
    return memberOf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclConceptReference createEclConceptReference()
  {
    EclConceptReferenceImpl eclConceptReference = new EclConceptReferenceImpl();
    return eclConceptReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AlternateIdentifier createAlternateIdentifier()
  {
    AlternateIdentifierImpl alternateIdentifier = new AlternateIdentifierImpl();
    return alternateIdentifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclConceptReferenceSet createEclConceptReferenceSet()
  {
    EclConceptReferenceSetImpl eclConceptReferenceSet = new EclConceptReferenceSetImpl();
    return eclConceptReferenceSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Any createAny()
  {
    AnyImpl any = new AnyImpl();
    return any;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclRefinement createEclRefinement()
  {
    EclRefinementImpl eclRefinement = new EclRefinementImpl();
    return eclRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedRefinement createNestedRefinement()
  {
    NestedRefinementImpl nestedRefinement = new NestedRefinementImpl();
    return nestedRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclAttributeGroup createEclAttributeGroup()
  {
    EclAttributeGroupImpl eclAttributeGroup = new EclAttributeGroupImpl();
    return eclAttributeGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeConstraint createAttributeConstraint()
  {
    AttributeConstraintImpl attributeConstraint = new AttributeConstraintImpl();
    return attributeConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Cardinality createCardinality()
  {
    CardinalityImpl cardinality = new CardinalityImpl();
    return cardinality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeComparison createAttributeComparison()
  {
    AttributeComparisonImpl attributeComparison = new AttributeComparisonImpl();
    return attributeComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DataTypeComparison createDataTypeComparison()
  {
    DataTypeComparisonImpl dataTypeComparison = new DataTypeComparisonImpl();
    return dataTypeComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public BooleanValueComparison createBooleanValueComparison()
  {
    BooleanValueComparisonImpl booleanValueComparison = new BooleanValueComparisonImpl();
    return booleanValueComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public StringValueComparison createStringValueComparison()
  {
    StringValueComparisonImpl stringValueComparison = new StringValueComparisonImpl();
    return stringValueComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IntegerValueComparison createIntegerValueComparison()
  {
    IntegerValueComparisonImpl integerValueComparison = new IntegerValueComparisonImpl();
    return integerValueComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DecimalValueComparison createDecimalValueComparison()
  {
    DecimalValueComparisonImpl decimalValueComparison = new DecimalValueComparisonImpl();
    return decimalValueComparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedExpression createNestedExpression()
  {
    NestedExpressionImpl nestedExpression = new NestedExpressionImpl();
    return nestedExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterConstraint createFilterConstraint()
  {
    FilterConstraintImpl filterConstraint = new FilterConstraintImpl();
    return filterConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Filter createFilter()
  {
    FilterImpl filter = new FilterImpl();
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NestedFilter createNestedFilter()
  {
    NestedFilterImpl nestedFilter = new NestedFilterImpl();
    return nestedFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PropertyFilter createPropertyFilter()
  {
    PropertyFilterImpl propertyFilter = new PropertyFilterImpl();
    return propertyFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MemberFieldFilter createMemberFieldFilter()
  {
    MemberFieldFilterImpl memberFieldFilter = new MemberFieldFilterImpl();
    return memberFieldFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public IdFilter createIdFilter()
  {
    IdFilterImpl idFilter = new IdFilterImpl();
    return idFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TermFilter createTermFilter()
  {
    TermFilterImpl termFilter = new TermFilterImpl();
    return termFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SearchTerm createSearchTerm()
  {
    SearchTermImpl searchTerm = new SearchTermImpl();
    return searchTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedSearchTerm createTypedSearchTerm()
  {
    TypedSearchTermImpl typedSearchTerm = new TypedSearchTermImpl();
    return typedSearchTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedSearchTermSet createTypedSearchTermSet()
  {
    TypedSearchTermSetImpl typedSearchTermSet = new TypedSearchTermSetImpl();
    return typedSearchTermSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypedSearchTermClause createTypedSearchTermClause()
  {
    TypedSearchTermClauseImpl typedSearchTermClause = new TypedSearchTermClauseImpl();
    return typedSearchTermClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LanguageFilter createLanguageFilter()
  {
    LanguageFilterImpl languageFilter = new LanguageFilterImpl();
    return languageFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeFilter createTypeFilter()
  {
    TypeFilterImpl typeFilter = new TypeFilterImpl();
    return typeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeIdFilter createTypeIdFilter()
  {
    TypeIdFilterImpl typeIdFilter = new TypeIdFilterImpl();
    return typeIdFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public TypeTokenFilter createTypeTokenFilter()
  {
    TypeTokenFilterImpl typeTokenFilter = new TypeTokenFilterImpl();
    return typeTokenFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialectFilter createDialectFilter()
  {
    DialectFilterImpl dialectFilter = new DialectFilterImpl();
    return dialectFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialectIdFilter createDialectIdFilter()
  {
    DialectIdFilterImpl dialectIdFilter = new DialectIdFilterImpl();
    return dialectIdFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialectAliasFilter createDialectAliasFilter()
  {
    DialectAliasFilterImpl dialectAliasFilter = new DialectAliasFilterImpl();
    return dialectAliasFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Dialect createDialect()
  {
    DialectImpl dialect = new DialectImpl();
    return dialect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DialectAlias createDialectAlias()
  {
    DialectAliasImpl dialectAlias = new DialectAliasImpl();
    return dialectAlias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Acceptability createAcceptability()
  {
    AcceptabilityImpl acceptability = new AcceptabilityImpl();
    return acceptability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefinitionStatusFilter createDefinitionStatusFilter()
  {
    DefinitionStatusFilterImpl definitionStatusFilter = new DefinitionStatusFilterImpl();
    return definitionStatusFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefinitionStatusIdFilter createDefinitionStatusIdFilter()
  {
    DefinitionStatusIdFilterImpl definitionStatusIdFilter = new DefinitionStatusIdFilterImpl();
    return definitionStatusIdFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DefinitionStatusTokenFilter createDefinitionStatusTokenFilter()
  {
    DefinitionStatusTokenFilterImpl definitionStatusTokenFilter = new DefinitionStatusTokenFilterImpl();
    return definitionStatusTokenFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ModuleFilter createModuleFilter()
  {
    ModuleFilterImpl moduleFilter = new ModuleFilterImpl();
    return moduleFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EffectiveTimeFilter createEffectiveTimeFilter()
  {
    EffectiveTimeFilterImpl effectiveTimeFilter = new EffectiveTimeFilterImpl();
    return effectiveTimeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ActiveFilter createActiveFilter()
  {
    ActiveFilterImpl activeFilter = new ActiveFilterImpl();
    return activeFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SemanticTagFilter createSemanticTagFilter()
  {
    SemanticTagFilterImpl semanticTagFilter = new SemanticTagFilterImpl();
    return semanticTagFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public PreferredInFilter createPreferredInFilter()
  {
    PreferredInFilterImpl preferredInFilter = new PreferredInFilterImpl();
    return preferredInFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AcceptableInFilter createAcceptableInFilter()
  {
    AcceptableInFilterImpl acceptableInFilter = new AcceptableInFilterImpl();
    return acceptableInFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LanguageRefSetFilter createLanguageRefSetFilter()
  {
    LanguageRefSetFilterImpl languageRefSetFilter = new LanguageRefSetFilterImpl();
    return languageRefSetFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public CaseSignificanceFilter createCaseSignificanceFilter()
  {
    CaseSignificanceFilterImpl caseSignificanceFilter = new CaseSignificanceFilterImpl();
    return caseSignificanceFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilterValue createFilterValue()
  {
    FilterValueImpl filterValue = new FilterValueImpl();
    return filterValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Supplement createSupplement()
  {
    SupplementImpl supplement = new SupplementImpl();
    return supplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HistorySupplement createHistorySupplement()
  {
    HistorySupplementImpl historySupplement = new HistorySupplementImpl();
    return historySupplement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public HistoryProfile createHistoryProfile()
  {
    HistoryProfileImpl historyProfile = new HistoryProfileImpl();
    return historyProfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrExpressionConstraint createOrExpressionConstraint()
  {
    OrExpressionConstraintImpl orExpressionConstraint = new OrExpressionConstraintImpl();
    return orExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndExpressionConstraint createAndExpressionConstraint()
  {
    AndExpressionConstraintImpl andExpressionConstraint = new AndExpressionConstraintImpl();
    return andExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ExclusionExpressionConstraint createExclusionExpressionConstraint()
  {
    ExclusionExpressionConstraintImpl exclusionExpressionConstraint = new ExclusionExpressionConstraintImpl();
    return exclusionExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RefinedExpressionConstraint createRefinedExpressionConstraint()
  {
    RefinedExpressionConstraintImpl refinedExpressionConstraint = new RefinedExpressionConstraintImpl();
    return refinedExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DottedExpressionConstraint createDottedExpressionConstraint()
  {
    DottedExpressionConstraintImpl dottedExpressionConstraint = new DottedExpressionConstraintImpl();
    return dottedExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SupplementExpressionConstraint createSupplementExpressionConstraint()
  {
    SupplementExpressionConstraintImpl supplementExpressionConstraint = new SupplementExpressionConstraintImpl();
    return supplementExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public FilteredExpressionConstraint createFilteredExpressionConstraint()
  {
    FilteredExpressionConstraintImpl filteredExpressionConstraint = new FilteredExpressionConstraintImpl();
    return filteredExpressionConstraint;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OrRefinement createOrRefinement()
  {
    OrRefinementImpl orRefinement = new OrRefinementImpl();
    return orRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AndRefinement createAndRefinement()
  {
    AndRefinementImpl andRefinement = new AndRefinementImpl();
    return andRefinement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DisjunctionFilter createDisjunctionFilter()
  {
    DisjunctionFilterImpl disjunctionFilter = new DisjunctionFilterImpl();
    return disjunctionFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ConjunctionFilter createConjunctionFilter()
  {
    ConjunctionFilterImpl conjunctionFilter = new ConjunctionFilterImpl();
    return conjunctionFilter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EclPackage getEclPackage()
  {
    return (EclPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EclPackage getPackage()
  {
    return EclPackage.eINSTANCE;
  }

} //EclFactoryImpl
