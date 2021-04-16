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
parser grammar InternalEclParser;

options {
	tokenVocab=InternalEclLexer;
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@header {
package com.b2international.snomed.ecl.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import com.b2international.snomed.ecl.services.EclGrammarAccess;

}
@members {
	private EclGrammarAccess grammarAccess;
	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
	
	{
		tokenNameToValue.put("True", "'true'");
		tokenNameToValue.put("Wild", "'wild'");
		tokenNameToValue.put("Exact", "'exact'");
		tokenNameToValue.put("False", "'false'");
		tokenNameToValue.put("Match", "'match'");
		tokenNameToValue.put("Regex", "'regex'");
	}

	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		String result = tokenNameToValue.get(tokenName);
		if (result == null)
			result = tokenName;
		return result;
	}
}

// Entry rule entryRuleScript
entryRuleScript
:
{ before(grammarAccess.getScriptRule()); }
	 ruleScript
{ after(grammarAccess.getScriptRule()); } 
	 EOF 
;

// Rule Script
ruleScript 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getScriptAccess().getGroup()); }
		(rule__Script__Group__0)
		{ after(grammarAccess.getScriptAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpressionConstraint
entryRuleExpressionConstraint
:
{ before(grammarAccess.getExpressionConstraintRule()); }
	 ruleExpressionConstraint
{ after(grammarAccess.getExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExpressionConstraint
ruleExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
		ruleOrExpressionConstraint
		{ after(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrExpressionConstraint
entryRuleOrExpressionConstraint
:
{ before(grammarAccess.getOrExpressionConstraintRule()); }
	 ruleOrExpressionConstraint
{ after(grammarAccess.getOrExpressionConstraintRule()); } 
	 EOF 
;

// Rule OrExpressionConstraint
ruleOrExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
		(rule__OrExpressionConstraint__Group__0)
		{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndExpressionConstraint
entryRuleAndExpressionConstraint
:
{ before(grammarAccess.getAndExpressionConstraintRule()); }
	 ruleAndExpressionConstraint
{ after(grammarAccess.getAndExpressionConstraintRule()); } 
	 EOF 
;

// Rule AndExpressionConstraint
ruleAndExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
		(rule__AndExpressionConstraint__Group__0)
		{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExclusionExpressionConstraint
entryRuleExclusionExpressionConstraint
:
{ before(grammarAccess.getExclusionExpressionConstraintRule()); }
	 ruleExclusionExpressionConstraint
{ after(grammarAccess.getExclusionExpressionConstraintRule()); } 
	 EOF 
;

// Rule ExclusionExpressionConstraint
ruleExclusionExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
		(rule__ExclusionExpressionConstraint__Group__0)
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRefinedExpressionConstraint
entryRuleRefinedExpressionConstraint
:
{ before(grammarAccess.getRefinedExpressionConstraintRule()); }
	 ruleRefinedExpressionConstraint
{ after(grammarAccess.getRefinedExpressionConstraintRule()); } 
	 EOF 
;

// Rule RefinedExpressionConstraint
ruleRefinedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
		(rule__RefinedExpressionConstraint__Group__0)
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDottedExpressionConstraint
entryRuleDottedExpressionConstraint
:
{ before(grammarAccess.getDottedExpressionConstraintRule()); }
	 ruleDottedExpressionConstraint
{ after(grammarAccess.getDottedExpressionConstraintRule()); } 
	 EOF 
;

// Rule DottedExpressionConstraint
ruleDottedExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
		(rule__DottedExpressionConstraint__Group__0)
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubExpressionConstraint
entryRuleSubExpressionConstraint
:
{ before(grammarAccess.getSubExpressionConstraintRule()); }
	 ruleSubExpressionConstraint
{ after(grammarAccess.getSubExpressionConstraintRule()); } 
	 EOF 
;

// Rule SubExpressionConstraint
ruleSubExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
		(rule__SubExpressionConstraint__Alternatives)
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclFocusConcept
entryRuleEclFocusConcept
:
{ before(grammarAccess.getEclFocusConceptRule()); }
	 ruleEclFocusConcept
{ after(grammarAccess.getEclFocusConceptRule()); } 
	 EOF 
;

// Rule EclFocusConcept
ruleEclFocusConcept 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
		(rule__EclFocusConcept__Alternatives)
		{ after(grammarAccess.getEclFocusConceptAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOf
entryRuleChildOf
:
{ before(grammarAccess.getChildOfRule()); }
	 ruleChildOf
{ after(grammarAccess.getChildOfRule()); } 
	 EOF 
;

// Rule ChildOf
ruleChildOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOfAccess().getGroup()); }
		(rule__ChildOf__Group__0)
		{ after(grammarAccess.getChildOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleChildOrSelfOf
entryRuleChildOrSelfOf
:
{ before(grammarAccess.getChildOrSelfOfRule()); }
	 ruleChildOrSelfOf
{ after(grammarAccess.getChildOrSelfOfRule()); } 
	 EOF 
;

// Rule ChildOrSelfOf
ruleChildOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
		(rule__ChildOrSelfOf__Group__0)
		{ after(grammarAccess.getChildOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOf
entryRuleDescendantOf
:
{ before(grammarAccess.getDescendantOfRule()); }
	 ruleDescendantOf
{ after(grammarAccess.getDescendantOfRule()); } 
	 EOF 
;

// Rule DescendantOf
ruleDescendantOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOfAccess().getGroup()); }
		(rule__DescendantOf__Group__0)
		{ after(grammarAccess.getDescendantOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDescendantOrSelfOf
entryRuleDescendantOrSelfOf
:
{ before(grammarAccess.getDescendantOrSelfOfRule()); }
	 ruleDescendantOrSelfOf
{ after(grammarAccess.getDescendantOrSelfOfRule()); } 
	 EOF 
;

// Rule DescendantOrSelfOf
ruleDescendantOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
		(rule__DescendantOrSelfOf__Group__0)
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOf
entryRuleParentOf
:
{ before(grammarAccess.getParentOfRule()); }
	 ruleParentOf
{ after(grammarAccess.getParentOfRule()); } 
	 EOF 
;

// Rule ParentOf
ruleParentOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOfAccess().getGroup()); }
		(rule__ParentOf__Group__0)
		{ after(grammarAccess.getParentOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleParentOrSelfOf
entryRuleParentOrSelfOf
:
{ before(grammarAccess.getParentOrSelfOfRule()); }
	 ruleParentOrSelfOf
{ after(grammarAccess.getParentOrSelfOfRule()); } 
	 EOF 
;

// Rule ParentOrSelfOf
ruleParentOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
		(rule__ParentOrSelfOf__Group__0)
		{ after(grammarAccess.getParentOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOf
entryRuleAncestorOf
:
{ before(grammarAccess.getAncestorOfRule()); }
	 ruleAncestorOf
{ after(grammarAccess.getAncestorOfRule()); } 
	 EOF 
;

// Rule AncestorOf
ruleAncestorOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOfAccess().getGroup()); }
		(rule__AncestorOf__Group__0)
		{ after(grammarAccess.getAncestorOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAncestorOrSelfOf
entryRuleAncestorOrSelfOf
:
{ before(grammarAccess.getAncestorOrSelfOfRule()); }
	 ruleAncestorOrSelfOf
{ after(grammarAccess.getAncestorOrSelfOfRule()); } 
	 EOF 
;

// Rule AncestorOrSelfOf
ruleAncestorOrSelfOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
		(rule__AncestorOrSelfOf__Group__0)
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMemberOf
entryRuleMemberOf
:
{ before(grammarAccess.getMemberOfRule()); }
	 ruleMemberOf
{ after(grammarAccess.getMemberOfRule()); } 
	 EOF 
;

// Rule MemberOf
ruleMemberOf 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberOfAccess().getGroup()); }
		(rule__MemberOf__Group__0)
		{ after(grammarAccess.getMemberOfAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclConceptReference
entryRuleEclConceptReference
:
{ before(grammarAccess.getEclConceptReferenceRule()); }
	 ruleEclConceptReference
{ after(grammarAccess.getEclConceptReferenceRule()); } 
	 EOF 
;

// Rule EclConceptReference
ruleEclConceptReference 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
		(rule__EclConceptReference__Group__0)
		{ after(grammarAccess.getEclConceptReferenceAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclConceptReferenceSet
entryRuleEclConceptReferenceSet
:
{ before(grammarAccess.getEclConceptReferenceSetRule()); }
	 ruleEclConceptReferenceSet
{ after(grammarAccess.getEclConceptReferenceSetRule()); } 
	 EOF 
;

// Rule EclConceptReferenceSet
ruleEclConceptReferenceSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getGroup()); }
		(rule__EclConceptReferenceSet__Group__0)
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAny
entryRuleAny
:
{ before(grammarAccess.getAnyRule()); }
	 ruleAny
{ after(grammarAccess.getAnyRule()); } 
	 EOF 
;

// Rule Any
ruleAny 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAnyAccess().getGroup()); }
		(rule__Any__Group__0)
		{ after(grammarAccess.getAnyAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclRefinement
entryRuleEclRefinement
:
{ before(grammarAccess.getEclRefinementRule()); }
	 ruleEclRefinement
{ after(grammarAccess.getEclRefinementRule()); } 
	 EOF 
;

// Rule EclRefinement
ruleEclRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
		ruleOrRefinement
		{ after(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrRefinement
entryRuleOrRefinement
:
{ before(grammarAccess.getOrRefinementRule()); }
	 ruleOrRefinement
{ after(grammarAccess.getOrRefinementRule()); } 
	 EOF 
;

// Rule OrRefinement
ruleOrRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrRefinementAccess().getGroup()); }
		(rule__OrRefinement__Group__0)
		{ after(grammarAccess.getOrRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndRefinement
entryRuleAndRefinement
:
{ before(grammarAccess.getAndRefinementRule()); }
	 ruleAndRefinement
{ after(grammarAccess.getAndRefinementRule()); } 
	 EOF 
;

// Rule AndRefinement
ruleAndRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndRefinementAccess().getGroup()); }
		(rule__AndRefinement__Group__0)
		{ after(grammarAccess.getAndRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubRefinement
entryRuleSubRefinement
:
{ before(grammarAccess.getSubRefinementRule()); }
	 ruleSubRefinement
{ after(grammarAccess.getSubRefinementRule()); } 
	 EOF 
;

// Rule SubRefinement
ruleSubRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAlternatives()); }
		(rule__SubRefinement__Alternatives)
		{ after(grammarAccess.getSubRefinementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedRefinement
entryRuleNestedRefinement
:
{ before(grammarAccess.getNestedRefinementRule()); }
	 ruleNestedRefinement
{ after(grammarAccess.getNestedRefinementRule()); } 
	 EOF 
;

// Rule NestedRefinement
ruleNestedRefinement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getGroup()); }
		(rule__NestedRefinement__Group__0)
		{ after(grammarAccess.getNestedRefinementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeGroup
entryRuleEclAttributeGroup
:
{ before(grammarAccess.getEclAttributeGroupRule()); }
	 ruleEclAttributeGroup
{ after(grammarAccess.getEclAttributeGroupRule()); } 
	 EOF 
;

// Rule EclAttributeGroup
ruleEclAttributeGroup 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
		(rule__EclAttributeGroup__Group__0)
		{ after(grammarAccess.getEclAttributeGroupAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEclAttributeSet
entryRuleEclAttributeSet
:
{ before(grammarAccess.getEclAttributeSetRule()); }
	 ruleEclAttributeSet
{ after(grammarAccess.getEclAttributeSetRule()); } 
	 EOF 
;

// Rule EclAttributeSet
ruleEclAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
		ruleOrAttributeSet
		{ after(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleOrAttributeSet
entryRuleOrAttributeSet
:
{ before(grammarAccess.getOrAttributeSetRule()); }
	 ruleOrAttributeSet
{ after(grammarAccess.getOrAttributeSetRule()); } 
	 EOF 
;

// Rule OrAttributeSet
ruleOrAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getGroup()); }
		(rule__OrAttributeSet__Group__0)
		{ after(grammarAccess.getOrAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAndAttributeSet
entryRuleAndAttributeSet
:
{ before(grammarAccess.getAndAttributeSetRule()); }
	 ruleAndAttributeSet
{ after(grammarAccess.getAndAttributeSetRule()); } 
	 EOF 
;

// Rule AndAttributeSet
ruleAndAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getGroup()); }
		(rule__AndAttributeSet__Group__0)
		{ after(grammarAccess.getAndAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSubAttributeSet
entryRuleSubAttributeSet
:
{ before(grammarAccess.getSubAttributeSetRule()); }
	 ruleSubAttributeSet
{ after(grammarAccess.getSubAttributeSetRule()); } 
	 EOF 
;

// Rule SubAttributeSet
ruleSubAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
		(rule__SubAttributeSet__Alternatives)
		{ after(grammarAccess.getSubAttributeSetAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedAttributeSet
entryRuleNestedAttributeSet
:
{ before(grammarAccess.getNestedAttributeSetRule()); }
	 ruleNestedAttributeSet
{ after(grammarAccess.getNestedAttributeSetRule()); } 
	 EOF 
;

// Rule NestedAttributeSet
ruleNestedAttributeSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
		(rule__NestedAttributeSet__Group__0)
		{ after(grammarAccess.getNestedAttributeSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeConstraint
entryRuleAttributeConstraint
:
{ before(grammarAccess.getAttributeConstraintRule()); }
	 ruleAttributeConstraint
{ after(grammarAccess.getAttributeConstraintRule()); } 
	 EOF 
;

// Rule AttributeConstraint
ruleAttributeConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getGroup()); }
		(rule__AttributeConstraint__Group__0)
		{ after(grammarAccess.getAttributeConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCardinality
entryRuleCardinality
:
{ before(grammarAccess.getCardinalityRule()); }
	 ruleCardinality
{ after(grammarAccess.getCardinalityRule()); } 
	 EOF 
;

// Rule Cardinality
ruleCardinality 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCardinalityAccess().getGroup()); }
		(rule__Cardinality__Group__0)
		{ after(grammarAccess.getCardinalityAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleComparison
entryRuleComparison
:
{ before(grammarAccess.getComparisonRule()); }
	 ruleComparison
{ after(grammarAccess.getComparisonRule()); } 
	 EOF 
;

// Rule Comparison
ruleComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getComparisonAccess().getAlternatives()); }
		(rule__Comparison__Alternatives)
		{ after(grammarAccess.getComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttributeComparison
entryRuleAttributeComparison
:
{ before(grammarAccess.getAttributeComparisonRule()); }
	 ruleAttributeComparison
{ after(grammarAccess.getAttributeComparisonRule()); } 
	 EOF 
;

// Rule AttributeComparison
ruleAttributeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getGroup()); }
		(rule__AttributeComparison__Group__0)
		{ after(grammarAccess.getAttributeComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDataTypeComparison
entryRuleDataTypeComparison
:
{ before(grammarAccess.getDataTypeComparisonRule()); }
	 ruleDataTypeComparison
{ after(grammarAccess.getDataTypeComparisonRule()); } 
	 EOF 
;

// Rule DataTypeComparison
ruleDataTypeComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
		(rule__DataTypeComparison__Alternatives)
		{ after(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBooleanValueComparison
entryRuleBooleanValueComparison
:
{ before(grammarAccess.getBooleanValueComparisonRule()); }
	 ruleBooleanValueComparison
{ after(grammarAccess.getBooleanValueComparisonRule()); } 
	 EOF 
;

// Rule BooleanValueComparison
ruleBooleanValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getGroup()); }
		(rule__BooleanValueComparison__Group__0)
		{ after(grammarAccess.getBooleanValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleStringValueComparison
entryRuleStringValueComparison
:
{ before(grammarAccess.getStringValueComparisonRule()); }
	 ruleStringValueComparison
{ after(grammarAccess.getStringValueComparisonRule()); } 
	 EOF 
;

// Rule StringValueComparison
ruleStringValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getGroup()); }
		(rule__StringValueComparison__Group__0)
		{ after(grammarAccess.getStringValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIntegerValueComparison
entryRuleIntegerValueComparison
:
{ before(grammarAccess.getIntegerValueComparisonRule()); }
	 ruleIntegerValueComparison
{ after(grammarAccess.getIntegerValueComparisonRule()); } 
	 EOF 
;

// Rule IntegerValueComparison
ruleIntegerValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getGroup()); }
		(rule__IntegerValueComparison__Group__0)
		{ after(grammarAccess.getIntegerValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDecimalValueComparison
entryRuleDecimalValueComparison
:
{ before(grammarAccess.getDecimalValueComparisonRule()); }
	 ruleDecimalValueComparison
{ after(grammarAccess.getDecimalValueComparisonRule()); } 
	 EOF 
;

// Rule DecimalValueComparison
ruleDecimalValueComparison 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getGroup()); }
		(rule__DecimalValueComparison__Group__0)
		{ after(grammarAccess.getDecimalValueComparisonAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedExpression
entryRuleNestedExpression
:
{ before(grammarAccess.getNestedExpressionRule()); }
	 ruleNestedExpression
{ after(grammarAccess.getNestedExpressionRule()); } 
	 EOF 
;

// Rule NestedExpression
ruleNestedExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getGroup()); }
		(rule__NestedExpression__Group__0)
		{ after(grammarAccess.getNestedExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilterConstraint
entryRuleFilterConstraint
:
{ before(grammarAccess.getFilterConstraintRule()); }
	 ruleFilterConstraint
{ after(grammarAccess.getFilterConstraintRule()); } 
	 EOF 
;

// Rule FilterConstraint
ruleFilterConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterConstraintAccess().getGroup()); }
		(rule__FilterConstraint__Group__0)
		{ after(grammarAccess.getFilterConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilter
entryRuleFilter
:
{ before(grammarAccess.getFilterRule()); }
	 ruleFilter
{ after(grammarAccess.getFilterRule()); } 
	 EOF 
;

// Rule Filter
ruleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
		ruleDisjunctionFilter
		{ after(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDisjunctionFilter
entryRuleDisjunctionFilter
:
{ before(grammarAccess.getDisjunctionFilterRule()); }
	 ruleDisjunctionFilter
{ after(grammarAccess.getDisjunctionFilterRule()); } 
	 EOF 
;

// Rule DisjunctionFilter
ruleDisjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
		(rule__DisjunctionFilter__Group__0)
		{ after(grammarAccess.getDisjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleConjunctionFilter
entryRuleConjunctionFilter
:
{ before(grammarAccess.getConjunctionFilterRule()); }
	 ruleConjunctionFilter
{ after(grammarAccess.getConjunctionFilterRule()); } 
	 EOF 
;

// Rule ConjunctionFilter
ruleConjunctionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getGroup()); }
		(rule__ConjunctionFilter__Group__0)
		{ after(grammarAccess.getConjunctionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExclusionFilter
entryRuleExclusionFilter
:
{ before(grammarAccess.getExclusionFilterRule()); }
	 ruleExclusionFilter
{ after(grammarAccess.getExclusionFilterRule()); } 
	 EOF 
;

// Rule ExclusionFilter
ruleExclusionFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExclusionFilterAccess().getGroup()); }
		(rule__ExclusionFilter__Group__0)
		{ after(grammarAccess.getExclusionFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNestedFilter
entryRuleNestedFilter
:
{ before(grammarAccess.getNestedFilterRule()); }
	 ruleNestedFilter
{ after(grammarAccess.getNestedFilterRule()); } 
	 EOF 
;

// Rule NestedFilter
ruleNestedFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNestedFilterAccess().getGroup()); }
		(rule__NestedFilter__Group__0)
		{ after(grammarAccess.getNestedFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePropertyFilter
entryRulePropertyFilter
:
{ before(grammarAccess.getPropertyFilterRule()); }
	 rulePropertyFilter
{ after(grammarAccess.getPropertyFilterRule()); } 
	 EOF 
;

// Rule PropertyFilter
rulePropertyFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
		(rule__PropertyFilter__Alternatives)
		{ after(grammarAccess.getPropertyFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTermFilter
entryRuleTermFilter
:
{ before(grammarAccess.getTermFilterRule()); }
	 ruleTermFilter
{ after(grammarAccess.getTermFilterRule()); } 
	 EOF 
;

// Rule TermFilter
ruleTermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTermFilterAccess().getGroup()); }
		(rule__TermFilter__Group__0)
		{ after(grammarAccess.getTermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedTermFilter
entryRuleTypedTermFilter
:
{ before(grammarAccess.getTypedTermFilterRule()); }
	 ruleTypedTermFilter
{ after(grammarAccess.getTypedTermFilterRule()); } 
	 EOF 
;

// Rule TypedTermFilter
ruleTypedTermFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getGroup()); }
		(rule__TypedTermFilter__Group__0)
		{ after(grammarAccess.getTypedTermFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedTermFilterSet
entryRuleTypedTermFilterSet
:
{ before(grammarAccess.getTypedTermFilterSetRule()); }
	 ruleTypedTermFilterSet
{ after(grammarAccess.getTypedTermFilterSetRule()); } 
	 EOF 
;

// Rule TypedTermFilterSet
ruleTypedTermFilterSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getGroup()); }
		(rule__TypedTermFilterSet__Group__0)
		{ after(grammarAccess.getTypedTermFilterSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageCodeFilter
entryRuleLanguageCodeFilter
:
{ before(grammarAccess.getLanguageCodeFilterRule()); }
	 ruleLanguageCodeFilter
{ after(grammarAccess.getLanguageCodeFilterRule()); } 
	 EOF 
;

// Rule LanguageCodeFilter
ruleLanguageCodeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getGroup()); }
		(rule__LanguageCodeFilter__Group__0)
		{ after(grammarAccess.getLanguageCodeFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeFilter
entryRuleTypeFilter
:
{ before(grammarAccess.getTypeFilterRule()); }
	 ruleTypeFilter
{ after(grammarAccess.getTypeFilterRule()); } 
	 EOF 
;

// Rule TypeFilter
ruleTypeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeFilterAccess().getAlternatives()); }
		(rule__TypeFilter__Alternatives)
		{ after(grammarAccess.getTypeFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeIdFilter
entryRuleTypeIdFilter
:
{ before(grammarAccess.getTypeIdFilterRule()); }
	 ruleTypeIdFilter
{ after(grammarAccess.getTypeIdFilterRule()); } 
	 EOF 
;

// Rule TypeIdFilter
ruleTypeIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getGroup()); }
		(rule__TypeIdFilter__Group__0)
		{ after(grammarAccess.getTypeIdFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypeTokenFilter
entryRuleTypeTokenFilter
:
{ before(grammarAccess.getTypeTokenFilterRule()); }
	 ruleTypeTokenFilter
{ after(grammarAccess.getTypeTokenFilterRule()); } 
	 EOF 
;

// Rule TypeTokenFilter
ruleTypeTokenFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getGroup()); }
		(rule__TypeTokenFilter__Group__0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectFilter
entryRuleDialectFilter
:
{ before(grammarAccess.getDialectFilterRule()); }
	 ruleDialectFilter
{ after(grammarAccess.getDialectFilterRule()); } 
	 EOF 
;

// Rule DialectFilter
ruleDialectFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectFilterAccess().getAlternatives()); }
		(rule__DialectFilter__Alternatives)
		{ after(grammarAccess.getDialectFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectIdFilter
entryRuleDialectIdFilter
:
{ before(grammarAccess.getDialectIdFilterRule()); }
	 ruleDialectIdFilter
{ after(grammarAccess.getDialectIdFilterRule()); } 
	 EOF 
;

// Rule DialectIdFilter
ruleDialectIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getGroup()); }
		(rule__DialectIdFilter__Group__0)
		{ after(grammarAccess.getDialectIdFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectAliasFilter
entryRuleDialectAliasFilter
:
{ before(grammarAccess.getDialectAliasFilterRule()); }
	 ruleDialectAliasFilter
{ after(grammarAccess.getDialectAliasFilterRule()); } 
	 EOF 
;

// Rule DialectAliasFilter
ruleDialectAliasFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getGroup()); }
		(rule__DialectAliasFilter__Group__0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialect
entryRuleDialect
:
{ before(grammarAccess.getDialectRule()); }
	 ruleDialect
{ after(grammarAccess.getDialectRule()); } 
	 EOF 
;

// Rule Dialect
ruleDialect 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAccess().getGroup()); }
		(rule__Dialect__Group__0)
		{ after(grammarAccess.getDialectAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDialectAlias
entryRuleDialectAlias
:
{ before(grammarAccess.getDialectAliasRule()); }
	 ruleDialectAlias
{ after(grammarAccess.getDialectAliasRule()); } 
	 EOF 
;

// Rule DialectAlias
ruleDialectAlias 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAliasAccess().getGroup()); }
		(rule__DialectAlias__Group__0)
		{ after(grammarAccess.getDialectAliasAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptability
entryRuleAcceptability
:
{ before(grammarAccess.getAcceptabilityRule()); }
	 ruleAcceptability
{ after(grammarAccess.getAcceptabilityRule()); } 
	 EOF 
;

// Rule Acceptability
ruleAcceptability 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAlternatives()); }
		(rule__Acceptability__Alternatives)
		{ after(grammarAccess.getAcceptabilityAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptabilityIdSet
entryRuleAcceptabilityIdSet
:
{ before(grammarAccess.getAcceptabilityIdSetRule()); }
	 ruleAcceptabilityIdSet
{ after(grammarAccess.getAcceptabilityIdSetRule()); } 
	 EOF 
;

// Rule AcceptabilityIdSet
ruleAcceptabilityIdSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesAssignment()); }
		(rule__AcceptabilityIdSet__AcceptabilitiesAssignment)
		{ after(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptabilityTokenSet
entryRuleAcceptabilityTokenSet
:
{ before(grammarAccess.getAcceptabilityTokenSetRule()); }
	 ruleAcceptabilityTokenSet
{ after(grammarAccess.getAcceptabilityTokenSetRule()); } 
	 EOF 
;

// Rule AcceptabilityTokenSet
ruleAcceptabilityTokenSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getGroup()); }
		(rule__AcceptabilityTokenSet__Group__0)
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSnomedIdentifier
entryRuleSnomedIdentifier
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getSnomedIdentifierRule()); }
	 ruleSnomedIdentifier
{ after(grammarAccess.getSnomedIdentifierRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule SnomedIdentifier
ruleSnomedIdentifier 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
		(rule__SnomedIdentifier__Group__0)
		{ after(grammarAccess.getSnomedIdentifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeInteger
entryRuleNonNegativeInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeIntegerRule()); }
	 ruleNonNegativeInteger
{ after(grammarAccess.getNonNegativeIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeInteger
ruleNonNegativeInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
		(rule__NonNegativeInteger__Alternatives)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleMaxValue
entryRuleMaxValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getMaxValueRule()); }
	 ruleMaxValue
{ after(grammarAccess.getMaxValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule MaxValue
ruleMaxValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMaxValueAccess().getAlternatives()); }
		(rule__MaxValue__Alternatives)
		{ after(grammarAccess.getMaxValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleInteger
entryRuleInteger
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getIntegerRule()); }
	 ruleInteger
{ after(grammarAccess.getIntegerRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Integer
ruleInteger 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIntegerAccess().getGroup()); }
		(rule__Integer__Group__0)
		{ after(grammarAccess.getIntegerAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDecimal
entryRuleDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDecimalRule()); }
	 ruleDecimal
{ after(grammarAccess.getDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Decimal
ruleDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDecimalAccess().getGroup()); }
		(rule__Decimal__Group__0)
		{ after(grammarAccess.getDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleNonNegativeDecimal
entryRuleNonNegativeDecimal
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getNonNegativeDecimalRule()); }
	 ruleNonNegativeDecimal
{ after(grammarAccess.getNonNegativeDecimalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule NonNegativeDecimal
ruleNonNegativeDecimal 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
		(rule__NonNegativeDecimal__Group__0)
		{ after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleBoolean
entryRuleBoolean
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Boolean
ruleBoolean 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBooleanAccess().getAlternatives()); }
		(rule__Boolean__Alternatives)
		{ after(grammarAccess.getBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleDialectAliasValue
entryRuleDialectAliasValue
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getDialectAliasValueRule()); }
	 ruleDialectAliasValue
{ after(grammarAccess.getDialectAliasValueRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule DialectAliasValue
ruleDialectAliasValue 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getGroup()); }
		(rule__DialectAliasValue__Group__0)
		{ after(grammarAccess.getDialectAliasValueAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleAlphabetical
entryRuleAlphabetical
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getAlphabeticalRule()); }
	 ruleAlphabetical
{ after(grammarAccess.getAlphabeticalRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Alphabetical
ruleAlphabetical 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall()); }
			(RULE_ALPHA)
			{ after(grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall()); }
		)
		(
			{ before(grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall()); }
			(RULE_ALPHA)*
			{ after(grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Rule LexicalSearchType
ruleLexicalSearchType
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getAlternatives()); }
		(rule__LexicalSearchType__Alternatives)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubExpressionConstraint__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
		ruleChildOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
		ruleChildOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
		ruleDescendantOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
		ruleDescendantOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
		ruleParentOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
		ruleParentOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
		ruleAncestorOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
		ruleAncestorOrSelfOf
		{ after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getFilterConstraintParserRuleCall_9()); }
		ruleFilterConstraint
		{ after(grammarAccess.getSubExpressionConstraintAccess().getFilterConstraintParserRuleCall_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclFocusConcept__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
		ruleMemberOf
		{ after(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
		ruleAny
		{ after(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
		ruleNestedExpression
		{ after(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
		ruleAny
		{ after(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
		ruleNestedExpression
		{ after(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Alternatives_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubRefinement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
		ruleEclAttributeGroup
		{ after(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
		ruleNestedRefinement
		{ after(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SubAttributeSet__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
		ruleAttributeConstraint
		{ after(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
		ruleNestedAttributeSet
		{ after(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Comparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
		ruleAttributeComparison
		{ after(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
		ruleDataTypeComparison
		{ after(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getAttributeComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getAttributeComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DataTypeComparison__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0()); }
		ruleBooleanValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1()); }
		ruleStringValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2()); }
		ruleIntegerValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3()); }
		ruleDecimalValueComparison
		{ after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getBooleanValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getBooleanValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getStringValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getStringValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpGTTerminalRuleCall_0_0_2()); }
		RULE_GT
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpGTTerminalRuleCall_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpLTTerminalRuleCall_0_0_3()); }
		RULE_LT
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpLTTerminalRuleCall_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpGTETerminalRuleCall_0_0_4()); }
		RULE_GTE
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpGTETerminalRuleCall_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpLTETerminalRuleCall_0_0_5()); }
		RULE_LTE
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpLTETerminalRuleCall_0_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpGTTerminalRuleCall_0_0_2()); }
		RULE_GT
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpGTTerminalRuleCall_0_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpLTTerminalRuleCall_0_0_3()); }
		RULE_LT
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpLTTerminalRuleCall_0_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpGTETerminalRuleCall_0_0_4()); }
		RULE_GTE
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpGTETerminalRuleCall_0_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpLTETerminalRuleCall_0_0_5()); }
		RULE_LTE
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpLTETerminalRuleCall_0_0_5()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION
		{ after(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
		RULE_COMMA
		{ after(grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PropertyFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0()); }
		ruleTermFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_1()); }
		ruleLanguageCodeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2()); }
		ruleTypeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3()); }
		ruleDialectFilter
		{ after(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_4()); }
		ruleNestedFilter
		{ after(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0()); }
		ruleTypedTermFilter
		{ after(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1()); }
		ruleTypedTermFilterSet
		{ after(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getTypedTermFilterAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getTypedTermFilterAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__OpAlternatives_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getTypedTermFilterSetAccess().getOpEQUALTerminalRuleCall_0_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getTypedTermFilterSetAccess().getOpNOT_EQUALTerminalRuleCall_0_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__OpAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getLanguageCodeFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getLanguageCodeFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_0()); }
		(rule__LanguageCodeFilter__LanguageCodesAssignment_2_0)
		{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getGroup_2_1()); }
		(rule__LanguageCodeFilter__Group_2_1__0)
		{ after(grammarAccess.getLanguageCodeFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0()); }
		ruleTypeIdFilter
		{ after(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1()); }
		ruleTypeTokenFilter
		{ after(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__OpAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getTypeIdFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getTypeIdFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__TypeAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__OpAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getTypeTokenFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getTypeTokenFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_0()); }
		(rule__TypeTokenFilter__TokensAssignment_2_0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getGroup_2_1()); }
		(rule__TypeTokenFilter__Group_2_1__0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0()); }
		ruleDialectIdFilter
		{ after(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1()); }
		ruleDialectAliasFilter
		{ after(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__OpAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getDialectIdFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getDialectIdFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_0()); }
		(rule__DialectIdFilter__DialectsAssignment_2_0)
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getGroup_2_1()); }
		(rule__DialectIdFilter__Group_2_1__0)
		{ after(grammarAccess.getDialectIdFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__OpAlternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getDialectAliasFilterAccess().getOpEQUALTerminalRuleCall_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getDialectAliasFilterAccess().getOpNOT_EQUALTerminalRuleCall_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_0()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getGroup_2_1()); }
		(rule__DialectAliasFilter__Group_2_1__0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Acceptability__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0()); }
		ruleAcceptabilityIdSet
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1()); }
		ruleAcceptabilityTokenSet
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Alternatives_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); }
	)
	|
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
		RULE_ZERO
		{ after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
		(rule__NonNegativeInteger__Group_1__0)
		{ after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MaxValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
		RULE_WILDCARD
		{ after(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
		RULE_PLUS
		{ after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
		RULE_DASH
		{ after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
		RULE_ZERO
		{ after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
		True
		{ after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
		False
		{ after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_1_0()); }
		RULE_DASH
		{ after(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_1_1()); }
		RULE_ALPHA
		{ after(grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getZEROTerminalRuleCall_1_2()); }
		RULE_ZERO
		{ after(grammarAccess.getDialectAliasValueAccess().getZEROTerminalRuleCall_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_1_3()); }
		RULE_DIGIT_NONZERO
		{ after(grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_1_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LexicalSearchType__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0()); }
		(Match)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getMATCHEnumLiteralDeclaration_0()); }
	)
	|
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getWILDEnumLiteralDeclaration_1()); }
		(Wild)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getWILDEnumLiteralDeclaration_1()); }
	)
	|
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_2()); }
		(Regex)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getREGEXEnumLiteralDeclaration_2()); }
	)
	|
	(
		{ before(grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_3()); }
		(Exact)
		{ after(grammarAccess.getLexicalSearchTypeAccess().getEXACTEnumLiteralDeclaration_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__0__Impl
	rule__Script__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getScriptAction_0()); }
	()
	{ after(grammarAccess.getScriptAccess().getScriptAction_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Script__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Script__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getScriptAccess().getConstraintAssignment_1()); }
	(rule__Script__ConstraintAssignment_1)?
	{ after(grammarAccess.getScriptAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__0__Impl
	rule__OrExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
	ruleAndExpressionConstraint
	{ after(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
	(rule__OrExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__0__Impl
	rule__OrExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__1__Impl
	rule__OrExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__OrExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__0__Impl
	rule__AndExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
	ruleExclusionExpressionConstraint
	{ after(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
	(rule__AndExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__0__Impl
	rule__AndExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__1__Impl
	rule__AndExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
	(rule__AndExpressionConstraint__Alternatives_1_1)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__AndExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__0__Impl
	rule__ExclusionExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
	ruleRefinedExpressionConstraint
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
	(rule__ExclusionExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__0__Impl
	rule__ExclusionExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
	()
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__1__Impl
	rule__ExclusionExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
	(rule__ExclusionExpressionConstraint__RightAssignment_1_2)
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__0__Impl
	rule__RefinedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
	ruleDottedExpressionConstraint
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
	(rule__RefinedExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__RefinedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__0__Impl
	rule__RefinedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__1__Impl
	rule__RefinedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__RefinedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
	(rule__RefinedExpressionConstraint__RefinementAssignment_1_2)
	{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__0__Impl
	rule__DottedExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
	ruleSubExpressionConstraint
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
	(rule__DottedExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DottedExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__0__Impl
	rule__DottedExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__1__Impl
	rule__DottedExpressionConstraint__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
	RULE_DOT
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DottedExpressionConstraint__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
	(rule__DottedExpressionConstraint__AttributeAssignment_1_2)
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__0__Impl
	rule__ChildOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
	RULE_LT_EM
	{ after(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ChildOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__0__Impl
	rule__ChildOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
	RULE_DBL_LT_EM
	{ after(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ChildOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ChildOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__0__Impl
	rule__DescendantOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
	RULE_LT
	{ after(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DescendantOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__0__Impl
	rule__DescendantOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
	RULE_DBL_LT
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DescendantOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__DescendantOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__0__Impl
	rule__ParentOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
	RULE_GT_EM
	{ after(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ParentOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__0__Impl
	rule__ParentOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
	RULE_DBL_GT_EM
	{ after(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ParentOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__ParentOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__0__Impl
	rule__AncestorOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
	RULE_GT
	{ after(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AncestorOrSelfOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__0__Impl
	rule__AncestorOrSelfOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
	RULE_DBL_GT
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AncestorOrSelfOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
	(rule__AncestorOrSelfOf__ConstraintAssignment_1)
	{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__0__Impl
	rule__MemberOf__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
	RULE_CARET
	{ after(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
	(rule__MemberOf__ConstraintAssignment_1)
	{ after(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclConceptReference__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__0__Impl
	rule__EclConceptReference__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
	(rule__EclConceptReference__IdAssignment_0)
	{ after(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
	(rule__EclConceptReference__TermAssignment_1)?
	{ after(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclConceptReferenceSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__0__Impl
	rule__EclConceptReferenceSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__1__Impl
	rule__EclConceptReferenceSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
	(rule__EclConceptReferenceSet__ConceptsAssignment_1)
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__2__Impl
	rule__EclConceptReferenceSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_2()); }
	(rule__EclConceptReferenceSet__ConceptsAssignment_2)*
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReferenceSet__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Any__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__0__Impl
	rule__Any__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
	RULE_WILDCARD
	{ after(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Any__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Any__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAnyAccess().getAnyAction_1()); }
	()
	{ after(grammarAccess.getAnyAccess().getAnyAction_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__0__Impl
	rule__OrRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
	ruleAndRefinement
	{ after(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1()); }
	(rule__OrRefinement__Group_1__0)*
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
	(rule__OrRefinement__Group_1_0__0)
	{ after(grammarAccess.getOrRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__0__Impl
	rule__OrRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__1__Impl
	rule__OrRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__OrRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__0__Impl
	rule__AndRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
	ruleSubRefinement
	{ after(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1()); }
	(rule__AndRefinement__Group_1__0)*
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1__0__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
	(rule__AndRefinement__Group_1_0__0)
	{ after(grammarAccess.getAndRefinementAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndRefinement__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__0__Impl
	rule__AndRefinement__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__1__Impl
	rule__AndRefinement__Group_1_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
	(rule__AndRefinement__Alternatives_1_0_1)
	{ after(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndRefinement__Group_1_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__Group_1_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
	(rule__AndRefinement__RightAssignment_1_0_2)
	{ after(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedRefinement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__0__Impl
	rule__NestedRefinement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__1__Impl
	rule__NestedRefinement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
	(rule__NestedRefinement__NestedAssignment_1)
	{ after(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedRefinement__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EclAttributeGroup__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__0__Impl
	rule__EclAttributeGroup__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
	(rule__EclAttributeGroup__CardinalityAssignment_0)?
	{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__1__Impl
	rule__EclAttributeGroup__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
	RULE_CURLY_OPEN
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__2__Impl
	rule__EclAttributeGroup__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
	(rule__EclAttributeGroup__RefinementAssignment_2)
	{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclAttributeGroup__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
	RULE_CURLY_CLOSE
	{ after(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__0__Impl
	rule__OrAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
	ruleAndAttributeSet
	{ after(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
	(rule__OrAttributeSet__Group_1__0)*
	{ after(grammarAccess.getOrAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__OrAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__0__Impl
	rule__OrAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__1__Impl
	rule__OrAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__OrAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__OrAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__0__Impl
	rule__AndAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
	ruleSubAttributeSet
	{ after(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
	(rule__AndAttributeSet__Group_1__0)*
	{ after(grammarAccess.getAndAttributeSetAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AndAttributeSet__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__0__Impl
	rule__AndAttributeSet__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
	()
	{ after(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__1__Impl
	rule__AndAttributeSet__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
	(rule__AndAttributeSet__Alternatives_1_1)
	{ after(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AndAttributeSet__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
	(rule__AndAttributeSet__RightAssignment_1_2)
	{ after(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedAttributeSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__0__Impl
	rule__NestedAttributeSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__1__Impl
	rule__NestedAttributeSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
	(rule__NestedAttributeSet__NestedAssignment_1)
	{ after(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedAttributeSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__0__Impl
	rule__AttributeConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
	(rule__AttributeConstraint__CardinalityAssignment_0)?
	{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__1__Impl
	rule__AttributeConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
	(rule__AttributeConstraint__ReversedAssignment_1)?
	{ after(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__2__Impl
	rule__AttributeConstraint__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
	(rule__AttributeConstraint__AttributeAssignment_2)
	{ after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeConstraint__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
	(rule__AttributeConstraint__ComparisonAssignment_3)
	{ after(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Cardinality__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__0__Impl
	rule__Cardinality__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
	RULE_SQUARE_OPEN
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__1__Impl
	rule__Cardinality__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
	(rule__Cardinality__MinAssignment_1)
	{ after(grammarAccess.getCardinalityAccess().getMinAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__2__Impl
	rule__Cardinality__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
	RULE_TO
	{ after(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__3__Impl
	rule__Cardinality__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
	(rule__Cardinality__MaxAssignment_3)
	{ after(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Cardinality__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
	RULE_SQUARE_CLOSE
	{ after(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AttributeComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeComparison__Group__0__Impl
	rule__AttributeComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeComparisonAccess().getOpAssignment_0()); }
	(rule__AttributeComparison__OpAssignment_0)
	{ after(grammarAccess.getAttributeComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AttributeComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributeComparisonAccess().getValueAssignment_1()); }
	(rule__AttributeComparison__ValueAssignment_1)
	{ after(grammarAccess.getAttributeComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__BooleanValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueComparison__Group__0__Impl
	rule__BooleanValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueComparisonAccess().getOpAssignment_0()); }
	(rule__BooleanValueComparison__OpAssignment_0)
	{ after(grammarAccess.getBooleanValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__BooleanValueComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBooleanValueComparisonAccess().getValueAssignment_1()); }
	(rule__BooleanValueComparison__ValueAssignment_1)
	{ after(grammarAccess.getBooleanValueComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__StringValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueComparison__Group__0__Impl
	rule__StringValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueComparisonAccess().getOpAssignment_0()); }
	(rule__StringValueComparison__OpAssignment_0)
	{ after(grammarAccess.getStringValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__StringValueComparison__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getStringValueComparisonAccess().getValueAssignment_1()); }
	(rule__StringValueComparison__ValueAssignment_1)
	{ after(grammarAccess.getStringValueComparisonAccess().getValueAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IntegerValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__0__Impl
	rule__IntegerValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getOpAssignment_0()); }
	(rule__IntegerValueComparison__OpAssignment_0)
	{ after(grammarAccess.getIntegerValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__1__Impl
	rule__IntegerValueComparison__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IntegerValueComparison__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerValueComparisonAccess().getValueAssignment_2()); }
	(rule__IntegerValueComparison__ValueAssignment_2)
	{ after(grammarAccess.getIntegerValueComparisonAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DecimalValueComparison__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__0__Impl
	rule__DecimalValueComparison__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getOpAssignment_0()); }
	(rule__DecimalValueComparison__OpAssignment_0)
	{ after(grammarAccess.getDecimalValueComparisonAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__1__Impl
	rule__DecimalValueComparison__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DecimalValueComparison__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalValueComparisonAccess().getValueAssignment_2()); }
	(rule__DecimalValueComparison__ValueAssignment_2)
	{ after(grammarAccess.getDecimalValueComparisonAccess().getValueAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__0__Impl
	rule__NestedExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__1__Impl
	rule__NestedExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
	(rule__NestedExpression__NestedAssignment_1)
	{ after(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedExpression__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FilterConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__0__Impl
	rule__FilterConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
	RULE_DOUBLE_CURLY_OPEN
	{ after(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__1__Impl
	rule__FilterConstraint__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1()); }
	ruleFilter
	{ after(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2()); }
	RULE_DOUBLE_CURLY_CLOSE
	{ after(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__0__Impl
	rule__DisjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
	ruleConjunctionFilter
	{ after(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
	(rule__DisjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getDisjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DisjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__0__Impl
	rule__DisjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__1__Impl
	rule__DisjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION
	{ after(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DisjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__DisjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getDisjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__0__Impl
	rule__ConjunctionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0()); }
	ruleExclusionFilter
	{ after(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
	(rule__ConjunctionFilter__Group_1__0)*
	{ after(grammarAccess.getConjunctionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ConjunctionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__0__Impl
	rule__ConjunctionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__1__Impl
	rule__ConjunctionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
	(rule__ConjunctionFilter__Alternatives_1_1)
	{ after(grammarAccess.getConjunctionFilterAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ConjunctionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
	(rule__ConjunctionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getConjunctionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group__0__Impl
	rule__ExclusionFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0()); }
	rulePropertyFilter
	{ after(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getGroup_1()); }
	(rule__ExclusionFilter__Group_1__0)?
	{ after(grammarAccess.getExclusionFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ExclusionFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__0__Impl
	rule__ExclusionFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0()); }
	()
	{ after(grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__1__Impl
	rule__ExclusionFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
	RULE_EXCLUSION
	{ after(grammarAccess.getExclusionFilterAccess().getEXCLUSIONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ExclusionFilter__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2()); }
	(rule__ExclusionFilter__RightAssignment_1_2)
	{ after(grammarAccess.getExclusionFilterAccess().getRightAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NestedFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__0__Impl
	rule__NestedFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__1__Impl
	rule__NestedFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
	(rule__NestedFilter__NestedAssignment_1)
	{ after(grammarAccess.getNestedFilterAccess().getNestedAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NestedFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__0__Impl
	rule__TermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0()); }
	RULE_TERM_KEYWORD
	{ after(grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getAlternatives_1()); }
	(rule__TermFilter__Alternatives_1)
	{ after(grammarAccess.getTermFilterAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__0__Impl
	rule__TypedTermFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getOpAssignment_0()); }
	(rule__TypedTermFilter__OpAssignment_0)
	{ after(grammarAccess.getTypedTermFilterAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__1__Impl
	rule__TypedTermFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getGroup_1()); }
	(rule__TypedTermFilter__Group_1__0)?
	{ after(grammarAccess.getTypedTermFilterAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getTermAssignment_2()); }
	(rule__TypedTermFilter__TermAssignment_2)
	{ after(grammarAccess.getTypedTermFilterAccess().getTermAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group_1__0__Impl
	rule__TypedTermFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeAssignment_1_0()); }
	(rule__TypedTermFilter__LexicalSearchTypeAssignment_1_0)
	{ after(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilter__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedTermFilterSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__0__Impl
	rule__TypedTermFilterSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getOpAssignment_0()); }
	(rule__TypedTermFilterSet__OpAssignment_0)
	{ after(grammarAccess.getTypedTermFilterSetAccess().getOpAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__1__Impl
	rule__TypedTermFilterSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__2__Impl
	rule__TypedTermFilterSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
	(rule__TypedTermFilterSet__TermsAssignment_2)
	{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__3__Impl
	rule__TypedTermFilterSet__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_3()); }
	(rule__TypedTermFilterSet__TermsAssignment_3)*
	{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedTermFilterSet__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_4()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageCodeFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__0__Impl
	rule__LanguageCodeFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
	RULE_LANGUAGE_KEYWORD
	{ after(grammarAccess.getLanguageCodeFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__1__Impl
	rule__LanguageCodeFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getOpAssignment_1()); }
	(rule__LanguageCodeFilter__OpAssignment_1)
	{ after(grammarAccess.getLanguageCodeFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getAlternatives_2()); }
	(rule__LanguageCodeFilter__Alternatives_2)
	{ after(grammarAccess.getLanguageCodeFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageCodeFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group_2_1__0__Impl
	rule__LanguageCodeFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getLanguageCodeFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group_2_1__1__Impl
	rule__LanguageCodeFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_1()); }
	(rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_1)
	{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group_2_1__2__Impl
	rule__LanguageCodeFilter__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_2()); }
	(rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_2)*
	{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageCodeFilter__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageCodeFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getLanguageCodeFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeIdFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__0__Impl
	rule__TypeIdFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0()); }
	RULE_TYPEID_KEYWORD
	{ after(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__1__Impl
	rule__TypeIdFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getOpAssignment_1()); }
	(rule__TypeIdFilter__OpAssignment_1)
	{ after(grammarAccess.getTypeIdFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeIdFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeIdFilterAccess().getTypeAssignment_2()); }
	(rule__TypeIdFilter__TypeAssignment_2)
	{ after(grammarAccess.getTypeIdFilterAccess().getTypeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeTokenFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__0__Impl
	rule__TypeTokenFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0()); }
	RULE_TYPE_KEYWORD
	{ after(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__1__Impl
	rule__TypeTokenFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getOpAssignment_1()); }
	(rule__TypeTokenFilter__OpAssignment_1)
	{ after(grammarAccess.getTypeTokenFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getAlternatives_2()); }
	(rule__TypeTokenFilter__Alternatives_2)
	{ after(grammarAccess.getTypeTokenFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypeTokenFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__0__Impl
	rule__TypeTokenFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__1__Impl
	rule__TypeTokenFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
	(rule__TypeTokenFilter__TokensAssignment_2_1_1)
	{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__2__Impl
	rule__TypeTokenFilter__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_2()); }
	(rule__TypeTokenFilter__TokensAssignment_2_1_2)*
	{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypeTokenFilter__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectIdFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__0__Impl
	rule__DialectIdFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0()); }
	RULE_DIALECTID_KEYWORD
	{ after(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__1__Impl
	rule__DialectIdFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getOpAssignment_1()); }
	(rule__DialectIdFilter__OpAssignment_1)
	{ after(grammarAccess.getDialectIdFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getAlternatives_2()); }
	(rule__DialectIdFilter__Alternatives_2)
	{ after(grammarAccess.getDialectIdFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectIdFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__0__Impl
	rule__DialectIdFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__1__Impl
	rule__DialectIdFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
	(rule__DialectIdFilter__DialectsAssignment_2_1_1)
	{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__2__Impl
	rule__DialectIdFilter__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_2()); }
	(rule__DialectIdFilter__DialectsAssignment_2_1_2)*
	{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectIdFilter__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAliasFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__0__Impl
	rule__DialectAliasFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0()); }
	RULE_DIALECT_KEYWORD
	{ after(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__1__Impl
	rule__DialectAliasFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getOpAssignment_1()); }
	(rule__DialectAliasFilter__OpAssignment_1)
	{ after(grammarAccess.getDialectAliasFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getAlternatives_2()); }
	(rule__DialectAliasFilter__Alternatives_2)
	{ after(grammarAccess.getDialectAliasFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAliasFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__0__Impl
	rule__DialectAliasFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__1__Impl
	rule__DialectAliasFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
	(rule__DialectAliasFilter__DialectsAssignment_2_1_1)
	{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__2__Impl
	rule__DialectAliasFilter__Group_2_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_2()); }
	(rule__DialectAliasFilter__DialectsAssignment_2_1_2)*
	{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasFilter__Group_2_1__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__Group_2_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Dialect__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dialect__Group__0__Impl
	rule__Dialect__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAccess().getLanguageRefSetIdAssignment_0()); }
	(rule__Dialect__LanguageRefSetIdAssignment_0)
	{ after(grammarAccess.getDialectAccess().getLanguageRefSetIdAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Dialect__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAccess().getAcceptabilityAssignment_1()); }
	(rule__Dialect__AcceptabilityAssignment_1)?
	{ after(grammarAccess.getDialectAccess().getAcceptabilityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAlias__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAlias__Group__0__Impl
	rule__DialectAlias__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasAccess().getAliasAssignment_0()); }
	(rule__DialectAlias__AliasAssignment_0)
	{ after(grammarAccess.getDialectAliasAccess().getAliasAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAlias__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasAccess().getAcceptabilityAssignment_1()); }
	(rule__DialectAlias__AcceptabilityAssignment_1)?
	{ after(grammarAccess.getDialectAliasAccess().getAcceptabilityAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AcceptabilityTokenSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__0__Impl
	rule__AcceptabilityTokenSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__1__Impl
	rule__AcceptabilityTokenSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
	(rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1)
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__2__Impl
	rule__AcceptabilityTokenSet__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_2()); }
	(rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_2)*
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptabilityTokenSet__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SnomedIdentifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__0__Impl
	rule__SnomedIdentifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__1__Impl
	rule__SnomedIdentifier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
	(rule__SnomedIdentifier__Alternatives_1)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__2__Impl
	rule__SnomedIdentifier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
	(rule__SnomedIdentifier__Alternatives_2)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__3__Impl
	rule__SnomedIdentifier__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
	(rule__SnomedIdentifier__Alternatives_3)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__4__Impl
	rule__SnomedIdentifier__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
	(rule__SnomedIdentifier__Alternatives_4)
	{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SnomedIdentifier__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SnomedIdentifier__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
	(
		{ before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
		(rule__SnomedIdentifier__Alternatives_5)*
		{ after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeInteger__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__0__Impl
	rule__NonNegativeInteger__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
	RULE_DIGIT_NONZERO
	{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeInteger__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeInteger__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
	(rule__NonNegativeInteger__Alternatives_1_1)*
	{ after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Integer__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__0__Impl
	rule__Integer__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getAlternatives_0()); }
	(rule__Integer__Alternatives_0)?
	{ after(grammarAccess.getIntegerAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Integer__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Integer__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Decimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__0__Impl
	rule__Decimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getAlternatives_0()); }
	(rule__Decimal__Alternatives_0)?
	{ after(grammarAccess.getDecimalAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Decimal__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Decimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
	ruleNonNegativeDecimal
	{ after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__NonNegativeDecimal__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__0__Impl
	rule__NonNegativeDecimal__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
	ruleNonNegativeInteger
	{ after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__1__Impl
	rule__NonNegativeDecimal__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
	RULE_DOT
	{ after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__NonNegativeDecimal__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__NonNegativeDecimal__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
	(rule__NonNegativeDecimal__Alternatives_2)*
	{ after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DialectAliasValue__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasValue__Group__0__Impl
	rule__DialectAliasValue__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_0()); }
	RULE_ALPHA
	{ after(grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DialectAliasValue__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDialectAliasValueAccess().getAlternatives_1()); }
	(rule__DialectAliasValue__Alternatives_1)*
	{ after(grammarAccess.getDialectAliasValueAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Script__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
		ruleAndExpressionConstraint
		{ after(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
		ruleExclusionExpressionConstraint
		{ after(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionExpressionConstraint__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
		ruleRefinedExpressionConstraint
		{ after(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__RefinedExpressionConstraint__RefinementAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DottedExpressionConstraint__AttributeAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ChildOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DescendantOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ParentOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AncestorOrSelfOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
		(rule__MemberOf__ConstraintAlternatives_1_0)
		{ after(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__IdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
		ruleSnomedIdentifier
		{ after(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__TermAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
		RULE_TERM_STRING
		{ after(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__ConceptsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReferenceSet__ConceptsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_2_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
		ruleAndRefinement
		{ after(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndRefinement__RightAssignment_1_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
		ruleSubRefinement
		{ after(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedRefinement__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
		ruleEclRefinement
		{ after(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclAttributeGroup__RefinementAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__OrAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
		ruleAndAttributeSet
		{ after(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AndAttributeSet__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
		ruleSubAttributeSet
		{ after(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedAttributeSet__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
		ruleEclAttributeSet
		{ after(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__CardinalityAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
		ruleCardinality
		{ after(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ReversedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
		RULE_REVERSED
		{ after(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__AttributeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeConstraint__ComparisonAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
		ruleComparison
		{ after(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MinAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Cardinality__MaxAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
		ruleMaxValue
		{ after(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getOpAlternatives_0_0()); }
		(rule__AttributeComparison__OpAlternatives_0_0)
		{ after(grammarAccess.getAttributeComparisonAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AttributeComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAttributeComparisonAccess().getValueSubExpressionConstraintParserRuleCall_1_0()); }
		ruleSubExpressionConstraint
		{ after(grammarAccess.getAttributeComparisonAccess().getValueSubExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getOpAlternatives_0_0()); }
		(rule__BooleanValueComparison__OpAlternatives_0_0)
		{ after(grammarAccess.getBooleanValueComparisonAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__BooleanValueComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0()); }
		ruleBoolean
		{ after(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getOpAlternatives_0_0()); }
		(rule__StringValueComparison__OpAlternatives_0_0)
		{ after(grammarAccess.getStringValueComparisonAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__StringValueComparison__ValueAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpAlternatives_0_0()); }
		(rule__IntegerValueComparison__OpAlternatives_0_0)
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IntegerValueComparison__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0()); }
		ruleInteger
		{ after(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpAlternatives_0_0()); }
		(rule__DecimalValueComparison__OpAlternatives_0_0)
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DecimalValueComparison__ValueAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0()); }
		ruleDecimal
		{ after(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedExpression__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
		ruleExpressionConstraint
		{ after(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DisjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
		ruleConjunctionFilter
		{ after(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ConjunctionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0()); }
		ruleExclusionFilter
		{ after(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ExclusionFilter__RightAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
		rulePropertyFilter
		{ after(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NestedFilter__NestedAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
		ruleFilter
		{ after(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getOpAlternatives_0_0()); }
		(rule__TypedTermFilter__OpAlternatives_0_0)
		{ after(grammarAccess.getTypedTermFilterAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__LexicalSearchTypeAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_1_0_0()); }
		ruleLexicalSearchType
		{ after(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLexicalSearchTypeEnumRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilter__TermAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__OpAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getOpAlternatives_0_0()); }
		(rule__TypedTermFilterSet__OpAlternatives_0_0)
		{ after(grammarAccess.getTypedTermFilterSetAccess().getOpAlternatives_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__TermsAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0()); }
		ruleTypedTermFilter
		{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedTermFilterSet__TermsAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_3_0()); }
		ruleTypedTermFilter
		{ after(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getOpAlternatives_1_0()); }
		(rule__LanguageCodeFilter__OpAlternatives_1_0)
		{ after(grammarAccess.getLanguageCodeFilterAccess().getOpAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__LanguageCodesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_0_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_1_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageCodeFilter__LanguageCodesAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_2_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getOpAlternatives_1_0()); }
		(rule__TypeIdFilter__OpAlternatives_1_0)
		{ after(grammarAccess.getTypeIdFilterAccess().getOpAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeIdFilter__TypeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeAlternatives_2_0()); }
		(rule__TypeIdFilter__TypeAlternatives_2_0)
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getOpAlternatives_1_0()); }
		(rule__TypeTokenFilter__OpAlternatives_1_0)
		{ after(grammarAccess.getTypeTokenFilterAccess().getOpAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__TokensAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_0_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__TokensAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_1_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypeTokenFilter__TokensAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_2_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getOpAlternatives_1_0()); }
		(rule__DialectIdFilter__OpAlternatives_1_0)
		{ after(grammarAccess.getDialectIdFilterAccess().getOpAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__DialectsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0()); }
		ruleDialect
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__DialectsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0()); }
		ruleDialect
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectIdFilter__DialectsAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_2_0()); }
		ruleDialect
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getOpAlternatives_1_0()); }
		(rule__DialectAliasFilter__OpAlternatives_1_0)
		{ after(grammarAccess.getDialectAliasFilterAccess().getOpAlternatives_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__DialectsAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0()); }
		ruleDialectAlias
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__DialectsAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0()); }
		ruleDialectAlias
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasFilter__DialectsAssignment_2_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_2_0()); }
		ruleDialectAlias
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__LanguageRefSetIdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Dialect__AcceptabilityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
		ruleAcceptability
		{ after(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__AliasAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0()); }
		ruleDialectAliasValue
		{ after(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAlias__AcceptabilityAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
		ruleAcceptability
		{ after(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityIdSet__AcceptabilitiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_1_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptabilityTokenSet__AcceptabilitiesAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_2_0()); }
		ruleAlphabetical
		{ after(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}
