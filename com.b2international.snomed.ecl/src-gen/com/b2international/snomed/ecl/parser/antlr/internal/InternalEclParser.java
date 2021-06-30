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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CaseSignificanceId", "LanguageRefSetId", "EffectiveTime", "AcceptableIn", "Description", "PreferredIn", "SemanticTag", "DialectId", "Language", "ModuleId", "Concept", "Dialect", "Active", "TypeId", "MINUS", "Exact", "False", "Match", "Regex", "Term", "True", "Type", "Wild", "AND", "OR", "RULE_TERM_STRING", "RULE_REVERSED", "RULE_TO", "RULE_COMMA", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_HASH", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_ALPHA", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int RULE_DIGIT_NONZERO=34;
    public static final int RULE_CURLY_OPEN=36;
    public static final int RULE_TO=31;
    public static final int RULE_ROUND_CLOSE=39;
    public static final int RULE_DBL_GT=52;
    public static final int True=24;
    public static final int RULE_GT=50;
    public static final int False=20;
    public static final int DialectId=11;
    public static final int MINUS=18;
    public static final int RULE_GTE=57;
    public static final int ModuleId=13;
    public static final int Regex=22;
    public static final int RULE_ROUND_OPEN=38;
    public static final int RULE_DBL_LT=51;
    public static final int RULE_NOT_EQUAL=48;
    public static final int Concept=14;
    public static final int AcceptableIn=7;
    public static final int TypeId=17;
    public static final int RULE_SQUARE_CLOSE=41;
    public static final int RULE_SQUARE_OPEN=40;
    public static final int RULE_EQUAL=47;
    public static final int RULE_COMMA=32;
    public static final int RULE_LT_EM=53;
    public static final int RULE_CURLY_CLOSE=37;
    public static final int RULE_ZERO=33;
    public static final int RULE_DBL_GT_EM=56;
    public static final int Term=23;
    public static final int RULE_COLON=35;
    public static final int RULE_LT=49;
    public static final int Active=16;
    public static final int RULE_DOUBLE_CURLY_CLOSE=61;
    public static final int AND=27;
    public static final int RULE_ML_COMMENT=64;
    public static final int SemanticTag=10;
    public static final int RULE_LTE=58;
    public static final int RULE_ALPHA=62;
    public static final int Description=8;
    public static final int Wild=26;
    public static final int EffectiveTime=6;
    public static final int RULE_STRING=66;
    public static final int RULE_REVERSED=30;
    public static final int Match=21;
    public static final int RULE_SL_COMMENT=65;
    public static final int PreferredIn=9;
    public static final int RULE_HASH=59;
    public static final int Language=12;
    public static final int RULE_DASH=43;
    public static final int Dialect=15;
    public static final int RULE_PLUS=42;
    public static final int Exact=19;
    public static final int RULE_DOT=45;
    public static final int EOF=-1;
    public static final int OR=28;
    public static final int RULE_GT_EM=55;
    public static final int RULE_WS=63;
    public static final int RULE_CARET=44;
    public static final int Type=25;
    public static final int RULE_DOUBLE_CURLY_OPEN=60;
    public static final int RULE_WILDCARD=46;
    public static final int LanguageRefSetId=5;
    public static final int RULE_TERM_STRING=29;
    public static final int RULE_DBL_LT_EM=54;
    public static final int CaseSignificanceId=4;

    // delegates
    // delegators


        public InternalEclParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEclParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEclParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEclParser.g"; }



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
    // InternalEclParser.g:75:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // InternalEclParser.g:75:47: (iv_ruleScript= ruleScript EOF )
            // InternalEclParser.g:76:2: iv_ruleScript= ruleScript EOF
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
    // InternalEclParser.g:82:1: ruleScript returns [EObject current=null] : ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? ) ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:88:2: ( ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? ) )
            // InternalEclParser.g:89:2: ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? )
            {
            // InternalEclParser.g:89:2: ( () ( (lv_constraint_1_0= ruleExpressionConstraint ) )? )
            // InternalEclParser.g:90:3: () ( (lv_constraint_1_0= ruleExpressionConstraint ) )?
            {
            // InternalEclParser.g:90:3: ()
            // InternalEclParser.g:91:4: 
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

            // InternalEclParser.g:100:3: ( (lv_constraint_1_0= ruleExpressionConstraint ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=RULE_ZERO && LA1_0<=RULE_DIGIT_NONZERO)||LA1_0==RULE_ROUND_OPEN||LA1_0==RULE_CARET||LA1_0==RULE_WILDCARD||(LA1_0>=RULE_LT && LA1_0<=RULE_DBL_GT_EM)) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalEclParser.g:101:4: (lv_constraint_1_0= ruleExpressionConstraint )
                    {
                    // InternalEclParser.g:101:4: (lv_constraint_1_0= ruleExpressionConstraint )
                    // InternalEclParser.g:102:5: lv_constraint_1_0= ruleExpressionConstraint
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
    // InternalEclParser.g:123:1: entryRuleExpressionConstraint returns [EObject current=null] : iv_ruleExpressionConstraint= ruleExpressionConstraint EOF ;
    public final EObject entryRuleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpressionConstraint = null;


        try {
            // InternalEclParser.g:123:61: (iv_ruleExpressionConstraint= ruleExpressionConstraint EOF )
            // InternalEclParser.g:124:2: iv_ruleExpressionConstraint= ruleExpressionConstraint EOF
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
    // InternalEclParser.g:130:1: ruleExpressionConstraint returns [EObject current=null] : this_OrExpressionConstraint_0= ruleOrExpressionConstraint ;
    public final EObject ruleExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_OrExpressionConstraint_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:136:2: (this_OrExpressionConstraint_0= ruleOrExpressionConstraint )
            // InternalEclParser.g:137:2: this_OrExpressionConstraint_0= ruleOrExpressionConstraint
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
    // InternalEclParser.g:151:1: entryRuleOrExpressionConstraint returns [EObject current=null] : iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF ;
    public final EObject entryRuleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpressionConstraint = null;


        try {
            // InternalEclParser.g:151:63: (iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF )
            // InternalEclParser.g:152:2: iv_ruleOrExpressionConstraint= ruleOrExpressionConstraint EOF
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
    // InternalEclParser.g:158:1: ruleOrExpressionConstraint returns [EObject current=null] : (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) ;
    public final EObject ruleOrExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_AndExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:164:2: ( (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:165:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:165:2: (this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )* )
            // InternalEclParser.g:166:3: this_AndExpressionConstraint_0= ruleAndExpressionConstraint ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
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
            // InternalEclParser.g:177:3: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==OR) ) {
                    int LA2_5 = input.LA(2);

                    if ( (synpred2_InternalEclParser()) ) {
                        alt2=1;
                    }


                }


                switch (alt2) {
            	case 1 :
            	    // InternalEclParser.g:178:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:178:4: ()
            	    // InternalEclParser.g:179:5: 
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

            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_4);
            	    ruleDISJUNCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEclParser.g:198:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
            	    // InternalEclParser.g:199:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    {
            	    // InternalEclParser.g:199:5: (lv_right_3_0= ruleAndExpressionConstraint )
            	    // InternalEclParser.g:200:6: lv_right_3_0= ruleAndExpressionConstraint
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
    // InternalEclParser.g:222:1: entryRuleAndExpressionConstraint returns [EObject current=null] : iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF ;
    public final EObject entryRuleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpressionConstraint = null;


        try {
            // InternalEclParser.g:222:64: (iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF )
            // InternalEclParser.g:223:2: iv_ruleAndExpressionConstraint= ruleAndExpressionConstraint EOF
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
    // InternalEclParser.g:229:1: ruleAndExpressionConstraint returns [EObject current=null] : (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) ;
    public final EObject ruleAndExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_ExclusionExpressionConstraint_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:235:2: ( (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:236:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:236:2: (this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )* )
            // InternalEclParser.g:237:3: this_ExclusionExpressionConstraint_0= ruleExclusionExpressionConstraint ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
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
            // InternalEclParser.g:248:3: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==AND) ) {
                    int LA4_4 = input.LA(2);

                    if ( (synpred4_InternalEclParser()) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_COMMA) ) {
                    int LA4_5 = input.LA(2);

                    if ( (synpred4_InternalEclParser()) ) {
                        alt4=1;
                    }


                }


                switch (alt4) {
            	case 1 :
            	    // InternalEclParser.g:249:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:249:4: ()
            	    // InternalEclParser.g:250:5: 
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

            	    // InternalEclParser.g:259:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==AND) ) {
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
            	            // InternalEclParser.g:260:5: ruleCONJUNCTION
            	            {
            	            if ( state.backtracking==0 ) {

            	              					/* */
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_4);
            	            ruleCONJUNCTION();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEclParser.g:271:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_4); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:276:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
            	    // InternalEclParser.g:277:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    {
            	    // InternalEclParser.g:277:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
            	    // InternalEclParser.g:278:6: lv_right_4_0= ruleExclusionExpressionConstraint
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
    // InternalEclParser.g:300:1: entryRuleExclusionExpressionConstraint returns [EObject current=null] : iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF ;
    public final EObject entryRuleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionExpressionConstraint = null;


        try {
            // InternalEclParser.g:300:70: (iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF )
            // InternalEclParser.g:301:2: iv_ruleExclusionExpressionConstraint= ruleExclusionExpressionConstraint EOF
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
    // InternalEclParser.g:307:1: ruleExclusionExpressionConstraint returns [EObject current=null] : (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) ;
    public final EObject ruleExclusionExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_RefinedExpressionConstraint_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:313:2: ( (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? ) )
            // InternalEclParser.g:314:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            {
            // InternalEclParser.g:314:2: (this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )? )
            // InternalEclParser.g:315:3: this_RefinedExpressionConstraint_0= ruleRefinedExpressionConstraint ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
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
            // InternalEclParser.g:326:3: ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==MINUS) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEclParser.g:327:4: () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    {
                    // InternalEclParser.g:327:4: ()
                    // InternalEclParser.g:328:5: 
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

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_4);
                    ruleEXCLUSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalEclParser.g:347:4: ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
                    // InternalEclParser.g:348:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    {
                    // InternalEclParser.g:348:5: (lv_right_3_0= ruleRefinedExpressionConstraint )
                    // InternalEclParser.g:349:6: lv_right_3_0= ruleRefinedExpressionConstraint
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
    // InternalEclParser.g:371:1: entryRuleRefinedExpressionConstraint returns [EObject current=null] : iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF ;
    public final EObject entryRuleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefinedExpressionConstraint = null;


        try {
            // InternalEclParser.g:371:68: (iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF )
            // InternalEclParser.g:372:2: iv_ruleRefinedExpressionConstraint= ruleRefinedExpressionConstraint EOF
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
    // InternalEclParser.g:378:1: ruleRefinedExpressionConstraint returns [EObject current=null] : (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) ;
    public final EObject ruleRefinedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        EObject this_DottedExpressionConstraint_0 = null;

        EObject lv_refinement_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:384:2: ( (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? ) )
            // InternalEclParser.g:385:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            {
            // InternalEclParser.g:385:2: (this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )? )
            // InternalEclParser.g:386:3: this_DottedExpressionConstraint_0= ruleDottedExpressionConstraint ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
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
            // InternalEclParser.g:397:3: ( () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_COLON) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEclParser.g:398:4: () this_COLON_2= RULE_COLON ( (lv_refinement_3_0= ruleEclRefinement ) )
                    {
                    // InternalEclParser.g:398:4: ()
                    // InternalEclParser.g:399:5: 
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
                    // InternalEclParser.g:412:4: ( (lv_refinement_3_0= ruleEclRefinement ) )
                    // InternalEclParser.g:413:5: (lv_refinement_3_0= ruleEclRefinement )
                    {
                    // InternalEclParser.g:413:5: (lv_refinement_3_0= ruleEclRefinement )
                    // InternalEclParser.g:414:6: lv_refinement_3_0= ruleEclRefinement
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
    // InternalEclParser.g:436:1: entryRuleDottedExpressionConstraint returns [EObject current=null] : iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF ;
    public final EObject entryRuleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDottedExpressionConstraint = null;


        try {
            // InternalEclParser.g:436:67: (iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF )
            // InternalEclParser.g:437:2: iv_ruleDottedExpressionConstraint= ruleDottedExpressionConstraint EOF
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
    // InternalEclParser.g:443:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_FilteredExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:449:2: ( (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:450:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:450:2: (this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )* )
            // InternalEclParser.g:451:3: this_FilteredExpressionConstraint_0= ruleFilteredExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
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
            // InternalEclParser.g:462:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEclParser.g:463:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    {
            	    // InternalEclParser.g:463:4: ()
            	    // InternalEclParser.g:464:5: 
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
            	    // InternalEclParser.g:477:4: ( (lv_attribute_3_0= ruleFilteredExpressionConstraint ) )
            	    // InternalEclParser.g:478:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    {
            	    // InternalEclParser.g:478:5: (lv_attribute_3_0= ruleFilteredExpressionConstraint )
            	    // InternalEclParser.g:479:6: lv_attribute_3_0= ruleFilteredExpressionConstraint
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
    // InternalEclParser.g:501:1: entryRuleFilteredExpressionConstraint returns [EObject current=null] : iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF ;
    public final EObject entryRuleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilteredExpressionConstraint = null;


        try {
            // InternalEclParser.g:501:69: (iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF )
            // InternalEclParser.g:502:2: iv_ruleFilteredExpressionConstraint= ruleFilteredExpressionConstraint EOF
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
    // InternalEclParser.g:508:1: ruleFilteredExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) ;
    public final EObject ruleFilteredExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_filter_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:514:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* ) )
            // InternalEclParser.g:515:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            {
            // InternalEclParser.g:515:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )* )
            // InternalEclParser.g:516:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
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
            // InternalEclParser.g:527:3: ( () ( (lv_filter_2_0= ruleFilterConstraint ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_DOUBLE_CURLY_OPEN) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalEclParser.g:528:4: () ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    {
            	    // InternalEclParser.g:528:4: ()
            	    // InternalEclParser.g:529:5: 
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

            	    // InternalEclParser.g:538:4: ( (lv_filter_2_0= ruleFilterConstraint ) )
            	    // InternalEclParser.g:539:5: (lv_filter_2_0= ruleFilterConstraint )
            	    {
            	    // InternalEclParser.g:539:5: (lv_filter_2_0= ruleFilterConstraint )
            	    // InternalEclParser.g:540:6: lv_filter_2_0= ruleFilterConstraint
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


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalEclParser.g:562:1: entryRuleSubExpressionConstraint returns [EObject current=null] : iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF ;
    public final EObject entryRuleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpressionConstraint = null;


        try {
            // InternalEclParser.g:562:64: (iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF )
            // InternalEclParser.g:563:2: iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF
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
    // InternalEclParser.g:569:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) ;
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
            // InternalEclParser.g:575:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept ) )
            // InternalEclParser.g:576:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            {
            // InternalEclParser.g:576:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept )
            int alt9=9;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt9=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt9=2;
                }
                break;
            case RULE_LT:
                {
                alt9=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt9=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt9=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt9=6;
                }
                break;
            case RULE_GT:
                {
                alt9=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt9=8;
                }
                break;
            case RULE_ZERO:
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt9=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEclParser.g:577:3: this_ChildOf_0= ruleChildOf
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
                    // InternalEclParser.g:589:3: this_ChildOrSelfOf_1= ruleChildOrSelfOf
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
                    // InternalEclParser.g:601:3: this_DescendantOf_2= ruleDescendantOf
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
                    // InternalEclParser.g:613:3: this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf
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
                    // InternalEclParser.g:625:3: this_ParentOf_4= ruleParentOf
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
                    // InternalEclParser.g:637:3: this_ParentOrSelfOf_5= ruleParentOrSelfOf
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
                    // InternalEclParser.g:649:3: this_AncestorOf_6= ruleAncestorOf
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
                    // InternalEclParser.g:661:3: this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf
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
                    // InternalEclParser.g:673:3: this_EclFocusConcept_8= ruleEclFocusConcept
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
    // InternalEclParser.g:688:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalEclParser.g:688:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalEclParser.g:689:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
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
    // InternalEclParser.g:695:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_EclConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:701:2: ( (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // InternalEclParser.g:702:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // InternalEclParser.g:702:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt10=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt10=1;
                }
                break;
            case RULE_ZERO:
            case RULE_DIGIT_NONZERO:
                {
                alt10=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt10=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt10=4;
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
                    // InternalEclParser.g:703:3: this_MemberOf_0= ruleMemberOf
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
                    // InternalEclParser.g:715:3: this_EclConceptReference_1= ruleEclConceptReference
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
                    // InternalEclParser.g:727:3: this_Any_2= ruleAny
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
                    // InternalEclParser.g:739:3: this_NestedExpression_3= ruleNestedExpression
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
    // InternalEclParser.g:754:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalEclParser.g:754:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalEclParser.g:755:2: iv_ruleChildOf= ruleChildOf EOF
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
    // InternalEclParser.g:761:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:767:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:768:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:768:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:769:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:773:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:774:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:774:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:775:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:796:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalEclParser.g:796:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalEclParser.g:797:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
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
    // InternalEclParser.g:803:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:809:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:810:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:810:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:811:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:815:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:816:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:816:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:817:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:838:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalEclParser.g:838:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalEclParser.g:839:2: iv_ruleDescendantOf= ruleDescendantOf EOF
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
    // InternalEclParser.g:845:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:851:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:852:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:852:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:853:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:857:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:858:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:858:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:859:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:880:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalEclParser.g:880:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalEclParser.g:881:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
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
    // InternalEclParser.g:887:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:893:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:894:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:894:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:895:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:899:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:900:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:900:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:901:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:922:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalEclParser.g:922:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalEclParser.g:923:2: iv_ruleParentOf= ruleParentOf EOF
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
    // InternalEclParser.g:929:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:935:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:936:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:936:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:937:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:941:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:942:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:942:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:943:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:964:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalEclParser.g:964:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalEclParser.g:965:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
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
    // InternalEclParser.g:971:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:977:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:978:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:978:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:979:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:983:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:984:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:984:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:985:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:1006:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalEclParser.g:1006:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalEclParser.g:1007:2: iv_ruleAncestorOf= ruleAncestorOf EOF
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
    // InternalEclParser.g:1013:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1019:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:1020:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:1020:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:1021:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1025:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:1026:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:1026:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:1027:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:1048:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalEclParser.g:1048:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalEclParser.g:1049:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
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
    // InternalEclParser.g:1055:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1061:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:1062:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:1062:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:1063:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1067:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:1068:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:1068:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:1069:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:1090:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalEclParser.g:1090:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalEclParser.g:1091:2: iv_ruleMemberOf= ruleMemberOf EOF
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
    // InternalEclParser.g:1097:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1103:2: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalEclParser.g:1104:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalEclParser.g:1104:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalEclParser.g:1105:3: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1109:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalEclParser.g:1110:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalEclParser.g:1110:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalEclParser.g:1111:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalEclParser.g:1111:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt11=3;
            switch ( input.LA(1) ) {
            case RULE_ZERO:
            case RULE_DIGIT_NONZERO:
                {
                alt11=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt11=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt11=3;
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
                    // InternalEclParser.g:1112:6: lv_constraint_1_1= ruleEclConceptReference
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
                    // InternalEclParser.g:1128:6: lv_constraint_1_2= ruleAny
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
                    // InternalEclParser.g:1144:6: lv_constraint_1_3= ruleNestedExpression
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
    // InternalEclParser.g:1166:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEclParser.g:1166:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEclParser.g:1167:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
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
    // InternalEclParser.g:1173:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1179:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) )
            // InternalEclParser.g:1180:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            {
            // InternalEclParser.g:1180:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            // InternalEclParser.g:1181:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )?
            {
            // InternalEclParser.g:1181:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalEclParser.g:1182:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalEclParser.g:1182:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalEclParser.g:1183:5: lv_id_0_0= ruleSnomedIdentifier
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

            // InternalEclParser.g:1200:3: ( (lv_term_1_0= RULE_TERM_STRING ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_TERM_STRING) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEclParser.g:1201:4: (lv_term_1_0= RULE_TERM_STRING )
                    {
                    // InternalEclParser.g:1201:4: (lv_term_1_0= RULE_TERM_STRING )
                    // InternalEclParser.g:1202:5: lv_term_1_0= RULE_TERM_STRING
                    {
                    lv_term_1_0=(Token)match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_term_1_0, grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEclConceptReferenceRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"term",
                      						lv_term_1_0,
                      						"com.b2international.snomed.ecl.Ecl.TERM_STRING");
                      				
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
    // InternalEclParser.g:1222:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEclParser.g:1222:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEclParser.g:1223:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
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
    // InternalEclParser.g:1229:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_3=null;
        EObject lv_concepts_1_0 = null;

        EObject lv_concepts_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1235:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1236:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1236:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1237:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1241:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )
            // InternalEclParser.g:1242:4: (lv_concepts_1_0= ruleEclConceptReference )
            {
            // InternalEclParser.g:1242:4: (lv_concepts_1_0= ruleEclConceptReference )
            // InternalEclParser.g:1243:5: lv_concepts_1_0= ruleEclConceptReference
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

            // InternalEclParser.g:1260:3: ( (lv_concepts_2_0= ruleEclConceptReference ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ZERO && LA13_0<=RULE_DIGIT_NONZERO)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEclParser.g:1261:4: (lv_concepts_2_0= ruleEclConceptReference )
            	    {
            	    // InternalEclParser.g:1261:4: (lv_concepts_2_0= ruleEclConceptReference )
            	    // InternalEclParser.g:1262:5: lv_concepts_2_0= ruleEclConceptReference
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEclConceptReferenceSetAccess().getConceptsEclConceptReferenceParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_13);
            	    lv_concepts_2_0=ruleEclConceptReference();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEclConceptReferenceSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"concepts",
            	      						lv_concepts_2_0,
            	      						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            this_ROUND_CLOSE_3=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getEclConceptReferenceSetAccess().getROUND_CLOSETerminalRuleCall_3());
              		
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
    // InternalEclParser.g:1287:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEclParser.g:1287:44: (iv_ruleAny= ruleAny EOF )
            // InternalEclParser.g:1288:2: iv_ruleAny= ruleAny EOF
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
    // InternalEclParser.g:1294:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEclParser.g:1300:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEclParser.g:1301:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEclParser.g:1301:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEclParser.g:1302:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1306:3: ()
            // InternalEclParser.g:1307:4: 
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
    // InternalEclParser.g:1320:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEclParser.g:1320:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEclParser.g:1321:2: iv_ruleEclRefinement= ruleEclRefinement EOF
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
    // InternalEclParser.g:1327:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1333:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEclParser.g:1334:2: this_OrRefinement_0= ruleOrRefinement
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
    // InternalEclParser.g:1348:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEclParser.g:1348:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEclParser.g:1349:2: iv_ruleOrRefinement= ruleOrRefinement EOF
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
    // InternalEclParser.g:1355:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1361:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEclParser.g:1362:2: (this_AndRefinement_0= ruleAndRefinement ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEclParser.g:1362:2: (this_AndRefinement_0= ruleAndRefinement ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEclParser.g:1363:3: this_AndRefinement_0= ruleAndRefinement ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
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
            // InternalEclParser.g:1374:3: ( ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    int LA14_4 = input.LA(2);

                    if ( (synpred24_InternalEclParser()) ) {
                        alt14=1;
                    }


                }


                switch (alt14) {
            	case 1 :
            	    // InternalEclParser.g:1375:4: ( OR )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEclParser.g:1376:4: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEclParser.g:1377:5: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEclParser.g:1377:5: ()
            	    // InternalEclParser.g:1378:6: 
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

            	    if ( state.backtracking==0 ) {

            	      					/* */
            	      				
            	    }
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getOrRefinementAccess().getDISJUNCTIONParserRuleCall_1_0_1());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_8);
            	    ruleDISJUNCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					afterParserOrEnumRuleCall();
            	      				
            	    }
            	    // InternalEclParser.g:1397:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEclParser.g:1398:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEclParser.g:1398:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEclParser.g:1399:7: lv_right_3_0= ruleAndRefinement
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
            	    break loop14;
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
    // InternalEclParser.g:1422:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEclParser.g:1422:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEclParser.g:1423:2: iv_ruleAndRefinement= ruleAndRefinement EOF
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
    // InternalEclParser.g:1429:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1435:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEclParser.g:1436:2: (this_SubRefinement_0= ruleSubRefinement ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEclParser.g:1436:2: (this_SubRefinement_0= ruleSubRefinement ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEclParser.g:1437:3: this_SubRefinement_0= ruleSubRefinement ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
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
            // InternalEclParser.g:1448:3: ( ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    int LA16_3 = input.LA(2);

                    if ( (synpred26_InternalEclParser()) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==RULE_COMMA) ) {
                    int LA16_4 = input.LA(2);

                    if ( (synpred26_InternalEclParser()) ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // InternalEclParser.g:1449:4: ( AND | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEclParser.g:1450:4: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEclParser.g:1451:5: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEclParser.g:1451:5: ()
            	    // InternalEclParser.g:1452:6: 
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

            	    // InternalEclParser.g:1461:5: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==AND) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==RULE_COMMA) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalEclParser.g:1462:6: ruleCONJUNCTION
            	            {
            	            if ( state.backtracking==0 ) {

            	              						/* */
            	              					
            	            }
            	            if ( state.backtracking==0 ) {

            	              						newCompositeNode(grammarAccess.getAndRefinementAccess().getCONJUNCTIONParserRuleCall_1_0_1_0());
            	              					
            	            }
            	            pushFollow(FollowSets000.FOLLOW_8);
            	            ruleCONJUNCTION();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						afterParserOrEnumRuleCall();
            	              					
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEclParser.g:1473:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:1478:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEclParser.g:1479:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEclParser.g:1479:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEclParser.g:1480:7: lv_right_4_0= ruleSubRefinement
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
            	    break loop16;
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
    // InternalEclParser.g:1503:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEclParser.g:1503:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEclParser.g:1504:2: iv_ruleSubRefinement= ruleSubRefinement EOF
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
    // InternalEclParser.g:1510:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1516:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEclParser.g:1517:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEclParser.g:1517:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt17=3;
            alt17 = dfa17.predict(input);
            switch (alt17) {
                case 1 :
                    // InternalEclParser.g:1518:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEclParser.g:1530:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
                    // InternalEclParser.g:1542:3: this_NestedRefinement_2= ruleNestedRefinement
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
    // InternalEclParser.g:1557:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEclParser.g:1557:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEclParser.g:1558:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
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
    // InternalEclParser.g:1564:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1570:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1571:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1571:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1572:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1576:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEclParser.g:1577:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEclParser.g:1577:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEclParser.g:1578:5: lv_nested_1_0= ruleEclRefinement
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
    // InternalEclParser.g:1603:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEclParser.g:1603:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEclParser.g:1604:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
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
    // InternalEclParser.g:1610:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1616:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEclParser.g:1617:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEclParser.g:1617:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEclParser.g:1618:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEclParser.g:1618:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_SQUARE_OPEN) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEclParser.g:1619:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1619:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1620:5: lv_cardinality_0_0= ruleCardinality
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
            // InternalEclParser.g:1641:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEclParser.g:1642:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEclParser.g:1642:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEclParser.g:1643:5: lv_refinement_2_0= ruleEclAttributeSet
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
    // InternalEclParser.g:1668:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEclParser.g:1668:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEclParser.g:1669:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
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
    // InternalEclParser.g:1675:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1681:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEclParser.g:1682:2: this_OrAttributeSet_0= ruleOrAttributeSet
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
    // InternalEclParser.g:1696:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEclParser.g:1696:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEclParser.g:1697:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
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
    // InternalEclParser.g:1703:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1709:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEclParser.g:1710:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEclParser.g:1710:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEclParser.g:1711:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
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
            // InternalEclParser.g:1722:3: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==OR) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEclParser.g:1723:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEclParser.g:1723:4: ()
            	    // InternalEclParser.g:1724:5: 
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

            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_16);
            	    ruleDISJUNCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEclParser.g:1743:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEclParser.g:1744:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEclParser.g:1744:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEclParser.g:1745:6: lv_right_3_0= ruleAndAttributeSet
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
            	    break loop19;
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
    // InternalEclParser.g:1767:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEclParser.g:1767:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEclParser.g:1768:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
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
    // InternalEclParser.g:1774:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1780:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEclParser.g:1781:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEclParser.g:1781:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEclParser.g:1782:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
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
            // InternalEclParser.g:1793:3: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==AND||LA21_0==RULE_COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEclParser.g:1794:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEclParser.g:1794:4: ()
            	    // InternalEclParser.g:1795:5: 
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

            	    // InternalEclParser.g:1804:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==AND) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==RULE_COMMA) ) {
            	        alt20=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalEclParser.g:1805:5: ruleCONJUNCTION
            	            {
            	            if ( state.backtracking==0 ) {

            	              					/* */
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_16);
            	            ruleCONJUNCTION();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEclParser.g:1816:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:1821:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEclParser.g:1822:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEclParser.g:1822:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEclParser.g:1823:6: lv_right_4_0= ruleSubAttributeSet
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
            	    break loop21;
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
    // InternalEclParser.g:1845:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEclParser.g:1845:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEclParser.g:1846:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
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
    // InternalEclParser.g:1852:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1858:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEclParser.g:1859:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEclParser.g:1859:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt22=2;
            alt22 = dfa22.predict(input);
            switch (alt22) {
                case 1 :
                    // InternalEclParser.g:1860:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEclParser.g:1872:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
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
    // InternalEclParser.g:1887:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEclParser.g:1887:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEclParser.g:1888:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
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
    // InternalEclParser.g:1894:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1900:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1901:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1901:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1902:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1906:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEclParser.g:1907:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEclParser.g:1907:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEclParser.g:1908:5: lv_nested_1_0= ruleEclAttributeSet
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
    // InternalEclParser.g:1933:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEclParser.g:1933:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEclParser.g:1934:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
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
    // InternalEclParser.g:1940:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1946:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? ) )
            // InternalEclParser.g:1947:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            {
            // InternalEclParser.g:1947:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )? )
            // InternalEclParser.g:1948:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )?
            {
            // InternalEclParser.g:1948:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_SQUARE_OPEN) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEclParser.g:1949:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1949:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1950:5: lv_cardinality_0_0= ruleCardinality
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

            // InternalEclParser.g:1967:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_REVERSED) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:1968:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEclParser.g:1968:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEclParser.g:1969:5: lv_reversed_1_0= RULE_REVERSED
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

            // InternalEclParser.g:1985:3: ( (lv_attribute_2_0= ruleFilteredExpressionConstraint ) )
            // InternalEclParser.g:1986:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            {
            // InternalEclParser.g:1986:4: (lv_attribute_2_0= ruleFilteredExpressionConstraint )
            // InternalEclParser.g:1987:5: lv_attribute_2_0= ruleFilteredExpressionConstraint
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

            // InternalEclParser.g:2004:3: ( (lv_comparison_3_0= ruleComparison ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_EQUAL && LA25_0<=RULE_GT)||(LA25_0>=RULE_GTE && LA25_0<=RULE_LTE)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalEclParser.g:2005:4: (lv_comparison_3_0= ruleComparison )
                    {
                    // InternalEclParser.g:2005:4: (lv_comparison_3_0= ruleComparison )
                    // InternalEclParser.g:2006:5: lv_comparison_3_0= ruleComparison
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
    // InternalEclParser.g:2027:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEclParser.g:2027:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEclParser.g:2028:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalEclParser.g:2034:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2040:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEclParser.g:2041:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEclParser.g:2041:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEclParser.g:2042:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:2046:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEclParser.g:2047:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEclParser.g:2047:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEclParser.g:2048:5: lv_min_1_0= ruleNonNegativeInteger
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
            // InternalEclParser.g:2069:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEclParser.g:2070:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEclParser.g:2070:4: (lv_max_3_0= ruleMaxValue )
            // InternalEclParser.g:2071:5: lv_max_3_0= ruleMaxValue
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
    // InternalEclParser.g:2096:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEclParser.g:2096:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEclParser.g:2097:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEclParser.g:2103:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2109:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEclParser.g:2110:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEclParser.g:2110:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt26=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA26_1 = input.LA(2);

                if ( (LA26_1==False||LA26_1==True||LA26_1==RULE_HASH||LA26_1==RULE_STRING) ) {
                    alt26=2;
                }
                else if ( ((LA26_1>=RULE_ZERO && LA26_1<=RULE_DIGIT_NONZERO)||LA26_1==RULE_ROUND_OPEN||LA26_1==RULE_CARET||LA26_1==RULE_WILDCARD||(LA26_1>=RULE_LT && LA26_1<=RULE_DBL_GT_EM)) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==False||LA26_2==True||LA26_2==RULE_HASH||LA26_2==RULE_STRING) ) {
                    alt26=2;
                }
                else if ( ((LA26_2>=RULE_ZERO && LA26_2<=RULE_DIGIT_NONZERO)||LA26_2==RULE_ROUND_OPEN||LA26_2==RULE_CARET||LA26_2==RULE_WILDCARD||(LA26_2>=RULE_LT && LA26_2<=RULE_DBL_GT_EM)) ) {
                    alt26=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt26=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // InternalEclParser.g:2111:3: this_AttributeComparison_0= ruleAttributeComparison
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
                    // InternalEclParser.g:2123:3: this_DataTypeComparison_1= ruleDataTypeComparison
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
    // InternalEclParser.g:2138:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEclParser.g:2138:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEclParser.g:2139:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
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
    // InternalEclParser.g:2145:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2151:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) ) )
            // InternalEclParser.g:2152:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            {
            // InternalEclParser.g:2152:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) ) )
            // InternalEclParser.g:2153:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            {
            // InternalEclParser.g:2153:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2154:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2154:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2155:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:2172:3: ( (lv_value_1_0= ruleFilteredExpressionConstraint ) )
            // InternalEclParser.g:2173:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            {
            // InternalEclParser.g:2173:4: (lv_value_1_0= ruleFilteredExpressionConstraint )
            // InternalEclParser.g:2174:5: lv_value_1_0= ruleFilteredExpressionConstraint
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
    // InternalEclParser.g:2195:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEclParser.g:2195:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEclParser.g:2196:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
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
    // InternalEclParser.g:2202:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2208:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEclParser.g:2209:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEclParser.g:2209:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt27=4;
            alt27 = dfa27.predict(input);
            switch (alt27) {
                case 1 :
                    // InternalEclParser.g:2210:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
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
                    // InternalEclParser.g:2222:3: this_StringValueComparison_1= ruleStringValueComparison
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
                    // InternalEclParser.g:2234:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
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
                    // InternalEclParser.g:2246:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
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
    // InternalEclParser.g:2261:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEclParser.g:2261:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEclParser.g:2262:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
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
    // InternalEclParser.g:2268:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2274:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEclParser.g:2275:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEclParser.g:2275:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEclParser.g:2276:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEclParser.g:2276:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2277:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2277:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2278:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:2295:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEclParser.g:2296:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEclParser.g:2296:4: (lv_value_1_0= ruleBoolean )
            // InternalEclParser.g:2297:5: lv_value_1_0= ruleBoolean
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
    // InternalEclParser.g:2318:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEclParser.g:2318:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEclParser.g:2319:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
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
    // InternalEclParser.g:2325:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2331:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:2332:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:2332:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEclParser.g:2333:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEclParser.g:2333:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2334:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2334:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2335:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:2352:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEclParser.g:2353:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEclParser.g:2353:4: (lv_value_1_0= RULE_STRING )
            // InternalEclParser.g:2354:5: lv_value_1_0= RULE_STRING
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
    // InternalEclParser.g:2374:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEclParser.g:2374:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEclParser.g:2375:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
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
    // InternalEclParser.g:2381:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2387:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEclParser.g:2388:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEclParser.g:2388:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEclParser.g:2389:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEclParser.g:2389:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEclParser.g:2390:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2390:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEclParser.g:2391:5: lv_op_0_0= ruleNUMERIC_OPERATOR
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
            // InternalEclParser.g:2412:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEclParser.g:2413:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEclParser.g:2413:4: (lv_value_2_0= ruleInteger )
            // InternalEclParser.g:2414:5: lv_value_2_0= ruleInteger
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
    // InternalEclParser.g:2435:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEclParser.g:2435:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEclParser.g:2436:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
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
    // InternalEclParser.g:2442:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2448:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEclParser.g:2449:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEclParser.g:2449:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEclParser.g:2450:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEclParser.g:2450:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEclParser.g:2451:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2451:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEclParser.g:2452:5: lv_op_0_0= ruleNUMERIC_OPERATOR
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
            // InternalEclParser.g:2473:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEclParser.g:2474:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEclParser.g:2474:4: (lv_value_2_0= ruleDecimal )
            // InternalEclParser.g:2475:5: lv_value_2_0= ruleDecimal
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
    // InternalEclParser.g:2496:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEclParser.g:2496:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEclParser.g:2497:2: iv_ruleNestedExpression= ruleNestedExpression EOF
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
    // InternalEclParser.g:2503:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2509:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:2510:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:2510:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:2511:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:2515:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:2516:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:2516:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEclParser.g:2517:5: lv_nested_1_0= ruleExpressionConstraint
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
    // InternalEclParser.g:2542:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEclParser.g:2542:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEclParser.g:2543:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
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
    // InternalEclParser.g:2549:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_2=null;
        EObject this_Filter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2555:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEclParser.g:2556:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEclParser.g:2556:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEclParser.g:2557:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_28);
            this_Filter_1=ruleFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_Filter_1;
              			afterParserOrEnumRuleCall();
              		
            }
            this_DOUBLE_CURLY_CLOSE_2=(Token)match(input,RULE_DOUBLE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_CLOSE_2, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_CLOSETerminalRuleCall_2());
              		
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
    // InternalEclParser.g:2580:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEclParser.g:2580:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEclParser.g:2581:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalEclParser.g:2587:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2593:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEclParser.g:2594:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
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
    // InternalEclParser.g:2608:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEclParser.g:2608:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEclParser.g:2609:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
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
    // InternalEclParser.g:2615:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2621:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEclParser.g:2622:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEclParser.g:2622:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEclParser.g:2623:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
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
            // InternalEclParser.g:2634:3: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==OR) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEclParser.g:2635:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEclParser.g:2635:4: ()
            	    // InternalEclParser.g:2636:5: 
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

            	    if ( state.backtracking==0 ) {

            	      				/* */
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getDisjunctionFilterAccess().getDISJUNCTIONParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    ruleDISJUNCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEclParser.g:2655:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEclParser.g:2656:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEclParser.g:2656:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEclParser.g:2657:6: lv_right_3_0= ruleConjunctionFilter
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
            	    break loop28;
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
    // InternalEclParser.g:2679:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEclParser.g:2679:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEclParser.g:2680:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
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
    // InternalEclParser.g:2686:1: ruleConjunctionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_PropertyFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2692:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* ) )
            // InternalEclParser.g:2693:2: (this_PropertyFilter_0= rulePropertyFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            {
            // InternalEclParser.g:2693:2: (this_PropertyFilter_0= rulePropertyFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )* )
            // InternalEclParser.g:2694:3: this_PropertyFilter_0= rulePropertyFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
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
            // InternalEclParser.g:2705:3: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==AND||LA30_0==RULE_COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalEclParser.g:2706:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= rulePropertyFilter ) )
            	    {
            	    // InternalEclParser.g:2706:4: ()
            	    // InternalEclParser.g:2707:5: 
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

            	    // InternalEclParser.g:2716:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt29=2;
            	    int LA29_0 = input.LA(1);

            	    if ( (LA29_0==AND) ) {
            	        alt29=1;
            	    }
            	    else if ( (LA29_0==RULE_COMMA) ) {
            	        alt29=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 29, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt29) {
            	        case 1 :
            	            // InternalEclParser.g:2717:5: ruleCONJUNCTION
            	            {
            	            if ( state.backtracking==0 ) {

            	              					/* */
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_27);
            	            ruleCONJUNCTION();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEclParser.g:2728:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_27); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:2733:4: ( (lv_right_4_0= rulePropertyFilter ) )
            	    // InternalEclParser.g:2734:5: (lv_right_4_0= rulePropertyFilter )
            	    {
            	    // InternalEclParser.g:2734:5: (lv_right_4_0= rulePropertyFilter )
            	    // InternalEclParser.g:2735:6: lv_right_4_0= rulePropertyFilter
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
    // $ANTLR end "ruleConjunctionFilter"


    // $ANTLR start "entryRuleNestedFilter"
    // InternalEclParser.g:2757:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEclParser.g:2757:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEclParser.g:2758:2: iv_ruleNestedFilter= ruleNestedFilter EOF
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
    // InternalEclParser.g:2764:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2770:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:2771:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:2771:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:2772:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:2776:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEclParser.g:2777:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEclParser.g:2777:4: (lv_nested_1_0= ruleFilter )
            // InternalEclParser.g:2778:5: lv_nested_1_0= ruleFilter
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
    // InternalEclParser.g:2803:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEclParser.g:2803:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEclParser.g:2804:2: iv_rulePropertyFilter= rulePropertyFilter EOF
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
    // InternalEclParser.g:2810:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter | this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter | this_NestedFilter_12= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TermFilter_0 = null;

        EObject this_LanguageFilter_1 = null;

        EObject this_TypeFilter_2 = null;

        EObject this_DialectFilter_3 = null;

        EObject this_ActiveFilter_4 = null;

        EObject this_PreferredInFilter_5 = null;

        EObject this_AcceptableInFilter_6 = null;

        EObject this_LanguageRefSetFilter_7 = null;

        EObject this_ModuleFilter_8 = null;

        EObject this_SemanticTagFilter_9 = null;

        EObject this_EffectiveTimeFilter_10 = null;

        EObject this_CaseSignificanceFilter_11 = null;

        EObject this_NestedFilter_12 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2816:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter | this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter | this_NestedFilter_12= ruleNestedFilter ) )
            // InternalEclParser.g:2817:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter | this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter | this_NestedFilter_12= ruleNestedFilter )
            {
            // InternalEclParser.g:2817:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter | this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter | this_NestedFilter_12= ruleNestedFilter )
            int alt31=13;
            alt31 = dfa31.predict(input);
            switch (alt31) {
                case 1 :
                    // InternalEclParser.g:2818:3: this_TermFilter_0= ruleTermFilter
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
                    // InternalEclParser.g:2830:3: this_LanguageFilter_1= ruleLanguageFilter
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
                    // InternalEclParser.g:2842:3: this_TypeFilter_2= ruleTypeFilter
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
                    // InternalEclParser.g:2854:3: this_DialectFilter_3= ruleDialectFilter
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
                    // InternalEclParser.g:2866:3: this_ActiveFilter_4= ruleActiveFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getActiveFilterParserRuleCall_4());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ActiveFilter_4=ruleActiveFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ActiveFilter_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalEclParser.g:2878:3: this_PreferredInFilter_5= rulePreferredInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getPreferredInFilterParserRuleCall_5());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_PreferredInFilter_5=rulePreferredInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_PreferredInFilter_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalEclParser.g:2890:3: this_AcceptableInFilter_6= ruleAcceptableInFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getAcceptableInFilterParserRuleCall_6());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_AcceptableInFilter_6=ruleAcceptableInFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_AcceptableInFilter_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalEclParser.g:2902:3: this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageRefSetFilterParserRuleCall_7());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageRefSetFilter_7=ruleLanguageRefSetFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageRefSetFilter_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalEclParser.g:2914:3: this_ModuleFilter_8= ruleModuleFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getModuleFilterParserRuleCall_8());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_ModuleFilter_8=ruleModuleFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_ModuleFilter_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalEclParser.g:2926:3: this_SemanticTagFilter_9= ruleSemanticTagFilter
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
                    // InternalEclParser.g:2938:3: this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getEffectiveTimeFilterParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_EffectiveTimeFilter_10=ruleEffectiveTimeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EffectiveTimeFilter_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalEclParser.g:2950:3: this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_11());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_11=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalEclParser.g:2962:3: this_NestedFilter_12= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_12());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_12=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_12;
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
    // InternalEclParser.g:2977:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEclParser.g:2977:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEclParser.g:2978:2: iv_ruleTermFilter= ruleTermFilter EOF
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
    // InternalEclParser.g:2984:1: ruleTermFilter returns [EObject current=null] : ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTermFilter_1 = null;

        EObject this_TypedTermFilterSet_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2990:2: ( ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) )
            // InternalEclParser.g:2991:2: ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            {
            // InternalEclParser.g:2991:2: ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            // InternalEclParser.g:2992:3: ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermFilterAccess().getTERM_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleTERM_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3002:3: (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==RULE_EQUAL) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==Exact||(LA32_1>=Match && LA32_1<=Regex)||LA32_1==Wild||LA32_1==RULE_STRING) ) {
                    alt32=1;
                }
                else if ( (LA32_1==RULE_ROUND_OPEN) ) {
                    alt32=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA32_0==RULE_NOT_EQUAL) ) {
                int LA32_2 = input.LA(2);

                if ( (LA32_2==RULE_ROUND_OPEN) ) {
                    alt32=2;
                }
                else if ( (LA32_2==Exact||(LA32_2>=Match && LA32_2<=Regex)||LA32_2==Wild||LA32_2==RULE_STRING) ) {
                    alt32=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // InternalEclParser.g:3003:4: this_TypedTermFilter_1= ruleTypedTermFilter
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
                    // InternalEclParser.g:3015:4: this_TypedTermFilterSet_2= ruleTypedTermFilterSet
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
    // InternalEclParser.g:3031:1: entryRuleTypedTermFilter returns [EObject current=null] : iv_ruleTypedTermFilter= ruleTypedTermFilter EOF ;
    public final EObject entryRuleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilter = null;


        try {
            // InternalEclParser.g:3031:56: (iv_ruleTypedTermFilter= ruleTypedTermFilter EOF )
            // InternalEclParser.g:3032:2: iv_ruleTypedTermFilter= ruleTypedTermFilter EOF
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
    // InternalEclParser.g:3038:1: ruleTypedTermFilter returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        Token lv_term_3_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_lexicalSearchType_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3044:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:3045:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:3045:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) )
            // InternalEclParser.g:3046:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) )
            {
            // InternalEclParser.g:3046:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3047:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3047:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3048:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:3065:3: ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==Exact||(LA33_0>=Match && LA33_0<=Regex)||LA33_0==Wild) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEclParser.g:3066:4: ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON
                    {
                    // InternalEclParser.g:3066:4: ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) )
                    // InternalEclParser.g:3067:5: (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE )
                    {
                    // InternalEclParser.g:3067:5: (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE )
                    // InternalEclParser.g:3068:6: lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_31);
                    lv_lexicalSearchType_1_0=ruleLEXICAL_SEARCH_TYPE();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypedTermFilterRule());
                      						}
                      						set(
                      							current,
                      							"lexicalSearchType",
                      							lv_lexicalSearchType_1_0,
                      							"com.b2international.snomed.ecl.Ecl.LEXICAL_SEARCH_TYPE");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_2, grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:3090:3: ( (lv_term_3_0= RULE_STRING ) )
            // InternalEclParser.g:3091:4: (lv_term_3_0= RULE_STRING )
            {
            // InternalEclParser.g:3091:4: (lv_term_3_0= RULE_STRING )
            // InternalEclParser.g:3092:5: lv_term_3_0= RULE_STRING
            {
            lv_term_3_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_term_3_0, grammarAccess.getTypedTermFilterAccess().getTermSTRINGTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getTypedTermFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"term",
              						lv_term_3_0,
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
    // $ANTLR end "ruleTypedTermFilter"


    // $ANTLR start "entryRuleTypedTermFilterSet"
    // InternalEclParser.g:3112:1: entryRuleTypedTermFilterSet returns [EObject current=null] : iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF ;
    public final EObject entryRuleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterSet = null;


        try {
            // InternalEclParser.g:3112:59: (iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF )
            // InternalEclParser.g:3113:2: iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF
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
    // InternalEclParser.g:3119:1: ruleTypedTermFilterSet returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_1=null;
        Token this_ROUND_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_terms_2_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3125:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:3126:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:3126:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE )
            // InternalEclParser.g:3127:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE
            {
            // InternalEclParser.g:3127:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3128:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3128:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3129:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_32);
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

            this_ROUND_OPEN_1=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_1, grammarAccess.getTypedTermFilterSetAccess().getROUND_OPENTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:3150:3: ( (lv_terms_2_0= ruleTypedTermFilter ) )
            // InternalEclParser.g:3151:4: (lv_terms_2_0= ruleTypedTermFilter )
            {
            // InternalEclParser.g:3151:4: (lv_terms_2_0= ruleTypedTermFilter )
            // InternalEclParser.g:3152:5: lv_terms_2_0= ruleTypedTermFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
            lv_terms_2_0=ruleTypedTermFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
              					}
              					add(
              						current,
              						"terms",
              						lv_terms_2_0,
              						"com.b2international.snomed.ecl.Ecl.TypedTermFilter");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:3169:3: ( (lv_terms_3_0= ruleTypedTermFilter ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=RULE_EQUAL && LA34_0<=RULE_NOT_EQUAL)) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEclParser.g:3170:4: (lv_terms_3_0= ruleTypedTermFilter )
            	    {
            	    // InternalEclParser.g:3170:4: (lv_terms_3_0= ruleTypedTermFilter )
            	    // InternalEclParser.g:3171:5: lv_terms_3_0= ruleTypedTermFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_33);
            	    lv_terms_3_0=ruleTypedTermFilter();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getTypedTermFilterSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"terms",
            	      						lv_terms_3_0,
            	      						"com.b2international.snomed.ecl.Ecl.TypedTermFilter");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            this_ROUND_CLOSE_4=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_4, grammarAccess.getTypedTermFilterSetAccess().getROUND_CLOSETerminalRuleCall_4());
              		
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


    // $ANTLR start "entryRuleLanguageFilter"
    // InternalEclParser.g:3196:1: entryRuleLanguageFilter returns [EObject current=null] : iv_ruleLanguageFilter= ruleLanguageFilter EOF ;
    public final EObject entryRuleLanguageFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageFilter = null;


        try {
            // InternalEclParser.g:3196:55: (iv_ruleLanguageFilter= ruleLanguageFilter EOF )
            // InternalEclParser.g:3197:2: iv_ruleLanguageFilter= ruleLanguageFilter EOF
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
    // InternalEclParser.g:3203:1: ruleLanguageFilter returns [EObject current=null] : ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleLanguageFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_2_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_4_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3209:2: ( ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3210:2: ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3210:2: ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3211:3: ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLanguageFilterAccess().getLANGUAGE_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleLANGUAGE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3221:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3222:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3222:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3223:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:3240:3: ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_ALPHA) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_ROUND_OPEN) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalEclParser.g:3241:4: ( (lv_languageCodes_2_0= ruleAlphabetical ) )
                    {
                    // InternalEclParser.g:3241:4: ( (lv_languageCodes_2_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3242:5: (lv_languageCodes_2_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3242:5: (lv_languageCodes_2_0= ruleAlphabetical )
                    // InternalEclParser.g:3243:6: lv_languageCodes_2_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_languageCodes_2_0=ruleAlphabetical();

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
                      							"com.b2international.snomed.ecl.Ecl.Alphabetical");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:3261:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3261:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3262:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3266:5: ( (lv_languageCodes_4_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3267:6: (lv_languageCodes_4_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3267:6: (lv_languageCodes_4_0= ruleAlphabetical )
                    // InternalEclParser.g:3268:7: lv_languageCodes_4_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_languageCodes_4_0=ruleAlphabetical();

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
                      								"com.b2international.snomed.ecl.Ecl.Alphabetical");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalEclParser.g:3285:5: ( (lv_languageCodes_5_0= ruleAlphabetical ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==RULE_ALPHA) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // InternalEclParser.g:3286:6: (lv_languageCodes_5_0= ruleAlphabetical )
                    	    {
                    	    // InternalEclParser.g:3286:6: (lv_languageCodes_5_0= ruleAlphabetical )
                    	    // InternalEclParser.g:3287:7: lv_languageCodes_5_0= ruleAlphabetical
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_languageCodes_5_0=ruleAlphabetical();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLanguageFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"languageCodes",
                    	      								lv_languageCodes_5_0,
                    	      								"com.b2international.snomed.ecl.Ecl.Alphabetical");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getLanguageFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3());
                      				
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
    // InternalEclParser.g:3314:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEclParser.g:3314:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEclParser.g:3315:2: iv_ruleTypeFilter= ruleTypeFilter EOF
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
    // InternalEclParser.g:3321:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3327:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEclParser.g:3328:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEclParser.g:3328:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==TypeId) ) {
                alt37=1;
            }
            else if ( (LA37_0==Type) ) {
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
                    // InternalEclParser.g:3329:3: this_TypeIdFilter_0= ruleTypeIdFilter
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
                    // InternalEclParser.g:3341:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
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
    // InternalEclParser.g:3356:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEclParser.g:3356:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEclParser.g:3357:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
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
    // InternalEclParser.g:3363:1: ruleTypeIdFilter returns [EObject current=null] : ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3369:2: ( ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) ) )
            // InternalEclParser.g:3370:2: ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) )
            {
            // InternalEclParser.g:3370:2: ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) )
            // InternalEclParser.g:3371:3: ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleTYPEID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3381:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3382:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3382:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3383:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            // InternalEclParser.g:3400:3: ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) )
            // InternalEclParser.g:3401:4: ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) )
            {
            // InternalEclParser.g:3401:4: ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) )
            // InternalEclParser.g:3402:5: (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet )
            {
            // InternalEclParser.g:3402:5: (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( ((LA38_0>=RULE_ZERO && LA38_0<=RULE_DIGIT_NONZERO)) ) {
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
                    // InternalEclParser.g:3403:6: lv_type_2_1= ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_2_1=ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_1,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReference");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:3419:6: lv_type_2_2= ruleEclConceptReferenceSet
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTypeEclConceptReferenceSetParserRuleCall_2_0_1());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_type_2_2=ruleEclConceptReferenceSet();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getTypeIdFilterRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_2_2,
                      							"com.b2international.snomed.ecl.Ecl.EclConceptReferenceSet");
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
    // $ANTLR end "ruleTypeIdFilter"


    // $ANTLR start "entryRuleTypeTokenFilter"
    // InternalEclParser.g:3441:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEclParser.g:3441:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEclParser.g:3442:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
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
    // InternalEclParser.g:3448:1: ruleTypeTokenFilter returns [EObject current=null] : ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_tokens_2_0 = null;

        AntlrDatatypeRuleToken lv_tokens_4_0 = null;

        AntlrDatatypeRuleToken lv_tokens_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3454:2: ( ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3455:2: ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3455:2: ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3456:3: ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleTYPE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3466:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3467:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3467:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3468:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:3485:3: ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_ALPHA) ) {
                alt40=1;
            }
            else if ( (LA40_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEclParser.g:3486:4: ( (lv_tokens_2_0= ruleAlphabetical ) )
                    {
                    // InternalEclParser.g:3486:4: ( (lv_tokens_2_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3487:5: (lv_tokens_2_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3487:5: (lv_tokens_2_0= ruleAlphabetical )
                    // InternalEclParser.g:3488:6: lv_tokens_2_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_tokens_2_0=ruleAlphabetical();

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
                      							"com.b2international.snomed.ecl.Ecl.Alphabetical");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:3506:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3506:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3507:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3511:5: ( (lv_tokens_4_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3512:6: (lv_tokens_4_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3512:6: (lv_tokens_4_0= ruleAlphabetical )
                    // InternalEclParser.g:3513:7: lv_tokens_4_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
                    lv_tokens_4_0=ruleAlphabetical();

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
                      								"com.b2international.snomed.ecl.Ecl.Alphabetical");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalEclParser.g:3530:5: ( (lv_tokens_5_0= ruleAlphabetical ) )*
                    loop39:
                    do {
                        int alt39=2;
                        int LA39_0 = input.LA(1);

                        if ( (LA39_0==RULE_ALPHA) ) {
                            alt39=1;
                        }


                        switch (alt39) {
                    	case 1 :
                    	    // InternalEclParser.g:3531:6: (lv_tokens_5_0= ruleAlphabetical )
                    	    {
                    	    // InternalEclParser.g:3531:6: (lv_tokens_5_0= ruleAlphabetical )
                    	    // InternalEclParser.g:3532:7: lv_tokens_5_0= ruleAlphabetical
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_tokens_5_0=ruleAlphabetical();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getTypeTokenFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"tokens",
                    	      								lv_tokens_5_0,
                    	      								"com.b2international.snomed.ecl.Ecl.Alphabetical");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop39;
                        }
                    } while (true);

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getTypeTokenFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3());
                      				
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
    // InternalEclParser.g:3559:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEclParser.g:3559:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEclParser.g:3560:2: iv_ruleDialectFilter= ruleDialectFilter EOF
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
    // InternalEclParser.g:3566:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3572:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEclParser.g:3573:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEclParser.g:3573:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==DialectId) ) {
                alt41=1;
            }
            else if ( (LA41_0==Dialect) ) {
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
                    // InternalEclParser.g:3574:3: this_DialectIdFilter_0= ruleDialectIdFilter
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
                    // InternalEclParser.g:3586:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
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
    // InternalEclParser.g:3601:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEclParser.g:3601:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEclParser.g:3602:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
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
    // InternalEclParser.g:3608:1: ruleDialectIdFilter returns [EObject current=null] : ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;

        EObject lv_dialects_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3614:2: ( ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3615:2: ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3615:2: ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3616:3: ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleDIALECTID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3626:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3627:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3627:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3628:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            // InternalEclParser.g:3645:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( ((LA43_0>=RULE_ZERO && LA43_0<=RULE_DIGIT_NONZERO)) ) {
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
                    // InternalEclParser.g:3646:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEclParser.g:3646:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEclParser.g:3647:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEclParser.g:3647:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEclParser.g:3648:6: lv_dialects_2_0= ruleDialect
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
                    // InternalEclParser.g:3666:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3666:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3667:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3671:5: ( (lv_dialects_4_0= ruleDialect ) )
                    // InternalEclParser.g:3672:6: (lv_dialects_4_0= ruleDialect )
                    {
                    // InternalEclParser.g:3672:6: (lv_dialects_4_0= ruleDialect )
                    // InternalEclParser.g:3673:7: lv_dialects_4_0= ruleDialect
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_13);
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

                    // InternalEclParser.g:3690:5: ( (lv_dialects_5_0= ruleDialect ) )*
                    loop42:
                    do {
                        int alt42=2;
                        int LA42_0 = input.LA(1);

                        if ( ((LA42_0>=RULE_ZERO && LA42_0<=RULE_DIGIT_NONZERO)) ) {
                            alt42=1;
                        }


                        switch (alt42) {
                    	case 1 :
                    	    // InternalEclParser.g:3691:6: (lv_dialects_5_0= ruleDialect )
                    	    {
                    	    // InternalEclParser.g:3691:6: (lv_dialects_5_0= ruleDialect )
                    	    // InternalEclParser.g:3692:7: lv_dialects_5_0= ruleDialect
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDialectsDialectParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_13);
                    	    lv_dialects_5_0=ruleDialect();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectIdFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_5_0,
                    	      								"com.b2international.snomed.ecl.Ecl.Dialect");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop42;
                        }
                    } while (true);

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getDialectIdFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3());
                      				
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
    // InternalEclParser.g:3719:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEclParser.g:3719:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEclParser.g:3720:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
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
    // InternalEclParser.g:3726:1: ruleDialectAliasFilter returns [EObject current=null] : ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_dialects_2_0 = null;

        EObject lv_dialects_4_0 = null;

        EObject lv_dialects_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3732:2: ( ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3733:2: ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3733:2: ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3734:3: ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleDIALECT_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3744:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3745:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3745:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3746:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalEclParser.g:3763:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ALPHA) ) {
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
                    // InternalEclParser.g:3764:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEclParser.g:3764:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEclParser.g:3765:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEclParser.g:3765:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEclParser.g:3766:6: lv_dialects_2_0= ruleDialectAlias
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
                    // InternalEclParser.g:3784:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3784:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3785:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3789:5: ( (lv_dialects_4_0= ruleDialectAlias ) )
                    // InternalEclParser.g:3790:6: (lv_dialects_4_0= ruleDialectAlias )
                    {
                    // InternalEclParser.g:3790:6: (lv_dialects_4_0= ruleDialectAlias )
                    // InternalEclParser.g:3791:7: lv_dialects_4_0= ruleDialectAlias
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_36);
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

                    // InternalEclParser.g:3808:5: ( (lv_dialects_5_0= ruleDialectAlias ) )*
                    loop44:
                    do {
                        int alt44=2;
                        int LA44_0 = input.LA(1);

                        if ( (LA44_0==RULE_ALPHA) ) {
                            alt44=1;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalEclParser.g:3809:6: (lv_dialects_5_0= ruleDialectAlias )
                    	    {
                    	    // InternalEclParser.g:3809:6: (lv_dialects_5_0= ruleDialectAlias )
                    	    // InternalEclParser.g:3810:7: lv_dialects_5_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_36);
                    	    lv_dialects_5_0=ruleDialectAlias();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getDialectAliasFilterRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"dialects",
                    	      								lv_dialects_5_0,
                    	      								"com.b2international.snomed.ecl.Ecl.DialectAlias");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop44;
                        }
                    } while (true);

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getDialectAliasFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3());
                      				
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
    // InternalEclParser.g:3837:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEclParser.g:3837:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEclParser.g:3838:2: iv_ruleDialect= ruleDialect EOF
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
    // InternalEclParser.g:3844:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3850:2: ( ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEclParser.g:3851:2: ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEclParser.g:3851:2: ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEclParser.g:3852:3: ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEclParser.g:3852:3: ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) )
            // InternalEclParser.g:3853:4: (lv_languageRefSetId_0_0= ruleEclConceptReference )
            {
            // InternalEclParser.g:3853:4: (lv_languageRefSetId_0_0= ruleEclConceptReference )
            // InternalEclParser.g:3854:5: lv_languageRefSetId_0_0= ruleEclConceptReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
            lv_languageRefSetId_0_0=ruleEclConceptReference();

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
              						"com.b2international.snomed.ecl.Ecl.EclConceptReference");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:3871:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ROUND_OPEN) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEclParser.g:3872:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEclParser.g:3872:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEclParser.g:3873:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEclParser.g:3894:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;


        try {
            // InternalEclParser.g:3894:53: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEclParser.g:3895:2: iv_ruleDialectAlias= ruleDialectAlias EOF
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
    // InternalEclParser.g:3901:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3907:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEclParser.g:3908:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEclParser.g:3908:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEclParser.g:3909:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEclParser.g:3909:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEclParser.g:3910:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEclParser.g:3910:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEclParser.g:3911:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalEclParser.g:3928:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ROUND_OPEN) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalEclParser.g:3929:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEclParser.g:3929:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEclParser.g:3930:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEclParser.g:3951:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEclParser.g:3951:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEclParser.g:3952:2: iv_ruleAcceptability= ruleAcceptability EOF
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
    // InternalEclParser.g:3958:1: ruleAcceptability returns [EObject current=null] : (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptabilityIdSet_0 = null;

        EObject this_AcceptabilityTokenSet_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3964:2: ( (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) )
            // InternalEclParser.g:3965:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            {
            // InternalEclParser.g:3965:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==RULE_ROUND_OPEN) ) {
                int LA48_1 = input.LA(2);

                if ( ((LA48_1>=RULE_ZERO && LA48_1<=RULE_DIGIT_NONZERO)) ) {
                    alt48=1;
                }
                else if ( (LA48_1==RULE_ALPHA) ) {
                    alt48=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // InternalEclParser.g:3966:3: this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet
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
                    // InternalEclParser.g:3978:3: this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet
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
    // InternalEclParser.g:3993:1: entryRuleAcceptabilityIdSet returns [EObject current=null] : iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF ;
    public final EObject entryRuleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityIdSet = null;


        try {
            // InternalEclParser.g:3993:59: (iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF )
            // InternalEclParser.g:3994:2: iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF
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
    // InternalEclParser.g:4000:1: ruleAcceptabilityIdSet returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4006:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEclParser.g:4007:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEclParser.g:4007:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEclParser.g:4008:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEclParser.g:4008:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEclParser.g:4009:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
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
    // InternalEclParser.g:4029:1: entryRuleAcceptabilityTokenSet returns [EObject current=null] : iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF ;
    public final EObject entryRuleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityTokenSet = null;


        try {
            // InternalEclParser.g:4029:62: (iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF )
            // InternalEclParser.g:4030:2: iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF
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
    // InternalEclParser.g:4036:1: ruleAcceptabilityTokenSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_acceptabilities_1_0 = null;

        AntlrDatatypeRuleToken lv_acceptabilities_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4042:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:4043:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:4043:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEclParser.g:4044:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:4048:3: ( (lv_acceptabilities_1_0= ruleAlphabetical ) )
            // InternalEclParser.g:4049:4: (lv_acceptabilities_1_0= ruleAlphabetical )
            {
            // InternalEclParser.g:4049:4: (lv_acceptabilities_1_0= ruleAlphabetical )
            // InternalEclParser.g:4050:5: lv_acceptabilities_1_0= ruleAlphabetical
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_36);
            lv_acceptabilities_1_0=ruleAlphabetical();

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
              						"com.b2international.snomed.ecl.Ecl.Alphabetical");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:4067:3: ( (lv_acceptabilities_2_0= ruleAlphabetical ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( (LA49_0==RULE_ALPHA) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalEclParser.g:4068:4: (lv_acceptabilities_2_0= ruleAlphabetical )
            	    {
            	    // InternalEclParser.g:4068:4: (lv_acceptabilities_2_0= ruleAlphabetical )
            	    // InternalEclParser.g:4069:5: lv_acceptabilities_2_0= ruleAlphabetical
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_36);
            	    lv_acceptabilities_2_0=ruleAlphabetical();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getAcceptabilityTokenSetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"acceptabilities",
            	      						lv_acceptabilities_2_0,
            	      						"com.b2international.snomed.ecl.Ecl.Alphabetical");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

            this_ROUND_CLOSE_3=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_CLOSE_3, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_CLOSETerminalRuleCall_3());
              		
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


    // $ANTLR start "entryRuleActiveFilter"
    // InternalEclParser.g:4094:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEclParser.g:4094:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEclParser.g:4095:2: iv_ruleActiveFilter= ruleActiveFilter EOF
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
    // InternalEclParser.g:4101:1: ruleActiveFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token this_EQUAL_3=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        AntlrDatatypeRuleToken lv_active_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4107:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) )
            // InternalEclParser.g:4108:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            {
            // InternalEclParser.g:4108:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            // InternalEclParser.g:4109:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) )
            {
            // InternalEclParser.g:4109:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description||LA50_0==Concept) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEclParser.g:4110:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4110:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4111:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4111:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4112:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActiveFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_domain_0_0=ruleDOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getActiveFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ecl.Ecl.DOMAIN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getActiveFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getActiveFilterAccess().getACTIVE_KEYWORDParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            ruleACTIVE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_3, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalEclParser.g:4148:3: ( (lv_active_4_0= ruleBoolean ) )
            // InternalEclParser.g:4149:4: (lv_active_4_0= ruleBoolean )
            {
            // InternalEclParser.g:4149:4: (lv_active_4_0= ruleBoolean )
            // InternalEclParser.g:4150:5: lv_active_4_0= ruleBoolean
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getActiveFilterAccess().getActiveBooleanParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_active_4_0=ruleBoolean();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getActiveFilterRule());
              					}
              					set(
              						current,
              						"active",
              						lv_active_4_0,
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
    // $ANTLR end "ruleActiveFilter"


    // $ANTLR start "entryRuleModuleFilter"
    // InternalEclParser.g:4171:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEclParser.g:4171:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEclParser.g:4172:2: iv_ruleModuleFilter= ruleModuleFilter EOF
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
    // InternalEclParser.g:4178:1: ruleModuleFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token this_EQUAL_3=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        EObject lv_moduleId_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4184:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4185:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4185:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4186:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            {
            // InternalEclParser.g:4186:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==Description||LA51_0==Concept) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalEclParser.g:4187:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4187:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4188:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4188:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4189:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_domain_0_0=ruleDOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getModuleFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ecl.Ecl.DOMAIN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getModuleFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getModuleFilterAccess().getMODULEID_KEYWORDParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            ruleMODULEID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_3, grammarAccess.getModuleFilterAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalEclParser.g:4225:3: ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4226:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4226:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            // InternalEclParser.g:4227:5: lv_moduleId_4_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getModuleFilterAccess().getModuleIdExpressionConstraintParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_moduleId_4_0=ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getModuleFilterRule());
              					}
              					set(
              						current,
              						"moduleId",
              						lv_moduleId_4_0,
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
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


    // $ANTLR start "entryRuleSemanticTagFilter"
    // InternalEclParser.g:4248:1: entryRuleSemanticTagFilter returns [EObject current=null] : iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF ;
    public final EObject entryRuleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSemanticTagFilter = null;


        try {
            // InternalEclParser.g:4248:58: (iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF )
            // InternalEclParser.g:4249:2: iv_ruleSemanticTagFilter= ruleSemanticTagFilter EOF
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
    // InternalEclParser.g:4255:1: ruleSemanticTagFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleSEMANTIC_TAG_KEYWORD ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSemanticTagFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token lv_semanticTag_4_0=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4261:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleSEMANTIC_TAG_KEYWORD ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_4_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:4262:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleSEMANTIC_TAG_KEYWORD ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_4_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:4262:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleSEMANTIC_TAG_KEYWORD ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_4_0= RULE_STRING ) ) )
            // InternalEclParser.g:4263:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleSEMANTIC_TAG_KEYWORD ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_semanticTag_4_0= RULE_STRING ) )
            {
            // InternalEclParser.g:4263:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Description||LA52_0==Concept) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalEclParser.g:4264:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4264:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4265:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4265:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4266:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_domain_0_0=ruleDOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ecl.Ecl.DOMAIN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_43); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getSemanticTagFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getSEMANTIC_TAG_KEYWORDParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
            ruleSEMANTIC_TAG_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:4298:3: ( (lv_op_3_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:4299:4: (lv_op_3_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:4299:4: (lv_op_3_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:4300:5: lv_op_3_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getSemanticTagFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_op_3_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getSemanticTagFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_3_0,
              						"com.b2international.snomed.ecl.Ecl.NON_NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:4317:3: ( (lv_semanticTag_4_0= RULE_STRING ) )
            // InternalEclParser.g:4318:4: (lv_semanticTag_4_0= RULE_STRING )
            {
            // InternalEclParser.g:4318:4: (lv_semanticTag_4_0= RULE_STRING )
            // InternalEclParser.g:4319:5: lv_semanticTag_4_0= RULE_STRING
            {
            lv_semanticTag_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_semanticTag_4_0, grammarAccess.getSemanticTagFilterAccess().getSemanticTagSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getSemanticTagFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"semanticTag",
              						lv_semanticTag_4_0,
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


    // $ANTLR start "entryRuleEffectiveTimeFilter"
    // InternalEclParser.g:4339:1: entryRuleEffectiveTimeFilter returns [EObject current=null] : iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF ;
    public final EObject entryRuleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEffectiveTimeFilter = null;


        try {
            // InternalEclParser.g:4339:60: (iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF )
            // InternalEclParser.g:4340:2: iv_ruleEffectiveTimeFilter= ruleEffectiveTimeFilter EOF
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
    // InternalEclParser.g:4346:1: ruleEffectiveTimeFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleEFFECTIVE_TIME_KEYWORD ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleEffectiveTimeFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token lv_effectiveTime_4_0=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        AntlrDatatypeRuleToken lv_op_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4352:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleEFFECTIVE_TIME_KEYWORD ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_4_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:4353:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleEFFECTIVE_TIME_KEYWORD ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_4_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:4353:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleEFFECTIVE_TIME_KEYWORD ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_4_0= RULE_STRING ) ) )
            // InternalEclParser.g:4354:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleEFFECTIVE_TIME_KEYWORD ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) ) ( (lv_effectiveTime_4_0= RULE_STRING ) )
            {
            // InternalEclParser.g:4354:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==Description||LA53_0==Concept) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalEclParser.g:4355:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4355:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4356:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4356:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4357:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_39);
                    lv_domain_0_0=ruleDOMAIN();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
                      						}
                      						set(
                      							current,
                      							"domain",
                      							lv_domain_0_0,
                      							"com.b2international.snomed.ecl.Ecl.DOMAIN");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DOT_1, grammarAccess.getEffectiveTimeFilterAccess().getDOTTerminalRuleCall_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getEFFECTIVE_TIME_KEYWORDParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_45);
            ruleEFFECTIVE_TIME_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:4389:3: ( (lv_op_3_0= ruleNUMERIC_OPERATOR ) )
            // InternalEclParser.g:4390:4: (lv_op_3_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEclParser.g:4390:4: (lv_op_3_0= ruleNUMERIC_OPERATOR )
            // InternalEclParser.g:4391:5: lv_op_3_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEffectiveTimeFilterAccess().getOpNUMERIC_OPERATORParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
            lv_op_3_0=ruleNUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					set(
              						current,
              						"op",
              						lv_op_3_0,
              						"com.b2international.snomed.ecl.Ecl.NUMERIC_OPERATOR");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:4408:3: ( (lv_effectiveTime_4_0= RULE_STRING ) )
            // InternalEclParser.g:4409:4: (lv_effectiveTime_4_0= RULE_STRING )
            {
            // InternalEclParser.g:4409:4: (lv_effectiveTime_4_0= RULE_STRING )
            // InternalEclParser.g:4410:5: lv_effectiveTime_4_0= RULE_STRING
            {
            lv_effectiveTime_4_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_effectiveTime_4_0, grammarAccess.getEffectiveTimeFilterAccess().getEffectiveTimeSTRINGTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEffectiveTimeFilterRule());
              					}
              					setWithLastConsumed(
              						current,
              						"effectiveTime",
              						lv_effectiveTime_4_0,
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


    // $ANTLR start "entryRulePreferredInFilter"
    // InternalEclParser.g:4430:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEclParser.g:4430:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEclParser.g:4431:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
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
    // InternalEclParser.g:4437:1: rulePreferredInFilter returns [EObject current=null] : ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4443:2: ( ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4444:2: ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4444:2: ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4445:3: rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            rulePREFERRED_IN_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getPreferredInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4459:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4460:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4460:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4461:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getPreferredInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
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
    // InternalEclParser.g:4482:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEclParser.g:4482:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEclParser.g:4483:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
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
    // InternalEclParser.g:4489:1: ruleAcceptableInFilter returns [EObject current=null] : ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4495:2: ( ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4496:2: ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4496:2: ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4497:3: ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            ruleACCEPTABLE_IN_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getAcceptableInFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4511:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4512:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4512:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4513:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
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
    // InternalEclParser.g:4534:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEclParser.g:4534:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEclParser.g:4535:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
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
    // InternalEclParser.g:4541:1: ruleLanguageRefSetFilter returns [EObject current=null] : ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4547:2: ( ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4548:2: ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4548:2: ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4549:3: ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            ruleLANGUAGE_REFSET_ID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getLanguageRefSetFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4563:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4564:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4564:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4565:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLanguageRefSetIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_languageRefSetId_2_0=ruleExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
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
    // InternalEclParser.g:4586:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEclParser.g:4586:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEclParser.g:4587:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
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
    // InternalEclParser.g:4593:1: ruleCaseSignificanceFilter returns [EObject current=null] : ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4599:2: ( ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4600:2: ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4600:2: ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4601:3: ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_41);
            ruleCASE_SIGNIFICANCE_ID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_1=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_1, grammarAccess.getCaseSignificanceFilterAccess().getEQUALTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4615:3: ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4616:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4616:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4617:5: lv_caseSignificanceId_2_0= ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCaseSignificanceIdExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_caseSignificanceId_2_0=ruleExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.ExpressionConstraint");
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


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalEclParser.g:4638:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4640:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalEclParser.g:4641:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
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
    // InternalEclParser.g:4650:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_ZERO_1= RULE_ZERO )+ ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_ZERO_1=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4657:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_ZERO_1= RULE_ZERO )+ )
            // InternalEclParser.g:4658:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_ZERO_1= RULE_ZERO )+
            {
            // InternalEclParser.g:4658:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO | this_ZERO_1= RULE_ZERO )+
            int cnt54=0;
            loop54:
            do {
                int alt54=3;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==RULE_DIGIT_NONZERO) ) {
                    int LA54_2 = input.LA(2);

                    if ( (synpred79_InternalEclParser()) ) {
                        alt54=1;
                    }


                }
                else if ( (LA54_0==RULE_ZERO) ) {
                    int LA54_3 = input.LA(2);

                    if ( (synpred80_InternalEclParser()) ) {
                        alt54=2;
                    }


                }


                switch (alt54) {
            	case 1 :
            	    // InternalEclParser.g:4659:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_DIGIT_NONZERO_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
            	      		
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:4667:3: this_ZERO_1= RULE_ZERO
            	    {
            	    this_ZERO_1=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ZERO_1);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ZERO_1, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1());
            	      		
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


            }

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
    // InternalEclParser.g:4681:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4683:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEclParser.g:4684:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
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
    // InternalEclParser.g:4693:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4700:2: ( (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) )
            // InternalEclParser.g:4701:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            {
            // InternalEclParser.g:4701:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ZERO) ) {
                alt56=1;
            }
            else if ( (LA56_0==RULE_DIGIT_NONZERO) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // InternalEclParser.g:4702:3: this_ZERO_0= RULE_ZERO
                    {
                    this_ZERO_0=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_ZERO_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_ZERO_0, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4710:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    {
                    // InternalEclParser.g:4710:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    // InternalEclParser.g:4711:4: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEclParser.g:4718:4: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    loop55:
                    do {
                        int alt55=3;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==RULE_DIGIT_NONZERO) ) {
                            alt55=1;
                        }
                        else if ( (LA55_0==RULE_ZERO) ) {
                            alt55=2;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // InternalEclParser.g:4719:5: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
                    	    {
                    	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_DIGIT_NONZERO_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclParser.g:4727:5: this_ZERO_3= RULE_ZERO
                    	    {
                    	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ZERO_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


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
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleMaxValue"
    // InternalEclParser.g:4743:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4745:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEclParser.g:4746:2: iv_ruleMaxValue= ruleMaxValue EOF
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
    // InternalEclParser.g:4755:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4762:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEclParser.g:4763:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEclParser.g:4763:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( ((LA57_0>=RULE_ZERO && LA57_0<=RULE_DIGIT_NONZERO)) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_WILDCARD) ) {
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
                    // InternalEclParser.g:4764:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEclParser.g:4775:3: this_WILDCARD_1= RULE_WILDCARD
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
    // InternalEclParser.g:4789:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4791:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEclParser.g:4792:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalEclParser.g:4801:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4808:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEclParser.g:4809:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEclParser.g:4809:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEclParser.g:4810:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEclParser.g:4810:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==RULE_PLUS) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_DASH) ) {
                alt58=2;
            }
            switch (alt58) {
                case 1 :
                    // InternalEclParser.g:4811:4: this_PLUS_0= RULE_PLUS
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
                    // InternalEclParser.g:4819:4: this_DASH_1= RULE_DASH
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
    // InternalEclParser.g:4844:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4846:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEclParser.g:4847:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalEclParser.g:4856:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4863:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEclParser.g:4864:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEclParser.g:4864:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEclParser.g:4865:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEclParser.g:4865:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt59=3;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==RULE_PLUS) ) {
                alt59=1;
            }
            else if ( (LA59_0==RULE_DASH) ) {
                alt59=2;
            }
            switch (alt59) {
                case 1 :
                    // InternalEclParser.g:4866:4: this_PLUS_0= RULE_PLUS
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
                    // InternalEclParser.g:4874:4: this_DASH_1= RULE_DASH
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


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalEclParser.g:4899:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4901:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEclParser.g:4902:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
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
    // InternalEclParser.g:4911:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4918:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            // InternalEclParser.g:4919:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            {
            // InternalEclParser.g:4919:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            // InternalEclParser.g:4920:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_39);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4937:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            loop60:
            do {
                int alt60=3;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==RULE_DIGIT_NONZERO) ) {
                    alt60=1;
                }
                else if ( (LA60_0==RULE_ZERO) ) {
                    alt60=2;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalEclParser.g:4938:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:4946:4: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop60;
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


    // $ANTLR start "entryRuleBoolean"
    // InternalEclParser.g:4961:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4963:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEclParser.g:4964:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalEclParser.g:4973:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4980:2: ( (kw= True | kw= False ) )
            // InternalEclParser.g:4981:2: (kw= True | kw= False )
            {
            // InternalEclParser.g:4981:2: (kw= True | kw= False )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==True) ) {
                alt61=1;
            }
            else if ( (LA61_0==False) ) {
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
                    // InternalEclParser.g:4982:3: kw= True
                    {
                    kw=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4988:3: kw= False
                    {
                    kw=(Token)match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getFalseKeyword_1());
                      		
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


    // $ANTLR start "entryRuleDialectAliasValue"
    // InternalEclParser.g:5000:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:5002:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEclParser.g:5003:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
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
    // InternalEclParser.g:5012:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleDialectAliasValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;
        Token this_DASH_1=null;
        Token this_ALPHA_2=null;
        Token this_ZERO_3=null;
        Token this_DIGIT_NONZERO_4=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:5019:2: ( (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* ) )
            // InternalEclParser.g:5020:2: (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* )
            {
            // InternalEclParser.g:5020:2: (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* )
            // InternalEclParser.g:5021:3: this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )*
            {
            this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ALPHA_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ALPHA_0, grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:5028:3: (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )*
            loop62:
            do {
                int alt62=5;
                switch ( input.LA(1) ) {
                case RULE_ALPHA:
                    {
                    int LA62_2 = input.LA(2);

                    if ( (synpred93_InternalEclParser()) ) {
                        alt62=2;
                    }


                    }
                    break;
                case RULE_DASH:
                    {
                    alt62=1;
                    }
                    break;
                case RULE_ZERO:
                    {
                    alt62=3;
                    }
                    break;
                case RULE_DIGIT_NONZERO:
                    {
                    alt62=4;
                    }
                    break;

                }

                switch (alt62) {
            	case 1 :
            	    // InternalEclParser.g:5029:4: this_DASH_1= RULE_DASH
            	    {
            	    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DASH_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DASH_1, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:5037:4: this_ALPHA_2= RULE_ALPHA
            	    {
            	    this_ALPHA_2=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ALPHA_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ALPHA_2, grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEclParser.g:5045:4: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_3, grammarAccess.getDialectAliasValueAccess().getZEROTerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEclParser.g:5053:4: this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_4=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_47); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_4, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_1_3());
            	      			
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
    // $ANTLR end "ruleDialectAliasValue"


    // $ANTLR start "entryRuleAlphabetical"
    // InternalEclParser.g:5068:1: entryRuleAlphabetical returns [String current=null] : iv_ruleAlphabetical= ruleAlphabetical EOF ;
    public final String entryRuleAlphabetical() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlphabetical = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:5070:2: (iv_ruleAlphabetical= ruleAlphabetical EOF )
            // InternalEclParser.g:5071:2: iv_ruleAlphabetical= ruleAlphabetical EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlphabeticalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleAlphabetical=ruleAlphabetical();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlphabetical.getText(); 
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
    // $ANTLR end "entryRuleAlphabetical"


    // $ANTLR start "ruleAlphabetical"
    // InternalEclParser.g:5080:1: ruleAlphabetical returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA )+ ;
    public final AntlrDatatypeRuleToken ruleAlphabetical() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:5087:2: ( (this_ALPHA_0= RULE_ALPHA )+ )
            // InternalEclParser.g:5088:2: (this_ALPHA_0= RULE_ALPHA )+
            {
            // InternalEclParser.g:5088:2: (this_ALPHA_0= RULE_ALPHA )+
            int cnt63=0;
            loop63:
            do {
                int alt63=2;
                int LA63_0 = input.LA(1);

                if ( (LA63_0==RULE_ALPHA) ) {
                    int LA63_2 = input.LA(2);

                    if ( (synpred96_InternalEclParser()) ) {
                        alt63=1;
                    }


                }


                switch (alt63) {
            	case 1 :
            	    // InternalEclParser.g:5089:3: this_ALPHA_0= RULE_ALPHA
            	    {
            	    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_48); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ALPHA_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ALPHA_0, grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall());
            	      		
            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt63 >= 1 ) break loop63;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(63, input);
                        throw eee;
                }
                cnt63++;
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
    // $ANTLR end "ruleAlphabetical"


    // $ANTLR start "entryRuleCONJUNCTION"
    // InternalEclParser.g:5103:1: entryRuleCONJUNCTION returns [String current=null] : iv_ruleCONJUNCTION= ruleCONJUNCTION EOF ;
    public final String entryRuleCONJUNCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONJUNCTION = null;


        try {
            // InternalEclParser.g:5103:51: (iv_ruleCONJUNCTION= ruleCONJUNCTION EOF )
            // InternalEclParser.g:5104:2: iv_ruleCONJUNCTION= ruleCONJUNCTION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCONJUNCTIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCONJUNCTION=ruleCONJUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCONJUNCTION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCONJUNCTION"


    // $ANTLR start "ruleCONJUNCTION"
    // InternalEclParser.g:5110:1: ruleCONJUNCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= AND ;
    public final AntlrDatatypeRuleToken ruleCONJUNCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5116:2: (kw= AND )
            // InternalEclParser.g:5117:2: kw= AND
            {
            kw=(Token)match(input,AND,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCONJUNCTIONAccess().getANDKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCONJUNCTION"


    // $ANTLR start "entryRuleDISJUNCTION"
    // InternalEclParser.g:5125:1: entryRuleDISJUNCTION returns [String current=null] : iv_ruleDISJUNCTION= ruleDISJUNCTION EOF ;
    public final String entryRuleDISJUNCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDISJUNCTION = null;


        try {
            // InternalEclParser.g:5125:51: (iv_ruleDISJUNCTION= ruleDISJUNCTION EOF )
            // InternalEclParser.g:5126:2: iv_ruleDISJUNCTION= ruleDISJUNCTION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDISJUNCTIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDISJUNCTION=ruleDISJUNCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDISJUNCTION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDISJUNCTION"


    // $ANTLR start "ruleDISJUNCTION"
    // InternalEclParser.g:5132:1: ruleDISJUNCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= OR ;
    public final AntlrDatatypeRuleToken ruleDISJUNCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5138:2: (kw= OR )
            // InternalEclParser.g:5139:2: kw= OR
            {
            kw=(Token)match(input,OR,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDISJUNCTIONAccess().getORKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDISJUNCTION"


    // $ANTLR start "entryRuleEXCLUSION"
    // InternalEclParser.g:5147:1: entryRuleEXCLUSION returns [String current=null] : iv_ruleEXCLUSION= ruleEXCLUSION EOF ;
    public final String entryRuleEXCLUSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXCLUSION = null;


        try {
            // InternalEclParser.g:5147:49: (iv_ruleEXCLUSION= ruleEXCLUSION EOF )
            // InternalEclParser.g:5148:2: iv_ruleEXCLUSION= ruleEXCLUSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXCLUSIONRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEXCLUSION=ruleEXCLUSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXCLUSION.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEXCLUSION"


    // $ANTLR start "ruleEXCLUSION"
    // InternalEclParser.g:5154:1: ruleEXCLUSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= MINUS ;
    public final AntlrDatatypeRuleToken ruleEXCLUSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5160:2: (kw= MINUS )
            // InternalEclParser.g:5161:2: kw= MINUS
            {
            kw=(Token)match(input,MINUS,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEXCLUSIONAccess().getMINUSKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEXCLUSION"


    // $ANTLR start "entryRuleTERM_KEYWORD"
    // InternalEclParser.g:5169:1: entryRuleTERM_KEYWORD returns [String current=null] : iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF ;
    public final String entryRuleTERM_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTERM_KEYWORD = null;


        try {
            // InternalEclParser.g:5169:52: (iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF )
            // InternalEclParser.g:5170:2: iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTERM_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTERM_KEYWORD=ruleTERM_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTERM_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTERM_KEYWORD"


    // $ANTLR start "ruleTERM_KEYWORD"
    // InternalEclParser.g:5176:1: ruleTERM_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Term ;
    public final AntlrDatatypeRuleToken ruleTERM_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5182:2: (kw= Term )
            // InternalEclParser.g:5183:2: kw= Term
            {
            kw=(Token)match(input,Term,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTERM_KEYWORDAccess().getTermKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTERM_KEYWORD"


    // $ANTLR start "entryRuleLANGUAGE_KEYWORD"
    // InternalEclParser.g:5191:1: entryRuleLANGUAGE_KEYWORD returns [String current=null] : iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF ;
    public final String entryRuleLANGUAGE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLANGUAGE_KEYWORD = null;


        try {
            // InternalEclParser.g:5191:56: (iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF )
            // InternalEclParser.g:5192:2: iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLANGUAGE_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLANGUAGE_KEYWORD=ruleLANGUAGE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLANGUAGE_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLANGUAGE_KEYWORD"


    // $ANTLR start "ruleLANGUAGE_KEYWORD"
    // InternalEclParser.g:5198:1: ruleLANGUAGE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Language ;
    public final AntlrDatatypeRuleToken ruleLANGUAGE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5204:2: (kw= Language )
            // InternalEclParser.g:5205:2: kw= Language
            {
            kw=(Token)match(input,Language,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLANGUAGE_KEYWORDAccess().getLanguageKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLANGUAGE_KEYWORD"


    // $ANTLR start "entryRuleTYPEID_KEYWORD"
    // InternalEclParser.g:5213:1: entryRuleTYPEID_KEYWORD returns [String current=null] : iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF ;
    public final String entryRuleTYPEID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPEID_KEYWORD = null;


        try {
            // InternalEclParser.g:5213:54: (iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF )
            // InternalEclParser.g:5214:2: iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPEID_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTYPEID_KEYWORD=ruleTYPEID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPEID_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPEID_KEYWORD"


    // $ANTLR start "ruleTYPEID_KEYWORD"
    // InternalEclParser.g:5220:1: ruleTYPEID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= TypeId ;
    public final AntlrDatatypeRuleToken ruleTYPEID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5226:2: (kw= TypeId )
            // InternalEclParser.g:5227:2: kw= TypeId
            {
            kw=(Token)match(input,TypeId,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTYPEID_KEYWORDAccess().getTypeIdKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPEID_KEYWORD"


    // $ANTLR start "entryRuleTYPE_KEYWORD"
    // InternalEclParser.g:5235:1: entryRuleTYPE_KEYWORD returns [String current=null] : iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF ;
    public final String entryRuleTYPE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_KEYWORD = null;


        try {
            // InternalEclParser.g:5235:52: (iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF )
            // InternalEclParser.g:5236:2: iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPE_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleTYPE_KEYWORD=ruleTYPE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTYPE_KEYWORD"


    // $ANTLR start "ruleTYPE_KEYWORD"
    // InternalEclParser.g:5242:1: ruleTYPE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Type ;
    public final AntlrDatatypeRuleToken ruleTYPE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5248:2: (kw= Type )
            // InternalEclParser.g:5249:2: kw= Type
            {
            kw=(Token)match(input,Type,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getTYPE_KEYWORDAccess().getTypeKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTYPE_KEYWORD"


    // $ANTLR start "entryRuleDIALECTID_KEYWORD"
    // InternalEclParser.g:5257:1: entryRuleDIALECTID_KEYWORD returns [String current=null] : iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF ;
    public final String entryRuleDIALECTID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIALECTID_KEYWORD = null;


        try {
            // InternalEclParser.g:5257:57: (iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF )
            // InternalEclParser.g:5258:2: iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDIALECTID_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDIALECTID_KEYWORD=ruleDIALECTID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDIALECTID_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIALECTID_KEYWORD"


    // $ANTLR start "ruleDIALECTID_KEYWORD"
    // InternalEclParser.g:5264:1: ruleDIALECTID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= DialectId ;
    public final AntlrDatatypeRuleToken ruleDIALECTID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5270:2: (kw= DialectId )
            // InternalEclParser.g:5271:2: kw= DialectId
            {
            kw=(Token)match(input,DialectId,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDIALECTID_KEYWORDAccess().getDialectIdKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIALECTID_KEYWORD"


    // $ANTLR start "entryRuleDIALECT_KEYWORD"
    // InternalEclParser.g:5279:1: entryRuleDIALECT_KEYWORD returns [String current=null] : iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF ;
    public final String entryRuleDIALECT_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIALECT_KEYWORD = null;


        try {
            // InternalEclParser.g:5279:55: (iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF )
            // InternalEclParser.g:5280:2: iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDIALECT_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDIALECT_KEYWORD=ruleDIALECT_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDIALECT_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDIALECT_KEYWORD"


    // $ANTLR start "ruleDIALECT_KEYWORD"
    // InternalEclParser.g:5286:1: ruleDIALECT_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Dialect ;
    public final AntlrDatatypeRuleToken ruleDIALECT_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5292:2: (kw= Dialect )
            // InternalEclParser.g:5293:2: kw= Dialect
            {
            kw=(Token)match(input,Dialect,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDIALECT_KEYWORDAccess().getDialectKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDIALECT_KEYWORD"


    // $ANTLR start "entryRuleACTIVE_KEYWORD"
    // InternalEclParser.g:5301:1: entryRuleACTIVE_KEYWORD returns [String current=null] : iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF ;
    public final String entryRuleACTIVE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleACTIVE_KEYWORD = null;


        try {
            // InternalEclParser.g:5301:54: (iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF )
            // InternalEclParser.g:5302:2: iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getACTIVE_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleACTIVE_KEYWORD=ruleACTIVE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleACTIVE_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACTIVE_KEYWORD"


    // $ANTLR start "ruleACTIVE_KEYWORD"
    // InternalEclParser.g:5308:1: ruleACTIVE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Active ;
    public final AntlrDatatypeRuleToken ruleACTIVE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5314:2: (kw= Active )
            // InternalEclParser.g:5315:2: kw= Active
            {
            kw=(Token)match(input,Active,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getACTIVE_KEYWORDAccess().getActiveKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACTIVE_KEYWORD"


    // $ANTLR start "entryRuleMODULEID_KEYWORD"
    // InternalEclParser.g:5323:1: entryRuleMODULEID_KEYWORD returns [String current=null] : iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF ;
    public final String entryRuleMODULEID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMODULEID_KEYWORD = null;


        try {
            // InternalEclParser.g:5323:56: (iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF )
            // InternalEclParser.g:5324:2: iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMODULEID_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleMODULEID_KEYWORD=ruleMODULEID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMODULEID_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMODULEID_KEYWORD"


    // $ANTLR start "ruleMODULEID_KEYWORD"
    // InternalEclParser.g:5330:1: ruleMODULEID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ModuleId ;
    public final AntlrDatatypeRuleToken ruleMODULEID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5336:2: (kw= ModuleId )
            // InternalEclParser.g:5337:2: kw= ModuleId
            {
            kw=(Token)match(input,ModuleId,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getMODULEID_KEYWORDAccess().getModuleIdKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMODULEID_KEYWORD"


    // $ANTLR start "entryRuleSEMANTIC_TAG_KEYWORD"
    // InternalEclParser.g:5345:1: entryRuleSEMANTIC_TAG_KEYWORD returns [String current=null] : iv_ruleSEMANTIC_TAG_KEYWORD= ruleSEMANTIC_TAG_KEYWORD EOF ;
    public final String entryRuleSEMANTIC_TAG_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSEMANTIC_TAG_KEYWORD = null;


        try {
            // InternalEclParser.g:5345:60: (iv_ruleSEMANTIC_TAG_KEYWORD= ruleSEMANTIC_TAG_KEYWORD EOF )
            // InternalEclParser.g:5346:2: iv_ruleSEMANTIC_TAG_KEYWORD= ruleSEMANTIC_TAG_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSEMANTIC_TAG_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleSEMANTIC_TAG_KEYWORD=ruleSEMANTIC_TAG_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSEMANTIC_TAG_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSEMANTIC_TAG_KEYWORD"


    // $ANTLR start "ruleSEMANTIC_TAG_KEYWORD"
    // InternalEclParser.g:5352:1: ruleSEMANTIC_TAG_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= SemanticTag ;
    public final AntlrDatatypeRuleToken ruleSEMANTIC_TAG_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5358:2: (kw= SemanticTag )
            // InternalEclParser.g:5359:2: kw= SemanticTag
            {
            kw=(Token)match(input,SemanticTag,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getSEMANTIC_TAG_KEYWORDAccess().getSemanticTagKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSEMANTIC_TAG_KEYWORD"


    // $ANTLR start "entryRuleEFFECTIVE_TIME_KEYWORD"
    // InternalEclParser.g:5367:1: entryRuleEFFECTIVE_TIME_KEYWORD returns [String current=null] : iv_ruleEFFECTIVE_TIME_KEYWORD= ruleEFFECTIVE_TIME_KEYWORD EOF ;
    public final String entryRuleEFFECTIVE_TIME_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFFECTIVE_TIME_KEYWORD = null;


        try {
            // InternalEclParser.g:5367:62: (iv_ruleEFFECTIVE_TIME_KEYWORD= ruleEFFECTIVE_TIME_KEYWORD EOF )
            // InternalEclParser.g:5368:2: iv_ruleEFFECTIVE_TIME_KEYWORD= ruleEFFECTIVE_TIME_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFFECTIVE_TIME_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleEFFECTIVE_TIME_KEYWORD=ruleEFFECTIVE_TIME_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFFECTIVE_TIME_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEFFECTIVE_TIME_KEYWORD"


    // $ANTLR start "ruleEFFECTIVE_TIME_KEYWORD"
    // InternalEclParser.g:5374:1: ruleEFFECTIVE_TIME_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= EffectiveTime ;
    public final AntlrDatatypeRuleToken ruleEFFECTIVE_TIME_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5380:2: (kw= EffectiveTime )
            // InternalEclParser.g:5381:2: kw= EffectiveTime
            {
            kw=(Token)match(input,EffectiveTime,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEFFECTIVE_TIME_KEYWORDAccess().getEffectiveTimeKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEFFECTIVE_TIME_KEYWORD"


    // $ANTLR start "entryRulePREFERRED_IN_KEYWORD"
    // InternalEclParser.g:5389:1: entryRulePREFERRED_IN_KEYWORD returns [String current=null] : iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF ;
    public final String entryRulePREFERRED_IN_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREFERRED_IN_KEYWORD = null;


        try {
            // InternalEclParser.g:5389:60: (iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF )
            // InternalEclParser.g:5390:2: iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPREFERRED_IN_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_rulePREFERRED_IN_KEYWORD=rulePREFERRED_IN_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePREFERRED_IN_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePREFERRED_IN_KEYWORD"


    // $ANTLR start "rulePREFERRED_IN_KEYWORD"
    // InternalEclParser.g:5396:1: rulePREFERRED_IN_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= PreferredIn ;
    public final AntlrDatatypeRuleToken rulePREFERRED_IN_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5402:2: (kw= PreferredIn )
            // InternalEclParser.g:5403:2: kw= PreferredIn
            {
            kw=(Token)match(input,PreferredIn,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getPREFERRED_IN_KEYWORDAccess().getPreferredInKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePREFERRED_IN_KEYWORD"


    // $ANTLR start "entryRuleACCEPTABLE_IN_KEYWORD"
    // InternalEclParser.g:5411:1: entryRuleACCEPTABLE_IN_KEYWORD returns [String current=null] : iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF ;
    public final String entryRuleACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleACCEPTABLE_IN_KEYWORD = null;


        try {
            // InternalEclParser.g:5411:61: (iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF )
            // InternalEclParser.g:5412:2: iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getACCEPTABLE_IN_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleACCEPTABLE_IN_KEYWORD=ruleACCEPTABLE_IN_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleACCEPTABLE_IN_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleACCEPTABLE_IN_KEYWORD"


    // $ANTLR start "ruleACCEPTABLE_IN_KEYWORD"
    // InternalEclParser.g:5418:1: ruleACCEPTABLE_IN_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= AcceptableIn ;
    public final AntlrDatatypeRuleToken ruleACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5424:2: (kw= AcceptableIn )
            // InternalEclParser.g:5425:2: kw= AcceptableIn
            {
            kw=(Token)match(input,AcceptableIn,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getACCEPTABLE_IN_KEYWORDAccess().getAcceptableInKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleACCEPTABLE_IN_KEYWORD"


    // $ANTLR start "entryRuleLANGUAGE_REFSET_ID_KEYWORD"
    // InternalEclParser.g:5433:1: entryRuleLANGUAGE_REFSET_ID_KEYWORD returns [String current=null] : iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF ;
    public final String entryRuleLANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLANGUAGE_REFSET_ID_KEYWORD = null;


        try {
            // InternalEclParser.g:5433:66: (iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF )
            // InternalEclParser.g:5434:2: iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLANGUAGE_REFSET_ID_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLANGUAGE_REFSET_ID_KEYWORD=ruleLANGUAGE_REFSET_ID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLANGUAGE_REFSET_ID_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLANGUAGE_REFSET_ID_KEYWORD"


    // $ANTLR start "ruleLANGUAGE_REFSET_ID_KEYWORD"
    // InternalEclParser.g:5440:1: ruleLANGUAGE_REFSET_ID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LanguageRefSetId ;
    public final AntlrDatatypeRuleToken ruleLANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5446:2: (kw= LanguageRefSetId )
            // InternalEclParser.g:5447:2: kw= LanguageRefSetId
            {
            kw=(Token)match(input,LanguageRefSetId,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getLANGUAGE_REFSET_ID_KEYWORDAccess().getLanguageRefSetIdKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLANGUAGE_REFSET_ID_KEYWORD"


    // $ANTLR start "entryRuleCASE_SIGNIFICANCE_ID_KEYWORD"
    // InternalEclParser.g:5455:1: entryRuleCASE_SIGNIFICANCE_ID_KEYWORD returns [String current=null] : iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF ;
    public final String entryRuleCASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD = null;


        try {
            // InternalEclParser.g:5455:68: (iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF )
            // InternalEclParser.g:5456:2: iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCASE_SIGNIFICANCE_ID_KEYWORDRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD=ruleCASE_SIGNIFICANCE_ID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCASE_SIGNIFICANCE_ID_KEYWORD"


    // $ANTLR start "ruleCASE_SIGNIFICANCE_ID_KEYWORD"
    // InternalEclParser.g:5462:1: ruleCASE_SIGNIFICANCE_ID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= CaseSignificanceId ;
    public final AntlrDatatypeRuleToken ruleCASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5468:2: (kw= CaseSignificanceId )
            // InternalEclParser.g:5469:2: kw= CaseSignificanceId
            {
            kw=(Token)match(input,CaseSignificanceId,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCASE_SIGNIFICANCE_ID_KEYWORDAccess().getCaseSignificanceIdKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCASE_SIGNIFICANCE_ID_KEYWORD"


    // $ANTLR start "entryRuleLEXICAL_SEARCH_TYPE"
    // InternalEclParser.g:5477:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEclParser.g:5477:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEclParser.g:5478:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
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
    // InternalEclParser.g:5484:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Match | kw= Wild | kw= Regex | kw= Exact ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5490:2: ( (kw= Match | kw= Wild | kw= Regex | kw= Exact ) )
            // InternalEclParser.g:5491:2: (kw= Match | kw= Wild | kw= Regex | kw= Exact )
            {
            // InternalEclParser.g:5491:2: (kw= Match | kw= Wild | kw= Regex | kw= Exact )
            int alt64=4;
            switch ( input.LA(1) ) {
            case Match:
                {
                alt64=1;
                }
                break;
            case Wild:
                {
                alt64=2;
                }
                break;
            case Regex:
                {
                alt64=3;
                }
                break;
            case Exact:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalEclParser.g:5492:3: kw= Match
                    {
                    kw=(Token)match(input,Match,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMatchKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:5498:3: kw= Wild
                    {
                    kw=(Token)match(input,Wild,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWildKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEclParser.g:5504:3: kw= Regex
                    {
                    kw=(Token)match(input,Regex,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getRegexKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEclParser.g:5510:3: kw= Exact
                    {
                    kw=(Token)match(input,Exact,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getExactKeyword_3());
                      		
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


    // $ANTLR start "entryRuleDOMAIN"
    // InternalEclParser.g:5519:1: entryRuleDOMAIN returns [String current=null] : iv_ruleDOMAIN= ruleDOMAIN EOF ;
    public final String entryRuleDOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAIN = null;


        try {
            // InternalEclParser.g:5519:46: (iv_ruleDOMAIN= ruleDOMAIN EOF )
            // InternalEclParser.g:5520:2: iv_ruleDOMAIN= ruleDOMAIN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOMAINRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleDOMAIN=ruleDOMAIN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOMAIN.getText(); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOMAIN"


    // $ANTLR start "ruleDOMAIN"
    // InternalEclParser.g:5526:1: ruleDOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Concept | kw= Description ) ;
    public final AntlrDatatypeRuleToken ruleDOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5532:2: ( (kw= Concept | kw= Description ) )
            // InternalEclParser.g:5533:2: (kw= Concept | kw= Description )
            {
            // InternalEclParser.g:5533:2: (kw= Concept | kw= Description )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Concept) ) {
                alt65=1;
            }
            else if ( (LA65_0==Description) ) {
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
                    // InternalEclParser.g:5534:3: kw= Concept
                    {
                    kw=(Token)match(input,Concept,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDOMAINAccess().getConceptKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:5540:3: kw= Description
                    {
                    kw=(Token)match(input,Description,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDOMAINAccess().getDescriptionKeyword_1());
                      		
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
    // $ANTLR end "ruleDOMAIN"


    // $ANTLR start "entryRuleNON_NUMERIC_OPERATOR"
    // InternalEclParser.g:5549:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEclParser.g:5549:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEclParser.g:5550:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
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
    // InternalEclParser.g:5556:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:5562:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5563:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5563:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_EQUAL) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_NOT_EQUAL) ) {
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
                    // InternalEclParser.g:5564:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEclParser.g:5572:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
    // InternalEclParser.g:5583:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEclParser.g:5583:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEclParser.g:5584:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
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
    // InternalEclParser.g:5590:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
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
            // InternalEclParser.g:5596:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEclParser.g:5597:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEclParser.g:5597:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt67=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt67=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt67=2;
                }
                break;
            case RULE_GT:
                {
                alt67=3;
                }
                break;
            case RULE_LT:
                {
                alt67=4;
                }
                break;
            case RULE_GTE:
                {
                alt67=5;
                }
                break;
            case RULE_LTE:
                {
                alt67=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalEclParser.g:5598:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEclParser.g:5606:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
                    // InternalEclParser.g:5614:3: this_GT_2= RULE_GT
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
                    // InternalEclParser.g:5622:3: this_LT_3= RULE_LT
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
                    // InternalEclParser.g:5630:3: this_GTE_4= RULE_GTE
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
                    // InternalEclParser.g:5638:3: this_LTE_5= RULE_LTE
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

    // $ANTLR start synpred2_InternalEclParser
    public final void synpred2_InternalEclParser_fragment() throws RecognitionException {   
        EObject lv_right_3_0 = null;


        // InternalEclParser.g:178:4: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) ) )
        // InternalEclParser.g:178:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndExpressionConstraint ) )
        {
        // InternalEclParser.g:178:4: ()
        // InternalEclParser.g:179:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        pushFollow(FollowSets000.FOLLOW_4);
        ruleDISJUNCTION();

        state._fsp--;
        if (state.failed) return ;
        // InternalEclParser.g:198:4: ( (lv_right_3_0= ruleAndExpressionConstraint ) )
        // InternalEclParser.g:199:5: (lv_right_3_0= ruleAndExpressionConstraint )
        {
        // InternalEclParser.g:199:5: (lv_right_3_0= ruleAndExpressionConstraint )
        // InternalEclParser.g:200:6: lv_right_3_0= ruleAndExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_3_0=ruleAndExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred2_InternalEclParser

    // $ANTLR start synpred4_InternalEclParser
    public final void synpred4_InternalEclParser_fragment() throws RecognitionException {   
        Token this_COMMA_3=null;
        EObject lv_right_4_0 = null;


        // InternalEclParser.g:249:4: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) ) )
        // InternalEclParser.g:249:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
        {
        // InternalEclParser.g:249:4: ()
        // InternalEclParser.g:250:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        // InternalEclParser.g:259:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
        int alt68=2;
        int LA68_0 = input.LA(1);

        if ( (LA68_0==AND) ) {
            alt68=1;
        }
        else if ( (LA68_0==RULE_COMMA) ) {
            alt68=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 68, 0, input);

            throw nvae;
        }
        switch (alt68) {
            case 1 :
                // InternalEclParser.g:260:5: ruleCONJUNCTION
                {
                pushFollow(FollowSets000.FOLLOW_4);
                ruleCONJUNCTION();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // InternalEclParser.g:271:5: this_COMMA_3= RULE_COMMA
                {
                this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_4); if (state.failed) return ;

                }
                break;

        }

        // InternalEclParser.g:276:4: ( (lv_right_4_0= ruleExclusionExpressionConstraint ) )
        // InternalEclParser.g:277:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
        {
        // InternalEclParser.g:277:5: (lv_right_4_0= ruleExclusionExpressionConstraint )
        // InternalEclParser.g:278:6: lv_right_4_0= ruleExclusionExpressionConstraint
        {
        if ( state.backtracking==0 ) {

          						newCompositeNode(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0());
          					
        }
        pushFollow(FollowSets000.FOLLOW_2);
        lv_right_4_0=ruleExclusionExpressionConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred4_InternalEclParser

    // $ANTLR start synpred24_InternalEclParser
    public final void synpred24_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1375:4: ( OR )
        // InternalEclParser.g:1375:5: OR
        {
        match(input,OR,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalEclParser

    // $ANTLR start synpred26_InternalEclParser
    public final void synpred26_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1449:4: ( AND | RULE_COMMA )
        // InternalEclParser.g:
        {
        if ( input.LA(1)==AND||input.LA(1)==RULE_COMMA ) {
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
    // $ANTLR end synpred26_InternalEclParser

    // $ANTLR start synpred28_InternalEclParser
    public final void synpred28_InternalEclParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEclParser.g:1518:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEclParser.g:1518:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred28_InternalEclParser

    // $ANTLR start synpred29_InternalEclParser
    public final void synpred29_InternalEclParser_fragment() throws RecognitionException {   
        EObject this_EclAttributeGroup_1 = null;


        // InternalEclParser.g:1530:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEclParser.g:1530:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
    // $ANTLR end synpred29_InternalEclParser

    // $ANTLR start synpred34_InternalEclParser
    public final void synpred34_InternalEclParser_fragment() throws RecognitionException {   
        EObject this_AttributeConstraint_0 = null;


        // InternalEclParser.g:1860:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEclParser.g:1860:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
    // $ANTLR end synpred34_InternalEclParser

    // $ANTLR start synpred79_InternalEclParser
    public final void synpred79_InternalEclParser_fragment() throws RecognitionException {   
        Token this_DIGIT_NONZERO_0=null;

        // InternalEclParser.g:4659:3: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO )
        // InternalEclParser.g:4659:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalEclParser

    // $ANTLR start synpred80_InternalEclParser
    public final void synpred80_InternalEclParser_fragment() throws RecognitionException {   
        Token this_ZERO_1=null;

        // InternalEclParser.g:4667:3: (this_ZERO_1= RULE_ZERO )
        // InternalEclParser.g:4667:3: this_ZERO_1= RULE_ZERO
        {
        this_ZERO_1=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred80_InternalEclParser

    // $ANTLR start synpred93_InternalEclParser
    public final void synpred93_InternalEclParser_fragment() throws RecognitionException {   
        Token this_ALPHA_2=null;

        // InternalEclParser.g:5037:4: (this_ALPHA_2= RULE_ALPHA )
        // InternalEclParser.g:5037:4: this_ALPHA_2= RULE_ALPHA
        {
        this_ALPHA_2=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalEclParser

    // $ANTLR start synpred96_InternalEclParser
    public final void synpred96_InternalEclParser_fragment() throws RecognitionException {   
        Token this_ALPHA_0=null;

        // InternalEclParser.g:5089:3: (this_ALPHA_0= RULE_ALPHA )
        // InternalEclParser.g:5089:3: this_ALPHA_0= RULE_ALPHA
        {
        this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalEclParser

    // Delegated rules

    public final boolean synpred34_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred34_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred28_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred28_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred26_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred24_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred80_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred80_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred79_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred79_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred96_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred96_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred93_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred93_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA17 dfa17 = new DFA17(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA27 dfa27 = new DFA27(this);
    protected DFA31 dfa31 = new DFA31(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\36\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\70\1\0\15\uffff\1\0\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\15\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\15\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\2\uffff\2\2\1\uffff\1\20\1\uffff\1\17\1\uffff\1\1\3\uffff\1\2\1\uffff\1\2\2\uffff\10\2",
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

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1517:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_1 = input.LA(1);

                         
                        int index17_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEclParser()) ) {s = 2;}

                        else if ( (synpred29_InternalEclParser()) ) {s = 16;}

                         
                        input.seek(index17_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_15 = input.LA(1);

                         
                        int index17_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEclParser()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index17_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\36\16\uffff\1\0\1\uffff";
    static final String dfa_9s = "\1\70\16\uffff\1\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\16\uffff\1\2";
    static final String dfa_11s = "\17\uffff\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\2\uffff\2\1\3\uffff\1\17\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\10\1",
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

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1859:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_15 = input.LA(1);

                         
                        int index22_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalEclParser()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index22_15);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\14\uffff\2\16\2\uffff\2\16";
    static final String dfa_14s = "\1\57\2\24\4\73\1\41\2\uffff\2\41\2\22\2\uffff\2\22";
    static final String dfa_15s = "\1\72\2\102\4\73\1\53\2\uffff\2\42\2\75\2\uffff\2\75";
    static final String dfa_16s = "\10\uffff\1\2\1\1\4\uffff\1\3\1\4\2\uffff";
    static final String dfa_17s = "\22\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\4\1\3\6\uffff\1\5\1\6",
            "\1\11\3\uffff\1\11\42\uffff\1\7\6\uffff\1\10",
            "\1\11\3\uffff\1\11\42\uffff\1\7\6\uffff\1\10",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\7",
            "\1\14\1\15\7\uffff\1\12\1\13",
            "",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\16\10\uffff\2\16\3\uffff\1\16\4\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "\1\16\10\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "",
            "",
            "\1\16\10\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "\1\16\10\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16"
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2209:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_19s = "\1\4\4\uffff\2\55\11\uffff\1\6";
    static final String dfa_20s = "\1\46\4\uffff\2\55\11\uffff\1\20";
    static final String dfa_21s = "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\uffff";
    static final String dfa_22s = "\21\uffff}>";
    static final String[] dfa_23s = {
            "\1\16\1\12\1\15\1\11\1\6\1\10\1\14\1\4\1\2\1\13\1\5\1\4\1\7\1\3\5\uffff\1\1\1\uffff\1\3\14\uffff\1\17",
            "",
            "",
            "",
            "",
            "\1\20",
            "\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\15\3\uffff\1\14\2\uffff\1\13\2\uffff\1\7"
    };
    static final char[] dfa_19 = DFA.unpackEncodedStringToUnsignedChars(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final short[] dfa_21 = DFA.unpackEncodedString(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[][] dfa_23 = unpackEncodedStringArray(dfa_23s);

    class DFA31 extends DFA {

        public DFA31(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 31;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_19;
            this.max = dfa_20;
            this.accept = dfa_21;
            this.special = dfa_22;
            this.transition = dfa_23;
        }
        public String getDescription() {
            return "2817:2: (this_TermFilter_0= ruleTermFilter | this_LanguageFilter_1= ruleLanguageFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_SemanticTagFilter_9= ruleSemanticTagFilter | this_EffectiveTimeFilter_10= ruleEffectiveTimeFilter | this_CaseSignificanceFilter_11= ruleCaseSignificanceFilter | this_NestedFilter_12= ruleNestedFilter )";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000010000002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x01FE504600000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000108000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000800000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x01FE515640000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000200000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x1000000000000002L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000020000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000600000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000008600000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x01FE514640000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x01FE504640000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0607800000000002L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000400600000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000001100000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00000C0600000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000400283FFF0L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x2000000000000000L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001800000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000004680000L,0x0000000000000004L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000004000000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0001808000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x4000004000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x4000000000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x4000008000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000004600000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000004600000002L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000014100L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000800000000000L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000006100L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000004500L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000004140L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0607800000000000L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000600000002L});
        public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x4000080600000002L});
        public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x4000000000000002L});
    }


}