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
package com.b2international.snomed.ecl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class EclGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ScriptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Script");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cScriptAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintExpressionConstraintParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//Script:
		//    {Script} (constraint=ExpressionConstraint)?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Script} (constraint=ExpressionConstraint)?
		public Group getGroup() { return cGroup; }
		
		//{Script}
		public Action getScriptAction_0() { return cScriptAction_0; }
		
		//(constraint=ExpressionConstraint)?
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//ExpressionConstraint
		public RuleCall getConstraintExpressionConstraintParserRuleCall_1_0() { return cConstraintExpressionConstraintParserRuleCall_1_0; }
	}
	public class ExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
		private final RuleCall cOrExpressionConstraintParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ExpressionConstraint:
		//    OrExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//OrExpressionConstraint
		public RuleCall getOrExpressionConstraintParserRuleCall() { return cOrExpressionConstraintParserRuleCall; }
	}
	public class OrExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.OrExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrExpressionConstraintLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrExpressionConstraint returns ExpressionConstraint:
		//    AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//AndExpressionConstraint
		public RuleCall getAndExpressionConstraintParserRuleCall_0() { return cAndExpressionConstraintParserRuleCall_0; }
		
		//({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpressionConstraint.left=current}
		public Action getOrExpressionConstraintLeftAction_1_0() { return cOrExpressionConstraintLeftAction_1_0; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_1_1() { return cDISJUNCTION_KEYWORDTerminalRuleCall_1_1; }
		
		//right=AndExpressionConstraint
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AndExpressionConstraint
		public RuleCall getRightAndExpressionConstraintParserRuleCall_1_2_0() { return cRightAndExpressionConstraintParserRuleCall_1_2_0; }
	}
	public class AndExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExclusionExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndExpressionConstraintLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExclusionExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndExpressionConstraint returns ExpressionConstraint:
		//    ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA) right=ExclusionExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA) right=ExclusionExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//ExclusionExpressionConstraint
		public RuleCall getExclusionExpressionConstraintParserRuleCall_0() { return cExclusionExpressionConstraintParserRuleCall_0; }
		
		//({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA) right=ExclusionExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpressionConstraint.left=current}
		public Action getAndExpressionConstraintLeftAction_1_0() { return cAndExpressionConstraintLeftAction_1_0; }
		
		//(CONJUNCTION_KEYWORD | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0() { return cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=ExclusionExpressionConstraint
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ExclusionExpressionConstraint
		public RuleCall getRightExclusionExpressionConstraintParserRuleCall_1_2_0() { return cRightExclusionExpressionConstraintParserRuleCall_1_2_0; }
	}
	public class ExclusionExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cRefinedExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExclusionExpressionConstraintLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cEXCLUSION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightRefinedExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ExclusionExpressionConstraint returns ExpressionConstraint:
		//    RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD right=RefinedExpressionConstraint)?;
		@Override public ParserRule getRule() { return rule; }
		
		//RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD right=RefinedExpressionConstraint)?
		public Group getGroup() { return cGroup; }
		
		//RefinedExpressionConstraint
		public RuleCall getRefinedExpressionConstraintParserRuleCall_0() { return cRefinedExpressionConstraintParserRuleCall_0; }
		
		//({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD right=RefinedExpressionConstraint)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExclusionExpressionConstraint.left=current}
		public Action getExclusionExpressionConstraintLeftAction_1_0() { return cExclusionExpressionConstraintLeftAction_1_0; }
		
		//EXCLUSION_KEYWORD
		public RuleCall getEXCLUSION_KEYWORDTerminalRuleCall_1_1() { return cEXCLUSION_KEYWORDTerminalRuleCall_1_1; }
		
		//right=RefinedExpressionConstraint
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//RefinedExpressionConstraint
		public RuleCall getRightRefinedExpressionConstraintParserRuleCall_1_2_0() { return cRightRefinedExpressionConstraintParserRuleCall_1_2_0; }
	}
	public class RefinedExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDottedExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cRefinedExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRefinementAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRefinementEclRefinementParserRuleCall_1_2_0 = (RuleCall)cRefinementAssignment_1_2.eContents().get(0);
		
		//RefinedExpressionConstraint returns ExpressionConstraint:
		//    DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?;
		@Override public ParserRule getRule() { return rule; }
		
		//DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?
		public Group getGroup() { return cGroup; }
		
		//DottedExpressionConstraint
		public RuleCall getDottedExpressionConstraintParserRuleCall_0() { return cDottedExpressionConstraintParserRuleCall_0; }
		
		//({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{RefinedExpressionConstraint.constraint=current}
		public Action getRefinedExpressionConstraintConstraintAction_1_0() { return cRefinedExpressionConstraintConstraintAction_1_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_1_1() { return cCOLONTerminalRuleCall_1_1; }
		
		//refinement=EclRefinement
		public Assignment getRefinementAssignment_1_2() { return cRefinementAssignment_1_2; }
		
		//EclRefinement
		public RuleCall getRefinementEclRefinementParserRuleCall_1_2_0() { return cRefinementEclRefinementParserRuleCall_1_2_0; }
	}
	public class DottedExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DottedExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSupplementExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDottedExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cAttributeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cAttributeSupplementExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cAttributeAssignment_1_2.eContents().get(0);
		
		//DottedExpressionConstraint returns ExpressionConstraint:
		//    SupplementExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SupplementExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SupplementExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SupplementExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//SupplementExpressionConstraint
		public RuleCall getSupplementExpressionConstraintParserRuleCall_0() { return cSupplementExpressionConstraintParserRuleCall_0; }
		
		//({DottedExpressionConstraint.constraint=current} DOT attribute=SupplementExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DottedExpressionConstraint.constraint=current}
		public Action getDottedExpressionConstraintConstraintAction_1_0() { return cDottedExpressionConstraintConstraintAction_1_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1_1() { return cDOTTerminalRuleCall_1_1; }
		
		//attribute=SupplementExpressionConstraint
		public Assignment getAttributeAssignment_1_2() { return cAttributeAssignment_1_2; }
		
		//SupplementExpressionConstraint
		public RuleCall getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0() { return cAttributeSupplementExpressionConstraintParserRuleCall_1_2_0; }
	}
	public class SupplementExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SupplementExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cFilteredExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSupplementExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cSupplementAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cSupplementSupplementParserRuleCall_1_1_0 = (RuleCall)cSupplementAssignment_1_1.eContents().get(0);
		
		//SupplementExpressionConstraint returns ExpressionConstraint:
		//    FilteredExpressionConstraint ({SupplementExpressionConstraint.constraint=current} supplement=Supplement)?;
		@Override public ParserRule getRule() { return rule; }
		
		//FilteredExpressionConstraint ({SupplementExpressionConstraint.constraint=current} supplement=Supplement)?
		public Group getGroup() { return cGroup; }
		
		//FilteredExpressionConstraint
		public RuleCall getFilteredExpressionConstraintParserRuleCall_0() { return cFilteredExpressionConstraintParserRuleCall_0; }
		
		//({SupplementExpressionConstraint.constraint=current} supplement=Supplement)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{SupplementExpressionConstraint.constraint=current}
		public Action getSupplementExpressionConstraintConstraintAction_1_0() { return cSupplementExpressionConstraintConstraintAction_1_0; }
		
		//supplement=Supplement
		public Assignment getSupplementAssignment_1_1() { return cSupplementAssignment_1_1; }
		
		//Supplement
		public RuleCall getSupplementSupplementParserRuleCall_1_1_0() { return cSupplementSupplementParserRuleCall_1_1_0; }
	}
	public class FilteredExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cFilteredExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFilterAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFilterFilterConstraintParserRuleCall_1_1_0 = (RuleCall)cFilterAssignment_1_1.eContents().get(0);
		
		//FilteredExpressionConstraint returns ExpressionConstraint:
		//    SubExpressionConstraint ({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubExpressionConstraint ({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*
		public Group getGroup() { return cGroup; }
		
		//SubExpressionConstraint
		public RuleCall getSubExpressionConstraintParserRuleCall_0() { return cSubExpressionConstraintParserRuleCall_0; }
		
		//({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{FilteredExpressionConstraint.constraint=current}
		public Action getFilteredExpressionConstraintConstraintAction_1_0() { return cFilteredExpressionConstraintConstraintAction_1_0; }
		
		//filter=FilterConstraint
		public Assignment getFilterAssignment_1_1() { return cFilterAssignment_1_1; }
		
		//FilterConstraint
		public RuleCall getFilterFilterConstraintParserRuleCall_1_1_0() { return cFilterFilterConstraintParserRuleCall_1_1_0; }
	}
	public class SubExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cChildOfParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cChildOrSelfOfParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDescendantOfParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDescendantOrSelfOfParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cParentOfParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cParentOrSelfOfParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cAncestorOfParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cAncestorOrSelfOfParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cTopParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cBottomParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cEclFocusConceptParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		
		//SubExpressionConstraint returns ExpressionConstraint:
		//    ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf | AncestorOrSelfOf | Top | Bottom | EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf | AncestorOrSelfOf | Top | Bottom | EclFocusConcept
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ChildOf
		public RuleCall getChildOfParserRuleCall_0() { return cChildOfParserRuleCall_0; }
		
		//ChildOrSelfOf
		public RuleCall getChildOrSelfOfParserRuleCall_1() { return cChildOrSelfOfParserRuleCall_1; }
		
		//DescendantOf
		public RuleCall getDescendantOfParserRuleCall_2() { return cDescendantOfParserRuleCall_2; }
		
		//DescendantOrSelfOf
		public RuleCall getDescendantOrSelfOfParserRuleCall_3() { return cDescendantOrSelfOfParserRuleCall_3; }
		
		//ParentOf
		public RuleCall getParentOfParserRuleCall_4() { return cParentOfParserRuleCall_4; }
		
		//ParentOrSelfOf
		public RuleCall getParentOrSelfOfParserRuleCall_5() { return cParentOrSelfOfParserRuleCall_5; }
		
		//AncestorOf
		public RuleCall getAncestorOfParserRuleCall_6() { return cAncestorOfParserRuleCall_6; }
		
		//AncestorOrSelfOf
		public RuleCall getAncestorOrSelfOfParserRuleCall_7() { return cAncestorOrSelfOfParserRuleCall_7; }
		
		//Top
		public RuleCall getTopParserRuleCall_8() { return cTopParserRuleCall_8; }
		
		//Bottom
		public RuleCall getBottomParserRuleCall_9() { return cBottomParserRuleCall_9; }
		
		//EclFocusConcept
		public RuleCall getEclFocusConceptParserRuleCall_10() { return cEclFocusConceptParserRuleCall_10; }
	}
	public class EclFocusConceptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclFocusConcept");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMemberOfParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEclConceptReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAnyParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cAlternateIdentifierParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNestedExpressionParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//EclFocusConcept returns ExpressionConstraint:
		//    MemberOf | EclConceptReference | Any | AlternateIdentifier | NestedExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//MemberOf | EclConceptReference | Any | AlternateIdentifier | NestedExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MemberOf
		public RuleCall getMemberOfParserRuleCall_0() { return cMemberOfParserRuleCall_0; }
		
		//EclConceptReference
		public RuleCall getEclConceptReferenceParserRuleCall_1() { return cEclConceptReferenceParserRuleCall_1; }
		
		//Any
		public RuleCall getAnyParserRuleCall_2() { return cAnyParserRuleCall_2; }
		
		//AlternateIdentifier
		public RuleCall getAlternateIdentifierParserRuleCall_3() { return cAlternateIdentifierParserRuleCall_3; }
		
		//NestedExpression
		public RuleCall getNestedExpressionParserRuleCall_4() { return cNestedExpressionParserRuleCall_4; }
	}
	public class ChildOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ChildOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLT_EMTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//ChildOf:
		//    LT_EM constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//LT_EM constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//LT_EM
		public RuleCall getLT_EMTerminalRuleCall_0() { return cLT_EMTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class ChildOrSelfOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ChildOrSelfOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_LT_EMTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//ChildOrSelfOf:
		//    DBL_LT_EM constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_LT_EM constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_LT_EM
		public RuleCall getDBL_LT_EMTerminalRuleCall_0() { return cDBL_LT_EMTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class DescendantOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DescendantOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//DescendantOf:
		//    LT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//LT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_0() { return cLTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class DescendantOrSelfOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DescendantOrSelfOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_LTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//DescendantOrSelfOf:
		//    DBL_LT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_LT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_LT
		public RuleCall getDBL_LTTerminalRuleCall_0() { return cDBL_LTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class ParentOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ParentOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cGT_EMTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//ParentOf:
		//    GT_EM constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//GT_EM constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//GT_EM
		public RuleCall getGT_EMTerminalRuleCall_0() { return cGT_EMTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class ParentOrSelfOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ParentOrSelfOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_GT_EMTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//ParentOrSelfOf:
		//    DBL_GT_EM constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_GT_EM constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_GT_EM
		public RuleCall getDBL_GT_EMTerminalRuleCall_0() { return cDBL_GT_EMTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class AncestorOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AncestorOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cGTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//AncestorOf:
		//    GT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//GT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_0() { return cGTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class AncestorOrSelfOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AncestorOrSelfOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_GTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//AncestorOrSelfOf:
		//    DBL_GT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_GT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_GT
		public RuleCall getDBL_GTTerminalRuleCall_0() { return cDBL_GTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class TopElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Top");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_EM_GTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//Top:
		//    DBL_EM_GT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_EM_GT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_EM_GT
		public RuleCall getDBL_EM_GTTerminalRuleCall_0() { return cDBL_EM_GTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class BottomElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Bottom");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDBL_EM_LTTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//Bottom:
		//    DBL_EM_LT constraint=EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//DBL_EM_LT constraint=EclFocusConcept
		public Group getGroup() { return cGroup; }
		
		//DBL_EM_LT
		public RuleCall getDBL_EM_LTTerminalRuleCall_0() { return cDBL_EM_LTTerminalRuleCall_0; }
		
		//constraint=EclFocusConcept
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//EclFocusConcept
		public RuleCall getConstraintEclFocusConceptParserRuleCall_1_0() { return cConstraintEclFocusConceptParserRuleCall_1_0; }
	}
	public class MemberOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MemberOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCARETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final RuleCall cSQUARE_OPENTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Group cGroup_1_1 = (Group)cGroup_1.eContents().get(1);
		private final Assignment cRefsetFieldsAssignment_1_1_0 = (Assignment)cGroup_1_1.eContents().get(0);
		private final RuleCall cRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0 = (RuleCall)cRefsetFieldsAssignment_1_1_0.eContents().get(0);
		private final Group cGroup_1_1_1 = (Group)cGroup_1_1.eContents().get(1);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1_0 = (RuleCall)cGroup_1_1_1.eContents().get(0);
		private final Assignment cRefsetFieldsAssignment_1_1_1_1 = (Assignment)cGroup_1_1_1.eContents().get(1);
		private final RuleCall cRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0 = (RuleCall)cRefsetFieldsAssignment_1_1_1_1.eContents().get(0);
		private final RuleCall cSQUARE_CLOSETerminalRuleCall_1_2 = (RuleCall)cGroup_1.eContents().get(2);
		private final Assignment cConstraintAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cConstraintAlternatives_2_0 = (Alternatives)cConstraintAssignment_2.eContents().get(0);
		private final RuleCall cConstraintEclConceptReferenceParserRuleCall_2_0_0 = (RuleCall)cConstraintAlternatives_2_0.eContents().get(0);
		private final RuleCall cConstraintAnyParserRuleCall_2_0_1 = (RuleCall)cConstraintAlternatives_2_0.eContents().get(1);
		private final RuleCall cConstraintNestedExpressionParserRuleCall_2_0_2 = (RuleCall)cConstraintAlternatives_2_0.eContents().get(2);
		
		//MemberOf:
		//    CARET (SQUARE_OPEN (refsetFields+=UnquotedString (COMMA refsetFields+=UnquotedString)*) SQUARE_CLOSE)? constraint=(EclConceptReference | Any | NestedExpression);
		@Override public ParserRule getRule() { return rule; }
		
		//CARET (SQUARE_OPEN (refsetFields+=UnquotedString (COMMA refsetFields+=UnquotedString)*) SQUARE_CLOSE)? constraint=(EclConceptReference | Any | NestedExpression)
		public Group getGroup() { return cGroup; }
		
		//CARET
		public RuleCall getCARETTerminalRuleCall_0() { return cCARETTerminalRuleCall_0; }
		
		//(SQUARE_OPEN (refsetFields+=UnquotedString (COMMA refsetFields+=UnquotedString)*) SQUARE_CLOSE)?
		public Group getGroup_1() { return cGroup_1; }
		
		//SQUARE_OPEN
		public RuleCall getSQUARE_OPENTerminalRuleCall_1_0() { return cSQUARE_OPENTerminalRuleCall_1_0; }
		
		//(refsetFields+=UnquotedString (COMMA refsetFields+=UnquotedString)*)
		public Group getGroup_1_1() { return cGroup_1_1; }
		
		//refsetFields+=UnquotedString
		public Assignment getRefsetFieldsAssignment_1_1_0() { return cRefsetFieldsAssignment_1_1_0; }
		
		//UnquotedString
		public RuleCall getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0() { return cRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0; }
		
		//(COMMA refsetFields+=UnquotedString)*
		public Group getGroup_1_1_1() { return cGroup_1_1_1; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1_0() { return cCOMMATerminalRuleCall_1_1_1_0; }
		
		//refsetFields+=UnquotedString
		public Assignment getRefsetFieldsAssignment_1_1_1_1() { return cRefsetFieldsAssignment_1_1_1_1; }
		
		//UnquotedString
		public RuleCall getRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0() { return cRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0; }
		
		//SQUARE_CLOSE
		public RuleCall getSQUARE_CLOSETerminalRuleCall_1_2() { return cSQUARE_CLOSETerminalRuleCall_1_2; }
		
		//constraint=(EclConceptReference | Any | NestedExpression)
		public Assignment getConstraintAssignment_2() { return cConstraintAssignment_2; }
		
		//(EclConceptReference | Any | NestedExpression)
		public Alternatives getConstraintAlternatives_2_0() { return cConstraintAlternatives_2_0; }
		
		//EclConceptReference
		public RuleCall getConstraintEclConceptReferenceParserRuleCall_2_0_0() { return cConstraintEclConceptReferenceParserRuleCall_2_0_0; }
		
		//Any
		public RuleCall getConstraintAnyParserRuleCall_2_0_1() { return cConstraintAnyParserRuleCall_2_0_1; }
		
		//NestedExpression
		public RuleCall getConstraintNestedExpressionParserRuleCall_2_0_2() { return cConstraintNestedExpressionParserRuleCall_2_0_2; }
	}
	public class EclConceptReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclConceptReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdIdentifierParserRuleCall_0_0 = (RuleCall)cIdAssignment_0.eContents().get(0);
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTermAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0 = (RuleCall)cTermAssignment_2.eContents().get(0);
		
		//EclConceptReference:
		//    id=Identifier WS* (term=PIPE_DELIMITED_STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//id=Identifier WS* (term=PIPE_DELIMITED_STRING)?
		public Group getGroup() { return cGroup; }
		
		//id=Identifier
		public Assignment getIdAssignment_0() { return cIdAssignment_0; }
		
		//Identifier
		public RuleCall getIdIdentifierParserRuleCall_0_0() { return cIdIdentifierParserRuleCall_0_0; }
		
		//WS*
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//(term=PIPE_DELIMITED_STRING)?
		public Assignment getTermAssignment_2() { return cTermAssignment_2; }
		
		//PIPE_DELIMITED_STRING
		public RuleCall getTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0() { return cTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0; }
	}
	public class AlternateIdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AlternateIdentifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cSchemeAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cSchemeAlternateSchemeParserRuleCall_0_0 = (RuleCall)cSchemeAssignment_0.eContents().get(0);
		private final RuleCall cHASHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cCodeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cCodeAlternatives_2_0 = (Alternatives)cCodeAssignment_2.eContents().get(0);
		private final RuleCall cCodeAlternateCodeParserRuleCall_2_0_0 = (RuleCall)cCodeAlternatives_2_0.eContents().get(0);
		private final RuleCall cCodeSTRINGTerminalRuleCall_2_0_1 = (RuleCall)cCodeAlternatives_2_0.eContents().get(1);
		private final RuleCall cWSTerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		private final Assignment cTermAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0 = (RuleCall)cTermAssignment_4.eContents().get(0);
		
		//AlternateIdentifier:
		//    scheme=AlternateScheme HASH code=(AlternateCode | STRING) WS* (term=PIPE_DELIMITED_STRING)?;
		@Override public ParserRule getRule() { return rule; }
		
		//scheme=AlternateScheme HASH code=(AlternateCode | STRING) WS* (term=PIPE_DELIMITED_STRING)?
		public Group getGroup() { return cGroup; }
		
		//scheme=AlternateScheme
		public Assignment getSchemeAssignment_0() { return cSchemeAssignment_0; }
		
		//AlternateScheme
		public RuleCall getSchemeAlternateSchemeParserRuleCall_0_0() { return cSchemeAlternateSchemeParserRuleCall_0_0; }
		
		//HASH
		public RuleCall getHASHTerminalRuleCall_1() { return cHASHTerminalRuleCall_1; }
		
		//code=(AlternateCode | STRING)
		public Assignment getCodeAssignment_2() { return cCodeAssignment_2; }
		
		//(AlternateCode | STRING)
		public Alternatives getCodeAlternatives_2_0() { return cCodeAlternatives_2_0; }
		
		//AlternateCode
		public RuleCall getCodeAlternateCodeParserRuleCall_2_0_0() { return cCodeAlternateCodeParserRuleCall_2_0_0; }
		
		//STRING
		public RuleCall getCodeSTRINGTerminalRuleCall_2_0_1() { return cCodeSTRINGTerminalRuleCall_2_0_1; }
		
		//WS*
		public RuleCall getWSTerminalRuleCall_3() { return cWSTerminalRuleCall_3; }
		
		//(term=PIPE_DELIMITED_STRING)?
		public Assignment getTermAssignment_4() { return cTermAssignment_4; }
		
		//PIPE_DELIMITED_STRING
		public RuleCall getTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0() { return cTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0; }
	}
	public class EclConceptReferenceSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConceptsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConceptsEclConceptReferenceParserRuleCall_1_0 = (RuleCall)cConceptsAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//EclConceptReferenceSet:
		//    ROUND_OPEN (concepts+=EclConceptReference)+ ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN (concepts+=EclConceptReference)+ ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//(concepts+=EclConceptReference)+
		public Assignment getConceptsAssignment_1() { return cConceptsAssignment_1; }
		
		//EclConceptReference
		public RuleCall getConceptsEclConceptReferenceParserRuleCall_1_0() { return cConceptsEclConceptReferenceParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class AnyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Any");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWILDCARDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Action cAnyAction_1 = (Action)cGroup.eContents().get(1);
		
		//Any:
		//    WILDCARD {Any};
		@Override public ParserRule getRule() { return rule; }
		
		//WILDCARD {Any}
		public Group getGroup() { return cGroup; }
		
		//WILDCARD
		public RuleCall getWILDCARDTerminalRuleCall_0() { return cWILDCARDTerminalRuleCall_0; }
		
		//{Any}
		public Action getAnyAction_1() { return cAnyAction_1; }
	}
	public class EclRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclRefinement");
		private final RuleCall cOrRefinementParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EclRefinement:
		//    OrRefinement;
		@Override public ParserRule getRule() { return rule; }
		
		//OrRefinement
		public RuleCall getOrRefinementParserRuleCall() { return cOrRefinementParserRuleCall; }
	}
	public class OrRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.OrRefinement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndRefinementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cOrRefinementLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1 = (RuleCall)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightAndRefinementParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//OrRefinement returns EclRefinement:
		//    AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*
		public Group getGroup() { return cGroup; }
		
		//AndRefinement
		public RuleCall getAndRefinementParserRuleCall_0() { return cAndRefinementParserRuleCall_0; }
		
		//-> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{OrRefinement.left=current}
		public Action getOrRefinementLeftAction_1_0_0() { return cOrRefinementLeftAction_1_0_0; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1() { return cDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1; }
		
		//right=AndRefinement
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//AndRefinement
		public RuleCall getRightAndRefinementParserRuleCall_1_0_2_0() { return cRightAndRefinementParserRuleCall_1_0_2_0; }
	}
	public class AndRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AndRefinement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubRefinementParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cAndRefinementLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Alternatives cAlternatives_1_0_1 = (Alternatives)cGroup_1_0.eContents().get(1);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0 = (RuleCall)cAlternatives_1_0_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_0_1_1 = (RuleCall)cAlternatives_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightSubRefinementParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//AndRefinement returns EclRefinement:
		//    SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*
		public Group getGroup() { return cGroup; }
		
		//SubRefinement
		public RuleCall getSubRefinementParserRuleCall_0() { return cSubRefinementParserRuleCall_0; }
		
		//-> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{AndRefinement.left=current}
		public Action getAndRefinementLeftAction_1_0_0() { return cAndRefinementLeftAction_1_0_0; }
		
		//(CONJUNCTION_KEYWORD | COMMA)
		public Alternatives getAlternatives_1_0_1() { return cAlternatives_1_0_1; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0() { return cCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_0_1_1() { return cCOMMATerminalRuleCall_1_0_1_1; }
		
		//right=SubRefinement
		public Assignment getRightAssignment_1_0_2() { return cRightAssignment_1_0_2; }
		
		//SubRefinement
		public RuleCall getRightSubRefinementParserRuleCall_1_0_2_0() { return cRightSubRefinementParserRuleCall_1_0_2_0; }
	}
	public class SubRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SubRefinement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeConstraintParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEclAttributeGroupParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cNestedRefinementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//SubRefinement returns EclRefinement:
		//    AttributeConstraint | EclAttributeGroup | NestedRefinement;
		@Override public ParserRule getRule() { return rule; }
		
		//AttributeConstraint | EclAttributeGroup | NestedRefinement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AttributeConstraint
		public RuleCall getAttributeConstraintParserRuleCall_0() { return cAttributeConstraintParserRuleCall_0; }
		
		//EclAttributeGroup
		public RuleCall getEclAttributeGroupParserRuleCall_1() { return cEclAttributeGroupParserRuleCall_1; }
		
		//NestedRefinement
		public RuleCall getNestedRefinementParserRuleCall_2() { return cNestedRefinementParserRuleCall_2; }
	}
	public class NestedRefinementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NestedRefinement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedEclRefinementParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedRefinement:
		//    ROUND_OPEN nested=EclRefinement ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=EclRefinement ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=EclRefinement
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//EclRefinement
		public RuleCall getNestedEclRefinementParserRuleCall_1_0() { return cNestedEclRefinementParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class EclAttributeGroupElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclAttributeGroup");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCardinalityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCardinalityCardinalityParserRuleCall_0_0 = (RuleCall)cCardinalityAssignment_0.eContents().get(0);
		private final RuleCall cCURLY_OPENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cRefinementAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cRefinementEclAttributeSetParserRuleCall_2_0 = (RuleCall)cRefinementAssignment_2.eContents().get(0);
		private final RuleCall cCURLY_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//EclAttributeGroup:
		//    (cardinality=Cardinality)? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//(cardinality=Cardinality)? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE
		public Group getGroup() { return cGroup; }
		
		//(cardinality=Cardinality)?
		public Assignment getCardinalityAssignment_0() { return cCardinalityAssignment_0; }
		
		//Cardinality
		public RuleCall getCardinalityCardinalityParserRuleCall_0_0() { return cCardinalityCardinalityParserRuleCall_0_0; }
		
		//CURLY_OPEN
		public RuleCall getCURLY_OPENTerminalRuleCall_1() { return cCURLY_OPENTerminalRuleCall_1; }
		
		//refinement=EclAttributeSet
		public Assignment getRefinementAssignment_2() { return cRefinementAssignment_2; }
		
		//EclAttributeSet
		public RuleCall getRefinementEclAttributeSetParserRuleCall_2_0() { return cRefinementEclAttributeSetParserRuleCall_2_0; }
		
		//CURLY_CLOSE
		public RuleCall getCURLY_CLOSETerminalRuleCall_3() { return cCURLY_CLOSETerminalRuleCall_3; }
	}
	public class EclAttributeSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclAttributeSet");
		private final RuleCall cOrAttributeSetParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//EclAttributeSet returns EclRefinement:
		//    OrAttributeSet;
		@Override public ParserRule getRule() { return rule; }
		
		//OrAttributeSet
		public RuleCall getOrAttributeSetParserRuleCall() { return cOrAttributeSetParserRuleCall; }
	}
	public class OrAttributeSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.OrAttributeSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cAndAttributeSetParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cOrRefinementLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndAttributeSetParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrAttributeSet returns EclRefinement:
		//    AndAttributeSet ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndAttributeSet ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*
		public Group getGroup() { return cGroup; }
		
		//AndAttributeSet
		public RuleCall getAndAttributeSetParserRuleCall_0() { return cAndAttributeSetParserRuleCall_0; }
		
		//({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrRefinement.left=current}
		public Action getOrRefinementLeftAction_1_0() { return cOrRefinementLeftAction_1_0; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_1_1() { return cDISJUNCTION_KEYWORDTerminalRuleCall_1_1; }
		
		//right=AndAttributeSet
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//AndAttributeSet
		public RuleCall getRightAndAttributeSetParserRuleCall_1_2_0() { return cRightAndAttributeSetParserRuleCall_1_2_0; }
	}
	public class AndAttributeSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AndAttributeSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubAttributeSetParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAndRefinementLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightSubAttributeSetParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndAttributeSet returns EclRefinement:
		//    SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*
		public Group getGroup() { return cGroup; }
		
		//SubAttributeSet
		public RuleCall getSubAttributeSetParserRuleCall_0() { return cSubAttributeSetParserRuleCall_0; }
		
		//({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndRefinement.left=current}
		public Action getAndRefinementLeftAction_1_0() { return cAndRefinementLeftAction_1_0; }
		
		//(CONJUNCTION_KEYWORD | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0() { return cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=SubAttributeSet
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//SubAttributeSet
		public RuleCall getRightSubAttributeSetParserRuleCall_1_2_0() { return cRightSubAttributeSetParserRuleCall_1_2_0; }
	}
	public class SubAttributeSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SubAttributeSet");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeConstraintParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNestedAttributeSetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//SubAttributeSet returns EclRefinement:
		//    AttributeConstraint | NestedAttributeSet;
		@Override public ParserRule getRule() { return rule; }
		
		//AttributeConstraint | NestedAttributeSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AttributeConstraint
		public RuleCall getAttributeConstraintParserRuleCall_0() { return cAttributeConstraintParserRuleCall_0; }
		
		//NestedAttributeSet
		public RuleCall getNestedAttributeSetParserRuleCall_1() { return cNestedAttributeSetParserRuleCall_1; }
	}
	public class NestedAttributeSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NestedAttributeSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedEclAttributeSetParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedAttributeSet returns NestedRefinement:
		//    ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=EclAttributeSet
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//EclAttributeSet
		public RuleCall getNestedEclAttributeSetParserRuleCall_1_0() { return cNestedEclAttributeSetParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class AttributeConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AttributeConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cCardinalityAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cCardinalityCardinalityParserRuleCall_0_0 = (RuleCall)cCardinalityAssignment_0.eContents().get(0);
		private final Assignment cReversedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cReversedREVERSEDTerminalRuleCall_1_0 = (RuleCall)cReversedAssignment_1.eContents().get(0);
		private final Assignment cAttributeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAttributeFilteredExpressionConstraintParserRuleCall_2_0 = (RuleCall)cAttributeAssignment_2.eContents().get(0);
		private final Assignment cComparisonAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComparisonComparisonParserRuleCall_3_0 = (RuleCall)cComparisonAssignment_3.eContents().get(0);
		
		//AttributeConstraint:
		//    (cardinality=Cardinality)? (reversed?=REVERSED)? attribute=FilteredExpressionConstraint (comparison=Comparison)?;
		@Override public ParserRule getRule() { return rule; }
		
		//(cardinality=Cardinality)? (reversed?=REVERSED)? attribute=FilteredExpressionConstraint (comparison=Comparison)?
		public Group getGroup() { return cGroup; }
		
		//(cardinality=Cardinality)?
		public Assignment getCardinalityAssignment_0() { return cCardinalityAssignment_0; }
		
		//Cardinality
		public RuleCall getCardinalityCardinalityParserRuleCall_0_0() { return cCardinalityCardinalityParserRuleCall_0_0; }
		
		//(reversed?=REVERSED)?
		public Assignment getReversedAssignment_1() { return cReversedAssignment_1; }
		
		//REVERSED
		public RuleCall getReversedREVERSEDTerminalRuleCall_1_0() { return cReversedREVERSEDTerminalRuleCall_1_0; }
		
		//attribute=FilteredExpressionConstraint
		public Assignment getAttributeAssignment_2() { return cAttributeAssignment_2; }
		
		//FilteredExpressionConstraint
		public RuleCall getAttributeFilteredExpressionConstraintParserRuleCall_2_0() { return cAttributeFilteredExpressionConstraintParserRuleCall_2_0; }
		
		//(comparison=Comparison)?
		public Assignment getComparisonAssignment_3() { return cComparisonAssignment_3; }
		
		//Comparison
		public RuleCall getComparisonComparisonParserRuleCall_3_0() { return cComparisonComparisonParserRuleCall_3_0; }
	}
	public class CardinalityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Cardinality");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSQUARE_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cMinAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cMinNonNegativeIntegerParserRuleCall_1_0 = (RuleCall)cMinAssignment_1.eContents().get(0);
		private final RuleCall cTOTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cMaxAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cMaxMaxValueParserRuleCall_3_0 = (RuleCall)cMaxAssignment_3.eContents().get(0);
		private final RuleCall cSQUARE_CLOSETerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//Cardinality:
		//    SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE
		public Group getGroup() { return cGroup; }
		
		//SQUARE_OPEN
		public RuleCall getSQUARE_OPENTerminalRuleCall_0() { return cSQUARE_OPENTerminalRuleCall_0; }
		
		//min=NonNegativeInteger
		public Assignment getMinAssignment_1() { return cMinAssignment_1; }
		
		//NonNegativeInteger
		public RuleCall getMinNonNegativeIntegerParserRuleCall_1_0() { return cMinNonNegativeIntegerParserRuleCall_1_0; }
		
		//TO
		public RuleCall getTOTerminalRuleCall_2() { return cTOTerminalRuleCall_2; }
		
		//max=MaxValue
		public Assignment getMaxAssignment_3() { return cMaxAssignment_3; }
		
		//MaxValue
		public RuleCall getMaxMaxValueParserRuleCall_3_0() { return cMaxMaxValueParserRuleCall_3_0; }
		
		//SQUARE_CLOSE
		public RuleCall getSQUARE_CLOSETerminalRuleCall_4() { return cSQUARE_CLOSETerminalRuleCall_4; }
	}
	public class ComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Comparison");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAttributeComparisonParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDataTypeComparisonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Comparison:
		//    AttributeComparison | DataTypeComparison;
		@Override public ParserRule getRule() { return rule; }
		
		//AttributeComparison | DataTypeComparison
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AttributeComparison
		public RuleCall getAttributeComparisonParserRuleCall_0() { return cAttributeComparisonParserRuleCall_0; }
		
		//DataTypeComparison
		public RuleCall getDataTypeComparisonParserRuleCall_1() { return cDataTypeComparisonParserRuleCall_1; }
	}
	public class AttributeComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AttributeComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueFilteredExpressionConstraintParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//AttributeComparison:
		//    op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//value=FilteredExpressionConstraint
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//FilteredExpressionConstraint
		public RuleCall getValueFilteredExpressionConstraintParserRuleCall_1_0() { return cValueFilteredExpressionConstraintParserRuleCall_1_0; }
	}
	public class DataTypeComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DataTypeComparison");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBooleanValueComparisonParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringValueComparisonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIntegerValueComparisonParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDecimalValueComparisonParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//DataTypeComparison:
		//    BooleanValueComparison
		//    | StringValueComparison
		//    | IntegerValueComparison
		//    | DecimalValueComparison;
		@Override public ParserRule getRule() { return rule; }
		
		//BooleanValueComparison
		//| StringValueComparison
		//| IntegerValueComparison
		//| DecimalValueComparison
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//BooleanValueComparison
		public RuleCall getBooleanValueComparisonParserRuleCall_0() { return cBooleanValueComparisonParserRuleCall_0; }
		
		//StringValueComparison
		public RuleCall getStringValueComparisonParserRuleCall_1() { return cStringValueComparisonParserRuleCall_1; }
		
		//IntegerValueComparison
		public RuleCall getIntegerValueComparisonParserRuleCall_2() { return cIntegerValueComparisonParserRuleCall_2; }
		
		//DecimalValueComparison
		public RuleCall getDecimalValueComparisonParserRuleCall_3() { return cDecimalValueComparisonParserRuleCall_3; }
	}
	public class BooleanValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.BooleanValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueBooleanParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//BooleanValueComparison:
		//    op=NON_NUMERIC_OPERATOR value=Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR value=Boolean
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//value=Boolean
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//Boolean
		public RuleCall getValueBooleanParserRuleCall_1_0() { return cValueBooleanParserRuleCall_1_0; }
	}
	public class StringValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.StringValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSearchTermParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//StringValueComparison:
		//    op=NON_NUMERIC_OPERATOR value=SearchTerm;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR value=SearchTerm
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//value=SearchTerm
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//SearchTerm
		public RuleCall getValueSearchTermParserRuleCall_1_0() { return cValueSearchTermParserRuleCall_1_0; }
	}
	public class IntegerValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.IntegerValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpNUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final RuleCall cHASHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIntegerParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//IntegerValueComparison:
		//    op=NUMERIC_OPERATOR HASH value=Integer;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NUMERIC_OPERATOR HASH value=Integer
		public Group getGroup() { return cGroup; }
		
		//op=NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NUMERIC_OPERATOR
		public RuleCall getOpNUMERIC_OPERATORParserRuleCall_0_0() { return cOpNUMERIC_OPERATORParserRuleCall_0_0; }
		
		//HASH
		public RuleCall getHASHTerminalRuleCall_1() { return cHASHTerminalRuleCall_1; }
		
		//value=Integer
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Integer
		public RuleCall getValueIntegerParserRuleCall_2_0() { return cValueIntegerParserRuleCall_2_0; }
	}
	public class DecimalValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DecimalValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cOpNUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final RuleCall cHASHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueDecimalParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//DecimalValueComparison:
		//    op=NUMERIC_OPERATOR HASH value=Decimal;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NUMERIC_OPERATOR HASH value=Decimal
		public Group getGroup() { return cGroup; }
		
		//op=NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NUMERIC_OPERATOR
		public RuleCall getOpNUMERIC_OPERATORParserRuleCall_0_0() { return cOpNUMERIC_OPERATORParserRuleCall_0_0; }
		
		//HASH
		public RuleCall getHASHTerminalRuleCall_1() { return cHASHTerminalRuleCall_1; }
		
		//value=Decimal
		public Assignment getValueAssignment_2() { return cValueAssignment_2; }
		
		//Decimal
		public RuleCall getValueDecimalParserRuleCall_2_0() { return cValueDecimalParserRuleCall_2_0; }
	}
	public class NestedExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NestedExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedExpressionConstraintParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedExpression:
		//    ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=ExpressionConstraint
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//ExpressionConstraint
		public RuleCall getNestedExpressionConstraintParserRuleCall_1_0() { return cNestedExpressionConstraintParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class FilterConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.FilterConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDOUBLE_CURLY_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDomainSHORT_DOMAINParserRuleCall_1_0 = (RuleCall)cDomainAssignment_1.eContents().get(0);
		private final Assignment cFilterAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cFilterFilterParserRuleCall_2_0 = (RuleCall)cFilterAssignment_2.eContents().get(0);
		private final RuleCall cDOUBLE_CURLY_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//// filters
		//// Single-letter filter domains are new in ECL 1.6
		//FilterConstraint:
		//    DOUBLE_CURLY_OPEN (domain=SHORT_DOMAIN)? filter=Filter DOUBLE_CURLY_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//DOUBLE_CURLY_OPEN (domain=SHORT_DOMAIN)? filter=Filter DOUBLE_CURLY_CLOSE
		public Group getGroup() { return cGroup; }
		
		//DOUBLE_CURLY_OPEN
		public RuleCall getDOUBLE_CURLY_OPENTerminalRuleCall_0() { return cDOUBLE_CURLY_OPENTerminalRuleCall_0; }
		
		//(domain=SHORT_DOMAIN)?
		public Assignment getDomainAssignment_1() { return cDomainAssignment_1; }
		
		//SHORT_DOMAIN
		public RuleCall getDomainSHORT_DOMAINParserRuleCall_1_0() { return cDomainSHORT_DOMAINParserRuleCall_1_0; }
		
		//filter=Filter
		public Assignment getFilterAssignment_2() { return cFilterAssignment_2; }
		
		//Filter
		public RuleCall getFilterFilterParserRuleCall_2_0() { return cFilterFilterParserRuleCall_2_0; }
		
		//DOUBLE_CURLY_CLOSE
		public RuleCall getDOUBLE_CURLY_CLOSETerminalRuleCall_3() { return cDOUBLE_CURLY_CLOSETerminalRuleCall_3; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Filter");
		private final RuleCall cDisjunctionFilterParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Filter:
		//    DisjunctionFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//DisjunctionFilter
		public RuleCall getDisjunctionFilterParserRuleCall() { return cDisjunctionFilterParserRuleCall; }
	}
	public class DisjunctionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DisjunctionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConjunctionFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDisjunctionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightConjunctionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//// Conjunction (OR) of filters is an extension to ECL 1.6
		//DisjunctionFilter returns Filter:
		//    ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*
		public Group getGroup() { return cGroup; }
		
		//ConjunctionFilter
		public RuleCall getConjunctionFilterParserRuleCall_0() { return cConjunctionFilterParserRuleCall_0; }
		
		//({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DisjunctionFilter.left=current}
		public Action getDisjunctionFilterLeftAction_1_0() { return cDisjunctionFilterLeftAction_1_0; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_1_1() { return cDISJUNCTION_KEYWORDTerminalRuleCall_1_1; }
		
		//right=ConjunctionFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ConjunctionFilter
		public RuleCall getRightConjunctionFilterParserRuleCall_1_2_0() { return cRightConjunctionFilterParserRuleCall_1_2_0; }
	}
	public class ConjunctionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPropertyFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cConjunctionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPropertyFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//// Using the "AND" keyword for filter disjunction is an extension to ECL 1.6
		//ConjunctionFilter returns Filter:
		//    PropertyFilter ({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//PropertyFilter ({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*
		public Group getGroup() { return cGroup; }
		
		//PropertyFilter
		public RuleCall getPropertyFilterParserRuleCall_0() { return cPropertyFilterParserRuleCall_0; }
		
		//({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ConjunctionFilter.left=current}
		public Action getConjunctionFilterLeftAction_1_0() { return cConjunctionFilterLeftAction_1_0; }
		
		//(CONJUNCTION_KEYWORD | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0() { return cCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=PropertyFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//PropertyFilter
		public RuleCall getRightPropertyFilterParserRuleCall_1_2_0() { return cRightPropertyFilterParserRuleCall_1_2_0; }
	}
	public class NestedFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NestedFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cNestedAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNestedFilterParserRuleCall_1_0 = (RuleCall)cNestedAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NestedFilter:
		//    ROUND_OPEN nested=Filter ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN nested=Filter ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//nested=Filter
		public Assignment getNestedAssignment_1() { return cNestedAssignment_1; }
		
		//Filter
		public RuleCall getNestedFilterParserRuleCall_1_0() { return cNestedFilterParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class PropertyFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PropertyFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTermFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLanguageFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTypeFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDialectFilterParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cIdFilterParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cDefinitionStatusFilterParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cModuleFilterParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cEffectiveTimeFilterParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cActiveFilterParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cSemanticTagFilterParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cPreferredInFilterParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cAcceptableInFilterParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cLanguageRefSetFilterParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cCaseSignificanceFilterParserRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cMemberFieldFilterParserRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cNestedFilterParserRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		
		//PropertyFilter:
		//    // Description filters in ECL 1.6
		//    TermFilter
		//    | LanguageFilter
		//    | TypeFilter
		//    | DialectFilter
		//    // Description filters in ECL 2.1
		//    | IdFilter
		//    // Concept filters in ECL 1.6
		//    | DefinitionStatusFilter
		//    // Concept (Description and Member) filters in ECL 1.6, component filters in QL 0.1 (extension)
		//    | ModuleFilter
		//    | EffectiveTimeFilter
		//    | ActiveFilter
		//    // Component filters in QL 0.1 (extension)
		//    | SemanticTagFilter
		//    // Description filters in QL 0.1 (extension)
		//    | PreferredInFilter
		//    | AcceptableInFilter
		//    | LanguageRefSetFilter
		//    | CaseSignificanceFilter
		//    // Member filters in ECL 2.0
		//    // XXX this should be the last filter due to the UnquotedString refsetFieldName rule
		//    | MemberFieldFilter
		//    // Allows grouping filters for boolean operators
		//    | NestedFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//// Description filters in ECL 1.6
		//TermFilter
		//| LanguageFilter
		//| TypeFilter
		//| DialectFilter
		//// Description filters in ECL 2.1
		//| IdFilter
		//// Concept filters in ECL 1.6
		//| DefinitionStatusFilter
		//// Concept (Description and Member) filters in ECL 1.6, component filters in QL 0.1 (extension)
		//| ModuleFilter
		//| EffectiveTimeFilter
		//| ActiveFilter
		//// Component filters in QL 0.1 (extension)
		//| SemanticTagFilter
		//// Description filters in QL 0.1 (extension)
		//| PreferredInFilter
		//| AcceptableInFilter
		//| LanguageRefSetFilter
		//| CaseSignificanceFilter
		//// Member filters in ECL 2.0
		//// XXX this should be the last filter due to the UnquotedString refsetFieldName rule
		//| MemberFieldFilter
		//// Allows grouping filters for boolean operators
		//| NestedFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//// Description filters in ECL 1.6
		//TermFilter
		public RuleCall getTermFilterParserRuleCall_0() { return cTermFilterParserRuleCall_0; }
		
		//LanguageFilter
		public RuleCall getLanguageFilterParserRuleCall_1() { return cLanguageFilterParserRuleCall_1; }
		
		//TypeFilter
		public RuleCall getTypeFilterParserRuleCall_2() { return cTypeFilterParserRuleCall_2; }
		
		//DialectFilter
		public RuleCall getDialectFilterParserRuleCall_3() { return cDialectFilterParserRuleCall_3; }
		
		//IdFilter
		public RuleCall getIdFilterParserRuleCall_4() { return cIdFilterParserRuleCall_4; }
		
		//DefinitionStatusFilter
		public RuleCall getDefinitionStatusFilterParserRuleCall_5() { return cDefinitionStatusFilterParserRuleCall_5; }
		
		//ModuleFilter
		public RuleCall getModuleFilterParserRuleCall_6() { return cModuleFilterParserRuleCall_6; }
		
		//EffectiveTimeFilter
		public RuleCall getEffectiveTimeFilterParserRuleCall_7() { return cEffectiveTimeFilterParserRuleCall_7; }
		
		//ActiveFilter
		public RuleCall getActiveFilterParserRuleCall_8() { return cActiveFilterParserRuleCall_8; }
		
		//SemanticTagFilter
		public RuleCall getSemanticTagFilterParserRuleCall_9() { return cSemanticTagFilterParserRuleCall_9; }
		
		//PreferredInFilter
		public RuleCall getPreferredInFilterParserRuleCall_10() { return cPreferredInFilterParserRuleCall_10; }
		
		//AcceptableInFilter
		public RuleCall getAcceptableInFilterParserRuleCall_11() { return cAcceptableInFilterParserRuleCall_11; }
		
		//LanguageRefSetFilter
		public RuleCall getLanguageRefSetFilterParserRuleCall_12() { return cLanguageRefSetFilterParserRuleCall_12; }
		
		//CaseSignificanceFilter
		public RuleCall getCaseSignificanceFilterParserRuleCall_13() { return cCaseSignificanceFilterParserRuleCall_13; }
		
		//MemberFieldFilter
		public RuleCall getMemberFieldFilterParserRuleCall_14() { return cMemberFieldFilterParserRuleCall_14; }
		
		//NestedFilter
		public RuleCall getNestedFilterParserRuleCall_15() { return cNestedFilterParserRuleCall_15; }
	}
	public class MemberFieldFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MemberFieldFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cRefsetFieldNameAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cRefsetFieldNameUnquotedStringParserRuleCall_0_0 = (RuleCall)cRefsetFieldNameAssignment_0.eContents().get(0);
		private final Assignment cComparisonAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cComparisonComparisonParserRuleCall_1_0 = (RuleCall)cComparisonAssignment_1.eContents().get(0);
		
		//MemberFieldFilter:
		//    refsetFieldName=UnquotedString comparison=Comparison;
		@Override public ParserRule getRule() { return rule; }
		
		//refsetFieldName=UnquotedString comparison=Comparison
		public Group getGroup() { return cGroup; }
		
		//refsetFieldName=UnquotedString
		public Assignment getRefsetFieldNameAssignment_0() { return cRefsetFieldNameAssignment_0; }
		
		//UnquotedString
		public RuleCall getRefsetFieldNameUnquotedStringParserRuleCall_0_0() { return cRefsetFieldNameUnquotedStringParserRuleCall_0_0; }
		
		//comparison=Comparison
		public Assignment getComparisonAssignment_1() { return cComparisonAssignment_1; }
		
		//Comparison
		public RuleCall getComparisonComparisonParserRuleCall_1_0() { return cComparisonComparisonParserRuleCall_1_0; }
	}
	public class IdFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.IdFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cIdsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cIdsIdentifierParserRuleCall_2_0_0 = (RuleCall)cIdsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cIdsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cIdsIdentifierParserRuleCall_2_1_1_0 = (RuleCall)cIdsAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//IdFilter:
		//    ID_KEYWORD op=NON_NUMERIC_OPERATOR (ids+=Identifier | ROUND_OPEN (ids+=Identifier)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//ID_KEYWORD op=NON_NUMERIC_OPERATOR (ids+=Identifier | ROUND_OPEN (ids+=Identifier)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_0() { return cID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(ids+=Identifier | ROUND_OPEN (ids+=Identifier)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//ids+=Identifier
		public Assignment getIdsAssignment_2_0() { return cIdsAssignment_2_0; }
		
		//Identifier
		public RuleCall getIdsIdentifierParserRuleCall_2_0_0() { return cIdsIdentifierParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (ids+=Identifier)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(ids+=Identifier)+
		public Assignment getIdsAssignment_2_1_1() { return cIdsAssignment_2_1_1; }
		
		//Identifier
		public RuleCall getIdsIdentifierParserRuleCall_2_1_1_0() { return cIdsIdentifierParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class TermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTERM_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cSearchTermAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSearchTermSearchTermParserRuleCall_2_0 = (RuleCall)cSearchTermAssignment_2.eContents().get(0);
		
		//TermFilter:
		//    TERM_KEYWORD op=NON_NUMERIC_OPERATOR searchTerm=SearchTerm;
		@Override public ParserRule getRule() { return rule; }
		
		//TERM_KEYWORD op=NON_NUMERIC_OPERATOR searchTerm=SearchTerm
		public Group getGroup() { return cGroup; }
		
		//TERM_KEYWORD
		public RuleCall getTERM_KEYWORDTerminalRuleCall_0() { return cTERM_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//searchTerm=SearchTerm
		public Assignment getSearchTermAssignment_2() { return cSearchTermAssignment_2; }
		
		//SearchTerm
		public RuleCall getSearchTermSearchTermParserRuleCall_2_0() { return cSearchTermSearchTermParserRuleCall_2_0; }
	}
	public class SearchTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SearchTerm");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypedSearchTermParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypedSearchTermSetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// no special treatment for the term filter STRING, we allow everything for any lexical search type
		//SearchTerm:
		//    TypedSearchTerm | TypedSearchTermSet;
		@Override public ParserRule getRule() { return rule; }
		
		//TypedSearchTerm | TypedSearchTermSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypedSearchTerm
		public RuleCall getTypedSearchTermParserRuleCall_0() { return cTypedSearchTermParserRuleCall_0; }
		
		//TypedSearchTermSet
		public RuleCall getTypedSearchTermSetParserRuleCall_1() { return cTypedSearchTermSetParserRuleCall_1; }
	}
	public class TypedSearchTermElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypedSearchTerm");
		private final Assignment cClauseAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cClauseTypedSearchTermClauseParserRuleCall_0 = (RuleCall)cClauseAssignment.eContents().get(0);
		
		//TypedSearchTerm:
		//    clause=TypedSearchTermClause;
		@Override public ParserRule getRule() { return rule; }
		
		//clause=TypedSearchTermClause
		public Assignment getClauseAssignment() { return cClauseAssignment; }
		
		//TypedSearchTermClause
		public RuleCall getClauseTypedSearchTermClauseParserRuleCall_0() { return cClauseTypedSearchTermClauseParserRuleCall_0; }
	}
	public class TypedSearchTermSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypedSearchTermSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cClausesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cClausesTypedSearchTermClauseParserRuleCall_1_0 = (RuleCall)cClausesAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//TypedSearchTermSet:
		//    ROUND_OPEN (clauses+=TypedSearchTermClause)+ ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN (clauses+=TypedSearchTermClause)+ ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//(clauses+=TypedSearchTermClause)+
		public Assignment getClausesAssignment_1() { return cClausesAssignment_1; }
		
		//TypedSearchTermClause
		public RuleCall getClausesTypedSearchTermClauseParserRuleCall_1_0() { return cClausesTypedSearchTermClauseParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class TypedSearchTermClauseElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypedSearchTermClause");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Group cGroup_0_0 = (Group)cGroup_0.eContents().get(0);
		private final Assignment cLexicalSearchTypeAssignment_0_0_0 = (Assignment)cGroup_0_0.eContents().get(0);
		private final RuleCall cLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0 = (RuleCall)cLexicalSearchTypeAssignment_0_0_0.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_0_0_1 = (RuleCall)cGroup_0_0.eContents().get(1);
		private final Assignment cTermAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cTermSTRINGTerminalRuleCall_0_1_0 = (RuleCall)cTermAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cLexicalSearchTypeAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0 = (RuleCall)cLexicalSearchTypeAssignment_1_0.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cTermAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cTermRegularExpressionParserRuleCall_1_2_0 = (RuleCall)cTermAssignment_1_2.eContents().get(0);
		
		//TypedSearchTermClause
		//    : (lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING
		//    | lexicalSearchType=REGEX_KEYWORD COLON term=RegularExpression
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//(lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING
		//   | lexicalSearchType=REGEX_KEYWORD COLON term=RegularExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//(lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING
		public Group getGroup_0() { return cGroup_0; }
		
		//(lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)?
		public Group getGroup_0_0() { return cGroup_0_0; }
		
		//lexicalSearchType=LEXICAL_SEARCH_TYPE
		public Assignment getLexicalSearchTypeAssignment_0_0_0() { return cLexicalSearchTypeAssignment_0_0_0; }
		
		//LEXICAL_SEARCH_TYPE
		public RuleCall getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0() { return cLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_0_0_1() { return cCOLONTerminalRuleCall_0_0_1; }
		
		//term=STRING
		public Assignment getTermAssignment_0_1() { return cTermAssignment_0_1; }
		
		//STRING
		public RuleCall getTermSTRINGTerminalRuleCall_0_1_0() { return cTermSTRINGTerminalRuleCall_0_1_0; }
		
		//lexicalSearchType=REGEX_KEYWORD COLON term=RegularExpression
		public Group getGroup_1() { return cGroup_1; }
		
		//lexicalSearchType=REGEX_KEYWORD
		public Assignment getLexicalSearchTypeAssignment_1_0() { return cLexicalSearchTypeAssignment_1_0; }
		
		//REGEX_KEYWORD
		public RuleCall getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0() { return cLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_1_1() { return cCOLONTerminalRuleCall_1_1; }
		
		//term=RegularExpression
		public Assignment getTermAssignment_1_2() { return cTermAssignment_1_2; }
		
		//RegularExpression
		public RuleCall getTermRegularExpressionParserRuleCall_1_2_0() { return cTermRegularExpressionParserRuleCall_1_2_0; }
	}
	public class RegularExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.RegularExpression");
		private final RuleCall cSTRINGTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// Regular expression syntax checking is left to the value converter implementation
		//RegularExpression:
		//    STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall() { return cSTRINGTerminalRuleCall; }
	}
	public class LanguageFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LanguageFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLANGUAGE_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cLanguageCodesAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cLanguageCodesUnquotedStringParserRuleCall_2_0_0 = (RuleCall)cLanguageCodesAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cLanguageCodesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cLanguageCodesUnquotedStringParserRuleCall_2_1_1_0 = (RuleCall)cLanguageCodesAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//LanguageFilter:
		//    LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN (languageCodes+=UnquotedString)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN (languageCodes+=UnquotedString)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//LANGUAGE_KEYWORD
		public RuleCall getLANGUAGE_KEYWORDTerminalRuleCall_0() { return cLANGUAGE_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(languageCodes+=UnquotedString | ROUND_OPEN (languageCodes+=UnquotedString)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//languageCodes+=UnquotedString
		public Assignment getLanguageCodesAssignment_2_0() { return cLanguageCodesAssignment_2_0; }
		
		//UnquotedString
		public RuleCall getLanguageCodesUnquotedStringParserRuleCall_2_0_0() { return cLanguageCodesUnquotedStringParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (languageCodes+=UnquotedString)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(languageCodes+=UnquotedString)+
		public Assignment getLanguageCodesAssignment_2_1_1() { return cLanguageCodesAssignment_2_1_1; }
		
		//UnquotedString
		public RuleCall getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0() { return cLanguageCodesUnquotedStringParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class TypeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypeFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeIdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeTokenFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeFilter:
		//    TypeIdFilter | TypeTokenFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//TypeIdFilter | TypeTokenFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TypeIdFilter
		public RuleCall getTypeIdFilterParserRuleCall_0() { return cTypeIdFilterParserRuleCall_0; }
		
		//TypeTokenFilter
		public RuleCall getTypeTokenFilterParserRuleCall_1() { return cTypeTokenFilterParserRuleCall_1; }
	}
	public class TypeIdFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypeIdFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTYPEID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTypeFilterValueParserRuleCall_2_0 = (RuleCall)cTypeAssignment_2.eContents().get(0);
		
		//TypeIdFilter:
		//    TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=FilterValue
		public Group getGroup() { return cGroup; }
		
		//TYPEID_KEYWORD
		public RuleCall getTYPEID_KEYWORDTerminalRuleCall_0() { return cTYPEID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//type=FilterValue
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//FilterValue
		public RuleCall getTypeFilterValueParserRuleCall_2_0() { return cTypeFilterValueParserRuleCall_2_0; }
	}
	public class TypeTokenFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypeTokenFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTYPE_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cTokensAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cTokensUnquotedStringParserRuleCall_2_0_0 = (RuleCall)cTokensAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cTokensAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cTokensUnquotedStringParserRuleCall_2_1_1_0 = (RuleCall)cTokensAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//// Any unquoted string is allowed as a type token here, validator will restrict it
		//// to the available set ("fsn"/"syn"/"def", case insensitive)
		//TypeTokenFilter:
		//    TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN (tokens+=UnquotedString)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN (tokens+=UnquotedString)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//TYPE_KEYWORD
		public RuleCall getTYPE_KEYWORDTerminalRuleCall_0() { return cTYPE_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(tokens+=UnquotedString | ROUND_OPEN (tokens+=UnquotedString)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//tokens+=UnquotedString
		public Assignment getTokensAssignment_2_0() { return cTokensAssignment_2_0; }
		
		//UnquotedString
		public RuleCall getTokensUnquotedStringParserRuleCall_2_0_0() { return cTokensUnquotedStringParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (tokens+=UnquotedString)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(tokens+=UnquotedString)+
		public Assignment getTokensAssignment_2_1_1() { return cTokensAssignment_2_1_1; }
		
		//UnquotedString
		public RuleCall getTokensUnquotedStringParserRuleCall_2_1_1_0() { return cTokensUnquotedStringParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class DialectFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDialectIdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDialectAliasFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DialectFilter:
		//     DialectIdFilter | DialectAliasFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//DialectIdFilter | DialectAliasFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DialectIdFilter
		public RuleCall getDialectIdFilterParserRuleCall_0() { return cDialectIdFilterParserRuleCall_0; }
		
		//DialectAliasFilter
		public RuleCall getDialectAliasFilterParserRuleCall_1() { return cDialectAliasFilterParserRuleCall_1; }
	}
	public class DialectIdFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectIdFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDIALECTID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDialectsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDialectsDialectParserRuleCall_2_0_0 = (RuleCall)cDialectsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cDialectsDialectParserRuleCall_2_1_1_0 = (RuleCall)cDialectsAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//DialectIdFilter:
		//    DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN (dialects+=Dialect)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN (dialects+=Dialect)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECTID_KEYWORD
		public RuleCall getDIALECTID_KEYWORDTerminalRuleCall_0() { return cDIALECTID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(dialects+=Dialect | ROUND_OPEN (dialects+=Dialect)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=Dialect
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_0_0() { return cDialectsDialectParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (dialects+=Dialect)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(dialects+=Dialect)+
		public Assignment getDialectsAssignment_2_1_1() { return cDialectsAssignment_2_1_1; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_1_1_0() { return cDialectsDialectParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class DialectAliasFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAliasFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDIALECT_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDialectsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDialectsDialectAliasParserRuleCall_2_0_0 = (RuleCall)cDialectsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cDialectsDialectAliasParserRuleCall_2_1_1_0 = (RuleCall)cDialectsAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//DialectAliasFilter:
		//    DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN (dialects+=DialectAlias)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN (dialects+=DialectAlias)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECT_KEYWORD
		public RuleCall getDIALECT_KEYWORDTerminalRuleCall_0() { return cDIALECT_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(dialects+=DialectAlias | ROUND_OPEN (dialects+=DialectAlias)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=DialectAlias
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_0_0() { return cDialectsDialectAliasParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (dialects+=DialectAlias)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(dialects+=DialectAlias)+
		public Assignment getDialectsAssignment_2_1_1() { return cDialectsAssignment_2_1_1; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_1_1_0() { return cDialectsDialectAliasParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class DialectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Dialect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0 = (RuleCall)cLanguageRefSetIdAssignment_0.eContents().get(0);
		private final Assignment cAcceptabilityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAcceptabilityAcceptabilityParserRuleCall_1_0 = (RuleCall)cAcceptabilityAssignment_1.eContents().get(0);
		
		//// We will allow filtered expressions within the round parentheses, not simple concept references (extension to ECL 1.6)
		//Dialect:
		//    languageRefSetId=FilteredExpressionConstraint (acceptability=Acceptability)?;
		@Override public ParserRule getRule() { return rule; }
		
		//languageRefSetId=FilteredExpressionConstraint (acceptability=Acceptability)?
		public Group getGroup() { return cGroup; }
		
		//languageRefSetId=FilteredExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_0() { return cLanguageRefSetIdAssignment_0; }
		
		//FilteredExpressionConstraint
		public RuleCall getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0() { return cLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0; }
		
		//(acceptability=Acceptability)?
		public Assignment getAcceptabilityAssignment_1() { return cAcceptabilityAssignment_1; }
		
		//Acceptability
		public RuleCall getAcceptabilityAcceptabilityParserRuleCall_1_0() { return cAcceptabilityAcceptabilityParserRuleCall_1_0; }
	}
	public class DialectAliasElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAlias");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cAliasAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cAliasDialectAliasValueParserRuleCall_0_0 = (RuleCall)cAliasAssignment_0.eContents().get(0);
		private final Assignment cAcceptabilityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAcceptabilityAcceptabilityParserRuleCall_1_0 = (RuleCall)cAcceptabilityAssignment_1.eContents().get(0);
		
		//// Whitespace is significant (indicates an unquoted string boundary) in this rule, so WS tokens can not be hidden
		//DialectAlias:
		//    alias=DialectAliasValue (acceptability=Acceptability)?;
		@Override public ParserRule getRule() { return rule; }
		
		//alias=DialectAliasValue (acceptability=Acceptability)?
		public Group getGroup() { return cGroup; }
		
		//alias=DialectAliasValue
		public Assignment getAliasAssignment_0() { return cAliasAssignment_0; }
		
		//DialectAliasValue
		public RuleCall getAliasDialectAliasValueParserRuleCall_0_0() { return cAliasDialectAliasValueParserRuleCall_0_0; }
		
		//(acceptability=Acceptability)?
		public Assignment getAcceptabilityAssignment_1() { return cAcceptabilityAssignment_1; }
		
		//Acceptability
		public RuleCall getAcceptabilityAcceptabilityParserRuleCall_1_0() { return cAcceptabilityAcceptabilityParserRuleCall_1_0; }
	}
	public class AcceptabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Acceptability");
		private final Assignment cAcceptabilitiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAcceptabilitiesEclConceptReferenceSetParserRuleCall_0 = (RuleCall)cAcceptabilitiesAssignment.eContents().get(0);
		
		//// while the official specification splits this into to separate rules, in order to allow any ID to be parsed in the EclConceptReference rule, it is necessary to treat token aliases as EclConceptReferences
		//// validation will handle both the token cases (restrict it to the available set ("accept"/"prefer", case insensitive)) and SCTID cases
		//Acceptability:
		//    acceptabilities=EclConceptReferenceSet;
		@Override public ParserRule getRule() { return rule; }
		
		//acceptabilities=EclConceptReferenceSet
		public Assignment getAcceptabilitiesAssignment() { return cAcceptabilitiesAssignment; }
		
		//EclConceptReferenceSet
		public RuleCall getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0() { return cAcceptabilitiesEclConceptReferenceSetParserRuleCall_0; }
	}
	public class DefinitionStatusFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DefinitionStatusFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDefinitionStatusIdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDefinitionStatusTokenFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// keeping the original pre-2.0 rules commented for reference
		////Acceptability:
		////    AcceptabilityIdSet | AcceptabilityTokenSet;
		////AcceptabilityIdSet:
		////    acceptabilities=EclConceptReferenceSet;
		////AcceptabilityTokenSet:
		////    ROUND_OPEN (acceptabilities+=UnquotedString)+ ROUND_CLOSE;
		//DefinitionStatusFilter:
		//    DefinitionStatusIdFilter | DefinitionStatusTokenFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//DefinitionStatusIdFilter | DefinitionStatusTokenFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DefinitionStatusIdFilter
		public RuleCall getDefinitionStatusIdFilterParserRuleCall_0() { return cDefinitionStatusIdFilterParserRuleCall_0; }
		
		//DefinitionStatusTokenFilter
		public RuleCall getDefinitionStatusTokenFilterParserRuleCall_1() { return cDefinitionStatusTokenFilterParserRuleCall_1; }
	}
	public class DefinitionStatusIdFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DefinitionStatusIdFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cDefinitionStatusAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cDefinitionStatusFilterValueParserRuleCall_2_0 = (RuleCall)cDefinitionStatusAssignment_2.eContents().get(0);
		
		//DefinitionStatusIdFilter:
		//    DEFINITION_STATUS_ID_KEYWORD op=NON_NUMERIC_OPERATOR definitionStatus=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//DEFINITION_STATUS_ID_KEYWORD op=NON_NUMERIC_OPERATOR definitionStatus=FilterValue
		public Group getGroup() { return cGroup; }
		
		//DEFINITION_STATUS_ID_KEYWORD
		public RuleCall getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0() { return cDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//definitionStatus=FilterValue
		public Assignment getDefinitionStatusAssignment_2() { return cDefinitionStatusAssignment_2; }
		
		//FilterValue
		public RuleCall getDefinitionStatusFilterValueParserRuleCall_2_0() { return cDefinitionStatusFilterValueParserRuleCall_2_0; }
	}
	public class DefinitionStatusTokenFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DefinitionStatusTokenFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDefinitionStatusTokensAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0 = (RuleCall)cDefinitionStatusTokensAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cDefinitionStatusTokensAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0 = (RuleCall)cDefinitionStatusTokensAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//// Any unquoted string is allowed as a definition status token here, validator will restrict it
		//// to the available set ("primitive"/"defined", case insensitive)
		//DefinitionStatusTokenFilter:
		//    DEFINITION_STATUS_TOKEN_KEYWORD op=NON_NUMERIC_OPERATOR
		//    (definitionStatusTokens+=UnquotedString | ROUND_OPEN (definitionStatusTokens+=UnquotedString)+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DEFINITION_STATUS_TOKEN_KEYWORD op=NON_NUMERIC_OPERATOR
		//(definitionStatusTokens+=UnquotedString | ROUND_OPEN (definitionStatusTokens+=UnquotedString)+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DEFINITION_STATUS_TOKEN_KEYWORD
		public RuleCall getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0() { return cDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(definitionStatusTokens+=UnquotedString | ROUND_OPEN (definitionStatusTokens+=UnquotedString)+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//definitionStatusTokens+=UnquotedString
		public Assignment getDefinitionStatusTokensAssignment_2_0() { return cDefinitionStatusTokensAssignment_2_0; }
		
		//UnquotedString
		public RuleCall getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0() { return cDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0; }
		
		//ROUND_OPEN (definitionStatusTokens+=UnquotedString)+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//(definitionStatusTokens+=UnquotedString)+
		public Assignment getDefinitionStatusTokensAssignment_2_1_1() { return cDefinitionStatusTokensAssignment_2_1_1; }
		
		//UnquotedString
		public RuleCall getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0() { return cDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_2() { return cROUND_CLOSETerminalRuleCall_2_1_2; }
	}
	public class ModuleFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ModuleFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMODULEID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cModuleIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cModuleIdFilterValueParserRuleCall_2_0 = (RuleCall)cModuleIdAssignment_2.eContents().get(0);
		
		//ModuleFilter:
		//    MODULEID_KEYWORD op=NON_NUMERIC_OPERATOR moduleId=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//MODULEID_KEYWORD op=NON_NUMERIC_OPERATOR moduleId=FilterValue
		public Group getGroup() { return cGroup; }
		
		//MODULEID_KEYWORD
		public RuleCall getMODULEID_KEYWORDTerminalRuleCall_0() { return cMODULEID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//moduleId=FilterValue
		public Assignment getModuleIdAssignment_2() { return cModuleIdAssignment_2; }
		
		//FilterValue
		public RuleCall getModuleIdFilterValueParserRuleCall_2_0() { return cModuleIdFilterValueParserRuleCall_2_0; }
	}
	public class EffectiveTimeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EffectiveTimeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cEffectiveTimeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cEffectiveTimeSTRINGTerminalRuleCall_2_0 = (RuleCall)cEffectiveTimeAssignment_2.eContents().get(0);
		
		//// Any quoted string is allowed as an effective time literal here; accepted values are:
		//// - "" (unspecified effective time in ECL 1.6)
		//// - "Unspecified" (unspecified in Snow Owl)
		//// - "yyyyMMdd" (effective time in short date format)
		//EffectiveTimeFilter:
		//    EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING
		public Group getGroup() { return cGroup; }
		
		//EFFECTIVE_TIME_KEYWORD
		public RuleCall getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0() { return cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0; }
		
		//op=NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NUMERIC_OPERATOR
		public RuleCall getOpNUMERIC_OPERATORParserRuleCall_1_0() { return cOpNUMERIC_OPERATORParserRuleCall_1_0; }
		
		//effectiveTime=STRING
		public Assignment getEffectiveTimeAssignment_2() { return cEffectiveTimeAssignment_2; }
		
		//STRING
		public RuleCall getEffectiveTimeSTRINGTerminalRuleCall_2_0() { return cEffectiveTimeSTRINGTerminalRuleCall_2_0; }
	}
	public class ActiveFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ActiveFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cACTIVE_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cActiveAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cActiveActiveBooleanParserRuleCall_2_0 = (RuleCall)cActiveAssignment_2.eContents().get(0);
		
		//ActiveFilter:
		//    ACTIVE_KEYWORD op=NON_NUMERIC_OPERATOR active=ActiveBoolean;
		@Override public ParserRule getRule() { return rule; }
		
		//ACTIVE_KEYWORD op=NON_NUMERIC_OPERATOR active=ActiveBoolean
		public Group getGroup() { return cGroup; }
		
		//ACTIVE_KEYWORD
		public RuleCall getACTIVE_KEYWORDTerminalRuleCall_0() { return cACTIVE_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//active=ActiveBoolean
		public Assignment getActiveAssignment_2() { return cActiveAssignment_2; }
		
		//ActiveBoolean
		public RuleCall getActiveActiveBooleanParserRuleCall_2_0() { return cActiveActiveBooleanParserRuleCall_2_0; }
	}
	public class SemanticTagFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SemanticTagFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSEMANTIC_TAG_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cSemanticTagAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cSemanticTagSTRINGTerminalRuleCall_2_0 = (RuleCall)cSemanticTagAssignment_2.eContents().get(0);
		
		//SemanticTagFilter:
		//    SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING
		public Group getGroup() { return cGroup; }
		
		//SEMANTIC_TAG_KEYWORD
		public RuleCall getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0() { return cSEMANTIC_TAG_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//semanticTag=STRING
		public Assignment getSemanticTagAssignment_2() { return cSemanticTagAssignment_2; }
		
		//STRING
		public RuleCall getSemanticTagSTRINGTerminalRuleCall_2_0() { return cSemanticTagSTRINGTerminalRuleCall_2_0; }
	}
	public class PreferredInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PreferredInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPREFERRED_IN_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdFilterValueParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//PreferredInFilter:
		//    PREFERRED_IN_KEYWORD EQUAL languageRefSetId=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//PREFERRED_IN_KEYWORD EQUAL languageRefSetId=FilterValue
		public Group getGroup() { return cGroup; }
		
		//PREFERRED_IN_KEYWORD
		public RuleCall getPREFERRED_IN_KEYWORDTerminalRuleCall_0() { return cPREFERRED_IN_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=FilterValue
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//FilterValue
		public RuleCall getLanguageRefSetIdFilterValueParserRuleCall_2_0() { return cLanguageRefSetIdFilterValueParserRuleCall_2_0; }
	}
	public class AcceptableInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AcceptableInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cACCEPTABLE_IN_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdFilterValueParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//AcceptableInFilter:
		//    ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=FilterValue
		public Group getGroup() { return cGroup; }
		
		//ACCEPTABLE_IN_KEYWORD
		public RuleCall getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0() { return cACCEPTABLE_IN_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=FilterValue
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//FilterValue
		public RuleCall getLanguageRefSetIdFilterValueParserRuleCall_2_0() { return cLanguageRefSetIdFilterValueParserRuleCall_2_0; }
	}
	public class LanguageRefSetFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LanguageRefSetFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdFilterValueParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//LanguageRefSetFilter:
		//    LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=FilterValue
		public Group getGroup() { return cGroup; }
		
		//LANGUAGE_REFSET_ID_KEYWORD
		public RuleCall getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0() { return cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=FilterValue
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//FilterValue
		public RuleCall getLanguageRefSetIdFilterValueParserRuleCall_2_0() { return cLanguageRefSetIdFilterValueParserRuleCall_2_0; }
	}
	public class CaseSignificanceFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CaseSignificanceFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cCaseSignificanceIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCaseSignificanceIdFilterValueParserRuleCall_2_0 = (RuleCall)cCaseSignificanceIdAssignment_2.eContents().get(0);
		
		//CaseSignificanceFilter:
		//    CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=FilterValue;
		@Override public ParserRule getRule() { return rule; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=FilterValue
		public Group getGroup() { return cGroup; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD
		public RuleCall getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0() { return cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//caseSignificanceId=FilterValue
		public Assignment getCaseSignificanceIdAssignment_2() { return cCaseSignificanceIdAssignment_2; }
		
		//FilterValue
		public RuleCall getCaseSignificanceIdFilterValueParserRuleCall_2_0() { return cCaseSignificanceIdFilterValueParserRuleCall_2_0; }
	}
	public class FilterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.FilterValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cFilteredExpressionConstraintParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEclConceptReferenceSetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//FilterValue:
		//    FilteredExpressionConstraint | EclConceptReferenceSet;
		@Override public ParserRule getRule() { return rule; }
		
		//FilteredExpressionConstraint | EclConceptReferenceSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//FilteredExpressionConstraint
		public RuleCall getFilteredExpressionConstraintParserRuleCall_0() { return cFilteredExpressionConstraintParserRuleCall_0; }
		
		//EclConceptReferenceSet
		public RuleCall getEclConceptReferenceSetParserRuleCall_1() { return cEclConceptReferenceSetParserRuleCall_1; }
	}
	public class SupplementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Supplement");
		private final RuleCall cHistorySupplementParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//// History Supplement from ECL 2.0
		//Supplement:
		//    HistorySupplement;
		@Override public ParserRule getRule() { return rule; }
		
		//HistorySupplement
		public RuleCall getHistorySupplementParserRuleCall() { return cHistorySupplementParserRuleCall; }
	}
	public class HistorySupplementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HistorySupplement");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDOUBLE_CURLY_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cPLUSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cHISTORY_KEYWORDTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Action cHistorySupplementAction_3 = (Action)cGroup.eContents().get(3);
		private final Assignment cHistoryAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final Alternatives cHistoryAlternatives_4_0 = (Alternatives)cHistoryAssignment_4.eContents().get(0);
		private final RuleCall cHistoryHistoryProfileParserRuleCall_4_0_0 = (RuleCall)cHistoryAlternatives_4_0.eContents().get(0);
		private final RuleCall cHistoryNestedExpressionParserRuleCall_4_0_1 = (RuleCall)cHistoryAlternatives_4_0.eContents().get(1);
		private final RuleCall cDOUBLE_CURLY_CLOSETerminalRuleCall_5 = (RuleCall)cGroup.eContents().get(5);
		
		//HistorySupplement:
		//    DOUBLE_CURLY_OPEN PLUS HISTORY_KEYWORD {HistorySupplement} history=(HistoryProfile | NestedExpression)? DOUBLE_CURLY_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//DOUBLE_CURLY_OPEN PLUS HISTORY_KEYWORD {HistorySupplement} history=(HistoryProfile | NestedExpression)? DOUBLE_CURLY_CLOSE
		public Group getGroup() { return cGroup; }
		
		//DOUBLE_CURLY_OPEN
		public RuleCall getDOUBLE_CURLY_OPENTerminalRuleCall_0() { return cDOUBLE_CURLY_OPENTerminalRuleCall_0; }
		
		//PLUS
		public RuleCall getPLUSTerminalRuleCall_1() { return cPLUSTerminalRuleCall_1; }
		
		//HISTORY_KEYWORD
		public RuleCall getHISTORY_KEYWORDTerminalRuleCall_2() { return cHISTORY_KEYWORDTerminalRuleCall_2; }
		
		//{HistorySupplement}
		public Action getHistorySupplementAction_3() { return cHistorySupplementAction_3; }
		
		//history=(HistoryProfile | NestedExpression)?
		public Assignment getHistoryAssignment_4() { return cHistoryAssignment_4; }
		
		//(HistoryProfile | NestedExpression)
		public Alternatives getHistoryAlternatives_4_0() { return cHistoryAlternatives_4_0; }
		
		//HistoryProfile
		public RuleCall getHistoryHistoryProfileParserRuleCall_4_0_0() { return cHistoryHistoryProfileParserRuleCall_4_0_0; }
		
		//NestedExpression
		public RuleCall getHistoryNestedExpressionParserRuleCall_4_0_1() { return cHistoryNestedExpressionParserRuleCall_4_0_1; }
		
		//DOUBLE_CURLY_CLOSE
		public RuleCall getDOUBLE_CURLY_CLOSETerminalRuleCall_5() { return cDOUBLE_CURLY_CLOSETerminalRuleCall_5; }
	}
	public class HistoryProfileElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HistoryProfile");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cDASHTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cUNDERSCORETerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final Assignment cProfileAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0 = (RuleCall)cProfileAssignment_1.eContents().get(0);
		
		//HistoryProfile:
		//    (DASH | UNDERSCORE) profile = HISTORY_PROFILE_TYPE;
		@Override public ParserRule getRule() { return rule; }
		
		//(DASH | UNDERSCORE) profile = HISTORY_PROFILE_TYPE
		public Group getGroup() { return cGroup; }
		
		//(DASH | UNDERSCORE)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_0_0() { return cDASHTerminalRuleCall_0_0; }
		
		//UNDERSCORE
		public RuleCall getUNDERSCORETerminalRuleCall_0_1() { return cUNDERSCORETerminalRuleCall_0_1; }
		
		//profile = HISTORY_PROFILE_TYPE
		public Assignment getProfileAssignment_1() { return cProfileAssignment_1; }
		
		//HISTORY_PROFILE_TYPE
		public RuleCall getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0() { return cProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0; }
	}
	public class IdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Identifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cDIGITTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3 = (RuleCall)cAlternatives_0.eContents().get(3);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4 = (RuleCall)cAlternatives_0.eContents().get(4);
		private final RuleCall cREVERSEDTerminalRuleCall_0_5 = (RuleCall)cAlternatives_0.eContents().get(5);
		private final RuleCall cID_KEYWORDTerminalRuleCall_0_6 = (RuleCall)cAlternatives_0.eContents().get(6);
		private final RuleCall cKEYWORDTerminalRuleCall_0_7 = (RuleCall)cAlternatives_0.eContents().get(7);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDIGITTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4 = (RuleCall)cAlternatives_1.eContents().get(4);
		private final RuleCall cREVERSEDTerminalRuleCall_1_5 = (RuleCall)cAlternatives_1.eContents().get(5);
		private final RuleCall cID_KEYWORDTerminalRuleCall_1_6 = (RuleCall)cAlternatives_1.eContents().get(6);
		private final RuleCall cKEYWORDTerminalRuleCall_1_7 = (RuleCall)cAlternatives_1.eContents().get(7);
		private final RuleCall cDASHTerminalRuleCall_1_8 = (RuleCall)cAlternatives_1.eContents().get(8);
		private final RuleCall cUNDERSCORETerminalRuleCall_1_9 = (RuleCall)cAlternatives_1.eContents().get(9);
		
		///*
		// * Datatype rules
		// */
		//Identifier returns ecore::EString hidden():
		//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH | UNDERSCORE)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH | UNDERSCORE)*
		public Group getGroup() { return cGroup; }
		
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//DIGIT
		public RuleCall getDIGITTerminalRuleCall_0_0() { return cDIGITTerminalRuleCall_0_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_0_1() { return cALPHATerminalRuleCall_0_1; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_0_5() { return cREVERSEDTerminalRuleCall_0_5; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_0_6() { return cID_KEYWORDTerminalRuleCall_0_6; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_0_7() { return cKEYWORDTerminalRuleCall_0_7; }
		
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH | UNDERSCORE)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//DIGIT
		public RuleCall getDIGITTerminalRuleCall_1_0() { return cDIGITTerminalRuleCall_1_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_1_1() { return cALPHATerminalRuleCall_1_1; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_1_5() { return cREVERSEDTerminalRuleCall_1_5; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_1_6() { return cID_KEYWORDTerminalRuleCall_1_6; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_1_7() { return cKEYWORDTerminalRuleCall_1_7; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_1_8() { return cDASHTerminalRuleCall_1_8; }
		
		//UNDERSCORE
		public RuleCall getUNDERSCORETerminalRuleCall_1_9() { return cUNDERSCORETerminalRuleCall_1_9; }
	}
	public class AlternateSchemeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AlternateScheme");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2 = (RuleCall)cAlternatives_0.eContents().get(2);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3 = (RuleCall)cAlternatives_0.eContents().get(3);
		private final RuleCall cREVERSEDTerminalRuleCall_0_4 = (RuleCall)cAlternatives_0.eContents().get(4);
		private final RuleCall cID_KEYWORDTerminalRuleCall_0_5 = (RuleCall)cAlternatives_0.eContents().get(5);
		private final RuleCall cKEYWORDTerminalRuleCall_0_6 = (RuleCall)cAlternatives_0.eContents().get(6);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDIGITTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4 = (RuleCall)cAlternatives_1.eContents().get(4);
		private final RuleCall cREVERSEDTerminalRuleCall_1_5 = (RuleCall)cAlternatives_1.eContents().get(5);
		private final RuleCall cID_KEYWORDTerminalRuleCall_1_6 = (RuleCall)cAlternatives_1.eContents().get(6);
		private final RuleCall cKEYWORDTerminalRuleCall_1_7 = (RuleCall)cAlternatives_1.eContents().get(7);
		private final RuleCall cDASHTerminalRuleCall_1_8 = (RuleCall)cAlternatives_1.eContents().get(8);
		
		//// Differences from Identifier: no leading digits; underscores not allowed in any position
		//AlternateScheme returns ecore::EString hidden():
		//    (ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH)*;
		@Override public ParserRule getRule() { return rule; }
		
		//(ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH)*
		public Group getGroup() { return cGroup; }
		
		//(ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_0_0() { return cALPHATerminalRuleCall_0_0; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_0_4() { return cREVERSEDTerminalRuleCall_0_4; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_0_5() { return cID_KEYWORDTerminalRuleCall_0_5; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_0_6() { return cKEYWORDTerminalRuleCall_0_6; }
		
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//DIGIT
		public RuleCall getDIGITTerminalRuleCall_1_0() { return cDIGITTerminalRuleCall_1_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_1_1() { return cALPHATerminalRuleCall_1_1; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_1_5() { return cREVERSEDTerminalRuleCall_1_5; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_1_6() { return cID_KEYWORDTerminalRuleCall_1_6; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_1_7() { return cKEYWORDTerminalRuleCall_1_7; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_1_8() { return cDASHTerminalRuleCall_1_8; }
	}
	public class AlternateCodeElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AlternateCode");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDIGITTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cREVERSEDTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cID_KEYWORDTerminalRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cKEYWORDTerminalRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cDOTTerminalRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cDASHTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//// Differences from Identifier: no underscores but periods and dashes are permitted, even in leading position
		//AlternateCode returns ecore::EString hidden():
		//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DOT | DASH)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DOT | DASH)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DIGIT
		public RuleCall getDIGITTerminalRuleCall_0() { return cDIGITTerminalRuleCall_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_1() { return cALPHATerminalRuleCall_1; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_2() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_2; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_4() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_4; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_5() { return cREVERSEDTerminalRuleCall_5; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_6() { return cID_KEYWORDTerminalRuleCall_6; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_7() { return cKEYWORDTerminalRuleCall_7; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_8() { return cDOTTerminalRuleCall_8; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_9() { return cDASHTerminalRuleCall_9; }
	}
	public class NonNegativeIntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
		private final RuleCall cDIGITTerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//NonNegativeInteger returns ecore::EInt hidden():
		//    (DIGIT)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DIGIT)+
		public RuleCall getDIGITTerminalRuleCall() { return cDIGITTerminalRuleCall; }
	}
	public class NonNegativeDecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cDIGITTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//NonNegativeDecimal returns ecore::EBigDecimal hidden():
		//    NonNegativeInteger DOT (DIGIT)*;
		@Override public ParserRule getRule() { return rule; }
		
		//NonNegativeInteger DOT (DIGIT)*
		public Group getGroup() { return cGroup; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_0() { return cNonNegativeIntegerParserRuleCall_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1() { return cDOTTerminalRuleCall_1; }
		
		//(DIGIT)*
		public RuleCall getDIGITTerminalRuleCall_2() { return cDIGITTerminalRuleCall_2; }
	}
	public class MaxValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MaxValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWILDCARDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MaxValue returns ecore::EInt:
		//    NonNegativeInteger | WILDCARD;
		@Override public ParserRule getRule() { return rule; }
		
		//NonNegativeInteger | WILDCARD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_0() { return cNonNegativeIntegerParserRuleCall_0; }
		
		//WILDCARD
		public RuleCall getWILDCARDTerminalRuleCall_1() { return cWILDCARDTerminalRuleCall_1; }
	}
	public class IntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Integer");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cPLUSTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cDASHTerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Integer returns ecore::EInt hidden():
		//    (PLUS | DASH)? NonNegativeInteger;
		@Override public ParserRule getRule() { return rule; }
		
		//(PLUS | DASH)? NonNegativeInteger
		public Group getGroup() { return cGroup; }
		
		//(PLUS | DASH)?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//PLUS
		public RuleCall getPLUSTerminalRuleCall_0_0() { return cPLUSTerminalRuleCall_0_0; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_0_1() { return cDASHTerminalRuleCall_0_1; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_1() { return cNonNegativeIntegerParserRuleCall_1; }
	}
	public class DecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Decimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Alternatives cAlternatives_0 = (Alternatives)cGroup.eContents().get(0);
		private final RuleCall cPLUSTerminalRuleCall_0_0 = (RuleCall)cAlternatives_0.eContents().get(0);
		private final RuleCall cDASHTerminalRuleCall_0_1 = (RuleCall)cAlternatives_0.eContents().get(1);
		private final RuleCall cNonNegativeDecimalParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		
		//Decimal returns ecore::EBigDecimal hidden():
		//    (PLUS | DASH)? NonNegativeDecimal;
		@Override public ParserRule getRule() { return rule; }
		
		//(PLUS | DASH)? NonNegativeDecimal
		public Group getGroup() { return cGroup; }
		
		//(PLUS | DASH)?
		public Alternatives getAlternatives_0() { return cAlternatives_0; }
		
		//PLUS
		public RuleCall getPLUSTerminalRuleCall_0_0() { return cPLUSTerminalRuleCall_0_0; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_0_1() { return cDASHTerminalRuleCall_0_1; }
		
		//NonNegativeDecimal
		public RuleCall getNonNegativeDecimalParserRuleCall_1() { return cNonNegativeDecimalParserRuleCall_1; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTRUE_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFALSE_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Boolean returns ecore::EBoolean:
		//    TRUE_KEYWORD | FALSE_KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//TRUE_KEYWORD | FALSE_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRUE_KEYWORD
		public RuleCall getTRUE_KEYWORDTerminalRuleCall_0() { return cTRUE_KEYWORDTerminalRuleCall_0; }
		
		//FALSE_KEYWORD
		public RuleCall getFALSE_KEYWORDTerminalRuleCall_1() { return cFALSE_KEYWORDTerminalRuleCall_1; }
	}
	public class ActiveBooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ActiveBoolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cBooleanParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//// Value converter and validation checks for allowed integers 0 and 1
		//ActiveBoolean returns ecore::EBoolean:
		//    NonNegativeInteger | Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//NonNegativeInteger | Boolean
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_0() { return cNonNegativeIntegerParserRuleCall_0; }
		
		//Boolean
		public RuleCall getBooleanParserRuleCall_1() { return cBooleanParserRuleCall_1; }
	}
	public class UnquotedStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.UnquotedString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cHISTORY_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cACCEPTABLE_IN_KEYWORDTerminalRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cPREFERRED_IN_KEYWORDTerminalRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cSEMANTIC_TAG_KEYWORDTerminalRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cDIALECTID_KEYWORDTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cLANGUAGE_KEYWORDTerminalRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cMODULEID_KEYWORDTerminalRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cDIALECT_KEYWORDTerminalRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cACTIVE_KEYWORDTerminalRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cTYPEID_KEYWORDTerminalRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cEXCLUSION_KEYWORDTerminalRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		private final RuleCall cEXACT_KEYWORDTerminalRuleCall_16 = (RuleCall)cAlternatives.eContents().get(16);
		private final RuleCall cFALSE_KEYWORDTerminalRuleCall_17 = (RuleCall)cAlternatives.eContents().get(17);
		private final RuleCall cMATCH_KEYWORDTerminalRuleCall_18 = (RuleCall)cAlternatives.eContents().get(18);
		private final RuleCall cREGEX_KEYWORDTerminalRuleCall_19 = (RuleCall)cAlternatives.eContents().get(19);
		private final RuleCall cTERM_KEYWORDTerminalRuleCall_20 = (RuleCall)cAlternatives.eContents().get(20);
		private final RuleCall cTRUE_KEYWORDTerminalRuleCall_21 = (RuleCall)cAlternatives.eContents().get(21);
		private final RuleCall cTYPE_KEYWORDTerminalRuleCall_22 = (RuleCall)cAlternatives.eContents().get(22);
		private final RuleCall cWILD_KEYWORDTerminalRuleCall_23 = (RuleCall)cAlternatives.eContents().get(23);
		private final RuleCall cMIN_KEYWORDTerminalRuleCall_24 = (RuleCall)cAlternatives.eContents().get(24);
		private final RuleCall cMOD_KEYWORDTerminalRuleCall_25 = (RuleCall)cAlternatives.eContents().get(25);
		private final RuleCall cMAX_KEYWORDTerminalRuleCall_26 = (RuleCall)cAlternatives.eContents().get(26);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_27 = (RuleCall)cAlternatives.eContents().get(27);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_28 = (RuleCall)cAlternatives.eContents().get(28);
		private final RuleCall cID_KEYWORDTerminalRuleCall_29 = (RuleCall)cAlternatives.eContents().get(29);
		private final RuleCall cREVERSEDTerminalRuleCall_30 = (RuleCall)cAlternatives.eContents().get(30);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_31 = (RuleCall)cAlternatives.eContents().get(31);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32 = (RuleCall)cAlternatives.eContents().get(32);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_33 = (RuleCall)cAlternatives.eContents().get(33);
		private final RuleCall cWILDCARDTerminalRuleCall_34 = (RuleCall)cAlternatives.eContents().get(34);
		private final RuleCall cKEYWORDTerminalRuleCall_35 = (RuleCall)cAlternatives.eContents().get(35);
		
		//// Unquoted strings also need to cover any keywords caught by the lexer, earlier in the process. They are terminated by whitespace.
		//UnquotedString:
		//    HISTORY_KEYWORD
		//    | CASE_SIGNIFICANCE_ID_KEYWORD
		//    | DEFINITION_STATUS_ID_KEYWORD
		//    | DEFINITION_STATUS_TOKEN_KEYWORD
		//    | LANGUAGE_REFSET_ID_KEYWORD
		//    | EFFECTIVE_TIME_KEYWORD
		//    | ACCEPTABLE_IN_KEYWORD
		//    | PREFERRED_IN_KEYWORD
		//    | SEMANTIC_TAG_KEYWORD
		//    | DIALECTID_KEYWORD
		//    | LANGUAGE_KEYWORD
		//    | MODULEID_KEYWORD
		//    | DIALECT_KEYWORD
		//    | ACTIVE_KEYWORD
		//    | TYPEID_KEYWORD
		//    | EXCLUSION_KEYWORD
		//    | EXACT_KEYWORD
		//    | FALSE_KEYWORD
		//    | MATCH_KEYWORD
		//    | REGEX_KEYWORD
		//    | TERM_KEYWORD
		//    | TRUE_KEYWORD
		//    | TYPE_KEYWORD
		//    | WILD_KEYWORD
		//    | MIN_KEYWORD
		//    | MOD_KEYWORD
		//    | MAX_KEYWORD
		//    | CONJUNCTION_KEYWORD
		//    | DISJUNCTION_KEYWORD
		//    | ID_KEYWORD
		//    | REVERSED
		//    | MEMBER_SHORT_KEYWORD
		//    | DESCRIPTION_SHORT_KEYWORD
		//    | CONCEPT_SHORT_KEYWORD
		//    | WILDCARD
		//    | KEYWORD
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//HISTORY_KEYWORD
		//| CASE_SIGNIFICANCE_ID_KEYWORD
		//| DEFINITION_STATUS_ID_KEYWORD
		//| DEFINITION_STATUS_TOKEN_KEYWORD
		//| LANGUAGE_REFSET_ID_KEYWORD
		//| EFFECTIVE_TIME_KEYWORD
		//| ACCEPTABLE_IN_KEYWORD
		//| PREFERRED_IN_KEYWORD
		//| SEMANTIC_TAG_KEYWORD
		//| DIALECTID_KEYWORD
		//| LANGUAGE_KEYWORD
		//| MODULEID_KEYWORD
		//| DIALECT_KEYWORD
		//| ACTIVE_KEYWORD
		//| TYPEID_KEYWORD
		//| EXCLUSION_KEYWORD
		//| EXACT_KEYWORD
		//| FALSE_KEYWORD
		//| MATCH_KEYWORD
		//| REGEX_KEYWORD
		//| TERM_KEYWORD
		//| TRUE_KEYWORD
		//| TYPE_KEYWORD
		//| WILD_KEYWORD
		//| MIN_KEYWORD
		//| MOD_KEYWORD
		//| MAX_KEYWORD
		//| CONJUNCTION_KEYWORD
		//| DISJUNCTION_KEYWORD
		//| ID_KEYWORD
		//| REVERSED
		//| MEMBER_SHORT_KEYWORD
		//| DESCRIPTION_SHORT_KEYWORD
		//| CONCEPT_SHORT_KEYWORD
		//| WILDCARD
		//| KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//HISTORY_KEYWORD
		public RuleCall getHISTORY_KEYWORDTerminalRuleCall_0() { return cHISTORY_KEYWORDTerminalRuleCall_0; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD
		public RuleCall getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1() { return cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1; }
		
		//DEFINITION_STATUS_ID_KEYWORD
		public RuleCall getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2() { return cDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2; }
		
		//DEFINITION_STATUS_TOKEN_KEYWORD
		public RuleCall getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3() { return cDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3; }
		
		//LANGUAGE_REFSET_ID_KEYWORD
		public RuleCall getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4() { return cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4; }
		
		//EFFECTIVE_TIME_KEYWORD
		public RuleCall getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5() { return cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5; }
		
		//ACCEPTABLE_IN_KEYWORD
		public RuleCall getACCEPTABLE_IN_KEYWORDTerminalRuleCall_6() { return cACCEPTABLE_IN_KEYWORDTerminalRuleCall_6; }
		
		//PREFERRED_IN_KEYWORD
		public RuleCall getPREFERRED_IN_KEYWORDTerminalRuleCall_7() { return cPREFERRED_IN_KEYWORDTerminalRuleCall_7; }
		
		//SEMANTIC_TAG_KEYWORD
		public RuleCall getSEMANTIC_TAG_KEYWORDTerminalRuleCall_8() { return cSEMANTIC_TAG_KEYWORDTerminalRuleCall_8; }
		
		//DIALECTID_KEYWORD
		public RuleCall getDIALECTID_KEYWORDTerminalRuleCall_9() { return cDIALECTID_KEYWORDTerminalRuleCall_9; }
		
		//LANGUAGE_KEYWORD
		public RuleCall getLANGUAGE_KEYWORDTerminalRuleCall_10() { return cLANGUAGE_KEYWORDTerminalRuleCall_10; }
		
		//MODULEID_KEYWORD
		public RuleCall getMODULEID_KEYWORDTerminalRuleCall_11() { return cMODULEID_KEYWORDTerminalRuleCall_11; }
		
		//DIALECT_KEYWORD
		public RuleCall getDIALECT_KEYWORDTerminalRuleCall_12() { return cDIALECT_KEYWORDTerminalRuleCall_12; }
		
		//ACTIVE_KEYWORD
		public RuleCall getACTIVE_KEYWORDTerminalRuleCall_13() { return cACTIVE_KEYWORDTerminalRuleCall_13; }
		
		//TYPEID_KEYWORD
		public RuleCall getTYPEID_KEYWORDTerminalRuleCall_14() { return cTYPEID_KEYWORDTerminalRuleCall_14; }
		
		//EXCLUSION_KEYWORD
		public RuleCall getEXCLUSION_KEYWORDTerminalRuleCall_15() { return cEXCLUSION_KEYWORDTerminalRuleCall_15; }
		
		//EXACT_KEYWORD
		public RuleCall getEXACT_KEYWORDTerminalRuleCall_16() { return cEXACT_KEYWORDTerminalRuleCall_16; }
		
		//FALSE_KEYWORD
		public RuleCall getFALSE_KEYWORDTerminalRuleCall_17() { return cFALSE_KEYWORDTerminalRuleCall_17; }
		
		//MATCH_KEYWORD
		public RuleCall getMATCH_KEYWORDTerminalRuleCall_18() { return cMATCH_KEYWORDTerminalRuleCall_18; }
		
		//REGEX_KEYWORD
		public RuleCall getREGEX_KEYWORDTerminalRuleCall_19() { return cREGEX_KEYWORDTerminalRuleCall_19; }
		
		//TERM_KEYWORD
		public RuleCall getTERM_KEYWORDTerminalRuleCall_20() { return cTERM_KEYWORDTerminalRuleCall_20; }
		
		//TRUE_KEYWORD
		public RuleCall getTRUE_KEYWORDTerminalRuleCall_21() { return cTRUE_KEYWORDTerminalRuleCall_21; }
		
		//TYPE_KEYWORD
		public RuleCall getTYPE_KEYWORDTerminalRuleCall_22() { return cTYPE_KEYWORDTerminalRuleCall_22; }
		
		//WILD_KEYWORD
		public RuleCall getWILD_KEYWORDTerminalRuleCall_23() { return cWILD_KEYWORDTerminalRuleCall_23; }
		
		//MIN_KEYWORD
		public RuleCall getMIN_KEYWORDTerminalRuleCall_24() { return cMIN_KEYWORDTerminalRuleCall_24; }
		
		//MOD_KEYWORD
		public RuleCall getMOD_KEYWORDTerminalRuleCall_25() { return cMOD_KEYWORDTerminalRuleCall_25; }
		
		//MAX_KEYWORD
		public RuleCall getMAX_KEYWORDTerminalRuleCall_26() { return cMAX_KEYWORDTerminalRuleCall_26; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_27() { return cCONJUNCTION_KEYWORDTerminalRuleCall_27; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_28() { return cDISJUNCTION_KEYWORDTerminalRuleCall_28; }
		
		//ID_KEYWORD
		public RuleCall getID_KEYWORDTerminalRuleCall_29() { return cID_KEYWORDTerminalRuleCall_29; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_30() { return cREVERSEDTerminalRuleCall_30; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_31() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_31; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_33() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_33; }
		
		//WILDCARD
		public RuleCall getWILDCARDTerminalRuleCall_34() { return cWILDCARDTerminalRuleCall_34; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_35() { return cKEYWORDTerminalRuleCall_35; }
	}
	public class DialectAliasValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAliasValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDASHTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cKEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDIGITTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//DialectAliasValue hidden():
		//    (DASH | KEYWORD | DIGIT)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DASH | KEYWORD | DIGIT)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_0() { return cDASHTerminalRuleCall_0; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_1() { return cKEYWORDTerminalRuleCall_1; }
		
		//DIGIT
		public RuleCall getDIGITTerminalRuleCall_2() { return cDIGITTerminalRuleCall_2; }
	}
	public class LEXICAL_SEARCH_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMATCH_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWILD_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEXACT_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//LEXICAL_SEARCH_TYPE:
		//    // Lexical search types supported in ECL 1.5
		//    MATCH_KEYWORD
		//    | WILD_KEYWORD
		//    // Lexical search type extensions
		//    // REGEX_KEYWORD is used directly in the parser rule, as it requires a special term argument
		//    | EXACT_KEYWORD
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//// Lexical search types supported in ECL 1.5
		//MATCH_KEYWORD
		//| WILD_KEYWORD
		//// Lexical search type extensions
		//// REGEX_KEYWORD is used directly in the parser rule, as it requires a special term argument
		//| EXACT_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//// Lexical search types supported in ECL 1.5
		//MATCH_KEYWORD
		public RuleCall getMATCH_KEYWORDTerminalRuleCall_0() { return cMATCH_KEYWORDTerminalRuleCall_0; }
		
		//WILD_KEYWORD
		public RuleCall getWILD_KEYWORDTerminalRuleCall_1() { return cWILD_KEYWORDTerminalRuleCall_1; }
		
		//EXACT_KEYWORD
		public RuleCall getEXACT_KEYWORDTerminalRuleCall_2() { return cEXACT_KEYWORDTerminalRuleCall_2; }
	}
	public class HISTORY_PROFILE_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HISTORY_PROFILE_TYPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMIN_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cMOD_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMAX_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// History Supplement Profile Suffix from ECL 2.0
		//HISTORY_PROFILE_TYPE:
		//    MIN_KEYWORD
		//    | MOD_KEYWORD
		//    | MAX_KEYWORD
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//MIN_KEYWORD
		//| MOD_KEYWORD
		//| MAX_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MIN_KEYWORD
		public RuleCall getMIN_KEYWORDTerminalRuleCall_0() { return cMIN_KEYWORDTerminalRuleCall_0; }
		
		//MOD_KEYWORD
		public RuleCall getMOD_KEYWORDTerminalRuleCall_1() { return cMOD_KEYWORDTerminalRuleCall_1; }
		
		//MAX_KEYWORD
		public RuleCall getMAX_KEYWORDTerminalRuleCall_2() { return cMAX_KEYWORDTerminalRuleCall_2; }
	}
	public class SHORT_DOMAINElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SHORT_DOMAIN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cMEMBER_SHORT_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//// Single-letter domains for filterConstraints is an ECL 1.6 feature
		//SHORT_DOMAIN:
		//    CONCEPT_SHORT_KEYWORD
		//    | DESCRIPTION_SHORT_KEYWORD
		//    | MEMBER_SHORT_KEYWORD // from ECL 2.0
		//    ;
		@Override public ParserRule getRule() { return rule; }
		
		//CONCEPT_SHORT_KEYWORD
		//| DESCRIPTION_SHORT_KEYWORD
		//| MEMBER_SHORT_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CONCEPT_SHORT_KEYWORD
		public RuleCall getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0() { return cCONCEPT_SHORT_KEYWORDTerminalRuleCall_0; }
		
		//DESCRIPTION_SHORT_KEYWORD
		public RuleCall getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1() { return cDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1; }
		
		//MEMBER_SHORT_KEYWORD
		public RuleCall getMEMBER_SHORT_KEYWORDTerminalRuleCall_2() { return cMEMBER_SHORT_KEYWORDTerminalRuleCall_2; }
	}
	public class NON_NUMERIC_OPERATORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNOT_EQUALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NON_NUMERIC_OPERATOR:
		//    EQUAL | NOT_EQUAL;
		@Override public ParserRule getRule() { return rule; }
		
		//EQUAL | NOT_EQUAL
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_0() { return cEQUALTerminalRuleCall_0; }
		
		//NOT_EQUAL
		public RuleCall getNOT_EQUALTerminalRuleCall_1() { return cNOT_EQUALTerminalRuleCall_1; }
	}
	public class NUMERIC_OPERATORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNOT_EQUALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cGTTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cLTTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cGTETerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cLTETerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		
		//NUMERIC_OPERATOR:
		//    EQUAL | NOT_EQUAL | GT | LT | GTE | LTE;
		@Override public ParserRule getRule() { return rule; }
		
		//EQUAL | NOT_EQUAL | GT | LT | GTE | LTE
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_0() { return cEQUALTerminalRuleCall_0; }
		
		//NOT_EQUAL
		public RuleCall getNOT_EQUALTerminalRuleCall_1() { return cNOT_EQUALTerminalRuleCall_1; }
		
		//GT
		public RuleCall getGTTerminalRuleCall_2() { return cGTTerminalRuleCall_2; }
		
		//LT
		public RuleCall getLTTerminalRuleCall_3() { return cLTTerminalRuleCall_3; }
		
		//GTE
		public RuleCall getGTETerminalRuleCall_4() { return cGTETerminalRuleCall_4; }
		
		//LTE
		public RuleCall getLTETerminalRuleCall_5() { return cLTETerminalRuleCall_5; }
	}
	
	
	private final ScriptElements pScript;
	private final ExpressionConstraintElements pExpressionConstraint;
	private final OrExpressionConstraintElements pOrExpressionConstraint;
	private final AndExpressionConstraintElements pAndExpressionConstraint;
	private final ExclusionExpressionConstraintElements pExclusionExpressionConstraint;
	private final RefinedExpressionConstraintElements pRefinedExpressionConstraint;
	private final DottedExpressionConstraintElements pDottedExpressionConstraint;
	private final SupplementExpressionConstraintElements pSupplementExpressionConstraint;
	private final FilteredExpressionConstraintElements pFilteredExpressionConstraint;
	private final SubExpressionConstraintElements pSubExpressionConstraint;
	private final EclFocusConceptElements pEclFocusConcept;
	private final ChildOfElements pChildOf;
	private final ChildOrSelfOfElements pChildOrSelfOf;
	private final DescendantOfElements pDescendantOf;
	private final DescendantOrSelfOfElements pDescendantOrSelfOf;
	private final ParentOfElements pParentOf;
	private final ParentOrSelfOfElements pParentOrSelfOf;
	private final AncestorOfElements pAncestorOf;
	private final AncestorOrSelfOfElements pAncestorOrSelfOf;
	private final TopElements pTop;
	private final BottomElements pBottom;
	private final MemberOfElements pMemberOf;
	private final EclConceptReferenceElements pEclConceptReference;
	private final AlternateIdentifierElements pAlternateIdentifier;
	private final EclConceptReferenceSetElements pEclConceptReferenceSet;
	private final AnyElements pAny;
	private final EclRefinementElements pEclRefinement;
	private final OrRefinementElements pOrRefinement;
	private final AndRefinementElements pAndRefinement;
	private final SubRefinementElements pSubRefinement;
	private final NestedRefinementElements pNestedRefinement;
	private final EclAttributeGroupElements pEclAttributeGroup;
	private final EclAttributeSetElements pEclAttributeSet;
	private final OrAttributeSetElements pOrAttributeSet;
	private final AndAttributeSetElements pAndAttributeSet;
	private final SubAttributeSetElements pSubAttributeSet;
	private final NestedAttributeSetElements pNestedAttributeSet;
	private final AttributeConstraintElements pAttributeConstraint;
	private final CardinalityElements pCardinality;
	private final ComparisonElements pComparison;
	private final AttributeComparisonElements pAttributeComparison;
	private final DataTypeComparisonElements pDataTypeComparison;
	private final BooleanValueComparisonElements pBooleanValueComparison;
	private final StringValueComparisonElements pStringValueComparison;
	private final IntegerValueComparisonElements pIntegerValueComparison;
	private final DecimalValueComparisonElements pDecimalValueComparison;
	private final NestedExpressionElements pNestedExpression;
	private final FilterConstraintElements pFilterConstraint;
	private final FilterElements pFilter;
	private final DisjunctionFilterElements pDisjunctionFilter;
	private final ConjunctionFilterElements pConjunctionFilter;
	private final NestedFilterElements pNestedFilter;
	private final PropertyFilterElements pPropertyFilter;
	private final MemberFieldFilterElements pMemberFieldFilter;
	private final IdFilterElements pIdFilter;
	private final TermFilterElements pTermFilter;
	private final SearchTermElements pSearchTerm;
	private final TypedSearchTermElements pTypedSearchTerm;
	private final TypedSearchTermSetElements pTypedSearchTermSet;
	private final TypedSearchTermClauseElements pTypedSearchTermClause;
	private final RegularExpressionElements pRegularExpression;
	private final LanguageFilterElements pLanguageFilter;
	private final TypeFilterElements pTypeFilter;
	private final TypeIdFilterElements pTypeIdFilter;
	private final TypeTokenFilterElements pTypeTokenFilter;
	private final DialectFilterElements pDialectFilter;
	private final DialectIdFilterElements pDialectIdFilter;
	private final DialectAliasFilterElements pDialectAliasFilter;
	private final DialectElements pDialect;
	private final DialectAliasElements pDialectAlias;
	private final AcceptabilityElements pAcceptability;
	private final DefinitionStatusFilterElements pDefinitionStatusFilter;
	private final DefinitionStatusIdFilterElements pDefinitionStatusIdFilter;
	private final DefinitionStatusTokenFilterElements pDefinitionStatusTokenFilter;
	private final ModuleFilterElements pModuleFilter;
	private final EffectiveTimeFilterElements pEffectiveTimeFilter;
	private final ActiveFilterElements pActiveFilter;
	private final SemanticTagFilterElements pSemanticTagFilter;
	private final PreferredInFilterElements pPreferredInFilter;
	private final AcceptableInFilterElements pAcceptableInFilter;
	private final LanguageRefSetFilterElements pLanguageRefSetFilter;
	private final CaseSignificanceFilterElements pCaseSignificanceFilter;
	private final FilterValueElements pFilterValue;
	private final SupplementElements pSupplement;
	private final HistorySupplementElements pHistorySupplement;
	private final HistoryProfileElements pHistoryProfile;
	private final IdentifierElements pIdentifier;
	private final AlternateSchemeElements pAlternateScheme;
	private final AlternateCodeElements pAlternateCode;
	private final NonNegativeIntegerElements pNonNegativeInteger;
	private final NonNegativeDecimalElements pNonNegativeDecimal;
	private final MaxValueElements pMaxValue;
	private final IntegerElements pInteger;
	private final DecimalElements pDecimal;
	private final BooleanElements pBoolean;
	private final ActiveBooleanElements pActiveBoolean;
	private final UnquotedStringElements pUnquotedString;
	private final DialectAliasValueElements pDialectAliasValue;
	private final LEXICAL_SEARCH_TYPEElements pLEXICAL_SEARCH_TYPE;
	private final HISTORY_PROFILE_TYPEElements pHISTORY_PROFILE_TYPE;
	private final SHORT_DOMAINElements pSHORT_DOMAIN;
	private final NON_NUMERIC_OPERATORElements pNON_NUMERIC_OPERATOR;
	private final NUMERIC_OPERATORElements pNUMERIC_OPERATOR;
	private final TerminalRule tHISTORY_KEYWORD;
	private final TerminalRule tCASE_SIGNIFICANCE_ID_KEYWORD;
	private final TerminalRule tDEFINITION_STATUS_ID_KEYWORD;
	private final TerminalRule tDEFINITION_STATUS_TOKEN_KEYWORD;
	private final TerminalRule tLANGUAGE_REFSET_ID_KEYWORD;
	private final TerminalRule tEFFECTIVE_TIME_KEYWORD;
	private final TerminalRule tACCEPTABLE_IN_KEYWORD;
	private final TerminalRule tPREFERRED_IN_KEYWORD;
	private final TerminalRule tSEMANTIC_TAG_KEYWORD;
	private final TerminalRule tDIALECTID_KEYWORD;
	private final TerminalRule tLANGUAGE_KEYWORD;
	private final TerminalRule tMODULEID_KEYWORD;
	private final TerminalRule tDIALECT_KEYWORD;
	private final TerminalRule tACTIVE_KEYWORD;
	private final TerminalRule tTYPEID_KEYWORD;
	private final TerminalRule tEXCLUSION_KEYWORD;
	private final TerminalRule tEXACT_KEYWORD;
	private final TerminalRule tFALSE_KEYWORD;
	private final TerminalRule tMATCH_KEYWORD;
	private final TerminalRule tREGEX_KEYWORD;
	private final TerminalRule tTERM_KEYWORD;
	private final TerminalRule tTRUE_KEYWORD;
	private final TerminalRule tTYPE_KEYWORD;
	private final TerminalRule tWILD_KEYWORD;
	private final TerminalRule tMIN_KEYWORD;
	private final TerminalRule tMOD_KEYWORD;
	private final TerminalRule tMAX_KEYWORD;
	private final TerminalRule tCONJUNCTION_KEYWORD;
	private final TerminalRule tDISJUNCTION_KEYWORD;
	private final TerminalRule tID_KEYWORD;
	private final TerminalRule tREVERSED;
	private final TerminalRule tMEMBER_SHORT_KEYWORD;
	private final TerminalRule tDESCRIPTION_SHORT_KEYWORD;
	private final TerminalRule tCONCEPT_SHORT_KEYWORD;
	private final TerminalRule tALPHA;
	private final TerminalRule tKEYWORD;
	private final TerminalRule tDBL_LT_EM;
	private final TerminalRule tDBL_GT_EM;
	private final TerminalRule tDBL_LT;
	private final TerminalRule tDBL_GT;
	private final TerminalRule tLT_EM;
	private final TerminalRule tGT_EM;
	private final TerminalRule tDBL_EM_LT;
	private final TerminalRule tDBL_EM_GT;
	private final TerminalRule tGTE;
	private final TerminalRule tLTE;
	private final TerminalRule tDOUBLE_CURLY_OPEN;
	private final TerminalRule tDOUBLE_CURLY_CLOSE;
	private final TerminalRule tPIPE_DELIMITED_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tTO;
	private final TerminalRule tCOMMA;
	private final TerminalRule tDIGIT;
	private final TerminalRule tCOLON;
	private final TerminalRule tCURLY_OPEN;
	private final TerminalRule tCURLY_CLOSE;
	private final TerminalRule tROUND_OPEN;
	private final TerminalRule tROUND_CLOSE;
	private final TerminalRule tSQUARE_OPEN;
	private final TerminalRule tSQUARE_CLOSE;
	private final TerminalRule tPLUS;
	private final TerminalRule tDASH;
	private final TerminalRule tUNDERSCORE;
	private final TerminalRule tCARET;
	private final TerminalRule tDOT;
	private final TerminalRule tWILDCARD;
	private final TerminalRule tEQUAL;
	private final TerminalRule tNOT_EQUAL;
	private final TerminalRule tLT;
	private final TerminalRule tGT;
	private final TerminalRule tHASH;
	private final TerminalRule tWS;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	
	private final Grammar grammar;

	@Inject
	public EclGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.pScript = new ScriptElements();
		this.pExpressionConstraint = new ExpressionConstraintElements();
		this.pOrExpressionConstraint = new OrExpressionConstraintElements();
		this.pAndExpressionConstraint = new AndExpressionConstraintElements();
		this.pExclusionExpressionConstraint = new ExclusionExpressionConstraintElements();
		this.pRefinedExpressionConstraint = new RefinedExpressionConstraintElements();
		this.pDottedExpressionConstraint = new DottedExpressionConstraintElements();
		this.pSupplementExpressionConstraint = new SupplementExpressionConstraintElements();
		this.pFilteredExpressionConstraint = new FilteredExpressionConstraintElements();
		this.pSubExpressionConstraint = new SubExpressionConstraintElements();
		this.pEclFocusConcept = new EclFocusConceptElements();
		this.pChildOf = new ChildOfElements();
		this.pChildOrSelfOf = new ChildOrSelfOfElements();
		this.pDescendantOf = new DescendantOfElements();
		this.pDescendantOrSelfOf = new DescendantOrSelfOfElements();
		this.pParentOf = new ParentOfElements();
		this.pParentOrSelfOf = new ParentOrSelfOfElements();
		this.pAncestorOf = new AncestorOfElements();
		this.pAncestorOrSelfOf = new AncestorOrSelfOfElements();
		this.pTop = new TopElements();
		this.pBottom = new BottomElements();
		this.pMemberOf = new MemberOfElements();
		this.pEclConceptReference = new EclConceptReferenceElements();
		this.pAlternateIdentifier = new AlternateIdentifierElements();
		this.pEclConceptReferenceSet = new EclConceptReferenceSetElements();
		this.pAny = new AnyElements();
		this.pEclRefinement = new EclRefinementElements();
		this.pOrRefinement = new OrRefinementElements();
		this.pAndRefinement = new AndRefinementElements();
		this.pSubRefinement = new SubRefinementElements();
		this.pNestedRefinement = new NestedRefinementElements();
		this.pEclAttributeGroup = new EclAttributeGroupElements();
		this.pEclAttributeSet = new EclAttributeSetElements();
		this.pOrAttributeSet = new OrAttributeSetElements();
		this.pAndAttributeSet = new AndAttributeSetElements();
		this.pSubAttributeSet = new SubAttributeSetElements();
		this.pNestedAttributeSet = new NestedAttributeSetElements();
		this.pAttributeConstraint = new AttributeConstraintElements();
		this.pCardinality = new CardinalityElements();
		this.pComparison = new ComparisonElements();
		this.pAttributeComparison = new AttributeComparisonElements();
		this.pDataTypeComparison = new DataTypeComparisonElements();
		this.pBooleanValueComparison = new BooleanValueComparisonElements();
		this.pStringValueComparison = new StringValueComparisonElements();
		this.pIntegerValueComparison = new IntegerValueComparisonElements();
		this.pDecimalValueComparison = new DecimalValueComparisonElements();
		this.pNestedExpression = new NestedExpressionElements();
		this.pFilterConstraint = new FilterConstraintElements();
		this.pFilter = new FilterElements();
		this.pDisjunctionFilter = new DisjunctionFilterElements();
		this.pConjunctionFilter = new ConjunctionFilterElements();
		this.pNestedFilter = new NestedFilterElements();
		this.pPropertyFilter = new PropertyFilterElements();
		this.pMemberFieldFilter = new MemberFieldFilterElements();
		this.pIdFilter = new IdFilterElements();
		this.pTermFilter = new TermFilterElements();
		this.pSearchTerm = new SearchTermElements();
		this.pTypedSearchTerm = new TypedSearchTermElements();
		this.pTypedSearchTermSet = new TypedSearchTermSetElements();
		this.pTypedSearchTermClause = new TypedSearchTermClauseElements();
		this.pRegularExpression = new RegularExpressionElements();
		this.pLanguageFilter = new LanguageFilterElements();
		this.pTypeFilter = new TypeFilterElements();
		this.pTypeIdFilter = new TypeIdFilterElements();
		this.pTypeTokenFilter = new TypeTokenFilterElements();
		this.pDialectFilter = new DialectFilterElements();
		this.pDialectIdFilter = new DialectIdFilterElements();
		this.pDialectAliasFilter = new DialectAliasFilterElements();
		this.pDialect = new DialectElements();
		this.pDialectAlias = new DialectAliasElements();
		this.pAcceptability = new AcceptabilityElements();
		this.pDefinitionStatusFilter = new DefinitionStatusFilterElements();
		this.pDefinitionStatusIdFilter = new DefinitionStatusIdFilterElements();
		this.pDefinitionStatusTokenFilter = new DefinitionStatusTokenFilterElements();
		this.pModuleFilter = new ModuleFilterElements();
		this.pEffectiveTimeFilter = new EffectiveTimeFilterElements();
		this.pActiveFilter = new ActiveFilterElements();
		this.pSemanticTagFilter = new SemanticTagFilterElements();
		this.pPreferredInFilter = new PreferredInFilterElements();
		this.pAcceptableInFilter = new AcceptableInFilterElements();
		this.pLanguageRefSetFilter = new LanguageRefSetFilterElements();
		this.pCaseSignificanceFilter = new CaseSignificanceFilterElements();
		this.pFilterValue = new FilterValueElements();
		this.pSupplement = new SupplementElements();
		this.pHistorySupplement = new HistorySupplementElements();
		this.pHistoryProfile = new HistoryProfileElements();
		this.pIdentifier = new IdentifierElements();
		this.pAlternateScheme = new AlternateSchemeElements();
		this.pAlternateCode = new AlternateCodeElements();
		this.pNonNegativeInteger = new NonNegativeIntegerElements();
		this.pNonNegativeDecimal = new NonNegativeDecimalElements();
		this.pMaxValue = new MaxValueElements();
		this.pInteger = new IntegerElements();
		this.pDecimal = new DecimalElements();
		this.pBoolean = new BooleanElements();
		this.pActiveBoolean = new ActiveBooleanElements();
		this.pUnquotedString = new UnquotedStringElements();
		this.pDialectAliasValue = new DialectAliasValueElements();
		this.pLEXICAL_SEARCH_TYPE = new LEXICAL_SEARCH_TYPEElements();
		this.pHISTORY_PROFILE_TYPE = new HISTORY_PROFILE_TYPEElements();
		this.pSHORT_DOMAIN = new SHORT_DOMAINElements();
		this.pNON_NUMERIC_OPERATOR = new NON_NUMERIC_OPERATORElements();
		this.pNUMERIC_OPERATOR = new NUMERIC_OPERATORElements();
		this.tHISTORY_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HISTORY_KEYWORD");
		this.tCASE_SIGNIFICANCE_ID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CASE_SIGNIFICANCE_ID_KEYWORD");
		this.tDEFINITION_STATUS_ID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DEFINITION_STATUS_ID_KEYWORD");
		this.tDEFINITION_STATUS_TOKEN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DEFINITION_STATUS_TOKEN_KEYWORD");
		this.tLANGUAGE_REFSET_ID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LANGUAGE_REFSET_ID_KEYWORD");
		this.tEFFECTIVE_TIME_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EFFECTIVE_TIME_KEYWORD");
		this.tACCEPTABLE_IN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ACCEPTABLE_IN_KEYWORD");
		this.tPREFERRED_IN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PREFERRED_IN_KEYWORD");
		this.tSEMANTIC_TAG_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SEMANTIC_TAG_KEYWORD");
		this.tDIALECTID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIALECTID_KEYWORD");
		this.tLANGUAGE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LANGUAGE_KEYWORD");
		this.tMODULEID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MODULEID_KEYWORD");
		this.tDIALECT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIALECT_KEYWORD");
		this.tACTIVE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ACTIVE_KEYWORD");
		this.tTYPEID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TYPEID_KEYWORD");
		this.tEXCLUSION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EXCLUSION_KEYWORD");
		this.tEXACT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EXACT_KEYWORD");
		this.tFALSE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.FALSE_KEYWORD");
		this.tMATCH_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MATCH_KEYWORD");
		this.tREGEX_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
		this.tTERM_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TERM_KEYWORD");
		this.tTRUE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TRUE_KEYWORD");
		this.tTYPE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TYPE_KEYWORD");
		this.tWILD_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.WILD_KEYWORD");
		this.tMIN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MIN_KEYWORD");
		this.tMOD_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MOD_KEYWORD");
		this.tMAX_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MAX_KEYWORD");
		this.tCONJUNCTION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CONJUNCTION_KEYWORD");
		this.tDISJUNCTION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DISJUNCTION_KEYWORD");
		this.tID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ID_KEYWORD");
		this.tREVERSED = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.REVERSED");
		this.tMEMBER_SHORT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MEMBER_SHORT_KEYWORD");
		this.tDESCRIPTION_SHORT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DESCRIPTION_SHORT_KEYWORD");
		this.tCONCEPT_SHORT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CONCEPT_SHORT_KEYWORD");
		this.tALPHA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ALPHA");
		this.tKEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.KEYWORD");
		this.tDBL_LT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT_EM");
		this.tDBL_GT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT_EM");
		this.tDBL_LT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT");
		this.tDBL_GT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT");
		this.tLT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LT_EM");
		this.tGT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GT_EM");
		this.tDBL_EM_LT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_EM_LT");
		this.tDBL_EM_GT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_EM_GT");
		this.tGTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GTE");
		this.tLTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LTE");
		this.tDOUBLE_CURLY_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_OPEN");
		this.tDOUBLE_CURLY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_CLOSE");
		this.tPIPE_DELIMITED_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.STRING");
		this.tTO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TO");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.COMMA");
		this.tDIGIT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIGIT");
		this.tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.COLON");
		this.tCURLY_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CURLY_OPEN");
		this.tCURLY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CURLY_CLOSE");
		this.tROUND_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ROUND_OPEN");
		this.tROUND_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ROUND_CLOSE");
		this.tSQUARE_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SQUARE_OPEN");
		this.tSQUARE_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SQUARE_CLOSE");
		this.tPLUS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PLUS");
		this.tDASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DASH");
		this.tUNDERSCORE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.UNDERSCORE");
		this.tCARET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CARET");
		this.tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOT");
		this.tWILDCARD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.WILDCARD");
		this.tEQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EQUAL");
		this.tNOT_EQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NOT_EQUAL");
		this.tLT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LT");
		this.tGT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GT");
		this.tHASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HASH");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.WS");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SL_COMMENT");
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("com.b2international.snomed.ecl.Ecl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Script:
	//    {Script} (constraint=ExpressionConstraint)?;
	public ScriptElements getScriptAccess() {
		return pScript;
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}
	
	//ExpressionConstraint:
	//    OrExpressionConstraint;
	public ExpressionConstraintElements getExpressionConstraintAccess() {
		return pExpressionConstraint;
	}
	
	public ParserRule getExpressionConstraintRule() {
		return getExpressionConstraintAccess().getRule();
	}
	
	//OrExpressionConstraint returns ExpressionConstraint:
	//    AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*;
	public OrExpressionConstraintElements getOrExpressionConstraintAccess() {
		return pOrExpressionConstraint;
	}
	
	public ParserRule getOrExpressionConstraintRule() {
		return getOrExpressionConstraintAccess().getRule();
	}
	
	//AndExpressionConstraint returns ExpressionConstraint:
	//    ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA) right=ExclusionExpressionConstraint)*;
	public AndExpressionConstraintElements getAndExpressionConstraintAccess() {
		return pAndExpressionConstraint;
	}
	
	public ParserRule getAndExpressionConstraintRule() {
		return getAndExpressionConstraintAccess().getRule();
	}
	
	//ExclusionExpressionConstraint returns ExpressionConstraint:
	//    RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD right=RefinedExpressionConstraint)?;
	public ExclusionExpressionConstraintElements getExclusionExpressionConstraintAccess() {
		return pExclusionExpressionConstraint;
	}
	
	public ParserRule getExclusionExpressionConstraintRule() {
		return getExclusionExpressionConstraintAccess().getRule();
	}
	
	//RefinedExpressionConstraint returns ExpressionConstraint:
	//    DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?;
	public RefinedExpressionConstraintElements getRefinedExpressionConstraintAccess() {
		return pRefinedExpressionConstraint;
	}
	
	public ParserRule getRefinedExpressionConstraintRule() {
		return getRefinedExpressionConstraintAccess().getRule();
	}
	
	//DottedExpressionConstraint returns ExpressionConstraint:
	//    SupplementExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SupplementExpressionConstraint)*;
	public DottedExpressionConstraintElements getDottedExpressionConstraintAccess() {
		return pDottedExpressionConstraint;
	}
	
	public ParserRule getDottedExpressionConstraintRule() {
		return getDottedExpressionConstraintAccess().getRule();
	}
	
	//SupplementExpressionConstraint returns ExpressionConstraint:
	//    FilteredExpressionConstraint ({SupplementExpressionConstraint.constraint=current} supplement=Supplement)?;
	public SupplementExpressionConstraintElements getSupplementExpressionConstraintAccess() {
		return pSupplementExpressionConstraint;
	}
	
	public ParserRule getSupplementExpressionConstraintRule() {
		return getSupplementExpressionConstraintAccess().getRule();
	}
	
	//FilteredExpressionConstraint returns ExpressionConstraint:
	//    SubExpressionConstraint ({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*;
	public FilteredExpressionConstraintElements getFilteredExpressionConstraintAccess() {
		return pFilteredExpressionConstraint;
	}
	
	public ParserRule getFilteredExpressionConstraintRule() {
		return getFilteredExpressionConstraintAccess().getRule();
	}
	
	//SubExpressionConstraint returns ExpressionConstraint:
	//    ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf | AncestorOrSelfOf | Top | Bottom | EclFocusConcept;
	public SubExpressionConstraintElements getSubExpressionConstraintAccess() {
		return pSubExpressionConstraint;
	}
	
	public ParserRule getSubExpressionConstraintRule() {
		return getSubExpressionConstraintAccess().getRule();
	}
	
	//EclFocusConcept returns ExpressionConstraint:
	//    MemberOf | EclConceptReference | Any | AlternateIdentifier | NestedExpression;
	public EclFocusConceptElements getEclFocusConceptAccess() {
		return pEclFocusConcept;
	}
	
	public ParserRule getEclFocusConceptRule() {
		return getEclFocusConceptAccess().getRule();
	}
	
	//ChildOf:
	//    LT_EM constraint=EclFocusConcept;
	public ChildOfElements getChildOfAccess() {
		return pChildOf;
	}
	
	public ParserRule getChildOfRule() {
		return getChildOfAccess().getRule();
	}
	
	//ChildOrSelfOf:
	//    DBL_LT_EM constraint=EclFocusConcept;
	public ChildOrSelfOfElements getChildOrSelfOfAccess() {
		return pChildOrSelfOf;
	}
	
	public ParserRule getChildOrSelfOfRule() {
		return getChildOrSelfOfAccess().getRule();
	}
	
	//DescendantOf:
	//    LT constraint=EclFocusConcept;
	public DescendantOfElements getDescendantOfAccess() {
		return pDescendantOf;
	}
	
	public ParserRule getDescendantOfRule() {
		return getDescendantOfAccess().getRule();
	}
	
	//DescendantOrSelfOf:
	//    DBL_LT constraint=EclFocusConcept;
	public DescendantOrSelfOfElements getDescendantOrSelfOfAccess() {
		return pDescendantOrSelfOf;
	}
	
	public ParserRule getDescendantOrSelfOfRule() {
		return getDescendantOrSelfOfAccess().getRule();
	}
	
	//ParentOf:
	//    GT_EM constraint=EclFocusConcept;
	public ParentOfElements getParentOfAccess() {
		return pParentOf;
	}
	
	public ParserRule getParentOfRule() {
		return getParentOfAccess().getRule();
	}
	
	//ParentOrSelfOf:
	//    DBL_GT_EM constraint=EclFocusConcept;
	public ParentOrSelfOfElements getParentOrSelfOfAccess() {
		return pParentOrSelfOf;
	}
	
	public ParserRule getParentOrSelfOfRule() {
		return getParentOrSelfOfAccess().getRule();
	}
	
	//AncestorOf:
	//    GT constraint=EclFocusConcept;
	public AncestorOfElements getAncestorOfAccess() {
		return pAncestorOf;
	}
	
	public ParserRule getAncestorOfRule() {
		return getAncestorOfAccess().getRule();
	}
	
	//AncestorOrSelfOf:
	//    DBL_GT constraint=EclFocusConcept;
	public AncestorOrSelfOfElements getAncestorOrSelfOfAccess() {
		return pAncestorOrSelfOf;
	}
	
	public ParserRule getAncestorOrSelfOfRule() {
		return getAncestorOrSelfOfAccess().getRule();
	}
	
	//Top:
	//    DBL_EM_GT constraint=EclFocusConcept;
	public TopElements getTopAccess() {
		return pTop;
	}
	
	public ParserRule getTopRule() {
		return getTopAccess().getRule();
	}
	
	//Bottom:
	//    DBL_EM_LT constraint=EclFocusConcept;
	public BottomElements getBottomAccess() {
		return pBottom;
	}
	
	public ParserRule getBottomRule() {
		return getBottomAccess().getRule();
	}
	
	//MemberOf:
	//    CARET (SQUARE_OPEN (refsetFields+=UnquotedString (COMMA refsetFields+=UnquotedString)*) SQUARE_CLOSE)? constraint=(EclConceptReference | Any | NestedExpression);
	public MemberOfElements getMemberOfAccess() {
		return pMemberOf;
	}
	
	public ParserRule getMemberOfRule() {
		return getMemberOfAccess().getRule();
	}
	
	//EclConceptReference:
	//    id=Identifier WS* (term=PIPE_DELIMITED_STRING)?;
	public EclConceptReferenceElements getEclConceptReferenceAccess() {
		return pEclConceptReference;
	}
	
	public ParserRule getEclConceptReferenceRule() {
		return getEclConceptReferenceAccess().getRule();
	}
	
	//AlternateIdentifier:
	//    scheme=AlternateScheme HASH code=(AlternateCode | STRING) WS* (term=PIPE_DELIMITED_STRING)?;
	public AlternateIdentifierElements getAlternateIdentifierAccess() {
		return pAlternateIdentifier;
	}
	
	public ParserRule getAlternateIdentifierRule() {
		return getAlternateIdentifierAccess().getRule();
	}
	
	//EclConceptReferenceSet:
	//    ROUND_OPEN (concepts+=EclConceptReference)+ ROUND_CLOSE;
	public EclConceptReferenceSetElements getEclConceptReferenceSetAccess() {
		return pEclConceptReferenceSet;
	}
	
	public ParserRule getEclConceptReferenceSetRule() {
		return getEclConceptReferenceSetAccess().getRule();
	}
	
	//Any:
	//    WILDCARD {Any};
	public AnyElements getAnyAccess() {
		return pAny;
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}
	
	//EclRefinement:
	//    OrRefinement;
	public EclRefinementElements getEclRefinementAccess() {
		return pEclRefinement;
	}
	
	public ParserRule getEclRefinementRule() {
		return getEclRefinementAccess().getRule();
	}
	
	//OrRefinement returns EclRefinement:
	//    AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*;
	public OrRefinementElements getOrRefinementAccess() {
		return pOrRefinement;
	}
	
	public ParserRule getOrRefinementRule() {
		return getOrRefinementAccess().getRule();
	}
	
	//AndRefinement returns EclRefinement:
	//    SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*;
	public AndRefinementElements getAndRefinementAccess() {
		return pAndRefinement;
	}
	
	public ParserRule getAndRefinementRule() {
		return getAndRefinementAccess().getRule();
	}
	
	//SubRefinement returns EclRefinement:
	//    AttributeConstraint | EclAttributeGroup | NestedRefinement;
	public SubRefinementElements getSubRefinementAccess() {
		return pSubRefinement;
	}
	
	public ParserRule getSubRefinementRule() {
		return getSubRefinementAccess().getRule();
	}
	
	//NestedRefinement:
	//    ROUND_OPEN nested=EclRefinement ROUND_CLOSE;
	public NestedRefinementElements getNestedRefinementAccess() {
		return pNestedRefinement;
	}
	
	public ParserRule getNestedRefinementRule() {
		return getNestedRefinementAccess().getRule();
	}
	
	//EclAttributeGroup:
	//    (cardinality=Cardinality)? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE;
	public EclAttributeGroupElements getEclAttributeGroupAccess() {
		return pEclAttributeGroup;
	}
	
	public ParserRule getEclAttributeGroupRule() {
		return getEclAttributeGroupAccess().getRule();
	}
	
	//EclAttributeSet returns EclRefinement:
	//    OrAttributeSet;
	public EclAttributeSetElements getEclAttributeSetAccess() {
		return pEclAttributeSet;
	}
	
	public ParserRule getEclAttributeSetRule() {
		return getEclAttributeSetAccess().getRule();
	}
	
	//OrAttributeSet returns EclRefinement:
	//    AndAttributeSet ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*;
	public OrAttributeSetElements getOrAttributeSetAccess() {
		return pOrAttributeSet;
	}
	
	public ParserRule getOrAttributeSetRule() {
		return getOrAttributeSetAccess().getRule();
	}
	
	//AndAttributeSet returns EclRefinement:
	//    SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*;
	public AndAttributeSetElements getAndAttributeSetAccess() {
		return pAndAttributeSet;
	}
	
	public ParserRule getAndAttributeSetRule() {
		return getAndAttributeSetAccess().getRule();
	}
	
	//SubAttributeSet returns EclRefinement:
	//    AttributeConstraint | NestedAttributeSet;
	public SubAttributeSetElements getSubAttributeSetAccess() {
		return pSubAttributeSet;
	}
	
	public ParserRule getSubAttributeSetRule() {
		return getSubAttributeSetAccess().getRule();
	}
	
	//NestedAttributeSet returns NestedRefinement:
	//    ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE;
	public NestedAttributeSetElements getNestedAttributeSetAccess() {
		return pNestedAttributeSet;
	}
	
	public ParserRule getNestedAttributeSetRule() {
		return getNestedAttributeSetAccess().getRule();
	}
	
	//AttributeConstraint:
	//    (cardinality=Cardinality)? (reversed?=REVERSED)? attribute=FilteredExpressionConstraint (comparison=Comparison)?;
	public AttributeConstraintElements getAttributeConstraintAccess() {
		return pAttributeConstraint;
	}
	
	public ParserRule getAttributeConstraintRule() {
		return getAttributeConstraintAccess().getRule();
	}
	
	//Cardinality:
	//    SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE;
	public CardinalityElements getCardinalityAccess() {
		return pCardinality;
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//Comparison:
	//    AttributeComparison | DataTypeComparison;
	public ComparisonElements getComparisonAccess() {
		return pComparison;
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//AttributeComparison:
	//    op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint;
	public AttributeComparisonElements getAttributeComparisonAccess() {
		return pAttributeComparison;
	}
	
	public ParserRule getAttributeComparisonRule() {
		return getAttributeComparisonAccess().getRule();
	}
	
	//DataTypeComparison:
	//    BooleanValueComparison
	//    | StringValueComparison
	//    | IntegerValueComparison
	//    | DecimalValueComparison;
	public DataTypeComparisonElements getDataTypeComparisonAccess() {
		return pDataTypeComparison;
	}
	
	public ParserRule getDataTypeComparisonRule() {
		return getDataTypeComparisonAccess().getRule();
	}
	
	//BooleanValueComparison:
	//    op=NON_NUMERIC_OPERATOR value=Boolean;
	public BooleanValueComparisonElements getBooleanValueComparisonAccess() {
		return pBooleanValueComparison;
	}
	
	public ParserRule getBooleanValueComparisonRule() {
		return getBooleanValueComparisonAccess().getRule();
	}
	
	//StringValueComparison:
	//    op=NON_NUMERIC_OPERATOR value=SearchTerm;
	public StringValueComparisonElements getStringValueComparisonAccess() {
		return pStringValueComparison;
	}
	
	public ParserRule getStringValueComparisonRule() {
		return getStringValueComparisonAccess().getRule();
	}
	
	//IntegerValueComparison:
	//    op=NUMERIC_OPERATOR HASH value=Integer;
	public IntegerValueComparisonElements getIntegerValueComparisonAccess() {
		return pIntegerValueComparison;
	}
	
	public ParserRule getIntegerValueComparisonRule() {
		return getIntegerValueComparisonAccess().getRule();
	}
	
	//DecimalValueComparison:
	//    op=NUMERIC_OPERATOR HASH value=Decimal;
	public DecimalValueComparisonElements getDecimalValueComparisonAccess() {
		return pDecimalValueComparison;
	}
	
	public ParserRule getDecimalValueComparisonRule() {
		return getDecimalValueComparisonAccess().getRule();
	}
	
	//NestedExpression:
	//    ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE;
	public NestedExpressionElements getNestedExpressionAccess() {
		return pNestedExpression;
	}
	
	public ParserRule getNestedExpressionRule() {
		return getNestedExpressionAccess().getRule();
	}
	
	//// filters
	//// Single-letter filter domains are new in ECL 1.6
	//FilterConstraint:
	//    DOUBLE_CURLY_OPEN (domain=SHORT_DOMAIN)? filter=Filter DOUBLE_CURLY_CLOSE;
	public FilterConstraintElements getFilterConstraintAccess() {
		return pFilterConstraint;
	}
	
	public ParserRule getFilterConstraintRule() {
		return getFilterConstraintAccess().getRule();
	}
	
	//Filter:
	//    DisjunctionFilter;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//// Conjunction (OR) of filters is an extension to ECL 1.6
	//DisjunctionFilter returns Filter:
	//    ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*;
	public DisjunctionFilterElements getDisjunctionFilterAccess() {
		return pDisjunctionFilter;
	}
	
	public ParserRule getDisjunctionFilterRule() {
		return getDisjunctionFilterAccess().getRule();
	}
	
	//// Using the "AND" keyword for filter disjunction is an extension to ECL 1.6
	//ConjunctionFilter returns Filter:
	//    PropertyFilter ({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*;
	public ConjunctionFilterElements getConjunctionFilterAccess() {
		return pConjunctionFilter;
	}
	
	public ParserRule getConjunctionFilterRule() {
		return getConjunctionFilterAccess().getRule();
	}
	
	//NestedFilter:
	//    ROUND_OPEN nested=Filter ROUND_CLOSE;
	public NestedFilterElements getNestedFilterAccess() {
		return pNestedFilter;
	}
	
	public ParserRule getNestedFilterRule() {
		return getNestedFilterAccess().getRule();
	}
	
	//PropertyFilter:
	//    // Description filters in ECL 1.6
	//    TermFilter
	//    | LanguageFilter
	//    | TypeFilter
	//    | DialectFilter
	//    // Description filters in ECL 2.1
	//    | IdFilter
	//    // Concept filters in ECL 1.6
	//    | DefinitionStatusFilter
	//    // Concept (Description and Member) filters in ECL 1.6, component filters in QL 0.1 (extension)
	//    | ModuleFilter
	//    | EffectiveTimeFilter
	//    | ActiveFilter
	//    // Component filters in QL 0.1 (extension)
	//    | SemanticTagFilter
	//    // Description filters in QL 0.1 (extension)
	//    | PreferredInFilter
	//    | AcceptableInFilter
	//    | LanguageRefSetFilter
	//    | CaseSignificanceFilter
	//    // Member filters in ECL 2.0
	//    // XXX this should be the last filter due to the UnquotedString refsetFieldName rule
	//    | MemberFieldFilter
	//    // Allows grouping filters for boolean operators
	//    | NestedFilter;
	public PropertyFilterElements getPropertyFilterAccess() {
		return pPropertyFilter;
	}
	
	public ParserRule getPropertyFilterRule() {
		return getPropertyFilterAccess().getRule();
	}
	
	//MemberFieldFilter:
	//    refsetFieldName=UnquotedString comparison=Comparison;
	public MemberFieldFilterElements getMemberFieldFilterAccess() {
		return pMemberFieldFilter;
	}
	
	public ParserRule getMemberFieldFilterRule() {
		return getMemberFieldFilterAccess().getRule();
	}
	
	//IdFilter:
	//    ID_KEYWORD op=NON_NUMERIC_OPERATOR (ids+=Identifier | ROUND_OPEN (ids+=Identifier)+ ROUND_CLOSE);
	public IdFilterElements getIdFilterAccess() {
		return pIdFilter;
	}
	
	public ParserRule getIdFilterRule() {
		return getIdFilterAccess().getRule();
	}
	
	//TermFilter:
	//    TERM_KEYWORD op=NON_NUMERIC_OPERATOR searchTerm=SearchTerm;
	public TermFilterElements getTermFilterAccess() {
		return pTermFilter;
	}
	
	public ParserRule getTermFilterRule() {
		return getTermFilterAccess().getRule();
	}
	
	//// no special treatment for the term filter STRING, we allow everything for any lexical search type
	//SearchTerm:
	//    TypedSearchTerm | TypedSearchTermSet;
	public SearchTermElements getSearchTermAccess() {
		return pSearchTerm;
	}
	
	public ParserRule getSearchTermRule() {
		return getSearchTermAccess().getRule();
	}
	
	//TypedSearchTerm:
	//    clause=TypedSearchTermClause;
	public TypedSearchTermElements getTypedSearchTermAccess() {
		return pTypedSearchTerm;
	}
	
	public ParserRule getTypedSearchTermRule() {
		return getTypedSearchTermAccess().getRule();
	}
	
	//TypedSearchTermSet:
	//    ROUND_OPEN (clauses+=TypedSearchTermClause)+ ROUND_CLOSE;
	public TypedSearchTermSetElements getTypedSearchTermSetAccess() {
		return pTypedSearchTermSet;
	}
	
	public ParserRule getTypedSearchTermSetRule() {
		return getTypedSearchTermSetAccess().getRule();
	}
	
	//TypedSearchTermClause
	//    : (lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING
	//    | lexicalSearchType=REGEX_KEYWORD COLON term=RegularExpression
	//    ;
	public TypedSearchTermClauseElements getTypedSearchTermClauseAccess() {
		return pTypedSearchTermClause;
	}
	
	public ParserRule getTypedSearchTermClauseRule() {
		return getTypedSearchTermClauseAccess().getRule();
	}
	
	//// Regular expression syntax checking is left to the value converter implementation
	//RegularExpression:
	//    STRING;
	public RegularExpressionElements getRegularExpressionAccess() {
		return pRegularExpression;
	}
	
	public ParserRule getRegularExpressionRule() {
		return getRegularExpressionAccess().getRule();
	}
	
	//LanguageFilter:
	//    LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN (languageCodes+=UnquotedString)+ ROUND_CLOSE);
	public LanguageFilterElements getLanguageFilterAccess() {
		return pLanguageFilter;
	}
	
	public ParserRule getLanguageFilterRule() {
		return getLanguageFilterAccess().getRule();
	}
	
	//TypeFilter:
	//    TypeIdFilter | TypeTokenFilter;
	public TypeFilterElements getTypeFilterAccess() {
		return pTypeFilter;
	}
	
	public ParserRule getTypeFilterRule() {
		return getTypeFilterAccess().getRule();
	}
	
	//TypeIdFilter:
	//    TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=FilterValue;
	public TypeIdFilterElements getTypeIdFilterAccess() {
		return pTypeIdFilter;
	}
	
	public ParserRule getTypeIdFilterRule() {
		return getTypeIdFilterAccess().getRule();
	}
	
	//// Any unquoted string is allowed as a type token here, validator will restrict it
	//// to the available set ("fsn"/"syn"/"def", case insensitive)
	//TypeTokenFilter:
	//    TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN (tokens+=UnquotedString)+ ROUND_CLOSE);
	public TypeTokenFilterElements getTypeTokenFilterAccess() {
		return pTypeTokenFilter;
	}
	
	public ParserRule getTypeTokenFilterRule() {
		return getTypeTokenFilterAccess().getRule();
	}
	
	//DialectFilter:
	//     DialectIdFilter | DialectAliasFilter;
	public DialectFilterElements getDialectFilterAccess() {
		return pDialectFilter;
	}
	
	public ParserRule getDialectFilterRule() {
		return getDialectFilterAccess().getRule();
	}
	
	//DialectIdFilter:
	//    DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN (dialects+=Dialect)+ ROUND_CLOSE);
	public DialectIdFilterElements getDialectIdFilterAccess() {
		return pDialectIdFilter;
	}
	
	public ParserRule getDialectIdFilterRule() {
		return getDialectIdFilterAccess().getRule();
	}
	
	//DialectAliasFilter:
	//    DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN (dialects+=DialectAlias)+ ROUND_CLOSE);
	public DialectAliasFilterElements getDialectAliasFilterAccess() {
		return pDialectAliasFilter;
	}
	
	public ParserRule getDialectAliasFilterRule() {
		return getDialectAliasFilterAccess().getRule();
	}
	
	//// We will allow filtered expressions within the round parentheses, not simple concept references (extension to ECL 1.6)
	//Dialect:
	//    languageRefSetId=FilteredExpressionConstraint (acceptability=Acceptability)?;
	public DialectElements getDialectAccess() {
		return pDialect;
	}
	
	public ParserRule getDialectRule() {
		return getDialectAccess().getRule();
	}
	
	//// Whitespace is significant (indicates an unquoted string boundary) in this rule, so WS tokens can not be hidden
	//DialectAlias:
	//    alias=DialectAliasValue (acceptability=Acceptability)?;
	public DialectAliasElements getDialectAliasAccess() {
		return pDialectAlias;
	}
	
	public ParserRule getDialectAliasRule() {
		return getDialectAliasAccess().getRule();
	}
	
	//// while the official specification splits this into to separate rules, in order to allow any ID to be parsed in the EclConceptReference rule, it is necessary to treat token aliases as EclConceptReferences
	//// validation will handle both the token cases (restrict it to the available set ("accept"/"prefer", case insensitive)) and SCTID cases
	//Acceptability:
	//    acceptabilities=EclConceptReferenceSet;
	public AcceptabilityElements getAcceptabilityAccess() {
		return pAcceptability;
	}
	
	public ParserRule getAcceptabilityRule() {
		return getAcceptabilityAccess().getRule();
	}
	
	//// keeping the original pre-2.0 rules commented for reference
	////Acceptability:
	////    AcceptabilityIdSet | AcceptabilityTokenSet;
	////AcceptabilityIdSet:
	////    acceptabilities=EclConceptReferenceSet;
	////AcceptabilityTokenSet:
	////    ROUND_OPEN (acceptabilities+=UnquotedString)+ ROUND_CLOSE;
	//DefinitionStatusFilter:
	//    DefinitionStatusIdFilter | DefinitionStatusTokenFilter;
	public DefinitionStatusFilterElements getDefinitionStatusFilterAccess() {
		return pDefinitionStatusFilter;
	}
	
	public ParserRule getDefinitionStatusFilterRule() {
		return getDefinitionStatusFilterAccess().getRule();
	}
	
	//DefinitionStatusIdFilter:
	//    DEFINITION_STATUS_ID_KEYWORD op=NON_NUMERIC_OPERATOR definitionStatus=FilterValue;
	public DefinitionStatusIdFilterElements getDefinitionStatusIdFilterAccess() {
		return pDefinitionStatusIdFilter;
	}
	
	public ParserRule getDefinitionStatusIdFilterRule() {
		return getDefinitionStatusIdFilterAccess().getRule();
	}
	
	//// Any unquoted string is allowed as a definition status token here, validator will restrict it
	//// to the available set ("primitive"/"defined", case insensitive)
	//DefinitionStatusTokenFilter:
	//    DEFINITION_STATUS_TOKEN_KEYWORD op=NON_NUMERIC_OPERATOR
	//    (definitionStatusTokens+=UnquotedString | ROUND_OPEN (definitionStatusTokens+=UnquotedString)+ ROUND_CLOSE);
	public DefinitionStatusTokenFilterElements getDefinitionStatusTokenFilterAccess() {
		return pDefinitionStatusTokenFilter;
	}
	
	public ParserRule getDefinitionStatusTokenFilterRule() {
		return getDefinitionStatusTokenFilterAccess().getRule();
	}
	
	//ModuleFilter:
	//    MODULEID_KEYWORD op=NON_NUMERIC_OPERATOR moduleId=FilterValue;
	public ModuleFilterElements getModuleFilterAccess() {
		return pModuleFilter;
	}
	
	public ParserRule getModuleFilterRule() {
		return getModuleFilterAccess().getRule();
	}
	
	//// Any quoted string is allowed as an effective time literal here; accepted values are:
	//// - "" (unspecified effective time in ECL 1.6)
	//// - "Unspecified" (unspecified in Snow Owl)
	//// - "yyyyMMdd" (effective time in short date format)
	//EffectiveTimeFilter:
	//    EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING;
	public EffectiveTimeFilterElements getEffectiveTimeFilterAccess() {
		return pEffectiveTimeFilter;
	}
	
	public ParserRule getEffectiveTimeFilterRule() {
		return getEffectiveTimeFilterAccess().getRule();
	}
	
	//ActiveFilter:
	//    ACTIVE_KEYWORD op=NON_NUMERIC_OPERATOR active=ActiveBoolean;
	public ActiveFilterElements getActiveFilterAccess() {
		return pActiveFilter;
	}
	
	public ParserRule getActiveFilterRule() {
		return getActiveFilterAccess().getRule();
	}
	
	//SemanticTagFilter:
	//    SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING;
	public SemanticTagFilterElements getSemanticTagFilterAccess() {
		return pSemanticTagFilter;
	}
	
	public ParserRule getSemanticTagFilterRule() {
		return getSemanticTagFilterAccess().getRule();
	}
	
	//PreferredInFilter:
	//    PREFERRED_IN_KEYWORD EQUAL languageRefSetId=FilterValue;
	public PreferredInFilterElements getPreferredInFilterAccess() {
		return pPreferredInFilter;
	}
	
	public ParserRule getPreferredInFilterRule() {
		return getPreferredInFilterAccess().getRule();
	}
	
	//AcceptableInFilter:
	//    ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=FilterValue;
	public AcceptableInFilterElements getAcceptableInFilterAccess() {
		return pAcceptableInFilter;
	}
	
	public ParserRule getAcceptableInFilterRule() {
		return getAcceptableInFilterAccess().getRule();
	}
	
	//LanguageRefSetFilter:
	//    LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=FilterValue;
	public LanguageRefSetFilterElements getLanguageRefSetFilterAccess() {
		return pLanguageRefSetFilter;
	}
	
	public ParserRule getLanguageRefSetFilterRule() {
		return getLanguageRefSetFilterAccess().getRule();
	}
	
	//CaseSignificanceFilter:
	//    CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=FilterValue;
	public CaseSignificanceFilterElements getCaseSignificanceFilterAccess() {
		return pCaseSignificanceFilter;
	}
	
	public ParserRule getCaseSignificanceFilterRule() {
		return getCaseSignificanceFilterAccess().getRule();
	}
	
	//FilterValue:
	//    FilteredExpressionConstraint | EclConceptReferenceSet;
	public FilterValueElements getFilterValueAccess() {
		return pFilterValue;
	}
	
	public ParserRule getFilterValueRule() {
		return getFilterValueAccess().getRule();
	}
	
	//// History Supplement from ECL 2.0
	//Supplement:
	//    HistorySupplement;
	public SupplementElements getSupplementAccess() {
		return pSupplement;
	}
	
	public ParserRule getSupplementRule() {
		return getSupplementAccess().getRule();
	}
	
	//HistorySupplement:
	//    DOUBLE_CURLY_OPEN PLUS HISTORY_KEYWORD {HistorySupplement} history=(HistoryProfile | NestedExpression)? DOUBLE_CURLY_CLOSE;
	public HistorySupplementElements getHistorySupplementAccess() {
		return pHistorySupplement;
	}
	
	public ParserRule getHistorySupplementRule() {
		return getHistorySupplementAccess().getRule();
	}
	
	//HistoryProfile:
	//    (DASH | UNDERSCORE) profile = HISTORY_PROFILE_TYPE;
	public HistoryProfileElements getHistoryProfileAccess() {
		return pHistoryProfile;
	}
	
	public ParserRule getHistoryProfileRule() {
		return getHistoryProfileAccess().getRule();
	}
	
	///*
	// * Datatype rules
	// */
	//Identifier returns ecore::EString hidden():
	//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
	//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH | UNDERSCORE)*;
	public IdentifierElements getIdentifierAccess() {
		return pIdentifier;
	}
	
	public ParserRule getIdentifierRule() {
		return getIdentifierAccess().getRule();
	}
	
	//// Differences from Identifier: no leading digits; underscores not allowed in any position
	//AlternateScheme returns ecore::EString hidden():
	//    (ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD)
	//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DASH)*;
	public AlternateSchemeElements getAlternateSchemeAccess() {
		return pAlternateScheme;
	}
	
	public ParserRule getAlternateSchemeRule() {
		return getAlternateSchemeAccess().getRule();
	}
	
	//// Differences from Identifier: no underscores but periods and dashes are permitted, even in leading position
	//AlternateCode returns ecore::EString hidden():
	//    (DIGIT | ALPHA | CONCEPT_SHORT_KEYWORD | DESCRIPTION_SHORT_KEYWORD | MEMBER_SHORT_KEYWORD | REVERSED | ID_KEYWORD | KEYWORD | DOT | DASH)+;
	public AlternateCodeElements getAlternateCodeAccess() {
		return pAlternateCode;
	}
	
	public ParserRule getAlternateCodeRule() {
		return getAlternateCodeAccess().getRule();
	}
	
	//NonNegativeInteger returns ecore::EInt hidden():
	//    (DIGIT)+;
	public NonNegativeIntegerElements getNonNegativeIntegerAccess() {
		return pNonNegativeInteger;
	}
	
	public ParserRule getNonNegativeIntegerRule() {
		return getNonNegativeIntegerAccess().getRule();
	}
	
	//NonNegativeDecimal returns ecore::EBigDecimal hidden():
	//    NonNegativeInteger DOT (DIGIT)*;
	public NonNegativeDecimalElements getNonNegativeDecimalAccess() {
		return pNonNegativeDecimal;
	}
	
	public ParserRule getNonNegativeDecimalRule() {
		return getNonNegativeDecimalAccess().getRule();
	}
	
	//MaxValue returns ecore::EInt:
	//    NonNegativeInteger | WILDCARD;
	public MaxValueElements getMaxValueAccess() {
		return pMaxValue;
	}
	
	public ParserRule getMaxValueRule() {
		return getMaxValueAccess().getRule();
	}
	
	//Integer returns ecore::EInt hidden():
	//    (PLUS | DASH)? NonNegativeInteger;
	public IntegerElements getIntegerAccess() {
		return pInteger;
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}
	
	//Decimal returns ecore::EBigDecimal hidden():
	//    (PLUS | DASH)? NonNegativeDecimal;
	public DecimalElements getDecimalAccess() {
		return pDecimal;
	}
	
	public ParserRule getDecimalRule() {
		return getDecimalAccess().getRule();
	}
	
	//Boolean returns ecore::EBoolean:
	//    TRUE_KEYWORD | FALSE_KEYWORD;
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//// Value converter and validation checks for allowed integers 0 and 1
	//ActiveBoolean returns ecore::EBoolean:
	//    NonNegativeInteger | Boolean;
	public ActiveBooleanElements getActiveBooleanAccess() {
		return pActiveBoolean;
	}
	
	public ParserRule getActiveBooleanRule() {
		return getActiveBooleanAccess().getRule();
	}
	
	//// Unquoted strings also need to cover any keywords caught by the lexer, earlier in the process. They are terminated by whitespace.
	//UnquotedString:
	//    HISTORY_KEYWORD
	//    | CASE_SIGNIFICANCE_ID_KEYWORD
	//    | DEFINITION_STATUS_ID_KEYWORD
	//    | DEFINITION_STATUS_TOKEN_KEYWORD
	//    | LANGUAGE_REFSET_ID_KEYWORD
	//    | EFFECTIVE_TIME_KEYWORD
	//    | ACCEPTABLE_IN_KEYWORD
	//    | PREFERRED_IN_KEYWORD
	//    | SEMANTIC_TAG_KEYWORD
	//    | DIALECTID_KEYWORD
	//    | LANGUAGE_KEYWORD
	//    | MODULEID_KEYWORD
	//    | DIALECT_KEYWORD
	//    | ACTIVE_KEYWORD
	//    | TYPEID_KEYWORD
	//    | EXCLUSION_KEYWORD
	//    | EXACT_KEYWORD
	//    | FALSE_KEYWORD
	//    | MATCH_KEYWORD
	//    | REGEX_KEYWORD
	//    | TERM_KEYWORD
	//    | TRUE_KEYWORD
	//    | TYPE_KEYWORD
	//    | WILD_KEYWORD
	//    | MIN_KEYWORD
	//    | MOD_KEYWORD
	//    | MAX_KEYWORD
	//    | CONJUNCTION_KEYWORD
	//    | DISJUNCTION_KEYWORD
	//    | ID_KEYWORD
	//    | REVERSED
	//    | MEMBER_SHORT_KEYWORD
	//    | DESCRIPTION_SHORT_KEYWORD
	//    | CONCEPT_SHORT_KEYWORD
	//    | WILDCARD
	//    | KEYWORD
	//    ;
	public UnquotedStringElements getUnquotedStringAccess() {
		return pUnquotedString;
	}
	
	public ParserRule getUnquotedStringRule() {
		return getUnquotedStringAccess().getRule();
	}
	
	//DialectAliasValue hidden():
	//    (DASH | KEYWORD | DIGIT)+;
	public DialectAliasValueElements getDialectAliasValueAccess() {
		return pDialectAliasValue;
	}
	
	public ParserRule getDialectAliasValueRule() {
		return getDialectAliasValueAccess().getRule();
	}
	
	//LEXICAL_SEARCH_TYPE:
	//    // Lexical search types supported in ECL 1.5
	//    MATCH_KEYWORD
	//    | WILD_KEYWORD
	//    // Lexical search type extensions
	//    // REGEX_KEYWORD is used directly in the parser rule, as it requires a special term argument
	//    | EXACT_KEYWORD
	//    ;
	public LEXICAL_SEARCH_TYPEElements getLEXICAL_SEARCH_TYPEAccess() {
		return pLEXICAL_SEARCH_TYPE;
	}
	
	public ParserRule getLEXICAL_SEARCH_TYPERule() {
		return getLEXICAL_SEARCH_TYPEAccess().getRule();
	}
	
	//// History Supplement Profile Suffix from ECL 2.0
	//HISTORY_PROFILE_TYPE:
	//    MIN_KEYWORD
	//    | MOD_KEYWORD
	//    | MAX_KEYWORD
	//    ;
	public HISTORY_PROFILE_TYPEElements getHISTORY_PROFILE_TYPEAccess() {
		return pHISTORY_PROFILE_TYPE;
	}
	
	public ParserRule getHISTORY_PROFILE_TYPERule() {
		return getHISTORY_PROFILE_TYPEAccess().getRule();
	}
	
	//// Single-letter domains for filterConstraints is an ECL 1.6 feature
	//SHORT_DOMAIN:
	//    CONCEPT_SHORT_KEYWORD
	//    | DESCRIPTION_SHORT_KEYWORD
	//    | MEMBER_SHORT_KEYWORD // from ECL 2.0
	//    ;
	public SHORT_DOMAINElements getSHORT_DOMAINAccess() {
		return pSHORT_DOMAIN;
	}
	
	public ParserRule getSHORT_DOMAINRule() {
		return getSHORT_DOMAINAccess().getRule();
	}
	
	//NON_NUMERIC_OPERATOR:
	//    EQUAL | NOT_EQUAL;
	public NON_NUMERIC_OPERATORElements getNON_NUMERIC_OPERATORAccess() {
		return pNON_NUMERIC_OPERATOR;
	}
	
	public ParserRule getNON_NUMERIC_OPERATORRule() {
		return getNON_NUMERIC_OPERATORAccess().getRule();
	}
	
	//NUMERIC_OPERATOR:
	//    EQUAL | NOT_EQUAL | GT | LT | GTE | LTE;
	public NUMERIC_OPERATORElements getNUMERIC_OPERATORAccess() {
		return pNUMERIC_OPERATOR;
	}
	
	public ParserRule getNUMERIC_OPERATORRule() {
		return getNUMERIC_OPERATORAccess().getRule();
	}
	
	///*
	// * Terminal rules (note that the order of definition matters when an
	// * ambiguity is encountered during lexical analysis)
	// *
	// * Each rule includes a recommended form that is used for content assist
	// * purposes. ANTLR warnings saying that the case-insensitive alternative
	// * can also match the same input are to be expected.
	// */
	//terminal HISTORY_KEYWORD:
	//    'HISTORY' | ('h'|'H')('i'|'I')('s'|'S')('t'|'T')('o'|'O')('r'|'R')('y'|'Y');
	public TerminalRule getHISTORY_KEYWORDRule() {
		return tHISTORY_KEYWORD;
	}
	
	//terminal CASE_SIGNIFICANCE_ID_KEYWORD:
	//    'caseSignificanceId' | ('C'|'c')('A'|'a')('S'|'s')('E'|'e')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('N'|'n')('C'|'c')('E'|'e')('I'|'i')('D'|'d');
	public TerminalRule getCASE_SIGNIFICANCE_ID_KEYWORDRule() {
		return tCASE_SIGNIFICANCE_ID_KEYWORD;
	}
	
	//terminal DEFINITION_STATUS_ID_KEYWORD:
	//    'definitionStatusId'| ('d'|'D')('e'|'E')('f'|'F')('i'|'I')('n'|'N')('i'|'I')('t'|'T')('i'|'I')('o'|'O')('n'|'N')('s'|'S')('t'|'T')('a'|'A')('t'|'T')('u'|'U')('s'|'S')('i'|'I')('d'|'D');
	public TerminalRule getDEFINITION_STATUS_ID_KEYWORDRule() {
		return tDEFINITION_STATUS_ID_KEYWORD;
	}
	
	//terminal DEFINITION_STATUS_TOKEN_KEYWORD:
	//    'definitionStatus'| ('d'|'D')('e'|'E')('f'|'F')('i'|'I')('n'|'N')('i'|'I')('t'|'T')('i'|'I')('o'|'O')('n'|'N')('s'|'S')('t'|'T')('a'|'A')('t'|'T')('u'|'U')('s'|'S');
	public TerminalRule getDEFINITION_STATUS_TOKEN_KEYWORDRule() {
		return tDEFINITION_STATUS_TOKEN_KEYWORD;
	}
	
	//terminal LANGUAGE_REFSET_ID_KEYWORD:
	//    'languageRefsetId' | ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('U'|'u')('A'|'a')('G'|'g')('E'|'e')('R'|'r')('E'|'e')('F'|'f')('S'|'s')('E'|'e')('T'|'t')('I'|'i')('D'|'d');
	public TerminalRule getLANGUAGE_REFSET_ID_KEYWORDRule() {
		return tLANGUAGE_REFSET_ID_KEYWORD;
	}
	
	//terminal EFFECTIVE_TIME_KEYWORD:
	//    'effectiveTime' | ('E'|'e')('F'|'f')('F'|'f')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('E'|'e')('T'|'t')('I'|'i')('M'|'m')('E'|'e');
	public TerminalRule getEFFECTIVE_TIME_KEYWORDRule() {
		return tEFFECTIVE_TIME_KEYWORD;
	}
	
	//terminal ACCEPTABLE_IN_KEYWORD:
	//    'acceptableIn' | ('A'|'a')('C'|'c')('C'|'c')('E'|'e')('P'|'p')('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('I'|'i')('N'|'n');
	public TerminalRule getACCEPTABLE_IN_KEYWORDRule() {
		return tACCEPTABLE_IN_KEYWORD;
	}
	
	//terminal PREFERRED_IN_KEYWORD:
	//    'preferredIn' | ('P'|'p')('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('R'|'r')('E'|'e')('D'|'d')('I'|'i')('N'|'n');
	public TerminalRule getPREFERRED_IN_KEYWORDRule() {
		return tPREFERRED_IN_KEYWORD;
	}
	
	//terminal SEMANTIC_TAG_KEYWORD:
	//    'semanticTag' | ('S'|'s')('E'|'e')('M'|'m')('A'|'a')('N'|'n')('T'|'t')('I'|'i')('C'|'c')('T'|'t')('A'|'a')('G'|'g');
	public TerminalRule getSEMANTIC_TAG_KEYWORDRule() {
		return tSEMANTIC_TAG_KEYWORD;
	}
	
	//terminal DIALECTID_KEYWORD:
	//    'dialectId' | ('D'|'d')('I'|'i')('A'|'a')('L'|'l')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('D'|'d');
	public TerminalRule getDIALECTID_KEYWORDRule() {
		return tDIALECTID_KEYWORD;
	}
	
	//terminal LANGUAGE_KEYWORD:
	//    'language' | ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('U'|'u')('A'|'a')('G'|'g')('E'|'e');
	public TerminalRule getLANGUAGE_KEYWORDRule() {
		return tLANGUAGE_KEYWORD;
	}
	
	//terminal MODULEID_KEYWORD:
	//    'moduleId' | ('M'|'m')('O'|'o')('D'|'d')('U'|'u')('L'|'l')('E'|'e')('I'|'i')('D'|'d');
	public TerminalRule getMODULEID_KEYWORDRule() {
		return tMODULEID_KEYWORD;
	}
	
	//terminal DIALECT_KEYWORD:
	//    'dialect' | ('D'|'d')('I'|'i')('A'|'a')('L'|'l')('E'|'e')('C'|'c')('T'|'t');
	public TerminalRule getDIALECT_KEYWORDRule() {
		return tDIALECT_KEYWORD;
	}
	
	//terminal ACTIVE_KEYWORD:
	//    'active' | ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('E'|'e');
	public TerminalRule getACTIVE_KEYWORDRule() {
		return tACTIVE_KEYWORD;
	}
	
	//terminal TYPEID_KEYWORD:
	//    'typeId' | ('T'|'t')('Y'|'y')('P'|'p')('E'|'e')('I'|'i')('D'|'d');
	public TerminalRule getTYPEID_KEYWORDRule() {
		return tTYPEID_KEYWORD;
	}
	
	//terminal EXCLUSION_KEYWORD:
	//    'MINUS' | ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');
	public TerminalRule getEXCLUSION_KEYWORDRule() {
		return tEXCLUSION_KEYWORD;
	}
	
	//terminal EXACT_KEYWORD:
	//    'exact' | ('E'|'e')('X'|'x')('A'|'a')('C'|'c')('T'|'t');
	public TerminalRule getEXACT_KEYWORDRule() {
		return tEXACT_KEYWORD;
	}
	
	//terminal FALSE_KEYWORD:
	//    'false' | ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');
	public TerminalRule getFALSE_KEYWORDRule() {
		return tFALSE_KEYWORD;
	}
	
	//terminal MATCH_KEYWORD:
	//    'match' | ('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h');
	public TerminalRule getMATCH_KEYWORDRule() {
		return tMATCH_KEYWORD;
	}
	
	//terminal REGEX_KEYWORD:
	//    'regex' | ('R'|'r')('E'|'e')('G'|'g')('E'|'e')('X'|'x');
	public TerminalRule getREGEX_KEYWORDRule() {
		return tREGEX_KEYWORD;
	}
	
	//terminal TERM_KEYWORD:
	//    'term' | ('T'|'t')('E'|'e')('R'|'r')('M'|'m');
	public TerminalRule getTERM_KEYWORDRule() {
		return tTERM_KEYWORD;
	}
	
	//terminal TRUE_KEYWORD:
	//    'true' | ('T'|'t')('R'|'r')('U'|'u')('E'|'e');
	public TerminalRule getTRUE_KEYWORDRule() {
		return tTRUE_KEYWORD;
	}
	
	//terminal TYPE_KEYWORD:
	//    'type' | ('T'|'t')('Y'|'y')('P'|'p')('E'|'e');
	public TerminalRule getTYPE_KEYWORDRule() {
		return tTYPE_KEYWORD;
	}
	
	//terminal WILD_KEYWORD:
	//    'wild' | ('W'|'w')('I'|'i')('L'|'l')('D'|'d');
	public TerminalRule getWILD_KEYWORDRule() {
		return tWILD_KEYWORD;
	}
	
	//terminal MIN_KEYWORD:
	//    'MIN' | ('M'|'m')('I'|'i')('N'|'n');
	public TerminalRule getMIN_KEYWORDRule() {
		return tMIN_KEYWORD;
	}
	
	//terminal MOD_KEYWORD:
	//    'MOD' | ('M'|'m')('O'|'o')('D'|'d');
	public TerminalRule getMOD_KEYWORDRule() {
		return tMOD_KEYWORD;
	}
	
	//terminal MAX_KEYWORD:
	//    'MAX' | ('M'|'m')('A'|'a')('X'|'x');
	public TerminalRule getMAX_KEYWORDRule() {
		return tMAX_KEYWORD;
	}
	
	//terminal CONJUNCTION_KEYWORD:
	//    'AND' | ('A'|'a')('N'|'n')('D'|'d');
	public TerminalRule getCONJUNCTION_KEYWORDRule() {
		return tCONJUNCTION_KEYWORD;
	}
	
	//terminal DISJUNCTION_KEYWORD:
	//    'OR' | ('O'|'o')('R'|'r');
	public TerminalRule getDISJUNCTION_KEYWORDRule() {
		return tDISJUNCTION_KEYWORD;
	}
	
	//terminal ID_KEYWORD:
	//    'ID' | ('I'|'i')('D'|'d');
	public TerminalRule getID_KEYWORDRule() {
		return tID_KEYWORD;
	}
	
	//terminal REVERSED:
	//    'R';
	public TerminalRule getREVERSEDRule() {
		return tREVERSED;
	}
	
	//terminal MEMBER_SHORT_KEYWORD:
	//    'M' | 'm';
	public TerminalRule getMEMBER_SHORT_KEYWORDRule() {
		return tMEMBER_SHORT_KEYWORD;
	}
	
	//terminal DESCRIPTION_SHORT_KEYWORD:
	//    'D' | 'd';
	public TerminalRule getDESCRIPTION_SHORT_KEYWORDRule() {
		return tDESCRIPTION_SHORT_KEYWORD;
	}
	
	//terminal CONCEPT_SHORT_KEYWORD:
	//    'C' | 'c';
	public TerminalRule getCONCEPT_SHORT_KEYWORDRule() {
		return tCONCEPT_SHORT_KEYWORD;
	}
	
	//terminal ALPHA:
	//    'a'..'z' | 'A'..'Z';
	public TerminalRule getALPHARule() {
		return tALPHA;
	}
	
	//terminal KEYWORD:
	//    ALPHA (ALPHA)+;
	public TerminalRule getKEYWORDRule() {
		return tKEYWORD;
	}
	
	//terminal DBL_LT_EM:
	//    '<<!';
	public TerminalRule getDBL_LT_EMRule() {
		return tDBL_LT_EM;
	}
	
	//terminal DBL_GT_EM:
	//    '>>!';
	public TerminalRule getDBL_GT_EMRule() {
		return tDBL_GT_EM;
	}
	
	//terminal DBL_LT:
	//    '<<';
	public TerminalRule getDBL_LTRule() {
		return tDBL_LT;
	}
	
	//terminal DBL_GT:
	//    '>>';
	public TerminalRule getDBL_GTRule() {
		return tDBL_GT;
	}
	
	//terminal LT_EM:
	//    '<!';
	public TerminalRule getLT_EMRule() {
		return tLT_EM;
	}
	
	//terminal GT_EM:
	//    '>!';
	public TerminalRule getGT_EMRule() {
		return tGT_EM;
	}
	
	//terminal DBL_EM_LT:
	//    '!!<';
	public TerminalRule getDBL_EM_LTRule() {
		return tDBL_EM_LT;
	}
	
	//terminal DBL_EM_GT:
	//    '!!>';
	public TerminalRule getDBL_EM_GTRule() {
		return tDBL_EM_GT;
	}
	
	//terminal GTE:
	//    '>=';
	public TerminalRule getGTERule() {
		return tGTE;
	}
	
	//terminal LTE:
	//    '<=';
	public TerminalRule getLTERule() {
		return tLTE;
	}
	
	//terminal DOUBLE_CURLY_OPEN:
	//    '{{';
	public TerminalRule getDOUBLE_CURLY_OPENRule() {
		return tDOUBLE_CURLY_OPEN;
	}
	
	//terminal DOUBLE_CURLY_CLOSE:
	//    '}}';
	public TerminalRule getDOUBLE_CURLY_CLOSERule() {
		return tDOUBLE_CURLY_CLOSE;
	}
	
	//terminal PIPE_DELIMITED_STRING:
	//    "|" -> "|";
	public TerminalRule getPIPE_DELIMITED_STRINGRule() {
		return tPIPE_DELIMITED_STRING;
	}
	
	//// XXX: Rule name needs to be STRING so that the default Xtext conversion service can remove quotes
	//terminal STRING:
	//    '"' ('\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\' | '"'))* '"' |
	//    "'" ('\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
	
	//terminal TO:
	//    '..';
	public TerminalRule getTORule() {
		return tTO;
	}
	
	//terminal COMMA:
	//    ',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal DIGIT:
	//    '0'..'9';
	public TerminalRule getDIGITRule() {
		return tDIGIT;
	}
	
	//terminal COLON:
	//    ':';
	public TerminalRule getCOLONRule() {
		return tCOLON;
	}
	
	//terminal CURLY_OPEN:
	//    '{';
	public TerminalRule getCURLY_OPENRule() {
		return tCURLY_OPEN;
	}
	
	//terminal CURLY_CLOSE:
	//    '}';
	public TerminalRule getCURLY_CLOSERule() {
		return tCURLY_CLOSE;
	}
	
	//terminal ROUND_OPEN:
	//    '(';
	public TerminalRule getROUND_OPENRule() {
		return tROUND_OPEN;
	}
	
	//terminal ROUND_CLOSE:
	//    ')';
	public TerminalRule getROUND_CLOSERule() {
		return tROUND_CLOSE;
	}
	
	//terminal SQUARE_OPEN:
	//    '[';
	public TerminalRule getSQUARE_OPENRule() {
		return tSQUARE_OPEN;
	}
	
	//terminal SQUARE_CLOSE:
	//    ']';
	public TerminalRule getSQUARE_CLOSERule() {
		return tSQUARE_CLOSE;
	}
	
	//terminal PLUS:
	//    '+';
	public TerminalRule getPLUSRule() {
		return tPLUS;
	}
	
	//terminal DASH:
	//    '-';
	public TerminalRule getDASHRule() {
		return tDASH;
	}
	
	//terminal UNDERSCORE:
	//    '_';
	public TerminalRule getUNDERSCORERule() {
		return tUNDERSCORE;
	}
	
	//terminal CARET:
	//    '^';
	public TerminalRule getCARETRule() {
		return tCARET;
	}
	
	//terminal DOT:
	//    '.';
	public TerminalRule getDOTRule() {
		return tDOT;
	}
	
	//terminal WILDCARD:
	//    '*';
	public TerminalRule getWILDCARDRule() {
		return tWILDCARD;
	}
	
	//terminal EQUAL:
	//    '=';
	public TerminalRule getEQUALRule() {
		return tEQUAL;
	}
	
	//terminal NOT_EQUAL:
	//    '!=';
	public TerminalRule getNOT_EQUALRule() {
		return tNOT_EQUAL;
	}
	
	//terminal LT:
	//    '<';
	public TerminalRule getLTRule() {
		return tLT;
	}
	
	//terminal GT:
	//    '>';
	public TerminalRule getGTRule() {
		return tGT;
	}
	
	//terminal HASH:
	//    '#';
	public TerminalRule getHASHRule() {
		return tHASH;
	}
	
	//terminal WS:
	//    (' ' | '\t' | '\n' | '\r');
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ML_COMMENT:
	//    '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//    '//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
}
