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
grammar InternalEcl;

options {
	superClass=AbstractInternalAntlrParser;
	backtrack=true;
}

@lexer::header {
package com.b2international.snomed.ecl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package com.b2international.snomed.ecl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import com.b2international.snomed.ecl.services.EclGrammarAccess;

}

@parser::members {

/*
  This grammar contains a lot of empty actions to work around a bug in ANTLR.
  Otherwise the ANTLR tool will create synpreds that cannot be compiled in some rare cases.
*/

 	private EclGrammarAccess grammarAccess;

    public InternalEclParser(TokenStream input, EclGrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Script";
   	}

   	@Override
   	protected EclGrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleScript
entryRuleScript returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getScriptRule()); }
	iv_ruleScript=ruleScript
	{ $current=$iv_ruleScript.current; }
	EOF;

// Rule Script
ruleScript returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getScriptAccess().getScriptAction_0(),
					$current);
			}
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getScriptRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleExpressionConstraint
entryRuleExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionConstraintRule()); }
	iv_ruleExpressionConstraint=ruleExpressionConstraint
	{ $current=$iv_ruleExpressionConstraint.current; }
	EOF;

// Rule ExpressionConstraint
ruleExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall());
	}
	this_OrExpressionConstraint_0=ruleOrExpressionConstraint
	{
		$current = $this_OrExpressionConstraint_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrExpressionConstraint
entryRuleOrExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); }
	iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint
	{ $current=$iv_ruleOrExpressionConstraint.current; }
	EOF;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0());
		}
		this_AndExpressionConstraint_0=ruleAndExpressionConstraint
		{
			$current = $this_AndExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndExpressionConstraint
entryRuleAndExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); }
	iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint
	{ $current=$iv_ruleAndExpressionConstraint.current; }
	EOF;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0());
		}
		this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint
		{
			$current = $this_ExclusionExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_4_0=ruleExclusionExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleExclusionExpressionConstraint
entryRuleExclusionExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); }
	iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint
	{ $current=$iv_ruleExclusionExpressionConstraint.current; }
	EOF;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
		}
		this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint
		{
			$current = $this_RefinedExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
						$current);
				}
			)
			this_EXCLUSION_KEYWORD_2=RULE_EXCLUSION_KEYWORD
			{
				newLeafNode(this_EXCLUSION_KEYWORD_2, grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleRefinedExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleRefinedExpressionConstraint
entryRuleRefinedExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); }
	iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint
	{ $current=$iv_ruleRefinedExpressionConstraint.current; }
	EOF;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0());
		}
		this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint
		{
			$current = $this_DottedExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			this_COLON_2=RULE_COLON
			{
				newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0());
					}
					lv_refinement_3_0=ruleEclRefinement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
						}
						set(
							$current,
							"refinement",
							lv_refinement_3_0,
							"com.b2international.snomed.ecl.Ecl.EclRefinement");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)?
	)
;

// Entry rule entryRuleDottedExpressionConstraint
entryRuleDottedExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); }
	iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint
	{ $current=$iv_ruleDottedExpressionConstraint.current; }
	EOF;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0());
		}
		this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint
		{
			$current = $this_FilteredExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			this_DOT_2=RULE_DOT
			{
				newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0());
					}
					lv_attribute_3_0=ruleFilteredExpressionConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
						}
						set(
							$current,
							"attribute",
							lv_attribute_3_0,
							"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleFilteredExpressionConstraint
entryRuleFilteredExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilteredExpressionConstraintRule()); }
	iv_ruleFilteredExpressionConstraint=ruleFilteredExpressionConstraint
	{ $current=$iv_ruleFilteredExpressionConstraint.current; }
	EOF;

// Rule FilteredExpressionConstraint
ruleFilteredExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
		}
		this_SubExpressionConstraint_0=ruleSubExpressionConstraint
		{
			$current = $this_SubExpressionConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0(),
						$current);
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0());
					}
					lv_filter_2_0=ruleFilterConstraint
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getFilteredExpressionConstraintRule());
						}
						set(
							$current,
							"filter",
							lv_filter_2_0,
							"com.b2international.snomed.ecl.Ecl.FilterConstraint");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSubExpressionConstraint
entryRuleSubExpressionConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubExpressionConstraintRule()); }
	iv_ruleSubExpressionConstraint=ruleSubExpressionConstraint
	{ $current=$iv_ruleSubExpressionConstraint.current; }
	EOF;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0());
		}
		this_ChildOf_0=ruleChildOf
		{
			$current = $this_ChildOf_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1());
		}
		this_ChildOrSelfOf_1=ruleChildOrSelfOf
		{
			$current = $this_ChildOrSelfOf_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2());
		}
		this_DescendantOf_2=ruleDescendantOf
		{
			$current = $this_DescendantOf_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3());
		}
		this_DescendantOrSelfOf_3=ruleDescendantOrSelfOf
		{
			$current = $this_DescendantOrSelfOf_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4());
		}
		this_ParentOf_4=ruleParentOf
		{
			$current = $this_ParentOf_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5());
		}
		this_ParentOrSelfOf_5=ruleParentOrSelfOf
		{
			$current = $this_ParentOrSelfOf_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6());
		}
		this_AncestorOf_6=ruleAncestorOf
		{
			$current = $this_AncestorOf_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7());
		}
		this_AncestorOrSelfOf_7=ruleAncestorOrSelfOf
		{
			$current = $this_AncestorOrSelfOf_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8());
		}
		this_EclFocusConcept_8=ruleEclFocusConcept
		{
			$current = $this_EclFocusConcept_8.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleEclFocusConcept
entryRuleEclFocusConcept returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclFocusConceptRule()); }
	iv_ruleEclFocusConcept=ruleEclFocusConcept
	{ $current=$iv_ruleEclFocusConcept.current; }
	EOF;

// Rule EclFocusConcept
ruleEclFocusConcept returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0());
		}
		this_MemberOf_0=ruleMemberOf
		{
			$current = $this_MemberOf_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1());
		}
		this_EclConceptReference_1=ruleEclConceptReference
		{
			$current = $this_EclConceptReference_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2());
		}
		this_Any_2=ruleAny
		{
			$current = $this_Any_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3());
		}
		this_NestedExpression_3=ruleNestedExpression
		{
			$current = $this_NestedExpression_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleChildOf
entryRuleChildOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildOfRule()); }
	iv_ruleChildOf=ruleChildOf
	{ $current=$iv_ruleChildOf.current; }
	EOF;

// Rule ChildOf
ruleChildOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LT_EM_0=RULE_LT_EM
		{
			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleChildOrSelfOf
entryRuleChildOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getChildOrSelfOfRule()); }
	iv_ruleChildOrSelfOf=ruleChildOrSelfOf
	{ $current=$iv_ruleChildOrSelfOf.current; }
	EOF;

// Rule ChildOrSelfOf
ruleChildOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_LT_EM_0=RULE_DBL_LT_EM
		{
			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getChildOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescendantOf
entryRuleDescendantOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescendantOfRule()); }
	iv_ruleDescendantOf=ruleDescendantOf
	{ $current=$iv_ruleDescendantOf.current; }
	EOF;

// Rule DescendantOf
ruleDescendantOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LT_0=RULE_LT
		{
			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescendantOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDescendantOrSelfOf
entryRuleDescendantOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); }
	iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf
	{ $current=$iv_ruleDescendantOrSelfOf.current; }
	EOF;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_LT_0=RULE_DBL_LT
		{
			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentOf
entryRuleParentOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentOfRule()); }
	iv_ruleParentOf=ruleParentOf
	{ $current=$iv_ruleParentOf.current; }
	EOF;

// Rule ParentOf
ruleParentOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_GT_EM_0=RULE_GT_EM
		{
			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleParentOrSelfOf
entryRuleParentOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParentOrSelfOfRule()); }
	iv_ruleParentOrSelfOf=ruleParentOrSelfOf
	{ $current=$iv_ruleParentOrSelfOf.current; }
	EOF;

// Rule ParentOrSelfOf
ruleParentOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_GT_EM_0=RULE_DBL_GT_EM
		{
			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getParentOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAncestorOf
entryRuleAncestorOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAncestorOfRule()); }
	iv_ruleAncestorOf=ruleAncestorOf
	{ $current=$iv_ruleAncestorOf.current; }
	EOF;

// Rule AncestorOf
ruleAncestorOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_GT_0=RULE_GT
		{
			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAncestorOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAncestorOrSelfOf
entryRuleAncestorOrSelfOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); }
	iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf
	{ $current=$iv_ruleAncestorOrSelfOf.current; }
	EOF;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DBL_GT_0=RULE_DBL_GT
		{
			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
				}
				lv_constraint_1_0=ruleEclFocusConcept
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
					}
					set(
						$current,
						"constraint",
						lv_constraint_1_0,
						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleMemberOf
entryRuleMemberOf returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMemberOfRule()); }
	iv_ruleMemberOf=ruleMemberOf
	{ $current=$iv_ruleMemberOf.current; }
	EOF;

// Rule MemberOf
ruleMemberOf returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CARET_0=RULE_CARET
		{
			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0());
					}
					lv_constraint_1_1=ruleEclConceptReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_1_1,
							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1());
					}
					lv_constraint_1_2=ruleAny
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_1_2,
							"com.b2international.snomed.ecl.Ecl.Any");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2());
					}
					lv_constraint_1_3=ruleNestedExpression
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMemberOfRule());
						}
						set(
							$current,
							"constraint",
							lv_constraint_1_3,
							"com.b2international.snomed.ecl.Ecl.NestedExpression");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleEclConceptReference
entryRuleEclConceptReference returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclConceptReferenceRule()); }
	iv_ruleEclConceptReference=ruleEclConceptReference
	{ $current=$iv_ruleEclConceptReference.current; }
	EOF;

// Rule EclConceptReference
ruleEclConceptReference returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0());
				}
				lv_id_0_0=ruleSnomedIdentifier
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclConceptReferenceRule());
					}
					set(
						$current,
						"id",
						lv_id_0_0,
						"com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_term_1_0=RULE_PIPE_DELIMITED_STRING
				{
					newLeafNode(lv_term_1_0, grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEclConceptReferenceRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_1_0,
						"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
				}
			)
		)?
	)
;

// Entry rule entryRuleEclConceptReferenceSet
entryRuleEclConceptReferenceSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclConceptReferenceSetRule()); }
	iv_ruleEclConceptReferenceSet=ruleEclConceptReferenceSet
	{ $current=$iv_ruleEclConceptReferenceSet.current; }
	EOF;

// Rule EclConceptReferenceSet
ruleEclConceptReferenceSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0());
				}
				lv_concepts_1_0=ruleEclConceptReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclConceptReferenceSetRule());
					}
					add(
						$current,
						"concepts",
						lv_concepts_1_0,
						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAny
entryRuleAny returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAnyRule()); }
	iv_ruleAny=ruleAny
	{ $current=$iv_ruleAny.current; }
	EOF;

// Rule Any
ruleAny returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_WILDCARD_0=RULE_WILDCARD
		{
			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
		}
		(
			{
				/* */
			}
			{
				$current = forceCreateModelElement(
					grammarAccess.getAnyAccess().getAnyAction_1(),
					$current);
			}
		)
	)
;

// Entry rule entryRuleEclRefinement
entryRuleEclRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclRefinementRule()); }
	iv_ruleEclRefinement=ruleEclRefinement
	{ $current=$iv_ruleEclRefinement.current; }
	EOF;

// Rule EclRefinement
ruleEclRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall());
	}
	this_OrRefinement_0=ruleOrRefinement
	{
		$current = $this_OrRefinement_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrRefinement
entryRuleOrRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrRefinementRule()); }
	iv_ruleOrRefinement=ruleOrRefinement
	{ $current=$iv_ruleOrRefinement.current; }
	EOF;

// Rule OrRefinement
ruleOrRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0());
		}
		this_AndRefinement_0=ruleAndRefinement
		{
			$current = $this_AndRefinement_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(RULE_DISJUNCTION_KEYWORD)=>
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
							$current);
					}
				)
				this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
				{
					newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0());
						}
						lv_right_3_0=ruleAndRefinement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getOrRefinementRule());
							}
							set(
								$current,
								"right",
								lv_right_3_0,
								"com.b2international.snomed.ecl.Ecl.AndRefinement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleAndRefinement
entryRuleAndRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndRefinementRule()); }
	iv_ruleAndRefinement=ruleAndRefinement
	{ $current=$iv_ruleAndRefinement.current; }
	EOF;

// Rule AndRefinement
ruleAndRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0());
		}
		this_SubRefinement_0=ruleSubRefinement
		{
			$current = $this_SubRefinement_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(RULE_CONJUNCTION_KEYWORD | RULE_COMMA)=>
			(
				(
					{
						/* */
					}
					{
						$current = forceCreateModelElementAndSet(
							grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
							$current);
					}
				)
				(
					this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
					{
						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
					}
					    |
					this_COMMA_3=RULE_COMMA
					{
						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
					}
				)
				(
					(
						{
							newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0());
						}
						lv_right_4_0=ruleSubRefinement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getAndRefinementRule());
							}
							set(
								$current,
								"right",
								lv_right_4_0,
								"com.b2international.snomed.ecl.Ecl.SubRefinement");
							afterParserOrEnumRuleCall();
						}
					)
				)
			)
		)*
	)
;

// Entry rule entryRuleSubRefinement
entryRuleSubRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubRefinementRule()); }
	iv_ruleSubRefinement=ruleSubRefinement
	{ $current=$iv_ruleSubRefinement.current; }
	EOF;

// Rule SubRefinement
ruleSubRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0());
		}
		this_AttributeConstraint_0=ruleAttributeConstraint
		{
			$current = $this_AttributeConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1());
		}
		this_EclAttributeGroup_1=ruleEclAttributeGroup
		{
			$current = $this_EclAttributeGroup_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2());
		}
		this_NestedRefinement_2=ruleNestedRefinement
		{
			$current = $this_NestedRefinement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNestedRefinement
entryRuleNestedRefinement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedRefinementRule()); }
	iv_ruleNestedRefinement=ruleNestedRefinement
	{ $current=$iv_ruleNestedRefinement.current; }
	EOF;

// Rule NestedRefinement
ruleNestedRefinement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleEclRefinement
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.EclRefinement");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleEclAttributeGroup
entryRuleEclAttributeGroup returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclAttributeGroupRule()); }
	iv_ruleEclAttributeGroup=ruleEclAttributeGroup
	{ $current=$iv_ruleEclAttributeGroup.current; }
	EOF;

// Rule EclAttributeGroup
ruleEclAttributeGroup returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
				}
				lv_cardinality_0_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_0_0,
						"com.b2international.snomed.ecl.Ecl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		this_CURLY_OPEN_1=RULE_CURLY_OPEN
		{
			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
				}
				lv_refinement_2_0=ruleEclAttributeSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
					}
					set(
						$current,
						"refinement",
						lv_refinement_2_0,
						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_CURLY_CLOSE_3=RULE_CURLY_CLOSE
		{
			newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleEclAttributeSet
entryRuleEclAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEclAttributeSetRule()); }
	iv_ruleEclAttributeSet=ruleEclAttributeSet
	{ $current=$iv_ruleEclAttributeSet.current; }
	EOF;

// Rule EclAttributeSet
ruleEclAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall());
	}
	this_OrAttributeSet_0=ruleOrAttributeSet
	{
		$current = $this_OrAttributeSet_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleOrAttributeSet
entryRuleOrAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getOrAttributeSetRule()); }
	iv_ruleOrAttributeSet=ruleOrAttributeSet
	{ $current=$iv_ruleOrAttributeSet.current; }
	EOF;

// Rule OrAttributeSet
ruleOrAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0());
		}
		this_AndAttributeSet_0=ruleAndAttributeSet
		{
			$current = $this_AndAttributeSet_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleAndAttributeSet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.AndAttributeSet");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleAndAttributeSet
entryRuleAndAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAndAttributeSetRule()); }
	iv_ruleAndAttributeSet=ruleAndAttributeSet
	{ $current=$iv_ruleAndAttributeSet.current; }
	EOF;

// Rule AndAttributeSet
ruleAndAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0());
		}
		this_SubAttributeSet_0=ruleSubAttributeSet
		{
			$current = $this_SubAttributeSet_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0());
					}
					lv_right_4_0=ruleSubAttributeSet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.SubAttributeSet");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleSubAttributeSet
entryRuleSubAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubAttributeSetRule()); }
	iv_ruleSubAttributeSet=ruleSubAttributeSet
	{ $current=$iv_ruleSubAttributeSet.current; }
	EOF;

// Rule SubAttributeSet
ruleSubAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0());
		}
		this_AttributeConstraint_0=ruleAttributeConstraint
		{
			$current = $this_AttributeConstraint_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1());
		}
		this_NestedAttributeSet_1=ruleNestedAttributeSet
		{
			$current = $this_NestedAttributeSet_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleNestedAttributeSet
entryRuleNestedAttributeSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedAttributeSetRule()); }
	iv_ruleNestedAttributeSet=ruleNestedAttributeSet
	{ $current=$iv_ruleNestedAttributeSet.current; }
	EOF;

// Rule NestedAttributeSet
ruleNestedAttributeSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleEclAttributeSet
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleAttributeConstraint
entryRuleAttributeConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeConstraintRule()); }
	iv_ruleAttributeConstraint=ruleAttributeConstraint
	{ $current=$iv_ruleAttributeConstraint.current; }
	EOF;

// Rule AttributeConstraint
ruleAttributeConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
				}
				lv_cardinality_0_0=ruleCardinality
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"cardinality",
						lv_cardinality_0_0,
						"com.b2international.snomed.ecl.Ecl.Cardinality");
					afterParserOrEnumRuleCall();
				}
			)
		)?
		(
			(
				lv_reversed_1_0=RULE_REVERSED
				{
					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAttributeConstraintRule());
					}
					setWithLastConsumed(
						$current,
						"reversed",
						lv_reversed_1_0 != null,
						"com.b2international.snomed.ecl.Ecl.REVERSED");
				}
			)
		)?
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
				}
				lv_attribute_2_0=ruleFilteredExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"attribute",
						lv_attribute_2_0,
						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0());
				}
				lv_comparison_3_0=ruleComparison
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
					}
					set(
						$current,
						"comparison",
						lv_comparison_3_0,
						"com.b2international.snomed.ecl.Ecl.Comparison");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleCardinality
entryRuleCardinality returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCardinalityRule()); }
	iv_ruleCardinality=ruleCardinality
	{ $current=$iv_ruleCardinality.current; }
	EOF;

// Rule Cardinality
ruleCardinality returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_SQUARE_OPEN_0=RULE_SQUARE_OPEN
		{
			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
				}
				lv_min_1_0=ruleNonNegativeInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"min",
						lv_min_1_0,
						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_TO_2=RULE_TO
		{
			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
				}
				lv_max_3_0=ruleMaxValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCardinalityRule());
					}
					set(
						$current,
						"max",
						lv_max_3_0,
						"com.b2international.snomed.ecl.Ecl.MaxValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_SQUARE_CLOSE_4=RULE_SQUARE_CLOSE
		{
			newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4());
		}
	)
;

// Entry rule entryRuleComparison
entryRuleComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getComparisonRule()); }
	iv_ruleComparison=ruleComparison
	{ $current=$iv_ruleComparison.current; }
	EOF;

// Rule Comparison
ruleComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0());
		}
		this_AttributeComparison_0=ruleAttributeComparison
		{
			$current = $this_AttributeComparison_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1());
		}
		this_DataTypeComparison_1=ruleDataTypeComparison
		{
			$current = $this_DataTypeComparison_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAttributeComparison
entryRuleAttributeComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAttributeComparisonRule()); }
	iv_ruleAttributeComparison=ruleAttributeComparison
	{ $current=$iv_ruleAttributeComparison.current; }
	EOF;

// Rule AttributeComparison
ruleAttributeComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0());
				}
				lv_value_1_0=ruleFilteredExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDataTypeComparison
entryRuleDataTypeComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeComparisonRule()); }
	iv_ruleDataTypeComparison=ruleDataTypeComparison
	{ $current=$iv_ruleDataTypeComparison.current; }
	EOF;

// Rule DataTypeComparison
ruleDataTypeComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0());
		}
		this_BooleanValueComparison_0=ruleBooleanValueComparison
		{
			$current = $this_BooleanValueComparison_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1());
		}
		this_StringValueComparison_1=ruleStringValueComparison
		{
			$current = $this_StringValueComparison_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2());
		}
		this_IntegerValueComparison_2=ruleIntegerValueComparison
		{
			$current = $this_IntegerValueComparison_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3());
		}
		this_DecimalValueComparison_3=ruleDecimalValueComparison
		{
			$current = $this_DecimalValueComparison_3.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleBooleanValueComparison
entryRuleBooleanValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBooleanValueComparisonRule()); }
	iv_ruleBooleanValueComparison=ruleBooleanValueComparison
	{ $current=$iv_ruleBooleanValueComparison.current; }
	EOF;

// Rule BooleanValueComparison
ruleBooleanValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0());
				}
				lv_value_1_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleStringValueComparison
entryRuleStringValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStringValueComparisonRule()); }
	iv_ruleStringValueComparison=ruleStringValueComparison
	{ $current=$iv_ruleStringValueComparison.current; }
	EOF;

// Rule StringValueComparison
ruleStringValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_value_1_0=RULE_STRING
				{
					newLeafNode(lv_value_1_0, grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getStringValueComparisonRule());
					}
					setWithLastConsumed(
						$current,
						"value",
						lv_value_1_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleIntegerValueComparison
entryRuleIntegerValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getIntegerValueComparisonRule()); }
	iv_ruleIntegerValueComparison=ruleIntegerValueComparison
	{ $current=$iv_ruleIntegerValueComparison.current; }
	EOF;

// Rule IntegerValueComparison
ruleIntegerValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0());
				}
				lv_value_2_0=ruleInteger
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.Integer");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleDecimalValueComparison
entryRuleDecimalValueComparison returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDecimalValueComparisonRule()); }
	iv_ruleDecimalValueComparison=ruleDecimalValueComparison
	{ $current=$iv_ruleDecimalValueComparison.current; }
	EOF;

// Rule DecimalValueComparison
ruleDecimalValueComparison returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_HASH_1=RULE_HASH
		{
			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0());
				}
				lv_value_2_0=ruleDecimal
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"com.b2international.snomed.ecl.Ecl.Decimal");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleNestedExpression
entryRuleNestedExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedExpressionRule()); }
	iv_ruleNestedExpression=ruleNestedExpression
	{ $current=$iv_ruleNestedExpression.current; }
	EOF;

// Rule NestedExpression
ruleNestedExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleFilterConstraint
entryRuleFilterConstraint returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterConstraintRule()); }
	iv_ruleFilterConstraint=ruleFilterConstraint
	{ $current=$iv_ruleFilterConstraint.current; }
	EOF;

// Rule FilterConstraint
ruleFilterConstraint returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DOUBLE_CURLY_OPEN_0=RULE_DOUBLE_CURLY_OPEN
		{
			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
		}
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1());
		}
		this_Filter_1=ruleFilter
		{
			$current = $this_Filter_1.current;
			afterParserOrEnumRuleCall();
		}
		this_DOUBLE_CURLY_CLOSE_2=RULE_DOUBLE_CURLY_CLOSE
		{
			newLeafNode(this_DOUBLE_CURLY_CLOSE_2, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleFilter
entryRuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFilterRule()); }
	iv_ruleFilter=ruleFilter
	{ $current=$iv_ruleFilter.current; }
	EOF;

// Rule Filter
ruleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		/* */
	}
	{
		newCompositeNode(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall());
	}
	this_DisjunctionFilter_0=ruleDisjunctionFilter
	{
		$current = $this_DisjunctionFilter_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleDisjunctionFilter
entryRuleDisjunctionFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDisjunctionFilterRule()); }
	iv_ruleDisjunctionFilter=ruleDisjunctionFilter
	{ $current=$iv_ruleDisjunctionFilter.current; }
	EOF;

// Rule DisjunctionFilter
ruleDisjunctionFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0());
		}
		this_ConjunctionFilter_0=ruleConjunctionFilter
		{
			$current = $this_ConjunctionFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(),
						$current);
				}
			)
			this_DISJUNCTION_KEYWORD_2=RULE_DISJUNCTION_KEYWORD
			{
				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0());
					}
					lv_right_3_0=ruleConjunctionFilter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDisjunctionFilterRule());
						}
						set(
							$current,
							"right",
							lv_right_3_0,
							"com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleConjunctionFilter
entryRuleConjunctionFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getConjunctionFilterRule()); }
	iv_ruleConjunctionFilter=ruleConjunctionFilter
	{ $current=$iv_ruleConjunctionFilter.current; }
	EOF;

// Rule ConjunctionFilter
ruleConjunctionFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0());
		}
		this_PropertyFilter_0=rulePropertyFilter
		{
			$current = $this_PropertyFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		(
			(
				{
					/* */
				}
				{
					$current = forceCreateModelElementAndSet(
						grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(),
						$current);
				}
			)
			(
				this_CONJUNCTION_KEYWORD_2=RULE_CONJUNCTION_KEYWORD
				{
					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
				}
				    |
				this_COMMA_3=RULE_COMMA
				{
					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
				}
			)
			(
				(
					{
						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
					}
					lv_right_4_0=rulePropertyFilter
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getConjunctionFilterRule());
						}
						set(
							$current,
							"right",
							lv_right_4_0,
							"com.b2international.snomed.ecl.Ecl.PropertyFilter");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
	)
;

// Entry rule entryRuleNestedFilter
entryRuleNestedFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNestedFilterRule()); }
	iv_ruleNestedFilter=ruleNestedFilter
	{ $current=$iv_ruleNestedFilter.current; }
	EOF;

// Rule NestedFilter
ruleNestedFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
				}
				lv_nested_1_0=ruleFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNestedFilterRule());
					}
					set(
						$current,
						"nested",
						lv_nested_1_0,
						"com.b2international.snomed.ecl.Ecl.Filter");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRulePropertyFilter
entryRulePropertyFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPropertyFilterRule()); }
	iv_rulePropertyFilter=rulePropertyFilter
	{ $current=$iv_rulePropertyFilter.current; }
	EOF;

// Rule PropertyFilter
rulePropertyFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0());
		}
		this_TermFilter_0=ruleTermFilter
		{
			$current = $this_TermFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1());
		}
		this_LanguageFilter_1=ruleLanguageFilter
		{
			$current = $this_LanguageFilter_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2());
		}
		this_TypeFilter_2=ruleTypeFilter
		{
			$current = $this_TypeFilter_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3());
		}
		this_DialectFilter_3=ruleDialectFilter
		{
			$current = $this_DialectFilter_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_4());
		}
		this_ActiveFilter_4=ruleActiveFilter
		{
			$current = $this_ActiveFilter_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_5());
		}
		this_PreferredInFilter_5=rulePreferredInFilter
		{
			$current = $this_PreferredInFilter_5.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_6());
		}
		this_AcceptableInFilter_6=ruleAcceptableInFilter
		{
			$current = $this_AcceptableInFilter_6.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_7());
		}
		this_LanguageRefSetFilter_7=ruleLanguageRefSetFilter
		{
			$current = $this_LanguageRefSetFilter_7.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_8());
		}
		this_ModuleFilter_8=ruleModuleFilter
		{
			$current = $this_ModuleFilter_8.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9());
		}
		this_SemanticTagFilter_9=ruleSemanticTagFilter
		{
			$current = $this_SemanticTagFilter_9.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_10());
		}
		this_EffectiveTimeFilter_10=ruleEffectiveTimeFilter
		{
			$current = $this_EffectiveTimeFilter_10.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_11());
		}
		this_CaseSignificanceFilter_11=ruleCaseSignificanceFilter
		{
			$current = $this_CaseSignificanceFilter_11.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_12());
		}
		this_NestedFilter_12=ruleNestedFilter
		{
			$current = $this_NestedFilter_12.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTermFilter
entryRuleTermFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTermFilterRule()); }
	iv_ruleTermFilter=ruleTermFilter
	{ $current=$iv_ruleTermFilter.current; }
	EOF;

// Rule TermFilter
ruleTermFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TERM_KEYWORD_0=RULE_TERM_KEYWORD
		{
			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
		}
		(
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0());
			}
			this_TypedTermFilter_1=ruleTypedTermFilter
			{
				$current = $this_TypedTermFilter_1.current;
				afterParserOrEnumRuleCall();
			}
			    |
			{
				/* */
			}
			{
				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1());
			}
			this_TypedTermFilterSet_2=ruleTypedTermFilterSet
			{
				$current = $this_TypedTermFilterSet_2.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleTypedTermFilter
entryRuleTypedTermFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedTermFilterRule()); }
	iv_ruleTypedTermFilter=ruleTypedTermFilter
	{ $current=$iv_ruleTypedTermFilter.current; }
	EOF;

// Rule TypedTermFilter
ruleTypedTermFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0());
					}
					lv_lexicalSearchType_1_0=ruleLEXICAL_SEARCH_TYPE
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
						}
						set(
							$current,
							"lexicalSearchType",
							lv_lexicalSearchType_1_0,
							"com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_COLON_2=RULE_COLON
			{
				newLeafNode(this_COLON_2, grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1());
			}
		)?
		(
			(
				lv_term_3_0=RULE_STRING
				{
					newLeafNode(lv_term_3_0, grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getTypedTermFilterRule());
					}
					setWithLastConsumed(
						$current,
						"term",
						lv_term_3_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleTypedTermFilterSet
entryRuleTypedTermFilterSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypedTermFilterSetRule()); }
	iv_ruleTypedTermFilterSet=ruleTypedTermFilterSet
	{ $current=$iv_ruleTypedTermFilterSet.current; }
	EOF;

// Rule TypedTermFilterSet
ruleTypedTermFilterSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
				}
				lv_op_0_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
					}
					set(
						$current,
						"op",
						lv_op_0_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		this_ROUND_OPEN_1=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_1, grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0());
				}
				lv_terms_2_0=ruleTypedTermFilter
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
					}
					add(
						$current,
						"terms",
						lv_terms_2_0,
						"com.b2international.snomed.ecl.Ecl.TypedTermFilter");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_ROUND_CLOSE_3=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleLanguageFilter
entryRuleLanguageFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageFilterRule()); }
	iv_ruleLanguageFilter=ruleLanguageFilter
	{ $current=$iv_ruleLanguageFilter.current; }
	EOF;

// Rule LanguageFilter
ruleLanguageFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LANGUAGE_KEYWORD_0=RULE_LANGUAGE_KEYWORD
		{
			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0());
					}
					lv_languageCodes_2_0=ruleUnquotedString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
						}
						add(
							$current,
							"languageCodes",
							lv_languageCodes_2_0,
							"com.b2international.snomed.ecl.Ecl.UnquotedString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
						}
						lv_languageCodes_4_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
							}
							add(
								$current,
								"languageCodes",
								lv_languageCodes_4_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleTypeFilter
entryRuleTypeFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeFilterRule()); }
	iv_ruleTypeFilter=ruleTypeFilter
	{ $current=$iv_ruleTypeFilter.current; }
	EOF;

// Rule TypeFilter
ruleTypeFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0());
		}
		this_TypeIdFilter_0=ruleTypeIdFilter
		{
			$current = $this_TypeIdFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1());
		}
		this_TypeTokenFilter_1=ruleTypeTokenFilter
		{
			$current = $this_TypeTokenFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleTypeIdFilter
entryRuleTypeIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeIdFilterRule()); }
	iv_ruleTypeIdFilter=ruleTypeIdFilter
	{ $current=$iv_ruleTypeIdFilter.current; }
	EOF;

// Rule TypeIdFilter
ruleTypeIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TYPEID_KEYWORD_0=RULE_TYPEID_KEYWORD
		{
			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0());
					}
					lv_type_2_1=ruleEclConceptReference
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
						}
						set(
							$current,
							"type",
							lv_type_2_1,
							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
						afterParserOrEnumRuleCall();
					}
					    |
					{
						newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1());
					}
					lv_type_2_2=ruleEclConceptReferenceSet
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
						}
						set(
							$current,
							"type",
							lv_type_2_2,
							"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)
	)
;

// Entry rule entryRuleTypeTokenFilter
entryRuleTypeTokenFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeTokenFilterRule()); }
	iv_ruleTypeTokenFilter=ruleTypeTokenFilter
	{ $current=$iv_ruleTypeTokenFilter.current; }
	EOF;

// Rule TypeTokenFilter
ruleTypeTokenFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_TYPE_KEYWORD_0=RULE_TYPE_KEYWORD
		{
			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0());
					}
					lv_tokens_2_0=ruleUnquotedString
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
						}
						add(
							$current,
							"tokens",
							lv_tokens_2_0,
							"com.b2international.snomed.ecl.Ecl.UnquotedString");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
						}
						lv_tokens_4_0=ruleUnquotedString
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
							}
							add(
								$current,
								"tokens",
								lv_tokens_4_0,
								"com.b2international.snomed.ecl.Ecl.UnquotedString");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialectFilter
entryRuleDialectFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectFilterRule()); }
	iv_ruleDialectFilter=ruleDialectFilter
	{ $current=$iv_ruleDialectFilter.current; }
	EOF;

// Rule DialectFilter
ruleDialectFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0());
		}
		this_DialectIdFilter_0=ruleDialectIdFilter
		{
			$current = $this_DialectIdFilter_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1());
		}
		this_DialectAliasFilter_1=ruleDialectAliasFilter
		{
			$current = $this_DialectAliasFilter_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDialectIdFilter
entryRuleDialectIdFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectIdFilterRule()); }
	iv_ruleDialectIdFilter=ruleDialectIdFilter
	{ $current=$iv_ruleDialectIdFilter.current; }
	EOF;

// Rule DialectIdFilter
ruleDialectIdFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DIALECTID_KEYWORD_0=RULE_DIALECTID_KEYWORD
		{
			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
					}
					lv_dialects_2_0=ruleDialect
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
						}
						add(
							$current,
							"dialects",
							lv_dialects_2_0,
							"com.b2international.snomed.ecl.Ecl.Dialect");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
						}
						lv_dialects_4_0=ruleDialect
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
							}
							add(
								$current,
								"dialects",
								lv_dialects_4_0,
								"com.b2international.snomed.ecl.Ecl.Dialect");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialectAliasFilter
entryRuleDialectAliasFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectAliasFilterRule()); }
	iv_ruleDialectAliasFilter=ruleDialectAliasFilter
	{ $current=$iv_ruleDialectAliasFilter.current; }
	EOF;

// Rule DialectAliasFilter
ruleDialectAliasFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_DIALECT_KEYWORD_0=RULE_DIALECT_KEYWORD
		{
			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
				}
				lv_op_1_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_1_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0());
					}
					lv_dialects_2_0=ruleDialectAlias
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
						}
						add(
							$current,
							"dialects",
							lv_dialects_2_0,
							"com.b2international.snomed.ecl.Ecl.DialectAlias");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				this_ROUND_OPEN_3=RULE_ROUND_OPEN
				{
					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
				}
				(
					(
						{
							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
						}
						lv_dialects_4_0=ruleDialectAlias
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
							}
							add(
								$current,
								"dialects",
								lv_dialects_4_0,
								"com.b2international.snomed.ecl.Ecl.DialectAlias");
							afterParserOrEnumRuleCall();
						}
					)
				)+
				this_ROUND_CLOSE_5=RULE_ROUND_CLOSE
				{
					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
				}
			)
		)
	)
;

// Entry rule entryRuleDialect
entryRuleDialect returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDialectRule()); }
	iv_ruleDialect=ruleDialect
	{ $current=$iv_ruleDialect.current; }
	EOF;

// Rule Dialect
ruleDialect returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0());
				}
				lv_languageRefSetId_0_0=ruleEclConceptReference
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_0_0,
						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
				}
				lv_acceptability_1_0=ruleAcceptability
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectRule());
					}
					set(
						$current,
						"acceptability",
						lv_acceptability_1_0,
						"com.b2international.snomed.ecl.Ecl.Acceptability");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;

// Entry rule entryRuleDialectAlias
entryRuleDialectAlias returns [EObject current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDialectAliasRule()); }
	iv_ruleDialectAlias=ruleDialectAlias
	{ $current=$iv_ruleDialectAlias.current; }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAlias
ruleDialectAlias returns [EObject current=null]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
				}
				lv_alias_0_0=ruleDialectAliasValue
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasRule());
					}
					set(
						$current,
						"alias",
						lv_alias_0_0,
						"com.b2international.snomed.ecl.Ecl.DialectAliasValue");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			this_WS_1=RULE_WS
			{
				newLeafNode(this_WS_1, grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1());
			}
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_2_0());
				}
				lv_acceptability_2_0=ruleAcceptability
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getDialectAliasRule());
					}
					set(
						$current,
						"acceptability",
						lv_acceptability_2_0,
						"com.b2international.snomed.ecl.Ecl.Acceptability");
					afterParserOrEnumRuleCall();
				}
			)
		)?
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleAcceptability
entryRuleAcceptability returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptabilityRule()); }
	iv_ruleAcceptability=ruleAcceptability
	{ $current=$iv_ruleAcceptability.current; }
	EOF;

// Rule Acceptability
ruleAcceptability returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0());
		}
		this_AcceptabilityIdSet_0=ruleAcceptabilityIdSet
		{
			$current = $this_AcceptabilityIdSet_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			/* */
		}
		{
			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1());
		}
		this_AcceptabilityTokenSet_1=ruleAcceptabilityTokenSet
		{
			$current = $this_AcceptabilityTokenSet_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAcceptabilityIdSet
entryRuleAcceptabilityIdSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptabilityIdSetRule()); }
	iv_ruleAcceptabilityIdSet=ruleAcceptabilityIdSet
	{ $current=$iv_ruleAcceptabilityIdSet.current; }
	EOF;

// Rule AcceptabilityIdSet
ruleAcceptabilityIdSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0());
			}
			lv_acceptabilities_0_0=ruleEclConceptReferenceSet
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getAcceptabilityIdSetRule());
				}
				set(
					$current,
					"acceptabilities",
					lv_acceptabilities_0_0,
					"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleAcceptabilityTokenSet
entryRuleAcceptabilityTokenSet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptabilityTokenSetRule()); }
	iv_ruleAcceptabilityTokenSet=ruleAcceptabilityTokenSet
	{ $current=$iv_ruleAcceptabilityTokenSet.current; }
	EOF;

// Rule AcceptabilityTokenSet
ruleAcceptabilityTokenSet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ROUND_OPEN_0=RULE_ROUND_OPEN
		{
			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0());
				}
				lv_acceptabilities_1_0=ruleUnquotedString
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAcceptabilityTokenSetRule());
					}
					add(
						$current,
						"acceptabilities",
						lv_acceptabilities_1_0,
						"com.b2international.snomed.ecl.Ecl.UnquotedString");
					afterParserOrEnumRuleCall();
				}
			)
		)+
		this_ROUND_CLOSE_2=RULE_ROUND_CLOSE
		{
			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleActiveFilter
entryRuleActiveFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getActiveFilterRule()); }
	iv_ruleActiveFilter=ruleActiveFilter
	{ $current=$iv_ruleActiveFilter.current; }
	EOF;

// Rule ActiveFilter
ruleActiveFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getActiveFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
					}
					lv_domain_0_0=ruleDOMAIN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getActiveFilterRule());
						}
						set(
							$current,
							"domain",
							lv_domain_0_0,
							"com.b2international.snomed.ecl.Ecl.DOMAIN");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_DOT_1=RULE_DOT
			{
				newLeafNode(this_DOT_1, grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1());
			}
		)?
		this_ACTIVE_KEYWORD_2=RULE_ACTIVE_KEYWORD
		{
			newLeafNode(this_ACTIVE_KEYWORD_2, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_1());
		}
		this_EQUAL_3=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_3, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0());
				}
				lv_active_4_0=ruleBoolean
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getActiveFilterRule());
					}
					set(
						$current,
						"active",
						lv_active_4_0,
						"com.b2international.snomed.ecl.Ecl.Boolean");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleModuleFilter
entryRuleModuleFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModuleFilterRule()); }
	iv_ruleModuleFilter=ruleModuleFilter
	{ $current=$iv_ruleModuleFilter.current; }
	EOF;

// Rule ModuleFilter
ruleModuleFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getModuleFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
					}
					lv_domain_0_0=ruleDOMAIN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getModuleFilterRule());
						}
						set(
							$current,
							"domain",
							lv_domain_0_0,
							"com.b2international.snomed.ecl.Ecl.DOMAIN");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_DOT_1=RULE_DOT
			{
				newLeafNode(this_DOT_1, grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1());
			}
		)?
		this_MODULEID_KEYWORD_2=RULE_MODULEID_KEYWORD
		{
			newLeafNode(this_MODULEID_KEYWORD_2, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_1());
		}
		this_EQUAL_3=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_3, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0());
				}
				lv_moduleId_4_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getModuleFilterRule());
					}
					set(
						$current,
						"moduleId",
						lv_moduleId_4_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSemanticTagFilter
entryRuleSemanticTagFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSemanticTagFilterRule()); }
	iv_ruleSemanticTagFilter=ruleSemanticTagFilter
	{ $current=$iv_ruleSemanticTagFilter.current; }
	EOF;

// Rule SemanticTagFilter
ruleSemanticTagFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
					}
					lv_domain_0_0=ruleDOMAIN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
						}
						set(
							$current,
							"domain",
							lv_domain_0_0,
							"com.b2international.snomed.ecl.Ecl.DOMAIN");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_DOT_1=RULE_DOT
			{
				newLeafNode(this_DOT_1, grammarAccess.getSemanticTagFilterAccess().getDOTTerminalRuleCall_0_1());
			}
		)?
		this_SEMANTIC_TAG_KEYWORD_2=RULE_SEMANTIC_TAG_KEYWORD
		{
			newLeafNode(this_SEMANTIC_TAG_KEYWORD_2, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_2_0());
				}
				lv_op_3_0=ruleNON_NUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_3_0,
						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_semanticTag_4_0=RULE_STRING
				{
					newLeafNode(lv_semanticTag_4_0, grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSemanticTagFilterRule());
					}
					setWithLastConsumed(
						$current,
						"semanticTag",
						lv_semanticTag_4_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRuleEffectiveTimeFilter
entryRuleEffectiveTimeFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getEffectiveTimeFilterRule()); }
	iv_ruleEffectiveTimeFilter=ruleEffectiveTimeFilter
	{ $current=$iv_ruleEffectiveTimeFilter.current; }
	EOF;

// Rule EffectiveTimeFilter
ruleEffectiveTimeFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
					}
					lv_domain_0_0=ruleDOMAIN
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
						}
						set(
							$current,
							"domain",
							lv_domain_0_0,
							"com.b2international.snomed.ecl.Ecl.DOMAIN");
						afterParserOrEnumRuleCall();
					}
				)
			)
			this_DOT_1=RULE_DOT
			{
				newLeafNode(this_DOT_1, grammarAccess.getEffectiveTimeFilterAccess().getDOTTerminalRuleCall_0_1());
			}
		)?
		this_EFFECTIVE_TIME_KEYWORD_2=RULE_EFFECTIVE_TIME_KEYWORD
		{
			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_2, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_2_0());
				}
				lv_op_3_0=ruleNUMERIC_OPERATOR
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
					}
					set(
						$current,
						"op",
						lv_op_3_0,
						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			(
				lv_effectiveTime_4_0=RULE_STRING
				{
					newLeafNode(lv_effectiveTime_4_0, grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_3_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getEffectiveTimeFilterRule());
					}
					setWithLastConsumed(
						$current,
						"effectiveTime",
						lv_effectiveTime_4_0,
						"com.b2international.snomed.ecl.Ecl.STRING");
				}
			)
		)
	)
;

// Entry rule entryRulePreferredInFilter
entryRulePreferredInFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPreferredInFilterRule()); }
	iv_rulePreferredInFilter=rulePreferredInFilter
	{ $current=$iv_rulePreferredInFilter.current; }
	EOF;

// Rule PreferredInFilter
rulePreferredInFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_PREFERRED_IN_KEYWORD_0=RULE_PREFERRED_IN_KEYWORD
		{
			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPreferredInFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleAcceptableInFilter
entryRuleAcceptableInFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAcceptableInFilterRule()); }
	iv_ruleAcceptableInFilter=ruleAcceptableInFilter
	{ $current=$iv_ruleAcceptableInFilter.current; }
	EOF;

// Rule AcceptableInFilter
ruleAcceptableInFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_ACCEPTABLE_IN_KEYWORD_0=RULE_ACCEPTABLE_IN_KEYWORD
		{
			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getAcceptableInFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleLanguageRefSetFilter
entryRuleLanguageRefSetFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLanguageRefSetFilterRule()); }
	iv_ruleLanguageRefSetFilter=ruleLanguageRefSetFilter
	{ $current=$iv_ruleLanguageRefSetFilter.current; }
	EOF;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_LANGUAGE_REFSET_ID_KEYWORD_0=RULE_LANGUAGE_REFSET_ID_KEYWORD
		{
			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
				}
				lv_languageRefSetId_2_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getLanguageRefSetFilterRule());
					}
					set(
						$current,
						"languageRefSetId",
						lv_languageRefSetId_2_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleCaseSignificanceFilter
entryRuleCaseSignificanceFilter returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCaseSignificanceFilterRule()); }
	iv_ruleCaseSignificanceFilter=ruleCaseSignificanceFilter
	{ $current=$iv_ruleCaseSignificanceFilter.current; }
	EOF;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CASE_SIGNIFICANCE_ID_KEYWORD_0=RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{
			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
		}
		this_EQUAL_1=RULE_EQUAL
		{
			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0());
				}
				lv_caseSignificanceId_2_0=ruleExpressionConstraint
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getCaseSignificanceFilterRule());
					}
					set(
						$current,
						"caseSignificanceId",
						lv_caseSignificanceId_2_0,
						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSnomedIdentifier
entryRuleSnomedIdentifier returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getSnomedIdentifierRule()); }
	iv_ruleSnomedIdentifier=ruleSnomedIdentifier
	{ $current=$iv_ruleSnomedIdentifier.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule SnomedIdentifier
ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_DIGIT_NONZERO_0=RULE_DIGIT_NONZERO
		{
			$current.merge(this_DIGIT_NONZERO_0);
		}
		{
			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
		}
		    |
		this_DIGIT_ZERO_1=RULE_DIGIT_ZERO
		{
			$current.merge(this_DIGIT_ZERO_1);
		}
		{
			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1());
		}
	)+
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); }
	iv_ruleNonNegativeInteger=ruleNonNegativeInteger
	{ $current=$iv_ruleNonNegativeInteger.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_DIGIT_NONZERO_0=RULE_DIGIT_NONZERO
		{
			$current.merge(this_DIGIT_NONZERO_0);
		}
		{
			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0());
		}
		    |
		this_DIGIT_ZERO_1=RULE_DIGIT_ZERO
		{
			$current.merge(this_DIGIT_ZERO_1);
		}
		{
			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1());
		}
	)+
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); }
	iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal
	{ $current=$iv_ruleNonNegativeDecimal.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
		}
		this_NonNegativeInteger_0=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		this_DOT_1=RULE_DOT
		{
			$current.merge(this_DOT_1);
		}
		{
			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
		}
		(
			this_DIGIT_NONZERO_2=RULE_DIGIT_NONZERO
			{
				$current.merge(this_DIGIT_NONZERO_2);
			}
			{
				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
			}
			    |
			this_DIGIT_ZERO_3=RULE_DIGIT_ZERO
			{
				$current.merge(this_DIGIT_ZERO_3);
			}
			{
				newLeafNode(this_DIGIT_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1());
			}
		)*
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleMaxValue
entryRuleMaxValue returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getMaxValueRule()); }
	iv_ruleMaxValue=ruleMaxValue
	{ $current=$iv_ruleMaxValue.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule MaxValue
ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0());
		}
		this_NonNegativeInteger_0=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_0);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_WILDCARD_1=RULE_WILDCARD
		{
			$current.merge(this_WILDCARD_1);
		}
		{
			newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInteger
entryRuleInteger returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getIntegerRule()); }
	iv_ruleInteger=ruleInteger
	{ $current=$iv_ruleInteger.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_PLUS_0=RULE_PLUS
			{
				$current.merge(this_PLUS_0);
			}
			{
				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
			}
			    |
			this_DASH_1=RULE_DASH
			{
				$current.merge(this_DASH_1);
			}
			{
				newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1());
			}
		)?
		{
			newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1());
		}
		this_NonNegativeInteger_2=ruleNonNegativeInteger
		{
			$current.merge(this_NonNegativeInteger_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDecimalRule()); }
	iv_ruleDecimal=ruleDecimal
	{ $current=$iv_ruleDecimal.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		(
			this_PLUS_0=RULE_PLUS
			{
				$current.merge(this_PLUS_0);
			}
			{
				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
			}
			    |
			this_DASH_1=RULE_DASH
			{
				$current.merge(this_DASH_1);
			}
			{
				newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1());
			}
		)?
		{
			newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1());
		}
		this_NonNegativeDecimal_2=ruleNonNegativeDecimal
		{
			$current.merge(this_NonNegativeDecimal_2);
		}
		{
			afterParserOrEnumRuleCall();
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleBoolean
entryRuleBoolean returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getBooleanRule()); }
	iv_ruleBoolean=ruleBoolean
	{ $current=$iv_ruleBoolean.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule Boolean
ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_TRUE_KEYWORD_0=RULE_TRUE_KEYWORD
		{
			$current.merge(this_TRUE_KEYWORD_0);
		}
		{
			newLeafNode(this_TRUE_KEYWORD_0, grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_FALSE_KEYWORD_1=RULE_FALSE_KEYWORD
		{
			$current.merge(this_FALSE_KEYWORD_1);
		}
		{
			newLeafNode(this_FALSE_KEYWORD_1, grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1());
		}
	)
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleUnquotedString
entryRuleUnquotedString returns [String current=null]:
	{ newCompositeNode(grammarAccess.getUnquotedStringRule()); }
	iv_ruleUnquotedString=ruleUnquotedString
	{ $current=$iv_ruleUnquotedString.current.getText(); }
	EOF;

// Rule UnquotedString
ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CASE_SIGNIFICANCE_ID_KEYWORD_0=RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{
			$current.merge(this_CASE_SIGNIFICANCE_ID_KEYWORD_0);
		}
		{
			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_LANGUAGE_REFSET_ID_KEYWORD_1=RULE_LANGUAGE_REFSET_ID_KEYWORD
		{
			$current.merge(this_LANGUAGE_REFSET_ID_KEYWORD_1);
		}
		{
			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_1, grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_EFFECTIVE_TIME_KEYWORD_2=RULE_EFFECTIVE_TIME_KEYWORD
		{
			$current.merge(this_EFFECTIVE_TIME_KEYWORD_2);
		}
		{
			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_2, grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_2());
		}
		    |
		this_ACCEPTABLE_IN_KEYWORD_3=RULE_ACCEPTABLE_IN_KEYWORD
		{
			$current.merge(this_ACCEPTABLE_IN_KEYWORD_3);
		}
		{
			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_3, grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_3());
		}
		    |
		this_DESCRIPTION_KEYWORD_4=RULE_DESCRIPTION_KEYWORD
		{
			$current.merge(this_DESCRIPTION_KEYWORD_4);
		}
		{
			newLeafNode(this_DESCRIPTION_KEYWORD_4, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_4());
		}
		    |
		this_PREFERRED_IN_KEYWORD_5=RULE_PREFERRED_IN_KEYWORD
		{
			$current.merge(this_PREFERRED_IN_KEYWORD_5);
		}
		{
			newLeafNode(this_PREFERRED_IN_KEYWORD_5, grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_5());
		}
		    |
		this_SEMANTIC_TAG_KEYWORD_6=RULE_SEMANTIC_TAG_KEYWORD
		{
			$current.merge(this_SEMANTIC_TAG_KEYWORD_6);
		}
		{
			newLeafNode(this_SEMANTIC_TAG_KEYWORD_6, grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_6());
		}
		    |
		this_DIALECTID_KEYWORD_7=RULE_DIALECTID_KEYWORD
		{
			$current.merge(this_DIALECTID_KEYWORD_7);
		}
		{
			newLeafNode(this_DIALECTID_KEYWORD_7, grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_7());
		}
		    |
		this_LANGUAGE_KEYWORD_8=RULE_LANGUAGE_KEYWORD
		{
			$current.merge(this_LANGUAGE_KEYWORD_8);
		}
		{
			newLeafNode(this_LANGUAGE_KEYWORD_8, grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_8());
		}
		    |
		this_MODULEID_KEYWORD_9=RULE_MODULEID_KEYWORD
		{
			$current.merge(this_MODULEID_KEYWORD_9);
		}
		{
			newLeafNode(this_MODULEID_KEYWORD_9, grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_9());
		}
		    |
		this_CONCEPT_KEYWORD_10=RULE_CONCEPT_KEYWORD
		{
			$current.merge(this_CONCEPT_KEYWORD_10);
		}
		{
			newLeafNode(this_CONCEPT_KEYWORD_10, grammarAccess.getUnquotedStringAccess().getCONCEPT_KEYWORDTerminalRuleCall_10());
		}
		    |
		this_DIALECT_KEYWORD_11=RULE_DIALECT_KEYWORD
		{
			$current.merge(this_DIALECT_KEYWORD_11);
		}
		{
			newLeafNode(this_DIALECT_KEYWORD_11, grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_11());
		}
		    |
		this_ACTIVE_KEYWORD_12=RULE_ACTIVE_KEYWORD
		{
			$current.merge(this_ACTIVE_KEYWORD_12);
		}
		{
			newLeafNode(this_ACTIVE_KEYWORD_12, grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_12());
		}
		    |
		this_TYPEID_KEYWORD_13=RULE_TYPEID_KEYWORD
		{
			$current.merge(this_TYPEID_KEYWORD_13);
		}
		{
			newLeafNode(this_TYPEID_KEYWORD_13, grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_13());
		}
		    |
		this_EXCLUSION_KEYWORD_14=RULE_EXCLUSION_KEYWORD
		{
			$current.merge(this_EXCLUSION_KEYWORD_14);
		}
		{
			newLeafNode(this_EXCLUSION_KEYWORD_14, grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_14());
		}
		    |
		this_EXACT_KEYWORD_15=RULE_EXACT_KEYWORD
		{
			$current.merge(this_EXACT_KEYWORD_15);
		}
		{
			newLeafNode(this_EXACT_KEYWORD_15, grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_15());
		}
		    |
		this_FALSE_KEYWORD_16=RULE_FALSE_KEYWORD
		{
			$current.merge(this_FALSE_KEYWORD_16);
		}
		{
			newLeafNode(this_FALSE_KEYWORD_16, grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_16());
		}
		    |
		this_MATCH_KEYWORD_17=RULE_MATCH_KEYWORD
		{
			$current.merge(this_MATCH_KEYWORD_17);
		}
		{
			newLeafNode(this_MATCH_KEYWORD_17, grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_17());
		}
		    |
		this_REGEX_KEYWORD_18=RULE_REGEX_KEYWORD
		{
			$current.merge(this_REGEX_KEYWORD_18);
		}
		{
			newLeafNode(this_REGEX_KEYWORD_18, grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_18());
		}
		    |
		this_TERM_KEYWORD_19=RULE_TERM_KEYWORD
		{
			$current.merge(this_TERM_KEYWORD_19);
		}
		{
			newLeafNode(this_TERM_KEYWORD_19, grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_19());
		}
		    |
		this_TRUE_KEYWORD_20=RULE_TRUE_KEYWORD
		{
			$current.merge(this_TRUE_KEYWORD_20);
		}
		{
			newLeafNode(this_TRUE_KEYWORD_20, grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_20());
		}
		    |
		this_TYPE_KEYWORD_21=RULE_TYPE_KEYWORD
		{
			$current.merge(this_TYPE_KEYWORD_21);
		}
		{
			newLeafNode(this_TYPE_KEYWORD_21, grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_21());
		}
		    |
		this_WILD_KEYWORD_22=RULE_WILD_KEYWORD
		{
			$current.merge(this_WILD_KEYWORD_22);
		}
		{
			newLeafNode(this_WILD_KEYWORD_22, grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_22());
		}
		    |
		this_CONJUNCTION_KEYWORD_23=RULE_CONJUNCTION_KEYWORD
		{
			$current.merge(this_CONJUNCTION_KEYWORD_23);
		}
		{
			newLeafNode(this_CONJUNCTION_KEYWORD_23, grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_23());
		}
		    |
		this_DISJUNCTION_KEYWORD_24=RULE_DISJUNCTION_KEYWORD
		{
			$current.merge(this_DISJUNCTION_KEYWORD_24);
		}
		{
			newLeafNode(this_DISJUNCTION_KEYWORD_24, grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_24());
		}
		    |
		this_REVERSED_25=RULE_REVERSED
		{
			$current.merge(this_REVERSED_25);
		}
		{
			newLeafNode(this_REVERSED_25, grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_25());
		}
		    |
		this_KEYWORD_26=RULE_KEYWORD
		{
			$current.merge(this_KEYWORD_26);
		}
		{
			newLeafNode(this_KEYWORD_26, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_26());
		}
	)
;

// Entry rule entryRuleDialectAliasValue
entryRuleDialectAliasValue returns [String current=null]@init {
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}:
	{ newCompositeNode(grammarAccess.getDialectAliasValueRule()); }
	iv_ruleDialectAliasValue=ruleDialectAliasValue
	{ $current=$iv_ruleDialectAliasValue.current.getText(); }
	EOF;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAliasValue
ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
@after {
	leaveRule();
}:
	(
		this_DASH_0=RULE_DASH
		{
			$current.merge(this_DASH_0);
		}
		{
			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
		}
		    |
		{
			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
		}
		this_UnquotedString_1=ruleUnquotedString
		{
			$current.merge(this_UnquotedString_1);
		}
		{
			afterParserOrEnumRuleCall();
		}
		    |
		this_DIGIT_ZERO_2=RULE_DIGIT_ZERO
		{
			$current.merge(this_DIGIT_ZERO_2);
		}
		{
			newLeafNode(this_DIGIT_ZERO_2, grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2());
		}
		    |
		this_DIGIT_NONZERO_3=RULE_DIGIT_NONZERO
		{
			$current.merge(this_DIGIT_NONZERO_3);
		}
		{
			newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3());
		}
	)+
;
finally {
	myHiddenTokenState.restore();
}

// Entry rule entryRuleLEXICAL_SEARCH_TYPE
entryRuleLEXICAL_SEARCH_TYPE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getLEXICAL_SEARCH_TYPERule()); }
	iv_ruleLEXICAL_SEARCH_TYPE=ruleLEXICAL_SEARCH_TYPE
	{ $current=$iv_ruleLEXICAL_SEARCH_TYPE.current.getText(); }
	EOF;

// Rule LEXICAL_SEARCH_TYPE
ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_MATCH_KEYWORD_0=RULE_MATCH_KEYWORD
		{
			$current.merge(this_MATCH_KEYWORD_0);
		}
		{
			newLeafNode(this_MATCH_KEYWORD_0, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_WILD_KEYWORD_1=RULE_WILD_KEYWORD
		{
			$current.merge(this_WILD_KEYWORD_1);
		}
		{
			newLeafNode(this_WILD_KEYWORD_1, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1());
		}
		    |
		this_REGEX_KEYWORD_2=RULE_REGEX_KEYWORD
		{
			$current.merge(this_REGEX_KEYWORD_2);
		}
		{
			newLeafNode(this_REGEX_KEYWORD_2, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getREGEX_KEYWORDTerminalRuleCall_2());
		}
		    |
		this_EXACT_KEYWORD_3=RULE_EXACT_KEYWORD
		{
			$current.merge(this_EXACT_KEYWORD_3);
		}
		{
			newLeafNode(this_EXACT_KEYWORD_3, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_3());
		}
	)
;

// Entry rule entryRuleDOMAIN
entryRuleDOMAIN returns [String current=null]:
	{ newCompositeNode(grammarAccess.getDOMAINRule()); }
	iv_ruleDOMAIN=ruleDOMAIN
	{ $current=$iv_ruleDOMAIN.current.getText(); }
	EOF;

// Rule DOMAIN
ruleDOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_CONCEPT_KEYWORD_0=RULE_CONCEPT_KEYWORD
		{
			$current.merge(this_CONCEPT_KEYWORD_0);
		}
		{
			newLeafNode(this_CONCEPT_KEYWORD_0, grammarAccess.getDOMAINAccess().getCONCEPT_KEYWORDTerminalRuleCall_0());
		}
		    |
		this_DESCRIPTION_KEYWORD_1=RULE_DESCRIPTION_KEYWORD
		{
			$current.merge(this_DESCRIPTION_KEYWORD_1);
		}
		{
			newLeafNode(this_DESCRIPTION_KEYWORD_1, grammarAccess.getDOMAINAccess().getDESCRIPTION_KEYWORDTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleNON_NUMERIC_OPERATOR
entryRuleNON_NUMERIC_OPERATOR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNON_NUMERIC_OPERATORRule()); }
	iv_ruleNON_NUMERIC_OPERATOR=ruleNON_NUMERIC_OPERATOR
	{ $current=$iv_ruleNON_NUMERIC_OPERATOR.current.getText(); }
	EOF;

// Rule NON_NUMERIC_OPERATOR
ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EQUAL_0=RULE_EQUAL
		{
			$current.merge(this_EQUAL_0);
		}
		{
			newLeafNode(this_EQUAL_0, grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
		}
		    |
		this_NOT_EQUAL_1=RULE_NOT_EQUAL
		{
			$current.merge(this_NOT_EQUAL_1);
		}
		{
			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
		}
	)
;

// Entry rule entryRuleNUMERIC_OPERATOR
entryRuleNUMERIC_OPERATOR returns [String current=null]:
	{ newCompositeNode(grammarAccess.getNUMERIC_OPERATORRule()); }
	iv_ruleNUMERIC_OPERATOR=ruleNUMERIC_OPERATOR
	{ $current=$iv_ruleNUMERIC_OPERATOR.current.getText(); }
	EOF;

// Rule NUMERIC_OPERATOR
ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_EQUAL_0=RULE_EQUAL
		{
			$current.merge(this_EQUAL_0);
		}
		{
			newLeafNode(this_EQUAL_0, grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
		}
		    |
		this_NOT_EQUAL_1=RULE_NOT_EQUAL
		{
			$current.merge(this_NOT_EQUAL_1);
		}
		{
			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
		}
		    |
		this_GT_2=RULE_GT
		{
			$current.merge(this_GT_2);
		}
		{
			newLeafNode(this_GT_2, grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2());
		}
		    |
		this_LT_3=RULE_LT
		{
			$current.merge(this_LT_3);
		}
		{
			newLeafNode(this_LT_3, grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3());
		}
		    |
		this_GTE_4=RULE_GTE
		{
			$current.merge(this_GTE_4);
		}
		{
			newLeafNode(this_GTE_4, grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4());
		}
		    |
		this_LTE_5=RULE_LTE
		{
			$current.merge(this_LTE_5);
		}
		{
			newLeafNode(this_LTE_5, grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5());
		}
	)
;

RULE_CASE_SIGNIFICANCE_ID_KEYWORD : ('caseSignificanceId'|('C'|'c') ('A'|'a') ('S'|'s') ('E'|'e') ('S'|'s') ('I'|'i') ('G'|'g') ('N'|'n') ('I'|'i') ('F'|'f') ('I'|'i') ('C'|'c') ('A'|'a') ('N'|'n') ('C'|'c') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_LANGUAGE_REFSET_ID_KEYWORD : ('languageRefsetId'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e') ('R'|'r') ('E'|'e') ('F'|'f') ('S'|'s') ('E'|'e') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_EFFECTIVE_TIME_KEYWORD : ('effectiveTime'|('E'|'e') ('F'|'f') ('F'|'f') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('V'|'v') ('E'|'e') ('T'|'t') ('I'|'i') ('M'|'m') ('E'|'e'));

RULE_ACCEPTABLE_IN_KEYWORD : ('acceptableIn'|('A'|'a') ('C'|'c') ('C'|'c') ('E'|'e') ('P'|'p') ('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e') ('I'|'i') ('N'|'n'));

RULE_DESCRIPTION_KEYWORD : ('Description'|('D'|'d') ('E'|'e') ('S'|'s') ('C'|'c') ('R'|'r') ('I'|'i') ('P'|'p') ('T'|'t') ('I'|'i') ('O'|'o') ('N'|'n'));

RULE_PREFERRED_IN_KEYWORD : ('preferredIn'|('P'|'p') ('R'|'r') ('E'|'e') ('F'|'f') ('E'|'e') ('R'|'r') ('R'|'r') ('E'|'e') ('D'|'d') ('I'|'i') ('N'|'n'));

RULE_SEMANTIC_TAG_KEYWORD : ('semanticTag'|('S'|'s') ('E'|'e') ('M'|'m') ('A'|'a') ('N'|'n') ('T'|'t') ('I'|'i') ('C'|'c') ('T'|'t') ('A'|'a') ('G'|'g'));

RULE_DIALECTID_KEYWORD : ('dialectId'|('D'|'d') ('I'|'i') ('A'|'a') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_LANGUAGE_KEYWORD : ('language'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e'));

RULE_MODULEID_KEYWORD : ('moduleId'|('M'|'m') ('O'|'o') ('D'|'d') ('U'|'u') ('L'|'l') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_CONCEPT_KEYWORD : ('Concept'|('C'|'c') ('O'|'o') ('N'|'n') ('C'|'c') ('E'|'e') ('P'|'p') ('T'|'t'));

RULE_DIALECT_KEYWORD : ('dialect'|('D'|'d') ('I'|'i') ('A'|'a') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t'));

RULE_ACTIVE_KEYWORD : ('active'|('A'|'a') ('C'|'c') ('T'|'t') ('I'|'i') ('V'|'v') ('E'|'e'));

RULE_TYPEID_KEYWORD : ('typeId'|('T'|'t') ('Y'|'y') ('P'|'p') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_EXCLUSION_KEYWORD : ('MINUS'|('M'|'m') ('I'|'i') ('N'|'n') ('U'|'u') ('S'|'s'));

RULE_EXACT_KEYWORD : ('exact'|('E'|'e') ('X'|'x') ('A'|'a') ('C'|'c') ('T'|'t'));

RULE_FALSE_KEYWORD : ('false'|('F'|'f') ('A'|'a') ('L'|'l') ('S'|'s') ('E'|'e'));

RULE_MATCH_KEYWORD : ('match'|('M'|'m') ('A'|'a') ('T'|'t') ('C'|'c') ('H'|'h'));

RULE_REGEX_KEYWORD : ('regex'|('R'|'r') ('E'|'e') ('G'|'g') ('E'|'e') ('X'|'x'));

RULE_TERM_KEYWORD : ('term'|('T'|'t') ('E'|'e') ('R'|'r') ('M'|'m'));

RULE_TRUE_KEYWORD : ('true'|('T'|'t') ('R'|'r') ('U'|'u') ('E'|'e'));

RULE_TYPE_KEYWORD : ('type'|('T'|'t') ('Y'|'y') ('P'|'p') ('E'|'e'));

RULE_WILD_KEYWORD : ('wild'|('W'|'w') ('I'|'i') ('L'|'l') ('D'|'d'));

RULE_CONJUNCTION_KEYWORD : ('AND'|('A'|'a') ('N'|'n') ('D'|'d'));

RULE_DISJUNCTION_KEYWORD : ('OR'|('O'|'o') ('R'|'r'));

RULE_REVERSED : 'R';

RULE_KEYWORD : ('a'..'z'|'A'..'Z')+;

RULE_DBL_LT_EM : '<<!';

RULE_DBL_GT_EM : '>>!';

RULE_DBL_LT : '<<';

RULE_DBL_GT : '>>';

RULE_LT_EM : '<!';

RULE_GT_EM : '>!';

RULE_GTE : '>=';

RULE_LTE : '<=';

RULE_DOUBLE_CURLY_OPEN : '{{';

RULE_DOUBLE_CURLY_CLOSE : '}}';

RULE_PIPE_DELIMITED_STRING : '|' ( options {greedy=false;} : . )*'|';

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_TO : '..';

RULE_COMMA : ',';

RULE_DIGIT_ZERO : '0';

RULE_DIGIT_NONZERO : '1'..'9';

RULE_COLON : ':';

RULE_CURLY_OPEN : '{';

RULE_CURLY_CLOSE : '}';

RULE_ROUND_OPEN : '(';

RULE_ROUND_CLOSE : ')';

RULE_SQUARE_OPEN : '[';

RULE_SQUARE_CLOSE : ']';

RULE_PLUS : '+';

RULE_DASH : '-';

RULE_CARET : '^';

RULE_DOT : '.';

RULE_WILDCARD : '*';

RULE_EQUAL : '=';

RULE_NOT_EQUAL : '!=';

RULE_LT : '<';

RULE_GT : '>';

RULE_HASH : '#';

RULE_WS : (' '|'\t'|'\n'|'\r');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;
