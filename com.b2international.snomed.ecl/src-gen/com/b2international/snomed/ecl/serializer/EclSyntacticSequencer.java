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
	protected AbstractElementAlias match_AlternateIdentifier_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0;
	protected AbstractElementAlias match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0;
	protected AbstractElementAlias match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0;
	protected AbstractElementAlias match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0;
	protected AbstractElementAlias match_EclConceptReference_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_HistoryProfile_DASHTerminalRuleCall_0_0_or_UNDERSCORETerminalRuleCall_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (EclGrammarAccess) access;
		match_AlternateIdentifier_WSTerminalRuleCall_3_a = new TokenAlias(true, true, grammarAccess.getAlternateIdentifierAccess().getWSTerminalRuleCall_3());
		match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()));
		match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()));
		match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()), new TokenAlias(false, false, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0()));
		match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1()), new TokenAlias(false, false, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0()));
		match_EclConceptReference_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getEclConceptReferenceAccess().getWSTerminalRuleCall_1());
		match_HistoryProfile_DASHTerminalRuleCall_0_0_or_UNDERSCORETerminalRuleCall_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0()), new TokenAlias(false, false, grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1()));
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
		else if (ruleCall.getRule() == grammarAccess.getCONJUNCTION_KEYWORDRule())
			return getCONJUNCTION_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCURLY_CLOSERule())
			return getCURLY_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getCURLY_OPENRule())
			return getCURLY_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDASHRule())
			return getDASHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_EM_GTRule())
			return getDBL_EM_GTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_EM_LTRule())
			return getDBL_EM_LTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_GTRule())
			return getDBL_GTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_GT_EMRule())
			return getDBL_GT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_LTRule())
			return getDBL_LTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDBL_LT_EMRule())
			return getDBL_LT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFINITION_STATUS_ID_KEYWORDRule())
			return getDEFINITION_STATUS_ID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDEFINITION_STATUS_TOKEN_KEYWORDRule())
			return getDEFINITION_STATUS_TOKEN_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDIALECTID_KEYWORDRule())
			return getDIALECTID_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDIALECT_KEYWORDRule())
			return getDIALECT_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDISJUNCTION_KEYWORDRule())
			return getDISJUNCTION_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOTRule())
			return getDOTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOUBLE_CURLY_CLOSERule())
			return getDOUBLE_CURLY_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getDOUBLE_CURLY_OPENRule())
			return getDOUBLE_CURLY_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEFFECTIVE_TIME_KEYWORDRule())
			return getEFFECTIVE_TIME_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEQUALRule())
			return getEQUALToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getEXCLUSION_KEYWORDRule())
			return getEXCLUSION_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getGTRule())
			return getGTToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getGT_EMRule())
			return getGT_EMToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHASHRule())
			return getHASHToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getHISTORY_KEYWORDRule())
			return getHISTORY_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getID_KEYWORDRule())
			return getID_KEYWORDToken(semanticObject, ruleCall, node);
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
		else if (ruleCall.getRule() == grammarAccess.getPLUSRule())
			return getPLUSToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getPREFERRED_IN_KEYWORDRule())
			return getPREFERRED_IN_KEYWORDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getREVERSEDRule())
			return getREVERSEDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getROUND_CLOSERule())
			return getROUND_CLOSEToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getROUND_OPENRule())
			return getROUND_OPENToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getSEMANTIC_TAG_KEYWORDRule())
			return getSEMANTIC_TAG_KEYWORDToken(semanticObject, ruleCall, node);
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
		else if (ruleCall.getRule() == grammarAccess.getUNDERSCORERule())
			return getUNDERSCOREToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWILDCARDRule())
			return getWILDCARDToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ACCEPTABLE_IN_KEYWORD: 
	 * 	'acceptableIn' | ('A'|'a')('C'|'c')('C'|'c')('E'|'e')('P'|'p')('T'|'t')('A'|'a')('B'|'b')('L'|'l')('E'|'e')('I'|'i')('N'|'n');
	 */
	protected String getACCEPTABLE_IN_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "acceptableIn";
	}
	
	/**
	 * terminal ACTIVE_KEYWORD: 
	 * 	'active' | ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('E'|'e');
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
	 * terminal CASE_SIGNIFICANCE_ID_KEYWORD: 
	 * 	'caseSignificanceId' | ('C'|'c')('A'|'a')('S'|'s')('E'|'e')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('N'|'n')('C'|'c')('E'|'e')('I'|'i')('D'|'d');
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
	 * terminal CONJUNCTION_KEYWORD: 
	 * 	'AND' | ('A'|'a')('N'|'n')('D'|'d');
	 */
	protected String getCONJUNCTION_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "AND";
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
	 * terminal DASH:
	 * 	'-';
	 */
	protected String getDASHToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * terminal DBL_EM_GT:
	 * 	'!!>';
	 */
	protected String getDBL_EM_GTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!!>";
	}
	
	/**
	 * terminal DBL_EM_LT:
	 * 	'!!<';
	 */
	protected String getDBL_EM_LTToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "!!<";
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
	 * terminal DEFINITION_STATUS_ID_KEYWORD:
	 * 	'definitionStatusId'| ('d'|'D')('e'|'E')('f'|'F')('i'|'I')('n'|'N')('i'|'I')('t'|'T')('i'|'I')('o'|'O')('n'|'N')('s'|'S')('t'|'T')('a'|'A')('t'|'T')('u'|'U')('s'|'S')('i'|'I')('d'|'D');
	 */
	protected String getDEFINITION_STATUS_ID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "definitionStatusId";
	}
	
	/**
	 * terminal DEFINITION_STATUS_TOKEN_KEYWORD:
	 * 	'definitionStatus'| ('d'|'D')('e'|'E')('f'|'F')('i'|'I')('n'|'N')('i'|'I')('t'|'T')('i'|'I')('o'|'O')('n'|'N')('s'|'S')('t'|'T')('a'|'A')('t'|'T')('u'|'U')('s'|'S');
	 */
	protected String getDEFINITION_STATUS_TOKEN_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "definitionStatus";
	}
	
	/**
	 * terminal DIALECTID_KEYWORD: 
	 * 	'dialectId' | ('D'|'d')('I'|'i')('A'|'a')('L'|'l')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('D'|'d');
	 */
	protected String getDIALECTID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dialectId";
	}
	
	/**
	 * terminal DIALECT_KEYWORD: 
	 * 	'dialect' | ('D'|'d')('I'|'i')('A'|'a')('L'|'l')('E'|'e')('C'|'c')('T'|'t');
	 */
	protected String getDIALECT_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "dialect";
	}
	
	/**
	 * terminal DISJUNCTION_KEYWORD: 
	 * 	'OR' | ('O'|'o')('R'|'r');
	 */
	protected String getDISJUNCTION_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "OR";
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
	 * terminal EFFECTIVE_TIME_KEYWORD: 
	 * 	'effectiveTime' | ('E'|'e')('F'|'f')('F'|'f')('E'|'e')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('E'|'e')('T'|'t')('I'|'i')('M'|'m')('E'|'e');
	 */
	protected String getEFFECTIVE_TIME_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "effectiveTime";
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
	 * terminal EXCLUSION_KEYWORD:
	 * 	'MINUS' | ('M'|'m')('I'|'i')('N'|'n')('U'|'u')('S'|'s');
	 */
	protected String getEXCLUSION_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "MINUS";
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
	 * terminal HISTORY_KEYWORD:
	 * 	'HISTORY' | ('h'|'H')('i'|'I')('s'|'S')('t'|'T')('o'|'O')('r'|'R')('y'|'Y');
	 */
	protected String getHISTORY_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "HISTORY";
	}
	
	/**
	 * terminal ID_KEYWORD:
	 * 	'ID' | ('I'|'i')('D'|'d');
	 */
	protected String getID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "ID";
	}
	
	/**
	 * terminal LANGUAGE_KEYWORD: 
	 * 	'language' | ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('U'|'u')('A'|'a')('G'|'g')('E'|'e');
	 */
	protected String getLANGUAGE_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "language";
	}
	
	/**
	 * terminal LANGUAGE_REFSET_ID_KEYWORD: 
	 * 	'languageRefsetId' | ('L'|'l')('A'|'a')('N'|'n')('G'|'g')('U'|'u')('A'|'a')('G'|'g')('E'|'e')('R'|'r')('E'|'e')('F'|'f')('S'|'s')('E'|'e')('T'|'t')('I'|'i')('D'|'d');
	 */
	protected String getLANGUAGE_REFSET_ID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "languageRefsetId";
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
	 * terminal MODULEID_KEYWORD: 
	 * 	'moduleId' | ('M'|'m')('O'|'o')('D'|'d')('U'|'u')('L'|'l')('E'|'e')('I'|'i')('D'|'d');
	 */
	protected String getMODULEID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "moduleId";
	}
	
	/**
	 * terminal PLUS:
	 * 	'+';
	 */
	protected String getPLUSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	/**
	 * terminal PREFERRED_IN_KEYWORD: 
	 * 	'preferredIn' | ('P'|'p')('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('R'|'r')('E'|'e')('D'|'d')('I'|'i')('N'|'n');
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
	 * terminal SEMANTIC_TAG_KEYWORD: 
	 * 	'semanticTag' | ('S'|'s')('E'|'e')('M'|'m')('A'|'a')('N'|'n')('T'|'t')('I'|'i')('C'|'c')('T'|'t')('A'|'a')('G'|'g');
	 */
	protected String getSEMANTIC_TAG_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "semanticTag";
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
	 * terminal TERM_KEYWORD: 
	 * 	'term' | ('T'|'t')('E'|'e')('R'|'r')('M'|'m');
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
	 * terminal TYPEID_KEYWORD:
	 * 	'typeId' | ('T'|'t')('Y'|'y')('P'|'p')('E'|'e')('I'|'i')('D'|'d');
	 */
	protected String getTYPEID_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "typeId";
	}
	
	/**
	 * terminal TYPE_KEYWORD:
	 * 	'type' | ('T'|'t')('Y'|'y')('P'|'p')('E'|'e');
	 */
	protected String getTYPE_KEYWORDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "type";
	}
	
	/**
	 * terminal UNDERSCORE:
	 * 	'_';
	 */
	protected String getUNDERSCOREToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "_";
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
	
	/**
	 * terminal WS:
	 * 	(' ' | '\t' | '\n' | '\r');
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_AlternateIdentifier_WSTerminalRuleCall_3_a.equals(syntax))
				emit_AlternateIdentifier_WSTerminalRuleCall_3_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0.equals(syntax))
				emit_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0.equals(syntax))
				emit_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0.equals(syntax))
				emit_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0.equals(syntax))
				emit_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_EclConceptReference_WSTerminalRuleCall_1_a.equals(syntax))
				emit_EclConceptReference_WSTerminalRuleCall_1_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_HistoryProfile_DASHTerminalRuleCall_0_0_or_UNDERSCORETerminalRuleCall_0_1.equals(syntax))
				emit_HistoryProfile_DASHTerminalRuleCall_0_0_or_UNDERSCORETerminalRuleCall_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     WS*
	 *
	 * This ambiguous syntax occurs at:
	 *     code=AlternateCode (ambiguity) (rule end)
	 *     code=STRING (ambiguity) (rule end)
	 
	 * </pre>
	 */
	protected void emit_AlternateIdentifier_WSTerminalRuleCall_3_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     CONJUNCTION_KEYWORD | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndRefinement.left=} (ambiguity) right=SubAttributeSet
	 
	 * </pre>
	 */
	protected void emit_AndAttributeSet_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     CONJUNCTION_KEYWORD | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndExpressionConstraint.left=} (ambiguity) right=ExclusionExpressionConstraint
	 
	 * </pre>
	 */
	protected void emit_AndExpressionConstraint_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     CONJUNCTION_KEYWORD | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {AndRefinement.left=} (ambiguity) right=SubRefinement
	 
	 * </pre>
	 */
	protected void emit_AndRefinement_COMMATerminalRuleCall_1_0_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     CONJUNCTION_KEYWORD | COMMA
	 *
	 * This ambiguous syntax occurs at:
	 *     {ConjunctionFilter.left=} (ambiguity) right=PropertyFilter
	 
	 * </pre>
	 */
	protected void emit_ConjunctionFilter_COMMATerminalRuleCall_1_1_1_or_CONJUNCTION_KEYWORDTerminalRuleCall_1_1_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     WS*
	 *
	 * This ambiguous syntax occurs at:
	 *     id=Identifier (ambiguity) (rule end)
	 *     id=Identifier (ambiguity) term=PIPE_DELIMITED_STRING
	 
	 * </pre>
	 */
	protected void emit_EclConceptReference_WSTerminalRuleCall_1_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * <pre>
	 * Ambiguous syntax:
	 *     DASH | UNDERSCORE
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) profile=HISTORY_PROFILE_TYPE
	 
	 * </pre>
	 */
	protected void emit_HistoryProfile_DASHTerminalRuleCall_0_0_or_UNDERSCORETerminalRuleCall_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
