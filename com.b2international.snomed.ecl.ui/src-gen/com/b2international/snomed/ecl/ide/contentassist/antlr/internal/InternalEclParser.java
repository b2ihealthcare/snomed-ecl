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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "False", "True", "RULE_TERM_STRING", "RULE_REVERSED", "RULE_TO", "RULE_COMMA", "RULE_CONJUNCTION", "RULE_DISJUNCTION", "RULE_EXCLUSION", "RULE_ZERO", "RULE_DIGIT_NONZERO", "RULE_COLON", "RULE_CURLY_OPEN", "RULE_CURLY_CLOSE", "RULE_ROUND_OPEN", "RULE_ROUND_CLOSE", "RULE_SQUARE_OPEN", "RULE_SQUARE_CLOSE", "RULE_PLUS", "RULE_DASH", "RULE_CARET", "RULE_DOT", "RULE_WILDCARD", "RULE_EQUAL", "RULE_NOT_EQUAL", "RULE_LT", "RULE_GT", "RULE_DBL_LT", "RULE_DBL_GT", "RULE_LT_EM", "RULE_GT_EM", "RULE_GTE", "RULE_LTE", "RULE_HASH", "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_STRING"
    };
    public static final int RULE_LTE=36;
    public static final int RULE_DIGIT_NONZERO=14;
    public static final int RULE_CURLY_OPEN=16;
    public static final int RULE_TO=8;
    public static final int RULE_ROUND_CLOSE=19;
    public static final int RULE_DBL_GT=32;
    public static final int True=5;
    public static final int RULE_GT=30;
    public static final int RULE_STRING=41;
    public static final int False=4;
    public static final int RULE_REVERSED=7;
    public static final int RULE_GTE=35;
    public static final int RULE_SL_COMMENT=40;
    public static final int RULE_HASH=37;
    public static final int RULE_ROUND_OPEN=18;
    public static final int RULE_DASH=23;
    public static final int RULE_DBL_LT=31;
    public static final int RULE_PLUS=22;
    public static final int RULE_NOT_EQUAL=28;
    public static final int RULE_DOT=25;
    public static final int EOF=-1;
    public static final int RULE_SQUARE_CLOSE=21;
    public static final int RULE_SQUARE_OPEN=20;
    public static final int RULE_EQUAL=27;
    public static final int RULE_COMMA=9;
    public static final int RULE_LT_EM=33;
    public static final int RULE_GT_EM=34;
    public static final int RULE_WS=38;
    public static final int RULE_EXCLUSION=12;
    public static final int RULE_CURLY_CLOSE=17;
    public static final int RULE_ZERO=13;
    public static final int RULE_COLON=15;
    public static final int RULE_CARET=24;
    public static final int RULE_LT=29;
    public static final int RULE_CONJUNCTION=10;
    public static final int RULE_ML_COMMENT=39;
    public static final int RULE_WILDCARD=26;
    public static final int RULE_DISJUNCTION=11;
    public static final int RULE_TERM_STRING=6;

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


    // $ANTLR start "entryRuleDescendantOf"
    // InternalEclParser.g:320:1: entryRuleDescendantOf : ruleDescendantOf EOF ;
    public final void entryRuleDescendantOf() throws RecognitionException {
        try {
            // InternalEclParser.g:321:1: ( ruleDescendantOf EOF )
            // InternalEclParser.g:322:1: ruleDescendantOf EOF
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
    // InternalEclParser.g:329:1: ruleDescendantOf : ( ( rule__DescendantOf__Group__0 ) ) ;
    public final void ruleDescendantOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:333:2: ( ( ( rule__DescendantOf__Group__0 ) ) )
            // InternalEclParser.g:334:2: ( ( rule__DescendantOf__Group__0 ) )
            {
            // InternalEclParser.g:334:2: ( ( rule__DescendantOf__Group__0 ) )
            // InternalEclParser.g:335:3: ( rule__DescendantOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getGroup()); 
            }
            // InternalEclParser.g:336:3: ( rule__DescendantOf__Group__0 )
            // InternalEclParser.g:336:4: rule__DescendantOf__Group__0
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
    // InternalEclParser.g:345:1: entryRuleDescendantOrSelfOf : ruleDescendantOrSelfOf EOF ;
    public final void entryRuleDescendantOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:346:1: ( ruleDescendantOrSelfOf EOF )
            // InternalEclParser.g:347:1: ruleDescendantOrSelfOf EOF
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
    // InternalEclParser.g:354:1: ruleDescendantOrSelfOf : ( ( rule__DescendantOrSelfOf__Group__0 ) ) ;
    public final void ruleDescendantOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:358:2: ( ( ( rule__DescendantOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:359:2: ( ( rule__DescendantOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:359:2: ( ( rule__DescendantOrSelfOf__Group__0 ) )
            // InternalEclParser.g:360:3: ( rule__DescendantOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:361:3: ( rule__DescendantOrSelfOf__Group__0 )
            // InternalEclParser.g:361:4: rule__DescendantOrSelfOf__Group__0
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
    // InternalEclParser.g:370:1: entryRuleParentOf : ruleParentOf EOF ;
    public final void entryRuleParentOf() throws RecognitionException {
        try {
            // InternalEclParser.g:371:1: ( ruleParentOf EOF )
            // InternalEclParser.g:372:1: ruleParentOf EOF
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
    // InternalEclParser.g:379:1: ruleParentOf : ( ( rule__ParentOf__Group__0 ) ) ;
    public final void ruleParentOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:383:2: ( ( ( rule__ParentOf__Group__0 ) ) )
            // InternalEclParser.g:384:2: ( ( rule__ParentOf__Group__0 ) )
            {
            // InternalEclParser.g:384:2: ( ( rule__ParentOf__Group__0 ) )
            // InternalEclParser.g:385:3: ( rule__ParentOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getGroup()); 
            }
            // InternalEclParser.g:386:3: ( rule__ParentOf__Group__0 )
            // InternalEclParser.g:386:4: rule__ParentOf__Group__0
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


    // $ANTLR start "entryRuleAncestorOf"
    // InternalEclParser.g:395:1: entryRuleAncestorOf : ruleAncestorOf EOF ;
    public final void entryRuleAncestorOf() throws RecognitionException {
        try {
            // InternalEclParser.g:396:1: ( ruleAncestorOf EOF )
            // InternalEclParser.g:397:1: ruleAncestorOf EOF
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
    // InternalEclParser.g:404:1: ruleAncestorOf : ( ( rule__AncestorOf__Group__0 ) ) ;
    public final void ruleAncestorOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:408:2: ( ( ( rule__AncestorOf__Group__0 ) ) )
            // InternalEclParser.g:409:2: ( ( rule__AncestorOf__Group__0 ) )
            {
            // InternalEclParser.g:409:2: ( ( rule__AncestorOf__Group__0 ) )
            // InternalEclParser.g:410:3: ( rule__AncestorOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getGroup()); 
            }
            // InternalEclParser.g:411:3: ( rule__AncestorOf__Group__0 )
            // InternalEclParser.g:411:4: rule__AncestorOf__Group__0
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
    // InternalEclParser.g:420:1: entryRuleAncestorOrSelfOf : ruleAncestorOrSelfOf EOF ;
    public final void entryRuleAncestorOrSelfOf() throws RecognitionException {
        try {
            // InternalEclParser.g:421:1: ( ruleAncestorOrSelfOf EOF )
            // InternalEclParser.g:422:1: ruleAncestorOrSelfOf EOF
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
    // InternalEclParser.g:429:1: ruleAncestorOrSelfOf : ( ( rule__AncestorOrSelfOf__Group__0 ) ) ;
    public final void ruleAncestorOrSelfOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:433:2: ( ( ( rule__AncestorOrSelfOf__Group__0 ) ) )
            // InternalEclParser.g:434:2: ( ( rule__AncestorOrSelfOf__Group__0 ) )
            {
            // InternalEclParser.g:434:2: ( ( rule__AncestorOrSelfOf__Group__0 ) )
            // InternalEclParser.g:435:3: ( rule__AncestorOrSelfOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getGroup()); 
            }
            // InternalEclParser.g:436:3: ( rule__AncestorOrSelfOf__Group__0 )
            // InternalEclParser.g:436:4: rule__AncestorOrSelfOf__Group__0
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
    // InternalEclParser.g:445:1: entryRuleMemberOf : ruleMemberOf EOF ;
    public final void entryRuleMemberOf() throws RecognitionException {
        try {
            // InternalEclParser.g:446:1: ( ruleMemberOf EOF )
            // InternalEclParser.g:447:1: ruleMemberOf EOF
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
    // InternalEclParser.g:454:1: ruleMemberOf : ( ( rule__MemberOf__Group__0 ) ) ;
    public final void ruleMemberOf() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:458:2: ( ( ( rule__MemberOf__Group__0 ) ) )
            // InternalEclParser.g:459:2: ( ( rule__MemberOf__Group__0 ) )
            {
            // InternalEclParser.g:459:2: ( ( rule__MemberOf__Group__0 ) )
            // InternalEclParser.g:460:3: ( rule__MemberOf__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getGroup()); 
            }
            // InternalEclParser.g:461:3: ( rule__MemberOf__Group__0 )
            // InternalEclParser.g:461:4: rule__MemberOf__Group__0
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
    // InternalEclParser.g:470:1: entryRuleEclConceptReference : ruleEclConceptReference EOF ;
    public final void entryRuleEclConceptReference() throws RecognitionException {
        try {
            // InternalEclParser.g:471:1: ( ruleEclConceptReference EOF )
            // InternalEclParser.g:472:1: ruleEclConceptReference EOF
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
    // InternalEclParser.g:479:1: ruleEclConceptReference : ( ( rule__EclConceptReference__Group__0 ) ) ;
    public final void ruleEclConceptReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:483:2: ( ( ( rule__EclConceptReference__Group__0 ) ) )
            // InternalEclParser.g:484:2: ( ( rule__EclConceptReference__Group__0 ) )
            {
            // InternalEclParser.g:484:2: ( ( rule__EclConceptReference__Group__0 ) )
            // InternalEclParser.g:485:3: ( rule__EclConceptReference__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getGroup()); 
            }
            // InternalEclParser.g:486:3: ( rule__EclConceptReference__Group__0 )
            // InternalEclParser.g:486:4: rule__EclConceptReference__Group__0
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
    // InternalEclParser.g:495:1: entryRuleAny : ruleAny EOF ;
    public final void entryRuleAny() throws RecognitionException {
        try {
            // InternalEclParser.g:496:1: ( ruleAny EOF )
            // InternalEclParser.g:497:1: ruleAny EOF
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
    // InternalEclParser.g:504:1: ruleAny : ( ( rule__Any__Group__0 ) ) ;
    public final void ruleAny() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:508:2: ( ( ( rule__Any__Group__0 ) ) )
            // InternalEclParser.g:509:2: ( ( rule__Any__Group__0 ) )
            {
            // InternalEclParser.g:509:2: ( ( rule__Any__Group__0 ) )
            // InternalEclParser.g:510:3: ( rule__Any__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyAccess().getGroup()); 
            }
            // InternalEclParser.g:511:3: ( rule__Any__Group__0 )
            // InternalEclParser.g:511:4: rule__Any__Group__0
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
    // InternalEclParser.g:520:1: entryRuleEclRefinement : ruleEclRefinement EOF ;
    public final void entryRuleEclRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:521:1: ( ruleEclRefinement EOF )
            // InternalEclParser.g:522:1: ruleEclRefinement EOF
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
    // InternalEclParser.g:529:1: ruleEclRefinement : ( ruleOrRefinement ) ;
    public final void ruleEclRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:533:2: ( ( ruleOrRefinement ) )
            // InternalEclParser.g:534:2: ( ruleOrRefinement )
            {
            // InternalEclParser.g:534:2: ( ruleOrRefinement )
            // InternalEclParser.g:535:3: ruleOrRefinement
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
    // InternalEclParser.g:545:1: entryRuleOrRefinement : ruleOrRefinement EOF ;
    public final void entryRuleOrRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:546:1: ( ruleOrRefinement EOF )
            // InternalEclParser.g:547:1: ruleOrRefinement EOF
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
    // InternalEclParser.g:554:1: ruleOrRefinement : ( ( rule__OrRefinement__Group__0 ) ) ;
    public final void ruleOrRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:558:2: ( ( ( rule__OrRefinement__Group__0 ) ) )
            // InternalEclParser.g:559:2: ( ( rule__OrRefinement__Group__0 ) )
            {
            // InternalEclParser.g:559:2: ( ( rule__OrRefinement__Group__0 ) )
            // InternalEclParser.g:560:3: ( rule__OrRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:561:3: ( rule__OrRefinement__Group__0 )
            // InternalEclParser.g:561:4: rule__OrRefinement__Group__0
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
    // InternalEclParser.g:570:1: entryRuleAndRefinement : ruleAndRefinement EOF ;
    public final void entryRuleAndRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:571:1: ( ruleAndRefinement EOF )
            // InternalEclParser.g:572:1: ruleAndRefinement EOF
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
    // InternalEclParser.g:579:1: ruleAndRefinement : ( ( rule__AndRefinement__Group__0 ) ) ;
    public final void ruleAndRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:583:2: ( ( ( rule__AndRefinement__Group__0 ) ) )
            // InternalEclParser.g:584:2: ( ( rule__AndRefinement__Group__0 ) )
            {
            // InternalEclParser.g:584:2: ( ( rule__AndRefinement__Group__0 ) )
            // InternalEclParser.g:585:3: ( rule__AndRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:586:3: ( rule__AndRefinement__Group__0 )
            // InternalEclParser.g:586:4: rule__AndRefinement__Group__0
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
    // InternalEclParser.g:595:1: entryRuleSubRefinement : ruleSubRefinement EOF ;
    public final void entryRuleSubRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:596:1: ( ruleSubRefinement EOF )
            // InternalEclParser.g:597:1: ruleSubRefinement EOF
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
    // InternalEclParser.g:604:1: ruleSubRefinement : ( ( rule__SubRefinement__Alternatives ) ) ;
    public final void ruleSubRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:608:2: ( ( ( rule__SubRefinement__Alternatives ) ) )
            // InternalEclParser.g:609:2: ( ( rule__SubRefinement__Alternatives ) )
            {
            // InternalEclParser.g:609:2: ( ( rule__SubRefinement__Alternatives ) )
            // InternalEclParser.g:610:3: ( rule__SubRefinement__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubRefinementAccess().getAlternatives()); 
            }
            // InternalEclParser.g:611:3: ( rule__SubRefinement__Alternatives )
            // InternalEclParser.g:611:4: rule__SubRefinement__Alternatives
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
    // InternalEclParser.g:620:1: entryRuleNestedRefinement : ruleNestedRefinement EOF ;
    public final void entryRuleNestedRefinement() throws RecognitionException {
        try {
            // InternalEclParser.g:621:1: ( ruleNestedRefinement EOF )
            // InternalEclParser.g:622:1: ruleNestedRefinement EOF
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
    // InternalEclParser.g:629:1: ruleNestedRefinement : ( ( rule__NestedRefinement__Group__0 ) ) ;
    public final void ruleNestedRefinement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:633:2: ( ( ( rule__NestedRefinement__Group__0 ) ) )
            // InternalEclParser.g:634:2: ( ( rule__NestedRefinement__Group__0 ) )
            {
            // InternalEclParser.g:634:2: ( ( rule__NestedRefinement__Group__0 ) )
            // InternalEclParser.g:635:3: ( rule__NestedRefinement__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getGroup()); 
            }
            // InternalEclParser.g:636:3: ( rule__NestedRefinement__Group__0 )
            // InternalEclParser.g:636:4: rule__NestedRefinement__Group__0
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
    // InternalEclParser.g:645:1: entryRuleEclAttributeGroup : ruleEclAttributeGroup EOF ;
    public final void entryRuleEclAttributeGroup() throws RecognitionException {
        try {
            // InternalEclParser.g:646:1: ( ruleEclAttributeGroup EOF )
            // InternalEclParser.g:647:1: ruleEclAttributeGroup EOF
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
    // InternalEclParser.g:654:1: ruleEclAttributeGroup : ( ( rule__EclAttributeGroup__Group__0 ) ) ;
    public final void ruleEclAttributeGroup() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:658:2: ( ( ( rule__EclAttributeGroup__Group__0 ) ) )
            // InternalEclParser.g:659:2: ( ( rule__EclAttributeGroup__Group__0 ) )
            {
            // InternalEclParser.g:659:2: ( ( rule__EclAttributeGroup__Group__0 ) )
            // InternalEclParser.g:660:3: ( rule__EclAttributeGroup__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getGroup()); 
            }
            // InternalEclParser.g:661:3: ( rule__EclAttributeGroup__Group__0 )
            // InternalEclParser.g:661:4: rule__EclAttributeGroup__Group__0
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
    // InternalEclParser.g:670:1: entryRuleEclAttributeSet : ruleEclAttributeSet EOF ;
    public final void entryRuleEclAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:671:1: ( ruleEclAttributeSet EOF )
            // InternalEclParser.g:672:1: ruleEclAttributeSet EOF
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
    // InternalEclParser.g:679:1: ruleEclAttributeSet : ( ruleOrAttributeSet ) ;
    public final void ruleEclAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:683:2: ( ( ruleOrAttributeSet ) )
            // InternalEclParser.g:684:2: ( ruleOrAttributeSet )
            {
            // InternalEclParser.g:684:2: ( ruleOrAttributeSet )
            // InternalEclParser.g:685:3: ruleOrAttributeSet
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
    // InternalEclParser.g:695:1: entryRuleOrAttributeSet : ruleOrAttributeSet EOF ;
    public final void entryRuleOrAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:696:1: ( ruleOrAttributeSet EOF )
            // InternalEclParser.g:697:1: ruleOrAttributeSet EOF
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
    // InternalEclParser.g:704:1: ruleOrAttributeSet : ( ( rule__OrAttributeSet__Group__0 ) ) ;
    public final void ruleOrAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:708:2: ( ( ( rule__OrAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:709:2: ( ( rule__OrAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:709:2: ( ( rule__OrAttributeSet__Group__0 ) )
            // InternalEclParser.g:710:3: ( rule__OrAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:711:3: ( rule__OrAttributeSet__Group__0 )
            // InternalEclParser.g:711:4: rule__OrAttributeSet__Group__0
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
    // InternalEclParser.g:720:1: entryRuleAndAttributeSet : ruleAndAttributeSet EOF ;
    public final void entryRuleAndAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:721:1: ( ruleAndAttributeSet EOF )
            // InternalEclParser.g:722:1: ruleAndAttributeSet EOF
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
    // InternalEclParser.g:729:1: ruleAndAttributeSet : ( ( rule__AndAttributeSet__Group__0 ) ) ;
    public final void ruleAndAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:733:2: ( ( ( rule__AndAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:734:2: ( ( rule__AndAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:734:2: ( ( rule__AndAttributeSet__Group__0 ) )
            // InternalEclParser.g:735:3: ( rule__AndAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:736:3: ( rule__AndAttributeSet__Group__0 )
            // InternalEclParser.g:736:4: rule__AndAttributeSet__Group__0
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
    // InternalEclParser.g:745:1: entryRuleSubAttributeSet : ruleSubAttributeSet EOF ;
    public final void entryRuleSubAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:746:1: ( ruleSubAttributeSet EOF )
            // InternalEclParser.g:747:1: ruleSubAttributeSet EOF
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
    // InternalEclParser.g:754:1: ruleSubAttributeSet : ( ( rule__SubAttributeSet__Alternatives ) ) ;
    public final void ruleSubAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:758:2: ( ( ( rule__SubAttributeSet__Alternatives ) ) )
            // InternalEclParser.g:759:2: ( ( rule__SubAttributeSet__Alternatives ) )
            {
            // InternalEclParser.g:759:2: ( ( rule__SubAttributeSet__Alternatives ) )
            // InternalEclParser.g:760:3: ( rule__SubAttributeSet__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSubAttributeSetAccess().getAlternatives()); 
            }
            // InternalEclParser.g:761:3: ( rule__SubAttributeSet__Alternatives )
            // InternalEclParser.g:761:4: rule__SubAttributeSet__Alternatives
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
    // InternalEclParser.g:770:1: entryRuleNestedAttributeSet : ruleNestedAttributeSet EOF ;
    public final void entryRuleNestedAttributeSet() throws RecognitionException {
        try {
            // InternalEclParser.g:771:1: ( ruleNestedAttributeSet EOF )
            // InternalEclParser.g:772:1: ruleNestedAttributeSet EOF
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
    // InternalEclParser.g:779:1: ruleNestedAttributeSet : ( ( rule__NestedAttributeSet__Group__0 ) ) ;
    public final void ruleNestedAttributeSet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:783:2: ( ( ( rule__NestedAttributeSet__Group__0 ) ) )
            // InternalEclParser.g:784:2: ( ( rule__NestedAttributeSet__Group__0 ) )
            {
            // InternalEclParser.g:784:2: ( ( rule__NestedAttributeSet__Group__0 ) )
            // InternalEclParser.g:785:3: ( rule__NestedAttributeSet__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getGroup()); 
            }
            // InternalEclParser.g:786:3: ( rule__NestedAttributeSet__Group__0 )
            // InternalEclParser.g:786:4: rule__NestedAttributeSet__Group__0
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
    // InternalEclParser.g:795:1: entryRuleAttributeConstraint : ruleAttributeConstraint EOF ;
    public final void entryRuleAttributeConstraint() throws RecognitionException {
        try {
            // InternalEclParser.g:796:1: ( ruleAttributeConstraint EOF )
            // InternalEclParser.g:797:1: ruleAttributeConstraint EOF
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
    // InternalEclParser.g:804:1: ruleAttributeConstraint : ( ( rule__AttributeConstraint__Group__0 ) ) ;
    public final void ruleAttributeConstraint() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:808:2: ( ( ( rule__AttributeConstraint__Group__0 ) ) )
            // InternalEclParser.g:809:2: ( ( rule__AttributeConstraint__Group__0 ) )
            {
            // InternalEclParser.g:809:2: ( ( rule__AttributeConstraint__Group__0 ) )
            // InternalEclParser.g:810:3: ( rule__AttributeConstraint__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getGroup()); 
            }
            // InternalEclParser.g:811:3: ( rule__AttributeConstraint__Group__0 )
            // InternalEclParser.g:811:4: rule__AttributeConstraint__Group__0
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
    // InternalEclParser.g:820:1: entryRuleCardinality : ruleCardinality EOF ;
    public final void entryRuleCardinality() throws RecognitionException {
        try {
            // InternalEclParser.g:821:1: ( ruleCardinality EOF )
            // InternalEclParser.g:822:1: ruleCardinality EOF
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
    // InternalEclParser.g:829:1: ruleCardinality : ( ( rule__Cardinality__Group__0 ) ) ;
    public final void ruleCardinality() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:833:2: ( ( ( rule__Cardinality__Group__0 ) ) )
            // InternalEclParser.g:834:2: ( ( rule__Cardinality__Group__0 ) )
            {
            // InternalEclParser.g:834:2: ( ( rule__Cardinality__Group__0 ) )
            // InternalEclParser.g:835:3: ( rule__Cardinality__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getGroup()); 
            }
            // InternalEclParser.g:836:3: ( rule__Cardinality__Group__0 )
            // InternalEclParser.g:836:4: rule__Cardinality__Group__0
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
    // InternalEclParser.g:845:1: entryRuleComparison : ruleComparison EOF ;
    public final void entryRuleComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:846:1: ( ruleComparison EOF )
            // InternalEclParser.g:847:1: ruleComparison EOF
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
    // InternalEclParser.g:854:1: ruleComparison : ( ( rule__Comparison__Alternatives ) ) ;
    public final void ruleComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:858:2: ( ( ( rule__Comparison__Alternatives ) ) )
            // InternalEclParser.g:859:2: ( ( rule__Comparison__Alternatives ) )
            {
            // InternalEclParser.g:859:2: ( ( rule__Comparison__Alternatives ) )
            // InternalEclParser.g:860:3: ( rule__Comparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:861:3: ( rule__Comparison__Alternatives )
            // InternalEclParser.g:861:4: rule__Comparison__Alternatives
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
    // InternalEclParser.g:870:1: entryRuleAttributeComparison : ruleAttributeComparison EOF ;
    public final void entryRuleAttributeComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:871:1: ( ruleAttributeComparison EOF )
            // InternalEclParser.g:872:1: ruleAttributeComparison EOF
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
    // InternalEclParser.g:879:1: ruleAttributeComparison : ( ( rule__AttributeComparison__Alternatives ) ) ;
    public final void ruleAttributeComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:883:2: ( ( ( rule__AttributeComparison__Alternatives ) ) )
            // InternalEclParser.g:884:2: ( ( rule__AttributeComparison__Alternatives ) )
            {
            // InternalEclParser.g:884:2: ( ( rule__AttributeComparison__Alternatives ) )
            // InternalEclParser.g:885:3: ( rule__AttributeComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:886:3: ( rule__AttributeComparison__Alternatives )
            // InternalEclParser.g:886:4: rule__AttributeComparison__Alternatives
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
    // InternalEclParser.g:895:1: entryRuleDataTypeComparison : ruleDataTypeComparison EOF ;
    public final void entryRuleDataTypeComparison() throws RecognitionException {
        try {
            // InternalEclParser.g:896:1: ( ruleDataTypeComparison EOF )
            // InternalEclParser.g:897:1: ruleDataTypeComparison EOF
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
    // InternalEclParser.g:904:1: ruleDataTypeComparison : ( ( rule__DataTypeComparison__Alternatives ) ) ;
    public final void ruleDataTypeComparison() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:908:2: ( ( ( rule__DataTypeComparison__Alternatives ) ) )
            // InternalEclParser.g:909:2: ( ( rule__DataTypeComparison__Alternatives ) )
            {
            // InternalEclParser.g:909:2: ( ( rule__DataTypeComparison__Alternatives ) )
            // InternalEclParser.g:910:3: ( rule__DataTypeComparison__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDataTypeComparisonAccess().getAlternatives()); 
            }
            // InternalEclParser.g:911:3: ( rule__DataTypeComparison__Alternatives )
            // InternalEclParser.g:911:4: rule__DataTypeComparison__Alternatives
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
    // InternalEclParser.g:920:1: entryRuleAttributeValueEquals : ruleAttributeValueEquals EOF ;
    public final void entryRuleAttributeValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:921:1: ( ruleAttributeValueEquals EOF )
            // InternalEclParser.g:922:1: ruleAttributeValueEquals EOF
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
    // InternalEclParser.g:929:1: ruleAttributeValueEquals : ( ( rule__AttributeValueEquals__Group__0 ) ) ;
    public final void ruleAttributeValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:933:2: ( ( ( rule__AttributeValueEquals__Group__0 ) ) )
            // InternalEclParser.g:934:2: ( ( rule__AttributeValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:934:2: ( ( rule__AttributeValueEquals__Group__0 ) )
            // InternalEclParser.g:935:3: ( rule__AttributeValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:936:3: ( rule__AttributeValueEquals__Group__0 )
            // InternalEclParser.g:936:4: rule__AttributeValueEquals__Group__0
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
    // InternalEclParser.g:945:1: entryRuleAttributeValueNotEquals : ruleAttributeValueNotEquals EOF ;
    public final void entryRuleAttributeValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:946:1: ( ruleAttributeValueNotEquals EOF )
            // InternalEclParser.g:947:1: ruleAttributeValueNotEquals EOF
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
    // InternalEclParser.g:954:1: ruleAttributeValueNotEquals : ( ( rule__AttributeValueNotEquals__Group__0 ) ) ;
    public final void ruleAttributeValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:958:2: ( ( ( rule__AttributeValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:959:2: ( ( rule__AttributeValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:959:2: ( ( rule__AttributeValueNotEquals__Group__0 ) )
            // InternalEclParser.g:960:3: ( rule__AttributeValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:961:3: ( rule__AttributeValueNotEquals__Group__0 )
            // InternalEclParser.g:961:4: rule__AttributeValueNotEquals__Group__0
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
    // InternalEclParser.g:970:1: entryRuleBooleanValueEquals : ruleBooleanValueEquals EOF ;
    public final void entryRuleBooleanValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:971:1: ( ruleBooleanValueEquals EOF )
            // InternalEclParser.g:972:1: ruleBooleanValueEquals EOF
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
    // InternalEclParser.g:979:1: ruleBooleanValueEquals : ( ( rule__BooleanValueEquals__Group__0 ) ) ;
    public final void ruleBooleanValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:983:2: ( ( ( rule__BooleanValueEquals__Group__0 ) ) )
            // InternalEclParser.g:984:2: ( ( rule__BooleanValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:984:2: ( ( rule__BooleanValueEquals__Group__0 ) )
            // InternalEclParser.g:985:3: ( rule__BooleanValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:986:3: ( rule__BooleanValueEquals__Group__0 )
            // InternalEclParser.g:986:4: rule__BooleanValueEquals__Group__0
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
    // InternalEclParser.g:995:1: entryRuleBooleanValueNotEquals : ruleBooleanValueNotEquals EOF ;
    public final void entryRuleBooleanValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:996:1: ( ruleBooleanValueNotEquals EOF )
            // InternalEclParser.g:997:1: ruleBooleanValueNotEquals EOF
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
    // InternalEclParser.g:1004:1: ruleBooleanValueNotEquals : ( ( rule__BooleanValueNotEquals__Group__0 ) ) ;
    public final void ruleBooleanValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1008:2: ( ( ( rule__BooleanValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1009:2: ( ( rule__BooleanValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1009:2: ( ( rule__BooleanValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1010:3: ( rule__BooleanValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1011:3: ( rule__BooleanValueNotEquals__Group__0 )
            // InternalEclParser.g:1011:4: rule__BooleanValueNotEquals__Group__0
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
    // InternalEclParser.g:1020:1: entryRuleStringValueEquals : ruleStringValueEquals EOF ;
    public final void entryRuleStringValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1021:1: ( ruleStringValueEquals EOF )
            // InternalEclParser.g:1022:1: ruleStringValueEquals EOF
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
    // InternalEclParser.g:1029:1: ruleStringValueEquals : ( ( rule__StringValueEquals__Group__0 ) ) ;
    public final void ruleStringValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1033:2: ( ( ( rule__StringValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1034:2: ( ( rule__StringValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1034:2: ( ( rule__StringValueEquals__Group__0 ) )
            // InternalEclParser.g:1035:3: ( rule__StringValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1036:3: ( rule__StringValueEquals__Group__0 )
            // InternalEclParser.g:1036:4: rule__StringValueEquals__Group__0
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
    // InternalEclParser.g:1045:1: entryRuleStringValueNotEquals : ruleStringValueNotEquals EOF ;
    public final void entryRuleStringValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1046:1: ( ruleStringValueNotEquals EOF )
            // InternalEclParser.g:1047:1: ruleStringValueNotEquals EOF
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
    // InternalEclParser.g:1054:1: ruleStringValueNotEquals : ( ( rule__StringValueNotEquals__Group__0 ) ) ;
    public final void ruleStringValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1058:2: ( ( ( rule__StringValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1059:2: ( ( rule__StringValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1059:2: ( ( rule__StringValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1060:3: ( rule__StringValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1061:3: ( rule__StringValueNotEquals__Group__0 )
            // InternalEclParser.g:1061:4: rule__StringValueNotEquals__Group__0
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
    // InternalEclParser.g:1070:1: entryRuleIntegerValueEquals : ruleIntegerValueEquals EOF ;
    public final void entryRuleIntegerValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1071:1: ( ruleIntegerValueEquals EOF )
            // InternalEclParser.g:1072:1: ruleIntegerValueEquals EOF
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
    // InternalEclParser.g:1079:1: ruleIntegerValueEquals : ( ( rule__IntegerValueEquals__Group__0 ) ) ;
    public final void ruleIntegerValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1083:2: ( ( ( rule__IntegerValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1084:2: ( ( rule__IntegerValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1084:2: ( ( rule__IntegerValueEquals__Group__0 ) )
            // InternalEclParser.g:1085:3: ( rule__IntegerValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1086:3: ( rule__IntegerValueEquals__Group__0 )
            // InternalEclParser.g:1086:4: rule__IntegerValueEquals__Group__0
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
    // InternalEclParser.g:1095:1: entryRuleIntegerValueNotEquals : ruleIntegerValueNotEquals EOF ;
    public final void entryRuleIntegerValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1096:1: ( ruleIntegerValueNotEquals EOF )
            // InternalEclParser.g:1097:1: ruleIntegerValueNotEquals EOF
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
    // InternalEclParser.g:1104:1: ruleIntegerValueNotEquals : ( ( rule__IntegerValueNotEquals__Group__0 ) ) ;
    public final void ruleIntegerValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1108:2: ( ( ( rule__IntegerValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1109:2: ( ( rule__IntegerValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1109:2: ( ( rule__IntegerValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1110:3: ( rule__IntegerValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1111:3: ( rule__IntegerValueNotEquals__Group__0 )
            // InternalEclParser.g:1111:4: rule__IntegerValueNotEquals__Group__0
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
    // InternalEclParser.g:1120:1: entryRuleIntegerValueGreaterThan : ruleIntegerValueGreaterThan EOF ;
    public final void entryRuleIntegerValueGreaterThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1121:1: ( ruleIntegerValueGreaterThan EOF )
            // InternalEclParser.g:1122:1: ruleIntegerValueGreaterThan EOF
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
    // InternalEclParser.g:1129:1: ruleIntegerValueGreaterThan : ( ( rule__IntegerValueGreaterThan__Group__0 ) ) ;
    public final void ruleIntegerValueGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1133:2: ( ( ( rule__IntegerValueGreaterThan__Group__0 ) ) )
            // InternalEclParser.g:1134:2: ( ( rule__IntegerValueGreaterThan__Group__0 ) )
            {
            // InternalEclParser.g:1134:2: ( ( rule__IntegerValueGreaterThan__Group__0 ) )
            // InternalEclParser.g:1135:3: ( rule__IntegerValueGreaterThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1136:3: ( rule__IntegerValueGreaterThan__Group__0 )
            // InternalEclParser.g:1136:4: rule__IntegerValueGreaterThan__Group__0
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
    // InternalEclParser.g:1145:1: entryRuleIntegerValueLessThan : ruleIntegerValueLessThan EOF ;
    public final void entryRuleIntegerValueLessThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1146:1: ( ruleIntegerValueLessThan EOF )
            // InternalEclParser.g:1147:1: ruleIntegerValueLessThan EOF
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
    // InternalEclParser.g:1154:1: ruleIntegerValueLessThan : ( ( rule__IntegerValueLessThan__Group__0 ) ) ;
    public final void ruleIntegerValueLessThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1158:2: ( ( ( rule__IntegerValueLessThan__Group__0 ) ) )
            // InternalEclParser.g:1159:2: ( ( rule__IntegerValueLessThan__Group__0 ) )
            {
            // InternalEclParser.g:1159:2: ( ( rule__IntegerValueLessThan__Group__0 ) )
            // InternalEclParser.g:1160:3: ( rule__IntegerValueLessThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1161:3: ( rule__IntegerValueLessThan__Group__0 )
            // InternalEclParser.g:1161:4: rule__IntegerValueLessThan__Group__0
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
    // InternalEclParser.g:1170:1: entryRuleIntegerValueGreaterThanEquals : ruleIntegerValueGreaterThanEquals EOF ;
    public final void entryRuleIntegerValueGreaterThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1171:1: ( ruleIntegerValueGreaterThanEquals EOF )
            // InternalEclParser.g:1172:1: ruleIntegerValueGreaterThanEquals EOF
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
    // InternalEclParser.g:1179:1: ruleIntegerValueGreaterThanEquals : ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) ) ;
    public final void ruleIntegerValueGreaterThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1183:2: ( ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1184:2: ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1184:2: ( ( rule__IntegerValueGreaterThanEquals__Group__0 ) )
            // InternalEclParser.g:1185:3: ( rule__IntegerValueGreaterThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1186:3: ( rule__IntegerValueGreaterThanEquals__Group__0 )
            // InternalEclParser.g:1186:4: rule__IntegerValueGreaterThanEquals__Group__0
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
    // InternalEclParser.g:1195:1: entryRuleIntegerValueLessThanEquals : ruleIntegerValueLessThanEquals EOF ;
    public final void entryRuleIntegerValueLessThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1196:1: ( ruleIntegerValueLessThanEquals EOF )
            // InternalEclParser.g:1197:1: ruleIntegerValueLessThanEquals EOF
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
    // InternalEclParser.g:1204:1: ruleIntegerValueLessThanEquals : ( ( rule__IntegerValueLessThanEquals__Group__0 ) ) ;
    public final void ruleIntegerValueLessThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1208:2: ( ( ( rule__IntegerValueLessThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1209:2: ( ( rule__IntegerValueLessThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1209:2: ( ( rule__IntegerValueLessThanEquals__Group__0 ) )
            // InternalEclParser.g:1210:3: ( rule__IntegerValueLessThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1211:3: ( rule__IntegerValueLessThanEquals__Group__0 )
            // InternalEclParser.g:1211:4: rule__IntegerValueLessThanEquals__Group__0
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
    // InternalEclParser.g:1220:1: entryRuleDecimalValueEquals : ruleDecimalValueEquals EOF ;
    public final void entryRuleDecimalValueEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1221:1: ( ruleDecimalValueEquals EOF )
            // InternalEclParser.g:1222:1: ruleDecimalValueEquals EOF
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
    // InternalEclParser.g:1229:1: ruleDecimalValueEquals : ( ( rule__DecimalValueEquals__Group__0 ) ) ;
    public final void ruleDecimalValueEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1233:2: ( ( ( rule__DecimalValueEquals__Group__0 ) ) )
            // InternalEclParser.g:1234:2: ( ( rule__DecimalValueEquals__Group__0 ) )
            {
            // InternalEclParser.g:1234:2: ( ( rule__DecimalValueEquals__Group__0 ) )
            // InternalEclParser.g:1235:3: ( rule__DecimalValueEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1236:3: ( rule__DecimalValueEquals__Group__0 )
            // InternalEclParser.g:1236:4: rule__DecimalValueEquals__Group__0
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
    // InternalEclParser.g:1245:1: entryRuleDecimalValueNotEquals : ruleDecimalValueNotEquals EOF ;
    public final void entryRuleDecimalValueNotEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1246:1: ( ruleDecimalValueNotEquals EOF )
            // InternalEclParser.g:1247:1: ruleDecimalValueNotEquals EOF
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
    // InternalEclParser.g:1254:1: ruleDecimalValueNotEquals : ( ( rule__DecimalValueNotEquals__Group__0 ) ) ;
    public final void ruleDecimalValueNotEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1258:2: ( ( ( rule__DecimalValueNotEquals__Group__0 ) ) )
            // InternalEclParser.g:1259:2: ( ( rule__DecimalValueNotEquals__Group__0 ) )
            {
            // InternalEclParser.g:1259:2: ( ( rule__DecimalValueNotEquals__Group__0 ) )
            // InternalEclParser.g:1260:3: ( rule__DecimalValueNotEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1261:3: ( rule__DecimalValueNotEquals__Group__0 )
            // InternalEclParser.g:1261:4: rule__DecimalValueNotEquals__Group__0
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
    // InternalEclParser.g:1270:1: entryRuleDecimalValueGreaterThan : ruleDecimalValueGreaterThan EOF ;
    public final void entryRuleDecimalValueGreaterThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1271:1: ( ruleDecimalValueGreaterThan EOF )
            // InternalEclParser.g:1272:1: ruleDecimalValueGreaterThan EOF
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
    // InternalEclParser.g:1279:1: ruleDecimalValueGreaterThan : ( ( rule__DecimalValueGreaterThan__Group__0 ) ) ;
    public final void ruleDecimalValueGreaterThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1283:2: ( ( ( rule__DecimalValueGreaterThan__Group__0 ) ) )
            // InternalEclParser.g:1284:2: ( ( rule__DecimalValueGreaterThan__Group__0 ) )
            {
            // InternalEclParser.g:1284:2: ( ( rule__DecimalValueGreaterThan__Group__0 ) )
            // InternalEclParser.g:1285:3: ( rule__DecimalValueGreaterThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1286:3: ( rule__DecimalValueGreaterThan__Group__0 )
            // InternalEclParser.g:1286:4: rule__DecimalValueGreaterThan__Group__0
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
    // InternalEclParser.g:1295:1: entryRuleDecimalValueLessThan : ruleDecimalValueLessThan EOF ;
    public final void entryRuleDecimalValueLessThan() throws RecognitionException {
        try {
            // InternalEclParser.g:1296:1: ( ruleDecimalValueLessThan EOF )
            // InternalEclParser.g:1297:1: ruleDecimalValueLessThan EOF
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
    // InternalEclParser.g:1304:1: ruleDecimalValueLessThan : ( ( rule__DecimalValueLessThan__Group__0 ) ) ;
    public final void ruleDecimalValueLessThan() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1308:2: ( ( ( rule__DecimalValueLessThan__Group__0 ) ) )
            // InternalEclParser.g:1309:2: ( ( rule__DecimalValueLessThan__Group__0 ) )
            {
            // InternalEclParser.g:1309:2: ( ( rule__DecimalValueLessThan__Group__0 ) )
            // InternalEclParser.g:1310:3: ( rule__DecimalValueLessThan__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getGroup()); 
            }
            // InternalEclParser.g:1311:3: ( rule__DecimalValueLessThan__Group__0 )
            // InternalEclParser.g:1311:4: rule__DecimalValueLessThan__Group__0
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
    // InternalEclParser.g:1320:1: entryRuleDecimalValueGreaterThanEquals : ruleDecimalValueGreaterThanEquals EOF ;
    public final void entryRuleDecimalValueGreaterThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1321:1: ( ruleDecimalValueGreaterThanEquals EOF )
            // InternalEclParser.g:1322:1: ruleDecimalValueGreaterThanEquals EOF
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
    // InternalEclParser.g:1329:1: ruleDecimalValueGreaterThanEquals : ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) ) ;
    public final void ruleDecimalValueGreaterThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1333:2: ( ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1334:2: ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1334:2: ( ( rule__DecimalValueGreaterThanEquals__Group__0 ) )
            // InternalEclParser.g:1335:3: ( rule__DecimalValueGreaterThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1336:3: ( rule__DecimalValueGreaterThanEquals__Group__0 )
            // InternalEclParser.g:1336:4: rule__DecimalValueGreaterThanEquals__Group__0
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
    // InternalEclParser.g:1345:1: entryRuleDecimalValueLessThanEquals : ruleDecimalValueLessThanEquals EOF ;
    public final void entryRuleDecimalValueLessThanEquals() throws RecognitionException {
        try {
            // InternalEclParser.g:1346:1: ( ruleDecimalValueLessThanEquals EOF )
            // InternalEclParser.g:1347:1: ruleDecimalValueLessThanEquals EOF
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
    // InternalEclParser.g:1354:1: ruleDecimalValueLessThanEquals : ( ( rule__DecimalValueLessThanEquals__Group__0 ) ) ;
    public final void ruleDecimalValueLessThanEquals() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1358:2: ( ( ( rule__DecimalValueLessThanEquals__Group__0 ) ) )
            // InternalEclParser.g:1359:2: ( ( rule__DecimalValueLessThanEquals__Group__0 ) )
            {
            // InternalEclParser.g:1359:2: ( ( rule__DecimalValueLessThanEquals__Group__0 ) )
            // InternalEclParser.g:1360:3: ( rule__DecimalValueLessThanEquals__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getGroup()); 
            }
            // InternalEclParser.g:1361:3: ( rule__DecimalValueLessThanEquals__Group__0 )
            // InternalEclParser.g:1361:4: rule__DecimalValueLessThanEquals__Group__0
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
    // InternalEclParser.g:1370:1: entryRuleNestedExpression : ruleNestedExpression EOF ;
    public final void entryRuleNestedExpression() throws RecognitionException {
        try {
            // InternalEclParser.g:1371:1: ( ruleNestedExpression EOF )
            // InternalEclParser.g:1372:1: ruleNestedExpression EOF
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
    // InternalEclParser.g:1379:1: ruleNestedExpression : ( ( rule__NestedExpression__Group__0 ) ) ;
    public final void ruleNestedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1383:2: ( ( ( rule__NestedExpression__Group__0 ) ) )
            // InternalEclParser.g:1384:2: ( ( rule__NestedExpression__Group__0 ) )
            {
            // InternalEclParser.g:1384:2: ( ( rule__NestedExpression__Group__0 ) )
            // InternalEclParser.g:1385:3: ( rule__NestedExpression__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getGroup()); 
            }
            // InternalEclParser.g:1386:3: ( rule__NestedExpression__Group__0 )
            // InternalEclParser.g:1386:4: rule__NestedExpression__Group__0
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
    // InternalEclParser.g:1395:1: entryRuleSnomedIdentifier : ruleSnomedIdentifier EOF ;
    public final void entryRuleSnomedIdentifier() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1399:1: ( ruleSnomedIdentifier EOF )
            // InternalEclParser.g:1400:1: ruleSnomedIdentifier EOF
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
    // InternalEclParser.g:1410:1: ruleSnomedIdentifier : ( ( rule__SnomedIdentifier__Group__0 ) ) ;
    public final void ruleSnomedIdentifier() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1415:2: ( ( ( rule__SnomedIdentifier__Group__0 ) ) )
            // InternalEclParser.g:1416:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            {
            // InternalEclParser.g:1416:2: ( ( rule__SnomedIdentifier__Group__0 ) )
            // InternalEclParser.g:1417:3: ( rule__SnomedIdentifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getGroup()); 
            }
            // InternalEclParser.g:1418:3: ( rule__SnomedIdentifier__Group__0 )
            // InternalEclParser.g:1418:4: rule__SnomedIdentifier__Group__0
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
    // InternalEclParser.g:1428:1: entryRuleNonNegativeInteger : ruleNonNegativeInteger EOF ;
    public final void entryRuleNonNegativeInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1432:1: ( ruleNonNegativeInteger EOF )
            // InternalEclParser.g:1433:1: ruleNonNegativeInteger EOF
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
    // InternalEclParser.g:1443:1: ruleNonNegativeInteger : ( ( rule__NonNegativeInteger__Alternatives ) ) ;
    public final void ruleNonNegativeInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1448:2: ( ( ( rule__NonNegativeInteger__Alternatives ) ) )
            // InternalEclParser.g:1449:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            {
            // InternalEclParser.g:1449:2: ( ( rule__NonNegativeInteger__Alternatives ) )
            // InternalEclParser.g:1450:3: ( rule__NonNegativeInteger__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1451:3: ( rule__NonNegativeInteger__Alternatives )
            // InternalEclParser.g:1451:4: rule__NonNegativeInteger__Alternatives
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
    // InternalEclParser.g:1461:1: entryRuleMaxValue : ruleMaxValue EOF ;
    public final void entryRuleMaxValue() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1465:1: ( ruleMaxValue EOF )
            // InternalEclParser.g:1466:1: ruleMaxValue EOF
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
    // InternalEclParser.g:1476:1: ruleMaxValue : ( ( rule__MaxValue__Alternatives ) ) ;
    public final void ruleMaxValue() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1481:2: ( ( ( rule__MaxValue__Alternatives ) ) )
            // InternalEclParser.g:1482:2: ( ( rule__MaxValue__Alternatives ) )
            {
            // InternalEclParser.g:1482:2: ( ( rule__MaxValue__Alternatives ) )
            // InternalEclParser.g:1483:3: ( rule__MaxValue__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMaxValueAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1484:3: ( rule__MaxValue__Alternatives )
            // InternalEclParser.g:1484:4: rule__MaxValue__Alternatives
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
    // InternalEclParser.g:1494:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1498:1: ( ruleInteger EOF )
            // InternalEclParser.g:1499:1: ruleInteger EOF
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
    // InternalEclParser.g:1509:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1514:2: ( ( ( rule__Integer__Group__0 ) ) )
            // InternalEclParser.g:1515:2: ( ( rule__Integer__Group__0 ) )
            {
            // InternalEclParser.g:1515:2: ( ( rule__Integer__Group__0 ) )
            // InternalEclParser.g:1516:3: ( rule__Integer__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getGroup()); 
            }
            // InternalEclParser.g:1517:3: ( rule__Integer__Group__0 )
            // InternalEclParser.g:1517:4: rule__Integer__Group__0
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
    // InternalEclParser.g:1527:1: entryRuleDecimal : ruleDecimal EOF ;
    public final void entryRuleDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1531:1: ( ruleDecimal EOF )
            // InternalEclParser.g:1532:1: ruleDecimal EOF
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
    // InternalEclParser.g:1542:1: ruleDecimal : ( ( rule__Decimal__Group__0 ) ) ;
    public final void ruleDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1547:2: ( ( ( rule__Decimal__Group__0 ) ) )
            // InternalEclParser.g:1548:2: ( ( rule__Decimal__Group__0 ) )
            {
            // InternalEclParser.g:1548:2: ( ( rule__Decimal__Group__0 ) )
            // InternalEclParser.g:1549:3: ( rule__Decimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getGroup()); 
            }
            // InternalEclParser.g:1550:3: ( rule__Decimal__Group__0 )
            // InternalEclParser.g:1550:4: rule__Decimal__Group__0
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
    // InternalEclParser.g:1560:1: entryRuleNonNegativeDecimal : ruleNonNegativeDecimal EOF ;
    public final void entryRuleNonNegativeDecimal() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1564:1: ( ruleNonNegativeDecimal EOF )
            // InternalEclParser.g:1565:1: ruleNonNegativeDecimal EOF
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
    // InternalEclParser.g:1575:1: ruleNonNegativeDecimal : ( ( rule__NonNegativeDecimal__Group__0 ) ) ;
    public final void ruleNonNegativeDecimal() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1580:2: ( ( ( rule__NonNegativeDecimal__Group__0 ) ) )
            // InternalEclParser.g:1581:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            {
            // InternalEclParser.g:1581:2: ( ( rule__NonNegativeDecimal__Group__0 ) )
            // InternalEclParser.g:1582:3: ( rule__NonNegativeDecimal__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getGroup()); 
            }
            // InternalEclParser.g:1583:3: ( rule__NonNegativeDecimal__Group__0 )
            // InternalEclParser.g:1583:4: rule__NonNegativeDecimal__Group__0
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
    // InternalEclParser.g:1593:1: entryRuleBoolean : ruleBoolean EOF ;
    public final void entryRuleBoolean() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalEclParser.g:1597:1: ( ruleBoolean EOF )
            // InternalEclParser.g:1598:1: ruleBoolean EOF
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
    // InternalEclParser.g:1608:1: ruleBoolean : ( ( rule__Boolean__Alternatives ) ) ;
    public final void ruleBoolean() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1613:2: ( ( ( rule__Boolean__Alternatives ) ) )
            // InternalEclParser.g:1614:2: ( ( rule__Boolean__Alternatives ) )
            {
            // InternalEclParser.g:1614:2: ( ( rule__Boolean__Alternatives ) )
            // InternalEclParser.g:1615:3: ( rule__Boolean__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanAccess().getAlternatives()); 
            }
            // InternalEclParser.g:1616:3: ( rule__Boolean__Alternatives )
            // InternalEclParser.g:1616:4: rule__Boolean__Alternatives
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
    // InternalEclParser.g:1625:1: rule__AndExpressionConstraint__Alternatives_1_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndExpressionConstraint__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1629:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
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
                    // InternalEclParser.g:1630:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1630:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1631:3: RULE_CONJUNCTION
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
                    // InternalEclParser.g:1636:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1636:2: ( RULE_COMMA )
                    // InternalEclParser.g:1637:3: RULE_COMMA
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
    // InternalEclParser.g:1646:1: rule__SubExpressionConstraint__Alternatives : ( ( ruleChildOf ) | ( ruleDescendantOf ) | ( ruleDescendantOrSelfOf ) | ( ruleParentOf ) | ( ruleAncestorOf ) | ( ruleAncestorOrSelfOf ) | ( ruleEclFocusConcept ) );
    public final void rule__SubExpressionConstraint__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1650:1: ( ( ruleChildOf ) | ( ruleDescendantOf ) | ( ruleDescendantOrSelfOf ) | ( ruleParentOf ) | ( ruleAncestorOf ) | ( ruleAncestorOrSelfOf ) | ( ruleEclFocusConcept ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case RULE_LT_EM:
                {
                alt2=1;
                }
                break;
            case RULE_LT:
                {
                alt2=2;
                }
                break;
            case RULE_DBL_LT:
                {
                alt2=3;
                }
                break;
            case RULE_GT_EM:
                {
                alt2=4;
                }
                break;
            case RULE_GT:
                {
                alt2=5;
                }
                break;
            case RULE_DBL_GT:
                {
                alt2=6;
                }
                break;
            case RULE_DIGIT_NONZERO:
            case RULE_ROUND_OPEN:
            case RULE_CARET:
            case RULE_WILDCARD:
                {
                alt2=7;
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
                    // InternalEclParser.g:1651:2: ( ruleChildOf )
                    {
                    // InternalEclParser.g:1651:2: ( ruleChildOf )
                    // InternalEclParser.g:1652:3: ruleChildOf
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
                    // InternalEclParser.g:1657:2: ( ruleDescendantOf )
                    {
                    // InternalEclParser.g:1657:2: ( ruleDescendantOf )
                    // InternalEclParser.g:1658:3: ruleDescendantOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_1()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDescendantOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOfParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEclParser.g:1663:2: ( ruleDescendantOrSelfOf )
                    {
                    // InternalEclParser.g:1663:2: ( ruleDescendantOrSelfOf )
                    // InternalEclParser.g:1664:3: ruleDescendantOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_2()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleDescendantOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getDescendantOrSelfOfParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEclParser.g:1669:2: ( ruleParentOf )
                    {
                    // InternalEclParser.g:1669:2: ( ruleParentOf )
                    // InternalEclParser.g:1670:3: ruleParentOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_3()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleParentOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getParentOfParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEclParser.g:1675:2: ( ruleAncestorOf )
                    {
                    // InternalEclParser.g:1675:2: ( ruleAncestorOf )
                    // InternalEclParser.g:1676:3: ruleAncestorOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_4()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAncestorOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOfParserRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEclParser.g:1681:2: ( ruleAncestorOrSelfOf )
                    {
                    // InternalEclParser.g:1681:2: ( ruleAncestorOrSelfOf )
                    // InternalEclParser.g:1682:3: ruleAncestorOrSelfOf
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_5()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleAncestorOrSelfOf();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getAncestorOrSelfOfParserRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEclParser.g:1687:2: ( ruleEclFocusConcept )
                    {
                    // InternalEclParser.g:1687:2: ( ruleEclFocusConcept )
                    // InternalEclParser.g:1688:3: ruleEclFocusConcept
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_6()); 
                    }
                    pushFollow(FollowSets000.FOLLOW_2);
                    ruleEclFocusConcept();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getSubExpressionConstraintAccess().getEclFocusConceptParserRuleCall_6()); 
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
    // InternalEclParser.g:1697:1: rule__EclFocusConcept__Alternatives : ( ( ruleMemberOf ) | ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) );
    public final void rule__EclFocusConcept__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1701:1: ( ( ruleMemberOf ) | ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) )
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
                    // InternalEclParser.g:1702:2: ( ruleMemberOf )
                    {
                    // InternalEclParser.g:1702:2: ( ruleMemberOf )
                    // InternalEclParser.g:1703:3: ruleMemberOf
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
                    // InternalEclParser.g:1708:2: ( ruleEclConceptReference )
                    {
                    // InternalEclParser.g:1708:2: ( ruleEclConceptReference )
                    // InternalEclParser.g:1709:3: ruleEclConceptReference
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
                    // InternalEclParser.g:1714:2: ( ruleAny )
                    {
                    // InternalEclParser.g:1714:2: ( ruleAny )
                    // InternalEclParser.g:1715:3: ruleAny
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
                    // InternalEclParser.g:1720:2: ( ruleNestedExpression )
                    {
                    // InternalEclParser.g:1720:2: ( ruleNestedExpression )
                    // InternalEclParser.g:1721:3: ruleNestedExpression
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
    // InternalEclParser.g:1730:1: rule__MemberOf__ConstraintAlternatives_1_0 : ( ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) );
    public final void rule__MemberOf__ConstraintAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1734:1: ( ( ruleEclConceptReference ) | ( ruleAny ) | ( ruleNestedExpression ) )
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
                    // InternalEclParser.g:1735:2: ( ruleEclConceptReference )
                    {
                    // InternalEclParser.g:1735:2: ( ruleEclConceptReference )
                    // InternalEclParser.g:1736:3: ruleEclConceptReference
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
                    // InternalEclParser.g:1741:2: ( ruleAny )
                    {
                    // InternalEclParser.g:1741:2: ( ruleAny )
                    // InternalEclParser.g:1742:3: ruleAny
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
                    // InternalEclParser.g:1747:2: ( ruleNestedExpression )
                    {
                    // InternalEclParser.g:1747:2: ( ruleNestedExpression )
                    // InternalEclParser.g:1748:3: ruleNestedExpression
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
    // InternalEclParser.g:1757:1: rule__AndRefinement__Alternatives_1_0_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndRefinement__Alternatives_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1761:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
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
                    // InternalEclParser.g:1762:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1762:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1763:3: RULE_CONJUNCTION
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
                    // InternalEclParser.g:1768:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1768:2: ( RULE_COMMA )
                    // InternalEclParser.g:1769:3: RULE_COMMA
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
    // InternalEclParser.g:1778:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) );
    public final void rule__SubRefinement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1782:1: ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) )
            int alt6=3;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEclParser.g:1783:2: ( ruleAttributeConstraint )
                    {
                    // InternalEclParser.g:1783:2: ( ruleAttributeConstraint )
                    // InternalEclParser.g:1784:3: ruleAttributeConstraint
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
                    // InternalEclParser.g:1789:2: ( ruleEclAttributeGroup )
                    {
                    // InternalEclParser.g:1789:2: ( ruleEclAttributeGroup )
                    // InternalEclParser.g:1790:3: ruleEclAttributeGroup
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
                    // InternalEclParser.g:1795:2: ( ruleNestedRefinement )
                    {
                    // InternalEclParser.g:1795:2: ( ruleNestedRefinement )
                    // InternalEclParser.g:1796:3: ruleNestedRefinement
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
    // InternalEclParser.g:1805:1: rule__AndAttributeSet__Alternatives_1_1 : ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) );
    public final void rule__AndAttributeSet__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1809:1: ( ( RULE_CONJUNCTION ) | ( RULE_COMMA ) )
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
                    // InternalEclParser.g:1810:2: ( RULE_CONJUNCTION )
                    {
                    // InternalEclParser.g:1810:2: ( RULE_CONJUNCTION )
                    // InternalEclParser.g:1811:3: RULE_CONJUNCTION
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
                    // InternalEclParser.g:1816:2: ( RULE_COMMA )
                    {
                    // InternalEclParser.g:1816:2: ( RULE_COMMA )
                    // InternalEclParser.g:1817:3: RULE_COMMA
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
    // InternalEclParser.g:1826:1: rule__SubAttributeSet__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) );
    public final void rule__SubAttributeSet__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1830:1: ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEclParser.g:1831:2: ( ruleAttributeConstraint )
                    {
                    // InternalEclParser.g:1831:2: ( ruleAttributeConstraint )
                    // InternalEclParser.g:1832:3: ruleAttributeConstraint
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
                    // InternalEclParser.g:1837:2: ( ruleNestedAttributeSet )
                    {
                    // InternalEclParser.g:1837:2: ( ruleNestedAttributeSet )
                    // InternalEclParser.g:1838:3: ruleNestedAttributeSet
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
    // InternalEclParser.g:1847:1: rule__Comparison__Alternatives : ( ( ruleAttributeComparison ) | ( ruleDataTypeComparison ) );
    public final void rule__Comparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1851:1: ( ( ruleAttributeComparison ) | ( ruleDataTypeComparison ) )
            int alt9=2;
            switch ( input.LA(1) ) {
            case RULE_EQUAL:
                {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>=False && LA9_1<=True)||LA9_1==RULE_HASH||LA9_1==RULE_STRING) ) {
                    alt9=2;
                }
                else if ( (LA9_1==RULE_DIGIT_NONZERO||LA9_1==RULE_ROUND_OPEN||LA9_1==RULE_CARET||LA9_1==RULE_WILDCARD||(LA9_1>=RULE_LT && LA9_1<=RULE_GT_EM)) ) {
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
                else if ( (LA9_2==RULE_DIGIT_NONZERO||LA9_2==RULE_ROUND_OPEN||LA9_2==RULE_CARET||LA9_2==RULE_WILDCARD||(LA9_2>=RULE_LT && LA9_2<=RULE_GT_EM)) ) {
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
                    // InternalEclParser.g:1852:2: ( ruleAttributeComparison )
                    {
                    // InternalEclParser.g:1852:2: ( ruleAttributeComparison )
                    // InternalEclParser.g:1853:3: ruleAttributeComparison
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
                    // InternalEclParser.g:1858:2: ( ruleDataTypeComparison )
                    {
                    // InternalEclParser.g:1858:2: ( ruleDataTypeComparison )
                    // InternalEclParser.g:1859:3: ruleDataTypeComparison
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
    // InternalEclParser.g:1868:1: rule__AttributeComparison__Alternatives : ( ( ruleAttributeValueEquals ) | ( ruleAttributeValueNotEquals ) );
    public final void rule__AttributeComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1872:1: ( ( ruleAttributeValueEquals ) | ( ruleAttributeValueNotEquals ) )
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
                    // InternalEclParser.g:1873:2: ( ruleAttributeValueEquals )
                    {
                    // InternalEclParser.g:1873:2: ( ruleAttributeValueEquals )
                    // InternalEclParser.g:1874:3: ruleAttributeValueEquals
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
                    // InternalEclParser.g:1879:2: ( ruleAttributeValueNotEquals )
                    {
                    // InternalEclParser.g:1879:2: ( ruleAttributeValueNotEquals )
                    // InternalEclParser.g:1880:3: ruleAttributeValueNotEquals
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
    // InternalEclParser.g:1889:1: rule__DataTypeComparison__Alternatives : ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) );
    public final void rule__DataTypeComparison__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1893:1: ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) )
            int alt11=16;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEclParser.g:1894:2: ( ruleBooleanValueEquals )
                    {
                    // InternalEclParser.g:1894:2: ( ruleBooleanValueEquals )
                    // InternalEclParser.g:1895:3: ruleBooleanValueEquals
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
                    // InternalEclParser.g:1900:2: ( ruleBooleanValueNotEquals )
                    {
                    // InternalEclParser.g:1900:2: ( ruleBooleanValueNotEquals )
                    // InternalEclParser.g:1901:3: ruleBooleanValueNotEquals
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
                    // InternalEclParser.g:1906:2: ( ruleStringValueEquals )
                    {
                    // InternalEclParser.g:1906:2: ( ruleStringValueEquals )
                    // InternalEclParser.g:1907:3: ruleStringValueEquals
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
                    // InternalEclParser.g:1912:2: ( ruleStringValueNotEquals )
                    {
                    // InternalEclParser.g:1912:2: ( ruleStringValueNotEquals )
                    // InternalEclParser.g:1913:3: ruleStringValueNotEquals
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
                    // InternalEclParser.g:1918:2: ( ruleIntegerValueEquals )
                    {
                    // InternalEclParser.g:1918:2: ( ruleIntegerValueEquals )
                    // InternalEclParser.g:1919:3: ruleIntegerValueEquals
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
                    // InternalEclParser.g:1924:2: ( ruleIntegerValueNotEquals )
                    {
                    // InternalEclParser.g:1924:2: ( ruleIntegerValueNotEquals )
                    // InternalEclParser.g:1925:3: ruleIntegerValueNotEquals
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
                    // InternalEclParser.g:1930:2: ( ruleIntegerValueGreaterThan )
                    {
                    // InternalEclParser.g:1930:2: ( ruleIntegerValueGreaterThan )
                    // InternalEclParser.g:1931:3: ruleIntegerValueGreaterThan
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
                    // InternalEclParser.g:1936:2: ( ruleIntegerValueGreaterThanEquals )
                    {
                    // InternalEclParser.g:1936:2: ( ruleIntegerValueGreaterThanEquals )
                    // InternalEclParser.g:1937:3: ruleIntegerValueGreaterThanEquals
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
                    // InternalEclParser.g:1942:2: ( ruleIntegerValueLessThan )
                    {
                    // InternalEclParser.g:1942:2: ( ruleIntegerValueLessThan )
                    // InternalEclParser.g:1943:3: ruleIntegerValueLessThan
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
                    // InternalEclParser.g:1948:2: ( ruleIntegerValueLessThanEquals )
                    {
                    // InternalEclParser.g:1948:2: ( ruleIntegerValueLessThanEquals )
                    // InternalEclParser.g:1949:3: ruleIntegerValueLessThanEquals
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
                    // InternalEclParser.g:1954:2: ( ruleDecimalValueEquals )
                    {
                    // InternalEclParser.g:1954:2: ( ruleDecimalValueEquals )
                    // InternalEclParser.g:1955:3: ruleDecimalValueEquals
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
                    // InternalEclParser.g:1960:2: ( ruleDecimalValueNotEquals )
                    {
                    // InternalEclParser.g:1960:2: ( ruleDecimalValueNotEquals )
                    // InternalEclParser.g:1961:3: ruleDecimalValueNotEquals
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
                    // InternalEclParser.g:1966:2: ( ruleDecimalValueGreaterThan )
                    {
                    // InternalEclParser.g:1966:2: ( ruleDecimalValueGreaterThan )
                    // InternalEclParser.g:1967:3: ruleDecimalValueGreaterThan
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
                    // InternalEclParser.g:1972:2: ( ruleDecimalValueGreaterThanEquals )
                    {
                    // InternalEclParser.g:1972:2: ( ruleDecimalValueGreaterThanEquals )
                    // InternalEclParser.g:1973:3: ruleDecimalValueGreaterThanEquals
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
                    // InternalEclParser.g:1978:2: ( ruleDecimalValueLessThan )
                    {
                    // InternalEclParser.g:1978:2: ( ruleDecimalValueLessThan )
                    // InternalEclParser.g:1979:3: ruleDecimalValueLessThan
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
                    // InternalEclParser.g:1984:2: ( ruleDecimalValueLessThanEquals )
                    {
                    // InternalEclParser.g:1984:2: ( ruleDecimalValueLessThanEquals )
                    // InternalEclParser.g:1985:3: ruleDecimalValueLessThanEquals
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
    // InternalEclParser.g:1994:1: rule__SnomedIdentifier__Alternatives_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:1998:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:1999:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:1999:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2000:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2005:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2005:2: ( RULE_ZERO )
                    // InternalEclParser.g:2006:3: RULE_ZERO
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
    // InternalEclParser.g:2015:1: rule__SnomedIdentifier__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2019:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2020:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2020:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2021:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2026:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2026:2: ( RULE_ZERO )
                    // InternalEclParser.g:2027:3: RULE_ZERO
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
    // InternalEclParser.g:2036:1: rule__SnomedIdentifier__Alternatives_3 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2040:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2041:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2041:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2042:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2047:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2047:2: ( RULE_ZERO )
                    // InternalEclParser.g:2048:3: RULE_ZERO
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
    // InternalEclParser.g:2057:1: rule__SnomedIdentifier__Alternatives_4 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2061:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2062:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2062:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2063:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2068:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2068:2: ( RULE_ZERO )
                    // InternalEclParser.g:2069:3: RULE_ZERO
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
    // InternalEclParser.g:2078:1: rule__SnomedIdentifier__Alternatives_5 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__SnomedIdentifier__Alternatives_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2082:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2083:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2083:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2084:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2089:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2089:2: ( RULE_ZERO )
                    // InternalEclParser.g:2090:3: RULE_ZERO
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
    // InternalEclParser.g:2099:1: rule__NonNegativeInteger__Alternatives : ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) );
    public final void rule__NonNegativeInteger__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2103:1: ( ( RULE_ZERO ) | ( ( rule__NonNegativeInteger__Group_1__0 ) ) )
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
                    // InternalEclParser.g:2104:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2104:2: ( RULE_ZERO )
                    // InternalEclParser.g:2105:3: RULE_ZERO
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
                    // InternalEclParser.g:2110:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    {
                    // InternalEclParser.g:2110:2: ( ( rule__NonNegativeInteger__Group_1__0 ) )
                    // InternalEclParser.g:2111:3: ( rule__NonNegativeInteger__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getNonNegativeIntegerAccess().getGroup_1()); 
                    }
                    // InternalEclParser.g:2112:3: ( rule__NonNegativeInteger__Group_1__0 )
                    // InternalEclParser.g:2112:4: rule__NonNegativeInteger__Group_1__0
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
    // InternalEclParser.g:2120:1: rule__NonNegativeInteger__Alternatives_1_1 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeInteger__Alternatives_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2124:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2125:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2125:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2126:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2131:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2131:2: ( RULE_ZERO )
                    // InternalEclParser.g:2132:3: RULE_ZERO
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
    // InternalEclParser.g:2141:1: rule__MaxValue__Alternatives : ( ( ruleNonNegativeInteger ) | ( RULE_WILDCARD ) );
    public final void rule__MaxValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2145:1: ( ( ruleNonNegativeInteger ) | ( RULE_WILDCARD ) )
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
                    // InternalEclParser.g:2146:2: ( ruleNonNegativeInteger )
                    {
                    // InternalEclParser.g:2146:2: ( ruleNonNegativeInteger )
                    // InternalEclParser.g:2147:3: ruleNonNegativeInteger
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
                    // InternalEclParser.g:2152:2: ( RULE_WILDCARD )
                    {
                    // InternalEclParser.g:2152:2: ( RULE_WILDCARD )
                    // InternalEclParser.g:2153:3: RULE_WILDCARD
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
    // InternalEclParser.g:2162:1: rule__Integer__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Integer__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2166:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
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
                    // InternalEclParser.g:2167:2: ( RULE_PLUS )
                    {
                    // InternalEclParser.g:2167:2: ( RULE_PLUS )
                    // InternalEclParser.g:2168:3: RULE_PLUS
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
                    // InternalEclParser.g:2173:2: ( RULE_DASH )
                    {
                    // InternalEclParser.g:2173:2: ( RULE_DASH )
                    // InternalEclParser.g:2174:3: RULE_DASH
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
    // InternalEclParser.g:2183:1: rule__Decimal__Alternatives_0 : ( ( RULE_PLUS ) | ( RULE_DASH ) );
    public final void rule__Decimal__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2187:1: ( ( RULE_PLUS ) | ( RULE_DASH ) )
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
                    // InternalEclParser.g:2188:2: ( RULE_PLUS )
                    {
                    // InternalEclParser.g:2188:2: ( RULE_PLUS )
                    // InternalEclParser.g:2189:3: RULE_PLUS
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
                    // InternalEclParser.g:2194:2: ( RULE_DASH )
                    {
                    // InternalEclParser.g:2194:2: ( RULE_DASH )
                    // InternalEclParser.g:2195:3: RULE_DASH
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
    // InternalEclParser.g:2204:1: rule__NonNegativeDecimal__Alternatives_2 : ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) );
    public final void rule__NonNegativeDecimal__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2208:1: ( ( RULE_DIGIT_NONZERO ) | ( RULE_ZERO ) )
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
                    // InternalEclParser.g:2209:2: ( RULE_DIGIT_NONZERO )
                    {
                    // InternalEclParser.g:2209:2: ( RULE_DIGIT_NONZERO )
                    // InternalEclParser.g:2210:3: RULE_DIGIT_NONZERO
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
                    // InternalEclParser.g:2215:2: ( RULE_ZERO )
                    {
                    // InternalEclParser.g:2215:2: ( RULE_ZERO )
                    // InternalEclParser.g:2216:3: RULE_ZERO
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
    // InternalEclParser.g:2225:1: rule__Boolean__Alternatives : ( ( True ) | ( False ) );
    public final void rule__Boolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2229:1: ( ( True ) | ( False ) )
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
                    // InternalEclParser.g:2230:2: ( True )
                    {
                    // InternalEclParser.g:2230:2: ( True )
                    // InternalEclParser.g:2231:3: True
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
                    // InternalEclParser.g:2236:2: ( False )
                    {
                    // InternalEclParser.g:2236:2: ( False )
                    // InternalEclParser.g:2237:3: False
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
    // InternalEclParser.g:2246:1: rule__Script__Group__0 : rule__Script__Group__0__Impl rule__Script__Group__1 ;
    public final void rule__Script__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2250:1: ( rule__Script__Group__0__Impl rule__Script__Group__1 )
            // InternalEclParser.g:2251:2: rule__Script__Group__0__Impl rule__Script__Group__1
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
    // InternalEclParser.g:2258:1: rule__Script__Group__0__Impl : ( () ) ;
    public final void rule__Script__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2262:1: ( ( () ) )
            // InternalEclParser.g:2263:1: ( () )
            {
            // InternalEclParser.g:2263:1: ( () )
            // InternalEclParser.g:2264:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getScriptAction_0()); 
            }
            // InternalEclParser.g:2265:2: ()
            // InternalEclParser.g:2265:3: 
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
    // InternalEclParser.g:2273:1: rule__Script__Group__1 : rule__Script__Group__1__Impl ;
    public final void rule__Script__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2277:1: ( rule__Script__Group__1__Impl )
            // InternalEclParser.g:2278:2: rule__Script__Group__1__Impl
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
    // InternalEclParser.g:2284:1: rule__Script__Group__1__Impl : ( ( rule__Script__ConstraintAssignment_1 )? ) ;
    public final void rule__Script__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2288:1: ( ( ( rule__Script__ConstraintAssignment_1 )? ) )
            // InternalEclParser.g:2289:1: ( ( rule__Script__ConstraintAssignment_1 )? )
            {
            // InternalEclParser.g:2289:1: ( ( rule__Script__ConstraintAssignment_1 )? )
            // InternalEclParser.g:2290:2: ( rule__Script__ConstraintAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getScriptAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:2291:2: ( rule__Script__ConstraintAssignment_1 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_DIGIT_NONZERO||LA24_0==RULE_ROUND_OPEN||LA24_0==RULE_CARET||LA24_0==RULE_WILDCARD||(LA24_0>=RULE_LT && LA24_0<=RULE_GT_EM)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEclParser.g:2291:3: rule__Script__ConstraintAssignment_1
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
    // InternalEclParser.g:2300:1: rule__OrExpressionConstraint__Group__0 : rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1 ;
    public final void rule__OrExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2304:1: ( rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1 )
            // InternalEclParser.g:2305:2: rule__OrExpressionConstraint__Group__0__Impl rule__OrExpressionConstraint__Group__1
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
    // InternalEclParser.g:2312:1: rule__OrExpressionConstraint__Group__0__Impl : ( ruleAndExpressionConstraint ) ;
    public final void rule__OrExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2316:1: ( ( ruleAndExpressionConstraint ) )
            // InternalEclParser.g:2317:1: ( ruleAndExpressionConstraint )
            {
            // InternalEclParser.g:2317:1: ( ruleAndExpressionConstraint )
            // InternalEclParser.g:2318:2: ruleAndExpressionConstraint
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
    // InternalEclParser.g:2327:1: rule__OrExpressionConstraint__Group__1 : rule__OrExpressionConstraint__Group__1__Impl ;
    public final void rule__OrExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2331:1: ( rule__OrExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2332:2: rule__OrExpressionConstraint__Group__1__Impl
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
    // InternalEclParser.g:2338:1: rule__OrExpressionConstraint__Group__1__Impl : ( ( rule__OrExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__OrExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2342:1: ( ( ( rule__OrExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2343:1: ( ( rule__OrExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2343:1: ( ( rule__OrExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2344:2: ( rule__OrExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2345:2: ( rule__OrExpressionConstraint__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==RULE_DISJUNCTION) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalEclParser.g:2345:3: rule__OrExpressionConstraint__Group_1__0
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
    // InternalEclParser.g:2354:1: rule__OrExpressionConstraint__Group_1__0 : rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1 ;
    public final void rule__OrExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2358:1: ( rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2359:2: rule__OrExpressionConstraint__Group_1__0__Impl rule__OrExpressionConstraint__Group_1__1
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
    // InternalEclParser.g:2366:1: rule__OrExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__OrExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2370:1: ( ( () ) )
            // InternalEclParser.g:2371:1: ( () )
            {
            // InternalEclParser.g:2371:1: ( () )
            // InternalEclParser.g:2372:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getOrExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2373:2: ()
            // InternalEclParser.g:2373:3: 
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
    // InternalEclParser.g:2381:1: rule__OrExpressionConstraint__Group_1__1 : rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2 ;
    public final void rule__OrExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2385:1: ( rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2386:2: rule__OrExpressionConstraint__Group_1__1__Impl rule__OrExpressionConstraint__Group_1__2
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
    // InternalEclParser.g:2393:1: rule__OrExpressionConstraint__Group_1__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2397:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:2398:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:2398:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:2399:2: RULE_DISJUNCTION
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
    // InternalEclParser.g:2408:1: rule__OrExpressionConstraint__Group_1__2 : rule__OrExpressionConstraint__Group_1__2__Impl ;
    public final void rule__OrExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2412:1: ( rule__OrExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2413:2: rule__OrExpressionConstraint__Group_1__2__Impl
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
    // InternalEclParser.g:2419:1: rule__OrExpressionConstraint__Group_1__2__Impl : ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__OrExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2423:1: ( ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2424:1: ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2424:1: ( ( rule__OrExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2425:2: ( rule__OrExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2426:2: ( rule__OrExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2426:3: rule__OrExpressionConstraint__RightAssignment_1_2
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
    // InternalEclParser.g:2435:1: rule__AndExpressionConstraint__Group__0 : rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1 ;
    public final void rule__AndExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2439:1: ( rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1 )
            // InternalEclParser.g:2440:2: rule__AndExpressionConstraint__Group__0__Impl rule__AndExpressionConstraint__Group__1
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
    // InternalEclParser.g:2447:1: rule__AndExpressionConstraint__Group__0__Impl : ( ruleExclusionExpressionConstraint ) ;
    public final void rule__AndExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2451:1: ( ( ruleExclusionExpressionConstraint ) )
            // InternalEclParser.g:2452:1: ( ruleExclusionExpressionConstraint )
            {
            // InternalEclParser.g:2452:1: ( ruleExclusionExpressionConstraint )
            // InternalEclParser.g:2453:2: ruleExclusionExpressionConstraint
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
    // InternalEclParser.g:2462:1: rule__AndExpressionConstraint__Group__1 : rule__AndExpressionConstraint__Group__1__Impl ;
    public final void rule__AndExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2466:1: ( rule__AndExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2467:2: rule__AndExpressionConstraint__Group__1__Impl
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
    // InternalEclParser.g:2473:1: rule__AndExpressionConstraint__Group__1__Impl : ( ( rule__AndExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__AndExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2477:1: ( ( ( rule__AndExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2478:1: ( ( rule__AndExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2478:1: ( ( rule__AndExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2479:2: ( rule__AndExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2480:2: ( rule__AndExpressionConstraint__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=RULE_COMMA && LA26_0<=RULE_CONJUNCTION)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEclParser.g:2480:3: rule__AndExpressionConstraint__Group_1__0
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
    // InternalEclParser.g:2489:1: rule__AndExpressionConstraint__Group_1__0 : rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1 ;
    public final void rule__AndExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2493:1: ( rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2494:2: rule__AndExpressionConstraint__Group_1__0__Impl rule__AndExpressionConstraint__Group_1__1
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
    // InternalEclParser.g:2501:1: rule__AndExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__AndExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2505:1: ( ( () ) )
            // InternalEclParser.g:2506:1: ( () )
            {
            // InternalEclParser.g:2506:1: ( () )
            // InternalEclParser.g:2507:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getAndExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2508:2: ()
            // InternalEclParser.g:2508:3: 
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
    // InternalEclParser.g:2516:1: rule__AndExpressionConstraint__Group_1__1 : rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2 ;
    public final void rule__AndExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2520:1: ( rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2521:2: rule__AndExpressionConstraint__Group_1__1__Impl rule__AndExpressionConstraint__Group_1__2
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
    // InternalEclParser.g:2528:1: rule__AndExpressionConstraint__Group_1__1__Impl : ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) ) ;
    public final void rule__AndExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2532:1: ( ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) ) )
            // InternalEclParser.g:2533:1: ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) )
            {
            // InternalEclParser.g:2533:1: ( ( rule__AndExpressionConstraint__Alternatives_1_1 ) )
            // InternalEclParser.g:2534:2: ( rule__AndExpressionConstraint__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:2535:2: ( rule__AndExpressionConstraint__Alternatives_1_1 )
            // InternalEclParser.g:2535:3: rule__AndExpressionConstraint__Alternatives_1_1
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
    // InternalEclParser.g:2543:1: rule__AndExpressionConstraint__Group_1__2 : rule__AndExpressionConstraint__Group_1__2__Impl ;
    public final void rule__AndExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2547:1: ( rule__AndExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2548:2: rule__AndExpressionConstraint__Group_1__2__Impl
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
    // InternalEclParser.g:2554:1: rule__AndExpressionConstraint__Group_1__2__Impl : ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__AndExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2558:1: ( ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2559:1: ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2559:1: ( ( rule__AndExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2560:2: ( rule__AndExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2561:2: ( rule__AndExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2561:3: rule__AndExpressionConstraint__RightAssignment_1_2
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
    // InternalEclParser.g:2570:1: rule__ExclusionExpressionConstraint__Group__0 : rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 ;
    public final void rule__ExclusionExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2574:1: ( rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1 )
            // InternalEclParser.g:2575:2: rule__ExclusionExpressionConstraint__Group__0__Impl rule__ExclusionExpressionConstraint__Group__1
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
    // InternalEclParser.g:2582:1: rule__ExclusionExpressionConstraint__Group__0__Impl : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2586:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:2587:1: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:2587:1: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:2588:2: ruleRefinedExpressionConstraint
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
    // InternalEclParser.g:2597:1: rule__ExclusionExpressionConstraint__Group__1 : rule__ExclusionExpressionConstraint__Group__1__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2601:1: ( rule__ExclusionExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2602:2: rule__ExclusionExpressionConstraint__Group__1__Impl
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
    // InternalEclParser.g:2608:1: rule__ExclusionExpressionConstraint__Group__1__Impl : ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? ) ;
    public final void rule__ExclusionExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2612:1: ( ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? ) )
            // InternalEclParser.g:2613:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? )
            {
            // InternalEclParser.g:2613:1: ( ( rule__ExclusionExpressionConstraint__Group_1__0 )? )
            // InternalEclParser.g:2614:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2615:2: ( rule__ExclusionExpressionConstraint__Group_1__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==RULE_EXCLUSION) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEclParser.g:2615:3: rule__ExclusionExpressionConstraint__Group_1__0
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
    // InternalEclParser.g:2624:1: rule__ExclusionExpressionConstraint__Group_1__0 : rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2628:1: ( rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2629:2: rule__ExclusionExpressionConstraint__Group_1__0__Impl rule__ExclusionExpressionConstraint__Group_1__1
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
    // InternalEclParser.g:2636:1: rule__ExclusionExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2640:1: ( ( () ) )
            // InternalEclParser.g:2641:1: ( () )
            {
            // InternalEclParser.g:2641:1: ( () )
            // InternalEclParser.g:2642:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getExclusionExpressionConstraintLeftAction_1_0()); 
            }
            // InternalEclParser.g:2643:2: ()
            // InternalEclParser.g:2643:3: 
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
    // InternalEclParser.g:2651:1: rule__ExclusionExpressionConstraint__Group_1__1 : rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2 ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2655:1: ( rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2656:2: rule__ExclusionExpressionConstraint__Group_1__1__Impl rule__ExclusionExpressionConstraint__Group_1__2
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
    // InternalEclParser.g:2663:1: rule__ExclusionExpressionConstraint__Group_1__1__Impl : ( RULE_EXCLUSION ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2667:1: ( ( RULE_EXCLUSION ) )
            // InternalEclParser.g:2668:1: ( RULE_EXCLUSION )
            {
            // InternalEclParser.g:2668:1: ( RULE_EXCLUSION )
            // InternalEclParser.g:2669:2: RULE_EXCLUSION
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
    // InternalEclParser.g:2678:1: rule__ExclusionExpressionConstraint__Group_1__2 : rule__ExclusionExpressionConstraint__Group_1__2__Impl ;
    public final void rule__ExclusionExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2682:1: ( rule__ExclusionExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2683:2: rule__ExclusionExpressionConstraint__Group_1__2__Impl
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
    // InternalEclParser.g:2689:1: rule__ExclusionExpressionConstraint__Group_1__2__Impl : ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) ) ;
    public final void rule__ExclusionExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2693:1: ( ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:2694:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:2694:1: ( ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 ) )
            // InternalEclParser.g:2695:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getExclusionExpressionConstraintAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:2696:2: ( rule__ExclusionExpressionConstraint__RightAssignment_1_2 )
            // InternalEclParser.g:2696:3: rule__ExclusionExpressionConstraint__RightAssignment_1_2
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
    // InternalEclParser.g:2705:1: rule__RefinedExpressionConstraint__Group__0 : rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 ;
    public final void rule__RefinedExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2709:1: ( rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1 )
            // InternalEclParser.g:2710:2: rule__RefinedExpressionConstraint__Group__0__Impl rule__RefinedExpressionConstraint__Group__1
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
    // InternalEclParser.g:2717:1: rule__RefinedExpressionConstraint__Group__0__Impl : ( ruleDottedExpressionConstraint ) ;
    public final void rule__RefinedExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2721:1: ( ( ruleDottedExpressionConstraint ) )
            // InternalEclParser.g:2722:1: ( ruleDottedExpressionConstraint )
            {
            // InternalEclParser.g:2722:1: ( ruleDottedExpressionConstraint )
            // InternalEclParser.g:2723:2: ruleDottedExpressionConstraint
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
    // InternalEclParser.g:2732:1: rule__RefinedExpressionConstraint__Group__1 : rule__RefinedExpressionConstraint__Group__1__Impl ;
    public final void rule__RefinedExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2736:1: ( rule__RefinedExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2737:2: rule__RefinedExpressionConstraint__Group__1__Impl
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
    // InternalEclParser.g:2743:1: rule__RefinedExpressionConstraint__Group__1__Impl : ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) ;
    public final void rule__RefinedExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2747:1: ( ( ( rule__RefinedExpressionConstraint__Group_1__0 )? ) )
            // InternalEclParser.g:2748:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            {
            // InternalEclParser.g:2748:1: ( ( rule__RefinedExpressionConstraint__Group_1__0 )? )
            // InternalEclParser.g:2749:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2750:2: ( rule__RefinedExpressionConstraint__Group_1__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_COLON) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEclParser.g:2750:3: rule__RefinedExpressionConstraint__Group_1__0
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
    // InternalEclParser.g:2759:1: rule__RefinedExpressionConstraint__Group_1__0 : rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 ;
    public final void rule__RefinedExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2763:1: ( rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2764:2: rule__RefinedExpressionConstraint__Group_1__0__Impl rule__RefinedExpressionConstraint__Group_1__1
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
    // InternalEclParser.g:2771:1: rule__RefinedExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2775:1: ( ( () ) )
            // InternalEclParser.g:2776:1: ( () )
            {
            // InternalEclParser.g:2776:1: ( () )
            // InternalEclParser.g:2777:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinedExpressionConstraintConstraintAction_1_0()); 
            }
            // InternalEclParser.g:2778:2: ()
            // InternalEclParser.g:2778:3: 
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
    // InternalEclParser.g:2786:1: rule__RefinedExpressionConstraint__Group_1__1 : rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 ;
    public final void rule__RefinedExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2790:1: ( rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2791:2: rule__RefinedExpressionConstraint__Group_1__1__Impl rule__RefinedExpressionConstraint__Group_1__2
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
    // InternalEclParser.g:2798:1: rule__RefinedExpressionConstraint__Group_1__1__Impl : ( RULE_COLON ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2802:1: ( ( RULE_COLON ) )
            // InternalEclParser.g:2803:1: ( RULE_COLON )
            {
            // InternalEclParser.g:2803:1: ( RULE_COLON )
            // InternalEclParser.g:2804:2: RULE_COLON
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
    // InternalEclParser.g:2813:1: rule__RefinedExpressionConstraint__Group_1__2 : rule__RefinedExpressionConstraint__Group_1__2__Impl ;
    public final void rule__RefinedExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2817:1: ( rule__RefinedExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2818:2: rule__RefinedExpressionConstraint__Group_1__2__Impl
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
    // InternalEclParser.g:2824:1: rule__RefinedExpressionConstraint__Group_1__2__Impl : ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) ;
    public final void rule__RefinedExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2828:1: ( ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) ) )
            // InternalEclParser.g:2829:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            {
            // InternalEclParser.g:2829:1: ( ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 ) )
            // InternalEclParser.g:2830:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getRefinedExpressionConstraintAccess().getRefinementAssignment_1_2()); 
            }
            // InternalEclParser.g:2831:2: ( rule__RefinedExpressionConstraint__RefinementAssignment_1_2 )
            // InternalEclParser.g:2831:3: rule__RefinedExpressionConstraint__RefinementAssignment_1_2
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
    // InternalEclParser.g:2840:1: rule__DottedExpressionConstraint__Group__0 : rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1 ;
    public final void rule__DottedExpressionConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2844:1: ( rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1 )
            // InternalEclParser.g:2845:2: rule__DottedExpressionConstraint__Group__0__Impl rule__DottedExpressionConstraint__Group__1
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
    // InternalEclParser.g:2852:1: rule__DottedExpressionConstraint__Group__0__Impl : ( ruleSubExpressionConstraint ) ;
    public final void rule__DottedExpressionConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2856:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:2857:1: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:2857:1: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:2858:2: ruleSubExpressionConstraint
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
    // InternalEclParser.g:2867:1: rule__DottedExpressionConstraint__Group__1 : rule__DottedExpressionConstraint__Group__1__Impl ;
    public final void rule__DottedExpressionConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2871:1: ( rule__DottedExpressionConstraint__Group__1__Impl )
            // InternalEclParser.g:2872:2: rule__DottedExpressionConstraint__Group__1__Impl
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
    // InternalEclParser.g:2878:1: rule__DottedExpressionConstraint__Group__1__Impl : ( ( rule__DottedExpressionConstraint__Group_1__0 )* ) ;
    public final void rule__DottedExpressionConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2882:1: ( ( ( rule__DottedExpressionConstraint__Group_1__0 )* ) )
            // InternalEclParser.g:2883:1: ( ( rule__DottedExpressionConstraint__Group_1__0 )* )
            {
            // InternalEclParser.g:2883:1: ( ( rule__DottedExpressionConstraint__Group_1__0 )* )
            // InternalEclParser.g:2884:2: ( rule__DottedExpressionConstraint__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getGroup_1()); 
            }
            // InternalEclParser.g:2885:2: ( rule__DottedExpressionConstraint__Group_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==RULE_DOT) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalEclParser.g:2885:3: rule__DottedExpressionConstraint__Group_1__0
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
    // InternalEclParser.g:2894:1: rule__DottedExpressionConstraint__Group_1__0 : rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1 ;
    public final void rule__DottedExpressionConstraint__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2898:1: ( rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1 )
            // InternalEclParser.g:2899:2: rule__DottedExpressionConstraint__Group_1__0__Impl rule__DottedExpressionConstraint__Group_1__1
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
    // InternalEclParser.g:2906:1: rule__DottedExpressionConstraint__Group_1__0__Impl : ( () ) ;
    public final void rule__DottedExpressionConstraint__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2910:1: ( ( () ) )
            // InternalEclParser.g:2911:1: ( () )
            {
            // InternalEclParser.g:2911:1: ( () )
            // InternalEclParser.g:2912:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getDottedExpressionConstraintConstraintAction_1_0()); 
            }
            // InternalEclParser.g:2913:2: ()
            // InternalEclParser.g:2913:3: 
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
    // InternalEclParser.g:2921:1: rule__DottedExpressionConstraint__Group_1__1 : rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2 ;
    public final void rule__DottedExpressionConstraint__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2925:1: ( rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2 )
            // InternalEclParser.g:2926:2: rule__DottedExpressionConstraint__Group_1__1__Impl rule__DottedExpressionConstraint__Group_1__2
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
    // InternalEclParser.g:2933:1: rule__DottedExpressionConstraint__Group_1__1__Impl : ( RULE_DOT ) ;
    public final void rule__DottedExpressionConstraint__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2937:1: ( ( RULE_DOT ) )
            // InternalEclParser.g:2938:1: ( RULE_DOT )
            {
            // InternalEclParser.g:2938:1: ( RULE_DOT )
            // InternalEclParser.g:2939:2: RULE_DOT
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
    // InternalEclParser.g:2948:1: rule__DottedExpressionConstraint__Group_1__2 : rule__DottedExpressionConstraint__Group_1__2__Impl ;
    public final void rule__DottedExpressionConstraint__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2952:1: ( rule__DottedExpressionConstraint__Group_1__2__Impl )
            // InternalEclParser.g:2953:2: rule__DottedExpressionConstraint__Group_1__2__Impl
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
    // InternalEclParser.g:2959:1: rule__DottedExpressionConstraint__Group_1__2__Impl : ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) ) ;
    public final void rule__DottedExpressionConstraint__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2963:1: ( ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) ) )
            // InternalEclParser.g:2964:1: ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) )
            {
            // InternalEclParser.g:2964:1: ( ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 ) )
            // InternalEclParser.g:2965:2: ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDottedExpressionConstraintAccess().getAttributeAssignment_1_2()); 
            }
            // InternalEclParser.g:2966:2: ( rule__DottedExpressionConstraint__AttributeAssignment_1_2 )
            // InternalEclParser.g:2966:3: rule__DottedExpressionConstraint__AttributeAssignment_1_2
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
    // InternalEclParser.g:2975:1: rule__ChildOf__Group__0 : rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1 ;
    public final void rule__ChildOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2979:1: ( rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1 )
            // InternalEclParser.g:2980:2: rule__ChildOf__Group__0__Impl rule__ChildOf__Group__1
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
    // InternalEclParser.g:2987:1: rule__ChildOf__Group__0__Impl : ( RULE_LT_EM ) ;
    public final void rule__ChildOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:2991:1: ( ( RULE_LT_EM ) )
            // InternalEclParser.g:2992:1: ( RULE_LT_EM )
            {
            // InternalEclParser.g:2992:1: ( RULE_LT_EM )
            // InternalEclParser.g:2993:2: RULE_LT_EM
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
    // InternalEclParser.g:3002:1: rule__ChildOf__Group__1 : rule__ChildOf__Group__1__Impl ;
    public final void rule__ChildOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3006:1: ( rule__ChildOf__Group__1__Impl )
            // InternalEclParser.g:3007:2: rule__ChildOf__Group__1__Impl
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
    // InternalEclParser.g:3013:1: rule__ChildOf__Group__1__Impl : ( ( rule__ChildOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ChildOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3017:1: ( ( ( rule__ChildOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3018:1: ( ( rule__ChildOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3018:1: ( ( rule__ChildOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3019:2: ( rule__ChildOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getChildOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3020:2: ( rule__ChildOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3020:3: rule__ChildOf__ConstraintAssignment_1
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


    // $ANTLR start "rule__DescendantOf__Group__0"
    // InternalEclParser.g:3029:1: rule__DescendantOf__Group__0 : rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1 ;
    public final void rule__DescendantOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3033:1: ( rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1 )
            // InternalEclParser.g:3034:2: rule__DescendantOf__Group__0__Impl rule__DescendantOf__Group__1
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
    // InternalEclParser.g:3041:1: rule__DescendantOf__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__DescendantOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3045:1: ( ( RULE_LT ) )
            // InternalEclParser.g:3046:1: ( RULE_LT )
            {
            // InternalEclParser.g:3046:1: ( RULE_LT )
            // InternalEclParser.g:3047:2: RULE_LT
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
    // InternalEclParser.g:3056:1: rule__DescendantOf__Group__1 : rule__DescendantOf__Group__1__Impl ;
    public final void rule__DescendantOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3060:1: ( rule__DescendantOf__Group__1__Impl )
            // InternalEclParser.g:3061:2: rule__DescendantOf__Group__1__Impl
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
    // InternalEclParser.g:3067:1: rule__DescendantOf__Group__1__Impl : ( ( rule__DescendantOf__ConstraintAssignment_1 ) ) ;
    public final void rule__DescendantOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3071:1: ( ( ( rule__DescendantOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3072:1: ( ( rule__DescendantOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3072:1: ( ( rule__DescendantOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3073:2: ( rule__DescendantOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3074:2: ( rule__DescendantOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3074:3: rule__DescendantOf__ConstraintAssignment_1
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
    // InternalEclParser.g:3083:1: rule__DescendantOrSelfOf__Group__0 : rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1 ;
    public final void rule__DescendantOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3087:1: ( rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1 )
            // InternalEclParser.g:3088:2: rule__DescendantOrSelfOf__Group__0__Impl rule__DescendantOrSelfOf__Group__1
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
    // InternalEclParser.g:3095:1: rule__DescendantOrSelfOf__Group__0__Impl : ( RULE_DBL_LT ) ;
    public final void rule__DescendantOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3099:1: ( ( RULE_DBL_LT ) )
            // InternalEclParser.g:3100:1: ( RULE_DBL_LT )
            {
            // InternalEclParser.g:3100:1: ( RULE_DBL_LT )
            // InternalEclParser.g:3101:2: RULE_DBL_LT
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
    // InternalEclParser.g:3110:1: rule__DescendantOrSelfOf__Group__1 : rule__DescendantOrSelfOf__Group__1__Impl ;
    public final void rule__DescendantOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3114:1: ( rule__DescendantOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3115:2: rule__DescendantOrSelfOf__Group__1__Impl
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
    // InternalEclParser.g:3121:1: rule__DescendantOrSelfOf__Group__1__Impl : ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__DescendantOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3125:1: ( ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3126:1: ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3126:1: ( ( rule__DescendantOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3127:2: ( rule__DescendantOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDescendantOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3128:2: ( rule__DescendantOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3128:3: rule__DescendantOrSelfOf__ConstraintAssignment_1
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
    // InternalEclParser.g:3137:1: rule__ParentOf__Group__0 : rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1 ;
    public final void rule__ParentOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3141:1: ( rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1 )
            // InternalEclParser.g:3142:2: rule__ParentOf__Group__0__Impl rule__ParentOf__Group__1
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
    // InternalEclParser.g:3149:1: rule__ParentOf__Group__0__Impl : ( RULE_GT_EM ) ;
    public final void rule__ParentOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3153:1: ( ( RULE_GT_EM ) )
            // InternalEclParser.g:3154:1: ( RULE_GT_EM )
            {
            // InternalEclParser.g:3154:1: ( RULE_GT_EM )
            // InternalEclParser.g:3155:2: RULE_GT_EM
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
    // InternalEclParser.g:3164:1: rule__ParentOf__Group__1 : rule__ParentOf__Group__1__Impl ;
    public final void rule__ParentOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3168:1: ( rule__ParentOf__Group__1__Impl )
            // InternalEclParser.g:3169:2: rule__ParentOf__Group__1__Impl
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
    // InternalEclParser.g:3175:1: rule__ParentOf__Group__1__Impl : ( ( rule__ParentOf__ConstraintAssignment_1 ) ) ;
    public final void rule__ParentOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3179:1: ( ( ( rule__ParentOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3180:1: ( ( rule__ParentOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3180:1: ( ( rule__ParentOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3181:2: ( rule__ParentOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getParentOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3182:2: ( rule__ParentOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3182:3: rule__ParentOf__ConstraintAssignment_1
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


    // $ANTLR start "rule__AncestorOf__Group__0"
    // InternalEclParser.g:3191:1: rule__AncestorOf__Group__0 : rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1 ;
    public final void rule__AncestorOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3195:1: ( rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1 )
            // InternalEclParser.g:3196:2: rule__AncestorOf__Group__0__Impl rule__AncestorOf__Group__1
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
    // InternalEclParser.g:3203:1: rule__AncestorOf__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__AncestorOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3207:1: ( ( RULE_GT ) )
            // InternalEclParser.g:3208:1: ( RULE_GT )
            {
            // InternalEclParser.g:3208:1: ( RULE_GT )
            // InternalEclParser.g:3209:2: RULE_GT
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
    // InternalEclParser.g:3218:1: rule__AncestorOf__Group__1 : rule__AncestorOf__Group__1__Impl ;
    public final void rule__AncestorOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3222:1: ( rule__AncestorOf__Group__1__Impl )
            // InternalEclParser.g:3223:2: rule__AncestorOf__Group__1__Impl
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
    // InternalEclParser.g:3229:1: rule__AncestorOf__Group__1__Impl : ( ( rule__AncestorOf__ConstraintAssignment_1 ) ) ;
    public final void rule__AncestorOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3233:1: ( ( ( rule__AncestorOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3234:1: ( ( rule__AncestorOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3234:1: ( ( rule__AncestorOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3235:2: ( rule__AncestorOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3236:2: ( rule__AncestorOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3236:3: rule__AncestorOf__ConstraintAssignment_1
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
    // InternalEclParser.g:3245:1: rule__AncestorOrSelfOf__Group__0 : rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1 ;
    public final void rule__AncestorOrSelfOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3249:1: ( rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1 )
            // InternalEclParser.g:3250:2: rule__AncestorOrSelfOf__Group__0__Impl rule__AncestorOrSelfOf__Group__1
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
    // InternalEclParser.g:3257:1: rule__AncestorOrSelfOf__Group__0__Impl : ( RULE_DBL_GT ) ;
    public final void rule__AncestorOrSelfOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3261:1: ( ( RULE_DBL_GT ) )
            // InternalEclParser.g:3262:1: ( RULE_DBL_GT )
            {
            // InternalEclParser.g:3262:1: ( RULE_DBL_GT )
            // InternalEclParser.g:3263:2: RULE_DBL_GT
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
    // InternalEclParser.g:3272:1: rule__AncestorOrSelfOf__Group__1 : rule__AncestorOrSelfOf__Group__1__Impl ;
    public final void rule__AncestorOrSelfOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3276:1: ( rule__AncestorOrSelfOf__Group__1__Impl )
            // InternalEclParser.g:3277:2: rule__AncestorOrSelfOf__Group__1__Impl
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
    // InternalEclParser.g:3283:1: rule__AncestorOrSelfOf__Group__1__Impl : ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) ) ;
    public final void rule__AncestorOrSelfOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3287:1: ( ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3288:1: ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3288:1: ( ( rule__AncestorOrSelfOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3289:2: ( rule__AncestorOrSelfOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAncestorOrSelfOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3290:2: ( rule__AncestorOrSelfOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3290:3: rule__AncestorOrSelfOf__ConstraintAssignment_1
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
    // InternalEclParser.g:3299:1: rule__MemberOf__Group__0 : rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1 ;
    public final void rule__MemberOf__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3303:1: ( rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1 )
            // InternalEclParser.g:3304:2: rule__MemberOf__Group__0__Impl rule__MemberOf__Group__1
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
    // InternalEclParser.g:3311:1: rule__MemberOf__Group__0__Impl : ( RULE_CARET ) ;
    public final void rule__MemberOf__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3315:1: ( ( RULE_CARET ) )
            // InternalEclParser.g:3316:1: ( RULE_CARET )
            {
            // InternalEclParser.g:3316:1: ( RULE_CARET )
            // InternalEclParser.g:3317:2: RULE_CARET
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
    // InternalEclParser.g:3326:1: rule__MemberOf__Group__1 : rule__MemberOf__Group__1__Impl ;
    public final void rule__MemberOf__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3330:1: ( rule__MemberOf__Group__1__Impl )
            // InternalEclParser.g:3331:2: rule__MemberOf__Group__1__Impl
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
    // InternalEclParser.g:3337:1: rule__MemberOf__Group__1__Impl : ( ( rule__MemberOf__ConstraintAssignment_1 ) ) ;
    public final void rule__MemberOf__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3341:1: ( ( ( rule__MemberOf__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:3342:1: ( ( rule__MemberOf__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:3342:1: ( ( rule__MemberOf__ConstraintAssignment_1 ) )
            // InternalEclParser.g:3343:2: ( rule__MemberOf__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:3344:2: ( rule__MemberOf__ConstraintAssignment_1 )
            // InternalEclParser.g:3344:3: rule__MemberOf__ConstraintAssignment_1
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
    // InternalEclParser.g:3353:1: rule__EclConceptReference__Group__0 : rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1 ;
    public final void rule__EclConceptReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3357:1: ( rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1 )
            // InternalEclParser.g:3358:2: rule__EclConceptReference__Group__0__Impl rule__EclConceptReference__Group__1
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
    // InternalEclParser.g:3365:1: rule__EclConceptReference__Group__0__Impl : ( ( rule__EclConceptReference__IdAssignment_0 ) ) ;
    public final void rule__EclConceptReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3369:1: ( ( ( rule__EclConceptReference__IdAssignment_0 ) ) )
            // InternalEclParser.g:3370:1: ( ( rule__EclConceptReference__IdAssignment_0 ) )
            {
            // InternalEclParser.g:3370:1: ( ( rule__EclConceptReference__IdAssignment_0 ) )
            // InternalEclParser.g:3371:2: ( rule__EclConceptReference__IdAssignment_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getIdAssignment_0()); 
            }
            // InternalEclParser.g:3372:2: ( rule__EclConceptReference__IdAssignment_0 )
            // InternalEclParser.g:3372:3: rule__EclConceptReference__IdAssignment_0
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
    // InternalEclParser.g:3380:1: rule__EclConceptReference__Group__1 : rule__EclConceptReference__Group__1__Impl ;
    public final void rule__EclConceptReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3384:1: ( rule__EclConceptReference__Group__1__Impl )
            // InternalEclParser.g:3385:2: rule__EclConceptReference__Group__1__Impl
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
    // InternalEclParser.g:3391:1: rule__EclConceptReference__Group__1__Impl : ( ( rule__EclConceptReference__TermAssignment_1 )? ) ;
    public final void rule__EclConceptReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3395:1: ( ( ( rule__EclConceptReference__TermAssignment_1 )? ) )
            // InternalEclParser.g:3396:1: ( ( rule__EclConceptReference__TermAssignment_1 )? )
            {
            // InternalEclParser.g:3396:1: ( ( rule__EclConceptReference__TermAssignment_1 )? )
            // InternalEclParser.g:3397:2: ( rule__EclConceptReference__TermAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclConceptReferenceAccess().getTermAssignment_1()); 
            }
            // InternalEclParser.g:3398:2: ( rule__EclConceptReference__TermAssignment_1 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_TERM_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEclParser.g:3398:3: rule__EclConceptReference__TermAssignment_1
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
    // InternalEclParser.g:3407:1: rule__Any__Group__0 : rule__Any__Group__0__Impl rule__Any__Group__1 ;
    public final void rule__Any__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3411:1: ( rule__Any__Group__0__Impl rule__Any__Group__1 )
            // InternalEclParser.g:3412:2: rule__Any__Group__0__Impl rule__Any__Group__1
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
    // InternalEclParser.g:3419:1: rule__Any__Group__0__Impl : ( RULE_WILDCARD ) ;
    public final void rule__Any__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3423:1: ( ( RULE_WILDCARD ) )
            // InternalEclParser.g:3424:1: ( RULE_WILDCARD )
            {
            // InternalEclParser.g:3424:1: ( RULE_WILDCARD )
            // InternalEclParser.g:3425:2: RULE_WILDCARD
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
    // InternalEclParser.g:3434:1: rule__Any__Group__1 : rule__Any__Group__1__Impl ;
    public final void rule__Any__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3438:1: ( rule__Any__Group__1__Impl )
            // InternalEclParser.g:3439:2: rule__Any__Group__1__Impl
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
    // InternalEclParser.g:3445:1: rule__Any__Group__1__Impl : ( () ) ;
    public final void rule__Any__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3449:1: ( ( () ) )
            // InternalEclParser.g:3450:1: ( () )
            {
            // InternalEclParser.g:3450:1: ( () )
            // InternalEclParser.g:3451:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAnyAccess().getAnyAction_1()); 
            }
            // InternalEclParser.g:3452:2: ()
            // InternalEclParser.g:3452:3: 
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
    // InternalEclParser.g:3461:1: rule__OrRefinement__Group__0 : rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1 ;
    public final void rule__OrRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3465:1: ( rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1 )
            // InternalEclParser.g:3466:2: rule__OrRefinement__Group__0__Impl rule__OrRefinement__Group__1
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
    // InternalEclParser.g:3473:1: rule__OrRefinement__Group__0__Impl : ( ruleAndRefinement ) ;
    public final void rule__OrRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3477:1: ( ( ruleAndRefinement ) )
            // InternalEclParser.g:3478:1: ( ruleAndRefinement )
            {
            // InternalEclParser.g:3478:1: ( ruleAndRefinement )
            // InternalEclParser.g:3479:2: ruleAndRefinement
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
    // InternalEclParser.g:3488:1: rule__OrRefinement__Group__1 : rule__OrRefinement__Group__1__Impl ;
    public final void rule__OrRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3492:1: ( rule__OrRefinement__Group__1__Impl )
            // InternalEclParser.g:3493:2: rule__OrRefinement__Group__1__Impl
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
    // InternalEclParser.g:3499:1: rule__OrRefinement__Group__1__Impl : ( ( rule__OrRefinement__Group_1__0 )* ) ;
    public final void rule__OrRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3503:1: ( ( ( rule__OrRefinement__Group_1__0 )* ) )
            // InternalEclParser.g:3504:1: ( ( rule__OrRefinement__Group_1__0 )* )
            {
            // InternalEclParser.g:3504:1: ( ( rule__OrRefinement__Group_1__0 )* )
            // InternalEclParser.g:3505:2: ( rule__OrRefinement__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup_1()); 
            }
            // InternalEclParser.g:3506:2: ( rule__OrRefinement__Group_1__0 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==RULE_DISJUNCTION) ) {
                    int LA31_5 = input.LA(2);

                    if ( (synpred54_InternalEclParser()) ) {
                        alt31=1;
                    }


                }


                switch (alt31) {
            	case 1 :
            	    // InternalEclParser.g:3506:3: rule__OrRefinement__Group_1__0
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
    // InternalEclParser.g:3515:1: rule__OrRefinement__Group_1__0 : rule__OrRefinement__Group_1__0__Impl ;
    public final void rule__OrRefinement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3519:1: ( rule__OrRefinement__Group_1__0__Impl )
            // InternalEclParser.g:3520:2: rule__OrRefinement__Group_1__0__Impl
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
    // InternalEclParser.g:3526:1: rule__OrRefinement__Group_1__0__Impl : ( ( rule__OrRefinement__Group_1_0__0 ) ) ;
    public final void rule__OrRefinement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3530:1: ( ( ( rule__OrRefinement__Group_1_0__0 ) ) )
            // InternalEclParser.g:3531:1: ( ( rule__OrRefinement__Group_1_0__0 ) )
            {
            // InternalEclParser.g:3531:1: ( ( rule__OrRefinement__Group_1_0__0 ) )
            // InternalEclParser.g:3532:2: ( rule__OrRefinement__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:3533:2: ( rule__OrRefinement__Group_1_0__0 )
            // InternalEclParser.g:3533:3: rule__OrRefinement__Group_1_0__0
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
    // InternalEclParser.g:3542:1: rule__OrRefinement__Group_1_0__0 : rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1 ;
    public final void rule__OrRefinement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3546:1: ( rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1 )
            // InternalEclParser.g:3547:2: rule__OrRefinement__Group_1_0__0__Impl rule__OrRefinement__Group_1_0__1
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
    // InternalEclParser.g:3554:1: rule__OrRefinement__Group_1_0__0__Impl : ( () ) ;
    public final void rule__OrRefinement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3558:1: ( ( () ) )
            // InternalEclParser.g:3559:1: ( () )
            {
            // InternalEclParser.g:3559:1: ( () )
            // InternalEclParser.g:3560:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getOrRefinementLeftAction_1_0_0()); 
            }
            // InternalEclParser.g:3561:2: ()
            // InternalEclParser.g:3561:3: 
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
    // InternalEclParser.g:3569:1: rule__OrRefinement__Group_1_0__1 : rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2 ;
    public final void rule__OrRefinement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3573:1: ( rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2 )
            // InternalEclParser.g:3574:2: rule__OrRefinement__Group_1_0__1__Impl rule__OrRefinement__Group_1_0__2
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
    // InternalEclParser.g:3581:1: rule__OrRefinement__Group_1_0__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrRefinement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3585:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:3586:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:3586:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:3587:2: RULE_DISJUNCTION
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
    // InternalEclParser.g:3596:1: rule__OrRefinement__Group_1_0__2 : rule__OrRefinement__Group_1_0__2__Impl ;
    public final void rule__OrRefinement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3600:1: ( rule__OrRefinement__Group_1_0__2__Impl )
            // InternalEclParser.g:3601:2: rule__OrRefinement__Group_1_0__2__Impl
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
    // InternalEclParser.g:3607:1: rule__OrRefinement__Group_1_0__2__Impl : ( ( rule__OrRefinement__RightAssignment_1_0_2 ) ) ;
    public final void rule__OrRefinement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3611:1: ( ( ( rule__OrRefinement__RightAssignment_1_0_2 ) ) )
            // InternalEclParser.g:3612:1: ( ( rule__OrRefinement__RightAssignment_1_0_2 ) )
            {
            // InternalEclParser.g:3612:1: ( ( rule__OrRefinement__RightAssignment_1_0_2 ) )
            // InternalEclParser.g:3613:2: ( rule__OrRefinement__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrRefinementAccess().getRightAssignment_1_0_2()); 
            }
            // InternalEclParser.g:3614:2: ( rule__OrRefinement__RightAssignment_1_0_2 )
            // InternalEclParser.g:3614:3: rule__OrRefinement__RightAssignment_1_0_2
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
    // InternalEclParser.g:3623:1: rule__AndRefinement__Group__0 : rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1 ;
    public final void rule__AndRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3627:1: ( rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1 )
            // InternalEclParser.g:3628:2: rule__AndRefinement__Group__0__Impl rule__AndRefinement__Group__1
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
    // InternalEclParser.g:3635:1: rule__AndRefinement__Group__0__Impl : ( ruleSubRefinement ) ;
    public final void rule__AndRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3639:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:3640:1: ( ruleSubRefinement )
            {
            // InternalEclParser.g:3640:1: ( ruleSubRefinement )
            // InternalEclParser.g:3641:2: ruleSubRefinement
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
    // InternalEclParser.g:3650:1: rule__AndRefinement__Group__1 : rule__AndRefinement__Group__1__Impl ;
    public final void rule__AndRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3654:1: ( rule__AndRefinement__Group__1__Impl )
            // InternalEclParser.g:3655:2: rule__AndRefinement__Group__1__Impl
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
    // InternalEclParser.g:3661:1: rule__AndRefinement__Group__1__Impl : ( ( rule__AndRefinement__Group_1__0 )* ) ;
    public final void rule__AndRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3665:1: ( ( ( rule__AndRefinement__Group_1__0 )* ) )
            // InternalEclParser.g:3666:1: ( ( rule__AndRefinement__Group_1__0 )* )
            {
            // InternalEclParser.g:3666:1: ( ( rule__AndRefinement__Group_1__0 )* )
            // InternalEclParser.g:3667:2: ( rule__AndRefinement__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup_1()); 
            }
            // InternalEclParser.g:3668:2: ( rule__AndRefinement__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==RULE_CONJUNCTION) ) {
                    int LA32_4 = input.LA(2);

                    if ( (synpred55_InternalEclParser()) ) {
                        alt32=1;
                    }


                }
                else if ( (LA32_0==RULE_COMMA) ) {
                    int LA32_5 = input.LA(2);

                    if ( (synpred55_InternalEclParser()) ) {
                        alt32=1;
                    }


                }


                switch (alt32) {
            	case 1 :
            	    // InternalEclParser.g:3668:3: rule__AndRefinement__Group_1__0
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
    // InternalEclParser.g:3677:1: rule__AndRefinement__Group_1__0 : rule__AndRefinement__Group_1__0__Impl ;
    public final void rule__AndRefinement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3681:1: ( rule__AndRefinement__Group_1__0__Impl )
            // InternalEclParser.g:3682:2: rule__AndRefinement__Group_1__0__Impl
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
    // InternalEclParser.g:3688:1: rule__AndRefinement__Group_1__0__Impl : ( ( rule__AndRefinement__Group_1_0__0 ) ) ;
    public final void rule__AndRefinement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3692:1: ( ( ( rule__AndRefinement__Group_1_0__0 ) ) )
            // InternalEclParser.g:3693:1: ( ( rule__AndRefinement__Group_1_0__0 ) )
            {
            // InternalEclParser.g:3693:1: ( ( rule__AndRefinement__Group_1_0__0 ) )
            // InternalEclParser.g:3694:2: ( rule__AndRefinement__Group_1_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getGroup_1_0()); 
            }
            // InternalEclParser.g:3695:2: ( rule__AndRefinement__Group_1_0__0 )
            // InternalEclParser.g:3695:3: rule__AndRefinement__Group_1_0__0
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
    // InternalEclParser.g:3704:1: rule__AndRefinement__Group_1_0__0 : rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1 ;
    public final void rule__AndRefinement__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3708:1: ( rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1 )
            // InternalEclParser.g:3709:2: rule__AndRefinement__Group_1_0__0__Impl rule__AndRefinement__Group_1_0__1
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
    // InternalEclParser.g:3716:1: rule__AndRefinement__Group_1_0__0__Impl : ( () ) ;
    public final void rule__AndRefinement__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3720:1: ( ( () ) )
            // InternalEclParser.g:3721:1: ( () )
            {
            // InternalEclParser.g:3721:1: ( () )
            // InternalEclParser.g:3722:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getAndRefinementLeftAction_1_0_0()); 
            }
            // InternalEclParser.g:3723:2: ()
            // InternalEclParser.g:3723:3: 
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
    // InternalEclParser.g:3731:1: rule__AndRefinement__Group_1_0__1 : rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2 ;
    public final void rule__AndRefinement__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3735:1: ( rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2 )
            // InternalEclParser.g:3736:2: rule__AndRefinement__Group_1_0__1__Impl rule__AndRefinement__Group_1_0__2
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
    // InternalEclParser.g:3743:1: rule__AndRefinement__Group_1_0__1__Impl : ( ( rule__AndRefinement__Alternatives_1_0_1 ) ) ;
    public final void rule__AndRefinement__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3747:1: ( ( ( rule__AndRefinement__Alternatives_1_0_1 ) ) )
            // InternalEclParser.g:3748:1: ( ( rule__AndRefinement__Alternatives_1_0_1 ) )
            {
            // InternalEclParser.g:3748:1: ( ( rule__AndRefinement__Alternatives_1_0_1 ) )
            // InternalEclParser.g:3749:2: ( rule__AndRefinement__Alternatives_1_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getAlternatives_1_0_1()); 
            }
            // InternalEclParser.g:3750:2: ( rule__AndRefinement__Alternatives_1_0_1 )
            // InternalEclParser.g:3750:3: rule__AndRefinement__Alternatives_1_0_1
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
    // InternalEclParser.g:3758:1: rule__AndRefinement__Group_1_0__2 : rule__AndRefinement__Group_1_0__2__Impl ;
    public final void rule__AndRefinement__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3762:1: ( rule__AndRefinement__Group_1_0__2__Impl )
            // InternalEclParser.g:3763:2: rule__AndRefinement__Group_1_0__2__Impl
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
    // InternalEclParser.g:3769:1: rule__AndRefinement__Group_1_0__2__Impl : ( ( rule__AndRefinement__RightAssignment_1_0_2 ) ) ;
    public final void rule__AndRefinement__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3773:1: ( ( ( rule__AndRefinement__RightAssignment_1_0_2 ) ) )
            // InternalEclParser.g:3774:1: ( ( rule__AndRefinement__RightAssignment_1_0_2 ) )
            {
            // InternalEclParser.g:3774:1: ( ( rule__AndRefinement__RightAssignment_1_0_2 ) )
            // InternalEclParser.g:3775:2: ( rule__AndRefinement__RightAssignment_1_0_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndRefinementAccess().getRightAssignment_1_0_2()); 
            }
            // InternalEclParser.g:3776:2: ( rule__AndRefinement__RightAssignment_1_0_2 )
            // InternalEclParser.g:3776:3: rule__AndRefinement__RightAssignment_1_0_2
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
    // InternalEclParser.g:3785:1: rule__NestedRefinement__Group__0 : rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1 ;
    public final void rule__NestedRefinement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3789:1: ( rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1 )
            // InternalEclParser.g:3790:2: rule__NestedRefinement__Group__0__Impl rule__NestedRefinement__Group__1
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
    // InternalEclParser.g:3797:1: rule__NestedRefinement__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedRefinement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3801:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:3802:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:3802:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:3803:2: RULE_ROUND_OPEN
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
    // InternalEclParser.g:3812:1: rule__NestedRefinement__Group__1 : rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2 ;
    public final void rule__NestedRefinement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3816:1: ( rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2 )
            // InternalEclParser.g:3817:2: rule__NestedRefinement__Group__1__Impl rule__NestedRefinement__Group__2
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
    // InternalEclParser.g:3824:1: rule__NestedRefinement__Group__1__Impl : ( ( rule__NestedRefinement__NestedAssignment_1 ) ) ;
    public final void rule__NestedRefinement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3828:1: ( ( ( rule__NestedRefinement__NestedAssignment_1 ) ) )
            // InternalEclParser.g:3829:1: ( ( rule__NestedRefinement__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:3829:1: ( ( rule__NestedRefinement__NestedAssignment_1 ) )
            // InternalEclParser.g:3830:2: ( rule__NestedRefinement__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedRefinementAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:3831:2: ( rule__NestedRefinement__NestedAssignment_1 )
            // InternalEclParser.g:3831:3: rule__NestedRefinement__NestedAssignment_1
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
    // InternalEclParser.g:3839:1: rule__NestedRefinement__Group__2 : rule__NestedRefinement__Group__2__Impl ;
    public final void rule__NestedRefinement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3843:1: ( rule__NestedRefinement__Group__2__Impl )
            // InternalEclParser.g:3844:2: rule__NestedRefinement__Group__2__Impl
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
    // InternalEclParser.g:3850:1: rule__NestedRefinement__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedRefinement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3854:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:3855:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:3855:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:3856:2: RULE_ROUND_CLOSE
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
    // InternalEclParser.g:3866:1: rule__EclAttributeGroup__Group__0 : rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1 ;
    public final void rule__EclAttributeGroup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3870:1: ( rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1 )
            // InternalEclParser.g:3871:2: rule__EclAttributeGroup__Group__0__Impl rule__EclAttributeGroup__Group__1
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
    // InternalEclParser.g:3878:1: rule__EclAttributeGroup__Group__0__Impl : ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? ) ;
    public final void rule__EclAttributeGroup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3882:1: ( ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:3883:1: ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:3883:1: ( ( rule__EclAttributeGroup__CardinalityAssignment_0 )? )
            // InternalEclParser.g:3884:2: ( rule__EclAttributeGroup__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:3885:2: ( rule__EclAttributeGroup__CardinalityAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_SQUARE_OPEN) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalEclParser.g:3885:3: rule__EclAttributeGroup__CardinalityAssignment_0
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
    // InternalEclParser.g:3893:1: rule__EclAttributeGroup__Group__1 : rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2 ;
    public final void rule__EclAttributeGroup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3897:1: ( rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2 )
            // InternalEclParser.g:3898:2: rule__EclAttributeGroup__Group__1__Impl rule__EclAttributeGroup__Group__2
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
    // InternalEclParser.g:3905:1: rule__EclAttributeGroup__Group__1__Impl : ( RULE_CURLY_OPEN ) ;
    public final void rule__EclAttributeGroup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3909:1: ( ( RULE_CURLY_OPEN ) )
            // InternalEclParser.g:3910:1: ( RULE_CURLY_OPEN )
            {
            // InternalEclParser.g:3910:1: ( RULE_CURLY_OPEN )
            // InternalEclParser.g:3911:2: RULE_CURLY_OPEN
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
    // InternalEclParser.g:3920:1: rule__EclAttributeGroup__Group__2 : rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3 ;
    public final void rule__EclAttributeGroup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3924:1: ( rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3 )
            // InternalEclParser.g:3925:2: rule__EclAttributeGroup__Group__2__Impl rule__EclAttributeGroup__Group__3
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
    // InternalEclParser.g:3932:1: rule__EclAttributeGroup__Group__2__Impl : ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) ) ;
    public final void rule__EclAttributeGroup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3936:1: ( ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) ) )
            // InternalEclParser.g:3937:1: ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) )
            {
            // InternalEclParser.g:3937:1: ( ( rule__EclAttributeGroup__RefinementAssignment_2 ) )
            // InternalEclParser.g:3938:2: ( rule__EclAttributeGroup__RefinementAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getEclAttributeGroupAccess().getRefinementAssignment_2()); 
            }
            // InternalEclParser.g:3939:2: ( rule__EclAttributeGroup__RefinementAssignment_2 )
            // InternalEclParser.g:3939:3: rule__EclAttributeGroup__RefinementAssignment_2
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
    // InternalEclParser.g:3947:1: rule__EclAttributeGroup__Group__3 : rule__EclAttributeGroup__Group__3__Impl ;
    public final void rule__EclAttributeGroup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3951:1: ( rule__EclAttributeGroup__Group__3__Impl )
            // InternalEclParser.g:3952:2: rule__EclAttributeGroup__Group__3__Impl
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
    // InternalEclParser.g:3958:1: rule__EclAttributeGroup__Group__3__Impl : ( RULE_CURLY_CLOSE ) ;
    public final void rule__EclAttributeGroup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3962:1: ( ( RULE_CURLY_CLOSE ) )
            // InternalEclParser.g:3963:1: ( RULE_CURLY_CLOSE )
            {
            // InternalEclParser.g:3963:1: ( RULE_CURLY_CLOSE )
            // InternalEclParser.g:3964:2: RULE_CURLY_CLOSE
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
    // InternalEclParser.g:3974:1: rule__OrAttributeSet__Group__0 : rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1 ;
    public final void rule__OrAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3978:1: ( rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1 )
            // InternalEclParser.g:3979:2: rule__OrAttributeSet__Group__0__Impl rule__OrAttributeSet__Group__1
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
    // InternalEclParser.g:3986:1: rule__OrAttributeSet__Group__0__Impl : ( ruleAndAttributeSet ) ;
    public final void rule__OrAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:3990:1: ( ( ruleAndAttributeSet ) )
            // InternalEclParser.g:3991:1: ( ruleAndAttributeSet )
            {
            // InternalEclParser.g:3991:1: ( ruleAndAttributeSet )
            // InternalEclParser.g:3992:2: ruleAndAttributeSet
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
    // InternalEclParser.g:4001:1: rule__OrAttributeSet__Group__1 : rule__OrAttributeSet__Group__1__Impl ;
    public final void rule__OrAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4005:1: ( rule__OrAttributeSet__Group__1__Impl )
            // InternalEclParser.g:4006:2: rule__OrAttributeSet__Group__1__Impl
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
    // InternalEclParser.g:4012:1: rule__OrAttributeSet__Group__1__Impl : ( ( rule__OrAttributeSet__Group_1__0 )* ) ;
    public final void rule__OrAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4016:1: ( ( ( rule__OrAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:4017:1: ( ( rule__OrAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:4017:1: ( ( rule__OrAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:4018:2: ( rule__OrAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:4019:2: ( rule__OrAttributeSet__Group_1__0 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_DISJUNCTION) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalEclParser.g:4019:3: rule__OrAttributeSet__Group_1__0
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
    // InternalEclParser.g:4028:1: rule__OrAttributeSet__Group_1__0 : rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1 ;
    public final void rule__OrAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4032:1: ( rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1 )
            // InternalEclParser.g:4033:2: rule__OrAttributeSet__Group_1__0__Impl rule__OrAttributeSet__Group_1__1
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
    // InternalEclParser.g:4040:1: rule__OrAttributeSet__Group_1__0__Impl : ( () ) ;
    public final void rule__OrAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4044:1: ( ( () ) )
            // InternalEclParser.g:4045:1: ( () )
            {
            // InternalEclParser.g:4045:1: ( () )
            // InternalEclParser.g:4046:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getOrRefinementLeftAction_1_0()); 
            }
            // InternalEclParser.g:4047:2: ()
            // InternalEclParser.g:4047:3: 
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
    // InternalEclParser.g:4055:1: rule__OrAttributeSet__Group_1__1 : rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2 ;
    public final void rule__OrAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4059:1: ( rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2 )
            // InternalEclParser.g:4060:2: rule__OrAttributeSet__Group_1__1__Impl rule__OrAttributeSet__Group_1__2
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
    // InternalEclParser.g:4067:1: rule__OrAttributeSet__Group_1__1__Impl : ( RULE_DISJUNCTION ) ;
    public final void rule__OrAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4071:1: ( ( RULE_DISJUNCTION ) )
            // InternalEclParser.g:4072:1: ( RULE_DISJUNCTION )
            {
            // InternalEclParser.g:4072:1: ( RULE_DISJUNCTION )
            // InternalEclParser.g:4073:2: RULE_DISJUNCTION
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
    // InternalEclParser.g:4082:1: rule__OrAttributeSet__Group_1__2 : rule__OrAttributeSet__Group_1__2__Impl ;
    public final void rule__OrAttributeSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4086:1: ( rule__OrAttributeSet__Group_1__2__Impl )
            // InternalEclParser.g:4087:2: rule__OrAttributeSet__Group_1__2__Impl
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
    // InternalEclParser.g:4093:1: rule__OrAttributeSet__Group_1__2__Impl : ( ( rule__OrAttributeSet__RightAssignment_1_2 ) ) ;
    public final void rule__OrAttributeSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4097:1: ( ( ( rule__OrAttributeSet__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:4098:1: ( ( rule__OrAttributeSet__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:4098:1: ( ( rule__OrAttributeSet__RightAssignment_1_2 ) )
            // InternalEclParser.g:4099:2: ( rule__OrAttributeSet__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getOrAttributeSetAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:4100:2: ( rule__OrAttributeSet__RightAssignment_1_2 )
            // InternalEclParser.g:4100:3: rule__OrAttributeSet__RightAssignment_1_2
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
    // InternalEclParser.g:4109:1: rule__AndAttributeSet__Group__0 : rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1 ;
    public final void rule__AndAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4113:1: ( rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1 )
            // InternalEclParser.g:4114:2: rule__AndAttributeSet__Group__0__Impl rule__AndAttributeSet__Group__1
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
    // InternalEclParser.g:4121:1: rule__AndAttributeSet__Group__0__Impl : ( ruleSubAttributeSet ) ;
    public final void rule__AndAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4125:1: ( ( ruleSubAttributeSet ) )
            // InternalEclParser.g:4126:1: ( ruleSubAttributeSet )
            {
            // InternalEclParser.g:4126:1: ( ruleSubAttributeSet )
            // InternalEclParser.g:4127:2: ruleSubAttributeSet
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
    // InternalEclParser.g:4136:1: rule__AndAttributeSet__Group__1 : rule__AndAttributeSet__Group__1__Impl ;
    public final void rule__AndAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4140:1: ( rule__AndAttributeSet__Group__1__Impl )
            // InternalEclParser.g:4141:2: rule__AndAttributeSet__Group__1__Impl
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
    // InternalEclParser.g:4147:1: rule__AndAttributeSet__Group__1__Impl : ( ( rule__AndAttributeSet__Group_1__0 )* ) ;
    public final void rule__AndAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4151:1: ( ( ( rule__AndAttributeSet__Group_1__0 )* ) )
            // InternalEclParser.g:4152:1: ( ( rule__AndAttributeSet__Group_1__0 )* )
            {
            // InternalEclParser.g:4152:1: ( ( rule__AndAttributeSet__Group_1__0 )* )
            // InternalEclParser.g:4153:2: ( rule__AndAttributeSet__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getGroup_1()); 
            }
            // InternalEclParser.g:4154:2: ( rule__AndAttributeSet__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0>=RULE_COMMA && LA35_0<=RULE_CONJUNCTION)) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalEclParser.g:4154:3: rule__AndAttributeSet__Group_1__0
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
    // InternalEclParser.g:4163:1: rule__AndAttributeSet__Group_1__0 : rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1 ;
    public final void rule__AndAttributeSet__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4167:1: ( rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1 )
            // InternalEclParser.g:4168:2: rule__AndAttributeSet__Group_1__0__Impl rule__AndAttributeSet__Group_1__1
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
    // InternalEclParser.g:4175:1: rule__AndAttributeSet__Group_1__0__Impl : ( () ) ;
    public final void rule__AndAttributeSet__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4179:1: ( ( () ) )
            // InternalEclParser.g:4180:1: ( () )
            {
            // InternalEclParser.g:4180:1: ( () )
            // InternalEclParser.g:4181:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getAndRefinementLeftAction_1_0()); 
            }
            // InternalEclParser.g:4182:2: ()
            // InternalEclParser.g:4182:3: 
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
    // InternalEclParser.g:4190:1: rule__AndAttributeSet__Group_1__1 : rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2 ;
    public final void rule__AndAttributeSet__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4194:1: ( rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2 )
            // InternalEclParser.g:4195:2: rule__AndAttributeSet__Group_1__1__Impl rule__AndAttributeSet__Group_1__2
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
    // InternalEclParser.g:4202:1: rule__AndAttributeSet__Group_1__1__Impl : ( ( rule__AndAttributeSet__Alternatives_1_1 ) ) ;
    public final void rule__AndAttributeSet__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4206:1: ( ( ( rule__AndAttributeSet__Alternatives_1_1 ) ) )
            // InternalEclParser.g:4207:1: ( ( rule__AndAttributeSet__Alternatives_1_1 ) )
            {
            // InternalEclParser.g:4207:1: ( ( rule__AndAttributeSet__Alternatives_1_1 ) )
            // InternalEclParser.g:4208:2: ( rule__AndAttributeSet__Alternatives_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:4209:2: ( rule__AndAttributeSet__Alternatives_1_1 )
            // InternalEclParser.g:4209:3: rule__AndAttributeSet__Alternatives_1_1
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
    // InternalEclParser.g:4217:1: rule__AndAttributeSet__Group_1__2 : rule__AndAttributeSet__Group_1__2__Impl ;
    public final void rule__AndAttributeSet__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4221:1: ( rule__AndAttributeSet__Group_1__2__Impl )
            // InternalEclParser.g:4222:2: rule__AndAttributeSet__Group_1__2__Impl
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
    // InternalEclParser.g:4228:1: rule__AndAttributeSet__Group_1__2__Impl : ( ( rule__AndAttributeSet__RightAssignment_1_2 ) ) ;
    public final void rule__AndAttributeSet__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4232:1: ( ( ( rule__AndAttributeSet__RightAssignment_1_2 ) ) )
            // InternalEclParser.g:4233:1: ( ( rule__AndAttributeSet__RightAssignment_1_2 ) )
            {
            // InternalEclParser.g:4233:1: ( ( rule__AndAttributeSet__RightAssignment_1_2 ) )
            // InternalEclParser.g:4234:2: ( rule__AndAttributeSet__RightAssignment_1_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAndAttributeSetAccess().getRightAssignment_1_2()); 
            }
            // InternalEclParser.g:4235:2: ( rule__AndAttributeSet__RightAssignment_1_2 )
            // InternalEclParser.g:4235:3: rule__AndAttributeSet__RightAssignment_1_2
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
    // InternalEclParser.g:4244:1: rule__NestedAttributeSet__Group__0 : rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1 ;
    public final void rule__NestedAttributeSet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4248:1: ( rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1 )
            // InternalEclParser.g:4249:2: rule__NestedAttributeSet__Group__0__Impl rule__NestedAttributeSet__Group__1
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
    // InternalEclParser.g:4256:1: rule__NestedAttributeSet__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedAttributeSet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4260:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:4261:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:4261:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:4262:2: RULE_ROUND_OPEN
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
    // InternalEclParser.g:4271:1: rule__NestedAttributeSet__Group__1 : rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2 ;
    public final void rule__NestedAttributeSet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4275:1: ( rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2 )
            // InternalEclParser.g:4276:2: rule__NestedAttributeSet__Group__1__Impl rule__NestedAttributeSet__Group__2
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
    // InternalEclParser.g:4283:1: rule__NestedAttributeSet__Group__1__Impl : ( ( rule__NestedAttributeSet__NestedAssignment_1 ) ) ;
    public final void rule__NestedAttributeSet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4287:1: ( ( ( rule__NestedAttributeSet__NestedAssignment_1 ) ) )
            // InternalEclParser.g:4288:1: ( ( rule__NestedAttributeSet__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:4288:1: ( ( rule__NestedAttributeSet__NestedAssignment_1 ) )
            // InternalEclParser.g:4289:2: ( rule__NestedAttributeSet__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedAttributeSetAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:4290:2: ( rule__NestedAttributeSet__NestedAssignment_1 )
            // InternalEclParser.g:4290:3: rule__NestedAttributeSet__NestedAssignment_1
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
    // InternalEclParser.g:4298:1: rule__NestedAttributeSet__Group__2 : rule__NestedAttributeSet__Group__2__Impl ;
    public final void rule__NestedAttributeSet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4302:1: ( rule__NestedAttributeSet__Group__2__Impl )
            // InternalEclParser.g:4303:2: rule__NestedAttributeSet__Group__2__Impl
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
    // InternalEclParser.g:4309:1: rule__NestedAttributeSet__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedAttributeSet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4313:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:4314:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:4314:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:4315:2: RULE_ROUND_CLOSE
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
    // InternalEclParser.g:4325:1: rule__AttributeConstraint__Group__0 : rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 ;
    public final void rule__AttributeConstraint__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4329:1: ( rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1 )
            // InternalEclParser.g:4330:2: rule__AttributeConstraint__Group__0__Impl rule__AttributeConstraint__Group__1
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
    // InternalEclParser.g:4337:1: rule__AttributeConstraint__Group__0__Impl : ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? ) ;
    public final void rule__AttributeConstraint__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4341:1: ( ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? ) )
            // InternalEclParser.g:4342:1: ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? )
            {
            // InternalEclParser.g:4342:1: ( ( rule__AttributeConstraint__CardinalityAssignment_0 )? )
            // InternalEclParser.g:4343:2: ( rule__AttributeConstraint__CardinalityAssignment_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getCardinalityAssignment_0()); 
            }
            // InternalEclParser.g:4344:2: ( rule__AttributeConstraint__CardinalityAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_SQUARE_OPEN) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalEclParser.g:4344:3: rule__AttributeConstraint__CardinalityAssignment_0
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
    // InternalEclParser.g:4352:1: rule__AttributeConstraint__Group__1 : rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 ;
    public final void rule__AttributeConstraint__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4356:1: ( rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2 )
            // InternalEclParser.g:4357:2: rule__AttributeConstraint__Group__1__Impl rule__AttributeConstraint__Group__2
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
    // InternalEclParser.g:4364:1: rule__AttributeConstraint__Group__1__Impl : ( ( rule__AttributeConstraint__ReversedAssignment_1 )? ) ;
    public final void rule__AttributeConstraint__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4368:1: ( ( ( rule__AttributeConstraint__ReversedAssignment_1 )? ) )
            // InternalEclParser.g:4369:1: ( ( rule__AttributeConstraint__ReversedAssignment_1 )? )
            {
            // InternalEclParser.g:4369:1: ( ( rule__AttributeConstraint__ReversedAssignment_1 )? )
            // InternalEclParser.g:4370:2: ( rule__AttributeConstraint__ReversedAssignment_1 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getReversedAssignment_1()); 
            }
            // InternalEclParser.g:4371:2: ( rule__AttributeConstraint__ReversedAssignment_1 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_REVERSED) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalEclParser.g:4371:3: rule__AttributeConstraint__ReversedAssignment_1
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
    // InternalEclParser.g:4379:1: rule__AttributeConstraint__Group__2 : rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3 ;
    public final void rule__AttributeConstraint__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4383:1: ( rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3 )
            // InternalEclParser.g:4384:2: rule__AttributeConstraint__Group__2__Impl rule__AttributeConstraint__Group__3
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
    // InternalEclParser.g:4391:1: rule__AttributeConstraint__Group__2__Impl : ( ( rule__AttributeConstraint__AttributeAssignment_2 ) ) ;
    public final void rule__AttributeConstraint__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4395:1: ( ( ( rule__AttributeConstraint__AttributeAssignment_2 ) ) )
            // InternalEclParser.g:4396:1: ( ( rule__AttributeConstraint__AttributeAssignment_2 ) )
            {
            // InternalEclParser.g:4396:1: ( ( rule__AttributeConstraint__AttributeAssignment_2 ) )
            // InternalEclParser.g:4397:2: ( rule__AttributeConstraint__AttributeAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getAttributeAssignment_2()); 
            }
            // InternalEclParser.g:4398:2: ( rule__AttributeConstraint__AttributeAssignment_2 )
            // InternalEclParser.g:4398:3: rule__AttributeConstraint__AttributeAssignment_2
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
    // InternalEclParser.g:4406:1: rule__AttributeConstraint__Group__3 : rule__AttributeConstraint__Group__3__Impl ;
    public final void rule__AttributeConstraint__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4410:1: ( rule__AttributeConstraint__Group__3__Impl )
            // InternalEclParser.g:4411:2: rule__AttributeConstraint__Group__3__Impl
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
    // InternalEclParser.g:4417:1: rule__AttributeConstraint__Group__3__Impl : ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) ) ;
    public final void rule__AttributeConstraint__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4421:1: ( ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) ) )
            // InternalEclParser.g:4422:1: ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) )
            {
            // InternalEclParser.g:4422:1: ( ( rule__AttributeConstraint__ComparisonAssignment_3 ) )
            // InternalEclParser.g:4423:2: ( rule__AttributeConstraint__ComparisonAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeConstraintAccess().getComparisonAssignment_3()); 
            }
            // InternalEclParser.g:4424:2: ( rule__AttributeConstraint__ComparisonAssignment_3 )
            // InternalEclParser.g:4424:3: rule__AttributeConstraint__ComparisonAssignment_3
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
    // InternalEclParser.g:4433:1: rule__Cardinality__Group__0 : rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 ;
    public final void rule__Cardinality__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4437:1: ( rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1 )
            // InternalEclParser.g:4438:2: rule__Cardinality__Group__0__Impl rule__Cardinality__Group__1
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
    // InternalEclParser.g:4445:1: rule__Cardinality__Group__0__Impl : ( RULE_SQUARE_OPEN ) ;
    public final void rule__Cardinality__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4449:1: ( ( RULE_SQUARE_OPEN ) )
            // InternalEclParser.g:4450:1: ( RULE_SQUARE_OPEN )
            {
            // InternalEclParser.g:4450:1: ( RULE_SQUARE_OPEN )
            // InternalEclParser.g:4451:2: RULE_SQUARE_OPEN
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
    // InternalEclParser.g:4460:1: rule__Cardinality__Group__1 : rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 ;
    public final void rule__Cardinality__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4464:1: ( rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2 )
            // InternalEclParser.g:4465:2: rule__Cardinality__Group__1__Impl rule__Cardinality__Group__2
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
    // InternalEclParser.g:4472:1: rule__Cardinality__Group__1__Impl : ( ( rule__Cardinality__MinAssignment_1 ) ) ;
    public final void rule__Cardinality__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4476:1: ( ( ( rule__Cardinality__MinAssignment_1 ) ) )
            // InternalEclParser.g:4477:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            {
            // InternalEclParser.g:4477:1: ( ( rule__Cardinality__MinAssignment_1 ) )
            // InternalEclParser.g:4478:2: ( rule__Cardinality__MinAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMinAssignment_1()); 
            }
            // InternalEclParser.g:4479:2: ( rule__Cardinality__MinAssignment_1 )
            // InternalEclParser.g:4479:3: rule__Cardinality__MinAssignment_1
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
    // InternalEclParser.g:4487:1: rule__Cardinality__Group__2 : rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 ;
    public final void rule__Cardinality__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4491:1: ( rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3 )
            // InternalEclParser.g:4492:2: rule__Cardinality__Group__2__Impl rule__Cardinality__Group__3
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
    // InternalEclParser.g:4499:1: rule__Cardinality__Group__2__Impl : ( RULE_TO ) ;
    public final void rule__Cardinality__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4503:1: ( ( RULE_TO ) )
            // InternalEclParser.g:4504:1: ( RULE_TO )
            {
            // InternalEclParser.g:4504:1: ( RULE_TO )
            // InternalEclParser.g:4505:2: RULE_TO
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
    // InternalEclParser.g:4514:1: rule__Cardinality__Group__3 : rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 ;
    public final void rule__Cardinality__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4518:1: ( rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4 )
            // InternalEclParser.g:4519:2: rule__Cardinality__Group__3__Impl rule__Cardinality__Group__4
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
    // InternalEclParser.g:4526:1: rule__Cardinality__Group__3__Impl : ( ( rule__Cardinality__MaxAssignment_3 ) ) ;
    public final void rule__Cardinality__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4530:1: ( ( ( rule__Cardinality__MaxAssignment_3 ) ) )
            // InternalEclParser.g:4531:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            {
            // InternalEclParser.g:4531:1: ( ( rule__Cardinality__MaxAssignment_3 ) )
            // InternalEclParser.g:4532:2: ( rule__Cardinality__MaxAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getCardinalityAccess().getMaxAssignment_3()); 
            }
            // InternalEclParser.g:4533:2: ( rule__Cardinality__MaxAssignment_3 )
            // InternalEclParser.g:4533:3: rule__Cardinality__MaxAssignment_3
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
    // InternalEclParser.g:4541:1: rule__Cardinality__Group__4 : rule__Cardinality__Group__4__Impl ;
    public final void rule__Cardinality__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4545:1: ( rule__Cardinality__Group__4__Impl )
            // InternalEclParser.g:4546:2: rule__Cardinality__Group__4__Impl
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
    // InternalEclParser.g:4552:1: rule__Cardinality__Group__4__Impl : ( RULE_SQUARE_CLOSE ) ;
    public final void rule__Cardinality__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4556:1: ( ( RULE_SQUARE_CLOSE ) )
            // InternalEclParser.g:4557:1: ( RULE_SQUARE_CLOSE )
            {
            // InternalEclParser.g:4557:1: ( RULE_SQUARE_CLOSE )
            // InternalEclParser.g:4558:2: RULE_SQUARE_CLOSE
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
    // InternalEclParser.g:4568:1: rule__AttributeValueEquals__Group__0 : rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1 ;
    public final void rule__AttributeValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4572:1: ( rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1 )
            // InternalEclParser.g:4573:2: rule__AttributeValueEquals__Group__0__Impl rule__AttributeValueEquals__Group__1
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
    // InternalEclParser.g:4580:1: rule__AttributeValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__AttributeValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4584:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4585:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4585:1: ( RULE_EQUAL )
            // InternalEclParser.g:4586:2: RULE_EQUAL
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
    // InternalEclParser.g:4595:1: rule__AttributeValueEquals__Group__1 : rule__AttributeValueEquals__Group__1__Impl ;
    public final void rule__AttributeValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4599:1: ( rule__AttributeValueEquals__Group__1__Impl )
            // InternalEclParser.g:4600:2: rule__AttributeValueEquals__Group__1__Impl
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
    // InternalEclParser.g:4606:1: rule__AttributeValueEquals__Group__1__Impl : ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) ) ;
    public final void rule__AttributeValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4610:1: ( ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:4611:1: ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:4611:1: ( ( rule__AttributeValueEquals__ConstraintAssignment_1 ) )
            // InternalEclParser.g:4612:2: ( rule__AttributeValueEquals__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueEqualsAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:4613:2: ( rule__AttributeValueEquals__ConstraintAssignment_1 )
            // InternalEclParser.g:4613:3: rule__AttributeValueEquals__ConstraintAssignment_1
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
    // InternalEclParser.g:4622:1: rule__AttributeValueNotEquals__Group__0 : rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1 ;
    public final void rule__AttributeValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4626:1: ( rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1 )
            // InternalEclParser.g:4627:2: rule__AttributeValueNotEquals__Group__0__Impl rule__AttributeValueNotEquals__Group__1
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
    // InternalEclParser.g:4634:1: rule__AttributeValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__AttributeValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4638:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4639:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4639:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4640:2: RULE_NOT_EQUAL
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
    // InternalEclParser.g:4649:1: rule__AttributeValueNotEquals__Group__1 : rule__AttributeValueNotEquals__Group__1__Impl ;
    public final void rule__AttributeValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4653:1: ( rule__AttributeValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:4654:2: rule__AttributeValueNotEquals__Group__1__Impl
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
    // InternalEclParser.g:4660:1: rule__AttributeValueNotEquals__Group__1__Impl : ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) ) ;
    public final void rule__AttributeValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4664:1: ( ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) ) )
            // InternalEclParser.g:4665:1: ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) )
            {
            // InternalEclParser.g:4665:1: ( ( rule__AttributeValueNotEquals__ConstraintAssignment_1 ) )
            // InternalEclParser.g:4666:2: ( rule__AttributeValueNotEquals__ConstraintAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getAttributeValueNotEqualsAccess().getConstraintAssignment_1()); 
            }
            // InternalEclParser.g:4667:2: ( rule__AttributeValueNotEquals__ConstraintAssignment_1 )
            // InternalEclParser.g:4667:3: rule__AttributeValueNotEquals__ConstraintAssignment_1
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
    // InternalEclParser.g:4676:1: rule__BooleanValueEquals__Group__0 : rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1 ;
    public final void rule__BooleanValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4680:1: ( rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1 )
            // InternalEclParser.g:4681:2: rule__BooleanValueEquals__Group__0__Impl rule__BooleanValueEquals__Group__1
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
    // InternalEclParser.g:4688:1: rule__BooleanValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__BooleanValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4692:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4693:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4693:1: ( RULE_EQUAL )
            // InternalEclParser.g:4694:2: RULE_EQUAL
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
    // InternalEclParser.g:4703:1: rule__BooleanValueEquals__Group__1 : rule__BooleanValueEquals__Group__1__Impl ;
    public final void rule__BooleanValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4707:1: ( rule__BooleanValueEquals__Group__1__Impl )
            // InternalEclParser.g:4708:2: rule__BooleanValueEquals__Group__1__Impl
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
    // InternalEclParser.g:4714:1: rule__BooleanValueEquals__Group__1__Impl : ( ( rule__BooleanValueEquals__ValueAssignment_1 ) ) ;
    public final void rule__BooleanValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4718:1: ( ( ( rule__BooleanValueEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4719:1: ( ( rule__BooleanValueEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4719:1: ( ( rule__BooleanValueEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4720:2: ( rule__BooleanValueEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4721:2: ( rule__BooleanValueEquals__ValueAssignment_1 )
            // InternalEclParser.g:4721:3: rule__BooleanValueEquals__ValueAssignment_1
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
    // InternalEclParser.g:4730:1: rule__BooleanValueNotEquals__Group__0 : rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1 ;
    public final void rule__BooleanValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4734:1: ( rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1 )
            // InternalEclParser.g:4735:2: rule__BooleanValueNotEquals__Group__0__Impl rule__BooleanValueNotEquals__Group__1
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
    // InternalEclParser.g:4742:1: rule__BooleanValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__BooleanValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4746:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4747:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4747:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4748:2: RULE_NOT_EQUAL
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
    // InternalEclParser.g:4757:1: rule__BooleanValueNotEquals__Group__1 : rule__BooleanValueNotEquals__Group__1__Impl ;
    public final void rule__BooleanValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4761:1: ( rule__BooleanValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:4762:2: rule__BooleanValueNotEquals__Group__1__Impl
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
    // InternalEclParser.g:4768:1: rule__BooleanValueNotEquals__Group__1__Impl : ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) ) ;
    public final void rule__BooleanValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4772:1: ( ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4773:1: ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4773:1: ( ( rule__BooleanValueNotEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4774:2: ( rule__BooleanValueNotEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getBooleanValueNotEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4775:2: ( rule__BooleanValueNotEquals__ValueAssignment_1 )
            // InternalEclParser.g:4775:3: rule__BooleanValueNotEquals__ValueAssignment_1
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
    // InternalEclParser.g:4784:1: rule__StringValueEquals__Group__0 : rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1 ;
    public final void rule__StringValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4788:1: ( rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1 )
            // InternalEclParser.g:4789:2: rule__StringValueEquals__Group__0__Impl rule__StringValueEquals__Group__1
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
    // InternalEclParser.g:4796:1: rule__StringValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__StringValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4800:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4801:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4801:1: ( RULE_EQUAL )
            // InternalEclParser.g:4802:2: RULE_EQUAL
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
    // InternalEclParser.g:4811:1: rule__StringValueEquals__Group__1 : rule__StringValueEquals__Group__1__Impl ;
    public final void rule__StringValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4815:1: ( rule__StringValueEquals__Group__1__Impl )
            // InternalEclParser.g:4816:2: rule__StringValueEquals__Group__1__Impl
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
    // InternalEclParser.g:4822:1: rule__StringValueEquals__Group__1__Impl : ( ( rule__StringValueEquals__ValueAssignment_1 ) ) ;
    public final void rule__StringValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4826:1: ( ( ( rule__StringValueEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4827:1: ( ( rule__StringValueEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4827:1: ( ( rule__StringValueEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4828:2: ( rule__StringValueEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4829:2: ( rule__StringValueEquals__ValueAssignment_1 )
            // InternalEclParser.g:4829:3: rule__StringValueEquals__ValueAssignment_1
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
    // InternalEclParser.g:4838:1: rule__StringValueNotEquals__Group__0 : rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1 ;
    public final void rule__StringValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4842:1: ( rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1 )
            // InternalEclParser.g:4843:2: rule__StringValueNotEquals__Group__0__Impl rule__StringValueNotEquals__Group__1
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
    // InternalEclParser.g:4850:1: rule__StringValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__StringValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4854:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4855:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4855:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4856:2: RULE_NOT_EQUAL
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
    // InternalEclParser.g:4865:1: rule__StringValueNotEquals__Group__1 : rule__StringValueNotEquals__Group__1__Impl ;
    public final void rule__StringValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4869:1: ( rule__StringValueNotEquals__Group__1__Impl )
            // InternalEclParser.g:4870:2: rule__StringValueNotEquals__Group__1__Impl
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
    // InternalEclParser.g:4876:1: rule__StringValueNotEquals__Group__1__Impl : ( ( rule__StringValueNotEquals__ValueAssignment_1 ) ) ;
    public final void rule__StringValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4880:1: ( ( ( rule__StringValueNotEquals__ValueAssignment_1 ) ) )
            // InternalEclParser.g:4881:1: ( ( rule__StringValueNotEquals__ValueAssignment_1 ) )
            {
            // InternalEclParser.g:4881:1: ( ( rule__StringValueNotEquals__ValueAssignment_1 ) )
            // InternalEclParser.g:4882:2: ( rule__StringValueNotEquals__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getStringValueNotEqualsAccess().getValueAssignment_1()); 
            }
            // InternalEclParser.g:4883:2: ( rule__StringValueNotEquals__ValueAssignment_1 )
            // InternalEclParser.g:4883:3: rule__StringValueNotEquals__ValueAssignment_1
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
    // InternalEclParser.g:4892:1: rule__IntegerValueEquals__Group__0 : rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1 ;
    public final void rule__IntegerValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4896:1: ( rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1 )
            // InternalEclParser.g:4897:2: rule__IntegerValueEquals__Group__0__Impl rule__IntegerValueEquals__Group__1
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
    // InternalEclParser.g:4904:1: rule__IntegerValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__IntegerValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4908:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:4909:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:4909:1: ( RULE_EQUAL )
            // InternalEclParser.g:4910:2: RULE_EQUAL
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
    // InternalEclParser.g:4919:1: rule__IntegerValueEquals__Group__1 : rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2 ;
    public final void rule__IntegerValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4923:1: ( rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2 )
            // InternalEclParser.g:4924:2: rule__IntegerValueEquals__Group__1__Impl rule__IntegerValueEquals__Group__2
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
    // InternalEclParser.g:4931:1: rule__IntegerValueEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4935:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:4936:1: ( RULE_HASH )
            {
            // InternalEclParser.g:4936:1: ( RULE_HASH )
            // InternalEclParser.g:4937:2: RULE_HASH
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
    // InternalEclParser.g:4946:1: rule__IntegerValueEquals__Group__2 : rule__IntegerValueEquals__Group__2__Impl ;
    public final void rule__IntegerValueEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4950:1: ( rule__IntegerValueEquals__Group__2__Impl )
            // InternalEclParser.g:4951:2: rule__IntegerValueEquals__Group__2__Impl
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
    // InternalEclParser.g:4957:1: rule__IntegerValueEquals__Group__2__Impl : ( ( rule__IntegerValueEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4961:1: ( ( ( rule__IntegerValueEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:4962:1: ( ( rule__IntegerValueEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:4962:1: ( ( rule__IntegerValueEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:4963:2: ( rule__IntegerValueEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:4964:2: ( rule__IntegerValueEquals__ValueAssignment_2 )
            // InternalEclParser.g:4964:3: rule__IntegerValueEquals__ValueAssignment_2
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
    // InternalEclParser.g:4973:1: rule__IntegerValueNotEquals__Group__0 : rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1 ;
    public final void rule__IntegerValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4977:1: ( rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1 )
            // InternalEclParser.g:4978:2: rule__IntegerValueNotEquals__Group__0__Impl rule__IntegerValueNotEquals__Group__1
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
    // InternalEclParser.g:4985:1: rule__IntegerValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__IntegerValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:4989:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:4990:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:4990:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:4991:2: RULE_NOT_EQUAL
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
    // InternalEclParser.g:5000:1: rule__IntegerValueNotEquals__Group__1 : rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2 ;
    public final void rule__IntegerValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5004:1: ( rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2 )
            // InternalEclParser.g:5005:2: rule__IntegerValueNotEquals__Group__1__Impl rule__IntegerValueNotEquals__Group__2
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
    // InternalEclParser.g:5012:1: rule__IntegerValueNotEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5016:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5017:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5017:1: ( RULE_HASH )
            // InternalEclParser.g:5018:2: RULE_HASH
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
    // InternalEclParser.g:5027:1: rule__IntegerValueNotEquals__Group__2 : rule__IntegerValueNotEquals__Group__2__Impl ;
    public final void rule__IntegerValueNotEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5031:1: ( rule__IntegerValueNotEquals__Group__2__Impl )
            // InternalEclParser.g:5032:2: rule__IntegerValueNotEquals__Group__2__Impl
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
    // InternalEclParser.g:5038:1: rule__IntegerValueNotEquals__Group__2__Impl : ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueNotEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5042:1: ( ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5043:1: ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5043:1: ( ( rule__IntegerValueNotEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5044:2: ( rule__IntegerValueNotEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueNotEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5045:2: ( rule__IntegerValueNotEquals__ValueAssignment_2 )
            // InternalEclParser.g:5045:3: rule__IntegerValueNotEquals__ValueAssignment_2
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
    // InternalEclParser.g:5054:1: rule__IntegerValueGreaterThan__Group__0 : rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1 ;
    public final void rule__IntegerValueGreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5058:1: ( rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1 )
            // InternalEclParser.g:5059:2: rule__IntegerValueGreaterThan__Group__0__Impl rule__IntegerValueGreaterThan__Group__1
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
    // InternalEclParser.g:5066:1: rule__IntegerValueGreaterThan__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__IntegerValueGreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5070:1: ( ( RULE_GT ) )
            // InternalEclParser.g:5071:1: ( RULE_GT )
            {
            // InternalEclParser.g:5071:1: ( RULE_GT )
            // InternalEclParser.g:5072:2: RULE_GT
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
    // InternalEclParser.g:5081:1: rule__IntegerValueGreaterThan__Group__1 : rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2 ;
    public final void rule__IntegerValueGreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5085:1: ( rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2 )
            // InternalEclParser.g:5086:2: rule__IntegerValueGreaterThan__Group__1__Impl rule__IntegerValueGreaterThan__Group__2
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
    // InternalEclParser.g:5093:1: rule__IntegerValueGreaterThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueGreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5097:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5098:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5098:1: ( RULE_HASH )
            // InternalEclParser.g:5099:2: RULE_HASH
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
    // InternalEclParser.g:5108:1: rule__IntegerValueGreaterThan__Group__2 : rule__IntegerValueGreaterThan__Group__2__Impl ;
    public final void rule__IntegerValueGreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5112:1: ( rule__IntegerValueGreaterThan__Group__2__Impl )
            // InternalEclParser.g:5113:2: rule__IntegerValueGreaterThan__Group__2__Impl
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
    // InternalEclParser.g:5119:1: rule__IntegerValueGreaterThan__Group__2__Impl : ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueGreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5123:1: ( ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5124:1: ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5124:1: ( ( rule__IntegerValueGreaterThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5125:2: ( rule__IntegerValueGreaterThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5126:2: ( rule__IntegerValueGreaterThan__ValueAssignment_2 )
            // InternalEclParser.g:5126:3: rule__IntegerValueGreaterThan__ValueAssignment_2
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
    // InternalEclParser.g:5135:1: rule__IntegerValueLessThan__Group__0 : rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1 ;
    public final void rule__IntegerValueLessThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5139:1: ( rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1 )
            // InternalEclParser.g:5140:2: rule__IntegerValueLessThan__Group__0__Impl rule__IntegerValueLessThan__Group__1
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
    // InternalEclParser.g:5147:1: rule__IntegerValueLessThan__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__IntegerValueLessThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5151:1: ( ( RULE_LT ) )
            // InternalEclParser.g:5152:1: ( RULE_LT )
            {
            // InternalEclParser.g:5152:1: ( RULE_LT )
            // InternalEclParser.g:5153:2: RULE_LT
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
    // InternalEclParser.g:5162:1: rule__IntegerValueLessThan__Group__1 : rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2 ;
    public final void rule__IntegerValueLessThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5166:1: ( rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2 )
            // InternalEclParser.g:5167:2: rule__IntegerValueLessThan__Group__1__Impl rule__IntegerValueLessThan__Group__2
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
    // InternalEclParser.g:5174:1: rule__IntegerValueLessThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueLessThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5178:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5179:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5179:1: ( RULE_HASH )
            // InternalEclParser.g:5180:2: RULE_HASH
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
    // InternalEclParser.g:5189:1: rule__IntegerValueLessThan__Group__2 : rule__IntegerValueLessThan__Group__2__Impl ;
    public final void rule__IntegerValueLessThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5193:1: ( rule__IntegerValueLessThan__Group__2__Impl )
            // InternalEclParser.g:5194:2: rule__IntegerValueLessThan__Group__2__Impl
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
    // InternalEclParser.g:5200:1: rule__IntegerValueLessThan__Group__2__Impl : ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueLessThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5204:1: ( ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5205:1: ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5205:1: ( ( rule__IntegerValueLessThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5206:2: ( rule__IntegerValueLessThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5207:2: ( rule__IntegerValueLessThan__ValueAssignment_2 )
            // InternalEclParser.g:5207:3: rule__IntegerValueLessThan__ValueAssignment_2
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
    // InternalEclParser.g:5216:1: rule__IntegerValueGreaterThanEquals__Group__0 : rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1 ;
    public final void rule__IntegerValueGreaterThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5220:1: ( rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1 )
            // InternalEclParser.g:5221:2: rule__IntegerValueGreaterThanEquals__Group__0__Impl rule__IntegerValueGreaterThanEquals__Group__1
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
    // InternalEclParser.g:5228:1: rule__IntegerValueGreaterThanEquals__Group__0__Impl : ( RULE_GTE ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5232:1: ( ( RULE_GTE ) )
            // InternalEclParser.g:5233:1: ( RULE_GTE )
            {
            // InternalEclParser.g:5233:1: ( RULE_GTE )
            // InternalEclParser.g:5234:2: RULE_GTE
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
    // InternalEclParser.g:5243:1: rule__IntegerValueGreaterThanEquals__Group__1 : rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2 ;
    public final void rule__IntegerValueGreaterThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5247:1: ( rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2 )
            // InternalEclParser.g:5248:2: rule__IntegerValueGreaterThanEquals__Group__1__Impl rule__IntegerValueGreaterThanEquals__Group__2
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
    // InternalEclParser.g:5255:1: rule__IntegerValueGreaterThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5259:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5260:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5260:1: ( RULE_HASH )
            // InternalEclParser.g:5261:2: RULE_HASH
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
    // InternalEclParser.g:5270:1: rule__IntegerValueGreaterThanEquals__Group__2 : rule__IntegerValueGreaterThanEquals__Group__2__Impl ;
    public final void rule__IntegerValueGreaterThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5274:1: ( rule__IntegerValueGreaterThanEquals__Group__2__Impl )
            // InternalEclParser.g:5275:2: rule__IntegerValueGreaterThanEquals__Group__2__Impl
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
    // InternalEclParser.g:5281:1: rule__IntegerValueGreaterThanEquals__Group__2__Impl : ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueGreaterThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5285:1: ( ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5286:1: ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5286:1: ( ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5287:2: ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5288:2: ( rule__IntegerValueGreaterThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5288:3: rule__IntegerValueGreaterThanEquals__ValueAssignment_2
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
    // InternalEclParser.g:5297:1: rule__IntegerValueLessThanEquals__Group__0 : rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1 ;
    public final void rule__IntegerValueLessThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5301:1: ( rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1 )
            // InternalEclParser.g:5302:2: rule__IntegerValueLessThanEquals__Group__0__Impl rule__IntegerValueLessThanEquals__Group__1
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
    // InternalEclParser.g:5309:1: rule__IntegerValueLessThanEquals__Group__0__Impl : ( RULE_LTE ) ;
    public final void rule__IntegerValueLessThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5313:1: ( ( RULE_LTE ) )
            // InternalEclParser.g:5314:1: ( RULE_LTE )
            {
            // InternalEclParser.g:5314:1: ( RULE_LTE )
            // InternalEclParser.g:5315:2: RULE_LTE
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
    // InternalEclParser.g:5324:1: rule__IntegerValueLessThanEquals__Group__1 : rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2 ;
    public final void rule__IntegerValueLessThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5328:1: ( rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2 )
            // InternalEclParser.g:5329:2: rule__IntegerValueLessThanEquals__Group__1__Impl rule__IntegerValueLessThanEquals__Group__2
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
    // InternalEclParser.g:5336:1: rule__IntegerValueLessThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__IntegerValueLessThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5340:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5341:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5341:1: ( RULE_HASH )
            // InternalEclParser.g:5342:2: RULE_HASH
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
    // InternalEclParser.g:5351:1: rule__IntegerValueLessThanEquals__Group__2 : rule__IntegerValueLessThanEquals__Group__2__Impl ;
    public final void rule__IntegerValueLessThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5355:1: ( rule__IntegerValueLessThanEquals__Group__2__Impl )
            // InternalEclParser.g:5356:2: rule__IntegerValueLessThanEquals__Group__2__Impl
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
    // InternalEclParser.g:5362:1: rule__IntegerValueLessThanEquals__Group__2__Impl : ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__IntegerValueLessThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5366:1: ( ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5367:1: ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5367:1: ( ( rule__IntegerValueLessThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5368:2: ( rule__IntegerValueLessThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerValueLessThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5369:2: ( rule__IntegerValueLessThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5369:3: rule__IntegerValueLessThanEquals__ValueAssignment_2
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
    // InternalEclParser.g:5378:1: rule__DecimalValueEquals__Group__0 : rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1 ;
    public final void rule__DecimalValueEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5382:1: ( rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1 )
            // InternalEclParser.g:5383:2: rule__DecimalValueEquals__Group__0__Impl rule__DecimalValueEquals__Group__1
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
    // InternalEclParser.g:5390:1: rule__DecimalValueEquals__Group__0__Impl : ( RULE_EQUAL ) ;
    public final void rule__DecimalValueEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5394:1: ( ( RULE_EQUAL ) )
            // InternalEclParser.g:5395:1: ( RULE_EQUAL )
            {
            // InternalEclParser.g:5395:1: ( RULE_EQUAL )
            // InternalEclParser.g:5396:2: RULE_EQUAL
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
    // InternalEclParser.g:5405:1: rule__DecimalValueEquals__Group__1 : rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2 ;
    public final void rule__DecimalValueEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5409:1: ( rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2 )
            // InternalEclParser.g:5410:2: rule__DecimalValueEquals__Group__1__Impl rule__DecimalValueEquals__Group__2
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
    // InternalEclParser.g:5417:1: rule__DecimalValueEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5421:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5422:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5422:1: ( RULE_HASH )
            // InternalEclParser.g:5423:2: RULE_HASH
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
    // InternalEclParser.g:5432:1: rule__DecimalValueEquals__Group__2 : rule__DecimalValueEquals__Group__2__Impl ;
    public final void rule__DecimalValueEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5436:1: ( rule__DecimalValueEquals__Group__2__Impl )
            // InternalEclParser.g:5437:2: rule__DecimalValueEquals__Group__2__Impl
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
    // InternalEclParser.g:5443:1: rule__DecimalValueEquals__Group__2__Impl : ( ( rule__DecimalValueEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5447:1: ( ( ( rule__DecimalValueEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5448:1: ( ( rule__DecimalValueEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5448:1: ( ( rule__DecimalValueEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5449:2: ( rule__DecimalValueEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5450:2: ( rule__DecimalValueEquals__ValueAssignment_2 )
            // InternalEclParser.g:5450:3: rule__DecimalValueEquals__ValueAssignment_2
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
    // InternalEclParser.g:5459:1: rule__DecimalValueNotEquals__Group__0 : rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1 ;
    public final void rule__DecimalValueNotEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5463:1: ( rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1 )
            // InternalEclParser.g:5464:2: rule__DecimalValueNotEquals__Group__0__Impl rule__DecimalValueNotEquals__Group__1
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
    // InternalEclParser.g:5471:1: rule__DecimalValueNotEquals__Group__0__Impl : ( RULE_NOT_EQUAL ) ;
    public final void rule__DecimalValueNotEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5475:1: ( ( RULE_NOT_EQUAL ) )
            // InternalEclParser.g:5476:1: ( RULE_NOT_EQUAL )
            {
            // InternalEclParser.g:5476:1: ( RULE_NOT_EQUAL )
            // InternalEclParser.g:5477:2: RULE_NOT_EQUAL
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
    // InternalEclParser.g:5486:1: rule__DecimalValueNotEquals__Group__1 : rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2 ;
    public final void rule__DecimalValueNotEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5490:1: ( rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2 )
            // InternalEclParser.g:5491:2: rule__DecimalValueNotEquals__Group__1__Impl rule__DecimalValueNotEquals__Group__2
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
    // InternalEclParser.g:5498:1: rule__DecimalValueNotEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueNotEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5502:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5503:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5503:1: ( RULE_HASH )
            // InternalEclParser.g:5504:2: RULE_HASH
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
    // InternalEclParser.g:5513:1: rule__DecimalValueNotEquals__Group__2 : rule__DecimalValueNotEquals__Group__2__Impl ;
    public final void rule__DecimalValueNotEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5517:1: ( rule__DecimalValueNotEquals__Group__2__Impl )
            // InternalEclParser.g:5518:2: rule__DecimalValueNotEquals__Group__2__Impl
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
    // InternalEclParser.g:5524:1: rule__DecimalValueNotEquals__Group__2__Impl : ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueNotEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5528:1: ( ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5529:1: ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5529:1: ( ( rule__DecimalValueNotEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5530:2: ( rule__DecimalValueNotEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueNotEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5531:2: ( rule__DecimalValueNotEquals__ValueAssignment_2 )
            // InternalEclParser.g:5531:3: rule__DecimalValueNotEquals__ValueAssignment_2
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
    // InternalEclParser.g:5540:1: rule__DecimalValueGreaterThan__Group__0 : rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1 ;
    public final void rule__DecimalValueGreaterThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5544:1: ( rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1 )
            // InternalEclParser.g:5545:2: rule__DecimalValueGreaterThan__Group__0__Impl rule__DecimalValueGreaterThan__Group__1
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
    // InternalEclParser.g:5552:1: rule__DecimalValueGreaterThan__Group__0__Impl : ( RULE_GT ) ;
    public final void rule__DecimalValueGreaterThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5556:1: ( ( RULE_GT ) )
            // InternalEclParser.g:5557:1: ( RULE_GT )
            {
            // InternalEclParser.g:5557:1: ( RULE_GT )
            // InternalEclParser.g:5558:2: RULE_GT
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
    // InternalEclParser.g:5567:1: rule__DecimalValueGreaterThan__Group__1 : rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2 ;
    public final void rule__DecimalValueGreaterThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5571:1: ( rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2 )
            // InternalEclParser.g:5572:2: rule__DecimalValueGreaterThan__Group__1__Impl rule__DecimalValueGreaterThan__Group__2
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
    // InternalEclParser.g:5579:1: rule__DecimalValueGreaterThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueGreaterThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5583:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5584:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5584:1: ( RULE_HASH )
            // InternalEclParser.g:5585:2: RULE_HASH
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
    // InternalEclParser.g:5594:1: rule__DecimalValueGreaterThan__Group__2 : rule__DecimalValueGreaterThan__Group__2__Impl ;
    public final void rule__DecimalValueGreaterThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5598:1: ( rule__DecimalValueGreaterThan__Group__2__Impl )
            // InternalEclParser.g:5599:2: rule__DecimalValueGreaterThan__Group__2__Impl
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
    // InternalEclParser.g:5605:1: rule__DecimalValueGreaterThan__Group__2__Impl : ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueGreaterThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5609:1: ( ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5610:1: ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5610:1: ( ( rule__DecimalValueGreaterThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5611:2: ( rule__DecimalValueGreaterThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5612:2: ( rule__DecimalValueGreaterThan__ValueAssignment_2 )
            // InternalEclParser.g:5612:3: rule__DecimalValueGreaterThan__ValueAssignment_2
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
    // InternalEclParser.g:5621:1: rule__DecimalValueLessThan__Group__0 : rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1 ;
    public final void rule__DecimalValueLessThan__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5625:1: ( rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1 )
            // InternalEclParser.g:5626:2: rule__DecimalValueLessThan__Group__0__Impl rule__DecimalValueLessThan__Group__1
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
    // InternalEclParser.g:5633:1: rule__DecimalValueLessThan__Group__0__Impl : ( RULE_LT ) ;
    public final void rule__DecimalValueLessThan__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5637:1: ( ( RULE_LT ) )
            // InternalEclParser.g:5638:1: ( RULE_LT )
            {
            // InternalEclParser.g:5638:1: ( RULE_LT )
            // InternalEclParser.g:5639:2: RULE_LT
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
    // InternalEclParser.g:5648:1: rule__DecimalValueLessThan__Group__1 : rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2 ;
    public final void rule__DecimalValueLessThan__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5652:1: ( rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2 )
            // InternalEclParser.g:5653:2: rule__DecimalValueLessThan__Group__1__Impl rule__DecimalValueLessThan__Group__2
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
    // InternalEclParser.g:5660:1: rule__DecimalValueLessThan__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueLessThan__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5664:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5665:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5665:1: ( RULE_HASH )
            // InternalEclParser.g:5666:2: RULE_HASH
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
    // InternalEclParser.g:5675:1: rule__DecimalValueLessThan__Group__2 : rule__DecimalValueLessThan__Group__2__Impl ;
    public final void rule__DecimalValueLessThan__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5679:1: ( rule__DecimalValueLessThan__Group__2__Impl )
            // InternalEclParser.g:5680:2: rule__DecimalValueLessThan__Group__2__Impl
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
    // InternalEclParser.g:5686:1: rule__DecimalValueLessThan__Group__2__Impl : ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueLessThan__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5690:1: ( ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5691:1: ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5691:1: ( ( rule__DecimalValueLessThan__ValueAssignment_2 ) )
            // InternalEclParser.g:5692:2: ( rule__DecimalValueLessThan__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5693:2: ( rule__DecimalValueLessThan__ValueAssignment_2 )
            // InternalEclParser.g:5693:3: rule__DecimalValueLessThan__ValueAssignment_2
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
    // InternalEclParser.g:5702:1: rule__DecimalValueGreaterThanEquals__Group__0 : rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1 ;
    public final void rule__DecimalValueGreaterThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5706:1: ( rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1 )
            // InternalEclParser.g:5707:2: rule__DecimalValueGreaterThanEquals__Group__0__Impl rule__DecimalValueGreaterThanEquals__Group__1
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
    // InternalEclParser.g:5714:1: rule__DecimalValueGreaterThanEquals__Group__0__Impl : ( RULE_GTE ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5718:1: ( ( RULE_GTE ) )
            // InternalEclParser.g:5719:1: ( RULE_GTE )
            {
            // InternalEclParser.g:5719:1: ( RULE_GTE )
            // InternalEclParser.g:5720:2: RULE_GTE
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
    // InternalEclParser.g:5729:1: rule__DecimalValueGreaterThanEquals__Group__1 : rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2 ;
    public final void rule__DecimalValueGreaterThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5733:1: ( rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2 )
            // InternalEclParser.g:5734:2: rule__DecimalValueGreaterThanEquals__Group__1__Impl rule__DecimalValueGreaterThanEquals__Group__2
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
    // InternalEclParser.g:5741:1: rule__DecimalValueGreaterThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5745:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5746:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5746:1: ( RULE_HASH )
            // InternalEclParser.g:5747:2: RULE_HASH
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
    // InternalEclParser.g:5756:1: rule__DecimalValueGreaterThanEquals__Group__2 : rule__DecimalValueGreaterThanEquals__Group__2__Impl ;
    public final void rule__DecimalValueGreaterThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5760:1: ( rule__DecimalValueGreaterThanEquals__Group__2__Impl )
            // InternalEclParser.g:5761:2: rule__DecimalValueGreaterThanEquals__Group__2__Impl
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
    // InternalEclParser.g:5767:1: rule__DecimalValueGreaterThanEquals__Group__2__Impl : ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueGreaterThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5771:1: ( ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5772:1: ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5772:1: ( ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5773:2: ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueGreaterThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5774:2: ( rule__DecimalValueGreaterThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5774:3: rule__DecimalValueGreaterThanEquals__ValueAssignment_2
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
    // InternalEclParser.g:5783:1: rule__DecimalValueLessThanEquals__Group__0 : rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1 ;
    public final void rule__DecimalValueLessThanEquals__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5787:1: ( rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1 )
            // InternalEclParser.g:5788:2: rule__DecimalValueLessThanEquals__Group__0__Impl rule__DecimalValueLessThanEquals__Group__1
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
    // InternalEclParser.g:5795:1: rule__DecimalValueLessThanEquals__Group__0__Impl : ( RULE_LTE ) ;
    public final void rule__DecimalValueLessThanEquals__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5799:1: ( ( RULE_LTE ) )
            // InternalEclParser.g:5800:1: ( RULE_LTE )
            {
            // InternalEclParser.g:5800:1: ( RULE_LTE )
            // InternalEclParser.g:5801:2: RULE_LTE
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
    // InternalEclParser.g:5810:1: rule__DecimalValueLessThanEquals__Group__1 : rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2 ;
    public final void rule__DecimalValueLessThanEquals__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5814:1: ( rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2 )
            // InternalEclParser.g:5815:2: rule__DecimalValueLessThanEquals__Group__1__Impl rule__DecimalValueLessThanEquals__Group__2
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
    // InternalEclParser.g:5822:1: rule__DecimalValueLessThanEquals__Group__1__Impl : ( RULE_HASH ) ;
    public final void rule__DecimalValueLessThanEquals__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5826:1: ( ( RULE_HASH ) )
            // InternalEclParser.g:5827:1: ( RULE_HASH )
            {
            // InternalEclParser.g:5827:1: ( RULE_HASH )
            // InternalEclParser.g:5828:2: RULE_HASH
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
    // InternalEclParser.g:5837:1: rule__DecimalValueLessThanEquals__Group__2 : rule__DecimalValueLessThanEquals__Group__2__Impl ;
    public final void rule__DecimalValueLessThanEquals__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5841:1: ( rule__DecimalValueLessThanEquals__Group__2__Impl )
            // InternalEclParser.g:5842:2: rule__DecimalValueLessThanEquals__Group__2__Impl
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
    // InternalEclParser.g:5848:1: rule__DecimalValueLessThanEquals__Group__2__Impl : ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) ) ;
    public final void rule__DecimalValueLessThanEquals__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5852:1: ( ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) ) )
            // InternalEclParser.g:5853:1: ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) )
            {
            // InternalEclParser.g:5853:1: ( ( rule__DecimalValueLessThanEquals__ValueAssignment_2 ) )
            // InternalEclParser.g:5854:2: ( rule__DecimalValueLessThanEquals__ValueAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalValueLessThanEqualsAccess().getValueAssignment_2()); 
            }
            // InternalEclParser.g:5855:2: ( rule__DecimalValueLessThanEquals__ValueAssignment_2 )
            // InternalEclParser.g:5855:3: rule__DecimalValueLessThanEquals__ValueAssignment_2
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
    // InternalEclParser.g:5864:1: rule__NestedExpression__Group__0 : rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1 ;
    public final void rule__NestedExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5868:1: ( rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1 )
            // InternalEclParser.g:5869:2: rule__NestedExpression__Group__0__Impl rule__NestedExpression__Group__1
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
    // InternalEclParser.g:5876:1: rule__NestedExpression__Group__0__Impl : ( RULE_ROUND_OPEN ) ;
    public final void rule__NestedExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5880:1: ( ( RULE_ROUND_OPEN ) )
            // InternalEclParser.g:5881:1: ( RULE_ROUND_OPEN )
            {
            // InternalEclParser.g:5881:1: ( RULE_ROUND_OPEN )
            // InternalEclParser.g:5882:2: RULE_ROUND_OPEN
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
    // InternalEclParser.g:5891:1: rule__NestedExpression__Group__1 : rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2 ;
    public final void rule__NestedExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5895:1: ( rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2 )
            // InternalEclParser.g:5896:2: rule__NestedExpression__Group__1__Impl rule__NestedExpression__Group__2
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
    // InternalEclParser.g:5903:1: rule__NestedExpression__Group__1__Impl : ( ( rule__NestedExpression__NestedAssignment_1 ) ) ;
    public final void rule__NestedExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5907:1: ( ( ( rule__NestedExpression__NestedAssignment_1 ) ) )
            // InternalEclParser.g:5908:1: ( ( rule__NestedExpression__NestedAssignment_1 ) )
            {
            // InternalEclParser.g:5908:1: ( ( rule__NestedExpression__NestedAssignment_1 ) )
            // InternalEclParser.g:5909:2: ( rule__NestedExpression__NestedAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNestedExpressionAccess().getNestedAssignment_1()); 
            }
            // InternalEclParser.g:5910:2: ( rule__NestedExpression__NestedAssignment_1 )
            // InternalEclParser.g:5910:3: rule__NestedExpression__NestedAssignment_1
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
    // InternalEclParser.g:5918:1: rule__NestedExpression__Group__2 : rule__NestedExpression__Group__2__Impl ;
    public final void rule__NestedExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5922:1: ( rule__NestedExpression__Group__2__Impl )
            // InternalEclParser.g:5923:2: rule__NestedExpression__Group__2__Impl
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
    // InternalEclParser.g:5929:1: rule__NestedExpression__Group__2__Impl : ( RULE_ROUND_CLOSE ) ;
    public final void rule__NestedExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5933:1: ( ( RULE_ROUND_CLOSE ) )
            // InternalEclParser.g:5934:1: ( RULE_ROUND_CLOSE )
            {
            // InternalEclParser.g:5934:1: ( RULE_ROUND_CLOSE )
            // InternalEclParser.g:5935:2: RULE_ROUND_CLOSE
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
    // InternalEclParser.g:5945:1: rule__SnomedIdentifier__Group__0 : rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 ;
    public final void rule__SnomedIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5949:1: ( rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1 )
            // InternalEclParser.g:5950:2: rule__SnomedIdentifier__Group__0__Impl rule__SnomedIdentifier__Group__1
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
    // InternalEclParser.g:5957:1: rule__SnomedIdentifier__Group__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__SnomedIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5961:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalEclParser.g:5962:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalEclParser.g:5962:1: ( RULE_DIGIT_NONZERO )
            // InternalEclParser.g:5963:2: RULE_DIGIT_NONZERO
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
    // InternalEclParser.g:5972:1: rule__SnomedIdentifier__Group__1 : rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 ;
    public final void rule__SnomedIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5976:1: ( rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2 )
            // InternalEclParser.g:5977:2: rule__SnomedIdentifier__Group__1__Impl rule__SnomedIdentifier__Group__2
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
    // InternalEclParser.g:5984:1: rule__SnomedIdentifier__Group__1__Impl : ( ( rule__SnomedIdentifier__Alternatives_1 ) ) ;
    public final void rule__SnomedIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:5988:1: ( ( ( rule__SnomedIdentifier__Alternatives_1 ) ) )
            // InternalEclParser.g:5989:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            {
            // InternalEclParser.g:5989:1: ( ( rule__SnomedIdentifier__Alternatives_1 ) )
            // InternalEclParser.g:5990:2: ( rule__SnomedIdentifier__Alternatives_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_1()); 
            }
            // InternalEclParser.g:5991:2: ( rule__SnomedIdentifier__Alternatives_1 )
            // InternalEclParser.g:5991:3: rule__SnomedIdentifier__Alternatives_1
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
    // InternalEclParser.g:5999:1: rule__SnomedIdentifier__Group__2 : rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 ;
    public final void rule__SnomedIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6003:1: ( rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3 )
            // InternalEclParser.g:6004:2: rule__SnomedIdentifier__Group__2__Impl rule__SnomedIdentifier__Group__3
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
    // InternalEclParser.g:6011:1: rule__SnomedIdentifier__Group__2__Impl : ( ( rule__SnomedIdentifier__Alternatives_2 ) ) ;
    public final void rule__SnomedIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6015:1: ( ( ( rule__SnomedIdentifier__Alternatives_2 ) ) )
            // InternalEclParser.g:6016:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            {
            // InternalEclParser.g:6016:1: ( ( rule__SnomedIdentifier__Alternatives_2 ) )
            // InternalEclParser.g:6017:2: ( rule__SnomedIdentifier__Alternatives_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_2()); 
            }
            // InternalEclParser.g:6018:2: ( rule__SnomedIdentifier__Alternatives_2 )
            // InternalEclParser.g:6018:3: rule__SnomedIdentifier__Alternatives_2
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
    // InternalEclParser.g:6026:1: rule__SnomedIdentifier__Group__3 : rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 ;
    public final void rule__SnomedIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6030:1: ( rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4 )
            // InternalEclParser.g:6031:2: rule__SnomedIdentifier__Group__3__Impl rule__SnomedIdentifier__Group__4
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
    // InternalEclParser.g:6038:1: rule__SnomedIdentifier__Group__3__Impl : ( ( rule__SnomedIdentifier__Alternatives_3 ) ) ;
    public final void rule__SnomedIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6042:1: ( ( ( rule__SnomedIdentifier__Alternatives_3 ) ) )
            // InternalEclParser.g:6043:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            {
            // InternalEclParser.g:6043:1: ( ( rule__SnomedIdentifier__Alternatives_3 ) )
            // InternalEclParser.g:6044:2: ( rule__SnomedIdentifier__Alternatives_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_3()); 
            }
            // InternalEclParser.g:6045:2: ( rule__SnomedIdentifier__Alternatives_3 )
            // InternalEclParser.g:6045:3: rule__SnomedIdentifier__Alternatives_3
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
    // InternalEclParser.g:6053:1: rule__SnomedIdentifier__Group__4 : rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 ;
    public final void rule__SnomedIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6057:1: ( rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5 )
            // InternalEclParser.g:6058:2: rule__SnomedIdentifier__Group__4__Impl rule__SnomedIdentifier__Group__5
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
    // InternalEclParser.g:6065:1: rule__SnomedIdentifier__Group__4__Impl : ( ( rule__SnomedIdentifier__Alternatives_4 ) ) ;
    public final void rule__SnomedIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6069:1: ( ( ( rule__SnomedIdentifier__Alternatives_4 ) ) )
            // InternalEclParser.g:6070:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            {
            // InternalEclParser.g:6070:1: ( ( rule__SnomedIdentifier__Alternatives_4 ) )
            // InternalEclParser.g:6071:2: ( rule__SnomedIdentifier__Alternatives_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_4()); 
            }
            // InternalEclParser.g:6072:2: ( rule__SnomedIdentifier__Alternatives_4 )
            // InternalEclParser.g:6072:3: rule__SnomedIdentifier__Alternatives_4
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
    // InternalEclParser.g:6080:1: rule__SnomedIdentifier__Group__5 : rule__SnomedIdentifier__Group__5__Impl ;
    public final void rule__SnomedIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6084:1: ( rule__SnomedIdentifier__Group__5__Impl )
            // InternalEclParser.g:6085:2: rule__SnomedIdentifier__Group__5__Impl
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
    // InternalEclParser.g:6091:1: rule__SnomedIdentifier__Group__5__Impl : ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) ;
    public final void rule__SnomedIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6095:1: ( ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) ) )
            // InternalEclParser.g:6096:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            {
            // InternalEclParser.g:6096:1: ( ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* ) )
            // InternalEclParser.g:6097:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) ) ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            {
            // InternalEclParser.g:6097:2: ( ( rule__SnomedIdentifier__Alternatives_5 ) )
            // InternalEclParser.g:6098:3: ( rule__SnomedIdentifier__Alternatives_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalEclParser.g:6099:3: ( rule__SnomedIdentifier__Alternatives_5 )
            // InternalEclParser.g:6099:4: rule__SnomedIdentifier__Alternatives_5
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

            // InternalEclParser.g:6102:2: ( ( rule__SnomedIdentifier__Alternatives_5 )* )
            // InternalEclParser.g:6103:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getSnomedIdentifierAccess().getAlternatives_5()); 
            }
            // InternalEclParser.g:6104:3: ( rule__SnomedIdentifier__Alternatives_5 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( ((LA38_0>=RULE_ZERO && LA38_0<=RULE_DIGIT_NONZERO)) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalEclParser.g:6104:4: rule__SnomedIdentifier__Alternatives_5
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
    // InternalEclParser.g:6114:1: rule__NonNegativeInteger__Group_1__0 : rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 ;
    public final void rule__NonNegativeInteger__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6118:1: ( rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1 )
            // InternalEclParser.g:6119:2: rule__NonNegativeInteger__Group_1__0__Impl rule__NonNegativeInteger__Group_1__1
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
    // InternalEclParser.g:6126:1: rule__NonNegativeInteger__Group_1__0__Impl : ( RULE_DIGIT_NONZERO ) ;
    public final void rule__NonNegativeInteger__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6130:1: ( ( RULE_DIGIT_NONZERO ) )
            // InternalEclParser.g:6131:1: ( RULE_DIGIT_NONZERO )
            {
            // InternalEclParser.g:6131:1: ( RULE_DIGIT_NONZERO )
            // InternalEclParser.g:6132:2: RULE_DIGIT_NONZERO
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
    // InternalEclParser.g:6141:1: rule__NonNegativeInteger__Group_1__1 : rule__NonNegativeInteger__Group_1__1__Impl ;
    public final void rule__NonNegativeInteger__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6145:1: ( rule__NonNegativeInteger__Group_1__1__Impl )
            // InternalEclParser.g:6146:2: rule__NonNegativeInteger__Group_1__1__Impl
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
    // InternalEclParser.g:6152:1: rule__NonNegativeInteger__Group_1__1__Impl : ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) ;
    public final void rule__NonNegativeInteger__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6156:1: ( ( ( rule__NonNegativeInteger__Alternatives_1_1 )* ) )
            // InternalEclParser.g:6157:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            {
            // InternalEclParser.g:6157:1: ( ( rule__NonNegativeInteger__Alternatives_1_1 )* )
            // InternalEclParser.g:6158:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeIntegerAccess().getAlternatives_1_1()); 
            }
            // InternalEclParser.g:6159:2: ( rule__NonNegativeInteger__Alternatives_1_1 )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_ZERO && LA39_0<=RULE_DIGIT_NONZERO)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalEclParser.g:6159:3: rule__NonNegativeInteger__Alternatives_1_1
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
    // InternalEclParser.g:6168:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6172:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // InternalEclParser.g:6173:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
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
    // InternalEclParser.g:6180:1: rule__Integer__Group__0__Impl : ( ( rule__Integer__Alternatives_0 )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6184:1: ( ( ( rule__Integer__Alternatives_0 )? ) )
            // InternalEclParser.g:6185:1: ( ( rule__Integer__Alternatives_0 )? )
            {
            // InternalEclParser.g:6185:1: ( ( rule__Integer__Alternatives_0 )? )
            // InternalEclParser.g:6186:2: ( rule__Integer__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getIntegerAccess().getAlternatives_0()); 
            }
            // InternalEclParser.g:6187:2: ( rule__Integer__Alternatives_0 )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( ((LA40_0>=RULE_PLUS && LA40_0<=RULE_DASH)) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalEclParser.g:6187:3: rule__Integer__Alternatives_0
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
    // InternalEclParser.g:6195:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6199:1: ( rule__Integer__Group__1__Impl )
            // InternalEclParser.g:6200:2: rule__Integer__Group__1__Impl
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
    // InternalEclParser.g:6206:1: rule__Integer__Group__1__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6210:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6211:1: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6211:1: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6212:2: ruleNonNegativeInteger
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
    // InternalEclParser.g:6222:1: rule__Decimal__Group__0 : rule__Decimal__Group__0__Impl rule__Decimal__Group__1 ;
    public final void rule__Decimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6226:1: ( rule__Decimal__Group__0__Impl rule__Decimal__Group__1 )
            // InternalEclParser.g:6227:2: rule__Decimal__Group__0__Impl rule__Decimal__Group__1
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
    // InternalEclParser.g:6234:1: rule__Decimal__Group__0__Impl : ( ( rule__Decimal__Alternatives_0 )? ) ;
    public final void rule__Decimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6238:1: ( ( ( rule__Decimal__Alternatives_0 )? ) )
            // InternalEclParser.g:6239:1: ( ( rule__Decimal__Alternatives_0 )? )
            {
            // InternalEclParser.g:6239:1: ( ( rule__Decimal__Alternatives_0 )? )
            // InternalEclParser.g:6240:2: ( rule__Decimal__Alternatives_0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getDecimalAccess().getAlternatives_0()); 
            }
            // InternalEclParser.g:6241:2: ( rule__Decimal__Alternatives_0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( ((LA41_0>=RULE_PLUS && LA41_0<=RULE_DASH)) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalEclParser.g:6241:3: rule__Decimal__Alternatives_0
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
    // InternalEclParser.g:6249:1: rule__Decimal__Group__1 : rule__Decimal__Group__1__Impl ;
    public final void rule__Decimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6253:1: ( rule__Decimal__Group__1__Impl )
            // InternalEclParser.g:6254:2: rule__Decimal__Group__1__Impl
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
    // InternalEclParser.g:6260:1: rule__Decimal__Group__1__Impl : ( ruleNonNegativeDecimal ) ;
    public final void rule__Decimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6264:1: ( ( ruleNonNegativeDecimal ) )
            // InternalEclParser.g:6265:1: ( ruleNonNegativeDecimal )
            {
            // InternalEclParser.g:6265:1: ( ruleNonNegativeDecimal )
            // InternalEclParser.g:6266:2: ruleNonNegativeDecimal
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
    // InternalEclParser.g:6276:1: rule__NonNegativeDecimal__Group__0 : rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 ;
    public final void rule__NonNegativeDecimal__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6280:1: ( rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1 )
            // InternalEclParser.g:6281:2: rule__NonNegativeDecimal__Group__0__Impl rule__NonNegativeDecimal__Group__1
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
    // InternalEclParser.g:6288:1: rule__NonNegativeDecimal__Group__0__Impl : ( ruleNonNegativeInteger ) ;
    public final void rule__NonNegativeDecimal__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6292:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6293:1: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6293:1: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6294:2: ruleNonNegativeInteger
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
    // InternalEclParser.g:6303:1: rule__NonNegativeDecimal__Group__1 : rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 ;
    public final void rule__NonNegativeDecimal__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6307:1: ( rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2 )
            // InternalEclParser.g:6308:2: rule__NonNegativeDecimal__Group__1__Impl rule__NonNegativeDecimal__Group__2
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
    // InternalEclParser.g:6315:1: rule__NonNegativeDecimal__Group__1__Impl : ( RULE_DOT ) ;
    public final void rule__NonNegativeDecimal__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6319:1: ( ( RULE_DOT ) )
            // InternalEclParser.g:6320:1: ( RULE_DOT )
            {
            // InternalEclParser.g:6320:1: ( RULE_DOT )
            // InternalEclParser.g:6321:2: RULE_DOT
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
    // InternalEclParser.g:6330:1: rule__NonNegativeDecimal__Group__2 : rule__NonNegativeDecimal__Group__2__Impl ;
    public final void rule__NonNegativeDecimal__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6334:1: ( rule__NonNegativeDecimal__Group__2__Impl )
            // InternalEclParser.g:6335:2: rule__NonNegativeDecimal__Group__2__Impl
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
    // InternalEclParser.g:6341:1: rule__NonNegativeDecimal__Group__2__Impl : ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) ;
    public final void rule__NonNegativeDecimal__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6345:1: ( ( ( rule__NonNegativeDecimal__Alternatives_2 )* ) )
            // InternalEclParser.g:6346:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            {
            // InternalEclParser.g:6346:1: ( ( rule__NonNegativeDecimal__Alternatives_2 )* )
            // InternalEclParser.g:6347:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNonNegativeDecimalAccess().getAlternatives_2()); 
            }
            // InternalEclParser.g:6348:2: ( rule__NonNegativeDecimal__Alternatives_2 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_ZERO && LA42_0<=RULE_DIGIT_NONZERO)) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalEclParser.g:6348:3: rule__NonNegativeDecimal__Alternatives_2
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
    // InternalEclParser.g:6357:1: rule__Script__ConstraintAssignment_1 : ( ruleExpressionConstraint ) ;
    public final void rule__Script__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6361:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:6362:2: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:6362:2: ( ruleExpressionConstraint )
            // InternalEclParser.g:6363:3: ruleExpressionConstraint
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
    // InternalEclParser.g:6372:1: rule__OrExpressionConstraint__RightAssignment_1_2 : ( ruleAndExpressionConstraint ) ;
    public final void rule__OrExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6376:1: ( ( ruleAndExpressionConstraint ) )
            // InternalEclParser.g:6377:2: ( ruleAndExpressionConstraint )
            {
            // InternalEclParser.g:6377:2: ( ruleAndExpressionConstraint )
            // InternalEclParser.g:6378:3: ruleAndExpressionConstraint
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
    // InternalEclParser.g:6387:1: rule__AndExpressionConstraint__RightAssignment_1_2 : ( ruleExclusionExpressionConstraint ) ;
    public final void rule__AndExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6391:1: ( ( ruleExclusionExpressionConstraint ) )
            // InternalEclParser.g:6392:2: ( ruleExclusionExpressionConstraint )
            {
            // InternalEclParser.g:6392:2: ( ruleExclusionExpressionConstraint )
            // InternalEclParser.g:6393:3: ruleExclusionExpressionConstraint
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
    // InternalEclParser.g:6402:1: rule__ExclusionExpressionConstraint__RightAssignment_1_2 : ( ruleRefinedExpressionConstraint ) ;
    public final void rule__ExclusionExpressionConstraint__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6406:1: ( ( ruleRefinedExpressionConstraint ) )
            // InternalEclParser.g:6407:2: ( ruleRefinedExpressionConstraint )
            {
            // InternalEclParser.g:6407:2: ( ruleRefinedExpressionConstraint )
            // InternalEclParser.g:6408:3: ruleRefinedExpressionConstraint
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
    // InternalEclParser.g:6417:1: rule__RefinedExpressionConstraint__RefinementAssignment_1_2 : ( ruleEclRefinement ) ;
    public final void rule__RefinedExpressionConstraint__RefinementAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6421:1: ( ( ruleEclRefinement ) )
            // InternalEclParser.g:6422:2: ( ruleEclRefinement )
            {
            // InternalEclParser.g:6422:2: ( ruleEclRefinement )
            // InternalEclParser.g:6423:3: ruleEclRefinement
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
    // InternalEclParser.g:6432:1: rule__DottedExpressionConstraint__AttributeAssignment_1_2 : ( ruleSubExpressionConstraint ) ;
    public final void rule__DottedExpressionConstraint__AttributeAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6436:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6437:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6437:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6438:3: ruleSubExpressionConstraint
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
    // InternalEclParser.g:6447:1: rule__ChildOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ChildOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6451:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6452:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6452:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6453:3: ruleEclFocusConcept
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


    // $ANTLR start "rule__DescendantOf__ConstraintAssignment_1"
    // InternalEclParser.g:6462:1: rule__DescendantOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__DescendantOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6466:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6467:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6467:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6468:3: ruleEclFocusConcept
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
    // InternalEclParser.g:6477:1: rule__DescendantOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__DescendantOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6481:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6482:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6482:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6483:3: ruleEclFocusConcept
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
    // InternalEclParser.g:6492:1: rule__ParentOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__ParentOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6496:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6497:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6497:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6498:3: ruleEclFocusConcept
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


    // $ANTLR start "rule__AncestorOf__ConstraintAssignment_1"
    // InternalEclParser.g:6507:1: rule__AncestorOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__AncestorOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6511:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6512:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6512:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6513:3: ruleEclFocusConcept
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
    // InternalEclParser.g:6522:1: rule__AncestorOrSelfOf__ConstraintAssignment_1 : ( ruleEclFocusConcept ) ;
    public final void rule__AncestorOrSelfOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6526:1: ( ( ruleEclFocusConcept ) )
            // InternalEclParser.g:6527:2: ( ruleEclFocusConcept )
            {
            // InternalEclParser.g:6527:2: ( ruleEclFocusConcept )
            // InternalEclParser.g:6528:3: ruleEclFocusConcept
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
    // InternalEclParser.g:6537:1: rule__MemberOf__ConstraintAssignment_1 : ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) ) ;
    public final void rule__MemberOf__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6541:1: ( ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) ) )
            // InternalEclParser.g:6542:2: ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) )
            {
            // InternalEclParser.g:6542:2: ( ( rule__MemberOf__ConstraintAlternatives_1_0 ) )
            // InternalEclParser.g:6543:3: ( rule__MemberOf__ConstraintAlternatives_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getMemberOfAccess().getConstraintAlternatives_1_0()); 
            }
            // InternalEclParser.g:6544:3: ( rule__MemberOf__ConstraintAlternatives_1_0 )
            // InternalEclParser.g:6544:4: rule__MemberOf__ConstraintAlternatives_1_0
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
    // InternalEclParser.g:6552:1: rule__EclConceptReference__IdAssignment_0 : ( ruleSnomedIdentifier ) ;
    public final void rule__EclConceptReference__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6556:1: ( ( ruleSnomedIdentifier ) )
            // InternalEclParser.g:6557:2: ( ruleSnomedIdentifier )
            {
            // InternalEclParser.g:6557:2: ( ruleSnomedIdentifier )
            // InternalEclParser.g:6558:3: ruleSnomedIdentifier
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
    // InternalEclParser.g:6567:1: rule__EclConceptReference__TermAssignment_1 : ( RULE_TERM_STRING ) ;
    public final void rule__EclConceptReference__TermAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6571:1: ( ( RULE_TERM_STRING ) )
            // InternalEclParser.g:6572:2: ( RULE_TERM_STRING )
            {
            // InternalEclParser.g:6572:2: ( RULE_TERM_STRING )
            // InternalEclParser.g:6573:3: RULE_TERM_STRING
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
    // InternalEclParser.g:6582:1: rule__OrRefinement__RightAssignment_1_0_2 : ( ruleAndRefinement ) ;
    public final void rule__OrRefinement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6586:1: ( ( ruleAndRefinement ) )
            // InternalEclParser.g:6587:2: ( ruleAndRefinement )
            {
            // InternalEclParser.g:6587:2: ( ruleAndRefinement )
            // InternalEclParser.g:6588:3: ruleAndRefinement
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
    // InternalEclParser.g:6597:1: rule__AndRefinement__RightAssignment_1_0_2 : ( ruleSubRefinement ) ;
    public final void rule__AndRefinement__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6601:1: ( ( ruleSubRefinement ) )
            // InternalEclParser.g:6602:2: ( ruleSubRefinement )
            {
            // InternalEclParser.g:6602:2: ( ruleSubRefinement )
            // InternalEclParser.g:6603:3: ruleSubRefinement
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
    // InternalEclParser.g:6612:1: rule__NestedRefinement__NestedAssignment_1 : ( ruleEclRefinement ) ;
    public final void rule__NestedRefinement__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6616:1: ( ( ruleEclRefinement ) )
            // InternalEclParser.g:6617:2: ( ruleEclRefinement )
            {
            // InternalEclParser.g:6617:2: ( ruleEclRefinement )
            // InternalEclParser.g:6618:3: ruleEclRefinement
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
    // InternalEclParser.g:6627:1: rule__EclAttributeGroup__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__EclAttributeGroup__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6631:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:6632:2: ( ruleCardinality )
            {
            // InternalEclParser.g:6632:2: ( ruleCardinality )
            // InternalEclParser.g:6633:3: ruleCardinality
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
    // InternalEclParser.g:6642:1: rule__EclAttributeGroup__RefinementAssignment_2 : ( ruleEclAttributeSet ) ;
    public final void rule__EclAttributeGroup__RefinementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6646:1: ( ( ruleEclAttributeSet ) )
            // InternalEclParser.g:6647:2: ( ruleEclAttributeSet )
            {
            // InternalEclParser.g:6647:2: ( ruleEclAttributeSet )
            // InternalEclParser.g:6648:3: ruleEclAttributeSet
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
    // InternalEclParser.g:6657:1: rule__OrAttributeSet__RightAssignment_1_2 : ( ruleAndAttributeSet ) ;
    public final void rule__OrAttributeSet__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6661:1: ( ( ruleAndAttributeSet ) )
            // InternalEclParser.g:6662:2: ( ruleAndAttributeSet )
            {
            // InternalEclParser.g:6662:2: ( ruleAndAttributeSet )
            // InternalEclParser.g:6663:3: ruleAndAttributeSet
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
    // InternalEclParser.g:6672:1: rule__AndAttributeSet__RightAssignment_1_2 : ( ruleSubAttributeSet ) ;
    public final void rule__AndAttributeSet__RightAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6676:1: ( ( ruleSubAttributeSet ) )
            // InternalEclParser.g:6677:2: ( ruleSubAttributeSet )
            {
            // InternalEclParser.g:6677:2: ( ruleSubAttributeSet )
            // InternalEclParser.g:6678:3: ruleSubAttributeSet
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
    // InternalEclParser.g:6687:1: rule__NestedAttributeSet__NestedAssignment_1 : ( ruleEclAttributeSet ) ;
    public final void rule__NestedAttributeSet__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6691:1: ( ( ruleEclAttributeSet ) )
            // InternalEclParser.g:6692:2: ( ruleEclAttributeSet )
            {
            // InternalEclParser.g:6692:2: ( ruleEclAttributeSet )
            // InternalEclParser.g:6693:3: ruleEclAttributeSet
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
    // InternalEclParser.g:6702:1: rule__AttributeConstraint__CardinalityAssignment_0 : ( ruleCardinality ) ;
    public final void rule__AttributeConstraint__CardinalityAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6706:1: ( ( ruleCardinality ) )
            // InternalEclParser.g:6707:2: ( ruleCardinality )
            {
            // InternalEclParser.g:6707:2: ( ruleCardinality )
            // InternalEclParser.g:6708:3: ruleCardinality
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
    // InternalEclParser.g:6717:1: rule__AttributeConstraint__ReversedAssignment_1 : ( RULE_REVERSED ) ;
    public final void rule__AttributeConstraint__ReversedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6721:1: ( ( RULE_REVERSED ) )
            // InternalEclParser.g:6722:2: ( RULE_REVERSED )
            {
            // InternalEclParser.g:6722:2: ( RULE_REVERSED )
            // InternalEclParser.g:6723:3: RULE_REVERSED
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
    // InternalEclParser.g:6732:1: rule__AttributeConstraint__AttributeAssignment_2 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeConstraint__AttributeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6736:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6737:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6737:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6738:3: ruleSubExpressionConstraint
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
    // InternalEclParser.g:6747:1: rule__AttributeConstraint__ComparisonAssignment_3 : ( ruleComparison ) ;
    public final void rule__AttributeConstraint__ComparisonAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6751:1: ( ( ruleComparison ) )
            // InternalEclParser.g:6752:2: ( ruleComparison )
            {
            // InternalEclParser.g:6752:2: ( ruleComparison )
            // InternalEclParser.g:6753:3: ruleComparison
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
    // InternalEclParser.g:6762:1: rule__Cardinality__MinAssignment_1 : ( ruleNonNegativeInteger ) ;
    public final void rule__Cardinality__MinAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6766:1: ( ( ruleNonNegativeInteger ) )
            // InternalEclParser.g:6767:2: ( ruleNonNegativeInteger )
            {
            // InternalEclParser.g:6767:2: ( ruleNonNegativeInteger )
            // InternalEclParser.g:6768:3: ruleNonNegativeInteger
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
    // InternalEclParser.g:6777:1: rule__Cardinality__MaxAssignment_3 : ( ruleMaxValue ) ;
    public final void rule__Cardinality__MaxAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6781:1: ( ( ruleMaxValue ) )
            // InternalEclParser.g:6782:2: ( ruleMaxValue )
            {
            // InternalEclParser.g:6782:2: ( ruleMaxValue )
            // InternalEclParser.g:6783:3: ruleMaxValue
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
    // InternalEclParser.g:6792:1: rule__AttributeValueEquals__ConstraintAssignment_1 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeValueEquals__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6796:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6797:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6797:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6798:3: ruleSubExpressionConstraint
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
    // InternalEclParser.g:6807:1: rule__AttributeValueNotEquals__ConstraintAssignment_1 : ( ruleSubExpressionConstraint ) ;
    public final void rule__AttributeValueNotEquals__ConstraintAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6811:1: ( ( ruleSubExpressionConstraint ) )
            // InternalEclParser.g:6812:2: ( ruleSubExpressionConstraint )
            {
            // InternalEclParser.g:6812:2: ( ruleSubExpressionConstraint )
            // InternalEclParser.g:6813:3: ruleSubExpressionConstraint
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
    // InternalEclParser.g:6822:1: rule__BooleanValueEquals__ValueAssignment_1 : ( ruleBoolean ) ;
    public final void rule__BooleanValueEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6826:1: ( ( ruleBoolean ) )
            // InternalEclParser.g:6827:2: ( ruleBoolean )
            {
            // InternalEclParser.g:6827:2: ( ruleBoolean )
            // InternalEclParser.g:6828:3: ruleBoolean
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
    // InternalEclParser.g:6837:1: rule__BooleanValueNotEquals__ValueAssignment_1 : ( ruleBoolean ) ;
    public final void rule__BooleanValueNotEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6841:1: ( ( ruleBoolean ) )
            // InternalEclParser.g:6842:2: ( ruleBoolean )
            {
            // InternalEclParser.g:6842:2: ( ruleBoolean )
            // InternalEclParser.g:6843:3: ruleBoolean
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
    // InternalEclParser.g:6852:1: rule__StringValueEquals__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValueEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6856:1: ( ( RULE_STRING ) )
            // InternalEclParser.g:6857:2: ( RULE_STRING )
            {
            // InternalEclParser.g:6857:2: ( RULE_STRING )
            // InternalEclParser.g:6858:3: RULE_STRING
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
    // InternalEclParser.g:6867:1: rule__StringValueNotEquals__ValueAssignment_1 : ( RULE_STRING ) ;
    public final void rule__StringValueNotEquals__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6871:1: ( ( RULE_STRING ) )
            // InternalEclParser.g:6872:2: ( RULE_STRING )
            {
            // InternalEclParser.g:6872:2: ( RULE_STRING )
            // InternalEclParser.g:6873:3: RULE_STRING
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
    // InternalEclParser.g:6882:1: rule__IntegerValueEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6886:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6887:2: ( ruleInteger )
            {
            // InternalEclParser.g:6887:2: ( ruleInteger )
            // InternalEclParser.g:6888:3: ruleInteger
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
    // InternalEclParser.g:6897:1: rule__IntegerValueNotEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueNotEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6901:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6902:2: ( ruleInteger )
            {
            // InternalEclParser.g:6902:2: ( ruleInteger )
            // InternalEclParser.g:6903:3: ruleInteger
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
    // InternalEclParser.g:6912:1: rule__IntegerValueGreaterThan__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueGreaterThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6916:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6917:2: ( ruleInteger )
            {
            // InternalEclParser.g:6917:2: ( ruleInteger )
            // InternalEclParser.g:6918:3: ruleInteger
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
    // InternalEclParser.g:6927:1: rule__IntegerValueLessThan__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueLessThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6931:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6932:2: ( ruleInteger )
            {
            // InternalEclParser.g:6932:2: ( ruleInteger )
            // InternalEclParser.g:6933:3: ruleInteger
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
    // InternalEclParser.g:6942:1: rule__IntegerValueGreaterThanEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueGreaterThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6946:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6947:2: ( ruleInteger )
            {
            // InternalEclParser.g:6947:2: ( ruleInteger )
            // InternalEclParser.g:6948:3: ruleInteger
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
    // InternalEclParser.g:6957:1: rule__IntegerValueLessThanEquals__ValueAssignment_2 : ( ruleInteger ) ;
    public final void rule__IntegerValueLessThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6961:1: ( ( ruleInteger ) )
            // InternalEclParser.g:6962:2: ( ruleInteger )
            {
            // InternalEclParser.g:6962:2: ( ruleInteger )
            // InternalEclParser.g:6963:3: ruleInteger
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
    // InternalEclParser.g:6972:1: rule__DecimalValueEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6976:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:6977:2: ( ruleDecimal )
            {
            // InternalEclParser.g:6977:2: ( ruleDecimal )
            // InternalEclParser.g:6978:3: ruleDecimal
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
    // InternalEclParser.g:6987:1: rule__DecimalValueNotEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueNotEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:6991:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:6992:2: ( ruleDecimal )
            {
            // InternalEclParser.g:6992:2: ( ruleDecimal )
            // InternalEclParser.g:6993:3: ruleDecimal
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
    // InternalEclParser.g:7002:1: rule__DecimalValueGreaterThan__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueGreaterThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7006:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7007:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7007:2: ( ruleDecimal )
            // InternalEclParser.g:7008:3: ruleDecimal
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
    // InternalEclParser.g:7017:1: rule__DecimalValueLessThan__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueLessThan__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7021:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7022:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7022:2: ( ruleDecimal )
            // InternalEclParser.g:7023:3: ruleDecimal
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
    // InternalEclParser.g:7032:1: rule__DecimalValueGreaterThanEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueGreaterThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7036:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7037:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7037:2: ( ruleDecimal )
            // InternalEclParser.g:7038:3: ruleDecimal
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
    // InternalEclParser.g:7047:1: rule__DecimalValueLessThanEquals__ValueAssignment_2 : ( ruleDecimal ) ;
    public final void rule__DecimalValueLessThanEquals__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7051:1: ( ( ruleDecimal ) )
            // InternalEclParser.g:7052:2: ( ruleDecimal )
            {
            // InternalEclParser.g:7052:2: ( ruleDecimal )
            // InternalEclParser.g:7053:3: ruleDecimal
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
    // InternalEclParser.g:7062:1: rule__NestedExpression__NestedAssignment_1 : ( ruleExpressionConstraint ) ;
    public final void rule__NestedExpression__NestedAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEclParser.g:7066:1: ( ( ruleExpressionConstraint ) )
            // InternalEclParser.g:7067:2: ( ruleExpressionConstraint )
            {
            // InternalEclParser.g:7067:2: ( ruleExpressionConstraint )
            // InternalEclParser.g:7068:3: ruleExpressionConstraint
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

    // $ANTLR start synpred14_InternalEclParser
    public final void synpred14_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1783:2: ( ( ruleAttributeConstraint ) )
        // InternalEclParser.g:1783:2: ( ruleAttributeConstraint )
        {
        // InternalEclParser.g:1783:2: ( ruleAttributeConstraint )
        // InternalEclParser.g:1784:3: ruleAttributeConstraint
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
    // $ANTLR end synpred14_InternalEclParser

    // $ANTLR start synpred15_InternalEclParser
    public final void synpred15_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1789:2: ( ( ruleEclAttributeGroup ) )
        // InternalEclParser.g:1789:2: ( ruleEclAttributeGroup )
        {
        // InternalEclParser.g:1789:2: ( ruleEclAttributeGroup )
        // InternalEclParser.g:1790:3: ruleEclAttributeGroup
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
    // $ANTLR end synpred15_InternalEclParser

    // $ANTLR start synpred17_InternalEclParser
    public final void synpred17_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:1831:2: ( ( ruleAttributeConstraint ) )
        // InternalEclParser.g:1831:2: ( ruleAttributeConstraint )
        {
        // InternalEclParser.g:1831:2: ( ruleAttributeConstraint )
        // InternalEclParser.g:1832:3: ruleAttributeConstraint
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
    // $ANTLR end synpred17_InternalEclParser

    // $ANTLR start synpred54_InternalEclParser
    public final void synpred54_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:3506:3: ( rule__OrRefinement__Group_1__0 )
        // InternalEclParser.g:3506:3: rule__OrRefinement__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__OrRefinement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred54_InternalEclParser

    // $ANTLR start synpred55_InternalEclParser
    public final void synpred55_InternalEclParser_fragment() throws RecognitionException {   
        // InternalEclParser.g:3668:3: ( rule__AndRefinement__Group_1__0 )
        // InternalEclParser.g:3668:3: rule__AndRefinement__Group_1__0
        {
        pushFollow(FollowSets000.FOLLOW_2);
        rule__AndRefinement__Group_1__0();

        state._fsp--;
        if (state.failed) return ;

        }
    }
    // $ANTLR end synpred55_InternalEclParser

    // Delegated rules

    public final boolean synpred55_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred55_InternalEclParser_fragment(); // can never throw exception
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
    public final boolean synpred54_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred54_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalEclParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalEclParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalEclParser_fragment(); // can never throw exception
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
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\7\1\0\12\uffff\1\0\2\uffff";
    static final String dfa_3s = "\1\42\1\0\12\uffff\1\0\2\uffff";
    static final String dfa_4s = "\2\uffff\1\1\12\uffff\1\2\1\3";
    static final String dfa_5s = "\1\uffff\1\0\12\uffff\1\1\2\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\6\uffff\1\2\1\uffff\1\15\1\uffff\1\14\1\uffff\1\1\3\uffff\1\2\1\uffff\1\2\2\uffff\6\2",
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
            return "1778:1: rule__SubRefinement__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleEclAttributeGroup ) | ( ruleNestedRefinement ) );";
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
                        if ( (synpred14_InternalEclParser()) ) {s = 2;}

                        else if ( (synpred15_InternalEclParser()) ) {s = 13;}

                         
                        input.seek(index6_1);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA6_12 = input.LA(1);

                         
                        int index6_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred14_InternalEclParser()) ) {s = 2;}

                        else if ( (true) ) {s = 14;}

                         
                        input.seek(index6_12);
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
    static final String dfa_7s = "\16\uffff";
    static final String dfa_8s = "\1\7\13\uffff\1\0\1\uffff";
    static final String dfa_9s = "\1\42\13\uffff\1\0\1\uffff";
    static final String dfa_10s = "\1\uffff\1\1\13\uffff\1\2";
    static final String dfa_11s = "\14\uffff\1\0\1\uffff}>";
    static final String[] dfa_12s = {
            "\1\1\6\uffff\1\1\3\uffff\1\14\1\uffff\1\1\3\uffff\1\1\1\uffff\1\1\2\uffff\6\1",
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
            return "1826:1: rule__SubAttributeSet__Alternatives : ( ( ruleAttributeConstraint ) | ( ruleNestedAttributeSet ) );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA8_12 = input.LA(1);

                         
                        int index8_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (synpred17_InternalEclParser()) ) {s = 1;}

                        else if ( (true) ) {s = 13;}

                         
                        input.seek(index8_12);
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
    static final String dfa_14s = "\23\uffff\2\51\2\uffff\2\55\2\uffff\2\61\2\uffff\2\65\2\uffff\2\71\2\uffff\2\75\2\uffff\2\51\2\uffff\2\55\2\uffff\2\61\2\uffff\2\65\2\uffff\2\71\2\uffff\2\75";
    static final String dfa_15s = "\1\33\2\4\4\45\1\15\2\uffff\1\15\2\uffff\6\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\15\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11\2\uffff\2\11";
    static final String dfa_16s = "\1\44\2\51\4\45\1\27\2\uffff\1\27\2\uffff\4\27\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\16\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31\2\uffff\2\31";
    static final String dfa_17s = "\10\uffff\1\3\1\1\1\uffff\1\4\1\2\34\uffff\1\5\1\13\2\uffff\1\6\1\14\2\uffff\1\7\1\15\2\uffff\1\10\1\16\2\uffff\1\11\1\17\2\uffff\1\12\1\20\2\uffff";
    static final String dfa_18s = "\101\uffff}>";
    static final String[] dfa_19s = {
            "\1\1\1\2\1\5\1\3\4\uffff\1\4\1\6",
            "\2\11\37\uffff\1\7\3\uffff\1\10",
            "\2\14\37\uffff\1\12\3\uffff\1\13",
            "\1\15",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\23\1\24\7\uffff\1\21\1\22",
            "",
            "",
            "\1\27\1\30\7\uffff\1\25\1\26",
            "",
            "",
            "\1\33\1\34\7\uffff\1\31\1\32",
            "\1\37\1\40\7\uffff\1\35\1\36",
            "\1\43\1\44\7\uffff\1\41\1\42",
            "\1\47\1\50\7\uffff\1\45\1\46",
            "\1\23\1\24",
            "\1\23\1\24",
            "\4\51\4\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\1\27\1\30",
            "\1\27\1\30",
            "\4\55\4\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\1\33\1\34",
            "\1\33\1\34",
            "\4\61\4\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\1\37\1\40",
            "\1\37\1\40",
            "\4\65\4\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\1\43\1\44",
            "\1\43\1\44",
            "\4\71\4\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\1\47\1\50",
            "\1\47\1\50",
            "\4\75\4\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "",
            "",
            "\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "\4\51\1\54\1\53\2\uffff\1\51\1\uffff\1\51\5\uffff\1\52",
            "",
            "",
            "\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "\4\55\1\60\1\57\2\uffff\1\55\1\uffff\1\55\5\uffff\1\56",
            "",
            "",
            "\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "\4\61\1\64\1\63\2\uffff\1\61\1\uffff\1\61\5\uffff\1\62",
            "",
            "",
            "\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "\4\65\1\70\1\67\2\uffff\1\65\1\uffff\1\65\5\uffff\1\66",
            "",
            "",
            "\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "\4\71\1\74\1\73\2\uffff\1\71\1\uffff\1\71\5\uffff\1\72",
            "",
            "",
            "\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76",
            "\4\75\1\100\1\77\2\uffff\1\75\1\uffff\1\75\5\uffff\1\76"
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
            return "1889:1: rule__DataTypeComparison__Alternatives : ( ( ruleBooleanValueEquals ) | ( ruleBooleanValueNotEquals ) | ( ruleStringValueEquals ) | ( ruleStringValueNotEquals ) | ( ruleIntegerValueEquals ) | ( ruleIntegerValueNotEquals ) | ( ruleIntegerValueGreaterThan ) | ( ruleIntegerValueGreaterThanEquals ) | ( ruleIntegerValueLessThan ) | ( ruleIntegerValueLessThanEquals ) | ( ruleDecimalValueEquals ) | ( ruleDecimalValueNotEquals ) | ( ruleDecimalValueGreaterThan ) | ( ruleDecimalValueGreaterThanEquals ) | ( ruleDecimalValueLessThan ) | ( ruleDecimalValueLessThanEquals ) );";
        }
    }
 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x00000007E5044000L});
        public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000802L});
        public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000600L});
        public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000602L});
        public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000007E5154080L});
        public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000002L});
        public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000110000L});
        public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000007E5144080L});
        public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001878000000L});
        public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000006000L});
        public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000100L});
        public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004006000L});
        public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020000000000L});
        public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000002000000000L});
        public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000C06000L});
        public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000006002L});
    }


}