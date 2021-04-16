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
import org.eclipse.xtext.EnumLiteralDeclaration;
import org.eclipse.xtext.EnumRule;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
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
		//	{Script} constraint=ExpressionConstraint?;
		@Override public ParserRule getRule() { return rule; }
		
		//{Script} constraint=ExpressionConstraint?
		public Group getGroup() { return cGroup; }
		
		//{Script}
		public Action getScriptAction_0() { return cScriptAction_0; }
		
		//constraint=ExpressionConstraint?
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//ExpressionConstraint
		public RuleCall getConstraintExpressionConstraintParserRuleCall_1_0() { return cConstraintExpressionConstraintParserRuleCall_1_0; }
	}
	public class ExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
		private final RuleCall cOrExpressionConstraintParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//ExpressionConstraint:
		//	OrExpressionConstraint;
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
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrExpressionConstraint ExpressionConstraint:
		//	AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION right=AndExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION right=AndExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//AndExpressionConstraint
		public RuleCall getAndExpressionConstraintParserRuleCall_0() { return cAndExpressionConstraintParserRuleCall_0; }
		
		//({OrExpressionConstraint.left=current} DISJUNCTION right=AndExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrExpressionConstraint.left=current}
		public Action getOrExpressionConstraintLeftAction_1_0() { return cOrExpressionConstraintLeftAction_1_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_1() { return cDISJUNCTIONTerminalRuleCall_1_1; }
		
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
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExclusionExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndExpressionConstraint ExpressionConstraint:
		//	ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION | COMMA)
		//	right=ExclusionExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION | COMMA)
		//right=ExclusionExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//ExclusionExpressionConstraint
		public RuleCall getExclusionExpressionConstraintParserRuleCall_0() { return cExclusionExpressionConstraintParserRuleCall_0; }
		
		//({AndExpressionConstraint.left=current} (CONJUNCTION | COMMA) right=ExclusionExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndExpressionConstraint.left=current}
		public Action getAndExpressionConstraintLeftAction_1_0() { return cAndExpressionConstraintLeftAction_1_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_1_0() { return cCONJUNCTIONTerminalRuleCall_1_1_0; }
		
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
		private final RuleCall cEXCLUSIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightRefinedExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ExclusionExpressionConstraint ExpressionConstraint:
		//	RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION
		//	right=RefinedExpressionConstraint)?;
		@Override public ParserRule getRule() { return rule; }
		
		//RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION right=RefinedExpressionConstraint)?
		public Group getGroup() { return cGroup; }
		
		//RefinedExpressionConstraint
		public RuleCall getRefinedExpressionConstraintParserRuleCall_0() { return cRefinedExpressionConstraintParserRuleCall_0; }
		
		//({ExclusionExpressionConstraint.left=current} EXCLUSION right=RefinedExpressionConstraint)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExclusionExpressionConstraint.left=current}
		public Action getExclusionExpressionConstraintLeftAction_1_0() { return cExclusionExpressionConstraintLeftAction_1_0; }
		
		//EXCLUSION
		public RuleCall getEXCLUSIONTerminalRuleCall_1_1() { return cEXCLUSIONTerminalRuleCall_1_1; }
		
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
		
		//RefinedExpressionConstraint ExpressionConstraint:
		//	DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?;
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
		private final RuleCall cSubExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDottedExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cAttributeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cAttributeSubExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cAttributeAssignment_1_2.eContents().get(0);
		
		//DottedExpressionConstraint ExpressionConstraint:
		//	SubExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SubExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SubExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//SubExpressionConstraint
		public RuleCall getSubExpressionConstraintParserRuleCall_0() { return cSubExpressionConstraintParserRuleCall_0; }
		
		//({DottedExpressionConstraint.constraint=current} DOT attribute=SubExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DottedExpressionConstraint.constraint=current}
		public Action getDottedExpressionConstraintConstraintAction_1_0() { return cDottedExpressionConstraintConstraintAction_1_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1_1() { return cDOTTerminalRuleCall_1_1; }
		
		//attribute=SubExpressionConstraint
		public Assignment getAttributeAssignment_1_2() { return cAttributeAssignment_1_2; }
		
		//SubExpressionConstraint
		public RuleCall getAttributeSubExpressionConstraintParserRuleCall_1_2_0() { return cAttributeSubExpressionConstraintParserRuleCall_1_2_0; }
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
		private final RuleCall cEclFocusConceptParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cFilterConstraintParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		
		//SubExpressionConstraint ExpressionConstraint:
		//	ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf |
		//	AncestorOrSelfOf | EclFocusConcept | FilterConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf | AncestorOrSelfOf
		//| EclFocusConcept | FilterConstraint
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
		
		//EclFocusConcept
		public RuleCall getEclFocusConceptParserRuleCall_8() { return cEclFocusConceptParserRuleCall_8; }
		
		//FilterConstraint
		public RuleCall getFilterConstraintParserRuleCall_9() { return cFilterConstraintParserRuleCall_9; }
	}
	public class EclFocusConceptElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclFocusConcept");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMemberOfParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cEclConceptReferenceParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cAnyParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cNestedExpressionParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//EclFocusConcept ExpressionConstraint:
		//	MemberOf | EclConceptReference | Any | NestedExpression;
		@Override public ParserRule getRule() { return rule; }
		
		//MemberOf | EclConceptReference | Any | NestedExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MemberOf
		public RuleCall getMemberOfParserRuleCall_0() { return cMemberOfParserRuleCall_0; }
		
		//EclConceptReference
		public RuleCall getEclConceptReferenceParserRuleCall_1() { return cEclConceptReferenceParserRuleCall_1; }
		
		//Any
		public RuleCall getAnyParserRuleCall_2() { return cAnyParserRuleCall_2; }
		
		//NestedExpression
		public RuleCall getNestedExpressionParserRuleCall_3() { return cNestedExpressionParserRuleCall_3; }
	}
	public class ChildOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ChildOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLT_EMTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConstraintEclFocusConceptParserRuleCall_1_0 = (RuleCall)cConstraintAssignment_1.eContents().get(0);
		
		//ChildOf:
		//	LT_EM constraint=EclFocusConcept;
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
		//	DBL_LT_EM constraint=EclFocusConcept;
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
		//	LT constraint=EclFocusConcept;
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
		//	DBL_LT constraint=EclFocusConcept;
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
		//	GT_EM constraint=EclFocusConcept;
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
		//	DBL_GT_EM constraint=EclFocusConcept;
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
		//	GT constraint=EclFocusConcept;
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
		//	DBL_GT constraint=EclFocusConcept;
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
	public class MemberOfElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MemberOf");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCARETTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConstraintAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cConstraintAlternatives_1_0 = (Alternatives)cConstraintAssignment_1.eContents().get(0);
		private final RuleCall cConstraintEclConceptReferenceParserRuleCall_1_0_0 = (RuleCall)cConstraintAlternatives_1_0.eContents().get(0);
		private final RuleCall cConstraintAnyParserRuleCall_1_0_1 = (RuleCall)cConstraintAlternatives_1_0.eContents().get(1);
		private final RuleCall cConstraintNestedExpressionParserRuleCall_1_0_2 = (RuleCall)cConstraintAlternatives_1_0.eContents().get(2);
		
		//MemberOf:
		//	CARET constraint=(EclConceptReference | Any | NestedExpression);
		@Override public ParserRule getRule() { return rule; }
		
		//CARET constraint=(EclConceptReference | Any | NestedExpression)
		public Group getGroup() { return cGroup; }
		
		//CARET
		public RuleCall getCARETTerminalRuleCall_0() { return cCARETTerminalRuleCall_0; }
		
		//constraint=(EclConceptReference | Any | NestedExpression)
		public Assignment getConstraintAssignment_1() { return cConstraintAssignment_1; }
		
		//(EclConceptReference | Any | NestedExpression)
		public Alternatives getConstraintAlternatives_1_0() { return cConstraintAlternatives_1_0; }
		
		//EclConceptReference
		public RuleCall getConstraintEclConceptReferenceParserRuleCall_1_0_0() { return cConstraintEclConceptReferenceParserRuleCall_1_0_0; }
		
		//Any
		public RuleCall getConstraintAnyParserRuleCall_1_0_1() { return cConstraintAnyParserRuleCall_1_0_1; }
		
		//NestedExpression
		public RuleCall getConstraintNestedExpressionParserRuleCall_1_0_2() { return cConstraintNestedExpressionParserRuleCall_1_0_2; }
	}
	public class EclConceptReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclConceptReference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cIdSnomedIdentifierParserRuleCall_0_0 = (RuleCall)cIdAssignment_0.eContents().get(0);
		private final Assignment cTermAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cTermTERM_STRINGTerminalRuleCall_1_0 = (RuleCall)cTermAssignment_1.eContents().get(0);
		
		//EclConceptReference:
		//	id=SnomedIdentifier term=TERM_STRING?;
		@Override public ParserRule getRule() { return rule; }
		
		//id=SnomedIdentifier term=TERM_STRING?
		public Group getGroup() { return cGroup; }
		
		//id=SnomedIdentifier
		public Assignment getIdAssignment_0() { return cIdAssignment_0; }
		
		//SnomedIdentifier
		public RuleCall getIdSnomedIdentifierParserRuleCall_0_0() { return cIdSnomedIdentifierParserRuleCall_0_0; }
		
		//term=TERM_STRING?
		public Assignment getTermAssignment_1() { return cTermAssignment_1; }
		
		//TERM_STRING
		public RuleCall getTermTERM_STRINGTerminalRuleCall_1_0() { return cTermTERM_STRINGTerminalRuleCall_1_0; }
	}
	public class EclConceptReferenceSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConceptsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConceptsEclConceptReferenceParserRuleCall_1_0 = (RuleCall)cConceptsAssignment_1.eContents().get(0);
		private final Assignment cConceptsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cConceptsEclConceptReferenceParserRuleCall_2_0 = (RuleCall)cConceptsAssignment_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//EclConceptReferenceSet:
		//	ROUND_OPEN concepts+=EclConceptReference concepts+=EclConceptReference* ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN concepts+=EclConceptReference concepts+=EclConceptReference* ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//concepts+=EclConceptReference
		public Assignment getConceptsAssignment_1() { return cConceptsAssignment_1; }
		
		//EclConceptReference
		public RuleCall getConceptsEclConceptReferenceParserRuleCall_1_0() { return cConceptsEclConceptReferenceParserRuleCall_1_0; }
		
		//concepts+=EclConceptReference*
		public Assignment getConceptsAssignment_2() { return cConceptsAssignment_2; }
		
		//EclConceptReference
		public RuleCall getConceptsEclConceptReferenceParserRuleCall_2_0() { return cConceptsEclConceptReferenceParserRuleCall_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_3() { return cROUND_CLOSETerminalRuleCall_3; }
	}
	public class AnyElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Any");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cWILDCARDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Action cAnyAction_1 = (Action)cGroup.eContents().get(1);
		
		//Any:
		//	WILDCARD {Any};
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
		//	OrRefinement;
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
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_0_1 = (RuleCall)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightAndRefinementParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//OrRefinement EclRefinement:
		//	AndRefinement -> ({OrRefinement.left=current} DISJUNCTION right=AndRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndRefinement -> ({OrRefinement.left=current} DISJUNCTION right=AndRefinement)*
		public Group getGroup() { return cGroup; }
		
		//AndRefinement
		public RuleCall getAndRefinementParserRuleCall_0() { return cAndRefinementParserRuleCall_0; }
		
		//-> ({OrRefinement.left=current} DISJUNCTION right=AndRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({OrRefinement.left=current} DISJUNCTION right=AndRefinement)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{OrRefinement.left=current}
		public Action getOrRefinementLeftAction_1_0_0() { return cOrRefinementLeftAction_1_0_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_0_1() { return cDISJUNCTIONTerminalRuleCall_1_0_1; }
		
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
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_0_1_0 = (RuleCall)cAlternatives_1_0_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_0_1_1 = (RuleCall)cAlternatives_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightSubRefinementParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//AndRefinement EclRefinement:
		//	SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)*
		public Group getGroup() { return cGroup; }
		
		//SubRefinement
		public RuleCall getSubRefinementParserRuleCall_0() { return cSubRefinementParserRuleCall_0; }
		
		//-> ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{AndRefinement.left=current}
		public Action getAndRefinementLeftAction_1_0_0() { return cAndRefinementLeftAction_1_0_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_0_1() { return cAlternatives_1_0_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_0_1_0() { return cCONJUNCTIONTerminalRuleCall_1_0_1_0; }
		
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
		
		//SubRefinement EclRefinement:
		//	AttributeConstraint | EclAttributeGroup | NestedRefinement;
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
		//	ROUND_OPEN nested=EclRefinement ROUND_CLOSE;
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
		//	cardinality=Cardinality? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//cardinality=Cardinality? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE
		public Group getGroup() { return cGroup; }
		
		//cardinality=Cardinality?
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
		
		//EclAttributeSet EclRefinement:
		//	OrAttributeSet;
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
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndAttributeSetParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrAttributeSet EclRefinement:
		//	AndAttributeSet ({OrRefinement.left=current} DISJUNCTION right=AndAttributeSet)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndAttributeSet ({OrRefinement.left=current} DISJUNCTION right=AndAttributeSet)*
		public Group getGroup() { return cGroup; }
		
		//AndAttributeSet
		public RuleCall getAndAttributeSetParserRuleCall_0() { return cAndAttributeSetParserRuleCall_0; }
		
		//({OrRefinement.left=current} DISJUNCTION right=AndAttributeSet)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{OrRefinement.left=current}
		public Action getOrRefinementLeftAction_1_0() { return cOrRefinementLeftAction_1_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_1() { return cDISJUNCTIONTerminalRuleCall_1_1; }
		
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
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightSubAttributeSetParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//AndAttributeSet EclRefinement:
		//	SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubAttributeSet)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubAttributeSet)*
		public Group getGroup() { return cGroup; }
		
		//SubAttributeSet
		public RuleCall getSubAttributeSetParserRuleCall_0() { return cSubAttributeSetParserRuleCall_0; }
		
		//({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubAttributeSet)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{AndRefinement.left=current}
		public Action getAndRefinementLeftAction_1_0() { return cAndRefinementLeftAction_1_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_1_0() { return cCONJUNCTIONTerminalRuleCall_1_1_0; }
		
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
		
		//SubAttributeSet EclRefinement:
		//	AttributeConstraint | NestedAttributeSet;
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
		
		//NestedAttributeSet NestedRefinement:
		//	ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE;
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
		private final RuleCall cAttributeSubExpressionConstraintParserRuleCall_2_0 = (RuleCall)cAttributeAssignment_2.eContents().get(0);
		private final Assignment cComparisonAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComparisonComparisonParserRuleCall_3_0 = (RuleCall)cComparisonAssignment_3.eContents().get(0);
		
		//AttributeConstraint:
		//	cardinality=Cardinality? reversed?=REVERSED? attribute=SubExpressionConstraint comparison=Comparison;
		@Override public ParserRule getRule() { return rule; }
		
		//cardinality=Cardinality? reversed?=REVERSED? attribute=SubExpressionConstraint comparison=Comparison
		public Group getGroup() { return cGroup; }
		
		//cardinality=Cardinality?
		public Assignment getCardinalityAssignment_0() { return cCardinalityAssignment_0; }
		
		//Cardinality
		public RuleCall getCardinalityCardinalityParserRuleCall_0_0() { return cCardinalityCardinalityParserRuleCall_0_0; }
		
		//reversed?=REVERSED?
		public Assignment getReversedAssignment_1() { return cReversedAssignment_1; }
		
		//REVERSED
		public RuleCall getReversedREVERSEDTerminalRuleCall_1_0() { return cReversedREVERSEDTerminalRuleCall_1_0; }
		
		//attribute=SubExpressionConstraint
		public Assignment getAttributeAssignment_2() { return cAttributeAssignment_2; }
		
		//SubExpressionConstraint
		public RuleCall getAttributeSubExpressionConstraintParserRuleCall_2_0() { return cAttributeSubExpressionConstraintParserRuleCall_2_0; }
		
		//comparison=Comparison
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
		//	SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE;
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
		//	AttributeComparison | DataTypeComparison;
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
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSubExpressionConstraintParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//AttributeComparison:
		//	op=(EQUAL | NOT_EQUAL) value=SubExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL) value=SubExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//value=SubExpressionConstraint
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//SubExpressionConstraint
		public RuleCall getValueSubExpressionConstraintParserRuleCall_1_0() { return cValueSubExpressionConstraintParserRuleCall_1_0; }
	}
	public class DataTypeComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DataTypeComparison");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cBooleanValueComparisonParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cStringValueComparisonParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cIntegerValueComparisonParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDecimalValueComparisonParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//DataTypeComparison:
		//	BooleanValueComparison
		//	| StringValueComparison
		//	| IntegerValueComparison
		//	| DecimalValueComparison;
		@Override public ParserRule getRule() { return rule; }
		
		//BooleanValueComparison | StringValueComparison | IntegerValueComparison | DecimalValueComparison
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
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueBooleanParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//BooleanValueComparison:
		//	op=(EQUAL | NOT_EQUAL) value=Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL) value=Boolean
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//value=Boolean
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//Boolean
		public RuleCall getValueBooleanParserRuleCall_1_0() { return cValueBooleanParserRuleCall_1_0; }
	}
	public class StringValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.StringValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//StringValueComparison:
		//	op=(EQUAL | NOT_EQUAL) value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL) value=STRING
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
	}
	public class IntegerValueComparisonElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.IntegerValueComparison");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final RuleCall cOpGTTerminalRuleCall_0_0_2 = (RuleCall)cOpAlternatives_0_0.eContents().get(2);
		private final RuleCall cOpLTTerminalRuleCall_0_0_3 = (RuleCall)cOpAlternatives_0_0.eContents().get(3);
		private final RuleCall cOpGTETerminalRuleCall_0_0_4 = (RuleCall)cOpAlternatives_0_0.eContents().get(4);
		private final RuleCall cOpLTETerminalRuleCall_0_0_5 = (RuleCall)cOpAlternatives_0_0.eContents().get(5);
		private final RuleCall cHASHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueIntegerParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//IntegerValueComparison:
		//	op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Integer;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Integer
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//GT
		public RuleCall getOpGTTerminalRuleCall_0_0_2() { return cOpGTTerminalRuleCall_0_0_2; }
		
		//LT
		public RuleCall getOpLTTerminalRuleCall_0_0_3() { return cOpLTTerminalRuleCall_0_0_3; }
		
		//GTE
		public RuleCall getOpGTETerminalRuleCall_0_0_4() { return cOpGTETerminalRuleCall_0_0_4; }
		
		//LTE
		public RuleCall getOpLTETerminalRuleCall_0_0_5() { return cOpLTETerminalRuleCall_0_0_5; }
		
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
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final RuleCall cOpGTTerminalRuleCall_0_0_2 = (RuleCall)cOpAlternatives_0_0.eContents().get(2);
		private final RuleCall cOpLTTerminalRuleCall_0_0_3 = (RuleCall)cOpAlternatives_0_0.eContents().get(3);
		private final RuleCall cOpGTETerminalRuleCall_0_0_4 = (RuleCall)cOpAlternatives_0_0.eContents().get(4);
		private final RuleCall cOpLTETerminalRuleCall_0_0_5 = (RuleCall)cOpAlternatives_0_0.eContents().get(5);
		private final RuleCall cHASHTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cValueAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cValueDecimalParserRuleCall_2_0 = (RuleCall)cValueAssignment_2.eContents().get(0);
		
		//DecimalValueComparison:
		//	op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Decimal;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Decimal
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//GT
		public RuleCall getOpGTTerminalRuleCall_0_0_2() { return cOpGTTerminalRuleCall_0_0_2; }
		
		//LT
		public RuleCall getOpLTTerminalRuleCall_0_0_3() { return cOpLTTerminalRuleCall_0_0_3; }
		
		//GTE
		public RuleCall getOpGTETerminalRuleCall_0_0_4() { return cOpGTETerminalRuleCall_0_0_4; }
		
		//LTE
		public RuleCall getOpLTETerminalRuleCall_0_0_5() { return cOpLTETerminalRuleCall_0_0_5; }
		
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
		//	ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE;
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
		private final RuleCall cFilterParserRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cDOUBLE_CURLY_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//// filters
		//FilterConstraint:
		//	DOUBLE_CURLY_OPEN Filter DOUBLE_CURLY_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//DOUBLE_CURLY_OPEN Filter DOUBLE_CURLY_CLOSE
		public Group getGroup() { return cGroup; }
		
		//DOUBLE_CURLY_OPEN
		public RuleCall getDOUBLE_CURLY_OPENTerminalRuleCall_0() { return cDOUBLE_CURLY_OPENTerminalRuleCall_0; }
		
		//Filter
		public RuleCall getFilterParserRuleCall_1() { return cFilterParserRuleCall_1; }
		
		//DOUBLE_CURLY_CLOSE
		public RuleCall getDOUBLE_CURLY_CLOSETerminalRuleCall_2() { return cDOUBLE_CURLY_CLOSETerminalRuleCall_2; }
	}
	public class FilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Filter");
		private final RuleCall cDisjunctionFilterParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Filter:
		//	DisjunctionFilter;
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
		private final RuleCall cDISJUNCTIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightConjunctionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//DisjunctionFilter Filter:
		//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*
		public Group getGroup() { return cGroup; }
		
		//ConjunctionFilter
		public RuleCall getConjunctionFilterParserRuleCall_0() { return cConjunctionFilterParserRuleCall_0; }
		
		//({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DisjunctionFilter.left=current}
		public Action getDisjunctionFilterLeftAction_1_0() { return cDisjunctionFilterLeftAction_1_0; }
		
		//DISJUNCTION
		public RuleCall getDISJUNCTIONTerminalRuleCall_1_1() { return cDISJUNCTIONTerminalRuleCall_1_1; }
		
		//right=ConjunctionFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ConjunctionFilter
		public RuleCall getRightConjunctionFilterParserRuleCall_1_2_0() { return cRightConjunctionFilterParserRuleCall_1_2_0; }
	}
	public class ConjunctionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cExclusionFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cConjunctionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cCONJUNCTIONTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cCOMMATerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightExclusionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ConjunctionFilter Filter:
		//	ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*
		public Group getGroup() { return cGroup; }
		
		//ExclusionFilter
		public RuleCall getExclusionFilterParserRuleCall_0() { return cExclusionFilterParserRuleCall_0; }
		
		//({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{ConjunctionFilter.left=current}
		public Action getConjunctionFilterLeftAction_1_0() { return cConjunctionFilterLeftAction_1_0; }
		
		//(CONJUNCTION | COMMA)
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//CONJUNCTION
		public RuleCall getCONJUNCTIONTerminalRuleCall_1_1_0() { return cCONJUNCTIONTerminalRuleCall_1_1_0; }
		
		//COMMA
		public RuleCall getCOMMATerminalRuleCall_1_1_1() { return cCOMMATerminalRuleCall_1_1_1; }
		
		//right=ExclusionFilter
		public Assignment getRightAssignment_1_2() { return cRightAssignment_1_2; }
		
		//ExclusionFilter
		public RuleCall getRightExclusionFilterParserRuleCall_1_2_0() { return cRightExclusionFilterParserRuleCall_1_2_0; }
	}
	public class ExclusionFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ExclusionFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPropertyFilterParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cExclusionFilterLeftAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cEXCLUSIONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightPropertyFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//ExclusionFilter Filter:
		//	PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?;
		@Override public ParserRule getRule() { return rule; }
		
		//PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?
		public Group getGroup() { return cGroup; }
		
		//PropertyFilter
		public RuleCall getPropertyFilterParserRuleCall_0() { return cPropertyFilterParserRuleCall_0; }
		
		//({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?
		public Group getGroup_1() { return cGroup_1; }
		
		//{ExclusionFilter.left=current}
		public Action getExclusionFilterLeftAction_1_0() { return cExclusionFilterLeftAction_1_0; }
		
		//EXCLUSION
		public RuleCall getEXCLUSIONTerminalRuleCall_1_1() { return cEXCLUSIONTerminalRuleCall_1_1; }
		
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
		//	ROUND_OPEN nested=Filter ROUND_CLOSE;
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
		private final RuleCall cLanguageCodeFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTypeFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDialectFilterParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cNestedFilterParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		
		//PropertyFilter:
		//	TermFilter | LanguageCodeFilter | TypeFilter | DialectFilter | NestedFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//TermFilter | LanguageCodeFilter | TypeFilter | DialectFilter | NestedFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TermFilter
		public RuleCall getTermFilterParserRuleCall_0() { return cTermFilterParserRuleCall_0; }
		
		//LanguageCodeFilter
		public RuleCall getLanguageCodeFilterParserRuleCall_1() { return cLanguageCodeFilterParserRuleCall_1; }
		
		//TypeFilter
		public RuleCall getTypeFilterParserRuleCall_2() { return cTypeFilterParserRuleCall_2; }
		
		//DialectFilter
		public RuleCall getDialectFilterParserRuleCall_3() { return cDialectFilterParserRuleCall_3; }
		
		//NestedFilter
		public RuleCall getNestedFilterParserRuleCall_4() { return cNestedFilterParserRuleCall_4; }
	}
	public class TermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTERM_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cTypedTermFilterParserRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cTypedTermFilterSetParserRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		
		//TermFilter:
		//	TERM_KEYWORD (TypedTermFilter | TypedTermFilterSet);
		@Override public ParserRule getRule() { return rule; }
		
		//TERM_KEYWORD (TypedTermFilter | TypedTermFilterSet)
		public Group getGroup() { return cGroup; }
		
		//TERM_KEYWORD
		public RuleCall getTERM_KEYWORDTerminalRuleCall_0() { return cTERM_KEYWORDTerminalRuleCall_0; }
		
		//(TypedTermFilter | TypedTermFilterSet)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//TypedTermFilter
		public RuleCall getTypedTermFilterParserRuleCall_1_0() { return cTypedTermFilterParserRuleCall_1_0; }
		
		//TypedTermFilterSet
		public RuleCall getTypedTermFilterSetParserRuleCall_1_1() { return cTypedTermFilterSetParserRuleCall_1_1; }
	}
	public class TypedTermFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypedTermFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cLexicalSearchTypeAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cLexicalSearchTypeLexicalSearchTypeEnumRuleCall_1_0_0 = (RuleCall)cLexicalSearchTypeAssignment_1_0.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cTermAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermSTRINGTerminalRuleCall_2_0 = (RuleCall)cTermAssignment_2.eContents().get(0);
		
		//TypedTermFilter:
		//	op=(EQUAL | NOT_EQUAL) (lexicalSearchType=LexicalSearchType COLON)? term=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL) (lexicalSearchType=LexicalSearchType COLON)? term=STRING
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//(lexicalSearchType=LexicalSearchType COLON)?
		public Group getGroup_1() { return cGroup_1; }
		
		//lexicalSearchType=LexicalSearchType
		public Assignment getLexicalSearchTypeAssignment_1_0() { return cLexicalSearchTypeAssignment_1_0; }
		
		//LexicalSearchType
		public RuleCall getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_1_0_0() { return cLexicalSearchTypeLexicalSearchTypeEnumRuleCall_1_0_0; }
		
		//COLON
		public RuleCall getCOLONTerminalRuleCall_1_1() { return cCOLONTerminalRuleCall_1_1; }
		
		//term=STRING
		public Assignment getTermAssignment_2() { return cTermAssignment_2; }
		
		//STRING
		public RuleCall getTermSTRINGTerminalRuleCall_2_0() { return cTermSTRINGTerminalRuleCall_2_0; }
	}
	public class TypedTermFilterSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypedTermFilterSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cOpAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final Alternatives cOpAlternatives_0_0 = (Alternatives)cOpAssignment_0.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_0_0_0 = (RuleCall)cOpAlternatives_0_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_0_0_1 = (RuleCall)cOpAlternatives_0_0.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsTypedTermFilterParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final Assignment cTermsAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cTermsTypedTermFilterParserRuleCall_3_0 = (RuleCall)cTermsAssignment_3.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_4 = (RuleCall)cGroup.eContents().get(4);
		
		//// no special treatment for the term filter STRING, we allow everything for any lexical search type
		//TypedTermFilterSet:
		//	op=(EQUAL | NOT_EQUAL) ROUND_OPEN terms+=TypedTermFilter terms+=TypedTermFilter* ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//op=(EQUAL | NOT_EQUAL) ROUND_OPEN terms+=TypedTermFilter terms+=TypedTermFilter* ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_0_0() { return cOpAlternatives_0_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_0_0_0() { return cOpEQUALTerminalRuleCall_0_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_0_0_1() { return cOpNOT_EQUALTerminalRuleCall_0_0_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_1() { return cROUND_OPENTerminalRuleCall_1; }
		
		//terms+=TypedTermFilter
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//TypedTermFilter
		public RuleCall getTermsTypedTermFilterParserRuleCall_2_0() { return cTermsTypedTermFilterParserRuleCall_2_0; }
		
		//terms+=TypedTermFilter*
		public Assignment getTermsAssignment_3() { return cTermsAssignment_3; }
		
		//TypedTermFilter
		public RuleCall getTermsTypedTermFilterParserRuleCall_3_0() { return cTermsTypedTermFilterParserRuleCall_3_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_4() { return cROUND_CLOSETerminalRuleCall_4; }
	}
	public class LanguageCodeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LanguageCodeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLANGUAGE_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_1_0_0 = (RuleCall)cOpAlternatives_1_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_1_0_1 = (RuleCall)cOpAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cLanguageCodesAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cLanguageCodesAlphabeticalParserRuleCall_2_0_0 = (RuleCall)cLanguageCodesAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cLanguageCodesAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cLanguageCodesAlphabeticalParserRuleCall_2_1_1_0 = (RuleCall)cLanguageCodesAssignment_2_1_1.eContents().get(0);
		private final Assignment cLanguageCodesAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cLanguageCodesAlphabeticalParserRuleCall_2_1_2_0 = (RuleCall)cLanguageCodesAssignment_2_1_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_3 = (RuleCall)cGroup_2_1.eContents().get(3);
		
		//// regex and exact match is an extension to ECL 1.5
		//LanguageCodeFilter:
		//	LANGUAGE_KEYWORD op=(EQUAL | NOT_EQUAL) (languageCodes+=Alphabetical | ROUND_OPEN languageCodes+=Alphabetical
		//	languageCodes+=Alphabetical* ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//LANGUAGE_KEYWORD op=(EQUAL | NOT_EQUAL) (languageCodes+=Alphabetical | ROUND_OPEN languageCodes+=Alphabetical
		//languageCodes+=Alphabetical* ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//LANGUAGE_KEYWORD
		public RuleCall getLANGUAGE_KEYWORDTerminalRuleCall_0() { return cLANGUAGE_KEYWORDTerminalRuleCall_0; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_1_0_0() { return cOpEQUALTerminalRuleCall_1_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_1_0_1() { return cOpNOT_EQUALTerminalRuleCall_1_0_1; }
		
		//(languageCodes+=Alphabetical | ROUND_OPEN languageCodes+=Alphabetical languageCodes+=Alphabetical* ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//languageCodes+=Alphabetical
		public Assignment getLanguageCodesAssignment_2_0() { return cLanguageCodesAssignment_2_0; }
		
		//Alphabetical
		public RuleCall getLanguageCodesAlphabeticalParserRuleCall_2_0_0() { return cLanguageCodesAlphabeticalParserRuleCall_2_0_0; }
		
		//ROUND_OPEN languageCodes+=Alphabetical languageCodes+=Alphabetical* ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//languageCodes+=Alphabetical
		public Assignment getLanguageCodesAssignment_2_1_1() { return cLanguageCodesAssignment_2_1_1; }
		
		//Alphabetical
		public RuleCall getLanguageCodesAlphabeticalParserRuleCall_2_1_1_0() { return cLanguageCodesAlphabeticalParserRuleCall_2_1_1_0; }
		
		//languageCodes+=Alphabetical*
		public Assignment getLanguageCodesAssignment_2_1_2() { return cLanguageCodesAssignment_2_1_2; }
		
		//Alphabetical
		public RuleCall getLanguageCodesAlphabeticalParserRuleCall_2_1_2_0() { return cLanguageCodesAlphabeticalParserRuleCall_2_1_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_3() { return cROUND_CLOSETerminalRuleCall_2_1_3; }
	}
	public class TypeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypeFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTypeIdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cTypeTokenFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//TypeFilter:
		//	TypeIdFilter | TypeTokenFilter;
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
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_1_0_0 = (RuleCall)cOpAlternatives_1_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_1_0_1 = (RuleCall)cOpAlternatives_1_0.eContents().get(1);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cTypeAlternatives_2_0 = (Alternatives)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEclConceptReferenceParserRuleCall_2_0_0 = (RuleCall)cTypeAlternatives_2_0.eContents().get(0);
		private final RuleCall cTypeEclConceptReferenceSetParserRuleCall_2_0_1 = (RuleCall)cTypeAlternatives_2_0.eContents().get(1);
		
		//TypeIdFilter:
		//	TYPEID_KEYWORD op=(EQUAL | NOT_EQUAL) type=(EclConceptReference | EclConceptReferenceSet);
		@Override public ParserRule getRule() { return rule; }
		
		//TYPEID_KEYWORD op=(EQUAL | NOT_EQUAL) type=(EclConceptReference | EclConceptReferenceSet)
		public Group getGroup() { return cGroup; }
		
		//TYPEID_KEYWORD
		public RuleCall getTYPEID_KEYWORDTerminalRuleCall_0() { return cTYPEID_KEYWORDTerminalRuleCall_0; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_1_0_0() { return cOpEQUALTerminalRuleCall_1_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_1_0_1() { return cOpNOT_EQUALTerminalRuleCall_1_0_1; }
		
		//type=(EclConceptReference | EclConceptReferenceSet)
		public Assignment getTypeAssignment_2() { return cTypeAssignment_2; }
		
		//(EclConceptReference | EclConceptReferenceSet)
		public Alternatives getTypeAlternatives_2_0() { return cTypeAlternatives_2_0; }
		
		//EclConceptReference
		public RuleCall getTypeEclConceptReferenceParserRuleCall_2_0_0() { return cTypeEclConceptReferenceParserRuleCall_2_0_0; }
		
		//EclConceptReferenceSet
		public RuleCall getTypeEclConceptReferenceSetParserRuleCall_2_0_1() { return cTypeEclConceptReferenceSetParserRuleCall_2_0_1; }
	}
	public class TypeTokenFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TypeTokenFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cTYPE_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_1_0_0 = (RuleCall)cOpAlternatives_1_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_1_0_1 = (RuleCall)cOpAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cTokensAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cTokensAlphabeticalParserRuleCall_2_0_0 = (RuleCall)cTokensAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cTokensAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cTokensAlphabeticalParserRuleCall_2_1_1_0 = (RuleCall)cTokensAssignment_2_1_1.eContents().get(0);
		private final Assignment cTokensAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cTokensAlphabeticalParserRuleCall_2_1_2_0 = (RuleCall)cTokensAssignment_2_1_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_3 = (RuleCall)cGroup_2_1.eContents().get(3);
		
		//// allowing any STRING to be represented as type token here, validator will restrict it to the available set
		//TypeTokenFilter:
		//	TYPE_KEYWORD op=(EQUAL | NOT_EQUAL) (tokens+=Alphabetical | ROUND_OPEN tokens+=Alphabetical tokens+=Alphabetical*
		//	ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//TYPE_KEYWORD op=(EQUAL | NOT_EQUAL) (tokens+=Alphabetical | ROUND_OPEN tokens+=Alphabetical tokens+=Alphabetical*
		//ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//TYPE_KEYWORD
		public RuleCall getTYPE_KEYWORDTerminalRuleCall_0() { return cTYPE_KEYWORDTerminalRuleCall_0; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_1_0_0() { return cOpEQUALTerminalRuleCall_1_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_1_0_1() { return cOpNOT_EQUALTerminalRuleCall_1_0_1; }
		
		//(tokens+=Alphabetical | ROUND_OPEN tokens+=Alphabetical tokens+=Alphabetical* ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//tokens+=Alphabetical
		public Assignment getTokensAssignment_2_0() { return cTokensAssignment_2_0; }
		
		//Alphabetical
		public RuleCall getTokensAlphabeticalParserRuleCall_2_0_0() { return cTokensAlphabeticalParserRuleCall_2_0_0; }
		
		//ROUND_OPEN tokens+=Alphabetical tokens+=Alphabetical* ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//tokens+=Alphabetical
		public Assignment getTokensAssignment_2_1_1() { return cTokensAssignment_2_1_1; }
		
		//Alphabetical
		public RuleCall getTokensAlphabeticalParserRuleCall_2_1_1_0() { return cTokensAlphabeticalParserRuleCall_2_1_1_0; }
		
		//tokens+=Alphabetical*
		public Assignment getTokensAssignment_2_1_2() { return cTokensAssignment_2_1_2; }
		
		//Alphabetical
		public RuleCall getTokensAlphabeticalParserRuleCall_2_1_2_0() { return cTokensAlphabeticalParserRuleCall_2_1_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_3() { return cROUND_CLOSETerminalRuleCall_2_1_3; }
	}
	public class DialectFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectFilter");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDialectIdFilterParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDialectAliasFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DialectFilter:
		//	DialectIdFilter | DialectAliasFilter;
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
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_1_0_0 = (RuleCall)cOpAlternatives_1_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_1_0_1 = (RuleCall)cOpAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDialectsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDialectsDialectParserRuleCall_2_0_0 = (RuleCall)cDialectsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cDialectsDialectParserRuleCall_2_1_1_0 = (RuleCall)cDialectsAssignment_2_1_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cDialectsDialectParserRuleCall_2_1_2_0 = (RuleCall)cDialectsAssignment_2_1_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_3 = (RuleCall)cGroup_2_1.eContents().get(3);
		
		//DialectIdFilter:
		//	DIALECTID_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=Dialect | ROUND_OPEN dialects+=Dialect dialects+=Dialect*
		//	ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECTID_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=Dialect | ROUND_OPEN dialects+=Dialect dialects+=Dialect*
		//ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECTID_KEYWORD
		public RuleCall getDIALECTID_KEYWORDTerminalRuleCall_0() { return cDIALECTID_KEYWORDTerminalRuleCall_0; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_1_0_0() { return cOpEQUALTerminalRuleCall_1_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_1_0_1() { return cOpNOT_EQUALTerminalRuleCall_1_0_1; }
		
		//(dialects+=Dialect | ROUND_OPEN dialects+=Dialect dialects+=Dialect* ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=Dialect
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_0_0() { return cDialectsDialectParserRuleCall_2_0_0; }
		
		//ROUND_OPEN dialects+=Dialect dialects+=Dialect* ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//dialects+=Dialect
		public Assignment getDialectsAssignment_2_1_1() { return cDialectsAssignment_2_1_1; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_1_1_0() { return cDialectsDialectParserRuleCall_2_1_1_0; }
		
		//dialects+=Dialect*
		public Assignment getDialectsAssignment_2_1_2() { return cDialectsAssignment_2_1_2; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_1_2_0() { return cDialectsDialectParserRuleCall_2_1_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_3() { return cROUND_CLOSETerminalRuleCall_2_1_3; }
	}
	public class DialectAliasFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAliasFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDIALECT_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cOpAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0 = (Alternatives)cOpAssignment_1.eContents().get(0);
		private final RuleCall cOpEQUALTerminalRuleCall_1_0_0 = (RuleCall)cOpAlternatives_1_0.eContents().get(0);
		private final RuleCall cOpNOT_EQUALTerminalRuleCall_1_0_1 = (RuleCall)cOpAlternatives_1_0.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cDialectsAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cDialectsDialectAliasParserRuleCall_2_0_0 = (RuleCall)cDialectsAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cDialectsDialectAliasParserRuleCall_2_1_1_0 = (RuleCall)cDialectsAssignment_2_1_1.eContents().get(0);
		private final Assignment cDialectsAssignment_2_1_2 = (Assignment)cGroup_2_1.eContents().get(2);
		private final RuleCall cDialectsDialectAliasParserRuleCall_2_1_2_0 = (RuleCall)cDialectsAssignment_2_1_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_3 = (RuleCall)cGroup_2_1.eContents().get(3);
		
		//DialectAliasFilter:
		//	DIALECT_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias
		//	dialects+=DialectAlias* ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECT_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias
		//dialects+=DialectAlias* ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECT_KEYWORD
		public RuleCall getDIALECT_KEYWORDTerminalRuleCall_0() { return cDIALECT_KEYWORDTerminalRuleCall_0; }
		
		//op=(EQUAL | NOT_EQUAL)
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//(EQUAL | NOT_EQUAL)
		public Alternatives getOpAlternatives_1_0() { return cOpAlternatives_1_0; }
		
		//EQUAL
		public RuleCall getOpEQUALTerminalRuleCall_1_0_0() { return cOpEQUALTerminalRuleCall_1_0_0; }
		
		//NOT_EQUAL
		public RuleCall getOpNOT_EQUALTerminalRuleCall_1_0_1() { return cOpNOT_EQUALTerminalRuleCall_1_0_1; }
		
		//(dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias dialects+=DialectAlias* ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=DialectAlias
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_0_0() { return cDialectsDialectAliasParserRuleCall_2_0_0; }
		
		//ROUND_OPEN dialects+=DialectAlias dialects+=DialectAlias* ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//dialects+=DialectAlias
		public Assignment getDialectsAssignment_2_1_1() { return cDialectsAssignment_2_1_1; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_1_1_0() { return cDialectsDialectAliasParserRuleCall_2_1_1_0; }
		
		//dialects+=DialectAlias*
		public Assignment getDialectsAssignment_2_1_2() { return cDialectsAssignment_2_1_2; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_1_2_0() { return cDialectsDialectAliasParserRuleCall_2_1_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2_1_3() { return cROUND_CLOSETerminalRuleCall_2_1_3; }
	}
	public class DialectElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Dialect");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_0 = (Assignment)cGroup.eContents().get(0);
		private final RuleCall cLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0 = (RuleCall)cLanguageRefSetIdAssignment_0.eContents().get(0);
		private final Assignment cAcceptabilityAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAcceptabilityAcceptabilityParserRuleCall_1_0 = (RuleCall)cAcceptabilityAssignment_1.eContents().get(0);
		
		//Dialect:
		//	languageRefSetId=EclConceptReference acceptability=Acceptability?;
		@Override public ParserRule getRule() { return rule; }
		
		//languageRefSetId=EclConceptReference acceptability=Acceptability?
		public Group getGroup() { return cGroup; }
		
		//languageRefSetId=EclConceptReference
		public Assignment getLanguageRefSetIdAssignment_0() { return cLanguageRefSetIdAssignment_0; }
		
		//EclConceptReference
		public RuleCall getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0() { return cLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0; }
		
		//acceptability=Acceptability?
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
		
		//DialectAlias:
		//	alias=DialectAliasValue acceptability=Acceptability?;
		@Override public ParserRule getRule() { return rule; }
		
		//alias=DialectAliasValue acceptability=Acceptability?
		public Group getGroup() { return cGroup; }
		
		//alias=DialectAliasValue
		public Assignment getAliasAssignment_0() { return cAliasAssignment_0; }
		
		//DialectAliasValue
		public RuleCall getAliasDialectAliasValueParserRuleCall_0_0() { return cAliasDialectAliasValueParserRuleCall_0_0; }
		
		//acceptability=Acceptability?
		public Assignment getAcceptabilityAssignment_1() { return cAcceptabilityAssignment_1; }
		
		//Acceptability
		public RuleCall getAcceptabilityAcceptabilityParserRuleCall_1_0() { return cAcceptabilityAcceptabilityParserRuleCall_1_0; }
	}
	public class AcceptabilityElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Acceptability");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cAcceptabilityIdSetParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cAcceptabilityTokenSetParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Acceptability:
		//	AcceptabilityIdSet | AcceptabilityTokenSet;
		@Override public ParserRule getRule() { return rule; }
		
		//AcceptabilityIdSet | AcceptabilityTokenSet
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//AcceptabilityIdSet
		public RuleCall getAcceptabilityIdSetParserRuleCall_0() { return cAcceptabilityIdSetParserRuleCall_0; }
		
		//AcceptabilityTokenSet
		public RuleCall getAcceptabilityTokenSetParserRuleCall_1() { return cAcceptabilityTokenSetParserRuleCall_1; }
	}
	public class AcceptabilityIdSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AcceptabilityIdSet");
		private final Assignment cAcceptabilitiesAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cAcceptabilitiesEclConceptReferenceSetParserRuleCall_0 = (RuleCall)cAcceptabilitiesAssignment.eContents().get(0);
		
		//AcceptabilityIdSet:
		//	acceptabilities=EclConceptReferenceSet;
		@Override public ParserRule getRule() { return rule; }
		
		//acceptabilities=EclConceptReferenceSet
		public Assignment getAcceptabilitiesAssignment() { return cAcceptabilitiesAssignment; }
		
		//EclConceptReferenceSet
		public RuleCall getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0() { return cAcceptabilitiesEclConceptReferenceSetParserRuleCall_0; }
	}
	public class AcceptabilityTokenSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AcceptabilityTokenSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cAcceptabilitiesAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cAcceptabilitiesAlphabeticalParserRuleCall_1_0 = (RuleCall)cAcceptabilitiesAssignment_1.eContents().get(0);
		private final Assignment cAcceptabilitiesAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAcceptabilitiesAlphabeticalParserRuleCall_2_0 = (RuleCall)cAcceptabilitiesAssignment_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//AcceptabilityTokenSet:
		//	ROUND_OPEN acceptabilities+=Alphabetical acceptabilities+=Alphabetical* ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN acceptabilities+=Alphabetical acceptabilities+=Alphabetical* ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//acceptabilities+=Alphabetical
		public Assignment getAcceptabilitiesAssignment_1() { return cAcceptabilitiesAssignment_1; }
		
		//Alphabetical
		public RuleCall getAcceptabilitiesAlphabeticalParserRuleCall_1_0() { return cAcceptabilitiesAlphabeticalParserRuleCall_1_0; }
		
		//acceptabilities+=Alphabetical*
		public Assignment getAcceptabilitiesAssignment_2() { return cAcceptabilitiesAssignment_2; }
		
		//Alphabetical
		public RuleCall getAcceptabilitiesAlphabeticalParserRuleCall_2_0() { return cAcceptabilitiesAlphabeticalParserRuleCall_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_3() { return cROUND_CLOSETerminalRuleCall_3; }
	}
	public class SnomedIdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_3_0 = (RuleCall)cAlternatives_3.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_3_1 = (RuleCall)cAlternatives_3.eContents().get(1);
		private final Alternatives cAlternatives_4 = (Alternatives)cGroup.eContents().get(4);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_4_0 = (RuleCall)cAlternatives_4.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_4_1 = (RuleCall)cAlternatives_4.eContents().get(1);
		private final Alternatives cAlternatives_5 = (Alternatives)cGroup.eContents().get(5);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_5_0 = (RuleCall)cAlternatives_5.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_5_1 = (RuleCall)cAlternatives_5.eContents().get(1);
		
		//// hidden grammar rules
		//SnomedIdentifier hidden():
		//	DIGIT_NONZERO (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO)
		//	(DIGIT_NONZERO | ZERO)+;
		@Override public ParserRule getRule() { return rule; }
		
		//DIGIT_NONZERO (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO
		//| ZERO)+
		public Group getGroup() { return cGroup; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_0() { return cDIGIT_NONZEROTerminalRuleCall_0; }
		
		//(DIGIT_NONZERO | ZERO)
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_1_0() { return cDIGIT_NONZEROTerminalRuleCall_1_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_1_1() { return cZEROTerminalRuleCall_1_1; }
		
		//(DIGIT_NONZERO | ZERO)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_2_0() { return cDIGIT_NONZEROTerminalRuleCall_2_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_2_1() { return cZEROTerminalRuleCall_2_1; }
		
		//(DIGIT_NONZERO | ZERO)
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_3_0() { return cDIGIT_NONZEROTerminalRuleCall_3_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_3_1() { return cZEROTerminalRuleCall_3_1; }
		
		//(DIGIT_NONZERO | ZERO)
		public Alternatives getAlternatives_4() { return cAlternatives_4; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_4_0() { return cDIGIT_NONZEROTerminalRuleCall_4_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_4_1() { return cZEROTerminalRuleCall_4_1; }
		
		//(DIGIT_NONZERO | ZERO)+
		public Alternatives getAlternatives_5() { return cAlternatives_5; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_5_0() { return cDIGIT_NONZEROTerminalRuleCall_5_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_5_1() { return cZEROTerminalRuleCall_5_1; }
	}
	public class NonNegativeIntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cZEROTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_1_0 = (RuleCall)cGroup_1.eContents().get(0);
		private final Alternatives cAlternatives_1_1 = (Alternatives)cGroup_1.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_1_1_0 = (RuleCall)cAlternatives_1_1.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_1_1_1 = (RuleCall)cAlternatives_1_1.eContents().get(1);
		
		//NonNegativeInteger ecore::EInt hidden():
		//	ZERO | DIGIT_NONZERO (DIGIT_NONZERO | ZERO)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ZERO | DIGIT_NONZERO (DIGIT_NONZERO | ZERO)*
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_0() { return cZEROTerminalRuleCall_0; }
		
		//DIGIT_NONZERO (DIGIT_NONZERO | ZERO)*
		public Group getGroup_1() { return cGroup_1; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_1_0() { return cDIGIT_NONZEROTerminalRuleCall_1_0; }
		
		//(DIGIT_NONZERO | ZERO)*
		public Alternatives getAlternatives_1_1() { return cAlternatives_1_1; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_1_1_0() { return cDIGIT_NONZEROTerminalRuleCall_1_1_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_1_1_1() { return cZEROTerminalRuleCall_1_1_1; }
	}
	public class MaxValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MaxValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWILDCARDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//MaxValue ecore::EInt hidden():
		//	NonNegativeInteger | WILDCARD;
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
		
		//Integer ecore::EInt hidden():
		//	(PLUS | DASH)? NonNegativeInteger;
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
		
		//Decimal ecore::EBigDecimal hidden():
		//	(PLUS | DASH)? NonNegativeDecimal;
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
	public class NonNegativeDecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cZEROTerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//NonNegativeDecimal ecore::EBigDecimal hidden():
		//	NonNegativeInteger DOT (DIGIT_NONZERO | ZERO)*;
		@Override public ParserRule getRule() { return rule; }
		
		//NonNegativeInteger DOT (DIGIT_NONZERO | ZERO)*
		public Group getGroup() { return cGroup; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_0() { return cNonNegativeIntegerParserRuleCall_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1() { return cDOTTerminalRuleCall_1; }
		
		//(DIGIT_NONZERO | ZERO)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_2_0() { return cDIGIT_NONZEROTerminalRuleCall_2_0; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_2_1() { return cZEROTerminalRuleCall_2_1; }
	}
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Keyword cTrueKeyword_0 = (Keyword)cAlternatives.eContents().get(0);
		private final Keyword cFalseKeyword_1 = (Keyword)cAlternatives.eContents().get(1);
		
		//Boolean ecore::EBoolean hidden():
		//	'true' | 'false';
		@Override public ParserRule getRule() { return rule; }
		
		//'true' | 'false'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//'true'
		public Keyword getTrueKeyword_0() { return cTrueKeyword_0; }
		
		//'false'
		public Keyword getFalseKeyword_1() { return cFalseKeyword_1; }
	}
	public class DialectAliasValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAliasValue");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cALPHATerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Alternatives cAlternatives_1 = (Alternatives)cGroup.eContents().get(1);
		private final RuleCall cDASHTerminalRuleCall_1_0 = (RuleCall)cAlternatives_1.eContents().get(0);
		private final RuleCall cALPHATerminalRuleCall_1_1 = (RuleCall)cAlternatives_1.eContents().get(1);
		private final RuleCall cZEROTerminalRuleCall_1_2 = (RuleCall)cAlternatives_1.eContents().get(2);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_1_3 = (RuleCall)cAlternatives_1.eContents().get(3);
		
		//DialectAliasValue hidden():
		//	ALPHA (DASH | ALPHA | ZERO | DIGIT_NONZERO)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ALPHA (DASH | ALPHA | ZERO | DIGIT_NONZERO)*
		public Group getGroup() { return cGroup; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_0() { return cALPHATerminalRuleCall_0; }
		
		//(DASH | ALPHA | ZERO | DIGIT_NONZERO)*
		public Alternatives getAlternatives_1() { return cAlternatives_1; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_1_0() { return cDASHTerminalRuleCall_1_0; }
		
		//ALPHA
		public RuleCall getALPHATerminalRuleCall_1_1() { return cALPHATerminalRuleCall_1_1; }
		
		//ZERO
		public RuleCall getZEROTerminalRuleCall_1_2() { return cZEROTerminalRuleCall_1_2; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_1_3() { return cDIGIT_NONZEROTerminalRuleCall_1_3; }
	}
	public class AlphabeticalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Alphabetical");
		private final RuleCall cALPHATerminalRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Alphabetical hidden():
		//	ALPHA+;
		@Override public ParserRule getRule() { return rule; }
		
		//ALPHA+
		public RuleCall getALPHATerminalRuleCall() { return cALPHATerminalRuleCall; }
	}
	
	public class LexicalSearchTypeElements extends AbstractElementFinder.AbstractEnumRuleElementFinder {
		private final EnumRule rule = (EnumRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LexicalSearchType");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final EnumLiteralDeclaration cMATCHEnumLiteralDeclaration_0 = (EnumLiteralDeclaration)cAlternatives.eContents().get(0);
		private final Keyword cMATCHMatchKeyword_0_0 = (Keyword)cMATCHEnumLiteralDeclaration_0.eContents().get(0);
		private final EnumLiteralDeclaration cWILDEnumLiteralDeclaration_1 = (EnumLiteralDeclaration)cAlternatives.eContents().get(1);
		private final Keyword cWILDWildKeyword_1_0 = (Keyword)cWILDEnumLiteralDeclaration_1.eContents().get(0);
		private final EnumLiteralDeclaration cREGEXEnumLiteralDeclaration_2 = (EnumLiteralDeclaration)cAlternatives.eContents().get(2);
		private final Keyword cREGEXRegexKeyword_2_0 = (Keyword)cREGEXEnumLiteralDeclaration_2.eContents().get(0);
		private final EnumLiteralDeclaration cEXACTEnumLiteralDeclaration_3 = (EnumLiteralDeclaration)cAlternatives.eContents().get(3);
		private final Keyword cEXACTExactKeyword_3_0 = (Keyword)cEXACTEnumLiteralDeclaration_3.eContents().get(0);
		
		//enum LexicalSearchType:
		//	MATCH="match" | WILD="wild" | REGEX="regex" | EXACT="exact";
		public EnumRule getRule() { return rule; }
		
		//MATCH="match" | WILD="wild" | REGEX="regex" | EXACT="exact"
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MATCH="match"
		public EnumLiteralDeclaration getMATCHEnumLiteralDeclaration_0() { return cMATCHEnumLiteralDeclaration_0; }
		
		//"match"
		public Keyword getMATCHMatchKeyword_0_0() { return cMATCHMatchKeyword_0_0; }
		
		//WILD="wild"
		public EnumLiteralDeclaration getWILDEnumLiteralDeclaration_1() { return cWILDEnumLiteralDeclaration_1; }
		
		//"wild"
		public Keyword getWILDWildKeyword_1_0() { return cWILDWildKeyword_1_0; }
		
		//REGEX="regex"
		public EnumLiteralDeclaration getREGEXEnumLiteralDeclaration_2() { return cREGEXEnumLiteralDeclaration_2; }
		
		//"regex"
		public Keyword getREGEXRegexKeyword_2_0() { return cREGEXRegexKeyword_2_0; }
		
		//EXACT="exact"
		public EnumLiteralDeclaration getEXACTEnumLiteralDeclaration_3() { return cEXACTEnumLiteralDeclaration_3; }
		
		//"exact"
		public Keyword getEXACTExactKeyword_3_0() { return cEXACTExactKeyword_3_0; }
	}
	
	private final ScriptElements pScript;
	private final ExpressionConstraintElements pExpressionConstraint;
	private final OrExpressionConstraintElements pOrExpressionConstraint;
	private final AndExpressionConstraintElements pAndExpressionConstraint;
	private final ExclusionExpressionConstraintElements pExclusionExpressionConstraint;
	private final RefinedExpressionConstraintElements pRefinedExpressionConstraint;
	private final DottedExpressionConstraintElements pDottedExpressionConstraint;
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
	private final MemberOfElements pMemberOf;
	private final EclConceptReferenceElements pEclConceptReference;
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
	private final ExclusionFilterElements pExclusionFilter;
	private final NestedFilterElements pNestedFilter;
	private final PropertyFilterElements pPropertyFilter;
	private final TermFilterElements pTermFilter;
	private final TypedTermFilterElements pTypedTermFilter;
	private final TypedTermFilterSetElements pTypedTermFilterSet;
	private final LexicalSearchTypeElements eLexicalSearchType;
	private final LanguageCodeFilterElements pLanguageCodeFilter;
	private final TypeFilterElements pTypeFilter;
	private final TypeIdFilterElements pTypeIdFilter;
	private final TypeTokenFilterElements pTypeTokenFilter;
	private final DialectFilterElements pDialectFilter;
	private final DialectIdFilterElements pDialectIdFilter;
	private final DialectAliasFilterElements pDialectAliasFilter;
	private final DialectElements pDialect;
	private final DialectAliasElements pDialectAlias;
	private final AcceptabilityElements pAcceptability;
	private final AcceptabilityIdSetElements pAcceptabilityIdSet;
	private final AcceptabilityTokenSetElements pAcceptabilityTokenSet;
	private final SnomedIdentifierElements pSnomedIdentifier;
	private final NonNegativeIntegerElements pNonNegativeInteger;
	private final MaxValueElements pMaxValue;
	private final IntegerElements pInteger;
	private final DecimalElements pDecimal;
	private final NonNegativeDecimalElements pNonNegativeDecimal;
	private final BooleanElements pBoolean;
	private final DialectAliasValueElements pDialectAliasValue;
	private final AlphabeticalElements pAlphabetical;
	private final TerminalRule tTERM_STRING;
	private final TerminalRule tREVERSED;
	private final TerminalRule tTO;
	private final TerminalRule tCOMMA;
	private final TerminalRule tCONJUNCTION;
	private final TerminalRule tDISJUNCTION;
	private final TerminalRule tEXCLUSION;
	private final TerminalRule tZERO;
	private final TerminalRule tDIGIT_NONZERO;
	private final TerminalRule tCOLON;
	private final TerminalRule tCURLY_OPEN;
	private final TerminalRule tCURLY_CLOSE;
	private final TerminalRule tROUND_OPEN;
	private final TerminalRule tROUND_CLOSE;
	private final TerminalRule tSQUARE_OPEN;
	private final TerminalRule tSQUARE_CLOSE;
	private final TerminalRule tPLUS;
	private final TerminalRule tDASH;
	private final TerminalRule tCARET;
	private final TerminalRule tDOT;
	private final TerminalRule tWILDCARD;
	private final TerminalRule tEQUAL;
	private final TerminalRule tNOT_EQUAL;
	private final TerminalRule tLT;
	private final TerminalRule tGT;
	private final TerminalRule tDBL_LT;
	private final TerminalRule tDBL_GT;
	private final TerminalRule tLT_EM;
	private final TerminalRule tDBL_LT_EM;
	private final TerminalRule tGT_EM;
	private final TerminalRule tDBL_GT_EM;
	private final TerminalRule tGTE;
	private final TerminalRule tLTE;
	private final TerminalRule tHASH;
	private final TerminalRule tDOUBLE_CURLY_OPEN;
	private final TerminalRule tDOUBLE_CURLY_CLOSE;
	private final TerminalRule tTERM_KEYWORD;
	private final TerminalRule tLANGUAGE_KEYWORD;
	private final TerminalRule tTYPEID_KEYWORD;
	private final TerminalRule tTYPE_KEYWORD;
	private final TerminalRule tDIALECTID_KEYWORD;
	private final TerminalRule tDIALECT_KEYWORD;
	private final TerminalRule tALPHA;
	private final TerminalRule tWS;
	private final TerminalRule tML_COMMENT;
	private final TerminalRule tSL_COMMENT;
	private final TerminalRule tSTRING;
	
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
		this.pMemberOf = new MemberOfElements();
		this.pEclConceptReference = new EclConceptReferenceElements();
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
		this.pExclusionFilter = new ExclusionFilterElements();
		this.pNestedFilter = new NestedFilterElements();
		this.pPropertyFilter = new PropertyFilterElements();
		this.pTermFilter = new TermFilterElements();
		this.pTypedTermFilter = new TypedTermFilterElements();
		this.pTypedTermFilterSet = new TypedTermFilterSetElements();
		this.eLexicalSearchType = new LexicalSearchTypeElements();
		this.pLanguageCodeFilter = new LanguageCodeFilterElements();
		this.pTypeFilter = new TypeFilterElements();
		this.pTypeIdFilter = new TypeIdFilterElements();
		this.pTypeTokenFilter = new TypeTokenFilterElements();
		this.pDialectFilter = new DialectFilterElements();
		this.pDialectIdFilter = new DialectIdFilterElements();
		this.pDialectAliasFilter = new DialectAliasFilterElements();
		this.pDialect = new DialectElements();
		this.pDialectAlias = new DialectAliasElements();
		this.pAcceptability = new AcceptabilityElements();
		this.pAcceptabilityIdSet = new AcceptabilityIdSetElements();
		this.pAcceptabilityTokenSet = new AcceptabilityTokenSetElements();
		this.pSnomedIdentifier = new SnomedIdentifierElements();
		this.pNonNegativeInteger = new NonNegativeIntegerElements();
		this.pMaxValue = new MaxValueElements();
		this.pInteger = new IntegerElements();
		this.pDecimal = new DecimalElements();
		this.pNonNegativeDecimal = new NonNegativeDecimalElements();
		this.pBoolean = new BooleanElements();
		this.pDialectAliasValue = new DialectAliasValueElements();
		this.pAlphabetical = new AlphabeticalElements();
		this.tTERM_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TERM_STRING");
		this.tREVERSED = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.REVERSED");
		this.tTO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TO");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.COMMA");
		this.tCONJUNCTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CONJUNCTION");
		this.tDISJUNCTION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DISJUNCTION");
		this.tEXCLUSION = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EXCLUSION");
		this.tZERO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ZERO");
		this.tDIGIT_NONZERO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIGIT_NONZERO");
		this.tCOLON = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.COLON");
		this.tCURLY_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CURLY_OPEN");
		this.tCURLY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CURLY_CLOSE");
		this.tROUND_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ROUND_OPEN");
		this.tROUND_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ROUND_CLOSE");
		this.tSQUARE_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SQUARE_OPEN");
		this.tSQUARE_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SQUARE_CLOSE");
		this.tPLUS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PLUS");
		this.tDASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DASH");
		this.tCARET = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CARET");
		this.tDOT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOT");
		this.tWILDCARD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.WILDCARD");
		this.tEQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EQUAL");
		this.tNOT_EQUAL = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NOT_EQUAL");
		this.tLT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LT");
		this.tGT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GT");
		this.tDBL_LT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT");
		this.tDBL_GT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT");
		this.tLT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LT_EM");
		this.tDBL_LT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT_EM");
		this.tGT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GT_EM");
		this.tDBL_GT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT_EM");
		this.tGTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GTE");
		this.tLTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LTE");
		this.tHASH = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.HASH");
		this.tDOUBLE_CURLY_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_OPEN");
		this.tDOUBLE_CURLY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_CLOSE");
		this.tTERM_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TERM_KEYWORD");
		this.tLANGUAGE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LANGUAGE_KEYWORD");
		this.tTYPEID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TYPEID_KEYWORD");
		this.tTYPE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TYPE_KEYWORD");
		this.tDIALECTID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIALECTID_KEYWORD");
		this.tDIALECT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIALECT_KEYWORD");
		this.tALPHA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ALPHA");
		this.tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.WS");
		this.tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ML_COMMENT");
		this.tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SL_COMMENT");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.STRING");
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
	//	{Script} constraint=ExpressionConstraint?;
	public ScriptElements getScriptAccess() {
		return pScript;
	}
	
	public ParserRule getScriptRule() {
		return getScriptAccess().getRule();
	}
	
	//ExpressionConstraint:
	//	OrExpressionConstraint;
	public ExpressionConstraintElements getExpressionConstraintAccess() {
		return pExpressionConstraint;
	}
	
	public ParserRule getExpressionConstraintRule() {
		return getExpressionConstraintAccess().getRule();
	}
	
	//OrExpressionConstraint ExpressionConstraint:
	//	AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION right=AndExpressionConstraint)*;
	public OrExpressionConstraintElements getOrExpressionConstraintAccess() {
		return pOrExpressionConstraint;
	}
	
	public ParserRule getOrExpressionConstraintRule() {
		return getOrExpressionConstraintAccess().getRule();
	}
	
	//AndExpressionConstraint ExpressionConstraint:
	//	ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION | COMMA)
	//	right=ExclusionExpressionConstraint)*;
	public AndExpressionConstraintElements getAndExpressionConstraintAccess() {
		return pAndExpressionConstraint;
	}
	
	public ParserRule getAndExpressionConstraintRule() {
		return getAndExpressionConstraintAccess().getRule();
	}
	
	//ExclusionExpressionConstraint ExpressionConstraint:
	//	RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION
	//	right=RefinedExpressionConstraint)?;
	public ExclusionExpressionConstraintElements getExclusionExpressionConstraintAccess() {
		return pExclusionExpressionConstraint;
	}
	
	public ParserRule getExclusionExpressionConstraintRule() {
		return getExclusionExpressionConstraintAccess().getRule();
	}
	
	//RefinedExpressionConstraint ExpressionConstraint:
	//	DottedExpressionConstraint ({RefinedExpressionConstraint.constraint=current} COLON refinement=EclRefinement)?;
	public RefinedExpressionConstraintElements getRefinedExpressionConstraintAccess() {
		return pRefinedExpressionConstraint;
	}
	
	public ParserRule getRefinedExpressionConstraintRule() {
		return getRefinedExpressionConstraintAccess().getRule();
	}
	
	//DottedExpressionConstraint ExpressionConstraint:
	//	SubExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT attribute=SubExpressionConstraint)*;
	public DottedExpressionConstraintElements getDottedExpressionConstraintAccess() {
		return pDottedExpressionConstraint;
	}
	
	public ParserRule getDottedExpressionConstraintRule() {
		return getDottedExpressionConstraintAccess().getRule();
	}
	
	//SubExpressionConstraint ExpressionConstraint:
	//	ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf |
	//	AncestorOrSelfOf | EclFocusConcept | FilterConstraint;
	public SubExpressionConstraintElements getSubExpressionConstraintAccess() {
		return pSubExpressionConstraint;
	}
	
	public ParserRule getSubExpressionConstraintRule() {
		return getSubExpressionConstraintAccess().getRule();
	}
	
	//EclFocusConcept ExpressionConstraint:
	//	MemberOf | EclConceptReference | Any | NestedExpression;
	public EclFocusConceptElements getEclFocusConceptAccess() {
		return pEclFocusConcept;
	}
	
	public ParserRule getEclFocusConceptRule() {
		return getEclFocusConceptAccess().getRule();
	}
	
	//ChildOf:
	//	LT_EM constraint=EclFocusConcept;
	public ChildOfElements getChildOfAccess() {
		return pChildOf;
	}
	
	public ParserRule getChildOfRule() {
		return getChildOfAccess().getRule();
	}
	
	//ChildOrSelfOf:
	//	DBL_LT_EM constraint=EclFocusConcept;
	public ChildOrSelfOfElements getChildOrSelfOfAccess() {
		return pChildOrSelfOf;
	}
	
	public ParserRule getChildOrSelfOfRule() {
		return getChildOrSelfOfAccess().getRule();
	}
	
	//DescendantOf:
	//	LT constraint=EclFocusConcept;
	public DescendantOfElements getDescendantOfAccess() {
		return pDescendantOf;
	}
	
	public ParserRule getDescendantOfRule() {
		return getDescendantOfAccess().getRule();
	}
	
	//DescendantOrSelfOf:
	//	DBL_LT constraint=EclFocusConcept;
	public DescendantOrSelfOfElements getDescendantOrSelfOfAccess() {
		return pDescendantOrSelfOf;
	}
	
	public ParserRule getDescendantOrSelfOfRule() {
		return getDescendantOrSelfOfAccess().getRule();
	}
	
	//ParentOf:
	//	GT_EM constraint=EclFocusConcept;
	public ParentOfElements getParentOfAccess() {
		return pParentOf;
	}
	
	public ParserRule getParentOfRule() {
		return getParentOfAccess().getRule();
	}
	
	//ParentOrSelfOf:
	//	DBL_GT_EM constraint=EclFocusConcept;
	public ParentOrSelfOfElements getParentOrSelfOfAccess() {
		return pParentOrSelfOf;
	}
	
	public ParserRule getParentOrSelfOfRule() {
		return getParentOrSelfOfAccess().getRule();
	}
	
	//AncestorOf:
	//	GT constraint=EclFocusConcept;
	public AncestorOfElements getAncestorOfAccess() {
		return pAncestorOf;
	}
	
	public ParserRule getAncestorOfRule() {
		return getAncestorOfAccess().getRule();
	}
	
	//AncestorOrSelfOf:
	//	DBL_GT constraint=EclFocusConcept;
	public AncestorOrSelfOfElements getAncestorOrSelfOfAccess() {
		return pAncestorOrSelfOf;
	}
	
	public ParserRule getAncestorOrSelfOfRule() {
		return getAncestorOrSelfOfAccess().getRule();
	}
	
	//MemberOf:
	//	CARET constraint=(EclConceptReference | Any | NestedExpression);
	public MemberOfElements getMemberOfAccess() {
		return pMemberOf;
	}
	
	public ParserRule getMemberOfRule() {
		return getMemberOfAccess().getRule();
	}
	
	//EclConceptReference:
	//	id=SnomedIdentifier term=TERM_STRING?;
	public EclConceptReferenceElements getEclConceptReferenceAccess() {
		return pEclConceptReference;
	}
	
	public ParserRule getEclConceptReferenceRule() {
		return getEclConceptReferenceAccess().getRule();
	}
	
	//EclConceptReferenceSet:
	//	ROUND_OPEN concepts+=EclConceptReference concepts+=EclConceptReference* ROUND_CLOSE;
	public EclConceptReferenceSetElements getEclConceptReferenceSetAccess() {
		return pEclConceptReferenceSet;
	}
	
	public ParserRule getEclConceptReferenceSetRule() {
		return getEclConceptReferenceSetAccess().getRule();
	}
	
	//Any:
	//	WILDCARD {Any};
	public AnyElements getAnyAccess() {
		return pAny;
	}
	
	public ParserRule getAnyRule() {
		return getAnyAccess().getRule();
	}
	
	//EclRefinement:
	//	OrRefinement;
	public EclRefinementElements getEclRefinementAccess() {
		return pEclRefinement;
	}
	
	public ParserRule getEclRefinementRule() {
		return getEclRefinementAccess().getRule();
	}
	
	//OrRefinement EclRefinement:
	//	AndRefinement -> ({OrRefinement.left=current} DISJUNCTION right=AndRefinement)*;
	public OrRefinementElements getOrRefinementAccess() {
		return pOrRefinement;
	}
	
	public ParserRule getOrRefinementRule() {
		return getOrRefinementAccess().getRule();
	}
	
	//AndRefinement EclRefinement:
	//	SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubRefinement)*;
	public AndRefinementElements getAndRefinementAccess() {
		return pAndRefinement;
	}
	
	public ParserRule getAndRefinementRule() {
		return getAndRefinementAccess().getRule();
	}
	
	//SubRefinement EclRefinement:
	//	AttributeConstraint | EclAttributeGroup | NestedRefinement;
	public SubRefinementElements getSubRefinementAccess() {
		return pSubRefinement;
	}
	
	public ParserRule getSubRefinementRule() {
		return getSubRefinementAccess().getRule();
	}
	
	//NestedRefinement:
	//	ROUND_OPEN nested=EclRefinement ROUND_CLOSE;
	public NestedRefinementElements getNestedRefinementAccess() {
		return pNestedRefinement;
	}
	
	public ParserRule getNestedRefinementRule() {
		return getNestedRefinementAccess().getRule();
	}
	
	//EclAttributeGroup:
	//	cardinality=Cardinality? CURLY_OPEN refinement=EclAttributeSet CURLY_CLOSE;
	public EclAttributeGroupElements getEclAttributeGroupAccess() {
		return pEclAttributeGroup;
	}
	
	public ParserRule getEclAttributeGroupRule() {
		return getEclAttributeGroupAccess().getRule();
	}
	
	//EclAttributeSet EclRefinement:
	//	OrAttributeSet;
	public EclAttributeSetElements getEclAttributeSetAccess() {
		return pEclAttributeSet;
	}
	
	public ParserRule getEclAttributeSetRule() {
		return getEclAttributeSetAccess().getRule();
	}
	
	//OrAttributeSet EclRefinement:
	//	AndAttributeSet ({OrRefinement.left=current} DISJUNCTION right=AndAttributeSet)*;
	public OrAttributeSetElements getOrAttributeSetAccess() {
		return pOrAttributeSet;
	}
	
	public ParserRule getOrAttributeSetRule() {
		return getOrAttributeSetAccess().getRule();
	}
	
	//AndAttributeSet EclRefinement:
	//	SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION | COMMA) right=SubAttributeSet)*;
	public AndAttributeSetElements getAndAttributeSetAccess() {
		return pAndAttributeSet;
	}
	
	public ParserRule getAndAttributeSetRule() {
		return getAndAttributeSetAccess().getRule();
	}
	
	//SubAttributeSet EclRefinement:
	//	AttributeConstraint | NestedAttributeSet;
	public SubAttributeSetElements getSubAttributeSetAccess() {
		return pSubAttributeSet;
	}
	
	public ParserRule getSubAttributeSetRule() {
		return getSubAttributeSetAccess().getRule();
	}
	
	//NestedAttributeSet NestedRefinement:
	//	ROUND_OPEN nested=EclAttributeSet ROUND_CLOSE;
	public NestedAttributeSetElements getNestedAttributeSetAccess() {
		return pNestedAttributeSet;
	}
	
	public ParserRule getNestedAttributeSetRule() {
		return getNestedAttributeSetAccess().getRule();
	}
	
	//AttributeConstraint:
	//	cardinality=Cardinality? reversed?=REVERSED? attribute=SubExpressionConstraint comparison=Comparison;
	public AttributeConstraintElements getAttributeConstraintAccess() {
		return pAttributeConstraint;
	}
	
	public ParserRule getAttributeConstraintRule() {
		return getAttributeConstraintAccess().getRule();
	}
	
	//Cardinality:
	//	SQUARE_OPEN min=NonNegativeInteger TO max=MaxValue SQUARE_CLOSE;
	public CardinalityElements getCardinalityAccess() {
		return pCardinality;
	}
	
	public ParserRule getCardinalityRule() {
		return getCardinalityAccess().getRule();
	}
	
	//Comparison:
	//	AttributeComparison | DataTypeComparison;
	public ComparisonElements getComparisonAccess() {
		return pComparison;
	}
	
	public ParserRule getComparisonRule() {
		return getComparisonAccess().getRule();
	}
	
	//AttributeComparison:
	//	op=(EQUAL | NOT_EQUAL) value=SubExpressionConstraint;
	public AttributeComparisonElements getAttributeComparisonAccess() {
		return pAttributeComparison;
	}
	
	public ParserRule getAttributeComparisonRule() {
		return getAttributeComparisonAccess().getRule();
	}
	
	//DataTypeComparison:
	//	BooleanValueComparison
	//	| StringValueComparison
	//	| IntegerValueComparison
	//	| DecimalValueComparison;
	public DataTypeComparisonElements getDataTypeComparisonAccess() {
		return pDataTypeComparison;
	}
	
	public ParserRule getDataTypeComparisonRule() {
		return getDataTypeComparisonAccess().getRule();
	}
	
	//BooleanValueComparison:
	//	op=(EQUAL | NOT_EQUAL) value=Boolean;
	public BooleanValueComparisonElements getBooleanValueComparisonAccess() {
		return pBooleanValueComparison;
	}
	
	public ParserRule getBooleanValueComparisonRule() {
		return getBooleanValueComparisonAccess().getRule();
	}
	
	//StringValueComparison:
	//	op=(EQUAL | NOT_EQUAL) value=STRING;
	public StringValueComparisonElements getStringValueComparisonAccess() {
		return pStringValueComparison;
	}
	
	public ParserRule getStringValueComparisonRule() {
		return getStringValueComparisonAccess().getRule();
	}
	
	//IntegerValueComparison:
	//	op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Integer;
	public IntegerValueComparisonElements getIntegerValueComparisonAccess() {
		return pIntegerValueComparison;
	}
	
	public ParserRule getIntegerValueComparisonRule() {
		return getIntegerValueComparisonAccess().getRule();
	}
	
	//DecimalValueComparison:
	//	op=(EQUAL | NOT_EQUAL | GT | LT | GTE | LTE) HASH value=Decimal;
	public DecimalValueComparisonElements getDecimalValueComparisonAccess() {
		return pDecimalValueComparison;
	}
	
	public ParserRule getDecimalValueComparisonRule() {
		return getDecimalValueComparisonAccess().getRule();
	}
	
	//NestedExpression:
	//	ROUND_OPEN nested=ExpressionConstraint ROUND_CLOSE;
	public NestedExpressionElements getNestedExpressionAccess() {
		return pNestedExpression;
	}
	
	public ParserRule getNestedExpressionRule() {
		return getNestedExpressionAccess().getRule();
	}
	
	//// filters
	//FilterConstraint:
	//	DOUBLE_CURLY_OPEN Filter DOUBLE_CURLY_CLOSE;
	public FilterConstraintElements getFilterConstraintAccess() {
		return pFilterConstraint;
	}
	
	public ParserRule getFilterConstraintRule() {
		return getFilterConstraintAccess().getRule();
	}
	
	//Filter:
	//	DisjunctionFilter;
	public FilterElements getFilterAccess() {
		return pFilter;
	}
	
	public ParserRule getFilterRule() {
		return getFilterAccess().getRule();
	}
	
	//DisjunctionFilter Filter:
	//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION right=ConjunctionFilter)*;
	public DisjunctionFilterElements getDisjunctionFilterAccess() {
		return pDisjunctionFilter;
	}
	
	public ParserRule getDisjunctionFilterRule() {
		return getDisjunctionFilterAccess().getRule();
	}
	
	//ConjunctionFilter Filter:
	//	ExclusionFilter ({ConjunctionFilter.left=current} (CONJUNCTION | COMMA) right=ExclusionFilter)*;
	public ConjunctionFilterElements getConjunctionFilterAccess() {
		return pConjunctionFilter;
	}
	
	public ParserRule getConjunctionFilterRule() {
		return getConjunctionFilterAccess().getRule();
	}
	
	//ExclusionFilter Filter:
	//	PropertyFilter ({ExclusionFilter.left=current} EXCLUSION right=PropertyFilter)?;
	public ExclusionFilterElements getExclusionFilterAccess() {
		return pExclusionFilter;
	}
	
	public ParserRule getExclusionFilterRule() {
		return getExclusionFilterAccess().getRule();
	}
	
	//NestedFilter:
	//	ROUND_OPEN nested=Filter ROUND_CLOSE;
	public NestedFilterElements getNestedFilterAccess() {
		return pNestedFilter;
	}
	
	public ParserRule getNestedFilterRule() {
		return getNestedFilterAccess().getRule();
	}
	
	//PropertyFilter:
	//	TermFilter | LanguageCodeFilter | TypeFilter | DialectFilter | NestedFilter;
	public PropertyFilterElements getPropertyFilterAccess() {
		return pPropertyFilter;
	}
	
	public ParserRule getPropertyFilterRule() {
		return getPropertyFilterAccess().getRule();
	}
	
	//TermFilter:
	//	TERM_KEYWORD (TypedTermFilter | TypedTermFilterSet);
	public TermFilterElements getTermFilterAccess() {
		return pTermFilter;
	}
	
	public ParserRule getTermFilterRule() {
		return getTermFilterAccess().getRule();
	}
	
	//TypedTermFilter:
	//	op=(EQUAL | NOT_EQUAL) (lexicalSearchType=LexicalSearchType COLON)? term=STRING;
	public TypedTermFilterElements getTypedTermFilterAccess() {
		return pTypedTermFilter;
	}
	
	public ParserRule getTypedTermFilterRule() {
		return getTypedTermFilterAccess().getRule();
	}
	
	//// no special treatment for the term filter STRING, we allow everything for any lexical search type
	//TypedTermFilterSet:
	//	op=(EQUAL | NOT_EQUAL) ROUND_OPEN terms+=TypedTermFilter terms+=TypedTermFilter* ROUND_CLOSE;
	public TypedTermFilterSetElements getTypedTermFilterSetAccess() {
		return pTypedTermFilterSet;
	}
	
	public ParserRule getTypedTermFilterSetRule() {
		return getTypedTermFilterSetAccess().getRule();
	}
	
	//enum LexicalSearchType:
	//	MATCH="match" | WILD="wild" | REGEX="regex" | EXACT="exact";
	public LexicalSearchTypeElements getLexicalSearchTypeAccess() {
		return eLexicalSearchType;
	}
	
	public EnumRule getLexicalSearchTypeRule() {
		return getLexicalSearchTypeAccess().getRule();
	}
	
	//// regex and exact match is an extension to ECL 1.5
	//LanguageCodeFilter:
	//	LANGUAGE_KEYWORD op=(EQUAL | NOT_EQUAL) (languageCodes+=Alphabetical | ROUND_OPEN languageCodes+=Alphabetical
	//	languageCodes+=Alphabetical* ROUND_CLOSE);
	public LanguageCodeFilterElements getLanguageCodeFilterAccess() {
		return pLanguageCodeFilter;
	}
	
	public ParserRule getLanguageCodeFilterRule() {
		return getLanguageCodeFilterAccess().getRule();
	}
	
	//TypeFilter:
	//	TypeIdFilter | TypeTokenFilter;
	public TypeFilterElements getTypeFilterAccess() {
		return pTypeFilter;
	}
	
	public ParserRule getTypeFilterRule() {
		return getTypeFilterAccess().getRule();
	}
	
	//TypeIdFilter:
	//	TYPEID_KEYWORD op=(EQUAL | NOT_EQUAL) type=(EclConceptReference | EclConceptReferenceSet);
	public TypeIdFilterElements getTypeIdFilterAccess() {
		return pTypeIdFilter;
	}
	
	public ParserRule getTypeIdFilterRule() {
		return getTypeIdFilterAccess().getRule();
	}
	
	//// allowing any STRING to be represented as type token here, validator will restrict it to the available set
	//TypeTokenFilter:
	//	TYPE_KEYWORD op=(EQUAL | NOT_EQUAL) (tokens+=Alphabetical | ROUND_OPEN tokens+=Alphabetical tokens+=Alphabetical*
	//	ROUND_CLOSE);
	public TypeTokenFilterElements getTypeTokenFilterAccess() {
		return pTypeTokenFilter;
	}
	
	public ParserRule getTypeTokenFilterRule() {
		return getTypeTokenFilterAccess().getRule();
	}
	
	//DialectFilter:
	//	DialectIdFilter | DialectAliasFilter;
	public DialectFilterElements getDialectFilterAccess() {
		return pDialectFilter;
	}
	
	public ParserRule getDialectFilterRule() {
		return getDialectFilterAccess().getRule();
	}
	
	//DialectIdFilter:
	//	DIALECTID_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=Dialect | ROUND_OPEN dialects+=Dialect dialects+=Dialect*
	//	ROUND_CLOSE);
	public DialectIdFilterElements getDialectIdFilterAccess() {
		return pDialectIdFilter;
	}
	
	public ParserRule getDialectIdFilterRule() {
		return getDialectIdFilterAccess().getRule();
	}
	
	//DialectAliasFilter:
	//	DIALECT_KEYWORD op=(EQUAL | NOT_EQUAL) (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias
	//	dialects+=DialectAlias* ROUND_CLOSE);
	public DialectAliasFilterElements getDialectAliasFilterAccess() {
		return pDialectAliasFilter;
	}
	
	public ParserRule getDialectAliasFilterRule() {
		return getDialectAliasFilterAccess().getRule();
	}
	
	//Dialect:
	//	languageRefSetId=EclConceptReference acceptability=Acceptability?;
	public DialectElements getDialectAccess() {
		return pDialect;
	}
	
	public ParserRule getDialectRule() {
		return getDialectAccess().getRule();
	}
	
	//DialectAlias:
	//	alias=DialectAliasValue acceptability=Acceptability?;
	public DialectAliasElements getDialectAliasAccess() {
		return pDialectAlias;
	}
	
	public ParserRule getDialectAliasRule() {
		return getDialectAliasAccess().getRule();
	}
	
	//Acceptability:
	//	AcceptabilityIdSet | AcceptabilityTokenSet;
	public AcceptabilityElements getAcceptabilityAccess() {
		return pAcceptability;
	}
	
	public ParserRule getAcceptabilityRule() {
		return getAcceptabilityAccess().getRule();
	}
	
	//AcceptabilityIdSet:
	//	acceptabilities=EclConceptReferenceSet;
	public AcceptabilityIdSetElements getAcceptabilityIdSetAccess() {
		return pAcceptabilityIdSet;
	}
	
	public ParserRule getAcceptabilityIdSetRule() {
		return getAcceptabilityIdSetAccess().getRule();
	}
	
	//AcceptabilityTokenSet:
	//	ROUND_OPEN acceptabilities+=Alphabetical acceptabilities+=Alphabetical* ROUND_CLOSE;
	public AcceptabilityTokenSetElements getAcceptabilityTokenSetAccess() {
		return pAcceptabilityTokenSet;
	}
	
	public ParserRule getAcceptabilityTokenSetRule() {
		return getAcceptabilityTokenSetAccess().getRule();
	}
	
	//// hidden grammar rules
	//SnomedIdentifier hidden():
	//	DIGIT_NONZERO (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO) (DIGIT_NONZERO | ZERO)
	//	(DIGIT_NONZERO | ZERO)+;
	public SnomedIdentifierElements getSnomedIdentifierAccess() {
		return pSnomedIdentifier;
	}
	
	public ParserRule getSnomedIdentifierRule() {
		return getSnomedIdentifierAccess().getRule();
	}
	
	//NonNegativeInteger ecore::EInt hidden():
	//	ZERO | DIGIT_NONZERO (DIGIT_NONZERO | ZERO)*;
	public NonNegativeIntegerElements getNonNegativeIntegerAccess() {
		return pNonNegativeInteger;
	}
	
	public ParserRule getNonNegativeIntegerRule() {
		return getNonNegativeIntegerAccess().getRule();
	}
	
	//MaxValue ecore::EInt hidden():
	//	NonNegativeInteger | WILDCARD;
	public MaxValueElements getMaxValueAccess() {
		return pMaxValue;
	}
	
	public ParserRule getMaxValueRule() {
		return getMaxValueAccess().getRule();
	}
	
	//Integer ecore::EInt hidden():
	//	(PLUS | DASH)? NonNegativeInteger;
	public IntegerElements getIntegerAccess() {
		return pInteger;
	}
	
	public ParserRule getIntegerRule() {
		return getIntegerAccess().getRule();
	}
	
	//Decimal ecore::EBigDecimal hidden():
	//	(PLUS | DASH)? NonNegativeDecimal;
	public DecimalElements getDecimalAccess() {
		return pDecimal;
	}
	
	public ParserRule getDecimalRule() {
		return getDecimalAccess().getRule();
	}
	
	//NonNegativeDecimal ecore::EBigDecimal hidden():
	//	NonNegativeInteger DOT (DIGIT_NONZERO | ZERO)*;
	public NonNegativeDecimalElements getNonNegativeDecimalAccess() {
		return pNonNegativeDecimal;
	}
	
	public ParserRule getNonNegativeDecimalRule() {
		return getNonNegativeDecimalAccess().getRule();
	}
	
	//Boolean ecore::EBoolean hidden():
	//	'true' | 'false';
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//DialectAliasValue hidden():
	//	ALPHA (DASH | ALPHA | ZERO | DIGIT_NONZERO)*;
	public DialectAliasValueElements getDialectAliasValueAccess() {
		return pDialectAliasValue;
	}
	
	public ParserRule getDialectAliasValueRule() {
		return getDialectAliasValueAccess().getRule();
	}
	
	//Alphabetical hidden():
	//	ALPHA+;
	public AlphabeticalElements getAlphabeticalAccess() {
		return pAlphabetical;
	}
	
	public ParserRule getAlphabeticalRule() {
		return getAlphabeticalAccess().getRule();
	}
	
	//terminal TERM_STRING:
	//	"|" !"|"* "|";
	public TerminalRule getTERM_STRINGRule() {
		return tTERM_STRING;
	}
	
	//terminal REVERSED:
	//	'R';
	public TerminalRule getREVERSEDRule() {
		return tREVERSED;
	}
	
	//terminal TO:
	//	'..';
	public TerminalRule getTORule() {
		return tTO;
	}
	
	//terminal COMMA:
	//	',';
	public TerminalRule getCOMMARule() {
		return tCOMMA;
	}
	
	//terminal CONJUNCTION:
	//	('a' | 'A') ('n' | 'N') ('d' | 'D');
	public TerminalRule getCONJUNCTIONRule() {
		return tCONJUNCTION;
	}
	
	//terminal DISJUNCTION:
	//	('o' | 'O') ('r' | 'R');
	public TerminalRule getDISJUNCTIONRule() {
		return tDISJUNCTION;
	}
	
	//terminal EXCLUSION:
	//	('m' | 'M') ('i' | 'I') ('n' | 'N') ('u' | 'U') ('s' | 'S');
	public TerminalRule getEXCLUSIONRule() {
		return tEXCLUSION;
	}
	
	//terminal ZERO:
	//	'0';
	public TerminalRule getZERORule() {
		return tZERO;
	}
	
	//terminal DIGIT_NONZERO:
	//	'1'..'9';
	public TerminalRule getDIGIT_NONZERORule() {
		return tDIGIT_NONZERO;
	}
	
	//terminal COLON:
	//	':';
	public TerminalRule getCOLONRule() {
		return tCOLON;
	}
	
	//terminal CURLY_OPEN:
	//	'{';
	public TerminalRule getCURLY_OPENRule() {
		return tCURLY_OPEN;
	}
	
	//terminal CURLY_CLOSE:
	//	'}';
	public TerminalRule getCURLY_CLOSERule() {
		return tCURLY_CLOSE;
	}
	
	//terminal ROUND_OPEN:
	//	'(';
	public TerminalRule getROUND_OPENRule() {
		return tROUND_OPEN;
	}
	
	//terminal ROUND_CLOSE:
	//	')';
	public TerminalRule getROUND_CLOSERule() {
		return tROUND_CLOSE;
	}
	
	//terminal SQUARE_OPEN:
	//	'[';
	public TerminalRule getSQUARE_OPENRule() {
		return tSQUARE_OPEN;
	}
	
	//terminal SQUARE_CLOSE:
	//	']';
	public TerminalRule getSQUARE_CLOSERule() {
		return tSQUARE_CLOSE;
	}
	
	//terminal PLUS:
	//	'+';
	public TerminalRule getPLUSRule() {
		return tPLUS;
	}
	
	//terminal DASH:
	//	'-';
	public TerminalRule getDASHRule() {
		return tDASH;
	}
	
	//terminal CARET:
	//	'^';
	public TerminalRule getCARETRule() {
		return tCARET;
	}
	
	//terminal DOT:
	//	'.';
	public TerminalRule getDOTRule() {
		return tDOT;
	}
	
	//terminal WILDCARD:
	//	'*';
	public TerminalRule getWILDCARDRule() {
		return tWILDCARD;
	}
	
	//terminal EQUAL:
	//	'=';
	public TerminalRule getEQUALRule() {
		return tEQUAL;
	}
	
	//terminal NOT_EQUAL:
	//	'!=';
	public TerminalRule getNOT_EQUALRule() {
		return tNOT_EQUAL;
	}
	
	//terminal LT:
	//	'<';
	public TerminalRule getLTRule() {
		return tLT;
	}
	
	//terminal GT:
	//	'>';
	public TerminalRule getGTRule() {
		return tGT;
	}
	
	//terminal DBL_LT:
	//	'<<';
	public TerminalRule getDBL_LTRule() {
		return tDBL_LT;
	}
	
	//terminal DBL_GT:
	//	'>>';
	public TerminalRule getDBL_GTRule() {
		return tDBL_GT;
	}
	
	//terminal LT_EM:
	//	'<!';
	public TerminalRule getLT_EMRule() {
		return tLT_EM;
	}
	
	//terminal DBL_LT_EM:
	//	'<<!';
	public TerminalRule getDBL_LT_EMRule() {
		return tDBL_LT_EM;
	}
	
	//terminal GT_EM:
	//	'>!';
	public TerminalRule getGT_EMRule() {
		return tGT_EM;
	}
	
	//terminal DBL_GT_EM:
	//	'>>!';
	public TerminalRule getDBL_GT_EMRule() {
		return tDBL_GT_EM;
	}
	
	//terminal GTE:
	//	'>=';
	public TerminalRule getGTERule() {
		return tGTE;
	}
	
	//terminal LTE:
	//	'<=';
	public TerminalRule getLTERule() {
		return tLTE;
	}
	
	//terminal HASH:
	//	'#';
	public TerminalRule getHASHRule() {
		return tHASH;
	}
	
	//terminal DOUBLE_CURLY_OPEN:
	//	'{{';
	public TerminalRule getDOUBLE_CURLY_OPENRule() {
		return tDOUBLE_CURLY_OPEN;
	}
	
	//terminal DOUBLE_CURLY_CLOSE:
	//	'}}';
	public TerminalRule getDOUBLE_CURLY_CLOSERule() {
		return tDOUBLE_CURLY_CLOSE;
	}
	
	//terminal TERM_KEYWORD:
	//	('t' | 'T') ('e' | 'E') ('r' | 'R') ('m' | 'M');
	public TerminalRule getTERM_KEYWORDRule() {
		return tTERM_KEYWORD;
	}
	
	//terminal LANGUAGE_KEYWORD:
	//	('l' | 'L') ('a' | 'A') ('n' | 'N') ('g' | 'G') ('u' | 'U') ('a' | 'A') ('g' | 'G') ('e' | 'E');
	public TerminalRule getLANGUAGE_KEYWORDRule() {
		return tLANGUAGE_KEYWORD;
	}
	
	//terminal TYPEID_KEYWORD:
	//	('t' | 'T') ('y' | 'Y') ('p' | 'P') ('e' | 'E') ('i' | 'I') ('d' | 'D');
	public TerminalRule getTYPEID_KEYWORDRule() {
		return tTYPEID_KEYWORD;
	}
	
	//terminal TYPE_KEYWORD:
	//	('t' | 'T') ('y' | 'Y') ('p' | 'P') ('e' | 'E');
	public TerminalRule getTYPE_KEYWORDRule() {
		return tTYPE_KEYWORD;
	}
	
	//terminal DIALECTID_KEYWORD:
	//	('d' | 'D') ('i' | 'I') ('a' | 'A') ('l' | 'L') ('e' | 'E') ('c' | 'C') ('t' | 'T') ('i' | 'I') ('d' | 'D');
	public TerminalRule getDIALECTID_KEYWORDRule() {
		return tDIALECTID_KEYWORD;
	}
	
	//terminal DIALECT_KEYWORD:
	//	('d' | 'D') ('i' | 'I') ('a' | 'A') ('l' | 'L') ('e' | 'E') ('c' | 'C') ('t' | 'T');
	public TerminalRule getDIALECT_KEYWORDRule() {
		return tDIALECT_KEYWORD;
	}
	
	//terminal ALPHA:
	//	'a'..'z';
	public TerminalRule getALPHARule() {
		return tALPHA;
	}
	
	//terminal WS:
	//	' ' | '\t' | '\n' | '\r';
	public TerminalRule getWSRule() {
		return tWS;
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return tML_COMMENT;
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return tSL_COMMENT;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
	}
}
