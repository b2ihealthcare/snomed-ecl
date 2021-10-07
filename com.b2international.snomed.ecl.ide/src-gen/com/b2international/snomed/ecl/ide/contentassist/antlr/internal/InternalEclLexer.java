package com.b2international.snomed.ecl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEclLexer extends Lexer {
    public static final int RULE_DIALECT_KEYWORD=25;
    public static final int RULE_LANGUAGE_KEYWORD=23;
    public static final int RULE_DIGIT_NONZERO=7;
    public static final int RULE_CURLY_OPEN=57;
    public static final int RULE_DBL_GT=53;
    public static final int RULE_ROUND_CLOSE=56;
    public static final int RULE_TO=60;
    public static final int RULE_GT=42;
    public static final int RULE_ACTIVE_KEYWORD=26;
    public static final int RULE_CONCEPT_SHORT_KEYWORD=38;
    public static final int RULE_MODULEID_KEYWORD=24;
    public static final int RULE_GTE=44;
    public static final int RULE_DISJUNCTION_KEYWORD=35;
    public static final int RULE_ROUND_OPEN=55;
    public static final int RULE_DBL_LT=50;
    public static final int RULE_TYPEID_KEYWORD=27;
    public static final int RULE_MATCH_KEYWORD=30;
    public static final int RULE_NOT_EQUAL=41;
    public static final int RULE_SQUARE_CLOSE=61;
    public static final int RULE_SEMANTIC_TAG_KEYWORD=21;
    public static final int RULE_EQUAL=40;
    public static final int RULE_SQUARE_OPEN=59;
    public static final int RULE_COMMA=6;
    public static final int RULE_CASE_SIGNIFICANCE_ID_KEYWORD=14;
    public static final int RULE_EXCLUSION_KEYWORD=28;
    public static final int RULE_DESCRIPTION_SHORT_KEYWORD=37;
    public static final int RULE_LT_EM=48;
    public static final int RULE_CURLY_CLOSE=58;
    public static final int RULE_DBL_GT_EM=52;
    public static final int RULE_COLON=46;
    public static final int RULE_LT=43;
    public static final int RULE_DOUBLE_CURLY_CLOSE=64;
    public static final int RULE_LANGUAGE_REFSET_ID_KEYWORD=17;
    public static final int RULE_EXACT_KEYWORD=29;
    public static final int RULE_ML_COMMENT=67;
    public static final int RULE_PREFERRED_IN_KEYWORD=20;
    public static final int RULE_PIPE_DELIMITED_STRING=66;
    public static final int RULE_LTE=45;
    public static final int RULE_TYPE_KEYWORD=33;
    public static final int RULE_STRING=4;
    public static final int RULE_FALSE_KEYWORD=13;
    public static final int RULE_REVERSED=36;
    public static final int RULE_SL_COMMENT=68;
    public static final int RULE_DIGIT_ZERO=8;
    public static final int RULE_HASH=62;
    public static final int RULE_DASH=11;
    public static final int RULE_PLUS=10;
    public static final int RULE_DOT=47;
    public static final int EOF=-1;
    public static final int RULE_DIALECTID_KEYWORD=22;
    public static final int RULE_KEYWORD=39;
    public static final int RULE_DEFINITION_STATUS_ID_KEYWORD=15;
    public static final int RULE_DEFINITION_STATUS_TOKEN_KEYWORD=16;
    public static final int RULE_ACCEPTABLE_IN_KEYWORD=19;
    public static final int RULE_TERM_KEYWORD=32;
    public static final int RULE_GT_EM=51;
    public static final int RULE_WS=65;
    public static final int RULE_REGEX_KEYWORD=31;
    public static final int RULE_TRUE_KEYWORD=12;
    public static final int RULE_CARET=54;
    public static final int RULE_DOUBLE_CURLY_OPEN=63;
    public static final int RULE_CONJUNCTION_KEYWORD=5;
    public static final int RULE_WILD_KEYWORD=34;
    public static final int RULE_WILDCARD=9;
    public static final int RULE_EFFECTIVE_TIME_KEYWORD=18;
    public static final int RULE_DBL_LT_EM=49;

    // delegates
    // delegators

    public InternalEclLexer() {;} 
    public InternalEclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEcl.g"; }

    // $ANTLR start "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"
    public final void mRULE_CASE_SIGNIFICANCE_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CASE_SIGNIFICANCE_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10967:35: ( ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:10967:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:10967:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // InternalEcl.g:10967:38: 'caseSignificanceId'
                    {
                    match("caseSignificanceId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10967:59: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CASE_SIGNIFICANCE_ID_KEYWORD"

    // $ANTLR start "RULE_DEFINITION_STATUS_ID_KEYWORD"
    public final void mRULE_DEFINITION_STATUS_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DEFINITION_STATUS_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10969:35: ( ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) ) )
            // InternalEcl.g:10969:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            {
            // InternalEcl.g:10969:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )
            int alt2=2;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEcl.g:10969:38: 'definitionStatusId'
                    {
                    match("definitionStatusId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10969:59: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINITION_STATUS_ID_KEYWORD"

    // $ANTLR start "RULE_DEFINITION_STATUS_TOKEN_KEYWORD"
    public final void mRULE_DEFINITION_STATUS_TOKEN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DEFINITION_STATUS_TOKEN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10971:38: ( ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ) )
            // InternalEcl.g:10971:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            {
            // InternalEcl.g:10971:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )
            int alt3=2;
            alt3 = dfa3.predict(input);
            switch (alt3) {
                case 1 :
                    // InternalEcl.g:10971:41: 'definitionStatus'
                    {
                    match("definitionStatus"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10971:60: ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DEFINITION_STATUS_TOKEN_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_REFSET_ID_KEYWORD"
    public final void mRULE_LANGUAGE_REFSET_ID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_REFSET_ID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10973:33: ( ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:10973:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:10973:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalEcl.g:10973:36: 'languageRefsetId'
                    {
                    match("languageRefsetId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10973:55: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_REFSET_ID_KEYWORD"

    // $ANTLR start "RULE_EFFECTIVE_TIME_KEYWORD"
    public final void mRULE_EFFECTIVE_TIME_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EFFECTIVE_TIME_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10975:29: ( ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:10975:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:10975:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            int alt5=2;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalEcl.g:10975:32: 'effectiveTime'
                    {
                    match("effectiveTime"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10975:48: ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EFFECTIVE_TIME_KEYWORD"

    // $ANTLR start "RULE_ACCEPTABLE_IN_KEYWORD"
    public final void mRULE_ACCEPTABLE_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ACCEPTABLE_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10977:28: ( ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEcl.g:10977:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEcl.g:10977:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalEcl.g:10977:31: 'acceptableIn'
                    {
                    match("acceptableIn"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10977:46: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACCEPTABLE_IN_KEYWORD"

    // $ANTLR start "RULE_PREFERRED_IN_KEYWORD"
    public final void mRULE_PREFERRED_IN_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_PREFERRED_IN_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10979:27: ( ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ) )
            // InternalEcl.g:10979:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            {
            // InternalEcl.g:10979:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalEcl.g:10979:30: 'preferredIn'
                    {
                    match("preferredIn"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10979:44: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' )
                    {
                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PREFERRED_IN_KEYWORD"

    // $ANTLR start "RULE_SEMANTIC_TAG_KEYWORD"
    public final void mRULE_SEMANTIC_TAG_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_SEMANTIC_TAG_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10981:27: ( ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ) )
            // InternalEcl.g:10981:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            {
            // InternalEcl.g:10981:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEcl.g:10981:30: 'semanticTag'
                    {
                    match("semanticTag"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10981:44: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' )
                    {
                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEMANTIC_TAG_KEYWORD"

    // $ANTLR start "RULE_DIALECTID_KEYWORD"
    public final void mRULE_DIALECTID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECTID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10983:24: ( ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:10983:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:10983:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalEcl.g:10983:27: 'dialectId'
                    {
                    match("dialectId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10983:39: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIALECTID_KEYWORD"

    // $ANTLR start "RULE_LANGUAGE_KEYWORD"
    public final void mRULE_LANGUAGE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_LANGUAGE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10985:23: ( ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:10985:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:10985:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            int alt10=2;
            alt10 = dfa10.predict(input);
            switch (alt10) {
                case 1 :
                    // InternalEcl.g:10985:26: 'language'
                    {
                    match("language"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10985:37: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LANGUAGE_KEYWORD"

    // $ANTLR start "RULE_MODULEID_KEYWORD"
    public final void mRULE_MODULEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MODULEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10987:23: ( ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:10987:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:10987:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt11=2;
            alt11 = dfa11.predict(input);
            switch (alt11) {
                case 1 :
                    // InternalEcl.g:10987:26: 'moduleId'
                    {
                    match("moduleId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10987:37: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MODULEID_KEYWORD"

    // $ANTLR start "RULE_DIALECT_KEYWORD"
    public final void mRULE_DIALECT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DIALECT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10989:22: ( ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEcl.g:10989:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEcl.g:10989:24: ( 'dialect' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='d') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='i') ) {
                    int LA12_3 = input.LA(3);

                    if ( (LA12_3=='a') ) {
                        int LA12_4 = input.LA(4);

                        if ( (LA12_4=='l') ) {
                            int LA12_5 = input.LA(5);

                            if ( (LA12_5=='e') ) {
                                int LA12_6 = input.LA(6);

                                if ( (LA12_6=='c') ) {
                                    int LA12_7 = input.LA(7);

                                    if ( (LA12_7=='t') ) {
                                        alt12=1;
                                    }
                                    else if ( (LA12_7=='T') ) {
                                        alt12=2;
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 12, 7, input);

                                        throw nvae;
                                    }
                                }
                                else if ( (LA12_6=='C') ) {
                                    alt12=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 12, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA12_5=='E') ) {
                                alt12=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA12_4=='L') ) {
                            alt12=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA12_3=='A') ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA12_1=='I') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA12_0=='D') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalEcl.g:10989:25: 'dialect'
                    {
                    match("dialect"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10989:35: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
                    {
                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIALECT_KEYWORD"

    // $ANTLR start "RULE_ACTIVE_KEYWORD"
    public final void mRULE_ACTIVE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_ACTIVE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10991:21: ( ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:10991:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:10991:23: ( 'active' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='a') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='c') ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3=='t') ) {
                        int LA13_4 = input.LA(4);

                        if ( (LA13_4=='i') ) {
                            int LA13_5 = input.LA(5);

                            if ( (LA13_5=='v') ) {
                                int LA13_6 = input.LA(6);

                                if ( (LA13_6=='e') ) {
                                    alt13=1;
                                }
                                else if ( (LA13_6=='E') ) {
                                    alt13=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 13, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA13_5=='V') ) {
                                alt13=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 13, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA13_4=='I') ) {
                            alt13=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 13, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA13_3=='T') ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA13_1=='C') ) {
                    alt13=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0=='A') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalEcl.g:10991:24: 'active'
                    {
                    match("active"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10991:33: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTIVE_KEYWORD"

    // $ANTLR start "RULE_TYPEID_KEYWORD"
    public final void mRULE_TYPEID_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPEID_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10993:21: ( ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:10993:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:10993:23: ( 'typeId' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='t') ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1=='y') ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3=='p') ) {
                        int LA14_4 = input.LA(4);

                        if ( (LA14_4=='e') ) {
                            int LA14_5 = input.LA(5);

                            if ( (LA14_5=='I') ) {
                                int LA14_6 = input.LA(6);

                                if ( (LA14_6=='d') ) {
                                    alt14=1;
                                }
                                else if ( (LA14_6=='D') ) {
                                    alt14=2;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 14, 6, input);

                                    throw nvae;
                                }
                            }
                            else if ( (LA14_5=='i') ) {
                                alt14=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 14, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA14_4=='E') ) {
                            alt14=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 14, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA14_3=='P') ) {
                        alt14=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA14_1=='Y') ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0=='T') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalEcl.g:10993:24: 'typeId'
                    {
                    match("typeId"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10993:33: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPEID_KEYWORD"

    // $ANTLR start "RULE_EXCLUSION_KEYWORD"
    public final void mRULE_EXCLUSION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EXCLUSION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10995:24: ( ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) ) )
            // InternalEcl.g:10995:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            {
            // InternalEcl.g:10995:26: ( 'MINUS' | ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='M') ) {
                int LA15_1 = input.LA(2);

                if ( (LA15_1=='I') ) {
                    int LA15_3 = input.LA(3);

                    if ( (LA15_3=='N') ) {
                        int LA15_4 = input.LA(4);

                        if ( (LA15_4=='U') ) {
                            int LA15_5 = input.LA(5);

                            if ( (LA15_5=='S') ) {
                                alt15=1;
                            }
                            else if ( (LA15_5=='s') ) {
                                alt15=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 15, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA15_4=='u') ) {
                            alt15=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 15, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA15_3=='n') ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA15_1=='i') ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA15_0=='m') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEcl.g:10995:27: 'MINUS'
                    {
                    match("MINUS"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10995:35: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXCLUSION_KEYWORD"

    // $ANTLR start "RULE_EXACT_KEYWORD"
    public final void mRULE_EXACT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_EXACT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10997:20: ( ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ) )
            // InternalEcl.g:10997:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            {
            // InternalEcl.g:10997:22: ( 'exact' | ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='e') ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1=='x') ) {
                    int LA16_3 = input.LA(3);

                    if ( (LA16_3=='a') ) {
                        int LA16_4 = input.LA(4);

                        if ( (LA16_4=='c') ) {
                            int LA16_5 = input.LA(5);

                            if ( (LA16_5=='t') ) {
                                alt16=1;
                            }
                            else if ( (LA16_5=='T') ) {
                                alt16=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 16, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA16_4=='C') ) {
                            alt16=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 16, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA16_3=='A') ) {
                        alt16=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 16, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA16_1=='X') ) {
                    alt16=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA16_0=='E') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEcl.g:10997:23: 'exact'
                    {
                    match("exact"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10997:31: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' )
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EXACT_KEYWORD"

    // $ANTLR start "RULE_FALSE_KEYWORD"
    public final void mRULE_FALSE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_FALSE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:10999:20: ( ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:10999:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:10999:22: ( 'false' | ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='f') ) {
                int LA17_1 = input.LA(2);

                if ( (LA17_1=='a') ) {
                    int LA17_3 = input.LA(3);

                    if ( (LA17_3=='l') ) {
                        int LA17_4 = input.LA(4);

                        if ( (LA17_4=='s') ) {
                            int LA17_5 = input.LA(5);

                            if ( (LA17_5=='e') ) {
                                alt17=1;
                            }
                            else if ( (LA17_5=='E') ) {
                                alt17=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 17, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA17_4=='S') ) {
                            alt17=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 17, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA17_3=='L') ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA17_1=='A') ) {
                    alt17=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 17, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA17_0=='F') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalEcl.g:10999:23: 'false'
                    {
                    match("false"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:10999:31: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_FALSE_KEYWORD"

    // $ANTLR start "RULE_MATCH_KEYWORD"
    public final void mRULE_MATCH_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_MATCH_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11001:20: ( ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) ) )
            // InternalEcl.g:11001:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            {
            // InternalEcl.g:11001:22: ( 'match' | ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='m') ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1=='a') ) {
                    int LA18_3 = input.LA(3);

                    if ( (LA18_3=='t') ) {
                        int LA18_4 = input.LA(4);

                        if ( (LA18_4=='c') ) {
                            int LA18_5 = input.LA(5);

                            if ( (LA18_5=='h') ) {
                                alt18=1;
                            }
                            else if ( (LA18_5=='H') ) {
                                alt18=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 18, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA18_4=='C') ) {
                            alt18=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 18, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA18_3=='T') ) {
                        alt18=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA18_1=='A') ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA18_0=='M') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // InternalEcl.g:11001:23: 'match'
                    {
                    match("match"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11001:31: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
                    {
                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MATCH_KEYWORD"

    // $ANTLR start "RULE_REGEX_KEYWORD"
    public final void mRULE_REGEX_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_REGEX_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11003:20: ( ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) ) )
            // InternalEcl.g:11003:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            {
            // InternalEcl.g:11003:22: ( 'regex' | ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='r') ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1=='e') ) {
                    int LA19_3 = input.LA(3);

                    if ( (LA19_3=='g') ) {
                        int LA19_4 = input.LA(4);

                        if ( (LA19_4=='e') ) {
                            int LA19_5 = input.LA(5);

                            if ( (LA19_5=='x') ) {
                                alt19=1;
                            }
                            else if ( (LA19_5=='X') ) {
                                alt19=2;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 19, 5, input);

                                throw nvae;
                            }
                        }
                        else if ( (LA19_4=='E') ) {
                            alt19=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 19, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA19_3=='G') ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA19_1=='E') ) {
                    alt19=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA19_0=='R') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalEcl.g:11003:23: 'regex'
                    {
                    match("regex"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11003:31: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
                    {
                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REGEX_KEYWORD"

    // $ANTLR start "RULE_TERM_KEYWORD"
    public final void mRULE_TERM_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TERM_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11005:19: ( ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) ) )
            // InternalEcl.g:11005:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            {
            // InternalEcl.g:11005:21: ( 'term' | ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='t') ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1=='e') ) {
                    int LA20_3 = input.LA(3);

                    if ( (LA20_3=='r') ) {
                        int LA20_4 = input.LA(4);

                        if ( (LA20_4=='m') ) {
                            alt20=1;
                        }
                        else if ( (LA20_4=='M') ) {
                            alt20=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA20_3=='R') ) {
                        alt20=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA20_1=='E') ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA20_0=='T') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEcl.g:11005:22: 'term'
                    {
                    match("term"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11005:29: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TERM_KEYWORD"

    // $ANTLR start "RULE_TRUE_KEYWORD"
    public final void mRULE_TRUE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TRUE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11007:19: ( ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:11007:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:11007:21: ( 'true' | ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='t') ) {
                int LA21_1 = input.LA(2);

                if ( (LA21_1=='r') ) {
                    int LA21_3 = input.LA(3);

                    if ( (LA21_3=='u') ) {
                        int LA21_4 = input.LA(4);

                        if ( (LA21_4=='e') ) {
                            alt21=1;
                        }
                        else if ( (LA21_4=='E') ) {
                            alt21=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA21_3=='U') ) {
                        alt21=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA21_1=='R') ) {
                    alt21=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA21_0=='T') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEcl.g:11007:22: 'true'
                    {
                    match("true"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11007:29: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TRUE_KEYWORD"

    // $ANTLR start "RULE_TYPE_KEYWORD"
    public final void mRULE_TYPE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_TYPE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11009:19: ( ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ) )
            // InternalEcl.g:11009:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            {
            // InternalEcl.g:11009:21: ( 'type' | ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='t') ) {
                int LA22_1 = input.LA(2);

                if ( (LA22_1=='y') ) {
                    int LA22_3 = input.LA(3);

                    if ( (LA22_3=='p') ) {
                        int LA22_4 = input.LA(4);

                        if ( (LA22_4=='e') ) {
                            alt22=1;
                        }
                        else if ( (LA22_4=='E') ) {
                            alt22=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 22, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA22_3=='P') ) {
                        alt22=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 22, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA22_1=='Y') ) {
                    alt22=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA22_0=='T') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEcl.g:11009:22: 'type'
                    {
                    match("type"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11009:29: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
                    {
                    if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TYPE_KEYWORD"

    // $ANTLR start "RULE_WILD_KEYWORD"
    public final void mRULE_WILD_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_WILD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11011:19: ( ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:11011:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:11011:21: ( 'wild' | ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='w') ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1=='i') ) {
                    int LA23_3 = input.LA(3);

                    if ( (LA23_3=='l') ) {
                        int LA23_4 = input.LA(4);

                        if ( (LA23_4=='d') ) {
                            alt23=1;
                        }
                        else if ( (LA23_4=='D') ) {
                            alt23=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 23, 4, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA23_3=='L') ) {
                        alt23=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA23_1=='I') ) {
                    alt23=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA23_0=='W') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // InternalEcl.g:11011:22: 'wild'
                    {
                    match("wild"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11011:29: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WILD_KEYWORD"

    // $ANTLR start "RULE_CONJUNCTION_KEYWORD"
    public final void mRULE_CONJUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONJUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11013:26: ( ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) ) )
            // InternalEcl.g:11013:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            {
            // InternalEcl.g:11013:28: ( 'AND' | ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='A') ) {
                int LA24_1 = input.LA(2);

                if ( (LA24_1=='N') ) {
                    int LA24_3 = input.LA(3);

                    if ( (LA24_3=='D') ) {
                        alt24=1;
                    }
                    else if ( (LA24_3=='d') ) {
                        alt24=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 3, input);

                        throw nvae;
                    }
                }
                else if ( (LA24_1=='n') ) {
                    alt24=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 24, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA24_0=='a') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEcl.g:11013:29: 'AND'
                    {
                    match("AND"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11013:35: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
                    {
                    if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONJUNCTION_KEYWORD"

    // $ANTLR start "RULE_DISJUNCTION_KEYWORD"
    public final void mRULE_DISJUNCTION_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DISJUNCTION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11015:26: ( ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) ) )
            // InternalEcl.g:11015:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            {
            // InternalEcl.g:11015:28: ( 'OR' | ( 'O' | 'o' ) ( 'R' | 'r' ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='O') ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1=='R') ) {
                    alt25=1;
                }
                else if ( (LA25_1=='r') ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA25_0=='o') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // InternalEcl.g:11015:29: 'OR'
                    {
                    match("OR"); 


                    }
                    break;
                case 2 :
                    // InternalEcl.g:11015:34: ( 'O' | 'o' ) ( 'R' | 'r' )
                    {
                    if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DISJUNCTION_KEYWORD"

    // $ANTLR start "RULE_REVERSED"
    public final void mRULE_REVERSED() throws RecognitionException {
        try {
            int _type = RULE_REVERSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11017:15: ( 'R' )
            // InternalEcl.g:11017:17: 'R'
            {
            match('R'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_REVERSED"

    // $ANTLR start "RULE_DESCRIPTION_SHORT_KEYWORD"
    public final void mRULE_DESCRIPTION_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_DESCRIPTION_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11019:32: ( ( 'D' | 'd' ) )
            // InternalEcl.g:11019:34: ( 'D' | 'd' )
            {
            if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DESCRIPTION_SHORT_KEYWORD"

    // $ANTLR start "RULE_CONCEPT_SHORT_KEYWORD"
    public final void mRULE_CONCEPT_SHORT_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_CONCEPT_SHORT_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11021:28: ( ( 'C' | 'c' ) )
            // InternalEcl.g:11021:30: ( 'C' | 'c' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CONCEPT_SHORT_KEYWORD"

    // $ANTLR start "RULE_KEYWORD"
    public final void mRULE_KEYWORD() throws RecognitionException {
        try {
            int _type = RULE_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11023:14: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // InternalEcl.g:11023:16: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // InternalEcl.g:11023:16: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>='A' && LA26_0<='Z')||(LA26_0>='a' && LA26_0<='z')) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEcl.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_KEYWORD"

    // $ANTLR start "RULE_DBL_LT_EM"
    public final void mRULE_DBL_LT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11025:16: ( '<<!' )
            // InternalEcl.g:11025:18: '<<!'
            {
            match("<<!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_LT_EM"

    // $ANTLR start "RULE_DBL_GT_EM"
    public final void mRULE_DBL_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11027:16: ( '>>!' )
            // InternalEcl.g:11027:18: '>>!'
            {
            match(">>!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_GT_EM"

    // $ANTLR start "RULE_DBL_LT"
    public final void mRULE_DBL_LT() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11029:13: ( '<<' )
            // InternalEcl.g:11029:15: '<<'
            {
            match("<<"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_LT"

    // $ANTLR start "RULE_DBL_GT"
    public final void mRULE_DBL_GT() throws RecognitionException {
        try {
            int _type = RULE_DBL_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11031:13: ( '>>' )
            // InternalEcl.g:11031:15: '>>'
            {
            match(">>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DBL_GT"

    // $ANTLR start "RULE_LT_EM"
    public final void mRULE_LT_EM() throws RecognitionException {
        try {
            int _type = RULE_LT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11033:12: ( '<!' )
            // InternalEcl.g:11033:14: '<!'
            {
            match("<!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT_EM"

    // $ANTLR start "RULE_GT_EM"
    public final void mRULE_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11035:12: ( '>!' )
            // InternalEcl.g:11035:14: '>!'
            {
            match(">!"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT_EM"

    // $ANTLR start "RULE_GTE"
    public final void mRULE_GTE() throws RecognitionException {
        try {
            int _type = RULE_GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11037:10: ( '>=' )
            // InternalEcl.g:11037:12: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GTE"

    // $ANTLR start "RULE_LTE"
    public final void mRULE_LTE() throws RecognitionException {
        try {
            int _type = RULE_LTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11039:10: ( '<=' )
            // InternalEcl.g:11039:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LTE"

    // $ANTLR start "RULE_DOUBLE_CURLY_OPEN"
    public final void mRULE_DOUBLE_CURLY_OPEN() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11041:24: ( '{{' )
            // InternalEcl.g:11041:26: '{{'
            {
            match("{{"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_CURLY_OPEN"

    // $ANTLR start "RULE_DOUBLE_CURLY_CLOSE"
    public final void mRULE_DOUBLE_CURLY_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11043:25: ( '}}' )
            // InternalEcl.g:11043:27: '}}'
            {
            match("}}"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOUBLE_CURLY_CLOSE"

    // $ANTLR start "RULE_PIPE_DELIMITED_STRING"
    public final void mRULE_PIPE_DELIMITED_STRING() throws RecognitionException {
        try {
            int _type = RULE_PIPE_DELIMITED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11045:28: ( '|' ( options {greedy=false; } : . )* '|' )
            // InternalEcl.g:11045:30: '|' ( options {greedy=false; } : . )* '|'
            {
            match('|'); 
            // InternalEcl.g:11045:34: ( options {greedy=false; } : . )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0=='|') ) {
                    alt27=2;
                }
                else if ( ((LA27_0>='\u0000' && LA27_0<='{')||(LA27_0>='}' && LA27_0<='\uFFFF')) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEcl.g:11045:62: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PIPE_DELIMITED_STRING"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11047:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEcl.g:11047:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEcl.g:11047:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0=='\"') ) {
                alt30=1;
            }
            else if ( (LA30_0=='\'') ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEcl.g:11047:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEcl.g:11047:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0=='\\') ) {
                            alt28=1;
                        }
                        else if ( ((LA28_0>='\u0000' && LA28_0<='!')||(LA28_0>='#' && LA28_0<='[')||(LA28_0>=']' && LA28_0<='\uFFFF')) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalEcl.g:11047:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEcl.g:11047:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEcl.g:11047:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEcl.g:11047:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0=='\\') ) {
                            alt29=1;
                        }
                        else if ( ((LA29_0>='\u0000' && LA29_0<='&')||(LA29_0>='(' && LA29_0<='[')||(LA29_0>=']' && LA29_0<='\uFFFF')) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalEcl.g:11047:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEcl.g:11047:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop29;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11049:9: ( '..' )
            // InternalEcl.g:11049:11: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TO"

    // $ANTLR start "RULE_COMMA"
    public final void mRULE_COMMA() throws RecognitionException {
        try {
            int _type = RULE_COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11051:12: ( ',' )
            // InternalEcl.g:11051:14: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COMMA"

    // $ANTLR start "RULE_DIGIT_ZERO"
    public final void mRULE_DIGIT_ZERO() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11053:17: ( '0' )
            // InternalEcl.g:11053:19: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_ZERO"

    // $ANTLR start "RULE_DIGIT_NONZERO"
    public final void mRULE_DIGIT_NONZERO() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_NONZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11055:20: ( '1' .. '9' )
            // InternalEcl.g:11055:22: '1' .. '9'
            {
            matchRange('1','9'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_NONZERO"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11057:12: ( ':' )
            // InternalEcl.g:11057:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_CURLY_OPEN"
    public final void mRULE_CURLY_OPEN() throws RecognitionException {
        try {
            int _type = RULE_CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11059:17: ( '{' )
            // InternalEcl.g:11059:19: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLY_OPEN"

    // $ANTLR start "RULE_CURLY_CLOSE"
    public final void mRULE_CURLY_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_CURLY_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11061:18: ( '}' )
            // InternalEcl.g:11061:20: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CURLY_CLOSE"

    // $ANTLR start "RULE_ROUND_OPEN"
    public final void mRULE_ROUND_OPEN() throws RecognitionException {
        try {
            int _type = RULE_ROUND_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11063:17: ( '(' )
            // InternalEcl.g:11063:19: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROUND_OPEN"

    // $ANTLR start "RULE_ROUND_CLOSE"
    public final void mRULE_ROUND_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_ROUND_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11065:18: ( ')' )
            // InternalEcl.g:11065:20: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ROUND_CLOSE"

    // $ANTLR start "RULE_SQUARE_OPEN"
    public final void mRULE_SQUARE_OPEN() throws RecognitionException {
        try {
            int _type = RULE_SQUARE_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11067:18: ( '[' )
            // InternalEcl.g:11067:20: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQUARE_OPEN"

    // $ANTLR start "RULE_SQUARE_CLOSE"
    public final void mRULE_SQUARE_CLOSE() throws RecognitionException {
        try {
            int _type = RULE_SQUARE_CLOSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11069:19: ( ']' )
            // InternalEcl.g:11069:21: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SQUARE_CLOSE"

    // $ANTLR start "RULE_PLUS"
    public final void mRULE_PLUS() throws RecognitionException {
        try {
            int _type = RULE_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11071:11: ( '+' )
            // InternalEcl.g:11071:13: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_PLUS"

    // $ANTLR start "RULE_DASH"
    public final void mRULE_DASH() throws RecognitionException {
        try {
            int _type = RULE_DASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11073:11: ( '-' )
            // InternalEcl.g:11073:13: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DASH"

    // $ANTLR start "RULE_CARET"
    public final void mRULE_CARET() throws RecognitionException {
        try {
            int _type = RULE_CARET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11075:12: ( '^' )
            // InternalEcl.g:11075:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_CARET"

    // $ANTLR start "RULE_DOT"
    public final void mRULE_DOT() throws RecognitionException {
        try {
            int _type = RULE_DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11077:10: ( '.' )
            // InternalEcl.g:11077:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOT"

    // $ANTLR start "RULE_WILDCARD"
    public final void mRULE_WILDCARD() throws RecognitionException {
        try {
            int _type = RULE_WILDCARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11079:15: ( '*' )
            // InternalEcl.g:11079:17: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WILDCARD"

    // $ANTLR start "RULE_EQUAL"
    public final void mRULE_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11081:12: ( '=' )
            // InternalEcl.g:11081:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_EQUAL"

    // $ANTLR start "RULE_NOT_EQUAL"
    public final void mRULE_NOT_EQUAL() throws RecognitionException {
        try {
            int _type = RULE_NOT_EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11083:16: ( '!=' )
            // InternalEcl.g:11083:18: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NOT_EQUAL"

    // $ANTLR start "RULE_LT"
    public final void mRULE_LT() throws RecognitionException {
        try {
            int _type = RULE_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11085:9: ( '<' )
            // InternalEcl.g:11085:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_LT"

    // $ANTLR start "RULE_GT"
    public final void mRULE_GT() throws RecognitionException {
        try {
            int _type = RULE_GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11087:9: ( '>' )
            // InternalEcl.g:11087:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_GT"

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11089:11: ( '#' )
            // InternalEcl.g:11089:13: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_HASH"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11091:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // InternalEcl.g:11091:11: ( ' ' | '\\t' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11093:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEcl.g:11093:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEcl.g:11093:24: ( options {greedy=false; } : . )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=2;
                    }
                    else if ( ((LA31_1>='\u0000' && LA31_1<='.')||(LA31_1>='0' && LA31_1<='\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0>='\u0000' && LA31_0<=')')||(LA31_0>='+' && LA31_0<='\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalEcl.g:11093:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEcl.g:11095:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEcl.g:11095:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEcl.g:11095:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>='\u0000' && LA32_0<='\t')||(LA32_0>='\u000B' && LA32_0<='\f')||(LA32_0>='\u000E' && LA32_0<='\uFFFF')) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalEcl.g:11095:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalEcl.g:11095:40: ( ( '\\r' )? '\\n' )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='\n'||LA34_0=='\r') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalEcl.g:11095:41: ( '\\r' )? '\\n'
                    {
                    // InternalEcl.g:11095:41: ( '\\r' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0=='\r') ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // InternalEcl.g:11095:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    public void mTokens() throws RecognitionException {
        // InternalEcl.g:1:8: ( RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT )
        int alt35=65;
        alt35 = dfa35.predict(input);
        switch (alt35) {
            case 1 :
                // InternalEcl.g:1:10: RULE_CASE_SIGNIFICANCE_ID_KEYWORD
                {
                mRULE_CASE_SIGNIFICANCE_ID_KEYWORD(); 

                }
                break;
            case 2 :
                // InternalEcl.g:1:44: RULE_DEFINITION_STATUS_ID_KEYWORD
                {
                mRULE_DEFINITION_STATUS_ID_KEYWORD(); 

                }
                break;
            case 3 :
                // InternalEcl.g:1:78: RULE_DEFINITION_STATUS_TOKEN_KEYWORD
                {
                mRULE_DEFINITION_STATUS_TOKEN_KEYWORD(); 

                }
                break;
            case 4 :
                // InternalEcl.g:1:115: RULE_LANGUAGE_REFSET_ID_KEYWORD
                {
                mRULE_LANGUAGE_REFSET_ID_KEYWORD(); 

                }
                break;
            case 5 :
                // InternalEcl.g:1:147: RULE_EFFECTIVE_TIME_KEYWORD
                {
                mRULE_EFFECTIVE_TIME_KEYWORD(); 

                }
                break;
            case 6 :
                // InternalEcl.g:1:175: RULE_ACCEPTABLE_IN_KEYWORD
                {
                mRULE_ACCEPTABLE_IN_KEYWORD(); 

                }
                break;
            case 7 :
                // InternalEcl.g:1:202: RULE_PREFERRED_IN_KEYWORD
                {
                mRULE_PREFERRED_IN_KEYWORD(); 

                }
                break;
            case 8 :
                // InternalEcl.g:1:228: RULE_SEMANTIC_TAG_KEYWORD
                {
                mRULE_SEMANTIC_TAG_KEYWORD(); 

                }
                break;
            case 9 :
                // InternalEcl.g:1:254: RULE_DIALECTID_KEYWORD
                {
                mRULE_DIALECTID_KEYWORD(); 

                }
                break;
            case 10 :
                // InternalEcl.g:1:277: RULE_LANGUAGE_KEYWORD
                {
                mRULE_LANGUAGE_KEYWORD(); 

                }
                break;
            case 11 :
                // InternalEcl.g:1:299: RULE_MODULEID_KEYWORD
                {
                mRULE_MODULEID_KEYWORD(); 

                }
                break;
            case 12 :
                // InternalEcl.g:1:321: RULE_DIALECT_KEYWORD
                {
                mRULE_DIALECT_KEYWORD(); 

                }
                break;
            case 13 :
                // InternalEcl.g:1:342: RULE_ACTIVE_KEYWORD
                {
                mRULE_ACTIVE_KEYWORD(); 

                }
                break;
            case 14 :
                // InternalEcl.g:1:362: RULE_TYPEID_KEYWORD
                {
                mRULE_TYPEID_KEYWORD(); 

                }
                break;
            case 15 :
                // InternalEcl.g:1:382: RULE_EXCLUSION_KEYWORD
                {
                mRULE_EXCLUSION_KEYWORD(); 

                }
                break;
            case 16 :
                // InternalEcl.g:1:405: RULE_EXACT_KEYWORD
                {
                mRULE_EXACT_KEYWORD(); 

                }
                break;
            case 17 :
                // InternalEcl.g:1:424: RULE_FALSE_KEYWORD
                {
                mRULE_FALSE_KEYWORD(); 

                }
                break;
            case 18 :
                // InternalEcl.g:1:443: RULE_MATCH_KEYWORD
                {
                mRULE_MATCH_KEYWORD(); 

                }
                break;
            case 19 :
                // InternalEcl.g:1:462: RULE_REGEX_KEYWORD
                {
                mRULE_REGEX_KEYWORD(); 

                }
                break;
            case 20 :
                // InternalEcl.g:1:481: RULE_TERM_KEYWORD
                {
                mRULE_TERM_KEYWORD(); 

                }
                break;
            case 21 :
                // InternalEcl.g:1:499: RULE_TRUE_KEYWORD
                {
                mRULE_TRUE_KEYWORD(); 

                }
                break;
            case 22 :
                // InternalEcl.g:1:517: RULE_TYPE_KEYWORD
                {
                mRULE_TYPE_KEYWORD(); 

                }
                break;
            case 23 :
                // InternalEcl.g:1:535: RULE_WILD_KEYWORD
                {
                mRULE_WILD_KEYWORD(); 

                }
                break;
            case 24 :
                // InternalEcl.g:1:553: RULE_CONJUNCTION_KEYWORD
                {
                mRULE_CONJUNCTION_KEYWORD(); 

                }
                break;
            case 25 :
                // InternalEcl.g:1:578: RULE_DISJUNCTION_KEYWORD
                {
                mRULE_DISJUNCTION_KEYWORD(); 

                }
                break;
            case 26 :
                // InternalEcl.g:1:603: RULE_REVERSED
                {
                mRULE_REVERSED(); 

                }
                break;
            case 27 :
                // InternalEcl.g:1:617: RULE_DESCRIPTION_SHORT_KEYWORD
                {
                mRULE_DESCRIPTION_SHORT_KEYWORD(); 

                }
                break;
            case 28 :
                // InternalEcl.g:1:648: RULE_CONCEPT_SHORT_KEYWORD
                {
                mRULE_CONCEPT_SHORT_KEYWORD(); 

                }
                break;
            case 29 :
                // InternalEcl.g:1:675: RULE_KEYWORD
                {
                mRULE_KEYWORD(); 

                }
                break;
            case 30 :
                // InternalEcl.g:1:688: RULE_DBL_LT_EM
                {
                mRULE_DBL_LT_EM(); 

                }
                break;
            case 31 :
                // InternalEcl.g:1:703: RULE_DBL_GT_EM
                {
                mRULE_DBL_GT_EM(); 

                }
                break;
            case 32 :
                // InternalEcl.g:1:718: RULE_DBL_LT
                {
                mRULE_DBL_LT(); 

                }
                break;
            case 33 :
                // InternalEcl.g:1:730: RULE_DBL_GT
                {
                mRULE_DBL_GT(); 

                }
                break;
            case 34 :
                // InternalEcl.g:1:742: RULE_LT_EM
                {
                mRULE_LT_EM(); 

                }
                break;
            case 35 :
                // InternalEcl.g:1:753: RULE_GT_EM
                {
                mRULE_GT_EM(); 

                }
                break;
            case 36 :
                // InternalEcl.g:1:764: RULE_GTE
                {
                mRULE_GTE(); 

                }
                break;
            case 37 :
                // InternalEcl.g:1:773: RULE_LTE
                {
                mRULE_LTE(); 

                }
                break;
            case 38 :
                // InternalEcl.g:1:782: RULE_DOUBLE_CURLY_OPEN
                {
                mRULE_DOUBLE_CURLY_OPEN(); 

                }
                break;
            case 39 :
                // InternalEcl.g:1:805: RULE_DOUBLE_CURLY_CLOSE
                {
                mRULE_DOUBLE_CURLY_CLOSE(); 

                }
                break;
            case 40 :
                // InternalEcl.g:1:829: RULE_PIPE_DELIMITED_STRING
                {
                mRULE_PIPE_DELIMITED_STRING(); 

                }
                break;
            case 41 :
                // InternalEcl.g:1:856: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 42 :
                // InternalEcl.g:1:868: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 43 :
                // InternalEcl.g:1:876: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 44 :
                // InternalEcl.g:1:887: RULE_DIGIT_ZERO
                {
                mRULE_DIGIT_ZERO(); 

                }
                break;
            case 45 :
                // InternalEcl.g:1:903: RULE_DIGIT_NONZERO
                {
                mRULE_DIGIT_NONZERO(); 

                }
                break;
            case 46 :
                // InternalEcl.g:1:922: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 47 :
                // InternalEcl.g:1:933: RULE_CURLY_OPEN
                {
                mRULE_CURLY_OPEN(); 

                }
                break;
            case 48 :
                // InternalEcl.g:1:949: RULE_CURLY_CLOSE
                {
                mRULE_CURLY_CLOSE(); 

                }
                break;
            case 49 :
                // InternalEcl.g:1:966: RULE_ROUND_OPEN
                {
                mRULE_ROUND_OPEN(); 

                }
                break;
            case 50 :
                // InternalEcl.g:1:982: RULE_ROUND_CLOSE
                {
                mRULE_ROUND_CLOSE(); 

                }
                break;
            case 51 :
                // InternalEcl.g:1:999: RULE_SQUARE_OPEN
                {
                mRULE_SQUARE_OPEN(); 

                }
                break;
            case 52 :
                // InternalEcl.g:1:1016: RULE_SQUARE_CLOSE
                {
                mRULE_SQUARE_CLOSE(); 

                }
                break;
            case 53 :
                // InternalEcl.g:1:1034: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 54 :
                // InternalEcl.g:1:1044: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 55 :
                // InternalEcl.g:1:1054: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 56 :
                // InternalEcl.g:1:1065: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 57 :
                // InternalEcl.g:1:1074: RULE_WILDCARD
                {
                mRULE_WILDCARD(); 

                }
                break;
            case 58 :
                // InternalEcl.g:1:1088: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 59 :
                // InternalEcl.g:1:1099: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 60 :
                // InternalEcl.g:1:1114: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 61 :
                // InternalEcl.g:1:1122: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 62 :
                // InternalEcl.g:1:1130: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 63 :
                // InternalEcl.g:1:1140: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 64 :
                // InternalEcl.g:1:1148: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 65 :
                // InternalEcl.g:1:1164: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;

        }

    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA2 dfa2 = new DFA2(this);
    protected DFA3 dfa3 = new DFA3(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA5 dfa5 = new DFA5(this);
    protected DFA6 dfa6 = new DFA6(this);
    protected DFA7 dfa7 = new DFA7(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    protected DFA10 dfa10 = new DFA10(this);
    protected DFA11 dfa11 = new DFA11(this);
    protected DFA35 dfa35 = new DFA35(this);
    static final String DFA1_eotS =
        "\24\uffff";
    static final String DFA1_eofS =
        "\24\uffff";
    static final String DFA1_minS =
        "\1\103\1\101\1\uffff\1\123\1\105\1\123\1\111\1\107\1\116\1\111\1\106\1\111\1\103\1\101\1\116\1\103\1\105\1\111\1\104\1\uffff";
    static final String DFA1_maxS =
        "\1\143\1\141\1\uffff\1\163\1\145\1\163\1\151\1\147\1\156\1\151\1\146\1\151\1\143\1\141\1\156\1\143\1\145\1\151\1\144\1\uffff";
    static final String DFA1_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA1_specialS =
        "\24\uffff}>";
    static final String[] DFA1_transitionS = DFA1_transitionS_.DFA1_transitionS;
    private static final class DFA1_transitionS_ {
        static final String[] DFA1_transitionS = {
                "\1\2\37\uffff\1\1",
                "\1\2\37\uffff\1\3",
                "",
                "\1\2\37\uffff\1\4",
                "\1\2\37\uffff\1\5",
                "\1\6\37\uffff\1\2",
                "\1\2\37\uffff\1\7",
                "\1\2\37\uffff\1\10",
                "\1\2\37\uffff\1\11",
                "\1\2\37\uffff\1\12",
                "\1\2\37\uffff\1\13",
                "\1\2\37\uffff\1\14",
                "\1\2\37\uffff\1\15",
                "\1\2\37\uffff\1\16",
                "\1\2\37\uffff\1\17",
                "\1\2\37\uffff\1\20",
                "\1\2\37\uffff\1\21",
                "\1\22\37\uffff\1\2",
                "\1\2\37\uffff\1\23",
                ""
        };
    }

    static final short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static final short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static final char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static final char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static final short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static final short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static final short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "10967:37: ( 'caseSignificanceId' | ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA2_eotS =
        "\24\uffff";
    static final String DFA2_eofS =
        "\24\uffff";
    static final String DFA2_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\111\1\104\1\uffff";
    static final String DFA2_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\151\1\144\1\uffff";
    static final String DFA2_acceptS =
        "\2\uffff\1\2\20\uffff\1\1";
    static final String DFA2_specialS =
        "\24\uffff}>";
    static final String[] DFA2_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\2\37\uffff\1\20",
            "\1\2\37\uffff\1\21",
            "\1\22\37\uffff\1\2",
            "\1\2\37\uffff\1\23",
            ""
    };

    static final short[] DFA2_eot = DFA.unpackEncodedString(DFA2_eotS);
    static final short[] DFA2_eof = DFA.unpackEncodedString(DFA2_eofS);
    static final char[] DFA2_min = DFA.unpackEncodedStringToUnsignedChars(DFA2_minS);
    static final char[] DFA2_max = DFA.unpackEncodedStringToUnsignedChars(DFA2_maxS);
    static final short[] DFA2_accept = DFA.unpackEncodedString(DFA2_acceptS);
    static final short[] DFA2_special = DFA.unpackEncodedString(DFA2_specialS);
    static final short[][] DFA2_transition;

    static {
        int numStates = DFA2_transitionS.length;
        DFA2_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA2_transition[i] = DFA.unpackEncodedString(DFA2_transitionS[i]);
        }
    }

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = DFA2_eot;
            this.eof = DFA2_eof;
            this.min = DFA2_min;
            this.max = DFA2_max;
            this.accept = DFA2_accept;
            this.special = DFA2_special;
            this.transition = DFA2_transition;
        }
        public String getDescription() {
            return "10969:37: ( 'definitionStatusId' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) ( 'i' | 'I' ) ( 'd' | 'D' ) )";
        }
    }
    static final String DFA3_eotS =
        "\22\uffff";
    static final String DFA3_eofS =
        "\22\uffff";
    static final String DFA3_minS =
        "\1\104\1\105\1\uffff\1\106\1\111\1\116\1\111\1\124\1\111\1\117\1\116\1\123\1\124\1\101\1\124\1\125\1\123\1\uffff";
    static final String DFA3_maxS =
        "\1\144\1\145\1\uffff\1\146\1\151\1\156\1\151\1\164\1\151\1\157\1\156\1\163\1\164\1\141\1\164\1\165\1\163\1\uffff";
    static final String DFA3_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA3_specialS =
        "\22\uffff}>";
    static final String[] DFA3_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\2\37\uffff\1\20",
            "\1\2\37\uffff\1\21",
            ""
    };

    static final short[] DFA3_eot = DFA.unpackEncodedString(DFA3_eotS);
    static final short[] DFA3_eof = DFA.unpackEncodedString(DFA3_eofS);
    static final char[] DFA3_min = DFA.unpackEncodedStringToUnsignedChars(DFA3_minS);
    static final char[] DFA3_max = DFA.unpackEncodedStringToUnsignedChars(DFA3_maxS);
    static final short[] DFA3_accept = DFA.unpackEncodedString(DFA3_acceptS);
    static final short[] DFA3_special = DFA.unpackEncodedString(DFA3_specialS);
    static final short[][] DFA3_transition;

    static {
        int numStates = DFA3_transitionS.length;
        DFA3_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA3_transition[i] = DFA.unpackEncodedString(DFA3_transitionS[i]);
        }
    }

    class DFA3 extends DFA {

        public DFA3(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 3;
            this.eot = DFA3_eot;
            this.eof = DFA3_eof;
            this.min = DFA3_min;
            this.max = DFA3_max;
            this.accept = DFA3_accept;
            this.special = DFA3_special;
            this.transition = DFA3_transition;
        }
        public String getDescription() {
            return "10971:40: ( 'definitionStatus' | ( 'd' | 'D' ) ( 'e' | 'E' ) ( 'f' | 'F' ) ( 'i' | 'I' ) ( 'n' | 'N' ) ( 'i' | 'I' ) ( 't' | 'T' ) ( 'i' | 'I' ) ( 'o' | 'O' ) ( 'n' | 'N' ) ( 's' | 'S' ) ( 't' | 'T' ) ( 'a' | 'A' ) ( 't' | 'T' ) ( 'u' | 'U' ) ( 's' | 'S' ) )";
        }
    }
    static final String DFA4_eotS =
        "\22\uffff";
    static final String DFA4_eofS =
        "\22\uffff";
    static final String DFA4_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\122\1\105\1\106\1\123\1\105\1\124\1\111\1\104\1\uffff";
    static final String DFA4_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\162\1\145\1\146\1\163\1\145\1\164\1\151\1\144\1\uffff";
    static final String DFA4_acceptS =
        "\2\uffff\1\2\16\uffff\1\1";
    static final String DFA4_specialS =
        "\22\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\12\37\uffff\1\2",
            "\1\2\37\uffff\1\13",
            "\1\2\37\uffff\1\14",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            "\1\2\37\uffff\1\17",
            "\1\20\37\uffff\1\2",
            "\1\2\37\uffff\1\21",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "10973:35: ( 'languageRefsetId' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA5_eotS =
        "\17\uffff";
    static final String DFA5_eofS =
        "\17\uffff";
    static final String DFA5_minS =
        "\1\105\1\106\1\uffff\1\106\1\105\1\103\1\124\1\111\1\126\1\105\1\124\1\111\1\115\1\105\1\uffff";
    static final String DFA5_maxS =
        "\1\145\1\146\1\uffff\1\146\1\145\1\143\1\164\1\151\1\166\1\145\1\164\1\151\1\155\1\145\1\uffff";
    static final String DFA5_acceptS =
        "\2\uffff\1\2\13\uffff\1\1";
    static final String DFA5_specialS =
        "\17\uffff}>";
    static final String[] DFA5_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
            "\1\2\37\uffff\1\15",
            "\1\2\37\uffff\1\16",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "10975:31: ( 'effectiveTime' | ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA6_eotS =
        "\16\uffff";
    static final String DFA6_eofS =
        "\16\uffff";
    static final String DFA6_minS =
        "\1\101\1\103\1\uffff\1\103\1\105\1\120\1\124\1\101\1\102\1\114\1\105\1\111\1\116\1\uffff";
    static final String DFA6_maxS =
        "\1\141\1\143\1\uffff\1\143\1\145\1\160\1\164\1\141\1\142\1\154\1\145\1\151\1\156\1\uffff";
    static final String DFA6_acceptS =
        "\2\uffff\1\2\12\uffff\1\1";
    static final String DFA6_specialS =
        "\16\uffff}>";
    static final String[] DFA6_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\2\37\uffff\1\13",
            "\1\14\37\uffff\1\2",
            "\1\2\37\uffff\1\15",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "10977:30: ( 'acceptableIn' | ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA7_eotS =
        "\15\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\120\1\122\1\uffff\1\105\1\106\1\105\2\122\1\105\1\104\1\111\1\116\1\uffff";
    static final String DFA7_maxS =
        "\1\160\1\162\1\uffff\1\145\1\146\1\145\2\162\1\145\1\144\1\151\1\156\1\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA7_specialS =
        "\15\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\2\37\uffff\1\12",
            "\1\13\37\uffff\1\2",
            "\1\2\37\uffff\1\14",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "10979:29: ( 'preferredIn' | ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )";
        }
    }
    static final String DFA8_eotS =
        "\15\uffff";
    static final String DFA8_eofS =
        "\15\uffff";
    static final String DFA8_minS =
        "\1\123\1\105\1\uffff\1\115\1\101\1\116\1\124\1\111\1\103\1\124\1\101\1\107\1\uffff";
    static final String DFA8_maxS =
        "\1\163\1\145\1\uffff\1\155\1\141\1\156\1\164\1\151\1\143\1\164\1\141\1\147\1\uffff";
    static final String DFA8_acceptS =
        "\2\uffff\1\2\11\uffff\1\1";
    static final String DFA8_specialS =
        "\15\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            "\1\12\37\uffff\1\2",
            "\1\2\37\uffff\1\13",
            "\1\2\37\uffff\1\14",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "10981:29: ( 'semanticTag' | ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )";
        }
    }
    static final String DFA9_eotS =
        "\13\uffff";
    static final String DFA9_eofS =
        "\13\uffff";
    static final String DFA9_minS =
        "\1\104\1\111\1\uffff\1\101\1\114\1\105\1\103\1\124\1\111\1\104\1\uffff";
    static final String DFA9_maxS =
        "\1\144\1\151\1\uffff\1\141\1\154\1\145\1\143\1\164\1\151\1\144\1\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\2\7\uffff\1\1";
    static final String DFA9_specialS =
        "\13\uffff}>";
    static final String[] DFA9_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\11\37\uffff\1\2",
            "\1\2\37\uffff\1\12",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "10983:26: ( 'dialectId' | ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA10_eotS =
        "\12\uffff";
    static final String DFA10_eofS =
        "\12\uffff";
    static final String DFA10_minS =
        "\1\114\1\101\1\uffff\1\116\1\107\1\125\1\101\1\107\1\105\1\uffff";
    static final String DFA10_maxS =
        "\1\154\1\141\1\uffff\1\156\1\147\1\165\1\141\1\147\1\145\1\uffff";
    static final String DFA10_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA10_specialS =
        "\12\uffff}>";
    static final String[] DFA10_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\2\37\uffff\1\10",
            "\1\2\37\uffff\1\11",
            ""
    };

    static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
    static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
    static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
    static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
    static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
    static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
    static final short[][] DFA10_transition;

    static {
        int numStates = DFA10_transitionS.length;
        DFA10_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
        }
    }

    class DFA10 extends DFA {

        public DFA10(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 10;
            this.eot = DFA10_eot;
            this.eof = DFA10_eof;
            this.min = DFA10_min;
            this.max = DFA10_max;
            this.accept = DFA10_accept;
            this.special = DFA10_special;
            this.transition = DFA10_transition;
        }
        public String getDescription() {
            return "10985:25: ( 'language' | ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )";
        }
    }
    static final String DFA11_eotS =
        "\12\uffff";
    static final String DFA11_eofS =
        "\12\uffff";
    static final String DFA11_minS =
        "\1\115\1\117\1\uffff\1\104\1\125\1\114\1\105\1\111\1\104\1\uffff";
    static final String DFA11_maxS =
        "\1\155\1\157\1\uffff\1\144\1\165\1\154\1\145\1\151\1\144\1\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\2\6\uffff\1\1";
    static final String DFA11_specialS =
        "\12\uffff}>";
    static final String[] DFA11_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\2\37\uffff\1\3",
            "",
            "\1\2\37\uffff\1\4",
            "\1\2\37\uffff\1\5",
            "\1\2\37\uffff\1\6",
            "\1\2\37\uffff\1\7",
            "\1\10\37\uffff\1\2",
            "\1\2\37\uffff\1\11",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "10987:25: ( 'moduleId' | ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )";
        }
    }
    static final String DFA35_eotS =
        "\1\uffff\2\66\2\73\21\33\1\132\4\33\1\uffff\1\142\1\146\1\150\1\152\2\uffff\1\154\21\uffff\2\33\1\uffff\4\33\1\uffff\36\33\1\uffff\2\33\2\u0097\1\u0099\3\uffff\1\u009b\13\uffff\20\33\2\u00ac\26\33\5\uffff\20\33\1\uffff\12\33\2\u00df\2\u00e0\2\u00e1\4\33\2\u00e6\12\33\2\u00f1\12\33\1\u00fc\2\u00fd\1\u00fc\2\33\3\uffff\2\u0100\2\u0101\1\uffff\12\33\1\uffff\2\33\2\u010e\6\33\2\uffff\2\u0115\2\uffff\4\33\2\u011c\6\33\1\uffff\6\33\1\uffff\6\33\1\uffff\2\u0131\10\33\2\u013a\4\33\2\u013f\2\33\1\uffff\10\33\1\uffff\4\33\1\uffff\24\33\2\u0162\2\u0163\10\33\2\u016c\2\uffff\6\33\2\u0173\1\uffff\6\33\1\uffff\10\33\2\u0184\2\u0185\4\33\2\uffff\2\u018a\2\u018b\2\uffff";
    static final String DFA35_eofS =
        "\u018c\uffff";
    static final String DFA35_minS =
        "\1\11\6\101\2\106\2\103\2\122\2\105\2\101\2\105\2\101\1\105\1\101\2\111\2\122\1\uffff\2\41\1\173\1\175\2\uffff\1\56\20\uffff\1\52\2\123\1\uffff\2\106\2\101\1\uffff\2\116\2\106\2\101\2\103\2\104\2\105\2\115\2\104\1\116\2\124\1\116\2\120\2\122\2\125\2\114\2\107\1\uffff\2\114\2\101\1\41\3\uffff\1\41\13\uffff\2\105\2\111\2\114\2\107\2\105\2\103\2\105\2\111\2\101\2\106\2\101\3\125\2\103\1\125\2\105\2\115\2\105\2\123\2\105\2\104\5\uffff\2\123\2\116\2\105\2\125\2\103\2\124\2\120\2\126\1\uffff\2\105\2\116\2\114\1\123\2\110\1\123\6\101\2\105\2\130\2\101\4\111\2\103\2\101\2\124\2\101\2\124\2\105\2\122\2\124\2\105\4\101\2\104\3\uffff\4\101\1\uffff\2\107\4\124\2\107\2\111\1\uffff\4\101\2\122\4\111\2\uffff\2\101\2\uffff\2\116\2\111\2\101\2\105\2\126\2\102\1\uffff\2\105\2\103\2\104\1\uffff\2\111\2\117\2\104\1\uffff\2\101\2\105\2\114\2\104\2\124\2\101\2\106\2\116\2\101\2\105\1\uffff\2\124\2\105\2\111\2\101\1\uffff\2\111\2\123\1\uffff\2\106\4\111\2\116\2\107\2\103\2\124\2\123\2\115\2\116\10\101\4\105\2\101\2\uffff\2\116\4\124\2\101\1\uffff\2\103\2\125\2\111\1\uffff\2\105\2\123\2\104\2\111\4\101\4\104\2\uffff\4\101\2\uffff";
    static final String DFA35_maxS =
        "\1\175\4\172\2\141\2\170\2\156\2\162\2\145\2\157\2\171\2\141\1\145\1\172\2\151\2\162\1\uffff\1\75\1\76\1\173\1\175\2\uffff\1\56\20\uffff\1\57\2\163\1\uffff\2\146\2\141\1\uffff\2\156\2\146\2\141\2\164\2\144\2\145\2\155\2\144\1\156\2\164\1\156\2\160\2\162\2\165\2\154\2\147\1\uffff\2\154\2\172\1\41\3\uffff\1\41\13\uffff\2\145\2\151\2\154\2\147\2\145\2\143\2\145\2\151\2\172\2\146\2\141\3\165\2\143\1\165\2\145\2\155\2\145\2\163\2\145\2\144\5\uffff\2\163\2\156\2\145\2\165\2\143\2\164\2\160\2\166\1\uffff\2\145\2\156\2\154\1\163\2\150\1\163\6\172\2\145\2\170\2\172\4\151\2\143\2\141\2\164\2\172\2\164\2\145\2\162\2\164\2\145\4\172\2\144\3\uffff\4\172\1\uffff\2\147\4\164\2\147\2\151\1\uffff\2\141\2\172\2\162\4\151\2\uffff\2\172\2\uffff\2\156\2\151\2\172\2\145\2\166\2\142\1\uffff\2\145\2\143\2\144\1\uffff\2\151\2\157\2\144\1\uffff\2\172\2\145\2\154\2\144\2\164\2\172\2\146\2\156\2\172\2\145\1\uffff\2\164\2\145\2\151\2\141\1\uffff\2\151\2\163\1\uffff\2\146\4\151\2\156\2\147\2\143\2\164\2\163\2\155\2\156\4\172\4\141\4\145\2\172\2\uffff\2\156\4\164\2\172\1\uffff\2\143\2\165\2\151\1\uffff\2\145\2\163\2\144\2\151\4\172\4\144\2\uffff\4\172\2\uffff";
    static final String DFA35_acceptS =
        "\33\uffff\1\35\4\uffff\1\50\1\51\1\uffff\1\53\1\54\1\55\1\56\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\71\1\72\1\73\1\76\1\77\3\uffff\1\34\4\uffff\1\33\36\uffff\1\32\5\uffff\1\42\1\45\1\74\1\uffff\1\43\1\44\1\75\1\46\1\57\1\47\1\60\1\52\1\70\1\100\1\101\50\uffff\1\31\1\36\1\40\1\37\1\41\20\uffff\1\30\62\uffff\1\26\1\24\1\25\4\uffff\1\27\12\uffff\1\20\12\uffff\1\17\1\22\2\uffff\1\21\1\23\14\uffff\1\15\6\uffff\1\16\6\uffff\1\14\24\uffff\1\12\10\uffff\1\13\4\uffff\1\11\42\uffff\1\7\1\10\10\uffff\1\6\6\uffff\1\5\20\uffff\1\3\1\4\4\uffff\1\1\1\2";
    static final String DFA35_specialS =
        "\u018c\uffff}>";
    static final String[] DFA35_transitionS = {
            "\2\62\2\uffff\1\62\22\uffff\1\62\1\60\1\41\1\61\3\uffff\1\41\1\47\1\50\1\56\1\53\1\43\1\54\1\42\1\63\1\44\11\45\1\46\1\uffff\1\34\1\57\1\35\2\uffff\1\12\1\33\1\2\1\4\1\10\1\24\5\33\1\6\1\20\1\33\1\31\1\14\1\33\1\26\1\16\1\22\2\33\1\30\3\33\1\51\1\uffff\1\52\1\55\2\uffff\1\11\1\33\1\1\1\3\1\7\1\23\5\33\1\5\1\17\1\33\1\32\1\13\1\33\1\25\1\15\1\21\2\33\1\27\3\33\1\36\1\40\1\37",
            "\1\65\31\33\6\uffff\1\64\31\33",
            "\1\65\31\33\6\uffff\1\65\31\33",
            "\4\33\1\70\3\33\1\72\21\33\6\uffff\4\33\1\67\3\33\1\71\21\33",
            "\4\33\1\70\3\33\1\72\21\33\6\uffff\4\33\1\70\3\33\1\72\21\33",
            "\1\75\37\uffff\1\74",
            "\1\75\37\uffff\1\75",
            "\1\77\21\uffff\1\101\15\uffff\1\76\21\uffff\1\100",
            "\1\77\21\uffff\1\101\15\uffff\1\77\21\uffff\1\101",
            "\1\103\12\uffff\1\104\24\uffff\1\102\12\uffff\1\104",
            "\1\103\12\uffff\1\105\24\uffff\1\103\12\uffff\1\104",
            "\1\107\37\uffff\1\106",
            "\1\107\37\uffff\1\107",
            "\1\111\37\uffff\1\110",
            "\1\111\37\uffff\1\111",
            "\1\116\7\uffff\1\114\5\uffff\1\113\21\uffff\1\115\7\uffff\1\114\5\uffff\1\112",
            "\1\116\7\uffff\1\117\5\uffff\1\113\21\uffff\1\116\7\uffff\1\114\5\uffff\1\113",
            "\1\123\14\uffff\1\125\6\uffff\1\121\13\uffff\1\122\14\uffff\1\124\6\uffff\1\120",
            "\1\123\14\uffff\1\125\6\uffff\1\121\13\uffff\1\123\14\uffff\1\125\6\uffff\1\121",
            "\1\127\37\uffff\1\126",
            "\1\127\37\uffff\1\127",
            "\1\131\37\uffff\1\130",
            "\4\33\1\131\25\33\6\uffff\4\33\1\131\25\33",
            "\1\134\37\uffff\1\133",
            "\1\134\37\uffff\1\134",
            "\1\135\37\uffff\1\136",
            "\1\136\37\uffff\1\136",
            "",
            "\1\140\32\uffff\1\137\1\141",
            "\1\144\33\uffff\1\145\1\143",
            "\1\147",
            "\1\151",
            "",
            "",
            "\1\153",
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
            "\1\155\4\uffff\1\156",
            "\1\160\37\uffff\1\157",
            "\1\160\37\uffff\1\160",
            "",
            "\1\162\37\uffff\1\161",
            "\1\162\37\uffff\1\162",
            "\1\164\37\uffff\1\163",
            "\1\164\37\uffff\1\164",
            "",
            "\1\166\37\uffff\1\165",
            "\1\166\37\uffff\1\166",
            "\1\170\37\uffff\1\167",
            "\1\170\37\uffff\1\170",
            "\1\172\37\uffff\1\171",
            "\1\172\37\uffff\1\172",
            "\1\174\20\uffff\1\176\16\uffff\1\173\20\uffff\1\175",
            "\1\174\20\uffff\1\176\16\uffff\1\174\20\uffff\1\176",
            "\1\177\37\uffff\1\177",
            "\1\u0080\37\uffff\1\177",
            "\1\u0082\37\uffff\1\u0081",
            "\1\u0082\37\uffff\1\u0082",
            "\1\u0084\37\uffff\1\u0083",
            "\1\u0084\37\uffff\1\u0084",
            "\1\u0086\37\uffff\1\u0085",
            "\1\u0086\37\uffff\1\u0086",
            "\1\u0087\37\uffff\1\u0087",
            "\1\u0089\37\uffff\1\u0088",
            "\1\u0089\37\uffff\1\u0089",
            "\1\u008a\37\uffff\1\u0087",
            "\1\u008c\37\uffff\1\u008b",
            "\1\u008c\37\uffff\1\u008c",
            "\1\u008e\37\uffff\1\u008d",
            "\1\u008e\37\uffff\1\u008e",
            "\1\u0090\37\uffff\1\u008f",
            "\1\u0090\37\uffff\1\u0090",
            "\1\u0092\37\uffff\1\u0091",
            "\1\u0092\37\uffff\1\u0092",
            "\1\u0094\37\uffff\1\u0093",
            "\1\u0094\37\uffff\1\u0094",
            "",
            "\1\u0096\37\uffff\1\u0095",
            "\1\u0096\37\uffff\1\u0096",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u0098",
            "",
            "",
            "",
            "\1\u009a",
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
            "\1\u009d\37\uffff\1\u009c",
            "\1\u009d\37\uffff\1\u009d",
            "\1\u009f\37\uffff\1\u009e",
            "\1\u009f\37\uffff\1\u009f",
            "\1\u00a1\37\uffff\1\u00a0",
            "\1\u00a1\37\uffff\1\u00a1",
            "\1\u00a3\37\uffff\1\u00a2",
            "\1\u00a3\37\uffff\1\u00a3",
            "\1\u00a5\37\uffff\1\u00a4",
            "\1\u00a5\37\uffff\1\u00a5",
            "\1\u00a7\37\uffff\1\u00a6",
            "\1\u00a7\37\uffff\1\u00a7",
            "\1\u00a9\37\uffff\1\u00a8",
            "\1\u00a9\37\uffff\1\u00a9",
            "\1\u00ab\37\uffff\1\u00aa",
            "\1\u00ab\37\uffff\1\u00ab",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u00ae\37\uffff\1\u00ad",
            "\1\u00ae\37\uffff\1\u00ae",
            "\1\u00b0\37\uffff\1\u00af",
            "\1\u00b0\37\uffff\1\u00b0",
            "\1\u00b2\37\uffff\1\u00b1",
            "\1\u00b2\37\uffff\1\u00b2",
            "\1\u00b3\37\uffff\1\u00b3",
            "\1\u00b5\37\uffff\1\u00b4",
            "\1\u00b5\37\uffff\1\u00b5",
            "\1\u00b6\37\uffff\1\u00b3",
            "\1\u00b8\37\uffff\1\u00b7",
            "\1\u00b8\37\uffff\1\u00b8",
            "\1\u00ba\37\uffff\1\u00b9",
            "\1\u00ba\37\uffff\1\u00ba",
            "\1\u00bc\37\uffff\1\u00bb",
            "\1\u00bc\37\uffff\1\u00bc",
            "\1\u00be\37\uffff\1\u00bd",
            "\1\u00be\37\uffff\1\u00be",
            "\1\u00c0\37\uffff\1\u00bf",
            "\1\u00c0\37\uffff\1\u00c0",
            "\1\u00c2\37\uffff\1\u00c1",
            "\1\u00c2\37\uffff\1\u00c2",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c3\37\uffff\1\u00c4",
            "\1\u00c4\37\uffff\1\u00c4",
            "\1\u00c6\37\uffff\1\u00c5",
            "\1\u00c6\37\uffff\1\u00c6",
            "\1\u00c8\37\uffff\1\u00c7",
            "\1\u00c8\37\uffff\1\u00c8",
            "\1\u00ca\37\uffff\1\u00c9",
            "\1\u00ca\37\uffff\1\u00ca",
            "\1\u00cc\37\uffff\1\u00cb",
            "\1\u00cc\37\uffff\1\u00cc",
            "\1\u00ce\37\uffff\1\u00cd",
            "\1\u00ce\37\uffff\1\u00ce",
            "\1\u00d0\37\uffff\1\u00cf",
            "\1\u00d0\37\uffff\1\u00d0",
            "\1\u00d2\37\uffff\1\u00d1",
            "\1\u00d2\37\uffff\1\u00d2",
            "",
            "\1\u00d4\37\uffff\1\u00d3",
            "\1\u00d4\37\uffff\1\u00d4",
            "\1\u00d6\37\uffff\1\u00d5",
            "\1\u00d6\37\uffff\1\u00d6",
            "\1\u00d8\37\uffff\1\u00d7",
            "\1\u00d8\37\uffff\1\u00d8",
            "\1\u00d9\37\uffff\1\u00d9",
            "\1\u00db\37\uffff\1\u00da",
            "\1\u00db\37\uffff\1\u00db",
            "\1\u00dc\37\uffff\1\u00d9",
            "\10\33\1\u00dd\21\33\6\uffff\10\33\1\u00de\21\33",
            "\10\33\1\u00de\21\33\6\uffff\10\33\1\u00de\21\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u00e3\37\uffff\1\u00e2",
            "\1\u00e3\37\uffff\1\u00e3",
            "\1\u00e5\37\uffff\1\u00e4",
            "\1\u00e5\37\uffff\1\u00e5",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u00e8\37\uffff\1\u00e7",
            "\1\u00e8\37\uffff\1\u00e8",
            "\1\u00ea\37\uffff\1\u00e9",
            "\1\u00ea\37\uffff\1\u00ea",
            "\1\u00ec\37\uffff\1\u00eb",
            "\1\u00ec\37\uffff\1\u00ec",
            "\1\u00ee\37\uffff\1\u00ed",
            "\1\u00ee\37\uffff\1\u00ee",
            "\1\u00f0\37\uffff\1\u00ef",
            "\1\u00f0\37\uffff\1\u00f0",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u00f3\37\uffff\1\u00f2",
            "\1\u00f3\37\uffff\1\u00f3",
            "\1\u00f5\37\uffff\1\u00f4",
            "\1\u00f5\37\uffff\1\u00f5",
            "\1\u00f7\37\uffff\1\u00f6",
            "\1\u00f7\37\uffff\1\u00f7",
            "\1\u00f9\37\uffff\1\u00f8",
            "\1\u00f9\37\uffff\1\u00f9",
            "\1\u00fb\37\uffff\1\u00fa",
            "\1\u00fb\37\uffff\1\u00fb",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u00ff\37\uffff\1\u00fe",
            "\1\u00ff\37\uffff\1\u00ff",
            "",
            "",
            "",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "\1\u0103\37\uffff\1\u0102",
            "\1\u0103\37\uffff\1\u0103",
            "\1\u0105\37\uffff\1\u0104",
            "\1\u0105\37\uffff\1\u0105",
            "\1\u0107\37\uffff\1\u0106",
            "\1\u0107\37\uffff\1\u0107",
            "\1\u0109\37\uffff\1\u0108",
            "\1\u0109\37\uffff\1\u0109",
            "\1\u010b\37\uffff\1\u010a",
            "\1\u010b\37\uffff\1\u010b",
            "",
            "\1\u010d\37\uffff\1\u010c",
            "\1\u010d\37\uffff\1\u010d",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u0110\37\uffff\1\u010f",
            "\1\u0110\37\uffff\1\u0110",
            "\1\u0112\37\uffff\1\u0111",
            "\1\u0112\37\uffff\1\u0112",
            "\1\u0113\37\uffff\1\u0114",
            "\1\u0114\37\uffff\1\u0114",
            "",
            "",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "",
            "\1\u0117\37\uffff\1\u0116",
            "\1\u0117\37\uffff\1\u0117",
            "\1\u0119\37\uffff\1\u0118",
            "\1\u0119\37\uffff\1\u0119",
            "\10\33\1\u011a\21\33\6\uffff\10\33\1\u011b\21\33",
            "\10\33\1\u011b\21\33\6\uffff\10\33\1\u011b\21\33",
            "\1\u011e\37\uffff\1\u011d",
            "\1\u011e\37\uffff\1\u011e",
            "\1\u0120\37\uffff\1\u011f",
            "\1\u0120\37\uffff\1\u0120",
            "\1\u0122\37\uffff\1\u0121",
            "\1\u0122\37\uffff\1\u0122",
            "",
            "\1\u0124\37\uffff\1\u0123",
            "\1\u0124\37\uffff\1\u0124",
            "\1\u0126\37\uffff\1\u0125",
            "\1\u0126\37\uffff\1\u0126",
            "\1\u0128\37\uffff\1\u0127",
            "\1\u0128\37\uffff\1\u0128",
            "",
            "\1\u012a\37\uffff\1\u0129",
            "\1\u012a\37\uffff\1\u012a",
            "\1\u012c\37\uffff\1\u012b",
            "\1\u012c\37\uffff\1\u012c",
            "\1\u012e\37\uffff\1\u012d",
            "\1\u012e\37\uffff\1\u012e",
            "",
            "\21\33\1\u012f\10\33\6\uffff\21\33\1\u0130\10\33",
            "\21\33\1\u0130\10\33\6\uffff\21\33\1\u0130\10\33",
            "\1\u0133\37\uffff\1\u0132",
            "\1\u0133\37\uffff\1\u0133",
            "\1\u0135\37\uffff\1\u0134",
            "\1\u0135\37\uffff\1\u0135",
            "\1\u0137\37\uffff\1\u0136",
            "\1\u0137\37\uffff\1\u0137",
            "\1\u0138\37\uffff\1\u0139",
            "\1\u0139\37\uffff\1\u0139",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u013c\37\uffff\1\u013b",
            "\1\u013c\37\uffff\1\u013c",
            "\1\u013e\37\uffff\1\u013d",
            "\1\u013e\37\uffff\1\u013e",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u0141\37\uffff\1\u0140",
            "\1\u0141\37\uffff\1\u0141",
            "",
            "\1\u0142\37\uffff\1\u0143",
            "\1\u0143\37\uffff\1\u0143",
            "\1\u0145\37\uffff\1\u0144",
            "\1\u0145\37\uffff\1\u0145",
            "\1\u0146\37\uffff\1\u0147",
            "\1\u0147\37\uffff\1\u0147",
            "\1\u0149\37\uffff\1\u0148",
            "\1\u0149\37\uffff\1\u0149",
            "",
            "\1\u014b\37\uffff\1\u014a",
            "\1\u014b\37\uffff\1\u014b",
            "\1\u014c\37\uffff\1\u014d",
            "\1\u014d\37\uffff\1\u014d",
            "",
            "\1\u014f\37\uffff\1\u014e",
            "\1\u014f\37\uffff\1\u014f",
            "\1\u0151\37\uffff\1\u0150",
            "\1\u0151\37\uffff\1\u0151",
            "\1\u0152\37\uffff\1\u0153",
            "\1\u0153\37\uffff\1\u0153",
            "\1\u0155\37\uffff\1\u0154",
            "\1\u0155\37\uffff\1\u0155",
            "\1\u0157\37\uffff\1\u0156",
            "\1\u0157\37\uffff\1\u0157",
            "\1\u0159\37\uffff\1\u0158",
            "\1\u0159\37\uffff\1\u0159",
            "\1\u015b\37\uffff\1\u015a",
            "\1\u015b\37\uffff\1\u015b",
            "\1\u015d\37\uffff\1\u015c",
            "\1\u015d\37\uffff\1\u015d",
            "\1\u015f\37\uffff\1\u015e",
            "\1\u015f\37\uffff\1\u015f",
            "\1\u0161\37\uffff\1\u0160",
            "\1\u0161\37\uffff\1\u0161",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u0165\37\uffff\1\u0164",
            "\1\u0165\37\uffff\1\u0165",
            "\1\u0167\37\uffff\1\u0166",
            "\1\u0167\37\uffff\1\u0167",
            "\1\u0169\37\uffff\1\u0168",
            "\1\u0169\37\uffff\1\u0169",
            "\1\u016b\37\uffff\1\u016a",
            "\1\u016b\37\uffff\1\u016b",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "",
            "\1\u016e\37\uffff\1\u016d",
            "\1\u016e\37\uffff\1\u016e",
            "\1\u0170\37\uffff\1\u016f",
            "\1\u0170\37\uffff\1\u0170",
            "\1\u0172\37\uffff\1\u0171",
            "\1\u0172\37\uffff\1\u0172",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            "\1\u0175\37\uffff\1\u0174",
            "\1\u0175\37\uffff\1\u0175",
            "\1\u0177\37\uffff\1\u0176",
            "\1\u0177\37\uffff\1\u0177",
            "\1\u0178\37\uffff\1\u0179",
            "\1\u0179\37\uffff\1\u0179",
            "",
            "\1\u017b\37\uffff\1\u017a",
            "\1\u017b\37\uffff\1\u017b",
            "\1\u017d\37\uffff\1\u017c",
            "\1\u017d\37\uffff\1\u017d",
            "\1\u017f\37\uffff\1\u017e",
            "\1\u017f\37\uffff\1\u017f",
            "\1\u0180\37\uffff\1\u0181",
            "\1\u0181\37\uffff\1\u0181",
            "\10\33\1\u0182\21\33\6\uffff\10\33\1\u0183\21\33",
            "\10\33\1\u0183\21\33\6\uffff\10\33\1\u0183\21\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\1\u0187\37\uffff\1\u0186",
            "\1\u0187\37\uffff\1\u0187",
            "\1\u0189\37\uffff\1\u0188",
            "\1\u0189\37\uffff\1\u0189",
            "",
            "",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "\32\33\6\uffff\32\33",
            "",
            ""
    };

    static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
    static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
    static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
    static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
    static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
    static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
    static final short[][] DFA35_transition;

    static {
        int numStates = DFA35_transitionS.length;
        DFA35_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
        }
    }

    class DFA35 extends DFA {

        public DFA35(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 35;
            this.eot = DFA35_eot;
            this.eof = DFA35_eof;
            this.min = DFA35_min;
            this.max = DFA35_max;
            this.accept = DFA35_accept;
            this.special = DFA35_special;
            this.transition = DFA35_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( RULE_CASE_SIGNIFICANCE_ID_KEYWORD | RULE_DEFINITION_STATUS_ID_KEYWORD | RULE_DEFINITION_STATUS_TOKEN_KEYWORD | RULE_LANGUAGE_REFSET_ID_KEYWORD | RULE_EFFECTIVE_TIME_KEYWORD | RULE_ACCEPTABLE_IN_KEYWORD | RULE_PREFERRED_IN_KEYWORD | RULE_SEMANTIC_TAG_KEYWORD | RULE_DIALECTID_KEYWORD | RULE_LANGUAGE_KEYWORD | RULE_MODULEID_KEYWORD | RULE_DIALECT_KEYWORD | RULE_ACTIVE_KEYWORD | RULE_TYPEID_KEYWORD | RULE_EXCLUSION_KEYWORD | RULE_EXACT_KEYWORD | RULE_FALSE_KEYWORD | RULE_MATCH_KEYWORD | RULE_REGEX_KEYWORD | RULE_TERM_KEYWORD | RULE_TRUE_KEYWORD | RULE_TYPE_KEYWORD | RULE_WILD_KEYWORD | RULE_CONJUNCTION_KEYWORD | RULE_DISJUNCTION_KEYWORD | RULE_REVERSED | RULE_DESCRIPTION_SHORT_KEYWORD | RULE_CONCEPT_SHORT_KEYWORD | RULE_KEYWORD | RULE_DBL_LT_EM | RULE_DBL_GT_EM | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_GT_EM | RULE_GTE | RULE_LTE | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_PIPE_DELIMITED_STRING | RULE_STRING | RULE_TO | RULE_COMMA | RULE_DIGIT_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_HASH | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT );";
        }
    }
 

}