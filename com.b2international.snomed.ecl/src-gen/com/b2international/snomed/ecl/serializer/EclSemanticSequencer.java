/*
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
package com.b2international.snomed.ecl.serializer;

import com.b2international.snomed.ecl.ecl.Acceptability;
import com.b2international.snomed.ecl.ecl.AcceptableInFilter;
import com.b2international.snomed.ecl.ecl.ActiveFilter;
import com.b2international.snomed.ecl.ecl.AncestorOf;
import com.b2international.snomed.ecl.ecl.AncestorOrSelfOf;
import com.b2international.snomed.ecl.ecl.AndExpressionConstraint;
import com.b2international.snomed.ecl.ecl.AndRefinement;
import com.b2international.snomed.ecl.ecl.Any;
import com.b2international.snomed.ecl.ecl.AttributeComparison;
import com.b2international.snomed.ecl.ecl.AttributeConstraint;
import com.b2international.snomed.ecl.ecl.BooleanValueComparison;
import com.b2international.snomed.ecl.ecl.Cardinality;
import com.b2international.snomed.ecl.ecl.CaseSignificanceFilter;
import com.b2international.snomed.ecl.ecl.ChildOf;
import com.b2international.snomed.ecl.ecl.ChildOrSelfOf;
import com.b2international.snomed.ecl.ecl.ConjunctionFilter;
import com.b2international.snomed.ecl.ecl.DecimalValueComparison;
import com.b2international.snomed.ecl.ecl.DefinitionStatusIdFilter;
import com.b2international.snomed.ecl.ecl.DefinitionStatusTokenFilter;
import com.b2international.snomed.ecl.ecl.DescendantOf;
import com.b2international.snomed.ecl.ecl.DescendantOrSelfOf;
import com.b2international.snomed.ecl.ecl.Dialect;
import com.b2international.snomed.ecl.ecl.DialectAlias;
import com.b2international.snomed.ecl.ecl.DialectAliasFilter;
import com.b2international.snomed.ecl.ecl.DialectIdFilter;
import com.b2international.snomed.ecl.ecl.DisjunctionFilter;
import com.b2international.snomed.ecl.ecl.DottedExpressionConstraint;
import com.b2international.snomed.ecl.ecl.EclAttributeGroup;
import com.b2international.snomed.ecl.ecl.EclConceptReference;
import com.b2international.snomed.ecl.ecl.EclConceptReferenceSet;
import com.b2international.snomed.ecl.ecl.EclPackage;
import com.b2international.snomed.ecl.ecl.EffectiveTimeFilter;
import com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint;
import com.b2international.snomed.ecl.ecl.FilterConstraint;
import com.b2international.snomed.ecl.ecl.FilteredExpressionConstraint;
import com.b2international.snomed.ecl.ecl.HistoryProfile;
import com.b2international.snomed.ecl.ecl.HistorySupplement;
import com.b2international.snomed.ecl.ecl.IdFilter;
import com.b2international.snomed.ecl.ecl.IntegerValueComparison;
import com.b2international.snomed.ecl.ecl.LanguageFilter;
import com.b2international.snomed.ecl.ecl.LanguageRefSetFilter;
import com.b2international.snomed.ecl.ecl.MemberFieldFilter;
import com.b2international.snomed.ecl.ecl.MemberOf;
import com.b2international.snomed.ecl.ecl.ModuleFilter;
import com.b2international.snomed.ecl.ecl.NestedExpression;
import com.b2international.snomed.ecl.ecl.NestedFilter;
import com.b2international.snomed.ecl.ecl.NestedRefinement;
import com.b2international.snomed.ecl.ecl.OrExpressionConstraint;
import com.b2international.snomed.ecl.ecl.OrRefinement;
import com.b2international.snomed.ecl.ecl.ParentOf;
import com.b2international.snomed.ecl.ecl.ParentOrSelfOf;
import com.b2international.snomed.ecl.ecl.PreferredInFilter;
import com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint;
import com.b2international.snomed.ecl.ecl.Script;
import com.b2international.snomed.ecl.ecl.SemanticTagFilter;
import com.b2international.snomed.ecl.ecl.StringValueComparison;
import com.b2international.snomed.ecl.ecl.SupplementExpressionConstraint;
import com.b2international.snomed.ecl.ecl.TermFilter;
import com.b2international.snomed.ecl.ecl.TypeIdFilter;
import com.b2international.snomed.ecl.ecl.TypeTokenFilter;
import com.b2international.snomed.ecl.ecl.TypedSearchTerm;
import com.b2international.snomed.ecl.ecl.TypedSearchTermClause;
import com.b2international.snomed.ecl.ecl.TypedSearchTermSet;
import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class EclSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EclGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == EclPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case EclPackage.ACCEPTABILITY:
				sequence_Acceptability(context, (Acceptability) semanticObject); 
				return; 
			case EclPackage.ACCEPTABLE_IN_FILTER:
				sequence_AcceptableInFilter(context, (AcceptableInFilter) semanticObject); 
				return; 
			case EclPackage.ACTIVE_FILTER:
				sequence_ActiveFilter(context, (ActiveFilter) semanticObject); 
				return; 
			case EclPackage.ANCESTOR_OF:
				sequence_AncestorOf(context, (AncestorOf) semanticObject); 
				return; 
			case EclPackage.ANCESTOR_OR_SELF_OF:
				sequence_AncestorOrSelfOf(context, (AncestorOrSelfOf) semanticObject); 
				return; 
			case EclPackage.AND_EXPRESSION_CONSTRAINT:
				sequence_AndExpressionConstraint(context, (AndExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.AND_REFINEMENT:
				if (rule == grammarAccess.getEclAttributeSetRule()
						|| rule == grammarAccess.getOrAttributeSetRule()
						|| action == grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()
						|| rule == grammarAccess.getAndAttributeSetRule()
						|| action == grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()) {
					sequence_AndAttributeSet(context, (AndRefinement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEclRefinementRule()
						|| rule == grammarAccess.getOrRefinementRule()
						|| action == grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()
						|| rule == grammarAccess.getAndRefinementRule()
						|| action == grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()) {
					sequence_AndRefinement(context, (AndRefinement) semanticObject); 
					return; 
				}
				else break;
			case EclPackage.ANY:
				sequence_Any(context, (Any) semanticObject); 
				return; 
			case EclPackage.ATTRIBUTE_COMPARISON:
				sequence_AttributeComparison(context, (AttributeComparison) semanticObject); 
				return; 
			case EclPackage.ATTRIBUTE_CONSTRAINT:
				sequence_AttributeConstraint(context, (AttributeConstraint) semanticObject); 
				return; 
			case EclPackage.BOOLEAN_VALUE_COMPARISON:
				sequence_BooleanValueComparison(context, (BooleanValueComparison) semanticObject); 
				return; 
			case EclPackage.CARDINALITY:
				sequence_Cardinality(context, (Cardinality) semanticObject); 
				return; 
			case EclPackage.CASE_SIGNIFICANCE_FILTER:
				sequence_CaseSignificanceFilter(context, (CaseSignificanceFilter) semanticObject); 
				return; 
			case EclPackage.CHILD_OF:
				sequence_ChildOf(context, (ChildOf) semanticObject); 
				return; 
			case EclPackage.CHILD_OR_SELF_OF:
				sequence_ChildOrSelfOf(context, (ChildOrSelfOf) semanticObject); 
				return; 
			case EclPackage.CONJUNCTION_FILTER:
				sequence_ConjunctionFilter(context, (ConjunctionFilter) semanticObject); 
				return; 
			case EclPackage.DECIMAL_VALUE_COMPARISON:
				sequence_DecimalValueComparison(context, (DecimalValueComparison) semanticObject); 
				return; 
			case EclPackage.DEFINITION_STATUS_ID_FILTER:
				sequence_DefinitionStatusIdFilter(context, (DefinitionStatusIdFilter) semanticObject); 
				return; 
			case EclPackage.DEFINITION_STATUS_TOKEN_FILTER:
				sequence_DefinitionStatusTokenFilter(context, (DefinitionStatusTokenFilter) semanticObject); 
				return; 
			case EclPackage.DESCENDANT_OF:
				sequence_DescendantOf(context, (DescendantOf) semanticObject); 
				return; 
			case EclPackage.DESCENDANT_OR_SELF_OF:
				sequence_DescendantOrSelfOf(context, (DescendantOrSelfOf) semanticObject); 
				return; 
			case EclPackage.DIALECT:
				sequence_Dialect(context, (Dialect) semanticObject); 
				return; 
			case EclPackage.DIALECT_ALIAS:
				sequence_DialectAlias(context, (DialectAlias) semanticObject); 
				return; 
			case EclPackage.DIALECT_ALIAS_FILTER:
				sequence_DialectAliasFilter(context, (DialectAliasFilter) semanticObject); 
				return; 
			case EclPackage.DIALECT_ID_FILTER:
				sequence_DialectIdFilter(context, (DialectIdFilter) semanticObject); 
				return; 
			case EclPackage.DISJUNCTION_FILTER:
				sequence_DisjunctionFilter(context, (DisjunctionFilter) semanticObject); 
				return; 
			case EclPackage.DOTTED_EXPRESSION_CONSTRAINT:
				sequence_DottedExpressionConstraint(context, (DottedExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.ECL_ATTRIBUTE_GROUP:
				sequence_EclAttributeGroup(context, (EclAttributeGroup) semanticObject); 
				return; 
			case EclPackage.ECL_CONCEPT_REFERENCE:
				sequence_EclConceptReference(context, (EclConceptReference) semanticObject); 
				return; 
			case EclPackage.ECL_CONCEPT_REFERENCE_SET:
				sequence_EclConceptReferenceSet(context, (EclConceptReferenceSet) semanticObject); 
				return; 
			case EclPackage.EFFECTIVE_TIME_FILTER:
				sequence_EffectiveTimeFilter(context, (EffectiveTimeFilter) semanticObject); 
				return; 
			case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT:
				sequence_ExclusionExpressionConstraint(context, (ExclusionExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.FILTER_CONSTRAINT:
				sequence_FilterConstraint(context, (FilterConstraint) semanticObject); 
				return; 
			case EclPackage.FILTERED_EXPRESSION_CONSTRAINT:
				sequence_FilteredExpressionConstraint(context, (FilteredExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.HISTORY_PROFILE:
				sequence_HistoryProfile(context, (HistoryProfile) semanticObject); 
				return; 
			case EclPackage.HISTORY_SUPPLEMENT:
				sequence_HistorySupplement(context, (HistorySupplement) semanticObject); 
				return; 
			case EclPackage.ID_FILTER:
				sequence_IdFilter(context, (IdFilter) semanticObject); 
				return; 
			case EclPackage.INTEGER_VALUE_COMPARISON:
				sequence_IntegerValueComparison(context, (IntegerValueComparison) semanticObject); 
				return; 
			case EclPackage.LANGUAGE_FILTER:
				sequence_LanguageFilter(context, (LanguageFilter) semanticObject); 
				return; 
			case EclPackage.LANGUAGE_REF_SET_FILTER:
				sequence_LanguageRefSetFilter(context, (LanguageRefSetFilter) semanticObject); 
				return; 
			case EclPackage.MEMBER_FIELD_FILTER:
				sequence_MemberFieldFilter(context, (MemberFieldFilter) semanticObject); 
				return; 
			case EclPackage.MEMBER_OF:
				sequence_MemberOf(context, (MemberOf) semanticObject); 
				return; 
			case EclPackage.MODULE_FILTER:
				sequence_ModuleFilter(context, (ModuleFilter) semanticObject); 
				return; 
			case EclPackage.NESTED_EXPRESSION:
				sequence_NestedExpression(context, (NestedExpression) semanticObject); 
				return; 
			case EclPackage.NESTED_FILTER:
				sequence_NestedFilter(context, (NestedFilter) semanticObject); 
				return; 
			case EclPackage.NESTED_REFINEMENT:
				if (rule == grammarAccess.getEclAttributeSetRule()
						|| rule == grammarAccess.getOrAttributeSetRule()
						|| action == grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()
						|| rule == grammarAccess.getAndAttributeSetRule()
						|| action == grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()
						|| rule == grammarAccess.getSubAttributeSetRule()
						|| rule == grammarAccess.getNestedAttributeSetRule()) {
					sequence_NestedAttributeSet(context, (NestedRefinement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEclRefinementRule()
						|| rule == grammarAccess.getOrRefinementRule()
						|| action == grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()
						|| rule == grammarAccess.getAndRefinementRule()
						|| action == grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()
						|| rule == grammarAccess.getSubRefinementRule()
						|| rule == grammarAccess.getNestedRefinementRule()) {
					sequence_NestedRefinement(context, (NestedRefinement) semanticObject); 
					return; 
				}
				else break;
			case EclPackage.OR_EXPRESSION_CONSTRAINT:
				sequence_OrExpressionConstraint(context, (OrExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.OR_REFINEMENT:
				if (rule == grammarAccess.getEclAttributeSetRule()
						|| rule == grammarAccess.getOrAttributeSetRule()
						|| action == grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()) {
					sequence_OrAttributeSet(context, (OrRefinement) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEclRefinementRule()
						|| rule == grammarAccess.getOrRefinementRule()
						|| action == grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()) {
					sequence_OrRefinement(context, (OrRefinement) semanticObject); 
					return; 
				}
				else break;
			case EclPackage.PARENT_OF:
				sequence_ParentOf(context, (ParentOf) semanticObject); 
				return; 
			case EclPackage.PARENT_OR_SELF_OF:
				sequence_ParentOrSelfOf(context, (ParentOrSelfOf) semanticObject); 
				return; 
			case EclPackage.PREFERRED_IN_FILTER:
				sequence_PreferredInFilter(context, (PreferredInFilter) semanticObject); 
				return; 
			case EclPackage.REFINED_EXPRESSION_CONSTRAINT:
				sequence_RefinedExpressionConstraint(context, (RefinedExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
				return; 
			case EclPackage.SEMANTIC_TAG_FILTER:
				sequence_SemanticTagFilter(context, (SemanticTagFilter) semanticObject); 
				return; 
			case EclPackage.STRING_VALUE_COMPARISON:
				sequence_StringValueComparison(context, (StringValueComparison) semanticObject); 
				return; 
			case EclPackage.SUPPLEMENT_EXPRESSION_CONSTRAINT:
				sequence_SupplementExpressionConstraint(context, (SupplementExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.TERM_FILTER:
				sequence_TermFilter(context, (TermFilter) semanticObject); 
				return; 
			case EclPackage.TYPE_ID_FILTER:
				sequence_TypeIdFilter(context, (TypeIdFilter) semanticObject); 
				return; 
			case EclPackage.TYPE_TOKEN_FILTER:
				sequence_TypeTokenFilter(context, (TypeTokenFilter) semanticObject); 
				return; 
			case EclPackage.TYPED_SEARCH_TERM:
				sequence_TypedSearchTerm(context, (TypedSearchTerm) semanticObject); 
				return; 
			case EclPackage.TYPED_SEARCH_TERM_CLAUSE:
				sequence_TypedSearchTermClause(context, (TypedSearchTermClause) semanticObject); 
				return; 
			case EclPackage.TYPED_SEARCH_TERM_SET:
				sequence_TypedSearchTermSet(context, (TypedSearchTermSet) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Acceptability returns Acceptability
	 *
	 * Constraint:
	 *     acceptabilities=EclConceptReferenceSet
	 */
	protected void sequence_Acceptability(ISerializationContext context, Acceptability semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACCEPTABILITY__ACCEPTABILITIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACCEPTABILITY__ACCEPTABILITIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0(), semanticObject.getAcceptabilities());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns AcceptableInFilter
	 *     DisjunctionFilter returns AcceptableInFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns AcceptableInFilter
	 *     ConjunctionFilter returns AcceptableInFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns AcceptableInFilter
	 *     PropertyFilter returns AcceptableInFilter
	 *     AcceptableInFilter returns AcceptableInFilter
	 *
	 * Constraint:
	 *     languageRefSetId=FilterValue
	 */
	protected void sequence_AcceptableInFilter(ISerializationContext context, AcceptableInFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACCEPTABLE_IN_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACCEPTABLE_IN_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns ActiveFilter
	 *     DisjunctionFilter returns ActiveFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ActiveFilter
	 *     ConjunctionFilter returns ActiveFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ActiveFilter
	 *     PropertyFilter returns ActiveFilter
	 *     ActiveFilter returns ActiveFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR active=ActiveBoolean)
	 */
	protected void sequence_ActiveFilter(ISerializationContext context, ActiveFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACTIVE_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACTIVE_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACTIVE_FILTER__ACTIVE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACTIVE_FILTER__ACTIVE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getActiveFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0(), semanticObject.isActive());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns AncestorOf
	 *     OrExpressionConstraint returns AncestorOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns AncestorOf
	 *     AndExpressionConstraint returns AncestorOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns AncestorOf
	 *     ExclusionExpressionConstraint returns AncestorOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns AncestorOf
	 *     RefinedExpressionConstraint returns AncestorOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns AncestorOf
	 *     DottedExpressionConstraint returns AncestorOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns AncestorOf
	 *     SupplementExpressionConstraint returns AncestorOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns AncestorOf
	 *     FilteredExpressionConstraint returns AncestorOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns AncestorOf
	 *     SubExpressionConstraint returns AncestorOf
	 *     AncestorOf returns AncestorOf
	 *     FilterValue returns AncestorOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_AncestorOf(ISerializationContext context, AncestorOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ANCESTOR_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ANCESTOR_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns AncestorOrSelfOf
	 *     OrExpressionConstraint returns AncestorOrSelfOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     AndExpressionConstraint returns AncestorOrSelfOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     ExclusionExpressionConstraint returns AncestorOrSelfOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     RefinedExpressionConstraint returns AncestorOrSelfOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     DottedExpressionConstraint returns AncestorOrSelfOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     SupplementExpressionConstraint returns AncestorOrSelfOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     FilteredExpressionConstraint returns AncestorOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     SubExpressionConstraint returns AncestorOrSelfOf
	 *     AncestorOrSelfOf returns AncestorOrSelfOf
	 *     FilterValue returns AncestorOrSelfOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_AncestorOrSelfOf(ISerializationContext context, AncestorOrSelfOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ANCESTOR_OR_SELF_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ANCESTOR_OR_SELF_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclAttributeSet returns AndRefinement
	 *     OrAttributeSet returns AndRefinement
	 *     OrAttributeSet.OrRefinement_1_0 returns AndRefinement
	 *     AndAttributeSet returns AndRefinement
	 *     AndAttributeSet.AndRefinement_1_0 returns AndRefinement
	 *
	 * Constraint:
	 *     (left=AndAttributeSet_AndRefinement_1_0 right=SubAttributeSet)
	 */
	protected void sequence_AndAttributeSet(ISerializationContext context, AndRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_REFINEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_REFINEMENT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_REFINEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_REFINEMENT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns AndExpressionConstraint
	 *     OrExpressionConstraint returns AndExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns AndExpressionConstraint
	 *     AndExpressionConstraint returns AndExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns AndExpressionConstraint
	 *
	 * Constraint:
	 *     (left=AndExpressionConstraint_AndExpressionConstraint_1_0 right=ExclusionExpressionConstraint)
	 */
	protected void sequence_AndExpressionConstraint(ISerializationContext context, AndExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_EXPRESSION_CONSTRAINT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclRefinement returns AndRefinement
	 *     OrRefinement returns AndRefinement
	 *     OrRefinement.OrRefinement_1_0_0 returns AndRefinement
	 *     AndRefinement returns AndRefinement
	 *     AndRefinement.AndRefinement_1_0_0 returns AndRefinement
	 *
	 * Constraint:
	 *     (left=AndRefinement_AndRefinement_1_0_0 right=SubRefinement)
	 */
	protected void sequence_AndRefinement(ISerializationContext context, AndRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_REFINEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_REFINEMENT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.AND_REFINEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.AND_REFINEMENT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns Any
	 *     OrExpressionConstraint returns Any
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns Any
	 *     AndExpressionConstraint returns Any
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns Any
	 *     ExclusionExpressionConstraint returns Any
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns Any
	 *     RefinedExpressionConstraint returns Any
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns Any
	 *     DottedExpressionConstraint returns Any
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns Any
	 *     SupplementExpressionConstraint returns Any
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns Any
	 *     FilteredExpressionConstraint returns Any
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns Any
	 *     SubExpressionConstraint returns Any
	 *     EclFocusConcept returns Any
	 *     Any returns Any
	 *     FilterValue returns Any
	 *
	 * Constraint:
	 *     {Any}
	 */
	protected void sequence_Any(ISerializationContext context, Any semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns AttributeComparison
	 *     AttributeComparison returns AttributeComparison
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint)
	 */
	protected void sequence_AttributeComparison(ISerializationContext context, AttributeComparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ATTRIBUTE_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ATTRIBUTE_COMPARISON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclRefinement returns AttributeConstraint
	 *     OrRefinement returns AttributeConstraint
	 *     OrRefinement.OrRefinement_1_0_0 returns AttributeConstraint
	 *     AndRefinement returns AttributeConstraint
	 *     AndRefinement.AndRefinement_1_0_0 returns AttributeConstraint
	 *     SubRefinement returns AttributeConstraint
	 *     EclAttributeSet returns AttributeConstraint
	 *     OrAttributeSet returns AttributeConstraint
	 *     OrAttributeSet.OrRefinement_1_0 returns AttributeConstraint
	 *     AndAttributeSet returns AttributeConstraint
	 *     AndAttributeSet.AndRefinement_1_0 returns AttributeConstraint
	 *     SubAttributeSet returns AttributeConstraint
	 *     AttributeConstraint returns AttributeConstraint
	 *
	 * Constraint:
	 *     (cardinality=Cardinality? reversed?=REVERSED? attribute=FilteredExpressionConstraint comparison=Comparison?)
	 */
	protected void sequence_AttributeConstraint(ISerializationContext context, AttributeConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns BooleanValueComparison
	 *     DataTypeComparison returns BooleanValueComparison
	 *     BooleanValueComparison returns BooleanValueComparison
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR value=Boolean)
	 */
	protected void sequence_BooleanValueComparison(ISerializationContext context, BooleanValueComparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.BOOLEAN_VALUE_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.BOOLEAN_VALUE_COMPARISON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Cardinality returns Cardinality
	 *
	 * Constraint:
	 *     (min=NonNegativeInteger max=MaxValue)
	 */
	protected void sequence_Cardinality(ISerializationContext context, Cardinality semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CARDINALITY__MIN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CARDINALITY__MIN));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CARDINALITY__MAX) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CARDINALITY__MAX));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0(), semanticObject.getMin());
		feeder.accept(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0(), semanticObject.getMax());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns CaseSignificanceFilter
	 *     DisjunctionFilter returns CaseSignificanceFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns CaseSignificanceFilter
	 *     ConjunctionFilter returns CaseSignificanceFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns CaseSignificanceFilter
	 *     PropertyFilter returns CaseSignificanceFilter
	 *     CaseSignificanceFilter returns CaseSignificanceFilter
	 *
	 * Constraint:
	 *     caseSignificanceId=FilterValue
	 */
	protected void sequence_CaseSignificanceFilter(ISerializationContext context, CaseSignificanceFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0(), semanticObject.getCaseSignificanceId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns ChildOf
	 *     OrExpressionConstraint returns ChildOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ChildOf
	 *     AndExpressionConstraint returns ChildOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ChildOf
	 *     ExclusionExpressionConstraint returns ChildOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ChildOf
	 *     RefinedExpressionConstraint returns ChildOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ChildOf
	 *     DottedExpressionConstraint returns ChildOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ChildOf
	 *     SupplementExpressionConstraint returns ChildOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns ChildOf
	 *     FilteredExpressionConstraint returns ChildOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ChildOf
	 *     SubExpressionConstraint returns ChildOf
	 *     ChildOf returns ChildOf
	 *     FilterValue returns ChildOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_ChildOf(ISerializationContext context, ChildOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CHILD_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CHILD_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns ChildOrSelfOf
	 *     OrExpressionConstraint returns ChildOrSelfOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     AndExpressionConstraint returns ChildOrSelfOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     ExclusionExpressionConstraint returns ChildOrSelfOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     RefinedExpressionConstraint returns ChildOrSelfOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     DottedExpressionConstraint returns ChildOrSelfOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     SupplementExpressionConstraint returns ChildOrSelfOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     FilteredExpressionConstraint returns ChildOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     SubExpressionConstraint returns ChildOrSelfOf
	 *     ChildOrSelfOf returns ChildOrSelfOf
	 *     FilterValue returns ChildOrSelfOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_ChildOrSelfOf(ISerializationContext context, ChildOrSelfOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CHILD_OR_SELF_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CHILD_OR_SELF_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns ConjunctionFilter
	 *     DisjunctionFilter returns ConjunctionFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ConjunctionFilter
	 *     ConjunctionFilter returns ConjunctionFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ConjunctionFilter
	 *
	 * Constraint:
	 *     (left=ConjunctionFilter_ConjunctionFilter_1_0 right=PropertyFilter)
	 */
	protected void sequence_ConjunctionFilter(ISerializationContext context, ConjunctionFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CONJUNCTION_FILTER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CONJUNCTION_FILTER__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CONJUNCTION_FILTER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CONJUNCTION_FILTER__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns DecimalValueComparison
	 *     DataTypeComparison returns DecimalValueComparison
	 *     DecimalValueComparison returns DecimalValueComparison
	 *
	 * Constraint:
	 *     (op=NUMERIC_OPERATOR value=Decimal)
	 */
	protected void sequence_DecimalValueComparison(ISerializationContext context, DecimalValueComparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DECIMAL_VALUE_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DECIMAL_VALUE_COMPARISON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns DefinitionStatusIdFilter
	 *     DisjunctionFilter returns DefinitionStatusIdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DefinitionStatusIdFilter
	 *     ConjunctionFilter returns DefinitionStatusIdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DefinitionStatusIdFilter
	 *     PropertyFilter returns DefinitionStatusIdFilter
	 *     DefinitionStatusFilter returns DefinitionStatusIdFilter
	 *     DefinitionStatusIdFilter returns DefinitionStatusIdFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR definitionStatus=FilterValue)
	 */
	protected void sequence_DefinitionStatusIdFilter(ISerializationContext context, DefinitionStatusIdFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DEFINITION_STATUS_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DEFINITION_STATUS_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DEFINITION_STATUS_ID_FILTER__DEFINITION_STATUS));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0(), semanticObject.getDefinitionStatus());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns DefinitionStatusTokenFilter
	 *     DisjunctionFilter returns DefinitionStatusTokenFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DefinitionStatusTokenFilter
	 *     ConjunctionFilter returns DefinitionStatusTokenFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DefinitionStatusTokenFilter
	 *     PropertyFilter returns DefinitionStatusTokenFilter
	 *     DefinitionStatusFilter returns DefinitionStatusTokenFilter
	 *     DefinitionStatusTokenFilter returns DefinitionStatusTokenFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (definitionStatusTokens+=UnquotedString | definitionStatusTokens+=UnquotedString+))
	 */
	protected void sequence_DefinitionStatusTokenFilter(ISerializationContext context, DefinitionStatusTokenFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns DescendantOf
	 *     OrExpressionConstraint returns DescendantOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DescendantOf
	 *     AndExpressionConstraint returns DescendantOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DescendantOf
	 *     ExclusionExpressionConstraint returns DescendantOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DescendantOf
	 *     RefinedExpressionConstraint returns DescendantOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DescendantOf
	 *     DottedExpressionConstraint returns DescendantOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DescendantOf
	 *     SupplementExpressionConstraint returns DescendantOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns DescendantOf
	 *     FilteredExpressionConstraint returns DescendantOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns DescendantOf
	 *     SubExpressionConstraint returns DescendantOf
	 *     DescendantOf returns DescendantOf
	 *     FilterValue returns DescendantOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_DescendantOf(ISerializationContext context, DescendantOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DESCENDANT_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DESCENDANT_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns DescendantOrSelfOf
	 *     OrExpressionConstraint returns DescendantOrSelfOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     AndExpressionConstraint returns DescendantOrSelfOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     ExclusionExpressionConstraint returns DescendantOrSelfOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     RefinedExpressionConstraint returns DescendantOrSelfOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     DottedExpressionConstraint returns DescendantOrSelfOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     SupplementExpressionConstraint returns DescendantOrSelfOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     FilteredExpressionConstraint returns DescendantOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     SubExpressionConstraint returns DescendantOrSelfOf
	 *     DescendantOrSelfOf returns DescendantOrSelfOf
	 *     FilterValue returns DescendantOrSelfOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_DescendantOrSelfOf(ISerializationContext context, DescendantOrSelfOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DESCENDANT_OR_SELF_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DESCENDANT_OR_SELF_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns DialectAliasFilter
	 *     DisjunctionFilter returns DialectAliasFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DialectAliasFilter
	 *     ConjunctionFilter returns DialectAliasFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DialectAliasFilter
	 *     PropertyFilter returns DialectAliasFilter
	 *     DialectFilter returns DialectAliasFilter
	 *     DialectAliasFilter returns DialectAliasFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | dialects+=DialectAlias+))
	 */
	protected void sequence_DialectAliasFilter(ISerializationContext context, DialectAliasFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DialectAlias returns DialectAlias
	 *
	 * Constraint:
	 *     (alias=DialectAliasValue acceptability=Acceptability?)
	 */
	protected void sequence_DialectAlias(ISerializationContext context, DialectAlias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns DialectIdFilter
	 *     DisjunctionFilter returns DialectIdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DialectIdFilter
	 *     ConjunctionFilter returns DialectIdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DialectIdFilter
	 *     PropertyFilter returns DialectIdFilter
	 *     DialectFilter returns DialectIdFilter
	 *     DialectIdFilter returns DialectIdFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (dialects+=Dialect | dialects+=Dialect+))
	 */
	protected void sequence_DialectIdFilter(ISerializationContext context, DialectIdFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Dialect returns Dialect
	 *
	 * Constraint:
	 *     (languageRefSetId=FilteredExpressionConstraint acceptability=Acceptability?)
	 */
	protected void sequence_Dialect(ISerializationContext context, Dialect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns DisjunctionFilter
	 *     DisjunctionFilter returns DisjunctionFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DisjunctionFilter
	 *
	 * Constraint:
	 *     (left=DisjunctionFilter_DisjunctionFilter_1_0 right=ConjunctionFilter)
	 */
	protected void sequence_DisjunctionFilter(ISerializationContext context, DisjunctionFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DISJUNCTION_FILTER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DISJUNCTION_FILTER__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DISJUNCTION_FILTER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DISJUNCTION_FILTER__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns DottedExpressionConstraint
	 *     OrExpressionConstraint returns DottedExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DottedExpressionConstraint
	 *     AndExpressionConstraint returns DottedExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DottedExpressionConstraint
	 *     ExclusionExpressionConstraint returns DottedExpressionConstraint
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DottedExpressionConstraint
	 *     RefinedExpressionConstraint returns DottedExpressionConstraint
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DottedExpressionConstraint
	 *     DottedExpressionConstraint returns DottedExpressionConstraint
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DottedExpressionConstraint
	 *
	 * Constraint:
	 *     (constraint=DottedExpressionConstraint_DottedExpressionConstraint_1_0 attribute=SupplementExpressionConstraint)
	 */
	protected void sequence_DottedExpressionConstraint(ISerializationContext context, DottedExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DOTTED_EXPRESSION_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DOTTED_EXPRESSION_CONSTRAINT__CONSTRAINT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.DOTTED_EXPRESSION_CONSTRAINT__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.DOTTED_EXPRESSION_CONSTRAINT__ATTRIBUTE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getAttribute());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclRefinement returns EclAttributeGroup
	 *     OrRefinement returns EclAttributeGroup
	 *     OrRefinement.OrRefinement_1_0_0 returns EclAttributeGroup
	 *     AndRefinement returns EclAttributeGroup
	 *     AndRefinement.AndRefinement_1_0_0 returns EclAttributeGroup
	 *     SubRefinement returns EclAttributeGroup
	 *     EclAttributeGroup returns EclAttributeGroup
	 *
	 * Constraint:
	 *     (cardinality=Cardinality? refinement=EclAttributeSet)
	 */
	protected void sequence_EclAttributeGroup(ISerializationContext context, EclAttributeGroup semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EclConceptReferenceSet returns EclConceptReferenceSet
	 *     FilterValue returns EclConceptReferenceSet
	 *
	 * Constraint:
	 *     concepts+=EclConceptReference+
	 */
	protected void sequence_EclConceptReferenceSet(ISerializationContext context, EclConceptReferenceSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns EclConceptReference
	 *     OrExpressionConstraint returns EclConceptReference
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns EclConceptReference
	 *     AndExpressionConstraint returns EclConceptReference
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns EclConceptReference
	 *     ExclusionExpressionConstraint returns EclConceptReference
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns EclConceptReference
	 *     RefinedExpressionConstraint returns EclConceptReference
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns EclConceptReference
	 *     DottedExpressionConstraint returns EclConceptReference
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns EclConceptReference
	 *     SupplementExpressionConstraint returns EclConceptReference
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns EclConceptReference
	 *     FilteredExpressionConstraint returns EclConceptReference
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns EclConceptReference
	 *     SubExpressionConstraint returns EclConceptReference
	 *     EclFocusConcept returns EclConceptReference
	 *     EclConceptReference returns EclConceptReference
	 *     FilterValue returns EclConceptReference
	 *
	 * Constraint:
	 *     (id=Identifier term=PIPE_DELIMITED_STRING?)
	 */
	protected void sequence_EclConceptReference(ISerializationContext context, EclConceptReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns EffectiveTimeFilter
	 *     DisjunctionFilter returns EffectiveTimeFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns EffectiveTimeFilter
	 *     ConjunctionFilter returns EffectiveTimeFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns EffectiveTimeFilter
	 *     PropertyFilter returns EffectiveTimeFilter
	 *     EffectiveTimeFilter returns EffectiveTimeFilter
	 *
	 * Constraint:
	 *     (op=NUMERIC_OPERATOR effectiveTime=STRING)
	 */
	protected void sequence_EffectiveTimeFilter(ISerializationContext context, EffectiveTimeFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EFFECTIVE_TIME_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EFFECTIVE_TIME_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EFFECTIVE_TIME_FILTER__EFFECTIVE_TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EFFECTIVE_TIME_FILTER__EFFECTIVE_TIME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0(), semanticObject.getEffectiveTime());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns ExclusionExpressionConstraint
	 *     OrExpressionConstraint returns ExclusionExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ExclusionExpressionConstraint
	 *     AndExpressionConstraint returns ExclusionExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ExclusionExpressionConstraint
	 *     ExclusionExpressionConstraint returns ExclusionExpressionConstraint
	 *
	 * Constraint:
	 *     (left=ExclusionExpressionConstraint_ExclusionExpressionConstraint_1_0 right=RefinedExpressionConstraint)
	 */
	protected void sequence_ExclusionExpressionConstraint(ISerializationContext context, ExclusionExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EXCLUSION_EXPRESSION_CONSTRAINT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns FilterConstraint
	 *
	 * Constraint:
	 *     (domain=SHORT_DOMAIN? filter=Filter)
	 */
	protected void sequence_FilterConstraint(ISerializationContext context, FilterConstraint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns FilteredExpressionConstraint
	 *     OrExpressionConstraint returns FilteredExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     AndExpressionConstraint returns FilteredExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     ExclusionExpressionConstraint returns FilteredExpressionConstraint
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     RefinedExpressionConstraint returns FilteredExpressionConstraint
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     DottedExpressionConstraint returns FilteredExpressionConstraint
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     SupplementExpressionConstraint returns FilteredExpressionConstraint
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     FilteredExpressionConstraint returns FilteredExpressionConstraint
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns FilteredExpressionConstraint
	 *     FilterValue returns FilteredExpressionConstraint
	 *
	 * Constraint:
	 *     (constraint=FilteredExpressionConstraint_FilteredExpressionConstraint_1_0 filter=FilterConstraint)
	 */
	protected void sequence_FilteredExpressionConstraint(ISerializationContext context, FilteredExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.FILTERED_EXPRESSION_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.FILTERED_EXPRESSION_CONSTRAINT__CONSTRAINT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.FILTERED_EXPRESSION_CONSTRAINT__FILTER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.FILTERED_EXPRESSION_CONSTRAINT__FILTER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0(), semanticObject.getFilter());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     HistoryProfile returns HistoryProfile
	 *
	 * Constraint:
	 *     profile=HISTORY_PROFILE_TYPE
	 */
	protected void sequence_HistoryProfile(ISerializationContext context, HistoryProfile semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.HISTORY_PROFILE__PROFILE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.HISTORY_PROFILE__PROFILE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getHistoryProfileAccess().getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0(), semanticObject.getProfile());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Supplement returns HistorySupplement
	 *     HistorySupplement returns HistorySupplement
	 *
	 * Constraint:
	 *     (history=HistoryProfile | history=NestedExpression)?
	 */
	protected void sequence_HistorySupplement(ISerializationContext context, HistorySupplement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns IdFilter
	 *     DisjunctionFilter returns IdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns IdFilter
	 *     ConjunctionFilter returns IdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns IdFilter
	 *     PropertyFilter returns IdFilter
	 *     IdFilter returns IdFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (ids+=Identifier | ids+=Identifier+))
	 */
	protected void sequence_IdFilter(ISerializationContext context, IdFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns IntegerValueComparison
	 *     DataTypeComparison returns IntegerValueComparison
	 *     IntegerValueComparison returns IntegerValueComparison
	 *
	 * Constraint:
	 *     (op=NUMERIC_OPERATOR value=Integer)
	 */
	protected void sequence_IntegerValueComparison(ISerializationContext context, IntegerValueComparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.INTEGER_VALUE_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.INTEGER_VALUE_COMPARISON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns LanguageFilter
	 *     DisjunctionFilter returns LanguageFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns LanguageFilter
	 *     ConjunctionFilter returns LanguageFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns LanguageFilter
	 *     PropertyFilter returns LanguageFilter
	 *     LanguageFilter returns LanguageFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | languageCodes+=UnquotedString+))
	 */
	protected void sequence_LanguageFilter(ISerializationContext context, LanguageFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns LanguageRefSetFilter
	 *     DisjunctionFilter returns LanguageRefSetFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns LanguageRefSetFilter
	 *     ConjunctionFilter returns LanguageRefSetFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns LanguageRefSetFilter
	 *     PropertyFilter returns LanguageRefSetFilter
	 *     LanguageRefSetFilter returns LanguageRefSetFilter
	 *
	 * Constraint:
	 *     languageRefSetId=FilterValue
	 */
	protected void sequence_LanguageRefSetFilter(ISerializationContext context, LanguageRefSetFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.LANGUAGE_REF_SET_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.LANGUAGE_REF_SET_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns MemberFieldFilter
	 *     DisjunctionFilter returns MemberFieldFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns MemberFieldFilter
	 *     ConjunctionFilter returns MemberFieldFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns MemberFieldFilter
	 *     PropertyFilter returns MemberFieldFilter
	 *     MemberFieldFilter returns MemberFieldFilter
	 *
	 * Constraint:
	 *     (refsetFieldName=UnquotedString comparison=Comparison)
	 */
	protected void sequence_MemberFieldFilter(ISerializationContext context, MemberFieldFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.MEMBER_FIELD_FILTER__REFSET_FIELD_NAME));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.MEMBER_FIELD_FILTER__COMPARISON) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.MEMBER_FIELD_FILTER__COMPARISON));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0(), semanticObject.getRefsetFieldName());
		feeder.accept(grammarAccess.getMemberFieldFilterAccess().getComparisonComparisonParserRuleCall_1_0(), semanticObject.getComparison());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns MemberOf
	 *     OrExpressionConstraint returns MemberOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns MemberOf
	 *     AndExpressionConstraint returns MemberOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns MemberOf
	 *     ExclusionExpressionConstraint returns MemberOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns MemberOf
	 *     RefinedExpressionConstraint returns MemberOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns MemberOf
	 *     DottedExpressionConstraint returns MemberOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns MemberOf
	 *     SupplementExpressionConstraint returns MemberOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns MemberOf
	 *     FilteredExpressionConstraint returns MemberOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns MemberOf
	 *     SubExpressionConstraint returns MemberOf
	 *     EclFocusConcept returns MemberOf
	 *     MemberOf returns MemberOf
	 *     FilterValue returns MemberOf
	 *
	 * Constraint:
	 *     ((refsetFields+=UnquotedString refsetFields+=UnquotedString*)? (constraint=EclConceptReference | constraint=Any | constraint=NestedExpression))
	 */
	protected void sequence_MemberOf(ISerializationContext context, MemberOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns ModuleFilter
	 *     DisjunctionFilter returns ModuleFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ModuleFilter
	 *     ConjunctionFilter returns ModuleFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ModuleFilter
	 *     PropertyFilter returns ModuleFilter
	 *     ModuleFilter returns ModuleFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR moduleId=FilterValue)
	 */
	protected void sequence_ModuleFilter(ISerializationContext context, ModuleFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.MODULE_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.MODULE_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.MODULE_FILTER__MODULE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.MODULE_FILTER__MODULE_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModuleFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0(), semanticObject.getModuleId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclAttributeSet returns NestedRefinement
	 *     OrAttributeSet returns NestedRefinement
	 *     OrAttributeSet.OrRefinement_1_0 returns NestedRefinement
	 *     AndAttributeSet returns NestedRefinement
	 *     AndAttributeSet.AndRefinement_1_0 returns NestedRefinement
	 *     SubAttributeSet returns NestedRefinement
	 *     NestedAttributeSet returns NestedRefinement
	 *
	 * Constraint:
	 *     nested=EclAttributeSet
	 */
	protected void sequence_NestedAttributeSet(ISerializationContext context, NestedRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.NESTED_REFINEMENT__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.NESTED_REFINEMENT__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns NestedExpression
	 *     OrExpressionConstraint returns NestedExpression
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns NestedExpression
	 *     AndExpressionConstraint returns NestedExpression
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns NestedExpression
	 *     ExclusionExpressionConstraint returns NestedExpression
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns NestedExpression
	 *     RefinedExpressionConstraint returns NestedExpression
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns NestedExpression
	 *     DottedExpressionConstraint returns NestedExpression
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns NestedExpression
	 *     SupplementExpressionConstraint returns NestedExpression
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns NestedExpression
	 *     FilteredExpressionConstraint returns NestedExpression
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns NestedExpression
	 *     SubExpressionConstraint returns NestedExpression
	 *     EclFocusConcept returns NestedExpression
	 *     NestedExpression returns NestedExpression
	 *     FilterValue returns NestedExpression
	 *
	 * Constraint:
	 *     nested=ExpressionConstraint
	 */
	protected void sequence_NestedExpression(ISerializationContext context, NestedExpression semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.NESTED_EXPRESSION__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.NESTED_EXPRESSION__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns NestedFilter
	 *     DisjunctionFilter returns NestedFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns NestedFilter
	 *     ConjunctionFilter returns NestedFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns NestedFilter
	 *     NestedFilter returns NestedFilter
	 *     PropertyFilter returns NestedFilter
	 *
	 * Constraint:
	 *     nested=Filter
	 */
	protected void sequence_NestedFilter(ISerializationContext context, NestedFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.NESTED_FILTER__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.NESTED_FILTER__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclRefinement returns NestedRefinement
	 *     OrRefinement returns NestedRefinement
	 *     OrRefinement.OrRefinement_1_0_0 returns NestedRefinement
	 *     AndRefinement returns NestedRefinement
	 *     AndRefinement.AndRefinement_1_0_0 returns NestedRefinement
	 *     SubRefinement returns NestedRefinement
	 *     NestedRefinement returns NestedRefinement
	 *
	 * Constraint:
	 *     nested=EclRefinement
	 */
	protected void sequence_NestedRefinement(ISerializationContext context, NestedRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.NESTED_REFINEMENT__NESTED) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.NESTED_REFINEMENT__NESTED));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0(), semanticObject.getNested());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclAttributeSet returns OrRefinement
	 *     OrAttributeSet returns OrRefinement
	 *     OrAttributeSet.OrRefinement_1_0 returns OrRefinement
	 *
	 * Constraint:
	 *     (left=OrAttributeSet_OrRefinement_1_0 right=AndAttributeSet)
	 */
	protected void sequence_OrAttributeSet(ISerializationContext context, OrRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_REFINEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_REFINEMENT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_REFINEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_REFINEMENT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns OrExpressionConstraint
	 *     OrExpressionConstraint returns OrExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns OrExpressionConstraint
	 *
	 * Constraint:
	 *     (left=OrExpressionConstraint_OrExpressionConstraint_1_0 right=AndExpressionConstraint)
	 */
	protected void sequence_OrExpressionConstraint(ISerializationContext context, OrExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_EXPRESSION_CONSTRAINT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EclRefinement returns OrRefinement
	 *     OrRefinement returns OrRefinement
	 *     OrRefinement.OrRefinement_1_0_0 returns OrRefinement
	 *
	 * Constraint:
	 *     (left=OrRefinement_OrRefinement_1_0_0 right=AndRefinement)
	 */
	protected void sequence_OrRefinement(ISerializationContext context, OrRefinement semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_REFINEMENT__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_REFINEMENT__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.OR_REFINEMENT__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.OR_REFINEMENT__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns ParentOf
	 *     OrExpressionConstraint returns ParentOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ParentOf
	 *     AndExpressionConstraint returns ParentOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ParentOf
	 *     ExclusionExpressionConstraint returns ParentOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ParentOf
	 *     RefinedExpressionConstraint returns ParentOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ParentOf
	 *     DottedExpressionConstraint returns ParentOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ParentOf
	 *     SupplementExpressionConstraint returns ParentOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns ParentOf
	 *     FilteredExpressionConstraint returns ParentOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ParentOf
	 *     SubExpressionConstraint returns ParentOf
	 *     ParentOf returns ParentOf
	 *     FilterValue returns ParentOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_ParentOf(ISerializationContext context, ParentOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.PARENT_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.PARENT_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns ParentOrSelfOf
	 *     OrExpressionConstraint returns ParentOrSelfOf
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     AndExpressionConstraint returns ParentOrSelfOf
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     ExclusionExpressionConstraint returns ParentOrSelfOf
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     RefinedExpressionConstraint returns ParentOrSelfOf
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     DottedExpressionConstraint returns ParentOrSelfOf
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     SupplementExpressionConstraint returns ParentOrSelfOf
	 *     SupplementExpressionConstraint.SupplementExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     FilteredExpressionConstraint returns ParentOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     SubExpressionConstraint returns ParentOrSelfOf
	 *     ParentOrSelfOf returns ParentOrSelfOf
	 *     FilterValue returns ParentOrSelfOf
	 *
	 * Constraint:
	 *     constraint=EclFocusConcept
	 */
	protected void sequence_ParentOrSelfOf(ISerializationContext context, ParentOrSelfOf semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.PARENT_OR_SELF_OF__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.PARENT_OR_SELF_OF__CONSTRAINT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0(), semanticObject.getConstraint());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns PreferredInFilter
	 *     DisjunctionFilter returns PreferredInFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns PreferredInFilter
	 *     ConjunctionFilter returns PreferredInFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns PreferredInFilter
	 *     PropertyFilter returns PreferredInFilter
	 *     PreferredInFilter returns PreferredInFilter
	 *
	 * Constraint:
	 *     languageRefSetId=FilterValue
	 */
	protected void sequence_PreferredInFilter(ISerializationContext context, PreferredInFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.PREFERRED_IN_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.PREFERRED_IN_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns RefinedExpressionConstraint
	 *     OrExpressionConstraint returns RefinedExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns RefinedExpressionConstraint
	 *     AndExpressionConstraint returns RefinedExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns RefinedExpressionConstraint
	 *     ExclusionExpressionConstraint returns RefinedExpressionConstraint
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns RefinedExpressionConstraint
	 *     RefinedExpressionConstraint returns RefinedExpressionConstraint
	 *
	 * Constraint:
	 *     (constraint=RefinedExpressionConstraint_RefinedExpressionConstraint_1_0 refinement=EclRefinement)
	 */
	protected void sequence_RefinedExpressionConstraint(ISerializationContext context, RefinedExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.REFINED_EXPRESSION_CONSTRAINT__CONSTRAINT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.REFINED_EXPRESSION_CONSTRAINT__REFINEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.REFINED_EXPRESSION_CONSTRAINT__REFINEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0(), semanticObject.getRefinement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Script returns Script
	 *
	 * Constraint:
	 *     constraint=ExpressionConstraint?
	 */
	protected void sequence_Script(ISerializationContext context, Script semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns SemanticTagFilter
	 *     DisjunctionFilter returns SemanticTagFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns SemanticTagFilter
	 *     ConjunctionFilter returns SemanticTagFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns SemanticTagFilter
	 *     PropertyFilter returns SemanticTagFilter
	 *     SemanticTagFilter returns SemanticTagFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR semanticTag=STRING)
	 */
	protected void sequence_SemanticTagFilter(ISerializationContext context, SemanticTagFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.SEMANTIC_TAG_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.SEMANTIC_TAG_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.SEMANTIC_TAG_FILTER__SEMANTIC_TAG) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.SEMANTIC_TAG_FILTER__SEMANTIC_TAG));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0(), semanticObject.getSemanticTag());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns StringValueComparison
	 *     DataTypeComparison returns StringValueComparison
	 *     StringValueComparison returns StringValueComparison
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR value=SearchTerm)
	 */
	protected void sequence_StringValueComparison(ISerializationContext context, StringValueComparison semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.COMPARISON__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.COMPARISON__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.STRING_VALUE_COMPARISON__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.STRING_VALUE_COMPARISON__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getStringValueComparisonAccess().getValueSearchTermParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns SupplementExpressionConstraint
	 *     OrExpressionConstraint returns SupplementExpressionConstraint
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns SupplementExpressionConstraint
	 *     AndExpressionConstraint returns SupplementExpressionConstraint
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns SupplementExpressionConstraint
	 *     ExclusionExpressionConstraint returns SupplementExpressionConstraint
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns SupplementExpressionConstraint
	 *     RefinedExpressionConstraint returns SupplementExpressionConstraint
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns SupplementExpressionConstraint
	 *     DottedExpressionConstraint returns SupplementExpressionConstraint
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns SupplementExpressionConstraint
	 *     SupplementExpressionConstraint returns SupplementExpressionConstraint
	 *
	 * Constraint:
	 *     (constraint=SupplementExpressionConstraint_SupplementExpressionConstraint_1_0 supplement=Supplement)
	 */
	protected void sequence_SupplementExpressionConstraint(ISerializationContext context, SupplementExpressionConstraint semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.SUPPLEMENT_EXPRESSION_CONSTRAINT__CONSTRAINT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.SUPPLEMENT_EXPRESSION_CONSTRAINT__SUPPLEMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementExpressionConstraintConstraintAction_1_0(), semanticObject.getConstraint());
		feeder.accept(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0(), semanticObject.getSupplement());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns TermFilter
	 *     DisjunctionFilter returns TermFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TermFilter
	 *     ConjunctionFilter returns TermFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TermFilter
	 *     PropertyFilter returns TermFilter
	 *     TermFilter returns TermFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR searchTerm=SearchTerm)
	 */
	protected void sequence_TermFilter(ISerializationContext context, TermFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TERM_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TERM_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TERM_FILTER__SEARCH_TERM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TERM_FILTER__SEARCH_TERM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getTermFilterAccess().getSearchTermSearchTermParserRuleCall_2_0(), semanticObject.getSearchTerm());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns TypeIdFilter
	 *     DisjunctionFilter returns TypeIdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypeIdFilter
	 *     ConjunctionFilter returns TypeIdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypeIdFilter
	 *     PropertyFilter returns TypeIdFilter
	 *     TypeFilter returns TypeIdFilter
	 *     TypeIdFilter returns TypeIdFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR type=FilterValue)
	 */
	protected void sequence_TypeIdFilter(ISerializationContext context, TypeIdFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TYPE_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TYPE_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TYPE_ID_FILTER__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TYPE_ID_FILTER__TYPE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Filter returns TypeTokenFilter
	 *     DisjunctionFilter returns TypeTokenFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypeTokenFilter
	 *     ConjunctionFilter returns TypeTokenFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypeTokenFilter
	 *     PropertyFilter returns TypeTokenFilter
	 *     TypeFilter returns TypeTokenFilter
	 *     TypeTokenFilter returns TypeTokenFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | tokens+=UnquotedString+))
	 */
	protected void sequence_TypeTokenFilter(ISerializationContext context, TypeTokenFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     TypedSearchTermClause returns TypedSearchTermClause
	 *
	 * Constraint:
	 *     ((lexicalSearchType=LEXICAL_SEARCH_TYPE? term=STRING) | (lexicalSearchType=REGEX_KEYWORD term=RegularExpression))
	 */
	protected void sequence_TypedSearchTermClause(ISerializationContext context, TypedSearchTermClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SearchTerm returns TypedSearchTermSet
	 *     TypedSearchTermSet returns TypedSearchTermSet
	 *
	 * Constraint:
	 *     clauses+=TypedSearchTermClause+
	 */
	protected void sequence_TypedSearchTermSet(ISerializationContext context, TypedSearchTermSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     SearchTerm returns TypedSearchTerm
	 *     TypedSearchTerm returns TypedSearchTerm
	 *
	 * Constraint:
	 *     clause=TypedSearchTermClause
	 */
	protected void sequence_TypedSearchTerm(ISerializationContext context, TypedSearchTerm semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TYPED_SEARCH_TERM__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TYPED_SEARCH_TERM__CLAUSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedSearchTermAccess().getClauseTypedSearchTermClauseParserRuleCall_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
}
