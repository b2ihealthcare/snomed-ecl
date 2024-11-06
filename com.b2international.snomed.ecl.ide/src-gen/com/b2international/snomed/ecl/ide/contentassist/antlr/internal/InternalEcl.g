/*
 * Copyright 2021 B2i Healthcare, https://b2ihealthcare.com
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
	superClass=AbstractInternalContentAssistParser;
	backtrack=true;
}

@lexer::header {
package com.b2international.snomed.ecl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package com.b2international.snomed.ecl.ide.contentassist.antlr.internal;

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
@parser::members {
	private EclGrammarAccess grammarAccess;

	public void setGrammarAccess(EclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
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

// Entry rule entryRuleSupplementExpressionConstraint
entryRuleSupplementExpressionConstraint
:
{ before(grammarAccess.getSupplementExpressionConstraintRule()); }
	 ruleSupplementExpressionConstraint
{ after(grammarAccess.getSupplementExpressionConstraintRule()); } 
	 EOF 
;

// Rule SupplementExpressionConstraint
ruleSupplementExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSupplementExpressionConstraintAccess().getGroup()); }
		(rule__SupplementExpressionConstraint__Group__0)
		{ after(grammarAccess.getSupplementExpressionConstraintAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilteredExpressionConstraint
entryRuleFilteredExpressionConstraint
:
{ before(grammarAccess.getFilteredExpressionConstraintRule()); }
	 ruleFilteredExpressionConstraint
{ after(grammarAccess.getFilteredExpressionConstraintRule()); } 
	 EOF 
;

// Rule FilteredExpressionConstraint
ruleFilteredExpressionConstraint 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilteredExpressionConstraintAccess().getGroup()); }
		(rule__FilteredExpressionConstraint__Group__0)
		{ after(grammarAccess.getFilteredExpressionConstraintAccess().getGroup()); }
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

// Entry rule entryRuleTop
entryRuleTop
:
{ before(grammarAccess.getTopRule()); }
	 ruleTop
{ after(grammarAccess.getTopRule()); } 
	 EOF 
;

// Rule Top
ruleTop 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTopAccess().getGroup()); }
		(rule__Top__Group__0)
		{ after(grammarAccess.getTopAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleBottom
entryRuleBottom
:
{ before(grammarAccess.getBottomRule()); }
	 ruleBottom
{ after(grammarAccess.getBottomRule()); } 
	 EOF 
;

// Rule Bottom
ruleBottom 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getBottomAccess().getGroup()); }
		(rule__Bottom__Group__0)
		{ after(grammarAccess.getBottomAccess().getGroup()); }
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

// Entry rule entryRuleAlternateIdentifier
entryRuleAlternateIdentifier
:
{ before(grammarAccess.getAlternateIdentifierRule()); }
	 ruleAlternateIdentifier
{ after(grammarAccess.getAlternateIdentifierRule()); } 
	 EOF 
;

// Rule AlternateIdentifier
ruleAlternateIdentifier 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getGroup()); }
		(rule__AlternateIdentifier__Group__0)
		{ after(grammarAccess.getAlternateIdentifierAccess().getGroup()); }
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

// Entry rule entryRuleMemberFieldFilter
entryRuleMemberFieldFilter
:
{ before(grammarAccess.getMemberFieldFilterRule()); }
	 ruleMemberFieldFilter
{ after(grammarAccess.getMemberFieldFilterRule()); } 
	 EOF 
;

// Rule MemberFieldFilter
ruleMemberFieldFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMemberFieldFilterAccess().getGroup()); }
		(rule__MemberFieldFilter__Group__0)
		{ after(grammarAccess.getMemberFieldFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIdFilter
entryRuleIdFilter
:
{ before(grammarAccess.getIdFilterRule()); }
	 ruleIdFilter
{ after(grammarAccess.getIdFilterRule()); } 
	 EOF 
;

// Rule IdFilter
ruleIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIdFilterAccess().getAlternatives()); }
		(rule__IdFilter__Alternatives)
		{ after(grammarAccess.getIdFilterAccess().getAlternatives()); }
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

// Entry rule entryRuleSearchTerm
entryRuleSearchTerm
:
{ before(grammarAccess.getSearchTermRule()); }
	 ruleSearchTerm
{ after(grammarAccess.getSearchTermRule()); } 
	 EOF 
;

// Rule SearchTerm
ruleSearchTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSearchTermAccess().getAlternatives()); }
		(rule__SearchTerm__Alternatives)
		{ after(grammarAccess.getSearchTermAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedSearchTerm
entryRuleTypedSearchTerm
:
{ before(grammarAccess.getTypedSearchTermRule()); }
	 ruleTypedSearchTerm
{ after(grammarAccess.getTypedSearchTermRule()); } 
	 EOF 
;

// Rule TypedSearchTerm
ruleTypedSearchTerm 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedSearchTermAccess().getClauseAssignment()); }
		(rule__TypedSearchTerm__ClauseAssignment)
		{ after(grammarAccess.getTypedSearchTermAccess().getClauseAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedSearchTermSet
entryRuleTypedSearchTermSet
:
{ before(grammarAccess.getTypedSearchTermSetRule()); }
	 ruleTypedSearchTermSet
{ after(grammarAccess.getTypedSearchTermSetRule()); } 
	 EOF 
;

// Rule TypedSearchTermSet
ruleTypedSearchTermSet 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedSearchTermSetAccess().getGroup()); }
		(rule__TypedSearchTermSet__Group__0)
		{ after(grammarAccess.getTypedSearchTermSetAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleTypedSearchTermClause
entryRuleTypedSearchTermClause
:
{ before(grammarAccess.getTypedSearchTermClauseRule()); }
	 ruleTypedSearchTermClause
{ after(grammarAccess.getTypedSearchTermClauseRule()); } 
	 EOF 
;

// Rule TypedSearchTermClause
ruleTypedSearchTermClause 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getAlternatives()); }
		(rule__TypedSearchTermClause__Alternatives)
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleRegularExpression
entryRuleRegularExpression
:
{ before(grammarAccess.getRegularExpressionRule()); }
	 ruleRegularExpression
{ after(grammarAccess.getRegularExpressionRule()); } 
	 EOF 
;

// Rule RegularExpression
ruleRegularExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getRegularExpressionAccess().getSTRINGTerminalRuleCall()); }
		RULE_STRING
		{ after(grammarAccess.getRegularExpressionAccess().getSTRINGTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageFilter
entryRuleLanguageFilter
:
{ before(grammarAccess.getLanguageFilterRule()); }
	 ruleLanguageFilter
{ after(grammarAccess.getLanguageFilterRule()); } 
	 EOF 
;

// Rule LanguageFilter
ruleLanguageFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getGroup()); }
		(rule__LanguageFilter__Group__0)
		{ after(grammarAccess.getLanguageFilterAccess().getGroup()); }
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
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesAssignment()); }
		(rule__Acceptability__AcceptabilitiesAssignment)
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinitionStatusFilter
entryRuleDefinitionStatusFilter
:
{ before(grammarAccess.getDefinitionStatusFilterRule()); }
	 ruleDefinitionStatusFilter
{ after(grammarAccess.getDefinitionStatusFilterRule()); } 
	 EOF 
;

// Rule DefinitionStatusFilter
ruleDefinitionStatusFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionStatusFilterAccess().getAlternatives()); }
		(rule__DefinitionStatusFilter__Alternatives)
		{ after(grammarAccess.getDefinitionStatusFilterAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinitionStatusIdFilter
entryRuleDefinitionStatusIdFilter
:
{ before(grammarAccess.getDefinitionStatusIdFilterRule()); }
	 ruleDefinitionStatusIdFilter
{ after(grammarAccess.getDefinitionStatusIdFilterRule()); } 
	 EOF 
;

// Rule DefinitionStatusIdFilter
ruleDefinitionStatusIdFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getGroup()); }
		(rule__DefinitionStatusIdFilter__Group__0)
		{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDefinitionStatusTokenFilter
entryRuleDefinitionStatusTokenFilter
:
{ before(grammarAccess.getDefinitionStatusTokenFilterRule()); }
	 ruleDefinitionStatusTokenFilter
{ after(grammarAccess.getDefinitionStatusTokenFilterRule()); } 
	 EOF 
;

// Rule DefinitionStatusTokenFilter
ruleDefinitionStatusTokenFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getGroup()); }
		(rule__DefinitionStatusTokenFilter__Group__0)
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleModuleFilter
entryRuleModuleFilter
:
{ before(grammarAccess.getModuleFilterRule()); }
	 ruleModuleFilter
{ after(grammarAccess.getModuleFilterRule()); } 
	 EOF 
;

// Rule ModuleFilter
ruleModuleFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModuleFilterAccess().getGroup()); }
		(rule__ModuleFilter__Group__0)
		{ after(grammarAccess.getModuleFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleEffectiveTimeFilter
entryRuleEffectiveTimeFilter
:
{ before(grammarAccess.getEffectiveTimeFilterRule()); }
	 ruleEffectiveTimeFilter
{ after(grammarAccess.getEffectiveTimeFilterRule()); } 
	 EOF 
;

// Rule EffectiveTimeFilter
ruleEffectiveTimeFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getGroup()); }
		(rule__EffectiveTimeFilter__Group__0)
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleActiveFilter
entryRuleActiveFilter
:
{ before(grammarAccess.getActiveFilterRule()); }
	 ruleActiveFilter
{ after(grammarAccess.getActiveFilterRule()); } 
	 EOF 
;

// Rule ActiveFilter
ruleActiveFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActiveFilterAccess().getGroup()); }
		(rule__ActiveFilter__Group__0)
		{ after(grammarAccess.getActiveFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSemanticTagFilter
entryRuleSemanticTagFilter
:
{ before(grammarAccess.getSemanticTagFilterRule()); }
	 ruleSemanticTagFilter
{ after(grammarAccess.getSemanticTagFilterRule()); } 
	 EOF 
;

// Rule SemanticTagFilter
ruleSemanticTagFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getGroup()); }
		(rule__SemanticTagFilter__Group__0)
		{ after(grammarAccess.getSemanticTagFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePreferredInFilter
entryRulePreferredInFilter
:
{ before(grammarAccess.getPreferredInFilterRule()); }
	 rulePreferredInFilter
{ after(grammarAccess.getPreferredInFilterRule()); } 
	 EOF 
;

// Rule PreferredInFilter
rulePreferredInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getGroup()); }
		(rule__PreferredInFilter__Group__0)
		{ after(grammarAccess.getPreferredInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAcceptableInFilter
entryRuleAcceptableInFilter
:
{ before(grammarAccess.getAcceptableInFilterRule()); }
	 ruleAcceptableInFilter
{ after(grammarAccess.getAcceptableInFilterRule()); } 
	 EOF 
;

// Rule AcceptableInFilter
ruleAcceptableInFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
		(rule__AcceptableInFilter__Group__0)
		{ after(grammarAccess.getAcceptableInFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLanguageRefSetFilter
entryRuleLanguageRefSetFilter
:
{ before(grammarAccess.getLanguageRefSetFilterRule()); }
	 ruleLanguageRefSetFilter
{ after(grammarAccess.getLanguageRefSetFilterRule()); } 
	 EOF 
;

// Rule LanguageRefSetFilter
ruleLanguageRefSetFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
		(rule__LanguageRefSetFilter__Group__0)
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleCaseSignificanceFilter
entryRuleCaseSignificanceFilter
:
{ before(grammarAccess.getCaseSignificanceFilterRule()); }
	 ruleCaseSignificanceFilter
{ after(grammarAccess.getCaseSignificanceFilterRule()); } 
	 EOF 
;

// Rule CaseSignificanceFilter
ruleCaseSignificanceFilter 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
		(rule__CaseSignificanceFilter__Group__0)
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleFilterValue
entryRuleFilterValue
:
{ before(grammarAccess.getFilterValueRule()); }
	 ruleFilterValue
{ after(grammarAccess.getFilterValueRule()); } 
	 EOF 
;

// Rule FilterValue
ruleFilterValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getFilterValueAccess().getAlternatives()); }
		(rule__FilterValue__Alternatives)
		{ after(grammarAccess.getFilterValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSupplement
entryRuleSupplement
:
{ before(grammarAccess.getSupplementRule()); }
	 ruleSupplement
{ after(grammarAccess.getSupplementRule()); } 
	 EOF 
;

// Rule Supplement
ruleSupplement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSupplementAccess().getHistorySupplementParserRuleCall()); }
		ruleHistorySupplement
		{ after(grammarAccess.getSupplementAccess().getHistorySupplementParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHistorySupplement
entryRuleHistorySupplement
:
{ before(grammarAccess.getHistorySupplementRule()); }
	 ruleHistorySupplement
{ after(grammarAccess.getHistorySupplementRule()); } 
	 EOF 
;

// Rule HistorySupplement
ruleHistorySupplement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHistorySupplementAccess().getGroup()); }
		(rule__HistorySupplement__Group__0)
		{ after(grammarAccess.getHistorySupplementAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHistoryProfile
entryRuleHistoryProfile
:
{ before(grammarAccess.getHistoryProfileRule()); }
	 ruleHistoryProfile
{ after(grammarAccess.getHistoryProfileRule()); } 
	 EOF 
;

// Rule HistoryProfile
ruleHistoryProfile 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHistoryProfileAccess().getGroup()); }
		(rule__HistoryProfile__Group__0)
		{ after(grammarAccess.getHistoryProfileAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleIdentifier
entryRuleIdentifier
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getIdentifierRule()); }
	 ruleIdentifier
{ after(grammarAccess.getIdentifierRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule Identifier
ruleIdentifier 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getIdentifierAccess().getGroup()); }
		(rule__Identifier__Group__0)
		{ after(grammarAccess.getIdentifierAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleAlternateScheme
entryRuleAlternateScheme
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getAlternateSchemeRule()); }
	 ruleAlternateScheme
{ after(grammarAccess.getAlternateSchemeRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule AlternateScheme
ruleAlternateScheme 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getGroup()); }
		(rule__AlternateScheme__Group__0)
		{ after(grammarAccess.getAlternateSchemeAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleAlternateCode
entryRuleAlternateCode
@init { 
	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
}
:
{ before(grammarAccess.getAlternateCodeRule()); }
	 ruleAlternateCode
{ after(grammarAccess.getAlternateCodeRule()); } 
	 EOF 
;
finally {
	myHiddenTokenState.restore();
}

// Rule AlternateCode
ruleAlternateCode 
	@init {
		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
		int stackSize = keepStackSize();
	}
	:
	(
		(
			{ before(grammarAccess.getAlternateCodeAccess().getAlternatives()); }
			(rule__AlternateCode__Alternatives)
			{ after(grammarAccess.getAlternateCodeAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getAlternateCodeAccess().getAlternatives()); }
			(rule__AlternateCode__Alternatives)*
			{ after(grammarAccess.getAlternateCodeAccess().getAlternatives()); }
		)
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
		(
			{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall()); }
			(RULE_DIGIT)
			{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall()); }
		)
		(
			{ before(grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall()); }
			(RULE_DIGIT)*
			{ after(grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall()); }
		)
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

// Entry rule entryRuleMaxValue
entryRuleMaxValue
:
{ before(grammarAccess.getMaxValueRule()); }
	 ruleMaxValue
{ after(grammarAccess.getMaxValueRule()); } 
	 EOF 
;

// Rule MaxValue
ruleMaxValue 
	@init {
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

// Entry rule entryRuleBoolean
entryRuleBoolean
:
{ before(grammarAccess.getBooleanRule()); }
	 ruleBoolean
{ after(grammarAccess.getBooleanRule()); } 
	 EOF 
;

// Rule Boolean
ruleBoolean 
	@init {
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
}

// Entry rule entryRuleActiveBoolean
entryRuleActiveBoolean
:
{ before(grammarAccess.getActiveBooleanRule()); }
	 ruleActiveBoolean
{ after(grammarAccess.getActiveBooleanRule()); } 
	 EOF 
;

// Rule ActiveBoolean
ruleActiveBoolean 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getActiveBooleanAccess().getAlternatives()); }
		(rule__ActiveBoolean__Alternatives)
		{ after(grammarAccess.getActiveBooleanAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleUnquotedString
entryRuleUnquotedString
:
{ before(grammarAccess.getUnquotedStringRule()); }
	 ruleUnquotedString
{ after(grammarAccess.getUnquotedStringRule()); } 
	 EOF 
;

// Rule UnquotedString
ruleUnquotedString 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getUnquotedStringAccess().getAlternatives()); }
		(rule__UnquotedString__Alternatives)
		{ after(grammarAccess.getUnquotedStringAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
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
		(
			{ before(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
			(rule__DialectAliasValue__Alternatives)
			{ after(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
		)
		(
			{ before(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
			(rule__DialectAliasValue__Alternatives)*
			{ after(grammarAccess.getDialectAliasValueAccess().getAlternatives()); }
		)
	)
;
finally {
	restoreStackSize(stackSize);
	myHiddenTokenState.restore();
}

// Entry rule entryRuleLEXICAL_SEARCH_TYPE
entryRuleLEXICAL_SEARCH_TYPE
:
{ before(grammarAccess.getLEXICAL_SEARCH_TYPERule()); }
	 ruleLEXICAL_SEARCH_TYPE
{ after(grammarAccess.getLEXICAL_SEARCH_TYPERule()); } 
	 EOF 
;

// Rule LEXICAL_SEARCH_TYPE
ruleLEXICAL_SEARCH_TYPE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getAlternatives()); }
		(rule__LEXICAL_SEARCH_TYPE__Alternatives)
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleHISTORY_PROFILE_TYPE
entryRuleHISTORY_PROFILE_TYPE
:
{ before(grammarAccess.getHISTORY_PROFILE_TYPERule()); }
	 ruleHISTORY_PROFILE_TYPE
{ after(grammarAccess.getHISTORY_PROFILE_TYPERule()); } 
	 EOF 
;

// Rule HISTORY_PROFILE_TYPE
ruleHISTORY_PROFILE_TYPE 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getAlternatives()); }
		(rule__HISTORY_PROFILE_TYPE__Alternatives)
		{ after(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleSHORT_DOMAIN
entryRuleSHORT_DOMAIN
:
{ before(grammarAccess.getSHORT_DOMAINRule()); }
	 ruleSHORT_DOMAIN
{ after(grammarAccess.getSHORT_DOMAINRule()); } 
	 EOF 
;

// Rule SHORT_DOMAIN
ruleSHORT_DOMAIN 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getSHORT_DOMAINAccess().getAlternatives()); }
		(rule__SHORT_DOMAIN__Alternatives)
		{ after(grammarAccess.getSHORT_DOMAINAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNON_NUMERIC_OPERATOR
entryRuleNON_NUMERIC_OPERATOR
:
{ before(grammarAccess.getNON_NUMERIC_OPERATORRule()); }
	 ruleNON_NUMERIC_OPERATOR
{ after(grammarAccess.getNON_NUMERIC_OPERATORRule()); } 
	 EOF 
;

// Rule NON_NUMERIC_OPERATOR
ruleNON_NUMERIC_OPERATOR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getAlternatives()); }
		(rule__NON_NUMERIC_OPERATOR__Alternatives)
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleNUMERIC_OPERATOR
entryRuleNUMERIC_OPERATOR
:
{ before(grammarAccess.getNUMERIC_OPERATORRule()); }
	 ruleNUMERIC_OPERATOR
{ after(grammarAccess.getNUMERIC_OPERATORRule()); } 
	 EOF 
;

// Rule NUMERIC_OPERATOR
ruleNUMERIC_OPERATOR 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getAlternatives()); }
		(rule__NUMERIC_OPERATOR__Alternatives)
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getAlternatives()); }
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
		{ before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getSubExpressionConstraintAccess().getTopParserRuleCall_8()); }
		ruleTop
		{ after(grammarAccess.getSubExpressionConstraintAccess().getTopParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getBottomParserRuleCall_9()); }
		ruleBottom
		{ after(grammarAccess.getSubExpressionConstraintAccess().getBottomParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_10()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_10()); }
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
		{ before(grammarAccess.getEclFocusConceptAccess().getAlternateIdentifierParserRuleCall_3()); }
		ruleAlternateIdentifier
		{ after(grammarAccess.getEclFocusConceptAccess().getAlternateIdentifierParserRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_4()); }
		ruleNestedExpression
		{ after(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_4()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_2_0_0()); }
		ruleEclConceptReference
		{ after(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_2_0_1()); }
		ruleAny
		{ after(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_2_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_2_0_2()); }
		ruleNestedExpression
		{ after(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_2_0_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__CodeAlternatives_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getCodeAlternateCodeParserRuleCall_2_0_0()); }
		ruleAlternateCode
		{ after(grammarAccess.getAlternateIdentifierAccess().getCodeAlternateCodeParserRuleCall_2_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getCodeSTRINGTerminalRuleCall_2_0_1()); }
		RULE_STRING
		{ after(grammarAccess.getAlternateIdentifierAccess().getCodeSTRINGTerminalRuleCall_2_0_1()); }
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
		{ before(grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0()); }
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
		{ before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
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

rule__ConjunctionFilter__Alternatives_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()); }
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
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1()); }
		ruleLanguageFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1()); }
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
		{ before(grammarAccess.getPropertyFilterAccess().getIdFilterParserRuleCall_4()); }
		ruleIdFilter
		{ after(grammarAccess.getPropertyFilterAccess().getIdFilterParserRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_5()); }
		ruleDefinitionStatusFilter
		{ after(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6()); }
		ruleModuleFilter
		{ after(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_7()); }
		ruleEffectiveTimeFilter
		{ after(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_8()); }
		ruleActiveFilter
		{ after(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9()); }
		ruleSemanticTagFilter
		{ after(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_10()); }
		rulePreferredInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_11()); }
		ruleAcceptableInFilter
		{ after(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_12()); }
		ruleLanguageRefSetFilter
		{ after(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_13()); }
		ruleCaseSignificanceFilter
		{ after(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getMemberFieldFilterParserRuleCall_14()); }
		ruleMemberFieldFilter
		{ after(grammarAccess.getPropertyFilterAccess().getMemberFieldFilterParserRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_15()); }
		ruleNestedFilter
		{ after(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_15()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getGroup_0()); }
		(rule__IdFilter__Group_0__0)
		{ after(grammarAccess.getIdFilterAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getIdFilterAccess().getGroup_1()); }
		(rule__IdFilter__Group_1__0)
		{ after(grammarAccess.getIdFilterAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Alternatives_0_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_0()); }
		(rule__IdFilter__IdsAssignment_0_2_0)
		{ after(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getIdFilterAccess().getGroup_0_2_1()); }
		(rule__IdFilter__Group_0_2_1__0)
		{ after(grammarAccess.getIdFilterAccess().getGroup_0_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SearchTerm__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSearchTermAccess().getTypedSearchTermParserRuleCall_0()); }
		ruleTypedSearchTerm
		{ after(grammarAccess.getSearchTermAccess().getTypedSearchTermParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSearchTermAccess().getTypedSearchTermSetParserRuleCall_1()); }
		ruleTypedSearchTermSet
		{ after(grammarAccess.getSearchTermAccess().getTypedSearchTermSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getGroup_0()); }
		(rule__TypedSearchTermClause__Group_0__0)
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getGroup_1()); }
		(rule__TypedSearchTermClause__Group_1__0)
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_0()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_0)
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getLanguageFilterAccess().getGroup_2_1()); }
		(rule__LanguageFilter__Group_2_1__0)
		{ after(grammarAccess.getLanguageFilterAccess().getGroup_2_1()); }
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

rule__DefinitionStatusFilter__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusIdFilterParserRuleCall_0()); }
		ruleDefinitionStatusIdFilter
		{ after(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusIdFilterParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusTokenFilterParserRuleCall_1()); }
		ruleDefinitionStatusTokenFilter
		{ after(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusTokenFilterParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Alternatives_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_0()); }
		(rule__DefinitionStatusTokenFilter__DefinitionStatusTokensAssignment_2_0)
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_0()); }
	)
	|
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getGroup_2_1()); }
		(rule__DefinitionStatusTokenFilter__Group_2_1__0)
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getGroup_2_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilterValueAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getFilterValueAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getFilterValueAccess().getEclConceptReferenceSetParserRuleCall_1()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getFilterValueAccess().getEclConceptReferenceSetParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__HistoryAlternatives_4_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0()); }
		ruleHistoryProfile
		{ after(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1()); }
		ruleNestedExpression
		{ after(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistoryProfile__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0()); }
		RULE_DASH
		{ after(grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1()); }
		RULE_UNDERSCORE
		{ after(grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_0_0()); }
		RULE_DIGIT
		{ after(grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0_1()); }
		RULE_ALPHA
		{ after(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_0_5()); }
		RULE_REVERSED
		{ after(grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_0_6()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_0_6()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_0_7()); }
		RULE_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_0_7()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_1_0()); }
		RULE_DIGIT
		{ after(grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1()); }
		RULE_ALPHA
		{ after(grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_1_5()); }
		RULE_REVERSED
		{ after(grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_1_6()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_1_6()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_1_7()); }
		RULE_KEYWORD
		{ after(grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_1_7()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_1_8()); }
		RULE_DASH
		{ after(grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_1_8()); }
	)
	|
	(
		{ before(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_9()); }
		RULE_UNDERSCORE
		{ after(grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_9()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateScheme__Alternatives_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_0_0()); }
		RULE_ALPHA
		{ after(grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_0_4()); }
		RULE_REVERSED
		{ after(grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_0_4()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_0_5()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_0_5()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_0_6()); }
		RULE_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_0_6()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateScheme__Alternatives_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getDIGITTerminalRuleCall_1_0()); }
		RULE_DIGIT
		{ after(grammarAccess.getAlternateSchemeAccess().getDIGITTerminalRuleCall_1_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_1_1()); }
		RULE_ALPHA
		{ after(grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_1_1()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_1_5()); }
		RULE_REVERSED
		{ after(grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_1_5()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_1_6()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_1_6()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_1_7()); }
		RULE_KEYWORD
		{ after(grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_1_7()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateSchemeAccess().getDASHTerminalRuleCall_1_8()); }
		RULE_DASH
		{ after(grammarAccess.getAlternateSchemeAccess().getDASHTerminalRuleCall_1_8()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateCode__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateCodeAccess().getDIGITTerminalRuleCall_0()); }
		RULE_DIGIT
		{ after(grammarAccess.getAlternateCodeAccess().getDIGITTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getALPHATerminalRuleCall_1()); }
		RULE_ALPHA
		{ after(grammarAccess.getAlternateCodeAccess().getALPHATerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_2()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateCodeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateCodeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_4()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getAlternateCodeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getREVERSEDTerminalRuleCall_5()); }
		RULE_REVERSED
		{ after(grammarAccess.getAlternateCodeAccess().getREVERSEDTerminalRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getID_KEYWORDTerminalRuleCall_6()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getAlternateCodeAccess().getID_KEYWORDTerminalRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getKEYWORDTerminalRuleCall_7()); }
		RULE_KEYWORD
		{ after(grammarAccess.getAlternateCodeAccess().getKEYWORDTerminalRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getDOTTerminalRuleCall_8()); }
		RULE_DOT
		{ after(grammarAccess.getAlternateCodeAccess().getDOTTerminalRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getAlternateCodeAccess().getDASHTerminalRuleCall_9()); }
		RULE_DASH
		{ after(grammarAccess.getAlternateCodeAccess().getDASHTerminalRuleCall_9()); }
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

rule__Boolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0()); }
		RULE_TRUE_KEYWORD
		{ after(grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1()); }
		RULE_FALSE_KEYWORD
		{ after(grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveBoolean__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveBooleanAccess().getNonNegativeIntegerParserRuleCall_0()); }
		ruleNonNegativeInteger
		{ after(grammarAccess.getActiveBooleanAccess().getNonNegativeIntegerParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getActiveBooleanAccess().getBooleanParserRuleCall_1()); }
		ruleBoolean
		{ after(grammarAccess.getActiveBooleanAccess().getBooleanParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__UnquotedString__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getUnquotedStringAccess().getHISTORY_KEYWORDTerminalRuleCall_0()); }
		RULE_HISTORY_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getHISTORY_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1()); }
		RULE_CASE_SIGNIFICANCE_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2()); }
		RULE_DEFINITION_STATUS_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3()); }
		RULE_DEFINITION_STATUS_TOKEN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4()); }
		RULE_LANGUAGE_REFSET_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5()); }
		RULE_EFFECTIVE_TIME_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_6()); }
		RULE_ACCEPTABLE_IN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_6()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_7()); }
		RULE_PREFERRED_IN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_7()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_8()); }
		RULE_SEMANTIC_TAG_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_8()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_9()); }
		RULE_DIALECTID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_9()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_10()); }
		RULE_LANGUAGE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_10()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_11()); }
		RULE_MODULEID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_11()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_12()); }
		RULE_DIALECT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_12()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_13()); }
		RULE_ACTIVE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_13()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_14()); }
		RULE_TYPEID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_14()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_15()); }
		RULE_EXCLUSION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_15()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_16()); }
		RULE_EXACT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_16()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_17()); }
		RULE_FALSE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_17()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_18()); }
		RULE_MATCH_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_18()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_19()); }
		RULE_REGEX_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_19()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_20()); }
		RULE_TERM_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_20()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_21()); }
		RULE_TRUE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_21()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_22()); }
		RULE_TYPE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_22()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_23()); }
		RULE_WILD_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_23()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMIN_KEYWORDTerminalRuleCall_24()); }
		RULE_MIN_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMIN_KEYWORDTerminalRuleCall_24()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMOD_KEYWORDTerminalRuleCall_25()); }
		RULE_MOD_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMOD_KEYWORDTerminalRuleCall_25()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMAX_KEYWORDTerminalRuleCall_26()); }
		RULE_MAX_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMAX_KEYWORDTerminalRuleCall_26()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_27()); }
		RULE_CONJUNCTION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_27()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_28()); }
		RULE_DISJUNCTION_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_28()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getID_KEYWORDTerminalRuleCall_29()); }
		RULE_ID_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getID_KEYWORDTerminalRuleCall_29()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_30()); }
		RULE_REVERSED
		{ after(grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_30()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_31()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_31()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_33()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_33()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getWILDCARDTerminalRuleCall_34()); }
		RULE_WILDCARD
		{ after(grammarAccess.getUnquotedStringAccess().getWILDCARDTerminalRuleCall_34()); }
	)
	|
	(
		{ before(grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_35()); }
		RULE_KEYWORD
		{ after(grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_35()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DialectAliasValue__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0()); }
		RULE_DASH
		{ after(grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getKEYWORDTerminalRuleCall_1()); }
		RULE_KEYWORD
		{ after(grammarAccess.getDialectAliasValueAccess().getKEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getDialectAliasValueAccess().getDIGITTerminalRuleCall_2()); }
		RULE_DIGIT
		{ after(grammarAccess.getDialectAliasValueAccess().getDIGITTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LEXICAL_SEARCH_TYPE__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0()); }
		RULE_MATCH_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1()); }
		RULE_WILD_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_2()); }
		RULE_EXACT_KEYWORD
		{ after(grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HISTORY_PROFILE_TYPE__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMIN_KEYWORDTerminalRuleCall_0()); }
		RULE_MIN_KEYWORD
		{ after(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMIN_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMOD_KEYWORDTerminalRuleCall_1()); }
		RULE_MOD_KEYWORD
		{ after(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMOD_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMAX_KEYWORDTerminalRuleCall_2()); }
		RULE_MAX_KEYWORD
		{ after(grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMAX_KEYWORDTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SHORT_DOMAIN__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSHORT_DOMAINAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0()); }
		RULE_CONCEPT_SHORT_KEYWORD
		{ after(grammarAccess.getSHORT_DOMAINAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getSHORT_DOMAINAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1()); }
		RULE_DESCRIPTION_SHORT_KEYWORD
		{ after(grammarAccess.getSHORT_DOMAINAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getSHORT_DOMAINAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_2()); }
		RULE_MEMBER_SHORT_KEYWORD
		{ after(grammarAccess.getSHORT_DOMAINAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NON_NUMERIC_OPERATOR__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__NUMERIC_OPERATOR__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
		RULE_EQUAL
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
		RULE_NOT_EQUAL
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2()); }
		RULE_GT
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3()); }
		RULE_LT
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4()); }
		RULE_GTE
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4()); }
	)
	|
	(
		{ before(grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5()); }
		RULE_LTE
		{ after(grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5()); }
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
	{ before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
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
	{ before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_EXCLUSION_KEYWORD
	{ after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1()); }
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
	{ before(grammarAccess.getDottedExpressionConstraintAccess().getSupplementExpressionConstraintParserRuleCall_0()); }
	ruleSupplementExpressionConstraint
	{ after(grammarAccess.getDottedExpressionConstraintAccess().getSupplementExpressionConstraintParserRuleCall_0()); }
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


rule__SupplementExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupplementExpressionConstraint__Group__0__Impl
	rule__SupplementExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupplementExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
	ruleFilteredExpressionConstraint
	{ after(grammarAccess.getSupplementExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupplementExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupplementExpressionConstraintAccess().getGroup_1()); }
	(rule__SupplementExpressionConstraint__Group_1__0)?
	{ after(grammarAccess.getSupplementExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SupplementExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupplementExpressionConstraint__Group_1__0__Impl
	rule__SupplementExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SupplementExpressionConstraint__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementAssignment_1_1()); }
	(rule__SupplementExpressionConstraint__SupplementAssignment_1_1)
	{ after(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FilteredExpressionConstraint__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group__0__Impl
	rule__FilteredExpressionConstraint__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
	ruleSubExpressionConstraint
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getGroup_1()); }
	(rule__FilteredExpressionConstraint__Group_1__0)*
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__FilteredExpressionConstraint__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group_1__0__Impl
	rule__FilteredExpressionConstraint__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0()); }
	()
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilteredExpressionConstraint__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilterAssignment_1_1()); }
	(rule__FilteredExpressionConstraint__FilterAssignment_1_1)
	{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilterAssignment_1_1()); }
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


rule__Top__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Top__Group__0__Impl
	rule__Top__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Top__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopAccess().getDBL_EM_GTTerminalRuleCall_0()); }
	RULE_DBL_EM_GT
	{ after(grammarAccess.getTopAccess().getDBL_EM_GTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Top__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Top__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Top__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTopAccess().getConstraintAssignment_1()); }
	(rule__Top__ConstraintAssignment_1)
	{ after(grammarAccess.getTopAccess().getConstraintAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Bottom__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bottom__Group__0__Impl
	rule__Bottom__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Bottom__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBottomAccess().getDBL_EM_LTTerminalRuleCall_0()); }
	RULE_DBL_EM_LT
	{ after(grammarAccess.getBottomAccess().getDBL_EM_LTTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bottom__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Bottom__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Bottom__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getBottomAccess().getConstraintAssignment_1()); }
	(rule__Bottom__ConstraintAssignment_1)
	{ after(grammarAccess.getBottomAccess().getConstraintAssignment_1()); }
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
	rule__MemberOf__Group__2
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
	{ before(grammarAccess.getMemberOfAccess().getGroup_1()); }
	(rule__MemberOf__Group_1__0)?
	{ after(grammarAccess.getMemberOfAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getConstraintAssignment_2()); }
	(rule__MemberOf__ConstraintAssignment_2)
	{ after(grammarAccess.getMemberOfAccess().getConstraintAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1__0__Impl
	rule__MemberOf__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getSQUARE_OPENTerminalRuleCall_1_0()); }
	RULE_SQUARE_OPEN
	{ after(grammarAccess.getMemberOfAccess().getSQUARE_OPENTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1__1__Impl
	rule__MemberOf__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getGroup_1_1()); }
	(rule__MemberOf__Group_1_1__0)
	{ after(grammarAccess.getMemberOfAccess().getGroup_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getSQUARE_CLOSETerminalRuleCall_1_2()); }
	RULE_SQUARE_CLOSE
	{ after(grammarAccess.getMemberOfAccess().getSQUARE_CLOSETerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1_1__0__Impl
	rule__MemberOf__Group_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getRefsetFieldsAssignment_1_1_0()); }
	(rule__MemberOf__RefsetFieldsAssignment_1_1_0)
	{ after(grammarAccess.getMemberOfAccess().getRefsetFieldsAssignment_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getGroup_1_1_1()); }
	(rule__MemberOf__Group_1_1_1__0)*
	{ after(grammarAccess.getMemberOfAccess().getGroup_1_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MemberOf__Group_1_1_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1_1_1__0__Impl
	rule__MemberOf__Group_1_1_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getCOMMATerminalRuleCall_1_1_1_0()); }
	RULE_COMMA
	{ after(grammarAccess.getMemberOfAccess().getCOMMATerminalRuleCall_1_1_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberOf__Group_1_1_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__Group_1_1_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberOfAccess().getRefsetFieldsAssignment_1_1_1_1()); }
	(rule__MemberOf__RefsetFieldsAssignment_1_1_1_1)
	{ after(grammarAccess.getMemberOfAccess().getRefsetFieldsAssignment_1_1_1_1()); }
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
	rule__EclConceptReference__Group__2
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
	{ before(grammarAccess.getEclConceptReferenceAccess().getWSTerminalRuleCall_1()); }
	(RULE_WS)*
	{ after(grammarAccess.getEclConceptReferenceAccess().getWSTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EclConceptReference__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_2()); }
	(rule__EclConceptReference__TermAssignment_2)?
	{ after(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AlternateIdentifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateIdentifier__Group__0__Impl
	rule__AlternateIdentifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateIdentifierAccess().getSchemeAssignment_0()); }
	(rule__AlternateIdentifier__SchemeAssignment_0)
	{ after(grammarAccess.getAlternateIdentifierAccess().getSchemeAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateIdentifier__Group__1__Impl
	rule__AlternateIdentifier__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateIdentifierAccess().getHASHTerminalRuleCall_1()); }
	RULE_HASH
	{ after(grammarAccess.getAlternateIdentifierAccess().getHASHTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateIdentifier__Group__2__Impl
	rule__AlternateIdentifier__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateIdentifierAccess().getCodeAssignment_2()); }
	(rule__AlternateIdentifier__CodeAssignment_2)
	{ after(grammarAccess.getAlternateIdentifierAccess().getCodeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateIdentifier__Group__3__Impl
	rule__AlternateIdentifier__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateIdentifierAccess().getWSTerminalRuleCall_3()); }
	(RULE_WS)*
	{ after(grammarAccess.getAlternateIdentifierAccess().getWSTerminalRuleCall_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateIdentifier__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateIdentifierAccess().getTermAssignment_4()); }
	(rule__AlternateIdentifier__TermAssignment_4)?
	{ after(grammarAccess.getAlternateIdentifierAccess().getTermAssignment_4()); }
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
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
		(rule__EclConceptReferenceSet__ConceptsAssignment_1)
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
	)
	(
		{ before(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
		(rule__EclConceptReferenceSet__ConceptsAssignment_1)*
		{ after(grammarAccess.getEclConceptReferenceSetAccess().getConceptsAssignment_1()); }
	)
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
	{ before(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
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
	{ before(grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1()); }
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
	{ before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
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
	(rule__AttributeConstraint__ComparisonAssignment_3)?
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
	{ before(grammarAccess.getFilterConstraintAccess().getDomainAssignment_1()); }
	(rule__FilterConstraint__DomainAssignment_1)?
	{ after(grammarAccess.getFilterConstraintAccess().getDomainAssignment_1()); }
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
	rule__FilterConstraint__Group__3
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
	{ before(grammarAccess.getFilterConstraintAccess().getFilterAssignment_2()); }
	(rule__FilterConstraint__FilterAssignment_2)
	{ after(grammarAccess.getFilterConstraintAccess().getFilterAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__FilterConstraint__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_3()); }
	RULE_DOUBLE_CURLY_CLOSE
	{ after(grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_3()); }
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
	{ before(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
	RULE_DISJUNCTION_KEYWORD
	{ after(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1()); }
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
	{ before(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0()); }
	rulePropertyFilter
	{ after(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0()); }
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


rule__MemberFieldFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberFieldFilter__Group__0__Impl
	rule__MemberFieldFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberFieldFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameAssignment_0()); }
	(rule__MemberFieldFilter__RefsetFieldNameAssignment_0)
	{ after(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameAssignment_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberFieldFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MemberFieldFilter__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberFieldFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMemberFieldFilterAccess().getComparisonAssignment_1()); }
	(rule__MemberFieldFilter__ComparisonAssignment_1)
	{ after(grammarAccess.getMemberFieldFilterAccess().getComparisonAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IdFilter__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0__0__Impl
	rule__IdFilter__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_0_0()); }
	RULE_ID_KEYWORD
	{ after(grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0__1__Impl
	rule__IdFilter__Group_0__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getOpAssignment_0_1()); }
	(rule__IdFilter__OpAssignment_0_1)
	{ after(grammarAccess.getIdFilterAccess().getOpAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getAlternatives_0_2()); }
	(rule__IdFilter__Alternatives_0_2)
	{ after(grammarAccess.getIdFilterAccess().getAlternatives_0_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IdFilter__Group_0_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0_2_1__0__Impl
	rule__IdFilter__Group_0_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getROUND_OPENTerminalRuleCall_0_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getIdFilterAccess().getROUND_OPENTerminalRuleCall_0_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0_2_1__1__Impl
	rule__IdFilter__Group_0_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_1_1()); }
		(rule__IdFilter__IdsAssignment_0_2_1_1)
		{ after(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_1_1()); }
	)
	(
		{ before(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_1_1()); }
		(rule__IdFilter__IdsAssignment_0_2_1_1)*
		{ after(grammarAccess.getIdFilterAccess().getIdsAssignment_0_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_0_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_0_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getROUND_CLOSETerminalRuleCall_0_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getIdFilterAccess().getROUND_CLOSETerminalRuleCall_0_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__IdFilter__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_1__0__Impl
	rule__IdFilter__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_1_0()); }
	RULE_ID_KEYWORD
	{ after(grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_1__1__Impl
	rule__IdFilter__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getOpAssignment_1_1()); }
	(rule__IdFilter__OpAssignment_1_1)
	{ after(grammarAccess.getIdFilterAccess().getOpAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_1__2__Impl
	rule__IdFilter__Group_1__3
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getREGEX_KEYWORDTerminalRuleCall_1_2()); }
	RULE_REGEX_KEYWORD
	{ after(grammarAccess.getIdFilterAccess().getREGEX_KEYWORDTerminalRuleCall_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_1__3__Impl
	rule__IdFilter__Group_1__4
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getCOLONTerminalRuleCall_1_3()); }
	RULE_COLON
	{ after(grammarAccess.getIdFilterAccess().getCOLONTerminalRuleCall_1_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__IdFilter__Group_1__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__Group_1__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdFilterAccess().getRegularExpressionParserRuleCall_1_4()); }
	ruleRegularExpression
	{ after(grammarAccess.getIdFilterAccess().getRegularExpressionParserRuleCall_1_4()); }
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
	rule__TermFilter__Group__2
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
	{ before(grammarAccess.getTermFilterAccess().getOpAssignment_1()); }
	(rule__TermFilter__OpAssignment_1)
	{ after(grammarAccess.getTermFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TermFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTermFilterAccess().getSearchTermAssignment_2()); }
	(rule__TermFilter__SearchTermAssignment_2)
	{ after(grammarAccess.getTermFilterAccess().getSearchTermAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedSearchTermSet__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermSet__Group__0__Impl
	rule__TypedSearchTermSet__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermSetAccess().getROUND_OPENTerminalRuleCall_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getTypedSearchTermSetAccess().getROUND_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermSet__Group__1__Impl
	rule__TypedSearchTermSet__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getTypedSearchTermSetAccess().getClausesAssignment_1()); }
		(rule__TypedSearchTermSet__ClausesAssignment_1)
		{ after(grammarAccess.getTypedSearchTermSetAccess().getClausesAssignment_1()); }
	)
	(
		{ before(grammarAccess.getTypedSearchTermSetAccess().getClausesAssignment_1()); }
		(rule__TypedSearchTermSet__ClausesAssignment_1)*
		{ after(grammarAccess.getTypedSearchTermSetAccess().getClausesAssignment_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermSet__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypedSearchTermSetAccess().getROUND_CLOSETerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedSearchTermClause__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_0__0__Impl
	rule__TypedSearchTermClause__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getGroup_0_0()); }
	(rule__TypedSearchTermClause__Group_0_0__0)?
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getGroup_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getTermAssignment_0_1()); }
	(rule__TypedSearchTermClause__TermAssignment_0_1)
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getTermAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedSearchTermClause__Group_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_0_0__0__Impl
	rule__TypedSearchTermClause__Group_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeAssignment_0_0_0()); }
	(rule__TypedSearchTermClause__LexicalSearchTypeAssignment_0_0_0)
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeAssignment_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_0_0_1()); }
	RULE_COLON
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__TypedSearchTermClause__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_1__0__Impl
	rule__TypedSearchTermClause__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeAssignment_1_0()); }
	(rule__TypedSearchTermClause__LexicalSearchTypeAssignment_1_0)
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeAssignment_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_1__1__Impl
	rule__TypedSearchTermClause__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_1_1()); }
	RULE_COLON
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__TypedSearchTermClause__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getTypedSearchTermClauseAccess().getTermAssignment_1_2()); }
	(rule__TypedSearchTermClause__TermAssignment_1_2)
	{ after(grammarAccess.getTypedSearchTermClauseAccess().getTermAssignment_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__0__Impl
	rule__LanguageFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
	RULE_LANGUAGE_KEYWORD
	{ after(grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__1__Impl
	rule__LanguageFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getOpAssignment_1()); }
	(rule__LanguageFilter__OpAssignment_1)
	{ after(grammarAccess.getLanguageFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getAlternatives_2()); }
	(rule__LanguageFilter__Alternatives_2)
	{ after(grammarAccess.getLanguageFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__0__Impl
	rule__LanguageFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__1__Impl
	rule__LanguageFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_1_1)
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
		(rule__LanguageFilter__LanguageCodesAssignment_2_1_1)*
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
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
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
		(rule__TypeTokenFilter__TokensAssignment_2_1_1)
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
		(rule__TypeTokenFilter__TokensAssignment_2_1_1)*
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensAssignment_2_1_1()); }
	)
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
	{ before(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
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
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectIdFilter__DialectsAssignment_2_1_1)
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectIdFilter__DialectsAssignment_2_1_1)*
		{ after(grammarAccess.getDialectIdFilterAccess().getDialectsAssignment_2_1_1()); }
	)
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
	{ before(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
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
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_1_1)
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
		(rule__DialectAliasFilter__DialectsAssignment_2_1_1)*
		{ after(grammarAccess.getDialectAliasFilterAccess().getDialectsAssignment_2_1_1()); }
	)
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
	{ before(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
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


rule__DefinitionStatusIdFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusIdFilter__Group__0__Impl
	rule__DefinitionStatusIdFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0()); }
	RULE_DEFINITION_STATUS_ID_KEYWORD
	{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusIdFilter__Group__1__Impl
	rule__DefinitionStatusIdFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getOpAssignment_1()); }
	(rule__DefinitionStatusIdFilter__OpAssignment_1)
	{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusIdFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusAssignment_2()); }
	(rule__DefinitionStatusIdFilter__DefinitionStatusAssignment_2)
	{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefinitionStatusTokenFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group__0__Impl
	rule__DefinitionStatusTokenFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0()); }
	RULE_DEFINITION_STATUS_TOKEN_KEYWORD
	{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group__1__Impl
	rule__DefinitionStatusTokenFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpAssignment_1()); }
	(rule__DefinitionStatusTokenFilter__OpAssignment_1)
	{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getAlternatives_2()); }
	(rule__DefinitionStatusTokenFilter__Alternatives_2)
	{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getAlternatives_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__DefinitionStatusTokenFilter__Group_2_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group_2_1__0__Impl
	rule__DefinitionStatusTokenFilter__Group_2_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group_2_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
	RULE_ROUND_OPEN
	{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group_2_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group_2_1__1__Impl
	rule__DefinitionStatusTokenFilter__Group_2_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group_2_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_1_1()); }
		(rule__DefinitionStatusTokenFilter__DefinitionStatusTokensAssignment_2_1_1)
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_1_1()); }
	)
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_1_1()); }
		(rule__DefinitionStatusTokenFilter__DefinitionStatusTokensAssignment_2_1_1)*
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensAssignment_2_1_1()); }
	)
)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group_2_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__DefinitionStatusTokenFilter__Group_2_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__Group_2_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
	RULE_ROUND_CLOSE
	{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ModuleFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__0__Impl
	rule__ModuleFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0()); }
	RULE_MODULEID_KEYWORD
	{ after(grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__1__Impl
	rule__ModuleFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getOpAssignment_1()); }
	(rule__ModuleFilter__OpAssignment_1)
	{ after(grammarAccess.getModuleFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ModuleFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_2()); }
	(rule__ModuleFilter__ModuleIdAssignment_2)
	{ after(grammarAccess.getModuleFilterAccess().getModuleIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__EffectiveTimeFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__0__Impl
	rule__EffectiveTimeFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0()); }
	RULE_EFFECTIVE_TIME_KEYWORD
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__1__Impl
	rule__EffectiveTimeFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getOpAssignment_1()); }
	(rule__EffectiveTimeFilter__OpAssignment_1)
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__EffectiveTimeFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeAssignment_2()); }
	(rule__EffectiveTimeFilter__EffectiveTimeAssignment_2)
	{ after(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__ActiveFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__0__Impl
	rule__ActiveFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0()); }
	RULE_ACTIVE_KEYWORD
	{ after(grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__1__Impl
	rule__ActiveFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getOpAssignment_1()); }
	(rule__ActiveFilter__OpAssignment_1)
	{ after(grammarAccess.getActiveFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__ActiveFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getActiveFilterAccess().getActiveAssignment_2()); }
	(rule__ActiveFilter__ActiveAssignment_2)
	{ after(grammarAccess.getActiveFilterAccess().getActiveAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__SemanticTagFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__0__Impl
	rule__SemanticTagFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0()); }
	RULE_SEMANTIC_TAG_KEYWORD
	{ after(grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__1__Impl
	rule__SemanticTagFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getOpAssignment_1()); }
	(rule__SemanticTagFilter__OpAssignment_1)
	{ after(grammarAccess.getSemanticTagFilterAccess().getOpAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__SemanticTagFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getSemanticTagFilterAccess().getSemanticTagAssignment_2()); }
	(rule__SemanticTagFilter__SemanticTagAssignment_2)
	{ after(grammarAccess.getSemanticTagFilterAccess().getSemanticTagAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PreferredInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__0__Impl
	rule__PreferredInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0()); }
	RULE_PREFERRED_IN_KEYWORD
	{ after(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__1__Impl
	rule__PreferredInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PreferredInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__PreferredInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AcceptableInFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__0__Impl
	rule__AcceptableInFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0()); }
	RULE_ACCEPTABLE_IN_KEYWORD
	{ after(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__1__Impl
	rule__AcceptableInFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AcceptableInFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__AcceptableInFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LanguageRefSetFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__0__Impl
	rule__LanguageRefSetFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0()); }
	RULE_LANGUAGE_REFSET_ID_KEYWORD
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__1__Impl
	rule__LanguageRefSetFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LanguageRefSetFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
	(rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2)
	{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__CaseSignificanceFilter__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__0__Impl
	rule__CaseSignificanceFilter__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
	RULE_CASE_SIGNIFICANCE_ID_KEYWORD
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__1__Impl
	rule__CaseSignificanceFilter__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
	RULE_EQUAL
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__CaseSignificanceFilter__Group__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
	(rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2)
	{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdAssignment_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HistorySupplement__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__0__Impl
	rule__HistorySupplement__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
	RULE_DOUBLE_CURLY_OPEN
	{ after(grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__1__Impl
	rule__HistorySupplement__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1()); }
	RULE_PLUS
	{ after(grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__2__Impl
	rule__HistorySupplement__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2()); }
	RULE_HISTORY_KEYWORD
	{ after(grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__3__Impl
	rule__HistorySupplement__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getHistorySupplementAction_3()); }
	()
	{ after(grammarAccess.getHistorySupplementAccess().getHistorySupplementAction_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__4__Impl
	rule__HistorySupplement__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getHistoryAssignment_4()); }
	(rule__HistorySupplement__HistoryAssignment_4)?
	{ after(grammarAccess.getHistorySupplementAccess().getHistoryAssignment_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistorySupplement__Group__5__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_5()); }
	RULE_DOUBLE_CURLY_CLOSE
	{ after(grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__HistoryProfile__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistoryProfile__Group__0__Impl
	rule__HistoryProfile__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__HistoryProfile__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistoryProfileAccess().getAlternatives_0()); }
	(rule__HistoryProfile__Alternatives_0)
	{ after(grammarAccess.getHistoryProfileAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistoryProfile__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__HistoryProfile__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__HistoryProfile__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getHistoryProfileAccess().getProfileAssignment_1()); }
	(rule__HistoryProfile__ProfileAssignment_1)
	{ after(grammarAccess.getHistoryProfileAccess().getProfileAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Identifier__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Identifier__Group__0__Impl
	rule__Identifier__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdentifierAccess().getAlternatives_0()); }
	(rule__Identifier__Alternatives_0)
	{ after(grammarAccess.getIdentifierAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Identifier__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Identifier__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getIdentifierAccess().getAlternatives_1()); }
	(rule__Identifier__Alternatives_1)*
	{ after(grammarAccess.getIdentifierAccess().getAlternatives_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__AlternateScheme__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateScheme__Group__0__Impl
	rule__AlternateScheme__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateScheme__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateSchemeAccess().getAlternatives_0()); }
	(rule__AlternateScheme__Alternatives_0)
	{ after(grammarAccess.getAlternateSchemeAccess().getAlternatives_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateScheme__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__AlternateScheme__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateScheme__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAlternateSchemeAccess().getAlternatives_1()); }
	(rule__AlternateScheme__Alternatives_1)*
	{ after(grammarAccess.getAlternateSchemeAccess().getAlternatives_1()); }
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
	{ before(grammarAccess.getNonNegativeDecimalAccess().getDIGITTerminalRuleCall_2()); }
	(RULE_DIGIT)*
	{ after(grammarAccess.getNonNegativeDecimalAccess().getDIGITTerminalRuleCall_2()); }
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
		{ before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0()); }
		ruleSupplementExpressionConstraint
		{ after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SupplementExpressionConstraint__SupplementAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0()); }
		ruleSupplement
		{ after(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilteredExpressionConstraint__FilterAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0()); }
		ruleFilterConstraint
		{ after(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0()); }
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

rule__Top__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTopAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getTopAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Bottom__ConstraintAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getBottomAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
		ruleEclFocusConcept
		{ after(grammarAccess.getBottomAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__RefsetFieldsAssignment_1_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__RefsetFieldsAssignment_1_1_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberOf__ConstraintAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_2_0()); }
		(rule__MemberOf__ConstraintAlternatives_2_0)
		{ after(grammarAccess.getMemberOfAccess().getConstraintAlternatives_2_0()); }
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
		{ before(grammarAccess.getEclConceptReferenceAccess().getIdIdentifierParserRuleCall_0_0()); }
		ruleIdentifier
		{ after(grammarAccess.getEclConceptReferenceAccess().getIdIdentifierParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EclConceptReference__TermAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0()); }
		RULE_PIPE_DELIMITED_STRING
		{ after(grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__SchemeAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getSchemeAlternateSchemeParserRuleCall_0_0()); }
		ruleAlternateScheme
		{ after(grammarAccess.getAlternateIdentifierAccess().getSchemeAlternateSchemeParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__CodeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getCodeAlternatives_2_0()); }
		(rule__AlternateIdentifier__CodeAlternatives_2_0)
		{ after(grammarAccess.getAlternateIdentifierAccess().getCodeAlternatives_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AlternateIdentifier__TermAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAlternateIdentifierAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0()); }
		RULE_PIPE_DELIMITED_STRING
		{ after(grammarAccess.getAlternateIdentifierAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0()); }
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
		{ before(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getStringValueComparisonAccess().getValueSearchTermParserRuleCall_1_0()); }
		ruleSearchTerm
		{ after(grammarAccess.getStringValueComparisonAccess().getValueSearchTermParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
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
		{ before(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0()); }
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

rule__FilterConstraint__DomainAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0()); }
		ruleSHORT_DOMAIN
		{ after(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__FilterConstraint__FilterAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0()); }
		ruleFilter
		{ after(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
		rulePropertyFilter
		{ after(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0()); }
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

rule__MemberFieldFilter__RefsetFieldNameAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MemberFieldFilter__ComparisonAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMemberFieldFilterAccess().getComparisonComparisonParserRuleCall_1_0()); }
		ruleComparison
		{ after(grammarAccess.getMemberFieldFilterAccess().getComparisonComparisonParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__OpAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__IdsAssignment_0_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_2_0_0()); }
		ruleIdentifier
		{ after(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__IdsAssignment_0_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_2_1_1_0()); }
		ruleIdentifier
		{ after(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__IdFilter__OpAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TermFilter__SearchTermAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTermFilterAccess().getSearchTermSearchTermParserRuleCall_2_0()); }
		ruleSearchTerm
		{ after(grammarAccess.getTermFilterAccess().getSearchTermSearchTermParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTerm__ClauseAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermAccess().getClauseTypedSearchTermClauseParserRuleCall_0()); }
		ruleTypedSearchTermClause
		{ after(grammarAccess.getTypedSearchTermAccess().getClauseTypedSearchTermClauseParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermSet__ClausesAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermSetAccess().getClausesTypedSearchTermClauseParserRuleCall_1_0()); }
		ruleTypedSearchTermClause
		{ after(grammarAccess.getTypedSearchTermSetAccess().getClausesTypedSearchTermClauseParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__LexicalSearchTypeAssignment_0_0_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0()); }
		ruleLEXICAL_SEARCH_TYPE
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__TermAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0()); }
		RULE_STRING
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__LexicalSearchTypeAssignment_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0()); }
		RULE_REGEX_KEYWORD
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__TypedSearchTermClause__TermAssignment_1_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getTypedSearchTermClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0()); }
		ruleRegularExpression
		{ after(grammarAccess.getTypedSearchTermClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__LanguageCodesAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageFilter__LanguageCodesAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0()); }
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
		{ before(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0()); }
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
		{ before(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
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
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0()); }
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
		{ before(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0()); }
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
		{ before(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
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

rule__DialectAliasFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
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

rule__Dialect__LanguageRefSetIdAssignment_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0()); }
		ruleFilteredExpressionConstraint
		{ after(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0()); }
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

rule__Acceptability__AcceptabilitiesAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
		ruleEclConceptReferenceSet
		{ after(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusIdFilter__DefinitionStatusAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__DefinitionStatusTokensAssignment_2_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__DefinitionStatusTokenFilter__DefinitionStatusTokensAssignment_2_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0()); }
		ruleUnquotedString
		{ after(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getModuleFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ModuleFilter__ModuleIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNUMERIC_OPERATOR
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__EffectiveTimeFilter__EffectiveTimeAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getActiveFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__ActiveFilter__ActiveAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0()); }
		ruleActiveBoolean
		{ after(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__OpAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
		ruleNON_NUMERIC_OPERATOR
		{ after(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__SemanticTagFilter__SemanticTagAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0()); }
		RULE_STRING
		{ after(grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PreferredInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AcceptableInFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LanguageRefSetFilter__LanguageRefSetIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__CaseSignificanceFilter__CaseSignificanceIdAssignment_2
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0()); }
		ruleFilterValue
		{ after(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistorySupplement__HistoryAssignment_4
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHistorySupplementAccess().getHistoryAlternatives_4_0()); }
		(rule__HistorySupplement__HistoryAlternatives_4_0)
		{ after(grammarAccess.getHistorySupplementAccess().getHistoryAlternatives_4_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__HistoryProfile__ProfileAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getHistoryProfileAccess().getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0()); }
		ruleHISTORY_PROFILE_TYPE
		{ after(grammarAccess.getHistoryProfileAccess().getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_HISTORY_KEYWORD : ('HISTORY'|('h'|'H') ('i'|'I') ('s'|'S') ('t'|'T') ('o'|'O') ('r'|'R') ('y'|'Y'));

RULE_CASE_SIGNIFICANCE_ID_KEYWORD : ('caseSignificanceId'|('C'|'c') ('A'|'a') ('S'|'s') ('E'|'e') ('S'|'s') ('I'|'i') ('G'|'g') ('N'|'n') ('I'|'i') ('F'|'f') ('I'|'i') ('C'|'c') ('A'|'a') ('N'|'n') ('C'|'c') ('E'|'e') ('I'|'i') ('D'|'d'));

RULE_DEFINITION_STATUS_ID_KEYWORD : ('definitionStatusId'|('d'|'D') ('e'|'E') ('f'|'F') ('i'|'I') ('n'|'N') ('i'|'I') ('t'|'T') ('i'|'I') ('o'|'O') ('n'|'N') ('s'|'S') ('t'|'T') ('a'|'A') ('t'|'T') ('u'|'U') ('s'|'S') ('i'|'I') ('d'|'D'));

RULE_DEFINITION_STATUS_TOKEN_KEYWORD : ('definitionStatus'|('d'|'D') ('e'|'E') ('f'|'F') ('i'|'I') ('n'|'N') ('i'|'I') ('t'|'T') ('i'|'I') ('o'|'O') ('n'|'N') ('s'|'S') ('t'|'T') ('a'|'A') ('t'|'T') ('u'|'U') ('s'|'S'));

RULE_LANGUAGE_REFSET_ID_KEYWORD : ('languageRefsetId'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e') ('R'|'r') ('E'|'e') ('F'|'f') ('S'|'s') ('E'|'e') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_EFFECTIVE_TIME_KEYWORD : ('effectiveTime'|('E'|'e') ('F'|'f') ('F'|'f') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('V'|'v') ('E'|'e') ('T'|'t') ('I'|'i') ('M'|'m') ('E'|'e'));

RULE_ACCEPTABLE_IN_KEYWORD : ('acceptableIn'|('A'|'a') ('C'|'c') ('C'|'c') ('E'|'e') ('P'|'p') ('T'|'t') ('A'|'a') ('B'|'b') ('L'|'l') ('E'|'e') ('I'|'i') ('N'|'n'));

RULE_PREFERRED_IN_KEYWORD : ('preferredIn'|('P'|'p') ('R'|'r') ('E'|'e') ('F'|'f') ('E'|'e') ('R'|'r') ('R'|'r') ('E'|'e') ('D'|'d') ('I'|'i') ('N'|'n'));

RULE_SEMANTIC_TAG_KEYWORD : ('semanticTag'|('S'|'s') ('E'|'e') ('M'|'m') ('A'|'a') ('N'|'n') ('T'|'t') ('I'|'i') ('C'|'c') ('T'|'t') ('A'|'a') ('G'|'g'));

RULE_DIALECTID_KEYWORD : ('dialectId'|('D'|'d') ('I'|'i') ('A'|'a') ('L'|'l') ('E'|'e') ('C'|'c') ('T'|'t') ('I'|'i') ('D'|'d'));

RULE_LANGUAGE_KEYWORD : ('language'|('L'|'l') ('A'|'a') ('N'|'n') ('G'|'g') ('U'|'u') ('A'|'a') ('G'|'g') ('E'|'e'));

RULE_MODULEID_KEYWORD : ('moduleId'|('M'|'m') ('O'|'o') ('D'|'d') ('U'|'u') ('L'|'l') ('E'|'e') ('I'|'i') ('D'|'d'));

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

RULE_MIN_KEYWORD : ('MIN'|('M'|'m') ('I'|'i') ('N'|'n'));

RULE_MOD_KEYWORD : ('MOD'|('M'|'m') ('O'|'o') ('D'|'d'));

RULE_MAX_KEYWORD : ('MAX'|('M'|'m') ('A'|'a') ('X'|'x'));

RULE_CONJUNCTION_KEYWORD : ('AND'|('A'|'a') ('N'|'n') ('D'|'d'));

RULE_DISJUNCTION_KEYWORD : ('OR'|('O'|'o') ('R'|'r'));

RULE_ID_KEYWORD : ('ID'|('I'|'i') ('D'|'d'));

RULE_REVERSED : 'R';

RULE_MEMBER_SHORT_KEYWORD : ('M'|'m');

RULE_DESCRIPTION_SHORT_KEYWORD : ('D'|'d');

RULE_CONCEPT_SHORT_KEYWORD : ('C'|'c');

RULE_ALPHA : ('a'..'z'|'A'..'Z');

RULE_KEYWORD : RULE_ALPHA RULE_ALPHA+;

RULE_DBL_LT_EM : '<<!';

RULE_DBL_GT_EM : '>>!';

RULE_DBL_LT : '<<';

RULE_DBL_GT : '>>';

RULE_LT_EM : '<!';

RULE_GT_EM : '>!';

RULE_DBL_EM_LT : '!!<';

RULE_DBL_EM_GT : '!!>';

RULE_GTE : '>=';

RULE_LTE : '<=';

RULE_DOUBLE_CURLY_OPEN : '{{';

RULE_DOUBLE_CURLY_CLOSE : '}}';

RULE_PIPE_DELIMITED_STRING : '|' ( options {greedy=false;} : . )*'|';

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_TO : '..';

RULE_COMMA : ',';

RULE_DIGIT : '0'..'9';

RULE_COLON : ':';

RULE_CURLY_OPEN : '{';

RULE_CURLY_CLOSE : '}';

RULE_ROUND_OPEN : '(';

RULE_ROUND_CLOSE : ')';

RULE_SQUARE_OPEN : '[';

RULE_SQUARE_CLOSE : ']';

RULE_PLUS : '+';

RULE_DASH : '-';

RULE_UNDERSCORE : '_';

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
