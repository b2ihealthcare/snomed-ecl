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

import com.b2international.snomed.ecl.ecl.AcceptabilityIdSet;
import com.b2international.snomed.ecl.ecl.AcceptabilityTokenSet;
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
import com.b2international.snomed.ecl.ecl.FilteredExpressionConstraint;
import com.b2international.snomed.ecl.ecl.IntegerValueComparison;
import com.b2international.snomed.ecl.ecl.LanguageFilter;
import com.b2international.snomed.ecl.ecl.LanguageRefSetFilter;
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
import com.b2international.snomed.ecl.ecl.TypeIdFilter;
import com.b2international.snomed.ecl.ecl.TypeTokenFilter;
import com.b2international.snomed.ecl.ecl.TypedTermFilter;
import com.b2international.snomed.ecl.ecl.TypedTermFilterClause;
import com.b2international.snomed.ecl.ecl.TypedTermFilterSet;
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
			case EclPackage.ACCEPTABILITY_ID_SET:
				sequence_AcceptabilityIdSet(context, (AcceptabilityIdSet) semanticObject); 
				return; 
			case EclPackage.ACCEPTABILITY_TOKEN_SET:
				sequence_AcceptabilityTokenSet(context, (AcceptabilityTokenSet) semanticObject); 
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
			case EclPackage.FILTERED_EXPRESSION_CONSTRAINT:
				sequence_FilteredExpressionConstraint(context, (FilteredExpressionConstraint) semanticObject); 
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
			case EclPackage.TYPE_ID_FILTER:
				sequence_TypeIdFilter(context, (TypeIdFilter) semanticObject); 
				return; 
			case EclPackage.TYPE_TOKEN_FILTER:
				sequence_TypeTokenFilter(context, (TypeTokenFilter) semanticObject); 
				return; 
			case EclPackage.TYPED_TERM_FILTER:
				sequence_TypedTermFilter(context, (TypedTermFilter) semanticObject); 
				return; 
			case EclPackage.TYPED_TERM_FILTER_CLAUSE:
				sequence_TypedTermFilterClause(context, (TypedTermFilterClause) semanticObject); 
				return; 
			case EclPackage.TYPED_TERM_FILTER_SET:
				sequence_TypedTermFilterSet(context, (TypedTermFilterSet) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Acceptability returns AcceptabilityIdSet
	 *     AcceptabilityIdSet returns AcceptabilityIdSet
	 *
	 * Constraint:
	 *     acceptabilities=EclConceptReferenceSet
	 */
	protected void sequence_AcceptabilityIdSet(ISerializationContext context, AcceptabilityIdSet semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACCEPTABILITY_ID_SET__ACCEPTABILITIES) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACCEPTABILITY_ID_SET__ACCEPTABILITIES));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0(), semanticObject.getAcceptabilities());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Acceptability returns AcceptabilityTokenSet
	 *     AcceptabilityTokenSet returns AcceptabilityTokenSet
	 *
	 * Constraint:
	 *     acceptabilities+=UnquotedString+
	 */
	protected void sequence_AcceptabilityTokenSet(ISerializationContext context, AcceptabilityTokenSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns AcceptableInFilter
	 *     Filter returns AcceptableInFilter
	 *     DisjunctionFilter returns AcceptableInFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns AcceptableInFilter
	 *     ConjunctionFilter returns AcceptableInFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns AcceptableInFilter
	 *     PropertyFilter returns AcceptableInFilter
	 *     AcceptableInFilter returns AcceptableInFilter
	 *
	 * Constraint:
	 *     languageRefSetId=ExpressionConstraint
	 */
	protected void sequence_AcceptableInFilter(ISerializationContext context, AcceptableInFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.ACCEPTABLE_IN_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.ACCEPTABLE_IN_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns ActiveFilter
	 *     Filter returns ActiveFilter
	 *     DisjunctionFilter returns ActiveFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ActiveFilter
	 *     ConjunctionFilter returns ActiveFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ActiveFilter
	 *     PropertyFilter returns ActiveFilter
	 *     ActiveFilter returns ActiveFilter
	 *
	 * Constraint:
	 *     (domain=DOMAIN? active=Boolean)
	 */
	protected void sequence_ActiveFilter(ISerializationContext context, ActiveFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     FilteredExpressionConstraint returns AncestorOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns AncestorOf
	 *     SubExpressionConstraint returns AncestorOf
	 *     AncestorOf returns AncestorOf
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
	 *     FilteredExpressionConstraint returns AncestorOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns AncestorOrSelfOf
	 *     SubExpressionConstraint returns AncestorOrSelfOf
	 *     AncestorOrSelfOf returns AncestorOrSelfOf
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
	 *     FilteredExpressionConstraint returns Any
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns Any
	 *     SubExpressionConstraint returns Any
	 *     EclFocusConcept returns Any
	 *     Any returns Any
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
	 *     FilterConstraint returns CaseSignificanceFilter
	 *     Filter returns CaseSignificanceFilter
	 *     DisjunctionFilter returns CaseSignificanceFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns CaseSignificanceFilter
	 *     ConjunctionFilter returns CaseSignificanceFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns CaseSignificanceFilter
	 *     PropertyFilter returns CaseSignificanceFilter
	 *     CaseSignificanceFilter returns CaseSignificanceFilter
	 *
	 * Constraint:
	 *     caseSignificanceId=ExpressionConstraint
	 */
	protected void sequence_CaseSignificanceFilter(ISerializationContext context, CaseSignificanceFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.CASE_SIGNIFICANCE_FILTER__CASE_SIGNIFICANCE_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0(), semanticObject.getCaseSignificanceId());
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
	 *     FilteredExpressionConstraint returns ChildOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ChildOf
	 *     SubExpressionConstraint returns ChildOf
	 *     ChildOf returns ChildOf
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
	 *     FilteredExpressionConstraint returns ChildOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ChildOrSelfOf
	 *     SubExpressionConstraint returns ChildOrSelfOf
	 *     ChildOrSelfOf returns ChildOrSelfOf
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
	 *     FilterConstraint returns ConjunctionFilter
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
	 *     FilteredExpressionConstraint returns DescendantOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns DescendantOf
	 *     SubExpressionConstraint returns DescendantOf
	 *     DescendantOf returns DescendantOf
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
	 *     FilteredExpressionConstraint returns DescendantOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns DescendantOrSelfOf
	 *     SubExpressionConstraint returns DescendantOrSelfOf
	 *     DescendantOrSelfOf returns DescendantOrSelfOf
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
	 *     FilterConstraint returns DialectAliasFilter
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
	 *     FilterConstraint returns DialectIdFilter
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
	 *     (languageRefSetId=EclConceptReference acceptability=Acceptability?)
	 */
	protected void sequence_Dialect(ISerializationContext context, Dialect semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns DisjunctionFilter
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
	 *     (constraint=DottedExpressionConstraint_DottedExpressionConstraint_1_0 attribute=FilteredExpressionConstraint)
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
		feeder.accept(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getAttribute());
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
	 *     FilteredExpressionConstraint returns EclConceptReference
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns EclConceptReference
	 *     SubExpressionConstraint returns EclConceptReference
	 *     EclFocusConcept returns EclConceptReference
	 *     EclConceptReference returns EclConceptReference
	 *
	 * Constraint:
	 *     (id=SnomedIdentifier term=PIPE_DELIMITED_STRING?)
	 */
	protected void sequence_EclConceptReference(ISerializationContext context, EclConceptReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns EffectiveTimeFilter
	 *     Filter returns EffectiveTimeFilter
	 *     DisjunctionFilter returns EffectiveTimeFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns EffectiveTimeFilter
	 *     ConjunctionFilter returns EffectiveTimeFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns EffectiveTimeFilter
	 *     PropertyFilter returns EffectiveTimeFilter
	 *     EffectiveTimeFilter returns EffectiveTimeFilter
	 *
	 * Constraint:
	 *     (domain=DOMAIN? op=NUMERIC_OPERATOR effectiveTime=STRING)
	 */
	protected void sequence_EffectiveTimeFilter(ISerializationContext context, EffectiveTimeFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     FilteredExpressionConstraint returns FilteredExpressionConstraint
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns FilteredExpressionConstraint
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
	 *     FilterConstraint returns LanguageFilter
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
	 *     FilterConstraint returns LanguageRefSetFilter
	 *     Filter returns LanguageRefSetFilter
	 *     DisjunctionFilter returns LanguageRefSetFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns LanguageRefSetFilter
	 *     ConjunctionFilter returns LanguageRefSetFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns LanguageRefSetFilter
	 *     PropertyFilter returns LanguageRefSetFilter
	 *     LanguageRefSetFilter returns LanguageRefSetFilter
	 *
	 * Constraint:
	 *     languageRefSetId=ExpressionConstraint
	 */
	protected void sequence_LanguageRefSetFilter(ISerializationContext context, LanguageRefSetFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.LANGUAGE_REF_SET_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.LANGUAGE_REF_SET_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
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
	 *     FilteredExpressionConstraint returns MemberOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns MemberOf
	 *     SubExpressionConstraint returns MemberOf
	 *     EclFocusConcept returns MemberOf
	 *     MemberOf returns MemberOf
	 *
	 * Constraint:
	 *     (constraint=EclConceptReference | constraint=Any | constraint=NestedExpression)
	 */
	protected void sequence_MemberOf(ISerializationContext context, MemberOf semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns ModuleFilter
	 *     Filter returns ModuleFilter
	 *     DisjunctionFilter returns ModuleFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ModuleFilter
	 *     ConjunctionFilter returns ModuleFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ModuleFilter
	 *     PropertyFilter returns ModuleFilter
	 *     ModuleFilter returns ModuleFilter
	 *
	 * Constraint:
	 *     (domain=DOMAIN? moduleId=ExpressionConstraint)
	 */
	protected void sequence_ModuleFilter(ISerializationContext context, ModuleFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     FilteredExpressionConstraint returns NestedExpression
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns NestedExpression
	 *     SubExpressionConstraint returns NestedExpression
	 *     EclFocusConcept returns NestedExpression
	 *     NestedExpression returns NestedExpression
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
	 *     FilterConstraint returns NestedFilter
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
	 *     FilteredExpressionConstraint returns ParentOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ParentOf
	 *     SubExpressionConstraint returns ParentOf
	 *     ParentOf returns ParentOf
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
	 *     FilteredExpressionConstraint returns ParentOrSelfOf
	 *     FilteredExpressionConstraint.FilteredExpressionConstraint_1_0 returns ParentOrSelfOf
	 *     SubExpressionConstraint returns ParentOrSelfOf
	 *     ParentOrSelfOf returns ParentOrSelfOf
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
	 *     FilterConstraint returns PreferredInFilter
	 *     Filter returns PreferredInFilter
	 *     DisjunctionFilter returns PreferredInFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns PreferredInFilter
	 *     ConjunctionFilter returns PreferredInFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns PreferredInFilter
	 *     PropertyFilter returns PreferredInFilter
	 *     PreferredInFilter returns PreferredInFilter
	 *
	 * Constraint:
	 *     languageRefSetId=ExpressionConstraint
	 */
	protected void sequence_PreferredInFilter(ISerializationContext context, PreferredInFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.PREFERRED_IN_FILTER__LANGUAGE_REF_SET_ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.PREFERRED_IN_FILTER__LANGUAGE_REF_SET_ID));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0(), semanticObject.getLanguageRefSetId());
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
	 *     FilterConstraint returns SemanticTagFilter
	 *     Filter returns SemanticTagFilter
	 *     DisjunctionFilter returns SemanticTagFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns SemanticTagFilter
	 *     ConjunctionFilter returns SemanticTagFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns SemanticTagFilter
	 *     PropertyFilter returns SemanticTagFilter
	 *     SemanticTagFilter returns SemanticTagFilter
	 *
	 * Constraint:
	 *     (domain=DOMAIN? op=NON_NUMERIC_OPERATOR semanticTag=STRING)
	 */
	protected void sequence_SemanticTagFilter(ISerializationContext context, SemanticTagFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns StringValueComparison
	 *     DataTypeComparison returns StringValueComparison
	 *     StringValueComparison returns StringValueComparison
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR value=STRING)
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
		feeder.accept(grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns TypeIdFilter
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
	 *     (op=NON_NUMERIC_OPERATOR (type=EclConceptReference | type=EclConceptReferenceSet))
	 */
	protected void sequence_TypeIdFilter(ISerializationContext context, TypeIdFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns TypeTokenFilter
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
	 *     TypedTermFilterClause returns TypedTermFilterClause
	 *
	 * Constraint:
	 *     (lexicalSearchType=LEXICAL_SEARCH_TYPE? term=STRING)
	 */
	protected void sequence_TypedTermFilterClause(ISerializationContext context, TypedTermFilterClause semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns TypedTermFilterSet
	 *     Filter returns TypedTermFilterSet
	 *     DisjunctionFilter returns TypedTermFilterSet
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypedTermFilterSet
	 *     ConjunctionFilter returns TypedTermFilterSet
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypedTermFilterSet
	 *     PropertyFilter returns TypedTermFilterSet
	 *     TermFilter returns TypedTermFilterSet
	 *     TypedTermFilterSet returns TypedTermFilterSet
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR clauses+=TypedTermFilterClause+)
	 */
	protected void sequence_TypedTermFilterSet(ISerializationContext context, TypedTermFilterSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FilterConstraint returns TypedTermFilter
	 *     Filter returns TypedTermFilter
	 *     DisjunctionFilter returns TypedTermFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypedTermFilter
	 *     ConjunctionFilter returns TypedTermFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypedTermFilter
	 *     PropertyFilter returns TypedTermFilter
	 *     TermFilter returns TypedTermFilter
	 *     TypedTermFilter returns TypedTermFilter
	 *
	 * Constraint:
	 *     (op=NON_NUMERIC_OPERATOR clause=TypedTermFilterClause)
	 */
	protected void sequence_TypedTermFilter(ISerializationContext context, TypedTermFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TERM_FILTER__OP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TERM_FILTER__OP));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.TYPED_TERM_FILTER__CLAUSE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.TYPED_TERM_FILTER__CLAUSE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0(), semanticObject.getOp());
		feeder.accept(grammarAccess.getTypedTermFilterAccess().getClauseTypedTermFilterClauseParserRuleCall_1_0(), semanticObject.getClause());
		feeder.finish();
	}
	
	
}
