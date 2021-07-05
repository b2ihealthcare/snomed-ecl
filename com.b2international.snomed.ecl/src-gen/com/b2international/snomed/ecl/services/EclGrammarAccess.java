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
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrExpressionConstraint ExpressionConstraint:
		//	AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*;
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
		
		//AndExpressionConstraint ExpressionConstraint:
		//	ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA)
		//	right=ExclusionExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA)
		//right=ExclusionExpressionConstraint)*
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
		
		//ExclusionExpressionConstraint ExpressionConstraint:
		//	RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD
		//	right=RefinedExpressionConstraint)?;
		@Override public ParserRule getRule() { return rule; }
		
		//RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD
		//right=RefinedExpressionConstraint)?
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
		private final RuleCall cFilteredExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cDottedExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cAttributeAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cAttributeFilteredExpressionConstraintParserRuleCall_1_2_0 = (RuleCall)cAttributeAssignment_1_2.eContents().get(0);
		
		//DottedExpressionConstraint ExpressionConstraint:
		//	FilteredExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT
		//	attribute=FilteredExpressionConstraint)*;
		@Override public ParserRule getRule() { return rule; }
		
		//FilteredExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT
		//attribute=FilteredExpressionConstraint)*
		public Group getGroup() { return cGroup; }
		
		//FilteredExpressionConstraint
		public RuleCall getFilteredExpressionConstraintParserRuleCall_0() { return cFilteredExpressionConstraintParserRuleCall_0; }
		
		//({DottedExpressionConstraint.constraint=current} DOT attribute=FilteredExpressionConstraint)*
		public Group getGroup_1() { return cGroup_1; }
		
		//{DottedExpressionConstraint.constraint=current}
		public Action getDottedExpressionConstraintConstraintAction_1_0() { return cDottedExpressionConstraintConstraintAction_1_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1_1() { return cDOTTerminalRuleCall_1_1; }
		
		//attribute=FilteredExpressionConstraint
		public Assignment getAttributeAssignment_1_2() { return cAttributeAssignment_1_2; }
		
		//FilteredExpressionConstraint
		public RuleCall getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0() { return cAttributeFilteredExpressionConstraintParserRuleCall_1_2_0; }
	}
	public class FilteredExpressionConstraintElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cSubExpressionConstraintParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cFilteredExpressionConstraintConstraintAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cFilterAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cFilterFilterConstraintParserRuleCall_1_1_0 = (RuleCall)cFilterAssignment_1_1.eContents().get(0);
		
		//FilteredExpressionConstraint ExpressionConstraint:
		//	SubExpressionConstraint ({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*;
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
		private final RuleCall cEclFocusConceptParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		
		//SubExpressionConstraint ExpressionConstraint:
		//	ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf |
		//	AncestorOrSelfOf | EclFocusConcept;
		@Override public ParserRule getRule() { return rule; }
		
		//ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf | AncestorOrSelfOf
		//| EclFocusConcept
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
		private final RuleCall cTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0 = (RuleCall)cTermAssignment_1.eContents().get(0);
		
		//EclConceptReference:
		//	id=SnomedIdentifier term=PIPE_DELIMITED_STRING?;
		@Override public ParserRule getRule() { return rule; }
		
		//id=SnomedIdentifier term=PIPE_DELIMITED_STRING?
		public Group getGroup() { return cGroup; }
		
		//id=SnomedIdentifier
		public Assignment getIdAssignment_0() { return cIdAssignment_0; }
		
		//SnomedIdentifier
		public RuleCall getIdSnomedIdentifierParserRuleCall_0_0() { return cIdSnomedIdentifierParserRuleCall_0_0; }
		
		//term=PIPE_DELIMITED_STRING?
		public Assignment getTermAssignment_1() { return cTermAssignment_1; }
		
		//PIPE_DELIMITED_STRING
		public RuleCall getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0() { return cTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0; }
	}
	public class EclConceptReferenceSetElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Assignment cConceptsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cConceptsEclConceptReferenceParserRuleCall_1_0 = (RuleCall)cConceptsAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//EclConceptReferenceSet:
		//	ROUND_OPEN concepts+=EclConceptReference+ ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN concepts+=EclConceptReference+ ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//concepts+=EclConceptReference+
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
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1 = (RuleCall)cGroup_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_0_2 = (Assignment)cGroup_1_0.eContents().get(2);
		private final RuleCall cRightAndRefinementParserRuleCall_1_0_2_0 = (RuleCall)cRightAssignment_1_0_2.eContents().get(0);
		
		//OrRefinement EclRefinement:
		//	AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*
		public Group getGroup() { return cGroup; }
		
		//AndRefinement
		public RuleCall getAndRefinementParserRuleCall_0() { return cAndRefinementParserRuleCall_0; }
		
		//-> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)
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
		
		//AndRefinement EclRefinement:
		//	SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*;
		@Override public ParserRule getRule() { return rule; }
		
		//SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*
		public Group getGroup() { return cGroup; }
		
		//SubRefinement
		public RuleCall getSubRefinementParserRuleCall_0() { return cSubRefinementParserRuleCall_0; }
		
		//-> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*
		public Group getGroup_1() { return cGroup_1; }
		
		//({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)
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
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightAndAttributeSetParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//OrAttributeSet EclRefinement:
		//	AndAttributeSet ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*;
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
		
		//AndAttributeSet EclRefinement:
		//	SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*;
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
		private final RuleCall cAttributeFilteredExpressionConstraintParserRuleCall_2_0 = (RuleCall)cAttributeAssignment_2.eContents().get(0);
		private final Assignment cComparisonAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cComparisonComparisonParserRuleCall_3_0 = (RuleCall)cComparisonAssignment_3.eContents().get(0);
		
		//AttributeConstraint:
		//	cardinality=Cardinality? reversed?=REVERSED? attribute=FilteredExpressionConstraint comparison=Comparison?;
		@Override public ParserRule getRule() { return rule; }
		
		//cardinality=Cardinality? reversed?=REVERSED? attribute=FilteredExpressionConstraint comparison=Comparison?
		public Group getGroup() { return cGroup; }
		
		//cardinality=Cardinality?
		public Assignment getCardinalityAssignment_0() { return cCardinalityAssignment_0; }
		
		//Cardinality
		public RuleCall getCardinalityCardinalityParserRuleCall_0_0() { return cCardinalityCardinalityParserRuleCall_0_0; }
		
		//reversed?=REVERSED?
		public Assignment getReversedAssignment_1() { return cReversedAssignment_1; }
		
		//REVERSED
		public RuleCall getReversedREVERSEDTerminalRuleCall_1_0() { return cReversedREVERSEDTerminalRuleCall_1_0; }
		
		//attribute=FilteredExpressionConstraint
		public Assignment getAttributeAssignment_2() { return cAttributeAssignment_2; }
		
		//FilteredExpressionConstraint
		public RuleCall getAttributeFilteredExpressionConstraintParserRuleCall_2_0() { return cAttributeFilteredExpressionConstraintParserRuleCall_2_0; }
		
		//comparison=Comparison?
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueFilteredExpressionConstraintParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//AttributeComparison:
		//	op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint;
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Assignment cValueAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cValueBooleanParserRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//BooleanValueComparison:
		//	op=NON_NUMERIC_OPERATOR value=Boolean;
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
		private final RuleCall cValueSTRINGTerminalRuleCall_1_0 = (RuleCall)cValueAssignment_1.eContents().get(0);
		
		//StringValueComparison:
		//	op=NON_NUMERIC_OPERATOR value=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR value=STRING
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//value=STRING
		public Assignment getValueAssignment_1() { return cValueAssignment_1; }
		
		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_0() { return cValueSTRINGTerminalRuleCall_1_0; }
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
		//	op=NUMERIC_OPERATOR HASH value=Integer;
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
		//	op=NUMERIC_OPERATOR HASH value=Decimal;
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
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cRightAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cRightConjunctionFilterParserRuleCall_1_2_0 = (RuleCall)cRightAssignment_1_2.eContents().get(0);
		
		//// Conjunction (OR) of filters is an extension to ECL 1.5
		//DisjunctionFilter Filter:
		//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*;
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
		
		//// Using the "AND" keyword for disjunctions is an extension to ECL 1.5
		//ConjunctionFilter Filter:
		//	PropertyFilter ({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*;
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
		private final RuleCall cLanguageFilterParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cTypeFilterParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDialectFilterParserRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cActiveFilterParserRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cPreferredInFilterParserRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cAcceptableInFilterParserRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cLanguageRefSetFilterParserRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cModuleFilterParserRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cSemanticTagFilterParserRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cEffectiveTimeFilterParserRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cCaseSignificanceFilterParserRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cNestedFilterParserRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		
		//PropertyFilter:
		//	TermFilter
		//	| LanguageFilter
		//	| TypeFilter
		//	| DialectFilter
		//	// QL 0.1 filters (ECL extensions)	 
		//	| ActiveFilter
		//	| PreferredInFilter
		//	| AcceptableInFilter
		//	| LanguageRefSetFilter
		//	| ModuleFilter
		//	| SemanticTagFilter
		//	| EffectiveTimeFilter
		//	| CaseSignificanceFilter
		//	// Allows grouping filters for boolean operators
		//	| NestedFilter;
		@Override public ParserRule getRule() { return rule; }
		
		//// ECL 1.5 filters
		//TermFilter | LanguageFilter | TypeFilter | DialectFilter // QL 0.1 filters (ECL extensions)	 
		//| ActiveFilter | PreferredInFilter | AcceptableInFilter | LanguageRefSetFilter | ModuleFilter | SemanticTagFilter |
		//EffectiveTimeFilter | CaseSignificanceFilter // Allows grouping filters for boolean operators
		//| NestedFilter
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//// ECL 1.5 filters
		//TermFilter
		public RuleCall getTermFilterParserRuleCall_0() { return cTermFilterParserRuleCall_0; }
		
		//LanguageFilter
		public RuleCall getLanguageFilterParserRuleCall_1() { return cLanguageFilterParserRuleCall_1; }
		
		//TypeFilter
		public RuleCall getTypeFilterParserRuleCall_2() { return cTypeFilterParserRuleCall_2; }
		
		//DialectFilter
		public RuleCall getDialectFilterParserRuleCall_3() { return cDialectFilterParserRuleCall_3; }
		
		//ActiveFilter
		public RuleCall getActiveFilterParserRuleCall_4() { return cActiveFilterParserRuleCall_4; }
		
		//PreferredInFilter
		public RuleCall getPreferredInFilterParserRuleCall_5() { return cPreferredInFilterParserRuleCall_5; }
		
		//AcceptableInFilter
		public RuleCall getAcceptableInFilterParserRuleCall_6() { return cAcceptableInFilterParserRuleCall_6; }
		
		//LanguageRefSetFilter
		public RuleCall getLanguageRefSetFilterParserRuleCall_7() { return cLanguageRefSetFilterParserRuleCall_7; }
		
		//ModuleFilter
		public RuleCall getModuleFilterParserRuleCall_8() { return cModuleFilterParserRuleCall_8; }
		
		//SemanticTagFilter
		public RuleCall getSemanticTagFilterParserRuleCall_9() { return cSemanticTagFilterParserRuleCall_9; }
		
		//EffectiveTimeFilter
		public RuleCall getEffectiveTimeFilterParserRuleCall_10() { return cEffectiveTimeFilterParserRuleCall_10; }
		
		//CaseSignificanceFilter
		public RuleCall getCaseSignificanceFilterParserRuleCall_11() { return cCaseSignificanceFilterParserRuleCall_11; }
		
		//NestedFilter
		public RuleCall getNestedFilterParserRuleCall_12() { return cNestedFilterParserRuleCall_12; }
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Assignment cLexicalSearchTypeAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final RuleCall cLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0 = (RuleCall)cLexicalSearchTypeAssignment_1_0.eContents().get(0);
		private final RuleCall cCOLONTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Assignment cTermAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermSTRINGTerminalRuleCall_2_0 = (RuleCall)cTermAssignment_2.eContents().get(0);
		
		//// no special treatment for the term filter STRING, we allow everything for any lexical search type
		//TypedTermFilter:
		//	op=NON_NUMERIC_OPERATOR (lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR (lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//(lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)?
		public Group getGroup_1() { return cGroup_1; }
		
		//lexicalSearchType=LEXICAL_SEARCH_TYPE
		public Assignment getLexicalSearchTypeAssignment_1_0() { return cLexicalSearchTypeAssignment_1_0; }
		
		//LEXICAL_SEARCH_TYPE
		public RuleCall getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0() { return cLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0; }
		
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_0_0 = (RuleCall)cOpAssignment_0.eContents().get(0);
		private final RuleCall cROUND_OPENTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cTermsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cTermsTypedTermFilterParserRuleCall_2_0 = (RuleCall)cTermsAssignment_2.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_3 = (RuleCall)cGroup.eContents().get(3);
		
		//TypedTermFilterSet:
		//	op=NON_NUMERIC_OPERATOR ROUND_OPEN terms+=TypedTermFilter+ ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//op=NON_NUMERIC_OPERATOR ROUND_OPEN terms+=TypedTermFilter+ ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_0() { return cOpAssignment_0; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_0_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_0_0; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_1() { return cROUND_OPENTerminalRuleCall_1; }
		
		//terms+=TypedTermFilter+
		public Assignment getTermsAssignment_2() { return cTermsAssignment_2; }
		
		//TypedTermFilter
		public RuleCall getTermsTypedTermFilterParserRuleCall_2_0() { return cTermsTypedTermFilterParserRuleCall_2_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_3() { return cROUND_CLOSETerminalRuleCall_3; }
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
		//	LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN languageCodes+=UnquotedString+
		//	ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN languageCodes+=UnquotedString+
		//ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//LANGUAGE_KEYWORD
		public RuleCall getLANGUAGE_KEYWORDTerminalRuleCall_0() { return cLANGUAGE_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(languageCodes+=UnquotedString | ROUND_OPEN languageCodes+=UnquotedString+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//languageCodes+=UnquotedString
		public Assignment getLanguageCodesAssignment_2_0() { return cLanguageCodesAssignment_2_0; }
		
		//UnquotedString
		public RuleCall getLanguageCodesUnquotedStringParserRuleCall_2_0_0() { return cLanguageCodesUnquotedStringParserRuleCall_2_0_0; }
		
		//ROUND_OPEN languageCodes+=UnquotedString+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//languageCodes+=UnquotedString+
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Assignment cTypeAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final Alternatives cTypeAlternatives_2_0 = (Alternatives)cTypeAssignment_2.eContents().get(0);
		private final RuleCall cTypeEclConceptReferenceParserRuleCall_2_0_0 = (RuleCall)cTypeAlternatives_2_0.eContents().get(0);
		private final RuleCall cTypeEclConceptReferenceSetParserRuleCall_2_0_1 = (RuleCall)cTypeAlternatives_2_0.eContents().get(1);
		
		//TypeIdFilter:
		//	TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=(EclConceptReference | EclConceptReferenceSet);
		@Override public ParserRule getRule() { return rule; }
		
		//TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=(EclConceptReference | EclConceptReferenceSet)
		public Group getGroup() { return cGroup; }
		
		//TYPEID_KEYWORD
		public RuleCall getTYPEID_KEYWORDTerminalRuleCall_0() { return cTYPEID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
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
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_1_0 = (RuleCall)cOpAssignment_1.eContents().get(0);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final Assignment cTokensAssignment_2_0 = (Assignment)cAlternatives_2.eContents().get(0);
		private final RuleCall cTokensUnquotedStringParserRuleCall_2_0_0 = (RuleCall)cTokensAssignment_2_0.eContents().get(0);
		private final Group cGroup_2_1 = (Group)cAlternatives_2.eContents().get(1);
		private final RuleCall cROUND_OPENTerminalRuleCall_2_1_0 = (RuleCall)cGroup_2_1.eContents().get(0);
		private final Assignment cTokensAssignment_2_1_1 = (Assignment)cGroup_2_1.eContents().get(1);
		private final RuleCall cTokensUnquotedStringParserRuleCall_2_1_1_0 = (RuleCall)cTokensAssignment_2_1_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2_1_2 = (RuleCall)cGroup_2_1.eContents().get(2);
		
		//// Any unquoted string is allowed as a type token here, validator will restrict it to the available set
		//TypeTokenFilter:
		//	TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN tokens+=UnquotedString+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN tokens+=UnquotedString+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//TYPE_KEYWORD
		public RuleCall getTYPE_KEYWORDTerminalRuleCall_0() { return cTYPE_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(tokens+=UnquotedString | ROUND_OPEN tokens+=UnquotedString+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//tokens+=UnquotedString
		public Assignment getTokensAssignment_2_0() { return cTokensAssignment_2_0; }
		
		//UnquotedString
		public RuleCall getTokensUnquotedStringParserRuleCall_2_0_0() { return cTokensUnquotedStringParserRuleCall_2_0_0; }
		
		//ROUND_OPEN tokens+=UnquotedString+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//tokens+=UnquotedString+
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
		//	DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN dialects+=Dialect+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN dialects+=Dialect+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECTID_KEYWORD
		public RuleCall getDIALECTID_KEYWORDTerminalRuleCall_0() { return cDIALECTID_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(dialects+=Dialect | ROUND_OPEN dialects+=Dialect+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=Dialect
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//Dialect
		public RuleCall getDialectsDialectParserRuleCall_2_0_0() { return cDialectsDialectParserRuleCall_2_0_0; }
		
		//ROUND_OPEN dialects+=Dialect+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//dialects+=Dialect+
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
		//	DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias+ ROUND_CLOSE);
		@Override public ParserRule getRule() { return rule; }
		
		//DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias+ ROUND_CLOSE)
		public Group getGroup() { return cGroup; }
		
		//DIALECT_KEYWORD
		public RuleCall getDIALECT_KEYWORDTerminalRuleCall_0() { return cDIALECT_KEYWORDTerminalRuleCall_0; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_1() { return cOpAssignment_1; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_1_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_1_0; }
		
		//(dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias+ ROUND_CLOSE)
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//dialects+=DialectAlias
		public Assignment getDialectsAssignment_2_0() { return cDialectsAssignment_2_0; }
		
		//DialectAlias
		public RuleCall getDialectsDialectAliasParserRuleCall_2_0_0() { return cDialectsDialectAliasParserRuleCall_2_0_0; }
		
		//ROUND_OPEN dialects+=DialectAlias+ ROUND_CLOSE
		public Group getGroup_2_1() { return cGroup_2_1; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_2_1_0() { return cROUND_OPENTerminalRuleCall_2_1_0; }
		
		//dialects+=DialectAlias+
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
		private final RuleCall cWSTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cAcceptabilityAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cAcceptabilityAcceptabilityParserRuleCall_2_0 = (RuleCall)cAcceptabilityAssignment_2.eContents().get(0);
		
		//// Whitespace is significant (indicates an unquoted string boundary) in this rule, so WS tokens can not be hidden
		//DialectAlias hidden():
		//	alias=DialectAliasValue WS* acceptability=Acceptability?;
		@Override public ParserRule getRule() { return rule; }
		
		//alias=DialectAliasValue WS* acceptability=Acceptability?
		public Group getGroup() { return cGroup; }
		
		//alias=DialectAliasValue
		public Assignment getAliasAssignment_0() { return cAliasAssignment_0; }
		
		//DialectAliasValue
		public RuleCall getAliasDialectAliasValueParserRuleCall_0_0() { return cAliasDialectAliasValueParserRuleCall_0_0; }
		
		//WS*
		public RuleCall getWSTerminalRuleCall_1() { return cWSTerminalRuleCall_1; }
		
		//acceptability=Acceptability?
		public Assignment getAcceptabilityAssignment_2() { return cAcceptabilityAssignment_2; }
		
		//Acceptability
		public RuleCall getAcceptabilityAcceptabilityParserRuleCall_2_0() { return cAcceptabilityAcceptabilityParserRuleCall_2_0; }
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
		private final RuleCall cAcceptabilitiesUnquotedStringParserRuleCall_1_0 = (RuleCall)cAcceptabilitiesAssignment_1.eContents().get(0);
		private final RuleCall cROUND_CLOSETerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		
		//AcceptabilityTokenSet:
		//	ROUND_OPEN acceptabilities+=UnquotedString+ ROUND_CLOSE;
		@Override public ParserRule getRule() { return rule; }
		
		//ROUND_OPEN acceptabilities+=UnquotedString+ ROUND_CLOSE
		public Group getGroup() { return cGroup; }
		
		//ROUND_OPEN
		public RuleCall getROUND_OPENTerminalRuleCall_0() { return cROUND_OPENTerminalRuleCall_0; }
		
		//acceptabilities+=UnquotedString+
		public Assignment getAcceptabilitiesAssignment_1() { return cAcceptabilitiesAssignment_1; }
		
		//UnquotedString
		public RuleCall getAcceptabilitiesUnquotedStringParserRuleCall_1_0() { return cAcceptabilitiesUnquotedStringParserRuleCall_1_0; }
		
		//ROUND_CLOSE
		public RuleCall getROUND_CLOSETerminalRuleCall_2() { return cROUND_CLOSETerminalRuleCall_2; }
	}
	public class ActiveFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ActiveFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDOMAINParserRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cACTIVE_KEYWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cActiveAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cActiveBooleanParserRuleCall_3_0 = (RuleCall)cActiveAssignment_3.eContents().get(0);
		
		//ActiveFilter:
		//	(domain=DOMAIN DOT)? ACTIVE_KEYWORD EQUAL active=Boolean;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=DOMAIN DOT)? ACTIVE_KEYWORD EQUAL active=Boolean
		public Group getGroup() { return cGroup; }
		
		//(domain=DOMAIN DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=DOMAIN
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//DOMAIN
		public RuleCall getDomainDOMAINParserRuleCall_0_0_0() { return cDomainDOMAINParserRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//ACTIVE_KEYWORD
		public RuleCall getACTIVE_KEYWORDTerminalRuleCall_1() { return cACTIVE_KEYWORDTerminalRuleCall_1; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//active=Boolean
		public Assignment getActiveAssignment_3() { return cActiveAssignment_3; }
		
		//Boolean
		public RuleCall getActiveBooleanParserRuleCall_3_0() { return cActiveBooleanParserRuleCall_3_0; }
	}
	public class ModuleFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ModuleFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDOMAINParserRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cMODULEID_KEYWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_2 = (RuleCall)cGroup.eContents().get(2);
		private final Assignment cModuleIdAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cModuleIdExpressionConstraintParserRuleCall_3_0 = (RuleCall)cModuleIdAssignment_3.eContents().get(0);
		
		//ModuleFilter:
		//	(domain=DOMAIN DOT)? MODULEID_KEYWORD EQUAL moduleId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=DOMAIN DOT)? MODULEID_KEYWORD EQUAL moduleId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//(domain=DOMAIN DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=DOMAIN
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//DOMAIN
		public RuleCall getDomainDOMAINParserRuleCall_0_0_0() { return cDomainDOMAINParserRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//MODULEID_KEYWORD
		public RuleCall getMODULEID_KEYWORDTerminalRuleCall_1() { return cMODULEID_KEYWORDTerminalRuleCall_1; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_2() { return cEQUALTerminalRuleCall_2; }
		
		//moduleId=ExpressionConstraint
		public Assignment getModuleIdAssignment_3() { return cModuleIdAssignment_3; }
		
		//ExpressionConstraint
		public RuleCall getModuleIdExpressionConstraintParserRuleCall_3_0() { return cModuleIdExpressionConstraintParserRuleCall_3_0; }
	}
	public class SemanticTagFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SemanticTagFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDOMAINParserRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cSEMANTIC_TAG_KEYWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOpNON_NUMERIC_OPERATORParserRuleCall_2_0 = (RuleCall)cOpAssignment_2.eContents().get(0);
		private final Assignment cSemanticTagAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cSemanticTagSTRINGTerminalRuleCall_3_0 = (RuleCall)cSemanticTagAssignment_3.eContents().get(0);
		
		//SemanticTagFilter:
		//	(domain=DOMAIN DOT)? SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=DOMAIN DOT)? SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING
		public Group getGroup() { return cGroup; }
		
		//(domain=DOMAIN DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=DOMAIN
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//DOMAIN
		public RuleCall getDomainDOMAINParserRuleCall_0_0_0() { return cDomainDOMAINParserRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//SEMANTIC_TAG_KEYWORD
		public RuleCall getSEMANTIC_TAG_KEYWORDTerminalRuleCall_1() { return cSEMANTIC_TAG_KEYWORDTerminalRuleCall_1; }
		
		//op=NON_NUMERIC_OPERATOR
		public Assignment getOpAssignment_2() { return cOpAssignment_2; }
		
		//NON_NUMERIC_OPERATOR
		public RuleCall getOpNON_NUMERIC_OPERATORParserRuleCall_2_0() { return cOpNON_NUMERIC_OPERATORParserRuleCall_2_0; }
		
		//semanticTag=STRING
		public Assignment getSemanticTagAssignment_3() { return cSemanticTagAssignment_3; }
		
		//STRING
		public RuleCall getSemanticTagSTRINGTerminalRuleCall_3_0() { return cSemanticTagSTRINGTerminalRuleCall_3_0; }
	}
	public class EffectiveTimeFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EffectiveTimeFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cGroup.eContents().get(0);
		private final Assignment cDomainAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final RuleCall cDomainDOMAINParserRuleCall_0_0_0 = (RuleCall)cDomainAssignment_0_0.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_0_1 = (RuleCall)cGroup_0.eContents().get(1);
		private final RuleCall cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cOpAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cOpNUMERIC_OPERATORParserRuleCall_2_0 = (RuleCall)cOpAssignment_2.eContents().get(0);
		private final Assignment cEffectiveTimeAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cEffectiveTimeSTRINGTerminalRuleCall_3_0 = (RuleCall)cEffectiveTimeAssignment_3.eContents().get(0);
		
		//EffectiveTimeFilter:
		//	(domain=DOMAIN DOT)? EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//(domain=DOMAIN DOT)? EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING
		public Group getGroup() { return cGroup; }
		
		//(domain=DOMAIN DOT)?
		public Group getGroup_0() { return cGroup_0; }
		
		//domain=DOMAIN
		public Assignment getDomainAssignment_0_0() { return cDomainAssignment_0_0; }
		
		//DOMAIN
		public RuleCall getDomainDOMAINParserRuleCall_0_0_0() { return cDomainDOMAINParserRuleCall_0_0_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_0_1() { return cDOTTerminalRuleCall_0_1; }
		
		//EFFECTIVE_TIME_KEYWORD
		public RuleCall getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1() { return cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1; }
		
		//op=NUMERIC_OPERATOR
		public Assignment getOpAssignment_2() { return cOpAssignment_2; }
		
		//NUMERIC_OPERATOR
		public RuleCall getOpNUMERIC_OPERATORParserRuleCall_2_0() { return cOpNUMERIC_OPERATORParserRuleCall_2_0; }
		
		//effectiveTime=STRING
		public Assignment getEffectiveTimeAssignment_3() { return cEffectiveTimeAssignment_3; }
		
		//STRING
		public RuleCall getEffectiveTimeSTRINGTerminalRuleCall_3_0() { return cEffectiveTimeSTRINGTerminalRuleCall_3_0; }
	}
	public class PreferredInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PreferredInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPREFERRED_IN_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//PreferredInFilter:
		//	PREFERRED_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//PREFERRED_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//PREFERRED_IN_KEYWORD
		public RuleCall getPREFERRED_IN_KEYWORDTerminalRuleCall_0() { return cPREFERRED_IN_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class AcceptableInFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.AcceptableInFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cACCEPTABLE_IN_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//AcceptableInFilter:
		//	ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//ACCEPTABLE_IN_KEYWORD
		public RuleCall getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0() { return cACCEPTABLE_IN_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class LanguageRefSetFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LanguageRefSetFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cLanguageRefSetIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cLanguageRefSetIdAssignment_2.eContents().get(0);
		
		//LanguageRefSetFilter:
		//	LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//LANGUAGE_REFSET_ID_KEYWORD
		public RuleCall getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0() { return cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//languageRefSetId=ExpressionConstraint
		public Assignment getLanguageRefSetIdAssignment_2() { return cLanguageRefSetIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0() { return cLanguageRefSetIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class CaseSignificanceFilterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CaseSignificanceFilter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cEQUALTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Assignment cCaseSignificanceIdAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cCaseSignificanceIdExpressionConstraintParserRuleCall_2_0 = (RuleCall)cCaseSignificanceIdAssignment_2.eContents().get(0);
		
		//CaseSignificanceFilter:
		//	CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=ExpressionConstraint;
		@Override public ParserRule getRule() { return rule; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=ExpressionConstraint
		public Group getGroup() { return cGroup; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD
		public RuleCall getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0() { return cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0; }
		
		//EQUAL
		public RuleCall getEQUALTerminalRuleCall_1() { return cEQUALTerminalRuleCall_1; }
		
		//caseSignificanceId=ExpressionConstraint
		public Assignment getCaseSignificanceIdAssignment_2() { return cCaseSignificanceIdAssignment_2; }
		
		//ExpressionConstraint
		public RuleCall getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0() { return cCaseSignificanceIdExpressionConstraintParserRuleCall_2_0; }
	}
	public class SnomedIdentifierElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDIGIT_ZEROTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		///*
		// * Datatype rules
		// */ SnomedIdentifier hidden():
		//	(DIGIT_NONZERO | DIGIT_ZERO)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DIGIT_NONZERO | DIGIT_ZERO)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_0() { return cDIGIT_NONZEROTerminalRuleCall_0; }
		
		//DIGIT_ZERO
		public RuleCall getDIGIT_ZEROTerminalRuleCall_1() { return cDIGIT_ZEROTerminalRuleCall_1; }
	}
	public class NonNegativeIntegerElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDIGIT_ZEROTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NonNegativeInteger ecore::EInt hidden():
		//	(DIGIT_NONZERO | DIGIT_ZERO)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DIGIT_NONZERO | DIGIT_ZERO)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_0() { return cDIGIT_NONZEROTerminalRuleCall_0; }
		
		//DIGIT_ZERO
		public RuleCall getDIGIT_ZEROTerminalRuleCall_1() { return cDIGIT_ZEROTerminalRuleCall_1; }
	}
	public class NonNegativeDecimalElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NonNegativeDecimal");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cNonNegativeIntegerParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final RuleCall cDOTTerminalRuleCall_1 = (RuleCall)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_2 = (Alternatives)cGroup.eContents().get(2);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_2_0 = (RuleCall)cAlternatives_2.eContents().get(0);
		private final RuleCall cDIGIT_ZEROTerminalRuleCall_2_1 = (RuleCall)cAlternatives_2.eContents().get(1);
		
		//NonNegativeDecimal ecore::EBigDecimal hidden():
		//	NonNegativeInteger DOT (DIGIT_NONZERO | DIGIT_ZERO)*;
		@Override public ParserRule getRule() { return rule; }
		
		//NonNegativeInteger DOT (DIGIT_NONZERO | DIGIT_ZERO)*
		public Group getGroup() { return cGroup; }
		
		//NonNegativeInteger
		public RuleCall getNonNegativeIntegerParserRuleCall_0() { return cNonNegativeIntegerParserRuleCall_0; }
		
		//DOT
		public RuleCall getDOTTerminalRuleCall_1() { return cDOTTerminalRuleCall_1; }
		
		//(DIGIT_NONZERO | DIGIT_ZERO)*
		public Alternatives getAlternatives_2() { return cAlternatives_2; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_2_0() { return cDIGIT_NONZEROTerminalRuleCall_2_0; }
		
		//DIGIT_ZERO
		public RuleCall getDIGIT_ZEROTerminalRuleCall_2_1() { return cDIGIT_ZEROTerminalRuleCall_2_1; }
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
	public class BooleanElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.Boolean");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cTRUE_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cFALSE_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//Boolean ecore::EBoolean hidden():
		//	TRUE_KEYWORD | FALSE_KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//TRUE_KEYWORD | FALSE_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//TRUE_KEYWORD
		public RuleCall getTRUE_KEYWORDTerminalRuleCall_0() { return cTRUE_KEYWORDTerminalRuleCall_0; }
		
		//FALSE_KEYWORD
		public RuleCall getFALSE_KEYWORDTerminalRuleCall_1() { return cFALSE_KEYWORDTerminalRuleCall_1; }
	}
	public class UnquotedStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.UnquotedString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cACCEPTABLE_IN_KEYWORDTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		private final RuleCall cDESCRIPTION_KEYWORDTerminalRuleCall_4 = (RuleCall)cAlternatives.eContents().get(4);
		private final RuleCall cPREFERRED_IN_KEYWORDTerminalRuleCall_5 = (RuleCall)cAlternatives.eContents().get(5);
		private final RuleCall cSEMANTIC_TAG_KEYWORDTerminalRuleCall_6 = (RuleCall)cAlternatives.eContents().get(6);
		private final RuleCall cDIALECTID_KEYWORDTerminalRuleCall_7 = (RuleCall)cAlternatives.eContents().get(7);
		private final RuleCall cLANGUAGE_KEYWORDTerminalRuleCall_8 = (RuleCall)cAlternatives.eContents().get(8);
		private final RuleCall cMODULEID_KEYWORDTerminalRuleCall_9 = (RuleCall)cAlternatives.eContents().get(9);
		private final RuleCall cCONCEPT_KEYWORDTerminalRuleCall_10 = (RuleCall)cAlternatives.eContents().get(10);
		private final RuleCall cDIALECT_KEYWORDTerminalRuleCall_11 = (RuleCall)cAlternatives.eContents().get(11);
		private final RuleCall cACTIVE_KEYWORDTerminalRuleCall_12 = (RuleCall)cAlternatives.eContents().get(12);
		private final RuleCall cTYPEID_KEYWORDTerminalRuleCall_13 = (RuleCall)cAlternatives.eContents().get(13);
		private final RuleCall cEXCLUSION_KEYWORDTerminalRuleCall_14 = (RuleCall)cAlternatives.eContents().get(14);
		private final RuleCall cEXACT_KEYWORDTerminalRuleCall_15 = (RuleCall)cAlternatives.eContents().get(15);
		private final RuleCall cFALSE_KEYWORDTerminalRuleCall_16 = (RuleCall)cAlternatives.eContents().get(16);
		private final RuleCall cMATCH_KEYWORDTerminalRuleCall_17 = (RuleCall)cAlternatives.eContents().get(17);
		private final RuleCall cREGEX_KEYWORDTerminalRuleCall_18 = (RuleCall)cAlternatives.eContents().get(18);
		private final RuleCall cTERM_KEYWORDTerminalRuleCall_19 = (RuleCall)cAlternatives.eContents().get(19);
		private final RuleCall cTRUE_KEYWORDTerminalRuleCall_20 = (RuleCall)cAlternatives.eContents().get(20);
		private final RuleCall cTYPE_KEYWORDTerminalRuleCall_21 = (RuleCall)cAlternatives.eContents().get(21);
		private final RuleCall cWILD_KEYWORDTerminalRuleCall_22 = (RuleCall)cAlternatives.eContents().get(22);
		private final RuleCall cCONJUNCTION_KEYWORDTerminalRuleCall_23 = (RuleCall)cAlternatives.eContents().get(23);
		private final RuleCall cDISJUNCTION_KEYWORDTerminalRuleCall_24 = (RuleCall)cAlternatives.eContents().get(24);
		private final RuleCall cREVERSEDTerminalRuleCall_25 = (RuleCall)cAlternatives.eContents().get(25);
		private final RuleCall cKEYWORDTerminalRuleCall_26 = (RuleCall)cAlternatives.eContents().get(26);
		
		//// Unquoted strings also need to cover any keywords caught by the lexer, earlier in the process. They are terminated by whitespace.
		//UnquotedString:
		//	CASE_SIGNIFICANCE_ID_KEYWORD
		//	| LANGUAGE_REFSET_ID_KEYWORD
		//	| EFFECTIVE_TIME_KEYWORD
		//	| ACCEPTABLE_IN_KEYWORD
		//	| DESCRIPTION_KEYWORD
		//	| PREFERRED_IN_KEYWORD
		//	| SEMANTIC_TAG_KEYWORD
		//	| DIALECTID_KEYWORD
		//	| LANGUAGE_KEYWORD
		//	| MODULEID_KEYWORD
		//	| CONCEPT_KEYWORD
		//	| DIALECT_KEYWORD
		//	| ACTIVE_KEYWORD
		//	| TYPEID_KEYWORD
		//	| EXCLUSION_KEYWORD
		//	| EXACT_KEYWORD
		//	| FALSE_KEYWORD
		//	| MATCH_KEYWORD
		//	| REGEX_KEYWORD
		//	| TERM_KEYWORD
		//	| TRUE_KEYWORD
		//	| TYPE_KEYWORD
		//	| WILD_KEYWORD
		//	| CONJUNCTION_KEYWORD
		//	| DISJUNCTION_KEYWORD
		//	| REVERSED
		//	| KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD | LANGUAGE_REFSET_ID_KEYWORD | EFFECTIVE_TIME_KEYWORD | ACCEPTABLE_IN_KEYWORD |
		//DESCRIPTION_KEYWORD | PREFERRED_IN_KEYWORD | SEMANTIC_TAG_KEYWORD | DIALECTID_KEYWORD | LANGUAGE_KEYWORD |
		//MODULEID_KEYWORD | CONCEPT_KEYWORD | DIALECT_KEYWORD | ACTIVE_KEYWORD | TYPEID_KEYWORD | EXCLUSION_KEYWORD |
		//EXACT_KEYWORD | FALSE_KEYWORD | MATCH_KEYWORD | REGEX_KEYWORD | TERM_KEYWORD | TRUE_KEYWORD | TYPE_KEYWORD |
		//WILD_KEYWORD | CONJUNCTION_KEYWORD | DISJUNCTION_KEYWORD | REVERSED | KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CASE_SIGNIFICANCE_ID_KEYWORD
		public RuleCall getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0() { return cCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0; }
		
		//LANGUAGE_REFSET_ID_KEYWORD
		public RuleCall getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1() { return cLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1; }
		
		//EFFECTIVE_TIME_KEYWORD
		public RuleCall getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2() { return cEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2; }
		
		//ACCEPTABLE_IN_KEYWORD
		public RuleCall getACCEPTABLE_IN_KEYWORDTerminalRuleCall_3() { return cACCEPTABLE_IN_KEYWORDTerminalRuleCall_3; }
		
		//DESCRIPTION_KEYWORD
		public RuleCall getDESCRIPTION_KEYWORDTerminalRuleCall_4() { return cDESCRIPTION_KEYWORDTerminalRuleCall_4; }
		
		//PREFERRED_IN_KEYWORD
		public RuleCall getPREFERRED_IN_KEYWORDTerminalRuleCall_5() { return cPREFERRED_IN_KEYWORDTerminalRuleCall_5; }
		
		//SEMANTIC_TAG_KEYWORD
		public RuleCall getSEMANTIC_TAG_KEYWORDTerminalRuleCall_6() { return cSEMANTIC_TAG_KEYWORDTerminalRuleCall_6; }
		
		//DIALECTID_KEYWORD
		public RuleCall getDIALECTID_KEYWORDTerminalRuleCall_7() { return cDIALECTID_KEYWORDTerminalRuleCall_7; }
		
		//LANGUAGE_KEYWORD
		public RuleCall getLANGUAGE_KEYWORDTerminalRuleCall_8() { return cLANGUAGE_KEYWORDTerminalRuleCall_8; }
		
		//MODULEID_KEYWORD
		public RuleCall getMODULEID_KEYWORDTerminalRuleCall_9() { return cMODULEID_KEYWORDTerminalRuleCall_9; }
		
		//CONCEPT_KEYWORD
		public RuleCall getCONCEPT_KEYWORDTerminalRuleCall_10() { return cCONCEPT_KEYWORDTerminalRuleCall_10; }
		
		//DIALECT_KEYWORD
		public RuleCall getDIALECT_KEYWORDTerminalRuleCall_11() { return cDIALECT_KEYWORDTerminalRuleCall_11; }
		
		//ACTIVE_KEYWORD
		public RuleCall getACTIVE_KEYWORDTerminalRuleCall_12() { return cACTIVE_KEYWORDTerminalRuleCall_12; }
		
		//TYPEID_KEYWORD
		public RuleCall getTYPEID_KEYWORDTerminalRuleCall_13() { return cTYPEID_KEYWORDTerminalRuleCall_13; }
		
		//EXCLUSION_KEYWORD
		public RuleCall getEXCLUSION_KEYWORDTerminalRuleCall_14() { return cEXCLUSION_KEYWORDTerminalRuleCall_14; }
		
		//EXACT_KEYWORD
		public RuleCall getEXACT_KEYWORDTerminalRuleCall_15() { return cEXACT_KEYWORDTerminalRuleCall_15; }
		
		//FALSE_KEYWORD
		public RuleCall getFALSE_KEYWORDTerminalRuleCall_16() { return cFALSE_KEYWORDTerminalRuleCall_16; }
		
		//MATCH_KEYWORD
		public RuleCall getMATCH_KEYWORDTerminalRuleCall_17() { return cMATCH_KEYWORDTerminalRuleCall_17; }
		
		//REGEX_KEYWORD
		public RuleCall getREGEX_KEYWORDTerminalRuleCall_18() { return cREGEX_KEYWORDTerminalRuleCall_18; }
		
		//TERM_KEYWORD
		public RuleCall getTERM_KEYWORDTerminalRuleCall_19() { return cTERM_KEYWORDTerminalRuleCall_19; }
		
		//TRUE_KEYWORD
		public RuleCall getTRUE_KEYWORDTerminalRuleCall_20() { return cTRUE_KEYWORDTerminalRuleCall_20; }
		
		//TYPE_KEYWORD
		public RuleCall getTYPE_KEYWORDTerminalRuleCall_21() { return cTYPE_KEYWORDTerminalRuleCall_21; }
		
		//WILD_KEYWORD
		public RuleCall getWILD_KEYWORDTerminalRuleCall_22() { return cWILD_KEYWORDTerminalRuleCall_22; }
		
		//CONJUNCTION_KEYWORD
		public RuleCall getCONJUNCTION_KEYWORDTerminalRuleCall_23() { return cCONJUNCTION_KEYWORDTerminalRuleCall_23; }
		
		//DISJUNCTION_KEYWORD
		public RuleCall getDISJUNCTION_KEYWORDTerminalRuleCall_24() { return cDISJUNCTION_KEYWORDTerminalRuleCall_24; }
		
		//REVERSED
		public RuleCall getREVERSEDTerminalRuleCall_25() { return cREVERSEDTerminalRuleCall_25; }
		
		//KEYWORD
		public RuleCall getKEYWORDTerminalRuleCall_26() { return cKEYWORDTerminalRuleCall_26; }
	}
	public class DialectAliasValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DialectAliasValue");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cDASHTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cUnquotedStringParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cDIGIT_ZEROTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cDIGIT_NONZEROTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//DialectAliasValue hidden():
		//	(DASH | UnquotedString | DIGIT_ZERO | DIGIT_NONZERO)+;
		@Override public ParserRule getRule() { return rule; }
		
		//(DASH | UnquotedString | DIGIT_ZERO | DIGIT_NONZERO)+
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//DASH
		public RuleCall getDASHTerminalRuleCall_0() { return cDASHTerminalRuleCall_0; }
		
		//UnquotedString
		public RuleCall getUnquotedStringParserRuleCall_1() { return cUnquotedStringParserRuleCall_1; }
		
		//DIGIT_ZERO
		public RuleCall getDIGIT_ZEROTerminalRuleCall_2() { return cDIGIT_ZEROTerminalRuleCall_2; }
		
		//DIGIT_NONZERO
		public RuleCall getDIGIT_NONZEROTerminalRuleCall_3() { return cDIGIT_NONZEROTerminalRuleCall_3; }
	}
	public class LEXICAL_SEARCH_TYPEElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cMATCH_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cWILD_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		private final RuleCall cREGEX_KEYWORDTerminalRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		private final RuleCall cEXACT_KEYWORDTerminalRuleCall_3 = (RuleCall)cAlternatives.eContents().get(3);
		
		//LEXICAL_SEARCH_TYPE // Lexical search types supported in ECL 1.5 
		//:
		//	MATCH_KEYWORD
		//	| WILD_KEYWORD
		//	// Lexical search type extensions
		//	| REGEX_KEYWORD
		//	| EXACT_KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//MATCH_KEYWORD | WILD_KEYWORD // Lexical search type extensions
		//| REGEX_KEYWORD | EXACT_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//MATCH_KEYWORD
		public RuleCall getMATCH_KEYWORDTerminalRuleCall_0() { return cMATCH_KEYWORDTerminalRuleCall_0; }
		
		//WILD_KEYWORD
		public RuleCall getWILD_KEYWORDTerminalRuleCall_1() { return cWILD_KEYWORDTerminalRuleCall_1; }
		
		//REGEX_KEYWORD
		public RuleCall getREGEX_KEYWORDTerminalRuleCall_2() { return cREGEX_KEYWORDTerminalRuleCall_2; }
		
		//EXACT_KEYWORD
		public RuleCall getEXACT_KEYWORDTerminalRuleCall_3() { return cEXACT_KEYWORDTerminalRuleCall_3; }
	}
	public class DOMAINElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOMAIN");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cCONCEPT_KEYWORDTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cDESCRIPTION_KEYWORDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//DOMAIN:
		//	CONCEPT_KEYWORD
		//	| DESCRIPTION_KEYWORD;
		@Override public ParserRule getRule() { return rule; }
		
		//CONCEPT_KEYWORD | DESCRIPTION_KEYWORD
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//CONCEPT_KEYWORD
		public RuleCall getCONCEPT_KEYWORDTerminalRuleCall_0() { return cCONCEPT_KEYWORDTerminalRuleCall_0; }
		
		//DESCRIPTION_KEYWORD
		public RuleCall getDESCRIPTION_KEYWORDTerminalRuleCall_1() { return cDESCRIPTION_KEYWORDTerminalRuleCall_1; }
	}
	public class NON_NUMERIC_OPERATORElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cEQUALTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cNOT_EQUALTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//NON_NUMERIC_OPERATOR:
		//	EQUAL | NOT_EQUAL;
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
		//	EQUAL | NOT_EQUAL | GT | LT | GTE | LTE;
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
	private final NestedFilterElements pNestedFilter;
	private final PropertyFilterElements pPropertyFilter;
	private final TermFilterElements pTermFilter;
	private final TypedTermFilterElements pTypedTermFilter;
	private final TypedTermFilterSetElements pTypedTermFilterSet;
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
	private final AcceptabilityIdSetElements pAcceptabilityIdSet;
	private final AcceptabilityTokenSetElements pAcceptabilityTokenSet;
	private final ActiveFilterElements pActiveFilter;
	private final ModuleFilterElements pModuleFilter;
	private final SemanticTagFilterElements pSemanticTagFilter;
	private final EffectiveTimeFilterElements pEffectiveTimeFilter;
	private final PreferredInFilterElements pPreferredInFilter;
	private final AcceptableInFilterElements pAcceptableInFilter;
	private final LanguageRefSetFilterElements pLanguageRefSetFilter;
	private final CaseSignificanceFilterElements pCaseSignificanceFilter;
	private final SnomedIdentifierElements pSnomedIdentifier;
	private final NonNegativeIntegerElements pNonNegativeInteger;
	private final NonNegativeDecimalElements pNonNegativeDecimal;
	private final MaxValueElements pMaxValue;
	private final IntegerElements pInteger;
	private final DecimalElements pDecimal;
	private final BooleanElements pBoolean;
	private final UnquotedStringElements pUnquotedString;
	private final DialectAliasValueElements pDialectAliasValue;
	private final LEXICAL_SEARCH_TYPEElements pLEXICAL_SEARCH_TYPE;
	private final DOMAINElements pDOMAIN;
	private final NON_NUMERIC_OPERATORElements pNON_NUMERIC_OPERATOR;
	private final NUMERIC_OPERATORElements pNUMERIC_OPERATOR;
	private final TerminalRule tCASE_SIGNIFICANCE_ID_KEYWORD;
	private final TerminalRule tLANGUAGE_REFSET_ID_KEYWORD;
	private final TerminalRule tEFFECTIVE_TIME_KEYWORD;
	private final TerminalRule tACCEPTABLE_IN_KEYWORD;
	private final TerminalRule tDESCRIPTION_KEYWORD;
	private final TerminalRule tPREFERRED_IN_KEYWORD;
	private final TerminalRule tSEMANTIC_TAG_KEYWORD;
	private final TerminalRule tDIALECTID_KEYWORD;
	private final TerminalRule tLANGUAGE_KEYWORD;
	private final TerminalRule tMODULEID_KEYWORD;
	private final TerminalRule tCONCEPT_KEYWORD;
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
	private final TerminalRule tCONJUNCTION_KEYWORD;
	private final TerminalRule tDISJUNCTION_KEYWORD;
	private final TerminalRule tREVERSED;
	private final TerminalRule tKEYWORD;
	private final TerminalRule tDBL_LT_EM;
	private final TerminalRule tDBL_GT_EM;
	private final TerminalRule tDBL_LT;
	private final TerminalRule tDBL_GT;
	private final TerminalRule tLT_EM;
	private final TerminalRule tGT_EM;
	private final TerminalRule tGTE;
	private final TerminalRule tLTE;
	private final TerminalRule tDOUBLE_CURLY_OPEN;
	private final TerminalRule tDOUBLE_CURLY_CLOSE;
	private final TerminalRule tPIPE_DELIMITED_STRING;
	private final TerminalRule tSTRING;
	private final TerminalRule tTO;
	private final TerminalRule tCOMMA;
	private final TerminalRule tDIGIT_ZERO;
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
		this.pNestedFilter = new NestedFilterElements();
		this.pPropertyFilter = new PropertyFilterElements();
		this.pTermFilter = new TermFilterElements();
		this.pTypedTermFilter = new TypedTermFilterElements();
		this.pTypedTermFilterSet = new TypedTermFilterSetElements();
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
		this.pAcceptabilityIdSet = new AcceptabilityIdSetElements();
		this.pAcceptabilityTokenSet = new AcceptabilityTokenSetElements();
		this.pActiveFilter = new ActiveFilterElements();
		this.pModuleFilter = new ModuleFilterElements();
		this.pSemanticTagFilter = new SemanticTagFilterElements();
		this.pEffectiveTimeFilter = new EffectiveTimeFilterElements();
		this.pPreferredInFilter = new PreferredInFilterElements();
		this.pAcceptableInFilter = new AcceptableInFilterElements();
		this.pLanguageRefSetFilter = new LanguageRefSetFilterElements();
		this.pCaseSignificanceFilter = new CaseSignificanceFilterElements();
		this.pSnomedIdentifier = new SnomedIdentifierElements();
		this.pNonNegativeInteger = new NonNegativeIntegerElements();
		this.pNonNegativeDecimal = new NonNegativeDecimalElements();
		this.pMaxValue = new MaxValueElements();
		this.pInteger = new IntegerElements();
		this.pDecimal = new DecimalElements();
		this.pBoolean = new BooleanElements();
		this.pUnquotedString = new UnquotedStringElements();
		this.pDialectAliasValue = new DialectAliasValueElements();
		this.pLEXICAL_SEARCH_TYPE = new LEXICAL_SEARCH_TYPEElements();
		this.pDOMAIN = new DOMAINElements();
		this.pNON_NUMERIC_OPERATOR = new NON_NUMERIC_OPERATORElements();
		this.pNUMERIC_OPERATOR = new NUMERIC_OPERATORElements();
		this.tCASE_SIGNIFICANCE_ID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CASE_SIGNIFICANCE_ID_KEYWORD");
		this.tLANGUAGE_REFSET_ID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LANGUAGE_REFSET_ID_KEYWORD");
		this.tEFFECTIVE_TIME_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.EFFECTIVE_TIME_KEYWORD");
		this.tACCEPTABLE_IN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.ACCEPTABLE_IN_KEYWORD");
		this.tDESCRIPTION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DESCRIPTION_KEYWORD");
		this.tPREFERRED_IN_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PREFERRED_IN_KEYWORD");
		this.tSEMANTIC_TAG_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.SEMANTIC_TAG_KEYWORD");
		this.tDIALECTID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIALECTID_KEYWORD");
		this.tLANGUAGE_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LANGUAGE_KEYWORD");
		this.tMODULEID_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.MODULEID_KEYWORD");
		this.tCONCEPT_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CONCEPT_KEYWORD");
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
		this.tCONJUNCTION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.CONJUNCTION_KEYWORD");
		this.tDISJUNCTION_KEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DISJUNCTION_KEYWORD");
		this.tREVERSED = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.REVERSED");
		this.tKEYWORD = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.KEYWORD");
		this.tDBL_LT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT_EM");
		this.tDBL_GT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT_EM");
		this.tDBL_LT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_LT");
		this.tDBL_GT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DBL_GT");
		this.tLT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LT_EM");
		this.tGT_EM = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GT_EM");
		this.tGTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.GTE");
		this.tLTE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.LTE");
		this.tDOUBLE_CURLY_OPEN = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_OPEN");
		this.tDOUBLE_CURLY_CLOSE = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DOUBLE_CURLY_CLOSE");
		this.tPIPE_DELIMITED_STRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
		this.tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.STRING");
		this.tTO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.TO");
		this.tCOMMA = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.COMMA");
		this.tDIGIT_ZERO = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "com.b2international.snomed.ecl.Ecl.DIGIT_ZERO");
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
	//	AndExpressionConstraint ({OrExpressionConstraint.left=current} DISJUNCTION_KEYWORD right=AndExpressionConstraint)*;
	public OrExpressionConstraintElements getOrExpressionConstraintAccess() {
		return pOrExpressionConstraint;
	}
	
	public ParserRule getOrExpressionConstraintRule() {
		return getOrExpressionConstraintAccess().getRule();
	}
	
	//AndExpressionConstraint ExpressionConstraint:
	//	ExclusionExpressionConstraint ({AndExpressionConstraint.left=current} (CONJUNCTION_KEYWORD | COMMA)
	//	right=ExclusionExpressionConstraint)*;
	public AndExpressionConstraintElements getAndExpressionConstraintAccess() {
		return pAndExpressionConstraint;
	}
	
	public ParserRule getAndExpressionConstraintRule() {
		return getAndExpressionConstraintAccess().getRule();
	}
	
	//ExclusionExpressionConstraint ExpressionConstraint:
	//	RefinedExpressionConstraint ({ExclusionExpressionConstraint.left=current} EXCLUSION_KEYWORD
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
	//	FilteredExpressionConstraint ({DottedExpressionConstraint.constraint=current} DOT
	//	attribute=FilteredExpressionConstraint)*;
	public DottedExpressionConstraintElements getDottedExpressionConstraintAccess() {
		return pDottedExpressionConstraint;
	}
	
	public ParserRule getDottedExpressionConstraintRule() {
		return getDottedExpressionConstraintAccess().getRule();
	}
	
	//FilteredExpressionConstraint ExpressionConstraint:
	//	SubExpressionConstraint ({FilteredExpressionConstraint.constraint=current} filter=FilterConstraint)*;
	public FilteredExpressionConstraintElements getFilteredExpressionConstraintAccess() {
		return pFilteredExpressionConstraint;
	}
	
	public ParserRule getFilteredExpressionConstraintRule() {
		return getFilteredExpressionConstraintAccess().getRule();
	}
	
	//SubExpressionConstraint ExpressionConstraint:
	//	ChildOf | ChildOrSelfOf | DescendantOf | DescendantOrSelfOf | ParentOf | ParentOrSelfOf | AncestorOf |
	//	AncestorOrSelfOf | EclFocusConcept;
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
	//	id=SnomedIdentifier term=PIPE_DELIMITED_STRING?;
	public EclConceptReferenceElements getEclConceptReferenceAccess() {
		return pEclConceptReference;
	}
	
	public ParserRule getEclConceptReferenceRule() {
		return getEclConceptReferenceAccess().getRule();
	}
	
	//EclConceptReferenceSet:
	//	ROUND_OPEN concepts+=EclConceptReference+ ROUND_CLOSE;
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
	//	AndRefinement -> ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndRefinement)*;
	public OrRefinementElements getOrRefinementAccess() {
		return pOrRefinement;
	}
	
	public ParserRule getOrRefinementRule() {
		return getOrRefinementAccess().getRule();
	}
	
	//AndRefinement EclRefinement:
	//	SubRefinement -> ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubRefinement)*;
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
	//	AndAttributeSet ({OrRefinement.left=current} DISJUNCTION_KEYWORD right=AndAttributeSet)*;
	public OrAttributeSetElements getOrAttributeSetAccess() {
		return pOrAttributeSet;
	}
	
	public ParserRule getOrAttributeSetRule() {
		return getOrAttributeSetAccess().getRule();
	}
	
	//AndAttributeSet EclRefinement:
	//	SubAttributeSet ({AndRefinement.left=current} (CONJUNCTION_KEYWORD | COMMA) right=SubAttributeSet)*;
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
	//	cardinality=Cardinality? reversed?=REVERSED? attribute=FilteredExpressionConstraint comparison=Comparison?;
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
	//	op=NON_NUMERIC_OPERATOR value=FilteredExpressionConstraint;
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
	//	op=NON_NUMERIC_OPERATOR value=Boolean;
	public BooleanValueComparisonElements getBooleanValueComparisonAccess() {
		return pBooleanValueComparison;
	}
	
	public ParserRule getBooleanValueComparisonRule() {
		return getBooleanValueComparisonAccess().getRule();
	}
	
	//StringValueComparison:
	//	op=NON_NUMERIC_OPERATOR value=STRING;
	public StringValueComparisonElements getStringValueComparisonAccess() {
		return pStringValueComparison;
	}
	
	public ParserRule getStringValueComparisonRule() {
		return getStringValueComparisonAccess().getRule();
	}
	
	//IntegerValueComparison:
	//	op=NUMERIC_OPERATOR HASH value=Integer;
	public IntegerValueComparisonElements getIntegerValueComparisonAccess() {
		return pIntegerValueComparison;
	}
	
	public ParserRule getIntegerValueComparisonRule() {
		return getIntegerValueComparisonAccess().getRule();
	}
	
	//DecimalValueComparison:
	//	op=NUMERIC_OPERATOR HASH value=Decimal;
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
	
	//// Conjunction (OR) of filters is an extension to ECL 1.5
	//DisjunctionFilter Filter:
	//	ConjunctionFilter ({DisjunctionFilter.left=current} DISJUNCTION_KEYWORD right=ConjunctionFilter)*;
	public DisjunctionFilterElements getDisjunctionFilterAccess() {
		return pDisjunctionFilter;
	}
	
	public ParserRule getDisjunctionFilterRule() {
		return getDisjunctionFilterAccess().getRule();
	}
	
	//// Using the "AND" keyword for disjunctions is an extension to ECL 1.5
	//ConjunctionFilter Filter:
	//	PropertyFilter ({ConjunctionFilter.left=current} (CONJUNCTION_KEYWORD | COMMA) right=PropertyFilter)*;
	public ConjunctionFilterElements getConjunctionFilterAccess() {
		return pConjunctionFilter;
	}
	
	public ParserRule getConjunctionFilterRule() {
		return getConjunctionFilterAccess().getRule();
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
	//	TermFilter
	//	| LanguageFilter
	//	| TypeFilter
	//	| DialectFilter
	//	// QL 0.1 filters (ECL extensions)	 
	//	| ActiveFilter
	//	| PreferredInFilter
	//	| AcceptableInFilter
	//	| LanguageRefSetFilter
	//	| ModuleFilter
	//	| SemanticTagFilter
	//	| EffectiveTimeFilter
	//	| CaseSignificanceFilter
	//	// Allows grouping filters for boolean operators
	//	| NestedFilter;
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
	
	//// no special treatment for the term filter STRING, we allow everything for any lexical search type
	//TypedTermFilter:
	//	op=NON_NUMERIC_OPERATOR (lexicalSearchType=LEXICAL_SEARCH_TYPE COLON)? term=STRING;
	public TypedTermFilterElements getTypedTermFilterAccess() {
		return pTypedTermFilter;
	}
	
	public ParserRule getTypedTermFilterRule() {
		return getTypedTermFilterAccess().getRule();
	}
	
	//TypedTermFilterSet:
	//	op=NON_NUMERIC_OPERATOR ROUND_OPEN terms+=TypedTermFilter+ ROUND_CLOSE;
	public TypedTermFilterSetElements getTypedTermFilterSetAccess() {
		return pTypedTermFilterSet;
	}
	
	public ParserRule getTypedTermFilterSetRule() {
		return getTypedTermFilterSetAccess().getRule();
	}
	
	//LanguageFilter:
	//	LANGUAGE_KEYWORD op=NON_NUMERIC_OPERATOR (languageCodes+=UnquotedString | ROUND_OPEN languageCodes+=UnquotedString+
	//	ROUND_CLOSE);
	public LanguageFilterElements getLanguageFilterAccess() {
		return pLanguageFilter;
	}
	
	public ParserRule getLanguageFilterRule() {
		return getLanguageFilterAccess().getRule();
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
	//	TYPEID_KEYWORD op=NON_NUMERIC_OPERATOR type=(EclConceptReference | EclConceptReferenceSet);
	public TypeIdFilterElements getTypeIdFilterAccess() {
		return pTypeIdFilter;
	}
	
	public ParserRule getTypeIdFilterRule() {
		return getTypeIdFilterAccess().getRule();
	}
	
	//// Any unquoted string is allowed as a type token here, validator will restrict it to the available set
	//TypeTokenFilter:
	//	TYPE_KEYWORD op=NON_NUMERIC_OPERATOR (tokens+=UnquotedString | ROUND_OPEN tokens+=UnquotedString+ ROUND_CLOSE);
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
	//	DIALECTID_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=Dialect | ROUND_OPEN dialects+=Dialect+ ROUND_CLOSE);
	public DialectIdFilterElements getDialectIdFilterAccess() {
		return pDialectIdFilter;
	}
	
	public ParserRule getDialectIdFilterRule() {
		return getDialectIdFilterAccess().getRule();
	}
	
	//DialectAliasFilter:
	//	DIALECT_KEYWORD op=NON_NUMERIC_OPERATOR (dialects+=DialectAlias | ROUND_OPEN dialects+=DialectAlias+ ROUND_CLOSE);
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
	
	//// Whitespace is significant (indicates an unquoted string boundary) in this rule, so WS tokens can not be hidden
	//DialectAlias hidden():
	//	alias=DialectAliasValue WS* acceptability=Acceptability?;
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
	//	ROUND_OPEN acceptabilities+=UnquotedString+ ROUND_CLOSE;
	public AcceptabilityTokenSetElements getAcceptabilityTokenSetAccess() {
		return pAcceptabilityTokenSet;
	}
	
	public ParserRule getAcceptabilityTokenSetRule() {
		return getAcceptabilityTokenSetAccess().getRule();
	}
	
	//ActiveFilter:
	//	(domain=DOMAIN DOT)? ACTIVE_KEYWORD EQUAL active=Boolean;
	public ActiveFilterElements getActiveFilterAccess() {
		return pActiveFilter;
	}
	
	public ParserRule getActiveFilterRule() {
		return getActiveFilterAccess().getRule();
	}
	
	//ModuleFilter:
	//	(domain=DOMAIN DOT)? MODULEID_KEYWORD EQUAL moduleId=ExpressionConstraint;
	public ModuleFilterElements getModuleFilterAccess() {
		return pModuleFilter;
	}
	
	public ParserRule getModuleFilterRule() {
		return getModuleFilterAccess().getRule();
	}
	
	//SemanticTagFilter:
	//	(domain=DOMAIN DOT)? SEMANTIC_TAG_KEYWORD op=NON_NUMERIC_OPERATOR semanticTag=STRING;
	public SemanticTagFilterElements getSemanticTagFilterAccess() {
		return pSemanticTagFilter;
	}
	
	public ParserRule getSemanticTagFilterRule() {
		return getSemanticTagFilterAccess().getRule();
	}
	
	//EffectiveTimeFilter:
	//	(domain=DOMAIN DOT)? EFFECTIVE_TIME_KEYWORD op=NUMERIC_OPERATOR effectiveTime=STRING;
	public EffectiveTimeFilterElements getEffectiveTimeFilterAccess() {
		return pEffectiveTimeFilter;
	}
	
	public ParserRule getEffectiveTimeFilterRule() {
		return getEffectiveTimeFilterAccess().getRule();
	}
	
	//PreferredInFilter:
	//	PREFERRED_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
	public PreferredInFilterElements getPreferredInFilterAccess() {
		return pPreferredInFilter;
	}
	
	public ParserRule getPreferredInFilterRule() {
		return getPreferredInFilterAccess().getRule();
	}
	
	//AcceptableInFilter:
	//	ACCEPTABLE_IN_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
	public AcceptableInFilterElements getAcceptableInFilterAccess() {
		return pAcceptableInFilter;
	}
	
	public ParserRule getAcceptableInFilterRule() {
		return getAcceptableInFilterAccess().getRule();
	}
	
	//LanguageRefSetFilter:
	//	LANGUAGE_REFSET_ID_KEYWORD EQUAL languageRefSetId=ExpressionConstraint;
	public LanguageRefSetFilterElements getLanguageRefSetFilterAccess() {
		return pLanguageRefSetFilter;
	}
	
	public ParserRule getLanguageRefSetFilterRule() {
		return getLanguageRefSetFilterAccess().getRule();
	}
	
	//CaseSignificanceFilter:
	//	CASE_SIGNIFICANCE_ID_KEYWORD EQUAL caseSignificanceId=ExpressionConstraint;
	public CaseSignificanceFilterElements getCaseSignificanceFilterAccess() {
		return pCaseSignificanceFilter;
	}
	
	public ParserRule getCaseSignificanceFilterRule() {
		return getCaseSignificanceFilterAccess().getRule();
	}
	
	///*
	// * Datatype rules
	// */ SnomedIdentifier hidden():
	//	(DIGIT_NONZERO | DIGIT_ZERO)+;
	public SnomedIdentifierElements getSnomedIdentifierAccess() {
		return pSnomedIdentifier;
	}
	
	public ParserRule getSnomedIdentifierRule() {
		return getSnomedIdentifierAccess().getRule();
	}
	
	//NonNegativeInteger ecore::EInt hidden():
	//	(DIGIT_NONZERO | DIGIT_ZERO)+;
	public NonNegativeIntegerElements getNonNegativeIntegerAccess() {
		return pNonNegativeInteger;
	}
	
	public ParserRule getNonNegativeIntegerRule() {
		return getNonNegativeIntegerAccess().getRule();
	}
	
	//NonNegativeDecimal ecore::EBigDecimal hidden():
	//	NonNegativeInteger DOT (DIGIT_NONZERO | DIGIT_ZERO)*;
	public NonNegativeDecimalElements getNonNegativeDecimalAccess() {
		return pNonNegativeDecimal;
	}
	
	public ParserRule getNonNegativeDecimalRule() {
		return getNonNegativeDecimalAccess().getRule();
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
	
	//Boolean ecore::EBoolean hidden():
	//	TRUE_KEYWORD | FALSE_KEYWORD;
	public BooleanElements getBooleanAccess() {
		return pBoolean;
	}
	
	public ParserRule getBooleanRule() {
		return getBooleanAccess().getRule();
	}
	
	//// Unquoted strings also need to cover any keywords caught by the lexer, earlier in the process. They are terminated by whitespace.
	//UnquotedString:
	//	CASE_SIGNIFICANCE_ID_KEYWORD
	//	| LANGUAGE_REFSET_ID_KEYWORD
	//	| EFFECTIVE_TIME_KEYWORD
	//	| ACCEPTABLE_IN_KEYWORD
	//	| DESCRIPTION_KEYWORD
	//	| PREFERRED_IN_KEYWORD
	//	| SEMANTIC_TAG_KEYWORD
	//	| DIALECTID_KEYWORD
	//	| LANGUAGE_KEYWORD
	//	| MODULEID_KEYWORD
	//	| CONCEPT_KEYWORD
	//	| DIALECT_KEYWORD
	//	| ACTIVE_KEYWORD
	//	| TYPEID_KEYWORD
	//	| EXCLUSION_KEYWORD
	//	| EXACT_KEYWORD
	//	| FALSE_KEYWORD
	//	| MATCH_KEYWORD
	//	| REGEX_KEYWORD
	//	| TERM_KEYWORD
	//	| TRUE_KEYWORD
	//	| TYPE_KEYWORD
	//	| WILD_KEYWORD
	//	| CONJUNCTION_KEYWORD
	//	| DISJUNCTION_KEYWORD
	//	| REVERSED
	//	| KEYWORD;
	public UnquotedStringElements getUnquotedStringAccess() {
		return pUnquotedString;
	}
	
	public ParserRule getUnquotedStringRule() {
		return getUnquotedStringAccess().getRule();
	}
	
	//DialectAliasValue hidden():
	//	(DASH | UnquotedString | DIGIT_ZERO | DIGIT_NONZERO)+;
	public DialectAliasValueElements getDialectAliasValueAccess() {
		return pDialectAliasValue;
	}
	
	public ParserRule getDialectAliasValueRule() {
		return getDialectAliasValueAccess().getRule();
	}
	
	//LEXICAL_SEARCH_TYPE // Lexical search types supported in ECL 1.5 
	//:
	//	MATCH_KEYWORD
	//	| WILD_KEYWORD
	//	// Lexical search type extensions
	//	| REGEX_KEYWORD
	//	| EXACT_KEYWORD;
	public LEXICAL_SEARCH_TYPEElements getLEXICAL_SEARCH_TYPEAccess() {
		return pLEXICAL_SEARCH_TYPE;
	}
	
	public ParserRule getLEXICAL_SEARCH_TYPERule() {
		return getLEXICAL_SEARCH_TYPEAccess().getRule();
	}
	
	//DOMAIN:
	//	CONCEPT_KEYWORD
	//	| DESCRIPTION_KEYWORD;
	public DOMAINElements getDOMAINAccess() {
		return pDOMAIN;
	}
	
	public ParserRule getDOMAINRule() {
		return getDOMAINAccess().getRule();
	}
	
	//NON_NUMERIC_OPERATOR:
	//	EQUAL | NOT_EQUAL;
	public NON_NUMERIC_OPERATORElements getNON_NUMERIC_OPERATORAccess() {
		return pNON_NUMERIC_OPERATOR;
	}
	
	public ParserRule getNON_NUMERIC_OPERATORRule() {
		return getNON_NUMERIC_OPERATORAccess().getRule();
	}
	
	//NUMERIC_OPERATOR:
	//	EQUAL | NOT_EQUAL | GT | LT | GTE | LTE;
	public NUMERIC_OPERATORElements getNUMERIC_OPERATORAccess() {
		return pNUMERIC_OPERATOR;
	}
	
	public ParserRule getNUMERIC_OPERATORRule() {
		return getNUMERIC_OPERATORAccess().getRule();
	}
	
	//terminal CASE_SIGNIFICANCE_ID_KEYWORD:
	//	'caseSignificanceId' | ('C' | 'c') ('A' | 'a') ('S' | 's') ('E' | 'e') ('S' | 's') ('I' | 'i') ('G' | 'g') ('N' | 'n')
	//	('I' | 'i') ('F' | 'f') ('I' | 'i') ('C' | 'c') ('A' | 'a') ('N' | 'n') ('C' | 'c') ('E' | 'e') ('I' | 'i') ('D' |
	//	'd');
	public TerminalRule getCASE_SIGNIFICANCE_ID_KEYWORDRule() {
		return tCASE_SIGNIFICANCE_ID_KEYWORD;
	}
	
	//terminal LANGUAGE_REFSET_ID_KEYWORD:
	//	'languageRefsetId' | ('L' | 'l') ('A' | 'a') ('N' | 'n') ('G' | 'g') ('U' | 'u') ('A' | 'a') ('G' | 'g') ('E' | 'e')
	//	('R' | 'r') ('E' | 'e') ('F' | 'f') ('S' | 's') ('E' | 'e') ('T' | 't') ('I' | 'i') ('D' | 'd');
	public TerminalRule getLANGUAGE_REFSET_ID_KEYWORDRule() {
		return tLANGUAGE_REFSET_ID_KEYWORD;
	}
	
	//terminal EFFECTIVE_TIME_KEYWORD:
	//	'effectiveTime' | ('E' | 'e') ('F' | 'f') ('F' | 'f') ('E' | 'e') ('C' | 'c') ('T' | 't') ('I' | 'i') ('V' | 'v') ('E'
	//	| 'e') ('T' | 't') ('I' | 'i') ('M' | 'm') ('E' | 'e');
	public TerminalRule getEFFECTIVE_TIME_KEYWORDRule() {
		return tEFFECTIVE_TIME_KEYWORD;
	}
	
	//terminal ACCEPTABLE_IN_KEYWORD:
	//	'acceptableIn' | ('A' | 'a') ('C' | 'c') ('C' | 'c') ('E' | 'e') ('P' | 'p') ('T' | 't') ('A' | 'a') ('B' | 'b') ('L'
	//	| 'l') ('E' | 'e') ('I' | 'i') ('N' | 'n');
	public TerminalRule getACCEPTABLE_IN_KEYWORDRule() {
		return tACCEPTABLE_IN_KEYWORD;
	}
	
	//terminal DESCRIPTION_KEYWORD:
	//	'Description' | ('D' | 'd') ('E' | 'e') ('S' | 's') ('C' | 'c') ('R' | 'r') ('I' | 'i') ('P' | 'p') ('T' | 't') ('I' |
	//	'i') ('O' | 'o') ('N' | 'n');
	public TerminalRule getDESCRIPTION_KEYWORDRule() {
		return tDESCRIPTION_KEYWORD;
	}
	
	//terminal PREFERRED_IN_KEYWORD:
	//	'preferredIn' | ('P' | 'p') ('R' | 'r') ('E' | 'e') ('F' | 'f') ('E' | 'e') ('R' | 'r') ('R' | 'r') ('E' | 'e') ('D' |
	//	'd') ('I' | 'i') ('N' | 'n');
	public TerminalRule getPREFERRED_IN_KEYWORDRule() {
		return tPREFERRED_IN_KEYWORD;
	}
	
	//terminal SEMANTIC_TAG_KEYWORD:
	//	'semanticTag' | ('S' | 's') ('E' | 'e') ('M' | 'm') ('A' | 'a') ('N' | 'n') ('T' | 't') ('I' | 'i') ('C' | 'c') ('T' |
	//	't') ('A' | 'a') ('G' | 'g');
	public TerminalRule getSEMANTIC_TAG_KEYWORDRule() {
		return tSEMANTIC_TAG_KEYWORD;
	}
	
	//terminal DIALECTID_KEYWORD:
	//	'dialectId' | ('D' | 'd') ('I' | 'i') ('A' | 'a') ('L' | 'l') ('E' | 'e') ('C' | 'c') ('T' | 't') ('I' | 'i') ('D' |
	//	'd');
	public TerminalRule getDIALECTID_KEYWORDRule() {
		return tDIALECTID_KEYWORD;
	}
	
	//terminal LANGUAGE_KEYWORD:
	//	'language' | ('L' | 'l') ('A' | 'a') ('N' | 'n') ('G' | 'g') ('U' | 'u') ('A' | 'a') ('G' | 'g') ('E' | 'e');
	public TerminalRule getLANGUAGE_KEYWORDRule() {
		return tLANGUAGE_KEYWORD;
	}
	
	//terminal MODULEID_KEYWORD:
	//	'moduleId' | ('M' | 'm') ('O' | 'o') ('D' | 'd') ('U' | 'u') ('L' | 'l') ('E' | 'e') ('I' | 'i') ('D' | 'd');
	public TerminalRule getMODULEID_KEYWORDRule() {
		return tMODULEID_KEYWORD;
	}
	
	//terminal CONCEPT_KEYWORD:
	//	'Concept' | ('C' | 'c') ('O' | 'o') ('N' | 'n') ('C' | 'c') ('E' | 'e') ('P' | 'p') ('T' | 't');
	public TerminalRule getCONCEPT_KEYWORDRule() {
		return tCONCEPT_KEYWORD;
	}
	
	//terminal DIALECT_KEYWORD:
	//	'dialect' | ('D' | 'd') ('I' | 'i') ('A' | 'a') ('L' | 'l') ('E' | 'e') ('C' | 'c') ('T' | 't');
	public TerminalRule getDIALECT_KEYWORDRule() {
		return tDIALECT_KEYWORD;
	}
	
	//terminal ACTIVE_KEYWORD:
	//	'active' | ('A' | 'a') ('C' | 'c') ('T' | 't') ('I' | 'i') ('V' | 'v') ('E' | 'e');
	public TerminalRule getACTIVE_KEYWORDRule() {
		return tACTIVE_KEYWORD;
	}
	
	//terminal TYPEID_KEYWORD:
	//	'typeId' | ('T' | 't') ('Y' | 'y') ('P' | 'p') ('E' | 'e') ('I' | 'i') ('D' | 'd');
	public TerminalRule getTYPEID_KEYWORDRule() {
		return tTYPEID_KEYWORD;
	}
	
	//terminal EXCLUSION_KEYWORD:
	//	'MINUS' | ('M' | 'm') ('I' | 'i') ('N' | 'n') ('U' | 'u') ('S' | 's');
	public TerminalRule getEXCLUSION_KEYWORDRule() {
		return tEXCLUSION_KEYWORD;
	}
	
	//terminal EXACT_KEYWORD:
	//	'exact' | ('E' | 'e') ('X' | 'x') ('A' | 'a') ('C' | 'c') ('T' | 't');
	public TerminalRule getEXACT_KEYWORDRule() {
		return tEXACT_KEYWORD;
	}
	
	//terminal FALSE_KEYWORD:
	//	'false' | ('F' | 'f') ('A' | 'a') ('L' | 'l') ('S' | 's') ('E' | 'e');
	public TerminalRule getFALSE_KEYWORDRule() {
		return tFALSE_KEYWORD;
	}
	
	//terminal MATCH_KEYWORD:
	//	'match' | ('M' | 'm') ('A' | 'a') ('T' | 't') ('C' | 'c') ('H' | 'h');
	public TerminalRule getMATCH_KEYWORDRule() {
		return tMATCH_KEYWORD;
	}
	
	//terminal REGEX_KEYWORD:
	//	'regex' | ('R' | 'r') ('E' | 'e') ('G' | 'g') ('E' | 'e') ('X' | 'x');
	public TerminalRule getREGEX_KEYWORDRule() {
		return tREGEX_KEYWORD;
	}
	
	//terminal TERM_KEYWORD:
	//	'term' | ('T' | 't') ('E' | 'e') ('R' | 'r') ('M' | 'm');
	public TerminalRule getTERM_KEYWORDRule() {
		return tTERM_KEYWORD;
	}
	
	//terminal TRUE_KEYWORD:
	//	'true' | ('T' | 't') ('R' | 'r') ('U' | 'u') ('E' | 'e');
	public TerminalRule getTRUE_KEYWORDRule() {
		return tTRUE_KEYWORD;
	}
	
	//terminal TYPE_KEYWORD:
	//	'type' | ('T' | 't') ('Y' | 'y') ('P' | 'p') ('E' | 'e');
	public TerminalRule getTYPE_KEYWORDRule() {
		return tTYPE_KEYWORD;
	}
	
	//terminal WILD_KEYWORD:
	//	'wild' | ('W' | 'w') ('I' | 'i') ('L' | 'l') ('D' | 'd');
	public TerminalRule getWILD_KEYWORDRule() {
		return tWILD_KEYWORD;
	}
	
	//terminal CONJUNCTION_KEYWORD:
	//	'AND' | ('A' | 'a') ('N' | 'n') ('D' | 'd');
	public TerminalRule getCONJUNCTION_KEYWORDRule() {
		return tCONJUNCTION_KEYWORD;
	}
	
	//terminal DISJUNCTION_KEYWORD:
	//	'OR' | ('O' | 'o') ('R' | 'r');
	public TerminalRule getDISJUNCTION_KEYWORDRule() {
		return tDISJUNCTION_KEYWORD;
	}
	
	//terminal REVERSED:
	//	'R';
	public TerminalRule getREVERSEDRule() {
		return tREVERSED;
	}
	
	//terminal KEYWORD:
	//	'a'..'z' | 'A'..'Z'+;
	public TerminalRule getKEYWORDRule() {
		return tKEYWORD;
	}
	
	//terminal DBL_LT_EM:
	//	'<<!';
	public TerminalRule getDBL_LT_EMRule() {
		return tDBL_LT_EM;
	}
	
	//terminal DBL_GT_EM:
	//	'>>!';
	public TerminalRule getDBL_GT_EMRule() {
		return tDBL_GT_EM;
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
	
	//terminal GT_EM:
	//	'>!';
	public TerminalRule getGT_EMRule() {
		return tGT_EM;
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
	
	//terminal PIPE_DELIMITED_STRING:
	//	"|"->"|";
	public TerminalRule getPIPE_DELIMITED_STRINGRule() {
		return tPIPE_DELIMITED_STRING;
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return tSTRING;
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
	
	//terminal DIGIT_ZERO:
	//	'0';
	public TerminalRule getDIGIT_ZERORule() {
		return tDIGIT_ZERO;
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
	
	//terminal HASH:
	//	'#';
	public TerminalRule getHASHRule() {
		return tHASH;
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
}
