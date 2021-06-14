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

import com.b2international.snomed.ecl.services.EclGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class EclSyntacticSequencer extends AbstractSyntacticSequencer {

	protected EclGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0;
	protected AbstractElementAlias match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0;
	protected AbstractElementAlias match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTIONParserRuleCall_1_0_1_0;
	protected AbstractElementAlias match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EclGrammarAccess) access;
		match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONParserRuleCall_1_1_0()));
		match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONParserRuleCall_1_1_0()));
		match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTIONParserRuleCall_1_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()), new TokenAlias(false, false, grammarAccess.getAndRefinementAccess().getCONJUNCTIONParserRuleCall_1_0_1_0()));
		match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONParserRuleCall_1_1_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getACCEPTABLE_IN_KEYWORDRule())
			return getACCEPTABLE_IN_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getACTIVE_KEYWORDRule())
			return getACTIVE_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCARETRule())
			return getCARETToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCASE_SIGNIFICANCE_ID_KEYWORDRule())
			return getCASE_SIGNIFICANCE_ID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOLONRule())
			return getCOLONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCONJUNCTIONRule())
			return getCONJUNCTIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCURLY_CLOSERule())
			return getCURLY_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCURLY_OPENRule())
			return getCURLY_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_GTRule())
			return getDBL_GTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_GT_EMRule())
			return getDBL_GT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_LTRule())
			return getDBL_LTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_LT_EMRule())
			return getDBL_LT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDIALECTID_KEYWORDRule())
			return getDIALECTID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDIALECT_KEYWORDRule())
			return getDIALECT_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDISJUNCTIONRule())
			return getDISJUNCTIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOUBLE_CURLY_CLOSERule())
			return getDOUBLE_CURLY_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOUBLE_CURLY_OPENRule())
			return getDOUBLE_CURLY_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEXCLUSIONRule())
			return getEXCLUSIONToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getGTRule())
			return getGTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getGT_EMRule())
			return getGT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHASHRule())
			return getHASHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLANGUAGE_KEYWORDRule())
			return getLANGUAGE_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLANGUAGE_REFSET_ID_KEYWORDRule())
			return getLANGUAGE_REFSET_ID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLTRule())
			return getLTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLT_EMRule())
			return getLT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getMODULEID_KEYWORDRule())
			return getMODULEID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPREFERRED_IN_KEYWORDRule())
			return getPREFERRED_IN_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREVERSEDRule())
			return getREVERSEDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getROUND_CLOSERule())
			return getROUND_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getROUND_OPENRule())
			return getROUND_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSQUARE_CLOSERule())
			return getSQUARE_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSQUARE_OPENRule())
			return getSQUARE_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTERM_KEYWORDRule())
			return getTERM_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTORule())
			return getTOToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTYPEID_KEYWORDRule())
			return getTYPEID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getTYPE_KEYWORDRule())
			return getTYPE_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWILDCARDRule())
			return getWILDCARDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * ACCEPTABLE_IN_KEYWORD:
	 * 	'acceptableIn';
	 */
	protected String getACCEPTABLE_IN_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "acceptableIn";
	}
	
	/**
	 * ACTIVE_KEYWORD:
	 * 	'active';
	 */
	protected String getACTIVE_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "active";
	}
	
	/**
	 * terminal CARET:
	 * 	'^';
	 */
	protected String getCARETToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "^";
	}
	
	/**
	 * CASE_SIGNIFICANCE_ID_KEYWORD:
	 * 	'caseSignificanceId';
	 */
	protected String getCASE_SIGNIFICANCE_ID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "caseSignificanceId";
	}
	
	/**
	 * terminal COLON:
	 * 	':';
	 */
	protected String getCOLONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ":";
	}
	
	/**
	 * terminal COMMA:
	 * 	',';
	 */
	protected String getCOMMAToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	
	/**
	 * CONJUNCTION:
	 * 	'and';
	 */
	protected String getCONJUNCTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "and";
	}
	
	/**
	 * terminal CURLY_CLOSE:
	 * 	'}';
	 */
	protected String getCURLY_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}";
	}
	
	/**
	 * terminal CURLY_OPEN:
	 * 	'{';
	 */
	protected String getCURLY_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{";
	}
	
	/**
	 * terminal DBL_GT:
	 * 	'>>';
	 */
	protected String getDBL_GTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">>";
	}
	
	/**
	 * terminal DBL_GT_EM:
	 * 	'>>!';
	 */
	protected String getDBL_GT_EMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">>!";
	}
	
	/**
	 * terminal DBL_LT:
	 * 	'<<';
	 */
	protected String getDBL_LTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<<";
	}
	
	/**
	 * terminal DBL_LT_EM:
	 * 	'<<!';
	 */
	protected String getDBL_LT_EMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<<!";
	}
	
	/**
	 * DIALECTID_KEYWORD:
	 * 	'dialectId';
	 */
	protected String getDIALECTID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dialectId";
	}
	
	/**
	 * DIALECT_KEYWORD:
	 * 	'dialect';
	 */
	protected String getDIALECT_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dialect";
	}
	
	/**
	 * DISJUNCTION:
	 * 	'or';
	 */
	protected String getDISJUNCTIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "or";
	}
	
	/**
	 * terminal DOT:
	 * 	'.';
	 */
	protected String getDOTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ".";
	}
	
	/**
	 * terminal DOUBLE_CURLY_CLOSE:
	 * 	'}}';
	 */
	protected String getDOUBLE_CURLY_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "}}";
	}
	
	/**
	 * terminal DOUBLE_CURLY_OPEN:
	 * 	'{{';
	 */
	protected String getDOUBLE_CURLY_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "{{";
	}
	
	/**
	 * terminal EQUAL:
	 * 	'=';
	 */
	protected String getEQUALToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "=";
	}
	
	/**
	 * EXCLUSION:
	 * 	'minus';
	 */
	protected String getEXCLUSIONToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "minus";
	}
	
	/**
	 * terminal GT:
	 * 	'>';
	 */
	protected String getGTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal GT_EM:
	 * 	'>!';
	 */
	protected String getGT_EMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">!";
	}
	
	/**
	 * terminal HASH:
	 * 	'#';
	 */
	protected String getHASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "#";
	}
	
	/**
	 * LANGUAGE_KEYWORD:
	 * 	'language';
	 */
	protected String getLANGUAGE_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "language";
	}
	
	/**
	 * LANGUAGE_REFSET_ID_KEYWORD:
	 * 	'languageRefSetId';
	 */
	protected String getLANGUAGE_REFSET_ID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "languageRefSetId";
	}
	
	/**
	 * terminal LT:
	 * 	'<';
	 */
	protected String getLTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * terminal LT_EM:
	 * 	'<!';
	 */
	protected String getLT_EMToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<!";
	}
	
	/**
	 * MODULEID_KEYWORD:
	 * 	'moduleId';
	 */
	protected String getMODULEID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "moduleId";
	}
	
	/**
	 * PREFERRED_IN_KEYWORD:
	 * 	'preferredIn';
	 */
	protected String getPREFERRED_IN_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "preferredIn";
	}
	
	/**
	 * terminal REVERSED:
	 * 	'R';
	 */
	protected String getREVERSEDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "R";
	}
	
	/**
	 * terminal ROUND_CLOSE:
	 * 	')';
	 */
	protected String getROUND_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ")";
	}
	
	/**
	 * terminal ROUND_OPEN:
	 * 	'(';
	 */
	protected String getROUND_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "(";
	}
	
	/**
	 * terminal SQUARE_CLOSE:
	 * 	']';
	 */
	protected String getSQUARE_CLOSEToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "]";
	}
	
	/**
	 * terminal SQUARE_OPEN:
	 * 	'[';
	 */
	protected String getSQUARE_OPENToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "[";
	}
	
	/**
	 * TERM_KEYWORD:
	 * 	'term';
	 */
	protected String getTERM_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "term";
	}
	
	/**
	 * terminal TO:
	 * 	'..';
	 */
	protected String getTOToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "..";
	}
	
	/**
	 * TYPEID_KEYWORD:
	 * 	'typeId';
	 */
	protected String getTYPEID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "typeId";
	}
	
	/**
	 * TYPE_KEYWORD:
	 * 	'type';
	 */
	protected String getTYPE_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "type";
	}
	
	/**
	 * terminal WILDCARD:
	 * 	'*';
	 */
	protected String getWILDCARDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "*";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0.equals(syntax))
				emit_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0.equals(syntax))
				emit_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTIONParserRuleCall_1_0_1_0.equals(syntax))
				emit_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTIONParserRuleCall_1_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0.equals(syntax))
				emit_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     CONJUNCTION | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndRefinement.left=} (ambiguity) right=SubAttributeSet
	 */
	protected void emit_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     CONJUNCTION | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndExpressionConstraint.left=} (ambiguity) right=ExclusionExpressionConstraint
	 */
	protected void emit_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     CONJUNCTION | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndRefinement.left=} (ambiguity) right=SubRefinement
	 */
	protected void emit_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTIONParserRuleCall_1_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     CONJUNCTION | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {ConjunctionFilter.left=} (ambiguity) right=ExclusionFilter
	 */
	protected void emit_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTIONParserRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
