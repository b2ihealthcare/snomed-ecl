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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DISJUNCTION_KEYWORD", "RULE_CONJUNCTION_KEYWORD", "RULE_COMMA", "RULE_EXCLUSION_KEYWORD", "RULE_COLON", "RULE_DOT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_LT", "RULE_DBL_LT", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GT", "RULE_DBL_GT", "RULE_CARET", "RULE_PIPE_DELIMITED_STRING", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_WILDCARD", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_REVERSED", "RULE_SQUARE_OPEN", "RULE_TO", "RULE_SQUARE_CLOSE", "RULE_STRING", "RULE_HASH", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_TERM_KEYWORD", "RULE_REGEX_KEYWORD", "RULE_LANGUAGE_KEYWORD", "RULE_TYPEID_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_DIALECTID_KEYWORD", "RULE_DIALECT_KEYWORD", "RULE_WS", "RULE_DEFINITION_STATUS_ID_KEYWORD", "RULE_DEFINITION_STATUS_TOKEN_KEYWORD", "RULE_MODULEID_KEYWORD", "RULE_EQUAL", "RULE_EFFECTIVE_TIME_KEYWORD", "RULE_ACTIVE_KEYWORD", "RULE_SEMANTIC_TAG_KEYWORD", "RULE_PREFERRED_IN_KEYWORD", "RULE_ACCEPTABLE_IN_KEYWORD", "RULE_LANGUAGE_REFSET_ID_KEYWORD", "RULE_CASE_SIGNIFICANCE_ID_KEYWORD", "RULE_PLUS", "RULE_HISTORY_KEYWORD", "RULE_DASH", "RULE_UNDERSCORE", "RULE_DIGIT_NONZERO", "RULE_DIGIT_ZERO", "RULE_TRUE_KEYWORD", "RULE_FALSE_KEYWORD", "RULE_EXACT_KEYWORD", "RULE_MATCH_KEYWORD", "RULE_WILD_KEYWORD", "RULE_MIN_KEYWORD", "RULE_MOD_KEYWORD", "RULE_MAX_KEYWORD", "RULE_DESCRIPTION_SHORT_KEYWORD", "RULE_CONCEPT_SHORT_KEYWORD", "RULE_KEYWORD", "RULE_NOT_EQUAL", "RULE_GTE", "RULE_LTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT"
    };
    public static final int RULE_DIALECT_KEYWORD=39;
    public static final int RULE_LANGUAGE_KEYWORD=35;
    public static final int RULE_CURLY_OPEN=23;
    public static final int RULE_DIGIT_NONZERO=56;
    public static final int RULE_DBL_GT=17;
    public static final int RULE_ROUND_CLOSE=21;
    public static final int RULE_TO=27;
    public static final int RULE_GT=16;
    public static final int RULE_ACTIVE_KEYWORD=46;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=67;
    public static final int RULE_MODULEID_KEYWORD=43;
    public static final int RULE_GTE=70;
    public static final int RULE_DISJUNCTION_KEYWORD=4;
    public static final int RULE_ROUND_OPEN=20;
    public static final int RULE_UNDERSCORE=55;
    public static final int RULE_DBL_LT=13;
    public static final int RULE_TYPEID_KEYWORD=36;
    public static final int RULE_MATCH_KEYWORD=61;
    public static final int RULE_NOT_EQUAL=69;
    public static final int RULE_SQUARE_CLOSE=28;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=47;
    public static final int RULE_SQUARE_OPEN=26;
    public static final int RULE_EQUAL=44;
    public static final int RULE_COMMA=6;
    public static final int RULE_EXCLUSION_KEYWORD=7;
    public static final int RULE_LT_EM=10;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=51;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=66;
    public static final int RULE_CURLY_CLOSE=24;
    public static final int RULE_DBL_GT_EM=15;
    public static final int RULE_COLON=8;
    public static final int RULE_HISTORY_KEYWORD=53;
    public static final int RULE_MOD_KEYWORD=64;
    public static final int RULE_LT=12;
    public static final int RULE_DOUBLE_CURLY_CLOSE=32;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=50;
    public static final int RULE_EXACT_KEYWORD=60;
    public static final int RULE_ML_COMMENT=72;
    public static final int RULE_PIPE_DELIMITED_STRING=19;
    public static final int RULE_PREFERRED_IN_KEYWORD=48;
    public static final int RULE_LTE=71;
    public static final int RULE_TYPE_KEYWORD=37;
    public static final int RULE_STRING=29;
    public static final int RULE_FALSE_KEYWORD=59;
    public static final int RULE_REVERSED=25;
    public static final int RULE_SL_COMMENT=73;
    public static final int RULE_DIGIT_ZERO=57;
    public static final int RULE_HASH=30;
    public static final int RULE_DASH=54;
    public static final int RULE_PLUS=52;
    public static final int RULE_DOT=9;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=38;
    public static final int RULE_KEYWORD=68;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=41;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=42;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=49;
    public static final int RULE_GT_EM=14;
    public static final int RULE_TERM_KEYWORD=33;
    public static final int RULE_WS=40;
    public static final int RULE_MAX_KEYWORD=65;
    public static final int RULE_REGEX_KEYWORD=34;
    public static final int RULE_TRUE_KEYWORD=58;
    public static final int RULE_CARET=18;
    public static final int RULE_DOUBLE_CURLY_OPEN=31;
    public static final int RULE_CONJUNCTION_KEYWORD=5;
    public static final int RULE_WILD_KEYWORD=62;
    public static final int RULE_MIN_KEYWORD=63;
    public static final int RULE_WILDCARD=22;
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

            if ( ((LA1_0>=RULE_LT_EM && LA1_0<=RULE_CARET)||LA1_0==RULE_ROUND_OPEN||LA1_0==RULE_WILDCARD||(LA1_0>=RULE_DIGIT_NONZERO && LA1_0<=RULE_DIGIT_ZERO)) ) {
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
            case RULE_ROUND_OPEN:
            case RULE_WILDCARD:
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
    // InternalEcl.g:1147:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:1153:2: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalEcl.g:1154:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalEcl.g:1154:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalEcl.g:1155:3: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1159:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalEcl.g:1160:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalEcl.g:1160:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalEcl.g:1161:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalEcl.g:1161:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_NONZERO:
            case RULE_DIGIT_ZERO:
                {
                alt12=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt12=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt12=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // InternalEcl.g:1162:6: lv_constraint_1_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1178:6: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_2,
                      							"com.b2international.snomed.ecl.Ecl.Any");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:1194:6: lv_constraint_1_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_1_3,
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
    // InternalEcl.g:1216:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEcl.g:1216:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEcl.g:1217:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
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
    // InternalEcl.g:1223:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1229:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            // InternalEcl.g:1230:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            {
            // InternalEcl.g:1230:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )? )
            // InternalEcl.g:1231:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            {
            // InternalEcl.g:1231:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalEcl.g:1232:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalEcl.g:1232:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalEcl.g:1233:5: lv_id_0_0= ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_11);
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

            // InternalEcl.g:1250:3: ( (lv_term_1_0= RULE_PIPE_DELIMITED_STRING ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_PIPE_DELIMITED_STRING) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEcl.g:1251:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    {
                    // InternalEcl.g:1251:4: (lv_term_1_0= RULE_PIPE_DELIMITED_STRING )
                    // InternalEcl.g:1252:5: lv_term_1_0= RULE_PIPE_DELIMITED_STRING
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
    // InternalEcl.g:1272:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEcl.g:1272:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEcl.g:1273:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
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
    // InternalEcl.g:1279:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_concepts_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1285:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1286:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1286:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1287:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1291:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_DIGIT_NONZERO && LA14_0<=RULE_DIGIT_ZERO)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEcl.g:1292:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    {
            	    // InternalEcl.g:1292:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    // InternalEcl.g:1293:5: lv_concepts_1_0= ruleEclConceptReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
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
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
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
    // InternalEcl.g:1318:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEcl.g:1318:44: (iv_ruleAny= ruleAny EOF )
            // InternalEcl.g:1319:2: iv_ruleAny= ruleAny EOF
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
    // InternalEcl.g:1325:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEcl.g:1331:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEcl.g:1332:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEcl.g:1332:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEcl.g:1333:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1337:3: ()
            // InternalEcl.g:1338:4: 
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
    // InternalEcl.g:1351:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEcl.g:1351:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEcl.g:1352:2: iv_ruleEclRefinement= ruleEclRefinement EOF
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
    // InternalEcl.g:1358:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1364:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEcl.g:1365:2: this_OrRefinement_0= ruleOrRefinement
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
    // InternalEcl.g:1379:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEcl.g:1379:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEcl.g:1380:2: iv_ruleOrRefinement= ruleOrRefinement EOF
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
    // InternalEcl.g:1386:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1392:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEcl.g:1393:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEcl.g:1393:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEcl.g:1394:3: this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
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
            // InternalEcl.g:1405:3: ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_DISJUNCTION_KEYWORD) ) {
                    int LA15_4 = input.LA(2);

                    if ( (synpred25_InternalEcl()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalEcl.g:1406:4: ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEcl.g:1407:4: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEcl.g:1408:5: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEcl.g:1408:5: ()
            	    // InternalEcl.g:1409:6: 
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
            	    // InternalEcl.g:1422:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEcl.g:1423:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEcl.g:1423:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEcl.g:1424:7: lv_right_3_0= ruleAndRefinement
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
            	    break loop15;
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
    // InternalEcl.g:1447:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEcl.g:1447:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEcl.g:1448:2: iv_ruleAndRefinement= ruleAndRefinement EOF
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
    // InternalEcl.g:1454:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1460:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEcl.g:1461:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEcl.g:1461:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEcl.g:1462:3: this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
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
            // InternalEcl.g:1473:3: ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_CONJUNCTION_KEYWORD) ) {
                    int LA17_3 = input.LA(2);

                    if ( (synpred27_InternalEcl()) ) {
                        alt17=1;
                    }


                }
                else if ( (LA17_0==RULE_COMMA) ) {
                    int LA17_4 = input.LA(2);

                    if ( (synpred27_InternalEcl()) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // InternalEcl.g:1474:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEcl.g:1475:4: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEcl.g:1476:5: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEcl.g:1476:5: ()
            	    // InternalEcl.g:1477:6: 
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

            	    // InternalEcl.g:1486:5: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==RULE_COMMA) ) {
            	        alt16=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // InternalEcl.g:1487:6: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:1492:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:1497:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEcl.g:1498:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEcl.g:1498:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEcl.g:1499:7: lv_right_4_0= ruleSubRefinement
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
            	    break loop17;
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
    // InternalEcl.g:1522:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEcl.g:1522:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEcl.g:1523:2: iv_ruleSubRefinement= ruleSubRefinement EOF
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
    // InternalEcl.g:1529:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:1535:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEcl.g:1536:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEcl.g:1536:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt18=3;
            alt18 = dfa18.predict(input);
            switch (alt18) {
                case 1 :
                    // InternalEcl.g:1537:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEcl.g:1549:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
                    // InternalEcl.g:1561:3: this_NestedRefinement_2= ruleNestedRefinement
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
    // InternalEcl.g:1576:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEcl.g:1576:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEcl.g:1577:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
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
    // InternalEcl.g:1583:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1589:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1590:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1590:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1591:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1595:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEcl.g:1596:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEcl.g:1596:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEcl.g:1597:5: lv_nested_1_0= ruleEclRefinement
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalEcl.g:1622:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEcl.g:1622:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEcl.g:1623:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
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
    // InternalEcl.g:1629:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1635:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEcl.g:1636:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEcl.g:1636:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEcl.g:1637:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEcl.g:1637:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_SQUARE_OPEN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalEcl.g:1638:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:1638:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:1639:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_15);
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

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:1660:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEcl.g:1661:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:1661:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEcl.g:1662:5: lv_refinement_2_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_17);
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
    // InternalEcl.g:1687:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEcl.g:1687:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEcl.g:1688:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
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
    // InternalEcl.g:1694:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1700:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEcl.g:1701:2: this_OrAttributeSet_0= ruleOrAttributeSet
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
    // InternalEcl.g:1715:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEcl.g:1715:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEcl.g:1716:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
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
    // InternalEcl.g:1722:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1728:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEcl.g:1729:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEcl.g:1729:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEcl.g:1730:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
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
            // InternalEcl.g:1741:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEcl.g:1742:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEcl.g:1742:4: ()
            	    // InternalEcl.g:1743:5: 
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

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:1756:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEcl.g:1757:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEcl.g:1757:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEcl.g:1758:6: lv_right_3_0= ruleAndAttributeSet
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
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalEcl.g:1780:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEcl.g:1780:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEcl.g:1781:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
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
    // InternalEcl.g:1787:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1793:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEcl.g:1794:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEcl.g:1794:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEcl.g:1795:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
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
            // InternalEcl.g:1806:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_CONJUNCTION_KEYWORD && LA22_0<=RULE_COMMA)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalEcl.g:1807:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEcl.g:1807:4: ()
            	    // InternalEcl.g:1808:5: 
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

            	    // InternalEcl.g:1817:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==RULE_COMMA) ) {
            	        alt21=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // InternalEcl.g:1818:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:1823:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:1828:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEcl.g:1829:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEcl.g:1829:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEcl.g:1830:6: lv_right_4_0= ruleSubAttributeSet
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
            	    break loop22;
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
    // InternalEcl.g:1852:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEcl.g:1852:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEcl.g:1853:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
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
    // InternalEcl.g:1859:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:1865:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEcl.g:1866:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEcl.g:1866:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt23=2;
            alt23 = dfa23.predict(input);
            switch (alt23) {
                case 1 :
                    // InternalEcl.g:1867:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEcl.g:1879:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
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
    // InternalEcl.g:1894:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEcl.g:1894:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEcl.g:1895:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
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
    // InternalEcl.g:1901:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1907:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1908:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1908:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1909:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1913:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEcl.g:1914:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:1914:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEcl.g:1915:5: lv_nested_1_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalEcl.g:1940:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEcl.g:1940:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEcl.g:1941:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
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
    // InternalEcl.g:1947:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1953:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) )
            // InternalEcl.g:1954:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            {
            // InternalEcl.g:1954:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            // InternalEcl.g:1955:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )?
            {
            // InternalEcl.g:1955:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_SQUARE_OPEN) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEcl.g:1956:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:1956:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:1957:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_18);
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

            // InternalEcl.g:1974:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_REVERSED) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEcl.g:1975:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEcl.g:1975:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEcl.g:1976:5: lv_reversed_1_0= RULE_REVERSED
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

            // InternalEcl.g:1992:3: ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:1993:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:1993:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:1994:5: lv_attribute_2_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
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

            // InternalEcl.g:2011:3: ( (lv_comparison_3_0= ruleComparison ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_LT||LA26_0==RULE_GT||LA26_0==RULE_EQUAL||(LA26_0>=RULE_NOT_EQUAL && LA26_0<=RULE_LTE)) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEcl.g:2012:4: (lv_comparison_3_0= ruleComparison )
                    {
                    // InternalEcl.g:2012:4: (lv_comparison_3_0= ruleComparison )
                    // InternalEcl.g:2013:5: lv_comparison_3_0= ruleComparison
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
    // InternalEcl.g:2034:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEcl.g:2034:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEcl.g:2035:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalEcl.g:2041:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2047:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEcl.g:2048:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEcl.g:2048:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEcl.g:2049:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2053:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEcl.g:2054:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEcl.g:2054:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEcl.g:2055:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_20);
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

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:2076:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEcl.g:2077:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEcl.g:2077:4: (lv_max_3_0= ruleMaxValue )
            // InternalEcl.g:2078:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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
    // InternalEcl.g:2103:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEcl.g:2103:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEcl.g:2104:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEcl.g:2110:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:2116:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEcl.g:2117:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEcl.g:2117:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt27=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA27_1 = input.LA(2);

                if ( ((LA27_1>=RULE_STRING && LA27_1<=RULE_HASH)||(LA27_1>=RULE_TRUE_KEYWORD && LA27_1<=RULE_FALSE_KEYWORD)) ) {
                    alt27=2;
                }
                else if ( ((LA27_1>=RULE_LT_EM && LA27_1<=RULE_CARET)||LA27_1==RULE_ROUND_OPEN||LA27_1==RULE_WILDCARD||(LA27_1>=RULE_DIGIT_NONZERO && LA27_1<=RULE_DIGIT_ZERO)) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA27_2 = input.LA(2);

                if ( ((LA27_2>=RULE_STRING && LA27_2<=RULE_HASH)||(LA27_2>=RULE_TRUE_KEYWORD && LA27_2<=RULE_FALSE_KEYWORD)) ) {
                    alt27=2;
                }
                else if ( ((LA27_2>=RULE_LT_EM && LA27_2<=RULE_CARET)||LA27_2==RULE_ROUND_OPEN||LA27_2==RULE_WILDCARD||(LA27_2>=RULE_DIGIT_NONZERO && LA27_2<=RULE_DIGIT_ZERO)) ) {
                    alt27=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 27, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt27=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalEcl.g:2118:3: this_AttributeComparison_0= ruleAttributeComparison
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
                    // InternalEcl.g:2130:3: this_DataTypeComparison_1= ruleDataTypeComparison
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
    // InternalEcl.g:2145:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEcl.g:2145:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEcl.g:2146:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
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
    // InternalEcl.g:2152:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2158:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) )
            // InternalEcl.g:2159:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            {
            // InternalEcl.g:2159:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            // InternalEcl.g:2160:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            {
            // InternalEcl.g:2160:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2161:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2161:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2162:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:2179:3: ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:2180:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:2180:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:2181:5: lv_value_1_0= ruleFilteredExpressionConstraint
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
    // InternalEcl.g:2202:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEcl.g:2202:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEcl.g:2203:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
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
    // InternalEcl.g:2209:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:2215:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEcl.g:2216:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEcl.g:2216:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt28=4;
            alt28 = dfa28.predict(input);
            switch (alt28) {
                case 1 :
                    // InternalEcl.g:2217:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
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
                    // InternalEcl.g:2229:3: this_StringValueComparison_1= ruleStringValueComparison
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
                    // InternalEcl.g:2241:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
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
                    // InternalEcl.g:2253:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
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
    // InternalEcl.g:2268:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEcl.g:2268:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEcl.g:2269:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
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
    // InternalEcl.g:2275:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2281:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEcl.g:2282:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEcl.g:2282:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEcl.g:2283:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEcl.g:2283:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2284:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2284:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2285:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
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

            // InternalEcl.g:2302:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEcl.g:2303:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEcl.g:2303:4: (lv_value_1_0= ruleBoolean )
            // InternalEcl.g:2304:5: lv_value_1_0= ruleBoolean
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
    // InternalEcl.g:2325:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEcl.g:2325:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEcl.g:2326:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
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
    // InternalEcl.g:2332:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2338:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEcl.g:2339:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:2339:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEcl.g:2340:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEcl.g:2340:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2341:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2341:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2342:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalEcl.g:2359:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEcl.g:2360:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEcl.g:2360:4: (lv_value_1_0= RULE_STRING )
            // InternalEcl.g:2361:5: lv_value_1_0= RULE_STRING
            {
            lv_value_1_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_1_0, grammarAccess.getStringValueComparisonAccess().getValueSTRINGTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getStringValueComparisonRule());
              					}
              					setWithLastConsumed(
              						current,
              						"value",
              						lv_value_1_0,
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
    // $ANTLR end "ruleStringValueComparison"


    // $ANTLR start "entryRuleIntegerValueComparison"
    // InternalEcl.g:2381:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEcl.g:2381:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEcl.g:2382:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
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
    // InternalEcl.g:2388:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2394:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEcl.g:2395:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEcl.g:2395:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEcl.g:2396:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEcl.g:2396:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2397:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2397:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2398:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2419:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEcl.g:2420:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEcl.g:2420:4: (lv_value_2_0= ruleInteger )
            // InternalEcl.g:2421:5: lv_value_2_0= ruleInteger
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
    // InternalEcl.g:2442:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEcl.g:2442:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEcl.g:2443:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
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
    // InternalEcl.g:2449:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2455:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEcl.g:2456:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEcl.g:2456:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEcl.g:2457:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEcl.g:2457:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2458:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2458:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2459:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2480:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEcl.g:2481:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEcl.g:2481:4: (lv_value_2_0= ruleDecimal )
            // InternalEcl.g:2482:5: lv_value_2_0= ruleDecimal
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
    // InternalEcl.g:2503:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEcl.g:2503:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEcl.g:2504:2: iv_ruleNestedExpression= ruleNestedExpression EOF
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
    // InternalEcl.g:2510:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2516:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2517:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2517:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2518:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2522:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEcl.g:2523:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEcl.g:2523:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEcl.g:2524:5: lv_nested_1_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalEcl.g:2549:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEcl.g:2549:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEcl.g:2550:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
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
    // InternalEcl.g:2556:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_domain_1_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2562:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:2563:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:2563:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:2564:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2568:3: ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( ((LA29_0>=RULE_DESCRIPTION_SHORT_KEYWORD && LA29_0<=RULE_CONCEPT_SHORT_KEYWORD)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEcl.g:2569:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    {
                    // InternalEcl.g:2569:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    // InternalEcl.g:2570:5: lv_domain_1_0= ruleSHORT_DOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_27);
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

            // InternalEcl.g:2587:3: ( (lv_filter_2_0= ruleFilter ) )
            // InternalEcl.g:2588:4: (lv_filter_2_0= ruleFilter )
            {
            // InternalEcl.g:2588:4: (lv_filter_2_0= ruleFilter )
            // InternalEcl.g:2589:5: lv_filter_2_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalEcl.g:2614:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEcl.g:2614:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEcl.g:2615:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalEcl.g:2621:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2627:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEcl.g:2628:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
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
    // InternalEcl.g:2642:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEcl.g:2642:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEcl.g:2643:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
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
    // InternalEcl.g:2649:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2655:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEcl.g:2656:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEcl.g:2656:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEcl.g:2657:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
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
            // InternalEcl.g:2668:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEcl.g:2669:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEcl.g:2669:4: ()
            	    // InternalEcl.g:2670:5: 
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

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:2683:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEcl.g:2684:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEcl.g:2684:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEcl.g:2685:6: lv_right_3_0= ruleConjunctionFilter
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
            	    break loop30;
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
    // InternalEcl.g:2707:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEcl.g:2707:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEcl.g:2708:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
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
    // InternalEcl.g:2714:1: ruleConjunctionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2720:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) )
            // InternalEcl.g:2721:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            {
            // InternalEcl.g:2721:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            // InternalEcl.g:2722:3: this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
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
            // InternalEcl.g:2733:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_CONJUNCTION_KEYWORD && LA32_0<=RULE_COMMA)) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEcl.g:2734:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) )
            	    {
            	    // InternalEcl.g:2734:4: ()
            	    // InternalEcl.g:2735:5: 
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

            	    // InternalEcl.g:2744:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt31=2;
            	    int LA31_0 = input.LA(1);

            	    if ( (LA31_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt31=1;
            	    }
            	    else if ( (LA31_0==RULE_COMMA) ) {
            	        alt31=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 31, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt31) {
            	        case 1 :
            	            // InternalEcl.g:2745:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:2750:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:2755:4: ( (lv_right_4_0= rulePropertyFilter ) )
            	    // InternalEcl.g:2756:5: (lv_right_4_0= rulePropertyFilter )
            	    {
            	    // InternalEcl.g:2756:5: (lv_right_4_0= rulePropertyFilter )
            	    // InternalEcl.g:2757:6: lv_right_4_0= rulePropertyFilter
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
            	    break loop32;
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
    // InternalEcl.g:2779:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEcl.g:2779:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEcl.g:2780:2: iv_ruleNestedFilter= ruleNestedFilter EOF
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
    // InternalEcl.g:2786:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2792:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2793:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2793:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2794:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2798:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEcl.g:2799:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEcl.g:2799:4: (lv_nested_1_0= ruleFilter )
            // InternalEcl.g:2800:5: lv_nested_1_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getNestedFilterAccess().getNestedFilterParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
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
    // InternalEcl.g:2825:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEcl.g:2825:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEcl.g:2826:2: iv_rulePropertyFilter= rulePropertyFilter EOF
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
    // InternalEcl.g:2832:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter ) ;
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

        EObject this_NestedFilter_13 = null;



        	enterRule();

        try {
            // InternalEcl.g:2838:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter ) )
            // InternalEcl.g:2839:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter )
            {
            // InternalEcl.g:2839:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter | this_ModuleFilter_5= ruleModuleFilter | this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter | this_ActiveFilter_7= ruleActiveFilter | this_SemanticTagFilter_8= ruleSemanticTagFilter | this_PreferredInFilter_9= rulePreferredInFilter | this_AcceptableInFilter_10= ruleAcceptableInFilter | this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter | this_NestedFilter_13= ruleNestedFilter )
            int alt33=14;
            switch ( input.LA(1) ) {
            case RULE_TERM_KEYWORD:
                {
                alt33=1;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt33=2;
                }
                break;
            case RULE_TYPEID_KEYWORD:
            case RULE_TYPE_KEYWORD:
                {
                alt33=3;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
            case RULE_DIALECT_KEYWORD:
                {
                alt33=4;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt33=5;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt33=6;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt33=7;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt33=8;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt33=9;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt33=10;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt33=11;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt33=12;
                }
                break;
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt33=13;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt33=14;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalEcl.g:2840:3: this_TermFilter_0= ruleTermFilter
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
                    // InternalEcl.g:2852:3: this_LanguageFilter_1= ruleLanguageFilter
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
                    // InternalEcl.g:2864:3: this_TypeFilter_2= ruleTypeFilter
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
                    // InternalEcl.g:2876:3: this_DialectFilter_3= ruleDialectFilter
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
                    // InternalEcl.g:2888:3: this_DefinitionStatusFilter_4= ruleDefinitionStatusFilter
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
                    // InternalEcl.g:2900:3: this_ModuleFilter_5= ruleModuleFilter
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
                    // InternalEcl.g:2912:3: this_EffectiveTimeFilter_6= ruleEffectiveTimeFilter
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
                    // InternalEcl.g:2924:3: this_ActiveFilter_7= ruleActiveFilter
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
                    // InternalEcl.g:2936:3: this_SemanticTagFilter_8= ruleSemanticTagFilter
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
                    // InternalEcl.g:2948:3: this_PreferredInFilter_9= rulePreferredInFilter
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
                    // InternalEcl.g:2960:3: this_AcceptableInFilter_10= ruleAcceptableInFilter
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
                    // InternalEcl.g:2972:3: this_LanguageRefSetFilter_11= ruleLanguageRefSetFilter
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
                    // InternalEcl.g:2984:3: this_CaseSignificanceFilter_12= ruleCaseSignificanceFilter
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
                    // InternalEcl.g:2996:3: this_NestedFilter_13= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_13());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_13=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_13;
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


    // $ANTLR start "entryRuleTermFilter"
    // InternalEcl.g:3011:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEcl.g:3011:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEcl.g:3012:2: iv_ruleTermFilter= ruleTermFilter EOF
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
    // InternalEcl.g:3018:1: ruleTermFilter returns [EObject current=null] : (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_TERM_KEYWORD_0=null;
        EObject this_TypedTermFilter_1 = null;

        EObject this_TypedTermFilterSet_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:3024:2: ( (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) )
            // InternalEcl.g:3025:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            {
            // InternalEcl.g:3025:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            // InternalEcl.g:3026:3: this_TERM_KEYWORD_0= RULE_TERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            {
            this_TERM_KEYWORD_0=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3030:3: (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_EQUAL) ) {
                int LA34_1 = input.LA(2);

                if ( (LA34_1==RULE_ROUND_OPEN) ) {
                    alt34=2;
                }
                else if ( (LA34_1==RULE_STRING||LA34_1==RULE_REGEX_KEYWORD||(LA34_1>=RULE_EXACT_KEYWORD && LA34_1<=RULE_WILD_KEYWORD)) ) {
                    alt34=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA34_0==RULE_NOT_EQUAL) ) {
                int LA34_2 = input.LA(2);

                if ( (LA34_2==RULE_STRING||LA34_2==RULE_REGEX_KEYWORD||(LA34_2>=RULE_EXACT_KEYWORD && LA34_2<=RULE_WILD_KEYWORD)) ) {
                    alt34=1;
                }
                else if ( (LA34_2==RULE_ROUND_OPEN) ) {
                    alt34=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalEcl.g:3031:4: this_TypedTermFilter_1= ruleTypedTermFilter
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterParserRuleCall_1_0());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedTermFilter_1=ruleTypedTermFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TypedTermFilter_1;
                      				afterParserOrEnumRuleCall();
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:3043:4: this_TypedTermFilterSet_2= ruleTypedTermFilterSet
                    {
                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getTermFilterAccess().getTypedTermFilterSetParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedTermFilterSet_2=ruleTypedTermFilterSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_TypedTermFilterSet_2;
                      				afterParserOrEnumRuleCall();
                      			
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
    // $ANTLR end "ruleTermFilter"


    // $ANTLR start "entryRuleTypedTermFilter"
    // InternalEcl.g:3059:1: entryRuleTypedTermFilter returns [EObject current=null] : iv_ruleTypedTermFilter= ruleTypedTermFilter EOF ;
    public final EObject entryRuleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilter = null;


        try {
            // InternalEcl.g:3059:56: (iv_ruleTypedTermFilter= ruleTypedTermFilter EOF )
            // InternalEcl.g:3060:2: iv_ruleTypedTermFilter= ruleTypedTermFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilter=ruleTypedTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilter; 
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
    // $ANTLR end "entryRuleTypedTermFilter"


    // $ANTLR start "ruleTypedTermFilter"
    // InternalEcl.g:3066:1: ruleTypedTermFilter returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) ) ;
    public final EObject ruleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_clause_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3072:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) ) )
            // InternalEcl.g:3073:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) )
            {
            // InternalEcl.g:3073:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) ) )
            // InternalEcl.g:3074:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_clause_1_0= ruleTypedTermFilterClause ) )
            {
            // InternalEcl.g:3074:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3075:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3075:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3076:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
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

            // InternalEcl.g:3093:3: ( (lv_clause_1_0= ruleTypedTermFilterClause ) )
            // InternalEcl.g:3094:4: (lv_clause_1_0= ruleTypedTermFilterClause )
            {
            // InternalEcl.g:3094:4: (lv_clause_1_0= ruleTypedTermFilterClause )
            // InternalEcl.g:3095:5: lv_clause_1_0= ruleTypedTermFilterClause
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getClauseTypedTermFilterClauseParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_clause_1_0=ruleTypedTermFilterClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
              					}
              					set(
              						current,
              						"clause",
              						lv_clause_1_0,
              						"com.b2international.snomed.ecl.Ecl.TypedTermFilterClause");
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
    // $ANTLR end "ruleTypedTermFilter"


    // $ANTLR start "entryRuleTypedTermFilterSet"
    // InternalEcl.g:3116:1: entryRuleTypedTermFilterSet returns [EObject current=null] : iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF ;
    public final EObject entryRuleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterSet = null;


        try {
            // InternalEcl.g:3116:59: (iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF )
            // InternalEcl.g:3117:2: iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilterSet=ruleTypedTermFilterSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilterSet; 
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
    // $ANTLR end "entryRuleTypedTermFilterSet"


    // $ANTLR start "ruleTypedTermFilterSet"
    // InternalEcl.g:3123:1: ruleTypedTermFilterSet returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_1=null;
        Token this_ROUND_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_clauses_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3129:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:3130:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:3130:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEcl.g:3131:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+ this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            // InternalEcl.g:3131:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3132:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3132:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3133:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
            lv_op_0_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
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

            this_ROUND_OPEN_1=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_1, grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:3154:3: ( (lv_clauses_2_0= ruleTypedTermFilterClause ) )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_STRING||LA35_0==RULE_REGEX_KEYWORD||(LA35_0>=RULE_EXACT_KEYWORD && LA35_0<=RULE_WILD_KEYWORD)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEcl.g:3155:4: (lv_clauses_2_0= ruleTypedTermFilterClause )
            	    {
            	    // InternalEcl.g:3155:4: (lv_clauses_2_0= ruleTypedTermFilterClause )
            	    // InternalEcl.g:3156:5: lv_clauses_2_0= ruleTypedTermFilterClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getClausesTypedTermFilterClauseParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_32);
            	    lv_clauses_2_0=ruleTypedTermFilterClause();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"clauses",
            	      						lv_clauses_2_0,
            	      						"com.b2international.snomed.ecl.Ecl.TypedTermFilterClause");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt35 >= 1 ) break loop35;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
            } while (true);

            this_ROUND_CLOSE_3=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_3());
              		
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
    // $ANTLR end "ruleTypedTermFilterSet"


    // $ANTLR start "entryRuleTypedTermFilterClause"
    // InternalEcl.g:3181:1: entryRuleTypedTermFilterClause returns [EObject current=null] : iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF ;
    public final EObject entryRuleTypedTermFilterClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterClause = null;


        try {
            // InternalEcl.g:3181:62: (iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF )
            // InternalEcl.g:3182:2: iv_ruleTypedTermFilterClause= ruleTypedTermFilterClause EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTypedTermFilterClauseRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTypedTermFilterClause=ruleTypedTermFilterClause();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTypedTermFilterClause; 
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
    // $ANTLR end "entryRuleTypedTermFilterClause"


    // $ANTLR start "ruleTypedTermFilterClause"
    // InternalEcl.g:3188:1: ruleTypedTermFilterClause returns [EObject current=null] : ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) ;
    public final EObject ruleTypedTermFilterClause() throws RecognitionException {
        EObject current = null;

        Token this_COLON_1=null;
        Token lv_term_2_0=null;
        Token lv_lexicalSearchType_3_0=null;
        Token this_COLON_4=null;
        AntlrDatatypeRuleToken lv_lexicalSearchType_0_0 = null;

        AntlrDatatypeRuleToken lv_term_5_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3194:2: ( ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) )
            // InternalEcl.g:3195:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            {
            // InternalEcl.g:3195:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING||(LA37_0>=RULE_EXACT_KEYWORD && LA37_0<=RULE_WILD_KEYWORD)) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_REGEX_KEYWORD) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalEcl.g:3196:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    {
                    // InternalEcl.g:3196:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    // InternalEcl.g:3197:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) )
                    {
                    // InternalEcl.g:3197:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( ((LA36_0>=RULE_EXACT_KEYWORD && LA36_0<=RULE_WILD_KEYWORD)) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalEcl.g:3198:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON
                            {
                            // InternalEcl.g:3198:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) )
                            // InternalEcl.g:3199:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            {
                            // InternalEcl.g:3199:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            // InternalEcl.g:3200:7: lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypedTermFilterClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_33);
                            lv_lexicalSearchType_0_0=ruleLEXICAL_SEARCH_TYPE();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getTypedTermFilterClauseRule());
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

                            this_COLON_1=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_24); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_COLON_1, grammarAccess.getTypedTermFilterClauseAccess().getCOLONTerminalRuleCall_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEcl.g:3222:4: ( (lv_term_2_0= RULE_STRING ) )
                    // InternalEcl.g:3223:5: (lv_term_2_0= RULE_STRING )
                    {
                    // InternalEcl.g:3223:5: (lv_term_2_0= RULE_STRING )
                    // InternalEcl.g:3224:6: lv_term_2_0= RULE_STRING
                    {
                    lv_term_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_term_2_0, grammarAccess.getTypedTermFilterClauseAccess().getTermSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedTermFilterClauseRule());
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
                    // InternalEcl.g:3242:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    {
                    // InternalEcl.g:3242:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    // InternalEcl.g:3243:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) )
                    {
                    // InternalEcl.g:3243:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) )
                    // InternalEcl.g:3244:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    {
                    // InternalEcl.g:3244:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    // InternalEcl.g:3245:6: lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD
                    {
                    lv_lexicalSearchType_3_0=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_lexicalSearchType_3_0, grammarAccess.getTypedTermFilterClauseAccess().getLexicalSearchTypeREGEX_KEYWORDTerminalRuleCall_1_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getTypedTermFilterClauseRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"lexicalSearchType",
                      							lv_lexicalSearchType_3_0,
                      							"com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
                      					
                    }

                    }


                    }

                    this_COLON_4=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_4, grammarAccess.getTypedTermFilterClauseAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }
                    // InternalEcl.g:3265:4: ( (lv_term_5_0= ruleRegularExpression ) )
                    // InternalEcl.g:3266:5: (lv_term_5_0= ruleRegularExpression )
                    {
                    // InternalEcl.g:3266:5: (lv_term_5_0= ruleRegularExpression )
                    // InternalEcl.g:3267:6: lv_term_5_0= ruleRegularExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTermFilterClauseAccess().getTermRegularExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_term_5_0=ruleRegularExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTermFilterClauseRule());
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
    // $ANTLR end "ruleTypedTermFilterClause"


    // $ANTLR start "entryRuleRegularExpression"
    // InternalEcl.g:3289:1: entryRuleRegularExpression returns [String current=null] : iv_ruleRegularExpression= ruleRegularExpression EOF ;
    public final String entryRuleRegularExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegularExpression = null;


        try {
            // InternalEcl.g:3289:57: (iv_ruleRegularExpression= ruleRegularExpression EOF )
            // InternalEcl.g:3290:2: iv_ruleRegularExpression= ruleRegularExpression EOF
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
    // InternalEcl.g:3296:1: ruleRegularExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleRegularExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEcl.g:3302:2: (this_STRING_0= RULE_STRING )
            // InternalEcl.g:3303:2: this_STRING_0= RULE_STRING
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
    // InternalEcl.g:3313:1: entryRuleLanguageFilter returns [EObject current=null] : iv_ruleLanguageFilter= ruleLanguageFilter EOF ;
    public final EObject entryRuleLanguageFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFilter = null;


        try {
            // InternalEcl.g:3313:55: (iv_ruleLanguageFilter= ruleLanguageFilter EOF )
            // InternalEcl.g:3314:2: iv_ruleLanguageFilter= ruleLanguageFilter EOF
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
    // InternalEcl.g:3320:1: ruleLanguageFilter returns [EObject current=null] : (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:3326:2: ( (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3327:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3327:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3328:3: this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_LANGUAGE_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3332:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3333:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3333:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3334:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalEcl.g:3351:3: ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( ((LA39_0>=RULE_DISJUNCTION_KEYWORD && LA39_0<=RULE_CONJUNCTION_KEYWORD)||LA39_0==RULE_EXCLUSION_KEYWORD||LA39_0==RULE_REVERSED||(LA39_0>=RULE_TERM_KEYWORD && LA39_0<=RULE_DIALECT_KEYWORD)||(LA39_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA39_0<=RULE_MODULEID_KEYWORD)||(LA39_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA39_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA39_0==RULE_HISTORY_KEYWORD||(LA39_0>=RULE_TRUE_KEYWORD && LA39_0<=RULE_KEYWORD)) ) {
                alt39=1;
            }
            else if ( (LA39_0==RULE_ROUND_OPEN) ) {
                alt39=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }
            switch (alt39) {
                case 1 :
                    // InternalEcl.g:3352:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:3352:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:3353:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:3353:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    // InternalEcl.g:3354:6: lv_languageCodes_2_0= ruleUnquotedString
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
                    // InternalEcl.g:3372:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3372:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3373:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3377:5: ( (lv_languageCodes_4_0= ruleUnquotedString ) )+
                    int cnt38=0;
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( ((LA38_0>=RULE_DISJUNCTION_KEYWORD && LA38_0<=RULE_CONJUNCTION_KEYWORD)||LA38_0==RULE_EXCLUSION_KEYWORD||LA38_0==RULE_REVERSED||(LA38_0>=RULE_TERM_KEYWORD && LA38_0<=RULE_DIALECT_KEYWORD)||(LA38_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA38_0<=RULE_MODULEID_KEYWORD)||(LA38_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA38_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA38_0==RULE_HISTORY_KEYWORD||(LA38_0>=RULE_TRUE_KEYWORD && LA38_0<=RULE_KEYWORD)) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalEcl.g:3378:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:3378:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:3379:7: lv_languageCodes_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    if ( cnt38 >= 1 ) break loop38;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(38, input);
                                throw eee;
                        }
                        cnt38++;
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
    // InternalEcl.g:3406:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEcl.g:3406:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEcl.g:3407:2: iv_ruleTypeFilter= ruleTypeFilter EOF
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
    // InternalEcl.g:3413:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3419:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEcl.g:3420:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEcl.g:3420:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_TYPEID_KEYWORD) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_TYPE_KEYWORD) ) {
                alt40=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalEcl.g:3421:3: this_TypeIdFilter_0= ruleTypeIdFilter
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
                    // InternalEcl.g:3433:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
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
    // InternalEcl.g:3448:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEcl.g:3448:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEcl.g:3449:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
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
    // InternalEcl.g:3455:1: ruleTypeIdFilter returns [EObject current=null] : (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPEID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3461:2: ( (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:3462:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:3462:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:3463:3: this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) )
            {
            this_TYPEID_KEYWORD_0=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3467:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3468:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3468:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3469:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:3486:3: ( (lv_type_2_0= ruleFilterValue ) )
            // InternalEcl.g:3487:4: (lv_type_2_0= ruleFilterValue )
            {
            // InternalEcl.g:3487:4: (lv_type_2_0= ruleFilterValue )
            // InternalEcl.g:3488:5: lv_type_2_0= ruleFilterValue
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
    // InternalEcl.g:3509:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEcl.g:3509:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEcl.g:3510:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
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
    // InternalEcl.g:3516:1: ruleTypeTokenFilter returns [EObject current=null] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:3522:2: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3523:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3523:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3524:3: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3528:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3529:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3529:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3530:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalEcl.g:3547:3: ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( ((LA42_0>=RULE_DISJUNCTION_KEYWORD && LA42_0<=RULE_CONJUNCTION_KEYWORD)||LA42_0==RULE_EXCLUSION_KEYWORD||LA42_0==RULE_REVERSED||(LA42_0>=RULE_TERM_KEYWORD && LA42_0<=RULE_DIALECT_KEYWORD)||(LA42_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA42_0<=RULE_MODULEID_KEYWORD)||(LA42_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA42_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA42_0==RULE_HISTORY_KEYWORD||(LA42_0>=RULE_TRUE_KEYWORD && LA42_0<=RULE_KEYWORD)) ) {
                alt42=1;
            }
            else if ( (LA42_0==RULE_ROUND_OPEN) ) {
                alt42=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalEcl.g:3548:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:3548:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:3549:5: (lv_tokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:3549:5: (lv_tokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:3550:6: lv_tokens_2_0= ruleUnquotedString
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
                    // InternalEcl.g:3568:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3568:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3569:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3573:5: ( (lv_tokens_4_0= ruleUnquotedString ) )+
                    int cnt41=0;
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( ((LA41_0>=RULE_DISJUNCTION_KEYWORD && LA41_0<=RULE_CONJUNCTION_KEYWORD)||LA41_0==RULE_EXCLUSION_KEYWORD||LA41_0==RULE_REVERSED||(LA41_0>=RULE_TERM_KEYWORD && LA41_0<=RULE_DIALECT_KEYWORD)||(LA41_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA41_0<=RULE_MODULEID_KEYWORD)||(LA41_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA41_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA41_0==RULE_HISTORY_KEYWORD||(LA41_0>=RULE_TRUE_KEYWORD && LA41_0<=RULE_KEYWORD)) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalEcl.g:3574:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:3574:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:3575:7: lv_tokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    if ( cnt41 >= 1 ) break loop41;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(41, input);
                                throw eee;
                        }
                        cnt41++;
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
    // InternalEcl.g:3602:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEcl.g:3602:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEcl.g:3603:2: iv_ruleDialectFilter= ruleDialectFilter EOF
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
    // InternalEcl.g:3609:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3615:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEcl.g:3616:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEcl.g:3616:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_DIALECTID_KEYWORD) ) {
                alt43=1;
            }
            else if ( (LA43_0==RULE_DIALECT_KEYWORD) ) {
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
                    // InternalEcl.g:3617:3: this_DialectIdFilter_0= ruleDialectIdFilter
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
                    // InternalEcl.g:3629:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
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
    // InternalEcl.g:3644:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEcl.g:3644:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEcl.g:3645:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
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
    // InternalEcl.g:3651:1: ruleDialectIdFilter returns [EObject current=null] : (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:3657:2: ( (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3658:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3658:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3659:3: this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECTID_KEYWORD_0=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3663:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3664:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3664:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3665:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:3682:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt45=2;
            alt45 = dfa45.predict(input);
            switch (alt45) {
                case 1 :
                    // InternalEcl.g:3683:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEcl.g:3683:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEcl.g:3684:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEcl.g:3684:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEcl.g:3685:6: lv_dialects_2_0= ruleDialect
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
                    // InternalEcl.g:3703:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3703:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3704:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3708:5: ( (lv_dialects_4_0= ruleDialect ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( ((LA44_0>=RULE_LT_EM && LA44_0<=RULE_CARET)||LA44_0==RULE_ROUND_OPEN||LA44_0==RULE_WILDCARD||(LA44_0>=RULE_DIGIT_NONZERO && LA44_0<=RULE_DIGIT_ZERO)) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalEcl.g:3709:6: (lv_dialects_4_0= ruleDialect )
                    	    {
                    	    // InternalEcl.g:3709:6: (lv_dialects_4_0= ruleDialect )
                    	    // InternalEcl.g:3710:7: lv_dialects_4_0= ruleDialect
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
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
                    	    if ( cnt44 >= 1 ) break loop44;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
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
    // InternalEcl.g:3737:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEcl.g:3737:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEcl.g:3738:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
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
    // InternalEcl.g:3744:1: ruleDialectAliasFilter returns [EObject current=null] : (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:3750:2: ( (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3751:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3751:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3752:3: this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECT_KEYWORD_0=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3756:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3757:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3757:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3758:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalEcl.g:3775:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( ((LA47_0>=RULE_DISJUNCTION_KEYWORD && LA47_0<=RULE_CONJUNCTION_KEYWORD)||LA47_0==RULE_EXCLUSION_KEYWORD||LA47_0==RULE_REVERSED||(LA47_0>=RULE_TERM_KEYWORD && LA47_0<=RULE_DIALECT_KEYWORD)||(LA47_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA47_0<=RULE_MODULEID_KEYWORD)||(LA47_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA47_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||(LA47_0>=RULE_HISTORY_KEYWORD && LA47_0<=RULE_DASH)||(LA47_0>=RULE_DIGIT_NONZERO && LA47_0<=RULE_KEYWORD)) ) {
                alt47=1;
            }
            else if ( (LA47_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEcl.g:3776:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEcl.g:3776:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEcl.g:3777:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEcl.g:3777:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEcl.g:3778:6: lv_dialects_2_0= ruleDialectAlias
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
                    // InternalEcl.g:3796:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:3796:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:3797:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:3801:5: ( (lv_dialects_4_0= ruleDialectAlias ) )+
                    int cnt46=0;
                    loop46:
                    do {
                        int alt46=2;
                        int LA46_0 = input.LA(1);

                        if ( ((LA46_0>=RULE_DISJUNCTION_KEYWORD && LA46_0<=RULE_CONJUNCTION_KEYWORD)||LA46_0==RULE_EXCLUSION_KEYWORD||LA46_0==RULE_REVERSED||(LA46_0>=RULE_TERM_KEYWORD && LA46_0<=RULE_DIALECT_KEYWORD)||(LA46_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA46_0<=RULE_MODULEID_KEYWORD)||(LA46_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA46_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||(LA46_0>=RULE_HISTORY_KEYWORD && LA46_0<=RULE_DASH)||(LA46_0>=RULE_DIGIT_NONZERO && LA46_0<=RULE_KEYWORD)) ) {
                            alt46=1;
                        }


                        switch (alt46) {
                    	case 1 :
                    	    // InternalEcl.g:3802:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    {
                    	    // InternalEcl.g:3802:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    // InternalEcl.g:3803:7: lv_dialects_4_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_40);
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
                    	    if ( cnt46 >= 1 ) break loop46;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(46, input);
                                throw eee;
                        }
                        cnt46++;
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
    // InternalEcl.g:3830:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEcl.g:3830:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEcl.g:3831:2: iv_ruleDialect= ruleDialect EOF
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
    // InternalEcl.g:3837:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3843:2: ( ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:3844:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:3844:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEcl.g:3845:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:3845:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:3846:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:3846:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:3847:5: lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_41);
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

            // InternalEcl.g:3864:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt48=2;
            alt48 = dfa48.predict(input);
            switch (alt48) {
                case 1 :
                    // InternalEcl.g:3865:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEcl.g:3865:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEcl.g:3866:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEcl.g:3887:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:3889:2: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEcl.g:3890:2: iv_ruleDialectAlias= ruleDialectAlias EOF
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
    // InternalEcl.g:3899:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_2_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:3906:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:3907:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:3907:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )? )
            // InternalEcl.g:3908:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) (this_WS_1= RULE_WS )* ( (lv_acceptability_2_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:3908:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEcl.g:3909:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEcl.g:3909:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEcl.g:3910:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_42);
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

            // InternalEcl.g:3927:3: (this_WS_1= RULE_WS )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_WS) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalEcl.g:3928:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_42); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getDialectAliasAccess().getWSTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            // InternalEcl.g:3933:3: ( (lv_acceptability_2_0= ruleAcceptability ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==RULE_ROUND_OPEN) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEcl.g:3934:4: (lv_acceptability_2_0= ruleAcceptability )
                    {
                    // InternalEcl.g:3934:4: (lv_acceptability_2_0= ruleAcceptability )
                    // InternalEcl.g:3935:5: lv_acceptability_2_0= ruleAcceptability
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
    // InternalEcl.g:3959:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEcl.g:3959:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEcl.g:3960:2: iv_ruleAcceptability= ruleAcceptability EOF
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
    // InternalEcl.g:3966:1: ruleAcceptability returns [EObject current=null] : (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptabilityIdSet_0 = null;

        EObject this_AcceptabilityTokenSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3972:2: ( (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) )
            // InternalEcl.g:3973:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            {
            // InternalEcl.g:3973:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_ROUND_OPEN) ) {
                int LA51_1 = input.LA(2);

                if ( ((LA51_1>=RULE_DIGIT_NONZERO && LA51_1<=RULE_DIGIT_ZERO)) ) {
                    alt51=1;
                }
                else if ( ((LA51_1>=RULE_DISJUNCTION_KEYWORD && LA51_1<=RULE_CONJUNCTION_KEYWORD)||LA51_1==RULE_EXCLUSION_KEYWORD||LA51_1==RULE_REVERSED||(LA51_1>=RULE_TERM_KEYWORD && LA51_1<=RULE_DIALECT_KEYWORD)||(LA51_1>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA51_1<=RULE_MODULEID_KEYWORD)||(LA51_1>=RULE_EFFECTIVE_TIME_KEYWORD && LA51_1<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA51_1==RULE_HISTORY_KEYWORD||(LA51_1>=RULE_TRUE_KEYWORD && LA51_1<=RULE_KEYWORD)) ) {
                    alt51=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 51, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 51, 0, input);

                throw nvae;
            }
            switch (alt51) {
                case 1 :
                    // InternalEcl.g:3974:3: this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet
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
                    // InternalEcl.g:3986:3: this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet
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
    // InternalEcl.g:4001:1: entryRuleAcceptabilityIdSet returns [EObject current=null] : iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF ;
    public final EObject entryRuleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityIdSet = null;


        try {
            // InternalEcl.g:4001:59: (iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF )
            // InternalEcl.g:4002:2: iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF
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
    // InternalEcl.g:4008:1: ruleAcceptabilityIdSet returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4014:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEcl.g:4015:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEcl.g:4015:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:4016:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:4016:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEcl.g:4017:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
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
    // InternalEcl.g:4037:1: entryRuleAcceptabilityTokenSet returns [EObject current=null] : iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF ;
    public final EObject entryRuleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityTokenSet = null;


        try {
            // InternalEcl.g:4037:62: (iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF )
            // InternalEcl.g:4038:2: iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF
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
    // InternalEcl.g:4044:1: ruleAcceptabilityTokenSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        AntlrDatatypeRuleToken lv_acceptabilities_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4050:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:4051:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:4051:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:4052:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4056:3: ( (lv_acceptabilities_1_0= ruleUnquotedString ) )+
            int cnt52=0;
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( ((LA52_0>=RULE_DISJUNCTION_KEYWORD && LA52_0<=RULE_CONJUNCTION_KEYWORD)||LA52_0==RULE_EXCLUSION_KEYWORD||LA52_0==RULE_REVERSED||(LA52_0>=RULE_TERM_KEYWORD && LA52_0<=RULE_DIALECT_KEYWORD)||(LA52_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA52_0<=RULE_MODULEID_KEYWORD)||(LA52_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA52_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA52_0==RULE_HISTORY_KEYWORD||(LA52_0>=RULE_TRUE_KEYWORD && LA52_0<=RULE_KEYWORD)) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalEcl.g:4057:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    {
            	    // InternalEcl.g:4057:4: (lv_acceptabilities_1_0= ruleUnquotedString )
            	    // InternalEcl.g:4058:5: lv_acceptabilities_1_0= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesUnquotedStringParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
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
            	    if ( cnt52 >= 1 ) break loop52;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(52, input);
                        throw eee;
                }
                cnt52++;
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
    // InternalEcl.g:4083:1: entryRuleDefinitionStatusFilter returns [EObject current=null] : iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF ;
    public final EObject entryRuleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusFilter = null;


        try {
            // InternalEcl.g:4083:63: (iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF )
            // InternalEcl.g:4084:2: iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF
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
    // InternalEcl.g:4090:1: ruleDefinitionStatusFilter returns [EObject current=null] : (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) ;
    public final EObject ruleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionStatusIdFilter_0 = null;

        EObject this_DefinitionStatusTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4096:2: ( (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) )
            // InternalEcl.g:4097:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            {
            // InternalEcl.g:4097:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DEFINITION_STATUS_ID_KEYWORD) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_DEFINITION_STATUS_TOKEN_KEYWORD) ) {
                alt53=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalEcl.g:4098:3: this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter
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
                    // InternalEcl.g:4110:3: this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter
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
    // InternalEcl.g:4125:1: entryRuleDefinitionStatusIdFilter returns [EObject current=null] : iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF ;
    public final EObject entryRuleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusIdFilter = null;


        try {
            // InternalEcl.g:4125:65: (iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF )
            // InternalEcl.g:4126:2: iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF
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
    // InternalEcl.g:4132:1: ruleDefinitionStatusIdFilter returns [EObject current=null] : (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_ID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_definitionStatus_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4138:2: ( (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4139:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4139:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4140:3: this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            {
            this_DEFINITION_STATUS_ID_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_0, grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4144:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4145:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4145:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4146:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:4163:3: ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            // InternalEcl.g:4164:4: (lv_definitionStatus_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4164:4: (lv_definitionStatus_2_0= ruleFilterValue )
            // InternalEcl.g:4165:5: lv_definitionStatus_2_0= ruleFilterValue
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
    // InternalEcl.g:4186:1: entryRuleDefinitionStatusTokenFilter returns [EObject current=null] : iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF ;
    public final EObject entryRuleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusTokenFilter = null;


        try {
            // InternalEcl.g:4186:68: (iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF )
            // InternalEcl.g:4187:2: iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF
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
    // InternalEcl.g:4193:1: ruleDefinitionStatusTokenFilter returns [EObject current=null] : (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:4199:2: ( (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4200:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4200:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4201:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DEFINITION_STATUS_TOKEN_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_0, grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4205:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4206:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4206:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4207:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalEcl.g:4224:3: ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( ((LA55_0>=RULE_DISJUNCTION_KEYWORD && LA55_0<=RULE_CONJUNCTION_KEYWORD)||LA55_0==RULE_EXCLUSION_KEYWORD||LA55_0==RULE_REVERSED||(LA55_0>=RULE_TERM_KEYWORD && LA55_0<=RULE_DIALECT_KEYWORD)||(LA55_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA55_0<=RULE_MODULEID_KEYWORD)||(LA55_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA55_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA55_0==RULE_HISTORY_KEYWORD||(LA55_0>=RULE_TRUE_KEYWORD && LA55_0<=RULE_KEYWORD)) ) {
                alt55=1;
            }
            else if ( (LA55_0==RULE_ROUND_OPEN) ) {
                alt55=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalEcl.g:4225:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:4225:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:4226:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:4226:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:4227:6: lv_definitionStatusTokens_2_0= ruleUnquotedString
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
                    // InternalEcl.g:4245:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4245:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4246:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4250:5: ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+
                    int cnt54=0;
                    loop54:
                    do {
                        int alt54=2;
                        int LA54_0 = input.LA(1);

                        if ( ((LA54_0>=RULE_DISJUNCTION_KEYWORD && LA54_0<=RULE_CONJUNCTION_KEYWORD)||LA54_0==RULE_EXCLUSION_KEYWORD||LA54_0==RULE_REVERSED||(LA54_0>=RULE_TERM_KEYWORD && LA54_0<=RULE_DIALECT_KEYWORD)||(LA54_0>=RULE_DEFINITION_STATUS_ID_KEYWORD && LA54_0<=RULE_MODULEID_KEYWORD)||(LA54_0>=RULE_EFFECTIVE_TIME_KEYWORD && LA54_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA54_0==RULE_HISTORY_KEYWORD||(LA54_0>=RULE_TRUE_KEYWORD && LA54_0<=RULE_KEYWORD)) ) {
                            alt54=1;
                        }


                        switch (alt54) {
                    	case 1 :
                    	    // InternalEcl.g:4251:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:4251:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:4252:7: lv_definitionStatusTokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
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
                    	    if ( cnt54 >= 1 ) break loop54;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(54, input);
                                throw eee;
                        }
                        cnt54++;
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
    // InternalEcl.g:4279:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEcl.g:4279:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEcl.g:4280:2: iv_ruleModuleFilter= ruleModuleFilter EOF
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
    // InternalEcl.g:4286:1: ruleModuleFilter returns [EObject current=null] : (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_MODULEID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_moduleId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4292:2: ( (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4293:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4293:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4294:3: this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_moduleId_2_0= ruleFilterValue ) )
            {
            this_MODULEID_KEYWORD_0=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MODULEID_KEYWORD_0, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4302:3: ( (lv_moduleId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4303:4: (lv_moduleId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4303:4: (lv_moduleId_2_0= ruleFilterValue )
            // InternalEcl.g:4304:5: lv_moduleId_2_0= ruleFilterValue
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
    // InternalEcl.g:4325:1: entryRuleEffectiveTimeFilter returns [EObject current=null] : iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF ;
    public final EObject entryRuleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveTimeFilter = null;


        try {
            // InternalEcl.g:4325:60: (iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF )
            // InternalEcl.g:4326:2: iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF
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
    // InternalEcl.g:4332:1: ruleEffectiveTimeFilter returns [EObject current=null] : (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        Token this_EFFECTIVE_TIME_KEYWORD_0=null;
        Token lv_effectiveTime_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4338:2: ( (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:4339:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:4339:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            // InternalEcl.g:4340:3: this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) )
            {
            this_EFFECTIVE_TIME_KEYWORD_0=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_0, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4344:3: ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:4345:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:4345:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:4346:5: lv_op_1_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalEcl.g:4363:3: ( (lv_effectiveTime_2_0= RULE_STRING ) )
            // InternalEcl.g:4364:4: (lv_effectiveTime_2_0= RULE_STRING )
            {
            // InternalEcl.g:4364:4: (lv_effectiveTime_2_0= RULE_STRING )
            // InternalEcl.g:4365:5: lv_effectiveTime_2_0= RULE_STRING
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
    // InternalEcl.g:4385:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEcl.g:4385:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEcl.g:4386:2: iv_ruleActiveFilter= ruleActiveFilter EOF
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
    // InternalEcl.g:4392:1: ruleActiveFilter returns [EObject current=null] : (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACTIVE_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        AntlrDatatypeRuleToken lv_active_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4398:2: ( (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) ) )
            // InternalEcl.g:4399:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            {
            // InternalEcl.g:4399:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) ) )
            // InternalEcl.g:4400:3: this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_active_2_0= ruleActiveBoolean ) )
            {
            this_ACTIVE_KEYWORD_0=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACTIVE_KEYWORD_0, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4408:3: ( (lv_active_2_0= ruleActiveBoolean ) )
            // InternalEcl.g:4409:4: (lv_active_2_0= ruleActiveBoolean )
            {
            // InternalEcl.g:4409:4: (lv_active_2_0= ruleActiveBoolean )
            // InternalEcl.g:4410:5: lv_active_2_0= ruleActiveBoolean
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
    // InternalEcl.g:4431:1: entryRuleSemanticTagFilter returns [EObject current=null] : iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF ;
    public final EObject entryRuleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticTagFilter = null;


        try {
            // InternalEcl.g:4431:58: (iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF )
            // InternalEcl.g:4432:2: iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF
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
    // InternalEcl.g:4438:1: ruleSemanticTagFilter returns [EObject current=null] : (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        Token this_SEMANTIC_TAG_KEYWORD_0=null;
        Token lv_semanticTag_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4444:2: ( (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:4445:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:4445:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            // InternalEcl.g:4446:3: this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) )
            {
            this_SEMANTIC_TAG_KEYWORD_0=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEMANTIC_TAG_KEYWORD_0, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4450:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4451:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4451:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4452:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalEcl.g:4469:3: ( (lv_semanticTag_2_0= RULE_STRING ) )
            // InternalEcl.g:4470:4: (lv_semanticTag_2_0= RULE_STRING )
            {
            // InternalEcl.g:4470:4: (lv_semanticTag_2_0= RULE_STRING )
            // InternalEcl.g:4471:5: lv_semanticTag_2_0= RULE_STRING
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
    // InternalEcl.g:4491:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEcl.g:4491:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEcl.g:4492:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
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
    // InternalEcl.g:4498:1: rulePreferredInFilter returns [EObject current=null] : (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_PREFERRED_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4504:2: ( (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4505:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4505:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4506:3: this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_PREFERRED_IN_KEYWORD_0=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4514:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4515:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4515:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4516:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:4537:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEcl.g:4537:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEcl.g:4538:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
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
    // InternalEcl.g:4544:1: ruleAcceptableInFilter returns [EObject current=null] : (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACCEPTABLE_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4550:2: ( (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4551:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4551:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4552:3: this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_ACCEPTABLE_IN_KEYWORD_0=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4560:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4561:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4561:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4562:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:4583:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEcl.g:4583:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEcl.g:4584:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
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
    // InternalEcl.g:4590:1: ruleLanguageRefSetFilter returns [EObject current=null] : (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_REFSET_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4596:2: ( (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4597:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4597:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4598:3: this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_LANGUAGE_REFSET_ID_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4606:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4607:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4607:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:4608:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:4629:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEcl.g:4629:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEcl.g:4630:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
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
    // InternalEcl.g:4636:1: ruleCaseSignificanceFilter returns [EObject current=null] : (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4642:2: ( (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4643:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4643:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4644:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            {
            this_CASE_SIGNIFICANCE_ID_KEYWORD_0=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_43); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:4652:3: ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4653:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4653:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            // InternalEcl.g:4654:5: lv_caseSignificanceId_2_0= ruleFilterValue
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
    // InternalEcl.g:4675:1: entryRuleFilterValue returns [EObject current=null] : iv_ruleFilterValue= ruleFilterValue EOF ;
    public final EObject entryRuleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterValue = null;


        try {
            // InternalEcl.g:4675:52: (iv_ruleFilterValue= ruleFilterValue EOF )
            // InternalEcl.g:4676:2: iv_ruleFilterValue= ruleFilterValue EOF
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
    // InternalEcl.g:4682:1: ruleFilterValue returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) ;
    public final EObject ruleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject this_FilteredExpressionConstraint_0 = null;

        EObject this_EclConceptReferenceSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4688:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:4689:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:4689:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalEcl.g:4690:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
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
                    // InternalEcl.g:4702:3: this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet
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
    // InternalEcl.g:4717:1: entryRuleSupplement returns [EObject current=null] : iv_ruleSupplement= ruleSupplement EOF ;
    public final EObject entryRuleSupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplement = null;


        try {
            // InternalEcl.g:4717:51: (iv_ruleSupplement= ruleSupplement EOF )
            // InternalEcl.g:4718:2: iv_ruleSupplement= ruleSupplement EOF
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
    // InternalEcl.g:4724:1: ruleSupplement returns [EObject current=null] : this_HistorySupplement_0= ruleHistorySupplement ;
    public final EObject ruleSupplement() throws RecognitionException {
        EObject current = null;

        EObject this_HistorySupplement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4730:2: (this_HistorySupplement_0= ruleHistorySupplement )
            // InternalEcl.g:4731:2: this_HistorySupplement_0= ruleHistorySupplement
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
    // InternalEcl.g:4745:1: entryRuleHistorySupplement returns [EObject current=null] : iv_ruleHistorySupplement= ruleHistorySupplement EOF ;
    public final EObject entryRuleHistorySupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistorySupplement = null;


        try {
            // InternalEcl.g:4745:58: (iv_ruleHistorySupplement= ruleHistorySupplement EOF )
            // InternalEcl.g:4746:2: iv_ruleHistorySupplement= ruleHistorySupplement EOF
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
    // InternalEcl.g:4752:1: ruleHistorySupplement returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) ;
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
            // InternalEcl.g:4758:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:4759:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:4759:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:4760:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            this_PLUS_1=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_1, grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1());
              		
            }
            this_HISTORY_KEYWORD_2=(Token)match(input,RULE_HISTORY_KEYWORD,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HISTORY_KEYWORD_2, grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:4772:3: ()
            // InternalEcl.g:4773:4: 
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

            // InternalEcl.g:4782:3: ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_ROUND_OPEN||(LA58_0>=RULE_DASH && LA58_0<=RULE_UNDERSCORE)) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalEcl.g:4783:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    {
                    // InternalEcl.g:4783:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    // InternalEcl.g:4784:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    {
                    // InternalEcl.g:4784:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( ((LA57_0>=RULE_DASH && LA57_0<=RULE_UNDERSCORE)) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==RULE_ROUND_OPEN) ) {
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
                            // InternalEcl.g:4785:6: lv_history_4_1= ruleHistoryProfile
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_28);
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
                            // InternalEcl.g:4801:6: lv_history_4_2= ruleNestedExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_28);
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
    // InternalEcl.g:4827:1: entryRuleHistoryProfile returns [EObject current=null] : iv_ruleHistoryProfile= ruleHistoryProfile EOF ;
    public final EObject entryRuleHistoryProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistoryProfile = null;


        try {
            // InternalEcl.g:4827:55: (iv_ruleHistoryProfile= ruleHistoryProfile EOF )
            // InternalEcl.g:4828:2: iv_ruleHistoryProfile= ruleHistoryProfile EOF
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
    // InternalEcl.g:4834:1: ruleHistoryProfile returns [EObject current=null] : ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) ;
    public final EObject ruleHistoryProfile() throws RecognitionException {
        EObject current = null;

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        AntlrDatatypeRuleToken lv_profile_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4840:2: ( ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) )
            // InternalEcl.g:4841:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            {
            // InternalEcl.g:4841:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            // InternalEcl.g:4842:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            {
            // InternalEcl.g:4842:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_DASH) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_UNDERSCORE) ) {
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
                    // InternalEcl.g:4843:4: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_0, grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:4848:4: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FollowSets000.FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNDERSCORE_1, grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:4853:3: ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            // InternalEcl.g:4854:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            {
            // InternalEcl.g:4854:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            // InternalEcl.g:4855:5: lv_profile_2_0= ruleHISTORY_PROFILE_TYPE
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
    // InternalEcl.g:4876:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4878:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalEcl.g:4879:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
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
    // InternalEcl.g:4888:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4895:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEcl.g:4896:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEcl.g:4896:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt60=0;
            loop60:
            do {
                int alt60=3;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_DIGIT_NONZERO) ) {
                    int LA60_2 = input.LA(2);

                    if ( (synpred86_InternalEcl()) ) {
                        alt60=1;
                    }


                }
                else if ( (LA60_0==RULE_DIGIT_ZERO) ) {
                    int LA60_3 = input.LA(2);

                    if ( (synpred87_InternalEcl()) ) {
                        alt60=2;
                    }


                }


                switch (alt60) {
            	case 1 :
            	    // InternalEcl.g:4897:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:4905:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt60 >= 1 ) break loop60;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(60, input);
                        throw eee;
                }
                cnt60++;
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
    // InternalEcl.g:4919:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4921:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEcl.g:4922:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
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
    // InternalEcl.g:4931:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4938:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+ )
            // InternalEcl.g:4939:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            {
            // InternalEcl.g:4939:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )+
            int cnt61=0;
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_DIGIT_NONZERO) ) {
                    alt61=1;
                }
                else if ( (LA61_0==RULE_DIGIT_ZERO) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalEcl.g:4940:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:4948:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_ZEROTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt61 >= 1 ) break loop61;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(61, input);
                        throw eee;
                }
                cnt61++;
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
    // InternalEcl.g:4962:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4964:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEcl.g:4965:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
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
    // InternalEcl.g:4974:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_DIGIT_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:4981:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* ) )
            // InternalEcl.g:4982:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            {
            // InternalEcl.g:4982:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )* )
            // InternalEcl.g:4983:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_51);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5000:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_DIGIT_ZERO_3= RULE_DIGIT_ZERO )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_DIGIT_NONZERO) ) {
                    alt62=1;
                }
                else if ( (LA62_0==RULE_DIGIT_ZERO) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalEcl.g:5001:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5009:4: this_DIGIT_ZERO_3= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_3=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_ZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop62;
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
    // InternalEcl.g:5024:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5026:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEcl.g:5027:2: iv_ruleMaxValue= ruleMaxValue EOF
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
    // InternalEcl.g:5036:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5043:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEcl.g:5044:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEcl.g:5044:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_DIGIT_NONZERO && LA63_0<=RULE_DIGIT_ZERO)) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_WILDCARD) ) {
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
                    // InternalEcl.g:5045:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEcl.g:5056:3: this_WILDCARD_1= RULE_WILDCARD
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
    // InternalEcl.g:5070:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5072:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEcl.g:5073:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalEcl.g:5082:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5089:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEcl.g:5090:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEcl.g:5090:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEcl.g:5091:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEcl.g:5091:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt64=3;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_PLUS) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_DASH) ) {
                alt64=2;
            }
            switch (alt64) {
                case 1 :
                    // InternalEcl.g:5092:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5100:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_12); if (state.failed) return current;
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
    // InternalEcl.g:5125:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5127:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEcl.g:5128:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalEcl.g:5137:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5144:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEcl.g:5145:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEcl.g:5145:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEcl.g:5146:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEcl.g:5146:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt65=3;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_PLUS) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_DASH) ) {
                alt65=2;
            }
            switch (alt65) {
                case 1 :
                    // InternalEcl.g:5147:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5155:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_26); if (state.failed) return current;
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
    // InternalEcl.g:5180:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5182:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEcl.g:5183:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalEcl.g:5192:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_KEYWORD_0=null;
        Token this_FALSE_KEYWORD_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5199:2: ( (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) )
            // InternalEcl.g:5200:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            {
            // InternalEcl.g:5200:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_TRUE_KEYWORD) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_FALSE_KEYWORD) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalEcl.g:5201:3: this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD
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
                    // InternalEcl.g:5209:3: this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD
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
    // InternalEcl.g:5223:1: entryRuleActiveBoolean returns [String current=null] : iv_ruleActiveBoolean= ruleActiveBoolean EOF ;
    public final String entryRuleActiveBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActiveBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5225:2: (iv_ruleActiveBoolean= ruleActiveBoolean EOF )
            // InternalEcl.g:5226:2: iv_ruleActiveBoolean= ruleActiveBoolean EOF
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
    // InternalEcl.g:5235:1: ruleActiveBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleActiveBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;

        AntlrDatatypeRuleToken this_Boolean_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5242:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) )
            // InternalEcl.g:5243:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            {
            // InternalEcl.g:5243:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( ((LA67_0>=RULE_DIGIT_NONZERO && LA67_0<=RULE_DIGIT_ZERO)) ) {
                alt67=1;
            }
            else if ( ((LA67_0>=RULE_TRUE_KEYWORD && LA67_0<=RULE_FALSE_KEYWORD)) ) {
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
                    // InternalEcl.g:5244:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEcl.g:5255:3: this_Boolean_1= ruleBoolean
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
    // InternalEcl.g:5272:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalEcl.g:5272:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalEcl.g:5273:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalEcl.g:5279:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_30= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_31= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_32= RULE_KEYWORD ) ;
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
        Token this_DESCRIPTION_SHORT_KEYWORD_30=null;
        Token this_CONCEPT_SHORT_KEYWORD_31=null;
        Token this_KEYWORD_32=null;


        	enterRule();

        try {
            // InternalEcl.g:5285:2: ( (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_30= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_31= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_32= RULE_KEYWORD ) )
            // InternalEcl.g:5286:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_30= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_31= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_32= RULE_KEYWORD )
            {
            // InternalEcl.g:5286:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_REVERSED_29= RULE_REVERSED | this_DESCRIPTION_SHORT_KEYWORD_30= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_31= RULE_CONCEPT_SHORT_KEYWORD | this_KEYWORD_32= RULE_KEYWORD )
            int alt68=33;
            switch ( input.LA(1) ) {
            case RULE_HISTORY_KEYWORD:
                {
                alt68=1;
                }
                break;
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt68=2;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
                {
                alt68=3;
                }
                break;
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt68=4;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt68=5;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt68=6;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt68=7;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt68=8;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt68=9;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
                {
                alt68=10;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt68=11;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt68=12;
                }
                break;
            case RULE_DIALECT_KEYWORD:
                {
                alt68=13;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt68=14;
                }
                break;
            case RULE_TYPEID_KEYWORD:
                {
                alt68=15;
                }
                break;
            case RULE_EXCLUSION_KEYWORD:
                {
                alt68=16;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt68=17;
                }
                break;
            case RULE_FALSE_KEYWORD:
                {
                alt68=18;
                }
                break;
            case RULE_MATCH_KEYWORD:
                {
                alt68=19;
                }
                break;
            case RULE_REGEX_KEYWORD:
                {
                alt68=20;
                }
                break;
            case RULE_TERM_KEYWORD:
                {
                alt68=21;
                }
                break;
            case RULE_TRUE_KEYWORD:
                {
                alt68=22;
                }
                break;
            case RULE_TYPE_KEYWORD:
                {
                alt68=23;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt68=24;
                }
                break;
            case RULE_MIN_KEYWORD:
                {
                alt68=25;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt68=26;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt68=27;
                }
                break;
            case RULE_CONJUNCTION_KEYWORD:
                {
                alt68=28;
                }
                break;
            case RULE_DISJUNCTION_KEYWORD:
                {
                alt68=29;
                }
                break;
            case RULE_REVERSED:
                {
                alt68=30;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt68=31;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt68=32;
                }
                break;
            case RULE_KEYWORD:
                {
                alt68=33;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // InternalEcl.g:5287:3: this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD
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
                    // InternalEcl.g:5295:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD
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
                    // InternalEcl.g:5303:3: this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD
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
                    // InternalEcl.g:5311:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD
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
                    // InternalEcl.g:5319:3: this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD
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
                    // InternalEcl.g:5327:3: this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD
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
                    // InternalEcl.g:5335:3: this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD
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
                    // InternalEcl.g:5343:3: this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD
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
                    // InternalEcl.g:5351:3: this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD
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
                    // InternalEcl.g:5359:3: this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD
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
                    // InternalEcl.g:5367:3: this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD
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
                    // InternalEcl.g:5375:3: this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD
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
                    // InternalEcl.g:5383:3: this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD
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
                    // InternalEcl.g:5391:3: this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD
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
                    // InternalEcl.g:5399:3: this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD
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
                    // InternalEcl.g:5407:3: this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD
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
                    // InternalEcl.g:5415:3: this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD
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
                    // InternalEcl.g:5423:3: this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD
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
                    // InternalEcl.g:5431:3: this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD
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
                    // InternalEcl.g:5439:3: this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD
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
                    // InternalEcl.g:5447:3: this_TERM_KEYWORD_20= RULE_TERM_KEYWORD
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
                    // InternalEcl.g:5455:3: this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD
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
                    // InternalEcl.g:5463:3: this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD
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
                    // InternalEcl.g:5471:3: this_WILD_KEYWORD_23= RULE_WILD_KEYWORD
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
                    // InternalEcl.g:5479:3: this_MIN_KEYWORD_24= RULE_MIN_KEYWORD
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
                    // InternalEcl.g:5487:3: this_MOD_KEYWORD_25= RULE_MOD_KEYWORD
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
                    // InternalEcl.g:5495:3: this_MAX_KEYWORD_26= RULE_MAX_KEYWORD
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
                    // InternalEcl.g:5503:3: this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD
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
                    // InternalEcl.g:5511:3: this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD
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
                    // InternalEcl.g:5519:3: this_REVERSED_29= RULE_REVERSED
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
                    // InternalEcl.g:5527:3: this_DESCRIPTION_SHORT_KEYWORD_30= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_30=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_30);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_30, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_30());
                      		
                    }

                    }
                    break;
                case 32 :
                    // InternalEcl.g:5535:3: this_CONCEPT_SHORT_KEYWORD_31= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_31=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_31);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_31, grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_31());
                      		
                    }

                    }
                    break;
                case 33 :
                    // InternalEcl.g:5543:3: this_KEYWORD_32= RULE_KEYWORD
                    {
                    this_KEYWORD_32=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_32);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_KEYWORD_32, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_32());
                      		
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
    // InternalEcl.g:5554:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5556:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEcl.g:5557:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
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
    // InternalEcl.g:5566:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ ;
    public final AntlrDatatypeRuleToken ruleDialectAliasValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_DIGIT_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5573:2: ( (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+ )
            // InternalEcl.g:5574:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            {
            // InternalEcl.g:5574:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+
            int cnt69=0;
            loop69:
            do {
                int alt69=5;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // InternalEcl.g:5575:3: this_DASH_0= RULE_DASH
            	    {
            	    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DASH_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5583:3: this_UnquotedString_1= ruleUnquotedString
            	    {
            	    if ( state.backtracking==0 ) {

            	      			newCompositeNode(grammarAccess.getDialectAliasValueAccess().getUnquotedStringParserRuleCall_1());
            	      		
            	    }
            	    pushFollow(FollowSets000.FOLLOW_52);
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
            	    // InternalEcl.g:5594:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
            	    {
            	    this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_ZERO_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_ZERO_2, grammarAccess.getDialectAliasValueAccess().getDIGIT_ZEROTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEcl.g:5602:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt69 >= 1 ) break loop69;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(69, input);
                        throw eee;
                }
                cnt69++;
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
    // InternalEcl.g:5616:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEcl.g:5616:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEcl.g:5617:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
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
    // InternalEcl.g:5623:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MATCH_KEYWORD_0=null;
        Token this_WILD_KEYWORD_1=null;
        Token this_EXACT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:5629:2: ( (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) )
            // InternalEcl.g:5630:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            {
            // InternalEcl.g:5630:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            int alt70=3;
            switch ( input.LA(1) ) {
            case RULE_MATCH_KEYWORD:
                {
                alt70=1;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt70=2;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt70=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }

            switch (alt70) {
                case 1 :
                    // InternalEcl.g:5631:3: this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD
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
                    // InternalEcl.g:5639:3: this_WILD_KEYWORD_1= RULE_WILD_KEYWORD
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
                    // InternalEcl.g:5647:3: this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD
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
    // InternalEcl.g:5658:1: entryRuleHISTORY_PROFILE_TYPE returns [String current=null] : iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF ;
    public final String entryRuleHISTORY_PROFILE_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHISTORY_PROFILE_TYPE = null;


        try {
            // InternalEcl.g:5658:60: (iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF )
            // InternalEcl.g:5659:2: iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF
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
    // InternalEcl.g:5665:1: ruleHISTORY_PROFILE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleHISTORY_PROFILE_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIN_KEYWORD_0=null;
        Token this_MOD_KEYWORD_1=null;
        Token this_MAX_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:5671:2: ( (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) )
            // InternalEcl.g:5672:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            {
            // InternalEcl.g:5672:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            int alt71=3;
            switch ( input.LA(1) ) {
            case RULE_MIN_KEYWORD:
                {
                alt71=1;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt71=2;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt71=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalEcl.g:5673:3: this_MIN_KEYWORD_0= RULE_MIN_KEYWORD
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
                    // InternalEcl.g:5681:3: this_MOD_KEYWORD_1= RULE_MOD_KEYWORD
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
                    // InternalEcl.g:5689:3: this_MAX_KEYWORD_2= RULE_MAX_KEYWORD
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
    // InternalEcl.g:5700:1: entryRuleSHORT_DOMAIN returns [String current=null] : iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF ;
    public final String entryRuleSHORT_DOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSHORT_DOMAIN = null;


        try {
            // InternalEcl.g:5700:52: (iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF )
            // InternalEcl.g:5701:2: iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF
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
    // InternalEcl.g:5707:1: ruleSHORT_DOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleSHORT_DOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONCEPT_SHORT_KEYWORD_0=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_1=null;


        	enterRule();

        try {
            // InternalEcl.g:5713:2: ( (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD ) )
            // InternalEcl.g:5714:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD )
            {
            // InternalEcl.g:5714:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==RULE_CONCEPT_SHORT_KEYWORD) ) {
                alt72=1;
            }
            else if ( (LA72_0==RULE_DESCRIPTION_SHORT_KEYWORD) ) {
                alt72=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalEcl.g:5715:3: this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD
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
                    // InternalEcl.g:5723:3: this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD
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
    // InternalEcl.g:5734:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:5734:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEcl.g:5735:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
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
    // InternalEcl.g:5741:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEcl.g:5747:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEcl.g:5748:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEcl.g:5748:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_EQUAL) ) {
                alt73=1;
            }
            else if ( (LA73_0==RULE_NOT_EQUAL) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalEcl.g:5749:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEcl.g:5757:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
    // InternalEcl.g:5768:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:5768:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEcl.g:5769:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
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
    // InternalEcl.g:5775:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
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
            // InternalEcl.g:5781:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEcl.g:5782:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEcl.g:5782:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt74=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt74=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt74=2;
                }
                break;
            case RULE_GT:
                {
                alt74=3;
                }
                break;
            case RULE_LT:
                {
                alt74=4;
                }
                break;
            case RULE_GTE:
                {
                alt74=5;
                }
                break;
            case RULE_LTE:
                {
                alt74=6;
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
                    // InternalEcl.g:5783:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEcl.g:5791:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
                    // InternalEcl.g:5799:3: this_GT_2= RULE_GT
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
                    // InternalEcl.g:5807:3: this_LT_3= RULE_LT
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
                    // InternalEcl.g:5815:3: this_GTE_4= RULE_GTE
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
                    // InternalEcl.g:5823:3: this_LTE_5= RULE_LTE
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

    // $ANTLR start synpred25_InternalEcl
    public final void synpred25_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1406:4: ( RULE_DISJUNCTION_KEYWORD )
        // InternalEcl.g:1406:5: RULE_DISJUNCTION_KEYWORD
        {
        match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred25_InternalEcl

    // $ANTLR start synpred27_InternalEcl
    public final void synpred27_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1474:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )
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
    // $ANTLR end synpred27_InternalEcl

    // $ANTLR start synpred29_InternalEcl
    public final void synpred29_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:1537:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:1537:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred29_InternalEcl

    // $ANTLR start synpred30_InternalEcl
    public final void synpred30_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalEcl.g:1549:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEcl.g:1549:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
    // $ANTLR end synpred30_InternalEcl

    // $ANTLR start synpred35_InternalEcl
    public final void synpred35_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:1867:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:1867:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred35_InternalEcl

    // $ANTLR start synpred70_InternalEcl
    public final void synpred70_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_dialects_2_0 = null;


        // InternalEcl.g:3683:4: ( ( (lv_dialects_2_0= ruleDialect ) ) )
        // InternalEcl.g:3683:4: ( (lv_dialects_2_0= ruleDialect ) )
        {
        // InternalEcl.g:3683:4: ( (lv_dialects_2_0= ruleDialect ) )
        // InternalEcl.g:3684:5: (lv_dialects_2_0= ruleDialect )
        {
        // InternalEcl.g:3684:5: (lv_dialects_2_0= ruleDialect )
        // InternalEcl.g:3685:6: lv_dialects_2_0= ruleDialect
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
    // $ANTLR end synpred70_InternalEcl

    // $ANTLR start synpred74_InternalEcl
    public final void synpred74_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_acceptability_1_0 = null;


        // InternalEcl.g:3865:4: ( (lv_acceptability_1_0= ruleAcceptability ) )
        // InternalEcl.g:3865:4: (lv_acceptability_1_0= ruleAcceptability )
        {
        // InternalEcl.g:3865:4: (lv_acceptability_1_0= ruleAcceptability )
        // InternalEcl.g:3866:5: lv_acceptability_1_0= ruleAcceptability
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
    // $ANTLR end synpred74_InternalEcl

    // $ANTLR start synpred82_InternalEcl
    public final void synpred82_InternalEcl_fragment() throws RecognitionException {   
        EObject this_FilteredExpressionConstraint_0 = null;


        // InternalEcl.g:4690:3: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint )
        // InternalEcl.g:4690:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
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
    // $ANTLR end synpred82_InternalEcl

    // $ANTLR start synpred86_InternalEcl
    public final void synpred86_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_0=null;

        // InternalEcl.g:4897:3: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO )
        // InternalEcl.g:4897:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred86_InternalEcl

    // $ANTLR start synpred87_InternalEcl
    public final void synpred87_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_1=null;

        // InternalEcl.g:4905:3: (this_DIGIT_ZERO_1= RULE_DIGIT_ZERO )
        // InternalEcl.g:4905:3: this_DIGIT_ZERO_1= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_1=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred87_InternalEcl

    // $ANTLR start synpred131_InternalEcl
    public final void synpred131_InternalEcl_fragment() throws RecognitionException {   
        Token this_DASH_0=null;

        // InternalEcl.g:5575:3: (this_DASH_0= RULE_DASH )
        // InternalEcl.g:5575:3: this_DASH_0= RULE_DASH
        {
        this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred131_InternalEcl

    // $ANTLR start synpred132_InternalEcl
    public final void synpred132_InternalEcl_fragment() throws RecognitionException {   
        AntlrDatatypeRuleToken this_UnquotedString_1 = null;


        // InternalEcl.g:5583:3: (this_UnquotedString_1= ruleUnquotedString )
        // InternalEcl.g:5583:3: this_UnquotedString_1= ruleUnquotedString
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
    // $ANTLR end synpred132_InternalEcl

    // $ANTLR start synpred133_InternalEcl
    public final void synpred133_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_ZERO_2=null;

        // InternalEcl.g:5594:3: (this_DIGIT_ZERO_2= RULE_DIGIT_ZERO )
        // InternalEcl.g:5594:3: this_DIGIT_ZERO_2= RULE_DIGIT_ZERO
        {
        this_DIGIT_ZERO_2=(Token)match(input,RULE_DIGIT_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_InternalEcl

    // $ANTLR start synpred134_InternalEcl
    public final void synpred134_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_3=null;

        // InternalEcl.g:5602:3: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )
        // InternalEcl.g:5602:3: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_InternalEcl

    // Delegated rules

    public final boolean synpred86_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred86_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred131_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred131_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred132_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred132_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred27_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred74_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred74_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred82_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred82_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred25_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred133_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred133_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred134_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred134_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred70_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred70_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA18 dfa18 = new DFA18(this);
    protected DFA23 dfa23 = new DFA23(this);
    protected DFA28 dfa28 = new DFA28(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA69 dfa69 = new DFA69(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\12\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\71\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\15\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\15\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\11\2\1\uffff\1\17\1\uffff\1\2\1\20\1\uffff\1\2\1\1\35\uffff\2\2",
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

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1536:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_1 = input.LA(1);

                         
                        int index18_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalEcl()) ) {s = 2;}

                        else if ( (synpred30_InternalEcl()) ) {s = 16;}

                         
                        input.seek(index18_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_15 = input.LA(1);

                         
                        int index18_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred29_InternalEcl()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index18_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
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
            "\11\1\1\uffff\1\17\1\uffff\1\1\2\uffff\2\1\35\uffff\2\1",
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

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1866:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA23_15 = input.LA(1);

                         
                        int index23_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred35_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index23_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 23, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\20\uffff";
    static final String dfa_14s = "\14\uffff\2\17\2\uffff";
    static final String dfa_15s = "\1\14\2\35\4\36\1\uffff\1\64\1\uffff\2\70\2\4\2\uffff";
    static final String dfa_16s = "\1\107\2\73\4\36\1\uffff\1\71\1\uffff\4\71\2\uffff";
    static final String dfa_17s = "\7\uffff\1\1\1\uffff\1\2\4\uffff\1\4\1\3";
    static final String dfa_18s = "\20\uffff}>";
    static final String[] dfa_19s = {
            "\1\4\3\uffff\1\3\33\uffff\1\1\30\uffff\1\2\1\5\1\6",
            "\1\11\1\10\33\uffff\2\7",
            "\1\11\1\10\33\uffff\2\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "",
            "\1\12\1\uffff\1\13\1\uffff\1\14\1\15",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\4\17\1\uffff\1\16\13\uffff\1\17\2\uffff\1\17\37\uffff\1\14\1\15",
            "\4\17\1\uffff\1\16\13\uffff\1\17\2\uffff\1\17\37\uffff\1\14\1\15",
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

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2216:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_20s = "\17\uffff";
    static final String dfa_21s = "\1\12\14\uffff\1\0\1\uffff";
    static final String dfa_22s = "\1\71\14\uffff\1\0\1\uffff";
    static final String dfa_23s = "\1\uffff\1\1\14\uffff\1\2";
    static final String dfa_24s = "\15\uffff\1\0\1\uffff}>";
    static final String[] dfa_25s = {
            "\11\1\1\uffff\1\15\1\uffff\1\1\41\uffff\2\1",
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

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[][] dfa_25 = unpackEncodedStringArray(dfa_25s);

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = dfa_20;
            this.eof = dfa_20;
            this.min = dfa_21;
            this.max = dfa_22;
            this.accept = dfa_23;
            this.special = dfa_24;
            this.transition = dfa_25;
        }
        public String getDescription() {
            return "3682:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_13 = input.LA(1);

                         
                        int index45_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index45_13);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_26s = "\10\uffff";
    static final String dfa_27s = "\1\2\7\uffff";
    static final String dfa_28s = "\2\4\2\uffff\3\4\1\0";
    static final String dfa_29s = "\1\71\1\104\2\uffff\3\71\1\0";
    static final String dfa_30s = "\2\uffff\1\2\1\1\4\uffff";
    static final String dfa_31s = "\7\uffff\1\0}>";
    static final String[] dfa_32s = {
            "\3\2\3\uffff\11\2\1\uffff\1\1\2\2\11\uffff\1\2\27\uffff\2\2",
            "\2\3\1\uffff\1\3\2\uffff\11\2\1\uffff\1\2\1\uffff\1\2\2\uffff\1\3\7\uffff\7\3\1\uffff\3\3\1\uffff\7\3\1\uffff\1\3\2\uffff\1\4\1\5\13\3",
            "",
            "",
            "\6\2\11\uffff\1\6\1\uffff\1\7\11\uffff\1\2\30\uffff\1\4\1\5",
            "\6\2\11\uffff\1\6\1\uffff\1\7\11\uffff\1\2\30\uffff\1\4\1\5",
            "\6\2\13\uffff\1\7\11\uffff\1\2\30\uffff\2\3",
            "\1\uffff"
    };

    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[][] dfa_32 = unpackEncodedStringArray(dfa_32s);

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = dfa_26;
            this.eof = dfa_27;
            this.min = dfa_28;
            this.max = dfa_29;
            this.accept = dfa_30;
            this.special = dfa_31;
            this.transition = dfa_32;
        }
        public String getDescription() {
            return "3864:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_7 = input.LA(1);

                         
                        int index48_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred74_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index48_7);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_33s = "\1\12\1\uffff\1\12\3\4\1\0\1\uffff";
    static final String dfa_34s = "\1\71\1\uffff\4\71\1\0\1\uffff";
    static final String dfa_35s = "\1\uffff\1\1\5\uffff\1\2";
    static final String dfa_36s = "\6\uffff\1\0\1\uffff}>";
    static final String[] dfa_37s = {
            "\11\1\1\uffff\1\2\1\uffff\1\1\41\uffff\2\1",
            "",
            "\11\1\1\uffff\1\1\1\uffff\1\1\41\uffff\1\3\1\4",
            "\6\1\11\uffff\1\5\1\uffff\1\6\11\uffff\1\1\30\uffff\1\3\1\4",
            "\6\1\11\uffff\1\5\1\uffff\1\6\11\uffff\1\1\30\uffff\1\3\1\4",
            "\6\1\13\uffff\1\6\11\uffff\1\1\30\uffff\2\7",
            "\1\uffff",
            ""
    };
    static final char[] dfa_33 = DFA.unpackEncodedStringToUnsignedChars(dfa_33s);
    static final char[] dfa_34 = DFA.unpackEncodedStringToUnsignedChars(dfa_34s);
    static final short[] dfa_35 = DFA.unpackEncodedString(dfa_35s);
    static final short[] dfa_36 = DFA.unpackEncodedString(dfa_36s);
    static final short[][] dfa_37 = unpackEncodedStringArray(dfa_37s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_26;
            this.eof = dfa_26;
            this.min = dfa_33;
            this.max = dfa_34;
            this.accept = dfa_35;
            this.special = dfa_36;
            this.transition = dfa_37;
        }
        public String getDescription() {
            return "4689:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_6 = input.LA(1);

                         
                        int index56_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred82_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 7;}

                         
                        input.seek(index56_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 56, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_38s = "\52\uffff";
    static final String dfa_39s = "\1\1\51\uffff";
    static final String dfa_40s = "\1\4\1\uffff\44\0\4\uffff";
    static final String dfa_41s = "\1\104\1\uffff\44\0\4\uffff";
    static final String dfa_42s = "\1\uffff\1\5\44\uffff\1\2\1\1\1\3\1\4";
    static final String dfa_43s = "\2\uffff\1\31\1\21\1\20\1\22\1\34\1\0\1\11\1\23\1\35\1\1\1\12\1\24\1\36\1\2\1\13\1\25\1\37\1\3\1\14\1\26\1\40\1\4\1\15\1\27\1\41\1\5\1\16\1\30\1\42\1\6\1\43\1\7\1\17\1\32\1\33\1\10\4\uffff}>";
    static final String[] dfa_44s = {
            "\1\3\1\2\1\1\1\24\14\uffff\2\1\3\uffff\1\40\6\uffff\1\1\1\31\1\30\1\17\1\23\1\33\1\16\1\21\1\1\1\7\1\10\1\20\1\uffff\1\12\1\22\1\15\1\14\1\13\1\11\1\6\1\uffff\1\5\1\4\1\uffff\1\45\1\44\1\32\1\26\1\25\1\27\1\34\1\35\1\36\1\37\1\41\1\42\1\43",
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
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[] dfa_39 = DFA.unpackEncodedString(dfa_39s);
    static final char[] dfa_40 = DFA.unpackEncodedStringToUnsignedChars(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final short[] dfa_42 = DFA.unpackEncodedString(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[][] dfa_44 = unpackEncodedStringArray(dfa_44s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_38;
            this.eof = dfa_39;
            this.min = dfa_40;
            this.max = dfa_41;
            this.accept = dfa_42;
            this.special = dfa_43;
            this.transition = dfa_44;
        }
        public String getDescription() {
            return "()+ loopback of 5574:2: (this_DASH_0= RULE_DASH | this_UnquotedString_1= ruleUnquotedString | this_DIGIT_ZERO_2= RULE_DIGIT_ZERO | this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_11 = input.LA(1);

                         
                        int index69_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_11);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_15 = input.LA(1);

                         
                        int index69_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_15);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_19 = input.LA(1);

                         
                        int index69_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_19);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_23 = input.LA(1);

                         
                        int index69_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_23);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_27 = input.LA(1);

                         
                        int index69_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_27);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_31 = input.LA(1);

                         
                        int index69_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_31);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_33 = input.LA(1);

                         
                        int index69_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_33);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA69_37 = input.LA(1);

                         
                        int index69_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalEcl()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_37);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_8);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA69_12 = input.LA(1);

                         
                        int index69_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_12);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA69_16 = input.LA(1);

                         
                        int index69_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_16);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA69_20 = input.LA(1);

                         
                        int index69_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_20);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA69_24 = input.LA(1);

                         
                        int index69_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_24);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA69_28 = input.LA(1);

                         
                        int index69_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_28);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA69_34 = input.LA(1);

                         
                        int index69_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_34);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred131_InternalEcl()) ) {s = 39;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA69_13 = input.LA(1);

                         
                        int index69_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_13);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA69_17 = input.LA(1);

                         
                        int index69_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_17);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA69_21 = input.LA(1);

                         
                        int index69_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_21);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA69_25 = input.LA(1);

                         
                        int index69_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_25);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA69_29 = input.LA(1);

                         
                        int index69_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_29);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA69_35 = input.LA(1);

                         
                        int index69_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_35);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA69_36 = input.LA(1);

                         
                        int index69_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalEcl()) ) {s = 40;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_36);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA69_10 = input.LA(1);

                         
                        int index69_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_10);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA69_14 = input.LA(1);

                         
                        int index69_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_14);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA69_18 = input.LA(1);

                         
                        int index69_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_18);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA69_22 = input.LA(1);

                         
                        int index69_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_22);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA69_26 = input.LA(1);

                         
                        int index69_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_26);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA69_30 = input.LA(1);

                         
                        int index69_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_30);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA69_32 = input.LA(1);

                         
                        int index69_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred132_InternalEcl()) ) {s = 38;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_32);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 69, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x030000000057FC00L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0300000006D7FC00L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000080000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0300000000000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0300000000200000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x030000000657FC00L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x030000000257FC00L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000100000011002L,0x00000000000000E0L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0300000000400000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0C00000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0350000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000FEEFA00100000L,0x000000000000000CL});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000020L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x7000000420000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x7000000420200000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xFC2FEEFE021000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0xFC2FEEFE020000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xFC2FEEFE022000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x030000000077FC00L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0xFF6FEEFE021000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0xFF6FEEFE020000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0xFF6FEEFE022000B0L,0x000000000000001FL});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x030000000057FC02L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x030001000057FC02L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000100000000000L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000100000011000L,0x00000000000000E0L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0F00000000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0010000000000000L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x03C000010057FC00L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0300000000000002L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0xFF6FEEFE020000B2L,0x000000000000001FL});
    }


}