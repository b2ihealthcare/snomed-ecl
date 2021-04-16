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
package com.b2international.snomed.ecl.ide.contentassist.antlr;

import com.b2international.snomed.ecl.ide.contentassist.antlr.internal.InternalEclParser;
import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class EclParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(EclGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, EclGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1(), "rule__AndExpressionConstraint__Alternatives_1_1");
			builder.put(grammarAccess.getSubExpressionConstraintAccess().getAlternatives(), "rule__SubExpressionConstraint__Alternatives");
			builder.put(grammarAccess.getEclFocusConceptAccess().getAlternatives(), "rule__EclFocusConcept__Alternatives");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0(), "rule__MemberOf__ConstraintAlternatives_1_0");
			builder.put(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1(), "rule__AndRefinement__Alternatives_1_0_1");
			builder.put(grammarAccess.getSubRefinementAccess().getAlternatives(), "rule__SubRefinement__Alternatives");
			builder.put(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1(), "rule__AndAttributeSet__Alternatives_1_1");
			builder.put(grammarAccess.getSubAttributeSetAccess().getAlternatives(), "rule__SubAttributeSet__Alternatives");
			builder.put(grammarAccess.getComparisonAccess().getAlternatives(), "rule__Comparison__Alternatives");
			builder.put(grammarAccess.getAttributeComparisonAccess().getOpAlternatives_0_0(), "rule__AttributeComparison__OpAlternatives_0_0");
			builder.put(grammarAccess.getDataTypeComparisonAccess().getAlternatives(), "rule__DataTypeComparison__Alternatives");
			builder.put(grammarAccess.getBooleanValueComparisonAccess().getOpAlternatives_0_0(), "rule__BooleanValueComparison__OpAlternatives_0_0");
			builder.put(grammarAccess.getStringValueComparisonAccess().getOpAlternatives_0_0(), "rule__StringValueComparison__OpAlternatives_0_0");
			builder.put(grammarAccess.getIntegerValueComparisonAccess().getOpAlternatives_0_0(), "rule__IntegerValueComparison__OpAlternatives_0_0");
			builder.put(grammarAccess.getDecimalValueComparisonAccess().getOpAlternatives_0_0(), "rule__DecimalValueComparison__OpAlternatives_0_0");
			builder.put(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1(), "rule__ConjunctionFilter__Alternatives_1_1");
			builder.put(grammarAccess.getPropertyFilterAccess().getAlternatives(), "rule__PropertyFilter__Alternatives");
			builder.put(grammarAccess.getTermFilterAccess().getAlternatives_1(), "rule__TermFilter__Alternatives_1");
			builder.put(grammarAccess.getTypedTermFilterAccess().getOpAlternatives_0_0(), "rule__TypedTermFilter__OpAlternatives_0_0");
			builder.put(grammarAccess.getTypedTermFilterSetAccess().getOpAlternatives_0_0(), "rule__TypedTermFilterSet__OpAlternatives_0_0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getOpAlternatives_1_0(), "rule__LanguageCodeFilter__OpAlternatives_1_0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getAlternatives_2(), "rule__LanguageCodeFilter__Alternatives_2");
			builder.put(grammarAccess.getTypeFilterAccess().getAlternatives(), "rule__TypeFilter__Alternatives");
			builder.put(grammarAccess.getTypeIdFilterAccess().getOpAlternatives_1_0(), "rule__TypeIdFilter__OpAlternatives_1_0");
			builder.put(grammarAccess.getTypeIdFilterAccess().getTypeAlternatives_2_0(), "rule__TypeIdFilter__TypeAlternatives_2_0");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getOpAlternatives_1_0(), "rule__TypeTokenFilter__OpAlternatives_1_0");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getAlternatives_2(), "rule__TypeTokenFilter__Alternatives_2");
			builder.put(grammarAccess.getDialectFilterAccess().getAlternatives(), "rule__DialectFilter__Alternatives");
			builder.put(grammarAccess.getDialectIdFilterAccess().getOpAlternatives_1_0(), "rule__DialectIdFilter__OpAlternatives_1_0");
			builder.put(grammarAccess.getDialectIdFilterAccess().getAlternatives_2(), "rule__DialectIdFilter__Alternatives_2");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getOpAlternatives_1_0(), "rule__DialectAliasFilter__OpAlternatives_1_0");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getAlternatives_2(), "rule__DialectAliasFilter__Alternatives_2");
			builder.put(grammarAccess.getAcceptabilityAccess().getAlternatives(), "rule__Acceptability__Alternatives");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1(), "rule__SnomedIdentifier__Alternatives_1");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2(), "rule__SnomedIdentifier__Alternatives_2");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3(), "rule__SnomedIdentifier__Alternatives_3");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4(), "rule__SnomedIdentifier__Alternatives_4");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5(), "rule__SnomedIdentifier__Alternatives_5");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives(), "rule__NonNegativeInteger__Alternatives");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1(), "rule__NonNegativeInteger__Alternatives_1_1");
			builder.put(grammarAccess.getMaxValueAccess().getAlternatives(), "rule__MaxValue__Alternatives");
			builder.put(grammarAccess.getIntegerAccess().getAlternatives_0(), "rule__Integer__Alternatives_0");
			builder.put(grammarAccess.getDecimalAccess().getAlternatives_0(), "rule__Decimal__Alternatives_0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2(), "rule__NonNegativeDecimal__Alternatives_2");
			builder.put(grammarAccess.getBooleanAccess().getAlternatives(), "rule__Boolean__Alternatives");
			builder.put(grammarAccess.getDialectAliasValueAccess().getAlternatives_1(), "rule__DialectAliasValue__Alternatives_1");
			builder.put(grammarAccess.getLexicalSearchTypeAccess().getAlternatives(), "rule__LexicalSearchType__Alternatives");
			builder.put(grammarAccess.getScriptAccess().getGroup(), "rule__Script__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup(), "rule__OrExpressionConstraint__Group__0");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getGroup_1(), "rule__OrExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup(), "rule__AndExpressionConstraint__Group__0");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getGroup_1(), "rule__AndExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup(), "rule__ExclusionExpressionConstraint__Group__0");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1(), "rule__ExclusionExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup(), "rule__RefinedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1(), "rule__RefinedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup(), "rule__DottedExpressionConstraint__Group__0");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1(), "rule__DottedExpressionConstraint__Group_1__0");
			builder.put(grammarAccess.getChildOfAccess().getGroup(), "rule__ChildOf__Group__0");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getGroup(), "rule__ChildOrSelfOf__Group__0");
			builder.put(grammarAccess.getDescendantOfAccess().getGroup(), "rule__DescendantOf__Group__0");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getGroup(), "rule__DescendantOrSelfOf__Group__0");
			builder.put(grammarAccess.getParentOfAccess().getGroup(), "rule__ParentOf__Group__0");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getGroup(), "rule__ParentOrSelfOf__Group__0");
			builder.put(grammarAccess.getAncestorOfAccess().getGroup(), "rule__AncestorOf__Group__0");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getGroup(), "rule__AncestorOrSelfOf__Group__0");
			builder.put(grammarAccess.getMemberOfAccess().getGroup(), "rule__MemberOf__Group__0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getGroup(), "rule__EclConceptReference__Group__0");
			builder.put(grammarAccess.getEclConceptReferenceSetAccess().getGroup(), "rule__EclConceptReferenceSet__Group__0");
			builder.put(grammarAccess.getAnyAccess().getGroup(), "rule__Any__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup(), "rule__OrRefinement__Group__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1(), "rule__OrRefinement__Group_1__0");
			builder.put(grammarAccess.getOrRefinementAccess().getGroup_1_0(), "rule__OrRefinement__Group_1_0__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup(), "rule__AndRefinement__Group__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1(), "rule__AndRefinement__Group_1__0");
			builder.put(grammarAccess.getAndRefinementAccess().getGroup_1_0(), "rule__AndRefinement__Group_1_0__0");
			builder.put(grammarAccess.getNestedRefinementAccess().getGroup(), "rule__NestedRefinement__Group__0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getGroup(), "rule__EclAttributeGroup__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup(), "rule__OrAttributeSet__Group__0");
			builder.put(grammarAccess.getOrAttributeSetAccess().getGroup_1(), "rule__OrAttributeSet__Group_1__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup(), "rule__AndAttributeSet__Group__0");
			builder.put(grammarAccess.getAndAttributeSetAccess().getGroup_1(), "rule__AndAttributeSet__Group_1__0");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getGroup(), "rule__NestedAttributeSet__Group__0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getGroup(), "rule__AttributeConstraint__Group__0");
			builder.put(grammarAccess.getCardinalityAccess().getGroup(), "rule__Cardinality__Group__0");
			builder.put(grammarAccess.getAttributeComparisonAccess().getGroup(), "rule__AttributeComparison__Group__0");
			builder.put(grammarAccess.getBooleanValueComparisonAccess().getGroup(), "rule__BooleanValueComparison__Group__0");
			builder.put(grammarAccess.getStringValueComparisonAccess().getGroup(), "rule__StringValueComparison__Group__0");
			builder.put(grammarAccess.getIntegerValueComparisonAccess().getGroup(), "rule__IntegerValueComparison__Group__0");
			builder.put(grammarAccess.getDecimalValueComparisonAccess().getGroup(), "rule__DecimalValueComparison__Group__0");
			builder.put(grammarAccess.getNestedExpressionAccess().getGroup(), "rule__NestedExpression__Group__0");
			builder.put(grammarAccess.getFilterConstraintAccess().getGroup(), "rule__FilterConstraint__Group__0");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getGroup(), "rule__DisjunctionFilter__Group__0");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getGroup_1(), "rule__DisjunctionFilter__Group_1__0");
			builder.put(grammarAccess.getConjunctionFilterAccess().getGroup(), "rule__ConjunctionFilter__Group__0");
			builder.put(grammarAccess.getConjunctionFilterAccess().getGroup_1(), "rule__ConjunctionFilter__Group_1__0");
			builder.put(grammarAccess.getExclusionFilterAccess().getGroup(), "rule__ExclusionFilter__Group__0");
			builder.put(grammarAccess.getExclusionFilterAccess().getGroup_1(), "rule__ExclusionFilter__Group_1__0");
			builder.put(grammarAccess.getNestedFilterAccess().getGroup(), "rule__NestedFilter__Group__0");
			builder.put(grammarAccess.getTermFilterAccess().getGroup(), "rule__TermFilter__Group__0");
			builder.put(grammarAccess.getTypedTermFilterAccess().getGroup(), "rule__TypedTermFilter__Group__0");
			builder.put(grammarAccess.getTypedTermFilterAccess().getGroup_1(), "rule__TypedTermFilter__Group_1__0");
			builder.put(grammarAccess.getTypedTermFilterSetAccess().getGroup(), "rule__TypedTermFilterSet__Group__0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getGroup(), "rule__LanguageCodeFilter__Group__0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getGroup_2_1(), "rule__LanguageCodeFilter__Group_2_1__0");
			builder.put(grammarAccess.getTypeIdFilterAccess().getGroup(), "rule__TypeIdFilter__Group__0");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getGroup(), "rule__TypeTokenFilter__Group__0");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getGroup_2_1(), "rule__TypeTokenFilter__Group_2_1__0");
			builder.put(grammarAccess.getDialectIdFilterAccess().getGroup(), "rule__DialectIdFilter__Group__0");
			builder.put(grammarAccess.getDialectIdFilterAccess().getGroup_2_1(), "rule__DialectIdFilter__Group_2_1__0");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getGroup(), "rule__DialectAliasFilter__Group__0");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getGroup_2_1(), "rule__DialectAliasFilter__Group_2_1__0");
			builder.put(grammarAccess.getDialectAccess().getGroup(), "rule__Dialect__Group__0");
			builder.put(grammarAccess.getDialectAliasAccess().getGroup(), "rule__DialectAlias__Group__0");
			builder.put(grammarAccess.getAcceptabilityTokenSetAccess().getGroup(), "rule__AcceptabilityTokenSet__Group__0");
			builder.put(grammarAccess.getSnomedIdentifierAccess().getGroup(), "rule__SnomedIdentifier__Group__0");
			builder.put(grammarAccess.getNonNegativeIntegerAccess().getGroup_1(), "rule__NonNegativeInteger__Group_1__0");
			builder.put(grammarAccess.getIntegerAccess().getGroup(), "rule__Integer__Group__0");
			builder.put(grammarAccess.getDecimalAccess().getGroup(), "rule__Decimal__Group__0");
			builder.put(grammarAccess.getNonNegativeDecimalAccess().getGroup(), "rule__NonNegativeDecimal__Group__0");
			builder.put(grammarAccess.getDialectAliasValueAccess().getGroup(), "rule__DialectAliasValue__Group__0");
			builder.put(grammarAccess.getScriptAccess().getConstraintAssignment_1(), "rule__Script__ConstraintAssignment_1");
			builder.put(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2(), "rule__OrExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2(), "rule__AndExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2(), "rule__ExclusionExpressionConstraint__RightAssignment_1_2");
			builder.put(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2(), "rule__RefinedExpressionConstraint__RefinementAssignment_1_2");
			builder.put(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2(), "rule__DottedExpressionConstraint__AttributeAssignment_1_2");
			builder.put(grammarAccess.getChildOfAccess().getConstraintAssignment_1(), "rule__ChildOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1(), "rule__ChildOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1(), "rule__DescendantOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1(), "rule__DescendantOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOfAccess().getConstraintAssignment_1(), "rule__ParentOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1(), "rule__ParentOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1(), "rule__AncestorOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1(), "rule__AncestorOrSelfOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getMemberOfAccess().getConstraintAssignment_1(), "rule__MemberOf__ConstraintAssignment_1");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0(), "rule__EclConceptReference__IdAssignment_0");
			builder.put(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1(), "rule__EclConceptReference__TermAssignment_1");
			builder.put(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1(), "rule__EclConceptReferenceSet__ConceptsAssignment_1");
			builder.put(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_2(), "rule__EclConceptReferenceSet__ConceptsAssignment_2");
			builder.put(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2(), "rule__OrRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2(), "rule__AndRefinement__RightAssignment_1_0_2");
			builder.put(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1(), "rule__NestedRefinement__NestedAssignment_1");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0(), "rule__EclAttributeGroup__CardinalityAssignment_0");
			builder.put(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2(), "rule__EclAttributeGroup__RefinementAssignment_2");
			builder.put(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2(), "rule__OrAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2(), "rule__AndAttributeSet__RightAssignment_1_2");
			builder.put(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1(), "rule__NestedAttributeSet__NestedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0(), "rule__AttributeConstraint__CardinalityAssignment_0");
			builder.put(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1(), "rule__AttributeConstraint__ReversedAssignment_1");
			builder.put(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2(), "rule__AttributeConstraint__AttributeAssignment_2");
			builder.put(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3(), "rule__AttributeConstraint__ComparisonAssignment_3");
			builder.put(grammarAccess.getCardinalityAccess().getMinAssignment_1(), "rule__Cardinality__MinAssignment_1");
			builder.put(grammarAccess.getCardinalityAccess().getMaxAssignment_3(), "rule__Cardinality__MaxAssignment_3");
			builder.put(grammarAccess.getAttributeComparisonAccess().getOpAssignment_0(), "rule__AttributeComparison__OpAssignment_0");
			builder.put(grammarAccess.getAttributeComparisonAccess().getValueAssignment_1(), "rule__AttributeComparison__ValueAssignment_1");
			builder.put(grammarAccess.getBooleanValueComparisonAccess().getOpAssignment_0(), "rule__BooleanValueComparison__OpAssignment_0");
			builder.put(grammarAccess.getBooleanValueComparisonAccess().getValueAssignment_1(), "rule__BooleanValueComparison__ValueAssignment_1");
			builder.put(grammarAccess.getStringValueComparisonAccess().getOpAssignment_0(), "rule__StringValueComparison__OpAssignment_0");
			builder.put(grammarAccess.getStringValueComparisonAccess().getValueAssignment_1(), "rule__StringValueComparison__ValueAssignment_1");
			builder.put(grammarAccess.getIntegerValueComparisonAccess().getOpAssignment_0(), "rule__IntegerValueComparison__OpAssignment_0");
			builder.put(grammarAccess.getIntegerValueComparisonAccess().getValueAssignment_2(), "rule__IntegerValueComparison__ValueAssignment_2");
			builder.put(grammarAccess.getDecimalValueComparisonAccess().getOpAssignment_0(), "rule__DecimalValueComparison__OpAssignment_0");
			builder.put(grammarAccess.getDecimalValueComparisonAccess().getValueAssignment_2(), "rule__DecimalValueComparison__ValueAssignment_2");
			builder.put(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1(), "rule__NestedExpression__NestedAssignment_1");
			builder.put(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2(), "rule__DisjunctionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2(), "rule__ConjunctionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2(), "rule__ExclusionFilter__RightAssignment_1_2");
			builder.put(grammarAccess.getNestedFilterAccess().getNestedAssignment_1(), "rule__NestedFilter__NestedAssignment_1");
			builder.put(grammarAccess.getTypedTermFilterAccess().getOpAssignment_0(), "rule__TypedTermFilter__OpAssignment_0");
			builder.put(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeAssignment_1_0(), "rule__TypedTermFilter__LexicalSearchTypeAssignment_1_0");
			builder.put(grammarAccess.getTypedTermFilterAccess().getTermAssignment_2(), "rule__TypedTermFilter__TermAssignment_2");
			builder.put(grammarAccess.getTypedTermFilterSetAccess().getOpAssignment_0(), "rule__TypedTermFilterSet__OpAssignment_0");
			builder.put(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2(), "rule__TypedTermFilterSet__TermsAssignment_2");
			builder.put(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_3(), "rule__TypedTermFilterSet__TermsAssignment_3");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getOpAssignment_1(), "rule__LanguageCodeFilter__OpAssignment_1");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_0(), "rule__LanguageCodeFilter__LanguageCodesAssignment_2_0");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_1(), "rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_1");
			builder.put(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_2(), "rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_2");
			builder.put(grammarAccess.getTypeIdFilterAccess().getOpAssignment_1(), "rule__TypeIdFilter__OpAssignment_1");
			builder.put(grammarAccess.getTypeIdFilterAccess().getTypeAssignment_2(), "rule__TypeIdFilter__TypeAssignment_2");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getOpAssignment_1(), "rule__TypeTokenFilter__OpAssignment_1");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_0(), "rule__TypeTokenFilter__TokensAssignment_2_0");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1(), "rule__TypeTokenFilter__TokensAssignment_2_1_1");
			builder.put(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_2(), "rule__TypeTokenFilter__TokensAssignment_2_1_2");
			builder.put(grammarAccess.getDialectIdFilterAccess().getOpAssignment_1(), "rule__DialectIdFilter__OpAssignment_1");
			builder.put(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_0(), "rule__DialectIdFilter__DialectsAssignment_2_0");
			builder.put(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1(), "rule__DialectIdFilter__DialectsAssignment_2_1_1");
			builder.put(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_2(), "rule__DialectIdFilter__DialectsAssignment_2_1_2");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getOpAssignment_1(), "rule__DialectAliasFilter__OpAssignment_1");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_0(), "rule__DialectAliasFilter__DialectsAssignment_2_0");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1(), "rule__DialectAliasFilter__DialectsAssignment_2_1_1");
			builder.put(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_2(), "rule__DialectAliasFilter__DialectsAssignment_2_1_2");
			builder.put(grammarAccess.getDialectAccess().getLanguageRefSetIdAssignment_0(), "rule__Dialect__LanguageRefSetIdAssignment_0");
			builder.put(grammarAccess.getDialectAccess().getAcceptabilityAssignment_1(), "rule__Dialect__AcceptabilityAssignment_1");
			builder.put(grammarAccess.getDialectAliasAccess().getAliasAssignment_0(), "rule__DialectAlias__AliasAssignment_0");
			builder.put(grammarAccess.getDialectAliasAccess().getAcceptabilityAssignment_1(), "rule__DialectAlias__AcceptabilityAssignment_1");
			builder.put(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesAssignment(), "rule__AcceptabilityIdSet__AcceptabilitiesAssignment");
			builder.put(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1(), "rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1");
			builder.put(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_2(), "rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private EclGrammarAccess grammarAccess;

	@Override
	protected InternalEclParser createParser() {
		InternalEclParser result = new InternalEclParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public EclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
