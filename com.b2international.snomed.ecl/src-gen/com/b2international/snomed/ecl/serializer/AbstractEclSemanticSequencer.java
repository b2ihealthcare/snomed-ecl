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
import com.b2international.snomed.ecl.ecl.AncestorOf;
import com.b2international.snomed.ecl.ecl.AncestorOrSelfOf;
import com.b2international.snomed.ecl.ecl.AndExpressionConstraint;
import com.b2international.snomed.ecl.ecl.AndRefinement;
import com.b2international.snomed.ecl.ecl.Any;
import com.b2international.snomed.ecl.ecl.AttributeComparison;
import com.b2international.snomed.ecl.ecl.AttributeConstraint;
import com.b2international.snomed.ecl.ecl.BooleanValueComparison;
import com.b2international.snomed.ecl.ecl.Cardinality;
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
import com.b2international.snomed.ecl.ecl.ExclusionExpressionConstraint;
import com.b2international.snomed.ecl.ecl.ExclusionFilter;
import com.b2international.snomed.ecl.ecl.IntegerValueComparison;
import com.b2international.snomed.ecl.ecl.LanguageCodeFilter;
import com.b2international.snomed.ecl.ecl.MemberOf;
import com.b2international.snomed.ecl.ecl.NestedExpression;
import com.b2international.snomed.ecl.ecl.NestedFilter;
import com.b2international.snomed.ecl.ecl.NestedRefinement;
import com.b2international.snomed.ecl.ecl.OrExpressionConstraint;
import com.b2international.snomed.ecl.ecl.OrRefinement;
import com.b2international.snomed.ecl.ecl.ParentOf;
import com.b2international.snomed.ecl.ecl.ParentOrSelfOf;
import com.b2international.snomed.ecl.ecl.RefinedExpressionConstraint;
import com.b2international.snomed.ecl.ecl.Script;
import com.b2international.snomed.ecl.ecl.StringValueComparison;
import com.b2international.snomed.ecl.ecl.TypeIdFilter;
import com.b2international.snomed.ecl.ecl.TypeTokenFilter;
import com.b2international.snomed.ecl.ecl.TypedTermFilter;
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
public abstract class AbstractEclSemanticSequencer extends AbstractDelegatingSemanticSequencer {

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
			case EclPackage.EXCLUSION_EXPRESSION_CONSTRAINT:
				sequence_ExclusionExpressionConstraint(context, (ExclusionExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.EXCLUSION_FILTER:
				sequence_ExclusionFilter(context, (ExclusionFilter) semanticObject); 
				return; 
			case EclPackage.INTEGER_VALUE_COMPARISON:
				sequence_IntegerValueComparison(context, (IntegerValueComparison) semanticObject); 
				return; 
			case EclPackage.LANGUAGE_CODE_FILTER:
				sequence_LanguageCodeFilter(context, (LanguageCodeFilter) semanticObject); 
				return; 
			case EclPackage.MEMBER_OF:
				sequence_MemberOf(context, (MemberOf) semanticObject); 
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
			case EclPackage.REFINED_EXPRESSION_CONSTRAINT:
				sequence_RefinedExpressionConstraint(context, (RefinedExpressionConstraint) semanticObject); 
				return; 
			case EclPackage.SCRIPT:
				sequence_Script(context, (Script) semanticObject); 
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
	 *     (acceptabilities+=Alphabetical acceptabilities+=Alphabetical*)
	 */
	protected void sequence_AcceptabilityTokenSet(ISerializationContext context, AcceptabilityTokenSet semanticObject) {
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
	 *     ((op=EQUAL | op=NOT_EQUAL) value=SubExpressionConstraint)
	 */
	protected void sequence_AttributeComparison(ISerializationContext context, AttributeComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     (cardinality=Cardinality? reversed?=REVERSED? attribute=SubExpressionConstraint comparison=Comparison)
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
	 *     ((op=EQUAL | op=NOT_EQUAL) value=Boolean)
	 */
	protected void sequence_BooleanValueComparison(ISerializationContext context, BooleanValueComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ExpressionConstraint returns ConjunctionFilter
	 *     OrExpressionConstraint returns ConjunctionFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ConjunctionFilter
	 *     AndExpressionConstraint returns ConjunctionFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ConjunctionFilter
	 *     ExclusionExpressionConstraint returns ConjunctionFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ConjunctionFilter
	 *     RefinedExpressionConstraint returns ConjunctionFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ConjunctionFilter
	 *     DottedExpressionConstraint returns ConjunctionFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ConjunctionFilter
	 *     SubExpressionConstraint returns ConjunctionFilter
	 *     FilterConstraint returns ConjunctionFilter
	 *     Filter returns ConjunctionFilter
	 *     DisjunctionFilter returns ConjunctionFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ConjunctionFilter
	 *     ConjunctionFilter returns ConjunctionFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ConjunctionFilter
	 *
	 * Constraint:
	 *     (left=ConjunctionFilter_ConjunctionFilter_1_0 right=ExclusionFilter)
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
		feeder.accept(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns DecimalValueComparison
	 *     DataTypeComparison returns DecimalValueComparison
	 *     DecimalValueComparison returns DecimalValueComparison
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             op=EQUAL | 
	 *             op=NOT_EQUAL | 
	 *             op=GT | 
	 *             op=LT | 
	 *             op=GTE | 
	 *             op=LTE
	 *         ) 
	 *         value=Decimal
	 *     )
	 */
	protected void sequence_DecimalValueComparison(ISerializationContext context, DecimalValueComparison semanticObject) {
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
	 *     ExpressionConstraint returns DialectAliasFilter
	 *     OrExpressionConstraint returns DialectAliasFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DialectAliasFilter
	 *     AndExpressionConstraint returns DialectAliasFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DialectAliasFilter
	 *     ExclusionExpressionConstraint returns DialectAliasFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DialectAliasFilter
	 *     RefinedExpressionConstraint returns DialectAliasFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DialectAliasFilter
	 *     DottedExpressionConstraint returns DialectAliasFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DialectAliasFilter
	 *     SubExpressionConstraint returns DialectAliasFilter
	 *     FilterConstraint returns DialectAliasFilter
	 *     Filter returns DialectAliasFilter
	 *     DisjunctionFilter returns DialectAliasFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DialectAliasFilter
	 *     ConjunctionFilter returns DialectAliasFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DialectAliasFilter
	 *     ExclusionFilter returns DialectAliasFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns DialectAliasFilter
	 *     PropertyFilter returns DialectAliasFilter
	 *     DialectFilter returns DialectAliasFilter
	 *     DialectAliasFilter returns DialectAliasFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) (dialects+=DialectAlias | (dialects+=DialectAlias dialects+=DialectAlias*)))
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
	 *     ExpressionConstraint returns DialectIdFilter
	 *     OrExpressionConstraint returns DialectIdFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DialectIdFilter
	 *     AndExpressionConstraint returns DialectIdFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DialectIdFilter
	 *     ExclusionExpressionConstraint returns DialectIdFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DialectIdFilter
	 *     RefinedExpressionConstraint returns DialectIdFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DialectIdFilter
	 *     DottedExpressionConstraint returns DialectIdFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DialectIdFilter
	 *     SubExpressionConstraint returns DialectIdFilter
	 *     FilterConstraint returns DialectIdFilter
	 *     Filter returns DialectIdFilter
	 *     DisjunctionFilter returns DialectIdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns DialectIdFilter
	 *     ConjunctionFilter returns DialectIdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns DialectIdFilter
	 *     ExclusionFilter returns DialectIdFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns DialectIdFilter
	 *     PropertyFilter returns DialectIdFilter
	 *     DialectFilter returns DialectIdFilter
	 *     DialectIdFilter returns DialectIdFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) (dialects+=Dialect | (dialects+=Dialect dialects+=Dialect*)))
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
	 *     ExpressionConstraint returns DisjunctionFilter
	 *     OrExpressionConstraint returns DisjunctionFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns DisjunctionFilter
	 *     AndExpressionConstraint returns DisjunctionFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns DisjunctionFilter
	 *     ExclusionExpressionConstraint returns DisjunctionFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns DisjunctionFilter
	 *     RefinedExpressionConstraint returns DisjunctionFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns DisjunctionFilter
	 *     DottedExpressionConstraint returns DisjunctionFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns DisjunctionFilter
	 *     SubExpressionConstraint returns DisjunctionFilter
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
	 *     (constraint=DottedExpressionConstraint_DottedExpressionConstraint_1_0 attribute=SubExpressionConstraint)
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
		feeder.accept(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0(), semanticObject.getAttribute());
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
	 *     (concepts+=EclConceptReference concepts+=EclConceptReference*)
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
	 *     SubExpressionConstraint returns EclConceptReference
	 *     EclFocusConcept returns EclConceptReference
	 *     EclConceptReference returns EclConceptReference
	 *
	 * Constraint:
	 *     (id=SnomedIdentifier term=TERM_STRING?)
	 */
	protected void sequence_EclConceptReference(ISerializationContext context, EclConceptReference semanticObject) {
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
	 *     ExpressionConstraint returns ExclusionFilter
	 *     OrExpressionConstraint returns ExclusionFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns ExclusionFilter
	 *     AndExpressionConstraint returns ExclusionFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns ExclusionFilter
	 *     ExclusionExpressionConstraint returns ExclusionFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns ExclusionFilter
	 *     RefinedExpressionConstraint returns ExclusionFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns ExclusionFilter
	 *     DottedExpressionConstraint returns ExclusionFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns ExclusionFilter
	 *     SubExpressionConstraint returns ExclusionFilter
	 *     FilterConstraint returns ExclusionFilter
	 *     Filter returns ExclusionFilter
	 *     DisjunctionFilter returns ExclusionFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns ExclusionFilter
	 *     ConjunctionFilter returns ExclusionFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns ExclusionFilter
	 *     ExclusionFilter returns ExclusionFilter
	 *
	 * Constraint:
	 *     (left=ExclusionFilter_ExclusionFilter_1_0 right=PropertyFilter)
	 */
	protected void sequence_ExclusionFilter(ISerializationContext context, ExclusionFilter semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EXCLUSION_FILTER__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EXCLUSION_FILTER__LEFT));
			if (transientValues.isValueTransient(semanticObject, EclPackage.Literals.EXCLUSION_FILTER__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EclPackage.Literals.EXCLUSION_FILTER__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Comparison returns IntegerValueComparison
	 *     DataTypeComparison returns IntegerValueComparison
	 *     IntegerValueComparison returns IntegerValueComparison
	 *
	 * Constraint:
	 *     (
	 *         (
	 *             op=EQUAL | 
	 *             op=NOT_EQUAL | 
	 *             op=GT | 
	 *             op=LT | 
	 *             op=GTE | 
	 *             op=LTE
	 *         ) 
	 *         value=Integer
	 *     )
	 */
	protected void sequence_IntegerValueComparison(ISerializationContext context, IntegerValueComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns LanguageCodeFilter
	 *     OrExpressionConstraint returns LanguageCodeFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns LanguageCodeFilter
	 *     AndExpressionConstraint returns LanguageCodeFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns LanguageCodeFilter
	 *     ExclusionExpressionConstraint returns LanguageCodeFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns LanguageCodeFilter
	 *     RefinedExpressionConstraint returns LanguageCodeFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns LanguageCodeFilter
	 *     DottedExpressionConstraint returns LanguageCodeFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns LanguageCodeFilter
	 *     SubExpressionConstraint returns LanguageCodeFilter
	 *     FilterConstraint returns LanguageCodeFilter
	 *     Filter returns LanguageCodeFilter
	 *     DisjunctionFilter returns LanguageCodeFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns LanguageCodeFilter
	 *     ConjunctionFilter returns LanguageCodeFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns LanguageCodeFilter
	 *     ExclusionFilter returns LanguageCodeFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns LanguageCodeFilter
	 *     PropertyFilter returns LanguageCodeFilter
	 *     LanguageCodeFilter returns LanguageCodeFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) (languageCodes+=Alphabetical | (languageCodes+=Alphabetical languageCodes+=Alphabetical*)))
	 */
	protected void sequence_LanguageCodeFilter(ISerializationContext context, LanguageCodeFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     ExpressionConstraint returns NestedFilter
	 *     OrExpressionConstraint returns NestedFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns NestedFilter
	 *     AndExpressionConstraint returns NestedFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns NestedFilter
	 *     ExclusionExpressionConstraint returns NestedFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns NestedFilter
	 *     RefinedExpressionConstraint returns NestedFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns NestedFilter
	 *     DottedExpressionConstraint returns NestedFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns NestedFilter
	 *     SubExpressionConstraint returns NestedFilter
	 *     FilterConstraint returns NestedFilter
	 *     Filter returns NestedFilter
	 *     DisjunctionFilter returns NestedFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns NestedFilter
	 *     ConjunctionFilter returns NestedFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns NestedFilter
	 *     ExclusionFilter returns NestedFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns NestedFilter
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
	 *     Comparison returns StringValueComparison
	 *     DataTypeComparison returns StringValueComparison
	 *     StringValueComparison returns StringValueComparison
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) value=STRING)
	 */
	protected void sequence_StringValueComparison(ISerializationContext context, StringValueComparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns TypeIdFilter
	 *     OrExpressionConstraint returns TypeIdFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns TypeIdFilter
	 *     AndExpressionConstraint returns TypeIdFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns TypeIdFilter
	 *     ExclusionExpressionConstraint returns TypeIdFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns TypeIdFilter
	 *     RefinedExpressionConstraint returns TypeIdFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns TypeIdFilter
	 *     DottedExpressionConstraint returns TypeIdFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns TypeIdFilter
	 *     SubExpressionConstraint returns TypeIdFilter
	 *     FilterConstraint returns TypeIdFilter
	 *     Filter returns TypeIdFilter
	 *     DisjunctionFilter returns TypeIdFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypeIdFilter
	 *     ConjunctionFilter returns TypeIdFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypeIdFilter
	 *     ExclusionFilter returns TypeIdFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns TypeIdFilter
	 *     PropertyFilter returns TypeIdFilter
	 *     TypeFilter returns TypeIdFilter
	 *     TypeIdFilter returns TypeIdFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) (type=EclConceptReference | type=EclConceptReferenceSet))
	 */
	protected void sequence_TypeIdFilter(ISerializationContext context, TypeIdFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns TypeTokenFilter
	 *     OrExpressionConstraint returns TypeTokenFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns TypeTokenFilter
	 *     AndExpressionConstraint returns TypeTokenFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns TypeTokenFilter
	 *     ExclusionExpressionConstraint returns TypeTokenFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns TypeTokenFilter
	 *     RefinedExpressionConstraint returns TypeTokenFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns TypeTokenFilter
	 *     DottedExpressionConstraint returns TypeTokenFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns TypeTokenFilter
	 *     SubExpressionConstraint returns TypeTokenFilter
	 *     FilterConstraint returns TypeTokenFilter
	 *     Filter returns TypeTokenFilter
	 *     DisjunctionFilter returns TypeTokenFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypeTokenFilter
	 *     ConjunctionFilter returns TypeTokenFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypeTokenFilter
	 *     ExclusionFilter returns TypeTokenFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns TypeTokenFilter
	 *     PropertyFilter returns TypeTokenFilter
	 *     TypeFilter returns TypeTokenFilter
	 *     TypeTokenFilter returns TypeTokenFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) (tokens+=Alphabetical | (tokens+=Alphabetical tokens+=Alphabetical*)))
	 */
	protected void sequence_TypeTokenFilter(ISerializationContext context, TypeTokenFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns TypedTermFilterSet
	 *     OrExpressionConstraint returns TypedTermFilterSet
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns TypedTermFilterSet
	 *     AndExpressionConstraint returns TypedTermFilterSet
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns TypedTermFilterSet
	 *     ExclusionExpressionConstraint returns TypedTermFilterSet
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns TypedTermFilterSet
	 *     RefinedExpressionConstraint returns TypedTermFilterSet
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns TypedTermFilterSet
	 *     DottedExpressionConstraint returns TypedTermFilterSet
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns TypedTermFilterSet
	 *     SubExpressionConstraint returns TypedTermFilterSet
	 *     FilterConstraint returns TypedTermFilterSet
	 *     Filter returns TypedTermFilterSet
	 *     DisjunctionFilter returns TypedTermFilterSet
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypedTermFilterSet
	 *     ConjunctionFilter returns TypedTermFilterSet
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypedTermFilterSet
	 *     ExclusionFilter returns TypedTermFilterSet
	 *     ExclusionFilter.ExclusionFilter_1_0 returns TypedTermFilterSet
	 *     PropertyFilter returns TypedTermFilterSet
	 *     TermFilter returns TypedTermFilterSet
	 *     TypedTermFilterSet returns TypedTermFilterSet
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) terms+=TypedTermFilter terms+=TypedTermFilter*)
	 */
	protected void sequence_TypedTermFilterSet(ISerializationContext context, TypedTermFilterSet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ExpressionConstraint returns TypedTermFilter
	 *     OrExpressionConstraint returns TypedTermFilter
	 *     OrExpressionConstraint.OrExpressionConstraint_1_0 returns TypedTermFilter
	 *     AndExpressionConstraint returns TypedTermFilter
	 *     AndExpressionConstraint.AndExpressionConstraint_1_0 returns TypedTermFilter
	 *     ExclusionExpressionConstraint returns TypedTermFilter
	 *     ExclusionExpressionConstraint.ExclusionExpressionConstraint_1_0 returns TypedTermFilter
	 *     RefinedExpressionConstraint returns TypedTermFilter
	 *     RefinedExpressionConstraint.RefinedExpressionConstraint_1_0 returns TypedTermFilter
	 *     DottedExpressionConstraint returns TypedTermFilter
	 *     DottedExpressionConstraint.DottedExpressionConstraint_1_0 returns TypedTermFilter
	 *     SubExpressionConstraint returns TypedTermFilter
	 *     FilterConstraint returns TypedTermFilter
	 *     Filter returns TypedTermFilter
	 *     DisjunctionFilter returns TypedTermFilter
	 *     DisjunctionFilter.DisjunctionFilter_1_0 returns TypedTermFilter
	 *     ConjunctionFilter returns TypedTermFilter
	 *     ConjunctionFilter.ConjunctionFilter_1_0 returns TypedTermFilter
	 *     ExclusionFilter returns TypedTermFilter
	 *     ExclusionFilter.ExclusionFilter_1_0 returns TypedTermFilter
	 *     PropertyFilter returns TypedTermFilter
	 *     TermFilter returns TypedTermFilter
	 *     TypedTermFilter returns TypedTermFilter
	 *
	 * Constraint:
	 *     ((op=EQUAL | op=NOT_EQUAL) lexicalSearchType=LexicalSearchType? term=STRING)
	 */
	protected void sequence_TypedTermFilter(ISerializationContext context, TypedTermFilter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
