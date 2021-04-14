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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEclParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "True", "RULE_TERM_STRING", "RULE_REVERSED", "RULE_TO", "RULE_COMMA", "RULE_CONJUNCTION", "RULE_DISJUNCTION", "RULE_EXCLUSION", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_DBL_LT_EM", "RULE_GT_EM", "RULE_DBL_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_HASH", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int RULE_DIGIT_NONZERO=14;
    public static final int RULE_CURLY_OPEN=16;
    public static final int RULE_TO=8;
    public static final int RULE_ROUND_CLOSE=19;
    public static final int RULE_DBL_GT=32;
    public static final int True=5;
    public static final int RULE_GT=30;
    public static final int False=4;
    public static final int RULE_GTE=37;
    public static final int RULE_ROUND_OPEN=18;
    public static final int RULE_DBL_LT=31;
    public static final int RULE_NOT_EQUAL=28;
    public static final int RULE_SQUARE_CLOSE=21;
    public static final int RULE_SQUARE_OPEN=20;
    public static final int RULE_EQUAL=27;
    public static final int RULE_COMMA=9;
    public static final int RULE_LT_EM=33;
    public static final int RULE_CURLY_CLOSE=17;
    public static final int RULE_ZERO=13;
    public static final int RULE_DBL_GT_EM=36;
    public static final int RULE_COLON=15;
    public static final int RULE_LT=29;
    public static final int RULE_ML_COMMENT=41;
    public static final int RULE_LTE=38;
    public static final int RULE_STRING=43;
    public static final int RULE_REVERSED=7;
    public static final int RULE_SL_COMMENT=42;
    public static final int RULE_HASH=39;
    public static final int RULE_DASH=23;
    public static final int RULE_PLUS=22;
    public static final int RULE_DOT=25;
    public static final int EOF=-1;
    public static final int RULE_GT_EM=35;
    public static final int RULE_WS=40;
    public static final int RULE_EXCLUSION=12;
    public static final int RULE_CARET=24;
    public static final int RULE_CONJUNCTION=10;
    public static final int RULE_WILDCARD=26;
    public static final int RULE_DISJUNCTION=11;
    public static final int RULE_TERM_STRING=6;
    public static final int RULE_DBL_LT_EM=34;

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


    	private EclGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("False", "'false'");
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



    // $ANTLR start "entryRuleScript"
    // InternalEclParser.g:70:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // InternalEclParser.g:71:1: ( ruleScript EOF )
            // InternalEclParser.g:72:1: ruleScript EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleScript();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // InternalEclParser.g:79:1: ruleScript : ( ( rule__Script__Group__0 ) ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:83:2: ( ( ( rule__Script__Group__0 ) ) )
            // InternalEclParser.g:84:2: ( ( rule__Script__Group__0 ) )
            {
            // InternalEclParser.g:84:2: ( ( rule__Script__Group__0 ) )
            // InternalEclParser.g:85:3: ( rule__Script__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getGroup()); 
            }
            // InternalEclParser.g:86:3: ( rule__Script__Group__0 )
            // InternalEclParser.g:86:4: rule__Script__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Script__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleExpressionConstraint"
    // InternalEclParser.g:95:1: entryRuleExpressionConstraint : ruleExpressionConstraint EOF ;
    public final void entryRuleExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:96:1: ( ruleExpressionConstraint EOF )
            // InternalEclParser.g:97:1: ruleExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExpressionConstraint"


    // $ANTLR start "ruleExpressionConstraint"
    // InternalEclParser.g:104:1: ruleExpressionConstraint : ( ruleOrExpressionConstraint ) ;
    public final void ruleExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:108:2: ( ( ruleOrExpressionConstraint ) )
            // InternalEclParser.g:109:2: ( ruleOrExpressionConstraint )
            {
            // InternalEclParser.g:109:2: ( ruleOrExpressionConstraint )
            // InternalEclParser.g:110:3: ruleOrExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExpressionConstraintAccess().getOrExpressionConstraintParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExpressionConstraint"


    // $ANTLR start "entryRuleOrExpressionConstraint"
    // InternalEclParser.g:120:1: entryRuleOrExpressionConstraint : ruleOrExpressionConstraint EOF ;
    public final void entryRuleOrExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:121:1: ( ruleOrExpressionConstraint EOF )
            // InternalEclParser.g:122:1: ruleOrExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrExpressionConstraint"


    // $ANTLR start "ruleOrExpressionConstraint"
    // InternalEclParser.g:129:1: ruleOrExpressionConstraint : ( ( rule__OrExpressionConstraint__Group__0 ) ) ;
    public final void ruleOrExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:133:2: ( ( ( rule__OrExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:134:2: ( ( rule__OrExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:134:2: ( ( rule__OrExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:135:3: ( rule__OrExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:136:3: ( rule__OrExpressionConstraint__Group__0 )
            // InternalEclParser.g:136:4: rule__OrExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrExpressionConstraint"


    // $ANTLR start "entryRuleAndExpressionConstraint"
    // InternalEclParser.g:145:1: entryRuleAndExpressionConstraint : ruleAndExpressionConstraint EOF ;
    public final void entryRuleAndExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:146:1: ( ruleAndExpressionConstraint EOF )
            // InternalEclParser.g:147:1: ruleAndExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndExpressionConstraint"


    // $ANTLR start "ruleAndExpressionConstraint"
    // InternalEclParser.g:154:1: ruleAndExpressionConstraint : ( ( rule__AndExpressionConstraint__Group__0 ) ) ;
    public final void ruleAndExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:158:2: ( ( ( rule__AndExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:159:2: ( ( rule__AndExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:159:2: ( ( rule__AndExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:160:3: ( rule__AndExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:161:3: ( rule__AndExpressionConstraint__Group__0 )
            // InternalEclParser.g:161:4: rule__AndExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndExpressionConstraint"


    // $ANTLR start "entryRuleExclusionExpressionConstraint"
    // InternalEclParser.g:170:1: entryRuleExclusionExpressionConstraint : ruleExclusionExpressionConstraint EOF ;
    public final void entryRuleExclusionExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:171:1: ( ruleExclusionExpressionConstraint EOF )
            // InternalEclParser.g:172:1: ruleExclusionExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExclusionExpressionConstraint"


    // $ANTLR start "ruleExclusionExpressionConstraint"
    // InternalEclParser.g:179:1: ruleExclusionExpressionConstraint : ( ( rule__ExclusionExpressionConstraint__Group__0 ) ) ;
    public final void ruleExclusionExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:183:2: ( ( ( rule__ExclusionExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:184:2: ( ( rule__ExclusionExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:184:2: ( ( rule__ExclusionExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:185:3: ( rule__ExclusionExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:186:3: ( rule__ExclusionExpressionConstraint__Group__0 )
            // InternalEclParser.g:186:4: rule__ExclusionExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExclusionExpressionConstraint"


    // $ANTLR start "entryRuleRefinedExpressionConstraint"
    // InternalEclParser.g:195:1: entryRuleRefinedExpressionConstraint : ruleRefinedExpressionConstraint EOF ;
    public final void entryRuleRefinedExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:196:1: ( ruleRefinedExpressionConstraint EOF )
            // InternalEclParser.g:197:1: ruleRefinedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRefinedExpressionConstraint"


    // $ANTLR start "ruleRefinedExpressionConstraint"
    // InternalEclParser.g:204:1: ruleRefinedExpressionConstraint : ( ( rule__RefinedExpressionConstraint__Group__0 ) ) ;
    public final void ruleRefinedExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:208:2: ( ( ( rule__RefinedExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:209:2: ( ( rule__RefinedExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:209:2: ( ( rule__RefinedExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:210:3: ( rule__RefinedExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:211:3: ( rule__RefinedExpressionConstraint__Group__0 )
            // InternalEclParser.g:211:4: rule__RefinedExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRefinedExpressionConstraint"


    // $ANTLR start "entryRuleDottedExpressionConstraint"
    // InternalEclParser.g:220:1: entryRuleDottedExpressionConstraint : ruleDottedExpressionConstraint EOF ;
    public final void entryRuleDottedExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:221:1: ( ruleDottedExpressionConstraint EOF )
            // InternalEclParser.g:222:1: ruleDottedExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDottedExpressionConstraint"


    // $ANTLR start "ruleDottedExpressionConstraint"
    // InternalEclParser.g:229:1: ruleDottedExpressionConstraint : ( ( rule__DottedExpressionConstraint__Group__0 ) ) ;
    public final void ruleDottedExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:233:2: ( ( ( rule__DottedExpressionConstraint__Group__0 ) ) )
            // InternalEclParser.g:234:2: ( ( rule__DottedExpressionConstraint__Group__0 ) )
            {
            // InternalEclParser.g:234:2: ( ( rule__DottedExpressionConstraint__Group__0 ) )
            // InternalEclParser.g:235:3: ( rule__DottedExpressionConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:236:3: ( rule__DottedExpressionConstraint__Group__0 )
            // InternalEclParser.g:236:4: rule__DottedExpressionConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDottedExpressionConstraint"


    // $ANTLR start "entryRuleSubExpressionConstraint"
    // InternalEclParser.g:245:1: entryRuleSubExpressionConstraint : ruleSubExpressionConstraint EOF ;
    public final void entryRuleSubExpressionConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:246:1: ( ruleSubExpressionConstraint EOF )
            // InternalEclParser.g:247:1: ruleSubExpressionConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubExpressionConstraint"


    // $ANTLR start "ruleSubExpressionConstraint"
    // InternalEclParser.g:254:1: ruleSubExpressionConstraint : ( ( rule__SubExpressionConstraint__Alternatives ) ) ;
    public final void ruleSubExpressionConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:258:2: ( ( ( rule__SubExpressionConstraint__Alternatives ) ) )
            // InternalEclParser.g:259:2: ( ( rule__SubExpressionConstraint__Alternatives ) )
            {
            // InternalEclParser.g:259:2: ( ( rule__SubExpressionConstraint__Alternatives ) )
            // InternalEclParser.g:260:3: ( rule__SubExpressionConstraint__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); 
            }
            // InternalEclParser.g:261:3: ( rule__SubExpressionConstraint__Alternatives )
            // InternalEclParser.g:261:4: rule__SubExpressionConstraint__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubExpressionConstraint__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubExpressionConstraintAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubExpressionConstraint"


    // $ANTLR start "entryRuleEclFocusConcept"
    // InternalEclParser.g:270:1: entryRuleEclFocusConcept : ruleEclFocusConcept EOF ;
    public final void entryRuleEclFocusConcept() throws RecognitionException {
        try {
            // InternalEclParser.g:271:1: ( ruleEclFocusConcept EOF )
            // InternalEclParser.g:272:1: ruleEclFocusConcept EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclFocusConceptRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclFocusConceptRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclFocusConcept"


    // $ANTLR start "ruleEclFocusConcept"
    // InternalEclParser.g:279:1: ruleEclFocusConcept : ( ( rule__EclFocusConcept__Alternatives ) ) ;
    public final void ruleEclFocusConcept() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:283:2: ( ( ( rule__EclFocusConcept__Alternatives ) ) )
            // InternalEclParser.g:284:2: ( ( rule__EclFocusConcept__Alternatives ) )
            {
            // InternalEclParser.g:284:2: ( ( rule__EclFocusConcept__Alternatives ) )
            // InternalEclParser.g:285:3: ( rule__EclFocusConcept__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclFocusConceptAccess().getAlternatives()); 
            }
            // InternalEclParser.g:286:3: ( rule__EclFocusConcept__Alternatives )
            // InternalEclParser.g:286:4: rule__EclFocusConcept__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclFocusConcept__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclFocusConceptAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclFocusConcept"


    // $ANTLR start "entryRuleChildOf"
    // InternalEclParser.g:295:1: entryRuleChildOf : ruleChildOf EOF ;
    public final void entryRuleChildOf() throws RecognitionException {
        try {
            // InternalEclParser.g:296:1: ( ruleChildOf EOF )
            // InternalEclParser.g:297:1: ruleChildOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChildOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChildOf"


    // $ANTLR start "ruleChildOf"
    // InternalEclParser.g:304:1: ruleChildOf : ( ( rule__ChildOf__Group__0 ) ) ;
    public final void ruleChildOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:308:2: ( ( ( rule__ChildOf__Group__0 ) ) )
            // InternalEclParser.g:309:2: ( ( rule__ChildOf__Group__0 ) )
            {
            // InternalEclParser.g:309:2: ( ( rule__ChildOf__Group__0 ) )
            // InternalEclParser.g:310:3: ( rule__ChildOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfAccess().getGroup()); 
            }
            // InternalEclParser.g:311:3: ( rule__ChildOf__Group__0 )
            // InternalEclParser.g:311:4: rule__ChildOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChildOf"


    // $ANTLR start "entryRuleChildOrSelfOf"
    // InternalEclParser.g:320:1: entryRuleChildOrSelfOf : ruleChildOrSelfOf EOF ;
    public final void entryRuleChildOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:321:1: ( ruleChildOrSelfOf EOF )
            // InternalEclParser.g:322:1: ruleChildOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleChildOrSelfOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOrSelfOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleChildOrSelfOf"


    // $ANTLR start "ruleChildOrSelfOf"
    // InternalEclParser.g:329:1: ruleChildOrSelfOf : ( ( rule__ChildOrSelfOf__Group__0 ) ) ;
    public final void ruleChildOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:333:2: ( ( ( rule__ChildOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:334:2: ( ( rule__ChildOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:334:2: ( ( rule__ChildOrSelfOf__Group__0 ) )
            // InternalEclParser.g:335:3: ( rule__ChildOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:336:3: ( rule__ChildOrSelfOf__Group__0 )
            // InternalEclParser.g:336:4: rule__ChildOrSelfOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOrSelfOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOrSelfOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleChildOrSelfOf"


    // $ANTLR start "entryRuleDescendantOf"
    // InternalEclParser.g:345:1: entryRuleDescendantOf : ruleDescendantOf EOF ;
    public final void entryRuleDescendantOf() throws RecognitionException {
        try {
            // InternalEclParser.g:346:1: ( ruleDescendantOf EOF )
            // InternalEclParser.g:347:1: ruleDescendantOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDescendantOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescendantOf"


    // $ANTLR start "ruleDescendantOf"
    // InternalEclParser.g:354:1: ruleDescendantOf : ( ( rule__DescendantOf__Group__0 ) ) ;
    public final void ruleDescendantOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:358:2: ( ( ( rule__DescendantOf__Group__0 ) ) )
            // InternalEclParser.g:359:2: ( ( rule__DescendantOf__Group__0 ) )
            {
            // InternalEclParser.g:359:2: ( ( rule__DescendantOf__Group__0 ) )
            // InternalEclParser.g:360:3: ( rule__DescendantOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getGroup()); 
            }
            // InternalEclParser.g:361:3: ( rule__DescendantOf__Group__0 )
            // InternalEclParser.g:361:4: rule__DescendantOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescendantOf"


    // $ANTLR start "entryRuleDescendantOrSelfOf"
    // InternalEclParser.g:370:1: entryRuleDescendantOrSelfOf : ruleDescendantOrSelfOf EOF ;
    public final void entryRuleDescendantOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:371:1: ( ruleDescendantOrSelfOf EOF )
            // InternalEclParser.g:372:1: ruleDescendantOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDescendantOrSelfOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOrSelfOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescendantOrSelfOf"


    // $ANTLR start "ruleDescendantOrSelfOf"
    // InternalEclParser.g:379:1: ruleDescendantOrSelfOf : ( ( rule__DescendantOrSelfOf__Group__0 ) ) ;
    public final void ruleDescendantOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:383:2: ( ( ( rule__DescendantOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:384:2: ( ( rule__DescendantOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:384:2: ( ( rule__DescendantOrSelfOf__Group__0 ) )
            // InternalEclParser.g:385:3: ( rule__DescendantOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:386:3: ( rule__DescendantOrSelfOf__Group__0 )
            // InternalEclParser.g:386:4: rule__DescendantOrSelfOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOrSelfOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescendantOrSelfOf"


    // $ANTLR start "entryRuleParentOf"
    // InternalEclParser.g:395:1: entryRuleParentOf : ruleParentOf EOF ;
    public final void entryRuleParentOf() throws RecognitionException {
        try {
            // InternalEclParser.g:396:1: ( ruleParentOf EOF )
            // InternalEclParser.g:397:1: ruleParentOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParentOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParentOf"


    // $ANTLR start "ruleParentOf"
    // InternalEclParser.g:404:1: ruleParentOf : ( ( rule__ParentOf__Group__0 ) ) ;
    public final void ruleParentOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:408:2: ( ( ( rule__ParentOf__Group__0 ) ) )
            // InternalEclParser.g:409:2: ( ( rule__ParentOf__Group__0 ) )
            {
            // InternalEclParser.g:409:2: ( ( rule__ParentOf__Group__0 ) )
            // InternalEclParser.g:410:3: ( rule__ParentOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getGroup()); 
            }
            // InternalEclParser.g:411:3: ( rule__ParentOf__Group__0 )
            // InternalEclParser.g:411:4: rule__ParentOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParentOf"


    // $ANTLR start "entryRuleParentOrSelfOf"
    // InternalEclParser.g:420:1: entryRuleParentOrSelfOf : ruleParentOrSelfOf EOF ;
    public final void entryRuleParentOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:421:1: ( ruleParentOrSelfOf EOF )
            // InternalEclParser.g:422:1: ruleParentOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleParentOrSelfOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOrSelfOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParentOrSelfOf"


    // $ANTLR start "ruleParentOrSelfOf"
    // InternalEclParser.g:429:1: ruleParentOrSelfOf : ( ( rule__ParentOrSelfOf__Group__0 ) ) ;
    public final void ruleParentOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:433:2: ( ( ( rule__ParentOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:434:2: ( ( rule__ParentOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:434:2: ( ( rule__ParentOrSelfOf__Group__0 ) )
            // InternalEclParser.g:435:3: ( rule__ParentOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:436:3: ( rule__ParentOrSelfOf__Group__0 )
            // InternalEclParser.g:436:4: rule__ParentOrSelfOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOrSelfOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOrSelfOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParentOrSelfOf"


    // $ANTLR start "entryRuleAncestorOf"
    // InternalEclParser.g:445:1: entryRuleAncestorOf : ruleAncestorOf EOF ;
    public final void entryRuleAncestorOf() throws RecognitionException {
        try {
            // InternalEclParser.g:446:1: ( ruleAncestorOf EOF )
            // InternalEclParser.g:447:1: ruleAncestorOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAncestorOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAncestorOf"


    // $ANTLR start "ruleAncestorOf"
    // InternalEclParser.g:454:1: ruleAncestorOf : ( ( rule__AncestorOf__Group__0 ) ) ;
    public final void ruleAncestorOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:458:2: ( ( ( rule__AncestorOf__Group__0 ) ) )
            // InternalEclParser.g:459:2: ( ( rule__AncestorOf__Group__0 ) )
            {
            // InternalEclParser.g:459:2: ( ( rule__AncestorOf__Group__0 ) )
            // InternalEclParser.g:460:3: ( rule__AncestorOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getGroup()); 
            }
            // InternalEclParser.g:461:3: ( rule__AncestorOf__Group__0 )
            // InternalEclParser.g:461:4: rule__AncestorOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAncestorOf"


    // $ANTLR start "entryRuleAncestorOrSelfOf"
    // InternalEclParser.g:470:1: entryRuleAncestorOrSelfOf : ruleAncestorOrSelfOf EOF ;
    public final void entryRuleAncestorOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:471:1: ( ruleAncestorOrSelfOf EOF )
            // InternalEclParser.g:472:1: ruleAncestorOrSelfOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAncestorOrSelfOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOrSelfOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAncestorOrSelfOf"


    // $ANTLR start "ruleAncestorOrSelfOf"
    // InternalEclParser.g:479:1: ruleAncestorOrSelfOf : ( ( rule__AncestorOrSelfOf__Group__0 ) ) ;
    public final void ruleAncestorOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:483:2: ( ( ( rule__AncestorOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:484:2: ( ( rule__AncestorOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:484:2: ( ( rule__AncestorOrSelfOf__Group__0 ) )
            // InternalEclParser.g:485:3: ( rule__AncestorOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:486:3: ( rule__AncestorOrSelfOf__Group__0 )
            // InternalEclParser.g:486:4: rule__AncestorOrSelfOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOrSelfOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAncestorOrSelfOf"


    // $ANTLR start "entryRuleMemberOf"
    // InternalEclParser.g:495:1: entryRuleMemberOf : ruleMemberOf EOF ;
    public final void entryRuleMemberOf() throws RecognitionException {
        try {
            // InternalEclParser.g:496:1: ( ruleMemberOf EOF )
            // InternalEclParser.g:497:1: ruleMemberOf EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMemberOf();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberOfRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMemberOf"


    // $ANTLR start "ruleMemberOf"
    // InternalEclParser.g:504:1: ruleMemberOf : ( ( rule__MemberOf__Group__0 ) ) ;
    public final void ruleMemberOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:508:2: ( ( ( rule__MemberOf__Group__0 ) ) )
            // InternalEclParser.g:509:2: ( ( rule__MemberOf__Group__0 ) )
            {
            // InternalEclParser.g:509:2: ( ( rule__MemberOf__Group__0 ) )
            // InternalEclParser.g:510:3: ( rule__MemberOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getGroup()); 
            }
            // InternalEclParser.g:511:3: ( rule__MemberOf__Group__0 )
            // InternalEclParser.g:511:4: rule__MemberOf__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MemberOf__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberOfAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMemberOf"


    // $ANTLR start "entryRuleEclConceptReference"
    // InternalEclParser.g:520:1: entryRuleEclConceptReference : ruleEclConceptReference EOF ;
    public final void entryRuleEclConceptReference() throws RecognitionException {
        try {
            // InternalEclParser.g:521:1: ( ruleEclConceptReference EOF )
            // InternalEclParser.g:522:1: ruleEclConceptReference EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEclConceptReference();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclConceptReference"


    // $ANTLR start "ruleEclConceptReference"
    // InternalEclParser.g:529:1: ruleEclConceptReference : ( ( rule__EclConceptReference__Group__0 ) ) ;
    public final void ruleEclConceptReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:533:2: ( ( ( rule__EclConceptReference__Group__0 ) ) )
            // InternalEclParser.g:534:2: ( ( rule__EclConceptReference__Group__0 ) )
            {
            // InternalEclParser.g:534:2: ( ( rule__EclConceptReference__Group__0 ) )
            // InternalEclParser.g:535:3: ( rule__EclConceptReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getGroup()); 
            }
            // InternalEclParser.g:536:3: ( rule__EclConceptReference__Group__0 )
            // InternalEclParser.g:536:4: rule__EclConceptReference__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclConceptReference__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclConceptReference"


    // $ANTLR start "entryRuleAny"
    // InternalEclParser.g:545:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // InternalEclParser.g:546:1: ( ruleAny EOF )
            // InternalEclParser.g:547:1: ruleAny EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAny();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAny"


    // $ANTLR start "ruleAny"
    // InternalEclParser.g:554:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:558:2: ( ( ( rule__Any__Group__0 ) ) )
            // InternalEclParser.g:559:2: ( ( rule__Any__Group__0 ) )
            {
            // InternalEclParser.g:559:2: ( ( rule__Any__Group__0 ) )
            // InternalEclParser.g:560:3: ( rule__Any__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyAccess().getGroup()); 
            }
            // InternalEclParser.g:561:3: ( rule__Any__Group__0 )
            // InternalEclParser.g:561:4: rule__Any__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Any__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAny"


    // $ANTLR start "entryRuleEclRefinement"
    // InternalEclParser.g:570:1: entryRuleEclRefinement : ruleEclRefinement EOF ;
    public final void entryRuleEclRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:571:1: ( ruleEclRefinement EOF )
            // InternalEclParser.g:572:1: ruleEclRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEclRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclRefinement"


    // $ANTLR start "ruleEclRefinement"
    // InternalEclParser.g:579:1: ruleEclRefinement : ( ruleOrRefinement ) ;
    public final void ruleEclRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:583:2: ( ( ruleOrRefinement ) )
            // InternalEclParser.g:584:2: ( ruleOrRefinement )
            {
            // InternalEclParser.g:584:2: ( ruleOrRefinement )
            // InternalEclParser.g:585:3: ruleOrRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclRefinementAccess().getOrRefinementParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclRefinement"


    // $ANTLR start "entryRuleOrRefinement"
    // InternalEclParser.g:595:1: entryRuleOrRefinement : ruleOrRefinement EOF ;
    public final void entryRuleOrRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:596:1: ( ruleOrRefinement EOF )
            // InternalEclParser.g:597:1: ruleOrRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrRefinement"


    // $ANTLR start "ruleOrRefinement"
    // InternalEclParser.g:604:1: ruleOrRefinement : ( ( rule__OrRefinement__Group__0 ) ) ;
    public final void ruleOrRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:608:2: ( ( ( rule__OrRefinement__Group__0 ) ) )
            // InternalEclParser.g:609:2: ( ( rule__OrRefinement__Group__0 ) )
            {
            // InternalEclParser.g:609:2: ( ( rule__OrRefinement__Group__0 ) )
            // InternalEclParser.g:610:3: ( rule__OrRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:611:3: ( rule__OrRefinement__Group__0 )
            // InternalEclParser.g:611:4: rule__OrRefinement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrRefinement"


    // $ANTLR start "entryRuleAndRefinement"
    // InternalEclParser.g:620:1: entryRuleAndRefinement : ruleAndRefinement EOF ;
    public final void entryRuleAndRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:621:1: ( ruleAndRefinement EOF )
            // InternalEclParser.g:622:1: ruleAndRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndRefinement"


    // $ANTLR start "ruleAndRefinement"
    // InternalEclParser.g:629:1: ruleAndRefinement : ( ( rule__AndRefinement__Group__0 ) ) ;
    public final void ruleAndRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:633:2: ( ( ( rule__AndRefinement__Group__0 ) ) )
            // InternalEclParser.g:634:2: ( ( rule__AndRefinement__Group__0 ) )
            {
            // InternalEclParser.g:634:2: ( ( rule__AndRefinement__Group__0 ) )
            // InternalEclParser.g:635:3: ( rule__AndRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:636:3: ( rule__AndRefinement__Group__0 )
            // InternalEclParser.g:636:4: rule__AndRefinement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndRefinement"


    // $ANTLR start "entryRuleSubRefinement"
    // InternalEclParser.g:645:1: entryRuleSubRefinement : ruleSubRefinement EOF ;
    public final void entryRuleSubRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:646:1: ( ruleSubRefinement EOF )
            // InternalEclParser.g:647:1: ruleSubRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubRefinement"


    // $ANTLR start "ruleSubRefinement"
    // InternalEclParser.g:654:1: ruleSubRefinement : ( ( rule__SubRefinement__Alternatives ) ) ;
    public final void ruleSubRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:658:2: ( ( ( rule__SubRefinement__Alternatives ) ) )
            // InternalEclParser.g:659:2: ( ( rule__SubRefinement__Alternatives ) )
            {
            // InternalEclParser.g:659:2: ( ( rule__SubRefinement__Alternatives ) )
            // InternalEclParser.g:660:3: ( rule__SubRefinement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubRefinementAccess().getAlternatives()); 
            }
            // InternalEclParser.g:661:3: ( rule__SubRefinement__Alternatives )
            // InternalEclParser.g:661:4: rule__SubRefinement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubRefinement__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubRefinementAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubRefinement"


    // $ANTLR start "entryRuleNestedRefinement"
    // InternalEclParser.g:670:1: entryRuleNestedRefinement : ruleNestedRefinement EOF ;
    public final void entryRuleNestedRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:671:1: ( ruleNestedRefinement EOF )
            // InternalEclParser.g:672:1: ruleNestedRefinement EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNestedRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedRefinement"


    // $ANTLR start "ruleNestedRefinement"
    // InternalEclParser.g:679:1: ruleNestedRefinement : ( ( rule__NestedRefinement__Group__0 ) ) ;
    public final void ruleNestedRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:683:2: ( ( ( rule__NestedRefinement__Group__0 ) ) )
            // InternalEclParser.g:684:2: ( ( rule__NestedRefinement__Group__0 ) )
            {
            // InternalEclParser.g:684:2: ( ( rule__NestedRefinement__Group__0 ) )
            // InternalEclParser.g:685:3: ( rule__NestedRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:686:3: ( rule__NestedRefinement__Group__0 )
            // InternalEclParser.g:686:4: rule__NestedRefinement__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedRefinement__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedRefinement"


    // $ANTLR start "entryRuleEclAttributeGroup"
    // InternalEclParser.g:695:1: entryRuleEclAttributeGroup : ruleEclAttributeGroup EOF ;
    public final void entryRuleEclAttributeGroup() throws RecognitionException {
        try {
            // InternalEclParser.g:696:1: ( ruleEclAttributeGroup EOF )
            // InternalEclParser.g:697:1: ruleEclAttributeGroup EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEclAttributeGroup();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclAttributeGroup"


    // $ANTLR start "ruleEclAttributeGroup"
    // InternalEclParser.g:704:1: ruleEclAttributeGroup : ( ( rule__EclAttributeGroup__Group__0 ) ) ;
    public final void ruleEclAttributeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:708:2: ( ( ( rule__EclAttributeGroup__Group__0 ) ) )
            // InternalEclParser.g:709:2: ( ( rule__EclAttributeGroup__Group__0 ) )
            {
            // InternalEclParser.g:709:2: ( ( rule__EclAttributeGroup__Group__0 ) )
            // InternalEclParser.g:710:3: ( rule__EclAttributeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getGroup()); 
            }
            // InternalEclParser.g:711:3: ( rule__EclAttributeGroup__Group__0 )
            // InternalEclParser.g:711:4: rule__EclAttributeGroup__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclAttributeGroup"


    // $ANTLR start "entryRuleEclAttributeSet"
    // InternalEclParser.g:720:1: entryRuleEclAttributeSet : ruleEclAttributeSet EOF ;
    public final void entryRuleEclAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:721:1: ( ruleEclAttributeSet EOF )
            // InternalEclParser.g:722:1: ruleEclAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEclAttributeSet"


    // $ANTLR start "ruleEclAttributeSet"
    // InternalEclParser.g:729:1: ruleEclAttributeSet : ( ruleOrAttributeSet ) ;
    public final void ruleEclAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:733:2: ( ( ruleOrAttributeSet ) )
            // InternalEclParser.g:734:2: ( ruleOrAttributeSet )
            {
            // InternalEclParser.g:734:2: ( ruleOrAttributeSet )
            // InternalEclParser.g:735:3: ruleOrAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeSetAccess().getOrAttributeSetParserRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEclAttributeSet"


    // $ANTLR start "entryRuleOrAttributeSet"
    // InternalEclParser.g:745:1: entryRuleOrAttributeSet : ruleOrAttributeSet EOF ;
    public final void entryRuleOrAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:746:1: ( ruleOrAttributeSet EOF )
            // InternalEclParser.g:747:1: ruleOrAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleOrAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleOrAttributeSet"


    // $ANTLR start "ruleOrAttributeSet"
    // InternalEclParser.g:754:1: ruleOrAttributeSet : ( ( rule__OrAttributeSet__Group__0 ) ) ;
    public final void ruleOrAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:758:2: ( ( ( rule__OrAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:759:2: ( ( rule__OrAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:759:2: ( ( rule__OrAttributeSet__Group__0 ) )
            // InternalEclParser.g:760:3: ( rule__OrAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:761:3: ( rule__OrAttributeSet__Group__0 )
            // InternalEclParser.g:761:4: rule__OrAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOrAttributeSet"


    // $ANTLR start "entryRuleAndAttributeSet"
    // InternalEclParser.g:770:1: entryRuleAndAttributeSet : ruleAndAttributeSet EOF ;
    public final void entryRuleAndAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:771:1: ( ruleAndAttributeSet EOF )
            // InternalEclParser.g:772:1: ruleAndAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAndAttributeSet"


    // $ANTLR start "ruleAndAttributeSet"
    // InternalEclParser.g:779:1: ruleAndAttributeSet : ( ( rule__AndAttributeSet__Group__0 ) ) ;
    public final void ruleAndAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:783:2: ( ( ( rule__AndAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:784:2: ( ( rule__AndAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:784:2: ( ( rule__AndAttributeSet__Group__0 ) )
            // InternalEclParser.g:785:3: ( rule__AndAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:786:3: ( rule__AndAttributeSet__Group__0 )
            // InternalEclParser.g:786:4: rule__AndAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAndAttributeSet"


    // $ANTLR start "entryRuleSubAttributeSet"
    // InternalEclParser.g:795:1: entryRuleSubAttributeSet : ruleSubAttributeSet EOF ;
    public final void entryRuleSubAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:796:1: ( ruleSubAttributeSet EOF )
            // InternalEclParser.g:797:1: ruleSubAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubAttributeSet"


    // $ANTLR start "ruleSubAttributeSet"
    // InternalEclParser.g:804:1: ruleSubAttributeSet : ( ( rule__SubAttributeSet__Alternatives ) ) ;
    public final void ruleSubAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:808:2: ( ( ( rule__SubAttributeSet__Alternatives ) ) )
            // InternalEclParser.g:809:2: ( ( rule__SubAttributeSet__Alternatives ) )
            {
            // InternalEclParser.g:809:2: ( ( rule__SubAttributeSet__Alternatives ) )
            // InternalEclParser.g:810:3: ( rule__SubAttributeSet__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubAttributeSetAccess().getAlternatives()); 
            }
            // InternalEclParser.g:811:3: ( rule__SubAttributeSet__Alternatives )
            // InternalEclParser.g:811:4: rule__SubAttributeSet__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SubAttributeSet__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSubAttributeSetAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubAttributeSet"


    // $ANTLR start "entryRuleNestedAttributeSet"
    // InternalEclParser.g:820:1: entryRuleNestedAttributeSet : ruleNestedAttributeSet EOF ;
    public final void entryRuleNestedAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:821:1: ( ruleNestedAttributeSet EOF )
            // InternalEclParser.g:822:1: ruleNestedAttributeSet EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNestedAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedAttributeSet"


    // $ANTLR start "ruleNestedAttributeSet"
    // InternalEclParser.g:829:1: ruleNestedAttributeSet : ( ( rule__NestedAttributeSet__Group__0 ) ) ;
    public final void ruleNestedAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:833:2: ( ( ( rule__NestedAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:834:2: ( ( rule__NestedAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:834:2: ( ( rule__NestedAttributeSet__Group__0 ) )
            // InternalEclParser.g:835:3: ( rule__NestedAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:836:3: ( rule__NestedAttributeSet__Group__0 )
            // InternalEclParser.g:836:4: rule__NestedAttributeSet__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedAttributeSet__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedAttributeSet"


    // $ANTLR start "entryRuleAttributeConstraint"
    // InternalEclParser.g:845:1: entryRuleAttributeConstraint : ruleAttributeConstraint EOF ;
    public final void entryRuleAttributeConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:846:1: ( ruleAttributeConstraint EOF )
            // InternalEclParser.g:847:1: ruleAttributeConstraint EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeConstraint"


    // $ANTLR start "ruleAttributeConstraint"
    // InternalEclParser.g:854:1: ruleAttributeConstraint : ( ( rule__AttributeConstraint__Group__0 ) ) ;
    public final void ruleAttributeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:858:2: ( ( ( rule__AttributeConstraint__Group__0 ) ) )
            // InternalEclParser.g:859:2: ( ( rule__AttributeConstraint__Group__0 ) )
            {
            // InternalEclParser.g:859:2: ( ( rule__AttributeConstraint__Group__0 ) )
            // InternalEclParser.g:860:3: ( rule__AttributeConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:861:3: ( rule__AttributeConstraint__Group__0 )
            // InternalEclParser.g:861:4: rule__AttributeConstraint__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeConstraint"


    // $ANTLR start "entryRuleCardinality"
    // InternalEclParser.g:870:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalEclParser.g:871:1: ( ruleCardinality EOF )
            // InternalEclParser.g:872:1: ruleCardinality EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCardinality"


    // $ANTLR start "ruleCardinality"
    // InternalEclParser.g:879:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:883:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalEclParser.g:884:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalEclParser.g:884:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalEclParser.g:885:3: ( rule__Cardinality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getGroup()); 
            }
            // InternalEclParser.g:886:3: ( rule__Cardinality__Group__0 )
            // InternalEclParser.g:886:4: rule__Cardinality__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCardinality"


    // $ANTLR start "entryRuleComparison"
    // InternalEclParser.g:895:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:896:1: ( ruleComparison EOF )
            // InternalEclParser.g:897:1: ruleComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparison"


    // $ANTLR start "ruleComparison"
    // InternalEclParser.g:904:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:908:2: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalEclParser.g:909:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalEclParser.g:909:2: ( ( rule__Comparison__Alternatives ) )
            // InternalEclParser.g:910:3: ( rule__Comparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:911:3: ( rule__Comparison__Alternatives )
            // InternalEclParser.g:911:4: rule__Comparison__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Comparison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getComparisonAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparison"


    // $ANTLR start "entryRuleAttributeComparison"
    // InternalEclParser.g:920:1: entryRuleAttributeComparison : ruleAttributeComparison EOF ;
    public final void entryRuleAttributeComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:921:1: ( ruleAttributeComparison EOF )
            // InternalEclParser.g:922:1: ruleAttributeComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeComparisonRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeComparison"


    // $ANTLR start "ruleAttributeComparison"
    // InternalEclParser.g:929:1: ruleAttributeComparison : ( ( rule__AttributeComparison__Alternatives ) ) ;
    public final void ruleAttributeComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:933:2: ( ( ( rule__AttributeComparison__Alternatives ) ) )
            // InternalEclParser.g:934:2: ( ( rule__AttributeComparison__Alternatives ) )
            {
            // InternalEclParser.g:934:2: ( ( rule__AttributeComparison__Alternatives ) )
            // InternalEclParser.g:935:3: ( rule__AttributeComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:936:3: ( rule__AttributeComparison__Alternatives )
            // InternalEclParser.g:936:4: rule__AttributeComparison__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeComparison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeComparisonAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeComparison"


    // $ANTLR start "entryRuleDataTypeComparison"
    // InternalEclParser.g:945:1: entryRuleDataTypeComparison : ruleDataTypeComparison EOF ;
    public final void entryRuleDataTypeComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:946:1: ( ruleDataTypeComparison EOF )
            // InternalEclParser.g:947:1: ruleDataTypeComparison EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeComparisonRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDataTypeComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeComparisonRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDataTypeComparison"


    // $ANTLR start "ruleDataTypeComparison"
    // InternalEclParser.g:954:1: ruleDataTypeComparison : ( ( rule__DataTypeComparison__Alternatives ) ) ;
    public final void ruleDataTypeComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:958:2: ( ( ( rule__DataTypeComparison__Alternatives ) ) )
            // InternalEclParser.g:959:2: ( ( rule__DataTypeComparison__Alternatives ) )
            {
            // InternalEclParser.g:959:2: ( ( rule__DataTypeComparison__Alternatives ) )
            // InternalEclParser.g:960:3: ( rule__DataTypeComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:961:3: ( rule__DataTypeComparison__Alternatives )
            // InternalEclParser.g:961:4: rule__DataTypeComparison__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DataTypeComparison__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDataTypeComparison"


    // $ANTLR start "entryRuleAttributeValueEquals"
    // InternalEclParser.g:970:1: entryRuleAttributeValueEquals : ruleAttributeValueEquals EOF ;
    public final void entryRuleAttributeValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:971:1: ( ruleAttributeValueEquals EOF )
            // InternalEclParser.g:972:1: ruleAttributeValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeValueEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValueEquals"


    // $ANTLR start "ruleAttributeValueEquals"
    // InternalEclParser.g:979:1: ruleAttributeValueEquals : ( ( rule__AttributeValueEquals__Group__0 ) ) ;
    public final void ruleAttributeValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:983:2: ( ( ( rule__AttributeValueEquals__Group__0 ) ) )
            // InternalEclParser.g:984:2: ( ( rule__AttributeValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:984:2: ( ( rule__AttributeValueEquals__Group__0 ) )
            // InternalEclParser.g:985:3: ( rule__AttributeValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:986:3: ( rule__AttributeValueEquals__Group__0 )
            // InternalEclParser.g:986:4: rule__AttributeValueEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValueEquals"


    // $ANTLR start "entryRuleAttributeValueNotEquals"
    // InternalEclParser.g:995:1: entryRuleAttributeValueNotEquals : ruleAttributeValueNotEquals EOF ;
    public final void entryRuleAttributeValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:996:1: ( ruleAttributeValueNotEquals EOF )
            // InternalEclParser.g:997:1: ruleAttributeValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleAttributeValueNotEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueNotEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValueNotEquals"


    // $ANTLR start "ruleAttributeValueNotEquals"
    // InternalEclParser.g:1004:1: ruleAttributeValueNotEquals : ( ( rule__AttributeValueNotEquals__Group__0 ) ) ;
    public final void ruleAttributeValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1008:2: ( ( ( rule__AttributeValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1009:2: ( ( rule__AttributeValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1009:2: ( ( rule__AttributeValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1010:3: ( rule__AttributeValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1011:3: ( rule__AttributeValueNotEquals__Group__0 )
            // InternalEclParser.g:1011:4: rule__AttributeValueNotEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueNotEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValueNotEquals"


    // $ANTLR start "entryRuleBooleanValueEquals"
    // InternalEclParser.g:1020:1: entryRuleBooleanValueEquals : ruleBooleanValueEquals EOF ;
    public final void entryRuleBooleanValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1021:1: ( ruleBooleanValueEquals EOF )
            // InternalEclParser.g:1022:1: ruleBooleanValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanValueEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValueEquals"


    // $ANTLR start "ruleBooleanValueEquals"
    // InternalEclParser.g:1029:1: ruleBooleanValueEquals : ( ( rule__BooleanValueEquals__Group__0 ) ) ;
    public final void ruleBooleanValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1033:2: ( ( ( rule__BooleanValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1034:2: ( ( rule__BooleanValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1034:2: ( ( rule__BooleanValueEquals__Group__0 ) )
            // InternalEclParser.g:1035:3: ( rule__BooleanValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1036:3: ( rule__BooleanValueEquals__Group__0 )
            // InternalEclParser.g:1036:4: rule__BooleanValueEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValueEquals"


    // $ANTLR start "entryRuleBooleanValueNotEquals"
    // InternalEclParser.g:1045:1: entryRuleBooleanValueNotEquals : ruleBooleanValueNotEquals EOF ;
    public final void entryRuleBooleanValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1046:1: ( ruleBooleanValueNotEquals EOF )
            // InternalEclParser.g:1047:1: ruleBooleanValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBooleanValueNotEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueNotEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleBooleanValueNotEquals"


    // $ANTLR start "ruleBooleanValueNotEquals"
    // InternalEclParser.g:1054:1: ruleBooleanValueNotEquals : ( ( rule__BooleanValueNotEquals__Group__0 ) ) ;
    public final void ruleBooleanValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1058:2: ( ( ( rule__BooleanValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1059:2: ( ( rule__BooleanValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1059:2: ( ( rule__BooleanValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1060:3: ( rule__BooleanValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1061:3: ( rule__BooleanValueNotEquals__Group__0 )
            // InternalEclParser.g:1061:4: rule__BooleanValueNotEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueNotEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBooleanValueNotEquals"


    // $ANTLR start "entryRuleStringValueEquals"
    // InternalEclParser.g:1070:1: entryRuleStringValueEquals : ruleStringValueEquals EOF ;
    public final void entryRuleStringValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1071:1: ( ruleStringValueEquals EOF )
            // InternalEclParser.g:1072:1: ruleStringValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringValueEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValueEquals"


    // $ANTLR start "ruleStringValueEquals"
    // InternalEclParser.g:1079:1: ruleStringValueEquals : ( ( rule__StringValueEquals__Group__0 ) ) ;
    public final void ruleStringValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1083:2: ( ( ( rule__StringValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1084:2: ( ( rule__StringValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1084:2: ( ( rule__StringValueEquals__Group__0 ) )
            // InternalEclParser.g:1085:3: ( rule__StringValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1086:3: ( rule__StringValueEquals__Group__0 )
            // InternalEclParser.g:1086:4: rule__StringValueEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValueEquals"


    // $ANTLR start "entryRuleStringValueNotEquals"
    // InternalEclParser.g:1095:1: entryRuleStringValueNotEquals : ruleStringValueNotEquals EOF ;
    public final void entryRuleStringValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1096:1: ( ruleStringValueNotEquals EOF )
            // InternalEclParser.g:1097:1: ruleStringValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleStringValueNotEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueNotEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringValueNotEquals"


    // $ANTLR start "ruleStringValueNotEquals"
    // InternalEclParser.g:1104:1: ruleStringValueNotEquals : ( ( rule__StringValueNotEquals__Group__0 ) ) ;
    public final void ruleStringValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1108:2: ( ( ( rule__StringValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1109:2: ( ( rule__StringValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1109:2: ( ( rule__StringValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1110:3: ( rule__StringValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1111:3: ( rule__StringValueNotEquals__Group__0 )
            // InternalEclParser.g:1111:4: rule__StringValueNotEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueNotEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueNotEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueEquals"
    // InternalEclParser.g:1120:1: entryRuleIntegerValueEquals : ruleIntegerValueEquals EOF ;
    public final void entryRuleIntegerValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1121:1: ( ruleIntegerValueEquals EOF )
            // InternalEclParser.g:1122:1: ruleIntegerValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueEquals"


    // $ANTLR start "ruleIntegerValueEquals"
    // InternalEclParser.g:1129:1: ruleIntegerValueEquals : ( ( rule__IntegerValueEquals__Group__0 ) ) ;
    public final void ruleIntegerValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1133:2: ( ( ( rule__IntegerValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1134:2: ( ( rule__IntegerValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1134:2: ( ( rule__IntegerValueEquals__Group__0 ) )
            // InternalEclParser.g:1135:3: ( rule__IntegerValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1136:3: ( rule__IntegerValueEquals__Group__0 )
            // InternalEclParser.g:1136:4: rule__IntegerValueEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueEquals"


    // $ANTLR start "entryRuleIntegerValueNotEquals"
    // InternalEclParser.g:1145:1: entryRuleIntegerValueNotEquals : ruleIntegerValueNotEquals EOF ;
    public final void entryRuleIntegerValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1146:1: ( ruleIntegerValueNotEquals EOF )
            // InternalEclParser.g:1147:1: ruleIntegerValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueNotEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueNotEquals"


    // $ANTLR start "ruleIntegerValueNotEquals"
    // InternalEclParser.g:1154:1: ruleIntegerValueNotEquals : ( ( rule__IntegerValueNotEquals__Group__0 ) ) ;
    public final void ruleIntegerValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1158:2: ( ( ( rule__IntegerValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1159:2: ( ( rule__IntegerValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1159:2: ( ( rule__IntegerValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1160:3: ( rule__IntegerValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1161:3: ( rule__IntegerValueNotEquals__Group__0 )
            // InternalEclParser.g:1161:4: rule__IntegerValueNotEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueNotEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueNotEquals"


    // $ANTLR start "entryRuleIntegerValueGreaterThan"
    // InternalEclParser.g:1170:1: entryRuleIntegerValueGreaterThan : ruleIntegerValueGreaterThan EOF ;
    public final void entryRuleIntegerValueGreaterThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1171:1: ( ruleIntegerValueGreaterThan EOF )
            // InternalEclParser.g:1172:1: ruleIntegerValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueGreaterThan();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueGreaterThan"


    // $ANTLR start "ruleIntegerValueGreaterThan"
    // InternalEclParser.g:1179:1: ruleIntegerValueGreaterThan : ( ( rule__IntegerValueGreaterThan__Group__0 ) ) ;
    public final void ruleIntegerValueGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1183:2: ( ( ( rule__IntegerValueGreaterThan__Group__0 ) ) )
            // InternalEclParser.g:1184:2: ( ( rule__IntegerValueGreaterThan__Group__0 ) )
            {
            // InternalEclParser.g:1184:2: ( ( rule__IntegerValueGreaterThan__Group__0 ) )
            // InternalEclParser.g:1185:3: ( rule__IntegerValueGreaterThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1186:3: ( rule__IntegerValueGreaterThan__Group__0 )
            // InternalEclParser.g:1186:4: rule__IntegerValueGreaterThan__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThan__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueGreaterThan"


    // $ANTLR start "entryRuleIntegerValueLessThan"
    // InternalEclParser.g:1195:1: entryRuleIntegerValueLessThan : ruleIntegerValueLessThan EOF ;
    public final void entryRuleIntegerValueLessThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1196:1: ( ruleIntegerValueLessThan EOF )
            // InternalEclParser.g:1197:1: ruleIntegerValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueLessThan();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueLessThan"


    // $ANTLR start "ruleIntegerValueLessThan"
    // InternalEclParser.g:1204:1: ruleIntegerValueLessThan : ( ( rule__IntegerValueLessThan__Group__0 ) ) ;
    public final void ruleIntegerValueLessThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1208:2: ( ( ( rule__IntegerValueLessThan__Group__0 ) ) )
            // InternalEclParser.g:1209:2: ( ( rule__IntegerValueLessThan__Group__0 ) )
            {
            // InternalEclParser.g:1209:2: ( ( rule__IntegerValueLessThan__Group__0 ) )
            // InternalEclParser.g:1210:3: ( rule__IntegerValueLessThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1211:3: ( rule__IntegerValueLessThan__Group__0 )
            // InternalEclParser.g:1211:4: rule__IntegerValueLessThan__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThan__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueLessThan"


    // $ANTLR start "entryRuleIntegerValueGreaterThanEquals"
    // InternalEclParser.g:1220:1: entryRuleIntegerValueGreaterThanEquals : ruleIntegerValueGreaterThanEquals EOF ;
    public final void entryRuleIntegerValueGreaterThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1221:1: ( ruleIntegerValueGreaterThanEquals EOF )
            // InternalEclParser.g:1222:1: ruleIntegerValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueGreaterThanEquals"


    // $ANTLR start "ruleIntegerValueGreaterThanEquals"
    // InternalEclParser.g:1229:1: ruleIntegerValueGreaterThanEquals : ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) ) ;
    public final void ruleIntegerValueGreaterThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1233:2: ( ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1234:2: ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1234:2: ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) )
            // InternalEclParser.g:1235:3: ( rule__IntegerValueGreaterThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1236:3: ( rule__IntegerValueGreaterThanEquals__Group__0 )
            // InternalEclParser.g:1236:4: rule__IntegerValueGreaterThanEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThanEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueGreaterThanEquals"


    // $ANTLR start "entryRuleIntegerValueLessThanEquals"
    // InternalEclParser.g:1245:1: entryRuleIntegerValueLessThanEquals : ruleIntegerValueLessThanEquals EOF ;
    public final void entryRuleIntegerValueLessThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1246:1: ( ruleIntegerValueLessThanEquals EOF )
            // InternalEclParser.g:1247:1: ruleIntegerValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleIntegerValueLessThanEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIntegerValueLessThanEquals"


    // $ANTLR start "ruleIntegerValueLessThanEquals"
    // InternalEclParser.g:1254:1: ruleIntegerValueLessThanEquals : ( ( rule__IntegerValueLessThanEquals__Group__0 ) ) ;
    public final void ruleIntegerValueLessThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1258:2: ( ( ( rule__IntegerValueLessThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1259:2: ( ( rule__IntegerValueLessThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1259:2: ( ( rule__IntegerValueLessThanEquals__Group__0 ) )
            // InternalEclParser.g:1260:3: ( rule__IntegerValueLessThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1261:3: ( rule__IntegerValueLessThanEquals__Group__0 )
            // InternalEclParser.g:1261:4: rule__IntegerValueLessThanEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThanEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIntegerValueLessThanEquals"


    // $ANTLR start "entryRuleDecimalValueEquals"
    // InternalEclParser.g:1270:1: entryRuleDecimalValueEquals : ruleDecimalValueEquals EOF ;
    public final void entryRuleDecimalValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1271:1: ( ruleDecimalValueEquals EOF )
            // InternalEclParser.g:1272:1: ruleDecimalValueEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueEquals"


    // $ANTLR start "ruleDecimalValueEquals"
    // InternalEclParser.g:1279:1: ruleDecimalValueEquals : ( ( rule__DecimalValueEquals__Group__0 ) ) ;
    public final void ruleDecimalValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1283:2: ( ( ( rule__DecimalValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1284:2: ( ( rule__DecimalValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1284:2: ( ( rule__DecimalValueEquals__Group__0 ) )
            // InternalEclParser.g:1285:3: ( rule__DecimalValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1286:3: ( rule__DecimalValueEquals__Group__0 )
            // InternalEclParser.g:1286:4: rule__DecimalValueEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueEquals"


    // $ANTLR start "entryRuleDecimalValueNotEquals"
    // InternalEclParser.g:1295:1: entryRuleDecimalValueNotEquals : ruleDecimalValueNotEquals EOF ;
    public final void entryRuleDecimalValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1296:1: ( ruleDecimalValueNotEquals EOF )
            // InternalEclParser.g:1297:1: ruleDecimalValueNotEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueNotEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueNotEquals"


    // $ANTLR start "ruleDecimalValueNotEquals"
    // InternalEclParser.g:1304:1: ruleDecimalValueNotEquals : ( ( rule__DecimalValueNotEquals__Group__0 ) ) ;
    public final void ruleDecimalValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1308:2: ( ( ( rule__DecimalValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1309:2: ( ( rule__DecimalValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1309:2: ( ( rule__DecimalValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1310:3: ( rule__DecimalValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1311:3: ( rule__DecimalValueNotEquals__Group__0 )
            // InternalEclParser.g:1311:4: rule__DecimalValueNotEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueNotEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueNotEquals"


    // $ANTLR start "entryRuleDecimalValueGreaterThan"
    // InternalEclParser.g:1320:1: entryRuleDecimalValueGreaterThan : ruleDecimalValueGreaterThan EOF ;
    public final void entryRuleDecimalValueGreaterThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1321:1: ( ruleDecimalValueGreaterThan EOF )
            // InternalEclParser.g:1322:1: ruleDecimalValueGreaterThan EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueGreaterThan();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueGreaterThan"


    // $ANTLR start "ruleDecimalValueGreaterThan"
    // InternalEclParser.g:1329:1: ruleDecimalValueGreaterThan : ( ( rule__DecimalValueGreaterThan__Group__0 ) ) ;
    public final void ruleDecimalValueGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1333:2: ( ( ( rule__DecimalValueGreaterThan__Group__0 ) ) )
            // InternalEclParser.g:1334:2: ( ( rule__DecimalValueGreaterThan__Group__0 ) )
            {
            // InternalEclParser.g:1334:2: ( ( rule__DecimalValueGreaterThan__Group__0 ) )
            // InternalEclParser.g:1335:3: ( rule__DecimalValueGreaterThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1336:3: ( rule__DecimalValueGreaterThan__Group__0 )
            // InternalEclParser.g:1336:4: rule__DecimalValueGreaterThan__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThan__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueGreaterThan"


    // $ANTLR start "entryRuleDecimalValueLessThan"
    // InternalEclParser.g:1345:1: entryRuleDecimalValueLessThan : ruleDecimalValueLessThan EOF ;
    public final void entryRuleDecimalValueLessThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1346:1: ( ruleDecimalValueLessThan EOF )
            // InternalEclParser.g:1347:1: ruleDecimalValueLessThan EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueLessThan();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueLessThan"


    // $ANTLR start "ruleDecimalValueLessThan"
    // InternalEclParser.g:1354:1: ruleDecimalValueLessThan : ( ( rule__DecimalValueLessThan__Group__0 ) ) ;
    public final void ruleDecimalValueLessThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1358:2: ( ( ( rule__DecimalValueLessThan__Group__0 ) ) )
            // InternalEclParser.g:1359:2: ( ( rule__DecimalValueLessThan__Group__0 ) )
            {
            // InternalEclParser.g:1359:2: ( ( rule__DecimalValueLessThan__Group__0 ) )
            // InternalEclParser.g:1360:3: ( rule__DecimalValueLessThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1361:3: ( rule__DecimalValueLessThan__Group__0 )
            // InternalEclParser.g:1361:4: rule__DecimalValueLessThan__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThan__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueLessThan"


    // $ANTLR start "entryRuleDecimalValueGreaterThanEquals"
    // InternalEclParser.g:1370:1: entryRuleDecimalValueGreaterThanEquals : ruleDecimalValueGreaterThanEquals EOF ;
    public final void entryRuleDecimalValueGreaterThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1371:1: ( ruleDecimalValueGreaterThanEquals EOF )
            // InternalEclParser.g:1372:1: ruleDecimalValueGreaterThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueGreaterThanEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueGreaterThanEquals"


    // $ANTLR start "ruleDecimalValueGreaterThanEquals"
    // InternalEclParser.g:1379:1: ruleDecimalValueGreaterThanEquals : ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) ) ;
    public final void ruleDecimalValueGreaterThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1383:2: ( ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1384:2: ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1384:2: ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) )
            // InternalEclParser.g:1385:3: ( rule__DecimalValueGreaterThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1386:3: ( rule__DecimalValueGreaterThanEquals__Group__0 )
            // InternalEclParser.g:1386:4: rule__DecimalValueGreaterThanEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThanEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueGreaterThanEquals"


    // $ANTLR start "entryRuleDecimalValueLessThanEquals"
    // InternalEclParser.g:1395:1: entryRuleDecimalValueLessThanEquals : ruleDecimalValueLessThanEquals EOF ;
    public final void entryRuleDecimalValueLessThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1396:1: ( ruleDecimalValueLessThanEquals EOF )
            // InternalEclParser.g:1397:1: ruleDecimalValueLessThanEquals EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimalValueLessThanEquals();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDecimalValueLessThanEquals"


    // $ANTLR start "ruleDecimalValueLessThanEquals"
    // InternalEclParser.g:1404:1: ruleDecimalValueLessThanEquals : ( ( rule__DecimalValueLessThanEquals__Group__0 ) ) ;
    public final void ruleDecimalValueLessThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1408:2: ( ( ( rule__DecimalValueLessThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1409:2: ( ( rule__DecimalValueLessThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1409:2: ( ( rule__DecimalValueLessThanEquals__Group__0 ) )
            // InternalEclParser.g:1410:3: ( rule__DecimalValueLessThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1411:3: ( rule__DecimalValueLessThanEquals__Group__0 )
            // InternalEclParser.g:1411:4: rule__DecimalValueLessThanEquals__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThanEquals__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDecimalValueLessThanEquals"


    // $ANTLR start "entryRuleNestedExpression"
    // InternalEclParser.g:1420:1: entryRuleNestedExpression : ruleNestedExpression EOF ;
    public final void entryRuleNestedExpression() throws RecognitionException {
        try {
            // InternalEclParser.g:1421:1: ( ruleNestedExpression EOF )
            // InternalEclParser.g:1422:1: ruleNestedExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNestedExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNestedExpression"


    // $ANTLR start "ruleNestedExpression"
    // InternalEclParser.g:1429:1: ruleNestedExpression : ( ( rule__NestedExpression__Group__0 ) ) ;
    public final void ruleNestedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1433:2: ( ( ( rule__NestedExpression__Group__0 ) ) )
            // InternalEclParser.g:1434:2: ( ( rule__NestedExpression__Group__0 ) )
            {
            // InternalEclParser.g:1434:2: ( ( rule__NestedExpression__Group__0 ) )
            // InternalEclParser.g:1435:3: ( rule__NestedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getGroup()); 
            }
            // InternalEclParser.g:1436:3: ( rule__NestedExpression__Group__0 )
            // InternalEclParser.g:1436:4: rule__NestedExpression__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedExpression__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNestedExpression"


    // $ANTLR start "entryRuleSnomedIdentifier"
    // InternalEclParser.g:1445:1: entryRuleSnomedIdentifier : ruleSnomedIdentifier EOF ;
    public final void entryRuleSnomedIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1449:1: ( ruleSnomedIdentifier EOF )
            // InternalEclParser.g:1450:1: ruleSnomedIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleSnomedIdentifier"


    // $ANTLR start "ruleSnomedIdentifier"
    // InternalEclParser.g:1460:1: ruleSnomedIdentifier : ( ( rule__SnomedIdentifier__Group__0 ) ) ;
    public final void ruleSnomedIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1465:2: ( ( ( rule__SnomedIdentifier__Group__0 ) ) )
            // InternalEclParser.g:1466:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            {
            // InternalEclParser.g:1466:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            // InternalEclParser.g:1467:3: ( rule__SnomedIdentifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getGroup()); 
            }
            // InternalEclParser.g:1468:3: ( rule__SnomedIdentifier__Group__0 )
            // InternalEclParser.g:1468:4: rule__SnomedIdentifier__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleSnomedIdentifier"


    // $ANTLR start "entryRuleNonNegativeInteger"
    // InternalEclParser.g:1478:1: entryRuleNonNegativeInteger : ruleNonNegativeInteger EOF ;
    public final void entryRuleNonNegativeInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1482:1: ( ruleNonNegativeInteger EOF )
            // InternalEclParser.g:1483:1: ruleNonNegativeInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeInteger"


    // $ANTLR start "ruleNonNegativeInteger"
    // InternalEclParser.g:1493:1: ruleNonNegativeInteger : ( ( rule__NonNegativeInteger__Alternatives ) ) ;
    public final void ruleNonNegativeInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1498:2: ( ( ( rule__NonNegativeInteger__Alternatives ) ) )
            // InternalEclParser.g:1499:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            {
            // InternalEclParser.g:1499:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            // InternalEclParser.g:1500:3: ( rule__NonNegativeInteger__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1501:3: ( rule__NonNegativeInteger__Alternatives )
            // InternalEclParser.g:1501:4: rule__NonNegativeInteger__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeInteger"


    // $ANTLR start "entryRuleMaxValue"
    // InternalEclParser.g:1511:1: entryRuleMaxValue : ruleMaxValue EOF ;
    public final void entryRuleMaxValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1515:1: ( ruleMaxValue EOF )
            // InternalEclParser.g:1516:1: ruleMaxValue EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxValueRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleMaxValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxValueRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleMaxValue"


    // $ANTLR start "ruleMaxValue"
    // InternalEclParser.g:1526:1: ruleMaxValue : ( ( rule__MaxValue__Alternatives ) ) ;
    public final void ruleMaxValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1531:2: ( ( ( rule__MaxValue__Alternatives ) ) )
            // InternalEclParser.g:1532:2: ( ( rule__MaxValue__Alternatives ) )
            {
            // InternalEclParser.g:1532:2: ( ( rule__MaxValue__Alternatives ) )
            // InternalEclParser.g:1533:3: ( rule__MaxValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxValueAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1534:3: ( rule__MaxValue__Alternatives )
            // InternalEclParser.g:1534:4: rule__MaxValue__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MaxValue__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMaxValueAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleMaxValue"


    // $ANTLR start "entryRuleInteger"
    // InternalEclParser.g:1544:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1548:1: ( ruleInteger EOF )
            // InternalEclParser.g:1549:1: ruleInteger EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // InternalEclParser.g:1559:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1564:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalEclParser.g:1565:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalEclParser.g:1565:2: ( ( rule__Integer__Group__0 ) )
            // InternalEclParser.g:1566:3: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalEclParser.g:1567:3: ( rule__Integer__Group__0 )
            // InternalEclParser.g:1567:4: rule__Integer__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "entryRuleDecimal"
    // InternalEclParser.g:1577:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1581:1: ( ruleDecimal EOF )
            // InternalEclParser.g:1582:1: ruleDecimal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleDecimal"


    // $ANTLR start "ruleDecimal"
    // InternalEclParser.g:1592:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1597:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalEclParser.g:1598:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalEclParser.g:1598:2: ( ( rule__Decimal__Group__0 ) )
            // InternalEclParser.g:1599:3: ( rule__Decimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getGroup()); 
            }
            // InternalEclParser.g:1600:3: ( rule__Decimal__Group__0 )
            // InternalEclParser.g:1600:4: rule__Decimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleDecimal"


    // $ANTLR start "entryRuleNonNegativeDecimal"
    // InternalEclParser.g:1610:1: entryRuleNonNegativeDecimal : ruleNonNegativeDecimal EOF ;
    public final void entryRuleNonNegativeDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1614:1: ( ruleNonNegativeDecimal EOF )
            // InternalEclParser.g:1615:1: ruleNonNegativeDecimal EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNonNegativeDecimal"


    // $ANTLR start "ruleNonNegativeDecimal"
    // InternalEclParser.g:1625:1: ruleNonNegativeDecimal : ( ( rule__NonNegativeDecimal__Group__0 ) ) ;
    public final void ruleNonNegativeDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1630:2: ( ( ( rule__NonNegativeDecimal__Group__0 ) ) )
            // InternalEclParser.g:1631:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            {
            // InternalEclParser.g:1631:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            // InternalEclParser.g:1632:3: ( rule__NonNegativeDecimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); 
            }
            // InternalEclParser.g:1633:3: ( rule__NonNegativeDecimal__Group__0 )
            // InternalEclParser.g:1633:4: rule__NonNegativeDecimal__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNonNegativeDecimal"


    // $ANTLR start "entryRuleBoolean"
    // InternalEclParser.g:1643:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1647:1: ( ruleBoolean EOF )
            // InternalEclParser.g:1648:1: ruleBoolean EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanRule()); 
            }
            pushFollow(FollowSets000.FOLLOW_1);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanRule()); 
            }
            match(input,EOF,FollowSets000.FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleBoolean"


    // $ANTLR start "ruleBoolean"
    // InternalEclParser.g:1658:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1663:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalEclParser.g:1664:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalEclParser.g:1664:2: ( ( rule__Boolean__Alternatives ) )
            // InternalEclParser.g:1665:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1666:3: ( rule__Boolean__Alternatives )
            // InternalEclParser.g:1666:4: rule__Boolean__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Boolean__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleBoolean"


    // $ANTLR start "rule__AndExpressionConstraint__Alternatives_1_1"
    // InternalEclParser.g:1675:1: rule__AndExpressionConstraint__Alternatives_1_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndExpressionConstraint__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1679:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_CONJUNCTION) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_COMMA) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEclParser.g:1680:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1680:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1681:3: RULE_CONJUNCTION
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionConstraintAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1686:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1686:2: ( RULE_COMMA )
                    // InternalEclParser.g:1687:3: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); 
                    }
                    match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndExpressionConstraintAccess().getCOMMATerminalRuleCall_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Alternatives_1_1"


    // $ANTLR start "rule__SubExpressionConstraint__Alternatives"
    // InternalEclParser.g:1696:1: rule__SubExpressionConstraint__Alternatives : ( ( ruleChildOf ) | ( ruleChildOrSelfOf ) | ( ruleDescendantOf ) | ( ruleDescendantOrSelfOf ) | ( ruleParentOf ) | ( ruleParentOrSelfOf ) | ( ruleAncestorOf ) | ( ruleAncestorOrSelfOf ) | ( ruleEclFocusConcept ) );
    public final void rule__SubExpressionConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1700:1: ( ( ruleChildOf ) | ( ruleChildOrSelfOf ) | ( ruleDescendantOf ) | ( ruleDescendantOrSelfOf ) | ( ruleParentOf ) | ( ruleParentOrSelfOf ) | ( ruleAncestorOf ) | ( ruleAncestorOrSelfOf ) | ( ruleEclFocusConcept ) )
            int alt2=9;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt2=1;
                }
                break;
            case RULE_DBL_LT_EM:
                {
                alt2=2;
                }
                break;
            case RULE_LT:
                {
                alt2=3;
                }
                break;
            case RULE_DBL_LT:
                {
                alt2=4;
                }
                break;
            case RULE_GT_EM:
                {
                alt2=5;
                }
                break;
            case RULE_DBL_GT_EM:
                {
                alt2=6;
                }
                break;
            case RULE_GT:
                {
                alt2=7;
                }
                break;
            case RULE_DBL_GT:
                {
                alt2=8;
                }
                break;
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt2=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalEclParser.g:1701:2: ( ruleChildOf )
                    {
                    // InternalEclParser.g:1701:2: ( ruleChildOf )
                    // InternalEclParser.g:1702:3: ruleChildOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleChildOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getChildOfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1707:2: ( ruleChildOrSelfOf )
                    {
                    // InternalEclParser.g:1707:2: ( ruleChildOrSelfOf )
                    // InternalEclParser.g:1708:3: ruleChildOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleChildOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getChildOrSelfOfParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1713:2: ( ruleDescendantOf )
                    {
                    // InternalEclParser.g:1713:2: ( ruleDescendantOf )
                    // InternalEclParser.g:1714:3: ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1719:2: ( ruleDescendantOrSelfOf )
                    {
                    // InternalEclParser.g:1719:2: ( ruleDescendantOrSelfOf )
                    // InternalEclParser.g:1720:3: ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEclParser.g:1725:2: ( ruleParentOf )
                    {
                    // InternalEclParser.g:1725:2: ( ruleParentOf )
                    // InternalEclParser.g:1726:3: ruleParentOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParentOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEclParser.g:1731:2: ( ruleParentOrSelfOf )
                    {
                    // InternalEclParser.g:1731:2: ( ruleParentOrSelfOf )
                    // InternalEclParser.g:1732:3: ruleParentOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParentOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getParentOrSelfOfParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEclParser.g:1737:2: ( ruleAncestorOf )
                    {
                    // InternalEclParser.g:1737:2: ( ruleAncestorOf )
                    // InternalEclParser.g:1738:3: ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEclParser.g:1743:2: ( ruleAncestorOrSelfOf )
                    {
                    // InternalEclParser.g:1743:2: ( ruleAncestorOrSelfOf )
                    // InternalEclParser.g:1744:3: ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEclParser.g:1749:2: ( ruleEclFocusConcept )
                    {
                    // InternalEclParser.g:1749:2: ( ruleEclFocusConcept )
                    // InternalEclParser.g:1750:3: ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_8()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubExpressionConstraint__Alternatives"


    // $ANTLR start "rule__EclFocusConcept__Alternatives"
    // InternalEclParser.g:1759:1: rule__EclFocusConcept__Alternatives : ( ( ruleMemberOf ) | ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) );
    public final void rule__EclFocusConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1763:1: ( ( ruleMemberOf ) | ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_CARET:
                {
                alt3=1;
                }
                break;
            case RULE_DIGIT_NONZERO:
                {
                alt3=2;
                }
                break;
            case RULE_WILDCARD:
                {
                alt3=3;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt3=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEclParser.g:1764:2: ( ruleMemberOf )
                    {
                    // InternalEclParser.g:1764:2: ( ruleMemberOf )
                    // InternalEclParser.g:1765:3: ruleMemberOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleMemberOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEclFocusConceptAccess().getMemberOfParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1770:2: ( ruleEclConceptReference )
                    {
                    // InternalEclParser.g:1770:2: ( ruleEclConceptReference )
                    // InternalEclParser.g:1771:3: ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEclFocusConceptAccess().getEclConceptReferenceParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1776:2: ( ruleAny )
                    {
                    // InternalEclParser.g:1776:2: ( ruleAny )
                    // InternalEclParser.g:1777:3: ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAny();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEclFocusConceptAccess().getAnyParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1782:2: ( ruleNestedExpression )
                    {
                    // InternalEclParser.g:1782:2: ( ruleNestedExpression )
                    // InternalEclParser.g:1783:3: ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getEclFocusConceptAccess().getNestedExpressionParserRuleCall_3()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclFocusConcept__Alternatives"


    // $ANTLR start "rule__MemberOf__ConstraintAlternatives_1_0"
    // InternalEclParser.g:1792:1: rule__MemberOf__ConstraintAlternatives_1_0 : ( ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) );
    public final void rule__MemberOf__ConstraintAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1796:1: ( ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_DIGIT_NONZERO:
                {
                alt4=1;
                }
                break;
            case RULE_WILDCARD:
                {
                alt4=2;
                }
                break;
            case RULE_ROUND_OPEN:
                {
                alt4=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEclParser.g:1797:2: ( ruleEclConceptReference )
                    {
                    // InternalEclParser.g:1797:2: ( ruleEclConceptReference )
                    // InternalEclParser.g:1798:3: ruleEclConceptReference
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEclConceptReference();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberOfAccess().getConstraintEclConceptReferenceParserRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1803:2: ( ruleAny )
                    {
                    // InternalEclParser.g:1803:2: ( ruleAny )
                    // InternalEclParser.g:1804:3: ruleAny
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAny();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberOfAccess().getConstraintAnyParserRuleCall_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1809:2: ( ruleNestedExpression )
                    {
                    // InternalEclParser.g:1809:2: ( ruleNestedExpression )
                    // InternalEclParser.g:1810:3: ruleNestedExpression
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNestedExpression();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMemberOfAccess().getConstraintNestedExpressionParserRuleCall_1_0_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__ConstraintAlternatives_1_0"


    // $ANTLR start "rule__AndRefinement__Alternatives_1_0_1"
    // InternalEclParser.g:1819:1: rule__AndRefinement__Alternatives_1_0_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndRefinement__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1823:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_CONJUNCTION) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_COMMA) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalEclParser.g:1824:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1824:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1825:3: RULE_CONJUNCTION
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); 
                    }
                    match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndRefinementAccess().getCONJUNCTIONTerminalRuleCall_1_0_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1830:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1830:2: ( RULE_COMMA )
                    // InternalEclParser.g:1831:3: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); 
                    }
                    match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndRefinementAccess().getCOMMATerminalRuleCall_1_0_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Alternatives_1_0_1"


    // $ANTLR start "rule__SubRefinement__Alternatives"
    // InternalEclParser.g:1840:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) );
    public final void rule__SubRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1844:1: ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEclParser.g:1845:2: ( ruleAttributeConstraint )
                    {
                    // InternalEclParser.g:1845:2: ( ruleAttributeConstraint )
                    // InternalEclParser.g:1846:3: ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1851:2: ( ruleEclAttributeGroup )
                    {
                    // InternalEclParser.g:1851:2: ( ruleEclAttributeGroup )
                    // InternalEclParser.g:1852:3: ruleEclAttributeGroup
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEclAttributeGroup();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1857:2: ( ruleNestedRefinement )
                    {
                    // InternalEclParser.g:1857:2: ( ruleNestedRefinement )
                    // InternalEclParser.g:1858:3: ruleNestedRefinement
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNestedRefinement();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubRefinementAccess().getNestedRefinementParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubRefinement__Alternatives"


    // $ANTLR start "rule__AndAttributeSet__Alternatives_1_1"
    // InternalEclParser.g:1867:1: rule__AndAttributeSet__Alternatives_1_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndAttributeSet__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1871:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_CONJUNCTION) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_COMMA) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEclParser.g:1872:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1872:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1873:3: RULE_CONJUNCTION
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_CONJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAttributeSetAccess().getCONJUNCTIONTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1878:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1878:2: ( RULE_COMMA )
                    // InternalEclParser.g:1879:3: RULE_COMMA
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); 
                    }
                    match(input,RULE_COMMA,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAndAttributeSetAccess().getCOMMATerminalRuleCall_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Alternatives_1_1"


    // $ANTLR start "rule__SubAttributeSet__Alternatives"
    // InternalEclParser.g:1888:1: rule__SubAttributeSet__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) );
    public final void rule__SubAttributeSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1892:1: ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEclParser.g:1893:2: ( ruleAttributeConstraint )
                    {
                    // InternalEclParser.g:1893:2: ( ruleAttributeConstraint )
                    // InternalEclParser.g:1894:3: ruleAttributeConstraint
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeConstraint();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1899:2: ( ruleNestedAttributeSet )
                    {
                    // InternalEclParser.g:1899:2: ( ruleNestedAttributeSet )
                    // InternalEclParser.g:1900:3: ruleNestedAttributeSet
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNestedAttributeSet();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubAttributeSetAccess().getNestedAttributeSetParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubAttributeSet__Alternatives"


    // $ANTLR start "rule__Comparison__Alternatives"
    // InternalEclParser.g:1909:1: rule__Comparison__Alternatives : ( ( ruleAttributeComparison ) | ( ruleDataTypeComparison ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1913:1: ( ( ruleAttributeComparison ) | ( ruleDataTypeComparison ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=False && LA9_1<=True)||LA9_1==RULE_HASH||LA9_1==RULE_STRING) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_DIGIT_NONZERO||LA9_1==RULE_ROUND_OPEN||LA9_1==RULE_CARET||LA9_1==RULE_WILDCARD||(LA9_1>=RULE_LT && LA9_1<=RULE_DBL_GT_EM)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_NOT_EQUAL:
                {
                int LA9_2 = input.LA(2);

                if ( ((LA9_2>=False && LA9_2<=True)||LA9_2==RULE_HASH||LA9_2==RULE_STRING) ) {
                    alt9=2;
                }
                else if ( (LA9_2==RULE_DIGIT_NONZERO||LA9_2==RULE_ROUND_OPEN||LA9_2==RULE_CARET||LA9_2==RULE_WILDCARD||(LA9_2>=RULE_LT && LA9_2<=RULE_DBL_GT_EM)) ) {
                    alt9=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_LT:
            case RULE_GT:
            case RULE_GTE:
            case RULE_LTE:
                {
                alt9=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // InternalEclParser.g:1914:2: ( ruleAttributeComparison )
                    {
                    // InternalEclParser.g:1914:2: ( ruleAttributeComparison )
                    // InternalEclParser.g:1915:3: ruleAttributeComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeComparison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getAttributeComparisonParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1920:2: ( ruleDataTypeComparison )
                    {
                    // InternalEclParser.g:1920:2: ( ruleDataTypeComparison )
                    // InternalEclParser.g:1921:3: ruleDataTypeComparison
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDataTypeComparison();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getComparisonAccess().getDataTypeComparisonParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Comparison__Alternatives"


    // $ANTLR start "rule__AttributeComparison__Alternatives"
    // InternalEclParser.g:1930:1: rule__AttributeComparison__Alternatives : ( ( ruleAttributeValueEquals ) | ( ruleAttributeValueNotEquals ) );
    public final void rule__AttributeComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1934:1: ( ( ruleAttributeValueEquals ) | ( ruleAttributeValueNotEquals ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_EQUAL) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NOT_EQUAL) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEclParser.g:1935:2: ( ruleAttributeValueEquals )
                    {
                    // InternalEclParser.g:1935:2: ( ruleAttributeValueEquals )
                    // InternalEclParser.g:1936:3: ruleAttributeValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeValueEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeComparisonAccess().getAttributeValueEqualsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1941:2: ( ruleAttributeValueNotEquals )
                    {
                    // InternalEclParser.g:1941:2: ( ruleAttributeValueNotEquals )
                    // InternalEclParser.g:1942:3: ruleAttributeValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAttributeValueNotEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getAttributeComparisonAccess().getAttributeValueNotEqualsParserRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeComparison__Alternatives"


    // $ANTLR start "rule__DataTypeComparison__Alternatives"
    // InternalEclParser.g:1951:1: rule__DataTypeComparison__Alternatives : ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) );
    public final void rule__DataTypeComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1955:1: ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) )
            int alt11=16;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEclParser.g:1956:2: ( ruleBooleanValueEquals )
                    {
                    // InternalEclParser.g:1956:2: ( ruleBooleanValueEquals )
                    // InternalEclParser.g:1957:3: ruleBooleanValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanValueEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueEqualsParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:1962:2: ( ruleBooleanValueNotEquals )
                    {
                    // InternalEclParser.g:1962:2: ( ruleBooleanValueNotEquals )
                    // InternalEclParser.g:1963:3: ruleBooleanValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleBooleanValueNotEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getBooleanValueNotEqualsParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1968:2: ( ruleStringValueEquals )
                    {
                    // InternalEclParser.g:1968:2: ( ruleStringValueEquals )
                    // InternalEclParser.g:1969:3: ruleStringValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringValueEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getStringValueEqualsParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1974:2: ( ruleStringValueNotEquals )
                    {
                    // InternalEclParser.g:1974:2: ( ruleStringValueNotEquals )
                    // InternalEclParser.g:1975:3: ruleStringValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleStringValueNotEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getStringValueNotEqualsParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEclParser.g:1980:2: ( ruleIntegerValueEquals )
                    {
                    // InternalEclParser.g:1980:2: ( ruleIntegerValueEquals )
                    // InternalEclParser.g:1981:3: ruleIntegerValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueEqualsParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEclParser.g:1986:2: ( ruleIntegerValueNotEquals )
                    {
                    // InternalEclParser.g:1986:2: ( ruleIntegerValueNotEquals )
                    // InternalEclParser.g:1987:3: ruleIntegerValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueNotEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueNotEqualsParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEclParser.g:1992:2: ( ruleIntegerValueGreaterThan )
                    {
                    // InternalEclParser.g:1992:2: ( ruleIntegerValueGreaterThan )
                    // InternalEclParser.g:1993:3: ruleIntegerValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanParserRuleCall_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEclParser.g:1998:2: ( ruleIntegerValueGreaterThanEquals )
                    {
                    // InternalEclParser.g:1998:2: ( ruleIntegerValueGreaterThanEquals )
                    // InternalEclParser.g:1999:3: ruleIntegerValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueGreaterThanEqualsParserRuleCall_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEclParser.g:2004:2: ( ruleIntegerValueLessThan )
                    {
                    // InternalEclParser.g:2004:2: ( ruleIntegerValueLessThan )
                    // InternalEclParser.g:2005:3: ruleIntegerValueLessThan
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueLessThan();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanParserRuleCall_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEclParser.g:2010:2: ( ruleIntegerValueLessThanEquals )
                    {
                    // InternalEclParser.g:2010:2: ( ruleIntegerValueLessThanEquals )
                    // InternalEclParser.g:2011:3: ruleIntegerValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleIntegerValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getIntegerValueLessThanEqualsParserRuleCall_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEclParser.g:2016:2: ( ruleDecimalValueEquals )
                    {
                    // InternalEclParser.g:2016:2: ( ruleDecimalValueEquals )
                    // InternalEclParser.g:2017:3: ruleDecimalValueEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueEqualsParserRuleCall_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEclParser.g:2022:2: ( ruleDecimalValueNotEquals )
                    {
                    // InternalEclParser.g:2022:2: ( ruleDecimalValueNotEquals )
                    // InternalEclParser.g:2023:3: ruleDecimalValueNotEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueNotEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueNotEqualsParserRuleCall_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalEclParser.g:2028:2: ( ruleDecimalValueGreaterThan )
                    {
                    // InternalEclParser.g:2028:2: ( ruleDecimalValueGreaterThan )
                    // InternalEclParser.g:2029:3: ruleDecimalValueGreaterThan
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueGreaterThan();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanParserRuleCall_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalEclParser.g:2034:2: ( ruleDecimalValueGreaterThanEquals )
                    {
                    // InternalEclParser.g:2034:2: ( ruleDecimalValueGreaterThanEquals )
                    // InternalEclParser.g:2035:3: ruleDecimalValueGreaterThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueGreaterThanEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueGreaterThanEqualsParserRuleCall_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalEclParser.g:2040:2: ( ruleDecimalValueLessThan )
                    {
                    // InternalEclParser.g:2040:2: ( ruleDecimalValueLessThan )
                    // InternalEclParser.g:2041:3: ruleDecimalValueLessThan
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueLessThan();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanParserRuleCall_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalEclParser.g:2046:2: ( ruleDecimalValueLessThanEquals )
                    {
                    // InternalEclParser.g:2046:2: ( ruleDecimalValueLessThanEquals )
                    // InternalEclParser.g:2047:3: ruleDecimalValueLessThanEquals
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDecimalValueLessThanEquals();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDataTypeComparisonAccess().getDecimalValueLessThanEqualsParserRuleCall_15()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DataTypeComparison__Alternatives"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_1"
    // InternalEclParser.g:2056:1: rule__SnomedIdentifier__Alternatives_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2060:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_DIGIT_NONZERO) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_ZERO) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEclParser.g:2061:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2061:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2062:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2067:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2067:2: ( RULE_ZERO )
                    // InternalEclParser.g:2068:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_1"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_2"
    // InternalEclParser.g:2077:1: rule__SnomedIdentifier__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2081:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_DIGIT_NONZERO) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ZERO) ) {
                alt13=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEclParser.g:2082:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2082:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2083:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2088:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2088:2: ( RULE_ZERO )
                    // InternalEclParser.g:2089:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_2"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_3"
    // InternalEclParser.g:2098:1: rule__SnomedIdentifier__Alternatives_3 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2102:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_DIGIT_NONZERO) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ZERO) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEclParser.g:2103:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2103:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2104:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_3_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2109:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2109:2: ( RULE_ZERO )
                    // InternalEclParser.g:2110:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_3_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_3"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_4"
    // InternalEclParser.g:2119:1: rule__SnomedIdentifier__Alternatives_4 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2123:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_DIGIT_NONZERO) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ZERO) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEclParser.g:2124:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2124:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2125:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_4_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2130:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2130:2: ( RULE_ZERO )
                    // InternalEclParser.g:2131:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_4_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_4"


    // $ANTLR start "rule__SnomedIdentifier__Alternatives_5"
    // InternalEclParser.g:2140:1: rule__SnomedIdentifier__Alternatives_5 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2144:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_DIGIT_NONZERO) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ZERO) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEclParser.g:2145:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2145:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2146:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_5_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2151:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2151:2: ( RULE_ZERO )
                    // InternalEclParser.g:2152:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSnomedIdentifierAccess().getZEROTerminalRuleCall_5_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Alternatives_5"


    // $ANTLR start "rule__NonNegativeInteger__Alternatives"
    // InternalEclParser.g:2161:1: rule__NonNegativeInteger__Alternatives : ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) );
    public final void rule__NonNegativeInteger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2165:1: ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ZERO) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_DIGIT_NONZERO) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEclParser.g:2166:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2166:2: ( RULE_ZERO )
                    // InternalEclParser.g:2167:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2172:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    {
                    // InternalEclParser.g:2172:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    // InternalEclParser.g:2173:3: ( rule__NonNegativeInteger__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); 
                    }
                    // InternalEclParser.g:2174:3: ( rule__NonNegativeInteger__Group_1__0 )
                    // InternalEclParser.g:2174:4: rule__NonNegativeInteger__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__NonNegativeInteger__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Alternatives"


    // $ANTLR start "rule__NonNegativeInteger__Alternatives_1_1"
    // InternalEclParser.g:2182:1: rule__NonNegativeInteger__Alternatives_1_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeInteger__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2186:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_DIGIT_NONZERO) ) {
                alt18=1;
            }
            else if ( (LA18_0==RULE_ZERO) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEclParser.g:2187:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2187:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2188:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_1_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2193:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2193:2: ( RULE_ZERO )
                    // InternalEclParser.g:2194:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeIntegerAccess().getZEROTerminalRuleCall_1_1_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Alternatives_1_1"


    // $ANTLR start "rule__MaxValue__Alternatives"
    // InternalEclParser.g:2203:1: rule__MaxValue__Alternatives : ( ( ruleNonNegativeInteger ) | ( RULE_WILDCARD ) );
    public final void rule__MaxValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2207:1: ( ( ruleNonNegativeInteger ) | ( RULE_WILDCARD ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_ZERO && LA19_0<=RULE_DIGIT_NONZERO)) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_WILDCARD) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEclParser.g:2208:2: ( ruleNonNegativeInteger )
                    {
                    // InternalEclParser.g:2208:2: ( ruleNonNegativeInteger )
                    // InternalEclParser.g:2209:3: ruleNonNegativeInteger
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleNonNegativeInteger();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMaxValueAccess().getNonNegativeIntegerParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2214:2: ( RULE_WILDCARD )
                    {
                    // InternalEclParser.g:2214:2: ( RULE_WILDCARD )
                    // InternalEclParser.g:2215:3: RULE_WILDCARD
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); 
                    }
                    match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getMaxValueAccess().getWILDCARDTerminalRuleCall_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MaxValue__Alternatives"


    // $ANTLR start "rule__Integer__Alternatives_0"
    // InternalEclParser.g:2224:1: rule__Integer__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2228:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_PLUS) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_DASH) ) {
                alt20=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEclParser.g:2229:2: ( RULE_PLUS )
                    {
                    // InternalEclParser.g:2229:2: ( RULE_PLUS )
                    // InternalEclParser.g:2230:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerAccess().getPLUSTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2235:2: ( RULE_DASH )
                    {
                    // InternalEclParser.g:2235:2: ( RULE_DASH )
                    // InternalEclParser.g:2236:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getIntegerAccess().getDASHTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Alternatives_0"


    // $ANTLR start "rule__Decimal__Alternatives_0"
    // InternalEclParser.g:2245:1: rule__Decimal__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Decimal__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2249:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_PLUS) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_DASH) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEclParser.g:2250:2: ( RULE_PLUS )
                    {
                    // InternalEclParser.g:2250:2: ( RULE_PLUS )
                    // InternalEclParser.g:2251:3: RULE_PLUS
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); 
                    }
                    match(input,RULE_PLUS,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecimalAccess().getPLUSTerminalRuleCall_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2256:2: ( RULE_DASH )
                    {
                    // InternalEclParser.g:2256:2: ( RULE_DASH )
                    // InternalEclParser.g:2257:3: RULE_DASH
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); 
                    }
                    match(input,RULE_DASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getDecimalAccess().getDASHTerminalRuleCall_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Alternatives_0"


    // $ANTLR start "rule__NonNegativeDecimal__Alternatives_2"
    // InternalEclParser.g:2266:1: rule__NonNegativeDecimal__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeDecimal__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2270:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==RULE_DIGIT_NONZERO) ) {
                alt22=1;
            }
            else if ( (LA22_0==RULE_ZERO) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEclParser.g:2271:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2271:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2272:3: RULE_DIGIT_NONZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }
                    match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeDecimalAccess().getDIGIT_NONZEROTerminalRuleCall_2_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2277:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2277:2: ( RULE_ZERO )
                    // InternalEclParser.g:2278:3: RULE_ZERO
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); 
                    }
                    match(input,RULE_ZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getNonNegativeDecimalAccess().getZEROTerminalRuleCall_2_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Alternatives_2"


    // $ANTLR start "rule__Boolean__Alternatives"
    // InternalEclParser.g:2287:1: rule__Boolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2291:1: ( ( True ) | ( False ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==True) ) {
                alt23=1;
            }
            else if ( (LA23_0==False) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalEclParser.g:2292:2: ( True )
                    {
                    // InternalEclParser.g:2292:2: ( True )
                    // InternalEclParser.g:2293:3: True
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }
                    match(input,True,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getTrueKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEclParser.g:2298:2: ( False )
                    {
                    // InternalEclParser.g:2298:2: ( False )
                    // InternalEclParser.g:2299:3: False
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }
                    match(input,False,FollowSets000.FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getBooleanAccess().getFalseKeyword_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Boolean__Alternatives"


    // $ANTLR start "rule__Script__Group__0"
    // InternalEclParser.g:2308:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2312:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalEclParser.g:2313:2: rule__Script__Group__0__Impl rule__Script__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__Script__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Script__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0"


    // $ANTLR start "rule__Script__Group__0__Impl"
    // InternalEclParser.g:2320:1: rule__Script__Group__0__Impl : ( () ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2324:1: ( ( () ) )
            // InternalEclParser.g:2325:1: ( () )
            {
            // InternalEclParser.g:2325:1: ( () )
            // InternalEclParser.g:2326:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getScriptAction_0()); 
            }
            // InternalEclParser.g:2327:2: ()
            // InternalEclParser.g:2327:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getScriptAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__0__Impl"


    // $ANTLR start "rule__Script__Group__1"
    // InternalEclParser.g:2335:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2339:1: ( rule__Script__Group__1__Impl )
            // InternalEclParser.g:2340:2: rule__Script__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Script__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1"


    // $ANTLR start "rule__Script__Group__1__Impl"
    // InternalEclParser.g:2346:1: rule__Script__Group__1__Impl : ( ( rule__Script__ConstraintAssignment_1 )? ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2350:1: ( ( ( rule__Script__ConstraintAssignment_1 )? ) )
            // InternalEclParser.g:2351:1: ( ( rule__Script__ConstraintAssignment_1 )? )
            {
            // InternalEclParser.g:2351:1: ( ( rule__Script__ConstraintAssignment_1 )? )
            // InternalEclParser.g:2352:2: ( rule__Script__ConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:2353:2: ( rule__Script__ConstraintAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DIGIT_NONZERO||LA24_0==RULE_ROUND_OPEN||LA24_0==RULE_CARET||LA24_0==RULE_WILDCARD||(LA24_0>=RULE_LT && LA24_0<=RULE_DBL_GT_EM)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:2353:3: rule__Script__ConstraintAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Script__ConstraintAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__Group__1__Impl"


    // $ANTLR start "rule__OrExpressionConstraint__Group__0"
    // InternalEclParser.g:2362:1: rule__OrExpressionConstraint__Group__0 : rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1 ;
    public final void rule__OrExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2366:1: ( rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1 )
            // InternalEclParser.g:2367:2: rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group__0"


    // $ANTLR start "rule__OrExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:2374:1: rule__OrExpressionConstraint__Group__0__Impl : ( ruleAndExpressionConstraint ) ;
    public final void rule__OrExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2378:1: ( ( ruleAndExpressionConstraint ) )
            // InternalEclParser.g:2379:1: ( ruleAndExpressionConstraint )
            {
            // InternalEclParser.g:2379:1: ( ruleAndExpressionConstraint )
            // InternalEclParser.g:2380:2: ruleAndExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getAndExpressionConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__OrExpressionConstraint__Group__1"
    // InternalEclParser.g:2389:1: rule__OrExpressionConstraint__Group__1 : rule__OrExpressionConstraint__Group__1__Impl ;
    public final void rule__OrExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2393:1: ( rule__OrExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2394:2: rule__OrExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group__1"


    // $ANTLR start "rule__OrExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:2400:1: rule__OrExpressionConstraint__Group__1__Impl : ( ( rule__OrExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__OrExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2404:1: ( ( ( rule__OrExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2405:1: ( ( rule__OrExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2405:1: ( ( rule__OrExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2406:2: ( rule__OrExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2407:2: ( rule__OrExpressionConstraint__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DISJUNCTION) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEclParser.g:2407:3: rule__OrExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__OrExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__0"
    // InternalEclParser.g:2416:1: rule__OrExpressionConstraint__Group_1__0 : rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1 ;
    public final void rule__OrExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2420:1: ( rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2421:2: rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:2428:1: rule__OrExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2432:1: ( ( () ) )
            // InternalEclParser.g:2433:1: ( () )
            {
            // InternalEclParser.g:2433:1: ( () )
            // InternalEclParser.g:2434:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2435:2: ()
            // InternalEclParser.g:2435:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__1"
    // InternalEclParser.g:2443:1: rule__OrExpressionConstraint__Group_1__1 : rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2 ;
    public final void rule__OrExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2447:1: ( rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2448:2: rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__OrExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:2455:1: rule__OrExpressionConstraint__Group_1__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2459:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:2460:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:2460:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:2461:2: RULE_DISJUNCTION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); 
            }
            match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getDISJUNCTIONTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__2"
    // InternalEclParser.g:2470:1: rule__OrExpressionConstraint__Group_1__2 : rule__OrExpressionConstraint__Group_1__2__Impl ;
    public final void rule__OrExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2474:1: ( rule__OrExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2475:2: rule__OrExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__OrExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:2481:1: rule__OrExpressionConstraint__Group_1__2__Impl : ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2485:1: ( ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2486:1: ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2486:1: ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2487:2: ( rule__OrExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2488:2: ( rule__OrExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2488:3: rule__OrExpressionConstraint__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrExpressionConstraint__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__AndExpressionConstraint__Group__0"
    // InternalEclParser.g:2497:1: rule__AndExpressionConstraint__Group__0 : rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1 ;
    public final void rule__AndExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2501:1: ( rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1 )
            // InternalEclParser.g:2502:2: rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group__0"


    // $ANTLR start "rule__AndExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:2509:1: rule__AndExpressionConstraint__Group__0__Impl : ( ruleExclusionExpressionConstraint ) ;
    public final void rule__AndExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2513:1: ( ( ruleExclusionExpressionConstraint ) )
            // InternalEclParser.g:2514:1: ( ruleExclusionExpressionConstraint )
            {
            // InternalEclParser.g:2514:1: ( ruleExclusionExpressionConstraint )
            // InternalEclParser.g:2515:2: ruleExclusionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getExclusionExpressionConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__AndExpressionConstraint__Group__1"
    // InternalEclParser.g:2524:1: rule__AndExpressionConstraint__Group__1 : rule__AndExpressionConstraint__Group__1__Impl ;
    public final void rule__AndExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2528:1: ( rule__AndExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2529:2: rule__AndExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group__1"


    // $ANTLR start "rule__AndExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:2535:1: rule__AndExpressionConstraint__Group__1__Impl : ( ( rule__AndExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__AndExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2539:1: ( ( ( rule__AndExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2540:1: ( ( rule__AndExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2540:1: ( ( rule__AndExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2541:2: ( rule__AndExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2542:2: ( rule__AndExpressionConstraint__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_COMMA && LA26_0<=RULE_CONJUNCTION)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEclParser.g:2542:3: rule__AndExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AndExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__0"
    // InternalEclParser.g:2551:1: rule__AndExpressionConstraint__Group_1__0 : rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1 ;
    public final void rule__AndExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2555:1: ( rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2556:2: rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:2563:1: rule__AndExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2567:1: ( ( () ) )
            // InternalEclParser.g:2568:1: ( () )
            {
            // InternalEclParser.g:2568:1: ( () )
            // InternalEclParser.g:2569:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2570:2: ()
            // InternalEclParser.g:2570:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__1"
    // InternalEclParser.g:2578:1: rule__AndExpressionConstraint__Group_1__1 : rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2 ;
    public final void rule__AndExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2582:1: ( rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2583:2: rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AndExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:2590:1: rule__AndExpressionConstraint__Group_1__1__Impl : ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) ) ;
    public final void rule__AndExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2594:1: ( ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) ) )
            // InternalEclParser.g:2595:1: ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) )
            {
            // InternalEclParser.g:2595:1: ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) )
            // InternalEclParser.g:2596:2: ( rule__AndExpressionConstraint__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:2597:2: ( rule__AndExpressionConstraint__Alternatives_1_1 )
            // InternalEclParser.g:2597:3: rule__AndExpressionConstraint__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__2"
    // InternalEclParser.g:2605:1: rule__AndExpressionConstraint__Group_1__2 : rule__AndExpressionConstraint__Group_1__2__Impl ;
    public final void rule__AndExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2609:1: ( rule__AndExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2610:2: rule__AndExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__AndExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:2616:1: rule__AndExpressionConstraint__Group_1__2__Impl : ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2620:1: ( ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2621:1: ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2621:1: ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2622:2: ( rule__AndExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2623:2: ( rule__AndExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2623:3: rule__AndExpressionConstraint__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndExpressionConstraint__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__0"
    // InternalEclParser.g:2632:1: rule__ExclusionExpressionConstraint__Group__0 : rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 ;
    public final void rule__ExclusionExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2636:1: ( rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 )
            // InternalEclParser.g:2637:2: rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ExclusionExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:2644:1: rule__ExclusionExpressionConstraint__Group__0__Impl : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2648:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:2649:1: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:2649:1: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:2650:2: ruleRefinedExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getRefinedExpressionConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__1"
    // InternalEclParser.g:2659:1: rule__ExclusionExpressionConstraint__Group__1 : rule__ExclusionExpressionConstraint__Group__1__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2663:1: ( rule__ExclusionExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2664:2: rule__ExclusionExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:2670:1: rule__ExclusionExpressionConstraint__Group__1__Impl : ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? ) ;
    public final void rule__ExclusionExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2674:1: ( ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? ) )
            // InternalEclParser.g:2675:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? )
            {
            // InternalEclParser.g:2675:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? )
            // InternalEclParser.g:2676:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2677:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_EXCLUSION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEclParser.g:2677:3: rule__ExclusionExpressionConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__ExclusionExpressionConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__0"
    // InternalEclParser.g:2686:1: rule__ExclusionExpressionConstraint__Group_1__0 : rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2690:1: ( rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2691:2: rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_8);
            rule__ExclusionExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:2698:1: rule__ExclusionExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2702:1: ( ( () ) )
            // InternalEclParser.g:2703:1: ( () )
            {
            // InternalEclParser.g:2703:1: ( () )
            // InternalEclParser.g:2704:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2705:2: ()
            // InternalEclParser.g:2705:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__1"
    // InternalEclParser.g:2713:1: rule__ExclusionExpressionConstraint__Group_1__1 : rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2 ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2717:1: ( rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2718:2: rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ExclusionExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:2725:1: rule__ExclusionExpressionConstraint__Group_1__1__Impl : ( RULE_EXCLUSION ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2729:1: ( ( RULE_EXCLUSION ) )
            // InternalEclParser.g:2730:1: ( RULE_EXCLUSION )
            {
            // InternalEclParser.g:2730:1: ( RULE_EXCLUSION )
            // InternalEclParser.g:2731:2: RULE_EXCLUSION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); 
            }
            match(input,RULE_EXCLUSION,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getEXCLUSIONTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__2"
    // InternalEclParser.g:2740:1: rule__ExclusionExpressionConstraint__Group_1__2 : rule__ExclusionExpressionConstraint__Group_1__2__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2744:1: ( rule__ExclusionExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2745:2: rule__ExclusionExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__ExclusionExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:2751:1: rule__ExclusionExpressionConstraint__Group_1__2__Impl : ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2755:1: ( ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2756:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2756:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2757:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2758:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2758:3: rule__ExclusionExpressionConstraint__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ExclusionExpressionConstraint__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__0"
    // InternalEclParser.g:2767:1: rule__RefinedExpressionConstraint__Group__0 : rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 ;
    public final void rule__RefinedExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2771:1: ( rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 )
            // InternalEclParser.g:2772:2: rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RefinedExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__0"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:2779:1: rule__RefinedExpressionConstraint__Group__0__Impl : ( ruleDottedExpressionConstraint ) ;
    public final void rule__RefinedExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2783:1: ( ( ruleDottedExpressionConstraint ) )
            // InternalEclParser.g:2784:1: ( ruleDottedExpressionConstraint )
            {
            // InternalEclParser.g:2784:1: ( ruleDottedExpressionConstraint )
            // InternalEclParser.g:2785:2: ruleDottedExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDottedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getDottedExpressionConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__1"
    // InternalEclParser.g:2794:1: rule__RefinedExpressionConstraint__Group__1 : rule__RefinedExpressionConstraint__Group__1__Impl ;
    public final void rule__RefinedExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2798:1: ( rule__RefinedExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2799:2: rule__RefinedExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__1"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:2805:1: rule__RefinedExpressionConstraint__Group__1__Impl : ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) ;
    public final void rule__RefinedExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2809:1: ( ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) )
            // InternalEclParser.g:2810:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            {
            // InternalEclParser.g:2810:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            // InternalEclParser.g:2811:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2812:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COLON) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEclParser.g:2812:3: rule__RefinedExpressionConstraint__Group_1__0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__RefinedExpressionConstraint__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__0"
    // InternalEclParser.g:2821:1: rule__RefinedExpressionConstraint__Group_1__0 : rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 ;
    public final void rule__RefinedExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2825:1: ( rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2826:2: rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_9);
            rule__RefinedExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:2833:1: rule__RefinedExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2837:1: ( ( () ) )
            // InternalEclParser.g:2838:1: ( () )
            {
            // InternalEclParser.g:2838:1: ( () )
            // InternalEclParser.g:2839:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); 
            }
            // InternalEclParser.g:2840:2: ()
            // InternalEclParser.g:2840:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__1"
    // InternalEclParser.g:2848:1: rule__RefinedExpressionConstraint__Group_1__1 : rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 ;
    public final void rule__RefinedExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2852:1: ( rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2853:2: rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__RefinedExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:2860:1: rule__RefinedExpressionConstraint__Group_1__1__Impl : ( RULE_COLON ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2864:1: ( ( RULE_COLON ) )
            // InternalEclParser.g:2865:1: ( RULE_COLON )
            {
            // InternalEclParser.g:2865:1: ( RULE_COLON )
            // InternalEclParser.g:2866:2: RULE_COLON
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); 
            }
            match(input,RULE_COLON,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getCOLONTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__2"
    // InternalEclParser.g:2875:1: rule__RefinedExpressionConstraint__Group_1__2 : rule__RefinedExpressionConstraint__Group_1__2__Impl ;
    public final void rule__RefinedExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2879:1: ( rule__RefinedExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2880:2: rule__RefinedExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__RefinedExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:2886:1: rule__RefinedExpressionConstraint__Group_1__2__Impl : ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2890:1: ( ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) )
            // InternalEclParser.g:2891:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            {
            // InternalEclParser.g:2891:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            // InternalEclParser.g:2892:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); 
            }
            // InternalEclParser.g:2893:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            // InternalEclParser.g:2893:3: rule__RefinedExpressionConstraint__RefinementAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__RefinedExpressionConstraint__RefinementAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__DottedExpressionConstraint__Group__0"
    // InternalEclParser.g:2902:1: rule__DottedExpressionConstraint__Group__0 : rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1 ;
    public final void rule__DottedExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2906:1: ( rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1 )
            // InternalEclParser.g:2907:2: rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DottedExpressionConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group__0"


    // $ANTLR start "rule__DottedExpressionConstraint__Group__0__Impl"
    // InternalEclParser.g:2914:1: rule__DottedExpressionConstraint__Group__0__Impl : ( ruleSubExpressionConstraint ) ;
    public final void rule__DottedExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2918:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:2919:1: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:2919:1: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:2920:2: ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getSubExpressionConstraintParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group__0__Impl"


    // $ANTLR start "rule__DottedExpressionConstraint__Group__1"
    // InternalEclParser.g:2929:1: rule__DottedExpressionConstraint__Group__1 : rule__DottedExpressionConstraint__Group__1__Impl ;
    public final void rule__DottedExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2933:1: ( rule__DottedExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2934:2: rule__DottedExpressionConstraint__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group__1"


    // $ANTLR start "rule__DottedExpressionConstraint__Group__1__Impl"
    // InternalEclParser.g:2940:1: rule__DottedExpressionConstraint__Group__1__Impl : ( ( rule__DottedExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__DottedExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2944:1: ( ( ( rule__DottedExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2945:1: ( ( rule__DottedExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2945:1: ( ( rule__DottedExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2946:2: ( rule__DottedExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2947:2: ( rule__DottedExpressionConstraint__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEclParser.g:2947:3: rule__DottedExpressionConstraint__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_12);
            	    rule__DottedExpressionConstraint__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group__1__Impl"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__0"
    // InternalEclParser.g:2956:1: rule__DottedExpressionConstraint__Group_1__0 : rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1 ;
    public final void rule__DottedExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2960:1: ( rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2961:2: rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__DottedExpressionConstraint__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__0"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__0__Impl"
    // InternalEclParser.g:2968:1: rule__DottedExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__DottedExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2972:1: ( ( () ) )
            // InternalEclParser.g:2973:1: ( () )
            {
            // InternalEclParser.g:2973:1: ( () )
            // InternalEclParser.g:2974:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); 
            }
            // InternalEclParser.g:2975:2: ()
            // InternalEclParser.g:2975:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__0__Impl"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__1"
    // InternalEclParser.g:2983:1: rule__DottedExpressionConstraint__Group_1__1 : rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2 ;
    public final void rule__DottedExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2987:1: ( rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2988:2: rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DottedExpressionConstraint__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__1"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__1__Impl"
    // InternalEclParser.g:2995:1: rule__DottedExpressionConstraint__Group_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__DottedExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2999:1: ( ( RULE_DOT ) )
            // InternalEclParser.g:3000:1: ( RULE_DOT )
            {
            // InternalEclParser.g:3000:1: ( RULE_DOT )
            // InternalEclParser.g:3001:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_DOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getDOTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__1__Impl"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__2"
    // InternalEclParser.g:3010:1: rule__DottedExpressionConstraint__Group_1__2 : rule__DottedExpressionConstraint__Group_1__2__Impl ;
    public final void rule__DottedExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3014:1: ( rule__DottedExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:3015:2: rule__DottedExpressionConstraint__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__2"


    // $ANTLR start "rule__DottedExpressionConstraint__Group_1__2__Impl"
    // InternalEclParser.g:3021:1: rule__DottedExpressionConstraint__Group_1__2__Impl : ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) ) ;
    public final void rule__DottedExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3025:1: ( ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) ) )
            // InternalEclParser.g:3026:1: ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) )
            {
            // InternalEclParser.g:3026:1: ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) )
            // InternalEclParser.g:3027:2: ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); 
            }
            // InternalEclParser.g:3028:2: ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 )
            // InternalEclParser.g:3028:3: rule__DottedExpressionConstraint__AttributeAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DottedExpressionConstraint__AttributeAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__Group_1__2__Impl"


    // $ANTLR start "rule__ChildOf__Group__0"
    // InternalEclParser.g:3037:1: rule__ChildOf__Group__0 : rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1 ;
    public final void rule__ChildOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3041:1: ( rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1 )
            // InternalEclParser.g:3042:2: rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ChildOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOf__Group__0"


    // $ANTLR start "rule__ChildOf__Group__0__Impl"
    // InternalEclParser.g:3049:1: rule__ChildOf__Group__0__Impl : ( RULE_LT_EM ) ;
    public final void rule__ChildOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3053:1: ( ( RULE_LT_EM ) )
            // InternalEclParser.g:3054:1: ( RULE_LT_EM )
            {
            // InternalEclParser.g:3054:1: ( RULE_LT_EM )
            // InternalEclParser.g:3055:2: RULE_LT_EM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); 
            }
            match(input,RULE_LT_EM,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOfAccess().getLT_EMTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOf__Group__0__Impl"


    // $ANTLR start "rule__ChildOf__Group__1"
    // InternalEclParser.g:3064:1: rule__ChildOf__Group__1 : rule__ChildOf__Group__1__Impl ;
    public final void rule__ChildOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3068:1: ( rule__ChildOf__Group__1__Impl )
            // InternalEclParser.g:3069:2: rule__ChildOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOf__Group__1"


    // $ANTLR start "rule__ChildOf__Group__1__Impl"
    // InternalEclParser.g:3075:1: rule__ChildOf__Group__1__Impl : ( ( rule__ChildOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ChildOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3079:1: ( ( ( rule__ChildOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3080:1: ( ( rule__ChildOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3080:1: ( ( rule__ChildOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3081:2: ( rule__ChildOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3082:2: ( rule__ChildOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3082:3: rule__ChildOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOf__Group__1__Impl"


    // $ANTLR start "rule__ChildOrSelfOf__Group__0"
    // InternalEclParser.g:3091:1: rule__ChildOrSelfOf__Group__0 : rule__ChildOrSelfOf__Group__0__Impl rule__ChildOrSelfOf__Group__1 ;
    public final void rule__ChildOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3095:1: ( rule__ChildOrSelfOf__Group__0__Impl rule__ChildOrSelfOf__Group__1 )
            // InternalEclParser.g:3096:2: rule__ChildOrSelfOf__Group__0__Impl rule__ChildOrSelfOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ChildOrSelfOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOrSelfOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOrSelfOf__Group__0"


    // $ANTLR start "rule__ChildOrSelfOf__Group__0__Impl"
    // InternalEclParser.g:3103:1: rule__ChildOrSelfOf__Group__0__Impl : ( RULE_DBL_LT_EM ) ;
    public final void rule__ChildOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3107:1: ( ( RULE_DBL_LT_EM ) )
            // InternalEclParser.g:3108:1: ( RULE_DBL_LT_EM )
            {
            // InternalEclParser.g:3108:1: ( RULE_DBL_LT_EM )
            // InternalEclParser.g:3109:2: RULE_DBL_LT_EM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); 
            }
            match(input,RULE_DBL_LT_EM,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOrSelfOfAccess().getDBL_LT_EMTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOrSelfOf__Group__0__Impl"


    // $ANTLR start "rule__ChildOrSelfOf__Group__1"
    // InternalEclParser.g:3118:1: rule__ChildOrSelfOf__Group__1 : rule__ChildOrSelfOf__Group__1__Impl ;
    public final void rule__ChildOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3122:1: ( rule__ChildOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3123:2: rule__ChildOrSelfOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOrSelfOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOrSelfOf__Group__1"


    // $ANTLR start "rule__ChildOrSelfOf__Group__1__Impl"
    // InternalEclParser.g:3129:1: rule__ChildOrSelfOf__Group__1__Impl : ( ( rule__ChildOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ChildOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3133:1: ( ( ( rule__ChildOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3134:1: ( ( rule__ChildOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3134:1: ( ( rule__ChildOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3135:2: ( rule__ChildOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3136:2: ( rule__ChildOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3136:3: rule__ChildOrSelfOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ChildOrSelfOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOrSelfOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOrSelfOf__Group__1__Impl"


    // $ANTLR start "rule__DescendantOf__Group__0"
    // InternalEclParser.g:3145:1: rule__DescendantOf__Group__0 : rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1 ;
    public final void rule__DescendantOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3149:1: ( rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1 )
            // InternalEclParser.g:3150:2: rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DescendantOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOf__Group__0"


    // $ANTLR start "rule__DescendantOf__Group__0__Impl"
    // InternalEclParser.g:3157:1: rule__DescendantOf__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__DescendantOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3161:1: ( ( RULE_LT ) )
            // InternalEclParser.g:3162:1: ( RULE_LT )
            {
            // InternalEclParser.g:3162:1: ( RULE_LT )
            // InternalEclParser.g:3163:2: RULE_LT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); 
            }
            match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOfAccess().getLTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOf__Group__0__Impl"


    // $ANTLR start "rule__DescendantOf__Group__1"
    // InternalEclParser.g:3172:1: rule__DescendantOf__Group__1 : rule__DescendantOf__Group__1__Impl ;
    public final void rule__DescendantOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3176:1: ( rule__DescendantOf__Group__1__Impl )
            // InternalEclParser.g:3177:2: rule__DescendantOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOf__Group__1"


    // $ANTLR start "rule__DescendantOf__Group__1__Impl"
    // InternalEclParser.g:3183:1: rule__DescendantOf__Group__1__Impl : ( ( rule__DescendantOf__ConstraintAssignment_1 ) ) ;
    public final void rule__DescendantOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3187:1: ( ( ( rule__DescendantOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3188:1: ( ( rule__DescendantOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3188:1: ( ( rule__DescendantOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3189:2: ( rule__DescendantOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3190:2: ( rule__DescendantOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3190:3: rule__DescendantOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOf__Group__1__Impl"


    // $ANTLR start "rule__DescendantOrSelfOf__Group__0"
    // InternalEclParser.g:3199:1: rule__DescendantOrSelfOf__Group__0 : rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1 ;
    public final void rule__DescendantOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3203:1: ( rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1 )
            // InternalEclParser.g:3204:2: rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__DescendantOrSelfOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOrSelfOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOrSelfOf__Group__0"


    // $ANTLR start "rule__DescendantOrSelfOf__Group__0__Impl"
    // InternalEclParser.g:3211:1: rule__DescendantOrSelfOf__Group__0__Impl : ( RULE_DBL_LT ) ;
    public final void rule__DescendantOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3215:1: ( ( RULE_DBL_LT ) )
            // InternalEclParser.g:3216:1: ( RULE_DBL_LT )
            {
            // InternalEclParser.g:3216:1: ( RULE_DBL_LT )
            // InternalEclParser.g:3217:2: RULE_DBL_LT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); 
            }
            match(input,RULE_DBL_LT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOrSelfOfAccess().getDBL_LTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOrSelfOf__Group__0__Impl"


    // $ANTLR start "rule__DescendantOrSelfOf__Group__1"
    // InternalEclParser.g:3226:1: rule__DescendantOrSelfOf__Group__1 : rule__DescendantOrSelfOf__Group__1__Impl ;
    public final void rule__DescendantOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3230:1: ( rule__DescendantOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3231:2: rule__DescendantOrSelfOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOrSelfOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOrSelfOf__Group__1"


    // $ANTLR start "rule__DescendantOrSelfOf__Group__1__Impl"
    // InternalEclParser.g:3237:1: rule__DescendantOrSelfOf__Group__1__Impl : ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__DescendantOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3241:1: ( ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3242:1: ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3242:1: ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3243:2: ( rule__DescendantOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3244:2: ( rule__DescendantOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3244:3: rule__DescendantOrSelfOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DescendantOrSelfOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOrSelfOf__Group__1__Impl"


    // $ANTLR start "rule__ParentOf__Group__0"
    // InternalEclParser.g:3253:1: rule__ParentOf__Group__0 : rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1 ;
    public final void rule__ParentOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3257:1: ( rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1 )
            // InternalEclParser.g:3258:2: rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ParentOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOf__Group__0"


    // $ANTLR start "rule__ParentOf__Group__0__Impl"
    // InternalEclParser.g:3265:1: rule__ParentOf__Group__0__Impl : ( RULE_GT_EM ) ;
    public final void rule__ParentOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3269:1: ( ( RULE_GT_EM ) )
            // InternalEclParser.g:3270:1: ( RULE_GT_EM )
            {
            // InternalEclParser.g:3270:1: ( RULE_GT_EM )
            // InternalEclParser.g:3271:2: RULE_GT_EM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); 
            }
            match(input,RULE_GT_EM,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOfAccess().getGT_EMTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOf__Group__0__Impl"


    // $ANTLR start "rule__ParentOf__Group__1"
    // InternalEclParser.g:3280:1: rule__ParentOf__Group__1 : rule__ParentOf__Group__1__Impl ;
    public final void rule__ParentOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3284:1: ( rule__ParentOf__Group__1__Impl )
            // InternalEclParser.g:3285:2: rule__ParentOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOf__Group__1"


    // $ANTLR start "rule__ParentOf__Group__1__Impl"
    // InternalEclParser.g:3291:1: rule__ParentOf__Group__1__Impl : ( ( rule__ParentOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ParentOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3295:1: ( ( ( rule__ParentOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3296:1: ( ( rule__ParentOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3296:1: ( ( rule__ParentOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3297:2: ( rule__ParentOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3298:2: ( rule__ParentOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3298:3: rule__ParentOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOf__Group__1__Impl"


    // $ANTLR start "rule__ParentOrSelfOf__Group__0"
    // InternalEclParser.g:3307:1: rule__ParentOrSelfOf__Group__0 : rule__ParentOrSelfOf__Group__0__Impl rule__ParentOrSelfOf__Group__1 ;
    public final void rule__ParentOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3311:1: ( rule__ParentOrSelfOf__Group__0__Impl rule__ParentOrSelfOf__Group__1 )
            // InternalEclParser.g:3312:2: rule__ParentOrSelfOf__Group__0__Impl rule__ParentOrSelfOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__ParentOrSelfOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOrSelfOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOrSelfOf__Group__0"


    // $ANTLR start "rule__ParentOrSelfOf__Group__0__Impl"
    // InternalEclParser.g:3319:1: rule__ParentOrSelfOf__Group__0__Impl : ( RULE_DBL_GT_EM ) ;
    public final void rule__ParentOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3323:1: ( ( RULE_DBL_GT_EM ) )
            // InternalEclParser.g:3324:1: ( RULE_DBL_GT_EM )
            {
            // InternalEclParser.g:3324:1: ( RULE_DBL_GT_EM )
            // InternalEclParser.g:3325:2: RULE_DBL_GT_EM
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); 
            }
            match(input,RULE_DBL_GT_EM,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOrSelfOfAccess().getDBL_GT_EMTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOrSelfOf__Group__0__Impl"


    // $ANTLR start "rule__ParentOrSelfOf__Group__1"
    // InternalEclParser.g:3334:1: rule__ParentOrSelfOf__Group__1 : rule__ParentOrSelfOf__Group__1__Impl ;
    public final void rule__ParentOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3338:1: ( rule__ParentOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3339:2: rule__ParentOrSelfOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOrSelfOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOrSelfOf__Group__1"


    // $ANTLR start "rule__ParentOrSelfOf__Group__1__Impl"
    // InternalEclParser.g:3345:1: rule__ParentOrSelfOf__Group__1__Impl : ( ( rule__ParentOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ParentOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3349:1: ( ( ( rule__ParentOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3350:1: ( ( rule__ParentOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3350:1: ( ( rule__ParentOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3351:2: ( rule__ParentOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3352:2: ( rule__ParentOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3352:3: rule__ParentOrSelfOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__ParentOrSelfOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOrSelfOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOrSelfOf__Group__1__Impl"


    // $ANTLR start "rule__AncestorOf__Group__0"
    // InternalEclParser.g:3361:1: rule__AncestorOf__Group__0 : rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1 ;
    public final void rule__AncestorOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3365:1: ( rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1 )
            // InternalEclParser.g:3366:2: rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AncestorOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOf__Group__0"


    // $ANTLR start "rule__AncestorOf__Group__0__Impl"
    // InternalEclParser.g:3373:1: rule__AncestorOf__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__AncestorOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3377:1: ( ( RULE_GT ) )
            // InternalEclParser.g:3378:1: ( RULE_GT )
            {
            // InternalEclParser.g:3378:1: ( RULE_GT )
            // InternalEclParser.g:3379:2: RULE_GT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); 
            }
            match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOfAccess().getGTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOf__Group__0__Impl"


    // $ANTLR start "rule__AncestorOf__Group__1"
    // InternalEclParser.g:3388:1: rule__AncestorOf__Group__1 : rule__AncestorOf__Group__1__Impl ;
    public final void rule__AncestorOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3392:1: ( rule__AncestorOf__Group__1__Impl )
            // InternalEclParser.g:3393:2: rule__AncestorOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOf__Group__1"


    // $ANTLR start "rule__AncestorOf__Group__1__Impl"
    // InternalEclParser.g:3399:1: rule__AncestorOf__Group__1__Impl : ( ( rule__AncestorOf__ConstraintAssignment_1 ) ) ;
    public final void rule__AncestorOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3403:1: ( ( ( rule__AncestorOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3404:1: ( ( rule__AncestorOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3404:1: ( ( rule__AncestorOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3405:2: ( rule__AncestorOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3406:2: ( rule__AncestorOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3406:3: rule__AncestorOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOf__Group__1__Impl"


    // $ANTLR start "rule__AncestorOrSelfOf__Group__0"
    // InternalEclParser.g:3415:1: rule__AncestorOrSelfOf__Group__0 : rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1 ;
    public final void rule__AncestorOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3419:1: ( rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1 )
            // InternalEclParser.g:3420:2: rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AncestorOrSelfOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOrSelfOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOrSelfOf__Group__0"


    // $ANTLR start "rule__AncestorOrSelfOf__Group__0__Impl"
    // InternalEclParser.g:3427:1: rule__AncestorOrSelfOf__Group__0__Impl : ( RULE_DBL_GT ) ;
    public final void rule__AncestorOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3431:1: ( ( RULE_DBL_GT ) )
            // InternalEclParser.g:3432:1: ( RULE_DBL_GT )
            {
            // InternalEclParser.g:3432:1: ( RULE_DBL_GT )
            // InternalEclParser.g:3433:2: RULE_DBL_GT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); 
            }
            match(input,RULE_DBL_GT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOrSelfOfAccess().getDBL_GTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOrSelfOf__Group__0__Impl"


    // $ANTLR start "rule__AncestorOrSelfOf__Group__1"
    // InternalEclParser.g:3442:1: rule__AncestorOrSelfOf__Group__1 : rule__AncestorOrSelfOf__Group__1__Impl ;
    public final void rule__AncestorOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3446:1: ( rule__AncestorOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3447:2: rule__AncestorOrSelfOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOrSelfOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOrSelfOf__Group__1"


    // $ANTLR start "rule__AncestorOrSelfOf__Group__1__Impl"
    // InternalEclParser.g:3453:1: rule__AncestorOrSelfOf__Group__1__Impl : ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__AncestorOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3457:1: ( ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3458:1: ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3458:1: ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3459:2: ( rule__AncestorOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3460:2: ( rule__AncestorOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3460:3: rule__AncestorOrSelfOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AncestorOrSelfOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOrSelfOf__Group__1__Impl"


    // $ANTLR start "rule__MemberOf__Group__0"
    // InternalEclParser.g:3469:1: rule__MemberOf__Group__0 : rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1 ;
    public final void rule__MemberOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3473:1: ( rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1 )
            // InternalEclParser.g:3474:2: rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__MemberOf__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MemberOf__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__Group__0"


    // $ANTLR start "rule__MemberOf__Group__0__Impl"
    // InternalEclParser.g:3481:1: rule__MemberOf__Group__0__Impl : ( RULE_CARET ) ;
    public final void rule__MemberOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3485:1: ( ( RULE_CARET ) )
            // InternalEclParser.g:3486:1: ( RULE_CARET )
            {
            // InternalEclParser.g:3486:1: ( RULE_CARET )
            // InternalEclParser.g:3487:2: RULE_CARET
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); 
            }
            match(input,RULE_CARET,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberOfAccess().getCARETTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__Group__0__Impl"


    // $ANTLR start "rule__MemberOf__Group__1"
    // InternalEclParser.g:3496:1: rule__MemberOf__Group__1 : rule__MemberOf__Group__1__Impl ;
    public final void rule__MemberOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3500:1: ( rule__MemberOf__Group__1__Impl )
            // InternalEclParser.g:3501:2: rule__MemberOf__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MemberOf__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__Group__1"


    // $ANTLR start "rule__MemberOf__Group__1__Impl"
    // InternalEclParser.g:3507:1: rule__MemberOf__Group__1__Impl : ( ( rule__MemberOf__ConstraintAssignment_1 ) ) ;
    public final void rule__MemberOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3511:1: ( ( ( rule__MemberOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3512:1: ( ( rule__MemberOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3512:1: ( ( rule__MemberOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3513:2: ( rule__MemberOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3514:2: ( rule__MemberOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3514:3: rule__MemberOf__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MemberOf__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__Group__1__Impl"


    // $ANTLR start "rule__EclConceptReference__Group__0"
    // InternalEclParser.g:3523:1: rule__EclConceptReference__Group__0 : rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1 ;
    public final void rule__EclConceptReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3527:1: ( rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1 )
            // InternalEclParser.g:3528:2: rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_13);
            rule__EclConceptReference__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclConceptReference__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__Group__0"


    // $ANTLR start "rule__EclConceptReference__Group__0__Impl"
    // InternalEclParser.g:3535:1: rule__EclConceptReference__Group__0__Impl : ( ( rule__EclConceptReference__IdAssignment_0 ) ) ;
    public final void rule__EclConceptReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3539:1: ( ( ( rule__EclConceptReference__IdAssignment_0 ) ) )
            // InternalEclParser.g:3540:1: ( ( rule__EclConceptReference__IdAssignment_0 ) )
            {
            // InternalEclParser.g:3540:1: ( ( rule__EclConceptReference__IdAssignment_0 ) )
            // InternalEclParser.g:3541:2: ( rule__EclConceptReference__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); 
            }
            // InternalEclParser.g:3542:2: ( rule__EclConceptReference__IdAssignment_0 )
            // InternalEclParser.g:3542:3: rule__EclConceptReference__IdAssignment_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclConceptReference__IdAssignment_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__Group__0__Impl"


    // $ANTLR start "rule__EclConceptReference__Group__1"
    // InternalEclParser.g:3550:1: rule__EclConceptReference__Group__1 : rule__EclConceptReference__Group__1__Impl ;
    public final void rule__EclConceptReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3554:1: ( rule__EclConceptReference__Group__1__Impl )
            // InternalEclParser.g:3555:2: rule__EclConceptReference__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclConceptReference__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__Group__1"


    // $ANTLR start "rule__EclConceptReference__Group__1__Impl"
    // InternalEclParser.g:3561:1: rule__EclConceptReference__Group__1__Impl : ( ( rule__EclConceptReference__TermAssignment_1 )? ) ;
    public final void rule__EclConceptReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3565:1: ( ( ( rule__EclConceptReference__TermAssignment_1 )? ) )
            // InternalEclParser.g:3566:1: ( ( rule__EclConceptReference__TermAssignment_1 )? )
            {
            // InternalEclParser.g:3566:1: ( ( rule__EclConceptReference__TermAssignment_1 )? )
            // InternalEclParser.g:3567:2: ( rule__EclConceptReference__TermAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); 
            }
            // InternalEclParser.g:3568:2: ( rule__EclConceptReference__TermAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_TERM_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEclParser.g:3568:3: rule__EclConceptReference__TermAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EclConceptReference__TermAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__Group__1__Impl"


    // $ANTLR start "rule__Any__Group__0"
    // InternalEclParser.g:3577:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3581:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // InternalEclParser.g:3582:2: rule__Any__Group__0__Impl rule__Any__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_1);
            rule__Any__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Any__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0"


    // $ANTLR start "rule__Any__Group__0__Impl"
    // InternalEclParser.g:3589:1: rule__Any__Group__0__Impl : ( RULE_WILDCARD ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3593:1: ( ( RULE_WILDCARD ) )
            // InternalEclParser.g:3594:1: ( RULE_WILDCARD )
            {
            // InternalEclParser.g:3594:1: ( RULE_WILDCARD )
            // InternalEclParser.g:3595:2: RULE_WILDCARD
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); 
            }
            match(input,RULE_WILDCARD,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyAccess().getWILDCARDTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__0__Impl"


    // $ANTLR start "rule__Any__Group__1"
    // InternalEclParser.g:3604:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3608:1: ( rule__Any__Group__1__Impl )
            // InternalEclParser.g:3609:2: rule__Any__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Any__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1"


    // $ANTLR start "rule__Any__Group__1__Impl"
    // InternalEclParser.g:3615:1: rule__Any__Group__1__Impl : ( () ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3619:1: ( ( () ) )
            // InternalEclParser.g:3620:1: ( () )
            {
            // InternalEclParser.g:3620:1: ( () )
            // InternalEclParser.g:3621:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyAccess().getAnyAction_1()); 
            }
            // InternalEclParser.g:3622:2: ()
            // InternalEclParser.g:3622:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAnyAccess().getAnyAction_1()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Any__Group__1__Impl"


    // $ANTLR start "rule__OrRefinement__Group__0"
    // InternalEclParser.g:3631:1: rule__OrRefinement__Group__0 : rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1 ;
    public final void rule__OrRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3635:1: ( rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1 )
            // InternalEclParser.g:3636:2: rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrRefinement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group__0"


    // $ANTLR start "rule__OrRefinement__Group__0__Impl"
    // InternalEclParser.g:3643:1: rule__OrRefinement__Group__0__Impl : ( ruleAndRefinement ) ;
    public final void rule__OrRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3647:1: ( ( ruleAndRefinement ) )
            // InternalEclParser.g:3648:1: ( ruleAndRefinement )
            {
            // InternalEclParser.g:3648:1: ( ruleAndRefinement )
            // InternalEclParser.g:3649:2: ruleAndRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getAndRefinementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group__0__Impl"


    // $ANTLR start "rule__OrRefinement__Group__1"
    // InternalEclParser.g:3658:1: rule__OrRefinement__Group__1 : rule__OrRefinement__Group__1__Impl ;
    public final void rule__OrRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3662:1: ( rule__OrRefinement__Group__1__Impl )
            // InternalEclParser.g:3663:2: rule__OrRefinement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group__1"


    // $ANTLR start "rule__OrRefinement__Group__1__Impl"
    // InternalEclParser.g:3669:1: rule__OrRefinement__Group__1__Impl : ( ( rule__OrRefinement__Group_1__0 )* ) ;
    public final void rule__OrRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3673:1: ( ( ( rule__OrRefinement__Group_1__0 )* ) )
            // InternalEclParser.g:3674:1: ( ( rule__OrRefinement__Group_1__0 )* )
            {
            // InternalEclParser.g:3674:1: ( ( rule__OrRefinement__Group_1__0 )* )
            // InternalEclParser.g:3675:2: ( rule__OrRefinement__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup_1()); 
            }
            // InternalEclParser.g:3676:2: ( rule__OrRefinement__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DISJUNCTION) ) {
                    int LA31_5 = input.LA(2);

                    if ( (synpred56_InternalEclParser()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalEclParser.g:3676:3: rule__OrRefinement__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__OrRefinement__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group__1__Impl"


    // $ANTLR start "rule__OrRefinement__Group_1__0"
    // InternalEclParser.g:3685:1: rule__OrRefinement__Group_1__0 : rule__OrRefinement__Group_1__0__Impl ;
    public final void rule__OrRefinement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3689:1: ( rule__OrRefinement__Group_1__0__Impl )
            // InternalEclParser.g:3690:2: rule__OrRefinement__Group_1__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1__0"


    // $ANTLR start "rule__OrRefinement__Group_1__0__Impl"
    // InternalEclParser.g:3696:1: rule__OrRefinement__Group_1__0__Impl : ( ( rule__OrRefinement__Group_1_0__0 ) ) ;
    public final void rule__OrRefinement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3700:1: ( ( ( rule__OrRefinement__Group_1_0__0 ) ) )
            // InternalEclParser.g:3701:1: ( ( rule__OrRefinement__Group_1_0__0 ) )
            {
            // InternalEclParser.g:3701:1: ( ( rule__OrRefinement__Group_1_0__0 ) )
            // InternalEclParser.g:3702:2: ( rule__OrRefinement__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:3703:2: ( rule__OrRefinement__Group_1_0__0 )
            // InternalEclParser.g:3703:3: rule__OrRefinement__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1__0__Impl"


    // $ANTLR start "rule__OrRefinement__Group_1_0__0"
    // InternalEclParser.g:3712:1: rule__OrRefinement__Group_1_0__0 : rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1 ;
    public final void rule__OrRefinement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3716:1: ( rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1 )
            // InternalEclParser.g:3717:2: rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrRefinement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__0"


    // $ANTLR start "rule__OrRefinement__Group_1_0__0__Impl"
    // InternalEclParser.g:3724:1: rule__OrRefinement__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrRefinement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3728:1: ( ( () ) )
            // InternalEclParser.g:3729:1: ( () )
            {
            // InternalEclParser.g:3729:1: ( () )
            // InternalEclParser.g:3730:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); 
            }
            // InternalEclParser.g:3731:2: ()
            // InternalEclParser.g:3731:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__0__Impl"


    // $ANTLR start "rule__OrRefinement__Group_1_0__1"
    // InternalEclParser.g:3739:1: rule__OrRefinement__Group_1_0__1 : rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2 ;
    public final void rule__OrRefinement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3743:1: ( rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2 )
            // InternalEclParser.g:3744:2: rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__OrRefinement__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__1"


    // $ANTLR start "rule__OrRefinement__Group_1_0__1__Impl"
    // InternalEclParser.g:3751:1: rule__OrRefinement__Group_1_0__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrRefinement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3755:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:3756:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:3756:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:3757:2: RULE_DISJUNCTION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getDISJUNCTIONTerminalRuleCall_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__1__Impl"


    // $ANTLR start "rule__OrRefinement__Group_1_0__2"
    // InternalEclParser.g:3766:1: rule__OrRefinement__Group_1_0__2 : rule__OrRefinement__Group_1_0__2__Impl ;
    public final void rule__OrRefinement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3770:1: ( rule__OrRefinement__Group_1_0__2__Impl )
            // InternalEclParser.g:3771:2: rule__OrRefinement__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__2"


    // $ANTLR start "rule__OrRefinement__Group_1_0__2__Impl"
    // InternalEclParser.g:3777:1: rule__OrRefinement__Group_1_0__2__Impl : ( ( rule__OrRefinement__RightAssignment_1_0_2 ) ) ;
    public final void rule__OrRefinement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3781:1: ( ( ( rule__OrRefinement__RightAssignment_1_0_2 ) ) )
            // InternalEclParser.g:3782:1: ( ( rule__OrRefinement__RightAssignment_1_0_2 ) )
            {
            // InternalEclParser.g:3782:1: ( ( rule__OrRefinement__RightAssignment_1_0_2 ) )
            // InternalEclParser.g:3783:2: ( rule__OrRefinement__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); 
            }
            // InternalEclParser.g:3784:2: ( rule__OrRefinement__RightAssignment_1_0_2 )
            // InternalEclParser.g:3784:3: rule__OrRefinement__RightAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrRefinement__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__Group_1_0__2__Impl"


    // $ANTLR start "rule__AndRefinement__Group__0"
    // InternalEclParser.g:3793:1: rule__AndRefinement__Group__0 : rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1 ;
    public final void rule__AndRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3797:1: ( rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1 )
            // InternalEclParser.g:3798:2: rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndRefinement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group__0"


    // $ANTLR start "rule__AndRefinement__Group__0__Impl"
    // InternalEclParser.g:3805:1: rule__AndRefinement__Group__0__Impl : ( ruleSubRefinement ) ;
    public final void rule__AndRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3809:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:3810:1: ( ruleSubRefinement )
            {
            // InternalEclParser.g:3810:1: ( ruleSubRefinement )
            // InternalEclParser.g:3811:2: ruleSubRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getSubRefinementParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group__0__Impl"


    // $ANTLR start "rule__AndRefinement__Group__1"
    // InternalEclParser.g:3820:1: rule__AndRefinement__Group__1 : rule__AndRefinement__Group__1__Impl ;
    public final void rule__AndRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3824:1: ( rule__AndRefinement__Group__1__Impl )
            // InternalEclParser.g:3825:2: rule__AndRefinement__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group__1"


    // $ANTLR start "rule__AndRefinement__Group__1__Impl"
    // InternalEclParser.g:3831:1: rule__AndRefinement__Group__1__Impl : ( ( rule__AndRefinement__Group_1__0 )* ) ;
    public final void rule__AndRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3835:1: ( ( ( rule__AndRefinement__Group_1__0 )* ) )
            // InternalEclParser.g:3836:1: ( ( rule__AndRefinement__Group_1__0 )* )
            {
            // InternalEclParser.g:3836:1: ( ( rule__AndRefinement__Group_1__0 )* )
            // InternalEclParser.g:3837:2: ( rule__AndRefinement__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup_1()); 
            }
            // InternalEclParser.g:3838:2: ( rule__AndRefinement__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_CONJUNCTION) ) {
                    int LA32_4 = input.LA(2);

                    if ( (synpred57_InternalEclParser()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_COMMA) ) {
                    int LA32_5 = input.LA(2);

                    if ( (synpred57_InternalEclParser()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalEclParser.g:3838:3: rule__AndRefinement__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AndRefinement__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group__1__Impl"


    // $ANTLR start "rule__AndRefinement__Group_1__0"
    // InternalEclParser.g:3847:1: rule__AndRefinement__Group_1__0 : rule__AndRefinement__Group_1__0__Impl ;
    public final void rule__AndRefinement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3851:1: ( rule__AndRefinement__Group_1__0__Impl )
            // InternalEclParser.g:3852:2: rule__AndRefinement__Group_1__0__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1__0"


    // $ANTLR start "rule__AndRefinement__Group_1__0__Impl"
    // InternalEclParser.g:3858:1: rule__AndRefinement__Group_1__0__Impl : ( ( rule__AndRefinement__Group_1_0__0 ) ) ;
    public final void rule__AndRefinement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3862:1: ( ( ( rule__AndRefinement__Group_1_0__0 ) ) )
            // InternalEclParser.g:3863:1: ( ( rule__AndRefinement__Group_1_0__0 ) )
            {
            // InternalEclParser.g:3863:1: ( ( rule__AndRefinement__Group_1_0__0 ) )
            // InternalEclParser.g:3864:2: ( rule__AndRefinement__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:3865:2: ( rule__AndRefinement__Group_1_0__0 )
            // InternalEclParser.g:3865:3: rule__AndRefinement__Group_1_0__0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group_1_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getGroup_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1__0__Impl"


    // $ANTLR start "rule__AndRefinement__Group_1_0__0"
    // InternalEclParser.g:3874:1: rule__AndRefinement__Group_1_0__0 : rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1 ;
    public final void rule__AndRefinement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3878:1: ( rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1 )
            // InternalEclParser.g:3879:2: rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndRefinement__Group_1_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group_1_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__0"


    // $ANTLR start "rule__AndRefinement__Group_1_0__0__Impl"
    // InternalEclParser.g:3886:1: rule__AndRefinement__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndRefinement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3890:1: ( ( () ) )
            // InternalEclParser.g:3891:1: ( () )
            {
            // InternalEclParser.g:3891:1: ( () )
            // InternalEclParser.g:3892:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); 
            }
            // InternalEclParser.g:3893:2: ()
            // InternalEclParser.g:3893:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__0__Impl"


    // $ANTLR start "rule__AndRefinement__Group_1_0__1"
    // InternalEclParser.g:3901:1: rule__AndRefinement__Group_1_0__1 : rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2 ;
    public final void rule__AndRefinement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3905:1: ( rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2 )
            // InternalEclParser.g:3906:2: rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__AndRefinement__Group_1_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group_1_0__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__1"


    // $ANTLR start "rule__AndRefinement__Group_1_0__1__Impl"
    // InternalEclParser.g:3913:1: rule__AndRefinement__Group_1_0__1__Impl : ( ( rule__AndRefinement__Alternatives_1_0_1 ) ) ;
    public final void rule__AndRefinement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3917:1: ( ( ( rule__AndRefinement__Alternatives_1_0_1 ) ) )
            // InternalEclParser.g:3918:1: ( ( rule__AndRefinement__Alternatives_1_0_1 ) )
            {
            // InternalEclParser.g:3918:1: ( ( rule__AndRefinement__Alternatives_1_0_1 ) )
            // InternalEclParser.g:3919:2: ( rule__AndRefinement__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); 
            }
            // InternalEclParser.g:3920:2: ( rule__AndRefinement__Alternatives_1_0_1 )
            // InternalEclParser.g:3920:3: rule__AndRefinement__Alternatives_1_0_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Alternatives_1_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__1__Impl"


    // $ANTLR start "rule__AndRefinement__Group_1_0__2"
    // InternalEclParser.g:3928:1: rule__AndRefinement__Group_1_0__2 : rule__AndRefinement__Group_1_0__2__Impl ;
    public final void rule__AndRefinement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3932:1: ( rule__AndRefinement__Group_1_0__2__Impl )
            // InternalEclParser.g:3933:2: rule__AndRefinement__Group_1_0__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__Group_1_0__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__2"


    // $ANTLR start "rule__AndRefinement__Group_1_0__2__Impl"
    // InternalEclParser.g:3939:1: rule__AndRefinement__Group_1_0__2__Impl : ( ( rule__AndRefinement__RightAssignment_1_0_2 ) ) ;
    public final void rule__AndRefinement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3943:1: ( ( ( rule__AndRefinement__RightAssignment_1_0_2 ) ) )
            // InternalEclParser.g:3944:1: ( ( rule__AndRefinement__RightAssignment_1_0_2 ) )
            {
            // InternalEclParser.g:3944:1: ( ( rule__AndRefinement__RightAssignment_1_0_2 ) )
            // InternalEclParser.g:3945:2: ( rule__AndRefinement__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); 
            }
            // InternalEclParser.g:3946:2: ( rule__AndRefinement__RightAssignment_1_0_2 )
            // InternalEclParser.g:3946:3: rule__AndRefinement__RightAssignment_1_0_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndRefinement__RightAssignment_1_0_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__Group_1_0__2__Impl"


    // $ANTLR start "rule__NestedRefinement__Group__0"
    // InternalEclParser.g:3955:1: rule__NestedRefinement__Group__0 : rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1 ;
    public final void rule__NestedRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3959:1: ( rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1 )
            // InternalEclParser.g:3960:2: rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_10);
            rule__NestedRefinement__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedRefinement__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__0"


    // $ANTLR start "rule__NestedRefinement__Group__0__Impl"
    // InternalEclParser.g:3967:1: rule__NestedRefinement__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3971:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:3972:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:3972:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:3973:2: RULE_ROUND_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); 
            }
            match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementAccess().getROUND_OPENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__0__Impl"


    // $ANTLR start "rule__NestedRefinement__Group__1"
    // InternalEclParser.g:3982:1: rule__NestedRefinement__Group__1 : rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2 ;
    public final void rule__NestedRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3986:1: ( rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2 )
            // InternalEclParser.g:3987:2: rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__NestedRefinement__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedRefinement__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__1"


    // $ANTLR start "rule__NestedRefinement__Group__1__Impl"
    // InternalEclParser.g:3994:1: rule__NestedRefinement__Group__1__Impl : ( ( rule__NestedRefinement__NestedAssignment_1 ) ) ;
    public final void rule__NestedRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3998:1: ( ( ( rule__NestedRefinement__NestedAssignment_1 ) ) )
            // InternalEclParser.g:3999:1: ( ( rule__NestedRefinement__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:3999:1: ( ( rule__NestedRefinement__NestedAssignment_1 ) )
            // InternalEclParser.g:4000:2: ( rule__NestedRefinement__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:4001:2: ( rule__NestedRefinement__NestedAssignment_1 )
            // InternalEclParser.g:4001:3: rule__NestedRefinement__NestedAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedRefinement__NestedAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__1__Impl"


    // $ANTLR start "rule__NestedRefinement__Group__2"
    // InternalEclParser.g:4009:1: rule__NestedRefinement__Group__2 : rule__NestedRefinement__Group__2__Impl ;
    public final void rule__NestedRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4013:1: ( rule__NestedRefinement__Group__2__Impl )
            // InternalEclParser.g:4014:2: rule__NestedRefinement__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedRefinement__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__2"


    // $ANTLR start "rule__NestedRefinement__Group__2__Impl"
    // InternalEclParser.g:4020:1: rule__NestedRefinement__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4024:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:4025:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:4025:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:4026:2: RULE_ROUND_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }
            match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__Group__2__Impl"


    // $ANTLR start "rule__EclAttributeGroup__Group__0"
    // InternalEclParser.g:4036:1: rule__EclAttributeGroup__Group__0 : rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1 ;
    public final void rule__EclAttributeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4040:1: ( rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1 )
            // InternalEclParser.g:4041:2: rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_15);
            rule__EclAttributeGroup__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__0"


    // $ANTLR start "rule__EclAttributeGroup__Group__0__Impl"
    // InternalEclParser.g:4048:1: rule__EclAttributeGroup__Group__0__Impl : ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? ) ;
    public final void rule__EclAttributeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4052:1: ( ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:4053:1: ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:4053:1: ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? )
            // InternalEclParser.g:4054:2: ( rule__EclAttributeGroup__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:4055:2: ( rule__EclAttributeGroup__CardinalityAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SQUARE_OPEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEclParser.g:4055:3: rule__EclAttributeGroup__CardinalityAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__EclAttributeGroup__CardinalityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__0__Impl"


    // $ANTLR start "rule__EclAttributeGroup__Group__1"
    // InternalEclParser.g:4063:1: rule__EclAttributeGroup__Group__1 : rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2 ;
    public final void rule__EclAttributeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4067:1: ( rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2 )
            // InternalEclParser.g:4068:2: rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__EclAttributeGroup__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__1"


    // $ANTLR start "rule__EclAttributeGroup__Group__1__Impl"
    // InternalEclParser.g:4075:1: rule__EclAttributeGroup__Group__1__Impl : ( RULE_CURLY_OPEN ) ;
    public final void rule__EclAttributeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4079:1: ( ( RULE_CURLY_OPEN ) )
            // InternalEclParser.g:4080:1: ( RULE_CURLY_OPEN )
            {
            // InternalEclParser.g:4080:1: ( RULE_CURLY_OPEN )
            // InternalEclParser.g:4081:2: RULE_CURLY_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); 
            }
            match(input,RULE_CURLY_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getCURLY_OPENTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__1__Impl"


    // $ANTLR start "rule__EclAttributeGroup__Group__2"
    // InternalEclParser.g:4090:1: rule__EclAttributeGroup__Group__2 : rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3 ;
    public final void rule__EclAttributeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4094:1: ( rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3 )
            // InternalEclParser.g:4095:2: rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_17);
            rule__EclAttributeGroup__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__2"


    // $ANTLR start "rule__EclAttributeGroup__Group__2__Impl"
    // InternalEclParser.g:4102:1: rule__EclAttributeGroup__Group__2__Impl : ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) ) ;
    public final void rule__EclAttributeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4106:1: ( ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) ) )
            // InternalEclParser.g:4107:1: ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) )
            {
            // InternalEclParser.g:4107:1: ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) )
            // InternalEclParser.g:4108:2: ( rule__EclAttributeGroup__RefinementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); 
            }
            // InternalEclParser.g:4109:2: ( rule__EclAttributeGroup__RefinementAssignment_2 )
            // InternalEclParser.g:4109:3: rule__EclAttributeGroup__RefinementAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__RefinementAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__2__Impl"


    // $ANTLR start "rule__EclAttributeGroup__Group__3"
    // InternalEclParser.g:4117:1: rule__EclAttributeGroup__Group__3 : rule__EclAttributeGroup__Group__3__Impl ;
    public final void rule__EclAttributeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4121:1: ( rule__EclAttributeGroup__Group__3__Impl )
            // InternalEclParser.g:4122:2: rule__EclAttributeGroup__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__EclAttributeGroup__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__3"


    // $ANTLR start "rule__EclAttributeGroup__Group__3__Impl"
    // InternalEclParser.g:4128:1: rule__EclAttributeGroup__Group__3__Impl : ( RULE_CURLY_CLOSE ) ;
    public final void rule__EclAttributeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4132:1: ( ( RULE_CURLY_CLOSE ) )
            // InternalEclParser.g:4133:1: ( RULE_CURLY_CLOSE )
            {
            // InternalEclParser.g:4133:1: ( RULE_CURLY_CLOSE )
            // InternalEclParser.g:4134:2: RULE_CURLY_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); 
            }
            match(input,RULE_CURLY_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getCURLY_CLOSETerminalRuleCall_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__Group__3__Impl"


    // $ANTLR start "rule__OrAttributeSet__Group__0"
    // InternalEclParser.g:4144:1: rule__OrAttributeSet__Group__0 : rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1 ;
    public final void rule__OrAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4148:1: ( rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1 )
            // InternalEclParser.g:4149:2: rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group__0"


    // $ANTLR start "rule__OrAttributeSet__Group__0__Impl"
    // InternalEclParser.g:4156:1: rule__OrAttributeSet__Group__0__Impl : ( ruleAndAttributeSet ) ;
    public final void rule__OrAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4160:1: ( ( ruleAndAttributeSet ) )
            // InternalEclParser.g:4161:1: ( ruleAndAttributeSet )
            {
            // InternalEclParser.g:4161:1: ( ruleAndAttributeSet )
            // InternalEclParser.g:4162:2: ruleAndAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getAndAttributeSetParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__OrAttributeSet__Group__1"
    // InternalEclParser.g:4171:1: rule__OrAttributeSet__Group__1 : rule__OrAttributeSet__Group__1__Impl ;
    public final void rule__OrAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4175:1: ( rule__OrAttributeSet__Group__1__Impl )
            // InternalEclParser.g:4176:2: rule__OrAttributeSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group__1"


    // $ANTLR start "rule__OrAttributeSet__Group__1__Impl"
    // InternalEclParser.g:4182:1: rule__OrAttributeSet__Group__1__Impl : ( ( rule__OrAttributeSet__Group_1__0 )* ) ;
    public final void rule__OrAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4186:1: ( ( ( rule__OrAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:4187:1: ( ( rule__OrAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:4187:1: ( ( rule__OrAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:4188:2: ( rule__OrAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:4189:2: ( rule__OrAttributeSet__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DISJUNCTION) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEclParser.g:4189:3: rule__OrAttributeSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_5);
            	    rule__OrAttributeSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__OrAttributeSet__Group_1__0"
    // InternalEclParser.g:4198:1: rule__OrAttributeSet__Group_1__0 : rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1 ;
    public final void rule__OrAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4202:1: ( rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1 )
            // InternalEclParser.g:4203:2: rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_4);
            rule__OrAttributeSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__0"


    // $ANTLR start "rule__OrAttributeSet__Group_1__0__Impl"
    // InternalEclParser.g:4210:1: rule__OrAttributeSet__Group_1__0__Impl : ( () ) ;
    public final void rule__OrAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4214:1: ( ( () ) )
            // InternalEclParser.g:4215:1: ( () )
            {
            // InternalEclParser.g:4215:1: ( () )
            // InternalEclParser.g:4216:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); 
            }
            // InternalEclParser.g:4217:2: ()
            // InternalEclParser.g:4217:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__0__Impl"


    // $ANTLR start "rule__OrAttributeSet__Group_1__1"
    // InternalEclParser.g:4225:1: rule__OrAttributeSet__Group_1__1 : rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2 ;
    public final void rule__OrAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4229:1: ( rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2 )
            // InternalEclParser.g:4230:2: rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__OrAttributeSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__1"


    // $ANTLR start "rule__OrAttributeSet__Group_1__1__Impl"
    // InternalEclParser.g:4237:1: rule__OrAttributeSet__Group_1__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4241:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:4242:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:4242:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:4243:2: RULE_DISJUNCTION
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); 
            }
            match(input,RULE_DISJUNCTION,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getDISJUNCTIONTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__1__Impl"


    // $ANTLR start "rule__OrAttributeSet__Group_1__2"
    // InternalEclParser.g:4252:1: rule__OrAttributeSet__Group_1__2 : rule__OrAttributeSet__Group_1__2__Impl ;
    public final void rule__OrAttributeSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4256:1: ( rule__OrAttributeSet__Group_1__2__Impl )
            // InternalEclParser.g:4257:2: rule__OrAttributeSet__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__2"


    // $ANTLR start "rule__OrAttributeSet__Group_1__2__Impl"
    // InternalEclParser.g:4263:1: rule__OrAttributeSet__Group_1__2__Impl : ( ( rule__OrAttributeSet__RightAssignment_1_2 ) ) ;
    public final void rule__OrAttributeSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4267:1: ( ( ( rule__OrAttributeSet__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:4268:1: ( ( rule__OrAttributeSet__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:4268:1: ( ( rule__OrAttributeSet__RightAssignment_1_2 ) )
            // InternalEclParser.g:4269:2: ( rule__OrAttributeSet__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:4270:2: ( rule__OrAttributeSet__RightAssignment_1_2 )
            // InternalEclParser.g:4270:3: rule__OrAttributeSet__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__OrAttributeSet__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__Group_1__2__Impl"


    // $ANTLR start "rule__AndAttributeSet__Group__0"
    // InternalEclParser.g:4279:1: rule__AndAttributeSet__Group__0 : rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1 ;
    public final void rule__AndAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4283:1: ( rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1 )
            // InternalEclParser.g:4284:2: rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group__0"


    // $ANTLR start "rule__AndAttributeSet__Group__0__Impl"
    // InternalEclParser.g:4291:1: rule__AndAttributeSet__Group__0__Impl : ( ruleSubAttributeSet ) ;
    public final void rule__AndAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4295:1: ( ( ruleSubAttributeSet ) )
            // InternalEclParser.g:4296:1: ( ruleSubAttributeSet )
            {
            // InternalEclParser.g:4296:1: ( ruleSubAttributeSet )
            // InternalEclParser.g:4297:2: ruleSubAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getSubAttributeSetParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__AndAttributeSet__Group__1"
    // InternalEclParser.g:4306:1: rule__AndAttributeSet__Group__1 : rule__AndAttributeSet__Group__1__Impl ;
    public final void rule__AndAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4310:1: ( rule__AndAttributeSet__Group__1__Impl )
            // InternalEclParser.g:4311:2: rule__AndAttributeSet__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group__1"


    // $ANTLR start "rule__AndAttributeSet__Group__1__Impl"
    // InternalEclParser.g:4317:1: rule__AndAttributeSet__Group__1__Impl : ( ( rule__AndAttributeSet__Group_1__0 )* ) ;
    public final void rule__AndAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4321:1: ( ( ( rule__AndAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:4322:1: ( ( rule__AndAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:4322:1: ( ( rule__AndAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:4323:2: ( rule__AndAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:4324:2: ( rule__AndAttributeSet__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_COMMA && LA35_0<=RULE_CONJUNCTION)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEclParser.g:4324:3: rule__AndAttributeSet__Group_1__0
            	    {
            	    pushFollow(FollowSets000.FOLLOW_7);
            	    rule__AndAttributeSet__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__AndAttributeSet__Group_1__0"
    // InternalEclParser.g:4333:1: rule__AndAttributeSet__Group_1__0 : rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1 ;
    public final void rule__AndAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4337:1: ( rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1 )
            // InternalEclParser.g:4338:2: rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_6);
            rule__AndAttributeSet__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__0"


    // $ANTLR start "rule__AndAttributeSet__Group_1__0__Impl"
    // InternalEclParser.g:4345:1: rule__AndAttributeSet__Group_1__0__Impl : ( () ) ;
    public final void rule__AndAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4349:1: ( ( () ) )
            // InternalEclParser.g:4350:1: ( () )
            {
            // InternalEclParser.g:4350:1: ( () )
            // InternalEclParser.g:4351:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); 
            }
            // InternalEclParser.g:4352:2: ()
            // InternalEclParser.g:4352:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__0__Impl"


    // $ANTLR start "rule__AndAttributeSet__Group_1__1"
    // InternalEclParser.g:4360:1: rule__AndAttributeSet__Group_1__1 : rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2 ;
    public final void rule__AndAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4364:1: ( rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2 )
            // InternalEclParser.g:4365:2: rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AndAttributeSet__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group_1__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__1"


    // $ANTLR start "rule__AndAttributeSet__Group_1__1__Impl"
    // InternalEclParser.g:4372:1: rule__AndAttributeSet__Group_1__1__Impl : ( ( rule__AndAttributeSet__Alternatives_1_1 ) ) ;
    public final void rule__AndAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4376:1: ( ( ( rule__AndAttributeSet__Alternatives_1_1 ) ) )
            // InternalEclParser.g:4377:1: ( ( rule__AndAttributeSet__Alternatives_1_1 ) )
            {
            // InternalEclParser.g:4377:1: ( ( rule__AndAttributeSet__Alternatives_1_1 ) )
            // InternalEclParser.g:4378:2: ( rule__AndAttributeSet__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:4379:2: ( rule__AndAttributeSet__Alternatives_1_1 )
            // InternalEclParser.g:4379:3: rule__AndAttributeSet__Alternatives_1_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Alternatives_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__1__Impl"


    // $ANTLR start "rule__AndAttributeSet__Group_1__2"
    // InternalEclParser.g:4387:1: rule__AndAttributeSet__Group_1__2 : rule__AndAttributeSet__Group_1__2__Impl ;
    public final void rule__AndAttributeSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4391:1: ( rule__AndAttributeSet__Group_1__2__Impl )
            // InternalEclParser.g:4392:2: rule__AndAttributeSet__Group_1__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__Group_1__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__2"


    // $ANTLR start "rule__AndAttributeSet__Group_1__2__Impl"
    // InternalEclParser.g:4398:1: rule__AndAttributeSet__Group_1__2__Impl : ( ( rule__AndAttributeSet__RightAssignment_1_2 ) ) ;
    public final void rule__AndAttributeSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4402:1: ( ( ( rule__AndAttributeSet__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:4403:1: ( ( rule__AndAttributeSet__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:4403:1: ( ( rule__AndAttributeSet__RightAssignment_1_2 ) )
            // InternalEclParser.g:4404:2: ( rule__AndAttributeSet__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:4405:2: ( rule__AndAttributeSet__RightAssignment_1_2 )
            // InternalEclParser.g:4405:3: rule__AndAttributeSet__RightAssignment_1_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AndAttributeSet__RightAssignment_1_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__Group_1__2__Impl"


    // $ANTLR start "rule__NestedAttributeSet__Group__0"
    // InternalEclParser.g:4414:1: rule__NestedAttributeSet__Group__0 : rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1 ;
    public final void rule__NestedAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4418:1: ( rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1 )
            // InternalEclParser.g:4419:2: rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__NestedAttributeSet__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedAttributeSet__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__0"


    // $ANTLR start "rule__NestedAttributeSet__Group__0__Impl"
    // InternalEclParser.g:4426:1: rule__NestedAttributeSet__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4430:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:4431:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:4431:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:4432:2: RULE_ROUND_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); 
            }
            match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetAccess().getROUND_OPENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__0__Impl"


    // $ANTLR start "rule__NestedAttributeSet__Group__1"
    // InternalEclParser.g:4441:1: rule__NestedAttributeSet__Group__1 : rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2 ;
    public final void rule__NestedAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4445:1: ( rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2 )
            // InternalEclParser.g:4446:2: rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__NestedAttributeSet__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedAttributeSet__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__1"


    // $ANTLR start "rule__NestedAttributeSet__Group__1__Impl"
    // InternalEclParser.g:4453:1: rule__NestedAttributeSet__Group__1__Impl : ( ( rule__NestedAttributeSet__NestedAssignment_1 ) ) ;
    public final void rule__NestedAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4457:1: ( ( ( rule__NestedAttributeSet__NestedAssignment_1 ) ) )
            // InternalEclParser.g:4458:1: ( ( rule__NestedAttributeSet__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:4458:1: ( ( rule__NestedAttributeSet__NestedAssignment_1 ) )
            // InternalEclParser.g:4459:2: ( rule__NestedAttributeSet__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:4460:2: ( rule__NestedAttributeSet__NestedAssignment_1 )
            // InternalEclParser.g:4460:3: rule__NestedAttributeSet__NestedAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedAttributeSet__NestedAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__1__Impl"


    // $ANTLR start "rule__NestedAttributeSet__Group__2"
    // InternalEclParser.g:4468:1: rule__NestedAttributeSet__Group__2 : rule__NestedAttributeSet__Group__2__Impl ;
    public final void rule__NestedAttributeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4472:1: ( rule__NestedAttributeSet__Group__2__Impl )
            // InternalEclParser.g:4473:2: rule__NestedAttributeSet__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedAttributeSet__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__2"


    // $ANTLR start "rule__NestedAttributeSet__Group__2__Impl"
    // InternalEclParser.g:4479:1: rule__NestedAttributeSet__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedAttributeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4483:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:4484:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:4484:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:4485:2: RULE_ROUND_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }
            match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__Group__2__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__0"
    // InternalEclParser.g:4495:1: rule__AttributeConstraint__Group__0 : rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 ;
    public final void rule__AttributeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4499:1: ( rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 )
            // InternalEclParser.g:4500:2: rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AttributeConstraint__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__0"


    // $ANTLR start "rule__AttributeConstraint__Group__0__Impl"
    // InternalEclParser.g:4507:1: rule__AttributeConstraint__Group__0__Impl : ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? ) ;
    public final void rule__AttributeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4511:1: ( ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:4512:1: ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:4512:1: ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? )
            // InternalEclParser.g:4513:2: ( rule__AttributeConstraint__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:4514:2: ( rule__AttributeConstraint__CardinalityAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_SQUARE_OPEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEclParser.g:4514:3: rule__AttributeConstraint__CardinalityAssignment_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeConstraint__CardinalityAssignment_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__0__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__1"
    // InternalEclParser.g:4522:1: rule__AttributeConstraint__Group__1 : rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 ;
    public final void rule__AttributeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4526:1: ( rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 )
            // InternalEclParser.g:4527:2: rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_16);
            rule__AttributeConstraint__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__1"


    // $ANTLR start "rule__AttributeConstraint__Group__1__Impl"
    // InternalEclParser.g:4534:1: rule__AttributeConstraint__Group__1__Impl : ( ( rule__AttributeConstraint__ReversedAssignment_1 )? ) ;
    public final void rule__AttributeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4538:1: ( ( ( rule__AttributeConstraint__ReversedAssignment_1 )? ) )
            // InternalEclParser.g:4539:1: ( ( rule__AttributeConstraint__ReversedAssignment_1 )? )
            {
            // InternalEclParser.g:4539:1: ( ( rule__AttributeConstraint__ReversedAssignment_1 )? )
            // InternalEclParser.g:4540:2: ( rule__AttributeConstraint__ReversedAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); 
            }
            // InternalEclParser.g:4541:2: ( rule__AttributeConstraint__ReversedAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_REVERSED) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEclParser.g:4541:3: rule__AttributeConstraint__ReversedAssignment_1
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__AttributeConstraint__ReversedAssignment_1();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__1__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__2"
    // InternalEclParser.g:4549:1: rule__AttributeConstraint__Group__2 : rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3 ;
    public final void rule__AttributeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4553:1: ( rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3 )
            // InternalEclParser.g:4554:2: rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_18);
            rule__AttributeConstraint__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__2"


    // $ANTLR start "rule__AttributeConstraint__Group__2__Impl"
    // InternalEclParser.g:4561:1: rule__AttributeConstraint__Group__2__Impl : ( ( rule__AttributeConstraint__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4565:1: ( ( ( rule__AttributeConstraint__AttributeAssignment_2 ) ) )
            // InternalEclParser.g:4566:1: ( ( rule__AttributeConstraint__AttributeAssignment_2 ) )
            {
            // InternalEclParser.g:4566:1: ( ( rule__AttributeConstraint__AttributeAssignment_2 ) )
            // InternalEclParser.g:4567:2: ( rule__AttributeConstraint__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); 
            }
            // InternalEclParser.g:4568:2: ( rule__AttributeConstraint__AttributeAssignment_2 )
            // InternalEclParser.g:4568:3: rule__AttributeConstraint__AttributeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__AttributeAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__2__Impl"


    // $ANTLR start "rule__AttributeConstraint__Group__3"
    // InternalEclParser.g:4576:1: rule__AttributeConstraint__Group__3 : rule__AttributeConstraint__Group__3__Impl ;
    public final void rule__AttributeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4580:1: ( rule__AttributeConstraint__Group__3__Impl )
            // InternalEclParser.g:4581:2: rule__AttributeConstraint__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__3"


    // $ANTLR start "rule__AttributeConstraint__Group__3__Impl"
    // InternalEclParser.g:4587:1: rule__AttributeConstraint__Group__3__Impl : ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) ) ;
    public final void rule__AttributeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4591:1: ( ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) ) )
            // InternalEclParser.g:4592:1: ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) )
            {
            // InternalEclParser.g:4592:1: ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) )
            // InternalEclParser.g:4593:2: ( rule__AttributeConstraint__ComparisonAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); 
            }
            // InternalEclParser.g:4594:2: ( rule__AttributeConstraint__ComparisonAssignment_3 )
            // InternalEclParser.g:4594:3: rule__AttributeConstraint__ComparisonAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeConstraint__ComparisonAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__0"
    // InternalEclParser.g:4603:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4607:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalEclParser.g:4608:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__Cardinality__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0"


    // $ANTLR start "rule__Cardinality__Group__0__Impl"
    // InternalEclParser.g:4615:1: rule__Cardinality__Group__0__Impl : ( RULE_SQUARE_OPEN ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4619:1: ( ( RULE_SQUARE_OPEN ) )
            // InternalEclParser.g:4620:1: ( RULE_SQUARE_OPEN )
            {
            // InternalEclParser.g:4620:1: ( RULE_SQUARE_OPEN )
            // InternalEclParser.g:4621:2: RULE_SQUARE_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); 
            }
            match(input,RULE_SQUARE_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getSQUARE_OPENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__0__Impl"


    // $ANTLR start "rule__Cardinality__Group__1"
    // InternalEclParser.g:4630:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4634:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalEclParser.g:4635:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_20);
            rule__Cardinality__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1"


    // $ANTLR start "rule__Cardinality__Group__1__Impl"
    // InternalEclParser.g:4642:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__MinAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4646:1: ( ( ( rule__Cardinality__MinAssignment_1 ) ) )
            // InternalEclParser.g:4647:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            {
            // InternalEclParser.g:4647:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            // InternalEclParser.g:4648:2: ( rule__Cardinality__MinAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); 
            }
            // InternalEclParser.g:4649:2: ( rule__Cardinality__MinAssignment_1 )
            // InternalEclParser.g:4649:3: rule__Cardinality__MinAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__MinAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getMinAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__1__Impl"


    // $ANTLR start "rule__Cardinality__Group__2"
    // InternalEclParser.g:4657:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4661:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalEclParser.g:4662:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_21);
            rule__Cardinality__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2"


    // $ANTLR start "rule__Cardinality__Group__2__Impl"
    // InternalEclParser.g:4669:1: rule__Cardinality__Group__2__Impl : ( RULE_TO ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4673:1: ( ( RULE_TO ) )
            // InternalEclParser.g:4674:1: ( RULE_TO )
            {
            // InternalEclParser.g:4674:1: ( RULE_TO )
            // InternalEclParser.g:4675:2: RULE_TO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); 
            }
            match(input,RULE_TO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getTOTerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__2__Impl"


    // $ANTLR start "rule__Cardinality__Group__3"
    // InternalEclParser.g:4684:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4688:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalEclParser.g:4689:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_22);
            rule__Cardinality__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3"


    // $ANTLR start "rule__Cardinality__Group__3__Impl"
    // InternalEclParser.g:4696:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__MaxAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4700:1: ( ( ( rule__Cardinality__MaxAssignment_3 ) ) )
            // InternalEclParser.g:4701:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            {
            // InternalEclParser.g:4701:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            // InternalEclParser.g:4702:2: ( rule__Cardinality__MaxAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); 
            }
            // InternalEclParser.g:4703:2: ( rule__Cardinality__MaxAssignment_3 )
            // InternalEclParser.g:4703:3: rule__Cardinality__MaxAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__MaxAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__3__Impl"


    // $ANTLR start "rule__Cardinality__Group__4"
    // InternalEclParser.g:4711:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4715:1: ( rule__Cardinality__Group__4__Impl )
            // InternalEclParser.g:4716:2: rule__Cardinality__Group__4__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Cardinality__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4"


    // $ANTLR start "rule__Cardinality__Group__4__Impl"
    // InternalEclParser.g:4722:1: rule__Cardinality__Group__4__Impl : ( RULE_SQUARE_CLOSE ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4726:1: ( ( RULE_SQUARE_CLOSE ) )
            // InternalEclParser.g:4727:1: ( RULE_SQUARE_CLOSE )
            {
            // InternalEclParser.g:4727:1: ( RULE_SQUARE_CLOSE )
            // InternalEclParser.g:4728:2: RULE_SQUARE_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); 
            }
            match(input,RULE_SQUARE_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getSQUARE_CLOSETerminalRuleCall_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__Group__4__Impl"


    // $ANTLR start "rule__AttributeValueEquals__Group__0"
    // InternalEclParser.g:4738:1: rule__AttributeValueEquals__Group__0 : rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1 ;
    public final void rule__AttributeValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4742:1: ( rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1 )
            // InternalEclParser.g:4743:2: rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeValueEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueEquals__Group__0"


    // $ANTLR start "rule__AttributeValueEquals__Group__0__Impl"
    // InternalEclParser.g:4750:1: rule__AttributeValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__AttributeValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4754:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4755:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4755:1: ( RULE_EQUAL )
            // InternalEclParser.g:4756:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueEquals__Group__0__Impl"


    // $ANTLR start "rule__AttributeValueEquals__Group__1"
    // InternalEclParser.g:4765:1: rule__AttributeValueEquals__Group__1 : rule__AttributeValueEquals__Group__1__Impl ;
    public final void rule__AttributeValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4769:1: ( rule__AttributeValueEquals__Group__1__Impl )
            // InternalEclParser.g:4770:2: rule__AttributeValueEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueEquals__Group__1"


    // $ANTLR start "rule__AttributeValueEquals__Group__1__Impl"
    // InternalEclParser.g:4776:1: rule__AttributeValueEquals__Group__1__Impl : ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) ) ;
    public final void rule__AttributeValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4780:1: ( ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:4781:1: ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:4781:1: ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) )
            // InternalEclParser.g:4782:2: ( rule__AttributeValueEquals__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:4783:2: ( rule__AttributeValueEquals__ConstraintAssignment_1 )
            // InternalEclParser.g:4783:3: rule__AttributeValueEquals__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueEquals__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueEquals__Group__1__Impl"


    // $ANTLR start "rule__AttributeValueNotEquals__Group__0"
    // InternalEclParser.g:4792:1: rule__AttributeValueNotEquals__Group__0 : rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1 ;
    public final void rule__AttributeValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4796:1: ( rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1 )
            // InternalEclParser.g:4797:2: rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__AttributeValueNotEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueNotEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueNotEquals__Group__0"


    // $ANTLR start "rule__AttributeValueNotEquals__Group__0__Impl"
    // InternalEclParser.g:4804:1: rule__AttributeValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__AttributeValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4808:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4809:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4809:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4810:2: RULE_NOT_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueNotEquals__Group__0__Impl"


    // $ANTLR start "rule__AttributeValueNotEquals__Group__1"
    // InternalEclParser.g:4819:1: rule__AttributeValueNotEquals__Group__1 : rule__AttributeValueNotEquals__Group__1__Impl ;
    public final void rule__AttributeValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4823:1: ( rule__AttributeValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:4824:2: rule__AttributeValueNotEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueNotEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueNotEquals__Group__1"


    // $ANTLR start "rule__AttributeValueNotEquals__Group__1__Impl"
    // InternalEclParser.g:4830:1: rule__AttributeValueNotEquals__Group__1__Impl : ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) ) ;
    public final void rule__AttributeValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4834:1: ( ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:4835:1: ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:4835:1: ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) )
            // InternalEclParser.g:4836:2: ( rule__AttributeValueNotEquals__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:4837:2: ( rule__AttributeValueNotEquals__ConstraintAssignment_1 )
            // InternalEclParser.g:4837:3: rule__AttributeValueNotEquals__ConstraintAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__AttributeValueNotEquals__ConstraintAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueNotEquals__Group__1__Impl"


    // $ANTLR start "rule__BooleanValueEquals__Group__0"
    // InternalEclParser.g:4846:1: rule__BooleanValueEquals__Group__0 : rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1 ;
    public final void rule__BooleanValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4850:1: ( rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1 )
            // InternalEclParser.g:4851:2: rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__BooleanValueEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueEquals__Group__0"


    // $ANTLR start "rule__BooleanValueEquals__Group__0__Impl"
    // InternalEclParser.g:4858:1: rule__BooleanValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__BooleanValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4862:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4863:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4863:1: ( RULE_EQUAL )
            // InternalEclParser.g:4864:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueEquals__Group__0__Impl"


    // $ANTLR start "rule__BooleanValueEquals__Group__1"
    // InternalEclParser.g:4873:1: rule__BooleanValueEquals__Group__1 : rule__BooleanValueEquals__Group__1__Impl ;
    public final void rule__BooleanValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4877:1: ( rule__BooleanValueEquals__Group__1__Impl )
            // InternalEclParser.g:4878:2: rule__BooleanValueEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueEquals__Group__1"


    // $ANTLR start "rule__BooleanValueEquals__Group__1__Impl"
    // InternalEclParser.g:4884:1: rule__BooleanValueEquals__Group__1__Impl : ( ( rule__BooleanValueEquals__ValueAssignment_1 ) ) ;
    public final void rule__BooleanValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4888:1: ( ( ( rule__BooleanValueEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4889:1: ( ( rule__BooleanValueEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4889:1: ( ( rule__BooleanValueEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4890:2: ( rule__BooleanValueEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4891:2: ( rule__BooleanValueEquals__ValueAssignment_1 )
            // InternalEclParser.g:4891:3: rule__BooleanValueEquals__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueEquals__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueEquals__Group__1__Impl"


    // $ANTLR start "rule__BooleanValueNotEquals__Group__0"
    // InternalEclParser.g:4900:1: rule__BooleanValueNotEquals__Group__0 : rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1 ;
    public final void rule__BooleanValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4904:1: ( rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1 )
            // InternalEclParser.g:4905:2: rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_23);
            rule__BooleanValueNotEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueNotEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueNotEquals__Group__0"


    // $ANTLR start "rule__BooleanValueNotEquals__Group__0__Impl"
    // InternalEclParser.g:4912:1: rule__BooleanValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__BooleanValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4916:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4917:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4917:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4918:2: RULE_NOT_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueNotEquals__Group__0__Impl"


    // $ANTLR start "rule__BooleanValueNotEquals__Group__1"
    // InternalEclParser.g:4927:1: rule__BooleanValueNotEquals__Group__1 : rule__BooleanValueNotEquals__Group__1__Impl ;
    public final void rule__BooleanValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4931:1: ( rule__BooleanValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:4932:2: rule__BooleanValueNotEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueNotEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueNotEquals__Group__1"


    // $ANTLR start "rule__BooleanValueNotEquals__Group__1__Impl"
    // InternalEclParser.g:4938:1: rule__BooleanValueNotEquals__Group__1__Impl : ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) ) ;
    public final void rule__BooleanValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4942:1: ( ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4943:1: ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4943:1: ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4944:2: ( rule__BooleanValueNotEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4945:2: ( rule__BooleanValueNotEquals__ValueAssignment_1 )
            // InternalEclParser.g:4945:3: rule__BooleanValueNotEquals__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__BooleanValueNotEquals__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueNotEquals__Group__1__Impl"


    // $ANTLR start "rule__StringValueEquals__Group__0"
    // InternalEclParser.g:4954:1: rule__StringValueEquals__Group__0 : rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1 ;
    public final void rule__StringValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4958:1: ( rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1 )
            // InternalEclParser.g:4959:2: rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__StringValueEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueEquals__Group__0"


    // $ANTLR start "rule__StringValueEquals__Group__0__Impl"
    // InternalEclParser.g:4966:1: rule__StringValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__StringValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4970:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4971:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4971:1: ( RULE_EQUAL )
            // InternalEclParser.g:4972:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueEquals__Group__0__Impl"


    // $ANTLR start "rule__StringValueEquals__Group__1"
    // InternalEclParser.g:4981:1: rule__StringValueEquals__Group__1 : rule__StringValueEquals__Group__1__Impl ;
    public final void rule__StringValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4985:1: ( rule__StringValueEquals__Group__1__Impl )
            // InternalEclParser.g:4986:2: rule__StringValueEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueEquals__Group__1"


    // $ANTLR start "rule__StringValueEquals__Group__1__Impl"
    // InternalEclParser.g:4992:1: rule__StringValueEquals__Group__1__Impl : ( ( rule__StringValueEquals__ValueAssignment_1 ) ) ;
    public final void rule__StringValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4996:1: ( ( ( rule__StringValueEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4997:1: ( ( rule__StringValueEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4997:1: ( ( rule__StringValueEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4998:2: ( rule__StringValueEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4999:2: ( rule__StringValueEquals__ValueAssignment_1 )
            // InternalEclParser.g:4999:3: rule__StringValueEquals__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueEquals__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueEquals__Group__1__Impl"


    // $ANTLR start "rule__StringValueNotEquals__Group__0"
    // InternalEclParser.g:5008:1: rule__StringValueNotEquals__Group__0 : rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1 ;
    public final void rule__StringValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5012:1: ( rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1 )
            // InternalEclParser.g:5013:2: rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_24);
            rule__StringValueNotEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueNotEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueNotEquals__Group__0"


    // $ANTLR start "rule__StringValueNotEquals__Group__0__Impl"
    // InternalEclParser.g:5020:1: rule__StringValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__StringValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5024:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5025:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5025:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:5026:2: RULE_NOT_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueNotEquals__Group__0__Impl"


    // $ANTLR start "rule__StringValueNotEquals__Group__1"
    // InternalEclParser.g:5035:1: rule__StringValueNotEquals__Group__1 : rule__StringValueNotEquals__Group__1__Impl ;
    public final void rule__StringValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5039:1: ( rule__StringValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:5040:2: rule__StringValueNotEquals__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueNotEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueNotEquals__Group__1"


    // $ANTLR start "rule__StringValueNotEquals__Group__1__Impl"
    // InternalEclParser.g:5046:1: rule__StringValueNotEquals__Group__1__Impl : ( ( rule__StringValueNotEquals__ValueAssignment_1 ) ) ;
    public final void rule__StringValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5050:1: ( ( ( rule__StringValueNotEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:5051:1: ( ( rule__StringValueNotEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:5051:1: ( ( rule__StringValueNotEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:5052:2: ( rule__StringValueNotEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:5053:2: ( rule__StringValueNotEquals__ValueAssignment_1 )
            // InternalEclParser.g:5053:3: rule__StringValueNotEquals__ValueAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__StringValueNotEquals__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueNotEquals__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueEquals__Group__0"
    // InternalEclParser.g:5062:1: rule__IntegerValueEquals__Group__0 : rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1 ;
    public final void rule__IntegerValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5066:1: ( rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1 )
            // InternalEclParser.g:5067:2: rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__0"


    // $ANTLR start "rule__IntegerValueEquals__Group__0__Impl"
    // InternalEclParser.g:5074:1: rule__IntegerValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__IntegerValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5078:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:5079:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:5079:1: ( RULE_EQUAL )
            // InternalEclParser.g:5080:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueEquals__Group__1"
    // InternalEclParser.g:5089:1: rule__IntegerValueEquals__Group__1 : rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2 ;
    public final void rule__IntegerValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5093:1: ( rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2 )
            // InternalEclParser.g:5094:2: rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__1"


    // $ANTLR start "rule__IntegerValueEquals__Group__1__Impl"
    // InternalEclParser.g:5101:1: rule__IntegerValueEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5105:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5106:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5106:1: ( RULE_HASH )
            // InternalEclParser.g:5107:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueEquals__Group__2"
    // InternalEclParser.g:5116:1: rule__IntegerValueEquals__Group__2 : rule__IntegerValueEquals__Group__2__Impl ;
    public final void rule__IntegerValueEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5120:1: ( rule__IntegerValueEquals__Group__2__Impl )
            // InternalEclParser.g:5121:2: rule__IntegerValueEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__2"


    // $ANTLR start "rule__IntegerValueEquals__Group__2__Impl"
    // InternalEclParser.g:5127:1: rule__IntegerValueEquals__Group__2__Impl : ( ( rule__IntegerValueEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5131:1: ( ( ( rule__IntegerValueEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5132:1: ( ( rule__IntegerValueEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5132:1: ( ( rule__IntegerValueEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5133:2: ( rule__IntegerValueEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5134:2: ( rule__IntegerValueEquals__ValueAssignment_2 )
            // InternalEclParser.g:5134:3: rule__IntegerValueEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__0"
    // InternalEclParser.g:5143:1: rule__IntegerValueNotEquals__Group__0 : rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1 ;
    public final void rule__IntegerValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5147:1: ( rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1 )
            // InternalEclParser.g:5148:2: rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueNotEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueNotEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__0"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__0__Impl"
    // InternalEclParser.g:5155:1: rule__IntegerValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__IntegerValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5159:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5160:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5160:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:5161:2: RULE_NOT_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__1"
    // InternalEclParser.g:5170:1: rule__IntegerValueNotEquals__Group__1 : rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2 ;
    public final void rule__IntegerValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5174:1: ( rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2 )
            // InternalEclParser.g:5175:2: rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueNotEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueNotEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__1"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__1__Impl"
    // InternalEclParser.g:5182:1: rule__IntegerValueNotEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5186:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5187:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5187:1: ( RULE_HASH )
            // InternalEclParser.g:5188:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__2"
    // InternalEclParser.g:5197:1: rule__IntegerValueNotEquals__Group__2 : rule__IntegerValueNotEquals__Group__2__Impl ;
    public final void rule__IntegerValueNotEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5201:1: ( rule__IntegerValueNotEquals__Group__2__Impl )
            // InternalEclParser.g:5202:2: rule__IntegerValueNotEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueNotEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__2"


    // $ANTLR start "rule__IntegerValueNotEquals__Group__2__Impl"
    // InternalEclParser.g:5208:1: rule__IntegerValueNotEquals__Group__2__Impl : ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueNotEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5212:1: ( ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5213:1: ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5213:1: ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5214:2: ( rule__IntegerValueNotEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5215:2: ( rule__IntegerValueNotEquals__ValueAssignment_2 )
            // InternalEclParser.g:5215:3: rule__IntegerValueNotEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueNotEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__0"
    // InternalEclParser.g:5224:1: rule__IntegerValueGreaterThan__Group__0 : rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1 ;
    public final void rule__IntegerValueGreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5228:1: ( rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1 )
            // InternalEclParser.g:5229:2: rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueGreaterThan__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThan__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__0"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__0__Impl"
    // InternalEclParser.g:5236:1: rule__IntegerValueGreaterThan__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__IntegerValueGreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5240:1: ( ( RULE_GT ) )
            // InternalEclParser.g:5241:1: ( RULE_GT )
            {
            // InternalEclParser.g:5241:1: ( RULE_GT )
            // InternalEclParser.g:5242:2: RULE_GT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
            }
            match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__1"
    // InternalEclParser.g:5251:1: rule__IntegerValueGreaterThan__Group__1 : rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2 ;
    public final void rule__IntegerValueGreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5255:1: ( rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2 )
            // InternalEclParser.g:5256:2: rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueGreaterThan__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThan__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__1"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__1__Impl"
    // InternalEclParser.g:5263:1: rule__IntegerValueGreaterThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueGreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5267:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5268:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5268:1: ( RULE_HASH )
            // InternalEclParser.g:5269:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__2"
    // InternalEclParser.g:5278:1: rule__IntegerValueGreaterThan__Group__2 : rule__IntegerValueGreaterThan__Group__2__Impl ;
    public final void rule__IntegerValueGreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5282:1: ( rule__IntegerValueGreaterThan__Group__2__Impl )
            // InternalEclParser.g:5283:2: rule__IntegerValueGreaterThan__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThan__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__2"


    // $ANTLR start "rule__IntegerValueGreaterThan__Group__2__Impl"
    // InternalEclParser.g:5289:1: rule__IntegerValueGreaterThan__Group__2__Impl : ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueGreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5293:1: ( ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5294:1: ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5294:1: ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5295:2: ( rule__IntegerValueGreaterThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5296:2: ( rule__IntegerValueGreaterThan__ValueAssignment_2 )
            // InternalEclParser.g:5296:3: rule__IntegerValueGreaterThan__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThan__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueLessThan__Group__0"
    // InternalEclParser.g:5305:1: rule__IntegerValueLessThan__Group__0 : rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1 ;
    public final void rule__IntegerValueLessThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5309:1: ( rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1 )
            // InternalEclParser.g:5310:2: rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueLessThan__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThan__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__0"


    // $ANTLR start "rule__IntegerValueLessThan__Group__0__Impl"
    // InternalEclParser.g:5317:1: rule__IntegerValueLessThan__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__IntegerValueLessThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5321:1: ( ( RULE_LT ) )
            // InternalEclParser.g:5322:1: ( RULE_LT )
            {
            // InternalEclParser.g:5322:1: ( RULE_LT )
            // InternalEclParser.g:5323:2: RULE_LT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); 
            }
            match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanAccess().getLTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueLessThan__Group__1"
    // InternalEclParser.g:5332:1: rule__IntegerValueLessThan__Group__1 : rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2 ;
    public final void rule__IntegerValueLessThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5336:1: ( rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2 )
            // InternalEclParser.g:5337:2: rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueLessThan__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThan__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__1"


    // $ANTLR start "rule__IntegerValueLessThan__Group__1__Impl"
    // InternalEclParser.g:5344:1: rule__IntegerValueLessThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueLessThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5348:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5349:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5349:1: ( RULE_HASH )
            // InternalEclParser.g:5350:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueLessThan__Group__2"
    // InternalEclParser.g:5359:1: rule__IntegerValueLessThan__Group__2 : rule__IntegerValueLessThan__Group__2__Impl ;
    public final void rule__IntegerValueLessThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5363:1: ( rule__IntegerValueLessThan__Group__2__Impl )
            // InternalEclParser.g:5364:2: rule__IntegerValueLessThan__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThan__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__2"


    // $ANTLR start "rule__IntegerValueLessThan__Group__2__Impl"
    // InternalEclParser.g:5370:1: rule__IntegerValueLessThan__Group__2__Impl : ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueLessThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5374:1: ( ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5375:1: ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5375:1: ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5376:2: ( rule__IntegerValueLessThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5377:2: ( rule__IntegerValueLessThan__ValueAssignment_2 )
            // InternalEclParser.g:5377:3: rule__IntegerValueLessThan__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThan__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__0"
    // InternalEclParser.g:5386:1: rule__IntegerValueGreaterThanEquals__Group__0 : rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1 ;
    public final void rule__IntegerValueGreaterThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5390:1: ( rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1 )
            // InternalEclParser.g:5391:2: rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueGreaterThanEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThanEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__0"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__0__Impl"
    // InternalEclParser.g:5398:1: rule__IntegerValueGreaterThanEquals__Group__0__Impl : ( RULE_GTE ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5402:1: ( ( RULE_GTE ) )
            // InternalEclParser.g:5403:1: ( RULE_GTE )
            {
            // InternalEclParser.g:5403:1: ( RULE_GTE )
            // InternalEclParser.g:5404:2: RULE_GTE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
            }
            match(input,RULE_GTE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__1"
    // InternalEclParser.g:5413:1: rule__IntegerValueGreaterThanEquals__Group__1 : rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2 ;
    public final void rule__IntegerValueGreaterThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5417:1: ( rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2 )
            // InternalEclParser.g:5418:2: rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueGreaterThanEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThanEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__1"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__1__Impl"
    // InternalEclParser.g:5425:1: rule__IntegerValueGreaterThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5429:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5430:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5430:1: ( RULE_HASH )
            // InternalEclParser.g:5431:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__2"
    // InternalEclParser.g:5440:1: rule__IntegerValueGreaterThanEquals__Group__2 : rule__IntegerValueGreaterThanEquals__Group__2__Impl ;
    public final void rule__IntegerValueGreaterThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5444:1: ( rule__IntegerValueGreaterThanEquals__Group__2__Impl )
            // InternalEclParser.g:5445:2: rule__IntegerValueGreaterThanEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThanEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__2"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__Group__2__Impl"
    // InternalEclParser.g:5451:1: rule__IntegerValueGreaterThanEquals__Group__2__Impl : ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5455:1: ( ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5456:1: ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5456:1: ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5457:2: ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5458:2: ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5458:3: rule__IntegerValueGreaterThanEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueGreaterThanEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__Group__2__Impl"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__0"
    // InternalEclParser.g:5467:1: rule__IntegerValueLessThanEquals__Group__0 : rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1 ;
    public final void rule__IntegerValueLessThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5471:1: ( rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1 )
            // InternalEclParser.g:5472:2: rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__IntegerValueLessThanEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThanEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__0"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__0__Impl"
    // InternalEclParser.g:5479:1: rule__IntegerValueLessThanEquals__Group__0__Impl : ( RULE_LTE ) ;
    public final void rule__IntegerValueLessThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5483:1: ( ( RULE_LTE ) )
            // InternalEclParser.g:5484:1: ( RULE_LTE )
            {
            // InternalEclParser.g:5484:1: ( RULE_LTE )
            // InternalEclParser.g:5485:2: RULE_LTE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
            }
            match(input,RULE_LTE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__0__Impl"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__1"
    // InternalEclParser.g:5494:1: rule__IntegerValueLessThanEquals__Group__1 : rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2 ;
    public final void rule__IntegerValueLessThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5498:1: ( rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2 )
            // InternalEclParser.g:5499:2: rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__IntegerValueLessThanEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThanEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__1"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__1__Impl"
    // InternalEclParser.g:5506:1: rule__IntegerValueLessThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueLessThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5510:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5511:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5511:1: ( RULE_HASH )
            // InternalEclParser.g:5512:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__1__Impl"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__2"
    // InternalEclParser.g:5521:1: rule__IntegerValueLessThanEquals__Group__2 : rule__IntegerValueLessThanEquals__Group__2__Impl ;
    public final void rule__IntegerValueLessThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5525:1: ( rule__IntegerValueLessThanEquals__Group__2__Impl )
            // InternalEclParser.g:5526:2: rule__IntegerValueLessThanEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThanEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__2"


    // $ANTLR start "rule__IntegerValueLessThanEquals__Group__2__Impl"
    // InternalEclParser.g:5532:1: rule__IntegerValueLessThanEquals__Group__2__Impl : ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueLessThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5536:1: ( ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5537:1: ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5537:1: ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5538:2: ( rule__IntegerValueLessThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5539:2: ( rule__IntegerValueLessThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5539:3: rule__IntegerValueLessThanEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__IntegerValueLessThanEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueEquals__Group__0"
    // InternalEclParser.g:5548:1: rule__DecimalValueEquals__Group__0 : rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1 ;
    public final void rule__DecimalValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5552:1: ( rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1 )
            // InternalEclParser.g:5553:2: rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__0"


    // $ANTLR start "rule__DecimalValueEquals__Group__0__Impl"
    // InternalEclParser.g:5560:1: rule__DecimalValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__DecimalValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5564:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:5565:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:5565:1: ( RULE_EQUAL )
            // InternalEclParser.g:5566:2: RULE_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsAccess().getEQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueEquals__Group__1"
    // InternalEclParser.g:5575:1: rule__DecimalValueEquals__Group__1 : rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2 ;
    public final void rule__DecimalValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5579:1: ( rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2 )
            // InternalEclParser.g:5580:2: rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__1"


    // $ANTLR start "rule__DecimalValueEquals__Group__1__Impl"
    // InternalEclParser.g:5587:1: rule__DecimalValueEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5591:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5592:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5592:1: ( RULE_HASH )
            // InternalEclParser.g:5593:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueEquals__Group__2"
    // InternalEclParser.g:5602:1: rule__DecimalValueEquals__Group__2 : rule__DecimalValueEquals__Group__2__Impl ;
    public final void rule__DecimalValueEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5606:1: ( rule__DecimalValueEquals__Group__2__Impl )
            // InternalEclParser.g:5607:2: rule__DecimalValueEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__2"


    // $ANTLR start "rule__DecimalValueEquals__Group__2__Impl"
    // InternalEclParser.g:5613:1: rule__DecimalValueEquals__Group__2__Impl : ( ( rule__DecimalValueEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5617:1: ( ( ( rule__DecimalValueEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5618:1: ( ( rule__DecimalValueEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5618:1: ( ( rule__DecimalValueEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5619:2: ( rule__DecimalValueEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5620:2: ( rule__DecimalValueEquals__ValueAssignment_2 )
            // InternalEclParser.g:5620:3: rule__DecimalValueEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__0"
    // InternalEclParser.g:5629:1: rule__DecimalValueNotEquals__Group__0 : rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1 ;
    public final void rule__DecimalValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5633:1: ( rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1 )
            // InternalEclParser.g:5634:2: rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueNotEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueNotEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__0"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__0__Impl"
    // InternalEclParser.g:5641:1: rule__DecimalValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__DecimalValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5645:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5646:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5646:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:5647:2: RULE_NOT_EQUAL
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }
            match(input,RULE_NOT_EQUAL,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsAccess().getNOT_EQUALTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__1"
    // InternalEclParser.g:5656:1: rule__DecimalValueNotEquals__Group__1 : rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2 ;
    public final void rule__DecimalValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5660:1: ( rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2 )
            // InternalEclParser.g:5661:2: rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueNotEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueNotEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__1"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__1__Impl"
    // InternalEclParser.g:5668:1: rule__DecimalValueNotEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5672:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5673:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5673:1: ( RULE_HASH )
            // InternalEclParser.g:5674:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__2"
    // InternalEclParser.g:5683:1: rule__DecimalValueNotEquals__Group__2 : rule__DecimalValueNotEquals__Group__2__Impl ;
    public final void rule__DecimalValueNotEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5687:1: ( rule__DecimalValueNotEquals__Group__2__Impl )
            // InternalEclParser.g:5688:2: rule__DecimalValueNotEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueNotEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__2"


    // $ANTLR start "rule__DecimalValueNotEquals__Group__2__Impl"
    // InternalEclParser.g:5694:1: rule__DecimalValueNotEquals__Group__2__Impl : ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueNotEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5698:1: ( ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5699:1: ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5699:1: ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5700:2: ( rule__DecimalValueNotEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5701:2: ( rule__DecimalValueNotEquals__ValueAssignment_2 )
            // InternalEclParser.g:5701:3: rule__DecimalValueNotEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueNotEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__0"
    // InternalEclParser.g:5710:1: rule__DecimalValueGreaterThan__Group__0 : rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1 ;
    public final void rule__DecimalValueGreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5714:1: ( rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1 )
            // InternalEclParser.g:5715:2: rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueGreaterThan__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThan__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__0"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__0__Impl"
    // InternalEclParser.g:5722:1: rule__DecimalValueGreaterThan__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__DecimalValueGreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5726:1: ( ( RULE_GT ) )
            // InternalEclParser.g:5727:1: ( RULE_GT )
            {
            // InternalEclParser.g:5727:1: ( RULE_GT )
            // InternalEclParser.g:5728:2: RULE_GT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
            }
            match(input,RULE_GT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanAccess().getGTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__1"
    // InternalEclParser.g:5737:1: rule__DecimalValueGreaterThan__Group__1 : rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2 ;
    public final void rule__DecimalValueGreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5741:1: ( rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2 )
            // InternalEclParser.g:5742:2: rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueGreaterThan__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThan__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__1"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__1__Impl"
    // InternalEclParser.g:5749:1: rule__DecimalValueGreaterThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueGreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5753:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5754:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5754:1: ( RULE_HASH )
            // InternalEclParser.g:5755:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__2"
    // InternalEclParser.g:5764:1: rule__DecimalValueGreaterThan__Group__2 : rule__DecimalValueGreaterThan__Group__2__Impl ;
    public final void rule__DecimalValueGreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5768:1: ( rule__DecimalValueGreaterThan__Group__2__Impl )
            // InternalEclParser.g:5769:2: rule__DecimalValueGreaterThan__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThan__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__2"


    // $ANTLR start "rule__DecimalValueGreaterThan__Group__2__Impl"
    // InternalEclParser.g:5775:1: rule__DecimalValueGreaterThan__Group__2__Impl : ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueGreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5779:1: ( ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5780:1: ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5780:1: ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5781:2: ( rule__DecimalValueGreaterThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5782:2: ( rule__DecimalValueGreaterThan__ValueAssignment_2 )
            // InternalEclParser.g:5782:3: rule__DecimalValueGreaterThan__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThan__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueLessThan__Group__0"
    // InternalEclParser.g:5791:1: rule__DecimalValueLessThan__Group__0 : rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1 ;
    public final void rule__DecimalValueLessThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5795:1: ( rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1 )
            // InternalEclParser.g:5796:2: rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueLessThan__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThan__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__0"


    // $ANTLR start "rule__DecimalValueLessThan__Group__0__Impl"
    // InternalEclParser.g:5803:1: rule__DecimalValueLessThan__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__DecimalValueLessThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5807:1: ( ( RULE_LT ) )
            // InternalEclParser.g:5808:1: ( RULE_LT )
            {
            // InternalEclParser.g:5808:1: ( RULE_LT )
            // InternalEclParser.g:5809:2: RULE_LT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); 
            }
            match(input,RULE_LT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanAccess().getLTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueLessThan__Group__1"
    // InternalEclParser.g:5818:1: rule__DecimalValueLessThan__Group__1 : rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2 ;
    public final void rule__DecimalValueLessThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5822:1: ( rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2 )
            // InternalEclParser.g:5823:2: rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueLessThan__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThan__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__1"


    // $ANTLR start "rule__DecimalValueLessThan__Group__1__Impl"
    // InternalEclParser.g:5830:1: rule__DecimalValueLessThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueLessThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5834:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5835:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5835:1: ( RULE_HASH )
            // InternalEclParser.g:5836:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueLessThan__Group__2"
    // InternalEclParser.g:5845:1: rule__DecimalValueLessThan__Group__2 : rule__DecimalValueLessThan__Group__2__Impl ;
    public final void rule__DecimalValueLessThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5849:1: ( rule__DecimalValueLessThan__Group__2__Impl )
            // InternalEclParser.g:5850:2: rule__DecimalValueLessThan__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThan__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__2"


    // $ANTLR start "rule__DecimalValueLessThan__Group__2__Impl"
    // InternalEclParser.g:5856:1: rule__DecimalValueLessThan__Group__2__Impl : ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueLessThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5860:1: ( ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5861:1: ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5861:1: ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5862:2: ( rule__DecimalValueLessThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5863:2: ( rule__DecimalValueLessThan__ValueAssignment_2 )
            // InternalEclParser.g:5863:3: rule__DecimalValueLessThan__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThan__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__0"
    // InternalEclParser.g:5872:1: rule__DecimalValueGreaterThanEquals__Group__0 : rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1 ;
    public final void rule__DecimalValueGreaterThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5876:1: ( rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1 )
            // InternalEclParser.g:5877:2: rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueGreaterThanEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThanEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__0"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__0__Impl"
    // InternalEclParser.g:5884:1: rule__DecimalValueGreaterThanEquals__Group__0__Impl : ( RULE_GTE ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5888:1: ( ( RULE_GTE ) )
            // InternalEclParser.g:5889:1: ( RULE_GTE )
            {
            // InternalEclParser.g:5889:1: ( RULE_GTE )
            // InternalEclParser.g:5890:2: RULE_GTE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
            }
            match(input,RULE_GTE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGTETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__1"
    // InternalEclParser.g:5899:1: rule__DecimalValueGreaterThanEquals__Group__1 : rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2 ;
    public final void rule__DecimalValueGreaterThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5903:1: ( rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2 )
            // InternalEclParser.g:5904:2: rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueGreaterThanEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThanEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__1"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__1__Impl"
    // InternalEclParser.g:5911:1: rule__DecimalValueGreaterThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5915:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5916:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5916:1: ( RULE_HASH )
            // InternalEclParser.g:5917:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__2"
    // InternalEclParser.g:5926:1: rule__DecimalValueGreaterThanEquals__Group__2 : rule__DecimalValueGreaterThanEquals__Group__2__Impl ;
    public final void rule__DecimalValueGreaterThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5930:1: ( rule__DecimalValueGreaterThanEquals__Group__2__Impl )
            // InternalEclParser.g:5931:2: rule__DecimalValueGreaterThanEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThanEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__2"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__Group__2__Impl"
    // InternalEclParser.g:5937:1: rule__DecimalValueGreaterThanEquals__Group__2__Impl : ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5941:1: ( ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5942:1: ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5942:1: ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5943:2: ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5944:2: ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5944:3: rule__DecimalValueGreaterThanEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueGreaterThanEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__Group__2__Impl"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__0"
    // InternalEclParser.g:5953:1: rule__DecimalValueLessThanEquals__Group__0 : rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1 ;
    public final void rule__DecimalValueLessThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5957:1: ( rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1 )
            // InternalEclParser.g:5958:2: rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_25);
            rule__DecimalValueLessThanEquals__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThanEquals__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__0"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__0__Impl"
    // InternalEclParser.g:5965:1: rule__DecimalValueLessThanEquals__Group__0__Impl : ( RULE_LTE ) ;
    public final void rule__DecimalValueLessThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5969:1: ( ( RULE_LTE ) )
            // InternalEclParser.g:5970:1: ( RULE_LTE )
            {
            // InternalEclParser.g:5970:1: ( RULE_LTE )
            // InternalEclParser.g:5971:2: RULE_LTE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
            }
            match(input,RULE_LTE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsAccess().getLTETerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__0__Impl"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__1"
    // InternalEclParser.g:5980:1: rule__DecimalValueLessThanEquals__Group__1 : rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2 ;
    public final void rule__DecimalValueLessThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5984:1: ( rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2 )
            // InternalEclParser.g:5985:2: rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__DecimalValueLessThanEquals__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThanEquals__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__1"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__1__Impl"
    // InternalEclParser.g:5992:1: rule__DecimalValueLessThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueLessThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5996:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5997:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5997:1: ( RULE_HASH )
            // InternalEclParser.g:5998:2: RULE_HASH
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }
            match(input,RULE_HASH,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsAccess().getHASHTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__1__Impl"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__2"
    // InternalEclParser.g:6007:1: rule__DecimalValueLessThanEquals__Group__2 : rule__DecimalValueLessThanEquals__Group__2__Impl ;
    public final void rule__DecimalValueLessThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6011:1: ( rule__DecimalValueLessThanEquals__Group__2__Impl )
            // InternalEclParser.g:6012:2: rule__DecimalValueLessThanEquals__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThanEquals__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__2"


    // $ANTLR start "rule__DecimalValueLessThanEquals__Group__2__Impl"
    // InternalEclParser.g:6018:1: rule__DecimalValueLessThanEquals__Group__2__Impl : ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueLessThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6022:1: ( ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:6023:1: ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:6023:1: ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:6024:2: ( rule__DecimalValueLessThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:6025:2: ( rule__DecimalValueLessThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:6025:3: rule__DecimalValueLessThanEquals__ValueAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__DecimalValueLessThanEquals__ValueAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__Group__2__Impl"


    // $ANTLR start "rule__NestedExpression__Group__0"
    // InternalEclParser.g:6034:1: rule__NestedExpression__Group__0 : rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1 ;
    public final void rule__NestedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6038:1: ( rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1 )
            // InternalEclParser.g:6039:2: rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_3);
            rule__NestedExpression__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedExpression__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__0"


    // $ANTLR start "rule__NestedExpression__Group__0__Impl"
    // InternalEclParser.g:6046:1: rule__NestedExpression__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6050:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:6051:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:6051:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:6052:2: RULE_ROUND_OPEN
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); 
            }
            match(input,RULE_ROUND_OPEN,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionAccess().getROUND_OPENTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__0__Impl"


    // $ANTLR start "rule__NestedExpression__Group__1"
    // InternalEclParser.g:6061:1: rule__NestedExpression__Group__1 : rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2 ;
    public final void rule__NestedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6065:1: ( rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2 )
            // InternalEclParser.g:6066:2: rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_14);
            rule__NestedExpression__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedExpression__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__1"


    // $ANTLR start "rule__NestedExpression__Group__1__Impl"
    // InternalEclParser.g:6073:1: rule__NestedExpression__Group__1__Impl : ( ( rule__NestedExpression__NestedAssignment_1 ) ) ;
    public final void rule__NestedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6077:1: ( ( ( rule__NestedExpression__NestedAssignment_1 ) ) )
            // InternalEclParser.g:6078:1: ( ( rule__NestedExpression__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:6078:1: ( ( rule__NestedExpression__NestedAssignment_1 ) )
            // InternalEclParser.g:6079:2: ( rule__NestedExpression__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:6080:2: ( rule__NestedExpression__NestedAssignment_1 )
            // InternalEclParser.g:6080:3: rule__NestedExpression__NestedAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedExpression__NestedAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__1__Impl"


    // $ANTLR start "rule__NestedExpression__Group__2"
    // InternalEclParser.g:6088:1: rule__NestedExpression__Group__2 : rule__NestedExpression__Group__2__Impl ;
    public final void rule__NestedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6092:1: ( rule__NestedExpression__Group__2__Impl )
            // InternalEclParser.g:6093:2: rule__NestedExpression__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NestedExpression__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__2"


    // $ANTLR start "rule__NestedExpression__Group__2__Impl"
    // InternalEclParser.g:6099:1: rule__NestedExpression__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6103:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:6104:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:6104:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:6105:2: RULE_ROUND_CLOSE
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }
            match(input,RULE_ROUND_CLOSE,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionAccess().getROUND_CLOSETerminalRuleCall_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__Group__2__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__0"
    // InternalEclParser.g:6115:1: rule__SnomedIdentifier__Group__0 : rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 ;
    public final void rule__SnomedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6119:1: ( rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 )
            // InternalEclParser.g:6120:2: rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__SnomedIdentifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__0"


    // $ANTLR start "rule__SnomedIdentifier__Group__0__Impl"
    // InternalEclParser.g:6127:1: rule__SnomedIdentifier__Group__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__SnomedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6131:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalEclParser.g:6132:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalEclParser.g:6132:1: ( RULE_DIGIT_NONZERO )
            // InternalEclParser.g:6133:2: RULE_DIGIT_NONZERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); 
            }
            match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getDIGIT_NONZEROTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__0__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__1"
    // InternalEclParser.g:6142:1: rule__SnomedIdentifier__Group__1 : rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 ;
    public final void rule__SnomedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6146:1: ( rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 )
            // InternalEclParser.g:6147:2: rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__SnomedIdentifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__1"


    // $ANTLR start "rule__SnomedIdentifier__Group__1__Impl"
    // InternalEclParser.g:6154:1: rule__SnomedIdentifier__Group__1__Impl : ( ( rule__SnomedIdentifier__Alternatives_1 ) ) ;
    public final void rule__SnomedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6158:1: ( ( ( rule__SnomedIdentifier__Alternatives_1 ) ) )
            // InternalEclParser.g:6159:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            {
            // InternalEclParser.g:6159:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            // InternalEclParser.g:6160:2: ( rule__SnomedIdentifier__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); 
            }
            // InternalEclParser.g:6161:2: ( rule__SnomedIdentifier__Alternatives_1 )
            // InternalEclParser.g:6161:3: rule__SnomedIdentifier__Alternatives_1
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__1__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__2"
    // InternalEclParser.g:6169:1: rule__SnomedIdentifier__Group__2 : rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 ;
    public final void rule__SnomedIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6173:1: ( rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 )
            // InternalEclParser.g:6174:2: rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__SnomedIdentifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__2"


    // $ANTLR start "rule__SnomedIdentifier__Group__2__Impl"
    // InternalEclParser.g:6181:1: rule__SnomedIdentifier__Group__2__Impl : ( ( rule__SnomedIdentifier__Alternatives_2 ) ) ;
    public final void rule__SnomedIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6185:1: ( ( ( rule__SnomedIdentifier__Alternatives_2 ) ) )
            // InternalEclParser.g:6186:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            {
            // InternalEclParser.g:6186:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            // InternalEclParser.g:6187:2: ( rule__SnomedIdentifier__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); 
            }
            // InternalEclParser.g:6188:2: ( rule__SnomedIdentifier__Alternatives_2 )
            // InternalEclParser.g:6188:3: rule__SnomedIdentifier__Alternatives_2
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__2__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__3"
    // InternalEclParser.g:6196:1: rule__SnomedIdentifier__Group__3 : rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 ;
    public final void rule__SnomedIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6200:1: ( rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 )
            // InternalEclParser.g:6201:2: rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__SnomedIdentifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__3"


    // $ANTLR start "rule__SnomedIdentifier__Group__3__Impl"
    // InternalEclParser.g:6208:1: rule__SnomedIdentifier__Group__3__Impl : ( ( rule__SnomedIdentifier__Alternatives_3 ) ) ;
    public final void rule__SnomedIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6212:1: ( ( ( rule__SnomedIdentifier__Alternatives_3 ) ) )
            // InternalEclParser.g:6213:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            {
            // InternalEclParser.g:6213:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            // InternalEclParser.g:6214:2: ( rule__SnomedIdentifier__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); 
            }
            // InternalEclParser.g:6215:2: ( rule__SnomedIdentifier__Alternatives_3 )
            // InternalEclParser.g:6215:3: rule__SnomedIdentifier__Alternatives_3
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__3__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__4"
    // InternalEclParser.g:6223:1: rule__SnomedIdentifier__Group__4 : rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 ;
    public final void rule__SnomedIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6227:1: ( rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 )
            // InternalEclParser.g:6228:2: rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__SnomedIdentifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__4"


    // $ANTLR start "rule__SnomedIdentifier__Group__4__Impl"
    // InternalEclParser.g:6235:1: rule__SnomedIdentifier__Group__4__Impl : ( ( rule__SnomedIdentifier__Alternatives_4 ) ) ;
    public final void rule__SnomedIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6239:1: ( ( ( rule__SnomedIdentifier__Alternatives_4 ) ) )
            // InternalEclParser.g:6240:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            {
            // InternalEclParser.g:6240:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            // InternalEclParser.g:6241:2: ( rule__SnomedIdentifier__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); 
            }
            // InternalEclParser.g:6242:2: ( rule__SnomedIdentifier__Alternatives_4 )
            // InternalEclParser.g:6242:3: rule__SnomedIdentifier__Alternatives_4
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Alternatives_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__4__Impl"


    // $ANTLR start "rule__SnomedIdentifier__Group__5"
    // InternalEclParser.g:6250:1: rule__SnomedIdentifier__Group__5 : rule__SnomedIdentifier__Group__5__Impl ;
    public final void rule__SnomedIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6254:1: ( rule__SnomedIdentifier__Group__5__Impl )
            // InternalEclParser.g:6255:2: rule__SnomedIdentifier__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__SnomedIdentifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__5"


    // $ANTLR start "rule__SnomedIdentifier__Group__5__Impl"
    // InternalEclParser.g:6261:1: rule__SnomedIdentifier__Group__5__Impl : ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) ;
    public final void rule__SnomedIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6265:1: ( ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) )
            // InternalEclParser.g:6266:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            {
            // InternalEclParser.g:6266:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            // InternalEclParser.g:6267:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            {
            // InternalEclParser.g:6267:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) )
            // InternalEclParser.g:6268:3: ( rule__SnomedIdentifier__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalEclParser.g:6269:3: ( rule__SnomedIdentifier__Alternatives_5 )
            // InternalEclParser.g:6269:4: rule__SnomedIdentifier__Alternatives_5
            {
            pushFollow(FollowSets000.FOLLOW_27);
            rule__SnomedIdentifier__Alternatives_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }

            }

            // InternalEclParser.g:6272:2: ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            // InternalEclParser.g:6273:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalEclParser.g:6274:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ZERO && LA38_0<=RULE_DIGIT_NONZERO)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEclParser.g:6274:4: rule__SnomedIdentifier__Alternatives_5
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__SnomedIdentifier__Alternatives_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SnomedIdentifier__Group__5__Impl"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__0"
    // InternalEclParser.g:6284:1: rule__NonNegativeInteger__Group_1__0 : rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 ;
    public final void rule__NonNegativeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6288:1: ( rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 )
            // InternalEclParser.g:6289:2: rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__NonNegativeInteger__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__0"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__0__Impl"
    // InternalEclParser.g:6296:1: rule__NonNegativeInteger__Group_1__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__NonNegativeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6300:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalEclParser.g:6301:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalEclParser.g:6301:1: ( RULE_DIGIT_NONZERO )
            // InternalEclParser.g:6302:2: RULE_DIGIT_NONZERO
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
            }
            match(input,RULE_DIGIT_NONZERO,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getDIGIT_NONZEROTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__0__Impl"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__1"
    // InternalEclParser.g:6311:1: rule__NonNegativeInteger__Group_1__1 : rule__NonNegativeInteger__Group_1__1__Impl ;
    public final void rule__NonNegativeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6315:1: ( rule__NonNegativeInteger__Group_1__1__Impl )
            // InternalEclParser.g:6316:2: rule__NonNegativeInteger__Group_1__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeInteger__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__1"


    // $ANTLR start "rule__NonNegativeInteger__Group_1__1__Impl"
    // InternalEclParser.g:6322:1: rule__NonNegativeInteger__Group_1__1__Impl : ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) ;
    public final void rule__NonNegativeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6326:1: ( ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) )
            // InternalEclParser.g:6327:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            {
            // InternalEclParser.g:6327:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            // InternalEclParser.g:6328:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:6329:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ZERO && LA39_0<=RULE_DIGIT_NONZERO)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEclParser.g:6329:3: rule__NonNegativeInteger__Alternatives_1_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__NonNegativeInteger__Alternatives_1_1();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeInteger__Group_1__1__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // InternalEclParser.g:6338:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6342:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalEclParser.g:6343:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Integer__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // InternalEclParser.g:6350:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6354:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalEclParser.g:6355:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalEclParser.g:6355:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalEclParser.g:6356:2: ( rule__Integer__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            }
            // InternalEclParser.g:6357:2: ( rule__Integer__Alternatives_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_PLUS && LA40_0<=RULE_DASH)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEclParser.g:6357:3: rule__Integer__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Integer__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // InternalEclParser.g:6365:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6369:1: ( rule__Integer__Group__1__Impl )
            // InternalEclParser.g:6370:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Integer__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // InternalEclParser.g:6376:1: rule__Integer__Group__1__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6380:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6381:1: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6381:1: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6382:2: ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerAccess().getNonNegativeIntegerParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__Decimal__Group__0"
    // InternalEclParser.g:6392:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6396:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalEclParser.g:6397:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_26);
            rule__Decimal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0"


    // $ANTLR start "rule__Decimal__Group__0__Impl"
    // InternalEclParser.g:6404:1: rule__Decimal__Group__0__Impl : ( ( rule__Decimal__Alternatives_0 )? ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6408:1: ( ( ( rule__Decimal__Alternatives_0 )? ) )
            // InternalEclParser.g:6409:1: ( ( rule__Decimal__Alternatives_0 )? )
            {
            // InternalEclParser.g:6409:1: ( ( rule__Decimal__Alternatives_0 )? )
            // InternalEclParser.g:6410:2: ( rule__Decimal__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            }
            // InternalEclParser.g:6411:2: ( rule__Decimal__Alternatives_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_PLUS && LA41_0<=RULE_DASH)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEclParser.g:6411:3: rule__Decimal__Alternatives_0
                    {
                    pushFollow(FollowSets000.FOLLOW_2);
                    rule__Decimal__Alternatives_0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__0__Impl"


    // $ANTLR start "rule__Decimal__Group__1"
    // InternalEclParser.g:6419:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6423:1: ( rule__Decimal__Group__1__Impl )
            // InternalEclParser.g:6424:2: rule__Decimal__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__Decimal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1"


    // $ANTLR start "rule__Decimal__Group__1__Impl"
    // InternalEclParser.g:6430:1: rule__Decimal__Group__1__Impl : ( ruleNonNegativeDecimal ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6434:1: ( ( ruleNonNegativeDecimal ) )
            // InternalEclParser.g:6435:1: ( ruleNonNegativeDecimal )
            {
            // InternalEclParser.g:6435:1: ( ruleNonNegativeDecimal )
            // InternalEclParser.g:6436:2: ruleNonNegativeDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalAccess().getNonNegativeDecimalParserRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Decimal__Group__1__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__0"
    // InternalEclParser.g:6446:1: rule__NonNegativeDecimal__Group__0 : rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 ;
    public final void rule__NonNegativeDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6450:1: ( rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 )
            // InternalEclParser.g:6451:2: rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_11);
            rule__NonNegativeDecimal__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__0"


    // $ANTLR start "rule__NonNegativeDecimal__Group__0__Impl"
    // InternalEclParser.g:6458:1: rule__NonNegativeDecimal__Group__0__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__NonNegativeDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6462:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6463:1: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6463:1: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6464:2: ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getNonNegativeIntegerParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__0__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__1"
    // InternalEclParser.g:6473:1: rule__NonNegativeDecimal__Group__1 : rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 ;
    public final void rule__NonNegativeDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6477:1: ( rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 )
            // InternalEclParser.g:6478:2: rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_19);
            rule__NonNegativeDecimal__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__1"


    // $ANTLR start "rule__NonNegativeDecimal__Group__1__Impl"
    // InternalEclParser.g:6485:1: rule__NonNegativeDecimal__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__NonNegativeDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6489:1: ( ( RULE_DOT ) )
            // InternalEclParser.g:6490:1: ( RULE_DOT )
            {
            // InternalEclParser.g:6490:1: ( RULE_DOT )
            // InternalEclParser.g:6491:2: RULE_DOT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); 
            }
            match(input,RULE_DOT,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getDOTTerminalRuleCall_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__1__Impl"


    // $ANTLR start "rule__NonNegativeDecimal__Group__2"
    // InternalEclParser.g:6500:1: rule__NonNegativeDecimal__Group__2 : rule__NonNegativeDecimal__Group__2__Impl ;
    public final void rule__NonNegativeDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6504:1: ( rule__NonNegativeDecimal__Group__2__Impl )
            // InternalEclParser.g:6505:2: rule__NonNegativeDecimal__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__NonNegativeDecimal__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__2"


    // $ANTLR start "rule__NonNegativeDecimal__Group__2__Impl"
    // InternalEclParser.g:6511:1: rule__NonNegativeDecimal__Group__2__Impl : ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) ;
    public final void rule__NonNegativeDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6515:1: ( ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) )
            // InternalEclParser.g:6516:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            {
            // InternalEclParser.g:6516:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            // InternalEclParser.g:6517:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); 
            }
            // InternalEclParser.g:6518:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ZERO && LA42_0<=RULE_DIGIT_NONZERO)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEclParser.g:6518:3: rule__NonNegativeDecimal__Alternatives_2
            	    {
            	    pushFollow(FollowSets000.FOLLOW_27);
            	    rule__NonNegativeDecimal__Alternatives_2();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonNegativeDecimal__Group__2__Impl"


    // $ANTLR start "rule__Script__ConstraintAssignment_1"
    // InternalEclParser.g:6527:1: rule__Script__ConstraintAssignment_1 : ( ruleExpressionConstraint ) ;
    public final void rule__Script__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6531:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:6532:2: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:6532:2: ( ruleExpressionConstraint )
            // InternalEclParser.g:6533:3: ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getScriptAccess().getConstraintExpressionConstraintParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ConstraintAssignment_1"


    // $ANTLR start "rule__OrExpressionConstraint__RightAssignment_1_2"
    // InternalEclParser.g:6542:1: rule__OrExpressionConstraint__RightAssignment_1_2 : ( ruleAndExpressionConstraint ) ;
    public final void rule__OrExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6546:1: ( ( ruleAndExpressionConstraint ) )
            // InternalEclParser.g:6547:2: ( ruleAndExpressionConstraint )
            {
            // InternalEclParser.g:6547:2: ( ruleAndExpressionConstraint )
            // InternalEclParser.g:6548:3: ruleAndExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrExpressionConstraintAccess().getRightAndExpressionConstraintParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrExpressionConstraint__RightAssignment_1_2"


    // $ANTLR start "rule__AndExpressionConstraint__RightAssignment_1_2"
    // InternalEclParser.g:6557:1: rule__AndExpressionConstraint__RightAssignment_1_2 : ( ruleExclusionExpressionConstraint ) ;
    public final void rule__AndExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6561:1: ( ( ruleExclusionExpressionConstraint ) )
            // InternalEclParser.g:6562:2: ( ruleExclusionExpressionConstraint )
            {
            // InternalEclParser.g:6562:2: ( ruleExclusionExpressionConstraint )
            // InternalEclParser.g:6563:3: ruleExclusionExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExclusionExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndExpressionConstraintAccess().getRightExclusionExpressionConstraintParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndExpressionConstraint__RightAssignment_1_2"


    // $ANTLR start "rule__ExclusionExpressionConstraint__RightAssignment_1_2"
    // InternalEclParser.g:6572:1: rule__ExclusionExpressionConstraint__RightAssignment_1_2 : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6576:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:6577:2: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:6577:2: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:6578:3: ruleRefinedExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleRefinedExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getExclusionExpressionConstraintAccess().getRightRefinedExpressionConstraintParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ExclusionExpressionConstraint__RightAssignment_1_2"


    // $ANTLR start "rule__RefinedExpressionConstraint__RefinementAssignment_1_2"
    // InternalEclParser.g:6587:1: rule__RefinedExpressionConstraint__RefinementAssignment_1_2 : ( ruleEclRefinement ) ;
    public final void rule__RefinedExpressionConstraint__RefinementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6591:1: ( ( ruleEclRefinement ) )
            // InternalEclParser.g:6592:2: ( ruleEclRefinement )
            {
            // InternalEclParser.g:6592:2: ( ruleEclRefinement )
            // InternalEclParser.g:6593:3: ruleEclRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementEclRefinementParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RefinedExpressionConstraint__RefinementAssignment_1_2"


    // $ANTLR start "rule__DottedExpressionConstraint__AttributeAssignment_1_2"
    // InternalEclParser.g:6602:1: rule__DottedExpressionConstraint__AttributeAssignment_1_2 : ( ruleSubExpressionConstraint ) ;
    public final void rule__DottedExpressionConstraint__AttributeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6606:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6607:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6607:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6608:3: ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDottedExpressionConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DottedExpressionConstraint__AttributeAssignment_1_2"


    // $ANTLR start "rule__ChildOf__ConstraintAssignment_1"
    // InternalEclParser.g:6617:1: rule__ChildOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ChildOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6621:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6622:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6622:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6623:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOf__ConstraintAssignment_1"


    // $ANTLR start "rule__ChildOrSelfOf__ConstraintAssignment_1"
    // InternalEclParser.g:6632:1: rule__ChildOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ChildOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6636:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6637:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6637:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6638:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getChildOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ChildOrSelfOf__ConstraintAssignment_1"


    // $ANTLR start "rule__DescendantOf__ConstraintAssignment_1"
    // InternalEclParser.g:6647:1: rule__DescendantOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__DescendantOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6651:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6652:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6652:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6653:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOf__ConstraintAssignment_1"


    // $ANTLR start "rule__DescendantOrSelfOf__ConstraintAssignment_1"
    // InternalEclParser.g:6662:1: rule__DescendantOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__DescendantOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6666:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6667:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6667:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6668:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDescendantOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DescendantOrSelfOf__ConstraintAssignment_1"


    // $ANTLR start "rule__ParentOf__ConstraintAssignment_1"
    // InternalEclParser.g:6677:1: rule__ParentOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ParentOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6681:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6682:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6682:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6683:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOf__ConstraintAssignment_1"


    // $ANTLR start "rule__ParentOrSelfOf__ConstraintAssignment_1"
    // InternalEclParser.g:6692:1: rule__ParentOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ParentOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6696:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6697:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6697:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6698:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getParentOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ParentOrSelfOf__ConstraintAssignment_1"


    // $ANTLR start "rule__AncestorOf__ConstraintAssignment_1"
    // InternalEclParser.g:6707:1: rule__AncestorOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__AncestorOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6711:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6712:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6712:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6713:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOf__ConstraintAssignment_1"


    // $ANTLR start "rule__AncestorOrSelfOf__ConstraintAssignment_1"
    // InternalEclParser.g:6722:1: rule__AncestorOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__AncestorOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6726:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6727:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6727:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6728:3: ruleEclFocusConcept
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclFocusConcept();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAncestorOrSelfOfAccess().getConstraintEclFocusConceptParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AncestorOrSelfOf__ConstraintAssignment_1"


    // $ANTLR start "rule__MemberOf__ConstraintAssignment_1"
    // InternalEclParser.g:6737:1: rule__MemberOf__ConstraintAssignment_1 : ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) ) ;
    public final void rule__MemberOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6741:1: ( ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) ) )
            // InternalEclParser.g:6742:2: ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) )
            {
            // InternalEclParser.g:6742:2: ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) )
            // InternalEclParser.g:6743:3: ( rule__MemberOf__ConstraintAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); 
            }
            // InternalEclParser.g:6744:3: ( rule__MemberOf__ConstraintAlternatives_1_0 )
            // InternalEclParser.g:6744:4: rule__MemberOf__ConstraintAlternatives_1_0
            {
            pushFollow(FollowSets000.FOLLOW_2);
            rule__MemberOf__ConstraintAlternatives_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MemberOf__ConstraintAssignment_1"


    // $ANTLR start "rule__EclConceptReference__IdAssignment_0"
    // InternalEclParser.g:6752:1: rule__EclConceptReference__IdAssignment_0 : ( ruleSnomedIdentifier ) ;
    public final void rule__EclConceptReference__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6756:1: ( ( ruleSnomedIdentifier ) )
            // InternalEclParser.g:6757:2: ( ruleSnomedIdentifier )
            {
            // InternalEclParser.g:6757:2: ( ruleSnomedIdentifier )
            // InternalEclParser.g:6758:3: ruleSnomedIdentifier
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSnomedIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceAccess().getIdSnomedIdentifierParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__IdAssignment_0"


    // $ANTLR start "rule__EclConceptReference__TermAssignment_1"
    // InternalEclParser.g:6767:1: rule__EclConceptReference__TermAssignment_1 : ( RULE_TERM_STRING ) ;
    public final void rule__EclConceptReference__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6771:1: ( ( RULE_TERM_STRING ) )
            // InternalEclParser.g:6772:2: ( RULE_TERM_STRING )
            {
            // InternalEclParser.g:6772:2: ( RULE_TERM_STRING )
            // InternalEclParser.g:6773:3: RULE_TERM_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_TERM_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclConceptReferenceAccess().getTermTERM_STRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclConceptReference__TermAssignment_1"


    // $ANTLR start "rule__OrRefinement__RightAssignment_1_0_2"
    // InternalEclParser.g:6782:1: rule__OrRefinement__RightAssignment_1_0_2 : ( ruleAndRefinement ) ;
    public final void rule__OrRefinement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6786:1: ( ( ruleAndRefinement ) )
            // InternalEclParser.g:6787:2: ( ruleAndRefinement )
            {
            // InternalEclParser.g:6787:2: ( ruleAndRefinement )
            // InternalEclParser.g:6788:3: ruleAndRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrRefinementAccess().getRightAndRefinementParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrRefinement__RightAssignment_1_0_2"


    // $ANTLR start "rule__AndRefinement__RightAssignment_1_0_2"
    // InternalEclParser.g:6797:1: rule__AndRefinement__RightAssignment_1_0_2 : ( ruleSubRefinement ) ;
    public final void rule__AndRefinement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6801:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:6802:2: ( ruleSubRefinement )
            {
            // InternalEclParser.g:6802:2: ( ruleSubRefinement )
            // InternalEclParser.g:6803:3: ruleSubRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndRefinementAccess().getRightSubRefinementParserRuleCall_1_0_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndRefinement__RightAssignment_1_0_2"


    // $ANTLR start "rule__NestedRefinement__NestedAssignment_1"
    // InternalEclParser.g:6812:1: rule__NestedRefinement__NestedAssignment_1 : ( ruleEclRefinement ) ;
    public final void rule__NestedRefinement__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6816:1: ( ( ruleEclRefinement ) )
            // InternalEclParser.g:6817:2: ( ruleEclRefinement )
            {
            // InternalEclParser.g:6817:2: ( ruleEclRefinement )
            // InternalEclParser.g:6818:3: ruleEclRefinement
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclRefinement();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedRefinementAccess().getNestedEclRefinementParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedRefinement__NestedAssignment_1"


    // $ANTLR start "rule__EclAttributeGroup__CardinalityAssignment_0"
    // InternalEclParser.g:6827:1: rule__EclAttributeGroup__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__EclAttributeGroup__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6831:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:6832:2: ( ruleCardinality )
            {
            // InternalEclParser.g:6832:2: ( ruleCardinality )
            // InternalEclParser.g:6833:3: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__CardinalityAssignment_0"


    // $ANTLR start "rule__EclAttributeGroup__RefinementAssignment_2"
    // InternalEclParser.g:6842:1: rule__EclAttributeGroup__RefinementAssignment_2 : ( ruleEclAttributeSet ) ;
    public final void rule__EclAttributeGroup__RefinementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6846:1: ( ( ruleEclAttributeSet ) )
            // InternalEclParser.g:6847:2: ( ruleEclAttributeSet )
            {
            // InternalEclParser.g:6847:2: ( ruleEclAttributeSet )
            // InternalEclParser.g:6848:3: ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getEclAttributeGroupAccess().getRefinementEclAttributeSetParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EclAttributeGroup__RefinementAssignment_2"


    // $ANTLR start "rule__OrAttributeSet__RightAssignment_1_2"
    // InternalEclParser.g:6857:1: rule__OrAttributeSet__RightAssignment_1_2 : ( ruleAndAttributeSet ) ;
    public final void rule__OrAttributeSet__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6861:1: ( ( ruleAndAttributeSet ) )
            // InternalEclParser.g:6862:2: ( ruleAndAttributeSet )
            {
            // InternalEclParser.g:6862:2: ( ruleAndAttributeSet )
            // InternalEclParser.g:6863:3: ruleAndAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleAndAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getOrAttributeSetAccess().getRightAndAttributeSetParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__OrAttributeSet__RightAssignment_1_2"


    // $ANTLR start "rule__AndAttributeSet__RightAssignment_1_2"
    // InternalEclParser.g:6872:1: rule__AndAttributeSet__RightAssignment_1_2 : ( ruleSubAttributeSet ) ;
    public final void rule__AndAttributeSet__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6876:1: ( ( ruleSubAttributeSet ) )
            // InternalEclParser.g:6877:2: ( ruleSubAttributeSet )
            {
            // InternalEclParser.g:6877:2: ( ruleSubAttributeSet )
            // InternalEclParser.g:6878:3: ruleSubAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAndAttributeSetAccess().getRightSubAttributeSetParserRuleCall_1_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AndAttributeSet__RightAssignment_1_2"


    // $ANTLR start "rule__NestedAttributeSet__NestedAssignment_1"
    // InternalEclParser.g:6887:1: rule__NestedAttributeSet__NestedAssignment_1 : ( ruleEclAttributeSet ) ;
    public final void rule__NestedAttributeSet__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6891:1: ( ( ruleEclAttributeSet ) )
            // InternalEclParser.g:6892:2: ( ruleEclAttributeSet )
            {
            // InternalEclParser.g:6892:2: ( ruleEclAttributeSet )
            // InternalEclParser.g:6893:3: ruleEclAttributeSet
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleEclAttributeSet();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedAttributeSetAccess().getNestedEclAttributeSetParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedAttributeSet__NestedAssignment_1"


    // $ANTLR start "rule__AttributeConstraint__CardinalityAssignment_0"
    // InternalEclParser.g:6902:1: rule__AttributeConstraint__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__AttributeConstraint__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6906:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:6907:2: ( ruleCardinality )
            {
            // InternalEclParser.g:6907:2: ( ruleCardinality )
            // InternalEclParser.g:6908:3: ruleCardinality
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleCardinality();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getCardinalityCardinalityParserRuleCall_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__CardinalityAssignment_0"


    // $ANTLR start "rule__AttributeConstraint__ReversedAssignment_1"
    // InternalEclParser.g:6917:1: rule__AttributeConstraint__ReversedAssignment_1 : ( RULE_REVERSED ) ;
    public final void rule__AttributeConstraint__ReversedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6921:1: ( ( RULE_REVERSED ) )
            // InternalEclParser.g:6922:2: ( RULE_REVERSED )
            {
            // InternalEclParser.g:6922:2: ( RULE_REVERSED )
            // InternalEclParser.g:6923:3: RULE_REVERSED
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); 
            }
            match(input,RULE_REVERSED,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getReversedREVERSEDTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__ReversedAssignment_1"


    // $ANTLR start "rule__AttributeConstraint__AttributeAssignment_2"
    // InternalEclParser.g:6932:1: rule__AttributeConstraint__AttributeAssignment_2 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeConstraint__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6936:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6937:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6937:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6938:3: ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getAttributeSubExpressionConstraintParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__AttributeAssignment_2"


    // $ANTLR start "rule__AttributeConstraint__ComparisonAssignment_3"
    // InternalEclParser.g:6947:1: rule__AttributeConstraint__ComparisonAssignment_3 : ( ruleComparison ) ;
    public final void rule__AttributeConstraint__ComparisonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6951:1: ( ( ruleComparison ) )
            // InternalEclParser.g:6952:2: ( ruleComparison )
            {
            // InternalEclParser.g:6952:2: ( ruleComparison )
            // InternalEclParser.g:6953:3: ruleComparison
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleComparison();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeConstraintAccess().getComparisonComparisonParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeConstraint__ComparisonAssignment_3"


    // $ANTLR start "rule__Cardinality__MinAssignment_1"
    // InternalEclParser.g:6962:1: rule__Cardinality__MinAssignment_1 : ( ruleNonNegativeInteger ) ;
    public final void rule__Cardinality__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6966:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6967:2: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6967:2: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6968:3: ruleNonNegativeInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleNonNegativeInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getMinNonNegativeIntegerParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__MinAssignment_1"


    // $ANTLR start "rule__Cardinality__MaxAssignment_3"
    // InternalEclParser.g:6977:1: rule__Cardinality__MaxAssignment_3 : ( ruleMaxValue ) ;
    public final void rule__Cardinality__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6981:1: ( ( ruleMaxValue ) )
            // InternalEclParser.g:6982:2: ( ruleMaxValue )
            {
            // InternalEclParser.g:6982:2: ( ruleMaxValue )
            // InternalEclParser.g:6983:3: ruleMaxValue
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleMaxValue();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getCardinalityAccess().getMaxMaxValueParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cardinality__MaxAssignment_3"


    // $ANTLR start "rule__AttributeValueEquals__ConstraintAssignment_1"
    // InternalEclParser.g:6992:1: rule__AttributeValueEquals__ConstraintAssignment_1 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeValueEquals__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6996:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6997:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6997:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6998:3: ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueEquals__ConstraintAssignment_1"


    // $ANTLR start "rule__AttributeValueNotEquals__ConstraintAssignment_1"
    // InternalEclParser.g:7007:1: rule__AttributeValueNotEquals__ConstraintAssignment_1 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeValueNotEquals__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7011:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:7012:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:7012:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:7013:3: ruleSubExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleSubExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintSubExpressionConstraintParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueNotEquals__ConstraintAssignment_1"


    // $ANTLR start "rule__BooleanValueEquals__ValueAssignment_1"
    // InternalEclParser.g:7022:1: rule__BooleanValueEquals__ValueAssignment_1 : ( ruleBoolean ) ;
    public final void rule__BooleanValueEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7026:1: ( ( ruleBoolean ) )
            // InternalEclParser.g:7027:2: ( ruleBoolean )
            {
            // InternalEclParser.g:7027:2: ( ruleBoolean )
            // InternalEclParser.g:7028:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueEqualsAccess().getValueBooleanParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueEquals__ValueAssignment_1"


    // $ANTLR start "rule__BooleanValueNotEquals__ValueAssignment_1"
    // InternalEclParser.g:7037:1: rule__BooleanValueNotEquals__ValueAssignment_1 : ( ruleBoolean ) ;
    public final void rule__BooleanValueNotEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7041:1: ( ( ruleBoolean ) )
            // InternalEclParser.g:7042:2: ( ruleBoolean )
            {
            // InternalEclParser.g:7042:2: ( ruleBoolean )
            // InternalEclParser.g:7043:3: ruleBoolean
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleBoolean();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getBooleanValueNotEqualsAccess().getValueBooleanParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BooleanValueNotEquals__ValueAssignment_1"


    // $ANTLR start "rule__StringValueEquals__ValueAssignment_1"
    // InternalEclParser.g:7052:1: rule__StringValueEquals__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValueEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7056:1: ( ( RULE_STRING ) )
            // InternalEclParser.g:7057:2: ( RULE_STRING )
            {
            // InternalEclParser.g:7057:2: ( RULE_STRING )
            // InternalEclParser.g:7058:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueEquals__ValueAssignment_1"


    // $ANTLR start "rule__StringValueNotEquals__ValueAssignment_1"
    // InternalEclParser.g:7067:1: rule__StringValueNotEquals__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValueNotEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7071:1: ( ( RULE_STRING ) )
            // InternalEclParser.g:7072:2: ( RULE_STRING )
            {
            // InternalEclParser.g:7072:2: ( RULE_STRING )
            // InternalEclParser.g:7073:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }
            match(input,RULE_STRING,FollowSets000.FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getStringValueNotEqualsAccess().getValueSTRINGTerminalRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringValueNotEquals__ValueAssignment_1"


    // $ANTLR start "rule__IntegerValueEquals__ValueAssignment_2"
    // InternalEclParser.g:7082:1: rule__IntegerValueEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7086:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7087:2: ( ruleInteger )
            {
            // InternalEclParser.g:7087:2: ( ruleInteger )
            // InternalEclParser.g:7088:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueEquals__ValueAssignment_2"


    // $ANTLR start "rule__IntegerValueNotEquals__ValueAssignment_2"
    // InternalEclParser.g:7097:1: rule__IntegerValueNotEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueNotEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7101:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7102:2: ( ruleInteger )
            {
            // InternalEclParser.g:7102:2: ( ruleInteger )
            // InternalEclParser.g:7103:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueNotEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueNotEquals__ValueAssignment_2"


    // $ANTLR start "rule__IntegerValueGreaterThan__ValueAssignment_2"
    // InternalEclParser.g:7112:1: rule__IntegerValueGreaterThan__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueGreaterThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7116:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7117:2: ( ruleInteger )
            {
            // InternalEclParser.g:7117:2: ( ruleInteger )
            // InternalEclParser.g:7118:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThan__ValueAssignment_2"


    // $ANTLR start "rule__IntegerValueLessThan__ValueAssignment_2"
    // InternalEclParser.g:7127:1: rule__IntegerValueLessThan__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueLessThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7131:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7132:2: ( ruleInteger )
            {
            // InternalEclParser.g:7132:2: ( ruleInteger )
            // InternalEclParser.g:7133:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThan__ValueAssignment_2"


    // $ANTLR start "rule__IntegerValueGreaterThanEquals__ValueAssignment_2"
    // InternalEclParser.g:7142:1: rule__IntegerValueGreaterThanEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueGreaterThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7146:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7147:2: ( ruleInteger )
            {
            // InternalEclParser.g:7147:2: ( ruleInteger )
            // InternalEclParser.g:7148:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueGreaterThanEquals__ValueAssignment_2"


    // $ANTLR start "rule__IntegerValueLessThanEquals__ValueAssignment_2"
    // InternalEclParser.g:7157:1: rule__IntegerValueLessThanEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueLessThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7161:1: ( ( ruleInteger ) )
            // InternalEclParser.g:7162:2: ( ruleInteger )
            {
            // InternalEclParser.g:7162:2: ( ruleInteger )
            // InternalEclParser.g:7163:3: ruleInteger
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleInteger();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueIntegerParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__IntegerValueLessThanEquals__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueEquals__ValueAssignment_2"
    // InternalEclParser.g:7172:1: rule__DecimalValueEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7176:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7177:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7177:2: ( ruleDecimal )
            // InternalEclParser.g:7178:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueEquals__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueNotEquals__ValueAssignment_2"
    // InternalEclParser.g:7187:1: rule__DecimalValueNotEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueNotEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7191:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7192:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7192:2: ( ruleDecimal )
            // InternalEclParser.g:7193:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueNotEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueNotEquals__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueGreaterThan__ValueAssignment_2"
    // InternalEclParser.g:7202:1: rule__DecimalValueGreaterThan__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueGreaterThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7206:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7207:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7207:2: ( ruleDecimal )
            // InternalEclParser.g:7208:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThan__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueLessThan__ValueAssignment_2"
    // InternalEclParser.g:7217:1: rule__DecimalValueLessThan__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueLessThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7221:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7222:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7222:2: ( ruleDecimal )
            // InternalEclParser.g:7223:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThan__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueGreaterThanEquals__ValueAssignment_2"
    // InternalEclParser.g:7232:1: rule__DecimalValueGreaterThanEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueGreaterThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7236:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7237:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7237:2: ( ruleDecimal )
            // InternalEclParser.g:7238:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueGreaterThanEquals__ValueAssignment_2"


    // $ANTLR start "rule__DecimalValueLessThanEquals__ValueAssignment_2"
    // InternalEclParser.g:7247:1: rule__DecimalValueLessThanEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueLessThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7251:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7252:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7252:2: ( ruleDecimal )
            // InternalEclParser.g:7253:3: ruleDecimal
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleDecimal();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueDecimalParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DecimalValueLessThanEquals__ValueAssignment_2"


    // $ANTLR start "rule__NestedExpression__NestedAssignment_1"
    // InternalEclParser.g:7262:1: rule__NestedExpression__NestedAssignment_1 : ( ruleExpressionConstraint ) ;
    public final void rule__NestedExpression__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7266:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:7267:2: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:7267:2: ( ruleExpressionConstraint )
            // InternalEclParser.g:7268:3: ruleExpressionConstraint
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); 
            }
            pushFollow(FollowSets000.FOLLOW_2);
            ruleExpressionConstraint();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNestedExpressionAccess().getNestedExpressionConstraintParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NestedExpression__NestedAssignment_1"

    // $ANTLR start synpred16_InternalEclParser
    public final void synpred16_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1845:2: ( ( ruleAttributeConstraint ) )
        // InternalEclParser.g:1845:2: ( ruleAttributeConstraint )
        {
        // InternalEclParser.g:1845:2: ( ruleAttributeConstraint )
        // InternalEclParser.g:1846:3: ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSubRefinementAccess().getAttributeConstraintParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalEclParser

    // $ANTLR start synpred17_InternalEclParser
    public final void synpred17_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1851:2: ( ( ruleEclAttributeGroup ) )
        // InternalEclParser.g:1851:2: ( ruleEclAttributeGroup )
        {
        // InternalEclParser.g:1851:2: ( ruleEclAttributeGroup )
        // InternalEclParser.g:1852:3: ruleEclAttributeGroup
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSubRefinementAccess().getEclAttributeGroupParserRuleCall_1()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleEclAttributeGroup();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred17_InternalEclParser

    // $ANTLR start synpred19_InternalEclParser
    public final void synpred19_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1893:2: ( ( ruleAttributeConstraint ) )
        // InternalEclParser.g:1893:2: ( ruleAttributeConstraint )
        {
        // InternalEclParser.g:1893:2: ( ruleAttributeConstraint )
        // InternalEclParser.g:1894:3: ruleAttributeConstraint
        {
        if ( state.backtracking==0 ) {
           before(grammarAccess.getSubAttributeSetAccess().getAttributeConstraintParserRuleCall_0()); 
        }
        pushFollow(FollowSets000.FOLLOW_2);
        ruleAttributeConstraint();

        state._fsp--;
        if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred19_InternalEclParser

    // $ANTLR start synpred56_InternalEclParser
    public final void synpred56_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:3676:3: ( rule__OrRefinement__Group_1__0 )
        // InternalEclParser.g:3676:3: rule__OrRefinement__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__OrRefinement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred56_InternalEclParser

    // $ANTLR start synpred57_InternalEclParser
    public final void synpred57_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:3838:3: ( rule__AndRefinement__Group_1__0 )
        // InternalEclParser.g:3838:3: rule__AndRefinement__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AndRefinement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred57_InternalEclParser

    // Delegated rules

    public final boolean synpred57_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred57_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred17_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred56_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred56_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred19_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA6 dfa6 = new DFA6(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA11 dfa11 = new DFA11(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\7\1\0\14\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\44\1\0\14\uffff\1\0\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\14\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\14\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\6\uffff\1\2\1\uffff\1\17\1\uffff\1\16\1\uffff\1\1\3\uffff\1\2\1\uffff\1\2\2\uffff\10\2",
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
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "1840:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA6_1 = input.LA(1);

                         
                        int index6_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEclParser()) ) {s = 2;}

                        else if ( (synpred17_InternalEclParser()) ) {s = 15;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_14 = input.LA(1);

                         
                        int index6_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred16_InternalEclParser()) ) {s = 2;}

                        else if ( (true) ) {s = 16;}

                         
                        input.seek(index6_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 6, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_7s = "\20\uffff";
    static final String dfa_8s = "\1\7\15\uffff\1\0\1\uffff";
    static final String dfa_9s = "\1\44\15\uffff\1\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\15\uffff\1\2";
    static final String dfa_11s = "\16\uffff\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\6\uffff\1\1\3\uffff\1\16\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\10\1",
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

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_7;
            this.eof = dfa_7;
            this.min = dfa_8;
            this.max = dfa_9;
            this.accept = dfa_10;
            this.special = dfa_11;
            this.transition = dfa_12;
        }
        public String getDescription() {
            return "1888:1: rule__SubAttributeSet__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_14 = input.LA(1);

                         
                        int index8_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred19_InternalEclParser()) ) {s = 1;}

                        else if ( (true) ) {s = 15;}

                         
                        input.seek(index8_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 8, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String dfa_13s = "\101\uffff";
    static final String dfa_14s = "\23\uffff\2\52\2\uffff\2\56\2\uffff\2\62\2\uffff\2\66\2\uffff\2\72\2\uffff\2\76\2\uffff\2\52\2\uffff\2\56\2\uffff\2\62\2\uffff\2\66\2\uffff\2\72\2\uffff\2\76";
    static final String dfa_15s = "\1\33\2\4\4\47\2\uffff\1\15\2\uffff\7\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11";
    static final String dfa_16s = "\1\46\2\53\4\47\2\uffff\1\27\2\uffff\5\27\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31";
    static final String dfa_17s = "\7\uffff\1\3\1\1\1\uffff\1\4\1\2\35\uffff\1\13\1\5\2\uffff\1\14\1\6\2\uffff\1\15\1\7\2\uffff\1\16\1\10\2\uffff\1\17\1\11\2\uffff\1\20\1\12\2\uffff";
    static final String dfa_18s = "\101\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\2\1\5\1\3\6\uffff\1\4\1\6",
            "\2\10\41\uffff\1\11\3\uffff\1\7",
            "\2\13\41\uffff\1\14\3\uffff\1\12",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "",
            "",
            "\1\23\1\24\7\uffff\1\21\1\22",
            "",
            "",
            "\1\27\1\30\7\uffff\1\25\1\26",
            "\1\33\1\34\7\uffff\1\31\1\32",
            "\1\37\1\40\7\uffff\1\35\1\36",
            "\1\43\1\44\7\uffff\1\41\1\42",
            "\1\47\1\50\7\uffff\1\45\1\46",
            "\1\23\1\24",
            "\1\23\1\24",
            "\4\52\4\uffff\1\52\1\uffff\1\52\5\uffff\1\51",
            "\4\52\1\54\1\53\2\uffff\1\52\1\uffff\1\52\5\uffff\1\51",
            "\1\27\1\30",
            "\1\27\1\30",
            "\4\56\4\uffff\1\56\1\uffff\1\56\5\uffff\1\55",
            "\4\56\1\60\1\57\2\uffff\1\56\1\uffff\1\56\5\uffff\1\55",
            "\1\33\1\34",
            "\1\33\1\34",
            "\4\62\4\uffff\1\62\1\uffff\1\62\5\uffff\1\61",
            "\4\62\1\64\1\63\2\uffff\1\62\1\uffff\1\62\5\uffff\1\61",
            "\1\37\1\40",
            "\1\37\1\40",
            "\4\66\4\uffff\1\66\1\uffff\1\66\5\uffff\1\65",
            "\4\66\1\70\1\67\2\uffff\1\66\1\uffff\1\66\5\uffff\1\65",
            "\1\43\1\44",
            "\1\43\1\44",
            "\4\72\4\uffff\1\72\1\uffff\1\72\5\uffff\1\71",
            "\4\72\1\74\1\73\2\uffff\1\72\1\uffff\1\72\5\uffff\1\71",
            "\1\47\1\50",
            "\1\47\1\50",
            "\4\76\4\uffff\1\76\1\uffff\1\76\5\uffff\1\75",
            "\4\76\1\100\1\77\2\uffff\1\76\1\uffff\1\76\5\uffff\1\75",
            "",
            "",
            "\4\52\1\54\1\53\2\uffff\1\52\1\uffff\1\52\5\uffff\1\51",
            "\4\52\1\54\1\53\2\uffff\1\52\1\uffff\1\52\5\uffff\1\51",
            "",
            "",
            "\4\56\1\60\1\57\2\uffff\1\56\1\uffff\1\56\5\uffff\1\55",
            "\4\56\1\60\1\57\2\uffff\1\56\1\uffff\1\56\5\uffff\1\55",
            "",
            "",
            "\4\62\1\64\1\63\2\uffff\1\62\1\uffff\1\62\5\uffff\1\61",
            "\4\62\1\64\1\63\2\uffff\1\62\1\uffff\1\62\5\uffff\1\61",
            "",
            "",
            "\4\66\1\70\1\67\2\uffff\1\66\1\uffff\1\66\5\uffff\1\65",
            "\4\66\1\70\1\67\2\uffff\1\66\1\uffff\1\66\5\uffff\1\65",
            "",
            "",
            "\4\72\1\74\1\73\2\uffff\1\72\1\uffff\1\72\5\uffff\1\71",
            "\4\72\1\74\1\73\2\uffff\1\72\1\uffff\1\72\5\uffff\1\71",
            "",
            "",
            "\4\76\1\100\1\77\2\uffff\1\76\1\uffff\1\76\5\uffff\1\75",
            "\4\76\1\100\1\77\2\uffff\1\76\1\uffff\1\76\5\uffff\1\75"
    };

    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final char[] dfa_15 = DFA.unpackEncodedStringToUnsignedChars(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final short[] dfa_17 = DFA.unpackEncodedString(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[][] dfa_19 = unpackEncodedStringArray(dfa_19s);

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = dfa_13;
            this.eof = dfa_14;
            this.min = dfa_15;
            this.max = dfa_16;
            this.accept = dfa_17;
            this.special = dfa_18;
            this.transition = dfa_19;
        }
        public String getDescription() {
            return "1951:1: rule__DataTypeComparison__Alternatives : ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001FE5044000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000600L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000602L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001FE5154080L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001FE5144080L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000006078000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004006000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000080000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000C06000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006002L});
    }


}