package com.b2international.snomed.ecl.ide.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEclLexer extends Lexer {
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

    public InternalEclLexer() {;} 
    public InternalEclLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalEclLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalEclLexer.g"; }

    // $ANTLR start "CaseSignificanceId"
    public final void mCaseSignificanceId() throws RecognitionException {
        try {
            int _type = CaseSignificanceId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:26:20: ( ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:26:22: ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'I' | 'i' ) ( 'G' | 'g' ) ( 'N' | 'n' ) ( 'I' | 'i' ) ( 'F' | 'f' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CaseSignificanceId"

    // $ANTLR start "LanguageRefSetId"
    public final void mLanguageRefSetId() throws RecognitionException {
        try {
            int _type = LanguageRefSetId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:28:18: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:28:20: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'S' | 's' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LanguageRefSetId"

    // $ANTLR start "EffectiveTime"
    public final void mEffectiveTime() throws RecognitionException {
        try {
            int _type = EffectiveTime;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:30:15: ( ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:30:17: ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'M' | 'm' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EffectiveTime"

    // $ANTLR start "AcceptableIn"
    public final void mAcceptableIn() throws RecognitionException {
        try {
            int _type = AcceptableIn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:32:14: ( ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalEclLexer.g:32:16: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'B' | 'b' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AcceptableIn"

    // $ANTLR start "Description"
    public final void mDescription() throws RecognitionException {
        try {
            int _type = Description;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:34:13: ( ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' ) )
            // InternalEclLexer.g:34:15: ( 'D' | 'd' ) ( 'E' | 'e' ) ( 'S' | 's' ) ( 'C' | 'c' ) ( 'R' | 'r' ) ( 'I' | 'i' ) ( 'P' | 'p' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'O' | 'o' ) ( 'N' | 'n' )
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

            if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
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

            if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Description"

    // $ANTLR start "PreferredIn"
    public final void mPreferredIn() throws RecognitionException {
        try {
            int _type = PreferredIn;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:36:13: ( ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' ) )
            // InternalEclLexer.g:36:15: ( 'P' | 'p' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'F' | 'f' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'N' | 'n' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PreferredIn"

    // $ANTLR start "SemanticTag"
    public final void mSemanticTag() throws RecognitionException {
        try {
            int _type = SemanticTag;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:38:13: ( ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' ) )
            // InternalEclLexer.g:38:15: ( 'S' | 's' ) ( 'E' | 'e' ) ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'A' | 'a' ) ( 'G' | 'g' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SemanticTag"

    // $ANTLR start "DialectId"
    public final void mDialectId() throws RecognitionException {
        try {
            int _type = DialectId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:40:11: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:40:13: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DialectId"

    // $ANTLR start "Language"
    public final void mLanguage() throws RecognitionException {
        try {
            int _type = Language;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:42:10: ( ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:42:12: ( 'L' | 'l' ) ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'G' | 'g' ) ( 'U' | 'u' ) ( 'A' | 'a' ) ( 'G' | 'g' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Language"

    // $ANTLR start "ModuleId"
    public final void mModuleId() throws RecognitionException {
        try {
            int _type = ModuleId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:44:10: ( ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:44:12: ( 'M' | 'm' ) ( 'O' | 'o' ) ( 'D' | 'd' ) ( 'U' | 'u' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ModuleId"

    // $ANTLR start "Concept"
    public final void mConcept() throws RecognitionException {
        try {
            int _type = Concept;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:46:9: ( ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' ) )
            // InternalEclLexer.g:46:11: ( 'C' | 'c' ) ( 'O' | 'o' ) ( 'N' | 'n' ) ( 'C' | 'c' ) ( 'E' | 'e' ) ( 'P' | 'p' ) ( 'T' | 't' )
            {
            if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Concept"

    // $ANTLR start "Dialect"
    public final void mDialect() throws RecognitionException {
        try {
            int _type = Dialect;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:48:9: ( ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalEclLexer.g:48:11: ( 'D' | 'd' ) ( 'I' | 'i' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'E' | 'e' ) ( 'C' | 'c' ) ( 'T' | 't' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Dialect"

    // $ANTLR start "Active"
    public final void mActive() throws RecognitionException {
        try {
            int _type = Active;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:50:8: ( ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:50:10: ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) ( 'I' | 'i' ) ( 'V' | 'v' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Active"

    // $ANTLR start "TypeId"
    public final void mTypeId() throws RecognitionException {
        try {
            int _type = TypeId;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:52:8: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:52:10: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) ( 'I' | 'i' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TypeId"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:54:7: ( ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' ) )
            // InternalEclLexer.g:54:9: ( 'M' | 'm' ) ( 'I' | 'i' ) ( 'N' | 'n' ) ( 'U' | 'u' ) ( 'S' | 's' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "Exact"
    public final void mExact() throws RecognitionException {
        try {
            int _type = Exact;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:56:7: ( ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' ) )
            // InternalEclLexer.g:56:9: ( 'E' | 'e' ) ( 'X' | 'x' ) ( 'A' | 'a' ) ( 'C' | 'c' ) ( 'T' | 't' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Exact"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:58:7: ( ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:58:9: ( 'F' | 'f' ) ( 'A' | 'a' ) ( 'L' | 'l' ) ( 'S' | 's' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "Match"
    public final void mMatch() throws RecognitionException {
        try {
            int _type = Match;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:60:7: ( ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' ) )
            // InternalEclLexer.g:60:9: ( 'M' | 'm' ) ( 'A' | 'a' ) ( 'T' | 't' ) ( 'C' | 'c' ) ( 'H' | 'h' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Match"

    // $ANTLR start "Regex"
    public final void mRegex() throws RecognitionException {
        try {
            int _type = Regex;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:62:7: ( ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' ) )
            // InternalEclLexer.g:62:9: ( 'R' | 'r' ) ( 'E' | 'e' ) ( 'G' | 'g' ) ( 'E' | 'e' ) ( 'X' | 'x' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Regex"

    // $ANTLR start "Term"
    public final void mTerm() throws RecognitionException {
        try {
            int _type = Term;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:64:6: ( ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' ) )
            // InternalEclLexer.g:64:8: ( 'T' | 't' ) ( 'E' | 'e' ) ( 'R' | 'r' ) ( 'M' | 'm' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Term"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:66:6: ( ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:66:8: ( 'T' | 't' ) ( 'R' | 'r' ) ( 'U' | 'u' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "Type"
    public final void mType() throws RecognitionException {
        try {
            int _type = Type;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:68:6: ( ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' ) )
            // InternalEclLexer.g:68:8: ( 'T' | 't' ) ( 'Y' | 'y' ) ( 'P' | 'p' ) ( 'E' | 'e' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Type"

    // $ANTLR start "Wild"
    public final void mWild() throws RecognitionException {
        try {
            int _type = Wild;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:70:6: ( ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:70:8: ( 'W' | 'w' ) ( 'I' | 'i' ) ( 'L' | 'l' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "Wild"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:72:5: ( ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' ) )
            // InternalEclLexer.g:72:7: ( 'A' | 'a' ) ( 'N' | 'n' ) ( 'D' | 'd' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:74:4: ( ( 'O' | 'o' ) ( 'R' | 'r' ) )
            // InternalEclLexer.g:74:6: ( 'O' | 'o' ) ( 'R' | 'r' )
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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "RULE_TERM_STRING"
    public final void mRULE_TERM_STRING() throws RecognitionException {
        try {
            int _type = RULE_TERM_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:76:18: ( '|' (~ ( '|' ) )* '|' )
            // InternalEclLexer.g:76:20: '|' (~ ( '|' ) )* '|'
            {
            match('|'); 
            // InternalEclLexer.g:76:24: (~ ( '|' ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='{')||(LA1_0>='}' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEclLexer.g:76:24: ~ ( '|' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='{')||(input.LA(1)>='}' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "RULE_TERM_STRING"

    // $ANTLR start "RULE_REVERSED"
    public final void mRULE_REVERSED() throws RecognitionException {
        try {
            int _type = RULE_REVERSED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:78:15: ( 'R' )
            // InternalEclLexer.g:78:17: 'R'
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

    // $ANTLR start "RULE_TO"
    public final void mRULE_TO() throws RecognitionException {
        try {
            int _type = RULE_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:80:9: ( '..' )
            // InternalEclLexer.g:80:11: '..'
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
            // InternalEclLexer.g:82:12: ( ',' )
            // InternalEclLexer.g:82:14: ','
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

    // $ANTLR start "RULE_ZERO"
    public final void mRULE_ZERO() throws RecognitionException {
        try {
            int _type = RULE_ZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:84:11: ( '0' )
            // InternalEclLexer.g:84:13: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ZERO"

    // $ANTLR start "RULE_DIGIT_NONZERO"
    public final void mRULE_DIGIT_NONZERO() throws RecognitionException {
        try {
            int _type = RULE_DIGIT_NONZERO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:86:20: ( '1' .. '9' )
            // InternalEclLexer.g:86:22: '1' .. '9'
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
            // InternalEclLexer.g:88:12: ( ':' )
            // InternalEclLexer.g:88:14: ':'
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
            // InternalEclLexer.g:90:17: ( '{' )
            // InternalEclLexer.g:90:19: '{'
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
            // InternalEclLexer.g:92:18: ( '}' )
            // InternalEclLexer.g:92:20: '}'
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
            // InternalEclLexer.g:94:17: ( '(' )
            // InternalEclLexer.g:94:19: '('
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
            // InternalEclLexer.g:96:18: ( ')' )
            // InternalEclLexer.g:96:20: ')'
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
            // InternalEclLexer.g:98:18: ( '[' )
            // InternalEclLexer.g:98:20: '['
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
            // InternalEclLexer.g:100:19: ( ']' )
            // InternalEclLexer.g:100:21: ']'
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
            // InternalEclLexer.g:102:11: ( '+' )
            // InternalEclLexer.g:102:13: '+'
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
            // InternalEclLexer.g:104:11: ( '-' )
            // InternalEclLexer.g:104:13: '-'
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
            // InternalEclLexer.g:106:12: ( '^' )
            // InternalEclLexer.g:106:14: '^'
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
            // InternalEclLexer.g:108:10: ( '.' )
            // InternalEclLexer.g:108:12: '.'
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
            // InternalEclLexer.g:110:15: ( '*' )
            // InternalEclLexer.g:110:17: '*'
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
            // InternalEclLexer.g:112:12: ( '=' )
            // InternalEclLexer.g:112:14: '='
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
            // InternalEclLexer.g:114:16: ( '!=' )
            // InternalEclLexer.g:114:18: '!='
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
            // InternalEclLexer.g:116:9: ( '<' )
            // InternalEclLexer.g:116:11: '<'
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
            // InternalEclLexer.g:118:9: ( '>' )
            // InternalEclLexer.g:118:11: '>'
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

    // $ANTLR start "RULE_DBL_LT"
    public final void mRULE_DBL_LT() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:120:13: ( '<<' )
            // InternalEclLexer.g:120:15: '<<'
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
            // InternalEclLexer.g:122:13: ( '>>' )
            // InternalEclLexer.g:122:15: '>>'
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
            // InternalEclLexer.g:124:12: ( '<!' )
            // InternalEclLexer.g:124:14: '<!'
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

    // $ANTLR start "RULE_DBL_LT_EM"
    public final void mRULE_DBL_LT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_LT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:126:16: ( '<<!' )
            // InternalEclLexer.g:126:18: '<<!'
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

    // $ANTLR start "RULE_GT_EM"
    public final void mRULE_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:128:12: ( '>!' )
            // InternalEclLexer.g:128:14: '>!'
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

    // $ANTLR start "RULE_DBL_GT_EM"
    public final void mRULE_DBL_GT_EM() throws RecognitionException {
        try {
            int _type = RULE_DBL_GT_EM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:130:16: ( '>>!' )
            // InternalEclLexer.g:130:18: '>>!'
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

    // $ANTLR start "RULE_GTE"
    public final void mRULE_GTE() throws RecognitionException {
        try {
            int _type = RULE_GTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:132:10: ( '>=' )
            // InternalEclLexer.g:132:12: '>='
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
            // InternalEclLexer.g:134:10: ( '<=' )
            // InternalEclLexer.g:134:12: '<='
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

    // $ANTLR start "RULE_HASH"
    public final void mRULE_HASH() throws RecognitionException {
        try {
            int _type = RULE_HASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:136:11: ( '#' )
            // InternalEclLexer.g:136:13: '#'
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

    // $ANTLR start "RULE_DOUBLE_CURLY_OPEN"
    public final void mRULE_DOUBLE_CURLY_OPEN() throws RecognitionException {
        try {
            int _type = RULE_DOUBLE_CURLY_OPEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:138:24: ( '{{' )
            // InternalEclLexer.g:138:26: '{{'
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
            // InternalEclLexer.g:140:25: ( '}}' )
            // InternalEclLexer.g:140:27: '}}'
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

    // $ANTLR start "RULE_ALPHA"
    public final void mRULE_ALPHA() throws RecognitionException {
        try {
            int _type = RULE_ALPHA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:142:12: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // InternalEclLexer.g:142:14: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
    // $ANTLR end "RULE_ALPHA"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:144:9: ( ( ' ' | '\\t' | '\\n' | '\\r' ) )
            // InternalEclLexer.g:144:11: ( ' ' | '\\t' | '\\n' | '\\r' )
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
            // InternalEclLexer.g:146:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalEclLexer.g:146:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalEclLexer.g:146:24: ( options {greedy=false; } : . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        alt2=2;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) ) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEclLexer.g:146:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop2;
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
            // InternalEclLexer.g:148:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalEclLexer.g:148:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalEclLexer.g:148:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEclLexer.g:148:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop3;
                }
            } while (true);

            // InternalEclLexer.g:148:40: ( ( '\\r' )? '\\n' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='\n'||LA5_0=='\r') ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalEclLexer.g:148:41: ( '\\r' )? '\\n'
                    {
                    // InternalEclLexer.g:148:41: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalEclLexer.g:148:41: '\\r'
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

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalEclLexer.g:150:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalEclLexer.g:150:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalEclLexer.g:150:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEclLexer.g:150:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalEclLexer.g:150:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalEclLexer.g:150:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclLexer.g:150:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalEclLexer.g:150:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalEclLexer.g:150:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalEclLexer.g:150:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalEclLexer.g:150:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop7;
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

    public void mTokens() throws RecognitionException {
        // InternalEclLexer.g:1:8: ( CaseSignificanceId | LanguageRefSetId | EffectiveTime | AcceptableIn | Description | PreferredIn | SemanticTag | DialectId | Language | ModuleId | Concept | Dialect | Active | TypeId | MINUS | Exact | False | Match | Regex | Term | True | Type | Wild | AND | OR | RULE_TERM_STRING | RULE_REVERSED | RULE_TO | RULE_COMMA | RULE_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_DBL_LT_EM | RULE_GT_EM | RULE_DBL_GT_EM | RULE_GTE | RULE_LTE | RULE_HASH | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_ALPHA | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING )
        int alt9=63;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // InternalEclLexer.g:1:10: CaseSignificanceId
                {
                mCaseSignificanceId(); 

                }
                break;
            case 2 :
                // InternalEclLexer.g:1:29: LanguageRefSetId
                {
                mLanguageRefSetId(); 

                }
                break;
            case 3 :
                // InternalEclLexer.g:1:46: EffectiveTime
                {
                mEffectiveTime(); 

                }
                break;
            case 4 :
                // InternalEclLexer.g:1:60: AcceptableIn
                {
                mAcceptableIn(); 

                }
                break;
            case 5 :
                // InternalEclLexer.g:1:73: Description
                {
                mDescription(); 

                }
                break;
            case 6 :
                // InternalEclLexer.g:1:85: PreferredIn
                {
                mPreferredIn(); 

                }
                break;
            case 7 :
                // InternalEclLexer.g:1:97: SemanticTag
                {
                mSemanticTag(); 

                }
                break;
            case 8 :
                // InternalEclLexer.g:1:109: DialectId
                {
                mDialectId(); 

                }
                break;
            case 9 :
                // InternalEclLexer.g:1:119: Language
                {
                mLanguage(); 

                }
                break;
            case 10 :
                // InternalEclLexer.g:1:128: ModuleId
                {
                mModuleId(); 

                }
                break;
            case 11 :
                // InternalEclLexer.g:1:137: Concept
                {
                mConcept(); 

                }
                break;
            case 12 :
                // InternalEclLexer.g:1:145: Dialect
                {
                mDialect(); 

                }
                break;
            case 13 :
                // InternalEclLexer.g:1:153: Active
                {
                mActive(); 

                }
                break;
            case 14 :
                // InternalEclLexer.g:1:160: TypeId
                {
                mTypeId(); 

                }
                break;
            case 15 :
                // InternalEclLexer.g:1:167: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // InternalEclLexer.g:1:173: Exact
                {
                mExact(); 

                }
                break;
            case 17 :
                // InternalEclLexer.g:1:179: False
                {
                mFalse(); 

                }
                break;
            case 18 :
                // InternalEclLexer.g:1:185: Match
                {
                mMatch(); 

                }
                break;
            case 19 :
                // InternalEclLexer.g:1:191: Regex
                {
                mRegex(); 

                }
                break;
            case 20 :
                // InternalEclLexer.g:1:197: Term
                {
                mTerm(); 

                }
                break;
            case 21 :
                // InternalEclLexer.g:1:202: True
                {
                mTrue(); 

                }
                break;
            case 22 :
                // InternalEclLexer.g:1:207: Type
                {
                mType(); 

                }
                break;
            case 23 :
                // InternalEclLexer.g:1:212: Wild
                {
                mWild(); 

                }
                break;
            case 24 :
                // InternalEclLexer.g:1:217: AND
                {
                mAND(); 

                }
                break;
            case 25 :
                // InternalEclLexer.g:1:221: OR
                {
                mOR(); 

                }
                break;
            case 26 :
                // InternalEclLexer.g:1:224: RULE_TERM_STRING
                {
                mRULE_TERM_STRING(); 

                }
                break;
            case 27 :
                // InternalEclLexer.g:1:241: RULE_REVERSED
                {
                mRULE_REVERSED(); 

                }
                break;
            case 28 :
                // InternalEclLexer.g:1:255: RULE_TO
                {
                mRULE_TO(); 

                }
                break;
            case 29 :
                // InternalEclLexer.g:1:263: RULE_COMMA
                {
                mRULE_COMMA(); 

                }
                break;
            case 30 :
                // InternalEclLexer.g:1:274: RULE_ZERO
                {
                mRULE_ZERO(); 

                }
                break;
            case 31 :
                // InternalEclLexer.g:1:284: RULE_DIGIT_NONZERO
                {
                mRULE_DIGIT_NONZERO(); 

                }
                break;
            case 32 :
                // InternalEclLexer.g:1:303: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 33 :
                // InternalEclLexer.g:1:314: RULE_CURLY_OPEN
                {
                mRULE_CURLY_OPEN(); 

                }
                break;
            case 34 :
                // InternalEclLexer.g:1:330: RULE_CURLY_CLOSE
                {
                mRULE_CURLY_CLOSE(); 

                }
                break;
            case 35 :
                // InternalEclLexer.g:1:347: RULE_ROUND_OPEN
                {
                mRULE_ROUND_OPEN(); 

                }
                break;
            case 36 :
                // InternalEclLexer.g:1:363: RULE_ROUND_CLOSE
                {
                mRULE_ROUND_CLOSE(); 

                }
                break;
            case 37 :
                // InternalEclLexer.g:1:380: RULE_SQUARE_OPEN
                {
                mRULE_SQUARE_OPEN(); 

                }
                break;
            case 38 :
                // InternalEclLexer.g:1:397: RULE_SQUARE_CLOSE
                {
                mRULE_SQUARE_CLOSE(); 

                }
                break;
            case 39 :
                // InternalEclLexer.g:1:415: RULE_PLUS
                {
                mRULE_PLUS(); 

                }
                break;
            case 40 :
                // InternalEclLexer.g:1:425: RULE_DASH
                {
                mRULE_DASH(); 

                }
                break;
            case 41 :
                // InternalEclLexer.g:1:435: RULE_CARET
                {
                mRULE_CARET(); 

                }
                break;
            case 42 :
                // InternalEclLexer.g:1:446: RULE_DOT
                {
                mRULE_DOT(); 

                }
                break;
            case 43 :
                // InternalEclLexer.g:1:455: RULE_WILDCARD
                {
                mRULE_WILDCARD(); 

                }
                break;
            case 44 :
                // InternalEclLexer.g:1:469: RULE_EQUAL
                {
                mRULE_EQUAL(); 

                }
                break;
            case 45 :
                // InternalEclLexer.g:1:480: RULE_NOT_EQUAL
                {
                mRULE_NOT_EQUAL(); 

                }
                break;
            case 46 :
                // InternalEclLexer.g:1:495: RULE_LT
                {
                mRULE_LT(); 

                }
                break;
            case 47 :
                // InternalEclLexer.g:1:503: RULE_GT
                {
                mRULE_GT(); 

                }
                break;
            case 48 :
                // InternalEclLexer.g:1:511: RULE_DBL_LT
                {
                mRULE_DBL_LT(); 

                }
                break;
            case 49 :
                // InternalEclLexer.g:1:523: RULE_DBL_GT
                {
                mRULE_DBL_GT(); 

                }
                break;
            case 50 :
                // InternalEclLexer.g:1:535: RULE_LT_EM
                {
                mRULE_LT_EM(); 

                }
                break;
            case 51 :
                // InternalEclLexer.g:1:546: RULE_DBL_LT_EM
                {
                mRULE_DBL_LT_EM(); 

                }
                break;
            case 52 :
                // InternalEclLexer.g:1:561: RULE_GT_EM
                {
                mRULE_GT_EM(); 

                }
                break;
            case 53 :
                // InternalEclLexer.g:1:572: RULE_DBL_GT_EM
                {
                mRULE_DBL_GT_EM(); 

                }
                break;
            case 54 :
                // InternalEclLexer.g:1:587: RULE_GTE
                {
                mRULE_GTE(); 

                }
                break;
            case 55 :
                // InternalEclLexer.g:1:596: RULE_LTE
                {
                mRULE_LTE(); 

                }
                break;
            case 56 :
                // InternalEclLexer.g:1:605: RULE_HASH
                {
                mRULE_HASH(); 

                }
                break;
            case 57 :
                // InternalEclLexer.g:1:615: RULE_DOUBLE_CURLY_OPEN
                {
                mRULE_DOUBLE_CURLY_OPEN(); 

                }
                break;
            case 58 :
                // InternalEclLexer.g:1:638: RULE_DOUBLE_CURLY_CLOSE
                {
                mRULE_DOUBLE_CURLY_CLOSE(); 

                }
                break;
            case 59 :
                // InternalEclLexer.g:1:662: RULE_ALPHA
                {
                mRULE_ALPHA(); 

                }
                break;
            case 60 :
                // InternalEclLexer.g:1:673: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 61 :
                // InternalEclLexer.g:1:681: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 62 :
                // InternalEclLexer.g:1:697: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 63 :
                // InternalEclLexer.g:1:713: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\12\44\1\73\2\44\1\uffff\1\44\1\77\4\uffff\1\101\1\103\12\uffff\1\107\1\113\41\uffff\1\124\3\uffff\1\126\20\uffff\1\135\7\uffff\1\144\1\146\4\uffff";
    static final String DFA9_eofS =
        "\147\uffff";
    static final String DFA9_minS =
        "\1\11\2\101\1\106\1\103\1\105\1\122\1\105\1\101\1\105\1\101\1\105\1\111\1\122\1\uffff\1\105\1\56\4\uffff\1\173\1\175\12\uffff\2\41\3\uffff\1\52\3\uffff\1\116\2\uffff\1\103\2\uffff\1\101\5\uffff\1\120\15\uffff\1\41\3\uffff\1\41\5\uffff\1\107\2\uffff\1\114\1\105\4\uffff\1\125\1\105\1\111\1\101\1\103\2\uffff\1\107\1\124\1\105\1\111\1\122\4\uffff";
    static final String DFA9_maxS =
        "\1\175\1\157\1\141\1\170\1\156\1\151\1\162\1\145\1\157\1\171\1\141\1\145\1\151\1\162\1\uffff\1\145\1\56\4\uffff\1\173\1\175\12\uffff\1\75\1\76\3\uffff\1\57\3\uffff\1\156\2\uffff\1\164\2\uffff\1\141\5\uffff\1\160\15\uffff\1\41\3\uffff\1\41\5\uffff\1\147\2\uffff\1\154\1\145\4\uffff\1\165\1\145\1\151\1\141\1\143\2\uffff\1\147\1\164\1\145\1\151\1\162\4\uffff";
    static final String DFA9_acceptS =
        "\16\uffff\1\32\2\uffff\1\35\1\36\1\37\1\40\2\uffff\1\43\1\44\1\45\1\46\1\47\1\50\1\51\1\53\1\54\1\55\2\uffff\1\70\1\73\1\74\1\uffff\1\77\1\1\1\13\1\uffff\1\3\1\20\1\uffff\1\30\1\5\1\uffff\1\6\1\7\1\12\1\17\1\22\1\uffff\1\24\1\25\1\21\1\23\1\33\1\27\1\31\1\34\1\52\1\71\1\41\1\72\1\42\1\uffff\1\62\1\67\1\56\1\uffff\1\64\1\66\1\57\1\75\1\76\1\uffff\1\4\1\15\2\uffff\1\63\1\60\1\65\1\61\5\uffff\1\16\1\26\5\uffff\1\10\1\14\1\2\1\11";
    static final String DFA9_specialS =
        "\147\uffff}>";
    static final String[] DFA9_transitionS = DFA9_transitionS_.DFA9_transitionS;
    private static final class DFA9_transitionS_ {
        static final String[] DFA9_transitionS = {
                "\2\45\2\uffff\1\45\22\uffff\1\45\1\40\1\47\1\43\3\uffff\1\47\1\27\1\30\1\36\1\33\1\21\1\34\1\20\1\46\1\22\11\23\1\24\1\uffff\1\41\1\37\1\42\2\uffff\1\4\1\44\1\1\1\5\1\3\1\12\5\44\1\2\1\10\1\44\1\15\1\6\1\44\1\13\1\7\1\11\2\44\1\14\3\44\1\31\1\uffff\1\32\1\35\2\uffff\1\4\1\44\1\1\1\5\1\3\1\12\5\44\1\2\1\10\1\44\1\15\1\6\1\44\1\17\1\7\1\11\2\44\1\14\3\44\1\25\1\16\1\26",
                "\1\50\15\uffff\1\51\21\uffff\1\50\15\uffff\1\51",
                "\1\52\37\uffff\1\52",
                "\1\53\21\uffff\1\54\15\uffff\1\53\21\uffff\1\54",
                "\1\55\12\uffff\1\56\24\uffff\1\55\12\uffff\1\56",
                "\1\57\3\uffff\1\60\33\uffff\1\57\3\uffff\1\60",
                "\1\61\37\uffff\1\61",
                "\1\62\37\uffff\1\62",
                "\1\65\7\uffff\1\64\5\uffff\1\63\21\uffff\1\65\7\uffff\1\64\5\uffff\1\63",
                "\1\67\14\uffff\1\70\6\uffff\1\66\13\uffff\1\67\14\uffff\1\70\6\uffff\1\66",
                "\1\71\37\uffff\1\71",
                "\1\72\37\uffff\1\72",
                "\1\74\37\uffff\1\74",
                "\1\75\37\uffff\1\75",
                "",
                "\1\72\37\uffff\1\72",
                "\1\76",
                "",
                "",
                "",
                "",
                "\1\100",
                "\1\102",
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
                "\1\105\32\uffff\1\104\1\106",
                "\1\111\33\uffff\1\112\1\110",
                "",
                "",
                "",
                "\1\114\4\uffff\1\115",
                "",
                "",
                "",
                "\1\116\37\uffff\1\116",
                "",
                "",
                "\1\117\20\uffff\1\120\16\uffff\1\117\20\uffff\1\120",
                "",
                "",
                "\1\121\37\uffff\1\121",
                "",
                "",
                "",
                "",
                "",
                "\1\122\37\uffff\1\122",
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
                "\1\123",
                "",
                "",
                "",
                "\1\125",
                "",
                "",
                "",
                "",
                "",
                "\1\127\37\uffff\1\127",
                "",
                "",
                "\1\130\37\uffff\1\130",
                "\1\131\37\uffff\1\131",
                "",
                "",
                "",
                "",
                "\1\132\37\uffff\1\132",
                "\1\133\37\uffff\1\133",
                "\1\134\37\uffff\1\134",
                "\1\136\37\uffff\1\136",
                "\1\137\37\uffff\1\137",
                "",
                "",
                "\1\140\37\uffff\1\140",
                "\1\141\37\uffff\1\141",
                "\1\142\37\uffff\1\142",
                "\1\143\37\uffff\1\143",
                "\1\145\37\uffff\1\145",
                "",
                "",
                "",
                ""
        };
    }

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
            return "1:1: Tokens : ( CaseSignificanceId | LanguageRefSetId | EffectiveTime | AcceptableIn | Description | PreferredIn | SemanticTag | DialectId | Language | ModuleId | Concept | Dialect | Active | TypeId | MINUS | Exact | False | Match | Regex | Term | True | Type | Wild | AND | OR | RULE_TERM_STRING | RULE_REVERSED | RULE_TO | RULE_COMMA | RULE_ZERO | RULE_DIGIT_NONZERO | RULE_COLON | RULE_CURLY_OPEN | RULE_CURLY_CLOSE | RULE_ROUND_OPEN | RULE_ROUND_CLOSE | RULE_SQUARE_OPEN | RULE_SQUARE_CLOSE | RULE_PLUS | RULE_DASH | RULE_CARET | RULE_DOT | RULE_WILDCARD | RULE_EQUAL | RULE_NOT_EQUAL | RULE_LT | RULE_GT | RULE_DBL_LT | RULE_DBL_GT | RULE_LT_EM | RULE_DBL_LT_EM | RULE_GT_EM | RULE_DBL_GT_EM | RULE_GTE | RULE_LTE | RULE_HASH | RULE_DOUBLE_CURLY_OPEN | RULE_DOUBLE_CURLY_CLOSE | RULE_ALPHA | RULE_WS | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_STRING );";
        }
    }
 

}