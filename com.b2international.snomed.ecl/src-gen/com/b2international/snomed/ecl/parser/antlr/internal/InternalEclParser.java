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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_DISJUNCTION_KEYWORD", "RULE_CONJUNCTION_KEYWORD", "RULE_COMMA", "RULE_EXCLUSION_KEYWORD", "RULE_COLON", "RULE_DOT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_LT", "RULE_DBL_LT", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GT", "RULE_DBL_GT", "RULE_DBL_EM_GT", "RULE_DBL_EM_LT", "RULE_CARET_REVERSED", "RULE_CARET", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_WS", "RULE_PIPE_DELIMITED_STRING", "RULE_HASH", "RULE_STRING", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_WILDCARD", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_REVERSED", "RULE_TO", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_ID_KEYWORD", "RULE_EXACT_KEYWORD", "RULE_REGEX_KEYWORD", "RULE_TERM_KEYWORD", "RULE_LANGUAGE_KEYWORD", "RULE_TYPEID_KEYWORD", "RULE_TYPE_KEYWORD", "RULE_DIALECTID_KEYWORD", "RULE_DIALECT_KEYWORD", "RULE_DEFINITION_STATUS_ID_KEYWORD", "RULE_DEFINITION_STATUS_TOKEN_KEYWORD", "RULE_MODULEID_KEYWORD", "RULE_EFFECTIVE_TIME_KEYWORD", "RULE_ACTIVE_KEYWORD", "RULE_SEMANTIC_TAG_KEYWORD", "RULE_PREFERRED_IN_KEYWORD", "RULE_EQUAL", "RULE_ACCEPTABLE_IN_KEYWORD", "RULE_LANGUAGE_REFSET_ID_KEYWORD", "RULE_CASE_SIGNIFICANCE_ID_KEYWORD", "RULE_PLUS", "RULE_HISTORY_KEYWORD", "RULE_DASH", "RULE_UNDERSCORE", "RULE_DIGIT", "RULE_ALPHA", "RULE_CONCEPT_SHORT_KEYWORD", "RULE_DESCRIPTION_SHORT_KEYWORD", "RULE_MEMBER_SHORT_KEYWORD", "RULE_KEYWORD", "RULE_TRUE_KEYWORD", "RULE_FALSE_KEYWORD", "RULE_MATCH_KEYWORD", "RULE_WILD_KEYWORD", "RULE_MIN_KEYWORD", "RULE_MOD_KEYWORD", "RULE_MAX_KEYWORD", "RULE_NOT_EQUAL", "RULE_GTE", "RULE_LTE", "RULE_ML_COMMENT", "RULE_SL_COMMENT"
    };
    public static final int RULE_DIALECT_KEYWORD=45;
    public static final int RULE_LANGUAGE_KEYWORD=41;
    public static final int RULE_CURLY_OPEN=31;
    public static final int RULE_DBL_GT=17;
    public static final int RULE_ROUND_CLOSE=29;
    public static final int RULE_TO=34;
    public static final int RULE_GT=16;
    public static final int RULE_ACTIVE_KEYWORD=50;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=63;
    public static final int RULE_MODULEID_KEYWORD=48;
    public static final int RULE_GTE=75;
    public static final int RULE_DISJUNCTION_KEYWORD=4;
    public static final int RULE_ROUND_OPEN=28;
    public static final int RULE_UNDERSCORE=60;
    public static final int RULE_DBL_LT=13;
    public static final int RULE_TYPEID_KEYWORD=42;
    public static final int RULE_MATCH_KEYWORD=69;
    public static final int RULE_NOT_EQUAL=74;
    public static final int RULE_SQUARE_CLOSE=23;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=51;
    public static final int RULE_SQUARE_OPEN=22;
    public static final int RULE_EQUAL=53;
    public static final int RULE_COMMA=6;
    public static final int RULE_EXCLUSION_KEYWORD=7;
    public static final int RULE_LT_EM=10;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=56;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=64;
    public static final int RULE_CURLY_CLOSE=32;
    public static final int RULE_DBL_GT_EM=15;
    public static final int RULE_DIGIT=61;
    public static final int RULE_COLON=8;
    public static final int RULE_CARET_REVERSED=20;
    public static final int RULE_HISTORY_KEYWORD=58;
    public static final int RULE_MOD_KEYWORD=72;
    public static final int RULE_LT=12;
    public static final int RULE_DOUBLE_CURLY_CLOSE=36;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=55;
    public static final int RULE_EXACT_KEYWORD=38;
    public static final int RULE_ML_COMMENT=77;
    public static final int RULE_PIPE_DELIMITED_STRING=25;
    public static final int RULE_PREFERRED_IN_KEYWORD=52;
    public static final int RULE_DBL_EM_GT=18;
    public static final int RULE_ALPHA=62;
    public static final int RULE_LTE=76;
    public static final int RULE_TYPE_KEYWORD=43;
    public static final int RULE_DBL_EM_LT=19;
    public static final int RULE_ID_KEYWORD=37;
    public static final int RULE_STRING=27;
    public static final int RULE_FALSE_KEYWORD=68;
    public static final int RULE_REVERSED=33;
    public static final int RULE_SL_COMMENT=78;
    public static final int RULE_HASH=26;
    public static final int RULE_DASH=59;
    public static final int RULE_PLUS=57;
    public static final int RULE_DOT=9;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=44;
    public static final int RULE_KEYWORD=66;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=46;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=47;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=54;
    public static final int RULE_GT_EM=14;
    public static final int RULE_WS=24;
    public static final int RULE_TERM_KEYWORD=40;
    public static final int RULE_MEMBER_SHORT_KEYWORD=65;
    public static final int RULE_MAX_KEYWORD=73;
    public static final int RULE_REGEX_KEYWORD=39;
    public static final int RULE_TRUE_KEYWORD=67;
    public static final int RULE_CARET=21;
    public static final int RULE_DOUBLE_CURLY_OPEN=35;
    public static final int RULE_CONJUNCTION_KEYWORD=5;
    public static final int RULE_WILD_KEYWORD=70;
    public static final int RULE_MIN_KEYWORD=71;
    public static final int RULE_WILDCARD=30;
    public static final int RULE_EFFECTIVE_TIME_KEYWORD=49;
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

            if ( ((LA1_0>=RULE_LT_EM && LA1_0<=RULE_CARET)||LA1_0==RULE_ROUND_OPEN||LA1_0==RULE_WILDCARD||LA1_0==RULE_REVERSED||LA1_0==RULE_ID_KEYWORD||(LA1_0>=RULE_DIGIT && LA1_0<=RULE_KEYWORD)) ) {
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
    // InternalEcl.g:432:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_SupplementExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:438:2: ( (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )* ) )
            // InternalEcl.g:439:2: (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )* )
            {
            // InternalEcl.g:439:2: (this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )* )
            // InternalEcl.g:440:3: this_SupplementExpressionConstraint_0= ruleSupplementExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getSupplementExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_SupplementExpressionConstraint_0=ruleSupplementExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SupplementExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:451:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEcl.g:452:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) )
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
            	    // InternalEcl.g:466:4: ( (lv_attribute_3_0= ruleSupplementExpressionConstraint ) )
            	    // InternalEcl.g:467:5: (lv_attribute_3_0= ruleSupplementExpressionConstraint )
            	    {
            	    // InternalEcl.g:467:5: (lv_attribute_3_0= ruleSupplementExpressionConstraint )
            	    // InternalEcl.g:468:6: lv_attribute_3_0= ruleSupplementExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSupplementExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attribute_3_0=ruleSupplementExpressionConstraint();

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
            	      							"com.b2international.snomed.ecl.Ecl.SupplementExpressionConstraint");
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


    // $ANTLR start "entryRuleSupplementExpressionConstraint"
    // InternalEcl.g:490:1: entryRuleSupplementExpressionConstraint returns [EObject current=null] : iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF ;
    public final EObject entryRuleSupplementExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplementExpressionConstraint = null;


        try {
            // InternalEcl.g:490:71: (iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF )
            // InternalEcl.g:491:2: iv_ruleSupplementExpressionConstraint= ruleSupplementExpressionConstraint EOF
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
    // InternalEcl.g:497:1: ruleSupplementExpressionConstraint returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )? ) ;
    public final EObject ruleSupplementExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_FilteredExpressionConstraint_0 = null;

        EObject lv_supplement_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:503:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )? ) )
            // InternalEcl.g:504:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )? )
            {
            // InternalEcl.g:504:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )? )
            // InternalEcl.g:505:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () ( (lv_supplement_2_0= ruleSupplement ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getFilteredExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_FilteredExpressionConstraint_0=ruleFilteredExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_FilteredExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:516:3: ( () ( (lv_supplement_2_0= ruleSupplement ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_DOUBLE_CURLY_OPEN) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEcl.g:517:4: () ( (lv_supplement_2_0= ruleSupplement ) )
                    {
                    // InternalEcl.g:517:4: ()
                    // InternalEcl.g:518:5: 
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

                    // InternalEcl.g:527:4: ( (lv_supplement_2_0= ruleSupplement ) )
                    // InternalEcl.g:528:5: (lv_supplement_2_0= ruleSupplement )
                    {
                    // InternalEcl.g:528:5: (lv_supplement_2_0= ruleSupplement )
                    // InternalEcl.g:529:6: lv_supplement_2_0= ruleSupplement
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSupplementExpressionConstraintAccess().getSupplementSupplementParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
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
    // $ANTLR end "ruleSupplementExpressionConstraint"


    // $ANTLR start "entryRuleFilteredExpressionConstraint"
    // InternalEcl.g:551:1: entryRuleFilteredExpressionConstraint returns [EObject current=null] : iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF ;
    public final EObject entryRuleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredExpressionConstraint = null;


        try {
            // InternalEcl.g:551:69: (iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF )
            // InternalEcl.g:552:2: iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF
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
    // InternalEcl.g:558:1: ruleFilteredExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) ;
    public final EObject ruleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:564:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) )
            // InternalEcl.g:565:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            {
            // InternalEcl.g:565:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            // InternalEcl.g:566:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFilteredExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_10);
            this_SubExpressionConstraint_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEcl.g:577:3: ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_DOUBLE_CURLY_OPEN) ) {
                    int LA9_1 = input.LA(2);

                    if ( ((LA9_1>=RULE_DISJUNCTION_KEYWORD && LA9_1<=RULE_CONJUNCTION_KEYWORD)||LA9_1==RULE_EXCLUSION_KEYWORD||LA9_1==RULE_ROUND_OPEN||LA9_1==RULE_WILDCARD||LA9_1==RULE_REVERSED||(LA9_1>=RULE_ID_KEYWORD && LA9_1<=RULE_PREFERRED_IN_KEYWORD)||(LA9_1>=RULE_ACCEPTABLE_IN_KEYWORD && LA9_1<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA9_1==RULE_HISTORY_KEYWORD||(LA9_1>=RULE_CONCEPT_SHORT_KEYWORD && LA9_1<=RULE_MAX_KEYWORD)) ) {
                        alt9=1;
                    }


                }


                switch (alt9) {
            	case 1 :
            	    // InternalEcl.g:578:4: () ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    {
            	    // InternalEcl.g:578:4: ()
            	    // InternalEcl.g:579:5: 
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

            	    // InternalEcl.g:588:4: ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    // InternalEcl.g:589:5: (lv_filter_2_0= ruleFilterConstraint )
            	    {
            	    // InternalEcl.g:589:5: (lv_filter_2_0= ruleFilterConstraint )
            	    // InternalEcl.g:590:6: lv_filter_2_0= ruleFilterConstraint
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
    // $ANTLR end "ruleFilteredExpressionConstraint"


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
    // InternalEcl.g:619:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_Top_8= ruleTop | this_Bottom_9= ruleBottom | this_EclFocusConcept_10= ruleEclFocusConcept ) ;
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

        EObject this_Top_8 = null;

        EObject this_Bottom_9 = null;

        EObject this_EclFocusConcept_10 = null;



        	enterRule();

        try {
            // InternalEcl.g:625:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_Top_8= ruleTop | this_Bottom_9= ruleBottom | this_EclFocusConcept_10= ruleEclFocusConcept ) )
            // InternalEcl.g:626:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_Top_8= ruleTop | this_Bottom_9= ruleBottom | this_EclFocusConcept_10= ruleEclFocusConcept )
            {
            // InternalEcl.g:626:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_Top_8= ruleTop | this_Bottom_9= ruleBottom | this_EclFocusConcept_10= ruleEclFocusConcept )
            int alt10=11;
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
            case RULE_DBL_EM_GT:
                {
                alt10=9;
                }
                break;
            case RULE_DBL_EM_LT:
                {
                alt10=10;
                }
                break;
            case RULE_CARET_REVERSED:
            case RULE_CARET:
            case RULE_ROUND_OPEN:
            case RULE_WILDCARD:
            case RULE_REVERSED:
            case RULE_ID_KEYWORD:
            case RULE_DIGIT:
            case RULE_ALPHA:
            case RULE_CONCEPT_SHORT_KEYWORD:
            case RULE_DESCRIPTION_SHORT_KEYWORD:
            case RULE_MEMBER_SHORT_KEYWORD:
            case RULE_KEYWORD:
                {
                alt10=11;
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
                    // InternalEcl.g:723:3: this_Top_8= ruleTop
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getTopParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Top_8=ruleTop();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Top_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEcl.g:735:3: this_Bottom_9= ruleBottom
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getBottomParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Bottom_9=ruleBottom();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Bottom_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEcl.g:747:3: this_EclFocusConcept_10= ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclFocusConcept_10=ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclFocusConcept_10;
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
    // InternalEcl.g:762:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalEcl.g:762:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalEcl.g:763:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
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
    // InternalEcl.g:769:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_ReverseMemberOf_1= ruleReverseMemberOf | this_EclConceptReference_2= ruleEclConceptReference | this_Any_3= ruleAny | this_AlternateIdentifier_4= ruleAlternateIdentifier | this_NestedExpression_5= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_ReverseMemberOf_1 = null;

        EObject this_EclConceptReference_2 = null;

        EObject this_Any_3 = null;

        EObject this_AlternateIdentifier_4 = null;

        EObject this_NestedExpression_5 = null;



        	enterRule();

        try {
            // InternalEcl.g:775:2: ( (this_MemberOf_0= ruleMemberOf | this_ReverseMemberOf_1= ruleReverseMemberOf | this_EclConceptReference_2= ruleEclConceptReference | this_Any_3= ruleAny | this_AlternateIdentifier_4= ruleAlternateIdentifier | this_NestedExpression_5= ruleNestedExpression ) )
            // InternalEcl.g:776:2: (this_MemberOf_0= ruleMemberOf | this_ReverseMemberOf_1= ruleReverseMemberOf | this_EclConceptReference_2= ruleEclConceptReference | this_Any_3= ruleAny | this_AlternateIdentifier_4= ruleAlternateIdentifier | this_NestedExpression_5= ruleNestedExpression )
            {
            // InternalEcl.g:776:2: (this_MemberOf_0= ruleMemberOf | this_ReverseMemberOf_1= ruleReverseMemberOf | this_EclConceptReference_2= ruleEclConceptReference | this_Any_3= ruleAny | this_AlternateIdentifier_4= ruleAlternateIdentifier | this_NestedExpression_5= ruleNestedExpression )
            int alt11=6;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEcl.g:777:3: this_MemberOf_0= ruleMemberOf
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
                    // InternalEcl.g:789:3: this_ReverseMemberOf_1= ruleReverseMemberOf
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getReverseMemberOfParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ReverseMemberOf_1=ruleReverseMemberOf();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ReverseMemberOf_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:801:3: this_EclConceptReference_2= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_2());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EclConceptReference_2=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EclConceptReference_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:813:3: this_Any_3= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_3());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_Any_3=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_Any_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:825:3: this_AlternateIdentifier_4= ruleAlternateIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getAlternateIdentifierParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AlternateIdentifier_4=ruleAlternateIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AlternateIdentifier_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:837:3: this_NestedExpression_5= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedExpression_5=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedExpression_5;
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
    // InternalEcl.g:852:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalEcl.g:852:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalEcl.g:853:2: iv_ruleChildOf= ruleChildOf EOF
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
    // InternalEcl.g:859:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:865:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:866:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:866:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:867:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:871:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:872:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:872:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:873:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:894:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalEcl.g:894:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalEcl.g:895:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
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
    // InternalEcl.g:901:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:907:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:908:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:908:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:909:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:913:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:914:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:914:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:915:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:936:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalEcl.g:936:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalEcl.g:937:2: iv_ruleDescendantOf= ruleDescendantOf EOF
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
    // InternalEcl.g:943:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:949:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:950:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:950:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:951:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:955:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:956:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:956:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:957:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:978:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalEcl.g:978:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalEcl.g:979:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
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
    // InternalEcl.g:985:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:991:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:992:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:992:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:993:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:997:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:998:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:998:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:999:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:1020:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalEcl.g:1020:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalEcl.g:1021:2: iv_ruleParentOf= ruleParentOf EOF
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
    // InternalEcl.g:1027:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1033:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1034:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1034:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1035:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1039:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1040:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1040:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1041:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:1062:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalEcl.g:1062:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalEcl.g:1063:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
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
    // InternalEcl.g:1069:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1075:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1076:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1076:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1077:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1081:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1082:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1082:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1083:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:1104:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalEcl.g:1104:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalEcl.g:1105:2: iv_ruleAncestorOf= ruleAncestorOf EOF
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
    // InternalEcl.g:1111:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1117:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1118:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1118:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1119:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1123:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1124:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1124:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1125:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEcl.g:1146:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalEcl.g:1146:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalEcl.g:1147:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
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
    // InternalEcl.g:1153:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1159:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1160:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1160:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1161:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1165:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1166:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1166:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1167:5: lv_constraint_1_0= ruleEclFocusConcept
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


    // $ANTLR start "entryRuleTop"
    // InternalEcl.g:1188:1: entryRuleTop returns [EObject current=null] : iv_ruleTop= ruleTop EOF ;
    public final EObject entryRuleTop() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTop = null;


        try {
            // InternalEcl.g:1188:44: (iv_ruleTop= ruleTop EOF )
            // InternalEcl.g:1189:2: iv_ruleTop= ruleTop EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTopRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTop=ruleTop();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTop; 
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
    // $ANTLR end "entryRuleTop"


    // $ANTLR start "ruleTop"
    // InternalEcl.g:1195:1: ruleTop returns [EObject current=null] : (this_DBL_EM_GT_0= RULE_DBL_EM_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleTop() throws RecognitionException {
        EObject current = null;

        Token this_DBL_EM_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1201:2: ( (this_DBL_EM_GT_0= RULE_DBL_EM_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1202:2: (this_DBL_EM_GT_0= RULE_DBL_EM_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1202:2: (this_DBL_EM_GT_0= RULE_DBL_EM_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1203:3: this_DBL_EM_GT_0= RULE_DBL_EM_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_EM_GT_0=(Token)match(input,RULE_DBL_EM_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_EM_GT_0, grammarAccess.getTopAccess().getDBL_EM_GTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1207:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1208:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1208:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1209:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTopAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTopRule());
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
    // $ANTLR end "ruleTop"


    // $ANTLR start "entryRuleBottom"
    // InternalEcl.g:1230:1: entryRuleBottom returns [EObject current=null] : iv_ruleBottom= ruleBottom EOF ;
    public final EObject entryRuleBottom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBottom = null;


        try {
            // InternalEcl.g:1230:47: (iv_ruleBottom= ruleBottom EOF )
            // InternalEcl.g:1231:2: iv_ruleBottom= ruleBottom EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBottomRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleBottom=ruleBottom();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBottom; 
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
    // $ANTLR end "entryRuleBottom"


    // $ANTLR start "ruleBottom"
    // InternalEcl.g:1237:1: ruleBottom returns [EObject current=null] : (this_DBL_EM_LT_0= RULE_DBL_EM_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleBottom() throws RecognitionException {
        EObject current = null;

        Token this_DBL_EM_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1243:2: ( (this_DBL_EM_LT_0= RULE_DBL_EM_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEcl.g:1244:2: (this_DBL_EM_LT_0= RULE_DBL_EM_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEcl.g:1244:2: (this_DBL_EM_LT_0= RULE_DBL_EM_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEcl.g:1245:3: this_DBL_EM_LT_0= RULE_DBL_EM_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_EM_LT_0=(Token)match(input,RULE_DBL_EM_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_EM_LT_0, grammarAccess.getBottomAccess().getDBL_EM_LTTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1249:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEcl.g:1250:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEcl.g:1250:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEcl.g:1251:5: lv_constraint_1_0= ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBottomAccess().getConstraintEclFocusConceptParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_constraint_1_0=ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getBottomRule());
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
    // $ANTLR end "ruleBottom"


    // $ANTLR start "entryRuleReverseMemberOf"
    // InternalEcl.g:1272:1: entryRuleReverseMemberOf returns [EObject current=null] : iv_ruleReverseMemberOf= ruleReverseMemberOf EOF ;
    public final EObject entryRuleReverseMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReverseMemberOf = null;


        try {
            // InternalEcl.g:1272:56: (iv_ruleReverseMemberOf= ruleReverseMemberOf EOF )
            // InternalEcl.g:1273:2: iv_ruleReverseMemberOf= ruleReverseMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getReverseMemberOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleReverseMemberOf=ruleReverseMemberOf();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleReverseMemberOf; 
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
    // $ANTLR end "entryRuleReverseMemberOf"


    // $ANTLR start "ruleReverseMemberOf"
    // InternalEcl.g:1279:1: ruleReverseMemberOf returns [EObject current=null] : (this_CARET_REVERSED_0= RULE_CARET_REVERSED ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleReverseMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_REVERSED_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:1285:2: ( (this_CARET_REVERSED_0= RULE_CARET_REVERSED ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalEcl.g:1286:2: (this_CARET_REVERSED_0= RULE_CARET_REVERSED ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalEcl.g:1286:2: (this_CARET_REVERSED_0= RULE_CARET_REVERSED ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalEcl.g:1287:3: this_CARET_REVERSED_0= RULE_CARET_REVERSED ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_REVERSED_0=(Token)match(input,RULE_CARET_REVERSED,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_REVERSED_0, grammarAccess.getReverseMemberOfAccess().getCARET_REVERSEDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1291:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalEcl.g:1292:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalEcl.g:1292:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalEcl.g:1293:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalEcl.g:1293:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt12=3;
            switch ( input.LA(1) ) {
            case RULE_REVERSED:
            case RULE_ID_KEYWORD:
            case RULE_DIGIT:
            case RULE_ALPHA:
            case RULE_CONCEPT_SHORT_KEYWORD:
            case RULE_DESCRIPTION_SHORT_KEYWORD:
            case RULE_MEMBER_SHORT_KEYWORD:
            case RULE_KEYWORD:
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
                    // InternalEcl.g:1294:6: lv_constraint_1_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReverseMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReverseMemberOfRule());
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
                    // InternalEcl.g:1310:6: lv_constraint_1_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReverseMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReverseMemberOfRule());
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
                    // InternalEcl.g:1326:6: lv_constraint_1_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getReverseMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_1_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getReverseMemberOfRule());
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
    // $ANTLR end "ruleReverseMemberOf"


    // $ANTLR start "entryRuleMemberOf"
    // InternalEcl.g:1348:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalEcl.g:1348:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalEcl.g:1349:2: iv_ruleMemberOf= ruleMemberOf EOF
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
    // InternalEcl.g:1355:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        Token this_SQUARE_OPEN_1=null;
        Token this_COMMA_3=null;
        Token this_SQUARE_CLOSE_5=null;
        AntlrDatatypeRuleToken lv_refsetFields_2_0 = null;

        AntlrDatatypeRuleToken lv_refsetFields_4_0 = null;

        EObject lv_constraint_6_1 = null;

        EObject lv_constraint_6_2 = null;

        EObject lv_constraint_6_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:1361:2: ( (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) ) ) )
            // InternalEcl.g:1362:2: (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) ) )
            {
            // InternalEcl.g:1362:2: (this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) ) )
            // InternalEcl.g:1363:3: this_CARET_0= RULE_CARET (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )? ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1367:3: (this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_SQUARE_OPEN) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEcl.g:1368:4: this_SQUARE_OPEN_1= RULE_SQUARE_OPEN ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* ) this_SQUARE_CLOSE_5= RULE_SQUARE_CLOSE
                    {
                    this_SQUARE_OPEN_1=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQUARE_OPEN_1, grammarAccess.getMemberOfAccess().getSQUARE_OPENTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEcl.g:1372:4: ( ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )* )
                    // InternalEcl.g:1373:5: ( (lv_refsetFields_2_0= ruleUnquotedString ) ) (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )*
                    {
                    // InternalEcl.g:1373:5: ( (lv_refsetFields_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:1374:6: (lv_refsetFields_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:1374:6: (lv_refsetFields_2_0= ruleUnquotedString )
                    // InternalEcl.g:1375:7: lv_refsetFields_2_0= ruleUnquotedString
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_0_0());
                      						
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

                    // InternalEcl.g:1392:5: (this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_COMMA) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // InternalEcl.g:1393:6: this_COMMA_3= RULE_COMMA ( (lv_refsetFields_4_0= ruleUnquotedString ) )
                    	    {
                    	    this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(this_COMMA_3, grammarAccess.getMemberOfAccess().getCOMMATerminalRuleCall_1_1_1_0());
                    	      					
                    	    }
                    	    // InternalEcl.g:1397:6: ( (lv_refsetFields_4_0= ruleUnquotedString ) )
                    	    // InternalEcl.g:1398:7: (lv_refsetFields_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:1398:7: (lv_refsetFields_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:1399:8: lv_refsetFields_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMemberOfAccess().getRefsetFieldsUnquotedStringParserRuleCall_1_1_1_1_0());
                    	      							
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
                    	    break loop13;
                        }
                    } while (true);


                    }

                    this_SQUARE_CLOSE_5=(Token)match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_SQUARE_CLOSE_5, grammarAccess.getMemberOfAccess().getSQUARE_CLOSETerminalRuleCall_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:1423:3: ( ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) ) )
            // InternalEcl.g:1424:4: ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) )
            {
            // InternalEcl.g:1424:4: ( (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression ) )
            // InternalEcl.g:1425:5: (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression )
            {
            // InternalEcl.g:1425:5: (lv_constraint_6_1= ruleEclConceptReference | lv_constraint_6_2= ruleAny | lv_constraint_6_3= ruleNestedExpression )
            int alt15=3;
            switch ( input.LA(1) ) {
            case RULE_REVERSED:
            case RULE_ID_KEYWORD:
            case RULE_DIGIT:
            case RULE_ALPHA:
            case RULE_CONCEPT_SHORT_KEYWORD:
            case RULE_DESCRIPTION_SHORT_KEYWORD:
            case RULE_MEMBER_SHORT_KEYWORD:
            case RULE_KEYWORD:
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
                    // InternalEcl.g:1426:6: lv_constraint_6_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_6_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_6_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1442:6: lv_constraint_6_2= ruleAny
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_6_2=ruleAny();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_6_2,
                      							"com.b2international.snomed.ecl.Ecl.Any");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:1458:6: lv_constraint_6_3= ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_2_0_2());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_constraint_6_3=ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMemberOfRule());
                      						}
                      						set(
                      							current,
                      							"constraint",
                      							lv_constraint_6_3,
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
    // InternalEcl.g:1480:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEcl.g:1480:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEcl.g:1481:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
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
    // InternalEcl.g:1487:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleIdentifier ) ) (this_WS_1= RULE_WS )* ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token this_WS_1=null;
        Token lv_term_2_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1493:2: ( ( ( (lv_id_0_0= ruleIdentifier ) ) (this_WS_1= RULE_WS )* ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            // InternalEcl.g:1494:2: ( ( (lv_id_0_0= ruleIdentifier ) ) (this_WS_1= RULE_WS )* ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? )
            {
            // InternalEcl.g:1494:2: ( ( (lv_id_0_0= ruleIdentifier ) ) (this_WS_1= RULE_WS )* ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )? )
            // InternalEcl.g:1495:3: ( (lv_id_0_0= ruleIdentifier ) ) (this_WS_1= RULE_WS )* ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )?
            {
            // InternalEcl.g:1495:3: ( (lv_id_0_0= ruleIdentifier ) )
            // InternalEcl.g:1496:4: (lv_id_0_0= ruleIdentifier )
            {
            // InternalEcl.g:1496:4: (lv_id_0_0= ruleIdentifier )
            // InternalEcl.g:1497:5: lv_id_0_0= ruleIdentifier
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclConceptReferenceAccess().getIdIdentifierParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_14);
            lv_id_0_0=ruleIdentifier();

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
              						"com.b2international.snomed.ecl.Ecl.Identifier");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEcl.g:1514:3: (this_WS_1= RULE_WS )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==RULE_WS) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalEcl.g:1515:4: this_WS_1= RULE_WS
            	    {
            	    this_WS_1=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_1, grammarAccess.getEclConceptReferenceAccess().getWSTerminalRuleCall_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            // InternalEcl.g:1520:3: ( (lv_term_2_0= RULE_PIPE_DELIMITED_STRING ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_PIPE_DELIMITED_STRING) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEcl.g:1521:4: (lv_term_2_0= RULE_PIPE_DELIMITED_STRING )
                    {
                    // InternalEcl.g:1521:4: (lv_term_2_0= RULE_PIPE_DELIMITED_STRING )
                    // InternalEcl.g:1522:5: lv_term_2_0= RULE_PIPE_DELIMITED_STRING
                    {
                    lv_term_2_0=(Token)match(input,RULE_PIPE_DELIMITED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_2_0, grammarAccess.getEclConceptReferenceAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEclConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_2_0,
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


    // $ANTLR start "entryRuleAlternateIdentifier"
    // InternalEcl.g:1542:1: entryRuleAlternateIdentifier returns [EObject current=null] : iv_ruleAlternateIdentifier= ruleAlternateIdentifier EOF ;
    public final EObject entryRuleAlternateIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternateIdentifier = null;


        try {
            // InternalEcl.g:1542:60: (iv_ruleAlternateIdentifier= ruleAlternateIdentifier EOF )
            // InternalEcl.g:1543:2: iv_ruleAlternateIdentifier= ruleAlternateIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternateIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlternateIdentifier=ruleAlternateIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternateIdentifier; 
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
    // $ANTLR end "entryRuleAlternateIdentifier"


    // $ANTLR start "ruleAlternateIdentifier"
    // InternalEcl.g:1549:1: ruleAlternateIdentifier returns [EObject current=null] : ( ( (lv_scheme_0_0= ruleAlternateScheme ) ) this_HASH_1= RULE_HASH ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) ) (this_WS_3= RULE_WS )* ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )? ) ;
    public final EObject ruleAlternateIdentifier() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        Token lv_code_2_2=null;
        Token this_WS_3=null;
        Token lv_term_4_0=null;
        AntlrDatatypeRuleToken lv_scheme_0_0 = null;

        AntlrDatatypeRuleToken lv_code_2_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:1555:2: ( ( ( (lv_scheme_0_0= ruleAlternateScheme ) ) this_HASH_1= RULE_HASH ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) ) (this_WS_3= RULE_WS )* ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )? ) )
            // InternalEcl.g:1556:2: ( ( (lv_scheme_0_0= ruleAlternateScheme ) ) this_HASH_1= RULE_HASH ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) ) (this_WS_3= RULE_WS )* ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )? )
            {
            // InternalEcl.g:1556:2: ( ( (lv_scheme_0_0= ruleAlternateScheme ) ) this_HASH_1= RULE_HASH ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) ) (this_WS_3= RULE_WS )* ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )? )
            // InternalEcl.g:1557:3: ( (lv_scheme_0_0= ruleAlternateScheme ) ) this_HASH_1= RULE_HASH ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) ) (this_WS_3= RULE_WS )* ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )?
            {
            // InternalEcl.g:1557:3: ( (lv_scheme_0_0= ruleAlternateScheme ) )
            // InternalEcl.g:1558:4: (lv_scheme_0_0= ruleAlternateScheme )
            {
            // InternalEcl.g:1558:4: (lv_scheme_0_0= ruleAlternateScheme )
            // InternalEcl.g:1559:5: lv_scheme_0_0= ruleAlternateScheme
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAlternateIdentifierAccess().getSchemeAlternateSchemeParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
            lv_scheme_0_0=ruleAlternateScheme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getAlternateIdentifierRule());
              					}
              					set(
              						current,
              						"scheme",
              						lv_scheme_0_0,
              						"com.b2international.snomed.ecl.Ecl.AlternateScheme");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getAlternateIdentifierAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:1580:3: ( ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) ) )
            // InternalEcl.g:1581:4: ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) )
            {
            // InternalEcl.g:1581:4: ( (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING ) )
            // InternalEcl.g:1582:5: (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING )
            {
            // InternalEcl.g:1582:5: (lv_code_2_1= ruleAlternateCode | lv_code_2_2= RULE_STRING )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DOT||LA18_0==RULE_REVERSED||LA18_0==RULE_ID_KEYWORD||LA18_0==RULE_DASH||(LA18_0>=RULE_DIGIT && LA18_0<=RULE_KEYWORD)) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_STRING) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEcl.g:1583:6: lv_code_2_1= ruleAlternateCode
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getAlternateIdentifierAccess().getCodeAlternateCodeParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_14);
                    lv_code_2_1=ruleAlternateCode();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getAlternateIdentifierRule());
                      						}
                      						set(
                      							current,
                      							"code",
                      							lv_code_2_1,
                      							"com.b2international.snomed.ecl.Ecl.AlternateCode");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:1599:6: lv_code_2_2= RULE_STRING
                    {
                    lv_code_2_2=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_code_2_2, grammarAccess.getAlternateIdentifierAccess().getCodeSTRINGTerminalRuleCall_2_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getAlternateIdentifierRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"code",
                      							lv_code_2_2,
                      							"com.b2international.snomed.ecl.Ecl.STRING");
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalEcl.g:1616:3: (this_WS_3= RULE_WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==RULE_WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEcl.g:1617:4: this_WS_3= RULE_WS
            	    {
            	    this_WS_3=(Token)match(input,RULE_WS,FollowSets000.FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_WS_3, grammarAccess.getAlternateIdentifierAccess().getWSTerminalRuleCall_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // InternalEcl.g:1622:3: ( (lv_term_4_0= RULE_PIPE_DELIMITED_STRING ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_PIPE_DELIMITED_STRING) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalEcl.g:1623:4: (lv_term_4_0= RULE_PIPE_DELIMITED_STRING )
                    {
                    // InternalEcl.g:1623:4: (lv_term_4_0= RULE_PIPE_DELIMITED_STRING )
                    // InternalEcl.g:1624:5: lv_term_4_0= RULE_PIPE_DELIMITED_STRING
                    {
                    lv_term_4_0=(Token)match(input,RULE_PIPE_DELIMITED_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_4_0, grammarAccess.getAlternateIdentifierAccess().getTermPIPE_DELIMITED_STRINGTerminalRuleCall_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getAlternateIdentifierRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_4_0,
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
    // $ANTLR end "ruleAlternateIdentifier"


    // $ANTLR start "entryRuleEclConceptReferenceSet"
    // InternalEcl.g:1644:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEcl.g:1644:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEcl.g:1645:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
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
    // InternalEcl.g:1651:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_concepts_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1657:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1658:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1658:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1659:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1663:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==RULE_REVERSED||LA21_0==RULE_ID_KEYWORD||(LA21_0>=RULE_DIGIT && LA21_0<=RULE_KEYWORD)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEcl.g:1664:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    {
            	    // InternalEcl.g:1664:4: (lv_concepts_1_0= ruleEclConceptReference )
            	    // InternalEcl.g:1665:5: lv_concepts_1_0= ruleEclConceptReference
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
            	    if ( cnt21 >= 1 ) break loop21;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
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
    // InternalEcl.g:1690:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEcl.g:1690:44: (iv_ruleAny= ruleAny EOF )
            // InternalEcl.g:1691:2: iv_ruleAny= ruleAny EOF
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
    // InternalEcl.g:1697:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEcl.g:1703:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEcl.g:1704:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEcl.g:1704:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEcl.g:1705:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1709:3: ()
            // InternalEcl.g:1710:4: 
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
    // InternalEcl.g:1723:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEcl.g:1723:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEcl.g:1724:2: iv_ruleEclRefinement= ruleEclRefinement EOF
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
    // InternalEcl.g:1730:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1736:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEcl.g:1737:2: this_OrRefinement_0= ruleOrRefinement
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
    // InternalEcl.g:1751:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEcl.g:1751:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEcl.g:1752:2: iv_ruleOrRefinement= ruleOrRefinement EOF
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
    // InternalEcl.g:1758:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1764:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEcl.g:1765:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEcl.g:1765:2: (this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEcl.g:1766:3: this_AndRefinement_0= ruleAndRefinement ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
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
            // InternalEcl.g:1777:3: ( ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RULE_DISJUNCTION_KEYWORD) ) {
                    int LA22_4 = input.LA(2);

                    if ( (synpred37_InternalEcl()) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // InternalEcl.g:1778:4: ( RULE_DISJUNCTION_KEYWORD )=> ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEcl.g:1779:4: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEcl.g:1780:5: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEcl.g:1780:5: ()
            	    // InternalEcl.g:1781:6: 
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
            	    // InternalEcl.g:1794:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEcl.g:1795:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEcl.g:1795:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEcl.g:1796:7: lv_right_3_0= ruleAndRefinement
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
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalEcl.g:1819:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEcl.g:1819:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEcl.g:1820:2: iv_ruleAndRefinement= ruleAndRefinement EOF
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
    // InternalEcl.g:1826:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1832:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEcl.g:1833:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEcl.g:1833:2: (this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEcl.g:1834:3: this_SubRefinement_0= ruleSubRefinement ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
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
            // InternalEcl.g:1845:3: ( ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RULE_CONJUNCTION_KEYWORD) ) {
                    int LA24_3 = input.LA(2);

                    if ( (synpred39_InternalEcl()) ) {
                        alt24=1;
                    }


                }
                else if ( (LA24_0==RULE_COMMA) ) {
                    int LA24_4 = input.LA(2);

                    if ( (synpred39_InternalEcl()) ) {
                        alt24=1;
                    }


                }


                switch (alt24) {
            	case 1 :
            	    // InternalEcl.g:1846:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )=> ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEcl.g:1847:4: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEcl.g:1848:5: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEcl.g:1848:5: ()
            	    // InternalEcl.g:1849:6: 
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

            	    // InternalEcl.g:1858:5: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt23=2;
            	    int LA23_0 = input.LA(1);

            	    if ( (LA23_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt23=1;
            	    }
            	    else if ( (LA23_0==RULE_COMMA) ) {
            	        alt23=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt23) {
            	        case 1 :
            	            // InternalEcl.g:1859:6: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndRefinementAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_0_1_0());
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:1864:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:1869:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEcl.g:1870:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEcl.g:1870:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEcl.g:1871:7: lv_right_4_0= ruleSubRefinement
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
            	    break loop24;
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
    // InternalEcl.g:1894:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEcl.g:1894:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEcl.g:1895:2: iv_ruleSubRefinement= ruleSubRefinement EOF
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
    // InternalEcl.g:1901:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEcl.g:1907:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEcl.g:1908:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEcl.g:1908:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt25=3;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalEcl.g:1909:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEcl.g:1921:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
                    // InternalEcl.g:1933:3: this_NestedRefinement_2= ruleNestedRefinement
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
    // InternalEcl.g:1948:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEcl.g:1948:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEcl.g:1949:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
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
    // InternalEcl.g:1955:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:1961:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:1962:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:1962:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:1963:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:1967:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEcl.g:1968:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEcl.g:1968:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEcl.g:1969:5: lv_nested_1_0= ruleEclRefinement
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
    // InternalEcl.g:1994:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEcl.g:1994:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEcl.g:1995:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
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
    // InternalEcl.g:2001:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2007:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEcl.g:2008:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEcl.g:2008:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEcl.g:2009:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEcl.g:2009:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_SQUARE_OPEN) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEcl.g:2010:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:2010:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:2011:5: lv_cardinality_0_0= ruleCardinality
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

            this_CURLY_OPEN_1=(Token)match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CURLY_OPEN_1, grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2032:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEcl.g:2033:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:2033:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEcl.g:2034:5: lv_refinement_2_0= ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
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
    // InternalEcl.g:2059:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEcl.g:2059:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEcl.g:2060:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
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
    // InternalEcl.g:2066:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2072:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEcl.g:2073:2: this_OrAttributeSet_0= ruleOrAttributeSet
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
    // InternalEcl.g:2087:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEcl.g:2087:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEcl.g:2088:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
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
    // InternalEcl.g:2094:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2100:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEcl.g:2101:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEcl.g:2101:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEcl.g:2102:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
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
            // InternalEcl.g:2113:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEcl.g:2114:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEcl.g:2114:4: ()
            	    // InternalEcl.g:2115:5: 
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

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getOrAttributeSetAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:2128:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEcl.g:2129:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEcl.g:2129:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEcl.g:2130:6: lv_right_3_0= ruleAndAttributeSet
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
            	    break loop27;
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
    // InternalEcl.g:2152:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEcl.g:2152:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEcl.g:2153:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
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
    // InternalEcl.g:2159:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2165:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEcl.g:2166:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEcl.g:2166:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEcl.g:2167:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
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
            // InternalEcl.g:2178:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_CONJUNCTION_KEYWORD && LA29_0<=RULE_COMMA)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEcl.g:2179:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEcl.g:2179:4: ()
            	    // InternalEcl.g:2180:5: 
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

            	    // InternalEcl.g:2189:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt28=2;
            	    int LA28_0 = input.LA(1);

            	    if ( (LA28_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt28=1;
            	    }
            	    else if ( (LA28_0==RULE_COMMA) ) {
            	        alt28=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 28, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt28) {
            	        case 1 :
            	            // InternalEcl.g:2190:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getAndAttributeSetAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:2195:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_11); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:2200:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEcl.g:2201:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEcl.g:2201:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEcl.g:2202:6: lv_right_4_0= ruleSubAttributeSet
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
            	    break loop29;
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
    // InternalEcl.g:2224:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEcl.g:2224:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEcl.g:2225:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
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
    // InternalEcl.g:2231:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:2237:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEcl.g:2238:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEcl.g:2238:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalEcl.g:2239:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEcl.g:2251:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
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
    // InternalEcl.g:2266:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEcl.g:2266:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEcl.g:2267:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
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
    // InternalEcl.g:2273:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2279:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2280:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2280:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2281:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2285:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEcl.g:2286:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEcl.g:2286:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEcl.g:2287:5: lv_nested_1_0= ruleEclAttributeSet
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
    // InternalEcl.g:2312:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEcl.g:2312:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEcl.g:2313:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
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
    // InternalEcl.g:2319:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2325:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) )
            // InternalEcl.g:2326:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            {
            // InternalEcl.g:2326:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            // InternalEcl.g:2327:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )?
            {
            // InternalEcl.g:2327:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_SQUARE_OPEN) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalEcl.g:2328:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEcl.g:2328:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEcl.g:2329:5: lv_cardinality_0_0= ruleCardinality
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
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

            // InternalEcl.g:2346:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt32=2;
            alt32 = dfa32.predict(input);
            switch (alt32) {
                case 1 :
                    // InternalEcl.g:2347:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEcl.g:2347:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEcl.g:2348:5: lv_reversed_1_0= RULE_REVERSED
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

            // InternalEcl.g:2364:3: ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:2365:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:2365:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:2366:5: lv_attribute_2_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeFilteredExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_22);
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

            // InternalEcl.g:2383:3: ( (lv_comparison_3_0= ruleComparison ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_LT||LA33_0==RULE_GT||LA33_0==RULE_EQUAL||(LA33_0>=RULE_NOT_EQUAL && LA33_0<=RULE_LTE)) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEcl.g:2384:4: (lv_comparison_3_0= ruleComparison )
                    {
                    // InternalEcl.g:2384:4: (lv_comparison_3_0= ruleComparison )
                    // InternalEcl.g:2385:5: lv_comparison_3_0= ruleComparison
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
    // InternalEcl.g:2406:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEcl.g:2406:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEcl.g:2407:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalEcl.g:2413:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2419:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEcl.g:2420:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEcl.g:2420:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEcl.g:2421:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2425:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEcl.g:2426:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEcl.g:2426:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEcl.g:2427:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:2448:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEcl.g:2449:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEcl.g:2449:4: (lv_max_3_0= ruleMaxValue )
            // InternalEcl.g:2450:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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
    // InternalEcl.g:2475:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEcl.g:2475:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEcl.g:2476:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEcl.g:2482:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:2488:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEcl.g:2489:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEcl.g:2489:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt34=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                switch ( input.LA(2) ) {
                case RULE_HASH:
                case RULE_STRING:
                case RULE_EXACT_KEYWORD:
                case RULE_REGEX_KEYWORD:
                case RULE_TRUE_KEYWORD:
                case RULE_FALSE_KEYWORD:
                case RULE_MATCH_KEYWORD:
                case RULE_WILD_KEYWORD:
                    {
                    alt34=2;
                    }
                    break;
                case RULE_ROUND_OPEN:
                    {
                    int LA34_4 = input.LA(3);

                    if ( (LA34_4==RULE_STRING||(LA34_4>=RULE_EXACT_KEYWORD && LA34_4<=RULE_REGEX_KEYWORD)||(LA34_4>=RULE_MATCH_KEYWORD && LA34_4<=RULE_WILD_KEYWORD)) ) {
                        alt34=2;
                    }
                    else if ( ((LA34_4>=RULE_LT_EM && LA34_4<=RULE_CARET)||LA34_4==RULE_ROUND_OPEN||LA34_4==RULE_WILDCARD||LA34_4==RULE_REVERSED||LA34_4==RULE_ID_KEYWORD||(LA34_4>=RULE_DIGIT && LA34_4<=RULE_KEYWORD)) ) {
                        alt34=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 4, input);

                        throw nvae;
                    }
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
                case RULE_DBL_EM_GT:
                case RULE_DBL_EM_LT:
                case RULE_CARET_REVERSED:
                case RULE_CARET:
                case RULE_WILDCARD:
                case RULE_REVERSED:
                case RULE_ID_KEYWORD:
                case RULE_DIGIT:
                case RULE_ALPHA:
                case RULE_CONCEPT_SHORT_KEYWORD:
                case RULE_DESCRIPTION_SHORT_KEYWORD:
                case RULE_MEMBER_SHORT_KEYWORD:
                case RULE_KEYWORD:
                    {
                    alt34=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_NOT_EQUAL:
                {
                switch ( input.LA(2) ) {
                case RULE_HASH:
                case RULE_STRING:
                case RULE_EXACT_KEYWORD:
                case RULE_REGEX_KEYWORD:
                case RULE_TRUE_KEYWORD:
                case RULE_FALSE_KEYWORD:
                case RULE_MATCH_KEYWORD:
                case RULE_WILD_KEYWORD:
                    {
                    alt34=2;
                    }
                    break;
                case RULE_ROUND_OPEN:
                    {
                    int LA34_4 = input.LA(3);

                    if ( (LA34_4==RULE_STRING||(LA34_4>=RULE_EXACT_KEYWORD && LA34_4<=RULE_REGEX_KEYWORD)||(LA34_4>=RULE_MATCH_KEYWORD && LA34_4<=RULE_WILD_KEYWORD)) ) {
                        alt34=2;
                    }
                    else if ( ((LA34_4>=RULE_LT_EM && LA34_4<=RULE_CARET)||LA34_4==RULE_ROUND_OPEN||LA34_4==RULE_WILDCARD||LA34_4==RULE_REVERSED||LA34_4==RULE_ID_KEYWORD||(LA34_4>=RULE_DIGIT && LA34_4<=RULE_KEYWORD)) ) {
                        alt34=1;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 34, 4, input);

                        throw nvae;
                    }
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
                case RULE_DBL_EM_GT:
                case RULE_DBL_EM_LT:
                case RULE_CARET_REVERSED:
                case RULE_CARET:
                case RULE_WILDCARD:
                case RULE_REVERSED:
                case RULE_ID_KEYWORD:
                case RULE_DIGIT:
                case RULE_ALPHA:
                case RULE_CONCEPT_SHORT_KEYWORD:
                case RULE_DESCRIPTION_SHORT_KEYWORD:
                case RULE_MEMBER_SHORT_KEYWORD:
                case RULE_KEYWORD:
                    {
                    alt34=1;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 2, input);

                    throw nvae;
                }

                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt34=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalEcl.g:2490:3: this_AttributeComparison_0= ruleAttributeComparison
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
                    // InternalEcl.g:2502:3: this_DataTypeComparison_1= ruleDataTypeComparison
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
    // InternalEcl.g:2517:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEcl.g:2517:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEcl.g:2518:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
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
    // InternalEcl.g:2524:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2530:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) )
            // InternalEcl.g:2531:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            {
            // InternalEcl.g:2531:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            // InternalEcl.g:2532:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            {
            // InternalEcl.g:2532:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2533:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2533:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2534:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:2551:3: ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:2552:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:2552:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:2553:5: lv_value_1_0= ruleFilteredExpressionConstraint
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
    // InternalEcl.g:2574:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEcl.g:2574:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEcl.g:2575:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
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
    // InternalEcl.g:2581:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEcl.g:2587:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEcl.g:2588:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEcl.g:2588:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt35=4;
            alt35 = dfa35.predict(input);
            switch (alt35) {
                case 1 :
                    // InternalEcl.g:2589:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
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
                    // InternalEcl.g:2601:3: this_StringValueComparison_1= ruleStringValueComparison
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
                    // InternalEcl.g:2613:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
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
                    // InternalEcl.g:2625:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
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
    // InternalEcl.g:2640:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEcl.g:2640:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEcl.g:2641:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
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
    // InternalEcl.g:2647:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2653:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEcl.g:2654:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEcl.g:2654:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEcl.g:2655:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEcl.g:2655:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2656:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2656:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2657:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:2674:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEcl.g:2675:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEcl.g:2675:4: (lv_value_1_0= ruleBoolean )
            // InternalEcl.g:2676:5: lv_value_1_0= ruleBoolean
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
    // InternalEcl.g:2697:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEcl.g:2697:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEcl.g:2698:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
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
    // InternalEcl.g:2704:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSearchTerm ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2710:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSearchTerm ) ) ) )
            // InternalEcl.g:2711:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSearchTerm ) ) )
            {
            // InternalEcl.g:2711:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSearchTerm ) ) )
            // InternalEcl.g:2712:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSearchTerm ) )
            {
            // InternalEcl.g:2712:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:2713:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:2713:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:2714:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:2731:3: ( (lv_value_1_0= ruleSearchTerm ) )
            // InternalEcl.g:2732:4: (lv_value_1_0= ruleSearchTerm )
            {
            // InternalEcl.g:2732:4: (lv_value_1_0= ruleSearchTerm )
            // InternalEcl.g:2733:5: lv_value_1_0= ruleSearchTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getValueSearchTermParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleSearchTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getStringValueComparisonRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_1_0,
              						"com.b2international.snomed.ecl.Ecl.SearchTerm");
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
    // $ANTLR end "ruleStringValueComparison"


    // $ANTLR start "entryRuleIntegerValueComparison"
    // InternalEcl.g:2754:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEcl.g:2754:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEcl.g:2755:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
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
    // InternalEcl.g:2761:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2767:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEcl.g:2768:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEcl.g:2768:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEcl.g:2769:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEcl.g:2769:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2770:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2770:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2771:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2792:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEcl.g:2793:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEcl.g:2793:4: (lv_value_2_0= ruleInteger )
            // InternalEcl.g:2794:5: lv_value_2_0= ruleInteger
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
    // InternalEcl.g:2815:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEcl.g:2815:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEcl.g:2816:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
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
    // InternalEcl.g:2822:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2828:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEcl.g:2829:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEcl.g:2829:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEcl.g:2830:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEcl.g:2830:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:2831:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:2831:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:2832:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_15);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:2853:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEcl.g:2854:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEcl.g:2854:4: (lv_value_2_0= ruleDecimal )
            // InternalEcl.g:2855:5: lv_value_2_0= ruleDecimal
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
    // InternalEcl.g:2876:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEcl.g:2876:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEcl.g:2877:2: iv_ruleNestedExpression= ruleNestedExpression EOF
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
    // InternalEcl.g:2883:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2889:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:2890:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:2890:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:2891:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2895:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEcl.g:2896:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEcl.g:2896:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEcl.g:2897:5: lv_nested_1_0= ruleExpressionConstraint
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
    // InternalEcl.g:2922:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEcl.g:2922:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEcl.g:2923:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
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
    // InternalEcl.g:2929:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_domain_1_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:2935:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:2936:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:2936:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:2937:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )? ( (lv_filter_2_0= ruleFilter ) ) this_DOUBLE_CURLY_CLOSE_3= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:2941:3: ( (lv_domain_1_0= ruleSHORT_DOMAIN ) )?
            int alt36=2;
            switch ( input.LA(1) ) {
                case RULE_CONCEPT_SHORT_KEYWORD:
                    {
                    int LA36_1 = input.LA(2);

                    if ( ((LA36_1>=RULE_DISJUNCTION_KEYWORD && LA36_1<=RULE_CONJUNCTION_KEYWORD)||LA36_1==RULE_EXCLUSION_KEYWORD||LA36_1==RULE_ROUND_OPEN||LA36_1==RULE_WILDCARD||LA36_1==RULE_REVERSED||(LA36_1>=RULE_ID_KEYWORD && LA36_1<=RULE_PREFERRED_IN_KEYWORD)||(LA36_1>=RULE_ACCEPTABLE_IN_KEYWORD && LA36_1<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA36_1==RULE_HISTORY_KEYWORD||(LA36_1>=RULE_CONCEPT_SHORT_KEYWORD && LA36_1<=RULE_MAX_KEYWORD)) ) {
                        alt36=1;
                    }
                    }
                    break;
                case RULE_DESCRIPTION_SHORT_KEYWORD:
                    {
                    int LA36_2 = input.LA(2);

                    if ( ((LA36_2>=RULE_DISJUNCTION_KEYWORD && LA36_2<=RULE_CONJUNCTION_KEYWORD)||LA36_2==RULE_EXCLUSION_KEYWORD||LA36_2==RULE_ROUND_OPEN||LA36_2==RULE_WILDCARD||LA36_2==RULE_REVERSED||(LA36_2>=RULE_ID_KEYWORD && LA36_2<=RULE_PREFERRED_IN_KEYWORD)||(LA36_2>=RULE_ACCEPTABLE_IN_KEYWORD && LA36_2<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA36_2==RULE_HISTORY_KEYWORD||(LA36_2>=RULE_CONCEPT_SHORT_KEYWORD && LA36_2<=RULE_MAX_KEYWORD)) ) {
                        alt36=1;
                    }
                    }
                    break;
                case RULE_MEMBER_SHORT_KEYWORD:
                    {
                    int LA36_3 = input.LA(2);

                    if ( ((LA36_3>=RULE_DISJUNCTION_KEYWORD && LA36_3<=RULE_CONJUNCTION_KEYWORD)||LA36_3==RULE_EXCLUSION_KEYWORD||LA36_3==RULE_ROUND_OPEN||LA36_3==RULE_WILDCARD||LA36_3==RULE_REVERSED||(LA36_3>=RULE_ID_KEYWORD && LA36_3<=RULE_PREFERRED_IN_KEYWORD)||(LA36_3>=RULE_ACCEPTABLE_IN_KEYWORD && LA36_3<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA36_3==RULE_HISTORY_KEYWORD||(LA36_3>=RULE_CONCEPT_SHORT_KEYWORD && LA36_3<=RULE_MAX_KEYWORD)) ) {
                        alt36=1;
                    }
                    }
                    break;
            }

            switch (alt36) {
                case 1 :
                    // InternalEcl.g:2942:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    {
                    // InternalEcl.g:2942:4: (lv_domain_1_0= ruleSHORT_DOMAIN )
                    // InternalEcl.g:2943:5: lv_domain_1_0= ruleSHORT_DOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getFilterConstraintAccess().getDomainSHORT_DOMAINParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalEcl.g:2960:3: ( (lv_filter_2_0= ruleFilter ) )
            // InternalEcl.g:2961:4: (lv_filter_2_0= ruleFilter )
            {
            // InternalEcl.g:2961:4: (lv_filter_2_0= ruleFilter )
            // InternalEcl.g:2962:5: lv_filter_2_0= ruleFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalEcl.g:2987:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEcl.g:2987:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEcl.g:2988:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalEcl.g:2994:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3000:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEcl.g:3001:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
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
    // InternalEcl.g:3015:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEcl.g:3015:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEcl.g:3016:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
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
    // InternalEcl.g:3022:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_DISJUNCTION_KEYWORD_2=null;
        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3028:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEcl.g:3029:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEcl.g:3029:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEcl.g:3030:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
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
            // InternalEcl.g:3041:3: ( () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==RULE_DISJUNCTION_KEYWORD) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalEcl.g:3042:4: () this_DISJUNCTION_KEYWORD_2= RULE_DISJUNCTION_KEYWORD ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEcl.g:3042:4: ()
            	    // InternalEcl.g:3043:5: 
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

            	    this_DISJUNCTION_KEYWORD_2=(Token)match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DISJUNCTION_KEYWORD_2, grammarAccess.getDisjunctionFilterAccess().getDISJUNCTION_KEYWORDTerminalRuleCall_1_1());
            	      			
            	    }
            	    // InternalEcl.g:3056:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEcl.g:3057:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEcl.g:3057:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEcl.g:3058:6: lv_right_3_0= ruleConjunctionFilter
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
            	    break loop37;
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
    // InternalEcl.g:3080:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEcl.g:3080:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEcl.g:3081:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
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
    // InternalEcl.g:3087:1: ruleConjunctionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_CONJUNCTION_KEYWORD_2=null;
        Token this_COMMA_3=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3093:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) )
            // InternalEcl.g:3094:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            {
            // InternalEcl.g:3094:2: (this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            // InternalEcl.g:3095:3: this_PropertyFilter_0= rulePropertyFilter ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
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
            // InternalEcl.g:3106:3: ( () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_CONJUNCTION_KEYWORD && LA39_0<=RULE_COMMA)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEcl.g:3107:4: () (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) )
            	    {
            	    // InternalEcl.g:3107:4: ()
            	    // InternalEcl.g:3108:5: 
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

            	    // InternalEcl.g:3117:4: (this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD | this_COMMA_3= RULE_COMMA )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==RULE_CONJUNCTION_KEYWORD) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==RULE_COMMA) ) {
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
            	            // InternalEcl.g:3118:5: this_CONJUNCTION_KEYWORD_2= RULE_CONJUNCTION_KEYWORD
            	            {
            	            this_CONJUNCTION_KEYWORD_2=(Token)match(input,RULE_CONJUNCTION_KEYWORD,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_CONJUNCTION_KEYWORD_2, grammarAccess.getConjunctionFilterAccess().getCONJUNCTION_KEYWORDTerminalRuleCall_1_1_0());
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEcl.g:3123:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_30); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEcl.g:3128:4: ( (lv_right_4_0= rulePropertyFilter ) )
            	    // InternalEcl.g:3129:5: (lv_right_4_0= rulePropertyFilter )
            	    {
            	    // InternalEcl.g:3129:5: (lv_right_4_0= rulePropertyFilter )
            	    // InternalEcl.g:3130:6: lv_right_4_0= rulePropertyFilter
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
            	    break loop39;
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
    // InternalEcl.g:3152:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEcl.g:3152:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEcl.g:3153:2: iv_ruleNestedFilter= ruleNestedFilter EOF
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
    // InternalEcl.g:3159:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3165:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:3166:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:3166:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:3167:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3171:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEcl.g:3172:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEcl.g:3172:4: (lv_nested_1_0= ruleFilter )
            // InternalEcl.g:3173:5: lv_nested_1_0= ruleFilter
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
    // InternalEcl.g:3198:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEcl.g:3198:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEcl.g:3199:2: iv_rulePropertyFilter= rulePropertyFilter EOF
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
    // InternalEcl.g:3205:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_IdFilter_4= ruleIdFilter | this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter | this_ModuleFilter_6= ruleModuleFilter | this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter | this_ActiveFilter_8= ruleActiveFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_PreferredInFilter_10= rulePreferredInFilter | this_AcceptableInFilter_11= ruleAcceptableInFilter | this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter | this_MemberFieldFilter_14= ruleMemberFieldFilter | this_NestedFilter_15= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TermFilter_0 = null;

        EObject this_LanguageFilter_1 = null;

        EObject this_TypeFilter_2 = null;

        EObject this_DialectFilter_3 = null;

        EObject this_IdFilter_4 = null;

        EObject this_DefinitionStatusFilter_5 = null;

        EObject this_ModuleFilter_6 = null;

        EObject this_EffectiveTimeFilter_7 = null;

        EObject this_ActiveFilter_8 = null;

        EObject this_SemanticTagFilter_9 = null;

        EObject this_PreferredInFilter_10 = null;

        EObject this_AcceptableInFilter_11 = null;

        EObject this_LanguageRefSetFilter_12 = null;

        EObject this_CaseSignificanceFilter_13 = null;

        EObject this_MemberFieldFilter_14 = null;

        EObject this_NestedFilter_15 = null;



        	enterRule();

        try {
            // InternalEcl.g:3211:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_IdFilter_4= ruleIdFilter | this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter | this_ModuleFilter_6= ruleModuleFilter | this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter | this_ActiveFilter_8= ruleActiveFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_PreferredInFilter_10= rulePreferredInFilter | this_AcceptableInFilter_11= ruleAcceptableInFilter | this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter | this_MemberFieldFilter_14= ruleMemberFieldFilter | this_NestedFilter_15= ruleNestedFilter ) )
            // InternalEcl.g:3212:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_IdFilter_4= ruleIdFilter | this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter | this_ModuleFilter_6= ruleModuleFilter | this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter | this_ActiveFilter_8= ruleActiveFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_PreferredInFilter_10= rulePreferredInFilter | this_AcceptableInFilter_11= ruleAcceptableInFilter | this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter | this_MemberFieldFilter_14= ruleMemberFieldFilter | this_NestedFilter_15= ruleNestedFilter )
            {
            // InternalEcl.g:3212:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_IdFilter_4= ruleIdFilter | this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter | this_ModuleFilter_6= ruleModuleFilter | this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter | this_ActiveFilter_8= ruleActiveFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_PreferredInFilter_10= rulePreferredInFilter | this_AcceptableInFilter_11= ruleAcceptableInFilter | this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter | this_MemberFieldFilter_14= ruleMemberFieldFilter | this_NestedFilter_15= ruleNestedFilter )
            int alt40=16;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalEcl.g:3213:3: this_TermFilter_0= ruleTermFilter
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
                    // InternalEcl.g:3225:3: this_LanguageFilter_1= ruleLanguageFilter
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
                    // InternalEcl.g:3237:3: this_TypeFilter_2= ruleTypeFilter
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
                    // InternalEcl.g:3249:3: this_DialectFilter_3= ruleDialectFilter
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
                    // InternalEcl.g:3261:3: this_IdFilter_4= ruleIdFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getIdFilterParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_IdFilter_4=ruleIdFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_IdFilter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:3273:3: this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getDefinitionStatusFilterParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_DefinitionStatusFilter_5=ruleDefinitionStatusFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_DefinitionStatusFilter_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:3285:3: this_ModuleFilter_6= ruleModuleFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModuleFilter_6=ruleModuleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleFilter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEcl.g:3297:3: this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EffectiveTimeFilter_7=ruleEffectiveTimeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EffectiveTimeFilter_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEcl.g:3309:3: this_ActiveFilter_8= ruleActiveFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActiveFilter_8=ruleActiveFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActiveFilter_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEcl.g:3321:3: this_SemanticTagFilter_9= ruleSemanticTagFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getSemanticTagFilterParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_SemanticTagFilter_9=ruleSemanticTagFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_SemanticTagFilter_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEcl.g:3333:3: this_PreferredInFilter_10= rulePreferredInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreferredInFilter_10=rulePreferredInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreferredInFilter_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEcl.g:3345:3: this_AcceptableInFilter_11= ruleAcceptableInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_11());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptableInFilter_11=ruleAcceptableInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptableInFilter_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEcl.g:3357:3: this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_12());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageRefSetFilter_12=ruleLanguageRefSetFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageRefSetFilter_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 14 :
                    // InternalEcl.g:3369:3: this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_13());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_13=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalEcl.g:3381:3: this_MemberFieldFilter_14= ruleMemberFieldFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getMemberFieldFilterParserRuleCall_14());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_MemberFieldFilter_14=ruleMemberFieldFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MemberFieldFilter_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 16 :
                    // InternalEcl.g:3393:3: this_NestedFilter_15= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_15());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_15=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_15;
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
    // InternalEcl.g:3408:1: entryRuleMemberFieldFilter returns [EObject current=null] : iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF ;
    public final EObject entryRuleMemberFieldFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberFieldFilter = null;


        try {
            // InternalEcl.g:3408:58: (iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF )
            // InternalEcl.g:3409:2: iv_ruleMemberFieldFilter= ruleMemberFieldFilter EOF
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
    // InternalEcl.g:3415:1: ruleMemberFieldFilter returns [EObject current=null] : ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) ) ;
    public final EObject ruleMemberFieldFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_refsetFieldName_0_0 = null;

        EObject lv_comparison_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3421:2: ( ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) ) )
            // InternalEcl.g:3422:2: ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) )
            {
            // InternalEcl.g:3422:2: ( ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) ) )
            // InternalEcl.g:3423:3: ( (lv_refsetFieldName_0_0= ruleUnquotedString ) ) ( (lv_comparison_1_0= ruleComparison ) )
            {
            // InternalEcl.g:3423:3: ( (lv_refsetFieldName_0_0= ruleUnquotedString ) )
            // InternalEcl.g:3424:4: (lv_refsetFieldName_0_0= ruleUnquotedString )
            {
            // InternalEcl.g:3424:4: (lv_refsetFieldName_0_0= ruleUnquotedString )
            // InternalEcl.g:3425:5: lv_refsetFieldName_0_0= ruleUnquotedString
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMemberFieldFilterAccess().getRefsetFieldNameUnquotedStringParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
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

            // InternalEcl.g:3442:3: ( (lv_comparison_1_0= ruleComparison ) )
            // InternalEcl.g:3443:4: (lv_comparison_1_0= ruleComparison )
            {
            // InternalEcl.g:3443:4: (lv_comparison_1_0= ruleComparison )
            // InternalEcl.g:3444:5: lv_comparison_1_0= ruleComparison
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


    // $ANTLR start "entryRuleIdFilter"
    // InternalEcl.g:3465:1: entryRuleIdFilter returns [EObject current=null] : iv_ruleIdFilter= ruleIdFilter EOF ;
    public final EObject entryRuleIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIdFilter = null;


        try {
            // InternalEcl.g:3465:49: (iv_ruleIdFilter= ruleIdFilter EOF )
            // InternalEcl.g:3466:2: iv_ruleIdFilter= ruleIdFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdFilter=ruleIdFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdFilter; 
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
    // $ANTLR end "entryRuleIdFilter"


    // $ANTLR start "ruleIdFilter"
    // InternalEcl.g:3472:1: ruleIdFilter returns [EObject current=null] : ( (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) ) | (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) ) ) ;
    public final EObject ruleIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_ID_KEYWORD_0=null;
        Token lv_searchType_2_0=null;
        Token this_COLON_3=null;
        Token this_ROUND_OPEN_5=null;
        Token this_ROUND_CLOSE_7=null;
        Token this_ID_KEYWORD_8=null;
        Token lv_searchType_10_0=null;
        Token this_COLON_11=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_ids_4_0 = null;

        AntlrDatatypeRuleToken lv_ids_6_0 = null;

        AntlrDatatypeRuleToken lv_op_9_0 = null;

        AntlrDatatypeRuleToken lv_ids_12_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3478:2: ( ( (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) ) | (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) ) ) )
            // InternalEcl.g:3479:2: ( (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) ) | (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) ) )
            {
            // InternalEcl.g:3479:2: ( (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) ) | (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ID_KEYWORD) ) {
                int LA44_1 = input.LA(2);

                if ( (LA44_1==RULE_EQUAL) ) {
                    int LA44_2 = input.LA(3);

                    if ( (LA44_2==RULE_ROUND_OPEN||LA44_2==RULE_REVERSED||(LA44_2>=RULE_ID_KEYWORD && LA44_2<=RULE_EXACT_KEYWORD)||(LA44_2>=RULE_DIGIT && LA44_2<=RULE_KEYWORD)) ) {
                        alt44=1;
                    }
                    else if ( (LA44_2==RULE_REGEX_KEYWORD) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 2, input);

                        throw nvae;
                    }
                }
                else if ( (LA44_1==RULE_NOT_EQUAL) ) {
                    int LA44_3 = input.LA(3);

                    if ( (LA44_3==RULE_ROUND_OPEN||LA44_3==RULE_REVERSED||(LA44_3>=RULE_ID_KEYWORD && LA44_3<=RULE_EXACT_KEYWORD)||(LA44_3>=RULE_DIGIT && LA44_3<=RULE_KEYWORD)) ) {
                        alt44=1;
                    }
                    else if ( (LA44_3==RULE_REGEX_KEYWORD) ) {
                        alt44=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 44, 3, input);

                        throw nvae;
                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 44, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalEcl.g:3480:3: (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) )
                    {
                    // InternalEcl.g:3480:3: (this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) ) )
                    // InternalEcl.g:3481:4: this_ID_KEYWORD_0= RULE_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )? ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) )
                    {
                    this_ID_KEYWORD_0=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_KEYWORD_0, grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_0_0());
                      			
                    }
                    // InternalEcl.g:3485:4: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
                    // InternalEcl.g:3486:5: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
                    {
                    // InternalEcl.g:3486:5: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
                    // InternalEcl.g:3487:6: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_34);
                    lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdFilterRule());
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

                    // InternalEcl.g:3504:4: ( ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON )?
                    int alt41=2;
                    int LA41_0 = input.LA(1);

                    if ( (LA41_0==RULE_EXACT_KEYWORD) ) {
                        alt41=1;
                    }
                    switch (alt41) {
                        case 1 :
                            // InternalEcl.g:3505:5: ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) ) this_COLON_3= RULE_COLON
                            {
                            // InternalEcl.g:3505:5: ( (lv_searchType_2_0= RULE_EXACT_KEYWORD ) )
                            // InternalEcl.g:3506:6: (lv_searchType_2_0= RULE_EXACT_KEYWORD )
                            {
                            // InternalEcl.g:3506:6: (lv_searchType_2_0= RULE_EXACT_KEYWORD )
                            // InternalEcl.g:3507:7: lv_searchType_2_0= RULE_EXACT_KEYWORD
                            {
                            lv_searchType_2_0=(Token)match(input,RULE_EXACT_KEYWORD,FollowSets000.FOLLOW_35); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_searchType_2_0, grammarAccess.getIdFilterAccess().getSearchTypeEXACT_KEYWORDTerminalRuleCall_0_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getIdFilterRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"searchType",
                              								lv_searchType_2_0,
                              								"com.b2international.snomed.ecl.Ecl.EXACT_KEYWORD");
                              						
                            }

                            }


                            }

                            this_COLON_3=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_36); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(this_COLON_3, grammarAccess.getIdFilterAccess().getCOLONTerminalRuleCall_0_2_1());
                              				
                            }

                            }
                            break;

                    }

                    // InternalEcl.g:3528:4: ( ( (lv_ids_4_0= ruleIdentifier ) ) | (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE ) )
                    int alt43=2;
                    int LA43_0 = input.LA(1);

                    if ( (LA43_0==RULE_REVERSED||LA43_0==RULE_ID_KEYWORD||(LA43_0>=RULE_DIGIT && LA43_0<=RULE_KEYWORD)) ) {
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
                            // InternalEcl.g:3529:5: ( (lv_ids_4_0= ruleIdentifier ) )
                            {
                            // InternalEcl.g:3529:5: ( (lv_ids_4_0= ruleIdentifier ) )
                            // InternalEcl.g:3530:6: (lv_ids_4_0= ruleIdentifier )
                            {
                            // InternalEcl.g:3530:6: (lv_ids_4_0= ruleIdentifier )
                            // InternalEcl.g:3531:7: lv_ids_4_0= ruleIdentifier
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_3_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_2);
                            lv_ids_4_0=ruleIdentifier();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getIdFilterRule());
                              							}
                              							add(
                              								current,
                              								"ids",
                              								lv_ids_4_0,
                              								"com.b2international.snomed.ecl.Ecl.Identifier");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalEcl.g:3549:5: (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )
                            {
                            // InternalEcl.g:3549:5: (this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE )
                            // InternalEcl.g:3550:6: this_ROUND_OPEN_5= RULE_ROUND_OPEN ( (lv_ids_6_0= ruleIdentifier ) )+ this_ROUND_CLOSE_7= RULE_ROUND_CLOSE
                            {
                            this_ROUND_OPEN_5=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_17); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_ROUND_OPEN_5, grammarAccess.getIdFilterAccess().getROUND_OPENTerminalRuleCall_0_3_1_0());
                              					
                            }
                            // InternalEcl.g:3554:6: ( (lv_ids_6_0= ruleIdentifier ) )+
                            int cnt42=0;
                            loop42:
                            do {
                                int alt42=2;
                                int LA42_0 = input.LA(1);

                                if ( (LA42_0==RULE_REVERSED||LA42_0==RULE_ID_KEYWORD||(LA42_0>=RULE_DIGIT && LA42_0<=RULE_KEYWORD)) ) {
                                    alt42=1;
                                }


                                switch (alt42) {
                            	case 1 :
                            	    // InternalEcl.g:3555:7: (lv_ids_6_0= ruleIdentifier )
                            	    {
                            	    // InternalEcl.g:3555:7: (lv_ids_6_0= ruleIdentifier )
                            	    // InternalEcl.g:3556:8: lv_ids_6_0= ruleIdentifier
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getIdFilterAccess().getIdsIdentifierParserRuleCall_0_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FollowSets000.FOLLOW_18);
                            	    lv_ids_6_0=ruleIdentifier();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getIdFilterRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"ids",
                            	      									lv_ids_6_0,
                            	      									"com.b2international.snomed.ecl.Ecl.Identifier");
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

                            this_ROUND_CLOSE_7=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              						newLeafNode(this_ROUND_CLOSE_7, grammarAccess.getIdFilterAccess().getROUND_CLOSETerminalRuleCall_0_3_1_2());
                              					
                            }

                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEcl.g:3581:3: (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) )
                    {
                    // InternalEcl.g:3581:3: (this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) ) )
                    // InternalEcl.g:3582:4: this_ID_KEYWORD_8= RULE_ID_KEYWORD ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) ) this_COLON_11= RULE_COLON ( (lv_ids_12_0= ruleRegularExpression ) )
                    {
                    this_ID_KEYWORD_8=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_KEYWORD_8, grammarAccess.getIdFilterAccess().getID_KEYWORDTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEcl.g:3586:4: ( (lv_op_9_0= ruleNON_NUMERIC_OPERATOR ) )
                    // InternalEcl.g:3587:5: (lv_op_9_0= ruleNON_NUMERIC_OPERATOR )
                    {
                    // InternalEcl.g:3587:5: (lv_op_9_0= ruleNON_NUMERIC_OPERATOR )
                    // InternalEcl.g:3588:6: lv_op_9_0= ruleNON_NUMERIC_OPERATOR
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_op_9_0=ruleNON_NUMERIC_OPERATOR();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdFilterRule());
                      						}
                      						set(
                      							current,
                      							"op",
                      							lv_op_9_0,
                      							"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEcl.g:3605:4: ( (lv_searchType_10_0= RULE_REGEX_KEYWORD ) )
                    // InternalEcl.g:3606:5: (lv_searchType_10_0= RULE_REGEX_KEYWORD )
                    {
                    // InternalEcl.g:3606:5: (lv_searchType_10_0= RULE_REGEX_KEYWORD )
                    // InternalEcl.g:3607:6: lv_searchType_10_0= RULE_REGEX_KEYWORD
                    {
                    lv_searchType_10_0=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_searchType_10_0, grammarAccess.getIdFilterAccess().getSearchTypeREGEX_KEYWORDTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getIdFilterRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"searchType",
                      							lv_searchType_10_0,
                      							"com.b2international.snomed.ecl.Ecl.REGEX_KEYWORD");
                      					
                    }

                    }


                    }

                    this_COLON_11=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_11, grammarAccess.getIdFilterAccess().getCOLONTerminalRuleCall_1_3());
                      			
                    }
                    // InternalEcl.g:3627:4: ( (lv_ids_12_0= ruleRegularExpression ) )
                    // InternalEcl.g:3628:5: (lv_ids_12_0= ruleRegularExpression )
                    {
                    // InternalEcl.g:3628:5: (lv_ids_12_0= ruleRegularExpression )
                    // InternalEcl.g:3629:6: lv_ids_12_0= ruleRegularExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getIdFilterAccess().getIdsRegularExpressionParserRuleCall_1_4_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_ids_12_0=ruleRegularExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getIdFilterRule());
                      						}
                      						add(
                      							current,
                      							"ids",
                      							lv_ids_12_0,
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
    // $ANTLR end "ruleIdFilter"


    // $ANTLR start "entryRuleTermFilter"
    // InternalEcl.g:3651:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEcl.g:3651:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEcl.g:3652:2: iv_ruleTermFilter= ruleTermFilter EOF
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
    // InternalEcl.g:3658:1: ruleTermFilter returns [EObject current=null] : (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchTerm_2_0= ruleSearchTerm ) ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_TERM_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_searchTerm_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3664:2: ( (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchTerm_2_0= ruleSearchTerm ) ) ) )
            // InternalEcl.g:3665:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchTerm_2_0= ruleSearchTerm ) ) )
            {
            // InternalEcl.g:3665:2: (this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchTerm_2_0= ruleSearchTerm ) ) )
            // InternalEcl.g:3666:3: this_TERM_KEYWORD_0= RULE_TERM_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_searchTerm_2_0= ruleSearchTerm ) )
            {
            this_TERM_KEYWORD_0=(Token)match(input,RULE_TERM_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TERM_KEYWORD_0, grammarAccess.getTermFilterAccess().getTERM_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3670:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3671:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3671:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3672:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:3689:3: ( (lv_searchTerm_2_0= ruleSearchTerm ) )
            // InternalEcl.g:3690:4: (lv_searchTerm_2_0= ruleSearchTerm )
            {
            // InternalEcl.g:3690:4: (lv_searchTerm_2_0= ruleSearchTerm )
            // InternalEcl.g:3691:5: lv_searchTerm_2_0= ruleSearchTerm
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTermFilterAccess().getSearchTermSearchTermParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_searchTerm_2_0=ruleSearchTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTermFilterRule());
              					}
              					set(
              						current,
              						"searchTerm",
              						lv_searchTerm_2_0,
              						"com.b2international.snomed.ecl.Ecl.SearchTerm");
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
    // $ANTLR end "ruleTermFilter"


    // $ANTLR start "entryRuleSearchTerm"
    // InternalEcl.g:3712:1: entryRuleSearchTerm returns [EObject current=null] : iv_ruleSearchTerm= ruleSearchTerm EOF ;
    public final EObject entryRuleSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSearchTerm = null;


        try {
            // InternalEcl.g:3712:51: (iv_ruleSearchTerm= ruleSearchTerm EOF )
            // InternalEcl.g:3713:2: iv_ruleSearchTerm= ruleSearchTerm EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSearchTermRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSearchTerm=ruleSearchTerm();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSearchTerm; 
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
    // $ANTLR end "entryRuleSearchTerm"


    // $ANTLR start "ruleSearchTerm"
    // InternalEcl.g:3719:1: ruleSearchTerm returns [EObject current=null] : (this_TypedSearchTerm_0= ruleTypedSearchTerm | this_TypedSearchTermSet_1= ruleTypedSearchTermSet ) ;
    public final EObject ruleSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject this_TypedSearchTerm_0 = null;

        EObject this_TypedSearchTermSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:3725:2: ( (this_TypedSearchTerm_0= ruleTypedSearchTerm | this_TypedSearchTermSet_1= ruleTypedSearchTermSet ) )
            // InternalEcl.g:3726:2: (this_TypedSearchTerm_0= ruleTypedSearchTerm | this_TypedSearchTermSet_1= ruleTypedSearchTermSet )
            {
            // InternalEcl.g:3726:2: (this_TypedSearchTerm_0= ruleTypedSearchTerm | this_TypedSearchTermSet_1= ruleTypedSearchTermSet )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_STRING||(LA45_0>=RULE_EXACT_KEYWORD && LA45_0<=RULE_REGEX_KEYWORD)||(LA45_0>=RULE_MATCH_KEYWORD && LA45_0<=RULE_WILD_KEYWORD)) ) {
                alt45=1;
            }
            else if ( (LA45_0==RULE_ROUND_OPEN) ) {
                alt45=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalEcl.g:3727:3: this_TypedSearchTerm_0= ruleTypedSearchTerm
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSearchTermAccess().getTypedSearchTermParserRuleCall_0());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedSearchTerm_0=ruleTypedSearchTerm();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedSearchTerm_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:3739:3: this_TypedSearchTermSet_1= ruleTypedSearchTermSet
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSearchTermAccess().getTypedSearchTermSetParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_TypedSearchTermSet_1=ruleTypedSearchTermSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_TypedSearchTermSet_1;
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
    // $ANTLR end "ruleSearchTerm"


    // $ANTLR start "entryRuleTypedSearchTerm"
    // InternalEcl.g:3754:1: entryRuleTypedSearchTerm returns [EObject current=null] : iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF ;
    public final EObject entryRuleTypedSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTerm = null;


        try {
            // InternalEcl.g:3754:56: (iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF )
            // InternalEcl.g:3755:2: iv_ruleTypedSearchTerm= ruleTypedSearchTerm EOF
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
    // InternalEcl.g:3761:1: ruleTypedSearchTerm returns [EObject current=null] : ( (lv_clause_0_0= ruleTypedSearchTermClause ) ) ;
    public final EObject ruleTypedSearchTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_clause_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3767:2: ( ( (lv_clause_0_0= ruleTypedSearchTermClause ) ) )
            // InternalEcl.g:3768:2: ( (lv_clause_0_0= ruleTypedSearchTermClause ) )
            {
            // InternalEcl.g:3768:2: ( (lv_clause_0_0= ruleTypedSearchTermClause ) )
            // InternalEcl.g:3769:3: (lv_clause_0_0= ruleTypedSearchTermClause )
            {
            // InternalEcl.g:3769:3: (lv_clause_0_0= ruleTypedSearchTermClause )
            // InternalEcl.g:3770:4: lv_clause_0_0= ruleTypedSearchTermClause
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
    // InternalEcl.g:3790:1: entryRuleTypedSearchTermSet returns [EObject current=null] : iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF ;
    public final EObject entryRuleTypedSearchTermSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTermSet = null;


        try {
            // InternalEcl.g:3790:59: (iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF )
            // InternalEcl.g:3791:2: iv_ruleTypedSearchTermSet= ruleTypedSearchTermSet EOF
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
    // InternalEcl.g:3797:1: ruleTypedSearchTermSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedSearchTermSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_clauses_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:3803:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEcl.g:3804:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEcl.g:3804:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEcl.g:3805:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+ this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getTypedSearchTermSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3809:3: ( (lv_clauses_1_0= ruleTypedSearchTermClause ) )+
            int cnt46=0;
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==RULE_STRING||(LA46_0>=RULE_EXACT_KEYWORD && LA46_0<=RULE_REGEX_KEYWORD)||(LA46_0>=RULE_MATCH_KEYWORD && LA46_0<=RULE_WILD_KEYWORD)) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalEcl.g:3810:4: (lv_clauses_1_0= ruleTypedSearchTermClause )
            	    {
            	    // InternalEcl.g:3810:4: (lv_clauses_1_0= ruleTypedSearchTermClause )
            	    // InternalEcl.g:3811:5: lv_clauses_1_0= ruleTypedSearchTermClause
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedSearchTermSetAccess().getClausesTypedSearchTermClauseParserRuleCall_1_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_40);
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
            	    if ( cnt46 >= 1 ) break loop46;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(46, input);
                        throw eee;
                }
                cnt46++;
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
    // InternalEcl.g:3836:1: entryRuleTypedSearchTermClause returns [EObject current=null] : iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF ;
    public final EObject entryRuleTypedSearchTermClause() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedSearchTermClause = null;


        try {
            // InternalEcl.g:3836:62: (iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF )
            // InternalEcl.g:3837:2: iv_ruleTypedSearchTermClause= ruleTypedSearchTermClause EOF
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
    // InternalEcl.g:3843:1: ruleTypedSearchTermClause returns [EObject current=null] : ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) ;
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
            // InternalEcl.g:3849:2: ( ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) ) )
            // InternalEcl.g:3850:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            {
            // InternalEcl.g:3850:2: ( ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) ) | ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_STRING||LA48_0==RULE_EXACT_KEYWORD||(LA48_0>=RULE_MATCH_KEYWORD && LA48_0<=RULE_WILD_KEYWORD)) ) {
                alt48=1;
            }
            else if ( (LA48_0==RULE_REGEX_KEYWORD) ) {
                alt48=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalEcl.g:3851:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    {
                    // InternalEcl.g:3851:3: ( ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) ) )
                    // InternalEcl.g:3852:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )? ( (lv_term_2_0= RULE_STRING ) )
                    {
                    // InternalEcl.g:3852:4: ( ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON )?
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==RULE_EXACT_KEYWORD||(LA47_0>=RULE_MATCH_KEYWORD && LA47_0<=RULE_WILD_KEYWORD)) ) {
                        alt47=1;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalEcl.g:3853:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_1= RULE_COLON
                            {
                            // InternalEcl.g:3853:5: ( (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE ) )
                            // InternalEcl.g:3854:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            {
                            // InternalEcl.g:3854:6: (lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE )
                            // InternalEcl.g:3855:7: lv_lexicalSearchType_0_0= ruleLEXICAL_SEARCH_TYPE
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getTypedSearchTermClauseAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_0_0_0_0());
                              						
                            }
                            pushFollow(FollowSets000.FOLLOW_35);
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

                    // InternalEcl.g:3877:4: ( (lv_term_2_0= RULE_STRING ) )
                    // InternalEcl.g:3878:5: (lv_term_2_0= RULE_STRING )
                    {
                    // InternalEcl.g:3878:5: (lv_term_2_0= RULE_STRING )
                    // InternalEcl.g:3879:6: lv_term_2_0= RULE_STRING
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
                    // InternalEcl.g:3897:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    {
                    // InternalEcl.g:3897:3: ( ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) ) )
                    // InternalEcl.g:3898:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) ) this_COLON_4= RULE_COLON ( (lv_term_5_0= ruleRegularExpression ) )
                    {
                    // InternalEcl.g:3898:4: ( (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD ) )
                    // InternalEcl.g:3899:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    {
                    // InternalEcl.g:3899:5: (lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD )
                    // InternalEcl.g:3900:6: lv_lexicalSearchType_3_0= RULE_REGEX_KEYWORD
                    {
                    lv_lexicalSearchType_3_0=(Token)match(input,RULE_REGEX_KEYWORD,FollowSets000.FOLLOW_35); if (state.failed) return current;
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
                    // InternalEcl.g:3920:4: ( (lv_term_5_0= ruleRegularExpression ) )
                    // InternalEcl.g:3921:5: (lv_term_5_0= ruleRegularExpression )
                    {
                    // InternalEcl.g:3921:5: (lv_term_5_0= ruleRegularExpression )
                    // InternalEcl.g:3922:6: lv_term_5_0= ruleRegularExpression
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
    // InternalEcl.g:3944:1: entryRuleRegularExpression returns [String current=null] : iv_ruleRegularExpression= ruleRegularExpression EOF ;
    public final String entryRuleRegularExpression() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleRegularExpression = null;


        try {
            // InternalEcl.g:3944:57: (iv_ruleRegularExpression= ruleRegularExpression EOF )
            // InternalEcl.g:3945:2: iv_ruleRegularExpression= ruleRegularExpression EOF
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
    // InternalEcl.g:3951:1: ruleRegularExpression returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleRegularExpression() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;


        	enterRule();

        try {
            // InternalEcl.g:3957:2: (this_STRING_0= RULE_STRING )
            // InternalEcl.g:3958:2: this_STRING_0= RULE_STRING
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
    // InternalEcl.g:3968:1: entryRuleLanguageFilter returns [EObject current=null] : iv_ruleLanguageFilter= ruleLanguageFilter EOF ;
    public final EObject entryRuleLanguageFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFilter = null;


        try {
            // InternalEcl.g:3968:55: (iv_ruleLanguageFilter= ruleLanguageFilter EOF )
            // InternalEcl.g:3969:2: iv_ruleLanguageFilter= ruleLanguageFilter EOF
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
    // InternalEcl.g:3975:1: ruleLanguageFilter returns [EObject current=null] : (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:3981:2: ( (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:3982:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:3982:2: (this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:3983:3: this_LANGUAGE_KEYWORD_0= RULE_LANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_LANGUAGE_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_KEYWORD_0, grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:3987:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:3988:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:3988:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:3989:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalEcl.g:4006:3: ( ( (lv_languageCodes_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( ((LA50_0>=RULE_DISJUNCTION_KEYWORD && LA50_0<=RULE_CONJUNCTION_KEYWORD)||LA50_0==RULE_EXCLUSION_KEYWORD||LA50_0==RULE_WILDCARD||LA50_0==RULE_REVERSED||(LA50_0>=RULE_ID_KEYWORD && LA50_0<=RULE_PREFERRED_IN_KEYWORD)||(LA50_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA50_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA50_0==RULE_HISTORY_KEYWORD||(LA50_0>=RULE_CONCEPT_SHORT_KEYWORD && LA50_0<=RULE_MAX_KEYWORD)) ) {
                alt50=1;
            }
            else if ( (LA50_0==RULE_ROUND_OPEN) ) {
                alt50=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalEcl.g:4007:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:4007:4: ( (lv_languageCodes_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:4008:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:4008:5: (lv_languageCodes_2_0= ruleUnquotedString )
                    // InternalEcl.g:4009:6: lv_languageCodes_2_0= ruleUnquotedString
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
                    // InternalEcl.g:4027:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4027:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4028:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4032:5: ( (lv_languageCodes_4_0= ruleUnquotedString ) )+
                    int cnt49=0;
                    loop49:
                    do {
                        int alt49=2;
                        int LA49_0 = input.LA(1);

                        if ( ((LA49_0>=RULE_DISJUNCTION_KEYWORD && LA49_0<=RULE_CONJUNCTION_KEYWORD)||LA49_0==RULE_EXCLUSION_KEYWORD||LA49_0==RULE_WILDCARD||LA49_0==RULE_REVERSED||(LA49_0>=RULE_ID_KEYWORD && LA49_0<=RULE_PREFERRED_IN_KEYWORD)||(LA49_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA49_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA49_0==RULE_HISTORY_KEYWORD||(LA49_0>=RULE_CONCEPT_SHORT_KEYWORD && LA49_0<=RULE_MAX_KEYWORD)) ) {
                            alt49=1;
                        }


                        switch (alt49) {
                    	case 1 :
                    	    // InternalEcl.g:4033:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:4033:6: (lv_languageCodes_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:4034:7: lv_languageCodes_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    if ( cnt49 >= 1 ) break loop49;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(49, input);
                                throw eee;
                        }
                        cnt49++;
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
    // InternalEcl.g:4061:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEcl.g:4061:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEcl.g:4062:2: iv_ruleTypeFilter= ruleTypeFilter EOF
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
    // InternalEcl.g:4068:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4074:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEcl.g:4075:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEcl.g:4075:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_TYPEID_KEYWORD) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_TYPE_KEYWORD) ) {
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
                    // InternalEcl.g:4076:3: this_TypeIdFilter_0= ruleTypeIdFilter
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
                    // InternalEcl.g:4088:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
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
    // InternalEcl.g:4103:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEcl.g:4103:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEcl.g:4104:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
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
    // InternalEcl.g:4110:1: ruleTypeIdFilter returns [EObject current=null] : (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_TYPEID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4116:2: ( (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4117:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4117:2: (this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4118:3: this_TYPEID_KEYWORD_0= RULE_TYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_type_2_0= ruleFilterValue ) )
            {
            this_TYPEID_KEYWORD_0=(Token)match(input,RULE_TYPEID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPEID_KEYWORD_0, grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4122:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4123:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4123:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4124:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:4141:3: ( (lv_type_2_0= ruleFilterValue ) )
            // InternalEcl.g:4142:4: (lv_type_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4142:4: (lv_type_2_0= ruleFilterValue )
            // InternalEcl.g:4143:5: lv_type_2_0= ruleFilterValue
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
    // InternalEcl.g:4164:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEcl.g:4164:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEcl.g:4165:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
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
    // InternalEcl.g:4171:1: ruleTypeTokenFilter returns [EObject current=null] : (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:4177:2: ( (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4178:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4178:2: (this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4179:3: this_TYPE_KEYWORD_0= RULE_TYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_TYPE_KEYWORD_0=(Token)match(input,RULE_TYPE_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TYPE_KEYWORD_0, grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4183:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4184:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4184:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4185:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalEcl.g:4202:3: ( ( (lv_tokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( ((LA53_0>=RULE_DISJUNCTION_KEYWORD && LA53_0<=RULE_CONJUNCTION_KEYWORD)||LA53_0==RULE_EXCLUSION_KEYWORD||LA53_0==RULE_WILDCARD||LA53_0==RULE_REVERSED||(LA53_0>=RULE_ID_KEYWORD && LA53_0<=RULE_PREFERRED_IN_KEYWORD)||(LA53_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA53_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA53_0==RULE_HISTORY_KEYWORD||(LA53_0>=RULE_CONCEPT_SHORT_KEYWORD && LA53_0<=RULE_MAX_KEYWORD)) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEcl.g:4203:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:4203:4: ( (lv_tokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:4204:5: (lv_tokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:4204:5: (lv_tokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:4205:6: lv_tokens_2_0= ruleUnquotedString
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
                    // InternalEcl.g:4223:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4223:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4224:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4228:5: ( (lv_tokens_4_0= ruleUnquotedString ) )+
                    int cnt52=0;
                    loop52:
                    do {
                        int alt52=2;
                        int LA52_0 = input.LA(1);

                        if ( ((LA52_0>=RULE_DISJUNCTION_KEYWORD && LA52_0<=RULE_CONJUNCTION_KEYWORD)||LA52_0==RULE_EXCLUSION_KEYWORD||LA52_0==RULE_WILDCARD||LA52_0==RULE_REVERSED||(LA52_0>=RULE_ID_KEYWORD && LA52_0<=RULE_PREFERRED_IN_KEYWORD)||(LA52_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA52_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA52_0==RULE_HISTORY_KEYWORD||(LA52_0>=RULE_CONCEPT_SHORT_KEYWORD && LA52_0<=RULE_MAX_KEYWORD)) ) {
                            alt52=1;
                        }


                        switch (alt52) {
                    	case 1 :
                    	    // InternalEcl.g:4229:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:4229:6: (lv_tokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:4230:7: lv_tokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    if ( cnt52 >= 1 ) break loop52;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(52, input);
                                throw eee;
                        }
                        cnt52++;
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
    // InternalEcl.g:4257:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEcl.g:4257:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEcl.g:4258:2: iv_ruleDialectFilter= ruleDialectFilter EOF
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
    // InternalEcl.g:4264:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4270:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEcl.g:4271:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEcl.g:4271:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_DIALECTID_KEYWORD) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_DIALECT_KEYWORD) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalEcl.g:4272:3: this_DialectIdFilter_0= ruleDialectIdFilter
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
                    // InternalEcl.g:4284:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
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
    // InternalEcl.g:4299:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEcl.g:4299:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEcl.g:4300:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
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
    // InternalEcl.g:4306:1: ruleDialectIdFilter returns [EObject current=null] : (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:4312:2: ( (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4313:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4313:2: (this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4314:3: this_DIALECTID_KEYWORD_0= RULE_DIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECTID_KEYWORD_0=(Token)match(input,RULE_DIALECTID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECTID_KEYWORD_0, grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4318:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4319:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4319:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4320:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:4337:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt56=2;
            alt56 = dfa56.predict(input);
            switch (alt56) {
                case 1 :
                    // InternalEcl.g:4338:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEcl.g:4338:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEcl.g:4339:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEcl.g:4339:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEcl.g:4340:6: lv_dialects_2_0= ruleDialect
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
                    // InternalEcl.g:4358:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4358:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4359:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4363:5: ( (lv_dialects_4_0= ruleDialect ) )+
                    int cnt55=0;
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( ((LA55_0>=RULE_LT_EM && LA55_0<=RULE_CARET)||LA55_0==RULE_ROUND_OPEN||LA55_0==RULE_WILDCARD||LA55_0==RULE_REVERSED||LA55_0==RULE_ID_KEYWORD||(LA55_0>=RULE_DIGIT && LA55_0<=RULE_KEYWORD)) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalEcl.g:4364:6: (lv_dialects_4_0= ruleDialect )
                    	    {
                    	    // InternalEcl.g:4364:6: (lv_dialects_4_0= ruleDialect )
                    	    // InternalEcl.g:4365:7: lv_dialects_4_0= ruleDialect
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_42);
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
                    	    if ( cnt55 >= 1 ) break loop55;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(55, input);
                                throw eee;
                        }
                        cnt55++;
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
    // InternalEcl.g:4392:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEcl.g:4392:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEcl.g:4393:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
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
    // InternalEcl.g:4399:1: ruleDialectAliasFilter returns [EObject current=null] : (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:4405:2: ( (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4406:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4406:2: (this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4407:3: this_DIALECT_KEYWORD_0= RULE_DIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DIALECT_KEYWORD_0=(Token)match(input,RULE_DIALECT_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIALECT_KEYWORD_0, grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4411:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4412:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4412:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4413:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_43);
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

            // InternalEcl.g:4430:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_DASH||LA58_0==RULE_DIGIT||LA58_0==RULE_KEYWORD) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_ROUND_OPEN) ) {
                alt58=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalEcl.g:4431:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEcl.g:4431:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEcl.g:4432:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEcl.g:4432:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEcl.g:4433:6: lv_dialects_2_0= ruleDialectAlias
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
                    // InternalEcl.g:4451:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4451:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4452:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4456:5: ( (lv_dialects_4_0= ruleDialectAlias ) )+
                    int cnt57=0;
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_DASH||LA57_0==RULE_DIGIT||LA57_0==RULE_KEYWORD) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // InternalEcl.g:4457:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    {
                    	    // InternalEcl.g:4457:6: (lv_dialects_4_0= ruleDialectAlias )
                    	    // InternalEcl.g:4458:7: lv_dialects_4_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_45);
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
                    	    if ( cnt57 >= 1 ) break loop57;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(57, input);
                                throw eee;
                        }
                        cnt57++;
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
    // InternalEcl.g:4485:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEcl.g:4485:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEcl.g:4486:2: iv_ruleDialect= ruleDialect EOF
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
    // InternalEcl.g:4492:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4498:2: ( ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:4499:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:4499:2: ( ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEcl.g:4500:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:4500:3: ( (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint ) )
            // InternalEcl.g:4501:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            {
            // InternalEcl.g:4501:4: (lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint )
            // InternalEcl.g:4502:5: lv_languageRefSetId_0_0= ruleFilteredExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdFilteredExpressionConstraintParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
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

            // InternalEcl.g:4519:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt59=2;
            alt59 = dfa59.predict(input);
            switch (alt59) {
                case 1 :
                    // InternalEcl.g:4520:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEcl.g:4520:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEcl.g:4521:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEcl.g:4542:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;


        try {
            // InternalEcl.g:4542:53: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEcl.g:4543:2: iv_ruleDialectAlias= ruleDialectAlias EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleDialectAlias"


    // $ANTLR start "ruleDialectAlias"
    // InternalEcl.g:4549:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4555:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEcl.g:4556:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEcl.g:4556:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEcl.g:4557:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEcl.g:4557:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEcl.g:4558:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEcl.g:4558:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEcl.g:4559:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_46);
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

            // InternalEcl.g:4576:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ROUND_OPEN) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalEcl.g:4577:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEcl.g:4577:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEcl.g:4578:5: lv_acceptability_1_0= ruleAcceptability
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getDialectAliasAccess().getAcceptabilityAcceptabilityParserRuleCall_1_0());
                      				
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_acceptability_1_0=ruleAcceptability();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getDialectAliasRule());
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
    // $ANTLR end "ruleDialectAlias"


    // $ANTLR start "entryRuleAcceptability"
    // InternalEcl.g:4599:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEcl.g:4599:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEcl.g:4600:2: iv_ruleAcceptability= ruleAcceptability EOF
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
    // InternalEcl.g:4606:1: ruleAcceptability returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4612:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEcl.g:4613:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEcl.g:4613:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:4614:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:4614:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEcl.g:4615:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getAcceptabilityAccess().getAcceptabilitiesEclConceptReferenceSetParserRuleCall_0());
              			
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_acceptabilities_0_0=ruleEclConceptReferenceSet();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getAcceptabilityRule());
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
    // $ANTLR end "ruleAcceptability"


    // $ANTLR start "entryRuleDefinitionStatusFilter"
    // InternalEcl.g:4635:1: entryRuleDefinitionStatusFilter returns [EObject current=null] : iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF ;
    public final EObject entryRuleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusFilter = null;


        try {
            // InternalEcl.g:4635:63: (iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF )
            // InternalEcl.g:4636:2: iv_ruleDefinitionStatusFilter= ruleDefinitionStatusFilter EOF
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
    // InternalEcl.g:4642:1: ruleDefinitionStatusFilter returns [EObject current=null] : (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) ;
    public final EObject ruleDefinitionStatusFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DefinitionStatusIdFilter_0 = null;

        EObject this_DefinitionStatusTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:4648:2: ( (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter ) )
            // InternalEcl.g:4649:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            {
            // InternalEcl.g:4649:2: (this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter | this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_DEFINITION_STATUS_ID_KEYWORD) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_DEFINITION_STATUS_TOKEN_KEYWORD) ) {
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
                    // InternalEcl.g:4650:3: this_DefinitionStatusIdFilter_0= ruleDefinitionStatusIdFilter
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
                    // InternalEcl.g:4662:3: this_DefinitionStatusTokenFilter_1= ruleDefinitionStatusTokenFilter
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
    // InternalEcl.g:4677:1: entryRuleDefinitionStatusIdFilter returns [EObject current=null] : iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF ;
    public final EObject entryRuleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusIdFilter = null;


        try {
            // InternalEcl.g:4677:65: (iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF )
            // InternalEcl.g:4678:2: iv_ruleDefinitionStatusIdFilter= ruleDefinitionStatusIdFilter EOF
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
    // InternalEcl.g:4684:1: ruleDefinitionStatusIdFilter returns [EObject current=null] : (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleDefinitionStatusIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_DEFINITION_STATUS_ID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_definitionStatus_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4690:2: ( (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4691:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4691:2: (this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4692:3: this_DEFINITION_STATUS_ID_KEYWORD_0= RULE_DEFINITION_STATUS_ID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            {
            this_DEFINITION_STATUS_ID_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_ID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_ID_KEYWORD_0, grammarAccess.getDefinitionStatusIdFilterAccess().getDEFINITION_STATUS_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4696:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4697:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4697:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4698:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:4715:3: ( (lv_definitionStatus_2_0= ruleFilterValue ) )
            // InternalEcl.g:4716:4: (lv_definitionStatus_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4716:4: (lv_definitionStatus_2_0= ruleFilterValue )
            // InternalEcl.g:4717:5: lv_definitionStatus_2_0= ruleFilterValue
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
    // InternalEcl.g:4738:1: entryRuleDefinitionStatusTokenFilter returns [EObject current=null] : iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF ;
    public final EObject entryRuleDefinitionStatusTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinitionStatusTokenFilter = null;


        try {
            // InternalEcl.g:4738:68: (iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF )
            // InternalEcl.g:4739:2: iv_ruleDefinitionStatusTokenFilter= ruleDefinitionStatusTokenFilter EOF
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
    // InternalEcl.g:4745:1: ruleDefinitionStatusTokenFilter returns [EObject current=null] : (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEcl.g:4751:2: ( (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) ) )
            // InternalEcl.g:4752:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEcl.g:4752:2: (this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) ) )
            // InternalEcl.g:4753:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_0= RULE_DEFINITION_STATUS_TOKEN_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            {
            this_DEFINITION_STATUS_TOKEN_KEYWORD_0=(Token)match(input,RULE_DEFINITION_STATUS_TOKEN_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DEFINITION_STATUS_TOKEN_KEYWORD_0, grammarAccess.getDefinitionStatusTokenFilterAccess().getDEFINITION_STATUS_TOKEN_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4757:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4758:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4758:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4759:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_30);
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

            // InternalEcl.g:4776:3: ( ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( ((LA63_0>=RULE_DISJUNCTION_KEYWORD && LA63_0<=RULE_CONJUNCTION_KEYWORD)||LA63_0==RULE_EXCLUSION_KEYWORD||LA63_0==RULE_WILDCARD||LA63_0==RULE_REVERSED||(LA63_0>=RULE_ID_KEYWORD && LA63_0<=RULE_PREFERRED_IN_KEYWORD)||(LA63_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA63_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA63_0==RULE_HISTORY_KEYWORD||(LA63_0>=RULE_CONCEPT_SHORT_KEYWORD && LA63_0<=RULE_MAX_KEYWORD)) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEcl.g:4777:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    {
                    // InternalEcl.g:4777:4: ( (lv_definitionStatusTokens_2_0= ruleUnquotedString ) )
                    // InternalEcl.g:4778:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    {
                    // InternalEcl.g:4778:5: (lv_definitionStatusTokens_2_0= ruleUnquotedString )
                    // InternalEcl.g:4779:6: lv_definitionStatusTokens_2_0= ruleUnquotedString
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
                    // InternalEcl.g:4797:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    {
                    // InternalEcl.g:4797:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE )
                    // InternalEcl.g:4798:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDefinitionStatusTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEcl.g:4802:5: ( (lv_definitionStatusTokens_4_0= ruleUnquotedString ) )+
                    int cnt62=0;
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( ((LA62_0>=RULE_DISJUNCTION_KEYWORD && LA62_0<=RULE_CONJUNCTION_KEYWORD)||LA62_0==RULE_EXCLUSION_KEYWORD||LA62_0==RULE_WILDCARD||LA62_0==RULE_REVERSED||(LA62_0>=RULE_ID_KEYWORD && LA62_0<=RULE_PREFERRED_IN_KEYWORD)||(LA62_0>=RULE_ACCEPTABLE_IN_KEYWORD && LA62_0<=RULE_CASE_SIGNIFICANCE_ID_KEYWORD)||LA62_0==RULE_HISTORY_KEYWORD||(LA62_0>=RULE_CONCEPT_SHORT_KEYWORD && LA62_0<=RULE_MAX_KEYWORD)) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // InternalEcl.g:4803:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    {
                    	    // InternalEcl.g:4803:6: (lv_definitionStatusTokens_4_0= ruleUnquotedString )
                    	    // InternalEcl.g:4804:7: lv_definitionStatusTokens_4_0= ruleUnquotedString
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDefinitionStatusTokenFilterAccess().getDefinitionStatusTokensUnquotedStringParserRuleCall_2_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_41);
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
                    	    if ( cnt62 >= 1 ) break loop62;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(62, input);
                                throw eee;
                        }
                        cnt62++;
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
    // InternalEcl.g:4831:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEcl.g:4831:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEcl.g:4832:2: iv_ruleModuleFilter= ruleModuleFilter EOF
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
    // InternalEcl.g:4838:1: ruleModuleFilter returns [EObject current=null] : (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_moduleId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_MODULEID_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_moduleId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4844:2: ( (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_moduleId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:4845:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:4845:2: (this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_moduleId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:4846:3: this_MODULEID_KEYWORD_0= RULE_MODULEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_moduleId_2_0= ruleFilterValue ) )
            {
            this_MODULEID_KEYWORD_0=(Token)match(input,RULE_MODULEID_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_MODULEID_KEYWORD_0, grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4850:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4851:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4851:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4852:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_4);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleFilterRule());
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

            // InternalEcl.g:4869:3: ( (lv_moduleId_2_0= ruleFilterValue ) )
            // InternalEcl.g:4870:4: (lv_moduleId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:4870:4: (lv_moduleId_2_0= ruleFilterValue )
            // InternalEcl.g:4871:5: lv_moduleId_2_0= ruleFilterValue
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
    // InternalEcl.g:4892:1: entryRuleEffectiveTimeFilter returns [EObject current=null] : iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF ;
    public final EObject entryRuleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveTimeFilter = null;


        try {
            // InternalEcl.g:4892:60: (iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF )
            // InternalEcl.g:4893:2: iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF
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
    // InternalEcl.g:4899:1: ruleEffectiveTimeFilter returns [EObject current=null] : (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        Token this_EFFECTIVE_TIME_KEYWORD_0=null;
        Token lv_effectiveTime_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4905:2: ( (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:4906:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:4906:2: (this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) ) )
            // InternalEcl.g:4907:3: this_EFFECTIVE_TIME_KEYWORD_0= RULE_EFFECTIVE_TIME_KEYWORD ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_2_0= RULE_STRING ) )
            {
            this_EFFECTIVE_TIME_KEYWORD_0=(Token)match(input,RULE_EFFECTIVE_TIME_KEYWORD,FollowSets000.FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EFFECTIVE_TIME_KEYWORD_0, grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4911:3: ( (lv_op_1_0= ruleNUMERIC_OPERATOR ) )
            // InternalEcl.g:4912:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEcl.g:4912:4: (lv_op_1_0= ruleNUMERIC_OPERATOR )
            // InternalEcl.g:4913:5: lv_op_1_0= ruleNUMERIC_OPERATOR
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

            // InternalEcl.g:4930:3: ( (lv_effectiveTime_2_0= RULE_STRING ) )
            // InternalEcl.g:4931:4: (lv_effectiveTime_2_0= RULE_STRING )
            {
            // InternalEcl.g:4931:4: (lv_effectiveTime_2_0= RULE_STRING )
            // InternalEcl.g:4932:5: lv_effectiveTime_2_0= RULE_STRING
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
    // InternalEcl.g:4952:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEcl.g:4952:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEcl.g:4953:2: iv_ruleActiveFilter= ruleActiveFilter EOF
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
    // InternalEcl.g:4959:1: ruleActiveFilter returns [EObject current=null] : (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_active_2_0= ruleActiveBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACTIVE_KEYWORD_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_active_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:4965:2: ( (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_active_2_0= ruleActiveBoolean ) ) ) )
            // InternalEcl.g:4966:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_active_2_0= ruleActiveBoolean ) ) )
            {
            // InternalEcl.g:4966:2: (this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_active_2_0= ruleActiveBoolean ) ) )
            // InternalEcl.g:4967:3: this_ACTIVE_KEYWORD_0= RULE_ACTIVE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_active_2_0= ruleActiveBoolean ) )
            {
            this_ACTIVE_KEYWORD_0=(Token)match(input,RULE_ACTIVE_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACTIVE_KEYWORD_0, grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:4971:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:4972:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:4972:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:4973:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActiveFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_47);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActiveFilterRule());
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

            // InternalEcl.g:4990:3: ( (lv_active_2_0= ruleActiveBoolean ) )
            // InternalEcl.g:4991:4: (lv_active_2_0= ruleActiveBoolean )
            {
            // InternalEcl.g:4991:4: (lv_active_2_0= ruleActiveBoolean )
            // InternalEcl.g:4992:5: lv_active_2_0= ruleActiveBoolean
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
    // InternalEcl.g:5013:1: entryRuleSemanticTagFilter returns [EObject current=null] : iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF ;
    public final EObject entryRuleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticTagFilter = null;


        try {
            // InternalEcl.g:5013:58: (iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF )
            // InternalEcl.g:5014:2: iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF
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
    // InternalEcl.g:5020:1: ruleSemanticTagFilter returns [EObject current=null] : (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        Token this_SEMANTIC_TAG_KEYWORD_0=null;
        Token lv_semanticTag_2_0=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5026:2: ( (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) ) )
            // InternalEcl.g:5027:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            {
            // InternalEcl.g:5027:2: (this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) ) )
            // InternalEcl.g:5028:3: this_SEMANTIC_TAG_KEYWORD_0= RULE_SEMANTIC_TAG_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_2_0= RULE_STRING ) )
            {
            this_SEMANTIC_TAG_KEYWORD_0=(Token)match(input,RULE_SEMANTIC_TAG_KEYWORD,FollowSets000.FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SEMANTIC_TAG_KEYWORD_0, grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDTerminalRuleCall_0());
              		
            }
            // InternalEcl.g:5032:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEcl.g:5033:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEcl.g:5033:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEcl.g:5034:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEcl.g:5051:3: ( (lv_semanticTag_2_0= RULE_STRING ) )
            // InternalEcl.g:5052:4: (lv_semanticTag_2_0= RULE_STRING )
            {
            // InternalEcl.g:5052:4: (lv_semanticTag_2_0= RULE_STRING )
            // InternalEcl.g:5053:5: lv_semanticTag_2_0= RULE_STRING
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
    // InternalEcl.g:5073:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEcl.g:5073:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEcl.g:5074:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
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
    // InternalEcl.g:5080:1: rulePreferredInFilter returns [EObject current=null] : (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_PREFERRED_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5086:2: ( (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:5087:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:5087:2: (this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:5088:3: this_PREFERRED_IN_KEYWORD_0= RULE_PREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_PREFERRED_IN_KEYWORD_0=(Token)match(input,RULE_PREFERRED_IN_KEYWORD,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PREFERRED_IN_KEYWORD_0, grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5096:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:5097:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:5097:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:5098:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:5119:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEcl.g:5119:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEcl.g:5120:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
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
    // InternalEcl.g:5126:1: ruleAcceptableInFilter returns [EObject current=null] : (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_ACCEPTABLE_IN_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5132:2: ( (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:5133:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:5133:2: (this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:5134:3: this_ACCEPTABLE_IN_KEYWORD_0= RULE_ACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_ACCEPTABLE_IN_KEYWORD_0=(Token)match(input,RULE_ACCEPTABLE_IN_KEYWORD,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ACCEPTABLE_IN_KEYWORD_0, grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5142:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:5143:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:5143:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:5144:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:5165:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEcl.g:5165:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEcl.g:5166:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
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
    // InternalEcl.g:5172:1: ruleLanguageRefSetFilter returns [EObject current=null] : (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_LANGUAGE_REFSET_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5178:2: ( (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:5179:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:5179:2: (this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:5180:3: this_LANGUAGE_REFSET_ID_KEYWORD_0= RULE_LANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            {
            this_LANGUAGE_REFSET_ID_KEYWORD_0=(Token)match(input,RULE_LANGUAGE_REFSET_ID_KEYWORD,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LANGUAGE_REFSET_ID_KEYWORD_0, grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5188:3: ( (lv_languageRefSetId_2_0= ruleFilterValue ) )
            // InternalEcl.g:5189:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:5189:4: (lv_languageRefSetId_2_0= ruleFilterValue )
            // InternalEcl.g:5190:5: lv_languageRefSetId_2_0= ruleFilterValue
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
    // InternalEcl.g:5211:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEcl.g:5211:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEcl.g:5212:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
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
    // InternalEcl.g:5218:1: ruleCaseSignificanceFilter returns [EObject current=null] : (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_CASE_SIGNIFICANCE_ID_KEYWORD_0=null;
        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5224:2: ( (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) ) )
            // InternalEcl.g:5225:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            {
            // InternalEcl.g:5225:2: (this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) ) )
            // InternalEcl.g:5226:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_0= RULE_CASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            {
            this_CASE_SIGNIFICANCE_ID_KEYWORD_0=(Token)match(input,RULE_CASE_SIGNIFICANCE_ID_KEYWORD,FollowSets000.FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CASE_SIGNIFICANCE_ID_KEYWORD_0, grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDTerminalRuleCall_0());
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5234:3: ( (lv_caseSignificanceId_2_0= ruleFilterValue ) )
            // InternalEcl.g:5235:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            {
            // InternalEcl.g:5235:4: (lv_caseSignificanceId_2_0= ruleFilterValue )
            // InternalEcl.g:5236:5: lv_caseSignificanceId_2_0= ruleFilterValue
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
    // InternalEcl.g:5257:1: entryRuleFilterValue returns [EObject current=null] : iv_ruleFilterValue= ruleFilterValue EOF ;
    public final EObject entryRuleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterValue = null;


        try {
            // InternalEcl.g:5257:52: (iv_ruleFilterValue= ruleFilterValue EOF )
            // InternalEcl.g:5258:2: iv_ruleFilterValue= ruleFilterValue EOF
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
    // InternalEcl.g:5264:1: ruleFilterValue returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) ;
    public final EObject ruleFilterValue() throws RecognitionException {
        EObject current = null;

        EObject this_FilteredExpressionConstraint_0 = null;

        EObject this_EclConceptReferenceSet_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:5270:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet ) )
            // InternalEcl.g:5271:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            {
            // InternalEcl.g:5271:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )
            int alt64=2;
            alt64 = dfa64.predict(input);
            switch (alt64) {
                case 1 :
                    // InternalEcl.g:5272:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
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
                    // InternalEcl.g:5284:3: this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet
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
    // InternalEcl.g:5299:1: entryRuleSupplement returns [EObject current=null] : iv_ruleSupplement= ruleSupplement EOF ;
    public final EObject entryRuleSupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSupplement = null;


        try {
            // InternalEcl.g:5299:51: (iv_ruleSupplement= ruleSupplement EOF )
            // InternalEcl.g:5300:2: iv_ruleSupplement= ruleSupplement EOF
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
    // InternalEcl.g:5306:1: ruleSupplement returns [EObject current=null] : this_HistorySupplement_0= ruleHistorySupplement ;
    public final EObject ruleSupplement() throws RecognitionException {
        EObject current = null;

        EObject this_HistorySupplement_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5312:2: (this_HistorySupplement_0= ruleHistorySupplement )
            // InternalEcl.g:5313:2: this_HistorySupplement_0= ruleHistorySupplement
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
    // InternalEcl.g:5327:1: entryRuleHistorySupplement returns [EObject current=null] : iv_ruleHistorySupplement= ruleHistorySupplement EOF ;
    public final EObject entryRuleHistorySupplement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistorySupplement = null;


        try {
            // InternalEcl.g:5327:58: (iv_ruleHistorySupplement= ruleHistorySupplement EOF )
            // InternalEcl.g:5328:2: iv_ruleHistorySupplement= ruleHistorySupplement EOF
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
    // InternalEcl.g:5334:1: ruleHistorySupplement returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) ;
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
            // InternalEcl.g:5340:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEcl.g:5341:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEcl.g:5341:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEcl.g:5342:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_PLUS_1= RULE_PLUS this_HISTORY_KEYWORD_2= RULE_HISTORY_KEYWORD () ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )? this_DOUBLE_CURLY_CLOSE_5= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getHistorySupplementAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            this_PLUS_1=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_PLUS_1, grammarAccess.getHistorySupplementAccess().getPLUSTerminalRuleCall_1());
              		
            }
            this_HISTORY_KEYWORD_2=(Token)match(input,RULE_HISTORY_KEYWORD,FollowSets000.FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HISTORY_KEYWORD_2, grammarAccess.getHistorySupplementAccess().getHISTORY_KEYWORDTerminalRuleCall_2());
              		
            }
            // InternalEcl.g:5354:3: ()
            // InternalEcl.g:5355:4: 
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

            // InternalEcl.g:5364:3: ( ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ROUND_OPEN||(LA66_0>=RULE_DASH && LA66_0<=RULE_UNDERSCORE)) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalEcl.g:5365:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    {
                    // InternalEcl.g:5365:4: ( (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression ) )
                    // InternalEcl.g:5366:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    {
                    // InternalEcl.g:5366:5: (lv_history_4_1= ruleHistoryProfile | lv_history_4_2= ruleNestedExpression )
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( ((LA65_0>=RULE_DASH && LA65_0<=RULE_UNDERSCORE)) ) {
                        alt65=1;
                    }
                    else if ( (LA65_0==RULE_ROUND_OPEN) ) {
                        alt65=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalEcl.g:5367:6: lv_history_4_1= ruleHistoryProfile
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryHistoryProfileParserRuleCall_4_0_0());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_31);
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
                            // InternalEcl.g:5383:6: lv_history_4_2= ruleNestedExpression
                            {
                            if ( state.backtracking==0 ) {

                              						newCompositeNode(grammarAccess.getHistorySupplementAccess().getHistoryNestedExpressionParserRuleCall_4_0_1());
                              					
                            }
                            pushFollow(FollowSets000.FOLLOW_31);
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
    // InternalEcl.g:5409:1: entryRuleHistoryProfile returns [EObject current=null] : iv_ruleHistoryProfile= ruleHistoryProfile EOF ;
    public final EObject entryRuleHistoryProfile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHistoryProfile = null;


        try {
            // InternalEcl.g:5409:55: (iv_ruleHistoryProfile= ruleHistoryProfile EOF )
            // InternalEcl.g:5410:2: iv_ruleHistoryProfile= ruleHistoryProfile EOF
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
    // InternalEcl.g:5416:1: ruleHistoryProfile returns [EObject current=null] : ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) ;
    public final EObject ruleHistoryProfile() throws RecognitionException {
        EObject current = null;

        Token this_DASH_0=null;
        Token this_UNDERSCORE_1=null;
        AntlrDatatypeRuleToken lv_profile_2_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5422:2: ( ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) ) )
            // InternalEcl.g:5423:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            {
            // InternalEcl.g:5423:2: ( (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) ) )
            // InternalEcl.g:5424:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE ) ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            {
            // InternalEcl.g:5424:3: (this_DASH_0= RULE_DASH | this_UNDERSCORE_1= RULE_UNDERSCORE )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_DASH) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_UNDERSCORE) ) {
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
                    // InternalEcl.g:5425:4: this_DASH_0= RULE_DASH
                    {
                    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DASH_0, grammarAccess.getHistoryProfileAccess().getDASHTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5430:4: this_UNDERSCORE_1= RULE_UNDERSCORE
                    {
                    this_UNDERSCORE_1=(Token)match(input,RULE_UNDERSCORE,FollowSets000.FOLLOW_52); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_UNDERSCORE_1, grammarAccess.getHistoryProfileAccess().getUNDERSCORETerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:5435:3: ( (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE ) )
            // InternalEcl.g:5436:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            {
            // InternalEcl.g:5436:4: (lv_profile_2_0= ruleHISTORY_PROFILE_TYPE )
            // InternalEcl.g:5437:5: lv_profile_2_0= ruleHISTORY_PROFILE_TYPE
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


    // $ANTLR start "entryRuleIdentifier"
    // InternalEcl.g:5458:1: entryRuleIdentifier returns [String current=null] : iv_ruleIdentifier= ruleIdentifier EOF ;
    public final String entryRuleIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5460:2: (iv_ruleIdentifier= ruleIdentifier EOF )
            // InternalEcl.g:5461:2: iv_ruleIdentifier= ruleIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleIdentifier=ruleIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIdentifier.getText(); 
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
    // $ANTLR end "entryRuleIdentifier"


    // $ANTLR start "ruleIdentifier"
    // InternalEcl.g:5470:1: ruleIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD ) (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )* ) ;
    public final AntlrDatatypeRuleToken ruleIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_ALPHA_1=null;
        Token this_CONCEPT_SHORT_KEYWORD_2=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_3=null;
        Token this_MEMBER_SHORT_KEYWORD_4=null;
        Token this_REVERSED_5=null;
        Token this_ID_KEYWORD_6=null;
        Token this_KEYWORD_7=null;
        Token this_DIGIT_8=null;
        Token this_ALPHA_9=null;
        Token this_CONCEPT_SHORT_KEYWORD_10=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_11=null;
        Token this_MEMBER_SHORT_KEYWORD_12=null;
        Token this_REVERSED_13=null;
        Token this_ID_KEYWORD_14=null;
        Token this_KEYWORD_15=null;
        Token this_DASH_16=null;
        Token this_UNDERSCORE_17=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5477:2: ( ( (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD ) (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )* ) )
            // InternalEcl.g:5478:2: ( (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD ) (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )* )
            {
            // InternalEcl.g:5478:2: ( (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD ) (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )* )
            // InternalEcl.g:5479:3: (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD ) (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )*
            {
            // InternalEcl.g:5479:3: (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD )
            int alt68=8;
            switch ( input.LA(1) ) {
            case RULE_DIGIT:
                {
                alt68=1;
                }
                break;
            case RULE_ALPHA:
                {
                alt68=2;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt68=3;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt68=4;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt68=5;
                }
                break;
            case RULE_REVERSED:
                {
                alt68=6;
                }
                break;
            case RULE_ID_KEYWORD:
                {
                alt68=7;
                }
                break;
            case RULE_KEYWORD:
                {
                alt68=8;
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
                    // InternalEcl.g:5480:4: this_DIGIT_0= RULE_DIGIT
                    {
                    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_0, grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5488:4: this_ALPHA_1= RULE_ALPHA
                    {
                    this_ALPHA_1=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ALPHA_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ALPHA_1, grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5496:4: this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_2=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CONCEPT_SHORT_KEYWORD_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CONCEPT_SHORT_KEYWORD_2, grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:5504:4: this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_3=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DESCRIPTION_SHORT_KEYWORD_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_3, grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:5512:4: this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD
                    {
                    this_MEMBER_SHORT_KEYWORD_4=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MEMBER_SHORT_KEYWORD_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MEMBER_SHORT_KEYWORD_4, grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:5520:4: this_REVERSED_5= RULE_REVERSED
                    {
                    this_REVERSED_5=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_REVERSED_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_REVERSED_5, grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_0_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:5528:4: this_ID_KEYWORD_6= RULE_ID_KEYWORD
                    {
                    this_ID_KEYWORD_6=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_KEYWORD_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_KEYWORD_6, grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_0_6());
                      			
                    }

                    }
                    break;
                case 8 :
                    // InternalEcl.g:5536:4: this_KEYWORD_7= RULE_KEYWORD
                    {
                    this_KEYWORD_7=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_KEYWORD_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_KEYWORD_7, grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_0_7());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:5544:3: (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )*
            loop69:
            do {
                int alt69=11;
                alt69 = dfa69.predict(input);
                switch (alt69) {
            	case 1 :
            	    // InternalEcl.g:5545:4: this_DIGIT_8= RULE_DIGIT
            	    {
            	    this_DIGIT_8=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_8);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_8, grammarAccess.getIdentifierAccess().getDIGITTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5553:4: this_ALPHA_9= RULE_ALPHA
            	    {
            	    this_ALPHA_9=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ALPHA_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ALPHA_9, grammarAccess.getIdentifierAccess().getALPHATerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEcl.g:5561:4: this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD
            	    {
            	    this_CONCEPT_SHORT_KEYWORD_10=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_CONCEPT_SHORT_KEYWORD_10);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_CONCEPT_SHORT_KEYWORD_10, grammarAccess.getIdentifierAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEcl.g:5569:4: this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD
            	    {
            	    this_DESCRIPTION_SHORT_KEYWORD_11=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DESCRIPTION_SHORT_KEYWORD_11);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_11, grammarAccess.getIdentifierAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3());
            	      			
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalEcl.g:5577:4: this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD
            	    {
            	    this_MEMBER_SHORT_KEYWORD_12=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_MEMBER_SHORT_KEYWORD_12);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_MEMBER_SHORT_KEYWORD_12, grammarAccess.getIdentifierAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4());
            	      			
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalEcl.g:5585:4: this_REVERSED_13= RULE_REVERSED
            	    {
            	    this_REVERSED_13=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_REVERSED_13);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_REVERSED_13, grammarAccess.getIdentifierAccess().getREVERSEDTerminalRuleCall_1_5());
            	      			
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalEcl.g:5593:4: this_ID_KEYWORD_14= RULE_ID_KEYWORD
            	    {
            	    this_ID_KEYWORD_14=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_KEYWORD_14);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_KEYWORD_14, grammarAccess.getIdentifierAccess().getID_KEYWORDTerminalRuleCall_1_6());
            	      			
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalEcl.g:5601:4: this_KEYWORD_15= RULE_KEYWORD
            	    {
            	    this_KEYWORD_15=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_KEYWORD_15);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_KEYWORD_15, grammarAccess.getIdentifierAccess().getKEYWORDTerminalRuleCall_1_7());
            	      			
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalEcl.g:5609:4: this_DASH_16= RULE_DASH
            	    {
            	    this_DASH_16=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DASH_16);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DASH_16, grammarAccess.getIdentifierAccess().getDASHTerminalRuleCall_1_8());
            	      			
            	    }

            	    }
            	    break;
            	case 10 :
            	    // InternalEcl.g:5617:4: this_UNDERSCORE_17= RULE_UNDERSCORE
            	    {
            	    this_UNDERSCORE_17=(Token)match(input,RULE_UNDERSCORE,FollowSets000.FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_UNDERSCORE_17);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_UNDERSCORE_17, grammarAccess.getIdentifierAccess().getUNDERSCORETerminalRuleCall_1_9());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
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
    // $ANTLR end "ruleIdentifier"


    // $ANTLR start "entryRuleAlternateScheme"
    // InternalEcl.g:5632:1: entryRuleAlternateScheme returns [String current=null] : iv_ruleAlternateScheme= ruleAlternateScheme EOF ;
    public final String entryRuleAlternateScheme() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternateScheme = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5634:2: (iv_ruleAlternateScheme= ruleAlternateScheme EOF )
            // InternalEcl.g:5635:2: iv_ruleAlternateScheme= ruleAlternateScheme EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternateSchemeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlternateScheme=ruleAlternateScheme();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternateScheme.getText(); 
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
    // $ANTLR end "entryRuleAlternateScheme"


    // $ANTLR start "ruleAlternateScheme"
    // InternalEcl.g:5644:1: ruleAlternateScheme returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD ) (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )* ) ;
    public final AntlrDatatypeRuleToken ruleAlternateScheme() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token this_CONCEPT_SHORT_KEYWORD_1=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_2=null;
        Token this_MEMBER_SHORT_KEYWORD_3=null;
        Token this_REVERSED_4=null;
        Token this_ID_KEYWORD_5=null;
        Token this_KEYWORD_6=null;
        Token this_DIGIT_7=null;
        Token this_ALPHA_8=null;
        Token this_CONCEPT_SHORT_KEYWORD_9=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_10=null;
        Token this_MEMBER_SHORT_KEYWORD_11=null;
        Token this_REVERSED_12=null;
        Token this_ID_KEYWORD_13=null;
        Token this_KEYWORD_14=null;
        Token this_DASH_15=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5651:2: ( ( (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD ) (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )* ) )
            // InternalEcl.g:5652:2: ( (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD ) (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )* )
            {
            // InternalEcl.g:5652:2: ( (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD ) (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )* )
            // InternalEcl.g:5653:3: (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD ) (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )*
            {
            // InternalEcl.g:5653:3: (this_ALPHA_0= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_4= RULE_REVERSED | this_ID_KEYWORD_5= RULE_ID_KEYWORD | this_KEYWORD_6= RULE_KEYWORD )
            int alt70=7;
            switch ( input.LA(1) ) {
            case RULE_ALPHA:
                {
                alt70=1;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt70=2;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt70=3;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt70=4;
                }
                break;
            case RULE_REVERSED:
                {
                alt70=5;
                }
                break;
            case RULE_ID_KEYWORD:
                {
                alt70=6;
                }
                break;
            case RULE_KEYWORD:
                {
                alt70=7;
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
                    // InternalEcl.g:5654:4: this_ALPHA_0= RULE_ALPHA
                    {
                    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ALPHA_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ALPHA_0, grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:5662:4: this_CONCEPT_SHORT_KEYWORD_1= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_1=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_CONCEPT_SHORT_KEYWORD_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_CONCEPT_SHORT_KEYWORD_1, grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;
                case 3 :
                    // InternalEcl.g:5670:4: this_DESCRIPTION_SHORT_KEYWORD_2= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_2=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DESCRIPTION_SHORT_KEYWORD_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_2, grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_0_2());
                      			
                    }

                    }
                    break;
                case 4 :
                    // InternalEcl.g:5678:4: this_MEMBER_SHORT_KEYWORD_3= RULE_MEMBER_SHORT_KEYWORD
                    {
                    this_MEMBER_SHORT_KEYWORD_3=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_MEMBER_SHORT_KEYWORD_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_MEMBER_SHORT_KEYWORD_3, grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_0_3());
                      			
                    }

                    }
                    break;
                case 5 :
                    // InternalEcl.g:5686:4: this_REVERSED_4= RULE_REVERSED
                    {
                    this_REVERSED_4=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_REVERSED_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_REVERSED_4, grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_0_4());
                      			
                    }

                    }
                    break;
                case 6 :
                    // InternalEcl.g:5694:4: this_ID_KEYWORD_5= RULE_ID_KEYWORD
                    {
                    this_ID_KEYWORD_5=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ID_KEYWORD_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ID_KEYWORD_5, grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_0_5());
                      			
                    }

                    }
                    break;
                case 7 :
                    // InternalEcl.g:5702:4: this_KEYWORD_6= RULE_KEYWORD
                    {
                    this_KEYWORD_6=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_KEYWORD_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_KEYWORD_6, grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_0_6());
                      			
                    }

                    }
                    break;

            }

            // InternalEcl.g:5710:3: (this_DIGIT_7= RULE_DIGIT | this_ALPHA_8= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_12= RULE_REVERSED | this_ID_KEYWORD_13= RULE_ID_KEYWORD | this_KEYWORD_14= RULE_KEYWORD | this_DASH_15= RULE_DASH )*
            loop71:
            do {
                int alt71=10;
                switch ( input.LA(1) ) {
                case RULE_DIGIT:
                    {
                    alt71=1;
                    }
                    break;
                case RULE_ALPHA:
                    {
                    alt71=2;
                    }
                    break;
                case RULE_CONCEPT_SHORT_KEYWORD:
                    {
                    alt71=3;
                    }
                    break;
                case RULE_DESCRIPTION_SHORT_KEYWORD:
                    {
                    alt71=4;
                    }
                    break;
                case RULE_MEMBER_SHORT_KEYWORD:
                    {
                    alt71=5;
                    }
                    break;
                case RULE_REVERSED:
                    {
                    alt71=6;
                    }
                    break;
                case RULE_ID_KEYWORD:
                    {
                    alt71=7;
                    }
                    break;
                case RULE_KEYWORD:
                    {
                    alt71=8;
                    }
                    break;
                case RULE_DASH:
                    {
                    alt71=9;
                    }
                    break;

                }

                switch (alt71) {
            	case 1 :
            	    // InternalEcl.g:5711:4: this_DIGIT_7= RULE_DIGIT
            	    {
            	    this_DIGIT_7=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_7);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_7, grammarAccess.getAlternateSchemeAccess().getDIGITTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5719:4: this_ALPHA_8= RULE_ALPHA
            	    {
            	    this_ALPHA_8=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ALPHA_8);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ALPHA_8, grammarAccess.getAlternateSchemeAccess().getALPHATerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEcl.g:5727:4: this_CONCEPT_SHORT_KEYWORD_9= RULE_CONCEPT_SHORT_KEYWORD
            	    {
            	    this_CONCEPT_SHORT_KEYWORD_9=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_CONCEPT_SHORT_KEYWORD_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_CONCEPT_SHORT_KEYWORD_9, grammarAccess.getAlternateSchemeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEcl.g:5735:4: this_DESCRIPTION_SHORT_KEYWORD_10= RULE_DESCRIPTION_SHORT_KEYWORD
            	    {
            	    this_DESCRIPTION_SHORT_KEYWORD_10=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DESCRIPTION_SHORT_KEYWORD_10);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_10, grammarAccess.getAlternateSchemeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_1_3());
            	      			
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalEcl.g:5743:4: this_MEMBER_SHORT_KEYWORD_11= RULE_MEMBER_SHORT_KEYWORD
            	    {
            	    this_MEMBER_SHORT_KEYWORD_11=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_MEMBER_SHORT_KEYWORD_11);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_MEMBER_SHORT_KEYWORD_11, grammarAccess.getAlternateSchemeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_1_4());
            	      			
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalEcl.g:5751:4: this_REVERSED_12= RULE_REVERSED
            	    {
            	    this_REVERSED_12=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_REVERSED_12);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_REVERSED_12, grammarAccess.getAlternateSchemeAccess().getREVERSEDTerminalRuleCall_1_5());
            	      			
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalEcl.g:5759:4: this_ID_KEYWORD_13= RULE_ID_KEYWORD
            	    {
            	    this_ID_KEYWORD_13=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_KEYWORD_13);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_KEYWORD_13, grammarAccess.getAlternateSchemeAccess().getID_KEYWORDTerminalRuleCall_1_6());
            	      			
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalEcl.g:5767:4: this_KEYWORD_14= RULE_KEYWORD
            	    {
            	    this_KEYWORD_14=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_KEYWORD_14);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_KEYWORD_14, grammarAccess.getAlternateSchemeAccess().getKEYWORDTerminalRuleCall_1_7());
            	      			
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalEcl.g:5775:4: this_DASH_15= RULE_DASH
            	    {
            	    this_DASH_15=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_54); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DASH_15);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DASH_15, grammarAccess.getAlternateSchemeAccess().getDASHTerminalRuleCall_1_8());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
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
    // $ANTLR end "ruleAlternateScheme"


    // $ANTLR start "entryRuleAlternateCode"
    // InternalEcl.g:5790:1: entryRuleAlternateCode returns [String current=null] : iv_ruleAlternateCode= ruleAlternateCode EOF ;
    public final String entryRuleAlternateCode() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlternateCode = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5792:2: (iv_ruleAlternateCode= ruleAlternateCode EOF )
            // InternalEcl.g:5793:2: iv_ruleAlternateCode= ruleAlternateCode EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlternateCodeRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlternateCode=ruleAlternateCode();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlternateCode.getText(); 
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
    // $ANTLR end "entryRuleAlternateCode"


    // $ANTLR start "ruleAlternateCode"
    // InternalEcl.g:5802:1: ruleAlternateCode returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD | this_DOT_8= RULE_DOT | this_DASH_9= RULE_DASH )+ ;
    public final AntlrDatatypeRuleToken ruleAlternateCode() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;
        Token this_ALPHA_1=null;
        Token this_CONCEPT_SHORT_KEYWORD_2=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_3=null;
        Token this_MEMBER_SHORT_KEYWORD_4=null;
        Token this_REVERSED_5=null;
        Token this_ID_KEYWORD_6=null;
        Token this_KEYWORD_7=null;
        Token this_DOT_8=null;
        Token this_DASH_9=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5809:2: ( (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD | this_DOT_8= RULE_DOT | this_DASH_9= RULE_DASH )+ )
            // InternalEcl.g:5810:2: (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD | this_DOT_8= RULE_DOT | this_DASH_9= RULE_DASH )+
            {
            // InternalEcl.g:5810:2: (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD | this_DOT_8= RULE_DOT | this_DASH_9= RULE_DASH )+
            int cnt72=0;
            loop72:
            do {
                int alt72=11;
                alt72 = dfa72.predict(input);
                switch (alt72) {
            	case 1 :
            	    // InternalEcl.g:5811:3: this_DIGIT_0= RULE_DIGIT
            	    {
            	    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_0, grammarAccess.getAlternateCodeAccess().getDIGITTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:5819:3: this_ALPHA_1= RULE_ALPHA
            	    {
            	    this_ALPHA_1=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ALPHA_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ALPHA_1, grammarAccess.getAlternateCodeAccess().getALPHATerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEcl.g:5827:3: this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD
            	    {
            	    this_CONCEPT_SHORT_KEYWORD_2=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_CONCEPT_SHORT_KEYWORD_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_2, grammarAccess.getAlternateCodeAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEcl.g:5835:3: this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD
            	    {
            	    this_DESCRIPTION_SHORT_KEYWORD_3=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_3);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_3, grammarAccess.getAlternateCodeAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_3());
            	      		
            	    }

            	    }
            	    break;
            	case 5 :
            	    // InternalEcl.g:5843:3: this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD
            	    {
            	    this_MEMBER_SHORT_KEYWORD_4=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_MEMBER_SHORT_KEYWORD_4);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_MEMBER_SHORT_KEYWORD_4, grammarAccess.getAlternateCodeAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_4());
            	      		
            	    }

            	    }
            	    break;
            	case 6 :
            	    // InternalEcl.g:5851:3: this_REVERSED_5= RULE_REVERSED
            	    {
            	    this_REVERSED_5=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_REVERSED_5);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_REVERSED_5, grammarAccess.getAlternateCodeAccess().getREVERSEDTerminalRuleCall_5());
            	      		
            	    }

            	    }
            	    break;
            	case 7 :
            	    // InternalEcl.g:5859:3: this_ID_KEYWORD_6= RULE_ID_KEYWORD
            	    {
            	    this_ID_KEYWORD_6=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ID_KEYWORD_6);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ID_KEYWORD_6, grammarAccess.getAlternateCodeAccess().getID_KEYWORDTerminalRuleCall_6());
            	      		
            	    }

            	    }
            	    break;
            	case 8 :
            	    // InternalEcl.g:5867:3: this_KEYWORD_7= RULE_KEYWORD
            	    {
            	    this_KEYWORD_7=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_KEYWORD_7);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_KEYWORD_7, grammarAccess.getAlternateCodeAccess().getKEYWORDTerminalRuleCall_7());
            	      		
            	    }

            	    }
            	    break;
            	case 9 :
            	    // InternalEcl.g:5875:3: this_DOT_8= RULE_DOT
            	    {
            	    this_DOT_8=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DOT_8);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DOT_8, grammarAccess.getAlternateCodeAccess().getDOTTerminalRuleCall_8());
            	      		
            	    }

            	    }
            	    break;
            	case 10 :
            	    // InternalEcl.g:5883:3: this_DASH_9= RULE_DASH
            	    {
            	    this_DASH_9=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_55); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DASH_9);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DASH_9, grammarAccess.getAlternateCodeAccess().getDASHTerminalRuleCall_9());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt72 >= 1 ) break loop72;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(72, input);
                        throw eee;
                }
                cnt72++;
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
    // $ANTLR end "ruleAlternateCode"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalEcl.g:5897:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5899:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEcl.g:5900:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
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
    // InternalEcl.g:5909:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_0= RULE_DIGIT )+ ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5916:2: ( (this_DIGIT_0= RULE_DIGIT )+ )
            // InternalEcl.g:5917:2: (this_DIGIT_0= RULE_DIGIT )+
            {
            // InternalEcl.g:5917:2: (this_DIGIT_0= RULE_DIGIT )+
            int cnt73=0;
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_DIGIT) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalEcl.g:5918:3: this_DIGIT_0= RULE_DIGIT
            	    {
            	    this_DIGIT_0=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_0, grammarAccess.getNonNegativeIntegerAccess().getDIGITTerminalRuleCall());
            	      		
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
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalEcl.g:5932:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5934:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEcl.g:5935:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
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
    // InternalEcl.g:5944:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_2= RULE_DIGIT )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_2=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:5951:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_2= RULE_DIGIT )* ) )
            // InternalEcl.g:5952:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_2= RULE_DIGIT )* )
            {
            // InternalEcl.g:5952:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_2= RULE_DIGIT )* )
            // InternalEcl.g:5953:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_2= RULE_DIGIT )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_57);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEcl.g:5970:3: (this_DIGIT_2= RULE_DIGIT )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_DIGIT) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalEcl.g:5971:4: this_DIGIT_2= RULE_DIGIT
            	    {
            	    this_DIGIT_2=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_56); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_2, grammarAccess.getNonNegativeDecimalAccess().getDIGITTerminalRuleCall_2());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
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
    // InternalEcl.g:5986:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;


        try {
            // InternalEcl.g:5986:48: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEcl.g:5987:2: iv_ruleMaxValue= ruleMaxValue EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalEcl.g:5993:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();

        try {
            // InternalEcl.g:5999:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEcl.g:6000:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEcl.g:6000:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==RULE_DIGIT) ) {
                alt75=1;
            }
            else if ( (LA75_0==RULE_WILDCARD) ) {
                alt75=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }
            switch (alt75) {
                case 1 :
                    // InternalEcl.g:6001:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEcl.g:6012:3: this_WILDCARD_1= RULE_WILDCARD
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
        }
        return current;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleInteger"
    // InternalEcl.g:6023:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6025:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEcl.g:6026:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalEcl.g:6035:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6042:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEcl.g:6043:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEcl.g:6043:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEcl.g:6044:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEcl.g:6044:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt76=3;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_PLUS) ) {
                alt76=1;
            }
            else if ( (LA76_0==RULE_DASH) ) {
                alt76=2;
            }
            switch (alt76) {
                case 1 :
                    // InternalEcl.g:6045:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_23); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:6053:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_23); if (state.failed) return current;
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
    // InternalEcl.g:6078:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6080:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEcl.g:6081:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalEcl.g:6090:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6097:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEcl.g:6098:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEcl.g:6098:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEcl.g:6099:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEcl.g:6099:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt77=3;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_PLUS) ) {
                alt77=1;
            }
            else if ( (LA77_0==RULE_DASH) ) {
                alt77=2;
            }
            switch (alt77) {
                case 1 :
                    // InternalEcl.g:6100:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_29); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEcl.g:6108:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_29); if (state.failed) return current;
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
    // InternalEcl.g:6133:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;


        try {
            // InternalEcl.g:6133:47: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEcl.g:6134:2: iv_ruleBoolean= ruleBoolean EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEcl.g:6140:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_TRUE_KEYWORD_0=null;
        Token this_FALSE_KEYWORD_1=null;


        	enterRule();

        try {
            // InternalEcl.g:6146:2: ( (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD ) )
            // InternalEcl.g:6147:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            {
            // InternalEcl.g:6147:2: (this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD | this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==RULE_TRUE_KEYWORD) ) {
                alt78=1;
            }
            else if ( (LA78_0==RULE_FALSE_KEYWORD) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalEcl.g:6148:3: this_TRUE_KEYWORD_0= RULE_TRUE_KEYWORD
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
                    // InternalEcl.g:6156:3: this_FALSE_KEYWORD_1= RULE_FALSE_KEYWORD
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
        }
        return current;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "entryRuleActiveBoolean"
    // InternalEcl.g:6167:1: entryRuleActiveBoolean returns [String current=null] : iv_ruleActiveBoolean= ruleActiveBoolean EOF ;
    public final String entryRuleActiveBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleActiveBoolean = null;


        try {
            // InternalEcl.g:6167:53: (iv_ruleActiveBoolean= ruleActiveBoolean EOF )
            // InternalEcl.g:6168:2: iv_ruleActiveBoolean= ruleActiveBoolean EOF
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
        }
        return current;
    }
    // $ANTLR end "entryRuleActiveBoolean"


    // $ANTLR start "ruleActiveBoolean"
    // InternalEcl.g:6174:1: ruleActiveBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) ;
    public final AntlrDatatypeRuleToken ruleActiveBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;

        AntlrDatatypeRuleToken this_Boolean_1 = null;



        	enterRule();

        try {
            // InternalEcl.g:6180:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean ) )
            // InternalEcl.g:6181:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            {
            // InternalEcl.g:6181:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_Boolean_1= ruleBoolean )
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==RULE_DIGIT) ) {
                alt79=1;
            }
            else if ( ((LA79_0>=RULE_TRUE_KEYWORD && LA79_0<=RULE_FALSE_KEYWORD)) ) {
                alt79=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }
            switch (alt79) {
                case 1 :
                    // InternalEcl.g:6182:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEcl.g:6193:3: this_Boolean_1= ruleBoolean
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
        }
        return current;
    }
    // $ANTLR end "ruleActiveBoolean"


    // $ANTLR start "entryRuleUnquotedString"
    // InternalEcl.g:6207:1: entryRuleUnquotedString returns [String current=null] : iv_ruleUnquotedString= ruleUnquotedString EOF ;
    public final String entryRuleUnquotedString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleUnquotedString = null;


        try {
            // InternalEcl.g:6207:54: (iv_ruleUnquotedString= ruleUnquotedString EOF )
            // InternalEcl.g:6208:2: iv_ruleUnquotedString= ruleUnquotedString EOF
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
    // InternalEcl.g:6214:1: ruleUnquotedString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_ID_KEYWORD_29= RULE_ID_KEYWORD | this_REVERSED_30= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_31= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_32= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_33= RULE_CONCEPT_SHORT_KEYWORD | this_WILDCARD_34= RULE_WILDCARD | this_KEYWORD_35= RULE_KEYWORD ) ;
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
        Token this_ID_KEYWORD_29=null;
        Token this_REVERSED_30=null;
        Token this_MEMBER_SHORT_KEYWORD_31=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_32=null;
        Token this_CONCEPT_SHORT_KEYWORD_33=null;
        Token this_WILDCARD_34=null;
        Token this_KEYWORD_35=null;


        	enterRule();

        try {
            // InternalEcl.g:6220:2: ( (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_ID_KEYWORD_29= RULE_ID_KEYWORD | this_REVERSED_30= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_31= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_32= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_33= RULE_CONCEPT_SHORT_KEYWORD | this_WILDCARD_34= RULE_WILDCARD | this_KEYWORD_35= RULE_KEYWORD ) )
            // InternalEcl.g:6221:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_ID_KEYWORD_29= RULE_ID_KEYWORD | this_REVERSED_30= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_31= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_32= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_33= RULE_CONCEPT_SHORT_KEYWORD | this_WILDCARD_34= RULE_WILDCARD | this_KEYWORD_35= RULE_KEYWORD )
            {
            // InternalEcl.g:6221:2: (this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD | this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD | this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD | this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD | this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD | this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD | this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD | this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD | this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD | this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD | this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD | this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD | this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD | this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD | this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD | this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD | this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD | this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD | this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD | this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD | this_TERM_KEYWORD_20= RULE_TERM_KEYWORD | this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD | this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD | this_WILD_KEYWORD_23= RULE_WILD_KEYWORD | this_MIN_KEYWORD_24= RULE_MIN_KEYWORD | this_MOD_KEYWORD_25= RULE_MOD_KEYWORD | this_MAX_KEYWORD_26= RULE_MAX_KEYWORD | this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD | this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD | this_ID_KEYWORD_29= RULE_ID_KEYWORD | this_REVERSED_30= RULE_REVERSED | this_MEMBER_SHORT_KEYWORD_31= RULE_MEMBER_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_32= RULE_DESCRIPTION_SHORT_KEYWORD | this_CONCEPT_SHORT_KEYWORD_33= RULE_CONCEPT_SHORT_KEYWORD | this_WILDCARD_34= RULE_WILDCARD | this_KEYWORD_35= RULE_KEYWORD )
            int alt80=36;
            switch ( input.LA(1) ) {
            case RULE_HISTORY_KEYWORD:
                {
                alt80=1;
                }
                break;
            case RULE_CASE_SIGNIFICANCE_ID_KEYWORD:
                {
                alt80=2;
                }
                break;
            case RULE_DEFINITION_STATUS_ID_KEYWORD:
                {
                alt80=3;
                }
                break;
            case RULE_DEFINITION_STATUS_TOKEN_KEYWORD:
                {
                alt80=4;
                }
                break;
            case RULE_LANGUAGE_REFSET_ID_KEYWORD:
                {
                alt80=5;
                }
                break;
            case RULE_EFFECTIVE_TIME_KEYWORD:
                {
                alt80=6;
                }
                break;
            case RULE_ACCEPTABLE_IN_KEYWORD:
                {
                alt80=7;
                }
                break;
            case RULE_PREFERRED_IN_KEYWORD:
                {
                alt80=8;
                }
                break;
            case RULE_SEMANTIC_TAG_KEYWORD:
                {
                alt80=9;
                }
                break;
            case RULE_DIALECTID_KEYWORD:
                {
                alt80=10;
                }
                break;
            case RULE_LANGUAGE_KEYWORD:
                {
                alt80=11;
                }
                break;
            case RULE_MODULEID_KEYWORD:
                {
                alt80=12;
                }
                break;
            case RULE_DIALECT_KEYWORD:
                {
                alt80=13;
                }
                break;
            case RULE_ACTIVE_KEYWORD:
                {
                alt80=14;
                }
                break;
            case RULE_TYPEID_KEYWORD:
                {
                alt80=15;
                }
                break;
            case RULE_EXCLUSION_KEYWORD:
                {
                alt80=16;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt80=17;
                }
                break;
            case RULE_FALSE_KEYWORD:
                {
                alt80=18;
                }
                break;
            case RULE_MATCH_KEYWORD:
                {
                alt80=19;
                }
                break;
            case RULE_REGEX_KEYWORD:
                {
                alt80=20;
                }
                break;
            case RULE_TERM_KEYWORD:
                {
                alt80=21;
                }
                break;
            case RULE_TRUE_KEYWORD:
                {
                alt80=22;
                }
                break;
            case RULE_TYPE_KEYWORD:
                {
                alt80=23;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt80=24;
                }
                break;
            case RULE_MIN_KEYWORD:
                {
                alt80=25;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt80=26;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt80=27;
                }
                break;
            case RULE_CONJUNCTION_KEYWORD:
                {
                alt80=28;
                }
                break;
            case RULE_DISJUNCTION_KEYWORD:
                {
                alt80=29;
                }
                break;
            case RULE_ID_KEYWORD:
                {
                alt80=30;
                }
                break;
            case RULE_REVERSED:
                {
                alt80=31;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt80=32;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt80=33;
                }
                break;
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt80=34;
                }
                break;
            case RULE_WILDCARD:
                {
                alt80=35;
                }
                break;
            case RULE_KEYWORD:
                {
                alt80=36;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 80, 0, input);

                throw nvae;
            }

            switch (alt80) {
                case 1 :
                    // InternalEcl.g:6222:3: this_HISTORY_KEYWORD_0= RULE_HISTORY_KEYWORD
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
                    // InternalEcl.g:6230:3: this_CASE_SIGNIFICANCE_ID_KEYWORD_1= RULE_CASE_SIGNIFICANCE_ID_KEYWORD
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
                    // InternalEcl.g:6238:3: this_DEFINITION_STATUS_ID_KEYWORD_2= RULE_DEFINITION_STATUS_ID_KEYWORD
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
                    // InternalEcl.g:6246:3: this_DEFINITION_STATUS_TOKEN_KEYWORD_3= RULE_DEFINITION_STATUS_TOKEN_KEYWORD
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
                    // InternalEcl.g:6254:3: this_LANGUAGE_REFSET_ID_KEYWORD_4= RULE_LANGUAGE_REFSET_ID_KEYWORD
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
                    // InternalEcl.g:6262:3: this_EFFECTIVE_TIME_KEYWORD_5= RULE_EFFECTIVE_TIME_KEYWORD
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
                    // InternalEcl.g:6270:3: this_ACCEPTABLE_IN_KEYWORD_6= RULE_ACCEPTABLE_IN_KEYWORD
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
                    // InternalEcl.g:6278:3: this_PREFERRED_IN_KEYWORD_7= RULE_PREFERRED_IN_KEYWORD
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
                    // InternalEcl.g:6286:3: this_SEMANTIC_TAG_KEYWORD_8= RULE_SEMANTIC_TAG_KEYWORD
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
                    // InternalEcl.g:6294:3: this_DIALECTID_KEYWORD_9= RULE_DIALECTID_KEYWORD
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
                    // InternalEcl.g:6302:3: this_LANGUAGE_KEYWORD_10= RULE_LANGUAGE_KEYWORD
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
                    // InternalEcl.g:6310:3: this_MODULEID_KEYWORD_11= RULE_MODULEID_KEYWORD
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
                    // InternalEcl.g:6318:3: this_DIALECT_KEYWORD_12= RULE_DIALECT_KEYWORD
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
                    // InternalEcl.g:6326:3: this_ACTIVE_KEYWORD_13= RULE_ACTIVE_KEYWORD
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
                    // InternalEcl.g:6334:3: this_TYPEID_KEYWORD_14= RULE_TYPEID_KEYWORD
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
                    // InternalEcl.g:6342:3: this_EXCLUSION_KEYWORD_15= RULE_EXCLUSION_KEYWORD
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
                    // InternalEcl.g:6350:3: this_EXACT_KEYWORD_16= RULE_EXACT_KEYWORD
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
                    // InternalEcl.g:6358:3: this_FALSE_KEYWORD_17= RULE_FALSE_KEYWORD
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
                    // InternalEcl.g:6366:3: this_MATCH_KEYWORD_18= RULE_MATCH_KEYWORD
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
                    // InternalEcl.g:6374:3: this_REGEX_KEYWORD_19= RULE_REGEX_KEYWORD
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
                    // InternalEcl.g:6382:3: this_TERM_KEYWORD_20= RULE_TERM_KEYWORD
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
                    // InternalEcl.g:6390:3: this_TRUE_KEYWORD_21= RULE_TRUE_KEYWORD
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
                    // InternalEcl.g:6398:3: this_TYPE_KEYWORD_22= RULE_TYPE_KEYWORD
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
                    // InternalEcl.g:6406:3: this_WILD_KEYWORD_23= RULE_WILD_KEYWORD
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
                    // InternalEcl.g:6414:3: this_MIN_KEYWORD_24= RULE_MIN_KEYWORD
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
                    // InternalEcl.g:6422:3: this_MOD_KEYWORD_25= RULE_MOD_KEYWORD
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
                    // InternalEcl.g:6430:3: this_MAX_KEYWORD_26= RULE_MAX_KEYWORD
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
                    // InternalEcl.g:6438:3: this_CONJUNCTION_KEYWORD_27= RULE_CONJUNCTION_KEYWORD
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
                    // InternalEcl.g:6446:3: this_DISJUNCTION_KEYWORD_28= RULE_DISJUNCTION_KEYWORD
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
                    // InternalEcl.g:6454:3: this_ID_KEYWORD_29= RULE_ID_KEYWORD
                    {
                    this_ID_KEYWORD_29=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ID_KEYWORD_29);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ID_KEYWORD_29, grammarAccess.getUnquotedStringAccess().getID_KEYWORDTerminalRuleCall_29());
                      		
                    }

                    }
                    break;
                case 31 :
                    // InternalEcl.g:6462:3: this_REVERSED_30= RULE_REVERSED
                    {
                    this_REVERSED_30=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_REVERSED_30);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_REVERSED_30, grammarAccess.getUnquotedStringAccess().getREVERSEDTerminalRuleCall_30());
                      		
                    }

                    }
                    break;
                case 32 :
                    // InternalEcl.g:6470:3: this_MEMBER_SHORT_KEYWORD_31= RULE_MEMBER_SHORT_KEYWORD
                    {
                    this_MEMBER_SHORT_KEYWORD_31=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_MEMBER_SHORT_KEYWORD_31);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_MEMBER_SHORT_KEYWORD_31, grammarAccess.getUnquotedStringAccess().getMEMBER_SHORT_KEYWORDTerminalRuleCall_31());
                      		
                    }

                    }
                    break;
                case 33 :
                    // InternalEcl.g:6478:3: this_DESCRIPTION_SHORT_KEYWORD_32= RULE_DESCRIPTION_SHORT_KEYWORD
                    {
                    this_DESCRIPTION_SHORT_KEYWORD_32=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_DESCRIPTION_SHORT_KEYWORD_32);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_DESCRIPTION_SHORT_KEYWORD_32, grammarAccess.getUnquotedStringAccess().getDESCRIPTION_SHORT_KEYWORDTerminalRuleCall_32());
                      		
                    }

                    }
                    break;
                case 34 :
                    // InternalEcl.g:6486:3: this_CONCEPT_SHORT_KEYWORD_33= RULE_CONCEPT_SHORT_KEYWORD
                    {
                    this_CONCEPT_SHORT_KEYWORD_33=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_CONCEPT_SHORT_KEYWORD_33);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_CONCEPT_SHORT_KEYWORD_33, grammarAccess.getUnquotedStringAccess().getCONCEPT_SHORT_KEYWORDTerminalRuleCall_33());
                      		
                    }

                    }
                    break;
                case 35 :
                    // InternalEcl.g:6494:3: this_WILDCARD_34= RULE_WILDCARD
                    {
                    this_WILDCARD_34=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_WILDCARD_34);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_WILDCARD_34, grammarAccess.getUnquotedStringAccess().getWILDCARDTerminalRuleCall_34());
                      		
                    }

                    }
                    break;
                case 36 :
                    // InternalEcl.g:6502:3: this_KEYWORD_35= RULE_KEYWORD
                    {
                    this_KEYWORD_35=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_KEYWORD_35);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_KEYWORD_35, grammarAccess.getUnquotedStringAccess().getKEYWORDTerminalRuleCall_35());
                      		
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
    // InternalEcl.g:6513:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6515:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEcl.g:6516:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
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
    // InternalEcl.g:6525:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DASH_0= RULE_DASH | this_KEYWORD_1= RULE_KEYWORD | this_DIGIT_2= RULE_DIGIT )+ ;
    public final AntlrDatatypeRuleToken ruleDialectAliasValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DASH_0=null;
        Token this_KEYWORD_1=null;
        Token this_DIGIT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEcl.g:6532:2: ( (this_DASH_0= RULE_DASH | this_KEYWORD_1= RULE_KEYWORD | this_DIGIT_2= RULE_DIGIT )+ )
            // InternalEcl.g:6533:2: (this_DASH_0= RULE_DASH | this_KEYWORD_1= RULE_KEYWORD | this_DIGIT_2= RULE_DIGIT )+
            {
            // InternalEcl.g:6533:2: (this_DASH_0= RULE_DASH | this_KEYWORD_1= RULE_KEYWORD | this_DIGIT_2= RULE_DIGIT )+
            int cnt81=0;
            loop81:
            do {
                int alt81=4;
                switch ( input.LA(1) ) {
                case RULE_DASH:
                    {
                    int LA81_2 = input.LA(2);

                    if ( (synpred187_InternalEcl()) ) {
                        alt81=1;
                    }


                    }
                    break;
                case RULE_KEYWORD:
                    {
                    int LA81_3 = input.LA(2);

                    if ( (synpred188_InternalEcl()) ) {
                        alt81=2;
                    }


                    }
                    break;
                case RULE_DIGIT:
                    {
                    int LA81_4 = input.LA(2);

                    if ( (synpred189_InternalEcl()) ) {
                        alt81=3;
                    }


                    }
                    break;

                }

                switch (alt81) {
            	case 1 :
            	    // InternalEcl.g:6534:3: this_DASH_0= RULE_DASH
            	    {
            	    this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DASH_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DASH_0, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEcl.g:6542:3: this_KEYWORD_1= RULE_KEYWORD
            	    {
            	    this_KEYWORD_1=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_KEYWORD_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_KEYWORD_1, grammarAccess.getDialectAliasValueAccess().getKEYWORDTerminalRuleCall_1());
            	      		
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEcl.g:6550:3: this_DIGIT_2= RULE_DIGIT
            	    {
            	    this_DIGIT_2=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_2);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_2, grammarAccess.getDialectAliasValueAccess().getDIGITTerminalRuleCall_2());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt81 >= 1 ) break loop81;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(81, input);
                        throw eee;
                }
                cnt81++;
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
    // InternalEcl.g:6564:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEcl.g:6564:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEcl.g:6565:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
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
    // InternalEcl.g:6571:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MATCH_KEYWORD_0=null;
        Token this_WILD_KEYWORD_1=null;
        Token this_EXACT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:6577:2: ( (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD ) )
            // InternalEcl.g:6578:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            {
            // InternalEcl.g:6578:2: (this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD | this_WILD_KEYWORD_1= RULE_WILD_KEYWORD | this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD )
            int alt82=3;
            switch ( input.LA(1) ) {
            case RULE_MATCH_KEYWORD:
                {
                alt82=1;
                }
                break;
            case RULE_WILD_KEYWORD:
                {
                alt82=2;
                }
                break;
            case RULE_EXACT_KEYWORD:
                {
                alt82=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalEcl.g:6579:3: this_MATCH_KEYWORD_0= RULE_MATCH_KEYWORD
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
                    // InternalEcl.g:6587:3: this_WILD_KEYWORD_1= RULE_WILD_KEYWORD
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
                    // InternalEcl.g:6595:3: this_EXACT_KEYWORD_2= RULE_EXACT_KEYWORD
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
    // InternalEcl.g:6606:1: entryRuleHISTORY_PROFILE_TYPE returns [String current=null] : iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF ;
    public final String entryRuleHISTORY_PROFILE_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleHISTORY_PROFILE_TYPE = null;


        try {
            // InternalEcl.g:6606:60: (iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF )
            // InternalEcl.g:6607:2: iv_ruleHISTORY_PROFILE_TYPE= ruleHISTORY_PROFILE_TYPE EOF
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
    // InternalEcl.g:6613:1: ruleHISTORY_PROFILE_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleHISTORY_PROFILE_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_MIN_KEYWORD_0=null;
        Token this_MOD_KEYWORD_1=null;
        Token this_MAX_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:6619:2: ( (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD ) )
            // InternalEcl.g:6620:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            {
            // InternalEcl.g:6620:2: (this_MIN_KEYWORD_0= RULE_MIN_KEYWORD | this_MOD_KEYWORD_1= RULE_MOD_KEYWORD | this_MAX_KEYWORD_2= RULE_MAX_KEYWORD )
            int alt83=3;
            switch ( input.LA(1) ) {
            case RULE_MIN_KEYWORD:
                {
                alt83=1;
                }
                break;
            case RULE_MOD_KEYWORD:
                {
                alt83=2;
                }
                break;
            case RULE_MAX_KEYWORD:
                {
                alt83=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // InternalEcl.g:6621:3: this_MIN_KEYWORD_0= RULE_MIN_KEYWORD
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
                    // InternalEcl.g:6629:3: this_MOD_KEYWORD_1= RULE_MOD_KEYWORD
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
                    // InternalEcl.g:6637:3: this_MAX_KEYWORD_2= RULE_MAX_KEYWORD
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
    // InternalEcl.g:6648:1: entryRuleSHORT_DOMAIN returns [String current=null] : iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF ;
    public final String entryRuleSHORT_DOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSHORT_DOMAIN = null;


        try {
            // InternalEcl.g:6648:52: (iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF )
            // InternalEcl.g:6649:2: iv_ruleSHORT_DOMAIN= ruleSHORT_DOMAIN EOF
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
    // InternalEcl.g:6655:1: ruleSHORT_DOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD ) ;
    public final AntlrDatatypeRuleToken ruleSHORT_DOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_CONCEPT_SHORT_KEYWORD_0=null;
        Token this_DESCRIPTION_SHORT_KEYWORD_1=null;
        Token this_MEMBER_SHORT_KEYWORD_2=null;


        	enterRule();

        try {
            // InternalEcl.g:6661:2: ( (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD ) )
            // InternalEcl.g:6662:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD )
            {
            // InternalEcl.g:6662:2: (this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD )
            int alt84=3;
            switch ( input.LA(1) ) {
            case RULE_CONCEPT_SHORT_KEYWORD:
                {
                alt84=1;
                }
                break;
            case RULE_DESCRIPTION_SHORT_KEYWORD:
                {
                alt84=2;
                }
                break;
            case RULE_MEMBER_SHORT_KEYWORD:
                {
                alt84=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }

            switch (alt84) {
                case 1 :
                    // InternalEcl.g:6663:3: this_CONCEPT_SHORT_KEYWORD_0= RULE_CONCEPT_SHORT_KEYWORD
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
                    // InternalEcl.g:6671:3: this_DESCRIPTION_SHORT_KEYWORD_1= RULE_DESCRIPTION_SHORT_KEYWORD
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
                    // InternalEcl.g:6679:3: this_MEMBER_SHORT_KEYWORD_2= RULE_MEMBER_SHORT_KEYWORD
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
    // InternalEcl.g:6690:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:6690:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEcl.g:6691:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
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
    // InternalEcl.g:6697:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEcl.g:6703:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEcl.g:6704:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEcl.g:6704:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_EQUAL) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_NOT_EQUAL) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalEcl.g:6705:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEcl.g:6713:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
    // InternalEcl.g:6724:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEcl.g:6724:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEcl.g:6725:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
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
    // InternalEcl.g:6731:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
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
            // InternalEcl.g:6737:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEcl.g:6738:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEcl.g:6738:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt86=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt86=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt86=2;
                }
                break;
            case RULE_GT:
                {
                alt86=3;
                }
                break;
            case RULE_LT:
                {
                alt86=4;
                }
                break;
            case RULE_GTE:
                {
                alt86=5;
                }
                break;
            case RULE_LTE:
                {
                alt86=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalEcl.g:6739:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEcl.g:6747:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
                    // InternalEcl.g:6755:3: this_GT_2= RULE_GT
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
                    // InternalEcl.g:6763:3: this_LT_3= RULE_LT
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
                    // InternalEcl.g:6771:3: this_GTE_4= RULE_GTE
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
                    // InternalEcl.g:6779:3: this_LTE_5= RULE_LTE
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

    // $ANTLR start synpred22_InternalEcl
    public final void synpred22_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EclConceptReference_2 = null;


        // InternalEcl.g:801:3: (this_EclConceptReference_2= ruleEclConceptReference )
        // InternalEcl.g:801:3: this_EclConceptReference_2= ruleEclConceptReference
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EclConceptReference_2=ruleEclConceptReference();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred22_InternalEcl

    // $ANTLR start synpred24_InternalEcl
    public final void synpred24_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AlternateIdentifier_4 = null;


        // InternalEcl.g:825:3: (this_AlternateIdentifier_4= ruleAlternateIdentifier )
        // InternalEcl.g:825:3: this_AlternateIdentifier_4= ruleAlternateIdentifier
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AlternateIdentifier_4=ruleAlternateIdentifier();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalEcl

    // $ANTLR start synpred37_InternalEcl
    public final void synpred37_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1778:4: ( RULE_DISJUNCTION_KEYWORD )
        // InternalEcl.g:1778:5: RULE_DISJUNCTION_KEYWORD
        {
        match(input,RULE_DISJUNCTION_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred37_InternalEcl

    // $ANTLR start synpred39_InternalEcl
    public final void synpred39_InternalEcl_fragment() throws RecognitionException {   
        // InternalEcl.g:1846:4: ( RULE_CONJUNCTION_KEYWORD | RULE_COMMA )
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
    // $ANTLR end synpred39_InternalEcl

    // $ANTLR start synpred41_InternalEcl
    public final void synpred41_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:1909:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:1909:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred41_InternalEcl

    // $ANTLR start synpred42_InternalEcl
    public final void synpred42_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalEcl.g:1921:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEcl.g:1921:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
    // $ANTLR end synpred42_InternalEcl

    // $ANTLR start synpred47_InternalEcl
    public final void synpred47_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEcl.g:2239:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEcl.g:2239:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred47_InternalEcl

    // $ANTLR start synpred49_InternalEcl
    public final void synpred49_InternalEcl_fragment() throws RecognitionException {   
        Token lv_reversed_1_0=null;

        // InternalEcl.g:2347:4: ( (lv_reversed_1_0= RULE_REVERSED ) )
        // InternalEcl.g:2347:4: (lv_reversed_1_0= RULE_REVERSED )
        {
        // InternalEcl.g:2347:4: (lv_reversed_1_0= RULE_REVERSED )
        // InternalEcl.g:2348:5: lv_reversed_1_0= RULE_REVERSED
        {
        lv_reversed_1_0=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred49_InternalEcl

    // $ANTLR start synpred59_InternalEcl
    public final void synpred59_InternalEcl_fragment() throws RecognitionException {   
        EObject this_TermFilter_0 = null;


        // InternalEcl.g:3213:3: (this_TermFilter_0= ruleTermFilter )
        // InternalEcl.g:3213:3: this_TermFilter_0= ruleTermFilter
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
    // $ANTLR end synpred59_InternalEcl

    // $ANTLR start synpred60_InternalEcl
    public final void synpred60_InternalEcl_fragment() throws RecognitionException {   
        EObject this_LanguageFilter_1 = null;


        // InternalEcl.g:3225:3: (this_LanguageFilter_1= ruleLanguageFilter )
        // InternalEcl.g:3225:3: this_LanguageFilter_1= ruleLanguageFilter
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
    // $ANTLR end synpred60_InternalEcl

    // $ANTLR start synpred61_InternalEcl
    public final void synpred61_InternalEcl_fragment() throws RecognitionException {   
        EObject this_TypeFilter_2 = null;


        // InternalEcl.g:3237:3: (this_TypeFilter_2= ruleTypeFilter )
        // InternalEcl.g:3237:3: this_TypeFilter_2= ruleTypeFilter
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
    // $ANTLR end synpred61_InternalEcl

    // $ANTLR start synpred62_InternalEcl
    public final void synpred62_InternalEcl_fragment() throws RecognitionException {   
        EObject this_DialectFilter_3 = null;


        // InternalEcl.g:3249:3: (this_DialectFilter_3= ruleDialectFilter )
        // InternalEcl.g:3249:3: this_DialectFilter_3= ruleDialectFilter
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
    // $ANTLR end synpred62_InternalEcl

    // $ANTLR start synpred63_InternalEcl
    public final void synpred63_InternalEcl_fragment() throws RecognitionException {   
        EObject this_IdFilter_4 = null;


        // InternalEcl.g:3261:3: (this_IdFilter_4= ruleIdFilter )
        // InternalEcl.g:3261:3: this_IdFilter_4= ruleIdFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_IdFilter_4=ruleIdFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred63_InternalEcl

    // $ANTLR start synpred64_InternalEcl
    public final void synpred64_InternalEcl_fragment() throws RecognitionException {   
        EObject this_DefinitionStatusFilter_5 = null;


        // InternalEcl.g:3273:3: (this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter )
        // InternalEcl.g:3273:3: this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_DefinitionStatusFilter_5=ruleDefinitionStatusFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred64_InternalEcl

    // $ANTLR start synpred65_InternalEcl
    public final void synpred65_InternalEcl_fragment() throws RecognitionException {   
        EObject this_ModuleFilter_6 = null;


        // InternalEcl.g:3285:3: (this_ModuleFilter_6= ruleModuleFilter )
        // InternalEcl.g:3285:3: this_ModuleFilter_6= ruleModuleFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ModuleFilter_6=ruleModuleFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred65_InternalEcl

    // $ANTLR start synpred66_InternalEcl
    public final void synpred66_InternalEcl_fragment() throws RecognitionException {   
        EObject this_EffectiveTimeFilter_7 = null;


        // InternalEcl.g:3297:3: (this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter )
        // InternalEcl.g:3297:3: this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_EffectiveTimeFilter_7=ruleEffectiveTimeFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred66_InternalEcl

    // $ANTLR start synpred67_InternalEcl
    public final void synpred67_InternalEcl_fragment() throws RecognitionException {   
        EObject this_ActiveFilter_8 = null;


        // InternalEcl.g:3309:3: (this_ActiveFilter_8= ruleActiveFilter )
        // InternalEcl.g:3309:3: this_ActiveFilter_8= ruleActiveFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_ActiveFilter_8=ruleActiveFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred67_InternalEcl

    // $ANTLR start synpred68_InternalEcl
    public final void synpred68_InternalEcl_fragment() throws RecognitionException {   
        EObject this_SemanticTagFilter_9 = null;


        // InternalEcl.g:3321:3: (this_SemanticTagFilter_9= ruleSemanticTagFilter )
        // InternalEcl.g:3321:3: this_SemanticTagFilter_9= ruleSemanticTagFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_SemanticTagFilter_9=ruleSemanticTagFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred68_InternalEcl

    // $ANTLR start synpred69_InternalEcl
    public final void synpred69_InternalEcl_fragment() throws RecognitionException {   
        EObject this_PreferredInFilter_10 = null;


        // InternalEcl.g:3333:3: (this_PreferredInFilter_10= rulePreferredInFilter )
        // InternalEcl.g:3333:3: this_PreferredInFilter_10= rulePreferredInFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_PreferredInFilter_10=rulePreferredInFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred69_InternalEcl

    // $ANTLR start synpred70_InternalEcl
    public final void synpred70_InternalEcl_fragment() throws RecognitionException {   
        EObject this_AcceptableInFilter_11 = null;


        // InternalEcl.g:3345:3: (this_AcceptableInFilter_11= ruleAcceptableInFilter )
        // InternalEcl.g:3345:3: this_AcceptableInFilter_11= ruleAcceptableInFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_AcceptableInFilter_11=ruleAcceptableInFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred70_InternalEcl

    // $ANTLR start synpred71_InternalEcl
    public final void synpred71_InternalEcl_fragment() throws RecognitionException {   
        EObject this_LanguageRefSetFilter_12 = null;


        // InternalEcl.g:3357:3: (this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter )
        // InternalEcl.g:3357:3: this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_LanguageRefSetFilter_12=ruleLanguageRefSetFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred71_InternalEcl

    // $ANTLR start synpred72_InternalEcl
    public final void synpred72_InternalEcl_fragment() throws RecognitionException {   
        EObject this_CaseSignificanceFilter_13 = null;


        // InternalEcl.g:3369:3: (this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter )
        // InternalEcl.g:3369:3: this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_CaseSignificanceFilter_13=ruleCaseSignificanceFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred72_InternalEcl

    // $ANTLR start synpred73_InternalEcl
    public final void synpred73_InternalEcl_fragment() throws RecognitionException {   
        EObject this_MemberFieldFilter_14 = null;


        // InternalEcl.g:3381:3: (this_MemberFieldFilter_14= ruleMemberFieldFilter )
        // InternalEcl.g:3381:3: this_MemberFieldFilter_14= ruleMemberFieldFilter
        {
        if ( state.backtracking==0 ) {

          			/* */
          		
        }
        pushFollow(FollowSets000.FOLLOW_2);
        this_MemberFieldFilter_14=ruleMemberFieldFilter();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred73_InternalEcl

    // $ANTLR start synpred88_InternalEcl
    public final void synpred88_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_dialects_2_0 = null;


        // InternalEcl.g:4338:4: ( ( (lv_dialects_2_0= ruleDialect ) ) )
        // InternalEcl.g:4338:4: ( (lv_dialects_2_0= ruleDialect ) )
        {
        // InternalEcl.g:4338:4: ( (lv_dialects_2_0= ruleDialect ) )
        // InternalEcl.g:4339:5: (lv_dialects_2_0= ruleDialect )
        {
        // InternalEcl.g:4339:5: (lv_dialects_2_0= ruleDialect )
        // InternalEcl.g:4340:6: lv_dialects_2_0= ruleDialect
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
    // $ANTLR end synpred88_InternalEcl

    // $ANTLR start synpred92_InternalEcl
    public final void synpred92_InternalEcl_fragment() throws RecognitionException {   
        EObject lv_acceptability_1_0 = null;


        // InternalEcl.g:4520:4: ( (lv_acceptability_1_0= ruleAcceptability ) )
        // InternalEcl.g:4520:4: (lv_acceptability_1_0= ruleAcceptability )
        {
        // InternalEcl.g:4520:4: (lv_acceptability_1_0= ruleAcceptability )
        // InternalEcl.g:4521:5: lv_acceptability_1_0= ruleAcceptability
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
    // $ANTLR end synpred92_InternalEcl

    // $ANTLR start synpred97_InternalEcl
    public final void synpred97_InternalEcl_fragment() throws RecognitionException {   
        EObject this_FilteredExpressionConstraint_0 = null;


        // InternalEcl.g:5272:3: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint )
        // InternalEcl.g:5272:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint
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
    // $ANTLR end synpred97_InternalEcl

    // $ANTLR start synpred108_InternalEcl
    public final void synpred108_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_8=null;

        // InternalEcl.g:5545:4: (this_DIGIT_8= RULE_DIGIT )
        // InternalEcl.g:5545:4: this_DIGIT_8= RULE_DIGIT
        {
        this_DIGIT_8=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred108_InternalEcl

    // $ANTLR start synpred109_InternalEcl
    public final void synpred109_InternalEcl_fragment() throws RecognitionException {   
        Token this_ALPHA_9=null;

        // InternalEcl.g:5553:4: (this_ALPHA_9= RULE_ALPHA )
        // InternalEcl.g:5553:4: this_ALPHA_9= RULE_ALPHA
        {
        this_ALPHA_9=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred109_InternalEcl

    // $ANTLR start synpred110_InternalEcl
    public final void synpred110_InternalEcl_fragment() throws RecognitionException {   
        Token this_CONCEPT_SHORT_KEYWORD_10=null;

        // InternalEcl.g:5561:4: (this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD )
        // InternalEcl.g:5561:4: this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD
        {
        this_CONCEPT_SHORT_KEYWORD_10=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred110_InternalEcl

    // $ANTLR start synpred111_InternalEcl
    public final void synpred111_InternalEcl_fragment() throws RecognitionException {   
        Token this_DESCRIPTION_SHORT_KEYWORD_11=null;

        // InternalEcl.g:5569:4: (this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD )
        // InternalEcl.g:5569:4: this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD
        {
        this_DESCRIPTION_SHORT_KEYWORD_11=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred111_InternalEcl

    // $ANTLR start synpred112_InternalEcl
    public final void synpred112_InternalEcl_fragment() throws RecognitionException {   
        Token this_MEMBER_SHORT_KEYWORD_12=null;

        // InternalEcl.g:5577:4: (this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD )
        // InternalEcl.g:5577:4: this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD
        {
        this_MEMBER_SHORT_KEYWORD_12=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred112_InternalEcl

    // $ANTLR start synpred113_InternalEcl
    public final void synpred113_InternalEcl_fragment() throws RecognitionException {   
        Token this_REVERSED_13=null;

        // InternalEcl.g:5585:4: (this_REVERSED_13= RULE_REVERSED )
        // InternalEcl.g:5585:4: this_REVERSED_13= RULE_REVERSED
        {
        this_REVERSED_13=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred113_InternalEcl

    // $ANTLR start synpred114_InternalEcl
    public final void synpred114_InternalEcl_fragment() throws RecognitionException {   
        Token this_ID_KEYWORD_14=null;

        // InternalEcl.g:5593:4: (this_ID_KEYWORD_14= RULE_ID_KEYWORD )
        // InternalEcl.g:5593:4: this_ID_KEYWORD_14= RULE_ID_KEYWORD
        {
        this_ID_KEYWORD_14=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred114_InternalEcl

    // $ANTLR start synpred115_InternalEcl
    public final void synpred115_InternalEcl_fragment() throws RecognitionException {   
        Token this_KEYWORD_15=null;

        // InternalEcl.g:5601:4: (this_KEYWORD_15= RULE_KEYWORD )
        // InternalEcl.g:5601:4: this_KEYWORD_15= RULE_KEYWORD
        {
        this_KEYWORD_15=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred115_InternalEcl

    // $ANTLR start synpred133_InternalEcl
    public final void synpred133_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_0=null;

        // InternalEcl.g:5811:3: (this_DIGIT_0= RULE_DIGIT )
        // InternalEcl.g:5811:3: this_DIGIT_0= RULE_DIGIT
        {
        this_DIGIT_0=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred133_InternalEcl

    // $ANTLR start synpred134_InternalEcl
    public final void synpred134_InternalEcl_fragment() throws RecognitionException {   
        Token this_ALPHA_1=null;

        // InternalEcl.g:5819:3: (this_ALPHA_1= RULE_ALPHA )
        // InternalEcl.g:5819:3: this_ALPHA_1= RULE_ALPHA
        {
        this_ALPHA_1=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred134_InternalEcl

    // $ANTLR start synpred135_InternalEcl
    public final void synpred135_InternalEcl_fragment() throws RecognitionException {   
        Token this_CONCEPT_SHORT_KEYWORD_2=null;

        // InternalEcl.g:5827:3: (this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD )
        // InternalEcl.g:5827:3: this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD
        {
        this_CONCEPT_SHORT_KEYWORD_2=(Token)match(input,RULE_CONCEPT_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred135_InternalEcl

    // $ANTLR start synpred136_InternalEcl
    public final void synpred136_InternalEcl_fragment() throws RecognitionException {   
        Token this_DESCRIPTION_SHORT_KEYWORD_3=null;

        // InternalEcl.g:5835:3: (this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD )
        // InternalEcl.g:5835:3: this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD
        {
        this_DESCRIPTION_SHORT_KEYWORD_3=(Token)match(input,RULE_DESCRIPTION_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred136_InternalEcl

    // $ANTLR start synpred137_InternalEcl
    public final void synpred137_InternalEcl_fragment() throws RecognitionException {   
        Token this_MEMBER_SHORT_KEYWORD_4=null;

        // InternalEcl.g:5843:3: (this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD )
        // InternalEcl.g:5843:3: this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD
        {
        this_MEMBER_SHORT_KEYWORD_4=(Token)match(input,RULE_MEMBER_SHORT_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred137_InternalEcl

    // $ANTLR start synpred138_InternalEcl
    public final void synpred138_InternalEcl_fragment() throws RecognitionException {   
        Token this_REVERSED_5=null;

        // InternalEcl.g:5851:3: (this_REVERSED_5= RULE_REVERSED )
        // InternalEcl.g:5851:3: this_REVERSED_5= RULE_REVERSED
        {
        this_REVERSED_5=(Token)match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred138_InternalEcl

    // $ANTLR start synpred139_InternalEcl
    public final void synpred139_InternalEcl_fragment() throws RecognitionException {   
        Token this_ID_KEYWORD_6=null;

        // InternalEcl.g:5859:3: (this_ID_KEYWORD_6= RULE_ID_KEYWORD )
        // InternalEcl.g:5859:3: this_ID_KEYWORD_6= RULE_ID_KEYWORD
        {
        this_ID_KEYWORD_6=(Token)match(input,RULE_ID_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred139_InternalEcl

    // $ANTLR start synpred140_InternalEcl
    public final void synpred140_InternalEcl_fragment() throws RecognitionException {   
        Token this_KEYWORD_7=null;

        // InternalEcl.g:5867:3: (this_KEYWORD_7= RULE_KEYWORD )
        // InternalEcl.g:5867:3: this_KEYWORD_7= RULE_KEYWORD
        {
        this_KEYWORD_7=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred140_InternalEcl

    // $ANTLR start synpred141_InternalEcl
    public final void synpred141_InternalEcl_fragment() throws RecognitionException {   
        Token this_DOT_8=null;

        // InternalEcl.g:5875:3: (this_DOT_8= RULE_DOT )
        // InternalEcl.g:5875:3: this_DOT_8= RULE_DOT
        {
        this_DOT_8=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred141_InternalEcl

    // $ANTLR start synpred187_InternalEcl
    public final void synpred187_InternalEcl_fragment() throws RecognitionException {   
        Token this_DASH_0=null;

        // InternalEcl.g:6534:3: (this_DASH_0= RULE_DASH )
        // InternalEcl.g:6534:3: this_DASH_0= RULE_DASH
        {
        this_DASH_0=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred187_InternalEcl

    // $ANTLR start synpred188_InternalEcl
    public final void synpred188_InternalEcl_fragment() throws RecognitionException {   
        Token this_KEYWORD_1=null;

        // InternalEcl.g:6542:3: (this_KEYWORD_1= RULE_KEYWORD )
        // InternalEcl.g:6542:3: this_KEYWORD_1= RULE_KEYWORD
        {
        this_KEYWORD_1=(Token)match(input,RULE_KEYWORD,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred188_InternalEcl

    // $ANTLR start synpred189_InternalEcl
    public final void synpred189_InternalEcl_fragment() throws RecognitionException {   
        Token this_DIGIT_2=null;

        // InternalEcl.g:6550:3: (this_DIGIT_2= RULE_DIGIT )
        // InternalEcl.g:6550:3: this_DIGIT_2= RULE_DIGIT
        {
        this_DIGIT_2=(Token)match(input,RULE_DIGIT,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred189_InternalEcl

    // Delegated rules

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
    public final boolean synpred42_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred42_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred73_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred73_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred66_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred66_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred110_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred110_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred97_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred97_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred65_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred65_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred22_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred72_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred72_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred41_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred49_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred49_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred141_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred141_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred108_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred108_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred109_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred109_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred71_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred71_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred115_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred115_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred189_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred189_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred114_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred114_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred135_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred135_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred37_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred37_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred69_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred69_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred136_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred136_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred68_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred68_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred112_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred112_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred47_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred47_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred88_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred88_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred111_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred111_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred113_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred113_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred187_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred187_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred188_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred188_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred67_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred67_InternalEcl_fragment(); // can never throw exception
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
    public final boolean synpred24_InternalEcl() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEcl_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA11 dfa11 = new DFA11(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA32 dfa32 = new DFA32(this);
    protected DFA35 dfa35 = new DFA35(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA56 dfa56 = new DFA56(this);
    protected DFA59 dfa59 = new DFA59(this);
    protected DFA64 dfa64 = new DFA64(this);
    protected DFA69 dfa69 = new DFA69(this);
    protected DFA72 dfa72 = new DFA72(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\4\uffff\7\3\2\uffff\1\3\7\uffff\1\3\1\uffff\1\3\7\uffff\1\3";
    static final String dfa_3s = "\1\24\3\uffff\7\4\2\uffff\1\4\7\0\1\4\1\uffff\1\4\7\0\1\4";
    static final String dfa_4s = "\1\102\3\uffff\7\114\2\uffff\1\114\7\0\1\114\1\uffff\1\114\7\0\1\114";
    static final String dfa_5s = "\1\uffff\1\1\1\2\1\3\7\uffff\1\4\1\6\11\uffff\1\5\11\uffff";
    static final String dfa_6s = "\16\uffff\1\3\1\12\1\4\1\13\1\5\1\14\1\10\3\uffff\1\0\1\6\1\2\1\11\1\7\1\15\1\1\1\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\1\1\6\uffff\1\14\1\uffff\1\13\2\uffff\1\10\3\uffff\1\11\27\uffff\1\3\1\4\1\5\1\6\1\7\1\12",
            "",
            "",
            "",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "",
            "",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\34\1\uffff\2\3\1\35\17\uffff\1\3\5\uffff\1\37\1\3\1\27\1\30\1\31\1\32\1\33\1\36\7\uffff\3\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\22\1\uffff\2\3\1\23\17\uffff\1\3\5\uffff\1\25\1\3\1\15\1\16\1\17\1\20\1\21\1\24\7\uffff\3\3",
            "",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\34\1\uffff\2\3\1\35\17\uffff\1\3\5\uffff\1\37\1\3\1\27\1\30\1\31\1\32\1\33\1\36\7\uffff\3\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\22\3\2\uffff\2\3\1\26\1\uffff\3\3\1\uffff\1\3\1\34\1\uffff\2\3\1\35\17\uffff\1\3\5\uffff\1\37\1\3\1\27\1\30\1\31\1\32\1\33\1\36\7\uffff\3\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "776:2: (this_MemberOf_0= ruleMemberOf | this_ReverseMemberOf_1= ruleReverseMemberOf | this_EclConceptReference_2= ruleEclConceptReference | this_Any_3= ruleAny | this_AlternateIdentifier_4= ruleAlternateIdentifier | this_NestedExpression_5= ruleNestedExpression )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_24 = input.LA(1);

                         
                        int index11_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_24);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA11_30 = input.LA(1);

                         
                        int index11_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_30);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA11_26 = input.LA(1);

                         
                        int index11_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_26);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA11_14 = input.LA(1);

                         
                        int index11_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_14);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA11_16 = input.LA(1);

                         
                        int index11_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_16);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA11_18 = input.LA(1);

                         
                        int index11_18 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_18);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA11_25 = input.LA(1);

                         
                        int index11_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_25);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA11_28 = input.LA(1);

                         
                        int index11_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_28);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA11_20 = input.LA(1);

                         
                        int index11_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_20);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA11_27 = input.LA(1);

                         
                        int index11_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_27);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA11_15 = input.LA(1);

                         
                        int index11_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_15);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA11_17 = input.LA(1);

                         
                        int index11_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_17);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA11_19 = input.LA(1);

                         
                        int index11_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_19);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA11_29 = input.LA(1);

                         
                        int index11_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred22_InternalEcl()) ) {s = 3;}

                        else if ( (synpred24_InternalEcl()) ) {s = 22;}

                         
                        input.seek(index11_29);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_8s = "\32\uffff";
    static final String dfa_9s = "\1\12\1\0\25\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\102\1\0\25\uffff\1\0\2\uffff";
    static final String dfa_11s = "\2\uffff\1\1\25\uffff\1\2\1\3";
    static final String dfa_12s = "\1\uffff\1\0\25\uffff\1\1\2\uffff}>";
    static final String[] dfa_13s = {
            "\14\2\1\1\5\uffff\1\27\1\uffff\1\2\1\30\1\uffff\1\2\3\uffff\1\2\27\uffff\6\2",
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
            "\1\uffff",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1908:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_1 = input.LA(1);

                         
                        int index25_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalEcl()) ) {s = 2;}

                        else if ( (synpred42_InternalEcl()) ) {s = 24;}

                         
                        input.seek(index25_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_23 = input.LA(1);

                         
                        int index25_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred41_InternalEcl()) ) {s = 2;}

                        else if ( (true) ) {s = 25;}

                         
                        input.seek(index25_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_14s = "\31\uffff";
    static final String dfa_15s = "\1\12\26\uffff\1\0\1\uffff";
    static final String dfa_16s = "\1\102\26\uffff\1\0\1\uffff";
    static final String dfa_17s = "\1\uffff\1\1\26\uffff\1\2";
    static final String dfa_18s = "\27\uffff\1\0\1\uffff}>";
    static final String[] dfa_19s = {
            "\15\1\5\uffff\1\27\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\27\uffff\6\1",
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
            "\1\uffff",
            ""
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_14;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "2238:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA30_23 = input.LA(1);

                         
                        int index30_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred47_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 24;}

                         
                        input.seek(index30_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 30, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_20s = "\16\uffff";
    static final String dfa_21s = "\1\uffff\1\2\14\uffff";
    static final String dfa_22s = "\1\12\1\4\2\uffff\2\24\10\0";
    static final String dfa_23s = "\1\102\1\114\2\uffff\2\102\10\0";
    static final String dfa_24s = "\2\uffff\1\2\1\1\12\uffff";
    static final String dfa_25s = "\6\uffff\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\1}>";
    static final String[] dfa_26s = {
            "\14\2\6\uffff\1\2\1\uffff\1\2\2\uffff\1\1\3\uffff\1\2\27\uffff\6\2",
            "\4\2\2\uffff\2\3\1\4\3\3\1\5\5\3\2\uffff\3\2\1\uffff\1\3\1\2\1\3\1\uffff\1\2\1\13\1\uffff\1\2\1\uffff\1\14\17\uffff\1\2\5\uffff\2\2\1\6\1\7\1\10\1\11\1\12\1\15\7\uffff\3\2",
            "",
            "",
            "\2\3\4\uffff\1\2\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\27\uffff\6\3",
            "\2\3\4\uffff\1\2\1\uffff\1\3\1\uffff\1\3\2\uffff\1\3\3\uffff\1\3\27\uffff\6\3",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff"
    };

    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final char[] dfa_22 = DFA.unpackEncodedStringToUnsignedChars(dfa_22s);
    static final char[] dfa_23 = DFA.unpackEncodedStringToUnsignedChars(dfa_23s);
    static final short[] dfa_24 = DFA.unpackEncodedString(dfa_24s);
    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[][] dfa_26 = unpackEncodedStringArray(dfa_26s);

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = dfa_20;
            this.eof = dfa_21;
            this.min = dfa_22;
            this.max = dfa_23;
            this.accept = dfa_24;
            this.special = dfa_25;
            this.transition = dfa_26;
        }
        public String getDescription() {
            return "2346:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA32_6 = input.LA(1);

                         
                        int index32_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_6);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA32_13 = input.LA(1);

                         
                        int index32_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_13);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA32_7 = input.LA(1);

                         
                        int index32_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_7);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA32_8 = input.LA(1);

                         
                        int index32_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_8);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA32_9 = input.LA(1);

                         
                        int index32_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_9);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA32_10 = input.LA(1);

                         
                        int index32_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_10);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA32_11 = input.LA(1);

                         
                        int index32_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_11);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA32_12 = input.LA(1);

                         
                        int index32_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred49_InternalEcl()) ) {s = 3;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index32_12);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 32, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_27s = "\17\uffff";
    static final String dfa_28s = "\14\uffff\1\16\2\uffff";
    static final String dfa_29s = "\1\14\6\32\1\71\2\uffff\2\75\1\4\2\uffff";
    static final String dfa_30s = "\1\114\2\106\4\32\1\75\2\uffff\3\75\2\uffff";
    static final String dfa_31s = "\10\uffff\1\1\1\2\3\uffff\1\4\1\3";
    static final String dfa_32s = "\17\uffff}>";
    static final String[] dfa_33s = {
            "\1\4\3\uffff\1\3\44\uffff\1\1\24\uffff\1\2\1\5\1\6",
            "\1\7\2\11\11\uffff\2\11\33\uffff\2\10\2\11",
            "\1\7\2\11\11\uffff\2\11\33\uffff\2\10\2\11",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\12\1\uffff\1\13\1\uffff\1\14",
            "",
            "",
            "\1\14",
            "\1\14",
            "\4\16\1\uffff\1\15\23\uffff\1\16\2\uffff\1\16\3\uffff\1\16\30\uffff\1\14",
            "",
            ""
    };

    static final short[] dfa_27 = DFA.unpackEncodedString(dfa_27s);
    static final short[] dfa_28 = DFA.unpackEncodedString(dfa_28s);
    static final char[] dfa_29 = DFA.unpackEncodedStringToUnsignedChars(dfa_29s);
    static final char[] dfa_30 = DFA.unpackEncodedStringToUnsignedChars(dfa_30s);
    static final short[] dfa_31 = DFA.unpackEncodedString(dfa_31s);
    static final short[] dfa_32 = DFA.unpackEncodedString(dfa_32s);
    static final short[][] dfa_33 = unpackEncodedStringArray(dfa_33s);

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = dfa_27;
            this.eof = dfa_28;
            this.min = dfa_29;
            this.max = dfa_30;
            this.accept = dfa_31;
            this.special = dfa_32;
            this.transition = dfa_33;
        }
        public String getDescription() {
            return "2588:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_34s = "\64\uffff";
    static final String dfa_35s = "\1\4\21\0\42\uffff";
    static final String dfa_36s = "\1\111\21\0\42\uffff";
    static final String dfa_37s = "\22\uffff\1\17\22\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16";
    static final String dfa_38s = "\1\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\42\uffff}>";
    static final String[] dfa_39s = {
            "\2\22\1\uffff\1\22\24\uffff\1\45\1\uffff\1\22\2\uffff\1\22\3\uffff\1\7\2\22\1\1\1\2\1\3\1\4\1\5\1\6\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\uffff\1\17\1\20\1\21\1\uffff\1\22\4\uffff\13\22",
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

    static final short[] dfa_34 = DFA.unpackEncodedString(dfa_34s);
    static final char[] dfa_35 = DFA.unpackEncodedStringToUnsignedChars(dfa_35s);
    static final char[] dfa_36 = DFA.unpackEncodedStringToUnsignedChars(dfa_36s);
    static final short[] dfa_37 = DFA.unpackEncodedString(dfa_37s);
    static final short[] dfa_38 = DFA.unpackEncodedString(dfa_38s);
    static final short[][] dfa_39 = unpackEncodedStringArray(dfa_39s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_34;
            this.eof = dfa_34;
            this.min = dfa_35;
            this.max = dfa_36;
            this.accept = dfa_37;
            this.special = dfa_38;
            this.transition = dfa_39;
        }
        public String getDescription() {
            return "3212:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_IdFilter_4= ruleIdFilter | this_DefinitionStatusFilter_5= ruleDefinitionStatusFilter | this_ModuleFilter_6= ruleModuleFilter | this_EffectiveTimeFilter_7= ruleEffectiveTimeFilter | this_ActiveFilter_8= ruleActiveFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_PreferredInFilter_10= rulePreferredInFilter | this_AcceptableInFilter_11= ruleAcceptableInFilter | this_LanguageRefSetFilter_12= ruleLanguageRefSetFilter | this_CaseSignificanceFilter_13= ruleCaseSignificanceFilter | this_MemberFieldFilter_14= ruleMemberFieldFilter | this_NestedFilter_15= ruleNestedFilter )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_1 = input.LA(1);

                         
                        int index40_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred59_InternalEcl()) ) {s = 38;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_2 = input.LA(1);

                         
                        int index40_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred60_InternalEcl()) ) {s = 39;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_2);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA40_3 = input.LA(1);

                         
                        int index40_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalEcl()) ) {s = 40;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_3);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA40_4 = input.LA(1);

                         
                        int index40_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred61_InternalEcl()) ) {s = 40;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_4);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA40_5 = input.LA(1);

                         
                        int index40_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEcl()) ) {s = 41;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_5);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA40_6 = input.LA(1);

                         
                        int index40_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred62_InternalEcl()) ) {s = 41;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_6);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA40_7 = input.LA(1);

                         
                        int index40_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred63_InternalEcl()) ) {s = 42;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_7);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA40_8 = input.LA(1);

                         
                        int index40_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEcl()) ) {s = 43;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_8);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA40_9 = input.LA(1);

                         
                        int index40_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred64_InternalEcl()) ) {s = 43;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_9);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA40_10 = input.LA(1);

                         
                        int index40_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred65_InternalEcl()) ) {s = 44;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_10);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA40_11 = input.LA(1);

                         
                        int index40_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred66_InternalEcl()) ) {s = 45;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_11);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA40_12 = input.LA(1);

                         
                        int index40_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred67_InternalEcl()) ) {s = 46;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_12);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA40_13 = input.LA(1);

                         
                        int index40_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred68_InternalEcl()) ) {s = 47;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_13);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA40_14 = input.LA(1);

                         
                        int index40_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred69_InternalEcl()) ) {s = 48;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_14);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA40_15 = input.LA(1);

                         
                        int index40_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred70_InternalEcl()) ) {s = 49;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_15);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA40_16 = input.LA(1);

                         
                        int index40_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred71_InternalEcl()) ) {s = 50;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_16);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA40_17 = input.LA(1);

                         
                        int index40_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred72_InternalEcl()) ) {s = 51;}

                        else if ( (synpred73_InternalEcl()) ) {s = 18;}

                         
                        input.seek(index40_17);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_40s = "\30\uffff";
    static final String dfa_41s = "\1\12\25\uffff\1\0\1\uffff";
    static final String dfa_42s = "\1\102\25\uffff\1\0\1\uffff";
    static final String dfa_43s = "\1\uffff\1\1\25\uffff\1\2";
    static final String dfa_44s = "\26\uffff\1\0\1\uffff}>";
    static final String[] dfa_45s = {
            "\14\1\6\uffff\1\26\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\27\uffff\6\1",
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
            "\1\uffff",
            ""
    };

    static final short[] dfa_40 = DFA.unpackEncodedString(dfa_40s);
    static final char[] dfa_41 = DFA.unpackEncodedStringToUnsignedChars(dfa_41s);
    static final char[] dfa_42 = DFA.unpackEncodedStringToUnsignedChars(dfa_42s);
    static final short[] dfa_43 = DFA.unpackEncodedString(dfa_43s);
    static final short[] dfa_44 = DFA.unpackEncodedString(dfa_44s);
    static final short[][] dfa_45 = unpackEncodedStringArray(dfa_45s);

    class DFA56 extends DFA {

        public DFA56(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 56;
            this.eot = dfa_40;
            this.eof = dfa_40;
            this.min = dfa_41;
            this.max = dfa_42;
            this.accept = dfa_43;
            this.special = dfa_44;
            this.transition = dfa_45;
        }
        public String getDescription() {
            return "4337:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) )+ this_ROUND_CLOSE_5= RULE_ROUND_CLOSE ) )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA56_22 = input.LA(1);

                         
                        int index56_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred88_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 23;}

                         
                        input.seek(index56_22);
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
    static final String dfa_46s = "\42\uffff";
    static final String dfa_47s = "\1\2\41\uffff";
    static final String dfa_48s = "\1\4\1\12\1\uffff\24\4\1\0\11\4\1\uffff";
    static final String dfa_49s = "\2\102\1\uffff\24\102\1\0\11\102\1\uffff";
    static final String dfa_50s = "\2\uffff\1\2\36\uffff\1\1";
    static final String dfa_51s = "\27\uffff\1\0\12\uffff}>";
    static final String[] dfa_52s = {
            "\3\2\3\uffff\14\2\6\uffff\1\1\2\2\2\uffff\1\2\2\uffff\2\2\27\uffff\6\2",
            "\14\2\6\uffff\1\2\1\uffff\1\2\2\uffff\1\10\3\uffff\1\11\27\uffff\1\3\1\4\1\5\1\6\1\7\1\12",
            "",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\2\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\2\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\41\1\uffff\1\2\1\uffff\1\41\27\uffff\6\41",
            "\6\2\23\uffff\1\27\3\uffff\1\41\1\uffff\1\2\1\uffff\1\41\27\uffff\6\41",
            "\1\uffff",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\2\16\uffff\1\25\1\26\1\2\2\uffff\1\27\3\uffff\1\35\1\uffff\1\2\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            ""
    };

    static final short[] dfa_46 = DFA.unpackEncodedString(dfa_46s);
    static final short[] dfa_47 = DFA.unpackEncodedString(dfa_47s);
    static final char[] dfa_48 = DFA.unpackEncodedStringToUnsignedChars(dfa_48s);
    static final char[] dfa_49 = DFA.unpackEncodedStringToUnsignedChars(dfa_49s);
    static final short[] dfa_50 = DFA.unpackEncodedString(dfa_50s);
    static final short[] dfa_51 = DFA.unpackEncodedString(dfa_51s);
    static final short[][] dfa_52 = unpackEncodedStringArray(dfa_52s);

    class DFA59 extends DFA {

        public DFA59(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 59;
            this.eot = dfa_46;
            this.eof = dfa_47;
            this.min = dfa_48;
            this.max = dfa_49;
            this.accept = dfa_50;
            this.special = dfa_51;
            this.transition = dfa_52;
        }
        public String getDescription() {
            return "4519:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA59_23 = input.LA(1);

                         
                        int index59_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred92_InternalEcl()) ) {s = 33;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index59_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 59, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_53s = "\1\12\1\uffff\1\12\24\4\1\0\11\4\1\uffff";
    static final String dfa_54s = "\1\102\1\uffff\25\102\1\0\11\102\1\uffff";
    static final String dfa_55s = "\1\uffff\1\1\37\uffff\1\2";
    static final String[] dfa_56s = {
            "\14\1\6\uffff\1\2\1\uffff\1\1\2\uffff\1\1\3\uffff\1\1\27\uffff\6\1",
            "",
            "\14\1\6\uffff\1\1\1\uffff\1\1\2\uffff\1\10\3\uffff\1\11\27\uffff\1\3\1\4\1\5\1\6\1\7\1\12",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\20\1\uffff\1\1\1\uffff\1\21\25\uffff\1\23\1\24\1\13\1\14\1\15\1\16\1\17\1\22",
            "\6\1\16\uffff\1\25\1\26\3\uffff\1\27\3\uffff\1\41\1\uffff\1\1\1\uffff\1\41\27\uffff\6\41",
            "\6\1\23\uffff\1\27\3\uffff\1\41\1\uffff\1\1\1\uffff\1\41\27\uffff\6\41",
            "\1\uffff",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            "\6\1\16\uffff\1\25\1\26\1\1\2\uffff\1\27\3\uffff\1\35\1\uffff\1\1\1\uffff\1\36\25\uffff\1\40\1\24\1\30\1\31\1\32\1\33\1\34\1\37",
            ""
    };
    static final char[] dfa_53 = DFA.unpackEncodedStringToUnsignedChars(dfa_53s);
    static final char[] dfa_54 = DFA.unpackEncodedStringToUnsignedChars(dfa_54s);
    static final short[] dfa_55 = DFA.unpackEncodedString(dfa_55s);
    static final short[][] dfa_56 = unpackEncodedStringArray(dfa_56s);

    class DFA64 extends DFA {

        public DFA64(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 64;
            this.eot = dfa_46;
            this.eof = dfa_46;
            this.min = dfa_53;
            this.max = dfa_54;
            this.accept = dfa_55;
            this.special = dfa_51;
            this.transition = dfa_56;
        }
        public String getDescription() {
            return "5271:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint | this_EclConceptReferenceSet_1= ruleEclConceptReferenceSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA64_23 = input.LA(1);

                         
                        int index64_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred97_InternalEcl()) ) {s = 1;}

                        else if ( (true) ) {s = 33;}

                         
                        input.seek(index64_23);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 64, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_57s = "\24\uffff";
    static final String dfa_58s = "\1\1\23\uffff";
    static final String dfa_59s = "\1\4\1\uffff\10\0\12\uffff";
    static final String dfa_60s = "\1\114\1\uffff\10\0\12\uffff";
    static final String dfa_61s = "\1\uffff\1\13\10\uffff\1\11\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_62s = "\2\uffff\1\4\1\1\1\5\1\2\1\6\1\3\1\7\1\0\12\uffff}>";
    static final String[] dfa_63s = {
            "\22\1\2\uffff\2\1\2\uffff\3\1\1\uffff\1\1\1\7\1\uffff\2\1\1\10\17\uffff\1\1\5\uffff\1\12\1\13\1\2\1\3\1\4\1\5\1\6\1\11\7\uffff\3\1",
            "",
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
            ""
    };

    static final short[] dfa_57 = DFA.unpackEncodedString(dfa_57s);
    static final short[] dfa_58 = DFA.unpackEncodedString(dfa_58s);
    static final char[] dfa_59 = DFA.unpackEncodedStringToUnsignedChars(dfa_59s);
    static final char[] dfa_60 = DFA.unpackEncodedStringToUnsignedChars(dfa_60s);
    static final short[] dfa_61 = DFA.unpackEncodedString(dfa_61s);
    static final short[] dfa_62 = DFA.unpackEncodedString(dfa_62s);
    static final short[][] dfa_63 = unpackEncodedStringArray(dfa_63s);

    class DFA69 extends DFA {

        public DFA69(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 69;
            this.eot = dfa_57;
            this.eof = dfa_58;
            this.min = dfa_59;
            this.max = dfa_60;
            this.accept = dfa_61;
            this.special = dfa_62;
            this.transition = dfa_63;
        }
        public String getDescription() {
            return "()* loopback of 5544:3: (this_DIGIT_8= RULE_DIGIT | this_ALPHA_9= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_10= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_11= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_12= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_13= RULE_REVERSED | this_ID_KEYWORD_14= RULE_ID_KEYWORD | this_KEYWORD_15= RULE_KEYWORD | this_DASH_16= RULE_DASH | this_UNDERSCORE_17= RULE_UNDERSCORE )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA69_9 = input.LA(1);

                         
                        int index69_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred115_InternalEcl()) ) {s = 19;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA69_3 = input.LA(1);

                         
                        int index69_3 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred109_InternalEcl()) ) {s = 13;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_3);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA69_5 = input.LA(1);

                         
                        int index69_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred111_InternalEcl()) ) {s = 15;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_5);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA69_7 = input.LA(1);

                         
                        int index69_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred113_InternalEcl()) ) {s = 17;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_7);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA69_2 = input.LA(1);

                         
                        int index69_2 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred108_InternalEcl()) ) {s = 12;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_2);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA69_4 = input.LA(1);

                         
                        int index69_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred110_InternalEcl()) ) {s = 14;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_4);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA69_6 = input.LA(1);

                         
                        int index69_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred112_InternalEcl()) ) {s = 16;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_6);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA69_8 = input.LA(1);

                         
                        int index69_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred114_InternalEcl()) ) {s = 18;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index69_8);
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
    static final String dfa_64s = "\62\uffff";
    static final String dfa_65s = "\1\1\61\uffff";
    static final String dfa_66s = "\1\4\3\uffff\1\0\32\uffff\10\0\13\uffff";
    static final String dfa_67s = "\1\114\3\uffff\1\0\32\uffff\10\0\13\uffff";
    static final String dfa_68s = "\1\uffff\1\13\46\uffff\1\12\1\11\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10";
    static final String dfa_69s = "\4\uffff\1\0\32\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\13\uffff}>";
    static final String[] dfa_70s = {
            "\5\1\1\4\14\1\2\uffff\2\1\2\uffff\3\1\1\uffff\1\1\1\44\1\uffff\2\1\1\45\17\uffff\1\1\5\uffff\1\50\1\uffff\1\37\1\40\1\41\1\42\1\43\1\46\7\uffff\3\1",
            "",
            "",
            "",
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
            ""
    };

    static final short[] dfa_64 = DFA.unpackEncodedString(dfa_64s);
    static final short[] dfa_65 = DFA.unpackEncodedString(dfa_65s);
    static final char[] dfa_66 = DFA.unpackEncodedStringToUnsignedChars(dfa_66s);
    static final char[] dfa_67 = DFA.unpackEncodedStringToUnsignedChars(dfa_67s);
    static final short[] dfa_68 = DFA.unpackEncodedString(dfa_68s);
    static final short[] dfa_69 = DFA.unpackEncodedString(dfa_69s);
    static final short[][] dfa_70 = unpackEncodedStringArray(dfa_70s);

    class DFA72 extends DFA {

        public DFA72(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 72;
            this.eot = dfa_64;
            this.eof = dfa_65;
            this.min = dfa_66;
            this.max = dfa_67;
            this.accept = dfa_68;
            this.special = dfa_69;
            this.transition = dfa_70;
        }
        public String getDescription() {
            return "()+ loopback of 5810:2: (this_DIGIT_0= RULE_DIGIT | this_ALPHA_1= RULE_ALPHA | this_CONCEPT_SHORT_KEYWORD_2= RULE_CONCEPT_SHORT_KEYWORD | this_DESCRIPTION_SHORT_KEYWORD_3= RULE_DESCRIPTION_SHORT_KEYWORD | this_MEMBER_SHORT_KEYWORD_4= RULE_MEMBER_SHORT_KEYWORD | this_REVERSED_5= RULE_REVERSED | this_ID_KEYWORD_6= RULE_ID_KEYWORD | this_KEYWORD_7= RULE_KEYWORD | this_DOT_8= RULE_DOT | this_DASH_9= RULE_DASH )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA72_4 = input.LA(1);

                         
                        int index72_4 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred141_InternalEcl()) ) {s = 41;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_4);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA72_31 = input.LA(1);

                         
                        int index72_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred133_InternalEcl()) ) {s = 42;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_31);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA72_32 = input.LA(1);

                         
                        int index72_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred134_InternalEcl()) ) {s = 43;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_32);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA72_33 = input.LA(1);

                         
                        int index72_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred135_InternalEcl()) ) {s = 44;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_33);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA72_34 = input.LA(1);

                         
                        int index72_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred136_InternalEcl()) ) {s = 45;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_34);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA72_35 = input.LA(1);

                         
                        int index72_35 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred137_InternalEcl()) ) {s = 46;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_35);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA72_36 = input.LA(1);

                         
                        int index72_36 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred138_InternalEcl()) ) {s = 47;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_36);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA72_37 = input.LA(1);

                         
                        int index72_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred139_InternalEcl()) ) {s = 48;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_37);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA72_38 = input.LA(1);

                         
                        int index72_38 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred140_InternalEcl()) ) {s = 49;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index72_38);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 72, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0xE0000022503FFC00L,0x0000000000000007L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000062L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000082L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000102L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xE0000022D07FFC00L,0x0000000000000007L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000202L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xE0000022507FFC00L,0x0000000000000007L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x85DFFFE2400000B0L,0x00000000000003FFL});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000003000002L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0xE800002208000200L,0x0000000000000007L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0xE000002200000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xE000002220000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0020000000011002L,0x0000000000001C00L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x2000000040000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C018000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x2A00000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x85DFFFE2500000B0L,0x00000000000003FFL});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000011000L,0x0000000000001C00L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000400L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xE000006210000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0xE000002210000000L,0x0000000000000007L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x000000C008000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x000000C028000000L,0x0000000000000060L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x85DFFFE2600000B0L,0x00000000000003FFL});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xE0000022703FFC00L,0x0000000000000007L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2800000010000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x2800000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x2800000020000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0xE0000022503FFC02L,0x0000000000000007L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000018L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0020000000000000L});
        public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0400000000000000L});
        public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xF8000032503FFC00L,0x0000000000000007L});
        public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000380L});
        public static final BitSet FOLLOW_53 = new BitSet(new long[]{0xF800002200000002L,0x0000000000000007L});
        public static final BitSet FOLLOW_54 = new BitSet(new long[]{0xE800002200000002L,0x0000000000000007L});
        public static final BitSet FOLLOW_55 = new BitSet(new long[]{0xE800002200000202L,0x0000000000000007L});
        public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x2000000000000002L});
        public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000200L});
        public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x2800000000000002L,0x0000000000000004L});
    }


}