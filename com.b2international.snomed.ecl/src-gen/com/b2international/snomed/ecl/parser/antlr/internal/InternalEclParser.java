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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEclParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DISJUNCTION_KEYWORD", "RULE_CONJUNCTION_KEYWORD", "RULE_COMMA", "RULE_EXCLUSION_KEYWORD", "RULE_COLON", "RULE_DOT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_LT", "RULE_DBL_LT", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GT", "RULE_DBL_GT", "RULE_CARET", "RULE_SQUARE_OPEN", "RULE_WILDCARD", "RULE_SQUARE_CLOSE", "RULE_PIPE_DELIMITED_STRING", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_REVERSED", "RULE_TO", "RULE_HASH", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_TERM_KEYWORD", "RULE_STRING", "RULE_REGEX_KEYWORD", "RULE_LANGUAGE_KEYWORD", "RULE_TYPEID_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_DIALECTID_KEYWORD", "RULE_DIALECT_KEYWORD", "RULE_WS", "RULE_DEFINITION_STATUS_ID_KEYWORD", "RULE_DEFINITION_STATUS_TOKEN_KEYWORD", "RULE_MODULEID_KEYWORD", "RULE_EQUAL", "RULE_EFFECTIVE_TIME_KEYWORD", "RULE_ACTIVE_KEYWORD", "RULE_SEMANTIC_TAG_KEYWORD", "RULE_PREFERRED_IN_KEYWORD", "RULE_ACCEPTABLE_IN_KEYWORD", "RULE_LANGUAGE_REFSET_ID_KEYWORD", "RULE_CASE_SIGNIFICANCE_ID_KEYWORD", "RULE_PLUS", "RULE_HISTORY_KEYWORD", "RULE_DASH", "RULE_UNDERSCORE", "RULE_DIGIT_NONZERO", "RULE_DIGIT_ZERO", "RULE_TRUE_KEYWORD", "RULE_FALSE_KEYWORD", "RULE_EXACT_KEYWORD", "RULE_MATCH_KEYWORD", "RULE_WILD_KEYWORD", "RULE_MIN_KEYWORD", "RULE_MOD_KEYWORD", "RULE_MAX_KEYWORD", "RULE_MEMBER_SHORT_KEYWORD", "RULE_DESCRIPTION_SHORT_KEYWORD", "RULE_CONCEPT_SHORT_KEYWORD", "RULE_KEYWORD", "RULE_NOT_EQUAL", "RULE_GTE", "RULE_LTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT"
    };
    public static final int RULE_DIALECT_KEYWORD=39;
    public static final int RULE_LANGUAGE_KEYWORD=35;
    public static final int RULE_CURLY_OPEN=25;
    public static final int RULE_DIGIT_NONZERO=56;
    public static final int RULE_DBL_GT=17;
    public static final int RULE_ROUND_CLOSE=24;
    public static final int RULE_TO=28;
    public static final int RULE_GT=16;
    public static final int RULE_ACTIVE_KEYWORD=46;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=68;
    public static final int RULE_MODULEID_KEYWORD=43;
    public static final int RULE_GTE=71;
    public static final int RULE_DISJUNCTION_KEYWORD=4;
    public static final int RULE_ROUND_OPEN=23;
    public static final int RULE_UNDERSCORE=55;
    public static final int RULE_DBL_LT=13;
    public static final int RULE_TYPEID_KEYWORD=36;
    public static final int RULE_MATCH_KEYWORD=61;
    public static final int RULE_NOT_EQUAL=70;
    public static final int RULE_SQUARE_CLOSE=21;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=47;
    public static final int RULE_SQUARE_OPEN=19;
    public static final int RULE_EQUAL=44;
    public static final int RULE_COMMA=6;
    public static final int RULE_EXCLUSION_KEYWORD=7;
    public static final int RULE_LT_EM=10;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=51;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=67;
    public static final int RULE_CURLY_CLOSE=26;
    public static final int RULE_DBL_GT_EM=15;
    public static final int RULE_COLON=8;
    public static final int RULE_HISTORY_KEYWORD=53;
    public static final int RULE_MOD_KEYWORD=64;
    public static final int RULE_LT=12;
    public static final int RULE_DOUBLE_CURLY_CLOSE=31;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=50;
    public static final int RULE_EXACT_KEYWORD=60;
    public static final int RULE_ML_COMMENT=73;
    public static final int RULE_PIPE_DELIMITED_STRING=22;
    public static final int RULE_PREFERRED_IN_KEYWORD=48;
    public static final int RULE_LTE=72;
    public static final int RULE_TYPE_KEYWORD=37;
    public static final int RULE_STRING=33;
    public static final int RULE_FALSE_KEYWORD=59;
    public static final int RULE_REVERSED=27;
    public static final int RULE_SL_COMMENT=74;
    public static final int RULE_DIGIT_ZERO=57;
    public static final int RULE_HASH=29;
    public static final int RULE_DASH=54;
    public static final int RULE_PLUS=52;
    public static final int RULE_DOT=9;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=38;
    public static final int RULE_KEYWORD=69;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=41;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=42;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=49;
    public static final int RULE_GT_EM=14;
    public static final int RULE_TERM_KEYWORD=32;
    public static final int RULE_WS=40;
    public static final int RULE_MAX_KEYWORD=65;
    public static final int RULE_MEMBER_SHORT_KEYWORD=66;
    public static final int RULE_REGEX_KEYWORD=34;
    public static final int RULE_TRUE_KEYWORD=58;
    public static final int RULE_CARET=18;
    public static final int RULE_DOUBLE_CURLY_OPEN=30;
    public static final int RULE_CONJUNCTION_KEYWORD=5;
    public static final int RULE_WILD_KEYWORD=62;
    public static final int RULE_MIN_KEYWORD=63;
    public static final int RULE_WILDCARD=20;
    public static final int RULE_EFFECTIVE_TIME_KEYWORD=45;
    public static final int RULE_DBL_LT_EM=11;

    // delegates
    // delegators


        public InternalEclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEcl.g"; }



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




    // $ANTLR start "entryRuleScript"
    // InternalEcl.g:82:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalEcl.g:82:47: (iv_ruleScript= ruleScript EOF )
            // InternalEcl.g:83:2: iv_ruleScript= ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getScriptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleScript=ruleScript();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleScript; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalEcl.g:89:1: ruleScript returns [EObject current=null] : ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:95:2: ( ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? ) )
            // InternalEcl.g:96:2: ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? )
            {
            // InternalEcl.g:96:2: ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? )
            // InternalEcl.g:97:3: () ( (lv_constraint_1_0= ruleExpressionConstraint ) )?
            {
            // InternalEcl.g:97:3: ()
            // InternalEcl.g:98:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getScriptAccess().getScriptAction_0(),
              					current);
              			
            }

            }

            // InternalEcl.g:107:3: ( (lv_constraint_1_0= ruleExpressionConstraint ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_LT_EM && LA1_0<=RULE_CARET)||LA1_0==RULE_WILDCARD||LA1_0==RULE_ROUND_OPEN||(LA1_0>=RULE_DIGIT_NONZERO && LA1_0<=RULE_DIGIT_ZERO)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEcl.g:108:4: (lv_constraint_1_0= ruleExpressionConstraint )
                    {
                    // InternalEcl.g:108:4: (lv_constraint_1_0= ruleExpressionConstraint )
                    // InternalEcl.g:109:5: lv_constraint_1_0= ruleExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_0=ruleExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getScriptRule());
                      					}
                      					set(
                      						current,
                      						"constraint",
                      						lv_constraint_1_0,
                      						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalEcl.g:130:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // InternalEcl.g:130:61: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // InternalEcl.g:131:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExpressionConstraint=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalEcl.g:137:1: ruleExpressionConstraint returns [EObject current=null] : this_OrExpressionConstraint_0= ruleOrExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpressionConstraint_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:143:2: (this_OrExpressionConstraint_0= ruleOrExpressionConstraint )
            // InternalEcl.g:144:2: this_OrExpressionConstraint_0= ruleOrExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrExpressionConstraint_0=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrExpressionConstraint_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleOrExpressionConstraint"
    // InternalEcl.g:158:1: entryRuleOrExpressionConstraint returns [EObject current=null] : iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF ;
    public final EObject entryRuleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionConstraint = null;


        try {
            // InternalEcl.g:158:63: (iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF )
            // InternalEcl.g:159:2: iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrExpressionConstraint=ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrExpressionConstraint"


    // $ANTLR start "ruleOrExpressionConstraint"
    // InternalEcl.g:165:1: ruleOrExpressionConstraint returns [EObject current=null] : (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) ;
    public final EObject ruleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:171:2: ( (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) )
            // InternalEcl.g:172:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            {
            // InternalEcl.g:172:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            // InternalEcl.g:173:3: this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndExpressionConstraint_0=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:184:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEcl.g:185:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    {
            	    // InternalEcl.g:185:4: ()
            	    // InternalEcl.g:186:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:199:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    // InternalEcl.g:200:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    {
            	    // InternalEcl.g:200:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    // InternalEcl.g:201:6: lv_right_3_0= ruleAndExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrExpressionConstraint"


    // $ANTLR start "entryRuleAndExpressionConstraint"
    // InternalEcl.g:223:1: entryRuleAndExpressionConstraint returns [EObject current=null] : iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF ;
    public final EObject entryRuleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionConstraint = null;


        try {
            // InternalEcl.g:223:64: (iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF )
            // InternalEcl.g:224:2: iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndExpressionConstraint=ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndExpressionConstraint"


    // $ANTLR start "ruleAndExpressionConstraint"
    // InternalEcl.g:230:1: ruleAndExpressionConstraint returns [EObject current=null] : (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) ;
    public final EObject ruleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_ExclusionExpressionConstraint_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:236:2: ( (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) )
            // InternalEcl.g:237:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            {
            // InternalEcl.g:237:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            // InternalEcl.g:238:3: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ExclusionExpressionConstraint_0=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExclusionExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:249:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_CONJUNCTION_KEYWORD && LA4_0<=RULE_COMMA)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEcl.g:250:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    {
            	    // InternalEcl.g:250:4: ()
            	    // InternalEcl.g:251:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEcl.g:260:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_COMMA) ) {
            	        alt3=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalEcl.g:261:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:266:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:271:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    // InternalEcl.g:272:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    {
            	    // InternalEcl.g:272:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    // InternalEcl.g:273:6: lv_right_4_0= ruleExclusionExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleExclusionExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.ExclusionExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalEcl.g:295:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // InternalEcl.g:295:70: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // InternalEcl.g:296:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionExpressionConstraint=ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalEcl.g:302:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_EXCLUSION_KEYWORD_2=null;
        EObject this_RefinedExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:308:2: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) )
            // InternalEcl.g:309:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            {
            // InternalEcl.g:309:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            // InternalEcl.g:310:3: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_RefinedExpressionConstraint_0=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_RefinedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:321:3: ( () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_EXCLUSION_KEYWORD) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEcl.g:322:4: () this_EXCLUSION_KEYWORD_2= RULE_EXCLUSION_KEYWORD ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    {
                    // InternalEcl.g:322:4: ()
                    // InternalEcl.g:323:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_EXCLUSION_KEYWORD_2=(Token)match(input,RULE_EXCLUSION_KEYWORD,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_EXCLUSION_KEYWORD_2, grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSION_KEYWORDTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEcl.g:336:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    // InternalEcl.g:337:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    {
                    // InternalEcl.g:337:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    // InternalEcl.g:338:6: lv_right_3_0= ruleRefinedExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=ruleRefinedExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExclusionExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ecl.Ecl.RefinedExpressionConstraint");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalEcl.g:360:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // InternalEcl.g:360:68: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // InternalEcl.g:361:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRefinedExpressionConstraint=ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRefinedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalEcl.g:367:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject this_DottedExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:373:2: ( (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) )
            // InternalEcl.g:374:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            {
            // InternalEcl.g:374:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            // InternalEcl.g:375:3: this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_7);
            this_DottedExpressionConstraint_0=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_DottedExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:386:3: ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEcl.g:387:4: () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) )
                    {
                    // InternalEcl.g:387:4: ()
                    // InternalEcl.g:388:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0(),
                      						current);
                      				
                    }

                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_2, grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEcl.g:401:4: ( (lv_refinement_3_0= ruleEclRefinement ) )
                    // InternalEcl.g:402:5: (lv_refinement_3_0= ruleEclRefinement )
                    {
                    // InternalEcl.g:402:5: (lv_refinement_3_0= ruleEclRefinement )
                    // InternalEcl.g:403:6: lv_refinement_3_0= ruleEclRefinement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_refinement_3_0=ruleEclRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getRefinedExpressionConstraintRule());
                      						}
                      						set(
                      							current,
                      							"refinement",
                      							lv_refinement_3_0,
                      							"com.b2international.snomed.ecl.Ecl.EclRefinement");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleDottedExpressionConstraint"
    // InternalEcl.g:425:1: entryRuleDottedExpressionConstraint returns [EObject current=null] : iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF ;
    public final EObject entryRuleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpressionConstraint = null;


        try {
            // InternalEcl.g:425:67: (iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF )
            // InternalEcl.g:426:2: iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDottedExpressionConstraint=ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDottedExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDottedExpressionConstraint"


    // $ANTLR start "ruleDottedExpressionConstraint"
    // InternalEcl.g:432:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_FilteredExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:438:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) )
            // InternalEcl.g:439:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            {
            // InternalEcl.g:439:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            // InternalEcl.g:440:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FilteredExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:451:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEcl.g:452:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    {
            	    // InternalEcl.g:452:4: ()
            	    // InternalEcl.g:453:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DOT_2=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DOT_2, grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:466:4: ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    // InternalEcl.g:467:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    {
            	    // InternalEcl.g:467:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    // InternalEcl.g:468:6: lv_attribute_3_0= ruleFilteredExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attribute_3_0=ruleFilteredExpressionConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDottedExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"attribute",
            	      							lv_attribute_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDottedExpressionConstraint"


    // $ANTLR start "entryRuleFilteredExpressionConstraint"
    // InternalEcl.g:490:1: entryRuleFilteredExpressionConstraint returns [EObject current=null] : iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF ;
    public final EObject entryRuleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredExpressionConstraint = null;


        try {
            // InternalEcl.g:490:69: (iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF )
            // InternalEcl.g:491:2: iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilteredExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilteredExpressionConstraint=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilteredExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilteredExpressionConstraint"


    // $ANTLR start "ruleFilteredExpressionConstraint"
    // InternalEcl.g:497:1: ruleFilteredExpressionConstraint returns [EObject current=null] : (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) ;
    public final EObject ruleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SupplementExpressionConstraint_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:503:2: ( (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) )
            // InternalEcl.g:504:2: (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            {
            // InternalEcl.g:504:2: (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            // InternalEcl.g:505:3: this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getSupplementExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_SupplementExpressionConstraint_0=ruleSupplementExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SupplementExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:516:3: ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOUBLE_CURLY_OPEN) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEcl.g:517:4: () ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    {
            	    // InternalEcl.g:517:4: ()
            	    // InternalEcl.g:518:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getFilteredExpressionConstraintAccess().getFilteredExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEcl.g:527:4: ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    // InternalEcl.g:528:5: (lv_filter_2_0= ruleFilterConstraint )
            	    {
            	    // InternalEcl.g:528:5: (lv_filter_2_0= ruleFilterConstraint )
            	    // InternalEcl.g:529:6: lv_filter_2_0= ruleFilterConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getFilterFilterConstraintParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_filter_2_0=ruleFilterConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getFilteredExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"filter",
            	      							lv_filter_2_0,
            	      							"com.b2international.snomed.ecl.Ecl.FilterConstraint");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilteredExpressionConstraint"


    // $ANTLR start "entryRuleSupplementExpressionConstraint"
    // InternalEcl.g:551:1: entryRuleSupplementExpressionConstraint returns [EObject current=null] : iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF ;
    public final EObject entryRuleSupplementExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplementExpressionConstraint = null;


        try {
            // InternalEcl.g:551:71: (iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF )
            // InternalEcl.g:552:2: iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSupplementExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSupplementExpressionConstraint=ruleSupplementExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSupplementExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupplementExpressionConstraint"


    // $ANTLR start "ruleSupplementExpressionConstraint"
    // InternalEcl.g:558:1: ruleSupplementExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )* ) ;
    public final EObject ruleSupplementExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_supplement_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:564:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )* ) )
            // InternalEcl.g:565:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )* )
            {
            // InternalEcl.g:565:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )* )
            // InternalEcl.g:566:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_SubExpressionConstraint_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:577:3: ( () ( (lv_supplement_2_0= ruleSupplement ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOUBLE_CURLY_OPEN) ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1==RULE_PLUS) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalEcl.g:578:4: () ( (lv_supplement_2_0= ruleSupplement ) )
            	    {
            	    // InternalEcl.g:578:4: ()
            	    // InternalEcl.g:579:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getSupplementExpressionConstraintAccess().getSupplementExpressionConstraintConstraintAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEcl.g:588:4: ( (lv_supplement_2_0= ruleSupplement ) )
            	    // InternalEcl.g:589:5: (lv_supplement_2_0= ruleSupplement )
            	    {
            	    // InternalEcl.g:589:5: (lv_supplement_2_0= ruleSupplement )
            	    // InternalEcl.g:590:6: lv_supplement_2_0= ruleSupplement
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_10);
            	    lv_supplement_2_0=ruleSupplement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getSupplementExpressionConstraintRule());
            	      						}
            	      						set(
            	      							current,
            	      							"supplement",
            	      							lv_supplement_2_0,
            	      							"com.b2international.snomed.ecl.Ecl.Supplement");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupplementExpressionConstraint"


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalEcl.g:612:1: entryRuleSubExpressionConstraint returns [EObject current=null] : iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF ;
    public final EObject entryRuleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpressionConstraint = null;


        try {
            // InternalEcl.g:612:64: (iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF )
            // InternalEcl.g:613:2: iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubExpressionConstraint=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubExpressionConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubExpressionConstraint"


    // $ANTLR start "ruleSubExpressionConstraint"
    // InternalEcl.g:619:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) ;
    public final EObject ruleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_ChildOf_0 = null;

        EObject this_ChildOrSelfOf_1 = null;

        EObject this_DescendantOf_2 = null;

        EObject this_DescendantOrSelfOf_3 = null;

        EObject this_ParentOf_4 = null;

        EObject this_ParentOrSelfOf_5 = null;

        EObject this_AncestorOf_6 = null;

        EObject this_AncestorOrSelfOf_7 = null;

        EObject this_EclFocusConcept_8 = null;



        	enterRule();

        try {
            // InternalEcl.g:625:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) )
            // InternalEcl.g:626:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            {
            // InternalEcl.g:626:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            int alt10=9;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt10=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt10=2;
                }
                break;
            case RULE_LT:
                {
                alt10=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt10=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt10=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt10=6;
                }
                break;
            case RULE_GT:
                {
                alt10=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt10=8;
                }
                break;
            case RULE_CARET:
            case RULE_WILDCARD:
            case RULE_ROUND_OPEN:
            case RULE_DIGIT_NONZERO:
            case RULE_DIGIT_ZERO:
                {
                alt10=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalEcl.g:627:3: this_ChildOf_0= ruleChildOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOf_0=ruleChildOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:639:3: this_ChildOrSelfOf_1= ruleChildOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ChildOrSelfOf_1=ruleChildOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ChildOrSelfOf_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:651:3: this_DescendantOf_2= ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOf_2=ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOf_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:663:3: this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DescendantOrSelfOf_3=ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DescendantOrSelfOf_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:675:3: this_ParentOf_4= ruleParentOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOf_4=ruleParentOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOf_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:687:3: this_ParentOrSelfOf_5= ruleParentOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ParentOrSelfOf_5=ruleParentOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ParentOrSelfOf_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:699:3: this_AncestorOf_6= ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOf_6=ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOf_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEcl.g:711:3: this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AncestorOrSelfOf_7=ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AncestorOrSelfOf_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEcl.g:723:3: this_EclFocusConcept_8= ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclFocusConcept_8=ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclFocusConcept_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubExpressionConstraint"


    // $ANTLR start "entryRuleEclFocusConcept"
    // InternalEcl.g:738:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalEcl.g:738:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalEcl.g:739:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclFocusConcept=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclFocusConcept; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclFocusConcept"


    // $ANTLR start "ruleEclFocusConcept"
    // InternalEcl.g:745:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_EclConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:751:2: ( (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // InternalEcl.g:752:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // InternalEcl.g:752:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt11=1;
                }
                break;
            case RULE_DIGIT_NONZERO:
            case RULE_DIGIT_ZERO:
                {
                alt11=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt11=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt11=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalEcl.g:753:3: this_MemberOf_0= ruleMemberOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MemberOf_0=ruleMemberOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MemberOf_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:765:3: this_EclConceptReference_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReference_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:777:3: this_Any_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Any_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Any_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:789:3: this_NestedExpression_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpression_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclFocusConcept"


    // $ANTLR start "entryRuleChildOf"
    // InternalEcl.g:804:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalEcl.g:804:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalEcl.g:805:2: iv_ruleChildOf= ruleChildOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOf=ruleChildOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChildOf"


    // $ANTLR start "ruleChildOf"
    // InternalEcl.g:811:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:817:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:818:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:818:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:819:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:823:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:824:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:824:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:825:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChildOf"


    // $ANTLR start "entryRuleChildOrSelfOf"
    // InternalEcl.g:846:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalEcl.g:846:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalEcl.g:847:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getChildOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleChildOrSelfOf=ruleChildOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleChildOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleChildOrSelfOf"


    // $ANTLR start "ruleChildOrSelfOf"
    // InternalEcl.g:853:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:859:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:860:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:860:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:861:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:865:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:866:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:866:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:867:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getChildOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleChildOrSelfOf"


    // $ANTLR start "entryRuleDescendantOf"
    // InternalEcl.g:888:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalEcl.g:888:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalEcl.g:889:2: iv_ruleDescendantOf= ruleDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOf=ruleDescendantOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescendantOf"


    // $ANTLR start "ruleDescendantOf"
    // InternalEcl.g:895:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:901:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:902:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:902:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:903:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:907:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:908:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:908:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:909:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescendantOf"


    // $ANTLR start "entryRuleDescendantOrSelfOf"
    // InternalEcl.g:930:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalEcl.g:930:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalEcl.g:931:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDescendantOrSelfOf=ruleDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescendantOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescendantOrSelfOf"


    // $ANTLR start "ruleDescendantOrSelfOf"
    // InternalEcl.g:937:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:943:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:944:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:944:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:945:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:949:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:950:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:950:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:951:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDescendantOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescendantOrSelfOf"


    // $ANTLR start "entryRuleParentOf"
    // InternalEcl.g:972:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalEcl.g:972:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalEcl.g:973:2: iv_ruleParentOf= ruleParentOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOf=ruleParentOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentOf"


    // $ANTLR start "ruleParentOf"
    // InternalEcl.g:979:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:985:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:986:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:986:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:987:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:991:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:992:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:992:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:993:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParentOf"


    // $ANTLR start "entryRuleParentOrSelfOf"
    // InternalEcl.g:1014:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalEcl.g:1014:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalEcl.g:1015:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getParentOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleParentOrSelfOf=ruleParentOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleParentOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleParentOrSelfOf"


    // $ANTLR start "ruleParentOrSelfOf"
    // InternalEcl.g:1021:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1027:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1028:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1028:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1029:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1033:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1034:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1034:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1035:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getParentOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleParentOrSelfOf"


    // $ANTLR start "entryRuleAncestorOf"
    // InternalEcl.g:1056:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalEcl.g:1056:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalEcl.g:1057:2: iv_ruleAncestorOf= ruleAncestorOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOf=ruleAncestorOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAncestorOf"


    // $ANTLR start "ruleAncestorOf"
    // InternalEcl.g:1063:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1069:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1070:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1070:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1071:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1075:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1076:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1076:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1077:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAncestorOf"


    // $ANTLR start "entryRuleAncestorOrSelfOf"
    // InternalEcl.g:1098:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalEcl.g:1098:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalEcl.g:1099:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAncestorOrSelfOf=ruleAncestorOrSelfOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAncestorOrSelfOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAncestorOrSelfOf"


    // $ANTLR start "ruleAncestorOrSelfOf"
    // InternalEcl.g:1105:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1111:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1112:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1112:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1113:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1117:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1118:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1118:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1119:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAncestorOrSelfOfRule());
              					}
              					set(
              						current,
              						"constraint",
              						lv_constraint_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclFocusConcept");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAncestorOrSelfOf"


    // $ANTLR start "entryRuleMemberOf"
    // InternalEcl.g:1140:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalEcl.g:1140:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalEcl.g:1141:2: iv_ruleMemberOf= ruleMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMemberOf=ruleMemberOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberOf; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberOf"


    // $ANTLR start "ruleMemberOf"
    // InternalEcl.g:1147:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        Token this_SQUARE_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_WILDCARD_5=null;
        Token this_SQUARE_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_refsetFields_2_0 = null;

        AntlrDatatypeRuleToken lv_refsetFields_4_0 = null;

        EObject lv_constraint_7_1 = null;

        EObject lv_constraint_7_2 = null;

        EObject lv_constraint_7_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:1153:2: ( (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) ) ) )
            // InternalEcl.g:1154:2: (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) ) )
            {
            // InternalEcl.g:1154:2: (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) ) )
            // InternalEcl.g:1155:3: this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1159:3: (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SQUARE_OPEN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEcl.g:1160:4: this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD ) this_SQUARE_CLOSE_6= RULE_SQUARE_CLOSE
                    {
                    this_SQUARE_OPEN_1=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQUARE_OPEN_1, grammarAccess.getMemberOfAccess().getSQUARE_OPENTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEcl.g:1164:4: ( ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) | this_WILDCARD_5= RULE_WILDCARD )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( ((LA13_0>=RULE_DISJUNCTION_KEYWORD && LA13_0<=RULE_CONJUNCTION_KEYWORD)||LA13_0==RULE_EXCLUSION_KEYWORD||LA13_0==RULE_REVERSED||LA13_0==RULE_TERM_KEYWORD||(LA13_0>=RULE_REGEX_KEYWORD && LA13_0<=RULE_DIALECT_KEYWORD)||(LA13_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA13_0<=RULE_MODULEID_KEYWORD)||(LA13_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA13_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA13_0==RULE_HISTORY_KEYWORD||(LA13_0>=RULE_TRUE_KEYWORD && LA13_0<=RULE_KEYWORD)) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==RULE_WILDCARD) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalEcl.g:1165:5: ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* )
                            {
                            // InternalEcl.g:1165:5: ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* )
                            // InternalEcl.g:1166:6: ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )*
                            {
                            // InternalEcl.g:1166:6: ( (lv_refsetFields_2_0= ruleUnquotedString ) )
                            // InternalEcl.g:1167:7: (lv_refsetFields_2_0= ruleUnquotedString )
                            {
                            // InternalEcl.g:1167:7: (lv_refsetFields_2_0= ruleUnquotedString )
                            // InternalEcl.g:1168:8: lv_refsetFields_2_0= ruleUnquotedString
                            {
                            if ( state.backtracking==0 ) {

                              								newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0_0());
                              							
                            }
                            pushFollow(FollowSets000.FOLLOW_13);
                            lv_refsetFields_2_0=ruleUnquotedString();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              								if (current==null) {
                              									current = createModelElementForParent(grammarAccess.getMemberOfRule());
                              								}
                              								add(
                              									current,
                              									"refsetFields",
                              									lv_refsetFields_2_0,
                              									"com.b2international.snomed.ecl.Ecl.UnquotedString");
                              								afterParserOrEnumRuleCall();
                              							
                            }

                            }


                            }

                            // InternalEcl.g:1185:6: (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )*
                            loop12:
                            do {
                                int alt12=2;
                                int LA12_0 = input.LA(1);

                                if ( (LA12_0==RULE_COMMA) ) {
                                    alt12=1;
                                }


                                switch (alt12) {
                            	case 1 :
                            	    // InternalEcl.g:1186:7: this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) )
                            	    {
                            	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      							newLeafNode(this_COMMA_3, grammarAccess.getMemberOfAccess().getCOMMATerminalRuleCall_1_1_0_1_0());
                            	      						
                            	    }
                            	    // InternalEcl.g:1190:7: ( (lv_refsetFields_4_0= ruleUnquotedString ) )
                            	    // InternalEcl.g:1191:8: (lv_refsetFields_4_0= ruleUnquotedString )
                            	    {
                            	    // InternalEcl.g:1191:8: (lv_refsetFields_4_0= ruleUnquotedString )
                            	    // InternalEcl.g:1192:9: lv_refsetFields_4_0= ruleUnquotedString
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      									newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_1_1_0());
                            	      								
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_13);
                            	    lv_refsetFields_4_0=ruleUnquotedString();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      									if (current==null) {
                            	      										current = createModelElementForParent(grammarAccess.getMemberOfRule());
                            	      									}
                            	      									add(
                            	      										current,
                            	      										"refsetFields",
                            	      										lv_refsetFields_4_0,
                            	      										"com.b2international.snomed.ecl.Ecl.UnquotedString");
                            	      									afterParserOrEnumRuleCall();
                            	      								
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop12;
                                }
                            } while (true);


                            }


                            }
                            break;
                        case 2 :
                            // InternalEcl.g:1212:5: this_WILDCARD_5= RULE_WILDCARD
                            {
                            this_WILDCARD_5=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_15); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_WILDCARD_5, grammarAccess.getMemberOfAccess().getWILDCARDTerminalRuleCall_1_1_1());
                              				
                            }

                            }
                            break;

                    }

                    this_SQUARE_CLOSE_6=(Token)match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQUARE_CLOSE_6, grammarAccess.getMemberOfAccess().getSQUARE_CLOSETerminalRuleCall_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:1222:3: ( ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) ) )
            // InternalEcl.g:1223:4: ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) )
            {
            // InternalEcl.g:1223:4: ( (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression ) )
            // InternalEcl.g:1224:5: (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression )
            {
            // InternalEcl.g:1224:5: (lv_constraint_7_1= ruleEclConceptReference | lv_constraint_7_2= ruleAny | lv_constraint_7_3= ruleNestedExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_NONZERO:
            case RULE_DIGIT_ZERO:
                {
                alt15=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt15=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt15=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalEcl.g:1225:6: lv_constraint_7_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_7_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_7_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1241:6: lv_constraint_7_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_7_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_7_2,
                      							"com.b2international.snomed.ecl.Ecl.Any");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:1257:6: lv_constraint_7_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_2_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_7_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_7_3,
                      							"com.b2international.snomed.ecl.Ecl.NestedExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberOf"


    // $ANTLR start "entryRuleEclConceptReference"
    // InternalEcl.g:1279:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEcl.g:1279:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEcl.g:1280:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclConceptReference=ruleEclConceptReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclConceptReference; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclConceptReference"


    // $ANTLR start "ruleEclConceptReference"
    // InternalEcl.g:1286:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1292:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            // InternalEcl.g:1293:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            {
            // InternalEcl.g:1293:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            // InternalEcl.g:1294:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            {
            // InternalEcl.g:1294:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalEcl.g:1295:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalEcl.g:1295:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalEcl.g:1296:5: lv_id_0_0= ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_16);
            lv_id_0_0=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclConceptReferenceRule());
              					}
              					set(
              						current,
              						"id",
              						lv_id_0_0,
              						"com.b2international.snomed.ecl.Ecl.SnomedIdentifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:1313:3: ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_PIPE_DELIMITED_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEcl.g:1314:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    {
                    // InternalEcl.g:1314:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    // InternalEcl.g:1315:5: lv_term_1_0= RULE_PIPE_DELIMITED_STRING
                    {
                    lv_term_1_0=(Token)match(input,RULE_PIPE_DELIMITED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEclConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"com.b2international.snomed.ecl.Ecl.PIPE_DELIMITED_STRING");
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclConceptReference"


    // $ANTLR start "entryRuleEclConceptReferenceSet"
    // InternalEcl.g:1335:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEcl.g:1335:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEcl.g:1336:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclConceptReferenceSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclConceptReferenceSet=ruleEclConceptReferenceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclConceptReferenceSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclConceptReferenceSet"


    // $ANTLR start "ruleEclConceptReferenceSet"
    // InternalEcl.g:1342:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_concepts_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1348:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1349:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1349:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1350:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1354:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_DIGIT_NONZERO && LA17_0<=RULE_DIGIT_ZERO)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEcl.g:1355:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    {
            	    // InternalEcl.g:1355:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    // InternalEcl.g:1356:5: lv_concepts_1_0= ruleEclConceptReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_18);
            	    lv_concepts_1_0=ruleEclConceptReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEclConceptReferenceSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"concepts",
            	      						lv_concepts_1_0,
            	      						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclConceptReferenceSet"


    // $ANTLR start "entryRuleAny"
    // InternalEcl.g:1381:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEcl.g:1381:44: (iv_ruleAny= ruleAny EOF )
            // InternalEcl.g:1382:2: iv_ruleAny= ruleAny EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAnyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAny=ruleAny();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAny; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // InternalEcl.g:1388:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEcl.g:1394:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEcl.g:1395:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEcl.g:1395:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEcl.g:1396:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1400:3: ()
            // InternalEcl.g:1401:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getAnyAccess().getAnyAction_1(),
              					current);
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleEclRefinement"
    // InternalEcl.g:1414:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEcl.g:1414:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEcl.g:1415:2: iv_ruleEclRefinement= ruleEclRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclRefinement=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclRefinement"


    // $ANTLR start "ruleEclRefinement"
    // InternalEcl.g:1421:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1427:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEcl.g:1428:2: this_OrRefinement_0= ruleOrRefinement
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrRefinement_0=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrRefinement_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // InternalEcl.g:1442:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEcl.g:1442:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEcl.g:1443:2: iv_ruleOrRefinement= ruleOrRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrRefinement=ruleOrRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // InternalEcl.g:1449:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1455:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEcl.g:1456:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEcl.g:1456:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEcl.g:1457:3: this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndRefinement_0=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:1468:3: ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RULE_DISJUNCTION_KEYWORD) ) {
                    int LA18_4 = input.LA(2);

                    if ( (synpred28_InternalEcl()) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // InternalEcl.g:1469:4: ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEcl.g:1470:4: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEcl.g:1471:5: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEcl.g:1471:5: ()
            	    // InternalEcl.g:1472:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrRefinementAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_0_1());
            	      				
            	    }
            	    // InternalEcl.g:1485:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEcl.g:1486:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEcl.g:1486:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEcl.g:1487:7: lv_right_3_0= ruleAndRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getOrRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_3_0,
            	      								"com.b2international.snomed.ecl.Ecl.AndRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalEcl.g:1510:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEcl.g:1510:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEcl.g:1511:2: iv_ruleAndRefinement= ruleAndRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndRefinement=ruleAndRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // InternalEcl.g:1517:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1523:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEcl.g:1524:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEcl.g:1524:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEcl.g:1525:3: this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_SubRefinement_0=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubRefinement_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:1536:3: ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_CONJUNCTION_KEYWORD) ) {
                    int LA20_3 = input.LA(2);

                    if ( (synpred30_InternalEcl()) ) {
                        alt20=1;
                    }


                }
                else if ( (LA20_0==RULE_COMMA) ) {
                    int LA20_4 = input.LA(2);

                    if ( (synpred30_InternalEcl()) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // InternalEcl.g:1537:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEcl.g:1538:4: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEcl.g:1539:5: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEcl.g:1539:5: ()
            	    // InternalEcl.g:1540:6: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      						/* */
            	      					
            	    }
            	    if ( state.backtracking==0 ) {

            	      						current = forceCreateModelElementAndSet(
            	      							grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0(),
            	      							current);
            	      					
            	    }

            	    }

            	    // InternalEcl.g:1549:5: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==RULE_COMMA) ) {
            	        alt19=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // InternalEcl.g:1550:6: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:1555:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:1560:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEcl.g:1561:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEcl.g:1561:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEcl.g:1562:7: lv_right_4_0= ruleSubRefinement
            	    {
            	    if ( state.backtracking==0 ) {

            	      							newCompositeNode(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0());
            	      						
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleSubRefinement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      							if (current==null) {
            	      								current = createModelElementForParent(grammarAccess.getAndRefinementRule());
            	      							}
            	      							set(
            	      								current,
            	      								"right",
            	      								lv_right_4_0,
            	      								"com.b2international.snomed.ecl.Ecl.SubRefinement");
            	      							afterParserOrEnumRuleCall();
            	      						
            	    }

            	    }


            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEcl.g:1585:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEcl.g:1585:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEcl.g:1586:2: iv_ruleSubRefinement= ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubRefinement=ruleSubRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalEcl.g:1592:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:1598:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEcl.g:1599:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEcl.g:1599:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt21=3;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalEcl.g:1600:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1612:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclAttributeGroup_1=ruleEclAttributeGroup();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclAttributeGroup_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:1624:3: this_NestedRefinement_2= ruleNestedRefinement
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedRefinement_2=ruleNestedRefinement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedRefinement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleNestedRefinement"
    // InternalEcl.g:1639:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEcl.g:1639:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEcl.g:1640:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedRefinement=ruleNestedRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedRefinement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedRefinement"


    // $ANTLR start "ruleNestedRefinement"
    // InternalEcl.g:1646:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1652:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1653:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1653:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1654:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1658:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEcl.g:1659:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEcl.g:1659:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEcl.g:1660:5: lv_nested_1_0= ruleEclRefinement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_nested_1_0=ruleEclRefinement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedRefinementRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclRefinement");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedRefinement"


    // $ANTLR start "entryRuleEclAttributeGroup"
    // InternalEcl.g:1685:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEcl.g:1685:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEcl.g:1686:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeGroup=ruleEclAttributeGroup();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeGroup; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclAttributeGroup"


    // $ANTLR start "ruleEclAttributeGroup"
    // InternalEcl.g:1692:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1698:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEcl.g:1699:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEcl.g:1699:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEcl.g:1700:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEcl.g:1700:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SQUARE_OPEN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEcl.g:1701:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:1701:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:1702:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_20);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:1723:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEcl.g:1724:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:1724:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEcl.g:1725:5: lv_refinement_2_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
            lv_refinement_2_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEclAttributeGroupRule());
              					}
              					set(
              						current,
              						"refinement",
              						lv_refinement_2_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_CURLY_CLOSE_3=(Token)match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_CLOSE_3, grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclAttributeGroup"


    // $ANTLR start "entryRuleEclAttributeSet"
    // InternalEcl.g:1750:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEcl.g:1750:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEcl.g:1751:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEclAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEclAttributeSet=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEclAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEclAttributeSet"


    // $ANTLR start "ruleEclAttributeSet"
    // InternalEcl.g:1757:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1763:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEcl.g:1764:2: this_OrAttributeSet_0= ruleOrAttributeSet
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_OrAttributeSet_0=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_OrAttributeSet_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEclAttributeSet"


    // $ANTLR start "entryRuleOrAttributeSet"
    // InternalEcl.g:1778:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEcl.g:1778:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEcl.g:1779:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleOrAttributeSet=ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrAttributeSet"


    // $ANTLR start "ruleOrAttributeSet"
    // InternalEcl.g:1785:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1791:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEcl.g:1792:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEcl.g:1792:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEcl.g:1793:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_AndAttributeSet_0=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_AndAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:1804:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalEcl.g:1805:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEcl.g:1805:4: ()
            	    // InternalEcl.g:1806:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:1819:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEcl.g:1820:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEcl.g:1820:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEcl.g:1821:6: lv_right_3_0= ruleAndAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleAndAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getOrAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.AndAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalEcl.g:1843:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEcl.g:1843:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEcl.g:1844:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAndAttributeSet=ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAndAttributeSet"


    // $ANTLR start "ruleAndAttributeSet"
    // InternalEcl.g:1850:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1856:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEcl.g:1857:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEcl.g:1857:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEcl.g:1858:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_SubAttributeSet_0=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubAttributeSet_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:1869:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_CONJUNCTION_KEYWORD && LA25_0<=RULE_COMMA)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEcl.g:1870:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEcl.g:1870:4: ()
            	    // InternalEcl.g:1871:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEcl.g:1880:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt24=2;
            	    int LA24_0 = input.LA(1);

            	    if ( (LA24_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt24=1;
            	    }
            	    else if ( (LA24_0==RULE_COMMA) ) {
            	        alt24=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt24) {
            	        case 1 :
            	            // InternalEcl.g:1881:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:1886:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_21); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:1891:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEcl.g:1892:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEcl.g:1892:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEcl.g:1893:6: lv_right_4_0= ruleSubAttributeSet
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleSubAttributeSet();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getAndAttributeSetRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.SubAttributeSet");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // InternalEcl.g:1915:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEcl.g:1915:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEcl.g:1916:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSubAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSubAttributeSet=ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSubAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSubAttributeSet"


    // $ANTLR start "ruleSubAttributeSet"
    // InternalEcl.g:1922:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:1928:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEcl.g:1929:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEcl.g:1929:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt26=2;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalEcl.g:1930:3: this_AttributeConstraint_0= ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeConstraint_0=ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1942:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedAttributeSet_1=ruleNestedAttributeSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedAttributeSet_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSubAttributeSet"


    // $ANTLR start "entryRuleNestedAttributeSet"
    // InternalEcl.g:1957:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEcl.g:1957:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEcl.g:1958:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedAttributeSet=ruleNestedAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedAttributeSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedAttributeSet"


    // $ANTLR start "ruleNestedAttributeSet"
    // InternalEcl.g:1964:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1970:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1971:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1971:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1972:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1976:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEcl.g:1977:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:1977:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEcl.g:1978:5: lv_nested_1_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_nested_1_0=ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedAttributeSetRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.EclAttributeSet");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedAttributeSet"


    // $ANTLR start "entryRuleAttributeConstraint"
    // InternalEcl.g:2003:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEcl.g:2003:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEcl.g:2004:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeConstraint=ruleAttributeConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // InternalEcl.g:2010:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2016:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) )
            // InternalEcl.g:2017:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            {
            // InternalEcl.g:2017:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            // InternalEcl.g:2018:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )?
            {
            // InternalEcl.g:2018:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_SQUARE_OPEN) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEcl.g:2019:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:2019:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:2020:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_23);
                    lv_cardinality_0_0=ruleCardinality();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      					}
                      					set(
                      						current,
                      						"cardinality",
                      						lv_cardinality_0_0,
                      						"com.b2international.snomed.ecl.Ecl.Cardinality");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEcl.g:2037:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_REVERSED) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEcl.g:2038:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEcl.g:2038:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEcl.g:2039:5: lv_reversed_1_0= RULE_REVERSED
                    {
                    lv_reversed_1_0=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_reversed_1_0, grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAttributeConstraintRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"reversed",
                      						lv_reversed_1_0 != null,
                      						"com.b2international.snomed.ecl.Ecl.REVERSED");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEcl.g:2055:3: ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:2056:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:2056:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:2057:5: lv_attribute_2_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_attribute_2_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
              					}
              					set(
              						current,
              						"attribute",
              						lv_attribute_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:2074:3: ( (lv_comparison_3_0= ruleComparison ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_LT||LA29_0==RULE_GT||LA29_0==RULE_EQUAL||(LA29_0>=RULE_NOT_EQUAL && LA29_0<=RULE_LTE)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEcl.g:2075:4: (lv_comparison_3_0= ruleComparison )
                    {
                    // InternalEcl.g:2075:4: (lv_comparison_3_0= ruleComparison )
                    // InternalEcl.g:2076:5: lv_comparison_3_0= ruleComparison
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_comparison_3_0=ruleComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getAttributeConstraintRule());
                      					}
                      					set(
                      						current,
                      						"comparison",
                      						lv_comparison_3_0,
                      						"com.b2international.snomed.ecl.Ecl.Comparison");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleCardinality"
    // InternalEcl.g:2097:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEcl.g:2097:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEcl.g:2098:2: iv_ruleCardinality= ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCardinality=ruleCardinality();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCardinality; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalEcl.g:2104:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2110:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEcl.g:2111:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEcl.g:2111:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEcl.g:2112:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2116:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEcl.g:2117:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEcl.g:2117:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEcl.g:2118:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
            lv_min_1_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"min",
              						lv_min_1_0,
              						"com.b2international.snomed.ecl.Ecl.NonNegativeInteger");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:2139:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEcl.g:2140:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEcl.g:2140:4: (lv_max_3_0= ruleMaxValue )
            // InternalEcl.g:2141:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_max_3_0=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCardinalityRule());
              					}
              					set(
              						current,
              						"max",
              						lv_max_3_0,
              						"com.b2international.snomed.ecl.Ecl.MaxValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_SQUARE_CLOSE_4=(Token)match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_CLOSE_4, grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComparison"
    // InternalEcl.g:2166:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEcl.g:2166:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEcl.g:2167:2: iv_ruleComparison= ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleComparison=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEcl.g:2173:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:2179:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEcl.g:2180:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEcl.g:2180:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt30=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                switch ( input.LA(2) ) {
                case RULE_HASH:
                case RULE_STRING:
                case RULE_REGEX_KEYWORD:
                case RULE_TRUE_KEYWORD:
                case RULE_FALSE_KEYWORD:
                case RULE_EXACT_KEYWORD:
                case RULE_MATCH_KEYWORD:
                case RULE_WILD_KEYWORD:
                    {
                    alt30=2;
                    }
                    break;
                case RULE_LT_EM:
                case RULE_DBL_LT_EM:
                case RULE_LT:
                case RULE_DBL_LT:
                case RULE_GT_EM:
                case RULE_DBL_GT_EM:
                case RULE_GT:
                case RULE_DBL_GT:
                case RULE_CARET:
                case RULE_WILDCARD:
                case RULE_DIGIT_NONZERO:
                case RULE_DIGIT_ZERO:
                    {
                    alt30=1;
                    }
                    break;
                case RULE_ROUND_OPEN:
                    {
                    int LA30_5 = input.LA(3);

                    if ( ((LA30_5>=RULE_LT_EM && LA30_5<=RULE_CARET)||LA30_5==RULE_WILDCARD||LA30_5==RULE_ROUND_OPEN||(LA30_5>=RULE_DIGIT_NONZERO && LA30_5<=RULE_DIGIT_ZERO)) ) {
                        alt30=1;
                    }
                    else if ( ((LA30_5>=RULE_STRING && LA30_5<=RULE_REGEX_KEYWORD)||(LA30_5>=RULE_EXACT_KEYWORD && LA30_5<=RULE_WILD_KEYWORD)) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_NOT_EQUAL:
                {
                switch ( input.LA(2) ) {
                case RULE_LT_EM:
                case RULE_DBL_LT_EM:
                case RULE_LT:
                case RULE_DBL_LT:
                case RULE_GT_EM:
                case RULE_DBL_GT_EM:
                case RULE_GT:
                case RULE_DBL_GT:
                case RULE_CARET:
                case RULE_WILDCARD:
                case RULE_DIGIT_NONZERO:
                case RULE_DIGIT_ZERO:
                    {
                    alt30=1;
                    }
                    break;
                case RULE_ROUND_OPEN:
                    {
                    int LA30_5 = input.LA(3);

                    if ( ((LA30_5>=RULE_LT_EM && LA30_5<=RULE_CARET)||LA30_5==RULE_WILDCARD||LA30_5==RULE_ROUND_OPEN||(LA30_5>=RULE_DIGIT_NONZERO && LA30_5<=RULE_DIGIT_ZERO)) ) {
                        alt30=1;
                    }
                    else if ( ((LA30_5>=RULE_STRING && LA30_5<=RULE_REGEX_KEYWORD)||(LA30_5>=RULE_EXACT_KEYWORD && LA30_5<=RULE_WILD_KEYWORD)) ) {
                        alt30=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 30, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_HASH:
                case RULE_STRING:
                case RULE_REGEX_KEYWORD:
                case RULE_TRUE_KEYWORD:
                case RULE_FALSE_KEYWORD:
                case RULE_EXACT_KEYWORD:
                case RULE_MATCH_KEYWORD:
                case RULE_WILD_KEYWORD:
                    {
                    alt30=2;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt30=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalEcl.g:2181:3: this_AttributeComparison_0= ruleAttributeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AttributeComparison_0=ruleAttributeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AttributeComparison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:2193:3: this_DataTypeComparison_1= ruleDataTypeComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DataTypeComparison_1=ruleDataTypeComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DataTypeComparison_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAttributeComparison"
    // InternalEcl.g:2208:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEcl.g:2208:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEcl.g:2209:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAttributeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAttributeComparison=ruleAttributeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAttributeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeComparison"


    // $ANTLR start "ruleAttributeComparison"
    // InternalEcl.g:2215:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2221:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) )
            // InternalEcl.g:2222:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            {
            // InternalEcl.g:2222:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            // InternalEcl.g:2223:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            {
            // InternalEcl.g:2223:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2224:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2224:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2225:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:2242:3: ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:2243:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:2243:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:2244:5: lv_value_1_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getValueFilteredExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAttributeComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeComparison"


    // $ANTLR start "entryRuleDataTypeComparison"
    // InternalEcl.g:2265:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEcl.g:2265:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEcl.g:2266:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDataTypeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDataTypeComparison=ruleDataTypeComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDataTypeComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDataTypeComparison"


    // $ANTLR start "ruleDataTypeComparison"
    // InternalEcl.g:2272:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:2278:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEcl.g:2279:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEcl.g:2279:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt31=4;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalEcl.g:2280:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getBooleanValueComparisonParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_BooleanValueComparison_0=ruleBooleanValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_BooleanValueComparison_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:2292:3: this_StringValueComparison_1= ruleStringValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getStringValueComparisonParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_StringValueComparison_1=ruleStringValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_StringValueComparison_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:2304:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getIntegerValueComparisonParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IntegerValueComparison_2=ruleIntegerValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IntegerValueComparison_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:2316:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDataTypeComparisonAccess().getDecimalValueComparisonParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DecimalValueComparison_3=ruleDecimalValueComparison();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DecimalValueComparison_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDataTypeComparison"


    // $ANTLR start "entryRuleBooleanValueComparison"
    // InternalEcl.g:2331:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEcl.g:2331:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEcl.g:2332:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBooleanValueComparison=ruleBooleanValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBooleanValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBooleanValueComparison"


    // $ANTLR start "ruleBooleanValueComparison"
    // InternalEcl.g:2338:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2344:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEcl.g:2345:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEcl.g:2345:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEcl.g:2346:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEcl.g:2346:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2347:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2347:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2348:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_27);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:2365:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEcl.g:2366:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEcl.g:2366:4: (lv_value_1_0= ruleBoolean )
            // InternalEcl.g:2367:5: lv_value_1_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getValueBooleanParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBooleanValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.Boolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBooleanValueComparison"


    // $ANTLR start "entryRuleStringValueComparison"
    // InternalEcl.g:2388:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEcl.g:2388:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEcl.g:2389:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStringValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleStringValueComparison=ruleStringValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStringValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringValueComparison"


    // $ANTLR start "ruleStringValueComparison"
    // InternalEcl.g:2395:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_1 = null;

        EObject lv_value_1_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:2401:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) ) ) )
            // InternalEcl.g:2402:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) ) )
            {
            // InternalEcl.g:2402:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) ) )
            // InternalEcl.g:2403:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) )
            {
            // InternalEcl.g:2403:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2404:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2404:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2405:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:2422:3: ( ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) ) )
            // InternalEcl.g:2423:4: ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) )
            {
            // InternalEcl.g:2423:4: ( (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet ) )
            // InternalEcl.g:2424:5: (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet )
            {
            // InternalEcl.g:2424:5: (lv_value_1_1= ruleTypedSearchTerm | lv_value_1_2= ruleTypedSearchTermSet )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_REGEX_KEYWORD)||(LA32_0>=RULE_EXACT_KEYWORD && LA32_0<=RULE_WILD_KEYWORD)) ) {
                alt32=1;
            }
            else if ( (LA32_0==RULE_ROUND_OPEN) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEcl.g:2425:6: lv_value_1_1= ruleTypedSearchTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStringValueComparisonAccess().getValueTypedSearchTermParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_1=ruleTypedSearchTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_1,
                      							"com.b2international.snomed.ecl.Ecl.TypedSearchTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:2441:6: lv_value_1_2= ruleTypedSearchTermSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getStringValueComparisonAccess().getValueTypedSearchTermSetParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_value_1_2=ruleTypedSearchTermSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_2,
                      							"com.b2international.snomed.ecl.Ecl.TypedSearchTermSet");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringValueComparison"


    // $ANTLR start "entryRuleIntegerValueComparison"
    // InternalEcl.g:2463:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEcl.g:2463:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEcl.g:2464:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIntegerValueComparison=ruleIntegerValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIntegerValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIntegerValueComparison"


    // $ANTLR start "ruleIntegerValueComparison"
    // InternalEcl.g:2470:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2476:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEcl.g:2477:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEcl.g:2477:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEcl.g:2478:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEcl.g:2478:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2479:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2479:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2480:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_op_0_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2501:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEcl.g:2502:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEcl.g:2502:4: (lv_value_2_0= ruleInteger )
            // InternalEcl.g:2503:5: lv_value_2_0= ruleInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getValueIntegerParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getIntegerValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Integer");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIntegerValueComparison"


    // $ANTLR start "entryRuleDecimalValueComparison"
    // InternalEcl.g:2524:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEcl.g:2524:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEcl.g:2525:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalValueComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimalValueComparison=ruleDecimalValueComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimalValueComparison; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDecimalValueComparison"


    // $ANTLR start "ruleDecimalValueComparison"
    // InternalEcl.g:2531:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2537:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEcl.g:2538:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEcl.g:2538:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEcl.g:2539:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEcl.g:2539:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2540:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2540:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2541:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_29);
            lv_op_0_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_0_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2562:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEcl.g:2563:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEcl.g:2563:4: (lv_value_2_0= ruleDecimal )
            // InternalEcl.g:2564:5: lv_value_2_0= ruleDecimal
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getValueDecimalParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_2_0=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDecimalValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"com.b2international.snomed.ecl.Ecl.Decimal");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDecimalValueComparison"


    // $ANTLR start "entryRuleNestedExpression"
    // InternalEcl.g:2585:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEcl.g:2585:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEcl.g:2586:2: iv_ruleNestedExpression= ruleNestedExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedExpression=ruleNestedExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedExpression; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedExpression"


    // $ANTLR start "ruleNestedExpression"
    // InternalEcl.g:2592:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2598:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2599:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2599:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2600:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2604:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEcl.g:2605:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEcl.g:2605:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEcl.g:2606:5: lv_nested_1_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_nested_1_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedExpressionRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedExpression"


    // $ANTLR start "entryRuleFilterConstraint"
    // InternalEcl.g:2631:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEcl.g:2631:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEcl.g:2632:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilterConstraint=ruleFilterConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterConstraint; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterConstraint"


    // $ANTLR start "ruleFilterConstraint"
    // InternalEcl.g:2638:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_domain_1_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2644:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:2645:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:2645:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:2646:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2650:3: ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )?
            int alt33=2;
            switch ( input.LA(1) ) {
                case RULE_CONCEPT_SHORT_KEYWORD:
                    {
                    int LA33_1 = input.LA(2);

                    if ( ((LA33_1>=RULE_DISJUNCTION_KEYWORD && LA33_1<=RULE_CONJUNCTION_KEYWORD)||LA33_1==RULE_EXCLUSION_KEYWORD||LA33_1==RULE_ROUND_OPEN||LA33_1==RULE_REVERSED||LA33_1==RULE_TERM_KEYWORD||(LA33_1>=RULE_REGEX_KEYWORD && LA33_1<=RULE_DIALECT_KEYWORD)||(LA33_1>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA33_1<=RULE_MODULEID_KEYWORD)||(LA33_1>=RULE_EFFECTIVE_TIME_KEYWORD && LA33_1<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA33_1==RULE_HISTORY_KEYWORD||(LA33_1>=RULE_TRUE_KEYWORD && LA33_1<=RULE_KEYWORD)) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_DESCRIPTION_SHORT_KEYWORD:
                    {
                    int LA33_2 = input.LA(2);

                    if ( ((LA33_2>=RULE_DISJUNCTION_KEYWORD && LA33_2<=RULE_CONJUNCTION_KEYWORD)||LA33_2==RULE_EXCLUSION_KEYWORD||LA33_2==RULE_ROUND_OPEN||LA33_2==RULE_REVERSED||LA33_2==RULE_TERM_KEYWORD||(LA33_2>=RULE_REGEX_KEYWORD && LA33_2<=RULE_DIALECT_KEYWORD)||(LA33_2>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA33_2<=RULE_MODULEID_KEYWORD)||(LA33_2>=RULE_EFFECTIVE_TIME_KEYWORD && LA33_2<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA33_2==RULE_HISTORY_KEYWORD||(LA33_2>=RULE_TRUE_KEYWORD && LA33_2<=RULE_KEYWORD)) ) {
                        alt33=1;
                    }
                    }
                    break;
                case RULE_MEMBER_SHORT_KEYWORD:
                    {
                    int LA33_3 = input.LA(2);

                    if ( ((LA33_3>=RULE_DISJUNCTION_KEYWORD && LA33_3<=RULE_CONJUNCTION_KEYWORD)||LA33_3==RULE_EXCLUSION_KEYWORD||LA33_3==RULE_ROUND_OPEN||LA33_3==RULE_REVERSED||LA33_3==RULE_TERM_KEYWORD||(LA33_3>=RULE_REGEX_KEYWORD && LA33_3<=RULE_DIALECT_KEYWORD)||(LA33_3>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA33_3<=RULE_MODULEID_KEYWORD)||(LA33_3>=RULE_EFFECTIVE_TIME_KEYWORD && LA33_3<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA33_3==RULE_HISTORY_KEYWORD||(LA33_3>=RULE_TRUE_KEYWORD && LA33_3<=RULE_KEYWORD)) ) {
                        alt33=1;
                    }
                    }
                    break;
            }

            switch (alt33) {
                case 1 :
                    // InternalEcl.g:2651:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    {
                    // InternalEcl.g:2651:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    // InternalEcl.g:2652:5: lv_domain_1_0= ruleSHORT_DOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_domain_1_0=ruleSHORT_DOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
                      					}
                      					set(
                      						current,
                      						"domain",
                      						lv_domain_1_0,
                      						"com.b2international.snomed.ecl.Ecl.SHORT_DOMAIN");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalEcl.g:2669:3: ( (lv_filter_2_0= ruleFilter ) )
            // InternalEcl.g:2670:4: (lv_filter_2_0= ruleFilter )
            {
            // InternalEcl.g:2670:4: (lv_filter_2_0= ruleFilter )
            // InternalEcl.g:2671:5: lv_filter_2_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
            lv_filter_2_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getFilterConstraintRule());
              					}
              					set(
              						current,
              						"filter",
              						lv_filter_2_0,
              						"com.b2international.snomed.ecl.Ecl.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_DOUBLE_CURLY_CLOSE_3=(Token)match(input,RULE_DOUBLE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_CLOSE_3, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterConstraint"


    // $ANTLR start "entryRuleFilter"
    // InternalEcl.g:2696:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEcl.g:2696:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEcl.g:2697:2: iv_ruleFilter= ruleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilter=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilter"


    // $ANTLR start "ruleFilter"
    // InternalEcl.g:2703:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2709:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEcl.g:2710:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getFilterAccess().getDisjunctionFilterParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_DisjunctionFilter_0=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_DisjunctionFilter_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilter"


    // $ANTLR start "entryRuleDisjunctionFilter"
    // InternalEcl.g:2724:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEcl.g:2724:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEcl.g:2725:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDisjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDisjunctionFilter=ruleDisjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDisjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDisjunctionFilter"


    // $ANTLR start "ruleDisjunctionFilter"
    // InternalEcl.g:2731:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2737:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEcl.g:2738:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEcl.g:2738:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEcl.g:2739:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getConjunctionFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_3);
            this_ConjunctionFilter_0=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ConjunctionFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:2750:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEcl.g:2751:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEcl.g:2751:4: ()
            	    // InternalEcl.g:2752:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getDisjunctionFilterAccess().getDisjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:2765:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEcl.g:2766:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEcl.g:2766:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEcl.g:2767:6: lv_right_3_0= ruleConjunctionFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getRightConjunctionFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_3);
            	    lv_right_3_0=ruleConjunctionFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getDisjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"com.b2international.snomed.ecl.Ecl.ConjunctionFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDisjunctionFilter"


    // $ANTLR start "entryRuleConjunctionFilter"
    // InternalEcl.g:2789:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEcl.g:2789:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEcl.g:2790:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getConjunctionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleConjunctionFilter=ruleConjunctionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleConjunctionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConjunctionFilter"


    // $ANTLR start "ruleConjunctionFilter"
    // InternalEcl.g:2796:1: ruleConjunctionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2802:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) )
            // InternalEcl.g:2803:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            {
            // InternalEcl.g:2803:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            // InternalEcl.g:2804:3: this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getPropertyFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_PropertyFilter_0=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PropertyFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:2815:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( ((LA36_0>=RULE_CONJUNCTION_KEYWORD && LA36_0<=RULE_COMMA)) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalEcl.g:2816:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) )
            	    {
            	    // InternalEcl.g:2816:4: ()
            	    // InternalEcl.g:2817:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getConjunctionFilterAccess().getConjunctionFilterLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalEcl.g:2826:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt35=2;
            	    int LA35_0 = input.LA(1);

            	    if ( (LA35_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt35=1;
            	    }
            	    else if ( (LA35_0==RULE_COMMA) ) {
            	        alt35=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 35, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt35) {
            	        case 1 :
            	            // InternalEcl.g:2827:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:2832:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:2837:4: ( (lv_right_4_0= rulePropertyFilter ) )
            	    // InternalEcl.g:2838:5: (lv_right_4_0= rulePropertyFilter )
            	    {
            	    // InternalEcl.g:2838:5: (lv_right_4_0= rulePropertyFilter )
            	    // InternalEcl.g:2839:6: lv_right_4_0= rulePropertyFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=rulePropertyFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getConjunctionFilterRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_4_0,
            	      							"com.b2international.snomed.ecl.Ecl.PropertyFilter");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleConjunctionFilter"


    // $ANTLR start "entryRuleNestedFilter"
    // InternalEcl.g:2861:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEcl.g:2861:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEcl.g:2862:2: iv_ruleNestedFilter= ruleNestedFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNestedFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNestedFilter=ruleNestedFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNestedFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNestedFilter"


    // $ANTLR start "ruleNestedFilter"
    // InternalEcl.g:2868:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2874:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2875:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2875:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2876:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2880:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEcl.g:2881:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEcl.g:2881:4: (lv_nested_1_0= ruleFilter )
            // InternalEcl.g:2882:5: lv_nested_1_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_nested_1_0=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getNestedFilterRule());
              					}
              					set(
              						current,
              						"nested",
              						lv_nested_1_0,
              						"com.b2international.snomed.ecl.Ecl.Filter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getNestedFilterAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNestedFilter"


    // $ANTLR start "entryRulePropertyFilter"
    // InternalEcl.g:2907:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEcl.g:2907:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEcl.g:2908:2: iv_rulePropertyFilter= rulePropertyFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPropertyFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePropertyFilter=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePropertyFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyFilter"


    // $ANTLR start "rulePropertyFilter"
    // InternalEcl.g:2914:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_MemberFieldFilter_13= ruleMemberFieldFilter | this_NestedFilter_14= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TermFilter_0 = null;

        EObject this_LanguageFilter_1 = null;

        EObject this_TypeFilter_2 = null;

        EObject this_DialectFilter_3 = null;

        EObject this_DefinitionStatusFilter_4 = null;

        EObject this_ModuleFilter_5 = null;

        EObject this_EffectiveTimeFilter_6 = null;

        EObject this_ActiveFilter_7 = null;

        EObject this_SemanticTagFilter_8 = null;

        EObject this_PreferredInFilter_9 = null;

        EObject this_AcceptableInFilter_10 = null;

        EObject this_LanguageRefSetFilter_11 = null;

        EObject this_CaseSignificanceFilter_12 = null;

        EObject this_MemberFieldFilter_13 = null;

        EObject this_NestedFilter_14 = null;



        	enterRule();

        try {
            // InternalEcl.g:2920:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_MemberFieldFilter_13= ruleMemberFieldFilter | this_NestedFilter_14= ruleNestedFilter ) )
            // InternalEcl.g:2921:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_MemberFieldFilter_13= ruleMemberFieldFilter | this_NestedFilter_14= ruleNestedFilter )
            {
            // InternalEcl.g:2921:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_MemberFieldFilter_13= ruleMemberFieldFilter | this_NestedFilter_14= ruleNestedFilter )
            int alt37=15;
            alt37 = dfa37.predict(input);
            switch (alt37) {
                case 1 :
                    // InternalEcl.g:2922:3: this_TermFilter_0= ruleTermFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTermFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TermFilter_0=ruleTermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TermFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:2934:3: this_LanguageFilter_1= ruleLanguageFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageFilter_1=ruleLanguageFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:2946:3: this_TypeFilter_2= ruleTypeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getTypeFilterParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeFilter_2=ruleTypeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeFilter_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:2958:3: this_DialectFilter_3= ruleDialectFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDialectFilterParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectFilter_3=ruleDialectFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectFilter_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:2970:3: this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusFilter_4=ruleDefinitionStatusFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusFilter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:2982:3: this_ModuleFilter_5= ruleModuleFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModuleFilter_5=ruleModuleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleFilter_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:2994:3: this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EffectiveTimeFilter_6=ruleEffectiveTimeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EffectiveTimeFilter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEcl.g:3006:3: this_ActiveFilter_7= ruleActiveFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActiveFilter_7=ruleActiveFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActiveFilter_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEcl.g:3018:3: this_SemanticTagFilter_8= ruleSemanticTagFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SemanticTagFilter_8=ruleSemanticTagFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticTagFilter_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEcl.g:3030:3: this_PreferredInFilter_9= rulePreferredInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreferredInFilter_9=rulePreferredInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreferredInFilter_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEcl.g:3042:3: this_AcceptableInFilter_10= ruleAcceptableInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptableInFilter_10=ruleAcceptableInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptableInFilter_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEcl.g:3054:3: this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_11());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageRefSetFilter_11=ruleLanguageRefSetFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageRefSetFilter_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEcl.g:3066:3: this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_12());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_12=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEcl.g:3078:3: this_MemberFieldFilter_13= ruleMemberFieldFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getMemberFieldFilterParserRuleCall_13());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MemberFieldFilter_13=ruleMemberFieldFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MemberFieldFilter_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalEcl.g:3090:3: this_NestedFilter_14= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_14());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_14=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyFilter"


    // $ANTLR start "entryRuleMemberFieldFilter"
    // InternalEcl.g:3105:1: entryRuleMemberFieldFilter returns [EObject current=null] : iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF ;
    public final EObject entryRuleMemberFieldFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberFieldFilter = null;


        try {
            // InternalEcl.g:3105:58: (iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF )
            // InternalEcl.g:3106:2: iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMemberFieldFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMemberFieldFilter=ruleMemberFieldFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMemberFieldFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMemberFieldFilter"


    // $ANTLR start "ruleMemberFieldFilter"
    // InternalEcl.g:3112:1: ruleMemberFieldFilter returns [EObject current=null] : ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) ) ;
    public final EObject ruleMemberFieldFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_refsetFieldName_0_0 = null;

        EObject lv_comparison_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3118:2: ( ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) ) )
            // InternalEcl.g:3119:2: ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) )
            {
            // InternalEcl.g:3119:2: ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) )
            // InternalEcl.g:3120:3: ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) )
            {
            // InternalEcl.g:3120:3: ( (lv_refsetFieldName_0_0= ruleUnquotedString ) )
            // InternalEcl.g:3121:4: (lv_refsetFieldName_0_0= ruleUnquotedString )
            {
            // InternalEcl.g:3121:4: (lv_refsetFieldName_0_0= ruleUnquotedString )
            // InternalEcl.g:3122:5: lv_refsetFieldName_0_0= ruleUnquotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_refsetFieldName_0_0=ruleUnquotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMemberFieldFilterRule());
              					}
              					set(
              						current,
              						"refsetFieldName",
              						lv_refsetFieldName_0_0,
              						"com.b2international.snomed.ecl.Ecl.UnquotedString");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3139:3: ( (lv_comparison_1_0= ruleComparison ) )
            // InternalEcl.g:3140:4: (lv_comparison_1_0= ruleComparison )
            {
            // InternalEcl.g:3140:4: (lv_comparison_1_0= ruleComparison )
            // InternalEcl.g:3141:5: lv_comparison_1_0= ruleComparison
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMemberFieldFilterAccess().getComparisonComparisonParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_comparison_1_0=ruleComparison();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMemberFieldFilterRule());
              					}
              					set(
              						current,
              						"comparison",
              						lv_comparison_1_0,
              						"com.b2international.snomed.ecl.Ecl.Comparison");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMemberFieldFilter"


    // $ANTLR start "entryRuleTermFilter"
    // InternalEcl.g:3162:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEcl.g:3162:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEcl.g:3163:2: iv_ruleTermFilter= ruleTermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTermFilter=ruleTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTermFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTermFilter"


    // $ANTLR start "ruleTermFilter"
    // InternalEcl.g:3169:1: ruleTermFilter returns [EObject current=null] : (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_TERM_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_searchTerm_2_1 = null;

        EObject lv_searchTerm_2_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:3175:2: ( (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) ) ) )
            // InternalEcl.g:3176:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) ) )
            {
            // InternalEcl.g:3176:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) ) )
            // InternalEcl.g:3177:3: this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) )
            {
            this_TERM_KEYWORD_0=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3181:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3182:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3182:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3183:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3200:3: ( ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) ) )
            // InternalEcl.g:3201:4: ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) )
            {
            // InternalEcl.g:3201:4: ( (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet ) )
            // InternalEcl.g:3202:5: (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet )
            {
            // InternalEcl.g:3202:5: (lv_searchTerm_2_1= ruleTypedSearchTerm | lv_searchTerm_2_2= ruleTypedSearchTermSet )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_STRING && LA38_0<=RULE_REGEX_KEYWORD)||(LA38_0>=RULE_EXACT_KEYWORD && LA38_0<=RULE_WILD_KEYWORD)) ) {
                alt38=1;
            }
            else if ( (LA38_0==RULE_ROUND_OPEN) ) {
                alt38=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }
            switch (alt38) {
                case 1 :
                    // InternalEcl.g:3203:6: lv_searchTerm_2_1= ruleTypedSearchTerm
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTermFilterAccess().getSearchTermTypedSearchTermParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_searchTerm_2_1=ruleTypedSearchTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTermFilterRule());
                      						}
                      						set(
                      							current,
                      							"searchTerm",
                      							lv_searchTerm_2_1,
                      							"com.b2international.snomed.ecl.Ecl.TypedSearchTerm");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:3219:6: lv_searchTerm_2_2= ruleTypedSearchTermSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTermFilterAccess().getSearchTermTypedSearchTermSetParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_searchTerm_2_2=ruleTypedSearchTermSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTermFilterRule());
                      						}
                      						set(
                      							current,
                      							"searchTerm",
                      							lv_searchTerm_2_2,
                      							"com.b2international.snomed.ecl.Ecl.TypedSearchTermSet");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTermFilter"


    // $ANTLR start "entryRuleTypedSearchTerm"
    // InternalEcl.g:3241:1: entryRuleTypedSearchTerm returns [EObject current=null] : iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF ;
    public final EObject entryRuleTypedSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTerm = null;


        try {
            // InternalEcl.g:3241:56: (iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF )
            // InternalEcl.g:3242:2: iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedSearchTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedSearchTerm=ruleTypedSearchTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedSearchTerm; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedSearchTerm"


    // $ANTLR start "ruleTypedSearchTerm"
    // InternalEcl.g:3248:1: ruleTypedSearchTerm returns [EObject current=null] : ( (lv_clause_0_0= ruleTypedSearchTermClause ) ) ;
    public final EObject ruleTypedSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3254:2: ( ( (lv_clause_0_0= ruleTypedSearchTermClause ) ) )
            // InternalEcl.g:3255:2: ( (lv_clause_0_0= ruleTypedSearchTermClause ) )
            {
            // InternalEcl.g:3255:2: ( (lv_clause_0_0= ruleTypedSearchTermClause ) )
            // InternalEcl.g:3256:3: (lv_clause_0_0= ruleTypedSearchTermClause )
            {
            // InternalEcl.g:3256:3: (lv_clause_0_0= ruleTypedSearchTermClause )
            // InternalEcl.g:3257:4: lv_clause_0_0= ruleTypedSearchTermClause
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getTypedSearchTermAccess().getClauseTypedSearchTermClauseParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_clause_0_0=ruleTypedSearchTermClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getTypedSearchTermRule());
              				}
              				set(
              					current,
              					"clause",
              					lv_clause_0_0,
              					"com.b2international.snomed.ecl.Ecl.TypedSearchTermClause");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedSearchTerm"


    // $ANTLR start "entryRuleTypedSearchTermSet"
    // InternalEcl.g:3277:1: entryRuleTypedSearchTermSet returns [EObject current=null] : iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF ;
    public final EObject entryRuleTypedSearchTermSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTermSet = null;


        try {
            // InternalEcl.g:3277:59: (iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF )
            // InternalEcl.g:3278:2: iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedSearchTermSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedSearchTermSet=ruleTypedSearchTermSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedSearchTermSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedSearchTermSet"


    // $ANTLR start "ruleTypedSearchTermSet"
    // InternalEcl.g:3284:1: ruleTypedSearchTermSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedSearchTermSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_clauses_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3290:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:3291:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:3291:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:3292:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getTypedSearchTermSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3296:3: ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_REGEX_KEYWORD)||(LA39_0>=RULE_EXACT_KEYWORD && LA39_0<=RULE_WILD_KEYWORD)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEcl.g:3297:4: (lv_clauses_1_0= ruleTypedSearchTermClause )
            	    {
            	    // InternalEcl.g:3297:4: (lv_clauses_1_0= ruleTypedSearchTermClause )
            	    // InternalEcl.g:3298:5: lv_clauses_1_0= ruleTypedSearchTermClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedSearchTermSetAccess().getClausesTypedSearchTermClauseParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_clauses_1_0=ruleTypedSearchTermClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypedSearchTermSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"clauses",
            	      						lv_clauses_1_0,
            	      						"com.b2international.snomed.ecl.Ecl.TypedSearchTermClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getTypedSearchTermSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedSearchTermSet"


    // $ANTLR start "entryRuleTypedSearchTermClause"
    // InternalEcl.g:3323:1: entryRuleTypedSearchTermClause returns [EObject current=null] : iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF ;
    public final EObject entryRuleTypedSearchTermClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTermClause = null;


        try {
            // InternalEcl.g:3323:62: (iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF )
            // InternalEcl.g:3324:2: iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedSearchTermClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedSearchTermClause=ruleTypedSearchTermClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedSearchTermClause; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypedSearchTermClause"


    // $ANTLR start "ruleTypedSearchTermClause"
    // InternalEcl.g:3330:1: ruleTypedSearchTermClause returns [EObject current=null] : ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) ;
    public final EObject ruleTypedSearchTermClause() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        Token lv_term_2_0=null;
        Token lv_lexicalSearchType_3_0=null;
        Token this_COLON_4=null;
        AntlrDatatypeRuleToken lv_lexicalSearchType_0_0 = null;

        AntlrDatatypeRuleToken lv_term_5_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3336:2: ( ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) )
            // InternalEcl.g:3337:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            {
            // InternalEcl.g:3337:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==RULE_STRING||(LA41_0>=RULE_EXACT_KEYWORD && LA41_0<=RULE_WILD_KEYWORD)) ) {
                alt41=1;
            }
            else if ( (LA41_0==RULE_REGEX_KEYWORD) ) {
                alt41=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalEcl.g:3338:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    {
                    // InternalEcl.g:3338:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    // InternalEcl.g:3339:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) )
                    {
                    // InternalEcl.g:3339:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( ((LA40_0>=RULE_EXACT_KEYWORD && LA40_0<=RULE_WILD_KEYWORD)) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // InternalEcl.g:3340:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON
                            {
                            // InternalEcl.g:3340:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) )
                            // InternalEcl.g:3341:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            {
                            // InternalEcl.g:3341:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            // InternalEcl.g:3342:7: lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_37);
                            lv_lexicalSearchType_0_0=ruleLEXICAL_SEARCH_TYPE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypedSearchTermClauseRule());
                              							}
                              							set(
                              								current,
                              								"lexicalSearchType",
                              								lv_lexicalSearchType_0_0,
                              								"com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            this_COLON_1=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_38); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_COLON_1, grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEcl.g:3364:4: ( (lv_term_2_0= RULE_STRING ) )
                    // InternalEcl.g:3365:5: (lv_term_2_0= RULE_STRING )
                    {
                    // InternalEcl.g:3365:5: (lv_term_2_0= RULE_STRING )
                    // InternalEcl.g:3366:6: lv_term_2_0= RULE_STRING
                    {
                    lv_term_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_term_2_0, grammarAccess.getTypedSearchTermClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedSearchTermClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"term",
                      							lv_term_2_0,
                      							"com.b2international.snomed.ecl.Ecl.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3384:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    {
                    // InternalEcl.g:3384:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    // InternalEcl.g:3385:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) )
                    {
                    // InternalEcl.g:3385:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) )
                    // InternalEcl.g:3386:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    {
                    // InternalEcl.g:3386:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    // InternalEcl.g:3387:6: lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD
                    {
                    lv_lexicalSearchType_3_0=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_37); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lexicalSearchType_3_0, grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedSearchTermClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lexicalSearchType",
                      							lv_lexicalSearchType_3_0,
                      							"com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
                      					
                    }

                    }


                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_4, grammarAccess.getTypedSearchTermClauseAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEcl.g:3407:4: ( (lv_term_5_0= ruleRegularExpression ) )
                    // InternalEcl.g:3408:5: (lv_term_5_0= ruleRegularExpression )
                    {
                    // InternalEcl.g:3408:5: (lv_term_5_0= ruleRegularExpression )
                    // InternalEcl.g:3409:6: lv_term_5_0= ruleRegularExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedSearchTermClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_term_5_0=ruleRegularExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedSearchTermClauseRule());
                      						}
                      						set(
                      							current,
                      							"term",
                      							lv_term_5_0,
                      							"com.b2international.snomed.ecl.Ecl.RegularExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypedSearchTermClause"


    // $ANTLR start "entryRuleRegularExpression"
    // InternalEcl.g:3431:1: entryRuleRegularExpression returns [String current=null] : iv_ruleRegularExpression= ruleRegularExpression EOF ;
    public final String entryRuleRegularExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegularExpression = null;


        try {
            // InternalEcl.g:3431:57: (iv_ruleRegularExpression= ruleRegularExpression EOF )
            // InternalEcl.g:3432:2: iv_ruleRegularExpression= ruleRegularExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRegularExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleRegularExpression=ruleRegularExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRegularExpression.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRegularExpression"


    // $ANTLR start "ruleRegularExpression"
    // InternalEcl.g:3438:1: ruleRegularExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleRegularExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEcl.g:3444:2: (this_STRING_0= RULE_STRING )
            // InternalEcl.g:3445:2: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_STRING_0, grammarAccess.getRegularExpressionAccess().getSTRINGTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRegularExpression"


    // $ANTLR start "entryRuleLanguageFilter"
    // InternalEcl.g:3455:1: entryRuleLanguageFilter returns [EObject current=null] : iv_ruleLanguageFilter= ruleLanguageFilter EOF ;
    public final EObject entryRuleLanguageFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFilter = null;


        try {
            // InternalEcl.g:3455:55: (iv_ruleLanguageFilter= ruleLanguageFilter EOF )
            // InternalEcl.g:3456:2: iv_ruleLanguageFilter= ruleLanguageFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageFilter=ruleLanguageFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageFilter"


    // $ANTLR start "ruleLanguageFilter"
    // InternalEcl.g:3462:1: ruleLanguageFilter returns [EObject current=null] : (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleLanguageFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_2_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3468:2: ( (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3469:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3469:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3470:3: this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_LANGUAGE_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3474:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3475:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3475:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3476:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3493:3: ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_DISJUNCTION_KEYWORD && LA43_0<=RULE_CONJUNCTION_KEYWORD)||LA43_0==RULE_EXCLUSION_KEYWORD||LA43_0==RULE_REVERSED||LA43_0==RULE_TERM_KEYWORD||(LA43_0>=RULE_REGEX_KEYWORD && LA43_0<=RULE_DIALECT_KEYWORD)||(LA43_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA43_0<=RULE_MODULEID_KEYWORD)||(LA43_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA43_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA43_0==RULE_HISTORY_KEYWORD||(LA43_0>=RULE_TRUE_KEYWORD && LA43_0<=RULE_KEYWORD)) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_ROUND_OPEN) ) {
                alt43=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalEcl.g:3494:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:3494:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:3495:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:3495:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    // InternalEcl.g:3496:6: lv_languageCodes_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_languageCodes_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
                      						}
                      						add(
                      							current,
                      							"languageCodes",
                      							lv_languageCodes_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3514:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3514:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3515:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3519:5: ( (lv_languageCodes_4_0= ruleUnquotedString ) )+
                    int cnt42=0;
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_DISJUNCTION_KEYWORD && LA42_0<=RULE_CONJUNCTION_KEYWORD)||LA42_0==RULE_EXCLUSION_KEYWORD||LA42_0==RULE_REVERSED||LA42_0==RULE_TERM_KEYWORD||(LA42_0>=RULE_REGEX_KEYWORD && LA42_0<=RULE_DIALECT_KEYWORD)||(LA42_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA42_0<=RULE_MODULEID_KEYWORD)||(LA42_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA42_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA42_0==RULE_HISTORY_KEYWORD||(LA42_0>=RULE_TRUE_KEYWORD && LA42_0<=RULE_KEYWORD)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalEcl.g:3520:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:3520:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:3521:7: lv_languageCodes_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_languageCodes_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"languageCodes",
                    	      								lv_languageCodes_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt42 >= 1 ) break loop42;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(42, input);
                                throw eee;
                        }
                        cnt42++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageFilter"


    // $ANTLR start "entryRuleTypeFilter"
    // InternalEcl.g:3548:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEcl.g:3548:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEcl.g:3549:2: iv_ruleTypeFilter= ruleTypeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeFilter=ruleTypeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeFilter"


    // $ANTLR start "ruleTypeFilter"
    // InternalEcl.g:3555:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3561:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEcl.g:3562:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEcl.g:3562:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_TYPEID_KEYWORD) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_TYPE_KEYWORD) ) {
                alt44=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEcl.g:3563:3: this_TypeIdFilter_0= ruleTypeIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeIdFilter_0=ruleTypeIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:3575:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getTypeFilterAccess().getTypeTokenFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypeTokenFilter_1=ruleTypeTokenFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypeTokenFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeFilter"


    // $ANTLR start "entryRuleTypeIdFilter"
    // InternalEcl.g:3590:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEcl.g:3590:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEcl.g:3591:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeIdFilter=ruleTypeIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeIdFilter"


    // $ANTLR start "ruleTypeIdFilter"
    // InternalEcl.g:3597:1: ruleTypeIdFilter returns [EObject current=null] : (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPEID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3603:2: ( (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:3604:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:3604:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:3605:3: this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) )
            {
            this_TYPEID_KEYWORD_0=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3609:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3610:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3610:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3611:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3628:3: ( (lv_type_2_0= ruleFilterValue ) )
            // InternalEcl.g:3629:4: (lv_type_2_0= ruleFilterValue )
            {
            // InternalEcl.g:3629:4: (lv_type_2_0= ruleFilterValue )
            // InternalEcl.g:3630:5: lv_type_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_type_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeIdFilter"


    // $ANTLR start "entryRuleTypeTokenFilter"
    // InternalEcl.g:3651:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEcl.g:3651:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEcl.g:3652:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypeTokenFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypeTokenFilter=ruleTypeTokenFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypeTokenFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeTokenFilter"


    // $ANTLR start "ruleTypeTokenFilter"
    // InternalEcl.g:3658:1: ruleTypeTokenFilter returns [EObject current=null] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPE_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_tokens_2_0 = null;

        AntlrDatatypeRuleToken lv_tokens_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3664:2: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3665:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3665:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3666:3: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3670:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3671:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3671:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3672:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3689:3: ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( ((LA46_0>=RULE_DISJUNCTION_KEYWORD && LA46_0<=RULE_CONJUNCTION_KEYWORD)||LA46_0==RULE_EXCLUSION_KEYWORD||LA46_0==RULE_REVERSED||LA46_0==RULE_TERM_KEYWORD||(LA46_0>=RULE_REGEX_KEYWORD && LA46_0<=RULE_DIALECT_KEYWORD)||(LA46_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA46_0<=RULE_MODULEID_KEYWORD)||(LA46_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA46_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA46_0==RULE_HISTORY_KEYWORD||(LA46_0>=RULE_TRUE_KEYWORD && LA46_0<=RULE_KEYWORD)) ) {
                alt46=1;
            }
            else if ( (LA46_0==RULE_ROUND_OPEN) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }
            switch (alt46) {
                case 1 :
                    // InternalEcl.g:3690:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:3690:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:3691:5: (lv_tokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:3691:5: (lv_tokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:3692:6: lv_tokens_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_tokens_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
                      						}
                      						add(
                      							current,
                      							"tokens",
                      							lv_tokens_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3710:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3710:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3711:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3715:5: ( (lv_tokens_4_0= ruleUnquotedString ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=2;
                        int LA45_0 = input.LA(1);

                        if ( ((LA45_0>=RULE_DISJUNCTION_KEYWORD && LA45_0<=RULE_CONJUNCTION_KEYWORD)||LA45_0==RULE_EXCLUSION_KEYWORD||LA45_0==RULE_REVERSED||LA45_0==RULE_TERM_KEYWORD||(LA45_0>=RULE_REGEX_KEYWORD && LA45_0<=RULE_DIALECT_KEYWORD)||(LA45_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA45_0<=RULE_MODULEID_KEYWORD)||(LA45_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA45_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA45_0==RULE_HISTORY_KEYWORD||(LA45_0>=RULE_TRUE_KEYWORD && LA45_0<=RULE_KEYWORD)) ) {
                            alt45=1;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalEcl.g:3716:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:3716:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:3717:7: lv_tokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_tokens_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"tokens",
                    	      								lv_tokens_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeTokenFilter"


    // $ANTLR start "entryRuleDialectFilter"
    // InternalEcl.g:3744:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEcl.g:3744:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEcl.g:3745:2: iv_ruleDialectFilter= ruleDialectFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectFilter=ruleDialectFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialectFilter"


    // $ANTLR start "ruleDialectFilter"
    // InternalEcl.g:3751:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3757:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEcl.g:3758:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEcl.g:3758:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_DIALECTID_KEYWORD) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_DIALECT_KEYWORD) ) {
                alt47=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEcl.g:3759:3: this_DialectIdFilter_0= ruleDialectIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectIdFilter_0=ruleDialectIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:3771:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDialectFilterAccess().getDialectAliasFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DialectAliasFilter_1=ruleDialectAliasFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DialectAliasFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialectFilter"


    // $ANTLR start "entryRuleDialectIdFilter"
    // InternalEcl.g:3786:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEcl.g:3786:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEcl.g:3787:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectIdFilter=ruleDialectIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialectIdFilter"


    // $ANTLR start "ruleDialectIdFilter"
    // InternalEcl.g:3793:1: ruleDialectIdFilter returns [EObject current=null] : (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DIALECTID_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3799:2: ( (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3800:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3800:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3801:3: this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECTID_KEYWORD_0=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3805:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3806:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3806:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3807:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3824:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt49=2;
            alt49 = dfa49.predict(input);
            switch (alt49) {
                case 1 :
                    // InternalEcl.g:3825:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEcl.g:3825:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEcl.g:3826:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEcl.g:3826:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEcl.g:3827:6: lv_dialects_2_0= ruleDialect
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_dialects_2_0=ruleDialect();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
                      						}
                      						add(
                      							current,
                      							"dialects",
                      							lv_dialects_2_0,
                      							"com.b2international.snomed.ecl.Ecl.Dialect");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3845:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3845:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3846:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3850:5: ( (lv_dialects_4_0= ruleDialect ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        int LA48_0 = input.LA(1);

                        if ( ((LA48_0>=RULE_LT_EM && LA48_0<=RULE_CARET)||LA48_0==RULE_WILDCARD||LA48_0==RULE_ROUND_OPEN||(LA48_0>=RULE_DIGIT_NONZERO && LA48_0<=RULE_DIGIT_ZERO)) ) {
                            alt48=1;
                        }


                        switch (alt48) {
                    	case 1 :
                    	    // InternalEcl.g:3851:6: (lv_dialects_4_0= ruleDialect )
                    	    {
                    	    // InternalEcl.g:3851:6: (lv_dialects_4_0= ruleDialect )
                    	    // InternalEcl.g:3852:7: lv_dialects_4_0= ruleDialect
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
                    	    lv_dialects_4_0=ruleDialect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.Dialect");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialectIdFilter"


    // $ANTLR start "entryRuleDialectAliasFilter"
    // InternalEcl.g:3879:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEcl.g:3879:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEcl.g:3880:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAliasFilter=ruleDialectAliasFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAliasFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialectAliasFilter"


    // $ANTLR start "ruleDialectAliasFilter"
    // InternalEcl.g:3886:1: ruleDialectAliasFilter returns [EObject current=null] : (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        Token this_DIALECT_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3892:2: ( (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3893:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3893:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3894:3: this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECT_KEYWORD_0=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3898:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3899:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3899:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3900:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:3917:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( ((LA51_0>=RULE_DISJUNCTION_KEYWORD && LA51_0<=RULE_CONJUNCTION_KEYWORD)||LA51_0==RULE_EXCLUSION_KEYWORD||LA51_0==RULE_REVERSED||LA51_0==RULE_TERM_KEYWORD||(LA51_0>=RULE_REGEX_KEYWORD && LA51_0<=RULE_DIALECT_KEYWORD)||(LA51_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA51_0<=RULE_MODULEID_KEYWORD)||(LA51_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA51_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||(LA51_0>=RULE_HISTORY_KEYWORD && LA51_0<=RULE_DASH)||(LA51_0>=RULE_DIGIT_NONZERO && LA51_0<=RULE_KEYWORD)) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ROUND_OPEN) ) {
                alt51=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalEcl.g:3918:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEcl.g:3918:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEcl.g:3919:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEcl.g:3919:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEcl.g:3920:6: lv_dialects_2_0= ruleDialectAlias
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_dialects_2_0=ruleDialectAlias();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
                      						}
                      						add(
                      							current,
                      							"dialects",
                      							lv_dialects_2_0,
                      							"com.b2international.snomed.ecl.Ecl.DialectAlias");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3938:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3938:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3939:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3943:5: ( (lv_dialects_4_0= ruleDialectAlias ) )+
                    int cnt50=0;
                    loop50:
                    do {
                        int alt50=2;
                        int LA50_0 = input.LA(1);

                        if ( ((LA50_0>=RULE_DISJUNCTION_KEYWORD && LA50_0<=RULE_CONJUNCTION_KEYWORD)||LA50_0==RULE_EXCLUSION_KEYWORD||LA50_0==RULE_REVERSED||LA50_0==RULE_TERM_KEYWORD||(LA50_0>=RULE_REGEX_KEYWORD && LA50_0<=RULE_DIALECT_KEYWORD)||(LA50_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA50_0<=RULE_MODULEID_KEYWORD)||(LA50_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA50_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||(LA50_0>=RULE_HISTORY_KEYWORD && LA50_0<=RULE_DASH)||(LA50_0>=RULE_DIGIT_NONZERO && LA50_0<=RULE_KEYWORD)) ) {
                            alt50=1;
                        }


                        switch (alt50) {
                    	case 1 :
                    	    // InternalEcl.g:3944:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    {
                    	    // InternalEcl.g:3944:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    // InternalEcl.g:3945:7: lv_dialects_4_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_43);
                    	    lv_dialects_4_0=ruleDialectAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.DialectAlias");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt50 >= 1 ) break loop50;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(50, input);
                                throw eee;
                        }
                        cnt50++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialectAliasFilter"


    // $ANTLR start "entryRuleDialect"
    // InternalEcl.g:3972:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEcl.g:3972:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEcl.g:3973:2: iv_ruleDialect= ruleDialect EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialect=ruleDialect();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialect; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDialect"


    // $ANTLR start "ruleDialect"
    // InternalEcl.g:3979:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3985:2: ( ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:3986:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:3986:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEcl.g:3987:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:3987:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:3988:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:3988:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:3989:5: lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_44);
            lv_languageRefSetId_0_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_0_0,
              						"com.b2international.snomed.ecl.Ecl.FilteredExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4006:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt52=2;
            alt52 = dfa52.predict(input);
            switch (alt52) {
                case 1 :
                    // InternalEcl.g:4007:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEcl.g:4007:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEcl.g:4008:5: lv_acceptability_1_0= ruleAcceptability
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_acceptability_1_0=ruleAcceptability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDialectRule());
                      					}
                      					set(
                      						current,
                      						"acceptability",
                      						lv_acceptability_1_0,
                      						"com.b2international.snomed.ecl.Ecl.Acceptability");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDialect"


    // $ANTLR start "entryRuleDialectAlias"
    // InternalEcl.g:4029:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4031:2: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEcl.g:4032:2: iv_ruleDialectAlias= ruleDialectAlias EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAlias=ruleDialectAlias();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAlias; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDialectAlias"


    // $ANTLR start "ruleDialectAlias"
    // InternalEcl.g:4041:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4048:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:4049:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:4049:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            // InternalEcl.g:4050:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:4050:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEcl.g:4051:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEcl.g:4051:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEcl.g:4052:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_45);
            lv_alias_0_0=ruleDialectAliasValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDialectAliasRule());
              					}
              					set(
              						current,
              						"alias",
              						lv_alias_0_0,
              						"com.b2international.snomed.ecl.Ecl.DialectAliasValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4069:3: (this_WS_1= RULE_WS )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==RULE_WS) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalEcl.g:4070:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            // InternalEcl.g:4075:3: ( (lv_acceptability_2_0= ruleAcceptability ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_ROUND_OPEN) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalEcl.g:4076:4: (lv_acceptability_2_0= ruleAcceptability )
                    {
                    // InternalEcl.g:4076:4: (lv_acceptability_2_0= ruleAcceptability )
                    // InternalEcl.g:4077:5: lv_acceptability_2_0= ruleAcceptability
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_acceptability_2_0=ruleAcceptability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDialectAliasRule());
                      					}
                      					set(
                      						current,
                      						"acceptability",
                      						lv_acceptability_2_0,
                      						"com.b2international.snomed.ecl.Ecl.Acceptability");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDialectAlias"


    // $ANTLR start "entryRuleAcceptability"
    // InternalEcl.g:4101:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEcl.g:4101:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEcl.g:4102:2: iv_ruleAcceptability= ruleAcceptability EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptability=ruleAcceptability();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptability; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptability"


    // $ANTLR start "ruleAcceptability"
    // InternalEcl.g:4108:1: ruleAcceptability returns [EObject current=null] : (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptabilityIdSet_0 = null;

        EObject this_AcceptabilityTokenSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4114:2: ( (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) )
            // InternalEcl.g:4115:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            {
            // InternalEcl.g:4115:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==RULE_ROUND_OPEN) ) {
                int LA55_1 = input.LA(2);

                if ( ((LA55_1>=RULE_DIGIT_NONZERO && LA55_1<=RULE_DIGIT_ZERO)) ) {
                    alt55=1;
                }
                else if ( ((LA55_1>=RULE_DISJUNCTION_KEYWORD && LA55_1<=RULE_CONJUNCTION_KEYWORD)||LA55_1==RULE_EXCLUSION_KEYWORD||LA55_1==RULE_REVERSED||LA55_1==RULE_TERM_KEYWORD||(LA55_1>=RULE_REGEX_KEYWORD && LA55_1<=RULE_DIALECT_KEYWORD)||(LA55_1>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA55_1<=RULE_MODULEID_KEYWORD)||(LA55_1>=RULE_EFFECTIVE_TIME_KEYWORD && LA55_1<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA55_1==RULE_HISTORY_KEYWORD||(LA55_1>=RULE_TRUE_KEYWORD && LA55_1<=RULE_KEYWORD)) ) {
                    alt55=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalEcl.g:4116:3: this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityIdSetParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptabilityIdSet_0=ruleAcceptabilityIdSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptabilityIdSet_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:4128:3: this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilityTokenSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptabilityTokenSet_1=ruleAcceptabilityTokenSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptabilityTokenSet_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptability"


    // $ANTLR start "entryRuleAcceptabilityIdSet"
    // InternalEcl.g:4143:1: entryRuleAcceptabilityIdSet returns [EObject current=null] : iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF ;
    public final EObject entryRuleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityIdSet = null;


        try {
            // InternalEcl.g:4143:59: (iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF )
            // InternalEcl.g:4144:2: iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityIdSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptabilityIdSet=ruleAcceptabilityIdSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptabilityIdSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptabilityIdSet"


    // $ANTLR start "ruleAcceptabilityIdSet"
    // InternalEcl.g:4150:1: ruleAcceptabilityIdSet returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4156:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEcl.g:4157:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEcl.g:4157:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:4158:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:4158:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEcl.g:4159:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAcceptabilityIdSetAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_acceptabilities_0_0=ruleEclConceptReferenceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAcceptabilityIdSetRule());
              				}
              				set(
              					current,
              					"acceptabilities",
              					lv_acceptabilities_0_0,
              					"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptabilityIdSet"


    // $ANTLR start "entryRuleAcceptabilityTokenSet"
    // InternalEcl.g:4179:1: entryRuleAcceptabilityTokenSet returns [EObject current=null] : iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF ;
    public final EObject entryRuleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityTokenSet = null;


        try {
            // InternalEcl.g:4179:62: (iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF )
            // InternalEcl.g:4180:2: iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptabilityTokenSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptabilityTokenSet=ruleAcceptabilityTokenSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptabilityTokenSet; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptabilityTokenSet"


    // $ANTLR start "ruleAcceptabilityTokenSet"
    // InternalEcl.g:4186:1: ruleAcceptabilityTokenSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        AntlrDatatypeRuleToken lv_acceptabilities_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4192:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:4193:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:4193:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:4194:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4198:3: ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( ((LA56_0>=RULE_DISJUNCTION_KEYWORD && LA56_0<=RULE_CONJUNCTION_KEYWORD)||LA56_0==RULE_EXCLUSION_KEYWORD||LA56_0==RULE_REVERSED||LA56_0==RULE_TERM_KEYWORD||(LA56_0>=RULE_REGEX_KEYWORD && LA56_0<=RULE_DIALECT_KEYWORD)||(LA56_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA56_0<=RULE_MODULEID_KEYWORD)||(LA56_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA56_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA56_0==RULE_HISTORY_KEYWORD||(LA56_0>=RULE_TRUE_KEYWORD && LA56_0<=RULE_KEYWORD)) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalEcl.g:4199:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    {
            	    // InternalEcl.g:4199:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    // InternalEcl.g:4200:5: lv_acceptabilities_1_0= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_39);
            	    lv_acceptabilities_1_0=ruleUnquotedString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAcceptabilityTokenSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"acceptabilities",
            	      						lv_acceptabilities_1_0,
            	      						"com.b2international.snomed.ecl.Ecl.UnquotedString");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt56 >= 1 ) break loop56;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            this_ROUND_CLOSE_2=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_2, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptabilityTokenSet"


    // $ANTLR start "entryRuleDefinitionStatusFilter"
    // InternalEcl.g:4225:1: entryRuleDefinitionStatusFilter returns [EObject current=null] : iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF ;
    public final EObject entryRuleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusFilter = null;


        try {
            // InternalEcl.g:4225:63: (iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF )
            // InternalEcl.g:4226:2: iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusFilter=ruleDefinitionStatusFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionStatusFilter"


    // $ANTLR start "ruleDefinitionStatusFilter"
    // InternalEcl.g:4232:1: ruleDefinitionStatusFilter returns [EObject current=null] : (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) ;
    public final EObject ruleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionStatusIdFilter_0 = null;

        EObject this_DefinitionStatusTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4238:2: ( (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) )
            // InternalEcl.g:4239:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            {
            // InternalEcl.g:4239:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_DEFINITION_STATUS_ID_KEYWORD) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_DEFINITION_STATUS_TOKEN_KEYWORD) ) {
                alt57=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }
            switch (alt57) {
                case 1 :
                    // InternalEcl.g:4240:3: this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusIdFilterParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusIdFilter_0=ruleDefinitionStatusIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusIdFilter_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:4252:3: this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getDefinitionStatusFilterAccess().getDefinitionStatusTokenFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusTokenFilter_1=ruleDefinitionStatusTokenFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusTokenFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionStatusFilter"


    // $ANTLR start "entryRuleDefinitionStatusIdFilter"
    // InternalEcl.g:4267:1: entryRuleDefinitionStatusIdFilter returns [EObject current=null] : iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF ;
    public final EObject entryRuleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusIdFilter = null;


        try {
            // InternalEcl.g:4267:65: (iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF )
            // InternalEcl.g:4268:2: iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusIdFilter=ruleDefinitionStatusIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusIdFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionStatusIdFilter"


    // $ANTLR start "ruleDefinitionStatusIdFilter"
    // InternalEcl.g:4274:1: ruleDefinitionStatusIdFilter returns [EObject current=null] : (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_ID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_definitionStatus_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4280:2: ( (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4281:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4281:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4282:3: this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            {
            this_DEFINITION_STATUS_ID_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_0, grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4286:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4287:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4287:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4288:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4305:3: ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            // InternalEcl.g:4306:4: (lv_definitionStatus_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4306:4: (lv_definitionStatus_2_0= ruleFilterValue )
            // InternalEcl.g:4307:5: lv_definitionStatus_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusIdFilterAccess().getDefinitionStatusFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_definitionStatus_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusIdFilterRule());
              					}
              					set(
              						current,
              						"definitionStatus",
              						lv_definitionStatus_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionStatusIdFilter"


    // $ANTLR start "entryRuleDefinitionStatusTokenFilter"
    // InternalEcl.g:4328:1: entryRuleDefinitionStatusTokenFilter returns [EObject current=null] : iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF ;
    public final EObject entryRuleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusTokenFilter = null;


        try {
            // InternalEcl.g:4328:68: (iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF )
            // InternalEcl.g:4329:2: iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDefinitionStatusTokenFilter=ruleDefinitionStatusTokenFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDefinitionStatusTokenFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDefinitionStatusTokenFilter"


    // $ANTLR start "ruleDefinitionStatusTokenFilter"
    // InternalEcl.g:4335:1: ruleDefinitionStatusTokenFilter returns [EObject current=null] : (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_TOKEN_KEYWORD_0=null;
        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_definitionStatusTokens_2_0 = null;

        AntlrDatatypeRuleToken lv_definitionStatusTokens_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4341:2: ( (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4342:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4342:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4343:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DEFINITION_STATUS_TOKEN_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_0, grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4347:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4348:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4348:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4349:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4366:3: ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( ((LA59_0>=RULE_DISJUNCTION_KEYWORD && LA59_0<=RULE_CONJUNCTION_KEYWORD)||LA59_0==RULE_EXCLUSION_KEYWORD||LA59_0==RULE_REVERSED||LA59_0==RULE_TERM_KEYWORD||(LA59_0>=RULE_REGEX_KEYWORD && LA59_0<=RULE_DIALECT_KEYWORD)||(LA59_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA59_0<=RULE_MODULEID_KEYWORD)||(LA59_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA59_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA59_0==RULE_HISTORY_KEYWORD||(LA59_0>=RULE_TRUE_KEYWORD && LA59_0<=RULE_KEYWORD)) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_ROUND_OPEN) ) {
                alt59=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }
            switch (alt59) {
                case 1 :
                    // InternalEcl.g:4367:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:4367:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:4368:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:4368:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:4369:6: lv_definitionStatusTokens_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_definitionStatusTokens_2_0=ruleUnquotedString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
                      						}
                      						add(
                      							current,
                      							"definitionStatusTokens",
                      							lv_definitionStatusTokens_2_0,
                      							"com.b2international.snomed.ecl.Ecl.UnquotedString");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:4387:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4387:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4388:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4392:5: ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+
                    int cnt58=0;
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( ((LA58_0>=RULE_DISJUNCTION_KEYWORD && LA58_0<=RULE_CONJUNCTION_KEYWORD)||LA58_0==RULE_EXCLUSION_KEYWORD||LA58_0==RULE_REVERSED||LA58_0==RULE_TERM_KEYWORD||(LA58_0>=RULE_REGEX_KEYWORD && LA58_0<=RULE_DIALECT_KEYWORD)||(LA58_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA58_0<=RULE_MODULEID_KEYWORD)||(LA58_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA58_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA58_0==RULE_HISTORY_KEYWORD||(LA58_0>=RULE_TRUE_KEYWORD && LA58_0<=RULE_KEYWORD)) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // InternalEcl.g:4393:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:4393:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:4394:7: lv_definitionStatusTokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_39);
                    	    lv_definitionStatusTokens_4_0=ruleUnquotedString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDefinitionStatusTokenFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"definitionStatusTokens",
                    	      								lv_definitionStatusTokens_4_0,
                    	      								"com.b2international.snomed.ecl.Ecl.UnquotedString");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt58 >= 1 ) break loop58;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(58, input);
                                throw eee;
                        }
                        cnt58++;
                    } while (true);

                    this_ROUND_CLOSE_5=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_5, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_2());
                      				
                    }

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDefinitionStatusTokenFilter"


    // $ANTLR start "entryRuleModuleFilter"
    // InternalEcl.g:4421:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEcl.g:4421:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEcl.g:4422:2: iv_ruleModuleFilter= ruleModuleFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getModuleFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleModuleFilter=ruleModuleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleModuleFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModuleFilter"


    // $ANTLR start "ruleModuleFilter"
    // InternalEcl.g:4428:1: ruleModuleFilter returns [EObject current=null] : (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_MODULEID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_moduleId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4434:2: ( (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4435:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4435:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4436:3: this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) )
            {
            this_MODULEID_KEYWORD_0=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MODULEID_KEYWORD_0, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4444:3: ( (lv_moduleId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4445:4: (lv_moduleId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4445:4: (lv_moduleId_2_0= ruleFilterValue )
            // InternalEcl.g:4446:5: lv_moduleId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_moduleId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleFilterRule());
              					}
              					set(
              						current,
              						"moduleId",
              						lv_moduleId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModuleFilter"


    // $ANTLR start "entryRuleEffectiveTimeFilter"
    // InternalEcl.g:4467:1: entryRuleEffectiveTimeFilter returns [EObject current=null] : iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF ;
    public final EObject entryRuleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveTimeFilter = null;


        try {
            // InternalEcl.g:4467:60: (iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF )
            // InternalEcl.g:4468:2: iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEffectiveTimeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEffectiveTimeFilter=ruleEffectiveTimeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEffectiveTimeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEffectiveTimeFilter"


    // $ANTLR start "ruleEffectiveTimeFilter"
    // InternalEcl.g:4474:1: ruleEffectiveTimeFilter returns [EObject current=null] : (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        Token this_EFFECTIVE_TIME_KEYWORD_0=null;
        Token lv_effectiveTime_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4480:2: ( (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:4481:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:4481:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            // InternalEcl.g:4482:3: this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) )
            {
            this_EFFECTIVE_TIME_KEYWORD_0=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_0, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4486:3: ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:4487:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:4487:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:4488:5: lv_op_1_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_op_1_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4505:3: ( (lv_effectiveTime_2_0= RULE_STRING ) )
            // InternalEcl.g:4506:4: (lv_effectiveTime_2_0= RULE_STRING )
            {
            // InternalEcl.g:4506:4: (lv_effectiveTime_2_0= RULE_STRING )
            // InternalEcl.g:4507:5: lv_effectiveTime_2_0= RULE_STRING
            {
            lv_effectiveTime_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_effectiveTime_2_0, grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"effectiveTime",
              						lv_effectiveTime_2_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEffectiveTimeFilter"


    // $ANTLR start "entryRuleActiveFilter"
    // InternalEcl.g:4527:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEcl.g:4527:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEcl.g:4528:2: iv_ruleActiveFilter= ruleActiveFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActiveFilter=ruleActiveFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleActiveFilter"


    // $ANTLR start "ruleActiveFilter"
    // InternalEcl.g:4534:1: ruleActiveFilter returns [EObject current=null] : (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACTIVE_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        AntlrDatatypeRuleToken lv_active_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4540:2: ( (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) )
            // InternalEcl.g:4541:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            {
            // InternalEcl.g:4541:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            // InternalEcl.g:4542:3: this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) )
            {
            this_ACTIVE_KEYWORD_0=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACTIVE_KEYWORD_0, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4550:3: ( (lv_active_2_0= ruleActiveBoolean ) )
            // InternalEcl.g:4551:4: (lv_active_2_0= ruleActiveBoolean )
            {
            // InternalEcl.g:4551:4: (lv_active_2_0= ruleActiveBoolean )
            // InternalEcl.g:4552:5: lv_active_2_0= ruleActiveBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveActiveBooleanParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_active_2_0=ruleActiveBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActiveFilterRule());
              					}
              					set(
              						current,
              						"active",
              						lv_active_2_0,
              						"com.b2international.snomed.ecl.Ecl.ActiveBoolean");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleActiveFilter"


    // $ANTLR start "entryRuleSemanticTagFilter"
    // InternalEcl.g:4573:1: entryRuleSemanticTagFilter returns [EObject current=null] : iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF ;
    public final EObject entryRuleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticTagFilter = null;


        try {
            // InternalEcl.g:4573:58: (iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF )
            // InternalEcl.g:4574:2: iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSemanticTagFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSemanticTagFilter=ruleSemanticTagFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSemanticTagFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSemanticTagFilter"


    // $ANTLR start "ruleSemanticTagFilter"
    // InternalEcl.g:4580:1: ruleSemanticTagFilter returns [EObject current=null] : (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        Token this_SEMANTIC_TAG_KEYWORD_0=null;
        Token lv_semanticTag_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4586:2: ( (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:4587:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:4587:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            // InternalEcl.g:4588:3: this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) )
            {
            this_SEMANTIC_TAG_KEYWORD_0=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEMANTIC_TAG_KEYWORD_0, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4592:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4593:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4593:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4594:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_1_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:4611:3: ( (lv_semanticTag_2_0= RULE_STRING ) )
            // InternalEcl.g:4612:4: (lv_semanticTag_2_0= RULE_STRING )
            {
            // InternalEcl.g:4612:4: (lv_semanticTag_2_0= RULE_STRING )
            // InternalEcl.g:4613:5: lv_semanticTag_2_0= RULE_STRING
            {
            lv_semanticTag_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semanticTag_2_0, grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSemanticTagFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"semanticTag",
              						lv_semanticTag_2_0,
              						"com.b2international.snomed.ecl.Ecl.STRING");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSemanticTagFilter"


    // $ANTLR start "entryRulePreferredInFilter"
    // InternalEcl.g:4633:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEcl.g:4633:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEcl.g:4634:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPreferredInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePreferredInFilter=rulePreferredInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePreferredInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreferredInFilter"


    // $ANTLR start "rulePreferredInFilter"
    // InternalEcl.g:4640:1: rulePreferredInFilter returns [EObject current=null] : (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_PREFERRED_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4646:2: ( (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4647:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4647:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4648:3: this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_PREFERRED_IN_KEYWORD_0=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4656:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4657:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4657:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4658:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getPreferredInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreferredInFilter"


    // $ANTLR start "entryRuleAcceptableInFilter"
    // InternalEcl.g:4679:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEcl.g:4679:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEcl.g:4680:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAcceptableInFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAcceptableInFilter=ruleAcceptableInFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAcceptableInFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAcceptableInFilter"


    // $ANTLR start "ruleAcceptableInFilter"
    // InternalEcl.g:4686:1: ruleAcceptableInFilter returns [EObject current=null] : (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACCEPTABLE_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4692:2: ( (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4693:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4693:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4694:3: this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_ACCEPTABLE_IN_KEYWORD_0=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4702:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4703:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4703:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4704:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAcceptableInFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAcceptableInFilter"


    // $ANTLR start "entryRuleLanguageRefSetFilter"
    // InternalEcl.g:4725:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEcl.g:4725:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEcl.g:4726:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageRefSetFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageRefSetFilter=ruleLanguageRefSetFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageRefSetFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageRefSetFilter"


    // $ANTLR start "ruleLanguageRefSetFilter"
    // InternalEcl.g:4732:1: ruleLanguageRefSetFilter returns [EObject current=null] : (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_REFSET_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4738:2: ( (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4739:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4739:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4740:3: this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_LANGUAGE_REFSET_ID_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4748:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4749:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4749:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4750:5: lv_languageRefSetId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageRefSetFilterRule());
              					}
              					set(
              						current,
              						"languageRefSetId",
              						lv_languageRefSetId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLanguageRefSetFilter"


    // $ANTLR start "entryRuleCaseSignificanceFilter"
    // InternalEcl.g:4771:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEcl.g:4771:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEcl.g:4772:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCaseSignificanceFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCaseSignificanceFilter=ruleCaseSignificanceFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCaseSignificanceFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCaseSignificanceFilter"


    // $ANTLR start "ruleCaseSignificanceFilter"
    // InternalEcl.g:4778:1: ruleCaseSignificanceFilter returns [EObject current=null] : (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4784:2: ( (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4785:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4785:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4786:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            {
            this_CASE_SIGNIFICANCE_ID_KEYWORD_0=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4794:3: ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4795:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4795:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            // InternalEcl.g:4796:5: lv_caseSignificanceId_2_0= ruleFilterValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdFilterValueParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_caseSignificanceId_2_0=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getCaseSignificanceFilterRule());
              					}
              					set(
              						current,
              						"caseSignificanceId",
              						lv_caseSignificanceId_2_0,
              						"com.b2international.snomed.ecl.Ecl.FilterValue");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCaseSignificanceFilter"


    // $ANTLR start "entryRuleFilterValue"
    // InternalEcl.g:4817:1: entryRuleFilterValue returns [EObject current=null] : iv_ruleFilterValue= ruleFilterValue EOF ;
    public final EObject entryRuleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterValue = null;


        try {
            // InternalEcl.g:4817:52: (iv_ruleFilterValue= ruleFilterValue EOF )
            // InternalEcl.g:4818:2: iv_ruleFilterValue= ruleFilterValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFilterValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleFilterValue=ruleFilterValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFilterValue; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFilterValue"


    // $ANTLR start "ruleFilterValue"
    // InternalEcl.g:4824:1: ruleFilterValue returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) ;
    public final EObject ruleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject this_FilteredExpressionConstraint_0 = null;

        EObject this_EclConceptReferenceSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4830:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:4831:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:4831:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // InternalEcl.g:4832:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterValueAccess().getFilteredExpressionConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FilteredExpressionConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:4844:3: this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getFilterValueAccess().getEclConceptReferenceSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReferenceSet_1=ruleEclConceptReferenceSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReferenceSet_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFilterValue"


    // $ANTLR start "entryRuleSupplement"
    // InternalEcl.g:4859:1: entryRuleSupplement returns [EObject current=null] : iv_ruleSupplement= ruleSupplement EOF ;
    public final EObject entryRuleSupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplement = null;


        try {
            // InternalEcl.g:4859:51: (iv_ruleSupplement= ruleSupplement EOF )
            // InternalEcl.g:4860:2: iv_ruleSupplement= ruleSupplement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSupplementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSupplement=ruleSupplement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSupplement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSupplement"


    // $ANTLR start "ruleSupplement"
    // InternalEcl.g:4866:1: ruleSupplement returns [EObject current=null] : this_HistorySupplement_0= ruleHistorySupplement ;
    public final EObject ruleSupplement() throws RecognitionException {
        EObject current = null;

        EObject this_HistorySupplement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4872:2: (this_HistorySupplement_0= ruleHistorySupplement )
            // InternalEcl.g:4873:2: this_HistorySupplement_0= ruleHistorySupplement
            {
            if ( state.backtracking==0 ) {

              		/* */
              	
            }
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getSupplementAccess().getHistorySupplementParserRuleCall());
              	
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_HistorySupplement_0=ruleHistorySupplement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_HistorySupplement_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSupplement"


    // $ANTLR start "entryRuleHistorySupplement"
    // InternalEcl.g:4887:1: entryRuleHistorySupplement returns [EObject current=null] : iv_ruleHistorySupplement= ruleHistorySupplement EOF ;
    public final EObject entryRuleHistorySupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistorySupplement = null;


        try {
            // InternalEcl.g:4887:58: (iv_ruleHistorySupplement= ruleHistorySupplement EOF )
            // InternalEcl.g:4888:2: iv_ruleHistorySupplement= ruleHistorySupplement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistorySupplementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHistorySupplement=ruleHistorySupplement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistorySupplement; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHistorySupplement"


    // $ANTLR start "ruleHistorySupplement"
    // InternalEcl.g:4894:1: ruleHistorySupplement returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleHistorySupplement() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_PLUS_1=null;
        Token this_HISTORY_KEYWORD_2=null;
        Token this_DOUBLE_CURLY_CLOSE_5=null;
        EObject lv_history_4_1 = null;

        EObject lv_history_4_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:4900:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:4901:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:4901:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:4902:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            this_PLUS_1=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_1, grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1());
              		
            }
            this_HISTORY_KEYWORD_2=(Token)match(input,RULE_HISTORY_KEYWORD,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HISTORY_KEYWORD_2, grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:4914:3: ()
            // InternalEcl.g:4915:4: 
            {
            if ( state.backtracking==0 ) {

              				/* */
              			
            }
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getHistorySupplementAccess().getHistorySupplementAction_3(),
              					current);
              			
            }

            }

            // InternalEcl.g:4924:3: ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_ROUND_OPEN||(LA62_0>=RULE_DASH && LA62_0<=RULE_UNDERSCORE)) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalEcl.g:4925:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    {
                    // InternalEcl.g:4925:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    // InternalEcl.g:4926:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    {
                    // InternalEcl.g:4926:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( ((LA61_0>=RULE_DASH && LA61_0<=RULE_UNDERSCORE)) ) {
                        alt61=1;
                    }
                    else if ( (LA61_0==RULE_ROUND_OPEN) ) {
                        alt61=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }
                    switch (alt61) {
                        case 1 :
                            // InternalEcl.g:4927:6: lv_history_4_1= ruleHistoryProfile
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_32);
                            lv_history_4_1=ruleHistoryProfile();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getHistorySupplementRule());
                              						}
                              						set(
                              							current,
                              							"history",
                              							lv_history_4_1,
                              							"com.b2international.snomed.ecl.Ecl.HistoryProfile");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;
                        case 2 :
                            // InternalEcl.g:4943:6: lv_history_4_2= ruleNestedExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_32);
                            lv_history_4_2=ruleNestedExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						if (current==null) {
                              							current = createModelElementForParent(grammarAccess.getHistorySupplementRule());
                              						}
                              						set(
                              							current,
                              							"history",
                              							lv_history_4_2,
                              							"com.b2international.snomed.ecl.Ecl.NestedExpression");
                              						afterParserOrEnumRuleCall();
                              					
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            this_DOUBLE_CURLY_CLOSE_5=(Token)match(input,RULE_DOUBLE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_CLOSE_5, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHistorySupplement"


    // $ANTLR start "entryRuleHistoryProfile"
    // InternalEcl.g:4969:1: entryRuleHistoryProfile returns [EObject current=null] : iv_ruleHistoryProfile= ruleHistoryProfile EOF ;
    public final EObject entryRuleHistoryProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistoryProfile = null;


        try {
            // InternalEcl.g:4969:55: (iv_ruleHistoryProfile= ruleHistoryProfile EOF )
            // InternalEcl.g:4970:2: iv_ruleHistoryProfile= ruleHistoryProfile EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHistoryProfileRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHistoryProfile=ruleHistoryProfile();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHistoryProfile; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHistoryProfile"


    // $ANTLR start "ruleHistoryProfile"
    // InternalEcl.g:4976:1: ruleHistoryProfile returns [EObject current=null] : ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) ;
    public final EObject ruleHistoryProfile() throws RecognitionException {
        EObject current = null;

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        AntlrDatatypeRuleToken lv_profile_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4982:2: ( ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) )
            // InternalEcl.g:4983:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            {
            // InternalEcl.g:4983:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            // InternalEcl.g:4984:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            {
            // InternalEcl.g:4984:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_DASH) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_UNDERSCORE) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalEcl.g:4985:4: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_0, grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:4990:4: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FollowSets000.FOLLOW_51); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNDERSCORE_1, grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:4995:3: ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            // InternalEcl.g:4996:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            {
            // InternalEcl.g:4996:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            // InternalEcl.g:4997:5: lv_profile_2_0= ruleHISTORY_PROFILE_TYPE
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getHistoryProfileAccess().getProfileHISTORY_PROFILE_TYPEParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_profile_2_0=ruleHISTORY_PROFILE_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getHistoryProfileRule());
              					}
              					set(
              						current,
              						"profile",
              						lv_profile_2_0,
              						"com.b2international.snomed.ecl.Ecl.HISTORY_PROFILE_TYPE");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHistoryProfile"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalEcl.g:5018:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5020:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalEcl.g:5021:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSnomedIdentifier=ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSnomedIdentifier.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // InternalEcl.g:5030:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5037:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEcl.g:5038:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEcl.g:5038:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt64=0;
            loop64:
            do {
                int alt64=3;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_DIGIT_NONZERO) ) {
                    int LA64_2 = input.LA(2);

                    if ( (synpred91_InternalEcl()) ) {
                        alt64=1;
                    }


                }
                else if ( (LA64_0==RULE_DIGIT_ZERO) ) {
                    int LA64_3 = input.LA(2);

                    if ( (synpred92_InternalEcl()) ) {
                        alt64=2;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalEcl.g:5039:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5047:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalEcl.g:5061:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5063:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEcl.g:5064:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeInteger=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalEcl.g:5073:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5080:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEcl.g:5081:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEcl.g:5081:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt65=0;
            loop65:
            do {
                int alt65=3;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==RULE_DIGIT_NONZERO) ) {
                    alt65=1;
                }
                else if ( (LA65_0==RULE_DIGIT_ZERO) ) {
                    alt65=2;
                }


                switch (alt65) {
            	case 1 :
            	    // InternalEcl.g:5082:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5090:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt65 >= 1 ) break loop65;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(65, input);
                        throw eee;
                }
                cnt65++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalEcl.g:5104:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5106:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEcl.g:5107:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNonNegativeDecimal=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNonNegativeDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // InternalEcl.g:5116:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_DIGIT_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5123:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) )
            // InternalEcl.g:5124:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            {
            // InternalEcl.g:5124:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            // InternalEcl.g:5125:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_53);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5142:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            loop66:
            do {
                int alt66=3;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_DIGIT_NONZERO) ) {
                    alt66=1;
                }
                else if ( (LA66_0==RULE_DIGIT_ZERO) ) {
                    alt66=2;
                }


                switch (alt66) {
            	case 1 :
            	    // InternalEcl.g:5143:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5151:4: this_DIGIT_ZERO_3= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_3=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNonNegativeDecimal"


    // $ANTLR start "entryRuleMaxValue"
    // InternalEcl.g:5166:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5168:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEcl.g:5169:2: iv_ruleMaxValue= ruleMaxValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMaxValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMaxValue=ruleMaxValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMaxValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalEcl.g:5178:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5185:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEcl.g:5186:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEcl.g:5186:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_DIGIT_NONZERO && LA67_0<=RULE_DIGIT_ZERO)) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_WILDCARD) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalEcl.g:5187:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonNegativeInteger_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5198:3: this_WILDCARD_1= RULE_WILDCARD
                    {
                    this_WILDCARD_1=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILDCARD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILDCARD_1, grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleInteger"
    // InternalEcl.g:5212:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5214:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEcl.g:5215:2: iv_ruleInteger= ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleInteger=ruleInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleInteger.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalEcl.g:5224:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5231:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEcl.g:5232:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEcl.g:5232:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEcl.g:5233:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEcl.g:5233:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_PLUS) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_DASH) ) {
                alt68=2;
            }
            switch (alt68) {
                case 1 :
                    // InternalEcl.g:5234:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5242:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeInteger_2=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // InternalEcl.g:5267:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5269:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEcl.g:5270:2: iv_ruleDecimal= ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDecimal=ruleDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDecimal.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalEcl.g:5279:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5286:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEcl.g:5287:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEcl.g:5287:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEcl.g:5288:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEcl.g:5288:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_PLUS) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_DASH) ) {
                alt69=2;
            }
            switch (alt69) {
                case 1 :
                    // InternalEcl.g:5289:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5297:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DASH_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_1, grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_2);
            this_NonNegativeDecimal_2=ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeDecimal_2);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleBoolean"
    // InternalEcl.g:5322:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5324:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEcl.g:5325:2: iv_ruleBoolean= ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBoolean=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEcl.g:5334:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_KEYWORD_0=null;
        Token this_FALSE_KEYWORD_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5341:2: ( (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) )
            // InternalEcl.g:5342:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            {
            // InternalEcl.g:5342:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_TRUE_KEYWORD) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_FALSE_KEYWORD) ) {
                alt70=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalEcl.g:5343:3: this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD
                    {
                    this_TRUE_KEYWORD_0=(Token)match(input,RULE_TRUE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_KEYWORD_0, grammarAccess.getBooleanAccess().getTRUE_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5351:3: this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD
                    {
                    this_FALSE_KEYWORD_1=(Token)match(input,RULE_FALSE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FALSE_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FALSE_KEYWORD_1, grammarAccess.getBooleanAccess().getFALSE_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleActiveBoolean"
    // InternalEcl.g:5365:1: entryRuleActiveBoolean returns [String current=null] : iv_ruleActiveBoolean= ruleActiveBoolean EOF ;
    public final String entryRuleActiveBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActiveBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5367:2: (iv_ruleActiveBoolean= ruleActiveBoolean EOF )
            // InternalEcl.g:5368:2: iv_ruleActiveBoolean= ruleActiveBoolean EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getActiveBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleActiveBoolean=ruleActiveBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleActiveBoolean.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleActiveBoolean"


    // $ANTLR start "ruleActiveBoolean"
    // InternalEcl.g:5377:1: ruleActiveBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleActiveBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;

        AntlrDatatypeRuleToken this_Boolean_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5384:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) )
            // InternalEcl.g:5385:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            {
            // InternalEcl.g:5385:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( ((LA71_0>=RULE_DIGIT_NONZERO && LA71_0<=RULE_DIGIT_ZERO)) ) {
                alt71=1;
            }
            else if ( ((LA71_0>=RULE_TRUE_KEYWORD && LA71_0<=RULE_FALSE_KEYWORD)) ) {
                alt71=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalEcl.g:5386:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActiveBooleanAccess().getNonNegativeIntegerParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NonNegativeInteger_0=ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NonNegativeInteger_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5397:3: this_Boolean_1= ruleBoolean
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getActiveBooleanAccess().getBooleanParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Boolean_1=ruleBoolean();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_Boolean_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleActiveBoolean"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalEcl.g:5414:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalEcl.g:5414:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalEcl.g:5415:2: iv_ruleUnquotedString= ruleUnquotedString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getUnquotedStringRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleUnquotedString=ruleUnquotedString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleUnquotedString.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnquotedString"


    // $ANTLR start "ruleUnquotedString"
    // InternalEcl.g:5421:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_30= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_31= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_32= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_33= RULE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleUnquotedString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_HISTORY_KEYWORD_0=null;
        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_1=null;
        Token this_DEFINITION_STATUS_ID_KEYWORD_2=null;
        Token this_DEFINITION_STATUS_TOKEN_KEYWORD_3=null;
        Token this_LANGUAGE_REFSET_ID_KEYWORD_4=null;
        Token this_EFFECTIVE_TIME_KEYWORD_5=null;
        Token this_ACCEPTABLE_IN_KEYWORD_6=null;
        Token this_PREFERRED_IN_KEYWORD_7=null;
        Token this_SEMANTIC_TAG_KEYWORD_8=null;
        Token this_DIALECTID_KEYWORD_9=null;
        Token this_LANGUAGE_KEYWORD_10=null;
        Token this_MODULEID_KEYWORD_11=null;
        Token this_DIALECT_KEYWORD_12=null;
        Token this_ACTIVE_KEYWORD_13=null;
        Token this_TYPEID_KEYWORD_14=null;
        Token this_EXCLUSION_KEYWORD_15=null;
        Token this_EXACT_KEYWORD_16=null;
        Token this_FALSE_KEYWORD_17=null;
        Token this_MATCH_KEYWORD_18=null;
        Token this_REGEX_KEYWORD_19=null;
        Token this_TERM_KEYWORD_20=null;
        Token this_TRUE_KEYWORD_21=null;
        Token this_TYPE_KEYWORD_22=null;
        Token this_WILD_KEYWORD_23=null;
        Token this_MIN_KEYWORD_24=null;
        Token this_MOD_KEYWORD_25=null;
        Token this_MAX_KEYWORD_26=null;
        Token this_CONJUNCTION_KEYWORD_27=null;
        Token this_DISJUNCTION_KEYWORD_28=null;
        Token this_REVERSED_29=null;
        Token this_MEMBER_SHORT_KEYWORD_30=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_31=null;
        Token this_CONCEPT_SHORT_KEYWORD_32=null;
        Token this_KEYWORD_33=null;


        	enterRule();

        try {
            // InternalEcl.g:5427:2: ( (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_30= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_31= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_32= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_33= RULE_KEYWORD ) )
            // InternalEcl.g:5428:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_30= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_31= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_32= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_33= RULE_KEYWORD )
            {
            // InternalEcl.g:5428:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_30= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_31= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_32= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_33= RULE_KEYWORD )
            int alt72=34;
            switch ( input.LA(1) ) {
            case RULE_HISTORY_KEYWORD:
                {
                alt72=1;
                }
                break;
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt72=2;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
                {
                alt72=3;
                }
                break;
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt72=4;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt72=5;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt72=6;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt72=7;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt72=8;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt72=9;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
                {
                alt72=10;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt72=11;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt72=12;
                }
                break;
            case RULE_DIALECT_KEYWORD:
                {
                alt72=13;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt72=14;
                }
                break;
            case RULE_TYPEID_KEYWORD:
                {
                alt72=15;
                }
                break;
            case RULE_EXCLUSION_KEYWORD:
                {
                alt72=16;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt72=17;
                }
                break;
            case RULE_FALSE_KEYWORD:
                {
                alt72=18;
                }
                break;
            case RULE_MATCH_KEYWORD:
                {
                alt72=19;
                }
                break;
            case RULE_REGEX_KEYWORD:
                {
                alt72=20;
                }
                break;
            case RULE_TERM_KEYWORD:
                {
                alt72=21;
                }
                break;
            case RULE_TRUE_KEYWORD:
                {
                alt72=22;
                }
                break;
            case RULE_TYPE_KEYWORD:
                {
                alt72=23;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt72=24;
                }
                break;
            case RULE_MIN_KEYWORD:
                {
                alt72=25;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt72=26;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt72=27;
                }
                break;
            case RULE_CONJUNCTION_KEYWORD:
                {
                alt72=28;
                }
                break;
            case RULE_DISJUNCTION_KEYWORD:
                {
                alt72=29;
                }
                break;
            case RULE_REVERSED:
                {
                alt72=30;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt72=31;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt72=32;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt72=33;
                }
                break;
            case RULE_KEYWORD:
                {
                alt72=34;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalEcl.g:5429:3: this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD
                    {
                    this_HISTORY_KEYWORD_0=(Token)match(input,RULE_HISTORY_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_HISTORY_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_HISTORY_KEYWORD_0, grammarAccess.getUnquotedStringAccess().getHISTORY_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5437:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                    {
                    this_CASE_SIGNIFICANCE_ID_KEYWORD_1=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CASE_SIGNIFICANCE_ID_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_1, grammarAccess.getUnquotedStringAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5445:3: this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD
                    {
                    this_DEFINITION_STATUS_ID_KEYWORD_2=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFINITION_STATUS_ID_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_2, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:5453:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD
                    {
                    this_DEFINITION_STATUS_TOKEN_KEYWORD_3=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DEFINITION_STATUS_TOKEN_KEYWORD_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_3, grammarAccess.getUnquotedStringAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:5461:3: this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD
                    {
                    this_LANGUAGE_REFSET_ID_KEYWORD_4=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LANGUAGE_REFSET_ID_KEYWORD_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_4, grammarAccess.getUnquotedStringAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:5469:3: this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD
                    {
                    this_EFFECTIVE_TIME_KEYWORD_5=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EFFECTIVE_TIME_KEYWORD_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_5, grammarAccess.getUnquotedStringAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_5());
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:5477:3: this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD
                    {
                    this_ACCEPTABLE_IN_KEYWORD_6=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ACCEPTABLE_IN_KEYWORD_6);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_6, grammarAccess.getUnquotedStringAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_6());
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEcl.g:5485:3: this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD
                    {
                    this_PREFERRED_IN_KEYWORD_7=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_PREFERRED_IN_KEYWORD_7);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_PREFERRED_IN_KEYWORD_7, grammarAccess.getUnquotedStringAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_7());
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEcl.g:5493:3: this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD
                    {
                    this_SEMANTIC_TAG_KEYWORD_8=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_SEMANTIC_TAG_KEYWORD_8);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_SEMANTIC_TAG_KEYWORD_8, grammarAccess.getUnquotedStringAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_8());
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEcl.g:5501:3: this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD
                    {
                    this_DIALECTID_KEYWORD_9=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIALECTID_KEYWORD_9);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIALECTID_KEYWORD_9, grammarAccess.getUnquotedStringAccess().getDIALECTID_KEYWORDTerminalRuleCall_9());
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEcl.g:5509:3: this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD
                    {
                    this_LANGUAGE_KEYWORD_10=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LANGUAGE_KEYWORD_10);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LANGUAGE_KEYWORD_10, grammarAccess.getUnquotedStringAccess().getLANGUAGE_KEYWORDTerminalRuleCall_10());
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEcl.g:5517:3: this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD
                    {
                    this_MODULEID_KEYWORD_11=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MODULEID_KEYWORD_11);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MODULEID_KEYWORD_11, grammarAccess.getUnquotedStringAccess().getMODULEID_KEYWORDTerminalRuleCall_11());
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEcl.g:5525:3: this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD
                    {
                    this_DIALECT_KEYWORD_12=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DIALECT_KEYWORD_12);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DIALECT_KEYWORD_12, grammarAccess.getUnquotedStringAccess().getDIALECT_KEYWORDTerminalRuleCall_12());
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEcl.g:5533:3: this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD
                    {
                    this_ACTIVE_KEYWORD_13=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ACTIVE_KEYWORD_13);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ACTIVE_KEYWORD_13, grammarAccess.getUnquotedStringAccess().getACTIVE_KEYWORDTerminalRuleCall_13());
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalEcl.g:5541:3: this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD
                    {
                    this_TYPEID_KEYWORD_14=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPEID_KEYWORD_14);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPEID_KEYWORD_14, grammarAccess.getUnquotedStringAccess().getTYPEID_KEYWORDTerminalRuleCall_14());
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalEcl.g:5549:3: this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD
                    {
                    this_EXCLUSION_KEYWORD_15=(Token)match(input,RULE_EXCLUSION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXCLUSION_KEYWORD_15);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXCLUSION_KEYWORD_15, grammarAccess.getUnquotedStringAccess().getEXCLUSION_KEYWORDTerminalRuleCall_15());
                      		
                    }

                    }
                    break;
                case 17 :
                    // InternalEcl.g:5557:3: this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD
                    {
                    this_EXACT_KEYWORD_16=(Token)match(input,RULE_EXACT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXACT_KEYWORD_16);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXACT_KEYWORD_16, grammarAccess.getUnquotedStringAccess().getEXACT_KEYWORDTerminalRuleCall_16());
                      		
                    }

                    }
                    break;
                case 18 :
                    // InternalEcl.g:5565:3: this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD
                    {
                    this_FALSE_KEYWORD_17=(Token)match(input,RULE_FALSE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_FALSE_KEYWORD_17);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_FALSE_KEYWORD_17, grammarAccess.getUnquotedStringAccess().getFALSE_KEYWORDTerminalRuleCall_17());
                      		
                    }

                    }
                    break;
                case 19 :
                    // InternalEcl.g:5573:3: this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD
                    {
                    this_MATCH_KEYWORD_18=(Token)match(input,RULE_MATCH_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MATCH_KEYWORD_18);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MATCH_KEYWORD_18, grammarAccess.getUnquotedStringAccess().getMATCH_KEYWORDTerminalRuleCall_18());
                      		
                    }

                    }
                    break;
                case 20 :
                    // InternalEcl.g:5581:3: this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD
                    {
                    this_REGEX_KEYWORD_19=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REGEX_KEYWORD_19);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REGEX_KEYWORD_19, grammarAccess.getUnquotedStringAccess().getREGEX_KEYWORDTerminalRuleCall_19());
                      		
                    }

                    }
                    break;
                case 21 :
                    // InternalEcl.g:5589:3: this_TERM_KEYWORD_20= RULE_TERM_KEYWORD
                    {
                    this_TERM_KEYWORD_20=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TERM_KEYWORD_20);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TERM_KEYWORD_20, grammarAccess.getUnquotedStringAccess().getTERM_KEYWORDTerminalRuleCall_20());
                      		
                    }

                    }
                    break;
                case 22 :
                    // InternalEcl.g:5597:3: this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD
                    {
                    this_TRUE_KEYWORD_21=(Token)match(input,RULE_TRUE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TRUE_KEYWORD_21);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TRUE_KEYWORD_21, grammarAccess.getUnquotedStringAccess().getTRUE_KEYWORDTerminalRuleCall_21());
                      		
                    }

                    }
                    break;
                case 23 :
                    // InternalEcl.g:5605:3: this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD
                    {
                    this_TYPE_KEYWORD_22=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_TYPE_KEYWORD_22);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_TYPE_KEYWORD_22, grammarAccess.getUnquotedStringAccess().getTYPE_KEYWORDTerminalRuleCall_22());
                      		
                    }

                    }
                    break;
                case 24 :
                    // InternalEcl.g:5613:3: this_WILD_KEYWORD_23= RULE_WILD_KEYWORD
                    {
                    this_WILD_KEYWORD_23=(Token)match(input,RULE_WILD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILD_KEYWORD_23);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILD_KEYWORD_23, grammarAccess.getUnquotedStringAccess().getWILD_KEYWORDTerminalRuleCall_23());
                      		
                    }

                    }
                    break;
                case 25 :
                    // InternalEcl.g:5621:3: this_MIN_KEYWORD_24= RULE_MIN_KEYWORD
                    {
                    this_MIN_KEYWORD_24=(Token)match(input,RULE_MIN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MIN_KEYWORD_24);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MIN_KEYWORD_24, grammarAccess.getUnquotedStringAccess().getMIN_KEYWORDTerminalRuleCall_24());
                      		
                    }

                    }
                    break;
                case 26 :
                    // InternalEcl.g:5629:3: this_MOD_KEYWORD_25= RULE_MOD_KEYWORD
                    {
                    this_MOD_KEYWORD_25=(Token)match(input,RULE_MOD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MOD_KEYWORD_25);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MOD_KEYWORD_25, grammarAccess.getUnquotedStringAccess().getMOD_KEYWORDTerminalRuleCall_25());
                      		
                    }

                    }
                    break;
                case 27 :
                    // InternalEcl.g:5637:3: this_MAX_KEYWORD_26= RULE_MAX_KEYWORD
                    {
                    this_MAX_KEYWORD_26=(Token)match(input,RULE_MAX_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MAX_KEYWORD_26);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MAX_KEYWORD_26, grammarAccess.getUnquotedStringAccess().getMAX_KEYWORDTerminalRuleCall_26());
                      		
                    }

                    }
                    break;
                case 28 :
                    // InternalEcl.g:5645:3: this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD
                    {
                    this_CONJUNCTION_KEYWORD_27=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONJUNCTION_KEYWORD_27);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONJUNCTION_KEYWORD_27, grammarAccess.getUnquotedStringAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_27());
                      		
                    }

                    }
                    break;
                case 29 :
                    // InternalEcl.g:5653:3: this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD
                    {
                    this_DISJUNCTION_KEYWORD_28=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DISJUNCTION_KEYWORD_28);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DISJUNCTION_KEYWORD_28, grammarAccess.getUnquotedStringAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_28());
                      		
                    }

                    }
                    break;
                case 30 :
                    // InternalEcl.g:5661:3: this_REVERSED_29= RULE_REVERSED
                    {
                    this_REVERSED_29=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REVERSED_29);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REVERSED_29, grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_29());
                      		
                    }

                    }
                    break;
                case 31 :
                    // InternalEcl.g:5669:3: this_MEMBER_SHORT_KEYWORD_30= RULE_MEMBER_SHORT_KEYWORD
                    {
                    this_MEMBER_SHORT_KEYWORD_30=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MEMBER_SHORT_KEYWORD_30);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MEMBER_SHORT_KEYWORD_30, grammarAccess.getUnquotedStringAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_30());
                      		
                    }

                    }
                    break;
                case 32 :
                    // InternalEcl.g:5677:3: this_DESCRIPTION_SHORT_KEYWORD_31= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_31=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_31);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_31, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_31());
                      		
                    }

                    }
                    break;
                case 33 :
                    // InternalEcl.g:5685:3: this_CONCEPT_SHORT_KEYWORD_32= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_32=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_32);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_32, grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_32());
                      		
                    }

                    }
                    break;
                case 34 :
                    // InternalEcl.g:5693:3: this_KEYWORD_33= RULE_KEYWORD
                    {
                    this_KEYWORD_33=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_33);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_KEYWORD_33, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_33());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnquotedString"


    // $ANTLR start "entryRuleDialectAliasValue"
    // InternalEcl.g:5704:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5706:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEcl.g:5707:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDialectAliasValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDialectAliasValue=ruleDialectAliasValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDialectAliasValue.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleDialectAliasValue"


    // $ANTLR start "ruleDialectAliasValue"
    // InternalEcl.g:5716:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ ;
    public final AntlrDatatypeRuleToken ruleDialectAliasValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_DIGIT_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5723:2: ( (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ )
            // InternalEcl.g:5724:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            {
            // InternalEcl.g:5724:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            int cnt73=0;
            loop73:
            do {
                int alt73=5;
                alt73 = dfa73.predict(input);
                switch (alt73) {
            	case 1 :
            	    // InternalEcl.g:5725:3: this_DASH_0= RULE_DASH
            	    {
            	    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DASH_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5733:3: this_UnquotedString_1= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FollowSets000.FOLLOW_54);
            	    this_UnquotedString_1=ruleUnquotedString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_UnquotedString_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			afterParserOrEnumRuleCall();
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEcl.g:5744:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_2, grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEcl.g:5752:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt73 >= 1 ) break loop73;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(73, input);
                        throw eee;
                }
                cnt73++;
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleDialectAliasValue"


    // $ANTLR start "entryRuleLEXICAL_SEARCH_TYPE"
    // InternalEcl.g:5766:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEcl.g:5766:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEcl.g:5767:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLEXICAL_SEARCH_TYPERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLEXICAL_SEARCH_TYPE=ruleLEXICAL_SEARCH_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLEXICAL_SEARCH_TYPE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLEXICAL_SEARCH_TYPE"


    // $ANTLR start "ruleLEXICAL_SEARCH_TYPE"
    // InternalEcl.g:5773:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MATCH_KEYWORD_0=null;
        Token this_WILD_KEYWORD_1=null;
        Token this_EXACT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:5779:2: ( (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) )
            // InternalEcl.g:5780:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            {
            // InternalEcl.g:5780:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            int alt74=3;
            switch ( input.LA(1) ) {
            case RULE_MATCH_KEYWORD:
                {
                alt74=1;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt74=2;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt74=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;
            }

            switch (alt74) {
                case 1 :
                    // InternalEcl.g:5781:3: this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD
                    {
                    this_MATCH_KEYWORD_0=(Token)match(input,RULE_MATCH_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MATCH_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MATCH_KEYWORD_0, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMATCH_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5789:3: this_WILD_KEYWORD_1= RULE_WILD_KEYWORD
                    {
                    this_WILD_KEYWORD_1=(Token)match(input,RULE_WILD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILD_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILD_KEYWORD_1, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWILD_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5797:3: this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD
                    {
                    this_EXACT_KEYWORD_2=(Token)match(input,RULE_EXACT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EXACT_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EXACT_KEYWORD_2, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getEXACT_KEYWORDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLEXICAL_SEARCH_TYPE"


    // $ANTLR start "entryRuleHISTORY_PROFILE_TYPE"
    // InternalEcl.g:5808:1: entryRuleHISTORY_PROFILE_TYPE returns [String current=null] : iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF ;
    public final String entryRuleHISTORY_PROFILE_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHISTORY_PROFILE_TYPE = null;


        try {
            // InternalEcl.g:5808:60: (iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF )
            // InternalEcl.g:5809:2: iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getHISTORY_PROFILE_TYPERule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleHISTORY_PROFILE_TYPE=ruleHISTORY_PROFILE_TYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleHISTORY_PROFILE_TYPE.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHISTORY_PROFILE_TYPE"


    // $ANTLR start "ruleHISTORY_PROFILE_TYPE"
    // InternalEcl.g:5815:1: ruleHISTORY_PROFILE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleHISTORY_PROFILE_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIN_KEYWORD_0=null;
        Token this_MOD_KEYWORD_1=null;
        Token this_MAX_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:5821:2: ( (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) )
            // InternalEcl.g:5822:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            {
            // InternalEcl.g:5822:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            int alt75=3;
            switch ( input.LA(1) ) {
            case RULE_MIN_KEYWORD:
                {
                alt75=1;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt75=2;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt75=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // InternalEcl.g:5823:3: this_MIN_KEYWORD_0= RULE_MIN_KEYWORD
                    {
                    this_MIN_KEYWORD_0=(Token)match(input,RULE_MIN_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MIN_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MIN_KEYWORD_0, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMIN_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5831:3: this_MOD_KEYWORD_1= RULE_MOD_KEYWORD
                    {
                    this_MOD_KEYWORD_1=(Token)match(input,RULE_MOD_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MOD_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MOD_KEYWORD_1, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMOD_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5839:3: this_MAX_KEYWORD_2= RULE_MAX_KEYWORD
                    {
                    this_MAX_KEYWORD_2=(Token)match(input,RULE_MAX_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MAX_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MAX_KEYWORD_2, grammarAccess.getHISTORY_PROFILE_TYPEAccess().getMAX_KEYWORDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleHISTORY_PROFILE_TYPE"


    // $ANTLR start "entryRuleSHORT_DOMAIN"
    // InternalEcl.g:5850:1: entryRuleSHORT_DOMAIN returns [String current=null] : iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF ;
    public final String entryRuleSHORT_DOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSHORT_DOMAIN = null;


        try {
            // InternalEcl.g:5850:52: (iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF )
            // InternalEcl.g:5851:2: iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSHORT_DOMAINRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSHORT_DOMAIN=ruleSHORT_DOMAIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSHORT_DOMAIN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSHORT_DOMAIN"


    // $ANTLR start "ruleSHORT_DOMAIN"
    // InternalEcl.g:5857:1: ruleSHORT_DOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleSHORT_DOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONCEPT_SHORT_KEYWORD_0=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_1=null;
        Token this_MEMBER_SHORT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:5863:2: ( (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD ) )
            // InternalEcl.g:5864:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD )
            {
            // InternalEcl.g:5864:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD )
            int alt76=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt76=1;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt76=2;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt76=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // InternalEcl.g:5865:3: this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_0=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_0, grammarAccess.getSHORT_DOMAINAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5873:3: this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_1=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_1, grammarAccess.getSHORT_DOMAINAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5881:3: this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD
                    {
                    this_MEMBER_SHORT_KEYWORD_2=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MEMBER_SHORT_KEYWORD_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MEMBER_SHORT_KEYWORD_2, grammarAccess.getSHORT_DOMAINAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSHORT_DOMAIN"


    // $ANTLR start "entryRuleNON_NUMERIC_OPERATOR"
    // InternalEcl.g:5892:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:5892:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEcl.g:5893:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNON_NUMERIC_OPERATORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNON_NUMERIC_OPERATOR=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNON_NUMERIC_OPERATOR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNON_NUMERIC_OPERATOR"


    // $ANTLR start "ruleNON_NUMERIC_OPERATOR"
    // InternalEcl.g:5899:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEcl.g:5905:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEcl.g:5906:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEcl.g:5906:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_EQUAL) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_NOT_EQUAL) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalEcl.g:5907:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUAL_0, grammarAccess.getNON_NUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5915:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NOT_EQUAL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNON_NUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNON_NUMERIC_OPERATOR"


    // $ANTLR start "entryRuleNUMERIC_OPERATOR"
    // InternalEcl.g:5926:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:5926:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEcl.g:5927:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNUMERIC_OPERATORRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleNUMERIC_OPERATOR=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNUMERIC_OPERATOR.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNUMERIC_OPERATOR"


    // $ANTLR start "ruleNUMERIC_OPERATOR"
    // InternalEcl.g:5933:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
    public final AntlrDatatypeRuleToken ruleNUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;
        Token this_GT_2=null;
        Token this_LT_3=null;
        Token this_GTE_4=null;
        Token this_LTE_5=null;


        	enterRule();

        try {
            // InternalEcl.g:5939:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEcl.g:5940:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEcl.g:5940:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt78=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt78=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt78=2;
                }
                break;
            case RULE_GT:
                {
                alt78=3;
                }
                break;
            case RULE_LT:
                {
                alt78=4;
                }
                break;
            case RULE_GTE:
                {
                alt78=5;
                }
                break;
            case RULE_LTE:
                {
                alt78=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // InternalEcl.g:5941:3: this_EQUAL_0= RULE_EQUAL
                    {
                    this_EQUAL_0=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_EQUAL_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_EQUAL_0, grammarAccess.getNUMERIC_OPERATORAccess().getEQUALTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5949:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
                    {
                    this_NOT_EQUAL_1=(Token)match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_NOT_EQUAL_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_NOT_EQUAL_1, grammarAccess.getNUMERIC_OPERATORAccess().getNOT_EQUALTerminalRuleCall_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5957:3: this_GT_2= RULE_GT
                    {
                    this_GT_2=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GT_2);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GT_2, grammarAccess.getNUMERIC_OPERATORAccess().getGTTerminalRuleCall_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:5965:3: this_LT_3= RULE_LT
                    {
                    this_LT_3=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LT_3);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LT_3, grammarAccess.getNUMERIC_OPERATORAccess().getLTTerminalRuleCall_3());
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:5973:3: this_GTE_4= RULE_GTE
                    {
                    this_GTE_4=(Token)match(input,RULE_GTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_GTE_4);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_GTE_4, grammarAccess.getNUMERIC_OPERATORAccess().getGTETerminalRuleCall_4());
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:5981:3: this_LTE_5= RULE_LTE
                    {
                    this_LTE_5=(Token)match(input,RULE_LTE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_LTE_5);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_LTE_5, grammarAccess.getNUMERIC_OPERATORAccess().getLTETerminalRuleCall_5());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNUMERIC_OPERATOR"

    // $ANTLR start synpred28_InternalEcl
    public final void synpred28_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1469:4: ( RULE_DISJUNCTION_KEYWORD )
        // InternalEcl.g:1469:5: RULE_DISJUNCTION_KEYWORD
        {
        match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred28_InternalEcl

    // $ANTLR start synpred30_InternalEcl
    public final void synpred30_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1537:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )
        // InternalEcl.g:
        {
        if ( (input.LA(1)>=RULE_CONJUNCTION_KEYWORD && input.LA(1)<=RULE_COMMA) ) {
            input.consume();
            state.errorRecovery=false;state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }
    }
    // $ANTLR end synpred30_InternalEcl

    // $ANTLR start synpred32_InternalEcl
    public final void synpred32_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:1600:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:1600:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred32_InternalEcl

    // $ANTLR start synpred33_InternalEcl
    public final void synpred33_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalEcl.g:1612:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEcl.g:1612:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EclAttributeGroup_1=ruleEclAttributeGroup();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred33_InternalEcl

    // $ANTLR start synpred38_InternalEcl
    public final void synpred38_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:1930:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:1930:3: this_AttributeConstraint_0= ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AttributeConstraint_0=ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred38_InternalEcl

    // $ANTLR start synpred51_InternalEcl
    public final void synpred51_InternalEcl_fragment() throws RecognitionException {   
        EObject this_TermFilter_0 = null;


        // InternalEcl.g:2922:3: (this_TermFilter_0= ruleTermFilter )
        // InternalEcl.g:2922:3: this_TermFilter_0= ruleTermFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TermFilter_0=ruleTermFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred51_InternalEcl

    // $ANTLR start synpred52_InternalEcl
    public final void synpred52_InternalEcl_fragment() throws RecognitionException {   
        EObject this_LanguageFilter_1 = null;


        // InternalEcl.g:2934:3: (this_LanguageFilter_1= ruleLanguageFilter )
        // InternalEcl.g:2934:3: this_LanguageFilter_1= ruleLanguageFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_LanguageFilter_1=ruleLanguageFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred52_InternalEcl

    // $ANTLR start synpred53_InternalEcl
    public final void synpred53_InternalEcl_fragment() throws RecognitionException {   
        EObject this_TypeFilter_2 = null;


        // InternalEcl.g:2946:3: (this_TypeFilter_2= ruleTypeFilter )
        // InternalEcl.g:2946:3: this_TypeFilter_2= ruleTypeFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_TypeFilter_2=ruleTypeFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred53_InternalEcl

    // $ANTLR start synpred54_InternalEcl
    public final void synpred54_InternalEcl_fragment() throws RecognitionException {   
        EObject this_DialectFilter_3 = null;


        // InternalEcl.g:2958:3: (this_DialectFilter_3= ruleDialectFilter )
        // InternalEcl.g:2958:3: this_DialectFilter_3= ruleDialectFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_DialectFilter_3=ruleDialectFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalEcl

    // $ANTLR start synpred55_InternalEcl
    public final void synpred55_InternalEcl_fragment() throws RecognitionException {   
        EObject this_DefinitionStatusFilter_4 = null;


        // InternalEcl.g:2970:3: (this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter )
        // InternalEcl.g:2970:3: this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_DefinitionStatusFilter_4=ruleDefinitionStatusFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalEcl

    // $ANTLR start synpred56_InternalEcl
    public final void synpred56_InternalEcl_fragment() throws RecognitionException {   
        EObject this_ModuleFilter_5 = null;


        // InternalEcl.g:2982:3: (this_ModuleFilter_5= ruleModuleFilter )
        // InternalEcl.g:2982:3: this_ModuleFilter_5= ruleModuleFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ModuleFilter_5=ruleModuleFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalEcl

    // $ANTLR start synpred57_InternalEcl
    public final void synpred57_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EffectiveTimeFilter_6 = null;


        // InternalEcl.g:2994:3: (this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter )
        // InternalEcl.g:2994:3: this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EffectiveTimeFilter_6=ruleEffectiveTimeFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalEcl

    // $ANTLR start synpred58_InternalEcl
    public final void synpred58_InternalEcl_fragment() throws RecognitionException {   
        EObject this_ActiveFilter_7 = null;


        // InternalEcl.g:3006:3: (this_ActiveFilter_7= ruleActiveFilter )
        // InternalEcl.g:3006:3: this_ActiveFilter_7= ruleActiveFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ActiveFilter_7=ruleActiveFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred58_InternalEcl

    // $ANTLR start synpred59_InternalEcl
    public final void synpred59_InternalEcl_fragment() throws RecognitionException {   
        EObject this_SemanticTagFilter_8 = null;


        // InternalEcl.g:3018:3: (this_SemanticTagFilter_8= ruleSemanticTagFilter )
        // InternalEcl.g:3018:3: this_SemanticTagFilter_8= ruleSemanticTagFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SemanticTagFilter_8=ruleSemanticTagFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred59_InternalEcl

    // $ANTLR start synpred60_InternalEcl
    public final void synpred60_InternalEcl_fragment() throws RecognitionException {   
        EObject this_PreferredInFilter_9 = null;


        // InternalEcl.g:3030:3: (this_PreferredInFilter_9= rulePreferredInFilter )
        // InternalEcl.g:3030:3: this_PreferredInFilter_9= rulePreferredInFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PreferredInFilter_9=rulePreferredInFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred60_InternalEcl

    // $ANTLR start synpred61_InternalEcl
    public final void synpred61_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AcceptableInFilter_10 = null;


        // InternalEcl.g:3042:3: (this_AcceptableInFilter_10= ruleAcceptableInFilter )
        // InternalEcl.g:3042:3: this_AcceptableInFilter_10= ruleAcceptableInFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AcceptableInFilter_10=ruleAcceptableInFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred61_InternalEcl

    // $ANTLR start synpred62_InternalEcl
    public final void synpred62_InternalEcl_fragment() throws RecognitionException {   
        EObject this_LanguageRefSetFilter_11 = null;


        // InternalEcl.g:3054:3: (this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter )
        // InternalEcl.g:3054:3: this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_LanguageRefSetFilter_11=ruleLanguageRefSetFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred62_InternalEcl

    // $ANTLR start synpred63_InternalEcl
    public final void synpred63_InternalEcl_fragment() throws RecognitionException {   
        EObject this_CaseSignificanceFilter_12 = null;


        // InternalEcl.g:3066:3: (this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter )
        // InternalEcl.g:3066:3: this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CaseSignificanceFilter_12=ruleCaseSignificanceFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalEcl

    // $ANTLR start synpred64_InternalEcl
    public final void synpred64_InternalEcl_fragment() throws RecognitionException {   
        EObject this_MemberFieldFilter_13 = null;


        // InternalEcl.g:3078:3: (this_MemberFieldFilter_13= ruleMemberFieldFilter )
        // InternalEcl.g:3078:3: this_MemberFieldFilter_13= ruleMemberFieldFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MemberFieldFilter_13=ruleMemberFieldFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalEcl

    // $ANTLR start synpred75_InternalEcl
    public final void synpred75_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_dialects_2_0 = null;


        // InternalEcl.g:3825:4: ( ( (lv_dialects_2_0= ruleDialect ) ) )
        // InternalEcl.g:3825:4: ( (lv_dialects_2_0= ruleDialect ) )
        {
        // InternalEcl.g:3825:4: ( (lv_dialects_2_0= ruleDialect ) )
        // InternalEcl.g:3826:5: (lv_dialects_2_0= ruleDialect )
        {
        // InternalEcl.g:3826:5: (lv_dialects_2_0= ruleDialect )
        // InternalEcl.g:3827:6: lv_dialects_2_0= ruleDialect
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_0_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_dialects_2_0=ruleDialect();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred75_InternalEcl

    // $ANTLR start synpred79_InternalEcl
    public final void synpred79_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_acceptability_1_0 = null;


        // InternalEcl.g:4007:4: ( (lv_acceptability_1_0= ruleAcceptability ) )
        // InternalEcl.g:4007:4: (lv_acceptability_1_0= ruleAcceptability )
        {
        // InternalEcl.g:4007:4: (lv_acceptability_1_0= ruleAcceptability )
        // InternalEcl.g:4008:5: lv_acceptability_1_0= ruleAcceptability
        {
        if ( state.backtracking==0 ) {

          					newCompositeNode(grammarAccess.getDialectAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
          				
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_acceptability_1_0=ruleAcceptability();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred79_InternalEcl

    // $ANTLR start synpred87_InternalEcl
    public final void synpred87_InternalEcl_fragment() throws RecognitionException {   
        EObject this_FilteredExpressionConstraint_0 = null;


        // InternalEcl.g:4832:3: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint )
        // InternalEcl.g:4832:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalEcl

    // $ANTLR start synpred91_InternalEcl
    public final void synpred91_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_0=null;

        // InternalEcl.g:5039:3: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO )
        // InternalEcl.g:5039:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred91_InternalEcl

    // $ANTLR start synpred92_InternalEcl
    public final void synpred92_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_1=null;

        // InternalEcl.g:5047:3: (this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )
        // InternalEcl.g:5047:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred92_InternalEcl

    // $ANTLR start synpred137_InternalEcl
    public final void synpred137_InternalEcl_fragment() throws RecognitionException {   
        Token this_DASH_0=null;

        // InternalEcl.g:5725:3: (this_DASH_0= RULE_DASH )
        // InternalEcl.g:5725:3: this_DASH_0= RULE_DASH
        {
        this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalEcl

    // $ANTLR start synpred138_InternalEcl
    public final void synpred138_InternalEcl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;


        // InternalEcl.g:5733:3: (this_UnquotedString_1= ruleUnquotedString )
        // InternalEcl.g:5733:3: this_UnquotedString_1= ruleUnquotedString
        {
        if ( state.backtracking==0 ) {

          			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_UnquotedString_1=ruleUnquotedString();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalEcl

    // $ANTLR start synpred139_InternalEcl
    public final void synpred139_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_2=null;

        // InternalEcl.g:5744:3: (this_DIGIT_ZERO_2= RULE_DIGIT_ZERO )
        // InternalEcl.g:5744:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalEcl

    // $ANTLR start synpred140_InternalEcl
    public final void synpred140_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_3=null;

        // InternalEcl.g:5752:3: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )
        // InternalEcl.g:5752:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_InternalEcl

    // Delegated rules

    public final boolean synpred32_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred64_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred64_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred140_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred140_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred53_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred53_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred54_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred75_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred75_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred55_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred62_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred62_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred87_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred87_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred51_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred51_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred33_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred33_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred61_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred61_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred30_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred30_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred38_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred38_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred52_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred52_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred63_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred63_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred139_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred139_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred60_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred60_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred91_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred91_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred92_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred92_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred138_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred138_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred137_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred137_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred59_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred59_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred58_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred58_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred57_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA21 dfa21 = new DFA21(this);
    protected DFA26 dfa26 = new DFA26(this);
    protected DFA31 dfa31 = new DFA31(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA49 dfa49 = new DFA49(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA60 dfa60 = new DFA60(this);
    protected DFA73 dfa73 = new DFA73(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\12\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\71\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\15\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\15\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\11\2\1\1\1\2\2\uffff\1\17\1\uffff\1\20\1\uffff\1\2\34\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1599:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_1 = input.LA(1);

                         
                        int index21_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalEcl()) ) {s = 2;}

                        else if ( (synpred33_InternalEcl()) ) {s = 16;}

                         
                        input.seek(index21_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA21_15 = input.LA(1);

                         
                        int index21_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred32_InternalEcl()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index21_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 21, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\12\16\uffff\1\0\1\uffff";
    static final String dfa_9s = "\1\71\16\uffff\1\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\16\uffff\1\2";
    static final String dfa_11s = "\17\uffff\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\13\1\2\uffff\1\17\3\uffff\1\1\34\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1929:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA26_15 = input.LA(1);

                         
                        int index26_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred38_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index26_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 26, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\14\uffff\2\17\2\uffff";
    static final String dfa_15s = "\1\14\2\27\4\35\1\64\2\uffff\2\70\2\4\2\uffff";
    static final String dfa_16s = "\1\110\2\76\4\35\1\71\2\uffff\4\71\2\uffff";
    static final String dfa_17s = "\10\uffff\1\2\1\1\4\uffff\1\4\1\3";
    static final String dfa_18s = "\20\uffff}>";
    static final String[] dfa_19s = {
            "\1\4\3\uffff\1\3\33\uffff\1\1\31\uffff\1\2\1\5\1\6",
            "\1\10\5\uffff\1\7\3\uffff\2\10\27\uffff\2\11\3\10",
            "\1\10\5\uffff\1\7\3\uffff\2\10\27\uffff\2\11\3\10",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\12\1\uffff\1\13\1\uffff\1\14\1\15",
            "",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\4\17\1\uffff\1\16\16\uffff\1\17\1\uffff\1\17\4\uffff\1\17\30\uffff\1\14\1\15",
            "\4\17\1\uffff\1\16\16\uffff\1\17\1\uffff\1\17\4\uffff\1\17\30\uffff\1\14\1\15",
            "",
            ""
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2279:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_20s = "\61\uffff";
    static final String dfa_21s = "\1\4\20\0\40\uffff";
    static final String dfa_22s = "\1\105\20\0\40\uffff";
    static final String dfa_23s = "\21\uffff\1\16\21\uffff\1\17\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_24s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\40\uffff}>";
    static final String[] dfa_25s = {
            "\2\21\1\uffff\1\21\17\uffff\1\43\3\uffff\1\21\4\uffff\1\1\1\uffff\1\21\1\2\1\3\1\4\1\5\1\6\1\uffff\1\7\1\10\1\11\1\uffff\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\uffff\1\21\4\uffff\14\21",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "2921:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_MemberFieldFilter_13= ruleMemberFieldFilter | this_NestedFilter_14= ruleNestedFilter )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA37_1 = input.LA(1);

                         
                        int index37_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred51_InternalEcl()) ) {s = 36;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA37_2 = input.LA(1);

                         
                        int index37_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred52_InternalEcl()) ) {s = 37;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA37_3 = input.LA(1);

                         
                        int index37_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalEcl()) ) {s = 38;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA37_4 = input.LA(1);

                         
                        int index37_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred53_InternalEcl()) ) {s = 38;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA37_5 = input.LA(1);

                         
                        int index37_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalEcl()) ) {s = 39;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA37_6 = input.LA(1);

                         
                        int index37_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred54_InternalEcl()) ) {s = 39;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA37_7 = input.LA(1);

                         
                        int index37_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalEcl()) ) {s = 40;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA37_8 = input.LA(1);

                         
                        int index37_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred55_InternalEcl()) ) {s = 40;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA37_9 = input.LA(1);

                         
                        int index37_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred56_InternalEcl()) ) {s = 41;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA37_10 = input.LA(1);

                         
                        int index37_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred57_InternalEcl()) ) {s = 42;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA37_11 = input.LA(1);

                         
                        int index37_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred58_InternalEcl()) ) {s = 43;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA37_12 = input.LA(1);

                         
                        int index37_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalEcl()) ) {s = 44;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA37_13 = input.LA(1);

                         
                        int index37_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalEcl()) ) {s = 45;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA37_14 = input.LA(1);

                         
                        int index37_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalEcl()) ) {s = 46;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA37_15 = input.LA(1);

                         
                        int index37_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEcl()) ) {s = 47;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA37_16 = input.LA(1);

                         
                        int index37_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEcl()) ) {s = 48;}

                        else if ( (synpred64_InternalEcl()) ) {s = 17;}

                         
                        input.seek(index37_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 37, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\17\uffff";
    static final String dfa_27s = "\1\12\14\uffff\1\0\1\uffff";
    static final String dfa_28s = "\1\71\14\uffff\1\0\1\uffff";
    static final String dfa_29s = "\1\uffff\1\1\14\uffff\1\2";
    static final String dfa_30s = "\15\uffff\1\0\1\uffff}>";
    static final String[] dfa_31s = {
            "\11\1\1\uffff\1\1\2\uffff\1\15\40\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA49 extends DFA {

        public DFA49(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 49;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "3824:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA49_13 = input.LA(1);

                         
                        int index49_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred75_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index49_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 49, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_32s = "\10\uffff";
    static final String dfa_33s = "\1\2\7\uffff";
    static final String dfa_34s = "\2\4\2\uffff\3\4\1\0";
    static final String dfa_35s = "\1\71\1\105\2\uffff\3\71\1\0";
    static final String dfa_36s = "\2\uffff\1\2\1\1\4\uffff";
    static final String dfa_37s = "\7\uffff\1\0}>";
    static final String[] dfa_38s = {
            "\3\2\3\uffff\11\2\1\uffff\1\2\2\uffff\1\1\1\2\6\uffff\1\2\30\uffff\2\2",
            "\2\3\1\uffff\1\3\2\uffff\11\2\1\uffff\1\2\2\uffff\1\2\3\uffff\1\3\4\uffff\1\3\1\uffff\6\3\1\uffff\3\3\1\uffff\7\3\1\uffff\1\3\2\uffff\1\4\1\5\14\3",
            "",
            "",
            "\6\2\14\uffff\1\6\1\uffff\1\7\5\uffff\1\2\31\uffff\1\4\1\5",
            "\6\2\14\uffff\1\6\1\uffff\1\7\5\uffff\1\2\31\uffff\1\4\1\5",
            "\6\2\16\uffff\1\7\5\uffff\1\2\31\uffff\2\3",
            "\1\uffff"
    };

    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[] dfa_33 = DFA.unpackEncodedString(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[][] dfa_38 = unpackEncodedStringArray(dfa_38s);

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = dfa_32;
            this.eof = dfa_33;
            this.min = dfa_34;
            this.max = dfa_35;
            this.accept = dfa_36;
            this.special = dfa_37;
            this.transition = dfa_38;
        }
        public String getDescription() {
            return "4006:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_7 = input.LA(1);

                         
                        int index52_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index52_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_39s = "\1\12\1\uffff\1\12\3\4\1\0\1\uffff";
    static final String dfa_40s = "\1\71\1\uffff\4\71\1\0\1\uffff";
    static final String dfa_41s = "\1\uffff\1\1\5\uffff\1\2";
    static final String dfa_42s = "\6\uffff\1\0\1\uffff}>";
    static final String[] dfa_43s = {
            "\11\1\1\uffff\1\1\2\uffff\1\2\40\uffff\2\1",
            "",
            "\11\1\1\uffff\1\1\2\uffff\1\1\40\uffff\1\3\1\4",
            "\6\1\14\uffff\1\5\1\uffff\1\6\5\uffff\1\1\31\uffff\1\3\1\4",
            "\6\1\14\uffff\1\5\1\uffff\1\6\5\uffff\1\1\31\uffff\1\3\1\4",
            "\6\1\16\uffff\1\6\5\uffff\1\1\31\uffff\2\7",
            "\1\uffff",
            ""
    };
    static final char[] dfa_39 = DFA.unpackEncodedStringToUnsignedChars(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final short[] dfa_41 = DFA.unpackEncodedString(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[][] dfa_43 = unpackEncodedStringArray(dfa_43s);

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = dfa_32;
            this.eof = dfa_32;
            this.min = dfa_39;
            this.max = dfa_40;
            this.accept = dfa_41;
            this.special = dfa_42;
            this.transition = dfa_43;
        }
        public String getDescription() {
            return "4831:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_6 = input.LA(1);

                         
                        int index60_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred87_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index60_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_44s = "\53\uffff";
    static final String dfa_45s = "\1\1\52\uffff";
    static final String dfa_46s = "\1\4\1\uffff\45\0\4\uffff";
    static final String dfa_47s = "\1\105\1\uffff\45\0\4\uffff";
    static final String dfa_48s = "\1\uffff\1\5\45\uffff\1\2\1\1\1\3\1\4";
    static final String dfa_49s = "\2\uffff\1\24\1\0\1\34\1\35\1\25\1\11\1\1\1\36\1\26\1\12\1\2\1\37\1\27\1\13\1\3\1\40\1\23\1\14\1\4\1\41\1\30\1\15\1\5\1\42\1\31\1\16\1\6\1\43\1\32\1\17\1\33\1\20\1\7\1\44\1\21\1\22\1\10\4\uffff}>";
    static final String[] dfa_50s = {
            "\1\3\1\2\1\1\1\24\17\uffff\2\1\2\uffff\1\40\3\uffff\1\1\1\31\1\uffff\1\30\1\17\1\23\1\33\1\16\1\21\1\1\1\7\1\10\1\20\1\uffff\1\12\1\22\1\15\1\14\1\13\1\11\1\6\1\uffff\1\5\1\4\1\uffff\1\46\1\45\1\32\1\26\1\25\1\27\1\34\1\35\1\36\1\37\1\41\1\42\1\43\1\44",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[] dfa_45 = DFA.unpackEncodedString(dfa_45s);
    static final char[] dfa_46 = DFA.unpackEncodedStringToUnsignedChars(dfa_46s);
    static final char[] dfa_47 = DFA.unpackEncodedStringToUnsignedChars(dfa_47s);
    static final short[] dfa_48 = DFA.unpackEncodedString(dfa_48s);
    static final short[] dfa_49 = DFA.unpackEncodedString(dfa_49s);
    static final short[][] dfa_50 = unpackEncodedStringArray(dfa_50s);

    class DFA73 extends DFA {

        public DFA73(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 73;
            this.eot = dfa_44;
            this.eof = dfa_45;
            this.min = dfa_46;
            this.max = dfa_47;
            this.accept = dfa_48;
            this.special = dfa_49;
            this.transition = dfa_50;
        }
        public String getDescription() {
            return "()+ loopback of 5724:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA73_3 = input.LA(1);

                         
                        int index73_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_3);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA73_8 = input.LA(1);

                         
                        int index73_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_8);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA73_12 = input.LA(1);

                         
                        int index73_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_12);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA73_16 = input.LA(1);

                         
                        int index73_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_16);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA73_20 = input.LA(1);

                         
                        int index73_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_20);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA73_24 = input.LA(1);

                         
                        int index73_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_24);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA73_28 = input.LA(1);

                         
                        int index73_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_28);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA73_34 = input.LA(1);

                         
                        int index73_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_34);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA73_38 = input.LA(1);

                         
                        int index73_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred140_InternalEcl()) ) {s = 42;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_38);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA73_7 = input.LA(1);

                         
                        int index73_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_7);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA73_11 = input.LA(1);

                         
                        int index73_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA73_15 = input.LA(1);

                         
                        int index73_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_15);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA73_19 = input.LA(1);

                         
                        int index73_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA73_23 = input.LA(1);

                         
                        int index73_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_23);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA73_27 = input.LA(1);

                         
                        int index73_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_27);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA73_31 = input.LA(1);

                         
                        int index73_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_31);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA73_33 = input.LA(1);

                         
                        int index73_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_33);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA73_36 = input.LA(1);

                         
                        int index73_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_36);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA73_37 = input.LA(1);

                         
                        int index73_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalEcl()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_37);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA73_18 = input.LA(1);

                         
                        int index73_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_18);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA73_2 = input.LA(1);

                         
                        int index73_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_2);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA73_6 = input.LA(1);

                         
                        int index73_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_6);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA73_10 = input.LA(1);

                         
                        int index73_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_10);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA73_14 = input.LA(1);

                         
                        int index73_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_14);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA73_22 = input.LA(1);

                         
                        int index73_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_22);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA73_26 = input.LA(1);

                         
                        int index73_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_26);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA73_30 = input.LA(1);

                         
                        int index73_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_30);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA73_32 = input.LA(1);

                         
                        int index73_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_32);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA73_4 = input.LA(1);

                         
                        int index73_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalEcl()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_4);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA73_5 = input.LA(1);

                         
                        int index73_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_5);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA73_9 = input.LA(1);

                         
                        int index73_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_9);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA73_13 = input.LA(1);

                         
                        int index73_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_13);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA73_17 = input.LA(1);

                         
                        int index73_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_17);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA73_21 = input.LA(1);

                         
                        int index73_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_21);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA73_25 = input.LA(1);

                         
                        int index73_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_25);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA73_29 = input.LA(1);

                         
                        int index73_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_29);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA73_35 = input.LA(1);

                         
                        int index73_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index73_35);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 73, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x030000000097FC00L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x030000000A9FFC00L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x03000000009FFC00L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0xFC2FEEFD081000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xFC2FEEFD080000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000400002L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0300000000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0300000001000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x03000000089FFC00L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x030000000897FC00L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000011002L,0x00000000000001C0L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0300000000100000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x7000000600800000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0350000000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0xFC2FEEFD088000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000100000011000L,0x00000000000001C0L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000040L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x7000000600000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x7000000601000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFC2FEEFD090000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x030000000197FC00L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0xFF6FEEFD088000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xFF6FEEFD080000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xFF6FEEFD090000B0L,0x000000000000003FL});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x030000000097FC02L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x030001000097FC02L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0F00000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x03C000008097FC00L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xFF6FEEFD080000B2L,0x000000000000003FL});
    }


}