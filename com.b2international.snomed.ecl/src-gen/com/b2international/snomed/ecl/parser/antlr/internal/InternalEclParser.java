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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CaseSignificanceId", "LanguageRefSetId", "AcceptableIn", "Description", "PreferredIn", "DialectId", "Language", "ModuleId", "Concept", "Dialect", "Active", "TypeId", "Exact", "False", "Match", "Minus", "Regex", "Term", "True", "Type", "Wild", "And", "Or", "RULE_TERM_STRING", "RULE_REVERSED", "RULE_TO", "RULE_COMMA", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_HASH", "RULE_DOUBLE_CURLY_OPEN", "RULE_DOUBLE_CURLY_CLOSE", "RULE_ALPHA", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int Or=26;
    public static final int RULE_DIGIT_NONZERO=32;
    public static final int RULE_CURLY_OPEN=34;
    public static final int RULE_TO=29;
    public static final int RULE_ROUND_CLOSE=37;
    public static final int RULE_DBL_GT=50;
    public static final int True=22;
    public static final int RULE_GT=48;
    public static final int False=17;
    public static final int DialectId=9;
    public static final int RULE_GTE=55;
    public static final int ModuleId=11;
    public static final int Regex=20;
    public static final int RULE_ROUND_OPEN=36;
    public static final int RULE_DBL_LT=49;
    public static final int RULE_NOT_EQUAL=46;
    public static final int Concept=12;
    public static final int AcceptableIn=6;
    public static final int TypeId=15;
    public static final int RULE_SQUARE_CLOSE=39;
    public static final int RULE_SQUARE_OPEN=38;
    public static final int RULE_EQUAL=45;
    public static final int RULE_COMMA=30;
    public static final int RULE_LT_EM=51;
    public static final int RULE_CURLY_CLOSE=35;
    public static final int RULE_ZERO=31;
    public static final int RULE_DBL_GT_EM=54;
    public static final int Term=21;
    public static final int RULE_COLON=33;
    public static final int RULE_LT=47;
    public static final int Active=14;
    public static final int RULE_DOUBLE_CURLY_CLOSE=59;
    public static final int And=25;
    public static final int RULE_ML_COMMENT=62;
    public static final int Minus=19;
    public static final int RULE_LTE=56;
    public static final int RULE_ALPHA=60;
    public static final int Description=7;
    public static final int Wild=24;
    public static final int RULE_STRING=64;
    public static final int RULE_REVERSED=28;
    public static final int Match=18;
    public static final int RULE_SL_COMMENT=63;
    public static final int PreferredIn=8;
    public static final int RULE_HASH=57;
    public static final int Language=10;
    public static final int RULE_DASH=41;
    public static final int Dialect=13;
    public static final int RULE_PLUS=40;
    public static final int Exact=16;
    public static final int RULE_DOT=43;
    public static final int EOF=-1;
    public static final int RULE_GT_EM=53;
    public static final int RULE_WS=61;
    public static final int RULE_CARET=42;
    public static final int Type=23;
    public static final int RULE_DOUBLE_CURLY_OPEN=58;
    public static final int RULE_WILDCARD=44;
    public static final int LanguageRefSetId=5;
    public static final int RULE_TERM_STRING=27;
    public static final int RULE_DBL_LT_EM=52;
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

            if ( (LA1_0==RULE_DIGIT_NONZERO||LA1_0==RULE_ROUND_OPEN||LA1_0==RULE_CARET||LA1_0==RULE_WILDCARD||(LA1_0>=RULE_LT && LA1_0<=RULE_DBL_GT_EM)||LA1_0==RULE_DOUBLE_CURLY_OPEN) ) {
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

                if ( (LA2_0==Or) ) {
                    int LA2_6 = input.LA(2);

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

                if ( (LA4_0==And) ) {
                    int LA4_5 = input.LA(2);

                    if ( (synpred4_InternalEclParser()) ) {
                        alt4=1;
                    }


                }
                else if ( (LA4_0==RULE_COMMA) ) {
                    int LA4_6 = input.LA(2);

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

            	    if ( (LA3_0==And) ) {
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

            if ( (LA5_0==Minus) ) {
                int LA5_1 = input.LA(2);

                if ( (synpred5_InternalEclParser()) ) {
                    alt5=1;
                }
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
    // InternalEclParser.g:443:1: ruleDottedExpressionConstraint returns [EObject current=null] : (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* ) ;
    public final EObject ruleDottedExpressionConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOT_2=null;
        EObject this_SubExpressionConstraint_0 = null;

        EObject lv_attribute_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:449:2: ( (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* ) )
            // InternalEclParser.g:450:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* )
            {
            // InternalEclParser.g:450:2: (this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )* )
            // InternalEclParser.g:451:3: this_SubExpressionConstraint_0= ruleSubExpressionConstraint ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_9);
            this_SubExpressionConstraint_0=ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_SubExpressionConstraint_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:462:3: ( () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RULE_DOT) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalEclParser.g:463:4: () this_DOT_2= RULE_DOT ( (lv_attribute_3_0= ruleSubExpressionConstraint ) )
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
            	    // InternalEclParser.g:477:4: ( (lv_attribute_3_0= ruleSubExpressionConstraint ) )
            	    // InternalEclParser.g:478:5: (lv_attribute_3_0= ruleSubExpressionConstraint )
            	    {
            	    // InternalEclParser.g:478:5: (lv_attribute_3_0= ruleSubExpressionConstraint )
            	    // InternalEclParser.g:479:6: lv_attribute_3_0= ruleSubExpressionConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_9);
            	    lv_attribute_3_0=ruleSubExpressionConstraint();

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
            	      							"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
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


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalEclParser.g:501:1: entryRuleSubExpressionConstraint returns [EObject current=null] : iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF ;
    public final EObject entryRuleSubExpressionConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubExpressionConstraint = null;


        try {
            // InternalEclParser.g:501:64: (iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF )
            // InternalEclParser.g:502:2: iv_ruleSubExpressionConstraint= ruleSubExpressionConstraint EOF
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
    // InternalEclParser.g:508:1: ruleSubExpressionConstraint returns [EObject current=null] : (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept | this_FilterConstraint_9= ruleFilterConstraint ) ;
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

        EObject this_FilterConstraint_9 = null;



        	enterRule();

        try {
            // InternalEclParser.g:514:2: ( (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept | this_FilterConstraint_9= ruleFilterConstraint ) )
            // InternalEclParser.g:515:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept | this_FilterConstraint_9= ruleFilterConstraint )
            {
            // InternalEclParser.g:515:2: (this_ChildOf_0= ruleChildOf | this_ChildOrSelfOf_1= ruleChildOrSelfOf | this_DescendantOf_2= ruleDescendantOf | this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf | this_ParentOf_4= ruleParentOf | this_ParentOrSelfOf_5= ruleParentOrSelfOf | this_AncestorOf_6= ruleAncestorOf | this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf | this_EclFocusConcept_8= ruleEclFocusConcept | this_FilterConstraint_9= ruleFilterConstraint )
            int alt8=10;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt8=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt8=2;
                }
                break;
            case RULE_LT:
                {
                alt8=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt8=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt8=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt8=6;
                }
                break;
            case RULE_GT:
                {
                alt8=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt8=8;
                }
                break;
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt8=9;
                }
                break;
            case RULE_DOUBLE_CURLY_OPEN:
                {
                alt8=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEclParser.g:516:3: this_ChildOf_0= ruleChildOf
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
                    // InternalEclParser.g:528:3: this_ChildOrSelfOf_1= ruleChildOrSelfOf
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
                    // InternalEclParser.g:540:3: this_DescendantOf_2= ruleDescendantOf
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
                    // InternalEclParser.g:552:3: this_DescendantOrSelfOf_3= ruleDescendantOrSelfOf
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
                    // InternalEclParser.g:564:3: this_ParentOf_4= ruleParentOf
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
                    // InternalEclParser.g:576:3: this_ParentOrSelfOf_5= ruleParentOrSelfOf
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
                    // InternalEclParser.g:588:3: this_AncestorOf_6= ruleAncestorOf
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
                    // InternalEclParser.g:600:3: this_AncestorOrSelfOf_7= ruleAncestorOrSelfOf
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
                    // InternalEclParser.g:612:3: this_EclFocusConcept_8= ruleEclFocusConcept
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
                case 10 :
                    // InternalEclParser.g:624:3: this_FilterConstraint_9= ruleFilterConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getSubExpressionConstraintAccess().getFilterConstraintParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_FilterConstraint_9=ruleFilterConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_FilterConstraint_9;
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
    // InternalEclParser.g:639:1: entryRuleEclFocusConcept returns [EObject current=null] : iv_ruleEclFocusConcept= ruleEclFocusConcept EOF ;
    public final EObject entryRuleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclFocusConcept = null;


        try {
            // InternalEclParser.g:639:56: (iv_ruleEclFocusConcept= ruleEclFocusConcept EOF )
            // InternalEclParser.g:640:2: iv_ruleEclFocusConcept= ruleEclFocusConcept EOF
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
    // InternalEclParser.g:646:1: ruleEclFocusConcept returns [EObject current=null] : (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) ;
    public final EObject ruleEclFocusConcept() throws RecognitionException {
        EObject current = null;

        EObject this_MemberOf_0 = null;

        EObject this_EclConceptReference_1 = null;

        EObject this_Any_2 = null;

        EObject this_NestedExpression_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:652:2: ( (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression ) )
            // InternalEclParser.g:653:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            {
            // InternalEclParser.g:653:2: (this_MemberOf_0= ruleMemberOf | this_EclConceptReference_1= ruleEclConceptReference | this_Any_2= ruleAny | this_NestedExpression_3= ruleNestedExpression )
            int alt9=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt9=1;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt9=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt9=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt9=4;
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
                    // InternalEclParser.g:654:3: this_MemberOf_0= ruleMemberOf
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
                    // InternalEclParser.g:666:3: this_EclConceptReference_1= ruleEclConceptReference
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
                    // InternalEclParser.g:678:3: this_Any_2= ruleAny
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
                    // InternalEclParser.g:690:3: this_NestedExpression_3= ruleNestedExpression
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
    // InternalEclParser.g:705:1: entryRuleChildOf returns [EObject current=null] : iv_ruleChildOf= ruleChildOf EOF ;
    public final EObject entryRuleChildOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOf = null;


        try {
            // InternalEclParser.g:705:48: (iv_ruleChildOf= ruleChildOf EOF )
            // InternalEclParser.g:706:2: iv_ruleChildOf= ruleChildOf EOF
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
    // InternalEclParser.g:712:1: ruleChildOf returns [EObject current=null] : (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:718:2: ( (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:719:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:719:2: (this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:720:3: this_LT_EM_0= RULE_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_EM_0=(Token)match(input,RULE_LT_EM,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_EM_0, grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:724:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:725:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:725:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:726:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:747:1: entryRuleChildOrSelfOf returns [EObject current=null] : iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF ;
    public final EObject entryRuleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChildOrSelfOf = null;


        try {
            // InternalEclParser.g:747:54: (iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF )
            // InternalEclParser.g:748:2: iv_ruleChildOrSelfOf= ruleChildOrSelfOf EOF
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
    // InternalEclParser.g:754:1: ruleChildOrSelfOf returns [EObject current=null] : (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleChildOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:760:2: ( (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:761:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:761:2: (this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:762:3: this_DBL_LT_EM_0= RULE_DBL_LT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_EM_0=(Token)match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_EM_0, grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:766:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:767:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:767:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:768:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:789:1: entryRuleDescendantOf returns [EObject current=null] : iv_ruleDescendantOf= ruleDescendantOf EOF ;
    public final EObject entryRuleDescendantOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOf = null;


        try {
            // InternalEclParser.g:789:53: (iv_ruleDescendantOf= ruleDescendantOf EOF )
            // InternalEclParser.g:790:2: iv_ruleDescendantOf= ruleDescendantOf EOF
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
    // InternalEclParser.g:796:1: ruleDescendantOf returns [EObject current=null] : (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOf() throws RecognitionException {
        EObject current = null;

        Token this_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:802:2: ( (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:803:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:803:2: (this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:804:3: this_LT_0= RULE_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_LT_0=(Token)match(input,RULE_LT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_LT_0, grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:808:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:809:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:809:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:810:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:831:1: entryRuleDescendantOrSelfOf returns [EObject current=null] : iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF ;
    public final EObject entryRuleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescendantOrSelfOf = null;


        try {
            // InternalEclParser.g:831:59: (iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF )
            // InternalEclParser.g:832:2: iv_ruleDescendantOrSelfOf= ruleDescendantOrSelfOf EOF
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
    // InternalEclParser.g:838:1: ruleDescendantOrSelfOf returns [EObject current=null] : (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleDescendantOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_LT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:844:2: ( (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:845:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:845:2: (this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:846:3: this_DBL_LT_0= RULE_DBL_LT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_LT_0=(Token)match(input,RULE_DBL_LT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_LT_0, grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:850:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:851:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:851:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:852:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:873:1: entryRuleParentOf returns [EObject current=null] : iv_ruleParentOf= ruleParentOf EOF ;
    public final EObject entryRuleParentOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOf = null;


        try {
            // InternalEclParser.g:873:49: (iv_ruleParentOf= ruleParentOf EOF )
            // InternalEclParser.g:874:2: iv_ruleParentOf= ruleParentOf EOF
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
    // InternalEclParser.g:880:1: ruleParentOf returns [EObject current=null] : (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:886:2: ( (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:887:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:887:2: (this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:888:3: this_GT_EM_0= RULE_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_EM_0=(Token)match(input,RULE_GT_EM,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_EM_0, grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:892:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:893:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:893:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:894:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:915:1: entryRuleParentOrSelfOf returns [EObject current=null] : iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF ;
    public final EObject entryRuleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParentOrSelfOf = null;


        try {
            // InternalEclParser.g:915:55: (iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF )
            // InternalEclParser.g:916:2: iv_ruleParentOrSelfOf= ruleParentOrSelfOf EOF
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
    // InternalEclParser.g:922:1: ruleParentOrSelfOf returns [EObject current=null] : (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleParentOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_EM_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:928:2: ( (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:929:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:929:2: (this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:930:3: this_DBL_GT_EM_0= RULE_DBL_GT_EM ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_EM_0=(Token)match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_EM_0, grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:934:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:935:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:935:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:936:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:957:1: entryRuleAncestorOf returns [EObject current=null] : iv_ruleAncestorOf= ruleAncestorOf EOF ;
    public final EObject entryRuleAncestorOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOf = null;


        try {
            // InternalEclParser.g:957:51: (iv_ruleAncestorOf= ruleAncestorOf EOF )
            // InternalEclParser.g:958:2: iv_ruleAncestorOf= ruleAncestorOf EOF
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
    // InternalEclParser.g:964:1: ruleAncestorOf returns [EObject current=null] : (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOf() throws RecognitionException {
        EObject current = null;

        Token this_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:970:2: ( (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:971:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:971:2: (this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:972:3: this_GT_0= RULE_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_GT_0=(Token)match(input,RULE_GT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_GT_0, grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:976:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:977:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:977:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:978:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:999:1: entryRuleAncestorOrSelfOf returns [EObject current=null] : iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF ;
    public final EObject entryRuleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAncestorOrSelfOf = null;


        try {
            // InternalEclParser.g:999:57: (iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF )
            // InternalEclParser.g:1000:2: iv_ruleAncestorOrSelfOf= ruleAncestorOrSelfOf EOF
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
    // InternalEclParser.g:1006:1: ruleAncestorOrSelfOf returns [EObject current=null] : (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) ;
    public final EObject ruleAncestorOrSelfOf() throws RecognitionException {
        EObject current = null;

        Token this_DBL_GT_0=null;
        EObject lv_constraint_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1012:2: ( (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) ) )
            // InternalEclParser.g:1013:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            {
            // InternalEclParser.g:1013:2: (this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) ) )
            // InternalEclParser.g:1014:3: this_DBL_GT_0= RULE_DBL_GT ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            {
            this_DBL_GT_0=(Token)match(input,RULE_DBL_GT,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DBL_GT_0, grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1018:3: ( (lv_constraint_1_0= ruleEclFocusConcept ) )
            // InternalEclParser.g:1019:4: (lv_constraint_1_0= ruleEclFocusConcept )
            {
            // InternalEclParser.g:1019:4: (lv_constraint_1_0= ruleEclFocusConcept )
            // InternalEclParser.g:1020:5: lv_constraint_1_0= ruleEclFocusConcept
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
    // InternalEclParser.g:1041:1: entryRuleMemberOf returns [EObject current=null] : iv_ruleMemberOf= ruleMemberOf EOF ;
    public final EObject entryRuleMemberOf() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMemberOf = null;


        try {
            // InternalEclParser.g:1041:49: (iv_ruleMemberOf= ruleMemberOf EOF )
            // InternalEclParser.g:1042:2: iv_ruleMemberOf= ruleMemberOf EOF
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
    // InternalEclParser.g:1048:1: ruleMemberOf returns [EObject current=null] : (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) ;
    public final EObject ruleMemberOf() throws RecognitionException {
        EObject current = null;

        Token this_CARET_0=null;
        EObject lv_constraint_1_1 = null;

        EObject lv_constraint_1_2 = null;

        EObject lv_constraint_1_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1054:2: ( (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) ) )
            // InternalEclParser.g:1055:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            {
            // InternalEclParser.g:1055:2: (this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) ) )
            // InternalEclParser.g:1056:3: this_CARET_0= RULE_CARET ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            {
            this_CARET_0=(Token)match(input,RULE_CARET,FollowSets000.FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_CARET_0, grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1060:3: ( ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) ) )
            // InternalEclParser.g:1061:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            {
            // InternalEclParser.g:1061:4: ( (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression ) )
            // InternalEclParser.g:1062:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            {
            // InternalEclParser.g:1062:5: (lv_constraint_1_1= ruleEclConceptReference | lv_constraint_1_2= ruleAny | lv_constraint_1_3= ruleNestedExpression )
            int alt10=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_NONZERO:
                {
                alt10=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt10=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt10=3;
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
                    // InternalEclParser.g:1063:6: lv_constraint_1_1= ruleEclConceptReference
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
                    // InternalEclParser.g:1079:6: lv_constraint_1_2= ruleAny
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
                    // InternalEclParser.g:1095:6: lv_constraint_1_3= ruleNestedExpression
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
    // InternalEclParser.g:1117:1: entryRuleEclConceptReference returns [EObject current=null] : iv_ruleEclConceptReference= ruleEclConceptReference EOF ;
    public final EObject entryRuleEclConceptReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReference = null;


        try {
            // InternalEclParser.g:1117:60: (iv_ruleEclConceptReference= ruleEclConceptReference EOF )
            // InternalEclParser.g:1118:2: iv_ruleEclConceptReference= ruleEclConceptReference EOF
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
    // InternalEclParser.g:1124:1: ruleEclConceptReference returns [EObject current=null] : ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) ;
    public final EObject ruleEclConceptReference() throws RecognitionException {
        EObject current = null;

        Token lv_term_1_0=null;
        AntlrDatatypeRuleToken lv_id_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1130:2: ( ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? ) )
            // InternalEclParser.g:1131:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            {
            // InternalEclParser.g:1131:2: ( ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )? )
            // InternalEclParser.g:1132:3: ( (lv_id_0_0= ruleSnomedIdentifier ) ) ( (lv_term_1_0= RULE_TERM_STRING ) )?
            {
            // InternalEclParser.g:1132:3: ( (lv_id_0_0= ruleSnomedIdentifier ) )
            // InternalEclParser.g:1133:4: (lv_id_0_0= ruleSnomedIdentifier )
            {
            // InternalEclParser.g:1133:4: (lv_id_0_0= ruleSnomedIdentifier )
            // InternalEclParser.g:1134:5: lv_id_0_0= ruleSnomedIdentifier
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

            // InternalEclParser.g:1151:3: ( (lv_term_1_0= RULE_TERM_STRING ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_TERM_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEclParser.g:1152:4: (lv_term_1_0= RULE_TERM_STRING )
                    {
                    // InternalEclParser.g:1152:4: (lv_term_1_0= RULE_TERM_STRING )
                    // InternalEclParser.g:1153:5: lv_term_1_0= RULE_TERM_STRING
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
    // InternalEclParser.g:1173:1: entryRuleEclConceptReferenceSet returns [EObject current=null] : iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF ;
    public final EObject entryRuleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclConceptReferenceSet = null;


        try {
            // InternalEclParser.g:1173:63: (iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF )
            // InternalEclParser.g:1174:2: iv_ruleEclConceptReferenceSet= ruleEclConceptReferenceSet EOF
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
    // InternalEclParser.g:1180:1: ruleEclConceptReferenceSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleEclConceptReferenceSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_3=null;
        EObject lv_concepts_1_0 = null;

        EObject lv_concepts_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1186:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1187:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1187:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1188:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_concepts_1_0= ruleEclConceptReference ) ) ( (lv_concepts_2_0= ruleEclConceptReference ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getEclConceptReferenceSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1192:3: ( (lv_concepts_1_0= ruleEclConceptReference ) )
            // InternalEclParser.g:1193:4: (lv_concepts_1_0= ruleEclConceptReference )
            {
            // InternalEclParser.g:1193:4: (lv_concepts_1_0= ruleEclConceptReference )
            // InternalEclParser.g:1194:5: lv_concepts_1_0= ruleEclConceptReference
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

            // InternalEclParser.g:1211:3: ( (lv_concepts_2_0= ruleEclConceptReference ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_DIGIT_NONZERO) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEclParser.g:1212:4: (lv_concepts_2_0= ruleEclConceptReference )
            	    {
            	    // InternalEclParser.g:1212:4: (lv_concepts_2_0= ruleEclConceptReference )
            	    // InternalEclParser.g:1213:5: lv_concepts_2_0= ruleEclConceptReference
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
            	    break loop12;
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
    // InternalEclParser.g:1238:1: entryRuleAny returns [EObject current=null] : iv_ruleAny= ruleAny EOF ;
    public final EObject entryRuleAny() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAny = null;


        try {
            // InternalEclParser.g:1238:44: (iv_ruleAny= ruleAny EOF )
            // InternalEclParser.g:1239:2: iv_ruleAny= ruleAny EOF
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
    // InternalEclParser.g:1245:1: ruleAny returns [EObject current=null] : (this_WILDCARD_0= RULE_WILDCARD () ) ;
    public final EObject ruleAny() throws RecognitionException {
        EObject current = null;

        Token this_WILDCARD_0=null;


        	enterRule();

        try {
            // InternalEclParser.g:1251:2: ( (this_WILDCARD_0= RULE_WILDCARD () ) )
            // InternalEclParser.g:1252:2: (this_WILDCARD_0= RULE_WILDCARD () )
            {
            // InternalEclParser.g:1252:2: (this_WILDCARD_0= RULE_WILDCARD () )
            // InternalEclParser.g:1253:3: this_WILDCARD_0= RULE_WILDCARD ()
            {
            this_WILDCARD_0=(Token)match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_WILDCARD_0, grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1257:3: ()
            // InternalEclParser.g:1258:4: 
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
    // InternalEclParser.g:1271:1: entryRuleEclRefinement returns [EObject current=null] : iv_ruleEclRefinement= ruleEclRefinement EOF ;
    public final EObject entryRuleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclRefinement = null;


        try {
            // InternalEclParser.g:1271:54: (iv_ruleEclRefinement= ruleEclRefinement EOF )
            // InternalEclParser.g:1272:2: iv_ruleEclRefinement= ruleEclRefinement EOF
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
    // InternalEclParser.g:1278:1: ruleEclRefinement returns [EObject current=null] : this_OrRefinement_0= ruleOrRefinement ;
    public final EObject ruleEclRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_OrRefinement_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1284:2: (this_OrRefinement_0= ruleOrRefinement )
            // InternalEclParser.g:1285:2: this_OrRefinement_0= ruleOrRefinement
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
    // InternalEclParser.g:1299:1: entryRuleOrRefinement returns [EObject current=null] : iv_ruleOrRefinement= ruleOrRefinement EOF ;
    public final EObject entryRuleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrRefinement = null;


        try {
            // InternalEclParser.g:1299:53: (iv_ruleOrRefinement= ruleOrRefinement EOF )
            // InternalEclParser.g:1300:2: iv_ruleOrRefinement= ruleOrRefinement EOF
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
    // InternalEclParser.g:1306:1: ruleOrRefinement returns [EObject current=null] : (this_AndRefinement_0= ruleAndRefinement ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) ;
    public final EObject ruleOrRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AndRefinement_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1312:2: ( (this_AndRefinement_0= ruleAndRefinement ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* ) )
            // InternalEclParser.g:1313:2: (this_AndRefinement_0= ruleAndRefinement ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            {
            // InternalEclParser.g:1313:2: (this_AndRefinement_0= ruleAndRefinement ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )* )
            // InternalEclParser.g:1314:3: this_AndRefinement_0= ruleAndRefinement ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
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
            // InternalEclParser.g:1325:3: ( ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Or) ) {
                    int LA13_4 = input.LA(2);

                    if ( (synpred24_InternalEclParser()) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // InternalEclParser.g:1326:4: ( Or )=> ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    {
            	    // InternalEclParser.g:1327:4: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) ) )
            	    // InternalEclParser.g:1328:5: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndRefinement ) )
            	    {
            	    // InternalEclParser.g:1328:5: ()
            	    // InternalEclParser.g:1329:6: 
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
            	    // InternalEclParser.g:1348:5: ( (lv_right_3_0= ruleAndRefinement ) )
            	    // InternalEclParser.g:1349:6: (lv_right_3_0= ruleAndRefinement )
            	    {
            	    // InternalEclParser.g:1349:6: (lv_right_3_0= ruleAndRefinement )
            	    // InternalEclParser.g:1350:7: lv_right_3_0= ruleAndRefinement
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
            	    break loop13;
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
    // InternalEclParser.g:1373:1: entryRuleAndRefinement returns [EObject current=null] : iv_ruleAndRefinement= ruleAndRefinement EOF ;
    public final EObject entryRuleAndRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndRefinement = null;


        try {
            // InternalEclParser.g:1373:54: (iv_ruleAndRefinement= ruleAndRefinement EOF )
            // InternalEclParser.g:1374:2: iv_ruleAndRefinement= ruleAndRefinement EOF
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
    // InternalEclParser.g:1380:1: ruleAndRefinement returns [EObject current=null] : (this_SubRefinement_0= ruleSubRefinement ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) ;
    public final EObject ruleAndRefinement() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_SubRefinement_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1386:2: ( (this_SubRefinement_0= ruleSubRefinement ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* ) )
            // InternalEclParser.g:1387:2: (this_SubRefinement_0= ruleSubRefinement ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            {
            // InternalEclParser.g:1387:2: (this_SubRefinement_0= ruleSubRefinement ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )* )
            // InternalEclParser.g:1388:3: this_SubRefinement_0= ruleSubRefinement ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
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
            // InternalEclParser.g:1399:3: ( ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==And) ) {
                    int LA15_3 = input.LA(2);

                    if ( (synpred26_InternalEclParser()) ) {
                        alt15=1;
                    }


                }
                else if ( (LA15_0==RULE_COMMA) ) {
                    int LA15_4 = input.LA(2);

                    if ( (synpred26_InternalEclParser()) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // InternalEclParser.g:1400:4: ( And | RULE_COMMA )=> ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    {
            	    // InternalEclParser.g:1401:4: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) ) )
            	    // InternalEclParser.g:1402:5: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubRefinement ) )
            	    {
            	    // InternalEclParser.g:1402:5: ()
            	    // InternalEclParser.g:1403:6: 
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

            	    // InternalEclParser.g:1412:5: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt14=2;
            	    int LA14_0 = input.LA(1);

            	    if ( (LA14_0==And) ) {
            	        alt14=1;
            	    }
            	    else if ( (LA14_0==RULE_COMMA) ) {
            	        alt14=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 14, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt14) {
            	        case 1 :
            	            // InternalEclParser.g:1413:6: ruleCONJUNCTION
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
            	            // InternalEclParser.g:1424:6: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_8); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(this_COMMA_3, grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1());
            	              					
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:1429:5: ( (lv_right_4_0= ruleSubRefinement ) )
            	    // InternalEclParser.g:1430:6: (lv_right_4_0= ruleSubRefinement )
            	    {
            	    // InternalEclParser.g:1430:6: (lv_right_4_0= ruleSubRefinement )
            	    // InternalEclParser.g:1431:7: lv_right_4_0= ruleSubRefinement
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
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEclParser.g:1454:1: entryRuleSubRefinement returns [EObject current=null] : iv_ruleSubRefinement= ruleSubRefinement EOF ;
    public final EObject entryRuleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRefinement = null;


        try {
            // InternalEclParser.g:1454:54: (iv_ruleSubRefinement= ruleSubRefinement EOF )
            // InternalEclParser.g:1455:2: iv_ruleSubRefinement= ruleSubRefinement EOF
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
    // InternalEclParser.g:1461:1: ruleSubRefinement returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) ;
    public final EObject ruleSubRefinement() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_EclAttributeGroup_1 = null;

        EObject this_NestedRefinement_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1467:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement ) )
            // InternalEclParser.g:1468:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            {
            // InternalEclParser.g:1468:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )
            int alt16=3;
            alt16 = dfa16.predict(input);
            switch (alt16) {
                case 1 :
                    // InternalEclParser.g:1469:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEclParser.g:1481:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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
                    // InternalEclParser.g:1493:3: this_NestedRefinement_2= ruleNestedRefinement
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
    // InternalEclParser.g:1508:1: entryRuleNestedRefinement returns [EObject current=null] : iv_ruleNestedRefinement= ruleNestedRefinement EOF ;
    public final EObject entryRuleNestedRefinement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedRefinement = null;


        try {
            // InternalEclParser.g:1508:57: (iv_ruleNestedRefinement= ruleNestedRefinement EOF )
            // InternalEclParser.g:1509:2: iv_ruleNestedRefinement= ruleNestedRefinement EOF
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
    // InternalEclParser.g:1515:1: ruleNestedRefinement returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedRefinement() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1521:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1522:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1522:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1523:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclRefinement ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1527:3: ( (lv_nested_1_0= ruleEclRefinement ) )
            // InternalEclParser.g:1528:4: (lv_nested_1_0= ruleEclRefinement )
            {
            // InternalEclParser.g:1528:4: (lv_nested_1_0= ruleEclRefinement )
            // InternalEclParser.g:1529:5: lv_nested_1_0= ruleEclRefinement
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
    // InternalEclParser.g:1554:1: entryRuleEclAttributeGroup returns [EObject current=null] : iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF ;
    public final EObject entryRuleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeGroup = null;


        try {
            // InternalEclParser.g:1554:58: (iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF )
            // InternalEclParser.g:1555:2: iv_ruleEclAttributeGroup= ruleEclAttributeGroup EOF
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
    // InternalEclParser.g:1561:1: ruleEclAttributeGroup returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) ;
    public final EObject ruleEclAttributeGroup() throws RecognitionException {
        EObject current = null;

        Token this_CURLY_OPEN_1=null;
        Token this_CURLY_CLOSE_3=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_refinement_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1567:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE ) )
            // InternalEclParser.g:1568:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            {
            // InternalEclParser.g:1568:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE )
            // InternalEclParser.g:1569:3: ( (lv_cardinality_0_0= ruleCardinality ) )? this_CURLY_OPEN_1= RULE_CURLY_OPEN ( (lv_refinement_2_0= ruleEclAttributeSet ) ) this_CURLY_CLOSE_3= RULE_CURLY_CLOSE
            {
            // InternalEclParser.g:1569:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_SQUARE_OPEN) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEclParser.g:1570:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1570:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1571:5: lv_cardinality_0_0= ruleCardinality
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
            // InternalEclParser.g:1592:3: ( (lv_refinement_2_0= ruleEclAttributeSet ) )
            // InternalEclParser.g:1593:4: (lv_refinement_2_0= ruleEclAttributeSet )
            {
            // InternalEclParser.g:1593:4: (lv_refinement_2_0= ruleEclAttributeSet )
            // InternalEclParser.g:1594:5: lv_refinement_2_0= ruleEclAttributeSet
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
    // InternalEclParser.g:1619:1: entryRuleEclAttributeSet returns [EObject current=null] : iv_ruleEclAttributeSet= ruleEclAttributeSet EOF ;
    public final EObject entryRuleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEclAttributeSet = null;


        try {
            // InternalEclParser.g:1619:56: (iv_ruleEclAttributeSet= ruleEclAttributeSet EOF )
            // InternalEclParser.g:1620:2: iv_ruleEclAttributeSet= ruleEclAttributeSet EOF
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
    // InternalEclParser.g:1626:1: ruleEclAttributeSet returns [EObject current=null] : this_OrAttributeSet_0= ruleOrAttributeSet ;
    public final EObject ruleEclAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_OrAttributeSet_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1632:2: (this_OrAttributeSet_0= ruleOrAttributeSet )
            // InternalEclParser.g:1633:2: this_OrAttributeSet_0= ruleOrAttributeSet
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
    // InternalEclParser.g:1647:1: entryRuleOrAttributeSet returns [EObject current=null] : iv_ruleOrAttributeSet= ruleOrAttributeSet EOF ;
    public final EObject entryRuleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrAttributeSet = null;


        try {
            // InternalEclParser.g:1647:55: (iv_ruleOrAttributeSet= ruleOrAttributeSet EOF )
            // InternalEclParser.g:1648:2: iv_ruleOrAttributeSet= ruleOrAttributeSet EOF
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
    // InternalEclParser.g:1654:1: ruleOrAttributeSet returns [EObject current=null] : (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) ;
    public final EObject ruleOrAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AndAttributeSet_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1660:2: ( (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* ) )
            // InternalEclParser.g:1661:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            {
            // InternalEclParser.g:1661:2: (this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )* )
            // InternalEclParser.g:1662:3: this_AndAttributeSet_0= ruleAndAttributeSet ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
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
            // InternalEclParser.g:1673:3: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==Or) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEclParser.g:1674:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    {
            	    // InternalEclParser.g:1674:4: ()
            	    // InternalEclParser.g:1675:5: 
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
            	    // InternalEclParser.g:1694:4: ( (lv_right_3_0= ruleAndAttributeSet ) )
            	    // InternalEclParser.g:1695:5: (lv_right_3_0= ruleAndAttributeSet )
            	    {
            	    // InternalEclParser.g:1695:5: (lv_right_3_0= ruleAndAttributeSet )
            	    // InternalEclParser.g:1696:6: lv_right_3_0= ruleAndAttributeSet
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
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalEclParser.g:1718:1: entryRuleAndAttributeSet returns [EObject current=null] : iv_ruleAndAttributeSet= ruleAndAttributeSet EOF ;
    public final EObject entryRuleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndAttributeSet = null;


        try {
            // InternalEclParser.g:1718:56: (iv_ruleAndAttributeSet= ruleAndAttributeSet EOF )
            // InternalEclParser.g:1719:2: iv_ruleAndAttributeSet= ruleAndAttributeSet EOF
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
    // InternalEclParser.g:1725:1: ruleAndAttributeSet returns [EObject current=null] : (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) ;
    public final EObject ruleAndAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_SubAttributeSet_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1731:2: ( (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* ) )
            // InternalEclParser.g:1732:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            {
            // InternalEclParser.g:1732:2: (this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )* )
            // InternalEclParser.g:1733:3: this_SubAttributeSet_0= ruleSubAttributeSet ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
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
            // InternalEclParser.g:1744:3: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==And||LA20_0==RULE_COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEclParser.g:1745:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    {
            	    // InternalEclParser.g:1745:4: ()
            	    // InternalEclParser.g:1746:5: 
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

            	    // InternalEclParser.g:1755:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==And) ) {
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
            	            // InternalEclParser.g:1756:5: ruleCONJUNCTION
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
            	            // InternalEclParser.g:1767:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_16); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:1772:4: ( (lv_right_4_0= ruleSubAttributeSet ) )
            	    // InternalEclParser.g:1773:5: (lv_right_4_0= ruleSubAttributeSet )
            	    {
            	    // InternalEclParser.g:1773:5: (lv_right_4_0= ruleSubAttributeSet )
            	    // InternalEclParser.g:1774:6: lv_right_4_0= ruleSubAttributeSet
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
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // InternalEclParser.g:1796:1: entryRuleSubAttributeSet returns [EObject current=null] : iv_ruleSubAttributeSet= ruleSubAttributeSet EOF ;
    public final EObject entryRuleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubAttributeSet = null;


        try {
            // InternalEclParser.g:1796:56: (iv_ruleSubAttributeSet= ruleSubAttributeSet EOF )
            // InternalEclParser.g:1797:2: iv_ruleSubAttributeSet= ruleSubAttributeSet EOF
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
    // InternalEclParser.g:1803:1: ruleSubAttributeSet returns [EObject current=null] : (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) ;
    public final EObject ruleSubAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeConstraint_0 = null;

        EObject this_NestedAttributeSet_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1809:2: ( (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet ) )
            // InternalEclParser.g:1810:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            {
            // InternalEclParser.g:1810:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )
            int alt21=2;
            alt21 = dfa21.predict(input);
            switch (alt21) {
                case 1 :
                    // InternalEclParser.g:1811:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
                    // InternalEclParser.g:1823:3: this_NestedAttributeSet_1= ruleNestedAttributeSet
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
    // InternalEclParser.g:1838:1: entryRuleNestedAttributeSet returns [EObject current=null] : iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF ;
    public final EObject entryRuleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedAttributeSet = null;


        try {
            // InternalEclParser.g:1838:59: (iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF )
            // InternalEclParser.g:1839:2: iv_ruleNestedAttributeSet= ruleNestedAttributeSet EOF
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
    // InternalEclParser.g:1845:1: ruleNestedAttributeSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedAttributeSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1851:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:1852:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:1852:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:1853:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleEclAttributeSet ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1857:3: ( (lv_nested_1_0= ruleEclAttributeSet ) )
            // InternalEclParser.g:1858:4: (lv_nested_1_0= ruleEclAttributeSet )
            {
            // InternalEclParser.g:1858:4: (lv_nested_1_0= ruleEclAttributeSet )
            // InternalEclParser.g:1859:5: lv_nested_1_0= ruleEclAttributeSet
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
    // InternalEclParser.g:1884:1: entryRuleAttributeConstraint returns [EObject current=null] : iv_ruleAttributeConstraint= ruleAttributeConstraint EOF ;
    public final EObject entryRuleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeConstraint = null;


        try {
            // InternalEclParser.g:1884:60: (iv_ruleAttributeConstraint= ruleAttributeConstraint EOF )
            // InternalEclParser.g:1885:2: iv_ruleAttributeConstraint= ruleAttributeConstraint EOF
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
    // InternalEclParser.g:1891:1: ruleAttributeConstraint returns [EObject current=null] : ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) ;
    public final EObject ruleAttributeConstraint() throws RecognitionException {
        EObject current = null;

        Token lv_reversed_1_0=null;
        EObject lv_cardinality_0_0 = null;

        EObject lv_attribute_2_0 = null;

        EObject lv_comparison_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1897:2: ( ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) ) )
            // InternalEclParser.g:1898:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            {
            // InternalEclParser.g:1898:2: ( ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) ) )
            // InternalEclParser.g:1899:3: ( (lv_cardinality_0_0= ruleCardinality ) )? ( (lv_reversed_1_0= RULE_REVERSED ) )? ( (lv_attribute_2_0= ruleSubExpressionConstraint ) ) ( (lv_comparison_3_0= ruleComparison ) )
            {
            // InternalEclParser.g:1899:3: ( (lv_cardinality_0_0= ruleCardinality ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_SQUARE_OPEN) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEclParser.g:1900:4: (lv_cardinality_0_0= ruleCardinality )
                    {
                    // InternalEclParser.g:1900:4: (lv_cardinality_0_0= ruleCardinality )
                    // InternalEclParser.g:1901:5: lv_cardinality_0_0= ruleCardinality
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

            // InternalEclParser.g:1918:3: ( (lv_reversed_1_0= RULE_REVERSED ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_REVERSED) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalEclParser.g:1919:4: (lv_reversed_1_0= RULE_REVERSED )
                    {
                    // InternalEclParser.g:1919:4: (lv_reversed_1_0= RULE_REVERSED )
                    // InternalEclParser.g:1920:5: lv_reversed_1_0= RULE_REVERSED
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

            // InternalEclParser.g:1936:3: ( (lv_attribute_2_0= ruleSubExpressionConstraint ) )
            // InternalEclParser.g:1937:4: (lv_attribute_2_0= ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:1937:4: (lv_attribute_2_0= ruleSubExpressionConstraint )
            // InternalEclParser.g:1938:5: lv_attribute_2_0= ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_19);
            lv_attribute_2_0=ruleSubExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEclParser.g:1955:3: ( (lv_comparison_3_0= ruleComparison ) )
            // InternalEclParser.g:1956:4: (lv_comparison_3_0= ruleComparison )
            {
            // InternalEclParser.g:1956:4: (lv_comparison_3_0= ruleComparison )
            // InternalEclParser.g:1957:5: lv_comparison_3_0= ruleComparison
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


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalEclParser.g:1978:1: entryRuleCardinality returns [EObject current=null] : iv_ruleCardinality= ruleCardinality EOF ;
    public final EObject entryRuleCardinality() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCardinality = null;


        try {
            // InternalEclParser.g:1978:52: (iv_ruleCardinality= ruleCardinality EOF )
            // InternalEclParser.g:1979:2: iv_ruleCardinality= ruleCardinality EOF
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
    // InternalEclParser.g:1985:1: ruleCardinality returns [EObject current=null] : (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) ;
    public final EObject ruleCardinality() throws RecognitionException {
        EObject current = null;

        Token this_SQUARE_OPEN_0=null;
        Token this_TO_2=null;
        Token this_SQUARE_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_min_1_0 = null;

        AntlrDatatypeRuleToken lv_max_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:1991:2: ( (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE ) )
            // InternalEclParser.g:1992:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            {
            // InternalEclParser.g:1992:2: (this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE )
            // InternalEclParser.g:1993:3: this_SQUARE_OPEN_0= RULE_SQUARE_OPEN ( (lv_min_1_0= ruleNonNegativeInteger ) ) this_TO_2= RULE_TO ( (lv_max_3_0= ruleMaxValue ) ) this_SQUARE_CLOSE_4= RULE_SQUARE_CLOSE
            {
            this_SQUARE_OPEN_0=(Token)match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_SQUARE_OPEN_0, grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:1997:3: ( (lv_min_1_0= ruleNonNegativeInteger ) )
            // InternalEclParser.g:1998:4: (lv_min_1_0= ruleNonNegativeInteger )
            {
            // InternalEclParser.g:1998:4: (lv_min_1_0= ruleNonNegativeInteger )
            // InternalEclParser.g:1999:5: lv_min_1_0= ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_21);
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

            this_TO_2=(Token)match(input,RULE_TO,FollowSets000.FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_TO_2, grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2());
              		
            }
            // InternalEclParser.g:2020:3: ( (lv_max_3_0= ruleMaxValue ) )
            // InternalEclParser.g:2021:4: (lv_max_3_0= ruleMaxValue )
            {
            // InternalEclParser.g:2021:4: (lv_max_3_0= ruleMaxValue )
            // InternalEclParser.g:2022:5: lv_max_3_0= ruleMaxValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_23);
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
    // InternalEclParser.g:2047:1: entryRuleComparison returns [EObject current=null] : iv_ruleComparison= ruleComparison EOF ;
    public final EObject entryRuleComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparison = null;


        try {
            // InternalEclParser.g:2047:51: (iv_ruleComparison= ruleComparison EOF )
            // InternalEclParser.g:2048:2: iv_ruleComparison= ruleComparison EOF
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
    // InternalEclParser.g:2054:1: ruleComparison returns [EObject current=null] : (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) ;
    public final EObject ruleComparison() throws RecognitionException {
        EObject current = null;

        EObject this_AttributeComparison_0 = null;

        EObject this_DataTypeComparison_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2060:2: ( (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison ) )
            // InternalEclParser.g:2061:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            {
            // InternalEclParser.g:2061:2: (this_AttributeComparison_0= ruleAttributeComparison | this_DataTypeComparison_1= ruleDataTypeComparison )
            int alt24=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA24_1 = input.LA(2);

                if ( (LA24_1==False||LA24_1==True||LA24_1==RULE_HASH||LA24_1==RULE_STRING) ) {
                    alt24=2;
                }
                else if ( (LA24_1==RULE_DIGIT_NONZERO||LA24_1==RULE_ROUND_OPEN||LA24_1==RULE_CARET||LA24_1==RULE_WILDCARD||(LA24_1>=RULE_LT && LA24_1<=RULE_DBL_GT_EM)||LA24_1==RULE_DOUBLE_CURLY_OPEN) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA24_2 = input.LA(2);

                if ( (LA24_2==False||LA24_2==True||LA24_2==RULE_HASH||LA24_2==RULE_STRING) ) {
                    alt24=2;
                }
                else if ( (LA24_2==RULE_DIGIT_NONZERO||LA24_2==RULE_ROUND_OPEN||LA24_2==RULE_CARET||LA24_2==RULE_WILDCARD||(LA24_2>=RULE_LT && LA24_2<=RULE_DBL_GT_EM)||LA24_2==RULE_DOUBLE_CURLY_OPEN) ) {
                    alt24=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt24=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:2062:3: this_AttributeComparison_0= ruleAttributeComparison
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
                    // InternalEclParser.g:2074:3: this_DataTypeComparison_1= ruleDataTypeComparison
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
    // InternalEclParser.g:2089:1: entryRuleAttributeComparison returns [EObject current=null] : iv_ruleAttributeComparison= ruleAttributeComparison EOF ;
    public final EObject entryRuleAttributeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeComparison = null;


        try {
            // InternalEclParser.g:2089:60: (iv_ruleAttributeComparison= ruleAttributeComparison EOF )
            // InternalEclParser.g:2090:2: iv_ruleAttributeComparison= ruleAttributeComparison EOF
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
    // InternalEclParser.g:2096:1: ruleAttributeComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSubExpressionConstraint ) ) ) ;
    public final EObject ruleAttributeComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2102:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSubExpressionConstraint ) ) ) )
            // InternalEclParser.g:2103:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSubExpressionConstraint ) ) )
            {
            // InternalEclParser.g:2103:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSubExpressionConstraint ) ) )
            // InternalEclParser.g:2104:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleSubExpressionConstraint ) )
            {
            // InternalEclParser.g:2104:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2105:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2105:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2106:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
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

            // InternalEclParser.g:2123:3: ( (lv_value_1_0= ruleSubExpressionConstraint ) )
            // InternalEclParser.g:2124:4: (lv_value_1_0= ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:2124:4: (lv_value_1_0= ruleSubExpressionConstraint )
            // InternalEclParser.g:2125:5: lv_value_1_0= ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAttributeComparisonAccess().getValueSubExpressionConstraintParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_2);
            lv_value_1_0=ruleSubExpressionConstraint();

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
              						"com.b2international.snomed.ecl.Ecl.SubExpressionConstraint");
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
    // InternalEclParser.g:2146:1: entryRuleDataTypeComparison returns [EObject current=null] : iv_ruleDataTypeComparison= ruleDataTypeComparison EOF ;
    public final EObject entryRuleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDataTypeComparison = null;


        try {
            // InternalEclParser.g:2146:59: (iv_ruleDataTypeComparison= ruleDataTypeComparison EOF )
            // InternalEclParser.g:2147:2: iv_ruleDataTypeComparison= ruleDataTypeComparison EOF
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
    // InternalEclParser.g:2153:1: ruleDataTypeComparison returns [EObject current=null] : (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) ;
    public final EObject ruleDataTypeComparison() throws RecognitionException {
        EObject current = null;

        EObject this_BooleanValueComparison_0 = null;

        EObject this_StringValueComparison_1 = null;

        EObject this_IntegerValueComparison_2 = null;

        EObject this_DecimalValueComparison_3 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2159:2: ( (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison ) )
            // InternalEclParser.g:2160:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            {
            // InternalEclParser.g:2160:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )
            int alt25=4;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalEclParser.g:2161:3: this_BooleanValueComparison_0= ruleBooleanValueComparison
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
                    // InternalEclParser.g:2173:3: this_StringValueComparison_1= ruleStringValueComparison
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
                    // InternalEclParser.g:2185:3: this_IntegerValueComparison_2= ruleIntegerValueComparison
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
                    // InternalEclParser.g:2197:3: this_DecimalValueComparison_3= ruleDecimalValueComparison
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
    // InternalEclParser.g:2212:1: entryRuleBooleanValueComparison returns [EObject current=null] : iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF ;
    public final EObject entryRuleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBooleanValueComparison = null;


        try {
            // InternalEclParser.g:2212:63: (iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF )
            // InternalEclParser.g:2213:2: iv_ruleBooleanValueComparison= ruleBooleanValueComparison EOF
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
    // InternalEclParser.g:2219:1: ruleBooleanValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) ;
    public final EObject ruleBooleanValueComparison() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2225:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) ) )
            // InternalEclParser.g:2226:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            {
            // InternalEclParser.g:2226:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) ) )
            // InternalEclParser.g:2227:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= ruleBoolean ) )
            {
            // InternalEclParser.g:2227:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2228:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2228:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2229:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getBooleanValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_24);
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

            // InternalEclParser.g:2246:3: ( (lv_value_1_0= ruleBoolean ) )
            // InternalEclParser.g:2247:4: (lv_value_1_0= ruleBoolean )
            {
            // InternalEclParser.g:2247:4: (lv_value_1_0= ruleBoolean )
            // InternalEclParser.g:2248:5: lv_value_1_0= ruleBoolean
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
    // InternalEclParser.g:2269:1: entryRuleStringValueComparison returns [EObject current=null] : iv_ruleStringValueComparison= ruleStringValueComparison EOF ;
    public final EObject entryRuleStringValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringValueComparison = null;


        try {
            // InternalEclParser.g:2269:62: (iv_ruleStringValueComparison= ruleStringValueComparison EOF )
            // InternalEclParser.g:2270:2: iv_ruleStringValueComparison= ruleStringValueComparison EOF
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
    // InternalEclParser.g:2276:1: ruleStringValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleStringValueComparison() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2282:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:2283:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:2283:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) ) )
            // InternalEclParser.g:2284:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( (lv_value_1_0= RULE_STRING ) )
            {
            // InternalEclParser.g:2284:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:2285:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2285:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:2286:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getStringValueComparisonAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_25);
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

            // InternalEclParser.g:2303:3: ( (lv_value_1_0= RULE_STRING ) )
            // InternalEclParser.g:2304:4: (lv_value_1_0= RULE_STRING )
            {
            // InternalEclParser.g:2304:4: (lv_value_1_0= RULE_STRING )
            // InternalEclParser.g:2305:5: lv_value_1_0= RULE_STRING
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
    // InternalEclParser.g:2325:1: entryRuleIntegerValueComparison returns [EObject current=null] : iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF ;
    public final EObject entryRuleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIntegerValueComparison = null;


        try {
            // InternalEclParser.g:2325:63: (iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF )
            // InternalEclParser.g:2326:2: iv_ruleIntegerValueComparison= ruleIntegerValueComparison EOF
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
    // InternalEclParser.g:2332:1: ruleIntegerValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) ;
    public final EObject ruleIntegerValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2338:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) ) )
            // InternalEclParser.g:2339:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            {
            // InternalEclParser.g:2339:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) ) )
            // InternalEclParser.g:2340:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleInteger ) )
            {
            // InternalEclParser.g:2340:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEclParser.g:2341:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2341:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEclParser.g:2342:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getIntegerValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getIntegerValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:2363:3: ( (lv_value_2_0= ruleInteger ) )
            // InternalEclParser.g:2364:4: (lv_value_2_0= ruleInteger )
            {
            // InternalEclParser.g:2364:4: (lv_value_2_0= ruleInteger )
            // InternalEclParser.g:2365:5: lv_value_2_0= ruleInteger
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
    // InternalEclParser.g:2386:1: entryRuleDecimalValueComparison returns [EObject current=null] : iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF ;
    public final EObject entryRuleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDecimalValueComparison = null;


        try {
            // InternalEclParser.g:2386:63: (iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF )
            // InternalEclParser.g:2387:2: iv_ruleDecimalValueComparison= ruleDecimalValueComparison EOF
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
    // InternalEclParser.g:2393:1: ruleDecimalValueComparison returns [EObject current=null] : ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) ;
    public final EObject ruleDecimalValueComparison() throws RecognitionException {
        EObject current = null;

        Token this_HASH_1=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2399:2: ( ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) ) )
            // InternalEclParser.g:2400:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            {
            // InternalEclParser.g:2400:2: ( ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) ) )
            // InternalEclParser.g:2401:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) ) this_HASH_1= RULE_HASH ( (lv_value_2_0= ruleDecimal ) )
            {
            // InternalEclParser.g:2401:3: ( (lv_op_0_0= ruleNUMERIC_OPERATOR ) )
            // InternalEclParser.g:2402:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            {
            // InternalEclParser.g:2402:4: (lv_op_0_0= ruleNUMERIC_OPERATOR )
            // InternalEclParser.g:2403:5: lv_op_0_0= ruleNUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDecimalValueComparisonAccess().getOpNUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_26);
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

            this_HASH_1=(Token)match(input,RULE_HASH,FollowSets000.FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_HASH_1, grammarAccess.getDecimalValueComparisonAccess().getHASHTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:2424:3: ( (lv_value_2_0= ruleDecimal ) )
            // InternalEclParser.g:2425:4: (lv_value_2_0= ruleDecimal )
            {
            // InternalEclParser.g:2425:4: (lv_value_2_0= ruleDecimal )
            // InternalEclParser.g:2426:5: lv_value_2_0= ruleDecimal
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
    // InternalEclParser.g:2447:1: entryRuleNestedExpression returns [EObject current=null] : iv_ruleNestedExpression= ruleNestedExpression EOF ;
    public final EObject entryRuleNestedExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedExpression = null;


        try {
            // InternalEclParser.g:2447:57: (iv_ruleNestedExpression= ruleNestedExpression EOF )
            // InternalEclParser.g:2448:2: iv_ruleNestedExpression= ruleNestedExpression EOF
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
    // InternalEclParser.g:2454:1: ruleNestedExpression returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedExpression() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2460:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:2461:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:2461:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:2462:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleExpressionConstraint ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:2466:3: ( (lv_nested_1_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:2467:4: (lv_nested_1_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:2467:4: (lv_nested_1_0= ruleExpressionConstraint )
            // InternalEclParser.g:2468:5: lv_nested_1_0= ruleExpressionConstraint
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
    // InternalEclParser.g:2493:1: entryRuleFilterConstraint returns [EObject current=null] : iv_ruleFilterConstraint= ruleFilterConstraint EOF ;
    public final EObject entryRuleFilterConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterConstraint = null;


        try {
            // InternalEclParser.g:2493:57: (iv_ruleFilterConstraint= ruleFilterConstraint EOF )
            // InternalEclParser.g:2494:2: iv_ruleFilterConstraint= ruleFilterConstraint EOF
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
    // InternalEclParser.g:2500:1: ruleFilterConstraint returns [EObject current=null] : (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE ) ;
    public final EObject ruleFilterConstraint() throws RecognitionException {
        EObject current = null;

        Token this_DOUBLE_CURLY_OPEN_0=null;
        Token this_DOUBLE_CURLY_CLOSE_2=null;
        EObject this_Filter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2506:2: ( (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE ) )
            // InternalEclParser.g:2507:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE )
            {
            // InternalEclParser.g:2507:2: (this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE )
            // InternalEclParser.g:2508:3: this_DOUBLE_CURLY_OPEN_0= RULE_DOUBLE_CURLY_OPEN this_Filter_1= ruleFilter this_DOUBLE_CURLY_CLOSE_2= RULE_DOUBLE_CURLY_CLOSE
            {
            this_DOUBLE_CURLY_OPEN_0=(Token)match(input,RULE_DOUBLE_CURLY_OPEN,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOUBLE_CURLY_OPEN_0, grammarAccess.getFilterConstraintAccess().getDOUBLE_CURLY_OPENTerminalRuleCall_0());
              		
            }
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getFilterConstraintAccess().getFilterParserRuleCall_1());
              		
            }
            pushFollow(FollowSets000.FOLLOW_29);
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
    // InternalEclParser.g:2531:1: entryRuleFilter returns [EObject current=null] : iv_ruleFilter= ruleFilter EOF ;
    public final EObject entryRuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilter = null;


        try {
            // InternalEclParser.g:2531:47: (iv_ruleFilter= ruleFilter EOF )
            // InternalEclParser.g:2532:2: iv_ruleFilter= ruleFilter EOF
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
    // InternalEclParser.g:2538:1: ruleFilter returns [EObject current=null] : this_DisjunctionFilter_0= ruleDisjunctionFilter ;
    public final EObject ruleFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DisjunctionFilter_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2544:2: (this_DisjunctionFilter_0= ruleDisjunctionFilter )
            // InternalEclParser.g:2545:2: this_DisjunctionFilter_0= ruleDisjunctionFilter
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
    // InternalEclParser.g:2559:1: entryRuleDisjunctionFilter returns [EObject current=null] : iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF ;
    public final EObject entryRuleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDisjunctionFilter = null;


        try {
            // InternalEclParser.g:2559:58: (iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF )
            // InternalEclParser.g:2560:2: iv_ruleDisjunctionFilter= ruleDisjunctionFilter EOF
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
    // InternalEclParser.g:2566:1: ruleDisjunctionFilter returns [EObject current=null] : (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) ;
    public final EObject ruleDisjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject this_ConjunctionFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2572:2: ( (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* ) )
            // InternalEclParser.g:2573:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            {
            // InternalEclParser.g:2573:2: (this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )* )
            // InternalEclParser.g:2574:3: this_ConjunctionFilter_0= ruleConjunctionFilter ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
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
            // InternalEclParser.g:2585:3: ( () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==Or) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEclParser.g:2586:4: () ruleDISJUNCTION ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    {
            	    // InternalEclParser.g:2586:4: ()
            	    // InternalEclParser.g:2587:5: 
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
            	    pushFollow(FollowSets000.FOLLOW_28);
            	    ruleDISJUNCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEclParser.g:2606:4: ( (lv_right_3_0= ruleConjunctionFilter ) )
            	    // InternalEclParser.g:2607:5: (lv_right_3_0= ruleConjunctionFilter )
            	    {
            	    // InternalEclParser.g:2607:5: (lv_right_3_0= ruleConjunctionFilter )
            	    // InternalEclParser.g:2608:6: lv_right_3_0= ruleConjunctionFilter
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
            	    break loop26;
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
    // InternalEclParser.g:2630:1: entryRuleConjunctionFilter returns [EObject current=null] : iv_ruleConjunctionFilter= ruleConjunctionFilter EOF ;
    public final EObject entryRuleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConjunctionFilter = null;


        try {
            // InternalEclParser.g:2630:58: (iv_ruleConjunctionFilter= ruleConjunctionFilter EOF )
            // InternalEclParser.g:2631:2: iv_ruleConjunctionFilter= ruleConjunctionFilter EOF
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
    // InternalEclParser.g:2637:1: ruleConjunctionFilter returns [EObject current=null] : (this_ExclusionFilter_0= ruleExclusionFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* ) ;
    public final EObject ruleConjunctionFilter() throws RecognitionException {
        EObject current = null;

        Token this_COMMA_3=null;
        EObject this_ExclusionFilter_0 = null;

        EObject lv_right_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2643:2: ( (this_ExclusionFilter_0= ruleExclusionFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* ) )
            // InternalEclParser.g:2644:2: (this_ExclusionFilter_0= ruleExclusionFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* )
            {
            // InternalEclParser.g:2644:2: (this_ExclusionFilter_0= ruleExclusionFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )* )
            // InternalEclParser.g:2645:3: this_ExclusionFilter_0= ruleExclusionFilter ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )*
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getConjunctionFilterAccess().getExclusionFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_5);
            this_ExclusionFilter_0=ruleExclusionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_ExclusionFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:2656:3: ( () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==And||LA28_0==RULE_COMMA) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalEclParser.g:2657:4: () ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA ) ( (lv_right_4_0= ruleExclusionFilter ) )
            	    {
            	    // InternalEclParser.g:2657:4: ()
            	    // InternalEclParser.g:2658:5: 
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

            	    // InternalEclParser.g:2667:4: ( ruleCONJUNCTION | this_COMMA_3= RULE_COMMA )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==And) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==RULE_COMMA) ) {
            	        alt27=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 27, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt27) {
            	        case 1 :
            	            // InternalEclParser.g:2668:5: ruleCONJUNCTION
            	            {
            	            if ( state.backtracking==0 ) {

            	              					/* */
            	              				
            	            }
            	            if ( state.backtracking==0 ) {

            	              					newCompositeNode(grammarAccess.getConjunctionFilterAccess().getCONJUNCTIONParserRuleCall_1_1_0());
            	              				
            	            }
            	            pushFollow(FollowSets000.FOLLOW_28);
            	            ruleCONJUNCTION();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					afterParserOrEnumRuleCall();
            	              				
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalEclParser.g:2679:5: this_COMMA_3= RULE_COMMA
            	            {
            	            this_COMMA_3=(Token)match(input,RULE_COMMA,FollowSets000.FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(this_COMMA_3, grammarAccess.getConjunctionFilterAccess().getCOMMATerminalRuleCall_1_1_1());
            	              				
            	            }

            	            }
            	            break;

            	    }

            	    // InternalEclParser.g:2684:4: ( (lv_right_4_0= ruleExclusionFilter ) )
            	    // InternalEclParser.g:2685:5: (lv_right_4_0= ruleExclusionFilter )
            	    {
            	    // InternalEclParser.g:2685:5: (lv_right_4_0= ruleExclusionFilter )
            	    // InternalEclParser.g:2686:6: lv_right_4_0= ruleExclusionFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getConjunctionFilterAccess().getRightExclusionFilterParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    lv_right_4_0=ruleExclusionFilter();

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
            	      							"com.b2international.snomed.ecl.Ecl.ExclusionFilter");
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
    // $ANTLR end "ruleConjunctionFilter"


    // $ANTLR start "entryRuleExclusionFilter"
    // InternalEclParser.g:2708:1: entryRuleExclusionFilter returns [EObject current=null] : iv_ruleExclusionFilter= ruleExclusionFilter EOF ;
    public final EObject entryRuleExclusionFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExclusionFilter = null;


        try {
            // InternalEclParser.g:2708:56: (iv_ruleExclusionFilter= ruleExclusionFilter EOF )
            // InternalEclParser.g:2709:2: iv_ruleExclusionFilter= ruleExclusionFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExclusionFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleExclusionFilter=ruleExclusionFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExclusionFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExclusionFilter"


    // $ANTLR start "ruleExclusionFilter"
    // InternalEclParser.g:2715:1: ruleExclusionFilter returns [EObject current=null] : (this_PropertyFilter_0= rulePropertyFilter ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? ) ;
    public final EObject ruleExclusionFilter() throws RecognitionException {
        EObject current = null;

        EObject this_PropertyFilter_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2721:2: ( (this_PropertyFilter_0= rulePropertyFilter ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? ) )
            // InternalEclParser.g:2722:2: (this_PropertyFilter_0= rulePropertyFilter ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? )
            {
            // InternalEclParser.g:2722:2: (this_PropertyFilter_0= rulePropertyFilter ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )? )
            // InternalEclParser.g:2723:3: this_PropertyFilter_0= rulePropertyFilter ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )?
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getExclusionFilterAccess().getPropertyFilterParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_6);
            this_PropertyFilter_0=rulePropertyFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_PropertyFilter_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:2734:3: ( () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==Minus) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEclParser.g:2735:4: () ruleEXCLUSION ( (lv_right_3_0= rulePropertyFilter ) )
                    {
                    // InternalEclParser.g:2735:4: ()
                    // InternalEclParser.g:2736:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					/* */
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getExclusionFilterAccess().getExclusionFilterLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				/* */
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getExclusionFilterAccess().getEXCLUSIONParserRuleCall_1_1());
                      			
                    }
                    pushFollow(FollowSets000.FOLLOW_28);
                    ruleEXCLUSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalEclParser.g:2755:4: ( (lv_right_3_0= rulePropertyFilter ) )
                    // InternalEclParser.g:2756:5: (lv_right_3_0= rulePropertyFilter )
                    {
                    // InternalEclParser.g:2756:5: (lv_right_3_0= rulePropertyFilter )
                    // InternalEclParser.g:2757:6: lv_right_3_0= rulePropertyFilter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getExclusionFilterAccess().getRightPropertyFilterParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_right_3_0=rulePropertyFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getExclusionFilterRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"com.b2international.snomed.ecl.Ecl.PropertyFilter");
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
    // $ANTLR end "ruleExclusionFilter"


    // $ANTLR start "entryRuleNestedFilter"
    // InternalEclParser.g:2779:1: entryRuleNestedFilter returns [EObject current=null] : iv_ruleNestedFilter= ruleNestedFilter EOF ;
    public final EObject entryRuleNestedFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNestedFilter = null;


        try {
            // InternalEclParser.g:2779:53: (iv_ruleNestedFilter= ruleNestedFilter EOF )
            // InternalEclParser.g:2780:2: iv_ruleNestedFilter= ruleNestedFilter EOF
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
    // InternalEclParser.g:2786:1: ruleNestedFilter returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) ;
    public final EObject ruleNestedFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_2=null;
        EObject lv_nested_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2792:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:2793:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:2793:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE )
            // InternalEclParser.g:2794:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_nested_1_0= ruleFilter ) ) this_ROUND_CLOSE_2= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getNestedFilterAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:2798:3: ( (lv_nested_1_0= ruleFilter ) )
            // InternalEclParser.g:2799:4: (lv_nested_1_0= ruleFilter )
            {
            // InternalEclParser.g:2799:4: (lv_nested_1_0= ruleFilter )
            // InternalEclParser.g:2800:5: lv_nested_1_0= ruleFilter
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
    // InternalEclParser.g:2825:1: entryRulePropertyFilter returns [EObject current=null] : iv_rulePropertyFilter= rulePropertyFilter EOF ;
    public final EObject entryRulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFilter = null;


        try {
            // InternalEclParser.g:2825:55: (iv_rulePropertyFilter= rulePropertyFilter EOF )
            // InternalEclParser.g:2826:2: iv_rulePropertyFilter= rulePropertyFilter EOF
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
    // InternalEclParser.g:2832:1: rulePropertyFilter returns [EObject current=null] : (this_TermFilter_0= ruleTermFilter | this_LanguageCodeFilter_1= ruleLanguageCodeFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter | this_NestedFilter_10= ruleNestedFilter ) ;
    public final EObject rulePropertyFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TermFilter_0 = null;

        EObject this_LanguageCodeFilter_1 = null;

        EObject this_TypeFilter_2 = null;

        EObject this_DialectFilter_3 = null;

        EObject this_ActiveFilter_4 = null;

        EObject this_PreferredInFilter_5 = null;

        EObject this_AcceptableInFilter_6 = null;

        EObject this_LanguageRefSetFilter_7 = null;

        EObject this_ModuleFilter_8 = null;

        EObject this_CaseSignificanceFilter_9 = null;

        EObject this_NestedFilter_10 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2838:2: ( (this_TermFilter_0= ruleTermFilter | this_LanguageCodeFilter_1= ruleLanguageCodeFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter | this_NestedFilter_10= ruleNestedFilter ) )
            // InternalEclParser.g:2839:2: (this_TermFilter_0= ruleTermFilter | this_LanguageCodeFilter_1= ruleLanguageCodeFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter | this_NestedFilter_10= ruleNestedFilter )
            {
            // InternalEclParser.g:2839:2: (this_TermFilter_0= ruleTermFilter | this_LanguageCodeFilter_1= ruleLanguageCodeFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter | this_NestedFilter_10= ruleNestedFilter )
            int alt30=11;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalEclParser.g:2840:3: this_TermFilter_0= ruleTermFilter
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
                    // InternalEclParser.g:2852:3: this_LanguageCodeFilter_1= ruleLanguageCodeFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getLanguageCodeFilterParserRuleCall_1());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_LanguageCodeFilter_1=ruleLanguageCodeFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_LanguageCodeFilter_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEclParser.g:2864:3: this_TypeFilter_2= ruleTypeFilter
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
                    // InternalEclParser.g:2876:3: this_DialectFilter_3= ruleDialectFilter
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
                    // InternalEclParser.g:2888:3: this_ActiveFilter_4= ruleActiveFilter
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
                    // InternalEclParser.g:2900:3: this_PreferredInFilter_5= rulePreferredInFilter
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
                    // InternalEclParser.g:2912:3: this_AcceptableInFilter_6= ruleAcceptableInFilter
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
                    // InternalEclParser.g:2924:3: this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter
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
                    // InternalEclParser.g:2936:3: this_ModuleFilter_8= ruleModuleFilter
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
                    // InternalEclParser.g:2948:3: this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getCaseSignificanceFilterParserRuleCall_9());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_CaseSignificanceFilter_9=ruleCaseSignificanceFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_CaseSignificanceFilter_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalEclParser.g:2960:3: this_NestedFilter_10= ruleNestedFilter
                    {
                    if ( state.backtracking==0 ) {

                      			/* */
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getPropertyFilterAccess().getNestedFilterParserRuleCall_10());
                      		
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    this_NestedFilter_10=ruleNestedFilter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_NestedFilter_10;
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
    // InternalEclParser.g:2975:1: entryRuleTermFilter returns [EObject current=null] : iv_ruleTermFilter= ruleTermFilter EOF ;
    public final EObject entryRuleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTermFilter = null;


        try {
            // InternalEclParser.g:2975:51: (iv_ruleTermFilter= ruleTermFilter EOF )
            // InternalEclParser.g:2976:2: iv_ruleTermFilter= ruleTermFilter EOF
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
    // InternalEclParser.g:2982:1: ruleTermFilter returns [EObject current=null] : ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) ;
    public final EObject ruleTermFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypedTermFilter_1 = null;

        EObject this_TypedTermFilterSet_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:2988:2: ( ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) ) )
            // InternalEclParser.g:2989:2: ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            {
            // InternalEclParser.g:2989:2: ( ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet ) )
            // InternalEclParser.g:2990:3: ruleTERM_KEYWORD (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTermFilterAccess().getTERM_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleTERM_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3000:3: (this_TypedTermFilter_1= ruleTypedTermFilter | this_TypedTermFilterSet_2= ruleTypedTermFilterSet )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_EQUAL) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==Exact||LA31_1==Match||LA31_1==Regex||LA31_1==Wild||LA31_1==RULE_STRING) ) {
                    alt31=1;
                }
                else if ( (LA31_1==RULE_ROUND_OPEN) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA31_0==RULE_NOT_EQUAL) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==RULE_ROUND_OPEN) ) {
                    alt31=2;
                }
                else if ( (LA31_2==Exact||LA31_2==Match||LA31_2==Regex||LA31_2==Wild||LA31_2==RULE_STRING) ) {
                    alt31=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // InternalEclParser.g:3001:4: this_TypedTermFilter_1= ruleTypedTermFilter
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
                    // InternalEclParser.g:3013:4: this_TypedTermFilterSet_2= ruleTypedTermFilterSet
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
    // InternalEclParser.g:3029:1: entryRuleTypedTermFilter returns [EObject current=null] : iv_ruleTypedTermFilter= ruleTypedTermFilter EOF ;
    public final EObject entryRuleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilter = null;


        try {
            // InternalEclParser.g:3029:56: (iv_ruleTypedTermFilter= ruleTypedTermFilter EOF )
            // InternalEclParser.g:3030:2: iv_ruleTypedTermFilter= ruleTypedTermFilter EOF
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
    // InternalEclParser.g:3036:1: ruleTypedTermFilter returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleTypedTermFilter() throws RecognitionException {
        EObject current = null;

        Token this_COLON_2=null;
        Token lv_term_3_0=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        AntlrDatatypeRuleToken lv_lexicalSearchType_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3042:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) ) )
            // InternalEclParser.g:3043:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) )
            {
            // InternalEclParser.g:3043:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) ) )
            // InternalEclParser.g:3044:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )? ( (lv_term_3_0= RULE_STRING ) )
            {
            // InternalEclParser.g:3044:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3045:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3045:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3046:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_31);
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

            // InternalEclParser.g:3063:3: ( ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==Exact||LA32_0==Match||LA32_0==Regex||LA32_0==Wild) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalEclParser.g:3064:4: ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) ) this_COLON_2= RULE_COLON
                    {
                    // InternalEclParser.g:3064:4: ( (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE ) )
                    // InternalEclParser.g:3065:5: (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE )
                    {
                    // InternalEclParser.g:3065:5: (lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE )
                    // InternalEclParser.g:3066:6: lv_lexicalSearchType_1_0= ruleLEXICAL_SEARCH_TYPE
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getTypedTermFilterAccess().getLexicalSearchTypeLEXICAL_SEARCH_TYPEParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_32);
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

                    this_COLON_2=(Token)match(input,RULE_COLON,FollowSets000.FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_COLON_2, grammarAccess.getTypedTermFilterAccess().getCOLONTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:3088:3: ( (lv_term_3_0= RULE_STRING ) )
            // InternalEclParser.g:3089:4: (lv_term_3_0= RULE_STRING )
            {
            // InternalEclParser.g:3089:4: (lv_term_3_0= RULE_STRING )
            // InternalEclParser.g:3090:5: lv_term_3_0= RULE_STRING
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
    // InternalEclParser.g:3110:1: entryRuleTypedTermFilterSet returns [EObject current=null] : iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF ;
    public final EObject entryRuleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypedTermFilterSet = null;


        try {
            // InternalEclParser.g:3110:59: (iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF )
            // InternalEclParser.g:3111:2: iv_ruleTypedTermFilterSet= ruleTypedTermFilterSet EOF
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
    // InternalEclParser.g:3117:1: ruleTypedTermFilterSet returns [EObject current=null] : ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE ) ;
    public final EObject ruleTypedTermFilterSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_1=null;
        Token this_ROUND_CLOSE_4=null;
        AntlrDatatypeRuleToken lv_op_0_0 = null;

        EObject lv_terms_2_0 = null;

        EObject lv_terms_3_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3123:2: ( ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:3124:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:3124:2: ( ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE )
            // InternalEclParser.g:3125:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) ) this_ROUND_OPEN_1= RULE_ROUND_OPEN ( (lv_terms_2_0= ruleTypedTermFilter ) ) ( (lv_terms_3_0= ruleTypedTermFilter ) )* this_ROUND_CLOSE_4= RULE_ROUND_CLOSE
            {
            // InternalEclParser.g:3125:3: ( (lv_op_0_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3126:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3126:4: (lv_op_0_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3127:5: lv_op_0_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_33);
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
            // InternalEclParser.g:3148:3: ( (lv_terms_2_0= ruleTypedTermFilter ) )
            // InternalEclParser.g:3149:4: (lv_terms_2_0= ruleTypedTermFilter )
            {
            // InternalEclParser.g:3149:4: (lv_terms_2_0= ruleTypedTermFilter )
            // InternalEclParser.g:3150:5: lv_terms_2_0= ruleTypedTermFilter
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_2_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_34);
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

            // InternalEclParser.g:3167:3: ( (lv_terms_3_0= ruleTypedTermFilter ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_EQUAL && LA33_0<=RULE_NOT_EQUAL)) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalEclParser.g:3168:4: (lv_terms_3_0= ruleTypedTermFilter )
            	    {
            	    // InternalEclParser.g:3168:4: (lv_terms_3_0= ruleTypedTermFilter )
            	    // InternalEclParser.g:3169:5: lv_terms_3_0= ruleTypedTermFilter
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getTypedTermFilterSetAccess().getTermsTypedTermFilterParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_34);
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
            	    break loop33;
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


    // $ANTLR start "entryRuleLanguageCodeFilter"
    // InternalEclParser.g:3194:1: entryRuleLanguageCodeFilter returns [EObject current=null] : iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF ;
    public final EObject entryRuleLanguageCodeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageCodeFilter = null;


        try {
            // InternalEclParser.g:3194:59: (iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF )
            // InternalEclParser.g:3195:2: iv_ruleLanguageCodeFilter= ruleLanguageCodeFilter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLanguageCodeFilterRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            iv_ruleLanguageCodeFilter=ruleLanguageCodeFilter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLanguageCodeFilter; 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLanguageCodeFilter"


    // $ANTLR start "ruleLanguageCodeFilter"
    // InternalEclParser.g:3201:1: ruleLanguageCodeFilter returns [EObject current=null] : ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
    public final EObject ruleLanguageCodeFilter() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_3=null;
        Token this_ROUND_CLOSE_6=null;
        AntlrDatatypeRuleToken lv_op_1_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_2_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_4_0 = null;

        AntlrDatatypeRuleToken lv_languageCodes_5_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3207:2: ( ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3208:2: ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3208:2: ( ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3209:3: ruleLANGUAGE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLanguageCodeFilterAccess().getLANGUAGE_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleLANGUAGE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3219:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3220:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3220:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3221:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getLanguageCodeFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
            lv_op_1_0=ruleNON_NUMERIC_OPERATOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getLanguageCodeFilterRule());
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

            // InternalEclParser.g:3238:3: ( ( (lv_languageCodes_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_ALPHA) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEclParser.g:3239:4: ( (lv_languageCodes_2_0= ruleAlphabetical ) )
                    {
                    // InternalEclParser.g:3239:4: ( (lv_languageCodes_2_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3240:5: (lv_languageCodes_2_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3240:5: (lv_languageCodes_2_0= ruleAlphabetical )
                    // InternalEclParser.g:3241:6: lv_languageCodes_2_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    lv_languageCodes_2_0=ruleAlphabetical();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getLanguageCodeFilterRule());
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
                    // InternalEclParser.g:3259:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3259:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3260:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_languageCodes_4_0= ruleAlphabetical ) ) ( (lv_languageCodes_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getLanguageCodeFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3264:5: ( (lv_languageCodes_4_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3265:6: (lv_languageCodes_4_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3265:6: (lv_languageCodes_4_0= ruleAlphabetical )
                    // InternalEclParser.g:3266:7: lv_languageCodes_4_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
                    lv_languageCodes_4_0=ruleAlphabetical();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getLanguageCodeFilterRule());
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

                    // InternalEclParser.g:3283:5: ( (lv_languageCodes_5_0= ruleAlphabetical ) )*
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RULE_ALPHA) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // InternalEclParser.g:3284:6: (lv_languageCodes_5_0= ruleAlphabetical )
                    	    {
                    	    // InternalEclParser.g:3284:6: (lv_languageCodes_5_0= ruleAlphabetical )
                    	    // InternalEclParser.g:3285:7: lv_languageCodes_5_0= ruleAlphabetical
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getLanguageCodeFilterAccess().getLanguageCodesAlphabeticalParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
                    	    lv_languageCodes_5_0=ruleAlphabetical();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getLanguageCodeFilterRule());
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
                    	    break loop34;
                        }
                    } while (true);

                    this_ROUND_CLOSE_6=(Token)match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_CLOSE_6, grammarAccess.getLanguageCodeFilterAccess().getROUND_CLOSETerminalRuleCall_2_1_3());
                      				
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
    // $ANTLR end "ruleLanguageCodeFilter"


    // $ANTLR start "entryRuleTypeFilter"
    // InternalEclParser.g:3312:1: entryRuleTypeFilter returns [EObject current=null] : iv_ruleTypeFilter= ruleTypeFilter EOF ;
    public final EObject entryRuleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeFilter = null;


        try {
            // InternalEclParser.g:3312:51: (iv_ruleTypeFilter= ruleTypeFilter EOF )
            // InternalEclParser.g:3313:2: iv_ruleTypeFilter= ruleTypeFilter EOF
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
    // InternalEclParser.g:3319:1: ruleTypeFilter returns [EObject current=null] : (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) ;
    public final EObject ruleTypeFilter() throws RecognitionException {
        EObject current = null;

        EObject this_TypeIdFilter_0 = null;

        EObject this_TypeTokenFilter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3325:2: ( (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter ) )
            // InternalEclParser.g:3326:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            {
            // InternalEclParser.g:3326:2: (this_TypeIdFilter_0= ruleTypeIdFilter | this_TypeTokenFilter_1= ruleTypeTokenFilter )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==TypeId) ) {
                alt36=1;
            }
            else if ( (LA36_0==Type) ) {
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
                    // InternalEclParser.g:3327:3: this_TypeIdFilter_0= ruleTypeIdFilter
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
                    // InternalEclParser.g:3339:3: this_TypeTokenFilter_1= ruleTypeTokenFilter
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
    // InternalEclParser.g:3354:1: entryRuleTypeIdFilter returns [EObject current=null] : iv_ruleTypeIdFilter= ruleTypeIdFilter EOF ;
    public final EObject entryRuleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeIdFilter = null;


        try {
            // InternalEclParser.g:3354:53: (iv_ruleTypeIdFilter= ruleTypeIdFilter EOF )
            // InternalEclParser.g:3355:2: iv_ruleTypeIdFilter= ruleTypeIdFilter EOF
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
    // InternalEclParser.g:3361:1: ruleTypeIdFilter returns [EObject current=null] : ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) ) ;
    public final EObject ruleTypeIdFilter() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_op_1_0 = null;

        EObject lv_type_2_1 = null;

        EObject lv_type_2_2 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3367:2: ( ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) ) )
            // InternalEclParser.g:3368:2: ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) )
            {
            // InternalEclParser.g:3368:2: ( ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) ) )
            // InternalEclParser.g:3369:3: ruleTYPEID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeIdFilterAccess().getTYPEID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleTYPEID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3379:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3380:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3380:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3381:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalEclParser.g:3398:3: ( ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) ) )
            // InternalEclParser.g:3399:4: ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) )
            {
            // InternalEclParser.g:3399:4: ( (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet ) )
            // InternalEclParser.g:3400:5: (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet )
            {
            // InternalEclParser.g:3400:5: (lv_type_2_1= ruleEclConceptReference | lv_type_2_2= ruleEclConceptReferenceSet )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_DIGIT_NONZERO) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEclParser.g:3401:6: lv_type_2_1= ruleEclConceptReference
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
                    // InternalEclParser.g:3417:6: lv_type_2_2= ruleEclConceptReferenceSet
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
    // InternalEclParser.g:3439:1: entryRuleTypeTokenFilter returns [EObject current=null] : iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF ;
    public final EObject entryRuleTypeTokenFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeTokenFilter = null;


        try {
            // InternalEclParser.g:3439:56: (iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF )
            // InternalEclParser.g:3440:2: iv_ruleTypeTokenFilter= ruleTypeTokenFilter EOF
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
    // InternalEclParser.g:3446:1: ruleTypeTokenFilter returns [EObject current=null] : ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEclParser.g:3452:2: ( ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3453:2: ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3453:2: ( ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3454:3: ruleTYPE_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTYPE_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleTYPE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3464:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3465:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3465:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3466:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalEclParser.g:3483:3: ( ( (lv_tokens_2_0= ruleAlphabetical ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ALPHA) ) {
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
                    // InternalEclParser.g:3484:4: ( (lv_tokens_2_0= ruleAlphabetical ) )
                    {
                    // InternalEclParser.g:3484:4: ( (lv_tokens_2_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3485:5: (lv_tokens_2_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3485:5: (lv_tokens_2_0= ruleAlphabetical )
                    // InternalEclParser.g:3486:6: lv_tokens_2_0= ruleAlphabetical
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
                    // InternalEclParser.g:3504:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3504:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3505:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_tokens_4_0= ruleAlphabetical ) ) ( (lv_tokens_5_0= ruleAlphabetical ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getTypeTokenFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3509:5: ( (lv_tokens_4_0= ruleAlphabetical ) )
                    // InternalEclParser.g:3510:6: (lv_tokens_4_0= ruleAlphabetical )
                    {
                    // InternalEclParser.g:3510:6: (lv_tokens_4_0= ruleAlphabetical )
                    // InternalEclParser.g:3511:7: lv_tokens_4_0= ruleAlphabetical
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    // InternalEclParser.g:3528:5: ( (lv_tokens_5_0= ruleAlphabetical ) )*
                    loop38:
                    do {
                        int alt38=2;
                        int LA38_0 = input.LA(1);

                        if ( (LA38_0==RULE_ALPHA) ) {
                            alt38=1;
                        }


                        switch (alt38) {
                    	case 1 :
                    	    // InternalEclParser.g:3529:6: (lv_tokens_5_0= ruleAlphabetical )
                    	    {
                    	    // InternalEclParser.g:3529:6: (lv_tokens_5_0= ruleAlphabetical )
                    	    // InternalEclParser.g:3530:7: lv_tokens_5_0= ruleAlphabetical
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getTypeTokenFilterAccess().getTokensAlphabeticalParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
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
                    	    break loop38;
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
    // InternalEclParser.g:3557:1: entryRuleDialectFilter returns [EObject current=null] : iv_ruleDialectFilter= ruleDialectFilter EOF ;
    public final EObject entryRuleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectFilter = null;


        try {
            // InternalEclParser.g:3557:54: (iv_ruleDialectFilter= ruleDialectFilter EOF )
            // InternalEclParser.g:3558:2: iv_ruleDialectFilter= ruleDialectFilter EOF
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
    // InternalEclParser.g:3564:1: ruleDialectFilter returns [EObject current=null] : (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) ;
    public final EObject ruleDialectFilter() throws RecognitionException {
        EObject current = null;

        EObject this_DialectIdFilter_0 = null;

        EObject this_DialectAliasFilter_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3570:2: ( (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter ) )
            // InternalEclParser.g:3571:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            {
            // InternalEclParser.g:3571:2: (this_DialectIdFilter_0= ruleDialectIdFilter | this_DialectAliasFilter_1= ruleDialectAliasFilter )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==DialectId) ) {
                alt40=1;
            }
            else if ( (LA40_0==Dialect) ) {
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
                    // InternalEclParser.g:3572:3: this_DialectIdFilter_0= ruleDialectIdFilter
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
                    // InternalEclParser.g:3584:3: this_DialectAliasFilter_1= ruleDialectAliasFilter
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
    // InternalEclParser.g:3599:1: entryRuleDialectIdFilter returns [EObject current=null] : iv_ruleDialectIdFilter= ruleDialectIdFilter EOF ;
    public final EObject entryRuleDialectIdFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectIdFilter = null;


        try {
            // InternalEclParser.g:3599:56: (iv_ruleDialectIdFilter= ruleDialectIdFilter EOF )
            // InternalEclParser.g:3600:2: iv_ruleDialectIdFilter= ruleDialectIdFilter EOF
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
    // InternalEclParser.g:3606:1: ruleDialectIdFilter returns [EObject current=null] : ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEclParser.g:3612:2: ( ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3613:2: ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3613:2: ( ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3614:3: ruleDIALECTID_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDialectIdFilterAccess().getDIALECTID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleDIALECTID_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3624:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3625:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3625:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3626:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectIdFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_38);
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

            // InternalEclParser.g:3643:3: ( ( (lv_dialects_2_0= ruleDialect ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==RULE_DIGIT_NONZERO) ) {
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
                    // InternalEclParser.g:3644:4: ( (lv_dialects_2_0= ruleDialect ) )
                    {
                    // InternalEclParser.g:3644:4: ( (lv_dialects_2_0= ruleDialect ) )
                    // InternalEclParser.g:3645:5: (lv_dialects_2_0= ruleDialect )
                    {
                    // InternalEclParser.g:3645:5: (lv_dialects_2_0= ruleDialect )
                    // InternalEclParser.g:3646:6: lv_dialects_2_0= ruleDialect
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
                    // InternalEclParser.g:3664:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3664:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3665:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialect ) ) ( (lv_dialects_5_0= ruleDialect ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectIdFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3669:5: ( (lv_dialects_4_0= ruleDialect ) )
                    // InternalEclParser.g:3670:6: (lv_dialects_4_0= ruleDialect )
                    {
                    // InternalEclParser.g:3670:6: (lv_dialects_4_0= ruleDialect )
                    // InternalEclParser.g:3671:7: lv_dialects_4_0= ruleDialect
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

                    // InternalEclParser.g:3688:5: ( (lv_dialects_5_0= ruleDialect ) )*
                    loop41:
                    do {
                        int alt41=2;
                        int LA41_0 = input.LA(1);

                        if ( (LA41_0==RULE_DIGIT_NONZERO) ) {
                            alt41=1;
                        }


                        switch (alt41) {
                    	case 1 :
                    	    // InternalEclParser.g:3689:6: (lv_dialects_5_0= ruleDialect )
                    	    {
                    	    // InternalEclParser.g:3689:6: (lv_dialects_5_0= ruleDialect )
                    	    // InternalEclParser.g:3690:7: lv_dialects_5_0= ruleDialect
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
                    	    break loop41;
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
    // InternalEclParser.g:3717:1: entryRuleDialectAliasFilter returns [EObject current=null] : iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF ;
    public final EObject entryRuleDialectAliasFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAliasFilter = null;


        try {
            // InternalEclParser.g:3717:59: (iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF )
            // InternalEclParser.g:3718:2: iv_ruleDialectAliasFilter= ruleDialectAliasFilter EOF
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
    // InternalEclParser.g:3724:1: ruleDialectAliasFilter returns [EObject current=null] : ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) ;
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
            // InternalEclParser.g:3730:2: ( ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) ) )
            // InternalEclParser.g:3731:2: ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            {
            // InternalEclParser.g:3731:2: ( ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) ) )
            // InternalEclParser.g:3732:3: ruleDIALECT_KEYWORD ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) ) ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDIALECT_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_30);
            ruleDIALECT_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEclParser.g:3742:3: ( (lv_op_1_0= ruleNON_NUMERIC_OPERATOR ) )
            // InternalEclParser.g:3743:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            {
            // InternalEclParser.g:3743:4: (lv_op_1_0= ruleNON_NUMERIC_OPERATOR )
            // InternalEclParser.g:3744:5: lv_op_1_0= ruleNON_NUMERIC_OPERATOR
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getOpNON_NUMERIC_OPERATORParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_35);
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

            // InternalEclParser.g:3761:3: ( ( (lv_dialects_2_0= ruleDialectAlias ) ) | (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE ) )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==RULE_ALPHA) ) {
                alt44=1;
            }
            else if ( (LA44_0==RULE_ROUND_OPEN) ) {
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
                    // InternalEclParser.g:3762:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    {
                    // InternalEclParser.g:3762:4: ( (lv_dialects_2_0= ruleDialectAlias ) )
                    // InternalEclParser.g:3763:5: (lv_dialects_2_0= ruleDialectAlias )
                    {
                    // InternalEclParser.g:3763:5: (lv_dialects_2_0= ruleDialectAlias )
                    // InternalEclParser.g:3764:6: lv_dialects_2_0= ruleDialectAlias
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
                    // InternalEclParser.g:3782:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    {
                    // InternalEclParser.g:3782:4: (this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE )
                    // InternalEclParser.g:3783:5: this_ROUND_OPEN_3= RULE_ROUND_OPEN ( (lv_dialects_4_0= ruleDialectAlias ) ) ( (lv_dialects_5_0= ruleDialectAlias ) )* this_ROUND_CLOSE_6= RULE_ROUND_CLOSE
                    {
                    this_ROUND_OPEN_3=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(this_ROUND_OPEN_3, grammarAccess.getDialectAliasFilterAccess().getROUND_OPENTerminalRuleCall_2_1_0());
                      				
                    }
                    // InternalEclParser.g:3787:5: ( (lv_dialects_4_0= ruleDialectAlias ) )
                    // InternalEclParser.g:3788:6: (lv_dialects_4_0= ruleDialectAlias )
                    {
                    // InternalEclParser.g:3788:6: (lv_dialects_4_0= ruleDialectAlias )
                    // InternalEclParser.g:3789:7: lv_dialects_4_0= ruleDialectAlias
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_1_0());
                      						
                    }
                    pushFollow(FollowSets000.FOLLOW_37);
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

                    // InternalEclParser.g:3806:5: ( (lv_dialects_5_0= ruleDialectAlias ) )*
                    loop43:
                    do {
                        int alt43=2;
                        int LA43_0 = input.LA(1);

                        if ( (LA43_0==RULE_ALPHA) ) {
                            alt43=1;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalEclParser.g:3807:6: (lv_dialects_5_0= ruleDialectAlias )
                    	    {
                    	    // InternalEclParser.g:3807:6: (lv_dialects_5_0= ruleDialectAlias )
                    	    // InternalEclParser.g:3808:7: lv_dialects_5_0= ruleDialectAlias
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getDialectAliasFilterAccess().getDialectsDialectAliasParserRuleCall_2_1_2_0());
                    	      						
                    	    }
                    	    pushFollow(FollowSets000.FOLLOW_37);
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
                    	    break loop43;
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
    // InternalEclParser.g:3835:1: entryRuleDialect returns [EObject current=null] : iv_ruleDialect= ruleDialect EOF ;
    public final EObject entryRuleDialect() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialect = null;


        try {
            // InternalEclParser.g:3835:48: (iv_ruleDialect= ruleDialect EOF )
            // InternalEclParser.g:3836:2: iv_ruleDialect= ruleDialect EOF
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
    // InternalEclParser.g:3842:1: ruleDialect returns [EObject current=null] : ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialect() throws RecognitionException {
        EObject current = null;

        EObject lv_languageRefSetId_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3848:2: ( ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEclParser.g:3849:2: ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEclParser.g:3849:2: ( ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEclParser.g:3850:3: ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEclParser.g:3850:3: ( (lv_languageRefSetId_0_0= ruleEclConceptReference ) )
            // InternalEclParser.g:3851:4: (lv_languageRefSetId_0_0= ruleEclConceptReference )
            {
            // InternalEclParser.g:3851:4: (lv_languageRefSetId_0_0= ruleEclConceptReference )
            // InternalEclParser.g:3852:5: lv_languageRefSetId_0_0= ruleEclConceptReference
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAccess().getLanguageRefSetIdEclConceptReferenceParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            // InternalEclParser.g:3869:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==RULE_ROUND_OPEN) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalEclParser.g:3870:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEclParser.g:3870:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEclParser.g:3871:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEclParser.g:3892:1: entryRuleDialectAlias returns [EObject current=null] : iv_ruleDialectAlias= ruleDialectAlias EOF ;
    public final EObject entryRuleDialectAlias() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDialectAlias = null;


        try {
            // InternalEclParser.g:3892:53: (iv_ruleDialectAlias= ruleDialectAlias EOF )
            // InternalEclParser.g:3893:2: iv_ruleDialectAlias= ruleDialectAlias EOF
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
    // InternalEclParser.g:3899:1: ruleDialectAlias returns [EObject current=null] : ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) ;
    public final EObject ruleDialectAlias() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_alias_0_0 = null;

        EObject lv_acceptability_1_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3905:2: ( ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? ) )
            // InternalEclParser.g:3906:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            {
            // InternalEclParser.g:3906:2: ( ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )? )
            // InternalEclParser.g:3907:3: ( (lv_alias_0_0= ruleDialectAliasValue ) ) ( (lv_acceptability_1_0= ruleAcceptability ) )?
            {
            // InternalEclParser.g:3907:3: ( (lv_alias_0_0= ruleDialectAliasValue ) )
            // InternalEclParser.g:3908:4: (lv_alias_0_0= ruleDialectAliasValue )
            {
            // InternalEclParser.g:3908:4: (lv_alias_0_0= ruleDialectAliasValue )
            // InternalEclParser.g:3909:5: lv_alias_0_0= ruleDialectAliasValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getDialectAliasAccess().getAliasDialectAliasValueParserRuleCall_0_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_39);
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

            // InternalEclParser.g:3926:3: ( (lv_acceptability_1_0= ruleAcceptability ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==RULE_ROUND_OPEN) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalEclParser.g:3927:4: (lv_acceptability_1_0= ruleAcceptability )
                    {
                    // InternalEclParser.g:3927:4: (lv_acceptability_1_0= ruleAcceptability )
                    // InternalEclParser.g:3928:5: lv_acceptability_1_0= ruleAcceptability
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
    // InternalEclParser.g:3949:1: entryRuleAcceptability returns [EObject current=null] : iv_ruleAcceptability= ruleAcceptability EOF ;
    public final EObject entryRuleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptability = null;


        try {
            // InternalEclParser.g:3949:54: (iv_ruleAcceptability= ruleAcceptability EOF )
            // InternalEclParser.g:3950:2: iv_ruleAcceptability= ruleAcceptability EOF
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
    // InternalEclParser.g:3956:1: ruleAcceptability returns [EObject current=null] : (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) ;
    public final EObject ruleAcceptability() throws RecognitionException {
        EObject current = null;

        EObject this_AcceptabilityIdSet_0 = null;

        EObject this_AcceptabilityTokenSet_1 = null;



        	enterRule();

        try {
            // InternalEclParser.g:3962:2: ( (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet ) )
            // InternalEclParser.g:3963:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            {
            // InternalEclParser.g:3963:2: (this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet | this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==RULE_ROUND_OPEN) ) {
                int LA47_1 = input.LA(2);

                if ( (LA47_1==RULE_ALPHA) ) {
                    alt47=2;
                }
                else if ( (LA47_1==RULE_DIGIT_NONZERO) ) {
                    alt47=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 47, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalEclParser.g:3964:3: this_AcceptabilityIdSet_0= ruleAcceptabilityIdSet
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
                    // InternalEclParser.g:3976:3: this_AcceptabilityTokenSet_1= ruleAcceptabilityTokenSet
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
    // InternalEclParser.g:3991:1: entryRuleAcceptabilityIdSet returns [EObject current=null] : iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF ;
    public final EObject entryRuleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityIdSet = null;


        try {
            // InternalEclParser.g:3991:59: (iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF )
            // InternalEclParser.g:3992:2: iv_ruleAcceptabilityIdSet= ruleAcceptabilityIdSet EOF
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
    // InternalEclParser.g:3998:1: ruleAcceptabilityIdSet returns [EObject current=null] : ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) ;
    public final EObject ruleAcceptabilityIdSet() throws RecognitionException {
        EObject current = null;

        EObject lv_acceptabilities_0_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4004:2: ( ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) ) )
            // InternalEclParser.g:4005:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            {
            // InternalEclParser.g:4005:2: ( (lv_acceptabilities_0_0= ruleEclConceptReferenceSet ) )
            // InternalEclParser.g:4006:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            {
            // InternalEclParser.g:4006:3: (lv_acceptabilities_0_0= ruleEclConceptReferenceSet )
            // InternalEclParser.g:4007:4: lv_acceptabilities_0_0= ruleEclConceptReferenceSet
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
    // InternalEclParser.g:4027:1: entryRuleAcceptabilityTokenSet returns [EObject current=null] : iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF ;
    public final EObject entryRuleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptabilityTokenSet = null;


        try {
            // InternalEclParser.g:4027:62: (iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF )
            // InternalEclParser.g:4028:2: iv_ruleAcceptabilityTokenSet= ruleAcceptabilityTokenSet EOF
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
    // InternalEclParser.g:4034:1: ruleAcceptabilityTokenSet returns [EObject current=null] : (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) ;
    public final EObject ruleAcceptabilityTokenSet() throws RecognitionException {
        EObject current = null;

        Token this_ROUND_OPEN_0=null;
        Token this_ROUND_CLOSE_3=null;
        AntlrDatatypeRuleToken lv_acceptabilities_1_0 = null;

        AntlrDatatypeRuleToken lv_acceptabilities_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4040:2: ( (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:4041:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:4041:2: (this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE )
            // InternalEclParser.g:4042:3: this_ROUND_OPEN_0= RULE_ROUND_OPEN ( (lv_acceptabilities_1_0= ruleAlphabetical ) ) ( (lv_acceptabilities_2_0= ruleAlphabetical ) )* this_ROUND_CLOSE_3= RULE_ROUND_CLOSE
            {
            this_ROUND_OPEN_0=(Token)match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ROUND_OPEN_0, grammarAccess.getAcceptabilityTokenSetAccess().getROUND_OPENTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:4046:3: ( (lv_acceptabilities_1_0= ruleAlphabetical ) )
            // InternalEclParser.g:4047:4: (lv_acceptabilities_1_0= ruleAlphabetical )
            {
            // InternalEclParser.g:4047:4: (lv_acceptabilities_1_0= ruleAlphabetical )
            // InternalEclParser.g:4048:5: lv_acceptabilities_1_0= ruleAlphabetical
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_1_0());
              				
            }
            pushFollow(FollowSets000.FOLLOW_37);
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

            // InternalEclParser.g:4065:3: ( (lv_acceptabilities_2_0= ruleAlphabetical ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ALPHA) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalEclParser.g:4066:4: (lv_acceptabilities_2_0= ruleAlphabetical )
            	    {
            	    // InternalEclParser.g:4066:4: (lv_acceptabilities_2_0= ruleAlphabetical )
            	    // InternalEclParser.g:4067:5: lv_acceptabilities_2_0= ruleAlphabetical
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getAcceptabilityTokenSetAccess().getAcceptabilitiesAlphabeticalParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FollowSets000.FOLLOW_37);
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
            	    break loop48;
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
    // InternalEclParser.g:4092:1: entryRuleActiveFilter returns [EObject current=null] : iv_ruleActiveFilter= ruleActiveFilter EOF ;
    public final EObject entryRuleActiveFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleActiveFilter = null;


        try {
            // InternalEclParser.g:4092:53: (iv_ruleActiveFilter= ruleActiveFilter EOF )
            // InternalEclParser.g:4093:2: iv_ruleActiveFilter= ruleActiveFilter EOF
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
    // InternalEclParser.g:4099:1: ruleActiveFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) ;
    public final EObject ruleActiveFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token this_EQUAL_3=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        AntlrDatatypeRuleToken lv_active_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4105:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) ) )
            // InternalEclParser.g:4106:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            {
            // InternalEclParser.g:4106:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) ) )
            // InternalEclParser.g:4107:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleACTIVE_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_active_4_0= ruleBoolean ) )
            {
            // InternalEclParser.g:4107:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Description||LA49_0==Concept) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalEclParser.g:4108:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4108:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4109:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4109:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4110:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getActiveFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_41); if (state.failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_42);
            ruleACTIVE_KEYWORD();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_EQUAL_3=(Token)match(input,RULE_EQUAL,FollowSets000.FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(this_EQUAL_3, grammarAccess.getActiveFilterAccess().getEQUALTerminalRuleCall_2());
              		
            }
            // InternalEclParser.g:4146:3: ( (lv_active_4_0= ruleBoolean ) )
            // InternalEclParser.g:4147:4: (lv_active_4_0= ruleBoolean )
            {
            // InternalEclParser.g:4147:4: (lv_active_4_0= ruleBoolean )
            // InternalEclParser.g:4148:5: lv_active_4_0= ruleBoolean
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
    // InternalEclParser.g:4169:1: entryRuleModuleFilter returns [EObject current=null] : iv_ruleModuleFilter= ruleModuleFilter EOF ;
    public final EObject entryRuleModuleFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModuleFilter = null;


        try {
            // InternalEclParser.g:4169:53: (iv_ruleModuleFilter= ruleModuleFilter EOF )
            // InternalEclParser.g:4170:2: iv_ruleModuleFilter= ruleModuleFilter EOF
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
    // InternalEclParser.g:4176:1: ruleModuleFilter returns [EObject current=null] : ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleModuleFilter() throws RecognitionException {
        EObject current = null;

        Token this_DOT_1=null;
        Token this_EQUAL_3=null;
        AntlrDatatypeRuleToken lv_domain_0_0 = null;

        EObject lv_moduleId_4_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4182:2: ( ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4183:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4183:2: ( ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4184:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )? ruleMODULEID_KEYWORD this_EQUAL_3= RULE_EQUAL ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            {
            // InternalEclParser.g:4184:3: ( ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Description||LA50_0==Concept) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalEclParser.g:4185:4: ( (lv_domain_0_0= ruleDOMAIN ) ) this_DOT_1= RULE_DOT
                    {
                    // InternalEclParser.g:4185:4: ( (lv_domain_0_0= ruleDOMAIN ) )
                    // InternalEclParser.g:4186:5: (lv_domain_0_0= ruleDOMAIN )
                    {
                    // InternalEclParser.g:4186:5: (lv_domain_0_0= ruleDOMAIN )
                    // InternalEclParser.g:4187:6: lv_domain_0_0= ruleDOMAIN
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getModuleFilterAccess().getDomainDOMAINParserRuleCall_0_0_0());
                      					
                    }
                    pushFollow(FollowSets000.FOLLOW_40);
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

                    this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_43); if (state.failed) return current;
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
            pushFollow(FollowSets000.FOLLOW_42);
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
            // InternalEclParser.g:4223:3: ( (lv_moduleId_4_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4224:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4224:4: (lv_moduleId_4_0= ruleExpressionConstraint )
            // InternalEclParser.g:4225:5: lv_moduleId_4_0= ruleExpressionConstraint
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


    // $ANTLR start "entryRulePreferredInFilter"
    // InternalEclParser.g:4246:1: entryRulePreferredInFilter returns [EObject current=null] : iv_rulePreferredInFilter= rulePreferredInFilter EOF ;
    public final EObject entryRulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreferredInFilter = null;


        try {
            // InternalEclParser.g:4246:58: (iv_rulePreferredInFilter= rulePreferredInFilter EOF )
            // InternalEclParser.g:4247:2: iv_rulePreferredInFilter= rulePreferredInFilter EOF
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
    // InternalEclParser.g:4253:1: rulePreferredInFilter returns [EObject current=null] : ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject rulePreferredInFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4259:2: ( ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4260:2: ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4260:2: ( rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4261:3: rulePREFERRED_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getPreferredInFilterAccess().getPREFERRED_IN_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
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
            // InternalEclParser.g:4275:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4276:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4276:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4277:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
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
    // InternalEclParser.g:4298:1: entryRuleAcceptableInFilter returns [EObject current=null] : iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF ;
    public final EObject entryRuleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAcceptableInFilter = null;


        try {
            // InternalEclParser.g:4298:59: (iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF )
            // InternalEclParser.g:4299:2: iv_ruleAcceptableInFilter= ruleAcceptableInFilter EOF
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
    // InternalEclParser.g:4305:1: ruleAcceptableInFilter returns [EObject current=null] : ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleAcceptableInFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4311:2: ( ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4312:2: ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4312:2: ( ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4313:3: ruleACCEPTABLE_IN_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getAcceptableInFilterAccess().getACCEPTABLE_IN_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
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
            // InternalEclParser.g:4327:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4328:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4328:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4329:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
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
    // InternalEclParser.g:4350:1: entryRuleLanguageRefSetFilter returns [EObject current=null] : iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF ;
    public final EObject entryRuleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLanguageRefSetFilter = null;


        try {
            // InternalEclParser.g:4350:61: (iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF )
            // InternalEclParser.g:4351:2: iv_ruleLanguageRefSetFilter= ruleLanguageRefSetFilter EOF
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
    // InternalEclParser.g:4357:1: ruleLanguageRefSetFilter returns [EObject current=null] : ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleLanguageRefSetFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_languageRefSetId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4363:2: ( ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4364:2: ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4364:2: ( ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4365:3: ruleLANGUAGE_REFSET_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getLanguageRefSetFilterAccess().getLANGUAGE_REFSET_ID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
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
            // InternalEclParser.g:4379:3: ( (lv_languageRefSetId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4380:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4380:4: (lv_languageRefSetId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4381:5: lv_languageRefSetId_2_0= ruleExpressionConstraint
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
    // InternalEclParser.g:4402:1: entryRuleCaseSignificanceFilter returns [EObject current=null] : iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF ;
    public final EObject entryRuleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCaseSignificanceFilter = null;


        try {
            // InternalEclParser.g:4402:63: (iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF )
            // InternalEclParser.g:4403:2: iv_ruleCaseSignificanceFilter= ruleCaseSignificanceFilter EOF
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
    // InternalEclParser.g:4409:1: ruleCaseSignificanceFilter returns [EObject current=null] : ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) ;
    public final EObject ruleCaseSignificanceFilter() throws RecognitionException {
        EObject current = null;

        Token this_EQUAL_1=null;
        EObject lv_caseSignificanceId_2_0 = null;



        	enterRule();

        try {
            // InternalEclParser.g:4415:2: ( ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) ) )
            // InternalEclParser.g:4416:2: ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            {
            // InternalEclParser.g:4416:2: ( ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) ) )
            // InternalEclParser.g:4417:3: ruleCASE_SIGNIFICANCE_ID_KEYWORD this_EQUAL_1= RULE_EQUAL ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            {
            if ( state.backtracking==0 ) {

              			/* */
              		
            }
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getCaseSignificanceFilterAccess().getCASE_SIGNIFICANCE_ID_KEYWORDParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_42);
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
            // InternalEclParser.g:4431:3: ( (lv_caseSignificanceId_2_0= ruleExpressionConstraint ) )
            // InternalEclParser.g:4432:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            {
            // InternalEclParser.g:4432:4: (lv_caseSignificanceId_2_0= ruleExpressionConstraint )
            // InternalEclParser.g:4433:5: lv_caseSignificanceId_2_0= ruleExpressionConstraint
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
    // InternalEclParser.g:4454:1: entryRuleSnomedIdentifier returns [String current=null] : iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF ;
    public final String entryRuleSnomedIdentifier() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSnomedIdentifier = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4456:2: (iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF )
            // InternalEclParser.g:4457:2: iv_ruleSnomedIdentifier= ruleSnomedIdentifier EOF
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
    // InternalEclParser.g:4466:1: ruleSnomedIdentifier returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) ;
    public final AntlrDatatypeRuleToken ruleSnomedIdentifier() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DIGIT_NONZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_ZERO_2=null;
        Token this_DIGIT_NONZERO_3=null;
        Token this_ZERO_4=null;
        Token this_DIGIT_NONZERO_5=null;
        Token this_ZERO_6=null;
        Token this_DIGIT_NONZERO_7=null;
        Token this_ZERO_8=null;
        Token this_DIGIT_NONZERO_9=null;
        Token this_ZERO_10=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4473:2: ( (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ ) )
            // InternalEclParser.g:4474:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            {
            // InternalEclParser.g:4474:2: (this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+ )
            // InternalEclParser.g:4475:3: this_DIGIT_NONZERO_0= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO ) (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO ) (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO ) (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO ) (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            {
            this_DIGIT_NONZERO_0=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DIGIT_NONZERO_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DIGIT_NONZERO_0, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:4482:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO | this_ZERO_2= RULE_ZERO )
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==RULE_DIGIT_NONZERO) ) {
                alt51=1;
            }
            else if ( (LA51_0==RULE_ZERO) ) {
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
                    // InternalEclParser.g:4483:4: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4491:4: this_ZERO_2= RULE_ZERO
                    {
                    this_ZERO_2=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_2, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:4499:3: (this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO | this_ZERO_4= RULE_ZERO )
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==RULE_DIGIT_NONZERO) ) {
                alt52=1;
            }
            else if ( (LA52_0==RULE_ZERO) ) {
                alt52=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;
            }
            switch (alt52) {
                case 1 :
                    // InternalEclParser.g:4500:4: this_DIGIT_NONZERO_3= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_3=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_3);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_3, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4508:4: this_ZERO_4= RULE_ZERO
                    {
                    this_ZERO_4=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_4);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_4, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:4516:3: (this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO | this_ZERO_6= RULE_ZERO )
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==RULE_DIGIT_NONZERO) ) {
                alt53=1;
            }
            else if ( (LA53_0==RULE_ZERO) ) {
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
                    // InternalEclParser.g:4517:4: this_DIGIT_NONZERO_5= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_5=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_5);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_5, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4525:4: this_ZERO_6= RULE_ZERO
                    {
                    this_ZERO_6=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_6);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_6, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:4533:3: (this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO | this_ZERO_8= RULE_ZERO )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==RULE_DIGIT_NONZERO) ) {
                alt54=1;
            }
            else if ( (LA54_0==RULE_ZERO) ) {
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
                    // InternalEclParser.g:4534:4: this_DIGIT_NONZERO_7= RULE_DIGIT_NONZERO
                    {
                    this_DIGIT_NONZERO_7=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_7);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_7, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4542:4: this_ZERO_8= RULE_ZERO
                    {
                    this_ZERO_8=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_ZERO_8);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_ZERO_8, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1());
                      			
                    }

                    }
                    break;

            }

            // InternalEclParser.g:4550:3: (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+
            int cnt55=0;
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
            	    // InternalEclParser.g:4551:4: this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_9=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_9);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_9, grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:4559:4: this_ZERO_10= RULE_ZERO
            	    {
            	    this_ZERO_10=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_10);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_10, grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1());
            	      			
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


            }


            }

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
    // InternalEclParser.g:4574:1: entryRuleNonNegativeInteger returns [String current=null] : iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF ;
    public final String entryRuleNonNegativeInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4576:2: (iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF )
            // InternalEclParser.g:4577:2: iv_ruleNonNegativeInteger= ruleNonNegativeInteger EOF
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
    // InternalEclParser.g:4586:1: ruleNonNegativeInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ZERO_0=null;
        Token this_DIGIT_NONZERO_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4593:2: ( (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ) )
            // InternalEclParser.g:4594:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            {
            // InternalEclParser.g:4594:2: (this_ZERO_0= RULE_ZERO | (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==RULE_ZERO) ) {
                alt57=1;
            }
            else if ( (LA57_0==RULE_DIGIT_NONZERO) ) {
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
                    // InternalEclParser.g:4595:3: this_ZERO_0= RULE_ZERO
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
                    // InternalEclParser.g:4603:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    {
                    // InternalEclParser.g:4603:3: (this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
                    // InternalEclParser.g:4604:4: this_DIGIT_NONZERO_1= RULE_DIGIT_NONZERO (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    {
                    this_DIGIT_NONZERO_1=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_DIGIT_NONZERO_1);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_DIGIT_NONZERO_1, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0());
                      			
                    }
                    // InternalEclParser.g:4611:4: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
                    loop56:
                    do {
                        int alt56=3;
                        int LA56_0 = input.LA(1);

                        if ( (LA56_0==RULE_DIGIT_NONZERO) ) {
                            alt56=1;
                        }
                        else if ( (LA56_0==RULE_ZERO) ) {
                            alt56=2;
                        }


                        switch (alt56) {
                    	case 1 :
                    	    // InternalEclParser.g:4612:5: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
                    	    {
                    	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_DIGIT_NONZERO_2);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0());
                    	      				
                    	    }

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclParser.g:4620:5: this_ZERO_3= RULE_ZERO
                    	    {
                    	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					current.merge(this_ZERO_3);
                    	      				
                    	    }
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1());
                    	      				
                    	    }

                    	    }
                    	    break;

                    	default :
                    	    break loop56;
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
    // InternalEclParser.g:4636:1: entryRuleMaxValue returns [String current=null] : iv_ruleMaxValue= ruleMaxValue EOF ;
    public final String entryRuleMaxValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMaxValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4638:2: (iv_ruleMaxValue= ruleMaxValue EOF )
            // InternalEclParser.g:4639:2: iv_ruleMaxValue= ruleMaxValue EOF
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
    // InternalEclParser.g:4648:1: ruleMaxValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) ;
    public final AntlrDatatypeRuleToken ruleMaxValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_WILDCARD_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4655:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD ) )
            // InternalEclParser.g:4656:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            {
            // InternalEclParser.g:4656:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger | this_WILDCARD_1= RULE_WILDCARD )
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( ((LA58_0>=RULE_ZERO && LA58_0<=RULE_DIGIT_NONZERO)) ) {
                alt58=1;
            }
            else if ( (LA58_0==RULE_WILDCARD) ) {
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
                    // InternalEclParser.g:4657:3: this_NonNegativeInteger_0= ruleNonNegativeInteger
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
                    // InternalEclParser.g:4668:3: this_WILDCARD_1= RULE_WILDCARD
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
    // InternalEclParser.g:4682:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4684:2: (iv_ruleInteger= ruleInteger EOF )
            // InternalEclParser.g:4685:2: iv_ruleInteger= ruleInteger EOF
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
    // InternalEclParser.g:4694:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4701:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger ) )
            // InternalEclParser.g:4702:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            {
            // InternalEclParser.g:4702:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger )
            // InternalEclParser.g:4703:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeInteger_2= ruleNonNegativeInteger
            {
            // InternalEclParser.g:4703:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
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
                    // InternalEclParser.g:4704:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4712:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_20); if (state.failed) return current;
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
    // InternalEclParser.g:4737:1: entryRuleDecimal returns [String current=null] : iv_ruleDecimal= ruleDecimal EOF ;
    public final String entryRuleDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4739:2: (iv_ruleDecimal= ruleDecimal EOF )
            // InternalEclParser.g:4740:2: iv_ruleDecimal= ruleDecimal EOF
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
    // InternalEclParser.g:4749:1: ruleDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) ;
    public final AntlrDatatypeRuleToken ruleDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_PLUS_0=null;
        Token this_DASH_1=null;
        AntlrDatatypeRuleToken this_NonNegativeDecimal_2 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4756:2: ( ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal ) )
            // InternalEclParser.g:4757:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            {
            // InternalEclParser.g:4757:2: ( (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal )
            // InternalEclParser.g:4758:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )? this_NonNegativeDecimal_2= ruleNonNegativeDecimal
            {
            // InternalEclParser.g:4758:3: (this_PLUS_0= RULE_PLUS | this_DASH_1= RULE_DASH )?
            int alt60=3;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_PLUS) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_DASH) ) {
                alt60=2;
            }
            switch (alt60) {
                case 1 :
                    // InternalEclParser.g:4759:4: this_PLUS_0= RULE_PLUS
                    {
                    this_PLUS_0=(Token)match(input,RULE_PLUS,FollowSets000.FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_PLUS_0);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_PLUS_0, grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4767:4: this_DASH_1= RULE_DASH
                    {
                    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_27); if (state.failed) return current;
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
    // InternalEclParser.g:4792:1: entryRuleNonNegativeDecimal returns [String current=null] : iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF ;
    public final String entryRuleNonNegativeDecimal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNonNegativeDecimal = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4794:2: (iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF )
            // InternalEclParser.g:4795:2: iv_ruleNonNegativeDecimal= ruleNonNegativeDecimal EOF
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
    // InternalEclParser.g:4804:1: ruleNonNegativeDecimal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) ;
    public final AntlrDatatypeRuleToken ruleNonNegativeDecimal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_DOT_1=null;
        Token this_DIGIT_NONZERO_2=null;
        Token this_ZERO_3=null;
        AntlrDatatypeRuleToken this_NonNegativeInteger_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4811:2: ( (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* ) )
            // InternalEclParser.g:4812:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            {
            // InternalEclParser.g:4812:2: (this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )* )
            // InternalEclParser.g:4813:3: this_NonNegativeInteger_0= ruleNonNegativeInteger this_DOT_1= RULE_DOT (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0());
              		
            }
            pushFollow(FollowSets000.FOLLOW_40);
            this_NonNegativeInteger_0=ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_NonNegativeInteger_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            this_DOT_1=(Token)match(input,RULE_DOT,FollowSets000.FOLLOW_44); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_DOT_1);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_DOT_1, grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1());
              		
            }
            // InternalEclParser.g:4830:3: (this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO | this_ZERO_3= RULE_ZERO )*
            loop61:
            do {
                int alt61=3;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==RULE_DIGIT_NONZERO) ) {
                    alt61=1;
                }
                else if ( (LA61_0==RULE_ZERO) ) {
                    alt61=2;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalEclParser.g:4831:4: this_DIGIT_NONZERO_2= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_2=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_2, grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:4839:4: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_44); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_3, grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop61;
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
    // InternalEclParser.g:4854:1: entryRuleBoolean returns [String current=null] : iv_ruleBoolean= ruleBoolean EOF ;
    public final String entryRuleBoolean() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleBoolean = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4856:2: (iv_ruleBoolean= ruleBoolean EOF )
            // InternalEclParser.g:4857:2: iv_ruleBoolean= ruleBoolean EOF
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
    // InternalEclParser.g:4866:1: ruleBoolean returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= True | kw= False ) ;
    public final AntlrDatatypeRuleToken ruleBoolean() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4873:2: ( (kw= True | kw= False ) )
            // InternalEclParser.g:4874:2: (kw= True | kw= False )
            {
            // InternalEclParser.g:4874:2: (kw= True | kw= False )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==True) ) {
                alt62=1;
            }
            else if ( (LA62_0==False) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalEclParser.g:4875:3: kw= True
                    {
                    kw=(Token)match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getBooleanAccess().getTrueKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:4881:3: kw= False
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
    // InternalEclParser.g:4893:1: entryRuleDialectAliasValue returns [String current=null] : iv_ruleDialectAliasValue= ruleDialectAliasValue EOF ;
    public final String entryRuleDialectAliasValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDialectAliasValue = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4895:2: (iv_ruleDialectAliasValue= ruleDialectAliasValue EOF )
            // InternalEclParser.g:4896:2: iv_ruleDialectAliasValue= ruleDialectAliasValue EOF
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
    // InternalEclParser.g:4905:1: ruleDialectAliasValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* ) ;
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
            // InternalEclParser.g:4912:2: ( (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* ) )
            // InternalEclParser.g:4913:2: (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* )
            {
            // InternalEclParser.g:4913:2: (this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )* )
            // InternalEclParser.g:4914:3: this_ALPHA_0= RULE_ALPHA (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )*
            {
            this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_45); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ALPHA_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ALPHA_0, grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_0());
              		
            }
            // InternalEclParser.g:4921:3: (this_DASH_1= RULE_DASH | this_ALPHA_2= RULE_ALPHA | this_ZERO_3= RULE_ZERO | this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO )*
            loop63:
            do {
                int alt63=5;
                switch ( input.LA(1) ) {
                case RULE_ALPHA:
                    {
                    int LA63_2 = input.LA(2);

                    if ( (synpred93_InternalEclParser()) ) {
                        alt63=2;
                    }


                    }
                    break;
                case RULE_DASH:
                    {
                    alt63=1;
                    }
                    break;
                case RULE_ZERO:
                    {
                    alt63=3;
                    }
                    break;
                case RULE_DIGIT_NONZERO:
                    {
                    alt63=4;
                    }
                    break;

                }

                switch (alt63) {
            	case 1 :
            	    // InternalEclParser.g:4922:4: this_DASH_1= RULE_DASH
            	    {
            	    this_DASH_1=(Token)match(input,RULE_DASH,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DASH_1);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DASH_1, grammarAccess.getDialectAliasValueAccess().getDASHTerminalRuleCall_1_0());
            	      			
            	    }

            	    }
            	    break;
            	case 2 :
            	    // InternalEclParser.g:4930:4: this_ALPHA_2= RULE_ALPHA
            	    {
            	    this_ALPHA_2=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ALPHA_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ALPHA_2, grammarAccess.getDialectAliasValueAccess().getALPHATerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;
            	case 3 :
            	    // InternalEclParser.g:4938:4: this_ZERO_3= RULE_ZERO
            	    {
            	    this_ZERO_3=(Token)match(input,RULE_ZERO,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ZERO_3);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ZERO_3, grammarAccess.getDialectAliasValueAccess().getZEROTerminalRuleCall_1_2());
            	      			
            	    }

            	    }
            	    break;
            	case 4 :
            	    // InternalEclParser.g:4946:4: this_DIGIT_NONZERO_4= RULE_DIGIT_NONZERO
            	    {
            	    this_DIGIT_NONZERO_4=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_45); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_DIGIT_NONZERO_4);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_DIGIT_NONZERO_4, grammarAccess.getDialectAliasValueAccess().getDIGIT_NONZEROTerminalRuleCall_1_3());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop63;
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
    // InternalEclParser.g:4961:1: entryRuleAlphabetical returns [String current=null] : iv_ruleAlphabetical= ruleAlphabetical EOF ;
    public final String entryRuleAlphabetical() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAlphabetical = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4963:2: (iv_ruleAlphabetical= ruleAlphabetical EOF )
            // InternalEclParser.g:4964:2: iv_ruleAlphabetical= ruleAlphabetical EOF
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
    // InternalEclParser.g:4973:1: ruleAlphabetical returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ALPHA_0= RULE_ALPHA )+ ;
    public final AntlrDatatypeRuleToken ruleAlphabetical() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ALPHA_0=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:4980:2: ( (this_ALPHA_0= RULE_ALPHA )+ )
            // InternalEclParser.g:4981:2: (this_ALPHA_0= RULE_ALPHA )+
            {
            // InternalEclParser.g:4981:2: (this_ALPHA_0= RULE_ALPHA )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==RULE_ALPHA) ) {
                    int LA64_2 = input.LA(2);

                    if ( (synpred96_InternalEclParser()) ) {
                        alt64=1;
                    }


                }


                switch (alt64) {
            	case 1 :
            	    // InternalEclParser.g:4982:3: this_ALPHA_0= RULE_ALPHA
            	    {
            	    this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_46); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      			current.merge(this_ALPHA_0);
            	      		
            	    }
            	    if ( state.backtracking==0 ) {

            	      			newLeafNode(this_ALPHA_0, grammarAccess.getAlphabeticalAccess().getALPHATerminalRuleCall());
            	      		
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
    // $ANTLR end "ruleAlphabetical"


    // $ANTLR start "entryRuleCONJUNCTION"
    // InternalEclParser.g:4996:1: entryRuleCONJUNCTION returns [String current=null] : iv_ruleCONJUNCTION= ruleCONJUNCTION EOF ;
    public final String entryRuleCONJUNCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCONJUNCTION = null;


        try {
            // InternalEclParser.g:4996:51: (iv_ruleCONJUNCTION= ruleCONJUNCTION EOF )
            // InternalEclParser.g:4997:2: iv_ruleCONJUNCTION= ruleCONJUNCTION EOF
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
    // InternalEclParser.g:5003:1: ruleCONJUNCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= And ;
    public final AntlrDatatypeRuleToken ruleCONJUNCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5009:2: (kw= And )
            // InternalEclParser.g:5010:2: kw= And
            {
            kw=(Token)match(input,And,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getCONJUNCTIONAccess().getAndKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalEclParser.g:5018:1: entryRuleDISJUNCTION returns [String current=null] : iv_ruleDISJUNCTION= ruleDISJUNCTION EOF ;
    public final String entryRuleDISJUNCTION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDISJUNCTION = null;


        try {
            // InternalEclParser.g:5018:51: (iv_ruleDISJUNCTION= ruleDISJUNCTION EOF )
            // InternalEclParser.g:5019:2: iv_ruleDISJUNCTION= ruleDISJUNCTION EOF
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
    // InternalEclParser.g:5025:1: ruleDISJUNCTION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Or ;
    public final AntlrDatatypeRuleToken ruleDISJUNCTION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5031:2: (kw= Or )
            // InternalEclParser.g:5032:2: kw= Or
            {
            kw=(Token)match(input,Or,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getDISJUNCTIONAccess().getOrKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalEclParser.g:5040:1: entryRuleEXCLUSION returns [String current=null] : iv_ruleEXCLUSION= ruleEXCLUSION EOF ;
    public final String entryRuleEXCLUSION() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEXCLUSION = null;


        try {
            // InternalEclParser.g:5040:49: (iv_ruleEXCLUSION= ruleEXCLUSION EOF )
            // InternalEclParser.g:5041:2: iv_ruleEXCLUSION= ruleEXCLUSION EOF
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
    // InternalEclParser.g:5047:1: ruleEXCLUSION returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Minus ;
    public final AntlrDatatypeRuleToken ruleEXCLUSION() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5053:2: (kw= Minus )
            // InternalEclParser.g:5054:2: kw= Minus
            {
            kw=(Token)match(input,Minus,FollowSets000.FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getEXCLUSIONAccess().getMinusKeyword());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
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
    // InternalEclParser.g:5062:1: entryRuleTERM_KEYWORD returns [String current=null] : iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF ;
    public final String entryRuleTERM_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTERM_KEYWORD = null;


        try {
            // InternalEclParser.g:5062:52: (iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF )
            // InternalEclParser.g:5063:2: iv_ruleTERM_KEYWORD= ruleTERM_KEYWORD EOF
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
    // InternalEclParser.g:5069:1: ruleTERM_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Term ;
    public final AntlrDatatypeRuleToken ruleTERM_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5075:2: (kw= Term )
            // InternalEclParser.g:5076:2: kw= Term
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
    // InternalEclParser.g:5084:1: entryRuleLANGUAGE_KEYWORD returns [String current=null] : iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF ;
    public final String entryRuleLANGUAGE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLANGUAGE_KEYWORD = null;


        try {
            // InternalEclParser.g:5084:56: (iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF )
            // InternalEclParser.g:5085:2: iv_ruleLANGUAGE_KEYWORD= ruleLANGUAGE_KEYWORD EOF
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
    // InternalEclParser.g:5091:1: ruleLANGUAGE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Language ;
    public final AntlrDatatypeRuleToken ruleLANGUAGE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5097:2: (kw= Language )
            // InternalEclParser.g:5098:2: kw= Language
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
    // InternalEclParser.g:5106:1: entryRuleTYPEID_KEYWORD returns [String current=null] : iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF ;
    public final String entryRuleTYPEID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPEID_KEYWORD = null;


        try {
            // InternalEclParser.g:5106:54: (iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF )
            // InternalEclParser.g:5107:2: iv_ruleTYPEID_KEYWORD= ruleTYPEID_KEYWORD EOF
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
    // InternalEclParser.g:5113:1: ruleTYPEID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= TypeId ;
    public final AntlrDatatypeRuleToken ruleTYPEID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5119:2: (kw= TypeId )
            // InternalEclParser.g:5120:2: kw= TypeId
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
    // InternalEclParser.g:5128:1: entryRuleTYPE_KEYWORD returns [String current=null] : iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF ;
    public final String entryRuleTYPE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleTYPE_KEYWORD = null;


        try {
            // InternalEclParser.g:5128:52: (iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF )
            // InternalEclParser.g:5129:2: iv_ruleTYPE_KEYWORD= ruleTYPE_KEYWORD EOF
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
    // InternalEclParser.g:5135:1: ruleTYPE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Type ;
    public final AntlrDatatypeRuleToken ruleTYPE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5141:2: (kw= Type )
            // InternalEclParser.g:5142:2: kw= Type
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
    // InternalEclParser.g:5150:1: entryRuleDIALECTID_KEYWORD returns [String current=null] : iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF ;
    public final String entryRuleDIALECTID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIALECTID_KEYWORD = null;


        try {
            // InternalEclParser.g:5150:57: (iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF )
            // InternalEclParser.g:5151:2: iv_ruleDIALECTID_KEYWORD= ruleDIALECTID_KEYWORD EOF
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
    // InternalEclParser.g:5157:1: ruleDIALECTID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= DialectId ;
    public final AntlrDatatypeRuleToken ruleDIALECTID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5163:2: (kw= DialectId )
            // InternalEclParser.g:5164:2: kw= DialectId
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
    // InternalEclParser.g:5172:1: entryRuleDIALECT_KEYWORD returns [String current=null] : iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF ;
    public final String entryRuleDIALECT_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDIALECT_KEYWORD = null;


        try {
            // InternalEclParser.g:5172:55: (iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF )
            // InternalEclParser.g:5173:2: iv_ruleDIALECT_KEYWORD= ruleDIALECT_KEYWORD EOF
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
    // InternalEclParser.g:5179:1: ruleDIALECT_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Dialect ;
    public final AntlrDatatypeRuleToken ruleDIALECT_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5185:2: (kw= Dialect )
            // InternalEclParser.g:5186:2: kw= Dialect
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
    // InternalEclParser.g:5194:1: entryRuleACTIVE_KEYWORD returns [String current=null] : iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF ;
    public final String entryRuleACTIVE_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleACTIVE_KEYWORD = null;


        try {
            // InternalEclParser.g:5194:54: (iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF )
            // InternalEclParser.g:5195:2: iv_ruleACTIVE_KEYWORD= ruleACTIVE_KEYWORD EOF
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
    // InternalEclParser.g:5201:1: ruleACTIVE_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= Active ;
    public final AntlrDatatypeRuleToken ruleACTIVE_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5207:2: (kw= Active )
            // InternalEclParser.g:5208:2: kw= Active
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
    // InternalEclParser.g:5216:1: entryRuleMODULEID_KEYWORD returns [String current=null] : iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF ;
    public final String entryRuleMODULEID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleMODULEID_KEYWORD = null;


        try {
            // InternalEclParser.g:5216:56: (iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF )
            // InternalEclParser.g:5217:2: iv_ruleMODULEID_KEYWORD= ruleMODULEID_KEYWORD EOF
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
    // InternalEclParser.g:5223:1: ruleMODULEID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= ModuleId ;
    public final AntlrDatatypeRuleToken ruleMODULEID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5229:2: (kw= ModuleId )
            // InternalEclParser.g:5230:2: kw= ModuleId
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


    // $ANTLR start "entryRulePREFERRED_IN_KEYWORD"
    // InternalEclParser.g:5238:1: entryRulePREFERRED_IN_KEYWORD returns [String current=null] : iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF ;
    public final String entryRulePREFERRED_IN_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePREFERRED_IN_KEYWORD = null;


        try {
            // InternalEclParser.g:5238:60: (iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF )
            // InternalEclParser.g:5239:2: iv_rulePREFERRED_IN_KEYWORD= rulePREFERRED_IN_KEYWORD EOF
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
    // InternalEclParser.g:5245:1: rulePREFERRED_IN_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= PreferredIn ;
    public final AntlrDatatypeRuleToken rulePREFERRED_IN_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5251:2: (kw= PreferredIn )
            // InternalEclParser.g:5252:2: kw= PreferredIn
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
    // InternalEclParser.g:5260:1: entryRuleACCEPTABLE_IN_KEYWORD returns [String current=null] : iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF ;
    public final String entryRuleACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleACCEPTABLE_IN_KEYWORD = null;


        try {
            // InternalEclParser.g:5260:61: (iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF )
            // InternalEclParser.g:5261:2: iv_ruleACCEPTABLE_IN_KEYWORD= ruleACCEPTABLE_IN_KEYWORD EOF
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
    // InternalEclParser.g:5267:1: ruleACCEPTABLE_IN_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= AcceptableIn ;
    public final AntlrDatatypeRuleToken ruleACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5273:2: (kw= AcceptableIn )
            // InternalEclParser.g:5274:2: kw= AcceptableIn
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
    // InternalEclParser.g:5282:1: entryRuleLANGUAGE_REFSET_ID_KEYWORD returns [String current=null] : iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF ;
    public final String entryRuleLANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLANGUAGE_REFSET_ID_KEYWORD = null;


        try {
            // InternalEclParser.g:5282:66: (iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF )
            // InternalEclParser.g:5283:2: iv_ruleLANGUAGE_REFSET_ID_KEYWORD= ruleLANGUAGE_REFSET_ID_KEYWORD EOF
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
    // InternalEclParser.g:5289:1: ruleLANGUAGE_REFSET_ID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= LanguageRefSetId ;
    public final AntlrDatatypeRuleToken ruleLANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5295:2: (kw= LanguageRefSetId )
            // InternalEclParser.g:5296:2: kw= LanguageRefSetId
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
    // InternalEclParser.g:5304:1: entryRuleCASE_SIGNIFICANCE_ID_KEYWORD returns [String current=null] : iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF ;
    public final String entryRuleCASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD = null;


        try {
            // InternalEclParser.g:5304:68: (iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF )
            // InternalEclParser.g:5305:2: iv_ruleCASE_SIGNIFICANCE_ID_KEYWORD= ruleCASE_SIGNIFICANCE_ID_KEYWORD EOF
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
    // InternalEclParser.g:5311:1: ruleCASE_SIGNIFICANCE_ID_KEYWORD returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= CaseSignificanceId ;
    public final AntlrDatatypeRuleToken ruleCASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5317:2: (kw= CaseSignificanceId )
            // InternalEclParser.g:5318:2: kw= CaseSignificanceId
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
    // InternalEclParser.g:5326:1: entryRuleLEXICAL_SEARCH_TYPE returns [String current=null] : iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF ;
    public final String entryRuleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleLEXICAL_SEARCH_TYPE = null;


        try {
            // InternalEclParser.g:5326:59: (iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF )
            // InternalEclParser.g:5327:2: iv_ruleLEXICAL_SEARCH_TYPE= ruleLEXICAL_SEARCH_TYPE EOF
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
    // InternalEclParser.g:5333:1: ruleLEXICAL_SEARCH_TYPE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Match | kw= Wild | kw= Regex | kw= Exact ) ;
    public final AntlrDatatypeRuleToken ruleLEXICAL_SEARCH_TYPE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5339:2: ( (kw= Match | kw= Wild | kw= Regex | kw= Exact ) )
            // InternalEclParser.g:5340:2: (kw= Match | kw= Wild | kw= Regex | kw= Exact )
            {
            // InternalEclParser.g:5340:2: (kw= Match | kw= Wild | kw= Regex | kw= Exact )
            int alt65=4;
            switch ( input.LA(1) ) {
            case Match:
                {
                alt65=1;
                }
                break;
            case Wild:
                {
                alt65=2;
                }
                break;
            case Regex:
                {
                alt65=3;
                }
                break;
            case Exact:
                {
                alt65=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // InternalEclParser.g:5341:3: kw= Match
                    {
                    kw=(Token)match(input,Match,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getMatchKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:5347:3: kw= Wild
                    {
                    kw=(Token)match(input,Wild,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getWildKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEclParser.g:5353:3: kw= Regex
                    {
                    kw=(Token)match(input,Regex,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getLEXICAL_SEARCH_TYPEAccess().getRegexKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEclParser.g:5359:3: kw= Exact
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
    // InternalEclParser.g:5368:1: entryRuleDOMAIN returns [String current=null] : iv_ruleDOMAIN= ruleDOMAIN EOF ;
    public final String entryRuleDOMAIN() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOMAIN = null;


        try {
            // InternalEclParser.g:5368:46: (iv_ruleDOMAIN= ruleDOMAIN EOF )
            // InternalEclParser.g:5369:2: iv_ruleDOMAIN= ruleDOMAIN EOF
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
    // InternalEclParser.g:5375:1: ruleDOMAIN returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Concept | kw= Description ) ;
    public final AntlrDatatypeRuleToken ruleDOMAIN() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEclParser.g:5381:2: ( (kw= Concept | kw= Description ) )
            // InternalEclParser.g:5382:2: (kw= Concept | kw= Description )
            {
            // InternalEclParser.g:5382:2: (kw= Concept | kw= Description )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==Concept) ) {
                alt66=1;
            }
            else if ( (LA66_0==Description) ) {
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
                    // InternalEclParser.g:5383:3: kw= Concept
                    {
                    kw=(Token)match(input,Concept,FollowSets000.FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getDOMAINAccess().getConceptKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEclParser.g:5389:3: kw= Description
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
    // InternalEclParser.g:5398:1: entryRuleNON_NUMERIC_OPERATOR returns [String current=null] : iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF ;
    public final String entryRuleNON_NUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNON_NUMERIC_OPERATOR = null;


        try {
            // InternalEclParser.g:5398:60: (iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF )
            // InternalEclParser.g:5399:2: iv_ruleNON_NUMERIC_OPERATOR= ruleNON_NUMERIC_OPERATOR EOF
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
    // InternalEclParser.g:5405:1: ruleNON_NUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) ;
    public final AntlrDatatypeRuleToken ruleNON_NUMERIC_OPERATOR() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_EQUAL_0=null;
        Token this_NOT_EQUAL_1=null;


        	enterRule();

        try {
            // InternalEclParser.g:5411:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5412:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5412:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_EQUAL) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_NOT_EQUAL) ) {
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
                    // InternalEclParser.g:5413:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEclParser.g:5421:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
    // InternalEclParser.g:5432:1: entryRuleNUMERIC_OPERATOR returns [String current=null] : iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF ;
    public final String entryRuleNUMERIC_OPERATOR() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNUMERIC_OPERATOR = null;


        try {
            // InternalEclParser.g:5432:56: (iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF )
            // InternalEclParser.g:5433:2: iv_ruleNUMERIC_OPERATOR= ruleNUMERIC_OPERATOR EOF
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
    // InternalEclParser.g:5439:1: ruleNUMERIC_OPERATOR returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) ;
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
            // InternalEclParser.g:5445:2: ( (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE ) )
            // InternalEclParser.g:5446:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            {
            // InternalEclParser.g:5446:2: (this_EQUAL_0= RULE_EQUAL | this_NOT_EQUAL_1= RULE_NOT_EQUAL | this_GT_2= RULE_GT | this_LT_3= RULE_LT | this_GTE_4= RULE_GTE | this_LTE_5= RULE_LTE )
            int alt68=6;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                alt68=1;
                }
                break;
            case RULE_NOT_EQUAL:
                {
                alt68=2;
                }
                break;
            case RULE_GT:
                {
                alt68=3;
                }
                break;
            case RULE_LT:
                {
                alt68=4;
                }
                break;
            case RULE_GTE:
                {
                alt68=5;
                }
                break;
            case RULE_LTE:
                {
                alt68=6;
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
                    // InternalEclParser.g:5447:3: this_EQUAL_0= RULE_EQUAL
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
                    // InternalEclParser.g:5455:3: this_NOT_EQUAL_1= RULE_NOT_EQUAL
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
                    // InternalEclParser.g:5463:3: this_GT_2= RULE_GT
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
                    // InternalEclParser.g:5471:3: this_LT_3= RULE_LT
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
                    // InternalEclParser.g:5479:3: this_GTE_4= RULE_GTE
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
                    // InternalEclParser.g:5487:3: this_LTE_5= RULE_LTE
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
        int alt69=2;
        int LA69_0 = input.LA(1);

        if ( (LA69_0==And) ) {
            alt69=1;
        }
        else if ( (LA69_0==RULE_COMMA) ) {
            alt69=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 69, 0, input);

            throw nvae;
        }
        switch (alt69) {
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

    // $ANTLR start synpred5_InternalEclParser
    public final void synpred5_InternalEclParser_fragment() throws RecognitionException {   
        EObject lv_right_3_0 = null;


        // InternalEclParser.g:327:4: ( () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) ) )
        // InternalEclParser.g:327:4: () ruleEXCLUSION ( (lv_right_3_0= ruleRefinedExpressionConstraint ) )
        {
        // InternalEclParser.g:327:4: ()
        // InternalEclParser.g:328:5: 
        {
        if ( state.backtracking==0 ) {

          					/* */
          				
        }

        }

        pushFollow(FollowSets000.FOLLOW_4);
        ruleEXCLUSION();

        state._fsp--;
        if (state.failed) return ;
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
        if (state.failed) return ;

        }


        }


        }
    }
    // $ANTLR end synpred5_InternalEclParser

    // $ANTLR start synpred24_InternalEclParser
    public final void synpred24_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1326:4: ( Or )
        // InternalEclParser.g:1326:5: Or
        {
        match(input,Or,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred24_InternalEclParser

    // $ANTLR start synpred26_InternalEclParser
    public final void synpred26_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1400:4: ( And | RULE_COMMA )
        // InternalEclParser.g:
        {
        if ( input.LA(1)==And||input.LA(1)==RULE_COMMA ) {
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


        // InternalEclParser.g:1469:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEclParser.g:1469:3: this_AttributeConstraint_0= ruleAttributeConstraint
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


        // InternalEclParser.g:1481:3: (this_EclAttributeGroup_1= ruleEclAttributeGroup )
        // InternalEclParser.g:1481:3: this_EclAttributeGroup_1= ruleEclAttributeGroup
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


        // InternalEclParser.g:1811:3: (this_AttributeConstraint_0= ruleAttributeConstraint )
        // InternalEclParser.g:1811:3: this_AttributeConstraint_0= ruleAttributeConstraint
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
        Token this_DIGIT_NONZERO_9=null;

        // InternalEclParser.g:4551:4: (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO )
        // InternalEclParser.g:4551:4: this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO
        {
        this_DIGIT_NONZERO_9=(Token)match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred79_InternalEclParser

    // $ANTLR start synpred93_InternalEclParser
    public final void synpred93_InternalEclParser_fragment() throws RecognitionException {   
        Token this_ALPHA_2=null;

        // InternalEclParser.g:4930:4: (this_ALPHA_2= RULE_ALPHA )
        // InternalEclParser.g:4930:4: this_ALPHA_2= RULE_ALPHA
        {
        this_ALPHA_2=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred93_InternalEclParser

    // $ANTLR start synpred96_InternalEclParser
    public final void synpred96_InternalEclParser_fragment() throws RecognitionException {   
        Token this_ALPHA_0=null;

        // InternalEclParser.g:4982:3: (this_ALPHA_0= RULE_ALPHA )
        // InternalEclParser.g:4982:3: this_ALPHA_0= RULE_ALPHA
        {
        this_ALPHA_0=(Token)match(input,RULE_ALPHA,FollowSets000.FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred96_InternalEclParser

    // Delegated rules

    public final boolean synpred5_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
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


    protected DFA16 dfa16 = new DFA16(this);
    protected DFA21 dfa21 = new DFA21(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA55 dfa55 = new DFA55(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\34\1\0\14\uffff\1\0\3\uffff";
    static final String dfa_3s = "\1\72\1\0\14\uffff\1\0\3\uffff";
    static final String dfa_4s = "\2\uffff\1\1\15\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\14\uffff\1\1\3\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\3\uffff\1\2\1\uffff\1\20\1\uffff\1\16\1\uffff\1\1\3\uffff\1\2\1\uffff\1\2\2\uffff\10\2\3\uffff\1\2",
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
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1468:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_EclAttributeGroup_1= ruleEclAttributeGroup | this_NestedRefinement_2= ruleNestedRefinement )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_1 = input.LA(1);

                         
                        int index16_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEclParser()) ) {s = 2;}

                        else if ( (synpred29_InternalEclParser()) ) {s = 16;}

                         
                        input.seek(index16_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA16_14 = input.LA(1);

                         
                        int index16_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred28_InternalEclParser()) ) {s = 2;}

                        else if ( (true) ) {s = 17;}

                         
                        input.seek(index16_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\21\uffff";
    static final String dfa_8s = "\1\34\15\uffff\1\0\2\uffff";
    static final String dfa_9s = "\1\72\15\uffff\1\0\2\uffff";
    static final String dfa_10s = "\1\uffff\1\1\16\uffff\1\2";
    static final String dfa_11s = "\16\uffff\1\0\2\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\3\uffff\1\1\3\uffff\1\16\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\10\1\3\uffff\1\1",
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

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final char[] dfa_8 = DFA.unpackEncodedStringToUnsignedChars(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final short[] dfa_10 = DFA.unpackEncodedString(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[][] dfa_12 = unpackEncodedStringArray(dfa_12s);

    class DFA21 extends DFA {

        public DFA21(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 21;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1810:2: (this_AttributeConstraint_0= ruleAttributeConstraint | this_NestedAttributeSet_1= ruleNestedAttributeSet )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA21_14 = input.LA(1);

                         
                        int index21_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred34_InternalEclParser()) ) {s = 1;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index21_14);
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
    static final String dfa_13s = "\14\uffff\2\16\2\uffff\2\16";
    static final String dfa_14s = "\1\55\2\21\4\71\1\uffff\1\37\1\uffff\2\37\2\23\2\uffff\2\23";
    static final String dfa_15s = "\1\70\2\100\4\71\1\uffff\1\51\1\uffff\2\40\2\73\2\uffff\2\73";
    static final String dfa_16s = "\7\uffff\1\2\1\uffff\1\1\4\uffff\1\3\1\4\2\uffff";
    static final String dfa_17s = "\22\uffff}>";
    static final String[] dfa_18s = {
            "\1\1\1\2\1\4\1\3\6\uffff\1\5\1\6",
            "\1\11\4\uffff\1\11\42\uffff\1\10\6\uffff\1\7",
            "\1\11\4\uffff\1\11\42\uffff\1\10\6\uffff\1\7",
            "\1\10",
            "\1\10",
            "\1\10",
            "\1\10",
            "",
            "\1\14\1\15\7\uffff\1\12\1\13",
            "",
            "\1\14\1\15",
            "\1\14\1\15",
            "\1\16\5\uffff\2\16\3\uffff\1\16\4\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "\1\16\5\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "",
            "",
            "\1\16\5\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16",
            "\1\16\5\uffff\2\16\3\uffff\1\16\1\21\1\20\2\uffff\1\16\1\uffff\1\16\5\uffff\1\17\17\uffff\1\16"
    };
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final char[] dfa_14 = DFA.unpackEncodedStringToUnsignedChars(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[][] dfa_18 = unpackEncodedStringArray(dfa_18s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_13;
            this.min = dfa_14;
            this.max = dfa_15;
            this.accept = dfa_16;
            this.special = dfa_17;
            this.transition = dfa_18;
        }
        public String getDescription() {
            return "2160:2: (this_BooleanValueComparison_0= ruleBooleanValueComparison | this_StringValueComparison_1= ruleStringValueComparison | this_IntegerValueComparison_2= ruleIntegerValueComparison | this_DecimalValueComparison_3= ruleDecimalValueComparison )";
        }
    }
    static final String dfa_19s = "\17\uffff";
    static final String dfa_20s = "\1\4\4\uffff\2\53\7\uffff\1\13";
    static final String dfa_21s = "\1\44\4\uffff\2\53\7\uffff\1\16";
    static final String dfa_22s = "\1\uffff\1\1\1\2\1\3\1\4\2\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\uffff";
    static final String dfa_23s = "\17\uffff}>";
    static final String[] dfa_24s = {
            "\1\14\1\12\1\11\1\6\1\10\1\4\1\2\1\13\1\5\1\4\1\7\1\3\5\uffff\1\1\1\uffff\1\3\14\uffff\1\15",
            "",
            "",
            "",
            "",
            "\1\16",
            "\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\13\2\uffff\1\7"
    };

    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final char[] dfa_20 = DFA.unpackEncodedStringToUnsignedChars(dfa_20s);
    static final char[] dfa_21 = DFA.unpackEncodedStringToUnsignedChars(dfa_21s);
    static final short[] dfa_22 = DFA.unpackEncodedString(dfa_22s);
    static final short[] dfa_23 = DFA.unpackEncodedString(dfa_23s);
    static final short[][] dfa_24 = unpackEncodedStringArray(dfa_24s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_19;
            this.eof = dfa_19;
            this.min = dfa_20;
            this.max = dfa_21;
            this.accept = dfa_22;
            this.special = dfa_23;
            this.transition = dfa_24;
        }
        public String getDescription() {
            return "2839:2: (this_TermFilter_0= ruleTermFilter | this_LanguageCodeFilter_1= ruleLanguageCodeFilter | this_TypeFilter_2= ruleTypeFilter | this_DialectFilter_3= ruleDialectFilter | this_ActiveFilter_4= ruleActiveFilter | this_PreferredInFilter_5= rulePreferredInFilter | this_AcceptableInFilter_6= ruleAcceptableInFilter | this_LanguageRefSetFilter_7= ruleLanguageRefSetFilter | this_ModuleFilter_8= ruleModuleFilter | this_CaseSignificanceFilter_9= ruleCaseSignificanceFilter | this_NestedFilter_10= ruleNestedFilter )";
        }
    }
    static final String dfa_25s = "\43\uffff";
    static final String dfa_26s = "\1\1\1\uffff\1\6\1\uffff\2\6\1\uffff\14\6\20\uffff";
    static final String dfa_27s = "\1\23\1\uffff\1\23\1\uffff\2\23\1\uffff\14\23\20\0";
    static final String dfa_28s = "\1\73\1\uffff\1\73\1\uffff\2\73\1\uffff\14\73\20\0";
    static final String dfa_29s = "\1\uffff\1\3\1\uffff\1\2\2\uffff\1\1\34\uffff";
    static final String dfa_30s = "\23\uffff\1\12\1\17\1\4\1\6\1\2\1\3\1\1\1\13\1\16\1\0\1\14\1\7\1\11\1\5\1\10\1\15}>";
    static final String[] dfa_31s = {
            "\1\1\5\uffff\3\1\2\uffff\1\1\1\3\1\2\1\1\1\uffff\3\1\5\uffff\1\1\1\uffff\4\1\6\uffff\2\1\2\uffff\1\1",
            "",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\5\1\4\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\10\1\7\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\12\1\11\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\14\1\13\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\16\1\15\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\20\1\17\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\22\1\21\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\24\1\23\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\26\1\25\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\30\1\27\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\32\1\31\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\34\1\33\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\36\1\35\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\40\1\37\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
            "\1\6\5\uffff\3\6\2\uffff\1\6\1\42\1\41\1\6\1\uffff\3\6\5\uffff\1\6\1\uffff\4\6\6\uffff\2\6\2\uffff\1\6",
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
            "\1\uffff"
    };

    static final short[] dfa_25 = DFA.unpackEncodedString(dfa_25s);
    static final short[] dfa_26 = DFA.unpackEncodedString(dfa_26s);
    static final char[] dfa_27 = DFA.unpackEncodedStringToUnsignedChars(dfa_27s);
    static final char[] dfa_28 = DFA.unpackEncodedStringToUnsignedChars(dfa_28s);
    static final short[] dfa_29 = DFA.unpackEncodedString(dfa_29s);
    static final short[] dfa_30 = DFA.unpackEncodedString(dfa_30s);
    static final short[][] dfa_31 = unpackEncodedStringArray(dfa_31s);

    class DFA55 extends DFA {

        public DFA55(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 55;
            this.eot = dfa_25;
            this.eof = dfa_26;
            this.min = dfa_27;
            this.max = dfa_28;
            this.accept = dfa_29;
            this.special = dfa_30;
            this.transition = dfa_31;
        }
        public String getDescription() {
            return "()+ loopback of 4550:3: (this_DIGIT_NONZERO_9= RULE_DIGIT_NONZERO | this_ZERO_10= RULE_ZERO )+";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA55_28 = input.LA(1);

                         
                        int index55_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_28);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA55_25 = input.LA(1);

                         
                        int index55_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_25);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA55_23 = input.LA(1);

                         
                        int index55_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_23);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA55_24 = input.LA(1);

                         
                        int index55_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_24);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA55_21 = input.LA(1);

                         
                        int index55_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_21);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA55_32 = input.LA(1);

                         
                        int index55_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_32);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA55_22 = input.LA(1);

                         
                        int index55_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_22);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA55_30 = input.LA(1);

                         
                        int index55_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_30);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA55_33 = input.LA(1);

                         
                        int index55_33 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_33);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA55_31 = input.LA(1);

                         
                        int index55_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_31);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA55_19 = input.LA(1);

                         
                        int index55_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_19);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA55_26 = input.LA(1);

                         
                        int index55_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_26);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA55_29 = input.LA(1);

                         
                        int index55_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_29);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA55_34 = input.LA(1);

                         
                        int index55_34 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_34);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA55_27 = input.LA(1);

                         
                        int index55_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_27);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA55_20 = input.LA(1);

                         
                        int index55_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred79_InternalEclParser()) ) {s = 6;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index55_20);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 55, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x047F941100000000L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000042000002L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080002L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000200000002L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x047F945510000000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000080000000002L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000141100000000L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008000002L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000100000000L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000002100000000L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000400000000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x047F945110000000L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x047F941110000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0181E00000000000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000180000000L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000100180000000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000420000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0200000000000000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030180000000L});
        public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000A0FFF0L});
        public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0800000000000000L});
        public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000600000000000L});
        public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000001150000L,0x0000000000000001L});
        public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000200000000L});
        public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000001000000000L});
        public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000602000000000L});
        public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x1000001000000000L});
        public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1000000000000000L});
        public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x1000002000000000L});
        public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000001100000000L});
        public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000001100000002L});
        public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000005080L});
        public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
        public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000001880L});
        public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000180000002L});
        public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x1000020180000002L});
        public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1000000000000002L});
    }


}